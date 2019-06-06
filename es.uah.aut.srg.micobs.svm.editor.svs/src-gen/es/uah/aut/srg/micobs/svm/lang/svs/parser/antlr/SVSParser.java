/*******************************************************************************
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.svm.lang.svs.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.svs.parser.antlr.internal.InternalSVSParser;
import es.uah.aut.srg.micobs.svm.lang.svs.services.SVSGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SVSParser extends AbstractAntlrParser {

	@Inject
	private SVSGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSVSParser createParser(XtextTokenStream stream) {
		return new InternalSVSParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "VSVSDocument";
	}

	public SVSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SVSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
