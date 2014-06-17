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

import java.io.Reader;

import org.xml.sax.InputSource;

import de.l3s.boilerpipe.document.TextDocument;

/**
 * Describes a complete filter pipeline.
 * 
 * @author Christian Kohlschütter
 */
public interface BoilerpipeExtractor extends BoilerpipeFilter {
    /**
     * Extracts text from the HTML code given as a String.
     * 
     * @param html
     *            The HTML code as a String.
     * @return The extracted text.
     * @throws BoilerpipeProcessingException
     */
    public String getText(final String html)
            throws BoilerpipeProcessingException;

    /**
     * Extracts text from the HTML code available from the given
     * {@link org.xml.sax.InputSource}.
     * 
     * @param is
     *            The InputSource containing the HTML
     * @return The extracted text.
     * @throws BoilerpipeProcessingException
     */
    public String getText(final InputSource is)
            throws BoilerpipeProcessingException;

    /**
     * Extracts text from the HTML code available from the given {@link java.io.Reader}.
     * 
     * @param r
     *            The Reader containing the HTML
     * @return The extracted text.
     * @throws BoilerpipeProcessingException
     */
    public String getText(final Reader r) throws BoilerpipeProcessingException;

    /**
     * Extracts text from the given {@link de.l3s.boilerpipe.document.TextDocument} object.
     * 
     * @param doc
     *            The {@link de.l3s.boilerpipe.document.TextDocument}.
     * @return The extracted text.
     * @throws BoilerpipeProcessingException
     */
    public String getText(TextDocument doc)
            throws BoilerpipeProcessingException;
}
