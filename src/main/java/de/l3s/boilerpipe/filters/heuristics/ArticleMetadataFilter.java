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
package de.l3s.boilerpipe.filters.heuristics;

import java.util.regex.Pattern;

import de.l3s.boilerpipe.BoilerpipeFilter;
import de.l3s.boilerpipe.BoilerpipeProcessingException;
import de.l3s.boilerpipe.document.TextBlock;
import de.l3s.boilerpipe.document.TextDocument;
import de.l3s.boilerpipe.labels.DefaultLabels;

public class ArticleMetadataFilter implements BoilerpipeFilter {
	private static final Pattern[] PATTERNS_SHORT = new Pattern[] {
		Pattern
			.compile("^[0-9 \\,\\./]*\\b(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec|January|February|March|April|May|June|July|August|September|October|November|December)?\\b[0-9 \\,\\:apm\\./]*([CPSDMGET]{2,3})?$"),
			Pattern.compile("^[Bb]y ")
			};


	public static final ArticleMetadataFilter INSTANCE = new ArticleMetadataFilter();
	
	private ArticleMetadataFilter() {
	}
	
	public boolean process(TextDocument doc)
			throws BoilerpipeProcessingException {
		boolean changed = false;
		for (TextBlock tb : doc.getTextBlocks()) {
			if (tb.getNumWords() > 10) {
				continue;
			}
			final String text = tb.getText();
			for (Pattern p : PATTERNS_SHORT) {
				if (p.matcher(text).find()) {
					changed = true;
					tb.setIsContent(true);
					tb.addLabel(DefaultLabels.ARTICLE_METADATA);
				}
			}
		}
		return changed;
	}

}
