/*******************************************************************************
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.svm.lang.svr.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.svr.parser.antlr.internal.InternalSVRParser;
import es.uah.aut.srg.micobs.svm.lang.svr.services.SVRGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SVRParser extends AbstractAntlrParser {

	@Inject
	private SVRGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSVRParser createParser(XtextTokenStream stream) {
		return new InternalSVRParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "VSVRDocument";
	}

	public SVRGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SVRGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
