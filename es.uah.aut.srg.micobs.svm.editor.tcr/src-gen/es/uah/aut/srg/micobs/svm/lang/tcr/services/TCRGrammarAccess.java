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
package es.uah.aut.srg.micobs.svm.lang.tcr.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TCRGrammarAccess extends AbstractGrammarElementFinder {
	
	public class VTCRTestCampaignReportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tcr.TCR.VTCRTestCampaignReport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTestCampaignReportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIdKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdSTRINGTerminalRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cIssueKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIssueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIssueUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cIssueAssignment_6.eContents().get(0);
		private final Keyword cRevisionKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRevisionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cRevisionUINT_STRINGTerminalRuleCall_8_0 = (RuleCall)cRevisionAssignment_8.eContents().get(0);
		private final Keyword cDateKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cDateAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cDateSTRINGTerminalRuleCall_10_0 = (RuleCall)cDateAssignment_10.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cTestReportsAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cTestReportsVTCRTestReportParserRuleCall_12_0 = (RuleCall)cTestReportsAssignment_12.eContents().get(0);
		private final Keyword cTestCampaignReportKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//VTCRTestCampaignReport:
		//	'<TestCampaignReport'
		//	'name=' name=STRING
		//	'id=' id=STRING
		//	'issue=' issue=UINT_STRING
		//	'revision=' revision=UINT_STRING
		//	'date=' date=STRING
		//	'>'
		//	testReports+=VTCRTestReport+
		//	'</TestCampaignReport>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestCampaignReport' 'name=' name=STRING 'id=' id=STRING 'issue=' issue=UINT_STRING 'revision=' revision=UINT_STRING
		//'date=' date=STRING '>' testReports+=VTCRTestReport+ '</TestCampaignReport>'
		public Group getGroup() { return cGroup; }
		
		//'<TestCampaignReport'
		public Keyword getTestCampaignReportKeyword_0() { return cTestCampaignReportKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'id='
		public Keyword getIdKeyword_3() { return cIdKeyword_3; }
		
		//id=STRING
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//STRING
		public RuleCall getIdSTRINGTerminalRuleCall_4_0() { return cIdSTRINGTerminalRuleCall_4_0; }
		
		//'issue='
		public Keyword getIssueKeyword_5() { return cIssueKeyword_5; }
		
		//issue=UINT_STRING
		public Assignment getIssueAssignment_6() { return cIssueAssignment_6; }
		
		//UINT_STRING
		public RuleCall getIssueUINT_STRINGTerminalRuleCall_6_0() { return cIssueUINT_STRINGTerminalRuleCall_6_0; }
		
		//'revision='
		public Keyword getRevisionKeyword_7() { return cRevisionKeyword_7; }
		
		//revision=UINT_STRING
		public Assignment getRevisionAssignment_8() { return cRevisionAssignment_8; }
		
		//UINT_STRING
		public RuleCall getRevisionUINT_STRINGTerminalRuleCall_8_0() { return cRevisionUINT_STRINGTerminalRuleCall_8_0; }
		
		//'date='
		public Keyword getDateKeyword_9() { return cDateKeyword_9; }
		
		//date=STRING
		public Assignment getDateAssignment_10() { return cDateAssignment_10; }
		
		//STRING
		public RuleCall getDateSTRINGTerminalRuleCall_10_0() { return cDateSTRINGTerminalRuleCall_10_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_11() { return cGreaterThanSignKeyword_11; }
		
		//testReports+=VTCRTestReport+
		public Assignment getTestReportsAssignment_12() { return cTestReportsAssignment_12; }
		
		//VTCRTestReport
		public RuleCall getTestReportsVTCRTestReportParserRuleCall_12_0() { return cTestReportsVTCRTestReportParserRuleCall_12_0; }
		
		//'</TestCampaignReport>'
		public Keyword getTestCampaignReportKeyword_13() { return cTestCampaignReportKeyword_13; }
	}
	public class VTCRTestReportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tcr.TCR.VTCRTestReport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVTCRTestReportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTest_procedureKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTest_procedureAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTest_procedureSTRINGTerminalRuleCall_2_0 = (RuleCall)cTest_procedureAssignment_2.eContents().get(0);
		private final Keyword cStatusKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStatusAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStatusVTCRTestStatusEnumRuleCall_4_0 = (RuleCall)cStatusAssignment_4.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cEvidenceAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cEvidenceDParagraphEvidenceParserRuleCall_6_0 = (RuleCall)cEvidenceAssignment_6.eContents().get(0);
		private final Keyword cVTCRTestReportKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VTCRTestReport:
		//	'<VTCRTestReport'
		//	'test_procedure=' test_procedure=STRING
		//	'status=' status=VTCRTestStatus
		//	'>'
		//	evidence=DParagraphEvidence
		//	'</VTCRTestReport>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<VTCRTestReport' 'test_procedure=' test_procedure=STRING 'status=' status=VTCRTestStatus '>'
		//evidence=DParagraphEvidence '</VTCRTestReport>'
		public Group getGroup() { return cGroup; }
		
		//'<VTCRTestReport'
		public Keyword getVTCRTestReportKeyword_0() { return cVTCRTestReportKeyword_0; }
		
		//'test_procedure='
		public Keyword getTest_procedureKeyword_1() { return cTest_procedureKeyword_1; }
		
		//test_procedure=STRING
		public Assignment getTest_procedureAssignment_2() { return cTest_procedureAssignment_2; }
		
		//STRING
		public RuleCall getTest_procedureSTRINGTerminalRuleCall_2_0() { return cTest_procedureSTRINGTerminalRuleCall_2_0; }
		
		//'status='
		public Keyword getStatusKeyword_3() { return cStatusKeyword_3; }
		
		//status=VTCRTestStatus
		public Assignment getStatusAssignment_4() { return cStatusAssignment_4; }
		
		//VTCRTestStatus
		public RuleCall getStatusVTCRTestStatusEnumRuleCall_4_0() { return cStatusVTCRTestStatusEnumRuleCall_4_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//evidence=DParagraphEvidence
		public Assignment getEvidenceAssignment_6() { return cEvidenceAssignment_6; }
		
		//DParagraphEvidence
		public RuleCall getEvidenceDParagraphEvidenceParserRuleCall_6_0() { return cEvidenceDParagraphEvidenceParserRuleCall_6_0; }
		
		//'</VTCRTestReport>'
		public Keyword getVTCRTestReportKeyword_7() { return cVTCRTestReportKeyword_7; }
	}
	public class DParagraphEvidenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DParagraphEvidence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEvidenceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParagraphContentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParagraphContentDParagraphContentParserRuleCall_1_0 = (RuleCall)cParagraphContentAssignment_1.eContents().get(0);
		private final Keyword cEvidenceKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DParagraphEvidence doctpl::DParagraph:
		//	'<evidence>'
		//	paragraphContent+=DParagraphContent+
		//	'</evidence>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<evidence>' paragraphContent+=DParagraphContent+ '</evidence>'
		public Group getGroup() { return cGroup; }
		
		//'<evidence>'
		public Keyword getEvidenceKeyword_0() { return cEvidenceKeyword_0; }
		
		//paragraphContent+=DParagraphContent+
		public Assignment getParagraphContentAssignment_1() { return cParagraphContentAssignment_1; }
		
		//DParagraphContent
		public RuleCall getParagraphContentDParagraphContentParserRuleCall_1_0() { return cParagraphContentDParagraphContentParserRuleCall_1_0; }
		
		//'</evidence>'
		public Keyword getEvidenceKeyword_2() { return cEvidenceKeyword_2; }
	}
	public class DParagraphContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DParagraphContent");
		private final RuleCall cDRunParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//DParagraphContent doctpl::DParagraphContent:
		//	DRun
		@Override public ParserRule getRule() { return rule; }
		
		//DRun
		public RuleCall getDRunParserRuleCall() { return cDRunParserRuleCall; }
	}
	public class DRunElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DRun");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRunKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cBoldKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cBoldAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cBoldDRunAttributesEnumRuleCall_1_1_0 = (RuleCall)cBoldAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cItalicsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cItalicsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cItalicsDRunAttributesEnumRuleCall_2_1_0 = (RuleCall)cItalicsAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cUnderlineKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cUnderlineAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cUnderlineDRunAttributesEnumRuleCall_3_1_0 = (RuleCall)cUnderlineAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cColorKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cColorAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cColorSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cColorAssignment_4_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cTextAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTextDTextParserRuleCall_6_0 = (RuleCall)cTextAssignment_6.eContents().get(0);
		private final Keyword cRunKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DRun doctpl::DRun:
		//	'<run' ('bold=' bold=DRunAttributes)? ('italics=' italics=DRunAttributes)? ('underline=' underline=DRunAttributes)?
		//	('color=' color=STRING)?
		//	'>'
		//	text=DText
		//	'</run>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<run' ('bold=' bold=DRunAttributes)? ('italics=' italics=DRunAttributes)? ('underline=' underline=DRunAttributes)?
		//('color=' color=STRING)? '>' text=DText '</run>'
		public Group getGroup() { return cGroup; }
		
		//'<run'
		public Keyword getRunKeyword_0() { return cRunKeyword_0; }
		
		//('bold=' bold=DRunAttributes)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'bold='
		public Keyword getBoldKeyword_1_0() { return cBoldKeyword_1_0; }
		
		//bold=DRunAttributes
		public Assignment getBoldAssignment_1_1() { return cBoldAssignment_1_1; }
		
		//DRunAttributes
		public RuleCall getBoldDRunAttributesEnumRuleCall_1_1_0() { return cBoldDRunAttributesEnumRuleCall_1_1_0; }
		
		//('italics=' italics=DRunAttributes)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'italics='
		public Keyword getItalicsKeyword_2_0() { return cItalicsKeyword_2_0; }
		
		//italics=DRunAttributes
		public Assignment getItalicsAssignment_2_1() { return cItalicsAssignment_2_1; }
		
		//DRunAttributes
		public RuleCall getItalicsDRunAttributesEnumRuleCall_2_1_0() { return cItalicsDRunAttributesEnumRuleCall_2_1_0; }
		
		//('underline=' underline=DRunAttributes)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'underline='
		public Keyword getUnderlineKeyword_3_0() { return cUnderlineKeyword_3_0; }
		
		//underline=DRunAttributes
		public Assignment getUnderlineAssignment_3_1() { return cUnderlineAssignment_3_1; }
		
		//DRunAttributes
		public RuleCall getUnderlineDRunAttributesEnumRuleCall_3_1_0() { return cUnderlineDRunAttributesEnumRuleCall_3_1_0; }
		
		//('color=' color=STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'color='
		public Keyword getColorKeyword_4_0() { return cColorKeyword_4_0; }
		
		//color=STRING
		public Assignment getColorAssignment_4_1() { return cColorAssignment_4_1; }
		
		//STRING
		public RuleCall getColorSTRINGTerminalRuleCall_4_1_0() { return cColorSTRINGTerminalRuleCall_4_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//text=DText
		public Assignment getTextAssignment_6() { return cTextAssignment_6; }
		
		//DText
		public RuleCall getTextDTextParserRuleCall_6_0() { return cTextDTextParserRuleCall_6_0; }
		
		//'</run>'
		public Keyword getRunKeyword_7() { return cRunKeyword_7; }
	}
	public class DTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DText");
		private final Assignment cContentAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContentRUNTEXTTerminalRuleCall_0 = (RuleCall)cContentAssignment.eContents().get(0);
		
		//DText doctpl::DText:
		//	content=RUNTEXT
		@Override public ParserRule getRule() { return rule; }
		
		//content=RUNTEXT
		public Assignment getContentAssignment() { return cContentAssignment; }
		
		//RUNTEXT
		public RuleCall getContentRUNTEXTTerminalRuleCall_0() { return cContentRUNTEXTTerminalRuleCall_0; }
	}
	
	public class VTCRTestStatusElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tcr.TCR.VTCRTestStatus");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFailEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFailFailKeyword_0_0 = (Keyword)cFailEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPassEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPassPassKeyword_1_0 = (Keyword)cPassEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cNotTestedEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cNotTestedNotTestedKeyword_2_0 = (Keyword)cNotTestedEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum VTCRTestStatus:
		//	Fail='"Fail"' | Pass='"Pass"' | NotTested='"NotTested"';
		public EnumRule getRule() { return rule; }
		
		//Fail='"Fail"' | Pass='"Pass"' | NotTested='"NotTested"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Fail='"Fail"'
		public EnumLiteralDeclaration getFailEnumLiteralDeclaration_0() { return cFailEnumLiteralDeclaration_0; }
		
		//'"Fail"'
		public Keyword getFailFailKeyword_0_0() { return cFailFailKeyword_0_0; }
		
		//Pass='"Pass"'
		public EnumLiteralDeclaration getPassEnumLiteralDeclaration_1() { return cPassEnumLiteralDeclaration_1; }
		
		//'"Pass"'
		public Keyword getPassPassKeyword_1_0() { return cPassPassKeyword_1_0; }
		
		//NotTested='"NotTested"'
		public EnumLiteralDeclaration getNotTestedEnumLiteralDeclaration_2() { return cNotTestedEnumLiteralDeclaration_2; }
		
		//'"NotTested"'
		public Keyword getNotTestedNotTestedKeyword_2_0() { return cNotTestedNotTestedKeyword_2_0; }
	}
	public class DRunAttributesElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DRunAttributes");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTRUEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTRUETrueKeyword_0_0 = (Keyword)cTRUEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFALSEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFALSEFalseKeyword_1_0 = (Keyword)cFALSEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum DRunAttributes returns doctpl::DRunAttributes:
		//	TRUE='"true"' | FALSE='"false"';
		public EnumRule getRule() { return rule; }
		
		//TRUE='"true"' | FALSE='"false"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TRUE='"true"'
		public EnumLiteralDeclaration getTRUEEnumLiteralDeclaration_0() { return cTRUEEnumLiteralDeclaration_0; }
		
		//'"true"'
		public Keyword getTRUETrueKeyword_0_0() { return cTRUETrueKeyword_0_0; }
		
		//FALSE='"false"'
		public EnumLiteralDeclaration getFALSEEnumLiteralDeclaration_1() { return cFALSEEnumLiteralDeclaration_1; }
		
		//'"false"'
		public Keyword getFALSEFalseKeyword_1_0() { return cFALSEFalseKeyword_1_0; }
	}
	
	private final VTCRTestCampaignReportElements pVTCRTestCampaignReport;
	private final VTCRTestReportElements pVTCRTestReport;
	private final VTCRTestStatusElements eVTCRTestStatus;
	private final DParagraphEvidenceElements pDParagraphEvidence;
	private final DParagraphContentElements pDParagraphContent;
	private final DRunAttributesElements eDRunAttributes;
	private final DRunElements pDRun;
	private final DTextElements pDText;
	private final TerminalRule tRUNTEXT;
	private final TerminalRule tUINT_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TCRGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVTCRTestCampaignReport = new VTCRTestCampaignReportElements();
		this.pVTCRTestReport = new VTCRTestReportElements();
		this.eVTCRTestStatus = new VTCRTestStatusElements();
		this.pDParagraphEvidence = new DParagraphEvidenceElements();
		this.pDParagraphContent = new DParagraphContentElements();
		this.eDRunAttributes = new DRunAttributesElements();
		this.pDRun = new DRunElements();
		this.pDText = new DTextElements();
		this.tRUNTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tcr.TCR.RUNTEXT");
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tcr.TCR.UINT_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.svm.lang.tcr.TCR".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//VTCRTestCampaignReport:
	//	'<TestCampaignReport'
	//	'name=' name=STRING
	//	'id=' id=STRING
	//	'issue=' issue=UINT_STRING
	//	'revision=' revision=UINT_STRING
	//	'date=' date=STRING
	//	'>'
	//	testReports+=VTCRTestReport+
	//	'</TestCampaignReport>';
	public VTCRTestCampaignReportElements getVTCRTestCampaignReportAccess() {
		return pVTCRTestCampaignReport;
	}
	
	public ParserRule getVTCRTestCampaignReportRule() {
		return getVTCRTestCampaignReportAccess().getRule();
	}
	
	//VTCRTestReport:
	//	'<VTCRTestReport'
	//	'test_procedure=' test_procedure=STRING
	//	'status=' status=VTCRTestStatus
	//	'>'
	//	evidence=DParagraphEvidence
	//	'</VTCRTestReport>';
	public VTCRTestReportElements getVTCRTestReportAccess() {
		return pVTCRTestReport;
	}
	
	public ParserRule getVTCRTestReportRule() {
		return getVTCRTestReportAccess().getRule();
	}
	
	//enum VTCRTestStatus:
	//	Fail='"Fail"' | Pass='"Pass"' | NotTested='"NotTested"';
	public VTCRTestStatusElements getVTCRTestStatusAccess() {
		return eVTCRTestStatus;
	}
	
	public EnumRule getVTCRTestStatusRule() {
		return getVTCRTestStatusAccess().getRule();
	}
	
	//DParagraphEvidence doctpl::DParagraph:
	//	'<evidence>'
	//	paragraphContent+=DParagraphContent+
	//	'</evidence>'
	public DParagraphEvidenceElements getDParagraphEvidenceAccess() {
		return pDParagraphEvidence;
	}
	
	public ParserRule getDParagraphEvidenceRule() {
		return getDParagraphEvidenceAccess().getRule();
	}
	
	//DParagraphContent doctpl::DParagraphContent:
	//	DRun
	public DParagraphContentElements getDParagraphContentAccess() {
		return pDParagraphContent;
	}
	
	public ParserRule getDParagraphContentRule() {
		return getDParagraphContentAccess().getRule();
	}
	
	//enum DRunAttributes returns doctpl::DRunAttributes:
	//	TRUE='"true"' | FALSE='"false"';
	public DRunAttributesElements getDRunAttributesAccess() {
		return eDRunAttributes;
	}
	
	public EnumRule getDRunAttributesRule() {
		return getDRunAttributesAccess().getRule();
	}
	
	//DRun doctpl::DRun:
	//	'<run' ('bold=' bold=DRunAttributes)? ('italics=' italics=DRunAttributes)? ('underline=' underline=DRunAttributes)?
	//	('color=' color=STRING)?
	//	'>'
	//	text=DText
	//	'</run>'
	public DRunElements getDRunAccess() {
		return pDRun;
	}
	
	public ParserRule getDRunRule() {
		return getDRunAccess().getRule();
	}
	
	//DText doctpl::DText:
	//	content=RUNTEXT
	public DTextElements getDTextAccess() {
		return pDText;
	}
	
	public ParserRule getDTextRule() {
		return getDTextAccess().getRule();
	}
	
	//terminal RUNTEXT:
	//	'<text>'->'</text>';
	public TerminalRule getRUNTEXTRule() {
		return tRUNTEXT;
	}
	
	//terminal UINT_STRING:
	//	'"' '0'..'9'+ '"';
	public TerminalRule getUINT_STRINGRule() {
		return tUINT_STRING;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
