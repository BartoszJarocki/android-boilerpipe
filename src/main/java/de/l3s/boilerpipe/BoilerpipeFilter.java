/**
 * Copyright (C) 2013 Christian Kohlschütter (ckkohl79@gmail.com)
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
package de.l3s.boilerpipe;

import de.l3s.boilerpipe.document.TextDocument;

/**
 * A generic {@link de.l3s.boilerpipe.BoilerpipeFilter}. Takes a {@link de.l3s.boilerpipe.document.TextDocument} and
 * processes it somehow.
 * 
 * @author Christian Kohlschütter
 */
public interface BoilerpipeFilter {
    /**
     * Processes the given document <code>doc</code>.
     * 
     * @param doc
     *            The {@link de.l3s.boilerpipe.document.TextDocument} that is to be processed.
     * @return <code>true</code> if changes have been made to the
     *         {@link de.l3s.boilerpipe.document.TextDocument}.
     * @throws BoilerpipeProcessingException
     */
    boolean process(final TextDocument doc)
            throws BoilerpipeProcessingException;
}
