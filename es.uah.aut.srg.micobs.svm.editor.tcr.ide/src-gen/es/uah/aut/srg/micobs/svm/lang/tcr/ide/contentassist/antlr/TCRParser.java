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
package es.uah.aut.srg.micobs.svm.lang.tcr.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.tcr.ide.contentassist.antlr.internal.InternalTCRParser;
import es.uah.aut.srg.micobs.svm.lang.tcr.services.TCRGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TCRParser extends AbstractContentAssistParser {

	@Inject
	private TCRGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTCRParser createParser() {
		InternalTCRParser result = new InternalTCRParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVTCRTestStatusAccess().getAlternatives(), "rule__VTCRTestStatus__Alternatives");
					put(grammarAccess.getDRunAttributesAccess().getAlternatives(), "rule__DRunAttributes__Alternatives");
					put(grammarAccess.getVTCRTestCampaignReportAccess().getGroup(), "rule__VTCRTestCampaignReport__Group__0");
					put(grammarAccess.getVTCRTestReportAccess().getGroup(), "rule__VTCRTestReport__Group__0");
					put(grammarAccess.getDParagraphEvidenceAccess().getGroup(), "rule__DParagraphEvidence__Group__0");
					put(grammarAccess.getDRunAccess().getGroup(), "rule__DRun__Group__0");
					put(grammarAccess.getDRunAccess().getGroup_1(), "rule__DRun__Group_1__0");
					put(grammarAccess.getDRunAccess().getGroup_2(), "rule__DRun__Group_2__0");
					put(grammarAccess.getDRunAccess().getGroup_3(), "rule__DRun__Group_3__0");
					put(grammarAccess.getDRunAccess().getGroup_4(), "rule__DRun__Group_4__0");
					put(grammarAccess.getVTCRTestCampaignReportAccess().getNameAssignment_2(), "rule__VTCRTestCampaignReport__NameAssignment_2");
					put(grammarAccess.getVTCRTestCampaignReportAccess().getIdAssignment_4(), "rule__VTCRTestCampaignReport__IdAssignment_4");
					put(grammarAccess.getVTCRTestCampaignReportAccess().getIssueAssignment_6(), "rule__VTCRTestCampaignReport__IssueAssignment_6");
					put(grammarAccess.getVTCRTestCampaignReportAccess().getRevisionAssignment_8(), "rule__VTCRTestCampaignReport__RevisionAssignment_8");
					put(grammarAccess.getVTCRTestCampaignReportAccess().getDateAssignment_10(), "rule__VTCRTestCampaignReport__DateAssignment_10");
					put(grammarAccess.getVTCRTestCampaignReportAccess().getTestReportsAssignment_12(), "rule__VTCRTestCampaignReport__TestReportsAssignment_12");
					put(grammarAccess.getVTCRTestReportAccess().getTest_procedureAssignment_2(), "rule__VTCRTestReport__Test_procedureAssignment_2");
					put(grammarAccess.getVTCRTestReportAccess().getStatusAssignment_4(), "rule__VTCRTestReport__StatusAssignment_4");
					put(grammarAccess.getVTCRTestReportAccess().getEvidenceAssignment_6(), "rule__VTCRTestReport__EvidenceAssignment_6");
					put(grammarAccess.getDParagraphEvidenceAccess().getParagraphContentAssignment_1(), "rule__DParagraphEvidence__ParagraphContentAssignment_1");
					put(grammarAccess.getDRunAccess().getBoldAssignment_1_1(), "rule__DRun__BoldAssignment_1_1");
					put(grammarAccess.getDRunAccess().getItalicsAssignment_2_1(), "rule__DRun__ItalicsAssignment_2_1");
					put(grammarAccess.getDRunAccess().getUnderlineAssignment_3_1(), "rule__DRun__UnderlineAssignment_3_1");
					put(grammarAccess.getDRunAccess().getColorAssignment_4_1(), "rule__DRun__ColorAssignment_4_1");
					put(grammarAccess.getDRunAccess().getTextAssignment_6(), "rule__DRun__TextAssignment_6");
					put(grammarAccess.getDTextAccess().getContentAssignment(), "rule__DText__ContentAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTCRParser typedParser = (InternalTCRParser) parser;
			typedParser.entryRuleVTCRTestCampaignReport();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TCRGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TCRGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
