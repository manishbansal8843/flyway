/*
 * Copyright 2010-2020 Redgate Software Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.api.output;

import org.flywaydb.core.api.output.OperationResult;

import java.util.LinkedList;
import java.util.List;

public class OperationResultBase implements OperationResult {
    public List<String> warnings;
    public String operation;

    public OperationResultBase() {
        this.warnings = new LinkedList<>();
    }

    public void addWarning(String warning) {
        warnings.add(warning);
    }
}