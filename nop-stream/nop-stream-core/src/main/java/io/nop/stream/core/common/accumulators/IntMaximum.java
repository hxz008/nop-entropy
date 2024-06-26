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

package io.nop.stream.core.common.accumulators;

/**
 * An accumulator that finds the maximum {@code integer} value.
 */
public class IntMaximum implements SimpleAccumulator<Integer> {

    private static final long serialVersionUID = 1L;

    private int max = Integer.MIN_VALUE;

    public IntMaximum() {
    }

    public IntMaximum(int value) {
        this.max = value;
    }

    // ------------------------------------------------------------------------
    //  Accumulator
    // ------------------------------------------------------------------------

    /**
     * Consider using {@link #add(int)} instead for primitive integer values
     */
    @Override
    public void add(Integer value) {
        this.max = Math.max(this.max, value);
    }

    @Override
    public Integer getLocalValue() {
        return this.max;
    }

    @Override
    public void merge(Accumulator<Integer, Integer> other) {
        this.max = Math.max(this.max, other.getLocalValue());
    }

    @Override
    public void resetLocal() {
        this.max = Integer.MIN_VALUE;
    }

    @Override
    public IntMaximum clone() {
        IntMaximum clone = new IntMaximum();
        clone.max = this.max;
        return clone;
    }

    // ------------------------------------------------------------------------
    //  Primitive Specializations
    // ------------------------------------------------------------------------

    public void add(int value) {
        this.max = Math.max(this.max, value);
    }

    public int getLocalValuePrimitive() {
        return this.max;
    }

    // ------------------------------------------------------------------------
    //  Utilities
    // ------------------------------------------------------------------------

    @Override
    public String toString() {
        return "IntMaximum " + this.max;
    }
}
