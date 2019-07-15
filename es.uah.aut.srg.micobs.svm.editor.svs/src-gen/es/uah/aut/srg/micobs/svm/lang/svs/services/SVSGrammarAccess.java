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
package es.uah.aut.srg.micobs.svm.lang.svs.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
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
public class SVSGrammarAccess extends AbstractGrammarElementFinder {
	
	public class VSVSDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSVSKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cParentKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cNameKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cParentsAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final CrossReference cParentsVTraceableDocumentCrossReference_12_2_0 = (CrossReference)cParentsAssignment_12_2.eContents().get(0);
		private final RuleCall cParentsVTraceableDocumentSTRINGTerminalRuleCall_12_2_0_1 = (RuleCall)cParentsVTraceableDocumentCrossReference_12_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Assignment cIntroductionSectionAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cIntroductionSectionVSVSIntroductionParserRuleCall_13_0 = (RuleCall)cIntroductionSectionAssignment_13.eContents().get(0);
		private final Assignment cApplicableDocumentsSectionAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cApplicableDocumentsSectionVSVSApplicableDocumentsParserRuleCall_14_0 = (RuleCall)cApplicableDocumentsSectionAssignment_14.eContents().get(0);
		private final Assignment cReferenceDocumentsSectionAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cReferenceDocumentsSectionVSVSReferenceDocumentsParserRuleCall_15_0 = (RuleCall)cReferenceDocumentsSectionAssignment_15.eContents().get(0);
		private final Assignment cTermsDefinitionsAbbreviationsSectionAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cTermsDefinitionsAbbreviationsSectionVSVSTermsDefinitionsAbbreviationsParserRuleCall_16_0 = (RuleCall)cTermsDefinitionsAbbreviationsSectionAssignment_16.eContents().get(0);
		private final Assignment cSoftwareOverviewSectionAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cSoftwareOverviewSectionVSVSSoftwareOverviewParserRuleCall_17_0 = (RuleCall)cSoftwareOverviewSectionAssignment_17.eContents().get(0);
		private final Assignment cTaskIdentificationSectionAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cTaskIdentificationSectionVSVSTaskIdentificationParserRuleCall_18_0 = (RuleCall)cTaskIdentificationSectionAssignment_18.eContents().get(0);
		private final Assignment cTestingSpecificationDesignSectionAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cTestingSpecificationDesignSectionVSVSTestingSpecificationDesignParserRuleCall_19_0 = (RuleCall)cTestingSpecificationDesignSectionAssignment_19.eContents().get(0);
		private final Assignment cTestCasesSectionAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cTestCasesSectionVSVSTestCasesParserRuleCall_20_0 = (RuleCall)cTestCasesSectionAssignment_20.eContents().get(0);
		private final Assignment cTestProceduresSectionAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cTestProceduresSectionVSVSTestProceduresParserRuleCall_21_0 = (RuleCall)cTestProceduresSectionAssignment_21.eContents().get(0);
		private final Assignment cAnalysisInspectionReviewSectionAssignment_22 = (Assignment)cGroup.eContents().get(22);
		private final RuleCall cAnalysisInspectionReviewSectionVSVSAnalysisInspectionReviewParserRuleCall_22_0 = (RuleCall)cAnalysisInspectionReviewSectionAssignment_22.eContents().get(0);
		private final Assignment cTestPlatformRequirementsSectionAssignment_23 = (Assignment)cGroup.eContents().get(23);
		private final RuleCall cTestPlatformRequirementsSectionVSVSTestPlatformRequirementsParserRuleCall_23_0 = (RuleCall)cTestPlatformRequirementsSectionAssignment_23.eContents().get(0);
		private final Assignment cAdditionalInformationSectionAssignment_24 = (Assignment)cGroup.eContents().get(24);
		private final RuleCall cAdditionalInformationSectionVSVSAdditionalInformationParserRuleCall_24_0 = (RuleCall)cAdditionalInformationSectionAssignment_24.eContents().get(0);
		private final Keyword cSVSKeyword_25 = (Keyword)cGroup.eContents().get(25);
		
		//VSVSDocument:
		//	'<SVS'
		//	'name=' name=STRING
		//	'id=' id=STRING
		//	'issue=' issue=UINT_STRING
		//	'revision=' revision=UINT_STRING
		//	'date=' date=STRING
		//	'>' ('<parent' 'name=' parents+=[tdm::VTraceableDocument|STRING] '/>')*
		//	introductionSection=VSVSIntroduction
		//	applicableDocumentsSection=VSVSApplicableDocuments
		//	referenceDocumentsSection=VSVSReferenceDocuments
		//	termsDefinitionsAbbreviationsSection=VSVSTermsDefinitionsAbbreviations
		//	softwareOverviewSection=VSVSSoftwareOverview
		//	taskIdentificationSection=VSVSTaskIdentification
		//	testingSpecificationDesignSection=VSVSTestingSpecificationDesign
		//	testCasesSection=VSVSTestCases
		//	testProceduresSection=VSVSTestProcedures
		//	analysisInspectionReviewSection=VSVSAnalysisInspectionReview
		//	testPlatformRequirementsSection=VSVSTestPlatformRequirements
		//	additionalInformationSection=VSVSAdditionalInformation
		//	'</SVS>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<SVS' 'name=' name=STRING 'id=' id=STRING 'issue=' issue=UINT_STRING 'revision=' revision=UINT_STRING 'date='
		//date=STRING '>' ('<parent' 'name=' parents+=[tdm::VTraceableDocument|STRING] '/>')*
		//introductionSection=VSVSIntroduction applicableDocumentsSection=VSVSApplicableDocuments
		//referenceDocumentsSection=VSVSReferenceDocuments
		//termsDefinitionsAbbreviationsSection=VSVSTermsDefinitionsAbbreviations softwareOverviewSection=VSVSSoftwareOverview
		//taskIdentificationSection=VSVSTaskIdentification testingSpecificationDesignSection=VSVSTestingSpecificationDesign
		//testCasesSection=VSVSTestCases testProceduresSection=VSVSTestProcedures
		//analysisInspectionReviewSection=VSVSAnalysisInspectionReview
		//testPlatformRequirementsSection=VSVSTestPlatformRequirements additionalInformationSection=VSVSAdditionalInformation
		//'</SVS>'
		public Group getGroup() { return cGroup; }
		
		//'<SVS'
		public Keyword getSVSKeyword_0() { return cSVSKeyword_0; }
		
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
		
		//('<parent' 'name=' parents+=[tdm::VTraceableDocument|STRING] '/>')*
		public Group getGroup_12() { return cGroup_12; }
		
		//'<parent'
		public Keyword getParentKeyword_12_0() { return cParentKeyword_12_0; }
		
		//'name='
		public Keyword getNameKeyword_12_1() { return cNameKeyword_12_1; }
		
		//parents+=[tdm::VTraceableDocument|STRING]
		public Assignment getParentsAssignment_12_2() { return cParentsAssignment_12_2; }
		
		//[tdm::VTraceableDocument|STRING]
		public CrossReference getParentsVTraceableDocumentCrossReference_12_2_0() { return cParentsVTraceableDocumentCrossReference_12_2_0; }
		
		//STRING
		public RuleCall getParentsVTraceableDocumentSTRINGTerminalRuleCall_12_2_0_1() { return cParentsVTraceableDocumentSTRINGTerminalRuleCall_12_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_12_3() { return cSolidusGreaterThanSignKeyword_12_3; }
		
		//introductionSection=VSVSIntroduction
		public Assignment getIntroductionSectionAssignment_13() { return cIntroductionSectionAssignment_13; }
		
		//VSVSIntroduction
		public RuleCall getIntroductionSectionVSVSIntroductionParserRuleCall_13_0() { return cIntroductionSectionVSVSIntroductionParserRuleCall_13_0; }
		
		//applicableDocumentsSection=VSVSApplicableDocuments
		public Assignment getApplicableDocumentsSectionAssignment_14() { return cApplicableDocumentsSectionAssignment_14; }
		
		//VSVSApplicableDocuments
		public RuleCall getApplicableDocumentsSectionVSVSApplicableDocumentsParserRuleCall_14_0() { return cApplicableDocumentsSectionVSVSApplicableDocumentsParserRuleCall_14_0; }
		
		//referenceDocumentsSection=VSVSReferenceDocuments
		public Assignment getReferenceDocumentsSectionAssignment_15() { return cReferenceDocumentsSectionAssignment_15; }
		
		//VSVSReferenceDocuments
		public RuleCall getReferenceDocumentsSectionVSVSReferenceDocumentsParserRuleCall_15_0() { return cReferenceDocumentsSectionVSVSReferenceDocumentsParserRuleCall_15_0; }
		
		//termsDefinitionsAbbreviationsSection=VSVSTermsDefinitionsAbbreviations
		public Assignment getTermsDefinitionsAbbreviationsSectionAssignment_16() { return cTermsDefinitionsAbbreviationsSectionAssignment_16; }
		
		//VSVSTermsDefinitionsAbbreviations
		public RuleCall getTermsDefinitionsAbbreviationsSectionVSVSTermsDefinitionsAbbreviationsParserRuleCall_16_0() { return cTermsDefinitionsAbbreviationsSectionVSVSTermsDefinitionsAbbreviationsParserRuleCall_16_0; }
		
		//softwareOverviewSection=VSVSSoftwareOverview
		public Assignment getSoftwareOverviewSectionAssignment_17() { return cSoftwareOverviewSectionAssignment_17; }
		
		//VSVSSoftwareOverview
		public RuleCall getSoftwareOverviewSectionVSVSSoftwareOverviewParserRuleCall_17_0() { return cSoftwareOverviewSectionVSVSSoftwareOverviewParserRuleCall_17_0; }
		
		//taskIdentificationSection=VSVSTaskIdentification
		public Assignment getTaskIdentificationSectionAssignment_18() { return cTaskIdentificationSectionAssignment_18; }
		
		//VSVSTaskIdentification
		public RuleCall getTaskIdentificationSectionVSVSTaskIdentificationParserRuleCall_18_0() { return cTaskIdentificationSectionVSVSTaskIdentificationParserRuleCall_18_0; }
		
		//testingSpecificationDesignSection=VSVSTestingSpecificationDesign
		public Assignment getTestingSpecificationDesignSectionAssignment_19() { return cTestingSpecificationDesignSectionAssignment_19; }
		
		//VSVSTestingSpecificationDesign
		public RuleCall getTestingSpecificationDesignSectionVSVSTestingSpecificationDesignParserRuleCall_19_0() { return cTestingSpecificationDesignSectionVSVSTestingSpecificationDesignParserRuleCall_19_0; }
		
		//testCasesSection=VSVSTestCases
		public Assignment getTestCasesSectionAssignment_20() { return cTestCasesSectionAssignment_20; }
		
		//VSVSTestCases
		public RuleCall getTestCasesSectionVSVSTestCasesParserRuleCall_20_0() { return cTestCasesSectionVSVSTestCasesParserRuleCall_20_0; }
		
		//testProceduresSection=VSVSTestProcedures
		public Assignment getTestProceduresSectionAssignment_21() { return cTestProceduresSectionAssignment_21; }
		
		//VSVSTestProcedures
		public RuleCall getTestProceduresSectionVSVSTestProceduresParserRuleCall_21_0() { return cTestProceduresSectionVSVSTestProceduresParserRuleCall_21_0; }
		
		//analysisInspectionReviewSection=VSVSAnalysisInspectionReview
		public Assignment getAnalysisInspectionReviewSectionAssignment_22() { return cAnalysisInspectionReviewSectionAssignment_22; }
		
		//VSVSAnalysisInspectionReview
		public RuleCall getAnalysisInspectionReviewSectionVSVSAnalysisInspectionReviewParserRuleCall_22_0() { return cAnalysisInspectionReviewSectionVSVSAnalysisInspectionReviewParserRuleCall_22_0; }
		
		//testPlatformRequirementsSection=VSVSTestPlatformRequirements
		public Assignment getTestPlatformRequirementsSectionAssignment_23() { return cTestPlatformRequirementsSectionAssignment_23; }
		
		//VSVSTestPlatformRequirements
		public RuleCall getTestPlatformRequirementsSectionVSVSTestPlatformRequirementsParserRuleCall_23_0() { return cTestPlatformRequirementsSectionVSVSTestPlatformRequirementsParserRuleCall_23_0; }
		
		//additionalInformationSection=VSVSAdditionalInformation
		public Assignment getAdditionalInformationSectionAssignment_24() { return cAdditionalInformationSectionAssignment_24; }
		
		//VSVSAdditionalInformation
		public RuleCall getAdditionalInformationSectionVSVSAdditionalInformationParserRuleCall_24_0() { return cAdditionalInformationSectionVSVSAdditionalInformationParserRuleCall_24_0; }
		
		//'</SVS>'
		public Keyword getSVSKeyword_25() { return cSVSKeyword_25; }
	}
	public class DBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBody");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBodyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cBodyContentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyContentDBodyContentParserRuleCall_1_0 = (RuleCall)cBodyContentAssignment_1.eContents().get(0);
		private final Keyword cBodyKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DBody doc::DBody:
		//	'<body>'
		//	bodyContent+=DBodyContent+
		//	'</body>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<body>' bodyContent+=DBodyContent+ '</body>'
		public Group getGroup() { return cGroup; }
		
		//'<body>'
		public Keyword getBodyKeyword_0() { return cBodyKeyword_0; }
		
		//bodyContent+=DBodyContent+
		public Assignment getBodyContentAssignment_1() { return cBodyContentAssignment_1; }
		
		//DBodyContent
		public RuleCall getBodyContentDBodyContentParserRuleCall_1_0() { return cBodyContentDBodyContentParserRuleCall_1_0; }
		
		//'</body>'
		public Keyword getBodyKeyword_2() { return cBodyKeyword_2; }
	}
	public class DBodyContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBodyContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDParagraphParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDItemizeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDEnumerateParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDFigureFromFileParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cDTableFromFileParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cDBasicTableParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//DBodyContent doc::DBodyContent:
		//	DParagraph | DItemize | DEnumerate | DFigureFromFile | DTableFromFile | DBasicTable
		@Override public ParserRule getRule() { return rule; }
		
		//DParagraph | DItemize | DEnumerate | DFigureFromFile | DTableFromFile | DBasicTable
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DParagraph
		public RuleCall getDParagraphParserRuleCall_0() { return cDParagraphParserRuleCall_0; }
		
		//DItemize
		public RuleCall getDItemizeParserRuleCall_1() { return cDItemizeParserRuleCall_1; }
		
		//DEnumerate
		public RuleCall getDEnumerateParserRuleCall_2() { return cDEnumerateParserRuleCall_2; }
		
		//DFigureFromFile
		public RuleCall getDFigureFromFileParserRuleCall_3() { return cDFigureFromFileParserRuleCall_3; }
		
		//DTableFromFile
		public RuleCall getDTableFromFileParserRuleCall_4() { return cDTableFromFileParserRuleCall_4; }
		
		//DBasicTable
		public RuleCall getDBasicTableParserRuleCall_5() { return cDBasicTableParserRuleCall_5; }
	}
	public class DParagraphElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DParagraph");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParagraphKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParagraphContentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParagraphContentDParagraphContentParserRuleCall_1_0 = (RuleCall)cParagraphContentAssignment_1.eContents().get(0);
		private final Keyword cParagraphKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DParagraph doc::DParagraph:
		//	'<paragraph>'
		//	paragraphContent+=DParagraphContent+
		//	'</paragraph>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<paragraph>' paragraphContent+=DParagraphContent+ '</paragraph>'
		public Group getGroup() { return cGroup; }
		
		//'<paragraph>'
		public Keyword getParagraphKeyword_0() { return cParagraphKeyword_0; }
		
		//paragraphContent+=DParagraphContent+
		public Assignment getParagraphContentAssignment_1() { return cParagraphContentAssignment_1; }
		
		//DParagraphContent
		public RuleCall getParagraphContentDParagraphContentParserRuleCall_1_0() { return cParagraphContentDParagraphContentParserRuleCall_1_0; }
		
		//'</paragraph>'
		public Keyword getParagraphKeyword_2() { return cParagraphKeyword_2; }
	}
	public class DListItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DListItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cListItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParagraphAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParagraphDParagraphParserRuleCall_1_0 = (RuleCall)cParagraphAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cSublistKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSublistAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cSublistDListContentParserRuleCall_2_1_0 = (RuleCall)cSublistAssignment_2_1.eContents().get(0);
		private final Keyword cSublistKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cListItemKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//DListItem doc::DListItem:
		//	'<listItem>'
		//	paragraph+=DParagraph+ ('<sublist>' sublist=DListContent '</sublist>')?
		//	'</listItem>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<listItem>' paragraph+=DParagraph+ ('<sublist>' sublist=DListContent '</sublist>')? '</listItem>'
		public Group getGroup() { return cGroup; }
		
		//'<listItem>'
		public Keyword getListItemKeyword_0() { return cListItemKeyword_0; }
		
		//paragraph+=DParagraph+
		public Assignment getParagraphAssignment_1() { return cParagraphAssignment_1; }
		
		//DParagraph
		public RuleCall getParagraphDParagraphParserRuleCall_1_0() { return cParagraphDParagraphParserRuleCall_1_0; }
		
		//('<sublist>' sublist=DListContent '</sublist>')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'<sublist>'
		public Keyword getSublistKeyword_2_0() { return cSublistKeyword_2_0; }
		
		//sublist=DListContent
		public Assignment getSublistAssignment_2_1() { return cSublistAssignment_2_1; }
		
		//DListContent
		public RuleCall getSublistDListContentParserRuleCall_2_1_0() { return cSublistDListContentParserRuleCall_2_1_0; }
		
		//'</sublist>'
		public Keyword getSublistKeyword_2_2() { return cSublistKeyword_2_2; }
		
		//'</listItem>'
		public Keyword getListItemKeyword_3() { return cListItemKeyword_3; }
	}
	public class DListContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DListContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDItemizeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDEnumerateParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DListContent doc::DListContent:
		//	DItemize | DEnumerate
		@Override public ParserRule getRule() { return rule; }
		
		//DItemize | DEnumerate
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DItemize
		public RuleCall getDItemizeParserRuleCall_0() { return cDItemizeParserRuleCall_0; }
		
		//DEnumerate
		public RuleCall getDEnumerateParserRuleCall_1() { return cDEnumerateParserRuleCall_1; }
	}
	public class DItemizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DItemize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cItemizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cItemsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cItemsDListItemParserRuleCall_1_0 = (RuleCall)cItemsAssignment_1.eContents().get(0);
		private final Keyword cItemizeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DItemize doc::DItemize:
		//	'<itemize>'
		//	items+=DListItem+
		//	'</itemize>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<itemize>' items+=DListItem+ '</itemize>'
		public Group getGroup() { return cGroup; }
		
		//'<itemize>'
		public Keyword getItemizeKeyword_0() { return cItemizeKeyword_0; }
		
		//items+=DListItem+
		public Assignment getItemsAssignment_1() { return cItemsAssignment_1; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_1_0() { return cItemsDListItemParserRuleCall_1_0; }
		
		//'</itemize>'
		public Keyword getItemizeKeyword_2() { return cItemizeKeyword_2; }
	}
	public class DEnumerateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DEnumerate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumerateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cItemsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cItemsDListItemParserRuleCall_1_0 = (RuleCall)cItemsAssignment_1.eContents().get(0);
		private final Keyword cEnumerateKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DEnumerate doc::DEnumerate:
		//	'<enumerate>'
		//	items+=DListItem+
		//	'</enumerate>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<enumerate>' items+=DListItem+ '</enumerate>'
		public Group getGroup() { return cGroup; }
		
		//'<enumerate>'
		public Keyword getEnumerateKeyword_0() { return cEnumerateKeyword_0; }
		
		//items+=DListItem+
		public Assignment getItemsAssignment_1() { return cItemsAssignment_1; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_1_0() { return cItemsDListItemParserRuleCall_1_0; }
		
		//'</enumerate>'
		public Keyword getEnumerateKeyword_2() { return cEnumerateKeyword_2; }
	}
	public class DParagraphContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DParagraphContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDRunParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDHyperlinkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DParagraphContent doc::DParagraphContent:
		//	DRun | DHyperlink
		@Override public ParserRule getRule() { return rule; }
		
		//DRun | DHyperlink
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DRun
		public RuleCall getDRunParserRuleCall_0() { return cDRunParserRuleCall_0; }
		
		//DHyperlink
		public RuleCall getDHyperlinkParserRuleCall_1() { return cDHyperlinkParserRuleCall_1; }
	}
	public class DRunElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRun");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRunKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cBoldTrueKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cItalicsTrueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cUnderlineTrueKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTextAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTextDTextParserRuleCall_5_0 = (RuleCall)cTextAssignment_5.eContents().get(0);
		private final Keyword cRunKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DRun doc::DRun:
		//	'<run'
		//	'bold="true"'?
		//	'italics="true"'?
		//	'underline="true"'?
		//	'>'
		//	text=DText
		//	'</run>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<run' 'bold="true"'? 'italics="true"'? 'underline="true"'? '>' text=DText '</run>'
		public Group getGroup() { return cGroup; }
		
		//'<run'
		public Keyword getRunKeyword_0() { return cRunKeyword_0; }
		
		//'bold="true"'?
		public Keyword getBoldTrueKeyword_1() { return cBoldTrueKeyword_1; }
		
		//'italics="true"'?
		public Keyword getItalicsTrueKeyword_2() { return cItalicsTrueKeyword_2; }
		
		//'underline="true"'?
		public Keyword getUnderlineTrueKeyword_3() { return cUnderlineTrueKeyword_3; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_4() { return cGreaterThanSignKeyword_4; }
		
		//text=DText
		public Assignment getTextAssignment_5() { return cTextAssignment_5; }
		
		//DText
		public RuleCall getTextDTextParserRuleCall_5_0() { return cTextDTextParserRuleCall_5_0; }
		
		//'</run>'
		public Keyword getRunKeyword_6() { return cRunKeyword_6; }
	}
	public class DHyperlinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DHyperlink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyperlinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cReferenceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cReferenceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cReferenceDReferenceableObjectCrossReference_2_0 = (CrossReference)cReferenceAssignment_2.eContents().get(0);
		private final RuleCall cReferenceDReferenceableObjectSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cReferenceDReferenceableObjectCrossReference_2_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRunAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRunDRunParserRuleCall_4_0 = (RuleCall)cRunAssignment_4.eContents().get(0);
		private final Keyword cHyperlinkKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DHyperlink doc::DHyperlink:
		//	'<hyperlink'
		//	'reference=' reference=[doc::DReferenceableObject|STRING]
		//	'>'
		//	run=DRun?
		//	'</hyperlink>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<hyperlink' 'reference=' reference=[doc::DReferenceableObject|STRING] '>' run=DRun? '</hyperlink>'
		public Group getGroup() { return cGroup; }
		
		//'<hyperlink'
		public Keyword getHyperlinkKeyword_0() { return cHyperlinkKeyword_0; }
		
		//'reference='
		public Keyword getReferenceKeyword_1() { return cReferenceKeyword_1; }
		
		//reference=[doc::DReferenceableObject|STRING]
		public Assignment getReferenceAssignment_2() { return cReferenceAssignment_2; }
		
		//[doc::DReferenceableObject|STRING]
		public CrossReference getReferenceDReferenceableObjectCrossReference_2_0() { return cReferenceDReferenceableObjectCrossReference_2_0; }
		
		//STRING
		public RuleCall getReferenceDReferenceableObjectSTRINGTerminalRuleCall_2_0_1() { return cReferenceDReferenceableObjectSTRINGTerminalRuleCall_2_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//run=DRun?
		public Assignment getRunAssignment_4() { return cRunAssignment_4; }
		
		//DRun
		public RuleCall getRunDRunParserRuleCall_4_0() { return cRunDRunParserRuleCall_4_0; }
		
		//'</hyperlink>'
		public Keyword getHyperlinkKeyword_5() { return cHyperlinkKeyword_5; }
	}
	public class DTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DText");
		private final Assignment cContentAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContentRUNTEXTTerminalRuleCall_0 = (RuleCall)cContentAssignment.eContents().get(0);
		
		//DText doc::DText:
		//	content=RUNTEXT
		@Override public ParserRule getRule() { return rule; }
		
		//content=RUNTEXT
		public Assignment getContentAssignment() { return cContentAssignment; }
		
		//RUNTEXT
		public RuleCall getContentRUNTEXTTerminalRuleCall_0() { return cContentRUNTEXTTerminalRuleCall_0; }
	}
	public class DFigureFromFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DFigureFromFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFigureFromFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cReferenceFileKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cReferenceFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReferenceFileSTRINGTerminalRuleCall_4_0 = (RuleCall)cReferenceFileAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCaptionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cCaptionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cCaptionAssignment_5_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DFigureFromFile doc::DFigureFromFile:
		//	'<figureFromFile'
		//	'name=' name=STRING
		//	'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<figureFromFile' 'name=' name=STRING 'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<figureFromFile'
		public Keyword getFigureFromFileKeyword_0() { return cFigureFromFileKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'referenceFile='
		public Keyword getReferenceFileKeyword_3() { return cReferenceFileKeyword_3; }
		
		//referenceFile=STRING
		public Assignment getReferenceFileAssignment_4() { return cReferenceFileAssignment_4; }
		
		//STRING
		public RuleCall getReferenceFileSTRINGTerminalRuleCall_4_0() { return cReferenceFileSTRINGTerminalRuleCall_4_0; }
		
		//('caption=' caption=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'caption='
		public Keyword getCaptionKeyword_5_0() { return cCaptionKeyword_5_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_5_1() { return cCaptionAssignment_5_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_5_1_0() { return cCaptionSTRINGTerminalRuleCall_5_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_6() { return cSolidusGreaterThanSignKeyword_6; }
	}
	public class DTableFromFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DTableFromFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTableFromFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cReferenceFileKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cReferenceFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReferenceFileSTRINGTerminalRuleCall_4_0 = (RuleCall)cReferenceFileAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCaptionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cCaptionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cCaptionAssignment_5_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DTableFromFile doc::DTableFromFile:
		//	'<tableFromFile'
		//	'name=' name=STRING
		//	'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<tableFromFile' 'name=' name=STRING 'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<tableFromFile'
		public Keyword getTableFromFileKeyword_0() { return cTableFromFileKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'referenceFile='
		public Keyword getReferenceFileKeyword_3() { return cReferenceFileKeyword_3; }
		
		//referenceFile=STRING
		public Assignment getReferenceFileAssignment_4() { return cReferenceFileAssignment_4; }
		
		//STRING
		public RuleCall getReferenceFileSTRINGTerminalRuleCall_4_0() { return cReferenceFileSTRINGTerminalRuleCall_4_0; }
		
		//('caption=' caption=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'caption='
		public Keyword getCaptionKeyword_5_0() { return cCaptionKeyword_5_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_5_1() { return cCaptionAssignment_5_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_5_1_0() { return cCaptionSTRINGTerminalRuleCall_5_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_6() { return cSolidusGreaterThanSignKeyword_6; }
	}
	public class DBasicTableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBasicTable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBasicTableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCaptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cCaptionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cCaptionAssignment_3_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRowsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRowsDRowParserRuleCall_5_0 = (RuleCall)cRowsAssignment_5.eContents().get(0);
		private final Keyword cBasicTableKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DBasicTable doc::DBasicTable:
		//	'<basicTable'
		//	'name=' name=STRING ('caption=' caption=STRING)?
		//	'>'
		//	rows+=DRow+
		//	'</basicTable>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<basicTable' 'name=' name=STRING ('caption=' caption=STRING)? '>' rows+=DRow+ '</basicTable>'
		public Group getGroup() { return cGroup; }
		
		//'<basicTable'
		public Keyword getBasicTableKeyword_0() { return cBasicTableKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//('caption=' caption=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'caption='
		public Keyword getCaptionKeyword_3_0() { return cCaptionKeyword_3_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_3_1() { return cCaptionAssignment_3_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_3_1_0() { return cCaptionSTRINGTerminalRuleCall_3_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_4() { return cGreaterThanSignKeyword_4; }
		
		//rows+=DRow+
		public Assignment getRowsAssignment_5() { return cRowsAssignment_5; }
		
		//DRow
		public RuleCall getRowsDRowParserRuleCall_5_0() { return cRowsDRowParserRuleCall_5_0; }
		
		//'</basicTable>'
		public Keyword getBasicTableKeyword_6() { return cBasicTableKeyword_6; }
	}
	public class DRowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSpanKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSpanAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSpanSTRINGTerminalRuleCall_2_0 = (RuleCall)cSpanAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cColumnsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cColumnsDColumnParserRuleCall_4_0 = (RuleCall)cColumnsAssignment_4.eContents().get(0);
		private final Keyword cRowKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DRow doc::DRow:
		//	'<row'
		//	'span=' span=STRING
		//	'>'
		//	columns+=DColumn+
		//	'</row>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<row' 'span=' span=STRING '>' columns+=DColumn+ '</row>'
		public Group getGroup() { return cGroup; }
		
		//'<row'
		public Keyword getRowKeyword_0() { return cRowKeyword_0; }
		
		//'span='
		public Keyword getSpanKeyword_1() { return cSpanKeyword_1; }
		
		//span=STRING
		public Assignment getSpanAssignment_2() { return cSpanAssignment_2; }
		
		//STRING
		public RuleCall getSpanSTRINGTerminalRuleCall_2_0() { return cSpanSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//columns+=DColumn+
		public Assignment getColumnsAssignment_4() { return cColumnsAssignment_4; }
		
		//DColumn
		public RuleCall getColumnsDColumnParserRuleCall_4_0() { return cColumnsDColumnParserRuleCall_4_0; }
		
		//'</row>'
		public Keyword getRowKeyword_5() { return cRowKeyword_5; }
	}
	public class DColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DColumn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cColumnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSpanKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSpanAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSpanSTRINGTerminalRuleCall_2_0 = (RuleCall)cSpanAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCellsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCellsDCellParserRuleCall_4_0 = (RuleCall)cCellsAssignment_4.eContents().get(0);
		private final Keyword cColumnKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DColumn doc::DColumn:
		//	'<column'
		//	'span=' span=STRING
		//	'>'
		//	cells+=DCell+
		//	'</column>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<column' 'span=' span=STRING '>' cells+=DCell+ '</column>'
		public Group getGroup() { return cGroup; }
		
		//'<column'
		public Keyword getColumnKeyword_0() { return cColumnKeyword_0; }
		
		//'span='
		public Keyword getSpanKeyword_1() { return cSpanKeyword_1; }
		
		//span=STRING
		public Assignment getSpanAssignment_2() { return cSpanAssignment_2; }
		
		//STRING
		public RuleCall getSpanSTRINGTerminalRuleCall_2_0() { return cSpanSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//cells+=DCell+
		public Assignment getCellsAssignment_4() { return cCellsAssignment_4; }
		
		//DCell
		public RuleCall getCellsDCellParserRuleCall_4_0() { return cCellsDCellParserRuleCall_4_0; }
		
		//'</column>'
		public Keyword getColumnKeyword_5() { return cColumnKeyword_5; }
	}
	public class DCellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DCell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCellKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSpanKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSpanAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSpanSTRINGTerminalRuleCall_2_0 = (RuleCall)cSpanAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBodyContentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBodyContentDBodyContentParserRuleCall_4_0 = (RuleCall)cBodyContentAssignment_4.eContents().get(0);
		private final Keyword cCellKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DCell doc::DCell:
		//	'<cell'
		//	'span=' span=STRING
		//	'>'
		//	bodyContent+=DBodyContent+
		//	'</cell>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<cell' 'span=' span=STRING '>' bodyContent+=DBodyContent+ '</cell>'
		public Group getGroup() { return cGroup; }
		
		//'<cell'
		public Keyword getCellKeyword_0() { return cCellKeyword_0; }
		
		//'span='
		public Keyword getSpanKeyword_1() { return cSpanKeyword_1; }
		
		//span=STRING
		public Assignment getSpanAssignment_2() { return cSpanAssignment_2; }
		
		//STRING
		public RuleCall getSpanSTRINGTerminalRuleCall_2_0() { return cSpanSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//bodyContent+=DBodyContent+
		public Assignment getBodyContentAssignment_4() { return cBodyContentAssignment_4; }
		
		//DBodyContent
		public RuleCall getBodyContentDBodyContentParserRuleCall_4_0() { return cBodyContentDBodyContentParserRuleCall_4_0; }
		
		//'</cell>'
		public Keyword getCellKeyword_5() { return cCellKeyword_5; }
	}
	public class DApplicableDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DApplicableDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cApplicableDocumentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cTitleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTitleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTitleSTRINGTerminalRuleCall_4_0 = (RuleCall)cTitleAssignment_4.eContents().get(0);
		private final Keyword cIdKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIdAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIdSTRINGTerminalRuleCall_6_0 = (RuleCall)cIdAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cIssueKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cIssueAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cIssueUINT_STRINGTerminalRuleCall_7_1_0 = (RuleCall)cIssueAssignment_7_1.eContents().get(0);
		private final Group cGroup_7_2 = (Group)cGroup_7.eContents().get(2);
		private final Keyword cRevisionKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Assignment cRevisionAssignment_7_2_1 = (Assignment)cGroup_7_2.eContents().get(1);
		private final RuleCall cRevisionUINT_STRINGTerminalRuleCall_7_2_1_0 = (RuleCall)cRevisionAssignment_7_2_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cDateKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cDateAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cDateSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cDateAssignment_8_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DApplicableDocument doc::DApplicableDocument:
		//	'<ApplicableDocument'
		//	'name=' name=STRING
		//	'title=' title=STRING
		//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<ApplicableDocument' 'name=' name=STRING 'title=' title=STRING 'id=' id=STRING ('issue=' issue=UINT_STRING ('revision='
		//revision=UINT_STRING)?)? ('date=' date=STRING)? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<ApplicableDocument'
		public Keyword getApplicableDocumentKeyword_0() { return cApplicableDocumentKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'title='
		public Keyword getTitleKeyword_3() { return cTitleKeyword_3; }
		
		//title=STRING
		public Assignment getTitleAssignment_4() { return cTitleAssignment_4; }
		
		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_4_0() { return cTitleSTRINGTerminalRuleCall_4_0; }
		
		//'id='
		public Keyword getIdKeyword_5() { return cIdKeyword_5; }
		
		//id=STRING
		public Assignment getIdAssignment_6() { return cIdAssignment_6; }
		
		//STRING
		public RuleCall getIdSTRINGTerminalRuleCall_6_0() { return cIdSTRINGTerminalRuleCall_6_0; }
		
		//('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'issue='
		public Keyword getIssueKeyword_7_0() { return cIssueKeyword_7_0; }
		
		//issue=UINT_STRING
		public Assignment getIssueAssignment_7_1() { return cIssueAssignment_7_1; }
		
		//UINT_STRING
		public RuleCall getIssueUINT_STRINGTerminalRuleCall_7_1_0() { return cIssueUINT_STRINGTerminalRuleCall_7_1_0; }
		
		//('revision=' revision=UINT_STRING)?
		public Group getGroup_7_2() { return cGroup_7_2; }
		
		//'revision='
		public Keyword getRevisionKeyword_7_2_0() { return cRevisionKeyword_7_2_0; }
		
		//revision=UINT_STRING
		public Assignment getRevisionAssignment_7_2_1() { return cRevisionAssignment_7_2_1; }
		
		//UINT_STRING
		public RuleCall getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0() { return cRevisionUINT_STRINGTerminalRuleCall_7_2_1_0; }
		
		//('date=' date=STRING)?
		public Group getGroup_8() { return cGroup_8; }
		
		//'date='
		public Keyword getDateKeyword_8_0() { return cDateKeyword_8_0; }
		
		//date=STRING
		public Assignment getDateAssignment_8_1() { return cDateAssignment_8_1; }
		
		//STRING
		public RuleCall getDateSTRINGTerminalRuleCall_8_1_0() { return cDateSTRINGTerminalRuleCall_8_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_9() { return cSolidusGreaterThanSignKeyword_9; }
	}
	public class DReferenceDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DReferenceDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReferenceDocumentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cTitleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTitleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTitleSTRINGTerminalRuleCall_4_0 = (RuleCall)cTitleAssignment_4.eContents().get(0);
		private final Keyword cIdKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIdAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIdSTRINGTerminalRuleCall_6_0 = (RuleCall)cIdAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cIssueKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cIssueAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cIssueUINT_STRINGTerminalRuleCall_7_1_0 = (RuleCall)cIssueAssignment_7_1.eContents().get(0);
		private final Group cGroup_7_2 = (Group)cGroup_7.eContents().get(2);
		private final Keyword cRevisionKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Assignment cRevisionAssignment_7_2_1 = (Assignment)cGroup_7_2.eContents().get(1);
		private final RuleCall cRevisionUINT_STRINGTerminalRuleCall_7_2_1_0 = (RuleCall)cRevisionAssignment_7_2_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cDateKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cDateAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cDateSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cDateAssignment_8_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DReferenceDocument doc::DReferenceDocument:
		//	'<ReferenceDocument'
		//	'name=' name=STRING
		//	'title=' title=STRING
		//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<ReferenceDocument' 'name=' name=STRING 'title=' title=STRING 'id=' id=STRING ('issue=' issue=UINT_STRING ('revision='
		//revision=UINT_STRING)?)? ('date=' date=STRING)? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<ReferenceDocument'
		public Keyword getReferenceDocumentKeyword_0() { return cReferenceDocumentKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'title='
		public Keyword getTitleKeyword_3() { return cTitleKeyword_3; }
		
		//title=STRING
		public Assignment getTitleAssignment_4() { return cTitleAssignment_4; }
		
		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_4_0() { return cTitleSTRINGTerminalRuleCall_4_0; }
		
		//'id='
		public Keyword getIdKeyword_5() { return cIdKeyword_5; }
		
		//id=STRING
		public Assignment getIdAssignment_6() { return cIdAssignment_6; }
		
		//STRING
		public RuleCall getIdSTRINGTerminalRuleCall_6_0() { return cIdSTRINGTerminalRuleCall_6_0; }
		
		//('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'issue='
		public Keyword getIssueKeyword_7_0() { return cIssueKeyword_7_0; }
		
		//issue=UINT_STRING
		public Assignment getIssueAssignment_7_1() { return cIssueAssignment_7_1; }
		
		//UINT_STRING
		public RuleCall getIssueUINT_STRINGTerminalRuleCall_7_1_0() { return cIssueUINT_STRINGTerminalRuleCall_7_1_0; }
		
		//('revision=' revision=UINT_STRING)?
		public Group getGroup_7_2() { return cGroup_7_2; }
		
		//'revision='
		public Keyword getRevisionKeyword_7_2_0() { return cRevisionKeyword_7_2_0; }
		
		//revision=UINT_STRING
		public Assignment getRevisionAssignment_7_2_1() { return cRevisionAssignment_7_2_1; }
		
		//UINT_STRING
		public RuleCall getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0() { return cRevisionUINT_STRINGTerminalRuleCall_7_2_1_0; }
		
		//('date=' date=STRING)?
		public Group getGroup_8() { return cGroup_8; }
		
		//'date='
		public Keyword getDateKeyword_8_0() { return cDateKeyword_8_0; }
		
		//date=STRING
		public Assignment getDateAssignment_8_1() { return cDateAssignment_8_1; }
		
		//STRING
		public RuleCall getDateSTRINGTerminalRuleCall_8_1_0() { return cDateSTRINGTerminalRuleCall_8_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_9() { return cSolidusGreaterThanSignKeyword_9; }
	}
	public class VSVSFixedSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSFixedSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyDBodyParserRuleCall_1_0 = (RuleCall)cBodyAssignment_1.eContents().get(0);
		private final Assignment cSvsInstatiableSubsectionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_2_0 = (RuleCall)cSvsInstatiableSubsectionsAssignment_2.eContents().get(0);
		
		//VSVSFixedSection:
		//	{VSVSFixedSection} body=DBody?
		//	svsInstatiableSubsections+=VSVSInstantiableSection*;
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSFixedSection} body=DBody? svsInstatiableSubsections+=VSVSInstantiableSection*
		public Group getGroup() { return cGroup; }
		
		//{VSVSFixedSection}
		public Action getVSVSFixedSectionAction_0() { return cVSVSFixedSectionAction_0; }
		
		//body=DBody?
		public Assignment getBodyAssignment_1() { return cBodyAssignment_1; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_1_0() { return cBodyDBodyParserRuleCall_1_0; }
		
		//svsInstatiableSubsections+=VSVSInstantiableSection*
		public Assignment getSvsInstatiableSubsectionsAssignment_2() { return cSvsInstatiableSubsectionsAssignment_2; }
		
		//VSVSInstantiableSection
		public RuleCall getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_2_0() { return cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_2_0; }
	}
	public class VSVSInstantiableSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSInstantiableSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubsectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBodyAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBodyDBodyParserRuleCall_4_0 = (RuleCall)cBodyAssignment_4.eContents().get(0);
		private final Assignment cSvsInstatiableSubsectionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_5_0 = (RuleCall)cSvsInstatiableSubsectionsAssignment_5.eContents().get(0);
		private final Keyword cSubsectionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//VSVSInstantiableSection:
		//	'<subsection'
		//	'name=' name=STRING
		//	'>'
		//	body=DBody?
		//	svsInstatiableSubsections+=VSVSInstantiableSection*
		//	'</subsection>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<subsection' 'name=' name=STRING '>' body=DBody? svsInstatiableSubsections+=VSVSInstantiableSection* '</subsection>'
		public Group getGroup() { return cGroup; }
		
		//'<subsection'
		public Keyword getSubsectionKeyword_0() { return cSubsectionKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//body=DBody?
		public Assignment getBodyAssignment_4() { return cBodyAssignment_4; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_4_0() { return cBodyDBodyParserRuleCall_4_0; }
		
		//svsInstatiableSubsections+=VSVSInstantiableSection*
		public Assignment getSvsInstatiableSubsectionsAssignment_5() { return cSvsInstatiableSubsectionsAssignment_5; }
		
		//VSVSInstantiableSection
		public RuleCall getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_5_0() { return cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_5_0; }
		
		//'</subsection>'
		public Keyword getSubsectionKeyword_6() { return cSubsectionKeyword_6; }
	}
	public class VSVSIntroductionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSIntroduction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntroductionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSvsInstatiableSubsectionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_1_0 = (RuleCall)cSvsInstatiableSubsectionsAssignment_1.eContents().get(0);
		private final Keyword cIntroductionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//VSVSIntroduction:
		//	'<Introduction>'
		//	svsInstatiableSubsections+=VSVSInstantiableSection+
		//	'</Introduction>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Introduction>' svsInstatiableSubsections+=VSVSInstantiableSection+ '</Introduction>'
		public Group getGroup() { return cGroup; }
		
		//'<Introduction>'
		public Keyword getIntroductionKeyword_0() { return cIntroductionKeyword_0; }
		
		//svsInstatiableSubsections+=VSVSInstantiableSection+
		public Assignment getSvsInstatiableSubsectionsAssignment_1() { return cSvsInstatiableSubsectionsAssignment_1; }
		
		//VSVSInstantiableSection
		public RuleCall getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_1_0() { return cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_1_0; }
		
		//'</Introduction>'
		public Keyword getIntroductionKeyword_2() { return cIntroductionKeyword_2; }
	}
	public class VSVSApplicableDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSApplicableDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSApplicableDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cApplicableDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0 = (RuleCall)cApplicableDocumentsAssignment_2.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSApplicableDocuments:
		//	{VSVSApplicableDocuments}
		//	'<ApplicableDocuments>'
		//	applicableDocuments+=DApplicableDocument*
		//	'</ApplicableDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSApplicableDocuments} '<ApplicableDocuments>' applicableDocuments+=DApplicableDocument* '</ApplicableDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSApplicableDocuments}
		public Action getVSVSApplicableDocumentsAction_0() { return cVSVSApplicableDocumentsAction_0; }
		
		//'<ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_1() { return cApplicableDocumentsKeyword_1; }
		
		//applicableDocuments+=DApplicableDocument*
		public Assignment getApplicableDocumentsAssignment_2() { return cApplicableDocumentsAssignment_2; }
		
		//DApplicableDocument
		public RuleCall getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0() { return cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0; }
		
		//'</ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_3() { return cApplicableDocumentsKeyword_3; }
	}
	public class VSVSReferenceDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSReferenceDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSReferenceDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cReferenceDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0 = (RuleCall)cReferenceDocumentsAssignment_2.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSReferenceDocuments:
		//	{VSVSReferenceDocuments}
		//	'<ReferenceDocuments>'
		//	referenceDocuments+=DReferenceDocument*
		//	'</ReferenceDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSReferenceDocuments} '<ReferenceDocuments>' referenceDocuments+=DReferenceDocument* '</ReferenceDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSReferenceDocuments}
		public Action getVSVSReferenceDocumentsAction_0() { return cVSVSReferenceDocumentsAction_0; }
		
		//'<ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_1() { return cReferenceDocumentsKeyword_1; }
		
		//referenceDocuments+=DReferenceDocument*
		public Assignment getReferenceDocumentsAssignment_2() { return cReferenceDocumentsAssignment_2; }
		
		//DReferenceDocument
		public RuleCall getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0() { return cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0; }
		
		//'</ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_3() { return cReferenceDocumentsKeyword_3; }
	}
	public class VSVSTermsDefinitionsAbbreviationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTermsDefinitionsAbbreviations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSTermsDefinitionsAbbreviationsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTermsDefinitionsAbbreviationsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTermsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTermsVSVSTermParserRuleCall_2_0 = (RuleCall)cTermsAssignment_2.eContents().get(0);
		private final Assignment cDefinitionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefinitionsVSVSDefinitionParserRuleCall_3_0 = (RuleCall)cDefinitionsAssignment_3.eContents().get(0);
		private final Assignment cAbbreviationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAbbreviationsVSVSAbbreviationParserRuleCall_4_0 = (RuleCall)cAbbreviationsAssignment_4.eContents().get(0);
		private final Keyword cTermsDefinitionsAbbreviationsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSTermsDefinitionsAbbreviations:
		//	{VSVSTermsDefinitionsAbbreviations}
		//	'<TermsDefinitionsAbbreviations>'
		//	terms+=VSVSTerm*
		//	definitions+=VSVSDefinition*
		//	abbreviations+=VSVSAbbreviation*
		//	'</TermsDefinitionsAbbreviations>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSTermsDefinitionsAbbreviations} '<TermsDefinitionsAbbreviations>' terms+=VSVSTerm* definitions+=VSVSDefinition*
		//abbreviations+=VSVSAbbreviation* '</TermsDefinitionsAbbreviations>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSTermsDefinitionsAbbreviations}
		public Action getVSVSTermsDefinitionsAbbreviationsAction_0() { return cVSVSTermsDefinitionsAbbreviationsAction_0; }
		
		//'<TermsDefinitionsAbbreviations>'
		public Keyword getTermsDefinitionsAbbreviationsKeyword_1() { return cTermsDefinitionsAbbreviationsKeyword_1; }
		
		//terms+=VSVSTerm*
		public Assignment getTermsAssignment_2() { return cTermsAssignment_2; }
		
		//VSVSTerm
		public RuleCall getTermsVSVSTermParserRuleCall_2_0() { return cTermsVSVSTermParserRuleCall_2_0; }
		
		//definitions+=VSVSDefinition*
		public Assignment getDefinitionsAssignment_3() { return cDefinitionsAssignment_3; }
		
		//VSVSDefinition
		public RuleCall getDefinitionsVSVSDefinitionParserRuleCall_3_0() { return cDefinitionsVSVSDefinitionParserRuleCall_3_0; }
		
		//abbreviations+=VSVSAbbreviation*
		public Assignment getAbbreviationsAssignment_4() { return cAbbreviationsAssignment_4; }
		
		//VSVSAbbreviation
		public RuleCall getAbbreviationsVSVSAbbreviationParserRuleCall_4_0() { return cAbbreviationsVSVSAbbreviationParserRuleCall_4_0; }
		
		//'</TermsDefinitionsAbbreviations>'
		public Keyword getTermsDefinitionsAbbreviationsKeyword_5() { return cTermsDefinitionsAbbreviationsKeyword_5; }
	}
	public class VSVSSoftwareOverviewElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSSoftwareOverview");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSSoftwareOverviewAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSoftwareOverviewKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBodyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBodyDBodyParserRuleCall_2_0 = (RuleCall)cBodyAssignment_2.eContents().get(0);
		private final Assignment cSvsInstatiableSubsectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0 = (RuleCall)cSvsInstatiableSubsectionsAssignment_3.eContents().get(0);
		private final Keyword cSoftwareOverviewKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSVSSoftwareOverview:
		//	{VSVSSoftwareOverview}
		//	'<SoftwareOverview>'
		//	body=DBody?
		//	svsInstatiableSubsections+=VSVSInstantiableSection*
		//	'</SoftwareOverview>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSSoftwareOverview} '<SoftwareOverview>' body=DBody? svsInstatiableSubsections+=VSVSInstantiableSection*
		//'</SoftwareOverview>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSSoftwareOverview}
		public Action getVSVSSoftwareOverviewAction_0() { return cVSVSSoftwareOverviewAction_0; }
		
		//'<SoftwareOverview>'
		public Keyword getSoftwareOverviewKeyword_1() { return cSoftwareOverviewKeyword_1; }
		
		//body=DBody?
		public Assignment getBodyAssignment_2() { return cBodyAssignment_2; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_2_0() { return cBodyDBodyParserRuleCall_2_0; }
		
		//svsInstatiableSubsections+=VSVSInstantiableSection*
		public Assignment getSvsInstatiableSubsectionsAssignment_3() { return cSvsInstatiableSubsectionsAssignment_3; }
		
		//VSVSInstantiableSection
		public RuleCall getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0() { return cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0; }
		
		//'</SoftwareOverview>'
		public Keyword getSoftwareOverviewKeyword_4() { return cSoftwareOverviewKeyword_4; }
	}
	public class VSVSTaskIdentificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTaskIdentification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskIdentificationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTaskCriteriaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTaskCriteriaAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTaskCriteriaVSVSFixedSectionParserRuleCall_2_0 = (RuleCall)cTaskCriteriaAssignment_2.eContents().get(0);
		private final Keyword cTaskCriteriaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cFeaturesToBeTestedKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cFeaturesToBeTestedAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cFeaturesToBeTestedVSVSFixedSectionParserRuleCall_5_0 = (RuleCall)cFeaturesToBeTestedAssignment_5.eContents().get(0);
		private final Keyword cFeaturesToBeTestedKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cFeaturesNotToBeTestedKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFeaturesNotToBeTestedAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cFeaturesNotToBeTestedVSVSFixedSectionParserRuleCall_8_0 = (RuleCall)cFeaturesNotToBeTestedAssignment_8.eContents().get(0);
		private final Keyword cFeaturesNotToBeTestedKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cTestPassFailCriteriaKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cTestPassFailCriteriaAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cTestPassFailCriteriaVSVSFixedSectionParserRuleCall_11_0 = (RuleCall)cTestPassFailCriteriaAssignment_11.eContents().get(0);
		private final Keyword cTestPassFailCriteriaKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cItemsCanNotBeValidatedKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cItemsCanNotBeValidatedAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cItemsCanNotBeValidatedVSVSFixedSectionParserRuleCall_14_0 = (RuleCall)cItemsCanNotBeValidatedAssignment_14.eContents().get(0);
		private final Keyword cItemsCanNotBeValidatedKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cManuallyAutoGeneratedCodeKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cManuallyAutoGeneratedCodeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cManuallyAutoGeneratedCodeVSVSFixedSectionParserRuleCall_17_0 = (RuleCall)cManuallyAutoGeneratedCodeAssignment_17.eContents().get(0);
		private final Keyword cManuallyAutoGeneratedCodeKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cTaskIdentificationKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//VSVSTaskIdentification:
		//	'<TaskIdentification>'
		//	'<TaskCriteria>' taskCriteria=VSVSFixedSection '</TaskCriteria>'
		//	'<FeaturesToBeTested>' featuresToBeTested=VSVSFixedSection '</FeaturesToBeTested>'
		//	'<FeaturesNotToBeTested>' featuresNotToBeTested=VSVSFixedSection '</FeaturesNotToBeTested>'
		//	'<TestPassFailCriteria>' testPassFailCriteria=VSVSFixedSection '</TestPassFailCriteria>'
		//	'<ItemsCanNotBeValidated>' itemsCanNotBeValidated=VSVSFixedSection '</ItemsCanNotBeValidated>'
		//	'<ManuallyAutoGeneratedCode>' manuallyAutoGeneratedCode=VSVSFixedSection '</ManuallyAutoGeneratedCode>'
		//	'</TaskIdentification>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TaskIdentification>' '<TaskCriteria>' taskCriteria=VSVSFixedSection '</TaskCriteria>' '<FeaturesToBeTested>'
		//featuresToBeTested=VSVSFixedSection '</FeaturesToBeTested>' '<FeaturesNotToBeTested>'
		//featuresNotToBeTested=VSVSFixedSection '</FeaturesNotToBeTested>' '<TestPassFailCriteria>'
		//testPassFailCriteria=VSVSFixedSection '</TestPassFailCriteria>' '<ItemsCanNotBeValidated>'
		//itemsCanNotBeValidated=VSVSFixedSection '</ItemsCanNotBeValidated>' '<ManuallyAutoGeneratedCode>'
		//manuallyAutoGeneratedCode=VSVSFixedSection '</ManuallyAutoGeneratedCode>' '</TaskIdentification>'
		public Group getGroup() { return cGroup; }
		
		//'<TaskIdentification>'
		public Keyword getTaskIdentificationKeyword_0() { return cTaskIdentificationKeyword_0; }
		
		//'<TaskCriteria>'
		public Keyword getTaskCriteriaKeyword_1() { return cTaskCriteriaKeyword_1; }
		
		//taskCriteria=VSVSFixedSection
		public Assignment getTaskCriteriaAssignment_2() { return cTaskCriteriaAssignment_2; }
		
		//VSVSFixedSection
		public RuleCall getTaskCriteriaVSVSFixedSectionParserRuleCall_2_0() { return cTaskCriteriaVSVSFixedSectionParserRuleCall_2_0; }
		
		//'</TaskCriteria>'
		public Keyword getTaskCriteriaKeyword_3() { return cTaskCriteriaKeyword_3; }
		
		//'<FeaturesToBeTested>'
		public Keyword getFeaturesToBeTestedKeyword_4() { return cFeaturesToBeTestedKeyword_4; }
		
		//featuresToBeTested=VSVSFixedSection
		public Assignment getFeaturesToBeTestedAssignment_5() { return cFeaturesToBeTestedAssignment_5; }
		
		//VSVSFixedSection
		public RuleCall getFeaturesToBeTestedVSVSFixedSectionParserRuleCall_5_0() { return cFeaturesToBeTestedVSVSFixedSectionParserRuleCall_5_0; }
		
		//'</FeaturesToBeTested>'
		public Keyword getFeaturesToBeTestedKeyword_6() { return cFeaturesToBeTestedKeyword_6; }
		
		//'<FeaturesNotToBeTested>'
		public Keyword getFeaturesNotToBeTestedKeyword_7() { return cFeaturesNotToBeTestedKeyword_7; }
		
		//featuresNotToBeTested=VSVSFixedSection
		public Assignment getFeaturesNotToBeTestedAssignment_8() { return cFeaturesNotToBeTestedAssignment_8; }
		
		//VSVSFixedSection
		public RuleCall getFeaturesNotToBeTestedVSVSFixedSectionParserRuleCall_8_0() { return cFeaturesNotToBeTestedVSVSFixedSectionParserRuleCall_8_0; }
		
		//'</FeaturesNotToBeTested>'
		public Keyword getFeaturesNotToBeTestedKeyword_9() { return cFeaturesNotToBeTestedKeyword_9; }
		
		//'<TestPassFailCriteria>'
		public Keyword getTestPassFailCriteriaKeyword_10() { return cTestPassFailCriteriaKeyword_10; }
		
		//testPassFailCriteria=VSVSFixedSection
		public Assignment getTestPassFailCriteriaAssignment_11() { return cTestPassFailCriteriaAssignment_11; }
		
		//VSVSFixedSection
		public RuleCall getTestPassFailCriteriaVSVSFixedSectionParserRuleCall_11_0() { return cTestPassFailCriteriaVSVSFixedSectionParserRuleCall_11_0; }
		
		//'</TestPassFailCriteria>'
		public Keyword getTestPassFailCriteriaKeyword_12() { return cTestPassFailCriteriaKeyword_12; }
		
		//'<ItemsCanNotBeValidated>'
		public Keyword getItemsCanNotBeValidatedKeyword_13() { return cItemsCanNotBeValidatedKeyword_13; }
		
		//itemsCanNotBeValidated=VSVSFixedSection
		public Assignment getItemsCanNotBeValidatedAssignment_14() { return cItemsCanNotBeValidatedAssignment_14; }
		
		//VSVSFixedSection
		public RuleCall getItemsCanNotBeValidatedVSVSFixedSectionParserRuleCall_14_0() { return cItemsCanNotBeValidatedVSVSFixedSectionParserRuleCall_14_0; }
		
		//'</ItemsCanNotBeValidated>'
		public Keyword getItemsCanNotBeValidatedKeyword_15() { return cItemsCanNotBeValidatedKeyword_15; }
		
		//'<ManuallyAutoGeneratedCode>'
		public Keyword getManuallyAutoGeneratedCodeKeyword_16() { return cManuallyAutoGeneratedCodeKeyword_16; }
		
		//manuallyAutoGeneratedCode=VSVSFixedSection
		public Assignment getManuallyAutoGeneratedCodeAssignment_17() { return cManuallyAutoGeneratedCodeAssignment_17; }
		
		//VSVSFixedSection
		public RuleCall getManuallyAutoGeneratedCodeVSVSFixedSectionParserRuleCall_17_0() { return cManuallyAutoGeneratedCodeVSVSFixedSectionParserRuleCall_17_0; }
		
		//'</ManuallyAutoGeneratedCode>'
		public Keyword getManuallyAutoGeneratedCodeKeyword_18() { return cManuallyAutoGeneratedCodeKeyword_18; }
		
		//'</TaskIdentification>'
		public Keyword getTaskIdentificationKeyword_19() { return cTaskIdentificationKeyword_19; }
	}
	public class VSVSTestingSpecificationDesignElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestingSpecificationDesign");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTestingSpecificationDesignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cGeneralKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cGeneralAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGeneralVSVSFixedSectionParserRuleCall_2_0 = (RuleCall)cGeneralAssignment_2.eContents().get(0);
		private final Keyword cGeneralKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTestDesignsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTestDesignsVSVSTestDesignParserRuleCall_4_0 = (RuleCall)cTestDesignsAssignment_4.eContents().get(0);
		private final Keyword cTestingSpecificationDesignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSTestingSpecificationDesign:
		//	'<TestingSpecificationDesign>'
		//	'<General>' general=VSVSFixedSection '</General>'
		//	testDesigns+=VSVSTestDesign+
		//	'</TestingSpecificationDesign>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestingSpecificationDesign>' '<General>' general=VSVSFixedSection '</General>' testDesigns+=VSVSTestDesign+
		//'</TestingSpecificationDesign>'
		public Group getGroup() { return cGroup; }
		
		//'<TestingSpecificationDesign>'
		public Keyword getTestingSpecificationDesignKeyword_0() { return cTestingSpecificationDesignKeyword_0; }
		
		//'<General>'
		public Keyword getGeneralKeyword_1() { return cGeneralKeyword_1; }
		
		//general=VSVSFixedSection
		public Assignment getGeneralAssignment_2() { return cGeneralAssignment_2; }
		
		//VSVSFixedSection
		public RuleCall getGeneralVSVSFixedSectionParserRuleCall_2_0() { return cGeneralVSVSFixedSectionParserRuleCall_2_0; }
		
		//'</General>'
		public Keyword getGeneralKeyword_3() { return cGeneralKeyword_3; }
		
		//testDesigns+=VSVSTestDesign+
		public Assignment getTestDesignsAssignment_4() { return cTestDesignsAssignment_4; }
		
		//VSVSTestDesign
		public RuleCall getTestDesignsVSVSTestDesignParserRuleCall_4_0() { return cTestDesignsVSVSTestDesignParserRuleCall_4_0; }
		
		//'</TestingSpecificationDesign>'
		public Keyword getTestingSpecificationDesignKeyword_5() { return cTestingSpecificationDesignKeyword_5; }
	}
	public class VSVSTestCasesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestCases");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTestCasesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cGeneralKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cGeneralAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGeneralVSVSFixedSectionParserRuleCall_2_0 = (RuleCall)cGeneralAssignment_2.eContents().get(0);
		private final Keyword cGeneralKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTestCasesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTestCasesVSVSTestCaseParserRuleCall_4_0 = (RuleCall)cTestCasesAssignment_4.eContents().get(0);
		private final Keyword cTestCasesKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSTestCases:
		//	'<TestCases>'
		//	'<General>' general=VSVSFixedSection '</General>'
		//	testCases+=VSVSTestCase+
		//	'</TestCases>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestCases>' '<General>' general=VSVSFixedSection '</General>' testCases+=VSVSTestCase+ '</TestCases>'
		public Group getGroup() { return cGroup; }
		
		//'<TestCases>'
		public Keyword getTestCasesKeyword_0() { return cTestCasesKeyword_0; }
		
		//'<General>'
		public Keyword getGeneralKeyword_1() { return cGeneralKeyword_1; }
		
		//general=VSVSFixedSection
		public Assignment getGeneralAssignment_2() { return cGeneralAssignment_2; }
		
		//VSVSFixedSection
		public RuleCall getGeneralVSVSFixedSectionParserRuleCall_2_0() { return cGeneralVSVSFixedSectionParserRuleCall_2_0; }
		
		//'</General>'
		public Keyword getGeneralKeyword_3() { return cGeneralKeyword_3; }
		
		//testCases+=VSVSTestCase+
		public Assignment getTestCasesAssignment_4() { return cTestCasesAssignment_4; }
		
		//VSVSTestCase
		public RuleCall getTestCasesVSVSTestCaseParserRuleCall_4_0() { return cTestCasesVSVSTestCaseParserRuleCall_4_0; }
		
		//'</TestCases>'
		public Keyword getTestCasesKeyword_5() { return cTestCasesKeyword_5; }
	}
	public class VSVSTestProceduresElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestProcedures");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTestProceduresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cGeneralKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cGeneralAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGeneralVSVSFixedSectionParserRuleCall_2_0 = (RuleCall)cGeneralAssignment_2.eContents().get(0);
		private final Keyword cGeneralKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTestProceduresAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTestProceduresVSVSTestProcedureParserRuleCall_4_0 = (RuleCall)cTestProceduresAssignment_4.eContents().get(0);
		private final Keyword cTestProceduresKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSTestProcedures:
		//	'<TestProcedures>'
		//	'<General>' general=VSVSFixedSection '</General>'
		//	testProcedures+=VSVSTestProcedure+
		//	'</TestProcedures>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestProcedures>' '<General>' general=VSVSFixedSection '</General>' testProcedures+=VSVSTestProcedure+
		//'</TestProcedures>'
		public Group getGroup() { return cGroup; }
		
		//'<TestProcedures>'
		public Keyword getTestProceduresKeyword_0() { return cTestProceduresKeyword_0; }
		
		//'<General>'
		public Keyword getGeneralKeyword_1() { return cGeneralKeyword_1; }
		
		//general=VSVSFixedSection
		public Assignment getGeneralAssignment_2() { return cGeneralAssignment_2; }
		
		//VSVSFixedSection
		public RuleCall getGeneralVSVSFixedSectionParserRuleCall_2_0() { return cGeneralVSVSFixedSectionParserRuleCall_2_0; }
		
		//'</General>'
		public Keyword getGeneralKeyword_3() { return cGeneralKeyword_3; }
		
		//testProcedures+=VSVSTestProcedure+
		public Assignment getTestProceduresAssignment_4() { return cTestProceduresAssignment_4; }
		
		//VSVSTestProcedure
		public RuleCall getTestProceduresVSVSTestProcedureParserRuleCall_4_0() { return cTestProceduresVSVSTestProcedureParserRuleCall_4_0; }
		
		//'</TestProcedures>'
		public Keyword getTestProceduresKeyword_5() { return cTestProceduresKeyword_5; }
	}
	public class VSVSAnalysisInspectionReviewElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSAnalysisInspectionReview");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSAnalysisInspectionReviewAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAnalysisInspectionReviewKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBodyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBodyDBodyParserRuleCall_2_0 = (RuleCall)cBodyAssignment_2.eContents().get(0);
		private final Assignment cSvsInstatiableSubsectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0 = (RuleCall)cSvsInstatiableSubsectionsAssignment_3.eContents().get(0);
		private final Keyword cAnalysisInspectionReviewKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSVSAnalysisInspectionReview:
		//	{VSVSAnalysisInspectionReview}
		//	'<AnalysisInspectionReview>'
		//	body=DBody?
		//	svsInstatiableSubsections+=VSVSInstantiableSection*
		//	'</AnalysisInspectionReview>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSAnalysisInspectionReview} '<AnalysisInspectionReview>' body=DBody?
		//svsInstatiableSubsections+=VSVSInstantiableSection* '</AnalysisInspectionReview>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSAnalysisInspectionReview}
		public Action getVSVSAnalysisInspectionReviewAction_0() { return cVSVSAnalysisInspectionReviewAction_0; }
		
		//'<AnalysisInspectionReview>'
		public Keyword getAnalysisInspectionReviewKeyword_1() { return cAnalysisInspectionReviewKeyword_1; }
		
		//body=DBody?
		public Assignment getBodyAssignment_2() { return cBodyAssignment_2; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_2_0() { return cBodyDBodyParserRuleCall_2_0; }
		
		//svsInstatiableSubsections+=VSVSInstantiableSection*
		public Assignment getSvsInstatiableSubsectionsAssignment_3() { return cSvsInstatiableSubsectionsAssignment_3; }
		
		//VSVSInstantiableSection
		public RuleCall getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0() { return cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0; }
		
		//'</AnalysisInspectionReview>'
		public Keyword getAnalysisInspectionReviewKeyword_4() { return cAnalysisInspectionReviewKeyword_4; }
	}
	public class VSVSTestPlatformRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestPlatformRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSTestPlatformRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTestPlatformRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBodyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBodyDBodyParserRuleCall_2_0 = (RuleCall)cBodyAssignment_2.eContents().get(0);
		private final Assignment cSvsInstatiableSubsectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0 = (RuleCall)cSvsInstatiableSubsectionsAssignment_3.eContents().get(0);
		private final Keyword cTestPlatformRequirementsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSVSTestPlatformRequirements:
		//	{VSVSTestPlatformRequirements}
		//	'<TestPlatformRequirements>'
		//	body=DBody?
		//	svsInstatiableSubsections+=VSVSInstantiableSection*
		//	'</TestPlatformRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSTestPlatformRequirements} '<TestPlatformRequirements>' body=DBody?
		//svsInstatiableSubsections+=VSVSInstantiableSection* '</TestPlatformRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSTestPlatformRequirements}
		public Action getVSVSTestPlatformRequirementsAction_0() { return cVSVSTestPlatformRequirementsAction_0; }
		
		//'<TestPlatformRequirements>'
		public Keyword getTestPlatformRequirementsKeyword_1() { return cTestPlatformRequirementsKeyword_1; }
		
		//body=DBody?
		public Assignment getBodyAssignment_2() { return cBodyAssignment_2; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_2_0() { return cBodyDBodyParserRuleCall_2_0; }
		
		//svsInstatiableSubsections+=VSVSInstantiableSection*
		public Assignment getSvsInstatiableSubsectionsAssignment_3() { return cSvsInstatiableSubsectionsAssignment_3; }
		
		//VSVSInstantiableSection
		public RuleCall getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0() { return cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0; }
		
		//'</TestPlatformRequirements>'
		public Keyword getTestPlatformRequirementsKeyword_4() { return cTestPlatformRequirementsKeyword_4; }
	}
	public class VSVSAdditionalInformationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSAdditionalInformation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSAdditionalInformationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAdditionalInformationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBodyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBodyDBodyParserRuleCall_2_0 = (RuleCall)cBodyAssignment_2.eContents().get(0);
		private final Assignment cSvsInstatiableSubsectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0 = (RuleCall)cSvsInstatiableSubsectionsAssignment_3.eContents().get(0);
		private final Keyword cAdditionalInformationKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSVSAdditionalInformation:
		//	{VSVSAdditionalInformation}
		//	'<AdditionalInformation>'
		//	body=DBody?
		//	svsInstatiableSubsections+=VSVSInstantiableSection*
		//	'</AdditionalInformation>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSAdditionalInformation} '<AdditionalInformation>' body=DBody? svsInstatiableSubsections+=VSVSInstantiableSection*
		//'</AdditionalInformation>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSAdditionalInformation}
		public Action getVSVSAdditionalInformationAction_0() { return cVSVSAdditionalInformationAction_0; }
		
		//'<AdditionalInformation>'
		public Keyword getAdditionalInformationKeyword_1() { return cAdditionalInformationKeyword_1; }
		
		//body=DBody?
		public Assignment getBodyAssignment_2() { return cBodyAssignment_2; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_2_0() { return cBodyDBodyParserRuleCall_2_0; }
		
		//svsInstatiableSubsections+=VSVSInstantiableSection*
		public Assignment getSvsInstatiableSubsectionsAssignment_3() { return cSvsInstatiableSubsectionsAssignment_3; }
		
		//VSVSInstantiableSection
		public RuleCall getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0() { return cSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0; }
		
		//'</AdditionalInformation>'
		public Keyword getAdditionalInformationKeyword_4() { return cAdditionalInformationKeyword_4; }
	}
	public class VSVSTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cTermKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSTerm:
		//	'<Term'
		//	'name=' name=STRING '>'
		//	description=DRun
		//	'</Term>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Term' 'name=' name=STRING '>' description=DRun '</Term>'
		public Group getGroup() { return cGroup; }
		
		//'<Term'
		public Keyword getTermKeyword_0() { return cTermKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//description=DRun
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//DRun
		public RuleCall getDescriptionDRunParserRuleCall_4_0() { return cDescriptionDRunParserRuleCall_4_0; }
		
		//'</Term>'
		public Keyword getTermKeyword_5() { return cTermKeyword_5; }
	}
	public class VSVSDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cDefinitionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSDefinition:
		//	'<Definition'
		//	'name=' name=STRING '>'
		//	description=DRun
		//	'</Definition>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Definition' 'name=' name=STRING '>' description=DRun '</Definition>'
		public Group getGroup() { return cGroup; }
		
		//'<Definition'
		public Keyword getDefinitionKeyword_0() { return cDefinitionKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//description=DRun
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//DRun
		public RuleCall getDescriptionDRunParserRuleCall_4_0() { return cDescriptionDRunParserRuleCall_4_0; }
		
		//'</Definition>'
		public Keyword getDefinitionKeyword_5() { return cDefinitionKeyword_5; }
	}
	public class VSVSAbbreviationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSAbbreviation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAbbreviationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cAbbreviationKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSAbbreviation:
		//	'<Abbreviation'
		//	'name=' name=STRING '>'
		//	description=DRun
		//	'</Abbreviation>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Abbreviation' 'name=' name=STRING '>' description=DRun '</Abbreviation>'
		public Group getGroup() { return cGroup; }
		
		//'<Abbreviation'
		public Keyword getAbbreviationKeyword_0() { return cAbbreviationKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//description=DRun
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//DRun
		public RuleCall getDescriptionDRunParserRuleCall_4_0() { return cDescriptionDRunParserRuleCall_4_0; }
		
		//'</Abbreviation>'
		public Keyword getAbbreviationKeyword_5() { return cAbbreviationKeyword_5; }
	}
	public class VSVSTestDesignElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestDesign");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTestDesignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cGeneralKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cGeneralAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cGeneralVSVSFixedSectionParserRuleCall_5_0 = (RuleCall)cGeneralAssignment_5.eContents().get(0);
		private final Keyword cGeneralKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cFeaturesToBeTestedKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFeaturesToBeTestedAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cFeaturesToBeTestedVSVSFixedSectionParserRuleCall_8_0 = (RuleCall)cFeaturesToBeTestedAssignment_8.eContents().get(0);
		private final Keyword cFeaturesToBeTestedKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cApproachRefinementsKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cApproachRefinementsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cApproachRefinementsVSVSFixedSectionParserRuleCall_11_0 = (RuleCall)cApproachRefinementsAssignment_11.eContents().get(0);
		private final Keyword cApproachRefinementsKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cTestDesignKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//VSVSTestDesign:
		//	'<TestDesign'
		//	'name=' name=STRING
		//	'>'
		//	'<General>' general=VSVSFixedSection '</General>'
		//	'<FeaturesToBeTested>' featuresToBeTested=VSVSFixedSection '</FeaturesToBeTested>'
		//	'<ApproachRefinements>' approachRefinements=VSVSFixedSection '</ApproachRefinements>'
		//	'</TestDesign>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestDesign' 'name=' name=STRING '>' '<General>' general=VSVSFixedSection '</General>' '<FeaturesToBeTested>'
		//featuresToBeTested=VSVSFixedSection '</FeaturesToBeTested>' '<ApproachRefinements>'
		//approachRefinements=VSVSFixedSection '</ApproachRefinements>' '</TestDesign>'
		public Group getGroup() { return cGroup; }
		
		//'<TestDesign'
		public Keyword getTestDesignKeyword_0() { return cTestDesignKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//'<General>'
		public Keyword getGeneralKeyword_4() { return cGeneralKeyword_4; }
		
		//general=VSVSFixedSection
		public Assignment getGeneralAssignment_5() { return cGeneralAssignment_5; }
		
		//VSVSFixedSection
		public RuleCall getGeneralVSVSFixedSectionParserRuleCall_5_0() { return cGeneralVSVSFixedSectionParserRuleCall_5_0; }
		
		//'</General>'
		public Keyword getGeneralKeyword_6() { return cGeneralKeyword_6; }
		
		//'<FeaturesToBeTested>'
		public Keyword getFeaturesToBeTestedKeyword_7() { return cFeaturesToBeTestedKeyword_7; }
		
		//featuresToBeTested=VSVSFixedSection
		public Assignment getFeaturesToBeTestedAssignment_8() { return cFeaturesToBeTestedAssignment_8; }
		
		//VSVSFixedSection
		public RuleCall getFeaturesToBeTestedVSVSFixedSectionParserRuleCall_8_0() { return cFeaturesToBeTestedVSVSFixedSectionParserRuleCall_8_0; }
		
		//'</FeaturesToBeTested>'
		public Keyword getFeaturesToBeTestedKeyword_9() { return cFeaturesToBeTestedKeyword_9; }
		
		//'<ApproachRefinements>'
		public Keyword getApproachRefinementsKeyword_10() { return cApproachRefinementsKeyword_10; }
		
		//approachRefinements=VSVSFixedSection
		public Assignment getApproachRefinementsAssignment_11() { return cApproachRefinementsAssignment_11; }
		
		//VSVSFixedSection
		public RuleCall getApproachRefinementsVSVSFixedSectionParserRuleCall_11_0() { return cApproachRefinementsVSVSFixedSectionParserRuleCall_11_0; }
		
		//'</ApproachRefinements>'
		public Keyword getApproachRefinementsKeyword_12() { return cApproachRefinementsKeyword_12; }
		
		//'</TestDesign>'
		public Keyword getTestDesignKeyword_13() { return cTestDesignKeyword_13; }
	}
	public class VSVSTestCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTestCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cIdentifierKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cIdentifierAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cIdentifierVSVSFixedSectionParserRuleCall_5_0 = (RuleCall)cIdentifierAssignment_5.eContents().get(0);
		private final Keyword cIdentifierKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cInputsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cInputsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cInputsVSVSFixedSectionParserRuleCall_8_0 = (RuleCall)cInputsAssignment_8.eContents().get(0);
		private final Keyword cInputsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cOutputsKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cOutputsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cOutputsVSVSFixedSectionParserRuleCall_11_0 = (RuleCall)cOutputsAssignment_11.eContents().get(0);
		private final Keyword cOutputsKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cPassFailCriteriaKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cPassFailCriteriaAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cPassFailCriteriaVSVSFixedSectionParserRuleCall_14_0 = (RuleCall)cPassFailCriteriaAssignment_14.eContents().get(0);
		private final Keyword cPassFailCriteriaKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cEnvironmentalNeedsKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cEnvironmentalNeedsAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cEnvironmentalNeedsVSVSFixedSectionParserRuleCall_17_0 = (RuleCall)cEnvironmentalNeedsAssignment_17.eContents().get(0);
		private final Keyword cEnvironmentalNeedsKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSpecialConstraintsKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cSpecialConstraintsAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cSpecialConstraintsVSVSFixedSectionParserRuleCall_20_0 = (RuleCall)cSpecialConstraintsAssignment_20.eContents().get(0);
		private final Keyword cSpecialConstraintsKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Keyword cInterfaceDependenciesKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Assignment cInterfaceDependenciesAssignment_23 = (Assignment)cGroup.eContents().get(23);
		private final RuleCall cInterfaceDependenciesVSVSFixedSectionParserRuleCall_23_0 = (RuleCall)cInterfaceDependenciesAssignment_23.eContents().get(0);
		private final Keyword cInterfaceDependenciesKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Group cGroup_25 = (Group)cGroup.eContents().get(25);
		private final Keyword cValidatingItemsKeyword_25_0 = (Keyword)cGroup_25.eContents().get(0);
		private final Keyword cNameKeyword_25_1 = (Keyword)cGroup_25.eContents().get(1);
		private final Assignment cValidatingItemsAssignment_25_2 = (Assignment)cGroup_25.eContents().get(2);
		private final CrossReference cValidatingItemsVTraceableDocumentAbstractItemCrossReference_25_2_0 = (CrossReference)cValidatingItemsAssignment_25_2.eContents().get(0);
		private final RuleCall cValidatingItemsVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_25_2_0_1 = (RuleCall)cValidatingItemsVTraceableDocumentAbstractItemCrossReference_25_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_25_3 = (Keyword)cGroup_25.eContents().get(3);
		private final Keyword cTestCaseKeyword_26 = (Keyword)cGroup.eContents().get(26);
		
		//VSVSTestCase:
		//	'<TestCase'
		//	'name=' name=STRING
		//	'>'
		//	'<Identifier>' identifier=VSVSFixedSection '</Identifier>'
		//	'<Inputs>' inputs=VSVSFixedSection '</Inputs>'
		//	'<Outputs>' outputs=VSVSFixedSection '</Outputs>'
		//	'<PassFailCriteria>' passFailCriteria=VSVSFixedSection '</PassFailCriteria>'
		//	'<EnvironmentalNeeds>' environmentalNeeds=VSVSFixedSection '</EnvironmentalNeeds>'
		//	'<SpecialConstraints>' specialConstraints=VSVSFixedSection '</SpecialConstraints>'
		//	'<InterfaceDependencies>' interfaceDependencies=VSVSFixedSection '</InterfaceDependencies>' ('<ValidatingItems'
		//	'name=' validatingItems+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+
		//	'</TestCase>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestCase' 'name=' name=STRING '>' '<Identifier>' identifier=VSVSFixedSection '</Identifier>' '<Inputs>'
		//inputs=VSVSFixedSection '</Inputs>' '<Outputs>' outputs=VSVSFixedSection '</Outputs>' '<PassFailCriteria>'
		//passFailCriteria=VSVSFixedSection '</PassFailCriteria>' '<EnvironmentalNeeds>' environmentalNeeds=VSVSFixedSection
		//'</EnvironmentalNeeds>' '<SpecialConstraints>' specialConstraints=VSVSFixedSection '</SpecialConstraints>'
		//'<InterfaceDependencies>' interfaceDependencies=VSVSFixedSection '</InterfaceDependencies>' ('<ValidatingItems'
		//'name=' validatingItems+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+ '</TestCase>'
		public Group getGroup() { return cGroup; }
		
		//'<TestCase'
		public Keyword getTestCaseKeyword_0() { return cTestCaseKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//'<Identifier>'
		public Keyword getIdentifierKeyword_4() { return cIdentifierKeyword_4; }
		
		//identifier=VSVSFixedSection
		public Assignment getIdentifierAssignment_5() { return cIdentifierAssignment_5; }
		
		//VSVSFixedSection
		public RuleCall getIdentifierVSVSFixedSectionParserRuleCall_5_0() { return cIdentifierVSVSFixedSectionParserRuleCall_5_0; }
		
		//'</Identifier>'
		public Keyword getIdentifierKeyword_6() { return cIdentifierKeyword_6; }
		
		//'<Inputs>'
		public Keyword getInputsKeyword_7() { return cInputsKeyword_7; }
		
		//inputs=VSVSFixedSection
		public Assignment getInputsAssignment_8() { return cInputsAssignment_8; }
		
		//VSVSFixedSection
		public RuleCall getInputsVSVSFixedSectionParserRuleCall_8_0() { return cInputsVSVSFixedSectionParserRuleCall_8_0; }
		
		//'</Inputs>'
		public Keyword getInputsKeyword_9() { return cInputsKeyword_9; }
		
		//'<Outputs>'
		public Keyword getOutputsKeyword_10() { return cOutputsKeyword_10; }
		
		//outputs=VSVSFixedSection
		public Assignment getOutputsAssignment_11() { return cOutputsAssignment_11; }
		
		//VSVSFixedSection
		public RuleCall getOutputsVSVSFixedSectionParserRuleCall_11_0() { return cOutputsVSVSFixedSectionParserRuleCall_11_0; }
		
		//'</Outputs>'
		public Keyword getOutputsKeyword_12() { return cOutputsKeyword_12; }
		
		//'<PassFailCriteria>'
		public Keyword getPassFailCriteriaKeyword_13() { return cPassFailCriteriaKeyword_13; }
		
		//passFailCriteria=VSVSFixedSection
		public Assignment getPassFailCriteriaAssignment_14() { return cPassFailCriteriaAssignment_14; }
		
		//VSVSFixedSection
		public RuleCall getPassFailCriteriaVSVSFixedSectionParserRuleCall_14_0() { return cPassFailCriteriaVSVSFixedSectionParserRuleCall_14_0; }
		
		//'</PassFailCriteria>'
		public Keyword getPassFailCriteriaKeyword_15() { return cPassFailCriteriaKeyword_15; }
		
		//'<EnvironmentalNeeds>'
		public Keyword getEnvironmentalNeedsKeyword_16() { return cEnvironmentalNeedsKeyword_16; }
		
		//environmentalNeeds=VSVSFixedSection
		public Assignment getEnvironmentalNeedsAssignment_17() { return cEnvironmentalNeedsAssignment_17; }
		
		//VSVSFixedSection
		public RuleCall getEnvironmentalNeedsVSVSFixedSectionParserRuleCall_17_0() { return cEnvironmentalNeedsVSVSFixedSectionParserRuleCall_17_0; }
		
		//'</EnvironmentalNeeds>'
		public Keyword getEnvironmentalNeedsKeyword_18() { return cEnvironmentalNeedsKeyword_18; }
		
		//'<SpecialConstraints>'
		public Keyword getSpecialConstraintsKeyword_19() { return cSpecialConstraintsKeyword_19; }
		
		//specialConstraints=VSVSFixedSection
		public Assignment getSpecialConstraintsAssignment_20() { return cSpecialConstraintsAssignment_20; }
		
		//VSVSFixedSection
		public RuleCall getSpecialConstraintsVSVSFixedSectionParserRuleCall_20_0() { return cSpecialConstraintsVSVSFixedSectionParserRuleCall_20_0; }
		
		//'</SpecialConstraints>'
		public Keyword getSpecialConstraintsKeyword_21() { return cSpecialConstraintsKeyword_21; }
		
		//'<InterfaceDependencies>'
		public Keyword getInterfaceDependenciesKeyword_22() { return cInterfaceDependenciesKeyword_22; }
		
		//interfaceDependencies=VSVSFixedSection
		public Assignment getInterfaceDependenciesAssignment_23() { return cInterfaceDependenciesAssignment_23; }
		
		//VSVSFixedSection
		public RuleCall getInterfaceDependenciesVSVSFixedSectionParserRuleCall_23_0() { return cInterfaceDependenciesVSVSFixedSectionParserRuleCall_23_0; }
		
		//'</InterfaceDependencies>'
		public Keyword getInterfaceDependenciesKeyword_24() { return cInterfaceDependenciesKeyword_24; }
		
		//('<ValidatingItems' 'name=' validatingItems+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+
		public Group getGroup_25() { return cGroup_25; }
		
		//'<ValidatingItems'
		public Keyword getValidatingItemsKeyword_25_0() { return cValidatingItemsKeyword_25_0; }
		
		//'name='
		public Keyword getNameKeyword_25_1() { return cNameKeyword_25_1; }
		
		//validatingItems+=[tdm::VTraceableDocumentAbstractItem|STRING]
		public Assignment getValidatingItemsAssignment_25_2() { return cValidatingItemsAssignment_25_2; }
		
		//[tdm::VTraceableDocumentAbstractItem|STRING]
		public CrossReference getValidatingItemsVTraceableDocumentAbstractItemCrossReference_25_2_0() { return cValidatingItemsVTraceableDocumentAbstractItemCrossReference_25_2_0; }
		
		//STRING
		public RuleCall getValidatingItemsVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_25_2_0_1() { return cValidatingItemsVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_25_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_25_3() { return cSolidusGreaterThanSignKeyword_25_3; }
		
		//'</TestCase>'
		public Keyword getTestCaseKeyword_26() { return cTestCaseKeyword_26; }
	}
	public class VSVSTestProcedureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestProcedure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTestProcedureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cIdentifierKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cIdentifierAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cIdentifierVSVSFixedSectionParserRuleCall_5_0 = (RuleCall)cIdentifierAssignment_5.eContents().get(0);
		private final Keyword cIdentifierKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cPurposeKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPurposeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPurposeVSVSFixedSectionParserRuleCall_8_0 = (RuleCall)cPurposeAssignment_8.eContents().get(0);
		private final Keyword cPurposeKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cTestCaseKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cNameKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cTestCaseAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final CrossReference cTestCaseVSVSTestCaseCrossReference_10_2_0 = (CrossReference)cTestCaseAssignment_10_2.eContents().get(0);
		private final RuleCall cTestCaseVSVSTestCaseSTRINGTerminalRuleCall_10_2_0_1 = (RuleCall)cTestCaseVSVSTestCaseCrossReference_10_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Assignment cProcedureStepsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cProcedureStepsVSVSProcedureStepsParserRuleCall_11_0 = (RuleCall)cProcedureStepsAssignment_11.eContents().get(0);
		private final Keyword cTestScriptKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cTestScriptAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cTestScriptVSVSFixedSectionParserRuleCall_13_0 = (RuleCall)cTestScriptAssignment_13.eContents().get(0);
		private final Keyword cTestScriptKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cTestProcedureKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//VSVSTestProcedure:
		//	'<TestProcedure'
		//	'name=' name=STRING
		//	'>'
		//	'<Identifier>' identifier=VSVSFixedSection '</Identifier>'
		//	'<Purpose>' purpose=VSVSFixedSection '</Purpose>' ('<TestCase' 'name=' testCase+=[VSVSTestCase|STRING] '/>')*
		//	procedureSteps=VSVSProcedureSteps
		//	'<TestScript>' testScript=VSVSFixedSection '</TestScript>'
		//	'</TestProcedure>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestProcedure' 'name=' name=STRING '>' '<Identifier>' identifier=VSVSFixedSection '</Identifier>' '<Purpose>'
		//purpose=VSVSFixedSection '</Purpose>' ('<TestCase' 'name=' testCase+=[VSVSTestCase|STRING] '/>')*
		//procedureSteps=VSVSProcedureSteps '<TestScript>' testScript=VSVSFixedSection '</TestScript>' '</TestProcedure>'
		public Group getGroup() { return cGroup; }
		
		//'<TestProcedure'
		public Keyword getTestProcedureKeyword_0() { return cTestProcedureKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//'<Identifier>'
		public Keyword getIdentifierKeyword_4() { return cIdentifierKeyword_4; }
		
		//identifier=VSVSFixedSection
		public Assignment getIdentifierAssignment_5() { return cIdentifierAssignment_5; }
		
		//VSVSFixedSection
		public RuleCall getIdentifierVSVSFixedSectionParserRuleCall_5_0() { return cIdentifierVSVSFixedSectionParserRuleCall_5_0; }
		
		//'</Identifier>'
		public Keyword getIdentifierKeyword_6() { return cIdentifierKeyword_6; }
		
		//'<Purpose>'
		public Keyword getPurposeKeyword_7() { return cPurposeKeyword_7; }
		
		//purpose=VSVSFixedSection
		public Assignment getPurposeAssignment_8() { return cPurposeAssignment_8; }
		
		//VSVSFixedSection
		public RuleCall getPurposeVSVSFixedSectionParserRuleCall_8_0() { return cPurposeVSVSFixedSectionParserRuleCall_8_0; }
		
		//'</Purpose>'
		public Keyword getPurposeKeyword_9() { return cPurposeKeyword_9; }
		
		//('<TestCase' 'name=' testCase+=[VSVSTestCase|STRING] '/>')*
		public Group getGroup_10() { return cGroup_10; }
		
		//'<TestCase'
		public Keyword getTestCaseKeyword_10_0() { return cTestCaseKeyword_10_0; }
		
		//'name='
		public Keyword getNameKeyword_10_1() { return cNameKeyword_10_1; }
		
		//testCase+=[VSVSTestCase|STRING]
		public Assignment getTestCaseAssignment_10_2() { return cTestCaseAssignment_10_2; }
		
		//[VSVSTestCase|STRING]
		public CrossReference getTestCaseVSVSTestCaseCrossReference_10_2_0() { return cTestCaseVSVSTestCaseCrossReference_10_2_0; }
		
		//STRING
		public RuleCall getTestCaseVSVSTestCaseSTRINGTerminalRuleCall_10_2_0_1() { return cTestCaseVSVSTestCaseSTRINGTerminalRuleCall_10_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_10_3() { return cSolidusGreaterThanSignKeyword_10_3; }
		
		//procedureSteps=VSVSProcedureSteps
		public Assignment getProcedureStepsAssignment_11() { return cProcedureStepsAssignment_11; }
		
		//VSVSProcedureSteps
		public RuleCall getProcedureStepsVSVSProcedureStepsParserRuleCall_11_0() { return cProcedureStepsVSVSProcedureStepsParserRuleCall_11_0; }
		
		//'<TestScript>'
		public Keyword getTestScriptKeyword_12() { return cTestScriptKeyword_12; }
		
		//testScript=VSVSFixedSection
		public Assignment getTestScriptAssignment_13() { return cTestScriptAssignment_13; }
		
		//VSVSFixedSection
		public RuleCall getTestScriptVSVSFixedSectionParserRuleCall_13_0() { return cTestScriptVSVSFixedSectionParserRuleCall_13_0; }
		
		//'</TestScript>'
		public Keyword getTestScriptKeyword_14() { return cTestScriptKeyword_14; }
		
		//'</TestProcedure>'
		public Keyword getTestProcedureKeyword_15() { return cTestProcedureKeyword_15; }
	}
	public class VSVSProcedureStepsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSProcedureSteps");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProcedureStepsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStepAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStepVSVSProcedureStepParserRuleCall_4_0 = (RuleCall)cStepAssignment_4.eContents().get(0);
		private final Keyword cProcedureStepsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSProcedureSteps:
		//	'<ProcedureSteps'
		//	'name=' name=STRING
		//	'>'
		//	step+=VSVSProcedureStep+
		//	'</ProcedureSteps>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<ProcedureSteps' 'name=' name=STRING '>' step+=VSVSProcedureStep+ '</ProcedureSteps>'
		public Group getGroup() { return cGroup; }
		
		//'<ProcedureSteps'
		public Keyword getProcedureStepsKeyword_0() { return cProcedureStepsKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//step+=VSVSProcedureStep+
		public Assignment getStepAssignment_4() { return cStepAssignment_4; }
		
		//VSVSProcedureStep
		public RuleCall getStepVSVSProcedureStepParserRuleCall_4_0() { return cStepVSVSProcedureStepParserRuleCall_4_0; }
		
		//'</ProcedureSteps>'
		public Keyword getProcedureStepsKeyword_5() { return cProcedureStepsKeyword_5; }
	}
	public class VSVSProcedureStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSProcedureStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStepKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIdKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cPrev_step_idrefKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cPrev_step_idrefAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cPrev_step_idrefVSVSProcedureStepCrossReference_5_1_0 = (CrossReference)cPrev_step_idrefAssignment_5_1.eContents().get(0);
		private final RuleCall cPrev_step_idrefVSVSProcedureStepSTRINGTerminalRuleCall_5_1_0_1 = (RuleCall)cPrev_step_idrefVSVSProcedureStepCrossReference_5_1_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cOutput_idref_from_prev_stepKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cOutput_idref_from_prev_stepAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cOutput_idref_from_prev_stepVSVSStepOutputCrossReference_6_1_0 = (CrossReference)cOutput_idref_from_prev_stepAssignment_6_1.eContents().get(0);
		private final RuleCall cOutput_idref_from_prev_stepVSVSStepOutputSTRINGTerminalRuleCall_6_1_0_1 = (RuleCall)cOutput_idref_from_prev_stepVSVSStepOutputCrossReference_6_1_0.eContents().get(1);
		private final Keyword cModeKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cModeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cModeVSVSStepModeEnumRuleCall_8_0 = (RuleCall)cModeAssignment_8.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cReplaysKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cReplaysAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cReplaysSTRINGTerminalRuleCall_9_1_0 = (RuleCall)cReplaysAssignment_9_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cInputsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cInputsVSVSStepInputsParserRuleCall_11_0 = (RuleCall)cInputsAssignment_11.eContents().get(0);
		private final Assignment cOutputsAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cOutputsVSVSStepOutputsParserRuleCall_12_0 = (RuleCall)cOutputsAssignment_12.eContents().get(0);
		private final Assignment cSpecialPacketsAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cSpecialPacketsVSVSStepSpecialPacketsParserRuleCall_13_0 = (RuleCall)cSpecialPacketsAssignment_13.eContents().get(0);
		private final Assignment cConcurrent_stepsAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cConcurrent_stepsVSVSStepConcurrentStepsParserRuleCall_14_0 = (RuleCall)cConcurrent_stepsAssignment_14.eContents().get(0);
		private final Keyword cStepKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//VSVSProcedureStep:
		//	'<step'
		//	'name=' name=STRING
		//	'id=' id=UINT_STRING ('prev_step_idref=' prev_step_idref=[VSVSProcedureStep|STRING])? ('output_idref_from_prev_step='
		//	output_idref_from_prev_step=[VSVSStepOutput|STRING])?
		//	'mode=' mode=VSVSStepMode ('replays=' replays=STRING)?
		//	'>'
		//	inputs=VSVSStepInputs
		//	outputs=VSVSStepOutputs?
		//	specialPackets=VSVSStepSpecialPackets?
		//	concurrent_steps=VSVSStepConcurrentSteps?
		//	'</step>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<step' 'name=' name=STRING 'id=' id=UINT_STRING ('prev_step_idref=' prev_step_idref=[VSVSProcedureStep|STRING])?
		//('output_idref_from_prev_step=' output_idref_from_prev_step=[VSVSStepOutput|STRING])? 'mode=' mode=VSVSStepMode
		//('replays=' replays=STRING)? '>' inputs=VSVSStepInputs outputs=VSVSStepOutputs? specialPackets=VSVSStepSpecialPackets?
		//concurrent_steps=VSVSStepConcurrentSteps? '</step>'
		public Group getGroup() { return cGroup; }
		
		//'<step'
		public Keyword getStepKeyword_0() { return cStepKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'id='
		public Keyword getIdKeyword_3() { return cIdKeyword_3; }
		
		//id=UINT_STRING
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//UINT_STRING
		public RuleCall getIdUINT_STRINGTerminalRuleCall_4_0() { return cIdUINT_STRINGTerminalRuleCall_4_0; }
		
		//('prev_step_idref=' prev_step_idref=[VSVSProcedureStep|STRING])?
		public Group getGroup_5() { return cGroup_5; }
		
		//'prev_step_idref='
		public Keyword getPrev_step_idrefKeyword_5_0() { return cPrev_step_idrefKeyword_5_0; }
		
		//prev_step_idref=[VSVSProcedureStep|STRING]
		public Assignment getPrev_step_idrefAssignment_5_1() { return cPrev_step_idrefAssignment_5_1; }
		
		//[VSVSProcedureStep|STRING]
		public CrossReference getPrev_step_idrefVSVSProcedureStepCrossReference_5_1_0() { return cPrev_step_idrefVSVSProcedureStepCrossReference_5_1_0; }
		
		//STRING
		public RuleCall getPrev_step_idrefVSVSProcedureStepSTRINGTerminalRuleCall_5_1_0_1() { return cPrev_step_idrefVSVSProcedureStepSTRINGTerminalRuleCall_5_1_0_1; }
		
		//('output_idref_from_prev_step=' output_idref_from_prev_step=[VSVSStepOutput|STRING])?
		public Group getGroup_6() { return cGroup_6; }
		
		//'output_idref_from_prev_step='
		public Keyword getOutput_idref_from_prev_stepKeyword_6_0() { return cOutput_idref_from_prev_stepKeyword_6_0; }
		
		//output_idref_from_prev_step=[VSVSStepOutput|STRING]
		public Assignment getOutput_idref_from_prev_stepAssignment_6_1() { return cOutput_idref_from_prev_stepAssignment_6_1; }
		
		//[VSVSStepOutput|STRING]
		public CrossReference getOutput_idref_from_prev_stepVSVSStepOutputCrossReference_6_1_0() { return cOutput_idref_from_prev_stepVSVSStepOutputCrossReference_6_1_0; }
		
		//STRING
		public RuleCall getOutput_idref_from_prev_stepVSVSStepOutputSTRINGTerminalRuleCall_6_1_0_1() { return cOutput_idref_from_prev_stepVSVSStepOutputSTRINGTerminalRuleCall_6_1_0_1; }
		
		//'mode='
		public Keyword getModeKeyword_7() { return cModeKeyword_7; }
		
		//mode=VSVSStepMode
		public Assignment getModeAssignment_8() { return cModeAssignment_8; }
		
		//VSVSStepMode
		public RuleCall getModeVSVSStepModeEnumRuleCall_8_0() { return cModeVSVSStepModeEnumRuleCall_8_0; }
		
		//('replays=' replays=STRING)?
		public Group getGroup_9() { return cGroup_9; }
		
		//'replays='
		public Keyword getReplaysKeyword_9_0() { return cReplaysKeyword_9_0; }
		
		//replays=STRING
		public Assignment getReplaysAssignment_9_1() { return cReplaysAssignment_9_1; }
		
		//STRING
		public RuleCall getReplaysSTRINGTerminalRuleCall_9_1_0() { return cReplaysSTRINGTerminalRuleCall_9_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_10() { return cGreaterThanSignKeyword_10; }
		
		//inputs=VSVSStepInputs
		public Assignment getInputsAssignment_11() { return cInputsAssignment_11; }
		
		//VSVSStepInputs
		public RuleCall getInputsVSVSStepInputsParserRuleCall_11_0() { return cInputsVSVSStepInputsParserRuleCall_11_0; }
		
		//outputs=VSVSStepOutputs?
		public Assignment getOutputsAssignment_12() { return cOutputsAssignment_12; }
		
		//VSVSStepOutputs
		public RuleCall getOutputsVSVSStepOutputsParserRuleCall_12_0() { return cOutputsVSVSStepOutputsParserRuleCall_12_0; }
		
		//specialPackets=VSVSStepSpecialPackets?
		public Assignment getSpecialPacketsAssignment_13() { return cSpecialPacketsAssignment_13; }
		
		//VSVSStepSpecialPackets
		public RuleCall getSpecialPacketsVSVSStepSpecialPacketsParserRuleCall_13_0() { return cSpecialPacketsVSVSStepSpecialPacketsParserRuleCall_13_0; }
		
		//concurrent_steps=VSVSStepConcurrentSteps?
		public Assignment getConcurrent_stepsAssignment_14() { return cConcurrent_stepsAssignment_14; }
		
		//VSVSStepConcurrentSteps
		public RuleCall getConcurrent_stepsVSVSStepConcurrentStepsParserRuleCall_14_0() { return cConcurrent_stepsVSVSStepConcurrentStepsParserRuleCall_14_0; }
		
		//'</step>'
		public Keyword getStepKeyword_15() { return cStepKeyword_15; }
	}
	public class VSVSStepInputsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepInputs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSStepInputsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInputsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cInput_level_3Assignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cInput_level_3VSVSStepInputLevel3ParserRuleCall_2_0_0 = (RuleCall)cInput_level_3Assignment_2_0.eContents().get(0);
		private final Assignment cInput_level_2Assignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cInput_level_2VSVSStepInputLevel2ParserRuleCall_2_1_0 = (RuleCall)cInput_level_2Assignment_2_1.eContents().get(0);
		private final Assignment cInput_level_1Assignment_2_2 = (Assignment)cAlternatives_2.eContents().get(2);
		private final RuleCall cInput_level_1VSVSStepInputLevel1ParserRuleCall_2_2_0 = (RuleCall)cInput_level_1Assignment_2_2.eContents().get(0);
		private final Assignment cInput_level_0Assignment_2_3 = (Assignment)cAlternatives_2.eContents().get(3);
		private final RuleCall cInput_level_0VSVSStepInputLevel0ParserRuleCall_2_3_0 = (RuleCall)cInput_level_0Assignment_2_3.eContents().get(0);
		private final Keyword cInputsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSStepInputs:
		//	{VSVSStepInputs}
		//	'<inputs>' (input_level_3+=VSVSStepInputLevel3 | input_level_2+=VSVSStepInputLevel2 |
		//	input_level_1+=VSVSStepInputLevel1 | input_level_0+=VSVSStepInputLevel0)+
		//	'</inputs>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSStepInputs} '<inputs>' (input_level_3+=VSVSStepInputLevel3 | input_level_2+=VSVSStepInputLevel2 |
		//input_level_1+=VSVSStepInputLevel1 | input_level_0+=VSVSStepInputLevel0)+ '</inputs>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSStepInputs}
		public Action getVSVSStepInputsAction_0() { return cVSVSStepInputsAction_0; }
		
		//'<inputs>'
		public Keyword getInputsKeyword_1() { return cInputsKeyword_1; }
		
		//(input_level_3+=VSVSStepInputLevel3 | input_level_2+=VSVSStepInputLevel2 | input_level_1+=VSVSStepInputLevel1 |
		//input_level_0+=VSVSStepInputLevel0)+
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//input_level_3+=VSVSStepInputLevel3
		public Assignment getInput_level_3Assignment_2_0() { return cInput_level_3Assignment_2_0; }
		
		//VSVSStepInputLevel3
		public RuleCall getInput_level_3VSVSStepInputLevel3ParserRuleCall_2_0_0() { return cInput_level_3VSVSStepInputLevel3ParserRuleCall_2_0_0; }
		
		//input_level_2+=VSVSStepInputLevel2
		public Assignment getInput_level_2Assignment_2_1() { return cInput_level_2Assignment_2_1; }
		
		//VSVSStepInputLevel2
		public RuleCall getInput_level_2VSVSStepInputLevel2ParserRuleCall_2_1_0() { return cInput_level_2VSVSStepInputLevel2ParserRuleCall_2_1_0; }
		
		//input_level_1+=VSVSStepInputLevel1
		public Assignment getInput_level_1Assignment_2_2() { return cInput_level_1Assignment_2_2; }
		
		//VSVSStepInputLevel1
		public RuleCall getInput_level_1VSVSStepInputLevel1ParserRuleCall_2_2_0() { return cInput_level_1VSVSStepInputLevel1ParserRuleCall_2_2_0; }
		
		//input_level_0+=VSVSStepInputLevel0
		public Assignment getInput_level_0Assignment_2_3() { return cInput_level_0Assignment_2_3; }
		
		//VSVSStepInputLevel0
		public RuleCall getInput_level_0VSVSStepInputLevel0ParserRuleCall_2_3_0() { return cInput_level_0VSVSStepInputLevel0ParserRuleCall_2_3_0; }
		
		//'</inputs>'
		public Keyword getInputsKeyword_3() { return cInputsKeyword_3; }
	}
	public class VSVSStepOutputsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutputs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutputsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cCheckmodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCheckmodeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCheckmodeVSVSStepCheckmodeEnumRuleCall_2_0 = (RuleCall)cCheckmodeAssignment_2.eContents().get(0);
		private final Keyword cValid_time_interval_valueKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValid_time_interval_valueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValid_time_interval_valueUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cValid_time_interval_valueAssignment_4.eContents().get(0);
		private final Keyword cValid_time_interval_unitKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cValid_time_interval_unitAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cValid_time_interval_unitVSVSStepUnitEnumRuleCall_6_0 = (RuleCall)cValid_time_interval_unitAssignment_6.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Alternatives cAlternatives_8 = (Alternatives)cGroup.eContents().get(8);
		private final Assignment cOutput_level_3Assignment_8_0 = (Assignment)cAlternatives_8.eContents().get(0);
		private final RuleCall cOutput_level_3VSVSStepOutputLevel3ParserRuleCall_8_0_0 = (RuleCall)cOutput_level_3Assignment_8_0.eContents().get(0);
		private final Assignment cOutput_level_2Assignment_8_1 = (Assignment)cAlternatives_8.eContents().get(1);
		private final RuleCall cOutput_level_2VSVSStepOutputLevel2ParserRuleCall_8_1_0 = (RuleCall)cOutput_level_2Assignment_8_1.eContents().get(0);
		private final Assignment cOutput_level_1Assignment_8_2 = (Assignment)cAlternatives_8.eContents().get(2);
		private final RuleCall cOutput_level_1VSVSStepOutputLevel1ParserRuleCall_8_2_0 = (RuleCall)cOutput_level_1Assignment_8_2.eContents().get(0);
		private final Assignment cOutput_level_0Assignment_8_3 = (Assignment)cAlternatives_8.eContents().get(3);
		private final RuleCall cOutput_level_0VSVSStepOutputLevel0ParserRuleCall_8_3_0 = (RuleCall)cOutput_level_0Assignment_8_3.eContents().get(0);
		private final Keyword cOutputsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//VSVSStepOutputs:
		//	'<outputs'
		//	'checkmode=' checkmode=VSVSStepCheckmode
		//	'valid_time_interval_value=' valid_time_interval_value=UINT_STRING
		//	'valid_time_interval_unit=' valid_time_interval_unit=VSVSStepUnit
		//	'>' (output_level_3+=VSVSStepOutputLevel3 | output_level_2+=VSVSStepOutputLevel2 |
		//	output_level_1+=VSVSStepOutputLevel1 | output_level_0+=VSVSStepOutputLevel0)+
		//	'</outputs>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<outputs' 'checkmode=' checkmode=VSVSStepCheckmode 'valid_time_interval_value=' valid_time_interval_value=UINT_STRING
		//'valid_time_interval_unit=' valid_time_interval_unit=VSVSStepUnit '>' (output_level_3+=VSVSStepOutputLevel3 |
		//output_level_2+=VSVSStepOutputLevel2 | output_level_1+=VSVSStepOutputLevel1 | output_level_0+=VSVSStepOutputLevel0)+
		//'</outputs>'
		public Group getGroup() { return cGroup; }
		
		//'<outputs'
		public Keyword getOutputsKeyword_0() { return cOutputsKeyword_0; }
		
		//'checkmode='
		public Keyword getCheckmodeKeyword_1() { return cCheckmodeKeyword_1; }
		
		//checkmode=VSVSStepCheckmode
		public Assignment getCheckmodeAssignment_2() { return cCheckmodeAssignment_2; }
		
		//VSVSStepCheckmode
		public RuleCall getCheckmodeVSVSStepCheckmodeEnumRuleCall_2_0() { return cCheckmodeVSVSStepCheckmodeEnumRuleCall_2_0; }
		
		//'valid_time_interval_value='
		public Keyword getValid_time_interval_valueKeyword_3() { return cValid_time_interval_valueKeyword_3; }
		
		//valid_time_interval_value=UINT_STRING
		public Assignment getValid_time_interval_valueAssignment_4() { return cValid_time_interval_valueAssignment_4; }
		
		//UINT_STRING
		public RuleCall getValid_time_interval_valueUINT_STRINGTerminalRuleCall_4_0() { return cValid_time_interval_valueUINT_STRINGTerminalRuleCall_4_0; }
		
		//'valid_time_interval_unit='
		public Keyword getValid_time_interval_unitKeyword_5() { return cValid_time_interval_unitKeyword_5; }
		
		//valid_time_interval_unit=VSVSStepUnit
		public Assignment getValid_time_interval_unitAssignment_6() { return cValid_time_interval_unitAssignment_6; }
		
		//VSVSStepUnit
		public RuleCall getValid_time_interval_unitVSVSStepUnitEnumRuleCall_6_0() { return cValid_time_interval_unitVSVSStepUnitEnumRuleCall_6_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_7() { return cGreaterThanSignKeyword_7; }
		
		//(output_level_3+=VSVSStepOutputLevel3 | output_level_2+=VSVSStepOutputLevel2 | output_level_1+=VSVSStepOutputLevel1 |
		//output_level_0+=VSVSStepOutputLevel0)+
		public Alternatives getAlternatives_8() { return cAlternatives_8; }
		
		//output_level_3+=VSVSStepOutputLevel3
		public Assignment getOutput_level_3Assignment_8_0() { return cOutput_level_3Assignment_8_0; }
		
		//VSVSStepOutputLevel3
		public RuleCall getOutput_level_3VSVSStepOutputLevel3ParserRuleCall_8_0_0() { return cOutput_level_3VSVSStepOutputLevel3ParserRuleCall_8_0_0; }
		
		//output_level_2+=VSVSStepOutputLevel2
		public Assignment getOutput_level_2Assignment_8_1() { return cOutput_level_2Assignment_8_1; }
		
		//VSVSStepOutputLevel2
		public RuleCall getOutput_level_2VSVSStepOutputLevel2ParserRuleCall_8_1_0() { return cOutput_level_2VSVSStepOutputLevel2ParserRuleCall_8_1_0; }
		
		//output_level_1+=VSVSStepOutputLevel1
		public Assignment getOutput_level_1Assignment_8_2() { return cOutput_level_1Assignment_8_2; }
		
		//VSVSStepOutputLevel1
		public RuleCall getOutput_level_1VSVSStepOutputLevel1ParserRuleCall_8_2_0() { return cOutput_level_1VSVSStepOutputLevel1ParserRuleCall_8_2_0; }
		
		//output_level_0+=VSVSStepOutputLevel0
		public Assignment getOutput_level_0Assignment_8_3() { return cOutput_level_0Assignment_8_3; }
		
		//VSVSStepOutputLevel0
		public RuleCall getOutput_level_0VSVSStepOutputLevel0ParserRuleCall_8_3_0() { return cOutput_level_0VSVSStepOutputLevel0ParserRuleCall_8_3_0; }
		
		//'</outputs>'
		public Keyword getOutputsKeyword_9() { return cOutputsKeyword_9; }
	}
	public class VSVSStepSpecialPacketsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepSpecialPackets");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSStepSpecialPacketsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSpecialPacketsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cEnableAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cEnableVSVSStepEnableParserRuleCall_2_0_0 = (RuleCall)cEnableAssignment_2_0.eContents().get(0);
		private final Assignment cDisableAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cDisableVSVSStepDisableParserRuleCall_2_1_0 = (RuleCall)cDisableAssignment_2_1.eContents().get(0);
		private final Assignment cEnable_printAssignment_2_2 = (Assignment)cAlternatives_2.eContents().get(2);
		private final RuleCall cEnable_printVSVSStepEnablePrintParserRuleCall_2_2_0 = (RuleCall)cEnable_printAssignment_2_2.eContents().get(0);
		private final Assignment cDisable_printAssignment_2_3 = (Assignment)cAlternatives_2.eContents().get(3);
		private final RuleCall cDisable_printVSVSStepDisablePrintParserRuleCall_2_3_0 = (RuleCall)cDisable_printAssignment_2_3.eContents().get(0);
		private final Keyword cSpecialPacketsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSStepSpecialPackets:
		//	{VSVSStepSpecialPackets}
		//	'<specialPackets>' (enable+=VSVSStepEnable | disable+=VSVSStepDisable | enable_print+=VSVSStepEnablePrint |
		//	disable_print+=VSVSStepDisablePrint)+
		//	'</specialPackets>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSStepSpecialPackets} '<specialPackets>' (enable+=VSVSStepEnable | disable+=VSVSStepDisable |
		//enable_print+=VSVSStepEnablePrint | disable_print+=VSVSStepDisablePrint)+ '</specialPackets>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSStepSpecialPackets}
		public Action getVSVSStepSpecialPacketsAction_0() { return cVSVSStepSpecialPacketsAction_0; }
		
		//'<specialPackets>'
		public Keyword getSpecialPacketsKeyword_1() { return cSpecialPacketsKeyword_1; }
		
		//(enable+=VSVSStepEnable | disable+=VSVSStepDisable | enable_print+=VSVSStepEnablePrint |
		//disable_print+=VSVSStepDisablePrint)+
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//enable+=VSVSStepEnable
		public Assignment getEnableAssignment_2_0() { return cEnableAssignment_2_0; }
		
		//VSVSStepEnable
		public RuleCall getEnableVSVSStepEnableParserRuleCall_2_0_0() { return cEnableVSVSStepEnableParserRuleCall_2_0_0; }
		
		//disable+=VSVSStepDisable
		public Assignment getDisableAssignment_2_1() { return cDisableAssignment_2_1; }
		
		//VSVSStepDisable
		public RuleCall getDisableVSVSStepDisableParserRuleCall_2_1_0() { return cDisableVSVSStepDisableParserRuleCall_2_1_0; }
		
		//enable_print+=VSVSStepEnablePrint
		public Assignment getEnable_printAssignment_2_2() { return cEnable_printAssignment_2_2; }
		
		//VSVSStepEnablePrint
		public RuleCall getEnable_printVSVSStepEnablePrintParserRuleCall_2_2_0() { return cEnable_printVSVSStepEnablePrintParserRuleCall_2_2_0; }
		
		//disable_print+=VSVSStepDisablePrint
		public Assignment getDisable_printAssignment_2_3() { return cDisable_printAssignment_2_3; }
		
		//VSVSStepDisablePrint
		public RuleCall getDisable_printVSVSStepDisablePrintParserRuleCall_2_3_0() { return cDisable_printVSVSStepDisablePrintParserRuleCall_2_3_0; }
		
		//'</specialPackets>'
		public Keyword getSpecialPacketsKeyword_3() { return cSpecialPacketsKeyword_3; }
	}
	public class VSVSStepConcurrentStepsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepConcurrentSteps");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConcurrent_stepsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNextStepKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNextStepAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNextStepVSVSStepNextStepParserRuleCall_2_0 = (RuleCall)cNextStepAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cConcurrent_stepAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConcurrent_stepVSVSStepConcurrentStepParserRuleCall_4_0 = (RuleCall)cConcurrent_stepAssignment_4.eContents().get(0);
		private final Keyword cConcurrent_stepsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSStepConcurrentSteps:
		//	'<concurrent_steps'
		//	'nextStep=' nextStep=VSVSStepNextStep
		//	'>'
		//	concurrent_step+=VSVSStepConcurrentStep+
		//	'</concurrent_steps>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<concurrent_steps' 'nextStep=' nextStep=VSVSStepNextStep '>' concurrent_step+=VSVSStepConcurrentStep+
		//'</concurrent_steps>'
		public Group getGroup() { return cGroup; }
		
		//'<concurrent_steps'
		public Keyword getConcurrent_stepsKeyword_0() { return cConcurrent_stepsKeyword_0; }
		
		//'nextStep='
		public Keyword getNextStepKeyword_1() { return cNextStepKeyword_1; }
		
		//nextStep=VSVSStepNextStep
		public Assignment getNextStepAssignment_2() { return cNextStepAssignment_2; }
		
		//VSVSStepNextStep
		public RuleCall getNextStepVSVSStepNextStepParserRuleCall_2_0() { return cNextStepVSVSStepNextStepParserRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//concurrent_step+=VSVSStepConcurrentStep+
		public Assignment getConcurrent_stepAssignment_4() { return cConcurrent_stepAssignment_4; }
		
		//VSVSStepConcurrentStep
		public RuleCall getConcurrent_stepVSVSStepConcurrentStepParserRuleCall_4_0() { return cConcurrent_stepVSVSStepConcurrentStepParserRuleCall_4_0; }
		
		//'</concurrent_steps>'
		public Keyword getConcurrent_stepsKeyword_5() { return cConcurrent_stepsKeyword_5; }
	}
	public class VSVSStepInputLevel3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepInputLevel3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInput_level_3Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIfRefKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIfRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIfRefUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cIfRefAssignment_4.eContents().get(0);
		private final Keyword cDelay_valueKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDelay_valueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDelay_valueUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cDelay_valueAssignment_6.eContents().get(0);
		private final Keyword cDelay_unitKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDelay_unitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDelay_unitVSVSStepUnitEnumRuleCall_8_0 = (RuleCall)cDelay_unitAssignment_8.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cLevel3Keyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cLevel3Assignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final CrossReference cLevel3TMTCIFFormatFormatCrossReference_10_1_0 = (CrossReference)cLevel3Assignment_10_1.eContents().get(0);
		private final RuleCall cLevel3TMTCIFFormatFormatSTRINGTerminalRuleCall_10_1_0_1 = (RuleCall)cLevel3TMTCIFFormatFormatCrossReference_10_1_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_10_2 = (Keyword)cGroup_10.eContents().get(2);
		private final Keyword cApp_to_level3Keyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cApp_to_level3Assignment_12 = (Assignment)cGroup.eContents().get(12);
		private final CrossReference cApp_to_level3TMTCIFExportExportCrossReference_12_0 = (CrossReference)cApp_to_level3Assignment_12.eContents().get(0);
		private final RuleCall cApp_to_level3TMTCIFExportExportSTRINGTerminalRuleCall_12_0_1 = (RuleCall)cApp_to_level3TMTCIFExportExportCrossReference_12_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cLevel2Keyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cFormatKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cLevel2Assignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final CrossReference cLevel2TMTCIFFormatFormatCrossReference_14_2_0 = (CrossReference)cLevel2Assignment_14_2.eContents().get(0);
		private final RuleCall cLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_14_2_0_1 = (RuleCall)cLevel2TMTCIFFormatFormatCrossReference_14_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cLevel3_to_level2Keyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cExportKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cLevel3_to_level2Assignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final CrossReference cLevel3_to_level2TMTCIFExportExportCrossReference_15_2_0 = (CrossReference)cLevel3_to_level2Assignment_15_2.eContents().get(0);
		private final RuleCall cLevel3_to_level2TMTCIFExportExportSTRINGTerminalRuleCall_15_2_0_1 = (RuleCall)cLevel3_to_level2TMTCIFExportExportCrossReference_15_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final Keyword cLevel1Keyword_16_0 = (Keyword)cGroup_16.eContents().get(0);
		private final Keyword cFormatKeyword_16_1 = (Keyword)cGroup_16.eContents().get(1);
		private final Assignment cLevel1Assignment_16_2 = (Assignment)cGroup_16.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_16_2_0 = (CrossReference)cLevel1Assignment_16_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_16_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_16_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_16_3 = (Keyword)cGroup_16.eContents().get(3);
		private final Group cGroup_17 = (Group)cGroup.eContents().get(17);
		private final Keyword cLevel2_to_level1Keyword_17_0 = (Keyword)cGroup_17.eContents().get(0);
		private final Keyword cExportKeyword_17_1 = (Keyword)cGroup_17.eContents().get(1);
		private final Assignment cLevel2_to_level1Assignment_17_2 = (Assignment)cGroup_17.eContents().get(2);
		private final CrossReference cLevel2_to_level1TMTCIFExportExportCrossReference_17_2_0 = (CrossReference)cLevel2_to_level1Assignment_17_2.eContents().get(0);
		private final RuleCall cLevel2_to_level1TMTCIFExportExportSTRINGTerminalRuleCall_17_2_0_1 = (RuleCall)cLevel2_to_level1TMTCIFExportExportCrossReference_17_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_17_3 = (Keyword)cGroup_17.eContents().get(3);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cLevel0Keyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cFormatKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cLevel0Assignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_18_2_0 = (CrossReference)cLevel0Assignment_18_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_18_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Group cGroup_19 = (Group)cGroup.eContents().get(19);
		private final Keyword cLevel1_to_level0Keyword_19_0 = (Keyword)cGroup_19.eContents().get(0);
		private final Keyword cExportKeyword_19_1 = (Keyword)cGroup_19.eContents().get(1);
		private final Assignment cLevel1_to_level0Assignment_19_2 = (Assignment)cGroup_19.eContents().get(2);
		private final CrossReference cLevel1_to_level0TMTCIFExportExportCrossReference_19_2_0 = (CrossReference)cLevel1_to_level0Assignment_19_2.eContents().get(0);
		private final RuleCall cLevel1_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_19_2_0_1 = (RuleCall)cLevel1_to_level0TMTCIFExportExportCrossReference_19_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_19_3 = (Keyword)cGroup_19.eContents().get(3);
		private final Keyword cInput_level_3Keyword_20 = (Keyword)cGroup.eContents().get(20);
		
		//VSVSStepInputLevel3:
		//	'<input_level_3'
		//	'name=' name=STRING
		//	'ifRef=' ifRef=UINT_STRING
		//	'delay_value=' delay_value=UINT_STRING
		//	'delay_unit=' delay_unit=VSVSStepUnit
		//	'>' ('<level3' level3=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	'<app_to_level3' app_to_level3=[export::TMTCIFExportExport|STRING] '/>' ('<level2' 'format='
		//	level2=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level3_to_level2' 'export='
		//	level3_to_level2=[export::TMTCIFExportExport|STRING] '/>')? ('<level1' 'format='
		//	level1=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level2_to_level1' 'export='
		//	level2_to_level1=[export::TMTCIFExportExport|STRING] '/>')? ('<level0' 'format='
		//	level0=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level1_to_level0' 'export='
		//	level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')?
		//	'</input_level_3>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<input_level_3' 'name=' name=STRING 'ifRef=' ifRef=UINT_STRING 'delay_value=' delay_value=UINT_STRING 'delay_unit='
		//delay_unit=VSVSStepUnit '>' ('<level3' level3=[format::TMTCIFFormatFormat|STRING] '/>')? '<app_to_level3'
		//app_to_level3=[export::TMTCIFExportExport|STRING] '/>' ('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING]
		//'/>')? ('<level3_to_level2' 'export=' level3_to_level2=[export::TMTCIFExportExport|STRING] '/>')? ('<level1' 'format='
		//level1=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level2_to_level1' 'export='
		//level2_to_level1=[export::TMTCIFExportExport|STRING] '/>')? ('<level0' 'format='
		//level0=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level1_to_level0' 'export='
		//level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')? '</input_level_3>'
		public Group getGroup() { return cGroup; }
		
		//'<input_level_3'
		public Keyword getInput_level_3Keyword_0() { return cInput_level_3Keyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'ifRef='
		public Keyword getIfRefKeyword_3() { return cIfRefKeyword_3; }
		
		//ifRef=UINT_STRING
		public Assignment getIfRefAssignment_4() { return cIfRefAssignment_4; }
		
		//UINT_STRING
		public RuleCall getIfRefUINT_STRINGTerminalRuleCall_4_0() { return cIfRefUINT_STRINGTerminalRuleCall_4_0; }
		
		//'delay_value='
		public Keyword getDelay_valueKeyword_5() { return cDelay_valueKeyword_5; }
		
		//delay_value=UINT_STRING
		public Assignment getDelay_valueAssignment_6() { return cDelay_valueAssignment_6; }
		
		//UINT_STRING
		public RuleCall getDelay_valueUINT_STRINGTerminalRuleCall_6_0() { return cDelay_valueUINT_STRINGTerminalRuleCall_6_0; }
		
		//'delay_unit='
		public Keyword getDelay_unitKeyword_7() { return cDelay_unitKeyword_7; }
		
		//delay_unit=VSVSStepUnit
		public Assignment getDelay_unitAssignment_8() { return cDelay_unitAssignment_8; }
		
		//VSVSStepUnit
		public RuleCall getDelay_unitVSVSStepUnitEnumRuleCall_8_0() { return cDelay_unitVSVSStepUnitEnumRuleCall_8_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_9() { return cGreaterThanSignKeyword_9; }
		
		//('<level3' level3=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'<level3'
		public Keyword getLevel3Keyword_10_0() { return cLevel3Keyword_10_0; }
		
		//level3=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel3Assignment_10_1() { return cLevel3Assignment_10_1; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel3TMTCIFFormatFormatCrossReference_10_1_0() { return cLevel3TMTCIFFormatFormatCrossReference_10_1_0; }
		
		//STRING
		public RuleCall getLevel3TMTCIFFormatFormatSTRINGTerminalRuleCall_10_1_0_1() { return cLevel3TMTCIFFormatFormatSTRINGTerminalRuleCall_10_1_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_10_2() { return cSolidusGreaterThanSignKeyword_10_2; }
		
		//'<app_to_level3'
		public Keyword getApp_to_level3Keyword_11() { return cApp_to_level3Keyword_11; }
		
		//app_to_level3=[export::TMTCIFExportExport|STRING]
		public Assignment getApp_to_level3Assignment_12() { return cApp_to_level3Assignment_12; }
		
		//[export::TMTCIFExportExport|STRING]
		public CrossReference getApp_to_level3TMTCIFExportExportCrossReference_12_0() { return cApp_to_level3TMTCIFExportExportCrossReference_12_0; }
		
		//STRING
		public RuleCall getApp_to_level3TMTCIFExportExportSTRINGTerminalRuleCall_12_0_1() { return cApp_to_level3TMTCIFExportExportSTRINGTerminalRuleCall_12_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_13() { return cSolidusGreaterThanSignKeyword_13; }
		
		//('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'<level2'
		public Keyword getLevel2Keyword_14_0() { return cLevel2Keyword_14_0; }
		
		//'format='
		public Keyword getFormatKeyword_14_1() { return cFormatKeyword_14_1; }
		
		//level2=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel2Assignment_14_2() { return cLevel2Assignment_14_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel2TMTCIFFormatFormatCrossReference_14_2_0() { return cLevel2TMTCIFFormatFormatCrossReference_14_2_0; }
		
		//STRING
		public RuleCall getLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_14_2_0_1() { return cLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_14_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_14_3() { return cSolidusGreaterThanSignKeyword_14_3; }
		
		//('<level3_to_level2' 'export=' level3_to_level2=[export::TMTCIFExportExport|STRING] '/>')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'<level3_to_level2'
		public Keyword getLevel3_to_level2Keyword_15_0() { return cLevel3_to_level2Keyword_15_0; }
		
		//'export='
		public Keyword getExportKeyword_15_1() { return cExportKeyword_15_1; }
		
		//level3_to_level2=[export::TMTCIFExportExport|STRING]
		public Assignment getLevel3_to_level2Assignment_15_2() { return cLevel3_to_level2Assignment_15_2; }
		
		//[export::TMTCIFExportExport|STRING]
		public CrossReference getLevel3_to_level2TMTCIFExportExportCrossReference_15_2_0() { return cLevel3_to_level2TMTCIFExportExportCrossReference_15_2_0; }
		
		//STRING
		public RuleCall getLevel3_to_level2TMTCIFExportExportSTRINGTerminalRuleCall_15_2_0_1() { return cLevel3_to_level2TMTCIFExportExportSTRINGTerminalRuleCall_15_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_15_3() { return cSolidusGreaterThanSignKeyword_15_3; }
		
		//('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_16() { return cGroup_16; }
		
		//'<level1'
		public Keyword getLevel1Keyword_16_0() { return cLevel1Keyword_16_0; }
		
		//'format='
		public Keyword getFormatKeyword_16_1() { return cFormatKeyword_16_1; }
		
		//level1=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel1Assignment_16_2() { return cLevel1Assignment_16_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_16_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_16_2_0; }
		
		//STRING
		public RuleCall getLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_16_2_0_1() { return cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_16_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_16_3() { return cSolidusGreaterThanSignKeyword_16_3; }
		
		//('<level2_to_level1' 'export=' level2_to_level1=[export::TMTCIFExportExport|STRING] '/>')?
		public Group getGroup_17() { return cGroup_17; }
		
		//'<level2_to_level1'
		public Keyword getLevel2_to_level1Keyword_17_0() { return cLevel2_to_level1Keyword_17_0; }
		
		//'export='
		public Keyword getExportKeyword_17_1() { return cExportKeyword_17_1; }
		
		//level2_to_level1=[export::TMTCIFExportExport|STRING]
		public Assignment getLevel2_to_level1Assignment_17_2() { return cLevel2_to_level1Assignment_17_2; }
		
		//[export::TMTCIFExportExport|STRING]
		public CrossReference getLevel2_to_level1TMTCIFExportExportCrossReference_17_2_0() { return cLevel2_to_level1TMTCIFExportExportCrossReference_17_2_0; }
		
		//STRING
		public RuleCall getLevel2_to_level1TMTCIFExportExportSTRINGTerminalRuleCall_17_2_0_1() { return cLevel2_to_level1TMTCIFExportExportSTRINGTerminalRuleCall_17_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_17_3() { return cSolidusGreaterThanSignKeyword_17_3; }
		
		//('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'<level0'
		public Keyword getLevel0Keyword_18_0() { return cLevel0Keyword_18_0; }
		
		//'format='
		public Keyword getFormatKeyword_18_1() { return cFormatKeyword_18_1; }
		
		//level0=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel0Assignment_18_2() { return cLevel0Assignment_18_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_18_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_18_2_0; }
		
		//STRING
		public RuleCall getLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_18_2_0_1() { return cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_18_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_18_3() { return cSolidusGreaterThanSignKeyword_18_3; }
		
		//('<level1_to_level0' 'export=' level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')?
		public Group getGroup_19() { return cGroup_19; }
		
		//'<level1_to_level0'
		public Keyword getLevel1_to_level0Keyword_19_0() { return cLevel1_to_level0Keyword_19_0; }
		
		//'export='
		public Keyword getExportKeyword_19_1() { return cExportKeyword_19_1; }
		
		//level1_to_level0=[export::TMTCIFExportExport|STRING]
		public Assignment getLevel1_to_level0Assignment_19_2() { return cLevel1_to_level0Assignment_19_2; }
		
		//[export::TMTCIFExportExport|STRING]
		public CrossReference getLevel1_to_level0TMTCIFExportExportCrossReference_19_2_0() { return cLevel1_to_level0TMTCIFExportExportCrossReference_19_2_0; }
		
		//STRING
		public RuleCall getLevel1_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_19_2_0_1() { return cLevel1_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_19_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_19_3() { return cSolidusGreaterThanSignKeyword_19_3; }
		
		//'</input_level_3>'
		public Keyword getInput_level_3Keyword_20() { return cInput_level_3Keyword_20; }
	}
	public class VSVSStepInputLevel2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepInputLevel2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInput_level_2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIfRefKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIfRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIfRefUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cIfRefAssignment_4.eContents().get(0);
		private final Keyword cDelay_valueKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDelay_valueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDelay_valueUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cDelay_valueAssignment_6.eContents().get(0);
		private final Keyword cDelay_unitKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDelay_unitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDelay_unitVSVSStepUnitEnumRuleCall_8_0 = (RuleCall)cDelay_unitAssignment_8.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cLevel2Keyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cFormatKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cLevel2Assignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final CrossReference cLevel2TMTCIFFormatFormatCrossReference_10_2_0 = (CrossReference)cLevel2Assignment_10_2.eContents().get(0);
		private final RuleCall cLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_10_2_0_1 = (RuleCall)cLevel2TMTCIFFormatFormatCrossReference_10_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Keyword cApp_to_level2Keyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cExportKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cApp_to_level2Assignment_13 = (Assignment)cGroup.eContents().get(13);
		private final CrossReference cApp_to_level2TMTCIFExportExportCrossReference_13_0 = (CrossReference)cApp_to_level2Assignment_13.eContents().get(0);
		private final RuleCall cApp_to_level2TMTCIFExportExportSTRINGTerminalRuleCall_13_0_1 = (RuleCall)cApp_to_level2TMTCIFExportExportCrossReference_13_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cLevel1Keyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cFormatKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cLevel1Assignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_15_2_0 = (CrossReference)cLevel1Assignment_15_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_15_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_15_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final Keyword cLevel2_to_level1Keyword_16_0 = (Keyword)cGroup_16.eContents().get(0);
		private final Keyword cExportKeyword_16_1 = (Keyword)cGroup_16.eContents().get(1);
		private final Assignment cLevel2_to_level1Assignment_16_2 = (Assignment)cGroup_16.eContents().get(2);
		private final CrossReference cLevel2_to_level1TMTCIFExportExportCrossReference_16_2_0 = (CrossReference)cLevel2_to_level1Assignment_16_2.eContents().get(0);
		private final RuleCall cLevel2_to_level1TMTCIFExportExportSTRINGTerminalRuleCall_16_2_0_1 = (RuleCall)cLevel2_to_level1TMTCIFExportExportCrossReference_16_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_16_3 = (Keyword)cGroup_16.eContents().get(3);
		private final Group cGroup_17 = (Group)cGroup.eContents().get(17);
		private final Keyword cLevel0Keyword_17_0 = (Keyword)cGroup_17.eContents().get(0);
		private final Keyword cFormatKeyword_17_1 = (Keyword)cGroup_17.eContents().get(1);
		private final Assignment cLevel0Assignment_17_2 = (Assignment)cGroup_17.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_17_2_0 = (CrossReference)cLevel0Assignment_17_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_17_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_17_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_17_3 = (Keyword)cGroup_17.eContents().get(3);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cLevel1_to_level0Keyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cExportKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cLevel1_to_level0Assignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cLevel1_to_level0TMTCIFExportExportCrossReference_18_2_0 = (CrossReference)cLevel1_to_level0Assignment_18_2.eContents().get(0);
		private final RuleCall cLevel1_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_18_2_0_1 = (RuleCall)cLevel1_to_level0TMTCIFExportExportCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Keyword cInput_level_2Keyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//VSVSStepInputLevel2:
		//	'<input_level_2'
		//	'name=' name=STRING
		//	'ifRef=' ifRef=UINT_STRING
		//	'delay_value=' delay_value=UINT_STRING
		//	'delay_unit=' delay_unit=VSVSStepUnit
		//	'>' ('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	'<app_to_level2' 'export=' app_to_level2=[export::TMTCIFExportExport|STRING] '/>' ('<level1' 'format='
		//	level1=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level2_to_level1' 'export='
		//	level2_to_level1=[export::TMTCIFExportExport|STRING] '/>')? ('<level0' 'format='
		//	level0=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level1_to_level0' 'export='
		//	level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')?
		//	'</input_level_2>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<input_level_2' 'name=' name=STRING 'ifRef=' ifRef=UINT_STRING 'delay_value=' delay_value=UINT_STRING 'delay_unit='
		//delay_unit=VSVSStepUnit '>' ('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')? '<app_to_level2'
		//'export=' app_to_level2=[export::TMTCIFExportExport|STRING] '/>' ('<level1' 'format='
		//level1=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level2_to_level1' 'export='
		//level2_to_level1=[export::TMTCIFExportExport|STRING] '/>')? ('<level0' 'format='
		//level0=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level1_to_level0' 'export='
		//level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')? '</input_level_2>'
		public Group getGroup() { return cGroup; }
		
		//'<input_level_2'
		public Keyword getInput_level_2Keyword_0() { return cInput_level_2Keyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'ifRef='
		public Keyword getIfRefKeyword_3() { return cIfRefKeyword_3; }
		
		//ifRef=UINT_STRING
		public Assignment getIfRefAssignment_4() { return cIfRefAssignment_4; }
		
		//UINT_STRING
		public RuleCall getIfRefUINT_STRINGTerminalRuleCall_4_0() { return cIfRefUINT_STRINGTerminalRuleCall_4_0; }
		
		//'delay_value='
		public Keyword getDelay_valueKeyword_5() { return cDelay_valueKeyword_5; }
		
		//delay_value=UINT_STRING
		public Assignment getDelay_valueAssignment_6() { return cDelay_valueAssignment_6; }
		
		//UINT_STRING
		public RuleCall getDelay_valueUINT_STRINGTerminalRuleCall_6_0() { return cDelay_valueUINT_STRINGTerminalRuleCall_6_0; }
		
		//'delay_unit='
		public Keyword getDelay_unitKeyword_7() { return cDelay_unitKeyword_7; }
		
		//delay_unit=VSVSStepUnit
		public Assignment getDelay_unitAssignment_8() { return cDelay_unitAssignment_8; }
		
		//VSVSStepUnit
		public RuleCall getDelay_unitVSVSStepUnitEnumRuleCall_8_0() { return cDelay_unitVSVSStepUnitEnumRuleCall_8_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_9() { return cGreaterThanSignKeyword_9; }
		
		//('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'<level2'
		public Keyword getLevel2Keyword_10_0() { return cLevel2Keyword_10_0; }
		
		//'format='
		public Keyword getFormatKeyword_10_1() { return cFormatKeyword_10_1; }
		
		//level2=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel2Assignment_10_2() { return cLevel2Assignment_10_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel2TMTCIFFormatFormatCrossReference_10_2_0() { return cLevel2TMTCIFFormatFormatCrossReference_10_2_0; }
		
		//STRING
		public RuleCall getLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_10_2_0_1() { return cLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_10_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_10_3() { return cSolidusGreaterThanSignKeyword_10_3; }
		
		//'<app_to_level2'
		public Keyword getApp_to_level2Keyword_11() { return cApp_to_level2Keyword_11; }
		
		//'export='
		public Keyword getExportKeyword_12() { return cExportKeyword_12; }
		
		//app_to_level2=[export::TMTCIFExportExport|STRING]
		public Assignment getApp_to_level2Assignment_13() { return cApp_to_level2Assignment_13; }
		
		//[export::TMTCIFExportExport|STRING]
		public CrossReference getApp_to_level2TMTCIFExportExportCrossReference_13_0() { return cApp_to_level2TMTCIFExportExportCrossReference_13_0; }
		
		//STRING
		public RuleCall getApp_to_level2TMTCIFExportExportSTRINGTerminalRuleCall_13_0_1() { return cApp_to_level2TMTCIFExportExportSTRINGTerminalRuleCall_13_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_14() { return cSolidusGreaterThanSignKeyword_14; }
		
		//('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'<level1'
		public Keyword getLevel1Keyword_15_0() { return cLevel1Keyword_15_0; }
		
		//'format='
		public Keyword getFormatKeyword_15_1() { return cFormatKeyword_15_1; }
		
		//level1=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel1Assignment_15_2() { return cLevel1Assignment_15_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_15_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_15_2_0; }
		
		//STRING
		public RuleCall getLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_15_2_0_1() { return cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_15_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_15_3() { return cSolidusGreaterThanSignKeyword_15_3; }
		
		//('<level2_to_level1' 'export=' level2_to_level1=[export::TMTCIFExportExport|STRING] '/>')?
		public Group getGroup_16() { return cGroup_16; }
		
		//'<level2_to_level1'
		public Keyword getLevel2_to_level1Keyword_16_0() { return cLevel2_to_level1Keyword_16_0; }
		
		//'export='
		public Keyword getExportKeyword_16_1() { return cExportKeyword_16_1; }
		
		//level2_to_level1=[export::TMTCIFExportExport|STRING]
		public Assignment getLevel2_to_level1Assignment_16_2() { return cLevel2_to_level1Assignment_16_2; }
		
		//[export::TMTCIFExportExport|STRING]
		public CrossReference getLevel2_to_level1TMTCIFExportExportCrossReference_16_2_0() { return cLevel2_to_level1TMTCIFExportExportCrossReference_16_2_0; }
		
		//STRING
		public RuleCall getLevel2_to_level1TMTCIFExportExportSTRINGTerminalRuleCall_16_2_0_1() { return cLevel2_to_level1TMTCIFExportExportSTRINGTerminalRuleCall_16_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_16_3() { return cSolidusGreaterThanSignKeyword_16_3; }
		
		//('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_17() { return cGroup_17; }
		
		//'<level0'
		public Keyword getLevel0Keyword_17_0() { return cLevel0Keyword_17_0; }
		
		//'format='
		public Keyword getFormatKeyword_17_1() { return cFormatKeyword_17_1; }
		
		//level0=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel0Assignment_17_2() { return cLevel0Assignment_17_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_17_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_17_2_0; }
		
		//STRING
		public RuleCall getLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_17_2_0_1() { return cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_17_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_17_3() { return cSolidusGreaterThanSignKeyword_17_3; }
		
		//('<level1_to_level0' 'export=' level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'<level1_to_level0'
		public Keyword getLevel1_to_level0Keyword_18_0() { return cLevel1_to_level0Keyword_18_0; }
		
		//'export='
		public Keyword getExportKeyword_18_1() { return cExportKeyword_18_1; }
		
		//level1_to_level0=[export::TMTCIFExportExport|STRING]
		public Assignment getLevel1_to_level0Assignment_18_2() { return cLevel1_to_level0Assignment_18_2; }
		
		//[export::TMTCIFExportExport|STRING]
		public CrossReference getLevel1_to_level0TMTCIFExportExportCrossReference_18_2_0() { return cLevel1_to_level0TMTCIFExportExportCrossReference_18_2_0; }
		
		//STRING
		public RuleCall getLevel1_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_18_2_0_1() { return cLevel1_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_18_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_18_3() { return cSolidusGreaterThanSignKeyword_18_3; }
		
		//'</input_level_2>'
		public Keyword getInput_level_2Keyword_19() { return cInput_level_2Keyword_19; }
	}
	public class VSVSStepInputLevel1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepInputLevel1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInput_level_1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIfRefKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIfRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIfRefUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cIfRefAssignment_4.eContents().get(0);
		private final Keyword cDelay_valueKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDelay_valueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDelay_valueUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cDelay_valueAssignment_6.eContents().get(0);
		private final Keyword cDelay_unitKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDelay_unitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDelay_unitVSVSStepUnitEnumRuleCall_8_0 = (RuleCall)cDelay_unitAssignment_8.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cLevel1Keyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cFormatKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cLevel1Assignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_10_2_0 = (CrossReference)cLevel1Assignment_10_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_10_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_10_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Keyword cApp_to_level1Keyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cExportKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cApp_to_level1Assignment_13 = (Assignment)cGroup.eContents().get(13);
		private final CrossReference cApp_to_level1TMTCIFExportExportCrossReference_13_0 = (CrossReference)cApp_to_level1Assignment_13.eContents().get(0);
		private final RuleCall cApp_to_level1TMTCIFExportExportSTRINGTerminalRuleCall_13_0_1 = (RuleCall)cApp_to_level1TMTCIFExportExportCrossReference_13_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cLevel0Keyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cFormatKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cLevel0Assignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_15_2_0 = (CrossReference)cLevel0Assignment_15_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_15_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_15_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final Keyword cLevel1_to_level0Keyword_16_0 = (Keyword)cGroup_16.eContents().get(0);
		private final Keyword cExportKeyword_16_1 = (Keyword)cGroup_16.eContents().get(1);
		private final Assignment cLevel1_to_level0Assignment_16_2 = (Assignment)cGroup_16.eContents().get(2);
		private final CrossReference cLevel1_to_level0TMTCIFExportExportCrossReference_16_2_0 = (CrossReference)cLevel1_to_level0Assignment_16_2.eContents().get(0);
		private final RuleCall cLevel1_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_16_2_0_1 = (RuleCall)cLevel1_to_level0TMTCIFExportExportCrossReference_16_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_16_3 = (Keyword)cGroup_16.eContents().get(3);
		private final Keyword cInput_level_1Keyword_17 = (Keyword)cGroup.eContents().get(17);
		
		//VSVSStepInputLevel1:
		//	'<input_level_1'
		//	'name=' name=STRING
		//	'ifRef=' ifRef=UINT_STRING
		//	'delay_value=' delay_value=UINT_STRING
		//	'delay_unit=' delay_unit=VSVSStepUnit
		//	'>' ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	'<app_to_level1' 'export=' app_to_level1=[export::TMTCIFExportExport|STRING] '/>' ('<level0' 'format='
		//	level0=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level1_to_level0' 'export='
		//	level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')?
		//	'</input_level_1>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<input_level_1' 'name=' name=STRING 'ifRef=' ifRef=UINT_STRING 'delay_value=' delay_value=UINT_STRING 'delay_unit='
		//delay_unit=VSVSStepUnit '>' ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')? '<app_to_level1'
		//'export=' app_to_level1=[export::TMTCIFExportExport|STRING] '/>' ('<level0' 'format='
		//level0=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level1_to_level0' 'export='
		//level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')? '</input_level_1>'
		public Group getGroup() { return cGroup; }
		
		//'<input_level_1'
		public Keyword getInput_level_1Keyword_0() { return cInput_level_1Keyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'ifRef='
		public Keyword getIfRefKeyword_3() { return cIfRefKeyword_3; }
		
		//ifRef=UINT_STRING
		public Assignment getIfRefAssignment_4() { return cIfRefAssignment_4; }
		
		//UINT_STRING
		public RuleCall getIfRefUINT_STRINGTerminalRuleCall_4_0() { return cIfRefUINT_STRINGTerminalRuleCall_4_0; }
		
		//'delay_value='
		public Keyword getDelay_valueKeyword_5() { return cDelay_valueKeyword_5; }
		
		//delay_value=UINT_STRING
		public Assignment getDelay_valueAssignment_6() { return cDelay_valueAssignment_6; }
		
		//UINT_STRING
		public RuleCall getDelay_valueUINT_STRINGTerminalRuleCall_6_0() { return cDelay_valueUINT_STRINGTerminalRuleCall_6_0; }
		
		//'delay_unit='
		public Keyword getDelay_unitKeyword_7() { return cDelay_unitKeyword_7; }
		
		//delay_unit=VSVSStepUnit
		public Assignment getDelay_unitAssignment_8() { return cDelay_unitAssignment_8; }
		
		//VSVSStepUnit
		public RuleCall getDelay_unitVSVSStepUnitEnumRuleCall_8_0() { return cDelay_unitVSVSStepUnitEnumRuleCall_8_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_9() { return cGreaterThanSignKeyword_9; }
		
		//('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'<level1'
		public Keyword getLevel1Keyword_10_0() { return cLevel1Keyword_10_0; }
		
		//'format='
		public Keyword getFormatKeyword_10_1() { return cFormatKeyword_10_1; }
		
		//level1=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel1Assignment_10_2() { return cLevel1Assignment_10_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_10_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_10_2_0; }
		
		//STRING
		public RuleCall getLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_10_2_0_1() { return cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_10_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_10_3() { return cSolidusGreaterThanSignKeyword_10_3; }
		
		//'<app_to_level1'
		public Keyword getApp_to_level1Keyword_11() { return cApp_to_level1Keyword_11; }
		
		//'export='
		public Keyword getExportKeyword_12() { return cExportKeyword_12; }
		
		//app_to_level1=[export::TMTCIFExportExport|STRING]
		public Assignment getApp_to_level1Assignment_13() { return cApp_to_level1Assignment_13; }
		
		//[export::TMTCIFExportExport|STRING]
		public CrossReference getApp_to_level1TMTCIFExportExportCrossReference_13_0() { return cApp_to_level1TMTCIFExportExportCrossReference_13_0; }
		
		//STRING
		public RuleCall getApp_to_level1TMTCIFExportExportSTRINGTerminalRuleCall_13_0_1() { return cApp_to_level1TMTCIFExportExportSTRINGTerminalRuleCall_13_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_14() { return cSolidusGreaterThanSignKeyword_14; }
		
		//('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'<level0'
		public Keyword getLevel0Keyword_15_0() { return cLevel0Keyword_15_0; }
		
		//'format='
		public Keyword getFormatKeyword_15_1() { return cFormatKeyword_15_1; }
		
		//level0=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel0Assignment_15_2() { return cLevel0Assignment_15_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_15_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_15_2_0; }
		
		//STRING
		public RuleCall getLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_15_2_0_1() { return cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_15_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_15_3() { return cSolidusGreaterThanSignKeyword_15_3; }
		
		//('<level1_to_level0' 'export=' level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')?
		public Group getGroup_16() { return cGroup_16; }
		
		//'<level1_to_level0'
		public Keyword getLevel1_to_level0Keyword_16_0() { return cLevel1_to_level0Keyword_16_0; }
		
		//'export='
		public Keyword getExportKeyword_16_1() { return cExportKeyword_16_1; }
		
		//level1_to_level0=[export::TMTCIFExportExport|STRING]
		public Assignment getLevel1_to_level0Assignment_16_2() { return cLevel1_to_level0Assignment_16_2; }
		
		//[export::TMTCIFExportExport|STRING]
		public CrossReference getLevel1_to_level0TMTCIFExportExportCrossReference_16_2_0() { return cLevel1_to_level0TMTCIFExportExportCrossReference_16_2_0; }
		
		//STRING
		public RuleCall getLevel1_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_16_2_0_1() { return cLevel1_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_16_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_16_3() { return cSolidusGreaterThanSignKeyword_16_3; }
		
		//'</input_level_1>'
		public Keyword getInput_level_1Keyword_17() { return cInput_level_1Keyword_17; }
	}
	public class VSVSStepInputLevel0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepInputLevel0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInput_level_0Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIfRefKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIfRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIfRefUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cIfRefAssignment_4.eContents().get(0);
		private final Keyword cDelay_valueKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDelay_valueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDelay_valueUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cDelay_valueAssignment_6.eContents().get(0);
		private final Keyword cDelay_unitKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDelay_unitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDelay_unitVSVSStepUnitEnumRuleCall_8_0 = (RuleCall)cDelay_unitAssignment_8.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cLevel0Keyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cFormatKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cLevel0Assignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_10_2_0 = (CrossReference)cLevel0Assignment_10_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_10_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_10_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Keyword cApp_to_level0Keyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cExportKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cApp_to_level0Assignment_13 = (Assignment)cGroup.eContents().get(13);
		private final CrossReference cApp_to_level0TMTCIFExportExportCrossReference_13_0 = (CrossReference)cApp_to_level0Assignment_13.eContents().get(0);
		private final RuleCall cApp_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_13_0_1 = (RuleCall)cApp_to_level0TMTCIFExportExportCrossReference_13_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cInput_level_0Keyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//VSVSStepInputLevel0:
		//	'<input_level_0'
		//	'name=' name=STRING
		//	'ifRef=' ifRef=UINT_STRING
		//	'delay_value=' delay_value=UINT_STRING
		//	'delay_unit=' delay_unit=VSVSStepUnit
		//	'>' ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	'<app_to_level0' 'export=' app_to_level0=[export::TMTCIFExportExport|STRING] '/>'
		//	'</input_level_0>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<input_level_0' 'name=' name=STRING 'ifRef=' ifRef=UINT_STRING 'delay_value=' delay_value=UINT_STRING 'delay_unit='
		//delay_unit=VSVSStepUnit '>' ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')? '<app_to_level0'
		//'export=' app_to_level0=[export::TMTCIFExportExport|STRING] '/>' '</input_level_0>'
		public Group getGroup() { return cGroup; }
		
		//'<input_level_0'
		public Keyword getInput_level_0Keyword_0() { return cInput_level_0Keyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'ifRef='
		public Keyword getIfRefKeyword_3() { return cIfRefKeyword_3; }
		
		//ifRef=UINT_STRING
		public Assignment getIfRefAssignment_4() { return cIfRefAssignment_4; }
		
		//UINT_STRING
		public RuleCall getIfRefUINT_STRINGTerminalRuleCall_4_0() { return cIfRefUINT_STRINGTerminalRuleCall_4_0; }
		
		//'delay_value='
		public Keyword getDelay_valueKeyword_5() { return cDelay_valueKeyword_5; }
		
		//delay_value=UINT_STRING
		public Assignment getDelay_valueAssignment_6() { return cDelay_valueAssignment_6; }
		
		//UINT_STRING
		public RuleCall getDelay_valueUINT_STRINGTerminalRuleCall_6_0() { return cDelay_valueUINT_STRINGTerminalRuleCall_6_0; }
		
		//'delay_unit='
		public Keyword getDelay_unitKeyword_7() { return cDelay_unitKeyword_7; }
		
		//delay_unit=VSVSStepUnit
		public Assignment getDelay_unitAssignment_8() { return cDelay_unitAssignment_8; }
		
		//VSVSStepUnit
		public RuleCall getDelay_unitVSVSStepUnitEnumRuleCall_8_0() { return cDelay_unitVSVSStepUnitEnumRuleCall_8_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_9() { return cGreaterThanSignKeyword_9; }
		
		//('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'<level0'
		public Keyword getLevel0Keyword_10_0() { return cLevel0Keyword_10_0; }
		
		//'format='
		public Keyword getFormatKeyword_10_1() { return cFormatKeyword_10_1; }
		
		//level0=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel0Assignment_10_2() { return cLevel0Assignment_10_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_10_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_10_2_0; }
		
		//STRING
		public RuleCall getLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_10_2_0_1() { return cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_10_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_10_3() { return cSolidusGreaterThanSignKeyword_10_3; }
		
		//'<app_to_level0'
		public Keyword getApp_to_level0Keyword_11() { return cApp_to_level0Keyword_11; }
		
		//'export='
		public Keyword getExportKeyword_12() { return cExportKeyword_12; }
		
		//app_to_level0=[export::TMTCIFExportExport|STRING]
		public Assignment getApp_to_level0Assignment_13() { return cApp_to_level0Assignment_13; }
		
		//[export::TMTCIFExportExport|STRING]
		public CrossReference getApp_to_level0TMTCIFExportExportCrossReference_13_0() { return cApp_to_level0TMTCIFExportExportCrossReference_13_0; }
		
		//STRING
		public RuleCall getApp_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_13_0_1() { return cApp_to_level0TMTCIFExportExportSTRINGTerminalRuleCall_13_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_14() { return cSolidusGreaterThanSignKeyword_14; }
		
		//'</input_level_0>'
		public Keyword getInput_level_0Keyword_15() { return cInput_level_0Keyword_15; }
	}
	public class VSVSStepOutputLevel3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutputLevel3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutput_level_3Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIdKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cIfRefKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIfRefAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIfRefUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cIfRefAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cOptionalKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cOptionalAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cOptionalUINT_STRINGTerminalRuleCall_7_1_0 = (RuleCall)cOptionalAssignment_7_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cLevel3Keyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cFormatKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cLevel3Assignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final CrossReference cLevel3TMTCIFFormatFormatCrossReference_9_2_0 = (CrossReference)cLevel3Assignment_9_2.eContents().get(0);
		private final RuleCall cLevel3TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1 = (RuleCall)cLevel3TMTCIFFormatFormatCrossReference_9_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		private final Assignment cLevel3_filterAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cLevel3_filterVSVSStepLevel3FilterParserRuleCall_10_0 = (RuleCall)cLevel3_filterAssignment_10.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cLevel2Keyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cFormatKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cLevel2Assignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final CrossReference cLevel2TMTCIFFormatFormatCrossReference_11_2_0 = (CrossReference)cLevel2Assignment_11_2.eContents().get(0);
		private final RuleCall cLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_11_2_0_1 = (RuleCall)cLevel2TMTCIFFormatFormatCrossReference_11_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cLevel3_from_level2Keyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cImportKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cLevel3_from_level2Assignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final CrossReference cLevel3_from_level2TMTCIFImportImportCrossReference_12_2_0 = (CrossReference)cLevel3_from_level2Assignment_12_2.eContents().get(0);
		private final RuleCall cLevel3_from_level2TMTCIFImportImportSTRINGTerminalRuleCall_12_2_0_1 = (RuleCall)cLevel3_from_level2TMTCIFImportImportCrossReference_12_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Assignment cLevel2_filterAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cLevel2_filterVSVSStepLevel2FilterParserRuleCall_13_0 = (RuleCall)cLevel2_filterAssignment_13.eContents().get(0);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cLevel1Keyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cFormatKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cLevel1Assignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_14_2_0 = (CrossReference)cLevel1Assignment_14_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_14_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_14_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cLevel2_from_level1Keyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cImportKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cLevel2_from_level1Assignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final CrossReference cLevel2_from_level1TMTCIFImportImportCrossReference_15_2_0 = (CrossReference)cLevel2_from_level1Assignment_15_2.eContents().get(0);
		private final RuleCall cLevel2_from_level1TMTCIFImportImportSTRINGTerminalRuleCall_15_2_0_1 = (RuleCall)cLevel2_from_level1TMTCIFImportImportCrossReference_15_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Assignment cLevel1_filterAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cLevel1_filterVSVSStepLevel1FilterParserRuleCall_16_0 = (RuleCall)cLevel1_filterAssignment_16.eContents().get(0);
		private final Group cGroup_17 = (Group)cGroup.eContents().get(17);
		private final Keyword cLevel0Keyword_17_0 = (Keyword)cGroup_17.eContents().get(0);
		private final Keyword cFormatKeyword_17_1 = (Keyword)cGroup_17.eContents().get(1);
		private final Assignment cLevel0Assignment_17_2 = (Assignment)cGroup_17.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_17_2_0 = (CrossReference)cLevel0Assignment_17_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_17_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_17_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_17_3 = (Keyword)cGroup_17.eContents().get(3);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cLevel1_from_level0Keyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Keyword cImportKeyword_18_1 = (Keyword)cGroup_18.eContents().get(1);
		private final Assignment cLevel1_from_level0Assignment_18_2 = (Assignment)cGroup_18.eContents().get(2);
		private final CrossReference cLevel1_from_level0TMTCIFImportImportCrossReference_18_2_0 = (CrossReference)cLevel1_from_level0Assignment_18_2.eContents().get(0);
		private final RuleCall cLevel1_from_level0TMTCIFImportImportSTRINGTerminalRuleCall_18_2_0_1 = (RuleCall)cLevel1_from_level0TMTCIFImportImportCrossReference_18_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_18_3 = (Keyword)cGroup_18.eContents().get(3);
		private final Assignment cLevel0_filterAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cLevel0_filterVSVSStepLevel0FilterParserRuleCall_19_0 = (RuleCall)cLevel0_filterAssignment_19.eContents().get(0);
		private final Keyword cOutput_level_3Keyword_20 = (Keyword)cGroup.eContents().get(20);
		
		//VSVSStepOutputLevel3:
		//	'<output_level_3'
		//	'name=' name=STRING
		//	'id=' id=UINT_STRING
		//	'ifRef=' ifRef=UINT_STRING ('optional=' optional=UINT_STRING)?
		//	'>' ('<level3' 'format=' level3=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	level3_filter=VSVSStepLevel3Filter ('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	('<level3_from_level2' 'import=' level3_from_level2=[import_::TMTCIFImportImport|STRING] '/>')?
		//	level2_filter=VSVSStepLevel2Filter ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	('<level2_from_level1' 'import=' level2_from_level1=[import_::TMTCIFImportImport|STRING] '/>')?
		//	level1_filter=VSVSStepLevel1Filter ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
		//	level0_filter=VSVSStepLevel0Filter
		//	'</output_level_3>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<output_level_3' 'name=' name=STRING 'id=' id=UINT_STRING 'ifRef=' ifRef=UINT_STRING ('optional='
		//optional=UINT_STRING)? '>' ('<level3' 'format=' level3=[format::TMTCIFFormatFormat|STRING] '/>')?
		//level3_filter=VSVSStepLevel3Filter ('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
		//('<level3_from_level2' 'import=' level3_from_level2=[import_::TMTCIFImportImport|STRING] '/>')?
		//level2_filter=VSVSStepLevel2Filter ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		//('<level2_from_level1' 'import=' level2_from_level1=[import_::TMTCIFImportImport|STRING] '/>')?
		//level1_filter=VSVSStepLevel1Filter ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		//('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
		//level0_filter=VSVSStepLevel0Filter '</output_level_3>'
		public Group getGroup() { return cGroup; }
		
		//'<output_level_3'
		public Keyword getOutput_level_3Keyword_0() { return cOutput_level_3Keyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'id='
		public Keyword getIdKeyword_3() { return cIdKeyword_3; }
		
		//id=UINT_STRING
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//UINT_STRING
		public RuleCall getIdUINT_STRINGTerminalRuleCall_4_0() { return cIdUINT_STRINGTerminalRuleCall_4_0; }
		
		//'ifRef='
		public Keyword getIfRefKeyword_5() { return cIfRefKeyword_5; }
		
		//ifRef=UINT_STRING
		public Assignment getIfRefAssignment_6() { return cIfRefAssignment_6; }
		
		//UINT_STRING
		public RuleCall getIfRefUINT_STRINGTerminalRuleCall_6_0() { return cIfRefUINT_STRINGTerminalRuleCall_6_0; }
		
		//('optional=' optional=UINT_STRING)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'optional='
		public Keyword getOptionalKeyword_7_0() { return cOptionalKeyword_7_0; }
		
		//optional=UINT_STRING
		public Assignment getOptionalAssignment_7_1() { return cOptionalAssignment_7_1; }
		
		//UINT_STRING
		public RuleCall getOptionalUINT_STRINGTerminalRuleCall_7_1_0() { return cOptionalUINT_STRINGTerminalRuleCall_7_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_8() { return cGreaterThanSignKeyword_8; }
		
		//('<level3' 'format=' level3=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_9() { return cGroup_9; }
		
		//'<level3'
		public Keyword getLevel3Keyword_9_0() { return cLevel3Keyword_9_0; }
		
		//'format='
		public Keyword getFormatKeyword_9_1() { return cFormatKeyword_9_1; }
		
		//level3=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel3Assignment_9_2() { return cLevel3Assignment_9_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel3TMTCIFFormatFormatCrossReference_9_2_0() { return cLevel3TMTCIFFormatFormatCrossReference_9_2_0; }
		
		//STRING
		public RuleCall getLevel3TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1() { return cLevel3TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_9_3() { return cSolidusGreaterThanSignKeyword_9_3; }
		
		//level3_filter=VSVSStepLevel3Filter
		public Assignment getLevel3_filterAssignment_10() { return cLevel3_filterAssignment_10; }
		
		//VSVSStepLevel3Filter
		public RuleCall getLevel3_filterVSVSStepLevel3FilterParserRuleCall_10_0() { return cLevel3_filterVSVSStepLevel3FilterParserRuleCall_10_0; }
		
		//('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'<level2'
		public Keyword getLevel2Keyword_11_0() { return cLevel2Keyword_11_0; }
		
		//'format='
		public Keyword getFormatKeyword_11_1() { return cFormatKeyword_11_1; }
		
		//level2=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel2Assignment_11_2() { return cLevel2Assignment_11_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel2TMTCIFFormatFormatCrossReference_11_2_0() { return cLevel2TMTCIFFormatFormatCrossReference_11_2_0; }
		
		//STRING
		public RuleCall getLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_11_2_0_1() { return cLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_11_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_11_3() { return cSolidusGreaterThanSignKeyword_11_3; }
		
		//('<level3_from_level2' 'import=' level3_from_level2=[import_::TMTCIFImportImport|STRING] '/>')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'<level3_from_level2'
		public Keyword getLevel3_from_level2Keyword_12_0() { return cLevel3_from_level2Keyword_12_0; }
		
		//'import='
		public Keyword getImportKeyword_12_1() { return cImportKeyword_12_1; }
		
		//level3_from_level2=[import_::TMTCIFImportImport|STRING]
		public Assignment getLevel3_from_level2Assignment_12_2() { return cLevel3_from_level2Assignment_12_2; }
		
		//[import_::TMTCIFImportImport|STRING]
		public CrossReference getLevel3_from_level2TMTCIFImportImportCrossReference_12_2_0() { return cLevel3_from_level2TMTCIFImportImportCrossReference_12_2_0; }
		
		//STRING
		public RuleCall getLevel3_from_level2TMTCIFImportImportSTRINGTerminalRuleCall_12_2_0_1() { return cLevel3_from_level2TMTCIFImportImportSTRINGTerminalRuleCall_12_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_12_3() { return cSolidusGreaterThanSignKeyword_12_3; }
		
		//level2_filter=VSVSStepLevel2Filter
		public Assignment getLevel2_filterAssignment_13() { return cLevel2_filterAssignment_13; }
		
		//VSVSStepLevel2Filter
		public RuleCall getLevel2_filterVSVSStepLevel2FilterParserRuleCall_13_0() { return cLevel2_filterVSVSStepLevel2FilterParserRuleCall_13_0; }
		
		//('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'<level1'
		public Keyword getLevel1Keyword_14_0() { return cLevel1Keyword_14_0; }
		
		//'format='
		public Keyword getFormatKeyword_14_1() { return cFormatKeyword_14_1; }
		
		//level1=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel1Assignment_14_2() { return cLevel1Assignment_14_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_14_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_14_2_0; }
		
		//STRING
		public RuleCall getLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_14_2_0_1() { return cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_14_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_14_3() { return cSolidusGreaterThanSignKeyword_14_3; }
		
		//('<level2_from_level1' 'import=' level2_from_level1=[import_::TMTCIFImportImport|STRING] '/>')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'<level2_from_level1'
		public Keyword getLevel2_from_level1Keyword_15_0() { return cLevel2_from_level1Keyword_15_0; }
		
		//'import='
		public Keyword getImportKeyword_15_1() { return cImportKeyword_15_1; }
		
		//level2_from_level1=[import_::TMTCIFImportImport|STRING]
		public Assignment getLevel2_from_level1Assignment_15_2() { return cLevel2_from_level1Assignment_15_2; }
		
		//[import_::TMTCIFImportImport|STRING]
		public CrossReference getLevel2_from_level1TMTCIFImportImportCrossReference_15_2_0() { return cLevel2_from_level1TMTCIFImportImportCrossReference_15_2_0; }
		
		//STRING
		public RuleCall getLevel2_from_level1TMTCIFImportImportSTRINGTerminalRuleCall_15_2_0_1() { return cLevel2_from_level1TMTCIFImportImportSTRINGTerminalRuleCall_15_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_15_3() { return cSolidusGreaterThanSignKeyword_15_3; }
		
		//level1_filter=VSVSStepLevel1Filter
		public Assignment getLevel1_filterAssignment_16() { return cLevel1_filterAssignment_16; }
		
		//VSVSStepLevel1Filter
		public RuleCall getLevel1_filterVSVSStepLevel1FilterParserRuleCall_16_0() { return cLevel1_filterVSVSStepLevel1FilterParserRuleCall_16_0; }
		
		//('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_17() { return cGroup_17; }
		
		//'<level0'
		public Keyword getLevel0Keyword_17_0() { return cLevel0Keyword_17_0; }
		
		//'format='
		public Keyword getFormatKeyword_17_1() { return cFormatKeyword_17_1; }
		
		//level0=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel0Assignment_17_2() { return cLevel0Assignment_17_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_17_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_17_2_0; }
		
		//STRING
		public RuleCall getLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_17_2_0_1() { return cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_17_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_17_3() { return cSolidusGreaterThanSignKeyword_17_3; }
		
		//('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'<level1_from_level0'
		public Keyword getLevel1_from_level0Keyword_18_0() { return cLevel1_from_level0Keyword_18_0; }
		
		//'import='
		public Keyword getImportKeyword_18_1() { return cImportKeyword_18_1; }
		
		//level1_from_level0=[import_::TMTCIFImportImport|STRING]
		public Assignment getLevel1_from_level0Assignment_18_2() { return cLevel1_from_level0Assignment_18_2; }
		
		//[import_::TMTCIFImportImport|STRING]
		public CrossReference getLevel1_from_level0TMTCIFImportImportCrossReference_18_2_0() { return cLevel1_from_level0TMTCIFImportImportCrossReference_18_2_0; }
		
		//STRING
		public RuleCall getLevel1_from_level0TMTCIFImportImportSTRINGTerminalRuleCall_18_2_0_1() { return cLevel1_from_level0TMTCIFImportImportSTRINGTerminalRuleCall_18_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_18_3() { return cSolidusGreaterThanSignKeyword_18_3; }
		
		//level0_filter=VSVSStepLevel0Filter
		public Assignment getLevel0_filterAssignment_19() { return cLevel0_filterAssignment_19; }
		
		//VSVSStepLevel0Filter
		public RuleCall getLevel0_filterVSVSStepLevel0FilterParserRuleCall_19_0() { return cLevel0_filterVSVSStepLevel0FilterParserRuleCall_19_0; }
		
		//'</output_level_3>'
		public Keyword getOutput_level_3Keyword_20() { return cOutput_level_3Keyword_20; }
	}
	public class VSVSStepOutputLevel2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutputLevel2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutput_level_2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIdKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cIfRefKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIfRefAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIfRefUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cIfRefAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cOptionalKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cOptionalAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cOptionalUINT_STRINGTerminalRuleCall_7_1_0 = (RuleCall)cOptionalAssignment_7_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cLevel2Keyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cFormatKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cLevel2Assignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final CrossReference cLevel2TMTCIFFormatFormatCrossReference_9_2_0 = (CrossReference)cLevel2Assignment_9_2.eContents().get(0);
		private final RuleCall cLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1 = (RuleCall)cLevel2TMTCIFFormatFormatCrossReference_9_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		private final Assignment cLevel2_filterAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cLevel2_filterVSVSStepLevel2FilterParserRuleCall_10_0 = (RuleCall)cLevel2_filterAssignment_10.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cLevel1Keyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cFormatKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cLevel1Assignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_11_2_0 = (CrossReference)cLevel1Assignment_11_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_11_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_11_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cLevel2_from_level1Keyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cImportKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cLevel2_from_level1Assignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final CrossReference cLevel2_from_level1TMTCIFImportImportCrossReference_12_2_0 = (CrossReference)cLevel2_from_level1Assignment_12_2.eContents().get(0);
		private final RuleCall cLevel2_from_level1TMTCIFImportImportSTRINGTerminalRuleCall_12_2_0_1 = (RuleCall)cLevel2_from_level1TMTCIFImportImportCrossReference_12_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Assignment cLevel1_filterAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cLevel1_filterVSVSStepLevel1FilterParserRuleCall_13_0 = (RuleCall)cLevel1_filterAssignment_13.eContents().get(0);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cLevel0Keyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cFormatKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cLevel0Assignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_14_2_0 = (CrossReference)cLevel0Assignment_14_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_14_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_14_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cLevel1_from_level0Keyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cImportKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cLevel1_from_level0Assignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final CrossReference cLevel1_from_level0TMTCIFImportImportCrossReference_15_2_0 = (CrossReference)cLevel1_from_level0Assignment_15_2.eContents().get(0);
		private final RuleCall cLevel1_from_level0TMTCIFImportImportSTRINGTerminalRuleCall_15_2_0_1 = (RuleCall)cLevel1_from_level0TMTCIFImportImportCrossReference_15_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Assignment cLevel0_filterAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cLevel0_filterVSVSStepLevel0FilterParserRuleCall_16_0 = (RuleCall)cLevel0_filterAssignment_16.eContents().get(0);
		private final Keyword cOutput_level_2Keyword_17 = (Keyword)cGroup.eContents().get(17);
		
		//VSVSStepOutputLevel2:
		//	'<output_level_2'
		//	'name=' name=STRING
		//	'id=' id=UINT_STRING
		//	'ifRef=' ifRef=UINT_STRING ('optional=' optional=UINT_STRING)?
		//	'>' ('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	level2_filter=VSVSStepLevel2Filter ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	('<level2_from_level1' 'import=' level2_from_level1=[import_::TMTCIFImportImport|STRING] '/>')?
		//	level1_filter=VSVSStepLevel1Filter ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
		//	level0_filter=VSVSStepLevel0Filter
		//	'</output_level_2>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<output_level_2' 'name=' name=STRING 'id=' id=UINT_STRING 'ifRef=' ifRef=UINT_STRING ('optional='
		//optional=UINT_STRING)? '>' ('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
		//level2_filter=VSVSStepLevel2Filter ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		//('<level2_from_level1' 'import=' level2_from_level1=[import_::TMTCIFImportImport|STRING] '/>')?
		//level1_filter=VSVSStepLevel1Filter ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		//('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
		//level0_filter=VSVSStepLevel0Filter '</output_level_2>'
		public Group getGroup() { return cGroup; }
		
		//'<output_level_2'
		public Keyword getOutput_level_2Keyword_0() { return cOutput_level_2Keyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'id='
		public Keyword getIdKeyword_3() { return cIdKeyword_3; }
		
		//id=UINT_STRING
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//UINT_STRING
		public RuleCall getIdUINT_STRINGTerminalRuleCall_4_0() { return cIdUINT_STRINGTerminalRuleCall_4_0; }
		
		//'ifRef='
		public Keyword getIfRefKeyword_5() { return cIfRefKeyword_5; }
		
		//ifRef=UINT_STRING
		public Assignment getIfRefAssignment_6() { return cIfRefAssignment_6; }
		
		//UINT_STRING
		public RuleCall getIfRefUINT_STRINGTerminalRuleCall_6_0() { return cIfRefUINT_STRINGTerminalRuleCall_6_0; }
		
		//('optional=' optional=UINT_STRING)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'optional='
		public Keyword getOptionalKeyword_7_0() { return cOptionalKeyword_7_0; }
		
		//optional=UINT_STRING
		public Assignment getOptionalAssignment_7_1() { return cOptionalAssignment_7_1; }
		
		//UINT_STRING
		public RuleCall getOptionalUINT_STRINGTerminalRuleCall_7_1_0() { return cOptionalUINT_STRINGTerminalRuleCall_7_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_8() { return cGreaterThanSignKeyword_8; }
		
		//('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_9() { return cGroup_9; }
		
		//'<level2'
		public Keyword getLevel2Keyword_9_0() { return cLevel2Keyword_9_0; }
		
		//'format='
		public Keyword getFormatKeyword_9_1() { return cFormatKeyword_9_1; }
		
		//level2=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel2Assignment_9_2() { return cLevel2Assignment_9_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel2TMTCIFFormatFormatCrossReference_9_2_0() { return cLevel2TMTCIFFormatFormatCrossReference_9_2_0; }
		
		//STRING
		public RuleCall getLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1() { return cLevel2TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_9_3() { return cSolidusGreaterThanSignKeyword_9_3; }
		
		//level2_filter=VSVSStepLevel2Filter
		public Assignment getLevel2_filterAssignment_10() { return cLevel2_filterAssignment_10; }
		
		//VSVSStepLevel2Filter
		public RuleCall getLevel2_filterVSVSStepLevel2FilterParserRuleCall_10_0() { return cLevel2_filterVSVSStepLevel2FilterParserRuleCall_10_0; }
		
		//('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'<level1'
		public Keyword getLevel1Keyword_11_0() { return cLevel1Keyword_11_0; }
		
		//'format='
		public Keyword getFormatKeyword_11_1() { return cFormatKeyword_11_1; }
		
		//level1=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel1Assignment_11_2() { return cLevel1Assignment_11_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_11_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_11_2_0; }
		
		//STRING
		public RuleCall getLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_11_2_0_1() { return cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_11_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_11_3() { return cSolidusGreaterThanSignKeyword_11_3; }
		
		//('<level2_from_level1' 'import=' level2_from_level1=[import_::TMTCIFImportImport|STRING] '/>')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'<level2_from_level1'
		public Keyword getLevel2_from_level1Keyword_12_0() { return cLevel2_from_level1Keyword_12_0; }
		
		//'import='
		public Keyword getImportKeyword_12_1() { return cImportKeyword_12_1; }
		
		//level2_from_level1=[import_::TMTCIFImportImport|STRING]
		public Assignment getLevel2_from_level1Assignment_12_2() { return cLevel2_from_level1Assignment_12_2; }
		
		//[import_::TMTCIFImportImport|STRING]
		public CrossReference getLevel2_from_level1TMTCIFImportImportCrossReference_12_2_0() { return cLevel2_from_level1TMTCIFImportImportCrossReference_12_2_0; }
		
		//STRING
		public RuleCall getLevel2_from_level1TMTCIFImportImportSTRINGTerminalRuleCall_12_2_0_1() { return cLevel2_from_level1TMTCIFImportImportSTRINGTerminalRuleCall_12_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_12_3() { return cSolidusGreaterThanSignKeyword_12_3; }
		
		//level1_filter=VSVSStepLevel1Filter
		public Assignment getLevel1_filterAssignment_13() { return cLevel1_filterAssignment_13; }
		
		//VSVSStepLevel1Filter
		public RuleCall getLevel1_filterVSVSStepLevel1FilterParserRuleCall_13_0() { return cLevel1_filterVSVSStepLevel1FilterParserRuleCall_13_0; }
		
		//('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'<level0'
		public Keyword getLevel0Keyword_14_0() { return cLevel0Keyword_14_0; }
		
		//'format='
		public Keyword getFormatKeyword_14_1() { return cFormatKeyword_14_1; }
		
		//level0=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel0Assignment_14_2() { return cLevel0Assignment_14_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_14_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_14_2_0; }
		
		//STRING
		public RuleCall getLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_14_2_0_1() { return cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_14_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_14_3() { return cSolidusGreaterThanSignKeyword_14_3; }
		
		//('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'<level1_from_level0'
		public Keyword getLevel1_from_level0Keyword_15_0() { return cLevel1_from_level0Keyword_15_0; }
		
		//'import='
		public Keyword getImportKeyword_15_1() { return cImportKeyword_15_1; }
		
		//level1_from_level0=[import_::TMTCIFImportImport|STRING]
		public Assignment getLevel1_from_level0Assignment_15_2() { return cLevel1_from_level0Assignment_15_2; }
		
		//[import_::TMTCIFImportImport|STRING]
		public CrossReference getLevel1_from_level0TMTCIFImportImportCrossReference_15_2_0() { return cLevel1_from_level0TMTCIFImportImportCrossReference_15_2_0; }
		
		//STRING
		public RuleCall getLevel1_from_level0TMTCIFImportImportSTRINGTerminalRuleCall_15_2_0_1() { return cLevel1_from_level0TMTCIFImportImportSTRINGTerminalRuleCall_15_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_15_3() { return cSolidusGreaterThanSignKeyword_15_3; }
		
		//level0_filter=VSVSStepLevel0Filter
		public Assignment getLevel0_filterAssignment_16() { return cLevel0_filterAssignment_16; }
		
		//VSVSStepLevel0Filter
		public RuleCall getLevel0_filterVSVSStepLevel0FilterParserRuleCall_16_0() { return cLevel0_filterVSVSStepLevel0FilterParserRuleCall_16_0; }
		
		//'</output_level_2>'
		public Keyword getOutput_level_2Keyword_17() { return cOutput_level_2Keyword_17; }
	}
	public class VSVSStepOutputLevel1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutputLevel1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutput_level_1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIdKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cIfRefKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIfRefAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIfRefUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cIfRefAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cOptionalKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cOptionalAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cOptionalUINT_STRINGTerminalRuleCall_7_1_0 = (RuleCall)cOptionalAssignment_7_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cLevel1Keyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cFormatKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cLevel1Assignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final CrossReference cLevel1TMTCIFFormatFormatCrossReference_9_2_0 = (CrossReference)cLevel1Assignment_9_2.eContents().get(0);
		private final RuleCall cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1 = (RuleCall)cLevel1TMTCIFFormatFormatCrossReference_9_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		private final Assignment cLevel1_filterAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cLevel1_filterVSVSStepLevel1FilterParserRuleCall_10_0 = (RuleCall)cLevel1_filterAssignment_10.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cLevel0Keyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cFormatKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cLevel0Assignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_11_2_0 = (CrossReference)cLevel0Assignment_11_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_11_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_11_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cLevel1_from_level0Keyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cImportKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cLevel1_from_level0Assignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final CrossReference cLevel1_from_level0TMTCIFImportImportCrossReference_12_2_0 = (CrossReference)cLevel1_from_level0Assignment_12_2.eContents().get(0);
		private final RuleCall cLevel1_from_level0TMTCIFImportImportSTRINGTerminalRuleCall_12_2_0_1 = (RuleCall)cLevel1_from_level0TMTCIFImportImportCrossReference_12_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Assignment cLevel0_filterAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cLevel0_filterVSVSStepLevel0FilterParserRuleCall_13_0 = (RuleCall)cLevel0_filterAssignment_13.eContents().get(0);
		private final Keyword cOutput_level_1Keyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//VSVSStepOutputLevel1:
		//	'<output_level_1'
		//	'name=' name=STRING
		//	'id=' id=UINT_STRING
		//	'ifRef=' ifRef=UINT_STRING ('optional=' optional=UINT_STRING)?
		//	'>' ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	level1_filter=VSVSStepLevel1Filter ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
		//	level0_filter=VSVSStepLevel0Filter
		//	'</output_level_1>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<output_level_1' 'name=' name=STRING 'id=' id=UINT_STRING 'ifRef=' ifRef=UINT_STRING ('optional='
		//optional=UINT_STRING)? '>' ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		//level1_filter=VSVSStepLevel1Filter ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		//('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
		//level0_filter=VSVSStepLevel0Filter '</output_level_1>'
		public Group getGroup() { return cGroup; }
		
		//'<output_level_1'
		public Keyword getOutput_level_1Keyword_0() { return cOutput_level_1Keyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'id='
		public Keyword getIdKeyword_3() { return cIdKeyword_3; }
		
		//id=UINT_STRING
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//UINT_STRING
		public RuleCall getIdUINT_STRINGTerminalRuleCall_4_0() { return cIdUINT_STRINGTerminalRuleCall_4_0; }
		
		//'ifRef='
		public Keyword getIfRefKeyword_5() { return cIfRefKeyword_5; }
		
		//ifRef=UINT_STRING
		public Assignment getIfRefAssignment_6() { return cIfRefAssignment_6; }
		
		//UINT_STRING
		public RuleCall getIfRefUINT_STRINGTerminalRuleCall_6_0() { return cIfRefUINT_STRINGTerminalRuleCall_6_0; }
		
		//('optional=' optional=UINT_STRING)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'optional='
		public Keyword getOptionalKeyword_7_0() { return cOptionalKeyword_7_0; }
		
		//optional=UINT_STRING
		public Assignment getOptionalAssignment_7_1() { return cOptionalAssignment_7_1; }
		
		//UINT_STRING
		public RuleCall getOptionalUINT_STRINGTerminalRuleCall_7_1_0() { return cOptionalUINT_STRINGTerminalRuleCall_7_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_8() { return cGreaterThanSignKeyword_8; }
		
		//('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_9() { return cGroup_9; }
		
		//'<level1'
		public Keyword getLevel1Keyword_9_0() { return cLevel1Keyword_9_0; }
		
		//'format='
		public Keyword getFormatKeyword_9_1() { return cFormatKeyword_9_1; }
		
		//level1=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel1Assignment_9_2() { return cLevel1Assignment_9_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel1TMTCIFFormatFormatCrossReference_9_2_0() { return cLevel1TMTCIFFormatFormatCrossReference_9_2_0; }
		
		//STRING
		public RuleCall getLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1() { return cLevel1TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_9_3() { return cSolidusGreaterThanSignKeyword_9_3; }
		
		//level1_filter=VSVSStepLevel1Filter
		public Assignment getLevel1_filterAssignment_10() { return cLevel1_filterAssignment_10; }
		
		//VSVSStepLevel1Filter
		public RuleCall getLevel1_filterVSVSStepLevel1FilterParserRuleCall_10_0() { return cLevel1_filterVSVSStepLevel1FilterParserRuleCall_10_0; }
		
		//('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'<level0'
		public Keyword getLevel0Keyword_11_0() { return cLevel0Keyword_11_0; }
		
		//'format='
		public Keyword getFormatKeyword_11_1() { return cFormatKeyword_11_1; }
		
		//level0=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel0Assignment_11_2() { return cLevel0Assignment_11_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_11_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_11_2_0; }
		
		//STRING
		public RuleCall getLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_11_2_0_1() { return cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_11_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_11_3() { return cSolidusGreaterThanSignKeyword_11_3; }
		
		//('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'<level1_from_level0'
		public Keyword getLevel1_from_level0Keyword_12_0() { return cLevel1_from_level0Keyword_12_0; }
		
		//'import='
		public Keyword getImportKeyword_12_1() { return cImportKeyword_12_1; }
		
		//level1_from_level0=[import_::TMTCIFImportImport|STRING]
		public Assignment getLevel1_from_level0Assignment_12_2() { return cLevel1_from_level0Assignment_12_2; }
		
		//[import_::TMTCIFImportImport|STRING]
		public CrossReference getLevel1_from_level0TMTCIFImportImportCrossReference_12_2_0() { return cLevel1_from_level0TMTCIFImportImportCrossReference_12_2_0; }
		
		//STRING
		public RuleCall getLevel1_from_level0TMTCIFImportImportSTRINGTerminalRuleCall_12_2_0_1() { return cLevel1_from_level0TMTCIFImportImportSTRINGTerminalRuleCall_12_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_12_3() { return cSolidusGreaterThanSignKeyword_12_3; }
		
		//level0_filter=VSVSStepLevel0Filter
		public Assignment getLevel0_filterAssignment_13() { return cLevel0_filterAssignment_13; }
		
		//VSVSStepLevel0Filter
		public RuleCall getLevel0_filterVSVSStepLevel0FilterParserRuleCall_13_0() { return cLevel0_filterVSVSStepLevel0FilterParserRuleCall_13_0; }
		
		//'</output_level_1>'
		public Keyword getOutput_level_1Keyword_14() { return cOutput_level_1Keyword_14; }
	}
	public class VSVSStepOutputLevel0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutputLevel0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutput_level_0Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIdKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cIfRefKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIfRefAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIfRefUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cIfRefAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cOptionalKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cOptionalAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cOptionalUINT_STRINGTerminalRuleCall_7_1_0 = (RuleCall)cOptionalAssignment_7_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cLevel0Keyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cFormatKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cLevel0Assignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final CrossReference cLevel0TMTCIFFormatFormatCrossReference_9_2_0 = (CrossReference)cLevel0Assignment_9_2.eContents().get(0);
		private final RuleCall cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1 = (RuleCall)cLevel0TMTCIFFormatFormatCrossReference_9_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		private final Assignment cLevel0_filterAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cLevel0_filterVSVSStepLevel0FilterParserRuleCall_10_0 = (RuleCall)cLevel0_filterAssignment_10.eContents().get(0);
		private final Keyword cOutput_level_0Keyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//VSVSStepOutputLevel0:
		//	'<output_level_0'
		//	'name=' name=STRING
		//	'id=' id=UINT_STRING
		//	'ifRef=' ifRef=UINT_STRING ('optional=' optional=UINT_STRING)?
		//	'>' ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		//	level0_filter=VSVSStepLevel0Filter
		//	'</output_level_0>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<output_level_0' 'name=' name=STRING 'id=' id=UINT_STRING 'ifRef=' ifRef=UINT_STRING ('optional='
		//optional=UINT_STRING)? '>' ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		//level0_filter=VSVSStepLevel0Filter '</output_level_0>'
		public Group getGroup() { return cGroup; }
		
		//'<output_level_0'
		public Keyword getOutput_level_0Keyword_0() { return cOutput_level_0Keyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'id='
		public Keyword getIdKeyword_3() { return cIdKeyword_3; }
		
		//id=UINT_STRING
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//UINT_STRING
		public RuleCall getIdUINT_STRINGTerminalRuleCall_4_0() { return cIdUINT_STRINGTerminalRuleCall_4_0; }
		
		//'ifRef='
		public Keyword getIfRefKeyword_5() { return cIfRefKeyword_5; }
		
		//ifRef=UINT_STRING
		public Assignment getIfRefAssignment_6() { return cIfRefAssignment_6; }
		
		//UINT_STRING
		public RuleCall getIfRefUINT_STRINGTerminalRuleCall_6_0() { return cIfRefUINT_STRINGTerminalRuleCall_6_0; }
		
		//('optional=' optional=UINT_STRING)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'optional='
		public Keyword getOptionalKeyword_7_0() { return cOptionalKeyword_7_0; }
		
		//optional=UINT_STRING
		public Assignment getOptionalAssignment_7_1() { return cOptionalAssignment_7_1; }
		
		//UINT_STRING
		public RuleCall getOptionalUINT_STRINGTerminalRuleCall_7_1_0() { return cOptionalUINT_STRINGTerminalRuleCall_7_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_8() { return cGreaterThanSignKeyword_8; }
		
		//('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
		public Group getGroup_9() { return cGroup_9; }
		
		//'<level0'
		public Keyword getLevel0Keyword_9_0() { return cLevel0Keyword_9_0; }
		
		//'format='
		public Keyword getFormatKeyword_9_1() { return cFormatKeyword_9_1; }
		
		//level0=[format::TMTCIFFormatFormat|STRING]
		public Assignment getLevel0Assignment_9_2() { return cLevel0Assignment_9_2; }
		
		//[format::TMTCIFFormatFormat|STRING]
		public CrossReference getLevel0TMTCIFFormatFormatCrossReference_9_2_0() { return cLevel0TMTCIFFormatFormatCrossReference_9_2_0; }
		
		//STRING
		public RuleCall getLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1() { return cLevel0TMTCIFFormatFormatSTRINGTerminalRuleCall_9_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_9_3() { return cSolidusGreaterThanSignKeyword_9_3; }
		
		//level0_filter=VSVSStepLevel0Filter
		public Assignment getLevel0_filterAssignment_10() { return cLevel0_filterAssignment_10; }
		
		//VSVSStepLevel0Filter
		public RuleCall getLevel0_filterVSVSStepLevel0FilterParserRuleCall_10_0() { return cLevel0_filterVSVSStepLevel0FilterParserRuleCall_10_0; }
		
		//'</output_level_0>'
		public Keyword getOutput_level_0Keyword_11() { return cOutput_level_0Keyword_11; }
	}
	public class VSVSStepLevel3FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel3Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLevel3_filterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cApply_def_filterKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cApply_def_filterAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cApply_def_filterVSVSStepYesNoEnumRuleCall_2_0 = (RuleCall)cApply_def_filterAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtra_filterKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cExtra_filterAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0 = (CrossReference)cExtra_filterAssignment_3_1.eContents().get(0);
		private final RuleCall cExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1 = (RuleCall)cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSVSStepLevel3Filter VSVSStepFilter:
		//	'<level3_filter'
		//	'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
		//	extra_filter=[filter::TMTCIFFilterFilter|STRING])?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<level3_filter' 'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
		//extra_filter=[filter::TMTCIFFilterFilter|STRING])? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<level3_filter'
		public Keyword getLevel3_filterKeyword_0() { return cLevel3_filterKeyword_0; }
		
		//'apply_def_filter='
		public Keyword getApply_def_filterKeyword_1() { return cApply_def_filterKeyword_1; }
		
		//apply_def_filter=VSVSStepYesNo
		public Assignment getApply_def_filterAssignment_2() { return cApply_def_filterAssignment_2; }
		
		//VSVSStepYesNo
		public RuleCall getApply_def_filterVSVSStepYesNoEnumRuleCall_2_0() { return cApply_def_filterVSVSStepYesNoEnumRuleCall_2_0; }
		
		//('extra_filter=' extra_filter=[filter::TMTCIFFilterFilter|STRING])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'extra_filter='
		public Keyword getExtra_filterKeyword_3_0() { return cExtra_filterKeyword_3_0; }
		
		//extra_filter=[filter::TMTCIFFilterFilter|STRING]
		public Assignment getExtra_filterAssignment_3_1() { return cExtra_filterAssignment_3_1; }
		
		//[filter::TMTCIFFilterFilter|STRING]
		public CrossReference getExtra_filterTMTCIFFilterFilterCrossReference_3_1_0() { return cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0; }
		
		//STRING
		public RuleCall getExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1() { return cExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_4() { return cSolidusGreaterThanSignKeyword_4; }
	}
	public class VSVSStepLevel2FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel2Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLevel2_filterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cApply_def_filterKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cApply_def_filterAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cApply_def_filterVSVSStepYesNoEnumRuleCall_2_0 = (RuleCall)cApply_def_filterAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtra_filterKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cExtra_filterAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0 = (CrossReference)cExtra_filterAssignment_3_1.eContents().get(0);
		private final RuleCall cExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1 = (RuleCall)cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSVSStepLevel2Filter VSVSStepFilter:
		//	'<level2_filter'
		//	'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
		//	extra_filter=[filter::TMTCIFFilterFilter|STRING])?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<level2_filter' 'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
		//extra_filter=[filter::TMTCIFFilterFilter|STRING])? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<level2_filter'
		public Keyword getLevel2_filterKeyword_0() { return cLevel2_filterKeyword_0; }
		
		//'apply_def_filter='
		public Keyword getApply_def_filterKeyword_1() { return cApply_def_filterKeyword_1; }
		
		//apply_def_filter=VSVSStepYesNo
		public Assignment getApply_def_filterAssignment_2() { return cApply_def_filterAssignment_2; }
		
		//VSVSStepYesNo
		public RuleCall getApply_def_filterVSVSStepYesNoEnumRuleCall_2_0() { return cApply_def_filterVSVSStepYesNoEnumRuleCall_2_0; }
		
		//('extra_filter=' extra_filter=[filter::TMTCIFFilterFilter|STRING])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'extra_filter='
		public Keyword getExtra_filterKeyword_3_0() { return cExtra_filterKeyword_3_0; }
		
		//extra_filter=[filter::TMTCIFFilterFilter|STRING]
		public Assignment getExtra_filterAssignment_3_1() { return cExtra_filterAssignment_3_1; }
		
		//[filter::TMTCIFFilterFilter|STRING]
		public CrossReference getExtra_filterTMTCIFFilterFilterCrossReference_3_1_0() { return cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0; }
		
		//STRING
		public RuleCall getExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1() { return cExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_4() { return cSolidusGreaterThanSignKeyword_4; }
	}
	public class VSVSStepLevel1FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel1Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLevel1_filterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cApply_def_filterKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cApply_def_filterAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cApply_def_filterVSVSStepYesNoEnumRuleCall_2_0 = (RuleCall)cApply_def_filterAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtra_filterKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cExtra_filterAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0 = (CrossReference)cExtra_filterAssignment_3_1.eContents().get(0);
		private final RuleCall cExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1 = (RuleCall)cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSVSStepLevel1Filter VSVSStepFilter:
		//	'<level1_filter'
		//	'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
		//	extra_filter=[filter::TMTCIFFilterFilter|STRING])?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<level1_filter' 'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
		//extra_filter=[filter::TMTCIFFilterFilter|STRING])? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<level1_filter'
		public Keyword getLevel1_filterKeyword_0() { return cLevel1_filterKeyword_0; }
		
		//'apply_def_filter='
		public Keyword getApply_def_filterKeyword_1() { return cApply_def_filterKeyword_1; }
		
		//apply_def_filter=VSVSStepYesNo
		public Assignment getApply_def_filterAssignment_2() { return cApply_def_filterAssignment_2; }
		
		//VSVSStepYesNo
		public RuleCall getApply_def_filterVSVSStepYesNoEnumRuleCall_2_0() { return cApply_def_filterVSVSStepYesNoEnumRuleCall_2_0; }
		
		//('extra_filter=' extra_filter=[filter::TMTCIFFilterFilter|STRING])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'extra_filter='
		public Keyword getExtra_filterKeyword_3_0() { return cExtra_filterKeyword_3_0; }
		
		//extra_filter=[filter::TMTCIFFilterFilter|STRING]
		public Assignment getExtra_filterAssignment_3_1() { return cExtra_filterAssignment_3_1; }
		
		//[filter::TMTCIFFilterFilter|STRING]
		public CrossReference getExtra_filterTMTCIFFilterFilterCrossReference_3_1_0() { return cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0; }
		
		//STRING
		public RuleCall getExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1() { return cExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_4() { return cSolidusGreaterThanSignKeyword_4; }
	}
	public class VSVSStepLevel0FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel0Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLevel0_filterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cApply_def_filterKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cApply_def_filterAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cApply_def_filterVSVSStepYesNoEnumRuleCall_2_0 = (RuleCall)cApply_def_filterAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtra_filterKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cExtra_filterAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0 = (CrossReference)cExtra_filterAssignment_3_1.eContents().get(0);
		private final RuleCall cExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1 = (RuleCall)cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSVSStepLevel0Filter VSVSStepFilter:
		//	'<level0_filter'
		//	'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
		//	extra_filter=[filter::TMTCIFFilterFilter|STRING])?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<level0_filter' 'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
		//extra_filter=[filter::TMTCIFFilterFilter|STRING])? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<level0_filter'
		public Keyword getLevel0_filterKeyword_0() { return cLevel0_filterKeyword_0; }
		
		//'apply_def_filter='
		public Keyword getApply_def_filterKeyword_1() { return cApply_def_filterKeyword_1; }
		
		//apply_def_filter=VSVSStepYesNo
		public Assignment getApply_def_filterAssignment_2() { return cApply_def_filterAssignment_2; }
		
		//VSVSStepYesNo
		public RuleCall getApply_def_filterVSVSStepYesNoEnumRuleCall_2_0() { return cApply_def_filterVSVSStepYesNoEnumRuleCall_2_0; }
		
		//('extra_filter=' extra_filter=[filter::TMTCIFFilterFilter|STRING])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'extra_filter='
		public Keyword getExtra_filterKeyword_3_0() { return cExtra_filterKeyword_3_0; }
		
		//extra_filter=[filter::TMTCIFFilterFilter|STRING]
		public Assignment getExtra_filterAssignment_3_1() { return cExtra_filterAssignment_3_1; }
		
		//[filter::TMTCIFFilterFilter|STRING]
		public CrossReference getExtra_filterTMTCIFFilterFilterCrossReference_3_1_0() { return cExtra_filterTMTCIFFilterFilterCrossReference_3_1_0; }
		
		//STRING
		public RuleCall getExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1() { return cExtra_filterTMTCIFFilterFilterSTRINGTerminalRuleCall_3_1_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_4() { return cSolidusGreaterThanSignKeyword_4; }
	}
	public class VSVSStepEnableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepEnable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_2_0 = (RuleCall)cIdAssignment_2.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSStepEnable VSVSStepEnableDisable:
		//	'<enable'
		//	'id=' id=UINT_STRING
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<enable' 'id=' id=UINT_STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<enable'
		public Keyword getEnableKeyword_0() { return cEnableKeyword_0; }
		
		//'id='
		public Keyword getIdKeyword_1() { return cIdKeyword_1; }
		
		//id=UINT_STRING
		public Assignment getIdAssignment_2() { return cIdAssignment_2; }
		
		//UINT_STRING
		public RuleCall getIdUINT_STRINGTerminalRuleCall_2_0() { return cIdUINT_STRINGTerminalRuleCall_2_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3() { return cSolidusGreaterThanSignKeyword_3; }
	}
	public class VSVSStepDisableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepDisable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDisableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_2_0 = (RuleCall)cIdAssignment_2.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSStepDisable VSVSStepEnableDisable:
		//	'<disable'
		//	'id=' id=UINT_STRING
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<disable' 'id=' id=UINT_STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<disable'
		public Keyword getDisableKeyword_0() { return cDisableKeyword_0; }
		
		//'id='
		public Keyword getIdKeyword_1() { return cIdKeyword_1; }
		
		//id=UINT_STRING
		public Assignment getIdAssignment_2() { return cIdAssignment_2; }
		
		//UINT_STRING
		public RuleCall getIdUINT_STRINGTerminalRuleCall_2_0() { return cIdUINT_STRINGTerminalRuleCall_2_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3() { return cSolidusGreaterThanSignKeyword_3; }
	}
	public class VSVSStepEnablePrintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepEnablePrint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnable_printKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_2_0 = (RuleCall)cIdAssignment_2.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSStepEnablePrint VSVSStepEnableDisable:
		//	'<enable_print'
		//	'id=' id=UINT_STRING
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<enable_print' 'id=' id=UINT_STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<enable_print'
		public Keyword getEnable_printKeyword_0() { return cEnable_printKeyword_0; }
		
		//'id='
		public Keyword getIdKeyword_1() { return cIdKeyword_1; }
		
		//id=UINT_STRING
		public Assignment getIdAssignment_2() { return cIdAssignment_2; }
		
		//UINT_STRING
		public RuleCall getIdUINT_STRINGTerminalRuleCall_2_0() { return cIdUINT_STRINGTerminalRuleCall_2_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3() { return cSolidusGreaterThanSignKeyword_3; }
	}
	public class VSVSStepDisablePrintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepDisablePrint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDisable_printKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_2_0 = (RuleCall)cIdAssignment_2.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSStepDisablePrint VSVSStepEnableDisable:
		//	'<disable_print'
		//	'id=' id=UINT_STRING
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<disable_print' 'id=' id=UINT_STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<disable_print'
		public Keyword getDisable_printKeyword_0() { return cDisable_printKeyword_0; }
		
		//'id='
		public Keyword getIdKeyword_1() { return cIdKeyword_1; }
		
		//id=UINT_STRING
		public Assignment getIdAssignment_2() { return cIdAssignment_2; }
		
		//UINT_STRING
		public RuleCall getIdUINT_STRINGTerminalRuleCall_2_0() { return cIdUINT_STRINGTerminalRuleCall_2_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3() { return cSolidusGreaterThanSignKeyword_3; }
	}
	public class VSVSStepNextStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepNextStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNextStepKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_2_0 = (RuleCall)cIdAssignment_2.eContents().get(0);
		private final Keyword cIsConcurrentKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIsConcurrentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIsConcurrentVSVSStepYesNoEnumRuleCall_4_0 = (RuleCall)cIsConcurrentAssignment_4.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSStepNextStep:
		//	'<nextStep'
		//	'id=' id=UINT_STRING
		//	'isConcurrent=' isConcurrent=VSVSStepYesNo
		//	'/>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<nextStep' 'id=' id=UINT_STRING 'isConcurrent=' isConcurrent=VSVSStepYesNo '/>'
		public Group getGroup() { return cGroup; }
		
		//'<nextStep'
		public Keyword getNextStepKeyword_0() { return cNextStepKeyword_0; }
		
		//'id='
		public Keyword getIdKeyword_1() { return cIdKeyword_1; }
		
		//id=UINT_STRING
		public Assignment getIdAssignment_2() { return cIdAssignment_2; }
		
		//UINT_STRING
		public RuleCall getIdUINT_STRINGTerminalRuleCall_2_0() { return cIdUINT_STRINGTerminalRuleCall_2_0; }
		
		//'isConcurrent='
		public Keyword getIsConcurrentKeyword_3() { return cIsConcurrentKeyword_3; }
		
		//isConcurrent=VSVSStepYesNo
		public Assignment getIsConcurrentAssignment_4() { return cIsConcurrentAssignment_4; }
		
		//VSVSStepYesNo
		public RuleCall getIsConcurrentVSVSStepYesNoEnumRuleCall_4_0() { return cIsConcurrentVSVSStepYesNoEnumRuleCall_4_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_5() { return cSolidusGreaterThanSignKeyword_5; }
	}
	public class VSVSStepConcurrentStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepConcurrentStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConcurrent_stepKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_2_0 = (RuleCall)cIdAssignment_2.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSStepConcurrentStep:
		//	'<concurrent_step'
		//	'id=' id=UINT_STRING
		//	'/>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<concurrent_step' 'id=' id=UINT_STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<concurrent_step'
		public Keyword getConcurrent_stepKeyword_0() { return cConcurrent_stepKeyword_0; }
		
		//'id='
		public Keyword getIdKeyword_1() { return cIdKeyword_1; }
		
		//id=UINT_STRING
		public Assignment getIdAssignment_2() { return cIdAssignment_2; }
		
		//UINT_STRING
		public RuleCall getIdUINT_STRINGTerminalRuleCall_2_0() { return cIdUINT_STRINGTerminalRuleCall_2_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3() { return cSolidusGreaterThanSignKeyword_3; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0_1_0 = (RuleCall)cGroup_0_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cAlternatives_1_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_1_0 = (RuleCall)cGroup_1_1_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1_1_1 = (RuleCall)cGroup_1_1_1.eContents().get(1);
		
		//Version:
		//	(INT | INT? ID) ('.' (INT | INT? ID))*;
		@Override public ParserRule getRule() { return rule; }
		
		//(INT | INT? ID) ('.' (INT | INT? ID))*
		public Group getGroup() { return cGroup; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_0() { return cINTTerminalRuleCall_0_0; }
		
		//INT? ID
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_0_1_0() { return cINTTerminalRuleCall_0_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1_1() { return cIDTerminalRuleCall_0_1_1; }
		
		//('.' (INT | INT? ID))*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1_0() { return cINTTerminalRuleCall_1_1_0; }
		
		//INT? ID
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1_1_1_0() { return cINTTerminalRuleCall_1_1_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1_1_1() { return cIDTerminalRuleCall_1_1_1_1; }
	}
	public class VersionedQualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VersionedQualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cVersionParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VersionedQualifiedName:
		//	QualifiedName '(' Version ')';
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '(' Version ')'
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//Version
		public RuleCall getVersionParserRuleCall_2() { return cVersionParserRuleCall_2; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class VersionedQualifiedReferenceNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VersionedQualifiedReferenceName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cVersionedQualifiedNameParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//VersionedQualifiedReferenceName:
		//	(VersionedQualifiedName '::')? ID ('::' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(VersionedQualifiedName '::')? ID ('::' ID)*
		public Group getGroup() { return cGroup; }
		
		//(VersionedQualifiedName '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//VersionedQualifiedName
		public RuleCall getVersionedQualifiedNameParserRuleCall_0_0() { return cVersionedQualifiedNameParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//('::' ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'::'
		public Keyword getColonColonKeyword_2_0() { return cColonColonKeyword_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}
	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.INTEGER");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cHEXADECIMALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//INTEGER:
		//	'-'? INT | HEXADECIMAL;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT | HEXADECIMAL
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'-'? INT
		public Group getGroup_0() { return cGroup_0; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0_0() { return cHyphenMinusKeyword_0_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_1() { return cINTTerminalRuleCall_0_1; }
		
		//HEXADECIMAL
		public RuleCall getHEXADECIMALTerminalRuleCall_1() { return cHEXADECIMALTerminalRuleCall_1; }
	}
	
	public class VSVSStepModeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepMode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cContinuousEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cContinuousContinuousKeyword_0_0 = (Keyword)cContinuousEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cManualEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cManualManualKeyword_1_0 = (Keyword)cManualEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cConcurrentEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cConcurrentConcurrentKeyword_2_0 = (Keyword)cConcurrentEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum VSVSStepMode:
		//	continuous='"continuous"' | manual='"manual"' |
		//	concurrent='"concurrent"';
		public EnumRule getRule() { return rule; }
		
		//continuous='"continuous"' | manual='"manual"' | concurrent='"concurrent"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//continuous='"continuous"'
		public EnumLiteralDeclaration getContinuousEnumLiteralDeclaration_0() { return cContinuousEnumLiteralDeclaration_0; }
		
		//'"continuous"'
		public Keyword getContinuousContinuousKeyword_0_0() { return cContinuousContinuousKeyword_0_0; }
		
		//manual='"manual"'
		public EnumLiteralDeclaration getManualEnumLiteralDeclaration_1() { return cManualEnumLiteralDeclaration_1; }
		
		//'"manual"'
		public Keyword getManualManualKeyword_1_0() { return cManualManualKeyword_1_0; }
		
		//concurrent='"concurrent"'
		public EnumLiteralDeclaration getConcurrentEnumLiteralDeclaration_2() { return cConcurrentEnumLiteralDeclaration_2; }
		
		//'"concurrent"'
		public Keyword getConcurrentConcurrentKeyword_2_0() { return cConcurrentConcurrentKeyword_2_0; }
	}
	public class VSVSStepUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMilisecondsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMilisecondsMilisecondsKeyword_0_0 = (Keyword)cMilisecondsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSecondsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSecondsSecondsKeyword_1_0 = (Keyword)cSecondsEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum VSVSStepUnit:
		//	miliseconds='"miliseconds"' | seconds='"seconds"';
		public EnumRule getRule() { return rule; }
		
		//miliseconds='"miliseconds"' | seconds='"seconds"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//miliseconds='"miliseconds"'
		public EnumLiteralDeclaration getMilisecondsEnumLiteralDeclaration_0() { return cMilisecondsEnumLiteralDeclaration_0; }
		
		//'"miliseconds"'
		public Keyword getMilisecondsMilisecondsKeyword_0_0() { return cMilisecondsMilisecondsKeyword_0_0; }
		
		//seconds='"seconds"'
		public EnumLiteralDeclaration getSecondsEnumLiteralDeclaration_1() { return cSecondsEnumLiteralDeclaration_1; }
		
		//'"seconds"'
		public Keyword getSecondsSecondsKeyword_1_0() { return cSecondsSecondsKeyword_1_0; }
	}
	public class VSVSStepCheckmodeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepCheckmode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAllEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAllAllKeyword_0_0 = (Keyword)cAllEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAllunsortedEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAllunsortedAllunsortedKeyword_1_0 = (Keyword)cAllunsortedEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cAnyEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cAnyAnyKeyword_2_0 = (Keyword)cAnyEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum VSVSStepCheckmode:
		//	all='"all"' | allunsorted='"allunsorted"' | any='"any"';
		public EnumRule getRule() { return rule; }
		
		//all='"all"' | allunsorted='"allunsorted"' | any='"any"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//all='"all"'
		public EnumLiteralDeclaration getAllEnumLiteralDeclaration_0() { return cAllEnumLiteralDeclaration_0; }
		
		//'"all"'
		public Keyword getAllAllKeyword_0_0() { return cAllAllKeyword_0_0; }
		
		//allunsorted='"allunsorted"'
		public EnumLiteralDeclaration getAllunsortedEnumLiteralDeclaration_1() { return cAllunsortedEnumLiteralDeclaration_1; }
		
		//'"allunsorted"'
		public Keyword getAllunsortedAllunsortedKeyword_1_0() { return cAllunsortedAllunsortedKeyword_1_0; }
		
		//any='"any"'
		public EnumLiteralDeclaration getAnyEnumLiteralDeclaration_2() { return cAnyEnumLiteralDeclaration_2; }
		
		//'"any"'
		public Keyword getAnyAnyKeyword_2_0() { return cAnyAnyKeyword_2_0; }
	}
	public class VSVSStepYesNoElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepYesNo");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cYesEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cYesYesKeyword_0_0 = (Keyword)cYesEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNoEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNoNoKeyword_1_0 = (Keyword)cNoEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum VSVSStepYesNo:
		//	yes='"yes"' | no='"no"';
		public EnumRule getRule() { return rule; }
		
		//yes='"yes"' | no='"no"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//yes='"yes"'
		public EnumLiteralDeclaration getYesEnumLiteralDeclaration_0() { return cYesEnumLiteralDeclaration_0; }
		
		//'"yes"'
		public Keyword getYesYesKeyword_0_0() { return cYesYesKeyword_0_0; }
		
		//no='"no"'
		public EnumLiteralDeclaration getNoEnumLiteralDeclaration_1() { return cNoEnumLiteralDeclaration_1; }
		
		//'"no"'
		public Keyword getNoNoKeyword_1_0() { return cNoNoKeyword_1_0; }
	}
	
	private final VSVSDocumentElements pVSVSDocument;
	private final DBodyElements pDBody;
	private final DBodyContentElements pDBodyContent;
	private final DParagraphElements pDParagraph;
	private final DListItemElements pDListItem;
	private final DListContentElements pDListContent;
	private final DItemizeElements pDItemize;
	private final DEnumerateElements pDEnumerate;
	private final DParagraphContentElements pDParagraphContent;
	private final DRunElements pDRun;
	private final DHyperlinkElements pDHyperlink;
	private final DTextElements pDText;
	private final TerminalRule tRUNTEXT;
	private final DFigureFromFileElements pDFigureFromFile;
	private final DTableFromFileElements pDTableFromFile;
	private final DBasicTableElements pDBasicTable;
	private final DRowElements pDRow;
	private final DColumnElements pDColumn;
	private final DCellElements pDCell;
	private final DApplicableDocumentElements pDApplicableDocument;
	private final DReferenceDocumentElements pDReferenceDocument;
	private final VSVSFixedSectionElements pVSVSFixedSection;
	private final VSVSInstantiableSectionElements pVSVSInstantiableSection;
	private final VSVSIntroductionElements pVSVSIntroduction;
	private final VSVSApplicableDocumentsElements pVSVSApplicableDocuments;
	private final VSVSReferenceDocumentsElements pVSVSReferenceDocuments;
	private final VSVSTermsDefinitionsAbbreviationsElements pVSVSTermsDefinitionsAbbreviations;
	private final VSVSSoftwareOverviewElements pVSVSSoftwareOverview;
	private final VSVSTaskIdentificationElements pVSVSTaskIdentification;
	private final VSVSTestingSpecificationDesignElements pVSVSTestingSpecificationDesign;
	private final VSVSTestCasesElements pVSVSTestCases;
	private final VSVSTestProceduresElements pVSVSTestProcedures;
	private final VSVSAnalysisInspectionReviewElements pVSVSAnalysisInspectionReview;
	private final VSVSTestPlatformRequirementsElements pVSVSTestPlatformRequirements;
	private final VSVSAdditionalInformationElements pVSVSAdditionalInformation;
	private final VSVSTermElements pVSVSTerm;
	private final VSVSDefinitionElements pVSVSDefinition;
	private final VSVSAbbreviationElements pVSVSAbbreviation;
	private final VSVSTestDesignElements pVSVSTestDesign;
	private final VSVSTestCaseElements pVSVSTestCase;
	private final VSVSTestProcedureElements pVSVSTestProcedure;
	private final VSVSProcedureStepsElements pVSVSProcedureSteps;
	private final VSVSProcedureStepElements pVSVSProcedureStep;
	private final VSVSStepModeElements eVSVSStepMode;
	private final VSVSStepInputsElements pVSVSStepInputs;
	private final VSVSStepOutputsElements pVSVSStepOutputs;
	private final VSVSStepSpecialPacketsElements pVSVSStepSpecialPackets;
	private final VSVSStepConcurrentStepsElements pVSVSStepConcurrentSteps;
	private final VSVSStepInputLevel3Elements pVSVSStepInputLevel3;
	private final VSVSStepInputLevel2Elements pVSVSStepInputLevel2;
	private final VSVSStepInputLevel1Elements pVSVSStepInputLevel1;
	private final VSVSStepInputLevel0Elements pVSVSStepInputLevel0;
	private final VSVSStepUnitElements eVSVSStepUnit;
	private final VSVSStepCheckmodeElements eVSVSStepCheckmode;
	private final VSVSStepOutputLevel3Elements pVSVSStepOutputLevel3;
	private final VSVSStepOutputLevel2Elements pVSVSStepOutputLevel2;
	private final VSVSStepOutputLevel1Elements pVSVSStepOutputLevel1;
	private final VSVSStepOutputLevel0Elements pVSVSStepOutputLevel0;
	private final VSVSStepLevel3FilterElements pVSVSStepLevel3Filter;
	private final VSVSStepLevel2FilterElements pVSVSStepLevel2Filter;
	private final VSVSStepLevel1FilterElements pVSVSStepLevel1Filter;
	private final VSVSStepLevel0FilterElements pVSVSStepLevel0Filter;
	private final VSVSStepYesNoElements eVSVSStepYesNo;
	private final VSVSStepEnableElements pVSVSStepEnable;
	private final VSVSStepDisableElements pVSVSStepDisable;
	private final VSVSStepEnablePrintElements pVSVSStepEnablePrint;
	private final VSVSStepDisablePrintElements pVSVSStepDisablePrint;
	private final VSVSStepNextStepElements pVSVSStepNextStep;
	private final VSVSStepConcurrentStepElements pVSVSStepConcurrentStep;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final TerminalRule tUINT_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SVSGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVSVSDocument = new VSVSDocumentElements();
		this.pDBody = new DBodyElements();
		this.pDBodyContent = new DBodyContentElements();
		this.pDParagraph = new DParagraphElements();
		this.pDListItem = new DListItemElements();
		this.pDListContent = new DListContentElements();
		this.pDItemize = new DItemizeElements();
		this.pDEnumerate = new DEnumerateElements();
		this.pDParagraphContent = new DParagraphContentElements();
		this.pDRun = new DRunElements();
		this.pDHyperlink = new DHyperlinkElements();
		this.pDText = new DTextElements();
		this.tRUNTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.RUNTEXT");
		this.pDFigureFromFile = new DFigureFromFileElements();
		this.pDTableFromFile = new DTableFromFileElements();
		this.pDBasicTable = new DBasicTableElements();
		this.pDRow = new DRowElements();
		this.pDColumn = new DColumnElements();
		this.pDCell = new DCellElements();
		this.pDApplicableDocument = new DApplicableDocumentElements();
		this.pDReferenceDocument = new DReferenceDocumentElements();
		this.pVSVSFixedSection = new VSVSFixedSectionElements();
		this.pVSVSInstantiableSection = new VSVSInstantiableSectionElements();
		this.pVSVSIntroduction = new VSVSIntroductionElements();
		this.pVSVSApplicableDocuments = new VSVSApplicableDocumentsElements();
		this.pVSVSReferenceDocuments = new VSVSReferenceDocumentsElements();
		this.pVSVSTermsDefinitionsAbbreviations = new VSVSTermsDefinitionsAbbreviationsElements();
		this.pVSVSSoftwareOverview = new VSVSSoftwareOverviewElements();
		this.pVSVSTaskIdentification = new VSVSTaskIdentificationElements();
		this.pVSVSTestingSpecificationDesign = new VSVSTestingSpecificationDesignElements();
		this.pVSVSTestCases = new VSVSTestCasesElements();
		this.pVSVSTestProcedures = new VSVSTestProceduresElements();
		this.pVSVSAnalysisInspectionReview = new VSVSAnalysisInspectionReviewElements();
		this.pVSVSTestPlatformRequirements = new VSVSTestPlatformRequirementsElements();
		this.pVSVSAdditionalInformation = new VSVSAdditionalInformationElements();
		this.pVSVSTerm = new VSVSTermElements();
		this.pVSVSDefinition = new VSVSDefinitionElements();
		this.pVSVSAbbreviation = new VSVSAbbreviationElements();
		this.pVSVSTestDesign = new VSVSTestDesignElements();
		this.pVSVSTestCase = new VSVSTestCaseElements();
		this.pVSVSTestProcedure = new VSVSTestProcedureElements();
		this.pVSVSProcedureSteps = new VSVSProcedureStepsElements();
		this.pVSVSProcedureStep = new VSVSProcedureStepElements();
		this.eVSVSStepMode = new VSVSStepModeElements();
		this.pVSVSStepInputs = new VSVSStepInputsElements();
		this.pVSVSStepOutputs = new VSVSStepOutputsElements();
		this.pVSVSStepSpecialPackets = new VSVSStepSpecialPacketsElements();
		this.pVSVSStepConcurrentSteps = new VSVSStepConcurrentStepsElements();
		this.pVSVSStepInputLevel3 = new VSVSStepInputLevel3Elements();
		this.pVSVSStepInputLevel2 = new VSVSStepInputLevel2Elements();
		this.pVSVSStepInputLevel1 = new VSVSStepInputLevel1Elements();
		this.pVSVSStepInputLevel0 = new VSVSStepInputLevel0Elements();
		this.eVSVSStepUnit = new VSVSStepUnitElements();
		this.eVSVSStepCheckmode = new VSVSStepCheckmodeElements();
		this.pVSVSStepOutputLevel3 = new VSVSStepOutputLevel3Elements();
		this.pVSVSStepOutputLevel2 = new VSVSStepOutputLevel2Elements();
		this.pVSVSStepOutputLevel1 = new VSVSStepOutputLevel1Elements();
		this.pVSVSStepOutputLevel0 = new VSVSStepOutputLevel0Elements();
		this.pVSVSStepLevel3Filter = new VSVSStepLevel3FilterElements();
		this.pVSVSStepLevel2Filter = new VSVSStepLevel2FilterElements();
		this.pVSVSStepLevel1Filter = new VSVSStepLevel1FilterElements();
		this.pVSVSStepLevel0Filter = new VSVSStepLevel0FilterElements();
		this.eVSVSStepYesNo = new VSVSStepYesNoElements();
		this.pVSVSStepEnable = new VSVSStepEnableElements();
		this.pVSVSStepDisable = new VSVSStepDisableElements();
		this.pVSVSStepEnablePrint = new VSVSStepEnablePrintElements();
		this.pVSVSStepDisablePrint = new VSVSStepDisablePrintElements();
		this.pVSVSStepNextStep = new VSVSStepNextStepElements();
		this.pVSVSStepConcurrentStep = new VSVSStepConcurrentStepElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.svm.lang.svs.SVS".equals(grammar.getName())) {
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

	
	//VSVSDocument:
	//	'<SVS'
	//	'name=' name=STRING
	//	'id=' id=STRING
	//	'issue=' issue=UINT_STRING
	//	'revision=' revision=UINT_STRING
	//	'date=' date=STRING
	//	'>' ('<parent' 'name=' parents+=[tdm::VTraceableDocument|STRING] '/>')*
	//	introductionSection=VSVSIntroduction
	//	applicableDocumentsSection=VSVSApplicableDocuments
	//	referenceDocumentsSection=VSVSReferenceDocuments
	//	termsDefinitionsAbbreviationsSection=VSVSTermsDefinitionsAbbreviations
	//	softwareOverviewSection=VSVSSoftwareOverview
	//	taskIdentificationSection=VSVSTaskIdentification
	//	testingSpecificationDesignSection=VSVSTestingSpecificationDesign
	//	testCasesSection=VSVSTestCases
	//	testProceduresSection=VSVSTestProcedures
	//	analysisInspectionReviewSection=VSVSAnalysisInspectionReview
	//	testPlatformRequirementsSection=VSVSTestPlatformRequirements
	//	additionalInformationSection=VSVSAdditionalInformation
	//	'</SVS>';
	public VSVSDocumentElements getVSVSDocumentAccess() {
		return pVSVSDocument;
	}
	
	public ParserRule getVSVSDocumentRule() {
		return getVSVSDocumentAccess().getRule();
	}
	
	//DBody doc::DBody:
	//	'<body>'
	//	bodyContent+=DBodyContent+
	//	'</body>'
	public DBodyElements getDBodyAccess() {
		return pDBody;
	}
	
	public ParserRule getDBodyRule() {
		return getDBodyAccess().getRule();
	}
	
	//DBodyContent doc::DBodyContent:
	//	DParagraph | DItemize | DEnumerate | DFigureFromFile | DTableFromFile | DBasicTable
	public DBodyContentElements getDBodyContentAccess() {
		return pDBodyContent;
	}
	
	public ParserRule getDBodyContentRule() {
		return getDBodyContentAccess().getRule();
	}
	
	//DParagraph doc::DParagraph:
	//	'<paragraph>'
	//	paragraphContent+=DParagraphContent+
	//	'</paragraph>'
	public DParagraphElements getDParagraphAccess() {
		return pDParagraph;
	}
	
	public ParserRule getDParagraphRule() {
		return getDParagraphAccess().getRule();
	}
	
	//DListItem doc::DListItem:
	//	'<listItem>'
	//	paragraph+=DParagraph+ ('<sublist>' sublist=DListContent '</sublist>')?
	//	'</listItem>'
	public DListItemElements getDListItemAccess() {
		return pDListItem;
	}
	
	public ParserRule getDListItemRule() {
		return getDListItemAccess().getRule();
	}
	
	//DListContent doc::DListContent:
	//	DItemize | DEnumerate
	public DListContentElements getDListContentAccess() {
		return pDListContent;
	}
	
	public ParserRule getDListContentRule() {
		return getDListContentAccess().getRule();
	}
	
	//DItemize doc::DItemize:
	//	'<itemize>'
	//	items+=DListItem+
	//	'</itemize>'
	public DItemizeElements getDItemizeAccess() {
		return pDItemize;
	}
	
	public ParserRule getDItemizeRule() {
		return getDItemizeAccess().getRule();
	}
	
	//DEnumerate doc::DEnumerate:
	//	'<enumerate>'
	//	items+=DListItem+
	//	'</enumerate>'
	public DEnumerateElements getDEnumerateAccess() {
		return pDEnumerate;
	}
	
	public ParserRule getDEnumerateRule() {
		return getDEnumerateAccess().getRule();
	}
	
	//DParagraphContent doc::DParagraphContent:
	//	DRun | DHyperlink
	public DParagraphContentElements getDParagraphContentAccess() {
		return pDParagraphContent;
	}
	
	public ParserRule getDParagraphContentRule() {
		return getDParagraphContentAccess().getRule();
	}
	
	//DRun doc::DRun:
	//	'<run'
	//	'bold="true"'?
	//	'italics="true"'?
	//	'underline="true"'?
	//	'>'
	//	text=DText
	//	'</run>'
	public DRunElements getDRunAccess() {
		return pDRun;
	}
	
	public ParserRule getDRunRule() {
		return getDRunAccess().getRule();
	}
	
	//DHyperlink doc::DHyperlink:
	//	'<hyperlink'
	//	'reference=' reference=[doc::DReferenceableObject|STRING]
	//	'>'
	//	run=DRun?
	//	'</hyperlink>'
	public DHyperlinkElements getDHyperlinkAccess() {
		return pDHyperlink;
	}
	
	public ParserRule getDHyperlinkRule() {
		return getDHyperlinkAccess().getRule();
	}
	
	//DText doc::DText:
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
	
	//DFigureFromFile doc::DFigureFromFile:
	//	'<figureFromFile'
	//	'name=' name=STRING
	//	'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)?
	//	'/>'
	public DFigureFromFileElements getDFigureFromFileAccess() {
		return pDFigureFromFile;
	}
	
	public ParserRule getDFigureFromFileRule() {
		return getDFigureFromFileAccess().getRule();
	}
	
	//DTableFromFile doc::DTableFromFile:
	//	'<tableFromFile'
	//	'name=' name=STRING
	//	'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)?
	//	'/>'
	public DTableFromFileElements getDTableFromFileAccess() {
		return pDTableFromFile;
	}
	
	public ParserRule getDTableFromFileRule() {
		return getDTableFromFileAccess().getRule();
	}
	
	//DBasicTable doc::DBasicTable:
	//	'<basicTable'
	//	'name=' name=STRING ('caption=' caption=STRING)?
	//	'>'
	//	rows+=DRow+
	//	'</basicTable>'
	public DBasicTableElements getDBasicTableAccess() {
		return pDBasicTable;
	}
	
	public ParserRule getDBasicTableRule() {
		return getDBasicTableAccess().getRule();
	}
	
	//DRow doc::DRow:
	//	'<row'
	//	'span=' span=STRING
	//	'>'
	//	columns+=DColumn+
	//	'</row>'
	public DRowElements getDRowAccess() {
		return pDRow;
	}
	
	public ParserRule getDRowRule() {
		return getDRowAccess().getRule();
	}
	
	//DColumn doc::DColumn:
	//	'<column'
	//	'span=' span=STRING
	//	'>'
	//	cells+=DCell+
	//	'</column>'
	public DColumnElements getDColumnAccess() {
		return pDColumn;
	}
	
	public ParserRule getDColumnRule() {
		return getDColumnAccess().getRule();
	}
	
	//DCell doc::DCell:
	//	'<cell'
	//	'span=' span=STRING
	//	'>'
	//	bodyContent+=DBodyContent+
	//	'</cell>'
	public DCellElements getDCellAccess() {
		return pDCell;
	}
	
	public ParserRule getDCellRule() {
		return getDCellAccess().getRule();
	}
	
	//DApplicableDocument doc::DApplicableDocument:
	//	'<ApplicableDocument'
	//	'name=' name=STRING
	//	'title=' title=STRING
	//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)?
	//	'/>'
	public DApplicableDocumentElements getDApplicableDocumentAccess() {
		return pDApplicableDocument;
	}
	
	public ParserRule getDApplicableDocumentRule() {
		return getDApplicableDocumentAccess().getRule();
	}
	
	//DReferenceDocument doc::DReferenceDocument:
	//	'<ReferenceDocument'
	//	'name=' name=STRING
	//	'title=' title=STRING
	//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)?
	//	'/>'
	public DReferenceDocumentElements getDReferenceDocumentAccess() {
		return pDReferenceDocument;
	}
	
	public ParserRule getDReferenceDocumentRule() {
		return getDReferenceDocumentAccess().getRule();
	}
	
	//VSVSFixedSection:
	//	{VSVSFixedSection} body=DBody?
	//	svsInstatiableSubsections+=VSVSInstantiableSection*;
	public VSVSFixedSectionElements getVSVSFixedSectionAccess() {
		return pVSVSFixedSection;
	}
	
	public ParserRule getVSVSFixedSectionRule() {
		return getVSVSFixedSectionAccess().getRule();
	}
	
	//VSVSInstantiableSection:
	//	'<subsection'
	//	'name=' name=STRING
	//	'>'
	//	body=DBody?
	//	svsInstatiableSubsections+=VSVSInstantiableSection*
	//	'</subsection>';
	public VSVSInstantiableSectionElements getVSVSInstantiableSectionAccess() {
		return pVSVSInstantiableSection;
	}
	
	public ParserRule getVSVSInstantiableSectionRule() {
		return getVSVSInstantiableSectionAccess().getRule();
	}
	
	//VSVSIntroduction:
	//	'<Introduction>'
	//	svsInstatiableSubsections+=VSVSInstantiableSection+
	//	'</Introduction>';
	public VSVSIntroductionElements getVSVSIntroductionAccess() {
		return pVSVSIntroduction;
	}
	
	public ParserRule getVSVSIntroductionRule() {
		return getVSVSIntroductionAccess().getRule();
	}
	
	//VSVSApplicableDocuments:
	//	{VSVSApplicableDocuments}
	//	'<ApplicableDocuments>'
	//	applicableDocuments+=DApplicableDocument*
	//	'</ApplicableDocuments>';
	public VSVSApplicableDocumentsElements getVSVSApplicableDocumentsAccess() {
		return pVSVSApplicableDocuments;
	}
	
	public ParserRule getVSVSApplicableDocumentsRule() {
		return getVSVSApplicableDocumentsAccess().getRule();
	}
	
	//VSVSReferenceDocuments:
	//	{VSVSReferenceDocuments}
	//	'<ReferenceDocuments>'
	//	referenceDocuments+=DReferenceDocument*
	//	'</ReferenceDocuments>';
	public VSVSReferenceDocumentsElements getVSVSReferenceDocumentsAccess() {
		return pVSVSReferenceDocuments;
	}
	
	public ParserRule getVSVSReferenceDocumentsRule() {
		return getVSVSReferenceDocumentsAccess().getRule();
	}
	
	//VSVSTermsDefinitionsAbbreviations:
	//	{VSVSTermsDefinitionsAbbreviations}
	//	'<TermsDefinitionsAbbreviations>'
	//	terms+=VSVSTerm*
	//	definitions+=VSVSDefinition*
	//	abbreviations+=VSVSAbbreviation*
	//	'</TermsDefinitionsAbbreviations>';
	public VSVSTermsDefinitionsAbbreviationsElements getVSVSTermsDefinitionsAbbreviationsAccess() {
		return pVSVSTermsDefinitionsAbbreviations;
	}
	
	public ParserRule getVSVSTermsDefinitionsAbbreviationsRule() {
		return getVSVSTermsDefinitionsAbbreviationsAccess().getRule();
	}
	
	//VSVSSoftwareOverview:
	//	{VSVSSoftwareOverview}
	//	'<SoftwareOverview>'
	//	body=DBody?
	//	svsInstatiableSubsections+=VSVSInstantiableSection*
	//	'</SoftwareOverview>';
	public VSVSSoftwareOverviewElements getVSVSSoftwareOverviewAccess() {
		return pVSVSSoftwareOverview;
	}
	
	public ParserRule getVSVSSoftwareOverviewRule() {
		return getVSVSSoftwareOverviewAccess().getRule();
	}
	
	//VSVSTaskIdentification:
	//	'<TaskIdentification>'
	//	'<TaskCriteria>' taskCriteria=VSVSFixedSection '</TaskCriteria>'
	//	'<FeaturesToBeTested>' featuresToBeTested=VSVSFixedSection '</FeaturesToBeTested>'
	//	'<FeaturesNotToBeTested>' featuresNotToBeTested=VSVSFixedSection '</FeaturesNotToBeTested>'
	//	'<TestPassFailCriteria>' testPassFailCriteria=VSVSFixedSection '</TestPassFailCriteria>'
	//	'<ItemsCanNotBeValidated>' itemsCanNotBeValidated=VSVSFixedSection '</ItemsCanNotBeValidated>'
	//	'<ManuallyAutoGeneratedCode>' manuallyAutoGeneratedCode=VSVSFixedSection '</ManuallyAutoGeneratedCode>'
	//	'</TaskIdentification>';
	public VSVSTaskIdentificationElements getVSVSTaskIdentificationAccess() {
		return pVSVSTaskIdentification;
	}
	
	public ParserRule getVSVSTaskIdentificationRule() {
		return getVSVSTaskIdentificationAccess().getRule();
	}
	
	//VSVSTestingSpecificationDesign:
	//	'<TestingSpecificationDesign>'
	//	'<General>' general=VSVSFixedSection '</General>'
	//	testDesigns+=VSVSTestDesign+
	//	'</TestingSpecificationDesign>';
	public VSVSTestingSpecificationDesignElements getVSVSTestingSpecificationDesignAccess() {
		return pVSVSTestingSpecificationDesign;
	}
	
	public ParserRule getVSVSTestingSpecificationDesignRule() {
		return getVSVSTestingSpecificationDesignAccess().getRule();
	}
	
	//VSVSTestCases:
	//	'<TestCases>'
	//	'<General>' general=VSVSFixedSection '</General>'
	//	testCases+=VSVSTestCase+
	//	'</TestCases>';
	public VSVSTestCasesElements getVSVSTestCasesAccess() {
		return pVSVSTestCases;
	}
	
	public ParserRule getVSVSTestCasesRule() {
		return getVSVSTestCasesAccess().getRule();
	}
	
	//VSVSTestProcedures:
	//	'<TestProcedures>'
	//	'<General>' general=VSVSFixedSection '</General>'
	//	testProcedures+=VSVSTestProcedure+
	//	'</TestProcedures>';
	public VSVSTestProceduresElements getVSVSTestProceduresAccess() {
		return pVSVSTestProcedures;
	}
	
	public ParserRule getVSVSTestProceduresRule() {
		return getVSVSTestProceduresAccess().getRule();
	}
	
	//VSVSAnalysisInspectionReview:
	//	{VSVSAnalysisInspectionReview}
	//	'<AnalysisInspectionReview>'
	//	body=DBody?
	//	svsInstatiableSubsections+=VSVSInstantiableSection*
	//	'</AnalysisInspectionReview>';
	public VSVSAnalysisInspectionReviewElements getVSVSAnalysisInspectionReviewAccess() {
		return pVSVSAnalysisInspectionReview;
	}
	
	public ParserRule getVSVSAnalysisInspectionReviewRule() {
		return getVSVSAnalysisInspectionReviewAccess().getRule();
	}
	
	//VSVSTestPlatformRequirements:
	//	{VSVSTestPlatformRequirements}
	//	'<TestPlatformRequirements>'
	//	body=DBody?
	//	svsInstatiableSubsections+=VSVSInstantiableSection*
	//	'</TestPlatformRequirements>';
	public VSVSTestPlatformRequirementsElements getVSVSTestPlatformRequirementsAccess() {
		return pVSVSTestPlatformRequirements;
	}
	
	public ParserRule getVSVSTestPlatformRequirementsRule() {
		return getVSVSTestPlatformRequirementsAccess().getRule();
	}
	
	//VSVSAdditionalInformation:
	//	{VSVSAdditionalInformation}
	//	'<AdditionalInformation>'
	//	body=DBody?
	//	svsInstatiableSubsections+=VSVSInstantiableSection*
	//	'</AdditionalInformation>';
	public VSVSAdditionalInformationElements getVSVSAdditionalInformationAccess() {
		return pVSVSAdditionalInformation;
	}
	
	public ParserRule getVSVSAdditionalInformationRule() {
		return getVSVSAdditionalInformationAccess().getRule();
	}
	
	//VSVSTerm:
	//	'<Term'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Term>';
	public VSVSTermElements getVSVSTermAccess() {
		return pVSVSTerm;
	}
	
	public ParserRule getVSVSTermRule() {
		return getVSVSTermAccess().getRule();
	}
	
	//VSVSDefinition:
	//	'<Definition'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Definition>';
	public VSVSDefinitionElements getVSVSDefinitionAccess() {
		return pVSVSDefinition;
	}
	
	public ParserRule getVSVSDefinitionRule() {
		return getVSVSDefinitionAccess().getRule();
	}
	
	//VSVSAbbreviation:
	//	'<Abbreviation'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Abbreviation>';
	public VSVSAbbreviationElements getVSVSAbbreviationAccess() {
		return pVSVSAbbreviation;
	}
	
	public ParserRule getVSVSAbbreviationRule() {
		return getVSVSAbbreviationAccess().getRule();
	}
	
	//VSVSTestDesign:
	//	'<TestDesign'
	//	'name=' name=STRING
	//	'>'
	//	'<General>' general=VSVSFixedSection '</General>'
	//	'<FeaturesToBeTested>' featuresToBeTested=VSVSFixedSection '</FeaturesToBeTested>'
	//	'<ApproachRefinements>' approachRefinements=VSVSFixedSection '</ApproachRefinements>'
	//	'</TestDesign>';
	public VSVSTestDesignElements getVSVSTestDesignAccess() {
		return pVSVSTestDesign;
	}
	
	public ParserRule getVSVSTestDesignRule() {
		return getVSVSTestDesignAccess().getRule();
	}
	
	//VSVSTestCase:
	//	'<TestCase'
	//	'name=' name=STRING
	//	'>'
	//	'<Identifier>' identifier=VSVSFixedSection '</Identifier>'
	//	'<Inputs>' inputs=VSVSFixedSection '</Inputs>'
	//	'<Outputs>' outputs=VSVSFixedSection '</Outputs>'
	//	'<PassFailCriteria>' passFailCriteria=VSVSFixedSection '</PassFailCriteria>'
	//	'<EnvironmentalNeeds>' environmentalNeeds=VSVSFixedSection '</EnvironmentalNeeds>'
	//	'<SpecialConstraints>' specialConstraints=VSVSFixedSection '</SpecialConstraints>'
	//	'<InterfaceDependencies>' interfaceDependencies=VSVSFixedSection '</InterfaceDependencies>' ('<ValidatingItems'
	//	'name=' validatingItems+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+
	//	'</TestCase>';
	public VSVSTestCaseElements getVSVSTestCaseAccess() {
		return pVSVSTestCase;
	}
	
	public ParserRule getVSVSTestCaseRule() {
		return getVSVSTestCaseAccess().getRule();
	}
	
	//VSVSTestProcedure:
	//	'<TestProcedure'
	//	'name=' name=STRING
	//	'>'
	//	'<Identifier>' identifier=VSVSFixedSection '</Identifier>'
	//	'<Purpose>' purpose=VSVSFixedSection '</Purpose>' ('<TestCase' 'name=' testCase+=[VSVSTestCase|STRING] '/>')*
	//	procedureSteps=VSVSProcedureSteps
	//	'<TestScript>' testScript=VSVSFixedSection '</TestScript>'
	//	'</TestProcedure>';
	public VSVSTestProcedureElements getVSVSTestProcedureAccess() {
		return pVSVSTestProcedure;
	}
	
	public ParserRule getVSVSTestProcedureRule() {
		return getVSVSTestProcedureAccess().getRule();
	}
	
	//VSVSProcedureSteps:
	//	'<ProcedureSteps'
	//	'name=' name=STRING
	//	'>'
	//	step+=VSVSProcedureStep+
	//	'</ProcedureSteps>';
	public VSVSProcedureStepsElements getVSVSProcedureStepsAccess() {
		return pVSVSProcedureSteps;
	}
	
	public ParserRule getVSVSProcedureStepsRule() {
		return getVSVSProcedureStepsAccess().getRule();
	}
	
	//VSVSProcedureStep:
	//	'<step'
	//	'name=' name=STRING
	//	'id=' id=UINT_STRING ('prev_step_idref=' prev_step_idref=[VSVSProcedureStep|STRING])? ('output_idref_from_prev_step='
	//	output_idref_from_prev_step=[VSVSStepOutput|STRING])?
	//	'mode=' mode=VSVSStepMode ('replays=' replays=STRING)?
	//	'>'
	//	inputs=VSVSStepInputs
	//	outputs=VSVSStepOutputs?
	//	specialPackets=VSVSStepSpecialPackets?
	//	concurrent_steps=VSVSStepConcurrentSteps?
	//	'</step>';
	public VSVSProcedureStepElements getVSVSProcedureStepAccess() {
		return pVSVSProcedureStep;
	}
	
	public ParserRule getVSVSProcedureStepRule() {
		return getVSVSProcedureStepAccess().getRule();
	}
	
	//enum VSVSStepMode:
	//	continuous='"continuous"' | manual='"manual"' |
	//	concurrent='"concurrent"';
	public VSVSStepModeElements getVSVSStepModeAccess() {
		return eVSVSStepMode;
	}
	
	public EnumRule getVSVSStepModeRule() {
		return getVSVSStepModeAccess().getRule();
	}
	
	//VSVSStepInputs:
	//	{VSVSStepInputs}
	//	'<inputs>' (input_level_3+=VSVSStepInputLevel3 | input_level_2+=VSVSStepInputLevel2 |
	//	input_level_1+=VSVSStepInputLevel1 | input_level_0+=VSVSStepInputLevel0)+
	//	'</inputs>';
	public VSVSStepInputsElements getVSVSStepInputsAccess() {
		return pVSVSStepInputs;
	}
	
	public ParserRule getVSVSStepInputsRule() {
		return getVSVSStepInputsAccess().getRule();
	}
	
	//VSVSStepOutputs:
	//	'<outputs'
	//	'checkmode=' checkmode=VSVSStepCheckmode
	//	'valid_time_interval_value=' valid_time_interval_value=UINT_STRING
	//	'valid_time_interval_unit=' valid_time_interval_unit=VSVSStepUnit
	//	'>' (output_level_3+=VSVSStepOutputLevel3 | output_level_2+=VSVSStepOutputLevel2 |
	//	output_level_1+=VSVSStepOutputLevel1 | output_level_0+=VSVSStepOutputLevel0)+
	//	'</outputs>';
	public VSVSStepOutputsElements getVSVSStepOutputsAccess() {
		return pVSVSStepOutputs;
	}
	
	public ParserRule getVSVSStepOutputsRule() {
		return getVSVSStepOutputsAccess().getRule();
	}
	
	//VSVSStepSpecialPackets:
	//	{VSVSStepSpecialPackets}
	//	'<specialPackets>' (enable+=VSVSStepEnable | disable+=VSVSStepDisable | enable_print+=VSVSStepEnablePrint |
	//	disable_print+=VSVSStepDisablePrint)+
	//	'</specialPackets>';
	public VSVSStepSpecialPacketsElements getVSVSStepSpecialPacketsAccess() {
		return pVSVSStepSpecialPackets;
	}
	
	public ParserRule getVSVSStepSpecialPacketsRule() {
		return getVSVSStepSpecialPacketsAccess().getRule();
	}
	
	//VSVSStepConcurrentSteps:
	//	'<concurrent_steps'
	//	'nextStep=' nextStep=VSVSStepNextStep
	//	'>'
	//	concurrent_step+=VSVSStepConcurrentStep+
	//	'</concurrent_steps>';
	public VSVSStepConcurrentStepsElements getVSVSStepConcurrentStepsAccess() {
		return pVSVSStepConcurrentSteps;
	}
	
	public ParserRule getVSVSStepConcurrentStepsRule() {
		return getVSVSStepConcurrentStepsAccess().getRule();
	}
	
	//VSVSStepInputLevel3:
	//	'<input_level_3'
	//	'name=' name=STRING
	//	'ifRef=' ifRef=UINT_STRING
	//	'delay_value=' delay_value=UINT_STRING
	//	'delay_unit=' delay_unit=VSVSStepUnit
	//	'>' ('<level3' level3=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	'<app_to_level3' app_to_level3=[export::TMTCIFExportExport|STRING] '/>' ('<level2' 'format='
	//	level2=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level3_to_level2' 'export='
	//	level3_to_level2=[export::TMTCIFExportExport|STRING] '/>')? ('<level1' 'format='
	//	level1=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level2_to_level1' 'export='
	//	level2_to_level1=[export::TMTCIFExportExport|STRING] '/>')? ('<level0' 'format='
	//	level0=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level1_to_level0' 'export='
	//	level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')?
	//	'</input_level_3>';
	public VSVSStepInputLevel3Elements getVSVSStepInputLevel3Access() {
		return pVSVSStepInputLevel3;
	}
	
	public ParserRule getVSVSStepInputLevel3Rule() {
		return getVSVSStepInputLevel3Access().getRule();
	}
	
	//VSVSStepInputLevel2:
	//	'<input_level_2'
	//	'name=' name=STRING
	//	'ifRef=' ifRef=UINT_STRING
	//	'delay_value=' delay_value=UINT_STRING
	//	'delay_unit=' delay_unit=VSVSStepUnit
	//	'>' ('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	'<app_to_level2' 'export=' app_to_level2=[export::TMTCIFExportExport|STRING] '/>' ('<level1' 'format='
	//	level1=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level2_to_level1' 'export='
	//	level2_to_level1=[export::TMTCIFExportExport|STRING] '/>')? ('<level0' 'format='
	//	level0=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level1_to_level0' 'export='
	//	level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')?
	//	'</input_level_2>';
	public VSVSStepInputLevel2Elements getVSVSStepInputLevel2Access() {
		return pVSVSStepInputLevel2;
	}
	
	public ParserRule getVSVSStepInputLevel2Rule() {
		return getVSVSStepInputLevel2Access().getRule();
	}
	
	//VSVSStepInputLevel1:
	//	'<input_level_1'
	//	'name=' name=STRING
	//	'ifRef=' ifRef=UINT_STRING
	//	'delay_value=' delay_value=UINT_STRING
	//	'delay_unit=' delay_unit=VSVSStepUnit
	//	'>' ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	'<app_to_level1' 'export=' app_to_level1=[export::TMTCIFExportExport|STRING] '/>' ('<level0' 'format='
	//	level0=[format::TMTCIFFormatFormat|STRING] '/>')? ('<level1_to_level0' 'export='
	//	level1_to_level0=[export::TMTCIFExportExport|STRING] '/>')?
	//	'</input_level_1>';
	public VSVSStepInputLevel1Elements getVSVSStepInputLevel1Access() {
		return pVSVSStepInputLevel1;
	}
	
	public ParserRule getVSVSStepInputLevel1Rule() {
		return getVSVSStepInputLevel1Access().getRule();
	}
	
	//VSVSStepInputLevel0:
	//	'<input_level_0'
	//	'name=' name=STRING
	//	'ifRef=' ifRef=UINT_STRING
	//	'delay_value=' delay_value=UINT_STRING
	//	'delay_unit=' delay_unit=VSVSStepUnit
	//	'>' ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	'<app_to_level0' 'export=' app_to_level0=[export::TMTCIFExportExport|STRING] '/>'
	//	'</input_level_0>';
	public VSVSStepInputLevel0Elements getVSVSStepInputLevel0Access() {
		return pVSVSStepInputLevel0;
	}
	
	public ParserRule getVSVSStepInputLevel0Rule() {
		return getVSVSStepInputLevel0Access().getRule();
	}
	
	//enum VSVSStepUnit:
	//	miliseconds='"miliseconds"' | seconds='"seconds"';
	public VSVSStepUnitElements getVSVSStepUnitAccess() {
		return eVSVSStepUnit;
	}
	
	public EnumRule getVSVSStepUnitRule() {
		return getVSVSStepUnitAccess().getRule();
	}
	
	//enum VSVSStepCheckmode:
	//	all='"all"' | allunsorted='"allunsorted"' | any='"any"';
	public VSVSStepCheckmodeElements getVSVSStepCheckmodeAccess() {
		return eVSVSStepCheckmode;
	}
	
	public EnumRule getVSVSStepCheckmodeRule() {
		return getVSVSStepCheckmodeAccess().getRule();
	}
	
	//VSVSStepOutputLevel3:
	//	'<output_level_3'
	//	'name=' name=STRING
	//	'id=' id=UINT_STRING
	//	'ifRef=' ifRef=UINT_STRING ('optional=' optional=UINT_STRING)?
	//	'>' ('<level3' 'format=' level3=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	level3_filter=VSVSStepLevel3Filter ('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	('<level3_from_level2' 'import=' level3_from_level2=[import_::TMTCIFImportImport|STRING] '/>')?
	//	level2_filter=VSVSStepLevel2Filter ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	('<level2_from_level1' 'import=' level2_from_level1=[import_::TMTCIFImportImport|STRING] '/>')?
	//	level1_filter=VSVSStepLevel1Filter ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
	//	level0_filter=VSVSStepLevel0Filter
	//	'</output_level_3>';
	public VSVSStepOutputLevel3Elements getVSVSStepOutputLevel3Access() {
		return pVSVSStepOutputLevel3;
	}
	
	public ParserRule getVSVSStepOutputLevel3Rule() {
		return getVSVSStepOutputLevel3Access().getRule();
	}
	
	//VSVSStepOutputLevel2:
	//	'<output_level_2'
	//	'name=' name=STRING
	//	'id=' id=UINT_STRING
	//	'ifRef=' ifRef=UINT_STRING ('optional=' optional=UINT_STRING)?
	//	'>' ('<level2' 'format=' level2=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	level2_filter=VSVSStepLevel2Filter ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	('<level2_from_level1' 'import=' level2_from_level1=[import_::TMTCIFImportImport|STRING] '/>')?
	//	level1_filter=VSVSStepLevel1Filter ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
	//	level0_filter=VSVSStepLevel0Filter
	//	'</output_level_2>';
	public VSVSStepOutputLevel2Elements getVSVSStepOutputLevel2Access() {
		return pVSVSStepOutputLevel2;
	}
	
	public ParserRule getVSVSStepOutputLevel2Rule() {
		return getVSVSStepOutputLevel2Access().getRule();
	}
	
	//VSVSStepOutputLevel1:
	//	'<output_level_1'
	//	'name=' name=STRING
	//	'id=' id=UINT_STRING
	//	'ifRef=' ifRef=UINT_STRING ('optional=' optional=UINT_STRING)?
	//	'>' ('<level1' 'format=' level1=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	level1_filter=VSVSStepLevel1Filter ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	('<level1_from_level0' 'import=' level1_from_level0=[import_::TMTCIFImportImport|STRING] '/>')?
	//	level0_filter=VSVSStepLevel0Filter
	//	'</output_level_1>';
	public VSVSStepOutputLevel1Elements getVSVSStepOutputLevel1Access() {
		return pVSVSStepOutputLevel1;
	}
	
	public ParserRule getVSVSStepOutputLevel1Rule() {
		return getVSVSStepOutputLevel1Access().getRule();
	}
	
	//VSVSStepOutputLevel0:
	//	'<output_level_0'
	//	'name=' name=STRING
	//	'id=' id=UINT_STRING
	//	'ifRef=' ifRef=UINT_STRING ('optional=' optional=UINT_STRING)?
	//	'>' ('<level0' 'format=' level0=[format::TMTCIFFormatFormat|STRING] '/>')?
	//	level0_filter=VSVSStepLevel0Filter
	//	'</output_level_0>';
	public VSVSStepOutputLevel0Elements getVSVSStepOutputLevel0Access() {
		return pVSVSStepOutputLevel0;
	}
	
	public ParserRule getVSVSStepOutputLevel0Rule() {
		return getVSVSStepOutputLevel0Access().getRule();
	}
	
	//VSVSStepLevel3Filter VSVSStepFilter:
	//	'<level3_filter'
	//	'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
	//	extra_filter=[filter::TMTCIFFilterFilter|STRING])?
	//	'/>'
	public VSVSStepLevel3FilterElements getVSVSStepLevel3FilterAccess() {
		return pVSVSStepLevel3Filter;
	}
	
	public ParserRule getVSVSStepLevel3FilterRule() {
		return getVSVSStepLevel3FilterAccess().getRule();
	}
	
	//VSVSStepLevel2Filter VSVSStepFilter:
	//	'<level2_filter'
	//	'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
	//	extra_filter=[filter::TMTCIFFilterFilter|STRING])?
	//	'/>'
	public VSVSStepLevel2FilterElements getVSVSStepLevel2FilterAccess() {
		return pVSVSStepLevel2Filter;
	}
	
	public ParserRule getVSVSStepLevel2FilterRule() {
		return getVSVSStepLevel2FilterAccess().getRule();
	}
	
	//VSVSStepLevel1Filter VSVSStepFilter:
	//	'<level1_filter'
	//	'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
	//	extra_filter=[filter::TMTCIFFilterFilter|STRING])?
	//	'/>'
	public VSVSStepLevel1FilterElements getVSVSStepLevel1FilterAccess() {
		return pVSVSStepLevel1Filter;
	}
	
	public ParserRule getVSVSStepLevel1FilterRule() {
		return getVSVSStepLevel1FilterAccess().getRule();
	}
	
	//VSVSStepLevel0Filter VSVSStepFilter:
	//	'<level0_filter'
	//	'apply_def_filter=' apply_def_filter=VSVSStepYesNo ('extra_filter='
	//	extra_filter=[filter::TMTCIFFilterFilter|STRING])?
	//	'/>'
	public VSVSStepLevel0FilterElements getVSVSStepLevel0FilterAccess() {
		return pVSVSStepLevel0Filter;
	}
	
	public ParserRule getVSVSStepLevel0FilterRule() {
		return getVSVSStepLevel0FilterAccess().getRule();
	}
	
	//enum VSVSStepYesNo:
	//	yes='"yes"' | no='"no"';
	public VSVSStepYesNoElements getVSVSStepYesNoAccess() {
		return eVSVSStepYesNo;
	}
	
	public EnumRule getVSVSStepYesNoRule() {
		return getVSVSStepYesNoAccess().getRule();
	}
	
	//VSVSStepEnable VSVSStepEnableDisable:
	//	'<enable'
	//	'id=' id=UINT_STRING
	//	'/>'
	public VSVSStepEnableElements getVSVSStepEnableAccess() {
		return pVSVSStepEnable;
	}
	
	public ParserRule getVSVSStepEnableRule() {
		return getVSVSStepEnableAccess().getRule();
	}
	
	//VSVSStepDisable VSVSStepEnableDisable:
	//	'<disable'
	//	'id=' id=UINT_STRING
	//	'/>'
	public VSVSStepDisableElements getVSVSStepDisableAccess() {
		return pVSVSStepDisable;
	}
	
	public ParserRule getVSVSStepDisableRule() {
		return getVSVSStepDisableAccess().getRule();
	}
	
	//VSVSStepEnablePrint VSVSStepEnableDisable:
	//	'<enable_print'
	//	'id=' id=UINT_STRING
	//	'/>'
	public VSVSStepEnablePrintElements getVSVSStepEnablePrintAccess() {
		return pVSVSStepEnablePrint;
	}
	
	public ParserRule getVSVSStepEnablePrintRule() {
		return getVSVSStepEnablePrintAccess().getRule();
	}
	
	//VSVSStepDisablePrint VSVSStepEnableDisable:
	//	'<disable_print'
	//	'id=' id=UINT_STRING
	//	'/>'
	public VSVSStepDisablePrintElements getVSVSStepDisablePrintAccess() {
		return pVSVSStepDisablePrint;
	}
	
	public ParserRule getVSVSStepDisablePrintRule() {
		return getVSVSStepDisablePrintAccess().getRule();
	}
	
	//VSVSStepNextStep:
	//	'<nextStep'
	//	'id=' id=UINT_STRING
	//	'isConcurrent=' isConcurrent=VSVSStepYesNo
	//	'/>';
	public VSVSStepNextStepElements getVSVSStepNextStepAccess() {
		return pVSVSStepNextStep;
	}
	
	public ParserRule getVSVSStepNextStepRule() {
		return getVSVSStepNextStepAccess().getRule();
	}
	
	//VSVSStepConcurrentStep:
	//	'<concurrent_step'
	//	'id=' id=UINT_STRING
	//	'/>';
	public VSVSStepConcurrentStepElements getVSVSStepConcurrentStepAccess() {
		return pVSVSStepConcurrentStep;
	}
	
	public ParserRule getVSVSStepConcurrentStepRule() {
		return getVSVSStepConcurrentStepAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Version:
	//	(INT | INT? ID) ('.' (INT | INT? ID))*;
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}
	
	//VersionedQualifiedName:
	//	QualifiedName '(' Version ')';
	public VersionedQualifiedNameElements getVersionedQualifiedNameAccess() {
		return pVersionedQualifiedName;
	}
	
	public ParserRule getVersionedQualifiedNameRule() {
		return getVersionedQualifiedNameAccess().getRule();
	}
	
	//VersionedQualifiedReferenceName:
	//	(VersionedQualifiedName '::')? ID ('::' ID)*;
	public VersionedQualifiedReferenceNameElements getVersionedQualifiedReferenceNameAccess() {
		return pVersionedQualifiedReferenceName;
	}
	
	public ParserRule getVersionedQualifiedReferenceNameRule() {
		return getVersionedQualifiedReferenceNameAccess().getRule();
	}
	
	//terminal HEXADECIMAL:
	//	'0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+;
	public TerminalRule getHEXADECIMALRule() {
		return tHEXADECIMAL;
	}
	
	//INTEGER:
	//	'-'? INT | HEXADECIMAL;
	public INTEGERElements getINTEGERAccess() {
		return pINTEGER;
	}
	
	public ParserRule getINTEGERRule() {
		return getINTEGERAccess().getRule();
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
