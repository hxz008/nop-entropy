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

package io.nop.stream.cep.nfa.aftermatch;

import io.nop.stream.cep.nfa.sharedbuffer.EventId;

abstract class SkipRelativeToWholeMatchStrategy extends AfterMatchSkipStrategy {
    private static final long serialVersionUID = -3214720554878479037L;

    @Override
    public final boolean isSkipStrategy() {
        return true;
    }

    @Override
    protected final boolean shouldPrune(EventId startEventID, EventId pruningId) {
        return startEventID != null && startEventID.compareTo(pruningId) <= 0;
    }
}
