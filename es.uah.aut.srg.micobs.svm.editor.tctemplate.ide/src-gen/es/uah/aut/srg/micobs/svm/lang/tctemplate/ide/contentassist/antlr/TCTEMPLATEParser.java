/*******************************************************************************
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.svm.lang.tctemplate.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.tctemplate.ide.contentassist.antlr.internal.InternalTCTEMPLATEParser;
import es.uah.aut.srg.micobs.svm.lang.tctemplate.services.TCTEMPLATEGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TCTEMPLATEParser extends AbstractContentAssistParser {

	@Inject
	private TCTEMPLATEGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTCTEMPLATEParser createParser() {
		InternalTCTEMPLATEParser result = new InternalTCTEMPLATEParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVTCTemplateAccess().getAlternatives_5(), "rule__VTCTemplate__Alternatives_5");
					put(grammarAccess.getTMTCIFFieldValueAccess().getAlternatives(), "rule__TMTCIFFieldValue__Alternatives");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0(), "rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0");
					put(grammarAccess.getVTCTemplateAccess().getGroup(), "rule__VTCTemplate__Group__0");
					put(grammarAccess.getVTCTemplateAccess().getGroup_5_0(), "rule__VTCTemplate__Group_5_0__0");
					put(grammarAccess.getVTCTemplateAccess().getGroup_5_0_1(), "rule__VTCTemplate__Group_5_0_1__0");
					put(grammarAccess.getVTCTemplateFieldAccess().getGroup(), "rule__VTCTemplateField__Group__0");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup(), "rule__TMTCIFFieldValueRaw__Group__0");
					put(grammarAccess.getTMTCIFFieldValueFileAccess().getGroup(), "rule__TMTCIFFieldValueFile__Group__0");
					put(grammarAccess.getTMTCIFFieldValueEnumAccess().getGroup(), "rule__TMTCIFFieldValueEnum__Group__0");
					put(grammarAccess.getVTCTemplateAccess().getNameAssignment_2(), "rule__VTCTemplate__NameAssignment_2");
					put(grammarAccess.getVTCTemplateAccess().getTcInputAssignment_4(), "rule__VTCTemplate__TcInputAssignment_4");
					put(grammarAccess.getVTCTemplateAccess().getFieldsAssignment_5_0_1_1(), "rule__VTCTemplate__FieldsAssignment_5_0_1_1");
					put(grammarAccess.getVTCTemplateFieldAccess().getFieldRefAssignment_2(), "rule__VTCTemplateField__FieldRefAssignment_2");
					put(grammarAccess.getVTCTemplateFieldAccess().getValueAssignment_4(), "rule__VTCTemplateField__ValueAssignment_4");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2(), "rule__TMTCIFFieldValueRaw__ValueAssignment_2");
					put(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameAssignment_2(), "rule__TMTCIFFieldValueFile__FilenameAssignment_2");
					put(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefAssignment_2(), "rule__TMTCIFFieldValueEnum__EnumRefAssignment_2");
					put(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefAssignment_4(), "rule__TMTCIFFieldValueEnum__ValueRefAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTCTEMPLATEParser typedParser = (InternalTCTEMPLATEParser) parser;
			typedParser.entryRuleVTCTemplate();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TCTEMPLATEGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TCTEMPLATEGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
