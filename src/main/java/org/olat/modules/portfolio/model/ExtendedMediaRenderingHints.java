/**
 * <a href="http://www.openolat.org">
 * OpenOLAT - Online Learning and Training</a><br>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); <br>
 * you may not use this file except in compliance with the License.<br>
 * You may obtain a copy of the License at the
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">Apache homepage</a>
 * <p>
 * Unless required by applicable law or agreed to in writing,<br>
 * software distributed under the License is distributed on an "AS IS" BASIS, <br>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. <br>
 * See the License for the specific language governing permissions and <br>
 * limitations under the License.
 * <p>
 * Initial code contributed and copyrighted by<br>
 * frentix GmbH, http://www.frentix.com
 * <p>
 */
package org.olat.modules.portfolio.model;

import org.olat.modules.portfolio.MediaRenderingHints;
import org.olat.modules.portfolio.ui.editor.PageElementRenderingHints;

/**
 * 
 * Initial date: 24 août 2017<br>
 * @author srosse, stephane.rosse@frentix.com, http://www.frentix.com
 *
 */
public class ExtendedMediaRenderingHints implements MediaRenderingHints, PageElementRenderingHints {

	private final boolean toPdf;
	
	private ExtendedMediaRenderingHints(boolean toPdf) {
		this.toPdf = toPdf;
	}

	@Override
	public boolean isToPdf() {
		return toPdf;
	}

	@Override
	public boolean isOnePage() {
		return true;
	}

	@Override
	public boolean isExtendedMetadata() {
		return true;
	}
	
	public static PageElementRenderingHints toPdf() {
		return new ExtendedMediaRenderingHints(true);
	}
	
	public static PageElementRenderingHints toPrint() {
		return new ExtendedMediaRenderingHints(false);
	}
	
}
