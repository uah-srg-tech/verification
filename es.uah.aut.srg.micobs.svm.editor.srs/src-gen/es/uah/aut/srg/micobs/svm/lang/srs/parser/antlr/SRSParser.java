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
package es.uah.aut.srg.micobs.svm.lang.srs.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.srs.parser.antlr.internal.InternalSRSParser;
import es.uah.aut.srg.micobs.svm.lang.srs.services.SRSGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SRSParser extends AbstractAntlrParser {

	@Inject
	private SRSGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSRSParser createParser(XtextTokenStream stream) {
		return new InternalSRSParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "VSRSDocument";
	}

	public SRSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SRSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
