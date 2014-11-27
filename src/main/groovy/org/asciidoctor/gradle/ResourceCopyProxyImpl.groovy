/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.asciidoctor.gradle

import org.gradle.api.Project
import org.gradle.api.file.CopySpec
import org.gradle.api.tasks.WorkResult

/**
 * @author Schalk W. Cronjé.
 */
class ResourceCopyProxyImpl implements ResourceCopyProxy {
    Project project

    ResourceCopyProxyImpl(Project p) { project = p }

    @Override
    WorkResult copy(File outputDir, CopySpec spec) {
        project.copy {
            into outputDir
            with spec
        }
    }
}
