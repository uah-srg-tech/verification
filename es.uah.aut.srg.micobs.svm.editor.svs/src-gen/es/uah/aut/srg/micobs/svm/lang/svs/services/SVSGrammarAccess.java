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
		
		//DBody doctpl::DBody:
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
		
		//DBodyContent doctpl::DBodyContent:
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
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAlignmentKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAlignmentAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_2_1_0 = (RuleCall)cAlignmentAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cStyleKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cStyleAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cStyleAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cIndentKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cIndentAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cIndentREAL_STRINGTerminalRuleCall_4_1_0 = (RuleCall)cIndentAssignment_4_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cParagraphContentAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cParagraphContentDParagraphContentParserRuleCall_6_0 = (RuleCall)cParagraphContentAssignment_6.eContents().get(0);
		private final Keyword cParagraphKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DParagraph doctpl::DParagraph:
		//	'<paragraph' ('name=' name=STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
		//	indent=REAL_STRING)?
		//	'>'
		//	paragraphContent+=DParagraphContent+
		//	'</paragraph>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<paragraph' ('name=' name=STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
		//indent=REAL_STRING)? '>' paragraphContent+=DParagraphContent+ '</paragraph>'
		public Group getGroup() { return cGroup; }
		
		//'<paragraph'
		public Keyword getParagraphKeyword_0() { return cParagraphKeyword_0; }
		
		//('name=' name=STRING)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'name='
		public Keyword getNameKeyword_1_0() { return cNameKeyword_1_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_1_0() { return cNameSTRINGTerminalRuleCall_1_1_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_2_0() { return cAlignmentKeyword_2_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_2_1() { return cAlignmentAssignment_2_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_2_1_0() { return cAlignmentDAlignmentEnumRuleCall_2_1_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'style='
		public Keyword getStyleKeyword_3_0() { return cStyleKeyword_3_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_3_1() { return cStyleAssignment_3_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_3_1_0() { return cStyleSTRINGTerminalRuleCall_3_1_0; }
		
		//('indent=' indent=REAL_STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'indent='
		public Keyword getIndentKeyword_4_0() { return cIndentKeyword_4_0; }
		
		//indent=REAL_STRING
		public Assignment getIndentAssignment_4_1() { return cIndentAssignment_4_1; }
		
		//REAL_STRING
		public RuleCall getIndentREAL_STRINGTerminalRuleCall_4_1_0() { return cIndentREAL_STRINGTerminalRuleCall_4_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//paragraphContent+=DParagraphContent+
		public Assignment getParagraphContentAssignment_6() { return cParagraphContentAssignment_6; }
		
		//DParagraphContent
		public RuleCall getParagraphContentDParagraphContentParserRuleCall_6_0() { return cParagraphContentDParagraphContentParserRuleCall_6_0; }
		
		//'</paragraph>'
		public Keyword getParagraphKeyword_7() { return cParagraphKeyword_7; }
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
		
		//DListItem doctpl::DListItem:
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
		
		//DListContent doctpl::DListContent:
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
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAlignmentKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAlignmentAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_2_1_0 = (RuleCall)cAlignmentAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cStyleKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cStyleAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cStyleAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cIndentKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cIndentAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cIndentREAL_STRINGTerminalRuleCall_4_1_0 = (RuleCall)cIndentAssignment_4_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cItemsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cItemsDListItemParserRuleCall_6_0 = (RuleCall)cItemsAssignment_6.eContents().get(0);
		private final Keyword cItemizeKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DItemize doctpl::DItemize:
		//	'<itemize' ('name=' name=STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
		//	indent=REAL_STRING)?
		//	'>'
		//	items+=DListItem+
		//	'</itemize>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<itemize' ('name=' name=STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
		//indent=REAL_STRING)? '>' items+=DListItem+ '</itemize>'
		public Group getGroup() { return cGroup; }
		
		//'<itemize'
		public Keyword getItemizeKeyword_0() { return cItemizeKeyword_0; }
		
		//('name=' name=STRING)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'name='
		public Keyword getNameKeyword_1_0() { return cNameKeyword_1_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_1_0() { return cNameSTRINGTerminalRuleCall_1_1_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_2_0() { return cAlignmentKeyword_2_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_2_1() { return cAlignmentAssignment_2_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_2_1_0() { return cAlignmentDAlignmentEnumRuleCall_2_1_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'style='
		public Keyword getStyleKeyword_3_0() { return cStyleKeyword_3_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_3_1() { return cStyleAssignment_3_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_3_1_0() { return cStyleSTRINGTerminalRuleCall_3_1_0; }
		
		//('indent=' indent=REAL_STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'indent='
		public Keyword getIndentKeyword_4_0() { return cIndentKeyword_4_0; }
		
		//indent=REAL_STRING
		public Assignment getIndentAssignment_4_1() { return cIndentAssignment_4_1; }
		
		//REAL_STRING
		public RuleCall getIndentREAL_STRINGTerminalRuleCall_4_1_0() { return cIndentREAL_STRINGTerminalRuleCall_4_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//items+=DListItem+
		public Assignment getItemsAssignment_6() { return cItemsAssignment_6; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_6_0() { return cItemsDListItemParserRuleCall_6_0; }
		
		//'</itemize>'
		public Keyword getItemizeKeyword_7() { return cItemizeKeyword_7; }
	}
	public class DEnumerateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DEnumerate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumerateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cNameKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAlignmentKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAlignmentAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_2_1_0 = (RuleCall)cAlignmentAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cStyleKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cStyleAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cStyleAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cIndentKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cIndentAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cIndentREAL_STRINGTerminalRuleCall_4_1_0 = (RuleCall)cIndentAssignment_4_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cItemsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cItemsDListItemParserRuleCall_6_0 = (RuleCall)cItemsAssignment_6.eContents().get(0);
		private final Keyword cEnumerateKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DEnumerate doctpl::DEnumerate:
		//	'<enumerate' ('name=' name=STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
		//	indent=REAL_STRING)?
		//	'>'
		//	items+=DListItem+
		//	'</enumerate>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<enumerate' ('name=' name=STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
		//indent=REAL_STRING)? '>' items+=DListItem+ '</enumerate>'
		public Group getGroup() { return cGroup; }
		
		//'<enumerate'
		public Keyword getEnumerateKeyword_0() { return cEnumerateKeyword_0; }
		
		//('name=' name=STRING)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'name='
		public Keyword getNameKeyword_1_0() { return cNameKeyword_1_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_1_0() { return cNameSTRINGTerminalRuleCall_1_1_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_2_0() { return cAlignmentKeyword_2_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_2_1() { return cAlignmentAssignment_2_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_2_1_0() { return cAlignmentDAlignmentEnumRuleCall_2_1_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'style='
		public Keyword getStyleKeyword_3_0() { return cStyleKeyword_3_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_3_1() { return cStyleAssignment_3_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_3_1_0() { return cStyleSTRINGTerminalRuleCall_3_1_0; }
		
		//('indent=' indent=REAL_STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'indent='
		public Keyword getIndentKeyword_4_0() { return cIndentKeyword_4_0; }
		
		//indent=REAL_STRING
		public Assignment getIndentAssignment_4_1() { return cIndentAssignment_4_1; }
		
		//REAL_STRING
		public RuleCall getIndentREAL_STRINGTerminalRuleCall_4_1_0() { return cIndentREAL_STRINGTerminalRuleCall_4_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//items+=DListItem+
		public Assignment getItemsAssignment_6() { return cItemsAssignment_6; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_6_0() { return cItemsDListItemParserRuleCall_6_0; }
		
		//'</enumerate>'
		public Keyword getEnumerateKeyword_7() { return cEnumerateKeyword_7; }
	}
	public class DParagraphContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DParagraphContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDRunParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDHyperlinkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DParagraphContent doctpl::DParagraphContent:
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
		private final Assignment cTabAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTabDTabParserRuleCall_6_0 = (RuleCall)cTabAssignment_6.eContents().get(0);
		private final Assignment cTextAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTextDTextParserRuleCall_7_0 = (RuleCall)cTextAssignment_7.eContents().get(0);
		private final Keyword cRunKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//DRun doctpl::DRun:
		//	'<run' ('bold=' bold=DRunAttributes)? ('italics=' italics=DRunAttributes)? ('underline=' underline=DRunAttributes)?
		//	('color=' color=STRING)?
		//	'>'
		//	tab=DTab?
		//	text=DText
		//	'</run>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<run' ('bold=' bold=DRunAttributes)? ('italics=' italics=DRunAttributes)? ('underline=' underline=DRunAttributes)?
		//('color=' color=STRING)? '>' tab=DTab? text=DText '</run>'
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
		
		//tab=DTab?
		public Assignment getTabAssignment_6() { return cTabAssignment_6; }
		
		//DTab
		public RuleCall getTabDTabParserRuleCall_6_0() { return cTabDTabParserRuleCall_6_0; }
		
		//text=DText
		public Assignment getTextAssignment_7() { return cTextAssignment_7; }
		
		//DText
		public RuleCall getTextDTextParserRuleCall_7_0() { return cTextDTextParserRuleCall_7_0; }
		
		//'</run>'
		public Keyword getRunKeyword_8() { return cRunKeyword_8; }
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
		
		//DHyperlink doctpl::DHyperlink:
		//	'<hyperlink'
		//	'reference=' reference=[doctpl::DReferenceableObject|STRING]
		//	'>'
		//	run=DRun?
		//	'</hyperlink>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<hyperlink' 'reference=' reference=[doctpl::DReferenceableObject|STRING] '>' run=DRun? '</hyperlink>'
		public Group getGroup() { return cGroup; }
		
		//'<hyperlink'
		public Keyword getHyperlinkKeyword_0() { return cHyperlinkKeyword_0; }
		
		//'reference='
		public Keyword getReferenceKeyword_1() { return cReferenceKeyword_1; }
		
		//reference=[doctpl::DReferenceableObject|STRING]
		public Assignment getReferenceAssignment_2() { return cReferenceAssignment_2; }
		
		//[doctpl::DReferenceableObject|STRING]
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
		
		//DText doctpl::DText:
		//	content=RUNTEXT
		@Override public ParserRule getRule() { return rule; }
		
		//content=RUNTEXT
		public Assignment getContentAssignment() { return cContentAssignment; }
		
		//RUNTEXT
		public RuleCall getContentRUNTEXTTerminalRuleCall_0() { return cContentRUNTEXTTerminalRuleCall_0; }
	}
	public class DTabElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DTab");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDTabAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTabKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//DTab doctpl::DTab:
		//	{doctpl::DTab}
		//	'<tab/>'
		@Override public ParserRule getRule() { return rule; }
		
		//{doctpl::DTab} '<tab/>'
		public Group getGroup() { return cGroup; }
		
		//{doctpl::DTab}
		public Action getDTabAction_0() { return cDTabAction_0; }
		
		//'<tab/>'
		public Keyword getTabKeyword_1() { return cTabKeyword_1; }
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
		private final Keyword cWidthKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cWidthAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cWidthUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cWidthAssignment_6.eContents().get(0);
		private final Keyword cHeightKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cHeightAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cHeightUINT_STRINGTerminalRuleCall_8_0 = (RuleCall)cHeightAssignment_8.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cAlignmentKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cAlignmentAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_9_1_0 = (RuleCall)cAlignmentAssignment_9_1.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cStyleKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cStyleAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_10_1_0 = (RuleCall)cStyleAssignment_10_1.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cIndentKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cIndentAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cIndentREAL_STRINGTerminalRuleCall_11_1_0 = (RuleCall)cIndentAssignment_11_1.eContents().get(0);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cCaptionKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Assignment cCaptionAssignment_12_1 = (Assignment)cGroup_12.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_12_1_0 = (RuleCall)cCaptionAssignment_12_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//DFigureFromFile doctpl::DFigureFromFile:
		//	'<figureFromFile'
		//	'name=' name=STRING
		//	'referenceFile=' referenceFile=STRING
		//	'width=' width=UINT_STRING
		//	'height=' height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
		//	indent=REAL_STRING)? ('caption=' caption=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<figureFromFile' 'name=' name=STRING 'referenceFile=' referenceFile=STRING 'width=' width=UINT_STRING 'height='
		//height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent=' indent=REAL_STRING)?
		//('caption=' caption=STRING)? '/>'
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
		
		//'width='
		public Keyword getWidthKeyword_5() { return cWidthKeyword_5; }
		
		//width=UINT_STRING
		public Assignment getWidthAssignment_6() { return cWidthAssignment_6; }
		
		//UINT_STRING
		public RuleCall getWidthUINT_STRINGTerminalRuleCall_6_0() { return cWidthUINT_STRINGTerminalRuleCall_6_0; }
		
		//'height='
		public Keyword getHeightKeyword_7() { return cHeightKeyword_7; }
		
		//height=UINT_STRING
		public Assignment getHeightAssignment_8() { return cHeightAssignment_8; }
		
		//UINT_STRING
		public RuleCall getHeightUINT_STRINGTerminalRuleCall_8_0() { return cHeightUINT_STRINGTerminalRuleCall_8_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_9() { return cGroup_9; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_9_0() { return cAlignmentKeyword_9_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_9_1() { return cAlignmentAssignment_9_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_9_1_0() { return cAlignmentDAlignmentEnumRuleCall_9_1_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_10() { return cGroup_10; }
		
		//'style='
		public Keyword getStyleKeyword_10_0() { return cStyleKeyword_10_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_10_1() { return cStyleAssignment_10_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_10_1_0() { return cStyleSTRINGTerminalRuleCall_10_1_0; }
		
		//('indent=' indent=REAL_STRING)?
		public Group getGroup_11() { return cGroup_11; }
		
		//'indent='
		public Keyword getIndentKeyword_11_0() { return cIndentKeyword_11_0; }
		
		//indent=REAL_STRING
		public Assignment getIndentAssignment_11_1() { return cIndentAssignment_11_1; }
		
		//REAL_STRING
		public RuleCall getIndentREAL_STRINGTerminalRuleCall_11_1_0() { return cIndentREAL_STRINGTerminalRuleCall_11_1_0; }
		
		//('caption=' caption=STRING)?
		public Group getGroup_12() { return cGroup_12; }
		
		//'caption='
		public Keyword getCaptionKeyword_12_0() { return cCaptionKeyword_12_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_12_1() { return cCaptionAssignment_12_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_12_1_0() { return cCaptionSTRINGTerminalRuleCall_12_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_13() { return cSolidusGreaterThanSignKeyword_13; }
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
		private final Keyword cWidthKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cWidthAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cWidthUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cWidthAssignment_6.eContents().get(0);
		private final Keyword cHeightKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cHeightAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cHeightUINT_STRINGTerminalRuleCall_8_0 = (RuleCall)cHeightAssignment_8.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cAlignmentKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cAlignmentAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_9_1_0 = (RuleCall)cAlignmentAssignment_9_1.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cStyleKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cStyleAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_10_1_0 = (RuleCall)cStyleAssignment_10_1.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cIndentKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cIndentAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cIndentREAL_STRINGTerminalRuleCall_11_1_0 = (RuleCall)cIndentAssignment_11_1.eContents().get(0);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cCaptionKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Assignment cCaptionAssignment_12_1 = (Assignment)cGroup_12.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_12_1_0 = (RuleCall)cCaptionAssignment_12_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//DTableFromFile doctpl::DTableFromFile:
		//	'<tableFromFile'
		//	'name=' name=STRING
		//	'referenceFile=' referenceFile=STRING
		//	'width=' width=UINT_STRING
		//	'height=' height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
		//	indent=REAL_STRING)? ('caption=' caption=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<tableFromFile' 'name=' name=STRING 'referenceFile=' referenceFile=STRING 'width=' width=UINT_STRING 'height='
		//height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent=' indent=REAL_STRING)?
		//('caption=' caption=STRING)? '/>'
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
		
		//'width='
		public Keyword getWidthKeyword_5() { return cWidthKeyword_5; }
		
		//width=UINT_STRING
		public Assignment getWidthAssignment_6() { return cWidthAssignment_6; }
		
		//UINT_STRING
		public RuleCall getWidthUINT_STRINGTerminalRuleCall_6_0() { return cWidthUINT_STRINGTerminalRuleCall_6_0; }
		
		//'height='
		public Keyword getHeightKeyword_7() { return cHeightKeyword_7; }
		
		//height=UINT_STRING
		public Assignment getHeightAssignment_8() { return cHeightAssignment_8; }
		
		//UINT_STRING
		public RuleCall getHeightUINT_STRINGTerminalRuleCall_8_0() { return cHeightUINT_STRINGTerminalRuleCall_8_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_9() { return cGroup_9; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_9_0() { return cAlignmentKeyword_9_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_9_1() { return cAlignmentAssignment_9_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_9_1_0() { return cAlignmentDAlignmentEnumRuleCall_9_1_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_10() { return cGroup_10; }
		
		//'style='
		public Keyword getStyleKeyword_10_0() { return cStyleKeyword_10_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_10_1() { return cStyleAssignment_10_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_10_1_0() { return cStyleSTRINGTerminalRuleCall_10_1_0; }
		
		//('indent=' indent=REAL_STRING)?
		public Group getGroup_11() { return cGroup_11; }
		
		//'indent='
		public Keyword getIndentKeyword_11_0() { return cIndentKeyword_11_0; }
		
		//indent=REAL_STRING
		public Assignment getIndentAssignment_11_1() { return cIndentAssignment_11_1; }
		
		//REAL_STRING
		public RuleCall getIndentREAL_STRINGTerminalRuleCall_11_1_0() { return cIndentREAL_STRINGTerminalRuleCall_11_1_0; }
		
		//('caption=' caption=STRING)?
		public Group getGroup_12() { return cGroup_12; }
		
		//'caption='
		public Keyword getCaptionKeyword_12_0() { return cCaptionKeyword_12_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_12_1() { return cCaptionAssignment_12_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_12_1_0() { return cCaptionSTRINGTerminalRuleCall_12_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_13() { return cSolidusGreaterThanSignKeyword_13; }
	}
	public class DBasicTableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBasicTable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBasicTableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cWidthKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cWidthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cWidthUINT_STRINGTerminalRuleCall_3_1_0 = (RuleCall)cWidthAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAlignmentKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cAlignmentAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_4_1_0 = (RuleCall)cAlignmentAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cStyleKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cStyleAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cStyleAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cIndentKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cIndentAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cIndentREAL_STRINGTerminalRuleCall_6_1_0 = (RuleCall)cIndentAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCaptionKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cCaptionAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_7_1_0 = (RuleCall)cCaptionAssignment_7_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cRowsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cRowsDRowParserRuleCall_9_0 = (RuleCall)cRowsAssignment_9.eContents().get(0);
		private final Keyword cBasicTableKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//DBasicTable doctpl::DBasicTable:
		//	'<basicTable'
		//	'name=' name=STRING ('width=' width=UINT_STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)?
		//	('indent=' indent=REAL_STRING)? ('caption=' caption=STRING)?
		//	'>'
		//	rows+=DRow+
		//	'</basicTable>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<basicTable' 'name=' name=STRING ('width=' width=UINT_STRING)? ('alignment=' alignment=DAlignment)? ('style='
		//style=STRING)? ('indent=' indent=REAL_STRING)? ('caption=' caption=STRING)? '>' rows+=DRow+ '</basicTable>'
		public Group getGroup() { return cGroup; }
		
		//'<basicTable'
		public Keyword getBasicTableKeyword_0() { return cBasicTableKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//('width=' width=UINT_STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'width='
		public Keyword getWidthKeyword_3_0() { return cWidthKeyword_3_0; }
		
		//width=UINT_STRING
		public Assignment getWidthAssignment_3_1() { return cWidthAssignment_3_1; }
		
		//UINT_STRING
		public RuleCall getWidthUINT_STRINGTerminalRuleCall_3_1_0() { return cWidthUINT_STRINGTerminalRuleCall_3_1_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_4_0() { return cAlignmentKeyword_4_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_4_1() { return cAlignmentAssignment_4_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_4_1_0() { return cAlignmentDAlignmentEnumRuleCall_4_1_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'style='
		public Keyword getStyleKeyword_5_0() { return cStyleKeyword_5_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_5_1() { return cStyleAssignment_5_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_5_1_0() { return cStyleSTRINGTerminalRuleCall_5_1_0; }
		
		//('indent=' indent=REAL_STRING)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'indent='
		public Keyword getIndentKeyword_6_0() { return cIndentKeyword_6_0; }
		
		//indent=REAL_STRING
		public Assignment getIndentAssignment_6_1() { return cIndentAssignment_6_1; }
		
		//REAL_STRING
		public RuleCall getIndentREAL_STRINGTerminalRuleCall_6_1_0() { return cIndentREAL_STRINGTerminalRuleCall_6_1_0; }
		
		//('caption=' caption=STRING)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'caption='
		public Keyword getCaptionKeyword_7_0() { return cCaptionKeyword_7_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_7_1() { return cCaptionAssignment_7_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_7_1_0() { return cCaptionSTRINGTerminalRuleCall_7_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_8() { return cGreaterThanSignKeyword_8; }
		
		//rows+=DRow+
		public Assignment getRowsAssignment_9() { return cRowsAssignment_9; }
		
		//DRow
		public RuleCall getRowsDRowParserRuleCall_9_0() { return cRowsDRowParserRuleCall_9_0; }
		
		//'</basicTable>'
		public Keyword getBasicTableKeyword_10() { return cBasicTableKeyword_10; }
	}
	public class DRowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCellsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCellsDCellParserRuleCall_1_0 = (RuleCall)cCellsAssignment_1.eContents().get(0);
		private final Keyword cRowKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DRow doctpl::DRow:
		//	'<row>'
		//	cells+=DCell+
		//	'</row>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<row>' cells+=DCell+ '</row>'
		public Group getGroup() { return cGroup; }
		
		//'<row>'
		public Keyword getRowKeyword_0() { return cRowKeyword_0; }
		
		//cells+=DCell+
		public Assignment getCellsAssignment_1() { return cCellsAssignment_1; }
		
		//DCell
		public RuleCall getCellsDCellParserRuleCall_1_0() { return cCellsDCellParserRuleCall_1_0; }
		
		//'</row>'
		public Keyword getRowKeyword_2() { return cRowKeyword_2; }
	}
	public class DCellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DCell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCellKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColSpanKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cColSpanAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cColSpanUINT_STRINGTerminalRuleCall_1_1_0 = (RuleCall)cColSpanAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cRowSpanKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRowSpanAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRowSpanUINT_STRINGTerminalRuleCall_2_1_0 = (RuleCall)cRowSpanAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cWidthKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cWidthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cWidthUINT_STRINGTerminalRuleCall_3_1_0 = (RuleCall)cWidthAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cShadowKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cShadowAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cShadowSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cShadowAssignment_4_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBodyContentAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBodyContentDBodyContentParserRuleCall_6_0 = (RuleCall)cBodyContentAssignment_6.eContents().get(0);
		private final Keyword cCellKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DCell doctpl::DCell:
		//	'<cell' ('colSpan=' colSpan=UINT_STRING)? ('rowSpan=' rowSpan=UINT_STRING)? ('width=' width=UINT_STRING)? ('shadow='
		//	shadow=STRING)?
		//	'>'
		//	bodyContent+=DBodyContent+
		//	'</cell>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<cell' ('colSpan=' colSpan=UINT_STRING)? ('rowSpan=' rowSpan=UINT_STRING)? ('width=' width=UINT_STRING)? ('shadow='
		//shadow=STRING)? '>' bodyContent+=DBodyContent+ '</cell>'
		public Group getGroup() { return cGroup; }
		
		//'<cell'
		public Keyword getCellKeyword_0() { return cCellKeyword_0; }
		
		//('colSpan=' colSpan=UINT_STRING)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'colSpan='
		public Keyword getColSpanKeyword_1_0() { return cColSpanKeyword_1_0; }
		
		//colSpan=UINT_STRING
		public Assignment getColSpanAssignment_1_1() { return cColSpanAssignment_1_1; }
		
		//UINT_STRING
		public RuleCall getColSpanUINT_STRINGTerminalRuleCall_1_1_0() { return cColSpanUINT_STRINGTerminalRuleCall_1_1_0; }
		
		//('rowSpan=' rowSpan=UINT_STRING)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'rowSpan='
		public Keyword getRowSpanKeyword_2_0() { return cRowSpanKeyword_2_0; }
		
		//rowSpan=UINT_STRING
		public Assignment getRowSpanAssignment_2_1() { return cRowSpanAssignment_2_1; }
		
		//UINT_STRING
		public RuleCall getRowSpanUINT_STRINGTerminalRuleCall_2_1_0() { return cRowSpanUINT_STRINGTerminalRuleCall_2_1_0; }
		
		//('width=' width=UINT_STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'width='
		public Keyword getWidthKeyword_3_0() { return cWidthKeyword_3_0; }
		
		//width=UINT_STRING
		public Assignment getWidthAssignment_3_1() { return cWidthAssignment_3_1; }
		
		//UINT_STRING
		public RuleCall getWidthUINT_STRINGTerminalRuleCall_3_1_0() { return cWidthUINT_STRINGTerminalRuleCall_3_1_0; }
		
		//('shadow=' shadow=STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'shadow='
		public Keyword getShadowKeyword_4_0() { return cShadowKeyword_4_0; }
		
		//shadow=STRING
		public Assignment getShadowAssignment_4_1() { return cShadowAssignment_4_1; }
		
		//STRING
		public RuleCall getShadowSTRINGTerminalRuleCall_4_1_0() { return cShadowSTRINGTerminalRuleCall_4_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//bodyContent+=DBodyContent+
		public Assignment getBodyContentAssignment_6() { return cBodyContentAssignment_6; }
		
		//DBodyContent
		public RuleCall getBodyContentDBodyContentParserRuleCall_6_0() { return cBodyContentDBodyContentParserRuleCall_6_0; }
		
		//'</cell>'
		public Keyword getCellKeyword_7() { return cCellKeyword_7; }
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
		
		//DApplicableDocument doctpl::DApplicableDocument:
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
		
		//DReferenceDocument doctpl::DReferenceDocument:
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
	public class VSVSTestInfoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestInfo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSTestInfoAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyDBodyParserRuleCall_1_0 = (RuleCall)cBodyAssignment_1.eContents().get(0);
		
		//VSVSTestInfo:
		//	{VSVSTestInfo} body=DBody?;
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSTestInfo} body=DBody?
		public Group getGroup() { return cGroup; }
		
		//{VSVSTestInfo}
		public Action getVSVSTestInfoAction_0() { return cVSVSTestInfoAction_0; }
		
		//body=DBody?
		public Assignment getBodyAssignment_1() { return cBodyAssignment_1; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_1_0() { return cBodyDBodyParserRuleCall_1_0; }
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
		private final Keyword cInterfacesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cInterfacesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cInterfacesVSVSInterfacesSectionParserRuleCall_5_0 = (RuleCall)cInterfacesAssignment_5.eContents().get(0);
		private final Keyword cInterfacesKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cScenariosKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cScenariosAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cScenariosVSVSScenariosSectionParserRuleCall_8_0 = (RuleCall)cScenariosAssignment_8.eContents().get(0);
		private final Keyword cScenariosKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cTestDesignsAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cTestDesignsVSVSTestDesignParserRuleCall_10_0 = (RuleCall)cTestDesignsAssignment_10.eContents().get(0);
		private final Keyword cTestingSpecificationDesignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//VSVSTestingSpecificationDesign:
		//	'<TestingSpecificationDesign>'
		//	'<General>' general=VSVSFixedSection '</General>'
		//	'<Interfaces>' interfaces=VSVSInterfacesSection '</Interfaces>'
		//	'<Scenarios>' scenarios=VSVSScenariosSection '</Scenarios>'
		//	testDesigns+=VSVSTestDesign+
		//	'</TestingSpecificationDesign>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestingSpecificationDesign>' '<General>' general=VSVSFixedSection '</General>' '<Interfaces>'
		//interfaces=VSVSInterfacesSection '</Interfaces>' '<Scenarios>' scenarios=VSVSScenariosSection '</Scenarios>'
		//testDesigns+=VSVSTestDesign+ '</TestingSpecificationDesign>'
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
		
		//'<Interfaces>'
		public Keyword getInterfacesKeyword_4() { return cInterfacesKeyword_4; }
		
		//interfaces=VSVSInterfacesSection
		public Assignment getInterfacesAssignment_5() { return cInterfacesAssignment_5; }
		
		//VSVSInterfacesSection
		public RuleCall getInterfacesVSVSInterfacesSectionParserRuleCall_5_0() { return cInterfacesVSVSInterfacesSectionParserRuleCall_5_0; }
		
		//'</Interfaces>'
		public Keyword getInterfacesKeyword_6() { return cInterfacesKeyword_6; }
		
		//'<Scenarios>'
		public Keyword getScenariosKeyword_7() { return cScenariosKeyword_7; }
		
		//scenarios=VSVSScenariosSection
		public Assignment getScenariosAssignment_8() { return cScenariosAssignment_8; }
		
		//VSVSScenariosSection
		public RuleCall getScenariosVSVSScenariosSectionParserRuleCall_8_0() { return cScenariosVSVSScenariosSectionParserRuleCall_8_0; }
		
		//'</Scenarios>'
		public Keyword getScenariosKeyword_9() { return cScenariosKeyword_9; }
		
		//testDesigns+=VSVSTestDesign+
		public Assignment getTestDesignsAssignment_10() { return cTestDesignsAssignment_10; }
		
		//VSVSTestDesign
		public RuleCall getTestDesignsVSVSTestDesignParserRuleCall_10_0() { return cTestDesignsVSVSTestDesignParserRuleCall_10_0; }
		
		//'</TestingSpecificationDesign>'
		public Keyword getTestingSpecificationDesignKeyword_11() { return cTestingSpecificationDesignKeyword_11; }
	}
	public class VSVSInterfacesSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSInterfacesSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSInterfacesSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cInterfacesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInterfacesVSVSInterfaceParserRuleCall_1_0 = (RuleCall)cInterfacesAssignment_1.eContents().get(0);
		
		//VSVSInterfacesSection:
		//	{VSVSInterfacesSection} interfaces+=VSVSInterface+;
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSInterfacesSection} interfaces+=VSVSInterface+
		public Group getGroup() { return cGroup; }
		
		//{VSVSInterfacesSection}
		public Action getVSVSInterfacesSectionAction_0() { return cVSVSInterfacesSectionAction_0; }
		
		//interfaces+=VSVSInterface+
		public Assignment getInterfacesAssignment_1() { return cInterfacesAssignment_1; }
		
		//VSVSInterface
		public RuleCall getInterfacesVSVSInterfaceParserRuleCall_1_0() { return cInterfacesVSVSInterfaceParserRuleCall_1_0; }
	}
	public class VSVSInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cInterfaceKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSInterface:
		//	'<Interface'
		//	'name=' name=STRING
		//	'>'
		//	description=DRun
		//	'</Interface>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Interface' 'name=' name=STRING '>' description=DRun '</Interface>'
		public Group getGroup() { return cGroup; }
		
		//'<Interface'
		public Keyword getInterfaceKeyword_0() { return cInterfaceKeyword_0; }
		
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
		
		//'</Interface>'
		public Keyword getInterfaceKeyword_5() { return cInterfaceKeyword_5; }
	}
	public class VSVSScenariosSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSScenariosSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSScenariosSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cScenariosAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cScenariosVSVSScenarioSectionParserRuleCall_1_0 = (RuleCall)cScenariosAssignment_1.eContents().get(0);
		
		//VSVSScenariosSection:
		//	{VSVSScenariosSection} scenarios+=VSVSScenarioSection+;
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSScenariosSection} scenarios+=VSVSScenarioSection+
		public Group getGroup() { return cGroup; }
		
		//{VSVSScenariosSection}
		public Action getVSVSScenariosSectionAction_0() { return cVSVSScenariosSectionAction_0; }
		
		//scenarios+=VSVSScenarioSection+
		public Assignment getScenariosAssignment_1() { return cScenariosAssignment_1; }
		
		//VSVSScenarioSection
		public RuleCall getScenariosVSVSScenarioSectionParserRuleCall_1_0() { return cScenariosVSVSScenarioSectionParserRuleCall_1_0; }
	}
	public class VSVSScenarioSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSScenarioSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cScenarioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cInterfaceKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cRefKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cInterfaceAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final CrossReference cInterfaceVSVSInterfaceCrossReference_4_2_0 = (CrossReference)cInterfaceAssignment_4_2.eContents().get(0);
		private final RuleCall cInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_2_0_1 = (RuleCall)cInterfaceVSVSInterfaceCrossReference_4_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Assignment cBodyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBodyDBodyParserRuleCall_5_0 = (RuleCall)cBodyAssignment_5.eContents().get(0);
		private final Keyword cScenarioKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//VSVSScenarioSection:
		//	'<Scenario'
		//	'name=' name=STRING
		//	'>' ('<Interface' 'ref=' interface+=[VSVSInterface|STRING] '/>')+
		//	body=DBody
		//	'</Scenario>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Scenario' 'name=' name=STRING '>' ('<Interface' 'ref=' interface+=[VSVSInterface|STRING] '/>')+ body=DBody
		//'</Scenario>'
		public Group getGroup() { return cGroup; }
		
		//'<Scenario'
		public Keyword getScenarioKeyword_0() { return cScenarioKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//('<Interface' 'ref=' interface+=[VSVSInterface|STRING] '/>')+
		public Group getGroup_4() { return cGroup_4; }
		
		//'<Interface'
		public Keyword getInterfaceKeyword_4_0() { return cInterfaceKeyword_4_0; }
		
		//'ref='
		public Keyword getRefKeyword_4_1() { return cRefKeyword_4_1; }
		
		//interface+=[VSVSInterface|STRING]
		public Assignment getInterfaceAssignment_4_2() { return cInterfaceAssignment_4_2; }
		
		//[VSVSInterface|STRING]
		public CrossReference getInterfaceVSVSInterfaceCrossReference_4_2_0() { return cInterfaceVSVSInterfaceCrossReference_4_2_0; }
		
		//STRING
		public RuleCall getInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_2_0_1() { return cInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_4_3() { return cSolidusGreaterThanSignKeyword_4_3; }
		
		//body=DBody
		public Assignment getBodyAssignment_5() { return cBodyAssignment_5; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_5_0() { return cBodyDBodyParserRuleCall_5_0; }
		
		//'</Scenario>'
		public Keyword getScenarioKeyword_6() { return cScenarioKeyword_6; }
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
		private final RuleCall cIdentifierVSVSTestInfoParserRuleCall_5_0 = (RuleCall)cIdentifierAssignment_5.eContents().get(0);
		private final Keyword cIdentifierKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cInputsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cInputsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cInputsVSVSTestInfoParserRuleCall_8_0 = (RuleCall)cInputsAssignment_8.eContents().get(0);
		private final Keyword cInputsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cOutputsKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cOutputsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cOutputsVSVSTestInfoParserRuleCall_11_0 = (RuleCall)cOutputsAssignment_11.eContents().get(0);
		private final Keyword cOutputsKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cPassFailCriteriaKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cPassFailCriteriaAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cPassFailCriteriaVSVSTestInfoParserRuleCall_14_0 = (RuleCall)cPassFailCriteriaAssignment_14.eContents().get(0);
		private final Keyword cPassFailCriteriaKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cEnvironmentalNeedsKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cEnvironmentalNeedsAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cEnvironmentalNeedsVSVSTestInfoParserRuleCall_17_0 = (RuleCall)cEnvironmentalNeedsAssignment_17.eContents().get(0);
		private final Keyword cEnvironmentalNeedsKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cSpecialConstraintsKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cSpecialConstraintsAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cSpecialConstraintsVSVSTestInfoParserRuleCall_20_0 = (RuleCall)cSpecialConstraintsAssignment_20.eContents().get(0);
		private final Keyword cSpecialConstraintsKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Keyword cInterfaceDependenciesKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Assignment cInterfaceDependenciesAssignment_23 = (Assignment)cGroup.eContents().get(23);
		private final RuleCall cInterfaceDependenciesVSVSTestInfoParserRuleCall_23_0 = (RuleCall)cInterfaceDependenciesAssignment_23.eContents().get(0);
		private final Keyword cInterfaceDependenciesKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Group cGroup_25 = (Group)cGroup.eContents().get(25);
		private final Keyword cValidatingItemKeyword_25_0 = (Keyword)cGroup_25.eContents().get(0);
		private final Keyword cNameKeyword_25_1 = (Keyword)cGroup_25.eContents().get(1);
		private final Assignment cValidatingItemAssignment_25_2 = (Assignment)cGroup_25.eContents().get(2);
		private final CrossReference cValidatingItemVTraceableDocumentAbstractItemCrossReference_25_2_0 = (CrossReference)cValidatingItemAssignment_25_2.eContents().get(0);
		private final RuleCall cValidatingItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_25_2_0_1 = (RuleCall)cValidatingItemVTraceableDocumentAbstractItemCrossReference_25_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_25_3 = (Keyword)cGroup_25.eContents().get(3);
		private final Keyword cTestCaseKeyword_26 = (Keyword)cGroup.eContents().get(26);
		
		//VSVSTestCase:
		//	'<TestCase'
		//	'name=' name=STRING
		//	'>'
		//	'<Identifier>' identifier=VSVSTestInfo '</Identifier>'
		//	'<Inputs>' inputs=VSVSTestInfo '</Inputs>'
		//	'<Outputs>' outputs=VSVSTestInfo '</Outputs>'
		//	'<PassFailCriteria>' passFailCriteria=VSVSTestInfo '</PassFailCriteria>'
		//	'<EnvironmentalNeeds>' environmentalNeeds=VSVSTestInfo '</EnvironmentalNeeds>'
		//	'<SpecialConstraints>' specialConstraints=VSVSTestInfo '</SpecialConstraints>'
		//	'<InterfaceDependencies>' interfaceDependencies=VSVSTestInfo '</InterfaceDependencies>' ('<ValidatingItem' 'name='
		//	validatingItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+
		//	'</TestCase>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestCase' 'name=' name=STRING '>' '<Identifier>' identifier=VSVSTestInfo '</Identifier>' '<Inputs>'
		//inputs=VSVSTestInfo '</Inputs>' '<Outputs>' outputs=VSVSTestInfo '</Outputs>' '<PassFailCriteria>'
		//passFailCriteria=VSVSTestInfo '</PassFailCriteria>' '<EnvironmentalNeeds>' environmentalNeeds=VSVSTestInfo
		//'</EnvironmentalNeeds>' '<SpecialConstraints>' specialConstraints=VSVSTestInfo '</SpecialConstraints>'
		//'<InterfaceDependencies>' interfaceDependencies=VSVSTestInfo '</InterfaceDependencies>' ('<ValidatingItem' 'name='
		//validatingItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+ '</TestCase>'
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
		
		//identifier=VSVSTestInfo
		public Assignment getIdentifierAssignment_5() { return cIdentifierAssignment_5; }
		
		//VSVSTestInfo
		public RuleCall getIdentifierVSVSTestInfoParserRuleCall_5_0() { return cIdentifierVSVSTestInfoParserRuleCall_5_0; }
		
		//'</Identifier>'
		public Keyword getIdentifierKeyword_6() { return cIdentifierKeyword_6; }
		
		//'<Inputs>'
		public Keyword getInputsKeyword_7() { return cInputsKeyword_7; }
		
		//inputs=VSVSTestInfo
		public Assignment getInputsAssignment_8() { return cInputsAssignment_8; }
		
		//VSVSTestInfo
		public RuleCall getInputsVSVSTestInfoParserRuleCall_8_0() { return cInputsVSVSTestInfoParserRuleCall_8_0; }
		
		//'</Inputs>'
		public Keyword getInputsKeyword_9() { return cInputsKeyword_9; }
		
		//'<Outputs>'
		public Keyword getOutputsKeyword_10() { return cOutputsKeyword_10; }
		
		//outputs=VSVSTestInfo
		public Assignment getOutputsAssignment_11() { return cOutputsAssignment_11; }
		
		//VSVSTestInfo
		public RuleCall getOutputsVSVSTestInfoParserRuleCall_11_0() { return cOutputsVSVSTestInfoParserRuleCall_11_0; }
		
		//'</Outputs>'
		public Keyword getOutputsKeyword_12() { return cOutputsKeyword_12; }
		
		//'<PassFailCriteria>'
		public Keyword getPassFailCriteriaKeyword_13() { return cPassFailCriteriaKeyword_13; }
		
		//passFailCriteria=VSVSTestInfo
		public Assignment getPassFailCriteriaAssignment_14() { return cPassFailCriteriaAssignment_14; }
		
		//VSVSTestInfo
		public RuleCall getPassFailCriteriaVSVSTestInfoParserRuleCall_14_0() { return cPassFailCriteriaVSVSTestInfoParserRuleCall_14_0; }
		
		//'</PassFailCriteria>'
		public Keyword getPassFailCriteriaKeyword_15() { return cPassFailCriteriaKeyword_15; }
		
		//'<EnvironmentalNeeds>'
		public Keyword getEnvironmentalNeedsKeyword_16() { return cEnvironmentalNeedsKeyword_16; }
		
		//environmentalNeeds=VSVSTestInfo
		public Assignment getEnvironmentalNeedsAssignment_17() { return cEnvironmentalNeedsAssignment_17; }
		
		//VSVSTestInfo
		public RuleCall getEnvironmentalNeedsVSVSTestInfoParserRuleCall_17_0() { return cEnvironmentalNeedsVSVSTestInfoParserRuleCall_17_0; }
		
		//'</EnvironmentalNeeds>'
		public Keyword getEnvironmentalNeedsKeyword_18() { return cEnvironmentalNeedsKeyword_18; }
		
		//'<SpecialConstraints>'
		public Keyword getSpecialConstraintsKeyword_19() { return cSpecialConstraintsKeyword_19; }
		
		//specialConstraints=VSVSTestInfo
		public Assignment getSpecialConstraintsAssignment_20() { return cSpecialConstraintsAssignment_20; }
		
		//VSVSTestInfo
		public RuleCall getSpecialConstraintsVSVSTestInfoParserRuleCall_20_0() { return cSpecialConstraintsVSVSTestInfoParserRuleCall_20_0; }
		
		//'</SpecialConstraints>'
		public Keyword getSpecialConstraintsKeyword_21() { return cSpecialConstraintsKeyword_21; }
		
		//'<InterfaceDependencies>'
		public Keyword getInterfaceDependenciesKeyword_22() { return cInterfaceDependenciesKeyword_22; }
		
		//interfaceDependencies=VSVSTestInfo
		public Assignment getInterfaceDependenciesAssignment_23() { return cInterfaceDependenciesAssignment_23; }
		
		//VSVSTestInfo
		public RuleCall getInterfaceDependenciesVSVSTestInfoParserRuleCall_23_0() { return cInterfaceDependenciesVSVSTestInfoParserRuleCall_23_0; }
		
		//'</InterfaceDependencies>'
		public Keyword getInterfaceDependenciesKeyword_24() { return cInterfaceDependenciesKeyword_24; }
		
		//('<ValidatingItem' 'name=' validatingItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+
		public Group getGroup_25() { return cGroup_25; }
		
		//'<ValidatingItem'
		public Keyword getValidatingItemKeyword_25_0() { return cValidatingItemKeyword_25_0; }
		
		//'name='
		public Keyword getNameKeyword_25_1() { return cNameKeyword_25_1; }
		
		//validatingItem+=[tdm::VTraceableDocumentAbstractItem|STRING]
		public Assignment getValidatingItemAssignment_25_2() { return cValidatingItemAssignment_25_2; }
		
		//[tdm::VTraceableDocumentAbstractItem|STRING]
		public CrossReference getValidatingItemVTraceableDocumentAbstractItemCrossReference_25_2_0() { return cValidatingItemVTraceableDocumentAbstractItemCrossReference_25_2_0; }
		
		//STRING
		public RuleCall getValidatingItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_25_2_0_1() { return cValidatingItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_25_2_0_1; }
		
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
		private final RuleCall cIdentifierVSVSTestInfoParserRuleCall_5_0 = (RuleCall)cIdentifierAssignment_5.eContents().get(0);
		private final Keyword cIdentifierKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cPurposeKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPurposeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPurposeVSVSTestInfoParserRuleCall_8_0 = (RuleCall)cPurposeAssignment_8.eContents().get(0);
		private final Keyword cPurposeKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cScenarioKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cRefKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cScenarioAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final CrossReference cScenarioVSVSScenarioSectionCrossReference_12_0 = (CrossReference)cScenarioAssignment_12.eContents().get(0);
		private final RuleCall cScenarioVSVSScenarioSectionSTRINGTerminalRuleCall_12_0_1 = (RuleCall)cScenarioVSVSScenarioSectionCrossReference_12_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cTestCaseKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cRefKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cTestCaseAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final CrossReference cTestCaseVSVSTestCaseCrossReference_14_2_0 = (CrossReference)cTestCaseAssignment_14_2.eContents().get(0);
		private final RuleCall cTestCaseVSVSTestCaseSTRINGTerminalRuleCall_14_2_0_1 = (RuleCall)cTestCaseVSVSTestCaseCrossReference_14_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Assignment cProcedureStepsAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cProcedureStepsVSVSProcedureStepsParserRuleCall_15_0 = (RuleCall)cProcedureStepsAssignment_15.eContents().get(0);
		private final Keyword cTestScriptKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTestScriptAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTestScriptVSVSTestInfoParserRuleCall_17_0 = (RuleCall)cTestScriptAssignment_17.eContents().get(0);
		private final Keyword cTestScriptKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cTestProcedureKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//VSVSTestProcedure:
		//	'<TestProcedure'
		//	'name=' name=STRING
		//	'>'
		//	'<Identifier>' identifier=VSVSTestInfo '</Identifier>'
		//	'<Purpose>' purpose=VSVSTestInfo '</Purpose>'
		//	'<Scenario' 'ref=' scenario=[VSVSScenarioSection|STRING] '/>' ('<TestCase' 'ref=' testCase+=[VSVSTestCase|STRING]
		//	'/>')+
		//	procedureSteps=VSVSProcedureSteps
		//	'<TestScript>' testScript=VSVSTestInfo '</TestScript>'
		//	'</TestProcedure>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestProcedure' 'name=' name=STRING '>' '<Identifier>' identifier=VSVSTestInfo '</Identifier>' '<Purpose>'
		//purpose=VSVSTestInfo '</Purpose>' '<Scenario' 'ref=' scenario=[VSVSScenarioSection|STRING] '/>' ('<TestCase' 'ref='
		//testCase+=[VSVSTestCase|STRING] '/>')+ procedureSteps=VSVSProcedureSteps '<TestScript>' testScript=VSVSTestInfo
		//'</TestScript>' '</TestProcedure>'
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
		
		//identifier=VSVSTestInfo
		public Assignment getIdentifierAssignment_5() { return cIdentifierAssignment_5; }
		
		//VSVSTestInfo
		public RuleCall getIdentifierVSVSTestInfoParserRuleCall_5_0() { return cIdentifierVSVSTestInfoParserRuleCall_5_0; }
		
		//'</Identifier>'
		public Keyword getIdentifierKeyword_6() { return cIdentifierKeyword_6; }
		
		//'<Purpose>'
		public Keyword getPurposeKeyword_7() { return cPurposeKeyword_7; }
		
		//purpose=VSVSTestInfo
		public Assignment getPurposeAssignment_8() { return cPurposeAssignment_8; }
		
		//VSVSTestInfo
		public RuleCall getPurposeVSVSTestInfoParserRuleCall_8_0() { return cPurposeVSVSTestInfoParserRuleCall_8_0; }
		
		//'</Purpose>'
		public Keyword getPurposeKeyword_9() { return cPurposeKeyword_9; }
		
		//'<Scenario'
		public Keyword getScenarioKeyword_10() { return cScenarioKeyword_10; }
		
		//'ref='
		public Keyword getRefKeyword_11() { return cRefKeyword_11; }
		
		//scenario=[VSVSScenarioSection|STRING]
		public Assignment getScenarioAssignment_12() { return cScenarioAssignment_12; }
		
		//[VSVSScenarioSection|STRING]
		public CrossReference getScenarioVSVSScenarioSectionCrossReference_12_0() { return cScenarioVSVSScenarioSectionCrossReference_12_0; }
		
		//STRING
		public RuleCall getScenarioVSVSScenarioSectionSTRINGTerminalRuleCall_12_0_1() { return cScenarioVSVSScenarioSectionSTRINGTerminalRuleCall_12_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_13() { return cSolidusGreaterThanSignKeyword_13; }
		
		//('<TestCase' 'ref=' testCase+=[VSVSTestCase|STRING] '/>')+
		public Group getGroup_14() { return cGroup_14; }
		
		//'<TestCase'
		public Keyword getTestCaseKeyword_14_0() { return cTestCaseKeyword_14_0; }
		
		//'ref='
		public Keyword getRefKeyword_14_1() { return cRefKeyword_14_1; }
		
		//testCase+=[VSVSTestCase|STRING]
		public Assignment getTestCaseAssignment_14_2() { return cTestCaseAssignment_14_2; }
		
		//[VSVSTestCase|STRING]
		public CrossReference getTestCaseVSVSTestCaseCrossReference_14_2_0() { return cTestCaseVSVSTestCaseCrossReference_14_2_0; }
		
		//STRING
		public RuleCall getTestCaseVSVSTestCaseSTRINGTerminalRuleCall_14_2_0_1() { return cTestCaseVSVSTestCaseSTRINGTerminalRuleCall_14_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_14_3() { return cSolidusGreaterThanSignKeyword_14_3; }
		
		//procedureSteps=VSVSProcedureSteps
		public Assignment getProcedureStepsAssignment_15() { return cProcedureStepsAssignment_15; }
		
		//VSVSProcedureSteps
		public RuleCall getProcedureStepsVSVSProcedureStepsParserRuleCall_15_0() { return cProcedureStepsVSVSProcedureStepsParserRuleCall_15_0; }
		
		//'<TestScript>'
		public Keyword getTestScriptKeyword_16() { return cTestScriptKeyword_16; }
		
		//testScript=VSVSTestInfo
		public Assignment getTestScriptAssignment_17() { return cTestScriptAssignment_17; }
		
		//VSVSTestInfo
		public RuleCall getTestScriptVSVSTestInfoParserRuleCall_17_0() { return cTestScriptVSVSTestInfoParserRuleCall_17_0; }
		
		//'</TestScript>'
		public Keyword getTestScriptKeyword_18() { return cTestScriptKeyword_18; }
		
		//'</TestProcedure>'
		public Keyword getTestProcedureKeyword_19() { return cTestProcedureKeyword_19; }
	}
	public class VSVSProcedureStepsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSProcedureSteps");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProcedureStepsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStepAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStepVSVSProcedureStepParserRuleCall_2_0 = (RuleCall)cStepAssignment_2.eContents().get(0);
		private final Keyword cProcedureStepsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSProcedureSteps:
		//	'<ProcedureSteps'
		//	'>'
		//	step+=VSVSProcedureStep+
		//	'</ProcedureSteps>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<ProcedureSteps' '>' step+=VSVSProcedureStep+ '</ProcedureSteps>'
		public Group getGroup() { return cGroup; }
		
		//'<ProcedureSteps'
		public Keyword getProcedureStepsKeyword_0() { return cProcedureStepsKeyword_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_1() { return cGreaterThanSignKeyword_1; }
		
		//step+=VSVSProcedureStep+
		public Assignment getStepAssignment_2() { return cStepAssignment_2; }
		
		//VSVSProcedureStep
		public RuleCall getStepVSVSProcedureStepParserRuleCall_2_0() { return cStepVSVSProcedureStepParserRuleCall_2_0; }
		
		//'</ProcedureSteps>'
		public Keyword getProcedureStepsKeyword_3() { return cProcedureStepsKeyword_3; }
	}
	public class VSVSProcedureStepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSProcedureStep");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStepKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cPrev_step_idrefKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPrev_step_idrefAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cPrev_step_idrefVSVSProcedureStepCrossReference_3_1_0 = (CrossReference)cPrev_step_idrefAssignment_3_1.eContents().get(0);
		private final RuleCall cPrev_step_idrefVSVSProcedureStepSTRINGTerminalRuleCall_3_1_0_1 = (RuleCall)cPrev_step_idrefVSVSProcedureStepCrossReference_3_1_0.eContents().get(1);
		private final Keyword cOutput_idref_from_prev_stepKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cOutput_idref_from_prev_stepAssignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final CrossReference cOutput_idref_from_prev_stepVSVSStepOutputCrossReference_3_3_0 = (CrossReference)cOutput_idref_from_prev_stepAssignment_3_3.eContents().get(0);
		private final RuleCall cOutput_idref_from_prev_stepVSVSStepOutputSTRINGTerminalRuleCall_3_3_0_1 = (RuleCall)cOutput_idref_from_prev_stepVSVSStepOutputCrossReference_3_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cReplaysKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cReplaysAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cReplaysUINT_STRINGTerminalRuleCall_4_1_0 = (RuleCall)cReplaysAssignment_4_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cInputsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cInputsVSVSStepInputsParserRuleCall_6_0 = (RuleCall)cInputsAssignment_6.eContents().get(0);
		private final Assignment cOutputsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cOutputsVSVSStepOutputsParserRuleCall_7_0 = (RuleCall)cOutputsAssignment_7.eContents().get(0);
		private final Keyword cStepKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//VSVSProcedureStep:
		//	'<Step'
		//	'name=' name=STRING ('prev_step_idref=' prev_step_idref=[VSVSProcedureStep|STRING]
		//	'output_idref_from_prev_step=' output_idref_from_prev_step=[VSVSStepOutput|STRING])? ('replays='
		//	replays=UINT_STRING)?
		//	'>'
		//	inputs=VSVSStepInputs
		//	outputs=VSVSStepOutputs?
		//	'</Step>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Step' 'name=' name=STRING ('prev_step_idref=' prev_step_idref=[VSVSProcedureStep|STRING]
		//'output_idref_from_prev_step=' output_idref_from_prev_step=[VSVSStepOutput|STRING])? ('replays=' replays=UINT_STRING)?
		//'>' inputs=VSVSStepInputs outputs=VSVSStepOutputs? '</Step>'
		public Group getGroup() { return cGroup; }
		
		//'<Step'
		public Keyword getStepKeyword_0() { return cStepKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//('prev_step_idref=' prev_step_idref=[VSVSProcedureStep|STRING] 'output_idref_from_prev_step='
		//output_idref_from_prev_step=[VSVSStepOutput|STRING])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'prev_step_idref='
		public Keyword getPrev_step_idrefKeyword_3_0() { return cPrev_step_idrefKeyword_3_0; }
		
		//prev_step_idref=[VSVSProcedureStep|STRING]
		public Assignment getPrev_step_idrefAssignment_3_1() { return cPrev_step_idrefAssignment_3_1; }
		
		//[VSVSProcedureStep|STRING]
		public CrossReference getPrev_step_idrefVSVSProcedureStepCrossReference_3_1_0() { return cPrev_step_idrefVSVSProcedureStepCrossReference_3_1_0; }
		
		//STRING
		public RuleCall getPrev_step_idrefVSVSProcedureStepSTRINGTerminalRuleCall_3_1_0_1() { return cPrev_step_idrefVSVSProcedureStepSTRINGTerminalRuleCall_3_1_0_1; }
		
		//'output_idref_from_prev_step='
		public Keyword getOutput_idref_from_prev_stepKeyword_3_2() { return cOutput_idref_from_prev_stepKeyword_3_2; }
		
		//output_idref_from_prev_step=[VSVSStepOutput|STRING]
		public Assignment getOutput_idref_from_prev_stepAssignment_3_3() { return cOutput_idref_from_prev_stepAssignment_3_3; }
		
		//[VSVSStepOutput|STRING]
		public CrossReference getOutput_idref_from_prev_stepVSVSStepOutputCrossReference_3_3_0() { return cOutput_idref_from_prev_stepVSVSStepOutputCrossReference_3_3_0; }
		
		//STRING
		public RuleCall getOutput_idref_from_prev_stepVSVSStepOutputSTRINGTerminalRuleCall_3_3_0_1() { return cOutput_idref_from_prev_stepVSVSStepOutputSTRINGTerminalRuleCall_3_3_0_1; }
		
		//('replays=' replays=UINT_STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'replays='
		public Keyword getReplaysKeyword_4_0() { return cReplaysKeyword_4_0; }
		
		//replays=UINT_STRING
		public Assignment getReplaysAssignment_4_1() { return cReplaysAssignment_4_1; }
		
		//UINT_STRING
		public RuleCall getReplaysUINT_STRINGTerminalRuleCall_4_1_0() { return cReplaysUINT_STRINGTerminalRuleCall_4_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//inputs=VSVSStepInputs
		public Assignment getInputsAssignment_6() { return cInputsAssignment_6; }
		
		//VSVSStepInputs
		public RuleCall getInputsVSVSStepInputsParserRuleCall_6_0() { return cInputsVSVSStepInputsParserRuleCall_6_0; }
		
		//outputs=VSVSStepOutputs?
		public Assignment getOutputsAssignment_7() { return cOutputsAssignment_7; }
		
		//VSVSStepOutputs
		public RuleCall getOutputsVSVSStepOutputsParserRuleCall_7_0() { return cOutputsVSVSStepOutputsParserRuleCall_7_0; }
		
		//'</Step>'
		public Keyword getStepKeyword_8() { return cStepKeyword_8; }
	}
	public class VSVSStepInputsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepInputs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSStepInputsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInputsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInputAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInputVSVSStepInputParserRuleCall_2_0 = (RuleCall)cInputAssignment_2.eContents().get(0);
		private final Keyword cInputsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSStepInputs:
		//	{VSVSStepInputs}
		//	'<Inputs>'
		//	input+=VSVSStepInput+
		//	'</Inputs>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSStepInputs} '<Inputs>' input+=VSVSStepInput+ '</Inputs>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSStepInputs}
		public Action getVSVSStepInputsAction_0() { return cVSVSStepInputsAction_0; }
		
		//'<Inputs>'
		public Keyword getInputsKeyword_1() { return cInputsKeyword_1; }
		
		//input+=VSVSStepInput+
		public Assignment getInputAssignment_2() { return cInputAssignment_2; }
		
		//VSVSStepInput
		public RuleCall getInputVSVSStepInputParserRuleCall_2_0() { return cInputVSVSStepInputParserRuleCall_2_0; }
		
		//'</Inputs>'
		public Keyword getInputsKeyword_3() { return cInputsKeyword_3; }
	}
	public class VSVSStepInputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepInput");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInputKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cInterfaceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInterfaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cInterfaceVSVSInterfaceCrossReference_4_0 = (CrossReference)cInterfaceAssignment_4.eContents().get(0);
		private final RuleCall cInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cInterfaceVSVSInterfaceCrossReference_4_0.eContents().get(1);
		private final Keyword cDelay_valueKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDelay_valueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDelay_valueUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cDelay_valueAssignment_6.eContents().get(0);
		private final Keyword cDelay_unitKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDelay_unitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDelay_unitVSVSTimeUnitEnumRuleCall_8_0 = (RuleCall)cDelay_unitAssignment_8.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//VSVSStepInput:
		//	'<Input'
		//	'name=' name=STRING
		//	'interface=' interface=[VSVSInterface|STRING]
		//	'delay_value=' delay_value=UINT_STRING
		//	'delay_unit=' delay_unit=VSVSTimeUnit
		//	'/>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Input' 'name=' name=STRING 'interface=' interface=[VSVSInterface|STRING] 'delay_value=' delay_value=UINT_STRING
		//'delay_unit=' delay_unit=VSVSTimeUnit '/>'
		public Group getGroup() { return cGroup; }
		
		//'<Input'
		public Keyword getInputKeyword_0() { return cInputKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'interface='
		public Keyword getInterfaceKeyword_3() { return cInterfaceKeyword_3; }
		
		//interface=[VSVSInterface|STRING]
		public Assignment getInterfaceAssignment_4() { return cInterfaceAssignment_4; }
		
		//[VSVSInterface|STRING]
		public CrossReference getInterfaceVSVSInterfaceCrossReference_4_0() { return cInterfaceVSVSInterfaceCrossReference_4_0; }
		
		//STRING
		public RuleCall getInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_0_1() { return cInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_0_1; }
		
		//'delay_value='
		public Keyword getDelay_valueKeyword_5() { return cDelay_valueKeyword_5; }
		
		//delay_value=UINT_STRING
		public Assignment getDelay_valueAssignment_6() { return cDelay_valueAssignment_6; }
		
		//UINT_STRING
		public RuleCall getDelay_valueUINT_STRINGTerminalRuleCall_6_0() { return cDelay_valueUINT_STRINGTerminalRuleCall_6_0; }
		
		//'delay_unit='
		public Keyword getDelay_unitKeyword_7() { return cDelay_unitKeyword_7; }
		
		//delay_unit=VSVSTimeUnit
		public Assignment getDelay_unitAssignment_8() { return cDelay_unitAssignment_8; }
		
		//VSVSTimeUnit
		public RuleCall getDelay_unitVSVSTimeUnitEnumRuleCall_8_0() { return cDelay_unitVSVSTimeUnitEnumRuleCall_8_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_9() { return cSolidusGreaterThanSignKeyword_9; }
	}
	public class VSVSStepOutputsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutputs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutputsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cCheckmodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCheckmodeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCheckmodeVSVSStepOutputsCheckmodeEnumRuleCall_2_0 = (RuleCall)cCheckmodeAssignment_2.eContents().get(0);
		private final Keyword cValid_time_interval_valueKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValid_time_interval_valueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValid_time_interval_valueUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cValid_time_interval_valueAssignment_4.eContents().get(0);
		private final Keyword cValid_time_interval_unitKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cValid_time_interval_unitAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cValid_time_interval_unitVSVSTimeUnitEnumRuleCall_6_0 = (RuleCall)cValid_time_interval_unitAssignment_6.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cOutputAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cOutputVSVSStepOutputParserRuleCall_8_0 = (RuleCall)cOutputAssignment_8.eContents().get(0);
		private final Keyword cOutputsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//VSVSStepOutputs:
		//	'<Outputs'
		//	'checkmode=' checkmode=VSVSStepOutputsCheckmode
		//	'valid_time_interval_value=' valid_time_interval_value=UINT_STRING
		//	'valid_time_interval_unit=' valid_time_interval_unit=VSVSTimeUnit
		//	'>'
		//	output+=VSVSStepOutput+
		//	'</Outputs>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Outputs' 'checkmode=' checkmode=VSVSStepOutputsCheckmode 'valid_time_interval_value='
		//valid_time_interval_value=UINT_STRING 'valid_time_interval_unit=' valid_time_interval_unit=VSVSTimeUnit '>'
		//output+=VSVSStepOutput+ '</Outputs>'
		public Group getGroup() { return cGroup; }
		
		//'<Outputs'
		public Keyword getOutputsKeyword_0() { return cOutputsKeyword_0; }
		
		//'checkmode='
		public Keyword getCheckmodeKeyword_1() { return cCheckmodeKeyword_1; }
		
		//checkmode=VSVSStepOutputsCheckmode
		public Assignment getCheckmodeAssignment_2() { return cCheckmodeAssignment_2; }
		
		//VSVSStepOutputsCheckmode
		public RuleCall getCheckmodeVSVSStepOutputsCheckmodeEnumRuleCall_2_0() { return cCheckmodeVSVSStepOutputsCheckmodeEnumRuleCall_2_0; }
		
		//'valid_time_interval_value='
		public Keyword getValid_time_interval_valueKeyword_3() { return cValid_time_interval_valueKeyword_3; }
		
		//valid_time_interval_value=UINT_STRING
		public Assignment getValid_time_interval_valueAssignment_4() { return cValid_time_interval_valueAssignment_4; }
		
		//UINT_STRING
		public RuleCall getValid_time_interval_valueUINT_STRINGTerminalRuleCall_4_0() { return cValid_time_interval_valueUINT_STRINGTerminalRuleCall_4_0; }
		
		//'valid_time_interval_unit='
		public Keyword getValid_time_interval_unitKeyword_5() { return cValid_time_interval_unitKeyword_5; }
		
		//valid_time_interval_unit=VSVSTimeUnit
		public Assignment getValid_time_interval_unitAssignment_6() { return cValid_time_interval_unitAssignment_6; }
		
		//VSVSTimeUnit
		public RuleCall getValid_time_interval_unitVSVSTimeUnitEnumRuleCall_6_0() { return cValid_time_interval_unitVSVSTimeUnitEnumRuleCall_6_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_7() { return cGreaterThanSignKeyword_7; }
		
		//output+=VSVSStepOutput+
		public Assignment getOutputAssignment_8() { return cOutputAssignment_8; }
		
		//VSVSStepOutput
		public RuleCall getOutputVSVSStepOutputParserRuleCall_8_0() { return cOutputVSVSStepOutputParserRuleCall_8_0; }
		
		//'</Outputs>'
		public Keyword getOutputsKeyword_9() { return cOutputsKeyword_9; }
	}
	public class VSVSStepOutputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutput");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOutputKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cInterfaceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInterfaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cInterfaceVSVSInterfaceCrossReference_4_0 = (CrossReference)cInterfaceAssignment_4.eContents().get(0);
		private final RuleCall cInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cInterfaceVSVSInterfaceCrossReference_4_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSStepOutput:
		//	'<Output'
		//	'name=' name=STRING
		//	'interface=' interface=[VSVSInterface|STRING]
		//	'/>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Output' 'name=' name=STRING 'interface=' interface=[VSVSInterface|STRING] '/>'
		public Group getGroup() { return cGroup; }
		
		//'<Output'
		public Keyword getOutputKeyword_0() { return cOutputKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'interface='
		public Keyword getInterfaceKeyword_3() { return cInterfaceKeyword_3; }
		
		//interface=[VSVSInterface|STRING]
		public Assignment getInterfaceAssignment_4() { return cInterfaceAssignment_4; }
		
		//[VSVSInterface|STRING]
		public CrossReference getInterfaceVSVSInterfaceCrossReference_4_0() { return cInterfaceVSVSInterfaceCrossReference_4_0; }
		
		//STRING
		public RuleCall getInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_0_1() { return cInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_5() { return cSolidusGreaterThanSignKeyword_5; }
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
	
	public class DAlignmentElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DAlignment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLeftEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLeftLeftKeyword_0_0 = (Keyword)cLeftEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cCenterEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cCenterCenterKeyword_1_0 = (Keyword)cCenterEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cRightEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cRightRightKeyword_2_0 = (Keyword)cRightEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cJustifiedEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cJustifiedJustifiedKeyword_3_0 = (Keyword)cJustifiedEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum DAlignment returns doctpl::DAlignment:
		//	left='"left"' | center='"center"' | right='"right"' | justified='"justified"';
		public EnumRule getRule() { return rule; }
		
		//left='"left"' | center='"center"' | right='"right"' | justified='"justified"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//left='"left"'
		public EnumLiteralDeclaration getLeftEnumLiteralDeclaration_0() { return cLeftEnumLiteralDeclaration_0; }
		
		//'"left"'
		public Keyword getLeftLeftKeyword_0_0() { return cLeftLeftKeyword_0_0; }
		
		//center='"center"'
		public EnumLiteralDeclaration getCenterEnumLiteralDeclaration_1() { return cCenterEnumLiteralDeclaration_1; }
		
		//'"center"'
		public Keyword getCenterCenterKeyword_1_0() { return cCenterCenterKeyword_1_0; }
		
		//right='"right"'
		public EnumLiteralDeclaration getRightEnumLiteralDeclaration_2() { return cRightEnumLiteralDeclaration_2; }
		
		//'"right"'
		public Keyword getRightRightKeyword_2_0() { return cRightRightKeyword_2_0; }
		
		//justified='"justified"'
		public EnumLiteralDeclaration getJustifiedEnumLiteralDeclaration_3() { return cJustifiedEnumLiteralDeclaration_3; }
		
		//'"justified"'
		public Keyword getJustifiedJustifiedKeyword_3_0() { return cJustifiedJustifiedKeyword_3_0; }
	}
	public class DRunAttributesElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRunAttributes");
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
	public class VSVSTimeUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTimeUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMilisecondsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMilisecondsMilisecondsKeyword_0_0 = (Keyword)cMilisecondsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSecondsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSecondsSecondsKeyword_1_0 = (Keyword)cSecondsEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum VSVSTimeUnit:
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
	public class VSVSStepOutputsCheckmodeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutputsCheckmode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAllEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAllAllKeyword_0_0 = (Keyword)cAllEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAllunsortedEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAllunsortedAllunsortedKeyword_1_0 = (Keyword)cAllunsortedEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cAnyEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cAnyAnyKeyword_2_0 = (Keyword)cAnyEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum VSVSStepOutputsCheckmode:
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
	
	private final VSVSDocumentElements pVSVSDocument;
	private final DBodyElements pDBody;
	private final DBodyContentElements pDBodyContent;
	private final DAlignmentElements eDAlignment;
	private final DParagraphElements pDParagraph;
	private final DListItemElements pDListItem;
	private final DListContentElements pDListContent;
	private final DItemizeElements pDItemize;
	private final DEnumerateElements pDEnumerate;
	private final DParagraphContentElements pDParagraphContent;
	private final DRunAttributesElements eDRunAttributes;
	private final DRunElements pDRun;
	private final DHyperlinkElements pDHyperlink;
	private final DTextElements pDText;
	private final DTabElements pDTab;
	private final TerminalRule tRUNTEXT;
	private final DFigureFromFileElements pDFigureFromFile;
	private final DTableFromFileElements pDTableFromFile;
	private final DBasicTableElements pDBasicTable;
	private final DRowElements pDRow;
	private final DCellElements pDCell;
	private final DApplicableDocumentElements pDApplicableDocument;
	private final DReferenceDocumentElements pDReferenceDocument;
	private final VSVSTestInfoElements pVSVSTestInfo;
	private final VSVSFixedSectionElements pVSVSFixedSection;
	private final VSVSInstantiableSectionElements pVSVSInstantiableSection;
	private final VSVSIntroductionElements pVSVSIntroduction;
	private final VSVSApplicableDocumentsElements pVSVSApplicableDocuments;
	private final VSVSReferenceDocumentsElements pVSVSReferenceDocuments;
	private final VSVSTermsDefinitionsAbbreviationsElements pVSVSTermsDefinitionsAbbreviations;
	private final VSVSSoftwareOverviewElements pVSVSSoftwareOverview;
	private final VSVSTaskIdentificationElements pVSVSTaskIdentification;
	private final VSVSTestingSpecificationDesignElements pVSVSTestingSpecificationDesign;
	private final VSVSInterfacesSectionElements pVSVSInterfacesSection;
	private final VSVSInterfaceElements pVSVSInterface;
	private final VSVSScenariosSectionElements pVSVSScenariosSection;
	private final VSVSScenarioSectionElements pVSVSScenarioSection;
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
	private final VSVSTimeUnitElements eVSVSTimeUnit;
	private final VSVSProcedureStepElements pVSVSProcedureStep;
	private final VSVSStepInputsElements pVSVSStepInputs;
	private final VSVSStepInputElements pVSVSStepInput;
	private final VSVSStepOutputsCheckmodeElements eVSVSStepOutputsCheckmode;
	private final VSVSStepOutputsElements pVSVSStepOutputs;
	private final VSVSStepOutputElements pVSVSStepOutput;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final TerminalRule tUINT_STRING;
	private final TerminalRule tREAL_STRING;
	
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
		this.eDAlignment = new DAlignmentElements();
		this.pDParagraph = new DParagraphElements();
		this.pDListItem = new DListItemElements();
		this.pDListContent = new DListContentElements();
		this.pDItemize = new DItemizeElements();
		this.pDEnumerate = new DEnumerateElements();
		this.pDParagraphContent = new DParagraphContentElements();
		this.eDRunAttributes = new DRunAttributesElements();
		this.pDRun = new DRunElements();
		this.pDHyperlink = new DHyperlinkElements();
		this.pDText = new DTextElements();
		this.pDTab = new DTabElements();
		this.tRUNTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.RUNTEXT");
		this.pDFigureFromFile = new DFigureFromFileElements();
		this.pDTableFromFile = new DTableFromFileElements();
		this.pDBasicTable = new DBasicTableElements();
		this.pDRow = new DRowElements();
		this.pDCell = new DCellElements();
		this.pDApplicableDocument = new DApplicableDocumentElements();
		this.pDReferenceDocument = new DReferenceDocumentElements();
		this.pVSVSTestInfo = new VSVSTestInfoElements();
		this.pVSVSFixedSection = new VSVSFixedSectionElements();
		this.pVSVSInstantiableSection = new VSVSInstantiableSectionElements();
		this.pVSVSIntroduction = new VSVSIntroductionElements();
		this.pVSVSApplicableDocuments = new VSVSApplicableDocumentsElements();
		this.pVSVSReferenceDocuments = new VSVSReferenceDocumentsElements();
		this.pVSVSTermsDefinitionsAbbreviations = new VSVSTermsDefinitionsAbbreviationsElements();
		this.pVSVSSoftwareOverview = new VSVSSoftwareOverviewElements();
		this.pVSVSTaskIdentification = new VSVSTaskIdentificationElements();
		this.pVSVSTestingSpecificationDesign = new VSVSTestingSpecificationDesignElements();
		this.pVSVSInterfacesSection = new VSVSInterfacesSectionElements();
		this.pVSVSInterface = new VSVSInterfaceElements();
		this.pVSVSScenariosSection = new VSVSScenariosSectionElements();
		this.pVSVSScenarioSection = new VSVSScenarioSectionElements();
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
		this.eVSVSTimeUnit = new VSVSTimeUnitElements();
		this.pVSVSProcedureStep = new VSVSProcedureStepElements();
		this.pVSVSStepInputs = new VSVSStepInputsElements();
		this.pVSVSStepInput = new VSVSStepInputElements();
		this.eVSVSStepOutputsCheckmode = new VSVSStepOutputsCheckmodeElements();
		this.pVSVSStepOutputs = new VSVSStepOutputsElements();
		this.pVSVSStepOutput = new VSVSStepOutputElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
		this.tREAL_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.REAL_STRING");
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
	
	//DBody doctpl::DBody:
	//	'<body>'
	//	bodyContent+=DBodyContent+
	//	'</body>'
	public DBodyElements getDBodyAccess() {
		return pDBody;
	}
	
	public ParserRule getDBodyRule() {
		return getDBodyAccess().getRule();
	}
	
	//DBodyContent doctpl::DBodyContent:
	//	DParagraph | DItemize | DEnumerate | DFigureFromFile | DTableFromFile | DBasicTable
	public DBodyContentElements getDBodyContentAccess() {
		return pDBodyContent;
	}
	
	public ParserRule getDBodyContentRule() {
		return getDBodyContentAccess().getRule();
	}
	
	//enum DAlignment returns doctpl::DAlignment:
	//	left='"left"' | center='"center"' | right='"right"' | justified='"justified"';
	public DAlignmentElements getDAlignmentAccess() {
		return eDAlignment;
	}
	
	public EnumRule getDAlignmentRule() {
		return getDAlignmentAccess().getRule();
	}
	
	//DParagraph doctpl::DParagraph:
	//	'<paragraph' ('name=' name=STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
	//	indent=REAL_STRING)?
	//	'>'
	//	paragraphContent+=DParagraphContent+
	//	'</paragraph>'
	public DParagraphElements getDParagraphAccess() {
		return pDParagraph;
	}
	
	public ParserRule getDParagraphRule() {
		return getDParagraphAccess().getRule();
	}
	
	//DListItem doctpl::DListItem:
	//	'<listItem>'
	//	paragraph+=DParagraph+ ('<sublist>' sublist=DListContent '</sublist>')?
	//	'</listItem>'
	public DListItemElements getDListItemAccess() {
		return pDListItem;
	}
	
	public ParserRule getDListItemRule() {
		return getDListItemAccess().getRule();
	}
	
	//DListContent doctpl::DListContent:
	//	DItemize | DEnumerate
	public DListContentElements getDListContentAccess() {
		return pDListContent;
	}
	
	public ParserRule getDListContentRule() {
		return getDListContentAccess().getRule();
	}
	
	//DItemize doctpl::DItemize:
	//	'<itemize' ('name=' name=STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
	//	indent=REAL_STRING)?
	//	'>'
	//	items+=DListItem+
	//	'</itemize>'
	public DItemizeElements getDItemizeAccess() {
		return pDItemize;
	}
	
	public ParserRule getDItemizeRule() {
		return getDItemizeAccess().getRule();
	}
	
	//DEnumerate doctpl::DEnumerate:
	//	'<enumerate' ('name=' name=STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
	//	indent=REAL_STRING)?
	//	'>'
	//	items+=DListItem+
	//	'</enumerate>'
	public DEnumerateElements getDEnumerateAccess() {
		return pDEnumerate;
	}
	
	public ParserRule getDEnumerateRule() {
		return getDEnumerateAccess().getRule();
	}
	
	//DParagraphContent doctpl::DParagraphContent:
	//	DRun | DHyperlink
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
	//	tab=DTab?
	//	text=DText
	//	'</run>'
	public DRunElements getDRunAccess() {
		return pDRun;
	}
	
	public ParserRule getDRunRule() {
		return getDRunAccess().getRule();
	}
	
	//DHyperlink doctpl::DHyperlink:
	//	'<hyperlink'
	//	'reference=' reference=[doctpl::DReferenceableObject|STRING]
	//	'>'
	//	run=DRun?
	//	'</hyperlink>'
	public DHyperlinkElements getDHyperlinkAccess() {
		return pDHyperlink;
	}
	
	public ParserRule getDHyperlinkRule() {
		return getDHyperlinkAccess().getRule();
	}
	
	//DText doctpl::DText:
	//	content=RUNTEXT
	public DTextElements getDTextAccess() {
		return pDText;
	}
	
	public ParserRule getDTextRule() {
		return getDTextAccess().getRule();
	}
	
	//DTab doctpl::DTab:
	//	{doctpl::DTab}
	//	'<tab/>'
	public DTabElements getDTabAccess() {
		return pDTab;
	}
	
	public ParserRule getDTabRule() {
		return getDTabAccess().getRule();
	}
	
	//terminal RUNTEXT:
	//	'<text>'->'</text>';
	public TerminalRule getRUNTEXTRule() {
		return tRUNTEXT;
	}
	
	//DFigureFromFile doctpl::DFigureFromFile:
	//	'<figureFromFile'
	//	'name=' name=STRING
	//	'referenceFile=' referenceFile=STRING
	//	'width=' width=UINT_STRING
	//	'height=' height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
	//	indent=REAL_STRING)? ('caption=' caption=STRING)?
	//	'/>'
	public DFigureFromFileElements getDFigureFromFileAccess() {
		return pDFigureFromFile;
	}
	
	public ParserRule getDFigureFromFileRule() {
		return getDFigureFromFileAccess().getRule();
	}
	
	//DTableFromFile doctpl::DTableFromFile:
	//	'<tableFromFile'
	//	'name=' name=STRING
	//	'referenceFile=' referenceFile=STRING
	//	'width=' width=UINT_STRING
	//	'height=' height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('indent='
	//	indent=REAL_STRING)? ('caption=' caption=STRING)?
	//	'/>'
	public DTableFromFileElements getDTableFromFileAccess() {
		return pDTableFromFile;
	}
	
	public ParserRule getDTableFromFileRule() {
		return getDTableFromFileAccess().getRule();
	}
	
	//DBasicTable doctpl::DBasicTable:
	//	'<basicTable'
	//	'name=' name=STRING ('width=' width=UINT_STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)?
	//	('indent=' indent=REAL_STRING)? ('caption=' caption=STRING)?
	//	'>'
	//	rows+=DRow+
	//	'</basicTable>'
	public DBasicTableElements getDBasicTableAccess() {
		return pDBasicTable;
	}
	
	public ParserRule getDBasicTableRule() {
		return getDBasicTableAccess().getRule();
	}
	
	//DRow doctpl::DRow:
	//	'<row>'
	//	cells+=DCell+
	//	'</row>'
	public DRowElements getDRowAccess() {
		return pDRow;
	}
	
	public ParserRule getDRowRule() {
		return getDRowAccess().getRule();
	}
	
	//DCell doctpl::DCell:
	//	'<cell' ('colSpan=' colSpan=UINT_STRING)? ('rowSpan=' rowSpan=UINT_STRING)? ('width=' width=UINT_STRING)? ('shadow='
	//	shadow=STRING)?
	//	'>'
	//	bodyContent+=DBodyContent+
	//	'</cell>'
	public DCellElements getDCellAccess() {
		return pDCell;
	}
	
	public ParserRule getDCellRule() {
		return getDCellAccess().getRule();
	}
	
	//DApplicableDocument doctpl::DApplicableDocument:
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
	
	//DReferenceDocument doctpl::DReferenceDocument:
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
	
	//VSVSTestInfo:
	//	{VSVSTestInfo} body=DBody?;
	public VSVSTestInfoElements getVSVSTestInfoAccess() {
		return pVSVSTestInfo;
	}
	
	public ParserRule getVSVSTestInfoRule() {
		return getVSVSTestInfoAccess().getRule();
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
	//	'<Interfaces>' interfaces=VSVSInterfacesSection '</Interfaces>'
	//	'<Scenarios>' scenarios=VSVSScenariosSection '</Scenarios>'
	//	testDesigns+=VSVSTestDesign+
	//	'</TestingSpecificationDesign>';
	public VSVSTestingSpecificationDesignElements getVSVSTestingSpecificationDesignAccess() {
		return pVSVSTestingSpecificationDesign;
	}
	
	public ParserRule getVSVSTestingSpecificationDesignRule() {
		return getVSVSTestingSpecificationDesignAccess().getRule();
	}
	
	//VSVSInterfacesSection:
	//	{VSVSInterfacesSection} interfaces+=VSVSInterface+;
	public VSVSInterfacesSectionElements getVSVSInterfacesSectionAccess() {
		return pVSVSInterfacesSection;
	}
	
	public ParserRule getVSVSInterfacesSectionRule() {
		return getVSVSInterfacesSectionAccess().getRule();
	}
	
	//VSVSInterface:
	//	'<Interface'
	//	'name=' name=STRING
	//	'>'
	//	description=DRun
	//	'</Interface>';
	public VSVSInterfaceElements getVSVSInterfaceAccess() {
		return pVSVSInterface;
	}
	
	public ParserRule getVSVSInterfaceRule() {
		return getVSVSInterfaceAccess().getRule();
	}
	
	//VSVSScenariosSection:
	//	{VSVSScenariosSection} scenarios+=VSVSScenarioSection+;
	public VSVSScenariosSectionElements getVSVSScenariosSectionAccess() {
		return pVSVSScenariosSection;
	}
	
	public ParserRule getVSVSScenariosSectionRule() {
		return getVSVSScenariosSectionAccess().getRule();
	}
	
	//VSVSScenarioSection:
	//	'<Scenario'
	//	'name=' name=STRING
	//	'>' ('<Interface' 'ref=' interface+=[VSVSInterface|STRING] '/>')+
	//	body=DBody
	//	'</Scenario>';
	public VSVSScenarioSectionElements getVSVSScenarioSectionAccess() {
		return pVSVSScenarioSection;
	}
	
	public ParserRule getVSVSScenarioSectionRule() {
		return getVSVSScenarioSectionAccess().getRule();
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
	//	'<Identifier>' identifier=VSVSTestInfo '</Identifier>'
	//	'<Inputs>' inputs=VSVSTestInfo '</Inputs>'
	//	'<Outputs>' outputs=VSVSTestInfo '</Outputs>'
	//	'<PassFailCriteria>' passFailCriteria=VSVSTestInfo '</PassFailCriteria>'
	//	'<EnvironmentalNeeds>' environmentalNeeds=VSVSTestInfo '</EnvironmentalNeeds>'
	//	'<SpecialConstraints>' specialConstraints=VSVSTestInfo '</SpecialConstraints>'
	//	'<InterfaceDependencies>' interfaceDependencies=VSVSTestInfo '</InterfaceDependencies>' ('<ValidatingItem' 'name='
	//	validatingItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+
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
	//	'<Identifier>' identifier=VSVSTestInfo '</Identifier>'
	//	'<Purpose>' purpose=VSVSTestInfo '</Purpose>'
	//	'<Scenario' 'ref=' scenario=[VSVSScenarioSection|STRING] '/>' ('<TestCase' 'ref=' testCase+=[VSVSTestCase|STRING]
	//	'/>')+
	//	procedureSteps=VSVSProcedureSteps
	//	'<TestScript>' testScript=VSVSTestInfo '</TestScript>'
	//	'</TestProcedure>';
	public VSVSTestProcedureElements getVSVSTestProcedureAccess() {
		return pVSVSTestProcedure;
	}
	
	public ParserRule getVSVSTestProcedureRule() {
		return getVSVSTestProcedureAccess().getRule();
	}
	
	//VSVSProcedureSteps:
	//	'<ProcedureSteps'
	//	'>'
	//	step+=VSVSProcedureStep+
	//	'</ProcedureSteps>';
	public VSVSProcedureStepsElements getVSVSProcedureStepsAccess() {
		return pVSVSProcedureSteps;
	}
	
	public ParserRule getVSVSProcedureStepsRule() {
		return getVSVSProcedureStepsAccess().getRule();
	}
	
	//enum VSVSTimeUnit:
	//	miliseconds='"miliseconds"' | seconds='"seconds"';
	public VSVSTimeUnitElements getVSVSTimeUnitAccess() {
		return eVSVSTimeUnit;
	}
	
	public EnumRule getVSVSTimeUnitRule() {
		return getVSVSTimeUnitAccess().getRule();
	}
	
	//VSVSProcedureStep:
	//	'<Step'
	//	'name=' name=STRING ('prev_step_idref=' prev_step_idref=[VSVSProcedureStep|STRING]
	//	'output_idref_from_prev_step=' output_idref_from_prev_step=[VSVSStepOutput|STRING])? ('replays='
	//	replays=UINT_STRING)?
	//	'>'
	//	inputs=VSVSStepInputs
	//	outputs=VSVSStepOutputs?
	//	'</Step>';
	public VSVSProcedureStepElements getVSVSProcedureStepAccess() {
		return pVSVSProcedureStep;
	}
	
	public ParserRule getVSVSProcedureStepRule() {
		return getVSVSProcedureStepAccess().getRule();
	}
	
	//VSVSStepInputs:
	//	{VSVSStepInputs}
	//	'<Inputs>'
	//	input+=VSVSStepInput+
	//	'</Inputs>';
	public VSVSStepInputsElements getVSVSStepInputsAccess() {
		return pVSVSStepInputs;
	}
	
	public ParserRule getVSVSStepInputsRule() {
		return getVSVSStepInputsAccess().getRule();
	}
	
	//VSVSStepInput:
	//	'<Input'
	//	'name=' name=STRING
	//	'interface=' interface=[VSVSInterface|STRING]
	//	'delay_value=' delay_value=UINT_STRING
	//	'delay_unit=' delay_unit=VSVSTimeUnit
	//	'/>';
	public VSVSStepInputElements getVSVSStepInputAccess() {
		return pVSVSStepInput;
	}
	
	public ParserRule getVSVSStepInputRule() {
		return getVSVSStepInputAccess().getRule();
	}
	
	//enum VSVSStepOutputsCheckmode:
	//	all='"all"' | allunsorted='"allunsorted"' | any='"any"';
	public VSVSStepOutputsCheckmodeElements getVSVSStepOutputsCheckmodeAccess() {
		return eVSVSStepOutputsCheckmode;
	}
	
	public EnumRule getVSVSStepOutputsCheckmodeRule() {
		return getVSVSStepOutputsCheckmodeAccess().getRule();
	}
	
	//VSVSStepOutputs:
	//	'<Outputs'
	//	'checkmode=' checkmode=VSVSStepOutputsCheckmode
	//	'valid_time_interval_value=' valid_time_interval_value=UINT_STRING
	//	'valid_time_interval_unit=' valid_time_interval_unit=VSVSTimeUnit
	//	'>'
	//	output+=VSVSStepOutput+
	//	'</Outputs>';
	public VSVSStepOutputsElements getVSVSStepOutputsAccess() {
		return pVSVSStepOutputs;
	}
	
	public ParserRule getVSVSStepOutputsRule() {
		return getVSVSStepOutputsAccess().getRule();
	}
	
	//VSVSStepOutput:
	//	'<Output'
	//	'name=' name=STRING
	//	'interface=' interface=[VSVSInterface|STRING]
	//	'/>';
	public VSVSStepOutputElements getVSVSStepOutputAccess() {
		return pVSVSStepOutput;
	}
	
	public ParserRule getVSVSStepOutputRule() {
		return getVSVSStepOutputAccess().getRule();
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
	
	//terminal REAL_STRING:
	//	'"' '0'..'9'+ ('.' '0'..'9'+)? '"';
	public TerminalRule getREAL_STRINGRule() {
		return tREAL_STRING;
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
