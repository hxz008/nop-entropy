/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.nop.stream.cep;

import io.nop.stream.cep.functions.PatternProcessFunction;
import io.nop.stream.cep.functions.TimedOutPartialMatchHandler;
import io.nop.stream.cep.nfa.NFA;
import io.nop.stream.cep.pattern.Pattern;
import io.nop.stream.core.datastream.DataStream;
import io.nop.stream.core.datastream.SingleOutputStreamOperator;
import io.nop.stream.core.common.typeinfo.TypeInformation;
import io.nop.stream.core.util.OutputTag;

import static com.google.common.base.Preconditions.checkNotNull;
import static io.nop.stream.cep.PatternProcessFunctionBuilder.fromFlatSelect;
import static io.nop.stream.cep.PatternProcessFunctionBuilder.fromSelect;

/**
 * Stream abstraction for CEP pattern detection. A pattern stream is a stream which emits detected
 * pattern sequences as a map of events associated with their names. The pattern is detected using a
 * {@link NFA}. In order to process the detected sequences, the user has to
 * specify a {@link PatternSelectFunction} or a {@link PatternFlatSelectFunction}.
 *
 * <p>Additionally it allows to handle partially matched event patterns which have timed out. For
 * this the user has to specify a {@link PatternTimeoutFunction} or a {@link
 * PatternFlatTimeoutFunction}.
 *
 * @param <T> Type of the events
 */
public class PatternStream<T> {

    private final PatternStreamBuilder<T> builder;

    private PatternStream(final PatternStreamBuilder<T> builder) {
        this.builder = checkNotNull(builder);
    }

    PatternStream(final DataStream<T> inputStream, final Pattern<T, ?> pattern) {
        this(PatternStreamBuilder.forStreamAndPattern(inputStream, pattern));
    }

    PatternStream<T> withComparator(final EventComparator<T> comparator) {
        return new PatternStream<>(builder.withComparator(comparator));
    }

    /**
     * Send late arriving data to the side output identified by the given {@link OutputTag}. A
     * record is considered late after the watermark has passed its timestamp.
     *
     * <p>You can get the stream of late data using {@link
     * SingleOutputStreamOperator#getSideOutput(OutputTag)} on the {@link
     * SingleOutputStreamOperator} resulting from the pattern processing operations.
     */
    public PatternStream<T> sideOutputLateData(OutputTag<T> lateDataOutputTag) {
        return new PatternStream<>(builder.withLateDataOutputTag(lateDataOutputTag));
    }

    /**
     * Sets the time characteristic to processing time.
     */
    public PatternStream<T> inProcessingTime() {
        return new PatternStream<>(builder.inProcessingTime());
    }

    /**
     * Sets the time characteristic to event time.
     */
    public PatternStream<T> inEventTime() {
        return new PatternStream<>(builder.inEventTime());
    }


    /**
     * Applies a process function to the detected pattern sequence. For each pattern sequence the
     * provided {@link PatternProcessFunction} is called. In order to process timed out partial
     * matches as well one can use {@link TimedOutPartialMatchHandler} as additional interface.
     *
     * @param patternProcessFunction The pattern process function which is called for each detected
     *                               pattern sequence.
     * @param <R>                    Type of the resulting elements
     * @param outTypeInfo            Explicit specification of output type.
     * @return {@link DataStream} which contains the resulting elements from the pattern process
     * function.
     */
    public <R> SingleOutputStreamOperator<R> process(
            final PatternProcessFunction<T, R> patternProcessFunction,
            final TypeInformation<R> outTypeInfo) {

        return builder.build(outTypeInfo, builder.clean(patternProcessFunction));
    }

    /**
     * Applies a select function to the detected pattern sequence. For each pattern sequence the
     * provided {@link PatternSelectFunction} is called. The pattern select function can produce
     * exactly one resulting element.
     *
     * @param patternSelectFunction The pattern select function which is called for each detected
     *                              pattern sequence.
     * @param <R>                   Type of the resulting elements
     * @param outTypeInfo           Explicit specification of output type.
     * @return {@link DataStream} which contains the resulting elements from the pattern select
     * function.
     */
    public <R> SingleOutputStreamOperator<R> select(
            final PatternSelectFunction<T, R> patternSelectFunction,
            final TypeInformation<R> outTypeInfo) {

        final PatternProcessFunction<T, R> processFunction =
                fromSelect(builder.clean(patternSelectFunction)).build();

        return process(processFunction, outTypeInfo);
    }

    /**
     * Applies a select function to the detected pattern sequence. For each pattern sequence the
     * provided {@link PatternSelectFunction} is called. The pattern select function can produce
     * exactly one resulting element.
     *
     * <p>Applies a timeout function to a partial pattern sequence which has timed out. For each
     * partial pattern sequence the provided {@link PatternTimeoutFunction} is called. The pattern
     * timeout function can produce exactly one resulting element.
     *
     * <p>You can get the stream of timed-out data resulting from the {@link
     * SingleOutputStreamOperator#getSideOutput(OutputTag)} on the {@link
     * SingleOutputStreamOperator} resulting from the select operation with the same {@link
     * OutputTag}.
     *
     * @param timedOutPartialMatchesTag {@link OutputTag} that identifies side output with timed out
     *                                  patterns
     * @param patternTimeoutFunction    The pattern timeout function which is called for each partial
     *                                  pattern sequence which has timed out.
     * @param outTypeInfo               Explicit specification of output type.
     * @param patternSelectFunction     The pattern select function which is called for each detected
     *                                  pattern sequence.
     * @param <L>                       Type of the resulting timeout elements
     * @param <R>                       Type of the resulting elements
     * @return {@link DataStream} which contains the resulting elements with the resulting timeout
     * elements in a side output.
     */
    public <L, R> SingleOutputStreamOperator<R> select(
            final OutputTag<L> timedOutPartialMatchesTag,
            final PatternTimeoutFunction<T, L> patternTimeoutFunction,
            final TypeInformation<R> outTypeInfo,
            final PatternSelectFunction<T, R> patternSelectFunction) {

        final PatternProcessFunction<T, R> processFunction =
                fromSelect(builder.clean(patternSelectFunction))
                        .withTimeoutHandler(
                                timedOutPartialMatchesTag, builder.clean(patternTimeoutFunction))
                        .build();

        return process(processFunction, outTypeInfo);
    }

    /**
     * Applies a flat select function to the detected pattern sequence. For each pattern sequence
     * the provided {@link PatternFlatSelectFunction} is called. The pattern flat select function
     * can produce an arbitrary number of resulting elements.
     *
     * @param patternFlatSelectFunction The pattern flat select function which is called for each
     *                                  detected pattern sequence.
     * @param <R>                       Type of the resulting elements
     * @param outTypeInfo               Explicit specification of output type.
     * @return {@link DataStream} which contains the resulting elements from the pattern flat select
     * function.
     */
    public <R> SingleOutputStreamOperator<R> flatSelect(
            final PatternFlatSelectFunction<T, R> patternFlatSelectFunction,
            final TypeInformation<R> outTypeInfo) {

        final PatternProcessFunction<T, R> processFunction =
                fromFlatSelect(builder.clean(patternFlatSelectFunction)).build();

        return process(processFunction, outTypeInfo);
    }

    /**
     * Applies a flat select function to the detected pattern sequence. For each pattern sequence
     * the provided {@link PatternFlatSelectFunction} is called. The pattern select function can
     * produce exactly one resulting element.
     *
     * <p>Applies a timeout function to a partial pattern sequence which has timed out. For each
     * partial pattern sequence the provided {@link PatternFlatTimeoutFunction} is called. The
     * pattern timeout function can produce exactly one resulting element.
     *
     * <p>You can get the stream of timed-out data resulting from the {@link
     * SingleOutputStreamOperator#getSideOutput(OutputTag)} on the {@link
     * SingleOutputStreamOperator} resulting from the select operation with the same {@link
     * OutputTag}.
     *
     * @param timedOutPartialMatchesTag  {@link OutputTag} that identifies side output with timed out
     *                                   patterns
     * @param patternFlatTimeoutFunction The pattern timeout function which is called for each
     *                                   partial pattern sequence which has timed out.
     * @param patternFlatSelectFunction  The pattern select function which is called for each
     *                                   detected pattern sequence.
     * @param outTypeInfo                Explicit specification of output type.
     * @param <L>                        Type of the resulting timeout elements
     * @param <R>                        Type of the resulting elements
     * @return {@link DataStream} which contains the resulting elements with the resulting timeout
     * elements in a side output.
     */
    public <L, R> SingleOutputStreamOperator<R> flatSelect(
            final OutputTag<L> timedOutPartialMatchesTag,
            final PatternFlatTimeoutFunction<T, L> patternFlatTimeoutFunction,
            final TypeInformation<R> outTypeInfo,
            final PatternFlatSelectFunction<T, R> patternFlatSelectFunction) {

        final PatternProcessFunction<T, R> processFunction =
                fromFlatSelect(builder.clean(patternFlatSelectFunction))
                        .withTimeoutHandler(
                                timedOutPartialMatchesTag,
                                builder.clean(patternFlatTimeoutFunction))
                        .build();

        return process(processFunction, outTypeInfo);
    }

}
