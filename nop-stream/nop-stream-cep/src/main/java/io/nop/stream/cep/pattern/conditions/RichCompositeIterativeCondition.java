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

package io.nop.stream.cep.pattern.conditions;

import com.google.common.base.Preconditions;
import io.nop.stream.core.common.functions.RuntimeContext;
import io.nop.stream.core.configuration.Configuration;
import io.nop.stream.core.util.FunctionUtils;

/**
 * A base class of composite {@link IterativeCondition} conditions such as {@link RichAndCondition},
 * {@link RichOrCondition} and {@link RichNotCondition}, etc. It handles the open, close and
 * setRuntimeContext for the nested {@link IterativeCondition} conditions.
 *
 * @param <T> Type of the element to filter
 */
public abstract class RichCompositeIterativeCondition<T> extends RichIterativeCondition<T> {

    private static final long serialVersionUID = 1L;

    private final IterativeCondition<T>[] nestedConditions;

    @SafeVarargs
    public RichCompositeIterativeCondition(final IterativeCondition<T>... nestedConditions) {
        for (IterativeCondition<T> condition : nestedConditions) {
            Preconditions.checkNotNull(condition, "The condition cannot be null.");
        }
        this.nestedConditions = nestedConditions;
    }

    public IterativeCondition<T>[] getNestedConditions() {
        return nestedConditions;
    }

    @Override
    public void setRuntimeContext(RuntimeContext t) {
        super.setRuntimeContext(t);

        for (IterativeCondition<T> nestedCondition : nestedConditions) {
            FunctionUtils.setFunctionRuntimeContext(nestedCondition, t);
        }
    }

    @Override
    public void open(Configuration parameters) {
        super.open(parameters);
        for (IterativeCondition<T> nestedCondition : nestedConditions) {
            FunctionUtils.openFunction(nestedCondition, parameters);
        }
    }

    @Override
    public void close() {
        super.close();
        for (IterativeCondition<T> nestedCondition : nestedConditions) {
            FunctionUtils.closeFunction(nestedCondition);
        }
    }
}
