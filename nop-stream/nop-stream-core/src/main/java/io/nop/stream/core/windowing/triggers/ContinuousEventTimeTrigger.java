/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.nop.stream.core.windowing.triggers;

import io.nop.stream.core.common.accumulators.LongMinimum;
import io.nop.stream.core.common.accumulators.SimpleAccumulator;
import io.nop.stream.core.common.state.ReducingStateDescriptor;
import io.nop.stream.core.windowing.windows.Window;

import java.time.Duration;

/**
 * A {@link Trigger} that continuously fires based on a given time interval. This fires based on
 * {@link org.apache.flink.streaming.api.watermark.Watermark Watermarks}.
 *
 * @param <W> The type of {@link Window Windows} on which this trigger can operate.
 * @see org.apache.flink.streaming.api.watermark.Watermark
 */
public class ContinuousEventTimeTrigger<W extends Window> extends Trigger<Object, W> {
    private static final long serialVersionUID = 1L;

    private final long interval;

    /**
     * When merging we take the lowest of all fire timestamps as the new fire timestamp.
     */
    private final ReducingStateDescriptor<Long> stateDesc =
            new ReducingStateDescriptor<>("fire-time", Long.class, LongMinimum.class);

    private ContinuousEventTimeTrigger(long interval) {
        this.interval = interval;
    }

    @Override
    public TriggerResult onElement(Object element, long timestamp, W window, TriggerContext ctx)
            throws Exception {

        if (window.maxTimestamp() <= ctx.getCurrentWatermark()) {
            // if the watermark is already past the window fire immediately
            return TriggerResult.FIRE;
        } else {
            ctx.registerEventTimeTimer(window.maxTimestamp());
        }

        SimpleAccumulator<Long> fireTimestampState = ctx.getSimpleAccumulator(stateDesc);
        if (fireTimestampState.getLocalValue() == null) {
            registerNextFireTimestamp(
                    timestamp - (timestamp % interval), window, ctx, fireTimestampState);
        }

        return TriggerResult.CONTINUE;
    }

    @Override
    public TriggerResult onEventTime(long time, W window, TriggerContext ctx) {

        if (time == window.maxTimestamp()) {
            return TriggerResult.FIRE;
        }

        SimpleAccumulator<Long> fireTimestampState = ctx.getSimpleAccumulator(stateDesc);

        Long fireTimestamp = fireTimestampState.getLocalValue();

        if (fireTimestamp != null && fireTimestamp == time) {
            fireTimestampState.resetLocal();
            registerNextFireTimestamp(time, window, ctx, fireTimestampState);
            return TriggerResult.FIRE;
        }

        return TriggerResult.CONTINUE;
    }

    @Override
    public TriggerResult onProcessingTime(long time, W window, TriggerContext ctx) {
        return TriggerResult.CONTINUE;
    }

    @Override
    public void clear(W window, TriggerContext ctx) {
        SimpleAccumulator<Long> fireTimestamp = ctx.getSimpleAccumulator(stateDesc);
        Long timestamp = fireTimestamp.get();
        if (timestamp != null) {
            ctx.deleteEventTimeTimer(timestamp);
            fireTimestamp.clear();
        }
    }

    @Override
    public boolean canMerge() {
        return true;
    }

    @Override
    public void onMerge(W window, OnMergeContext ctx)  {
        //ctx.mergePartitionedState(stateDesc);
        Long nextFireTimestamp = ctx.getSimpleAccumulator(stateDesc).get();
        if (nextFireTimestamp != null) {
            ctx.registerEventTimeTimer(nextFireTimestamp);
        }
    }

    @Override
    public String toString() {
        return "ContinuousEventTimeTrigger(" + interval + ")";
    }

    public long getInterval() {
        return interval;
    }

    /**
     * Creates a trigger that continuously fires based on the given interval.
     *
     * @param interval The time interval at which to fire.
     * @param <W>      The type of {@link Window Windows} on which this trigger can operate.
     */
    public static <W extends Window> ContinuousEventTimeTrigger<W> of(Duration interval) {
        return new ContinuousEventTimeTrigger<>(interval.toMillis());
    }

    private void registerNextFireTimestamp(
            long time, W window, TriggerContext ctx, SimpleAccumulator<Long> fireTimestampState) {
        long nextFireTimestamp = Math.min(time + interval, window.maxTimestamp());
        fireTimestampState.add(nextFireTimestamp);
        ctx.registerEventTimeTimer(nextFireTimestamp);
    }
}
