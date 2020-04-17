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
		private final Assignment cTbcsTbdsSectionAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cTbcsTbdsSectionVSVSTBCsTBDsParserRuleCall_13_0 = (RuleCall)cTbcsTbdsSectionAssignment_13.eContents().get(0);
		private final Assignment cIntroductionSectionAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cIntroductionSectionVSVSIntroductionParserRuleCall_14_0 = (RuleCall)cIntroductionSectionAssignment_14.eContents().get(0);
		private final Assignment cApplicableDocumentsSectionAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cApplicableDocumentsSectionVSVSApplicableDocumentsParserRuleCall_15_0 = (RuleCall)cApplicableDocumentsSectionAssignment_15.eContents().get(0);
		private final Assignment cReferenceDocumentsSectionAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cReferenceDocumentsSectionVSVSReferenceDocumentsParserRuleCall_16_0 = (RuleCall)cReferenceDocumentsSectionAssignment_16.eContents().get(0);
		private final Assignment cTermsDefinitionsAbbreviationsSectionAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTermsDefinitionsAbbreviationsSectionVSVSTermsDefinitionsAbbreviationsParserRuleCall_17_0 = (RuleCall)cTermsDefinitionsAbbreviationsSectionAssignment_17.eContents().get(0);
		private final Assignment cSoftwareOverviewSectionAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cSoftwareOverviewSectionVSVSSoftwareOverviewParserRuleCall_18_0 = (RuleCall)cSoftwareOverviewSectionAssignment_18.eContents().get(0);
		private final Assignment cTaskIdentificationSectionAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cTaskIdentificationSectionVSVSTaskIdentificationParserRuleCall_19_0 = (RuleCall)cTaskIdentificationSectionAssignment_19.eContents().get(0);
		private final Assignment cTestingSpecificationDesignSectionAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cTestingSpecificationDesignSectionVSVSTestingSpecificationDesignParserRuleCall_20_0 = (RuleCall)cTestingSpecificationDesignSectionAssignment_20.eContents().get(0);
		private final Assignment cTestCasesSectionAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cTestCasesSectionVSVSTestCasesParserRuleCall_21_0 = (RuleCall)cTestCasesSectionAssignment_21.eContents().get(0);
		private final Assignment cTestProceduresSectionAssignment_22 = (Assignment)cGroup.eContents().get(22);
		private final RuleCall cTestProceduresSectionVSVSTestProceduresParserRuleCall_22_0 = (RuleCall)cTestProceduresSectionAssignment_22.eContents().get(0);
		private final Assignment cAnalysisInspectionReviewSectionAssignment_23 = (Assignment)cGroup.eContents().get(23);
		private final RuleCall cAnalysisInspectionReviewSectionVSVSAnalysisInspectionReviewParserRuleCall_23_0 = (RuleCall)cAnalysisInspectionReviewSectionAssignment_23.eContents().get(0);
		private final Assignment cTestPlatformRequirementsSectionAssignment_24 = (Assignment)cGroup.eContents().get(24);
		private final RuleCall cTestPlatformRequirementsSectionVSVSTestPlatformRequirementsParserRuleCall_24_0 = (RuleCall)cTestPlatformRequirementsSectionAssignment_24.eContents().get(0);
		private final Assignment cAdditionalInformationSectionAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cAdditionalInformationSectionVSVSAdditionalInformationParserRuleCall_25_0 = (RuleCall)cAdditionalInformationSectionAssignment_25.eContents().get(0);
		private final Keyword cSVSKeyword_26 = (Keyword)cGroup.eContents().get(26);
		
		//VSVSDocument:
		//	'<SVS'
		//	'name=' name=STRING
		//	'id=' id=STRING
		//	'issue=' issue=UINT_STRING
		//	'revision=' revision=UINT_STRING
		//	'date=' date=STRING
		//	'>' ('<parent' 'name=' parents+=[tdm::VTraceableDocument|STRING] '/>')*
		//	tbcsTbdsSection=VSVSTBCsTBDs?
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
		//date=STRING '>' ('<parent' 'name=' parents+=[tdm::VTraceableDocument|STRING] '/>')* tbcsTbdsSection=VSVSTBCsTBDs?
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
		
		//tbcsTbdsSection=VSVSTBCsTBDs?
		public Assignment getTbcsTbdsSectionAssignment_13() { return cTbcsTbdsSectionAssignment_13; }
		
		//VSVSTBCsTBDs
		public RuleCall getTbcsTbdsSectionVSVSTBCsTBDsParserRuleCall_13_0() { return cTbcsTbdsSectionVSVSTBCsTBDsParserRuleCall_13_0; }
		
		//introductionSection=VSVSIntroduction
		public Assignment getIntroductionSectionAssignment_14() { return cIntroductionSectionAssignment_14; }
		
		//VSVSIntroduction
		public RuleCall getIntroductionSectionVSVSIntroductionParserRuleCall_14_0() { return cIntroductionSectionVSVSIntroductionParserRuleCall_14_0; }
		
		//applicableDocumentsSection=VSVSApplicableDocuments
		public Assignment getApplicableDocumentsSectionAssignment_15() { return cApplicableDocumentsSectionAssignment_15; }
		
		//VSVSApplicableDocuments
		public RuleCall getApplicableDocumentsSectionVSVSApplicableDocumentsParserRuleCall_15_0() { return cApplicableDocumentsSectionVSVSApplicableDocumentsParserRuleCall_15_0; }
		
		//referenceDocumentsSection=VSVSReferenceDocuments
		public Assignment getReferenceDocumentsSectionAssignment_16() { return cReferenceDocumentsSectionAssignment_16; }
		
		//VSVSReferenceDocuments
		public RuleCall getReferenceDocumentsSectionVSVSReferenceDocumentsParserRuleCall_16_0() { return cReferenceDocumentsSectionVSVSReferenceDocumentsParserRuleCall_16_0; }
		
		//termsDefinitionsAbbreviationsSection=VSVSTermsDefinitionsAbbreviations
		public Assignment getTermsDefinitionsAbbreviationsSectionAssignment_17() { return cTermsDefinitionsAbbreviationsSectionAssignment_17; }
		
		//VSVSTermsDefinitionsAbbreviations
		public RuleCall getTermsDefinitionsAbbreviationsSectionVSVSTermsDefinitionsAbbreviationsParserRuleCall_17_0() { return cTermsDefinitionsAbbreviationsSectionVSVSTermsDefinitionsAbbreviationsParserRuleCall_17_0; }
		
		//softwareOverviewSection=VSVSSoftwareOverview
		public Assignment getSoftwareOverviewSectionAssignment_18() { return cSoftwareOverviewSectionAssignment_18; }
		
		//VSVSSoftwareOverview
		public RuleCall getSoftwareOverviewSectionVSVSSoftwareOverviewParserRuleCall_18_0() { return cSoftwareOverviewSectionVSVSSoftwareOverviewParserRuleCall_18_0; }
		
		//taskIdentificationSection=VSVSTaskIdentification
		public Assignment getTaskIdentificationSectionAssignment_19() { return cTaskIdentificationSectionAssignment_19; }
		
		//VSVSTaskIdentification
		public RuleCall getTaskIdentificationSectionVSVSTaskIdentificationParserRuleCall_19_0() { return cTaskIdentificationSectionVSVSTaskIdentificationParserRuleCall_19_0; }
		
		//testingSpecificationDesignSection=VSVSTestingSpecificationDesign
		public Assignment getTestingSpecificationDesignSectionAssignment_20() { return cTestingSpecificationDesignSectionAssignment_20; }
		
		//VSVSTestingSpecificationDesign
		public RuleCall getTestingSpecificationDesignSectionVSVSTestingSpecificationDesignParserRuleCall_20_0() { return cTestingSpecificationDesignSectionVSVSTestingSpecificationDesignParserRuleCall_20_0; }
		
		//testCasesSection=VSVSTestCases
		public Assignment getTestCasesSectionAssignment_21() { return cTestCasesSectionAssignment_21; }
		
		//VSVSTestCases
		public RuleCall getTestCasesSectionVSVSTestCasesParserRuleCall_21_0() { return cTestCasesSectionVSVSTestCasesParserRuleCall_21_0; }
		
		//testProceduresSection=VSVSTestProcedures
		public Assignment getTestProceduresSectionAssignment_22() { return cTestProceduresSectionAssignment_22; }
		
		//VSVSTestProcedures
		public RuleCall getTestProceduresSectionVSVSTestProceduresParserRuleCall_22_0() { return cTestProceduresSectionVSVSTestProceduresParserRuleCall_22_0; }
		
		//analysisInspectionReviewSection=VSVSAnalysisInspectionReview
		public Assignment getAnalysisInspectionReviewSectionAssignment_23() { return cAnalysisInspectionReviewSectionAssignment_23; }
		
		//VSVSAnalysisInspectionReview
		public RuleCall getAnalysisInspectionReviewSectionVSVSAnalysisInspectionReviewParserRuleCall_23_0() { return cAnalysisInspectionReviewSectionVSVSAnalysisInspectionReviewParserRuleCall_23_0; }
		
		//testPlatformRequirementsSection=VSVSTestPlatformRequirements
		public Assignment getTestPlatformRequirementsSectionAssignment_24() { return cTestPlatformRequirementsSectionAssignment_24; }
		
		//VSVSTestPlatformRequirements
		public RuleCall getTestPlatformRequirementsSectionVSVSTestPlatformRequirementsParserRuleCall_24_0() { return cTestPlatformRequirementsSectionVSVSTestPlatformRequirementsParserRuleCall_24_0; }
		
		//additionalInformationSection=VSVSAdditionalInformation
		public Assignment getAdditionalInformationSectionAssignment_25() { return cAdditionalInformationSectionAssignment_25; }
		
		//VSVSAdditionalInformation
		public RuleCall getAdditionalInformationSectionVSVSAdditionalInformationParserRuleCall_25_0() { return cAdditionalInformationSectionVSVSAdditionalInformationParserRuleCall_25_0; }
		
		//'</SVS>'
		public Keyword getSVSKeyword_26() { return cSVSKeyword_26; }
	}
	public class VSVSTBCsTBDsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTBCsTBDs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSTBCsTBDsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTBCsTBDsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTbcsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTbcsDTBCParserRuleCall_2_0 = (RuleCall)cTbcsAssignment_2.eContents().get(0);
		private final Assignment cTbdsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTbdsDTBDParserRuleCall_3_0 = (RuleCall)cTbdsAssignment_3.eContents().get(0);
		private final Keyword cTBCsTBDsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSVSTBCsTBDs:
		//	{VSVSTBCsTBDs}
		//	'<TBCsTBDs>'
		//	tbcs+=DTBC*
		//	tbds+=DTBD*
		//	'</TBCsTBDs>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSTBCsTBDs} '<TBCsTBDs>' tbcs+=DTBC* tbds+=DTBD* '</TBCsTBDs>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSTBCsTBDs}
		public Action getVSVSTBCsTBDsAction_0() { return cVSVSTBCsTBDsAction_0; }
		
		//'<TBCsTBDs>'
		public Keyword getTBCsTBDsKeyword_1() { return cTBCsTBDsKeyword_1; }
		
		//tbcs+=DTBC*
		public Assignment getTbcsAssignment_2() { return cTbcsAssignment_2; }
		
		//DTBC
		public RuleCall getTbcsDTBCParserRuleCall_2_0() { return cTbcsDTBCParserRuleCall_2_0; }
		
		//tbds+=DTBD*
		public Assignment getTbdsAssignment_3() { return cTbdsAssignment_3; }
		
		//DTBD
		public RuleCall getTbdsDTBDParserRuleCall_3_0() { return cTbdsDTBDParserRuleCall_3_0; }
		
		//'</TBCsTBDs>'
		public Keyword getTBCsTBDsKeyword_4() { return cTBCsTBDsKeyword_4; }
	}
	public class DTBCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DTBC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTBCKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cDescriptionKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_0_1_0 = (RuleCall)cDescriptionAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cParentTBCKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParentTBCAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final CrossReference cParentTBCDTBCCrossReference_3_1_1_0 = (CrossReference)cParentTBCAssignment_3_1_1.eContents().get(0);
		private final RuleCall cParentTBCDTBCSTRINGTerminalRuleCall_3_1_1_0_1 = (RuleCall)cParentTBCDTBCCrossReference_3_1_1_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DTBC doctpl::DTBC:
		//	'<TBC'
		//	'name=' name=STRING ('description=' description=STRING |
		//	'parentTBC=' parentTBC=[doctpl::DTBC|STRING])
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<TBC' 'name=' name=STRING ('description=' description=STRING | 'parentTBC=' parentTBC=[doctpl::DTBC|STRING]) '/>'
		public Group getGroup() { return cGroup; }
		
		//'<TBC'
		public Keyword getTBCKeyword_0() { return cTBCKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//('description=' description=STRING | 'parentTBC=' parentTBC=[doctpl::DTBC|STRING])
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'description=' description=STRING
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'description='
		public Keyword getDescriptionKeyword_3_0_0() { return cDescriptionKeyword_3_0_0; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_3_0_1() { return cDescriptionAssignment_3_0_1; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_0_1_0() { return cDescriptionSTRINGTerminalRuleCall_3_0_1_0; }
		
		//'parentTBC=' parentTBC=[doctpl::DTBC|STRING]
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'parentTBC='
		public Keyword getParentTBCKeyword_3_1_0() { return cParentTBCKeyword_3_1_0; }
		
		//parentTBC=[doctpl::DTBC|STRING]
		public Assignment getParentTBCAssignment_3_1_1() { return cParentTBCAssignment_3_1_1; }
		
		//[doctpl::DTBC|STRING]
		public CrossReference getParentTBCDTBCCrossReference_3_1_1_0() { return cParentTBCDTBCCrossReference_3_1_1_0; }
		
		//STRING
		public RuleCall getParentTBCDTBCSTRINGTerminalRuleCall_3_1_1_0_1() { return cParentTBCDTBCSTRINGTerminalRuleCall_3_1_1_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_4() { return cSolidusGreaterThanSignKeyword_4; }
	}
	public class DTBDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.DTBD");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTBDKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cDescriptionKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_0_1_0 = (RuleCall)cDescriptionAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cParentTBDKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParentTBDAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final CrossReference cParentTBDDTBDCrossReference_3_1_1_0 = (CrossReference)cParentTBDAssignment_3_1_1.eContents().get(0);
		private final RuleCall cParentTBDDTBDSTRINGTerminalRuleCall_3_1_1_0_1 = (RuleCall)cParentTBDDTBDCrossReference_3_1_1_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DTBD doctpl::DTBD:
		//	'<TBD'
		//	'name=' name=STRING ('description=' description=STRING |
		//	'parentTBD=' parentTBD=[doctpl::DTBD|STRING])
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<TBD' 'name=' name=STRING ('description=' description=STRING | 'parentTBD=' parentTBD=[doctpl::DTBD|STRING]) '/>'
		public Group getGroup() { return cGroup; }
		
		//'<TBD'
		public Keyword getTBDKeyword_0() { return cTBDKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//('description=' description=STRING | 'parentTBD=' parentTBD=[doctpl::DTBD|STRING])
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'description=' description=STRING
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'description='
		public Keyword getDescriptionKeyword_3_0_0() { return cDescriptionKeyword_3_0_0; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_3_0_1() { return cDescriptionAssignment_3_0_1; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_0_1_0() { return cDescriptionSTRINGTerminalRuleCall_3_0_1_0; }
		
		//'parentTBD=' parentTBD=[doctpl::DTBD|STRING]
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'parentTBD='
		public Keyword getParentTBDKeyword_3_1_0() { return cParentTBDKeyword_3_1_0; }
		
		//parentTBD=[doctpl::DTBD|STRING]
		public Assignment getParentTBDAssignment_3_1_1() { return cParentTBDAssignment_3_1_1; }
		
		//[doctpl::DTBD|STRING]
		public CrossReference getParentTBDDTBDCrossReference_3_1_1_0() { return cParentTBDDTBDCrossReference_3_1_1_0; }
		
		//STRING
		public RuleCall getParentTBDDTBDSTRINGTerminalRuleCall_3_1_1_0_1() { return cParentTBDDTBDSTRINGTerminalRuleCall_3_1_1_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_4() { return cSolidusGreaterThanSignKeyword_4; }
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
		private final Action cDListItemAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cListItemKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cParagraphAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParagraphDParagraphParserRuleCall_2_0 = (RuleCall)cParagraphAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cSublistKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSublistAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cSublistDListContentParserRuleCall_3_1_0 = (RuleCall)cSublistAssignment_3_1.eContents().get(0);
		private final Keyword cSublistKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Keyword cListItemKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DListItem doctpl::DListItem:
		//	{doctpl::DListItem}
		//	'<listItem>'
		//	paragraph=DParagraph? ('<sublist>' sublist=DListContent '</sublist>')?
		//	'</listItem>'
		@Override public ParserRule getRule() { return rule; }
		
		//{doctpl::DListItem} '<listItem>' paragraph=DParagraph? ('<sublist>' sublist=DListContent '</sublist>')? '</listItem>'
		public Group getGroup() { return cGroup; }
		
		//{doctpl::DListItem}
		public Action getDListItemAction_0() { return cDListItemAction_0; }
		
		//'<listItem>'
		public Keyword getListItemKeyword_1() { return cListItemKeyword_1; }
		
		//paragraph=DParagraph?
		public Assignment getParagraphAssignment_2() { return cParagraphAssignment_2; }
		
		//DParagraph
		public RuleCall getParagraphDParagraphParserRuleCall_2_0() { return cParagraphDParagraphParserRuleCall_2_0; }
		
		//('<sublist>' sublist=DListContent '</sublist>')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'<sublist>'
		public Keyword getSublistKeyword_3_0() { return cSublistKeyword_3_0; }
		
		//sublist=DListContent
		public Assignment getSublistAssignment_3_1() { return cSublistAssignment_3_1; }
		
		//DListContent
		public RuleCall getSublistDListContentParserRuleCall_3_1_0() { return cSublistDListContentParserRuleCall_3_1_0; }
		
		//'</sublist>'
		public Keyword getSublistKeyword_3_2() { return cSublistKeyword_3_2; }
		
		//'</listItem>'
		public Keyword getListItemKeyword_4() { return cListItemKeyword_4; }
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
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cRunAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cRunDRunParserRuleCall_3_0_1_0 = (RuleCall)cRunAssignment_3_0_1.eContents().get(0);
		private final Keyword cHyperlinkKeyword_3_0_2 = (Keyword)cGroup_3_0.eContents().get(2);
		private final Keyword cSolidusGreaterThanSignKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		
		//DHyperlink doctpl::DHyperlink:
		//	'<hyperlink'
		//	'reference=' reference=[doctpl::DReferenceableObject|STRING] ('>' run=DRun '</hyperlink>' | '/>')
		@Override public ParserRule getRule() { return rule; }
		
		//'<hyperlink' 'reference=' reference=[doctpl::DReferenceableObject|STRING] ('>' run=DRun '</hyperlink>' | '/>')
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
		
		//('>' run=DRun '</hyperlink>' | '/>')
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'>' run=DRun '</hyperlink>'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3_0_0() { return cGreaterThanSignKeyword_3_0_0; }
		
		//run=DRun
		public Assignment getRunAssignment_3_0_1() { return cRunAssignment_3_0_1; }
		
		//DRun
		public RuleCall getRunDRunParserRuleCall_3_0_1_0() { return cRunDRunParserRuleCall_3_0_1_0; }
		
		//'</hyperlink>'
		public Keyword getHyperlinkKeyword_3_0_2() { return cHyperlinkKeyword_3_0_2; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3_1() { return cSolidusGreaterThanSignKeyword_3_1; }
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
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cUrlKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cUrlAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cUrlSTRINGTerminalRuleCall_9_1_0 = (RuleCall)cUrlAssignment_9_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//DApplicableDocument doctpl::DApplicableDocument:
		//	'<ApplicableDocument'
		//	'name=' name=STRING
		//	'title=' title=STRING
		//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)? ('url='
		//	url=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<ApplicableDocument' 'name=' name=STRING 'title=' title=STRING 'id=' id=STRING ('issue=' issue=UINT_STRING ('revision='
		//revision=UINT_STRING)?)? ('date=' date=STRING)? ('url=' url=STRING)? '/>'
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
		
		//('url=' url=STRING)?
		public Group getGroup_9() { return cGroup_9; }
		
		//'url='
		public Keyword getUrlKeyword_9_0() { return cUrlKeyword_9_0; }
		
		//url=STRING
		public Assignment getUrlAssignment_9_1() { return cUrlAssignment_9_1; }
		
		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_9_1_0() { return cUrlSTRINGTerminalRuleCall_9_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_10() { return cSolidusGreaterThanSignKeyword_10; }
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
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cUrlKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cUrlAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cUrlSTRINGTerminalRuleCall_9_1_0 = (RuleCall)cUrlAssignment_9_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//DReferenceDocument doctpl::DReferenceDocument:
		//	'<ReferenceDocument'
		//	'name=' name=STRING
		//	'title=' title=STRING
		//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)? ('url='
		//	url=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<ReferenceDocument' 'name=' name=STRING 'title=' title=STRING 'id=' id=STRING ('issue=' issue=UINT_STRING ('revision='
		//revision=UINT_STRING)?)? ('date=' date=STRING)? ('url=' url=STRING)? '/>'
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
		
		//('url=' url=STRING)?
		public Group getGroup_9() { return cGroup_9; }
		
		//'url='
		public Keyword getUrlKeyword_9_0() { return cUrlKeyword_9_0; }
		
		//url=STRING
		public Assignment getUrlAssignment_9_1() { return cUrlAssignment_9_1; }
		
		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_9_1_0() { return cUrlSTRINGTerminalRuleCall_9_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_10() { return cSolidusGreaterThanSignKeyword_10; }
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
		private final Keyword cTestSetupKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTestSetupAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTestSetupVTestSetupDocumentCrossReference_2_0 = (CrossReference)cTestSetupAssignment_2.eContents().get(0);
		private final RuleCall cTestSetupVTestSetupDocumentSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cTestSetupVTestSetupDocumentCrossReference_2_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cGeneralKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cGeneralAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cGeneralVSVSFixedSectionParserRuleCall_5_0 = (RuleCall)cGeneralAssignment_5.eContents().get(0);
		private final Keyword cGeneralKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTestDesignsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTestDesignsVSVSTestDesignParserRuleCall_7_0 = (RuleCall)cTestDesignsAssignment_7.eContents().get(0);
		private final Keyword cTestingSpecificationDesignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//VSVSTestingSpecificationDesign:
		//	'<TestingSpecificationDesign'
		//	'testSetup=' testSetup=[testsetup::VTestSetupDocument|STRING]
		//	'>'
		//	'<General>' general=VSVSFixedSection '</General>'
		//	testDesigns+=VSVSTestDesign+
		//	'</TestingSpecificationDesign>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestingSpecificationDesign' 'testSetup=' testSetup=[testsetup::VTestSetupDocument|STRING] '>' '<General>'
		//general=VSVSFixedSection '</General>' testDesigns+=VSVSTestDesign+ '</TestingSpecificationDesign>'
		public Group getGroup() { return cGroup; }
		
		//'<TestingSpecificationDesign'
		public Keyword getTestingSpecificationDesignKeyword_0() { return cTestingSpecificationDesignKeyword_0; }
		
		//'testSetup='
		public Keyword getTestSetupKeyword_1() { return cTestSetupKeyword_1; }
		
		//testSetup=[testsetup::VTestSetupDocument|STRING]
		public Assignment getTestSetupAssignment_2() { return cTestSetupAssignment_2; }
		
		//[testsetup::VTestSetupDocument|STRING]
		public CrossReference getTestSetupVTestSetupDocumentCrossReference_2_0() { return cTestSetupVTestSetupDocumentCrossReference_2_0; }
		
		//STRING
		public RuleCall getTestSetupVTestSetupDocumentSTRINGTerminalRuleCall_2_0_1() { return cTestSetupVTestSetupDocumentSTRINGTerminalRuleCall_2_0_1; }
		
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
		
		//testDesigns+=VSVSTestDesign+
		public Assignment getTestDesignsAssignment_7() { return cTestDesignsAssignment_7; }
		
		//VSVSTestDesign
		public RuleCall getTestDesignsVSVSTestDesignParserRuleCall_7_0() { return cTestDesignsVSVSTestDesignParserRuleCall_7_0; }
		
		//'</TestingSpecificationDesign>'
		public Keyword getTestingSpecificationDesignKeyword_8() { return cTestingSpecificationDesignKeyword_8; }
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
		private final CrossReference cScenarioVTestSetupScenarioSectionCrossReference_12_0 = (CrossReference)cScenarioAssignment_12.eContents().get(0);
		private final RuleCall cScenarioVTestSetupScenarioSectionSTRINGTerminalRuleCall_12_0_1 = (RuleCall)cScenarioVTestSetupScenarioSectionCrossReference_12_0.eContents().get(1);
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
		//	'<Scenario' 'ref=' scenario=[testsetup::VTestSetupScenarioSection|STRING] '/>' ('<TestCase' 'ref='
		//	testCase+=[VSVSTestCase|STRING] '/>')+
		//	procedureSteps=VSVSProcedureSteps
		//	'<TestScript>' testScript=VSVSTestInfo '</TestScript>'
		//	'</TestProcedure>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestProcedure' 'name=' name=STRING '>' '<Identifier>' identifier=VSVSTestInfo '</Identifier>' '<Purpose>'
		//purpose=VSVSTestInfo '</Purpose>' '<Scenario' 'ref=' scenario=[testsetup::VTestSetupScenarioSection|STRING] '/>'
		//('<TestCase' 'ref=' testCase+=[VSVSTestCase|STRING] '/>')+ procedureSteps=VSVSProcedureSteps '<TestScript>'
		//testScript=VSVSTestInfo '</TestScript>' '</TestProcedure>'
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
		
		//scenario=[testsetup::VTestSetupScenarioSection|STRING]
		public Assignment getScenarioAssignment_12() { return cScenarioAssignment_12; }
		
		//[testsetup::VTestSetupScenarioSection|STRING]
		public CrossReference getScenarioVTestSetupScenarioSectionCrossReference_12_0() { return cScenarioVTestSetupScenarioSectionCrossReference_12_0; }
		
		//STRING
		public RuleCall getScenarioVTestSetupScenarioSectionSTRINGTerminalRuleCall_12_0_1() { return cScenarioVTestSetupScenarioSectionSTRINGTerminalRuleCall_12_0_1; }
		
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
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cPriorActionOverVariableKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cRefKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cPriorActionOverVariableAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final CrossReference cPriorActionOverVariableVTestSetupSupportedActionOverVariableCrossReference_1_2_0 = (CrossReference)cPriorActionOverVariableAssignment_1_2.eContents().get(0);
		private final RuleCall cPriorActionOverVariableVTestSetupSupportedActionOverVariableSTRINGTerminalRuleCall_1_2_0_1 = (RuleCall)cPriorActionOverVariableVTestSetupSupportedActionOverVariableCrossReference_1_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Assignment cStepAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStepVSVSProcedureStepParserRuleCall_2_0 = (RuleCall)cStepAssignment_2.eContents().get(0);
		private final Keyword cProcedureStepsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSProcedureSteps:
		//	'<ProcedureSteps>' ('<PriorActionOverVariable' 'ref='
		//	priorActionOverVariable=[testsetup::VTestSetupSupportedActionOverVariable|STRING] '/>')?
		//	step+=VSVSProcedureStep+
		//	'</ProcedureSteps>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<ProcedureSteps>' ('<PriorActionOverVariable' 'ref='
		//priorActionOverVariable=[testsetup::VTestSetupSupportedActionOverVariable|STRING] '/>')? step+=VSVSProcedureStep+
		//'</ProcedureSteps>'
		public Group getGroup() { return cGroup; }
		
		//'<ProcedureSteps>'
		public Keyword getProcedureStepsKeyword_0() { return cProcedureStepsKeyword_0; }
		
		//('<PriorActionOverVariable' 'ref=' priorActionOverVariable=[testsetup::VTestSetupSupportedActionOverVariable|STRING]
		//'/>')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'<PriorActionOverVariable'
		public Keyword getPriorActionOverVariableKeyword_1_0() { return cPriorActionOverVariableKeyword_1_0; }
		
		//'ref='
		public Keyword getRefKeyword_1_1() { return cRefKeyword_1_1; }
		
		//priorActionOverVariable=[testsetup::VTestSetupSupportedActionOverVariable|STRING]
		public Assignment getPriorActionOverVariableAssignment_1_2() { return cPriorActionOverVariableAssignment_1_2; }
		
		//[testsetup::VTestSetupSupportedActionOverVariable|STRING]
		public CrossReference getPriorActionOverVariableVTestSetupSupportedActionOverVariableCrossReference_1_2_0() { return cPriorActionOverVariableVTestSetupSupportedActionOverVariableCrossReference_1_2_0; }
		
		//STRING
		public RuleCall getPriorActionOverVariableVTestSetupSupportedActionOverVariableSTRINGTerminalRuleCall_1_2_0_1() { return cPriorActionOverVariableVTestSetupSupportedActionOverVariableSTRINGTerminalRuleCall_1_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_1_3() { return cSolidusGreaterThanSignKeyword_1_3; }
		
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
		private final Keyword cPrev_stepKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPrev_stepAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cPrev_stepVSVSProcedureStepCrossReference_3_1_0 = (CrossReference)cPrev_stepAssignment_3_1.eContents().get(0);
		private final RuleCall cPrev_stepVSVSProcedureStepSTRINGTerminalRuleCall_3_1_0_1 = (RuleCall)cPrev_stepVSVSProcedureStepCrossReference_3_1_0.eContents().get(1);
		private final Keyword cPrev_tm_from_prev_stepKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cPrev_tm_from_prev_stepAssignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final CrossReference cPrev_tm_from_prev_stepVSVSStepTelemetryCrossReference_3_3_0 = (CrossReference)cPrev_tm_from_prev_stepAssignment_3_3.eContents().get(0);
		private final RuleCall cPrev_tm_from_prev_stepVSVSStepTelemetrySTRINGTerminalRuleCall_3_3_0_1 = (RuleCall)cPrev_tm_from_prev_stepVSVSStepTelemetryCrossReference_3_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cReplaysKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cReplaysAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cReplaysUINT_STRINGTerminalRuleCall_4_1_0 = (RuleCall)cReplaysAssignment_4_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cConfigurationsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cConfigurationsVSVSStepConfigurationsParserRuleCall_6_0 = (RuleCall)cConfigurationsAssignment_6.eContents().get(0);
		private final Assignment cInputsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cInputsVSVSStepInputsParserRuleCall_7_0 = (RuleCall)cInputsAssignment_7.eContents().get(0);
		private final Assignment cOutputsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cOutputsVSVSStepOutputsParserRuleCall_8_0 = (RuleCall)cOutputsAssignment_8.eContents().get(0);
		private final Keyword cStepKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//VSVSProcedureStep:
		//	'<Step'
		//	'name=' name=STRING ('prev_step=' prev_step=[VSVSProcedureStep|STRING]
		//	'prev_tm_from_prev_step=' prev_tm_from_prev_step=[VSVSStepTelemetry|STRING])? ('replays=' replays=UINT_STRING)?
		//	'>'
		//	configurations=VSVSStepConfigurations?
		//	inputs=VSVSStepInputs
		//	outputs=VSVSStepOutputs?
		//	'</Step>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Step' 'name=' name=STRING ('prev_step=' prev_step=[VSVSProcedureStep|STRING] 'prev_tm_from_prev_step='
		//prev_tm_from_prev_step=[VSVSStepTelemetry|STRING])? ('replays=' replays=UINT_STRING)? '>'
		//configurations=VSVSStepConfigurations? inputs=VSVSStepInputs outputs=VSVSStepOutputs? '</Step>'
		public Group getGroup() { return cGroup; }
		
		//'<Step'
		public Keyword getStepKeyword_0() { return cStepKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//('prev_step=' prev_step=[VSVSProcedureStep|STRING] 'prev_tm_from_prev_step='
		//prev_tm_from_prev_step=[VSVSStepTelemetry|STRING])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'prev_step='
		public Keyword getPrev_stepKeyword_3_0() { return cPrev_stepKeyword_3_0; }
		
		//prev_step=[VSVSProcedureStep|STRING]
		public Assignment getPrev_stepAssignment_3_1() { return cPrev_stepAssignment_3_1; }
		
		//[VSVSProcedureStep|STRING]
		public CrossReference getPrev_stepVSVSProcedureStepCrossReference_3_1_0() { return cPrev_stepVSVSProcedureStepCrossReference_3_1_0; }
		
		//STRING
		public RuleCall getPrev_stepVSVSProcedureStepSTRINGTerminalRuleCall_3_1_0_1() { return cPrev_stepVSVSProcedureStepSTRINGTerminalRuleCall_3_1_0_1; }
		
		//'prev_tm_from_prev_step='
		public Keyword getPrev_tm_from_prev_stepKeyword_3_2() { return cPrev_tm_from_prev_stepKeyword_3_2; }
		
		//prev_tm_from_prev_step=[VSVSStepTelemetry|STRING]
		public Assignment getPrev_tm_from_prev_stepAssignment_3_3() { return cPrev_tm_from_prev_stepAssignment_3_3; }
		
		//[VSVSStepTelemetry|STRING]
		public CrossReference getPrev_tm_from_prev_stepVSVSStepTelemetryCrossReference_3_3_0() { return cPrev_tm_from_prev_stepVSVSStepTelemetryCrossReference_3_3_0; }
		
		//STRING
		public RuleCall getPrev_tm_from_prev_stepVSVSStepTelemetrySTRINGTerminalRuleCall_3_3_0_1() { return cPrev_tm_from_prev_stepVSVSStepTelemetrySTRINGTerminalRuleCall_3_3_0_1; }
		
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
		
		//configurations=VSVSStepConfigurations?
		public Assignment getConfigurationsAssignment_6() { return cConfigurationsAssignment_6; }
		
		//VSVSStepConfigurations
		public RuleCall getConfigurationsVSVSStepConfigurationsParserRuleCall_6_0() { return cConfigurationsVSVSStepConfigurationsParserRuleCall_6_0; }
		
		//inputs=VSVSStepInputs
		public Assignment getInputsAssignment_7() { return cInputsAssignment_7; }
		
		//VSVSStepInputs
		public RuleCall getInputsVSVSStepInputsParserRuleCall_7_0() { return cInputsVSVSStepInputsParserRuleCall_7_0; }
		
		//outputs=VSVSStepOutputs?
		public Assignment getOutputsAssignment_8() { return cOutputsAssignment_8; }
		
		//VSVSStepOutputs
		public RuleCall getOutputsVSVSStepOutputsParserRuleCall_8_0() { return cOutputsVSVSStepOutputsParserRuleCall_8_0; }
		
		//'</Step>'
		public Keyword getStepKeyword_9() { return cStepKeyword_9; }
	}
	public class VSVSStepConfigurationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepConfigurations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSStepConfigurationsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cConfigurationsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConfigurationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConfigurationVSVSStepConfigurationParserRuleCall_2_0 = (RuleCall)cConfigurationAssignment_2.eContents().get(0);
		private final Keyword cConfigurationsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSStepConfigurations:
		//	{VSVSStepConfigurations}
		//	'<Configurations>'
		//	configuration+=VSVSStepConfiguration+
		//	'</Configurations>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSStepConfigurations} '<Configurations>' configuration+=VSVSStepConfiguration+ '</Configurations>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSStepConfigurations}
		public Action getVSVSStepConfigurationsAction_0() { return cVSVSStepConfigurationsAction_0; }
		
		//'<Configurations>'
		public Keyword getConfigurationsKeyword_1() { return cConfigurationsKeyword_1; }
		
		//configuration+=VSVSStepConfiguration+
		public Assignment getConfigurationAssignment_2() { return cConfigurationAssignment_2; }
		
		//VSVSStepConfiguration
		public RuleCall getConfigurationVSVSStepConfigurationParserRuleCall_2_0() { return cConfigurationVSVSStepConfigurationParserRuleCall_2_0; }
		
		//'</Configurations>'
		public Keyword getConfigurationsKeyword_3() { return cConfigurationsKeyword_3; }
	}
	public class VSVSStepConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConfigurationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cRefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSelectedConfigurationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSelectedConfigurationVTestSetupSelectedConfigurationCrossReference_2_0 = (CrossReference)cSelectedConfigurationAssignment_2.eContents().get(0);
		private final RuleCall cSelectedConfigurationVTestSetupSelectedConfigurationSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cSelectedConfigurationVTestSetupSelectedConfigurationCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cFilterStatusKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cFilterStatusAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cFilterStatusVTestSetupConfigurationStatusEnumRuleCall_3_1_0 = (RuleCall)cFilterStatusAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPrintStatusKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPrintStatusAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPrintStatusVTestSetupConfigurationStatusEnumRuleCall_4_1_0 = (RuleCall)cPrintStatusAssignment_4_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSStepConfiguration:
		//	'<Configuration'
		//	'ref=' selectedConfiguration=[testsetup::VTestSetupSelectedConfiguration|STRING] ('filterStatus='
		//	filterStatus=VTestSetupConfigurationStatus)? ('printStatus=' printStatus=VTestSetupConfigurationStatus)?
		//	'/>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Configuration' 'ref=' selectedConfiguration=[testsetup::VTestSetupSelectedConfiguration|STRING] ('filterStatus='
		//filterStatus=VTestSetupConfigurationStatus)? ('printStatus=' printStatus=VTestSetupConfigurationStatus)? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<Configuration'
		public Keyword getConfigurationKeyword_0() { return cConfigurationKeyword_0; }
		
		//'ref='
		public Keyword getRefKeyword_1() { return cRefKeyword_1; }
		
		//selectedConfiguration=[testsetup::VTestSetupSelectedConfiguration|STRING]
		public Assignment getSelectedConfigurationAssignment_2() { return cSelectedConfigurationAssignment_2; }
		
		//[testsetup::VTestSetupSelectedConfiguration|STRING]
		public CrossReference getSelectedConfigurationVTestSetupSelectedConfigurationCrossReference_2_0() { return cSelectedConfigurationVTestSetupSelectedConfigurationCrossReference_2_0; }
		
		//STRING
		public RuleCall getSelectedConfigurationVTestSetupSelectedConfigurationSTRINGTerminalRuleCall_2_0_1() { return cSelectedConfigurationVTestSetupSelectedConfigurationSTRINGTerminalRuleCall_2_0_1; }
		
		//('filterStatus=' filterStatus=VTestSetupConfigurationStatus)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'filterStatus='
		public Keyword getFilterStatusKeyword_3_0() { return cFilterStatusKeyword_3_0; }
		
		//filterStatus=VTestSetupConfigurationStatus
		public Assignment getFilterStatusAssignment_3_1() { return cFilterStatusAssignment_3_1; }
		
		//VTestSetupConfigurationStatus
		public RuleCall getFilterStatusVTestSetupConfigurationStatusEnumRuleCall_3_1_0() { return cFilterStatusVTestSetupConfigurationStatusEnumRuleCall_3_1_0; }
		
		//('printStatus=' printStatus=VTestSetupConfigurationStatus)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'printStatus='
		public Keyword getPrintStatusKeyword_4_0() { return cPrintStatusKeyword_4_0; }
		
		//printStatus=VTestSetupConfigurationStatus
		public Assignment getPrintStatusAssignment_4_1() { return cPrintStatusAssignment_4_1; }
		
		//VTestSetupConfigurationStatus
		public RuleCall getPrintStatusVTestSetupConfigurationStatusEnumRuleCall_4_1_0() { return cPrintStatusVTestSetupConfigurationStatusEnumRuleCall_4_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_5() { return cSolidusGreaterThanSignKeyword_5; }
	}
	public class VSVSStepInputsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepInputs");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVSVSStepActionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cVSVSStepTelecommandSequenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//VSVSStepInputs:
		//	VSVSStepAction | VSVSStepTelecommandSequence;
		@Override public ParserRule getRule() { return rule; }
		
		//VSVSStepAction | VSVSStepTelecommandSequence
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//VSVSStepAction
		public RuleCall getVSVSStepActionParserRuleCall_0() { return cVSVSStepActionParserRuleCall_0; }
		
		//VSVSStepTelecommandSequence
		public RuleCall getVSVSStepTelecommandSequenceParserRuleCall_1() { return cVSVSStepTelecommandSequenceParserRuleCall_1; }
	}
	public class VSVSStepActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSelectedActionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSelectedActionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSelectedActionVTestSetupActionCrossReference_2_0 = (CrossReference)cSelectedActionAssignment_2.eContents().get(0);
		private final RuleCall cSelectedActionVTestSetupActionSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cSelectedActionVTestSetupActionCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDelay_valueKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDelay_valueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDelay_valueUINT_STRINGTerminalRuleCall_3_1_0 = (RuleCall)cDelay_valueAssignment_3_1.eContents().get(0);
		private final Keyword cDelay_unitKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cDelay_unitAssignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final RuleCall cDelay_unitVSVSTimeUnitEnumRuleCall_3_3_0 = (RuleCall)cDelay_unitAssignment_3_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cSpan_valueKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cSpan_valueAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cSpan_valueUINT_STRINGTerminalRuleCall_4_1_0 = (RuleCall)cSpan_valueAssignment_4_1.eContents().get(0);
		private final Keyword cSpan_unitKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cSpan_unitAssignment_4_3 = (Assignment)cGroup_4.eContents().get(3);
		private final RuleCall cSpan_unitVSVSTimeUnitEnumRuleCall_4_3_0 = (RuleCall)cSpan_unitAssignment_4_3.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSStepAction:
		//	'<Action'
		//	'selectedAction=' selectedAction=[testsetup::VTestSetupAction|STRING] ('delay_value=' delay_value=UINT_STRING
		//	'delay_unit=' delay_unit=VSVSTimeUnit)? ('span_value=' span_value=UINT_STRING
		//	'span_unit=' span_unit=VSVSTimeUnit)?
		//	'/>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Action' 'selectedAction=' selectedAction=[testsetup::VTestSetupAction|STRING] ('delay_value=' delay_value=UINT_STRING
		//'delay_unit=' delay_unit=VSVSTimeUnit)? ('span_value=' span_value=UINT_STRING 'span_unit=' span_unit=VSVSTimeUnit)?
		//'/>'
		public Group getGroup() { return cGroup; }
		
		//'<Action'
		public Keyword getActionKeyword_0() { return cActionKeyword_0; }
		
		//'selectedAction='
		public Keyword getSelectedActionKeyword_1() { return cSelectedActionKeyword_1; }
		
		//selectedAction=[testsetup::VTestSetupAction|STRING]
		public Assignment getSelectedActionAssignment_2() { return cSelectedActionAssignment_2; }
		
		//[testsetup::VTestSetupAction|STRING]
		public CrossReference getSelectedActionVTestSetupActionCrossReference_2_0() { return cSelectedActionVTestSetupActionCrossReference_2_0; }
		
		//STRING
		public RuleCall getSelectedActionVTestSetupActionSTRINGTerminalRuleCall_2_0_1() { return cSelectedActionVTestSetupActionSTRINGTerminalRuleCall_2_0_1; }
		
		//('delay_value=' delay_value=UINT_STRING 'delay_unit=' delay_unit=VSVSTimeUnit)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'delay_value='
		public Keyword getDelay_valueKeyword_3_0() { return cDelay_valueKeyword_3_0; }
		
		//delay_value=UINT_STRING
		public Assignment getDelay_valueAssignment_3_1() { return cDelay_valueAssignment_3_1; }
		
		//UINT_STRING
		public RuleCall getDelay_valueUINT_STRINGTerminalRuleCall_3_1_0() { return cDelay_valueUINT_STRINGTerminalRuleCall_3_1_0; }
		
		//'delay_unit='
		public Keyword getDelay_unitKeyword_3_2() { return cDelay_unitKeyword_3_2; }
		
		//delay_unit=VSVSTimeUnit
		public Assignment getDelay_unitAssignment_3_3() { return cDelay_unitAssignment_3_3; }
		
		//VSVSTimeUnit
		public RuleCall getDelay_unitVSVSTimeUnitEnumRuleCall_3_3_0() { return cDelay_unitVSVSTimeUnitEnumRuleCall_3_3_0; }
		
		//('span_value=' span_value=UINT_STRING 'span_unit=' span_unit=VSVSTimeUnit)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'span_value='
		public Keyword getSpan_valueKeyword_4_0() { return cSpan_valueKeyword_4_0; }
		
		//span_value=UINT_STRING
		public Assignment getSpan_valueAssignment_4_1() { return cSpan_valueAssignment_4_1; }
		
		//UINT_STRING
		public RuleCall getSpan_valueUINT_STRINGTerminalRuleCall_4_1_0() { return cSpan_valueUINT_STRINGTerminalRuleCall_4_1_0; }
		
		//'span_unit='
		public Keyword getSpan_unitKeyword_4_2() { return cSpan_unitKeyword_4_2; }
		
		//span_unit=VSVSTimeUnit
		public Assignment getSpan_unitAssignment_4_3() { return cSpan_unitAssignment_4_3; }
		
		//VSVSTimeUnit
		public RuleCall getSpan_unitVSVSTimeUnitEnumRuleCall_4_3_0() { return cSpan_unitVSVSTimeUnitEnumRuleCall_4_3_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_5() { return cSolidusGreaterThanSignKeyword_5; }
	}
	public class VSVSStepTelecommandSequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelecommandSequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVSStepTelecommandSequenceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTelecommandSequenceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTelecommandAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTelecommandVSVSStepTelecommandParserRuleCall_2_0 = (RuleCall)cTelecommandAssignment_2.eContents().get(0);
		private final Keyword cTelecommandSequenceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVSStepTelecommandSequence:
		//	{VSVSStepTelecommandSequence}
		//	'<TelecommandSequence>'
		//	telecommand+=VSVSStepTelecommand+
		//	'</TelecommandSequence>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVSStepTelecommandSequence} '<TelecommandSequence>' telecommand+=VSVSStepTelecommand+ '</TelecommandSequence>'
		public Group getGroup() { return cGroup; }
		
		//{VSVSStepTelecommandSequence}
		public Action getVSVSStepTelecommandSequenceAction_0() { return cVSVSStepTelecommandSequenceAction_0; }
		
		//'<TelecommandSequence>'
		public Keyword getTelecommandSequenceKeyword_1() { return cTelecommandSequenceKeyword_1; }
		
		//telecommand+=VSVSStepTelecommand+
		public Assignment getTelecommandAssignment_2() { return cTelecommandAssignment_2; }
		
		//VSVSStepTelecommand
		public RuleCall getTelecommandVSVSStepTelecommandParserRuleCall_2_0() { return cTelecommandVSVSStepTelecommandParserRuleCall_2_0; }
		
		//'</TelecommandSequence>'
		public Keyword getTelecommandSequenceKeyword_3() { return cTelecommandSequenceKeyword_3; }
	}
	public class VSVSStepTelecommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelecommand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTelecommandKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cInterfaceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInterfaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cInterfaceVTestSetupSupportedInterfaceCrossReference_4_0 = (CrossReference)cInterfaceAssignment_4.eContents().get(0);
		private final RuleCall cInterfaceVTestSetupSupportedInterfaceSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cInterfaceVTestSetupSupportedInterfaceCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cDelay_valueKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cDelay_valueAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cDelay_valueUINT_STRINGTerminalRuleCall_5_1_0 = (RuleCall)cDelay_valueAssignment_5_1.eContents().get(0);
		private final Keyword cDelay_unitKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Assignment cDelay_unitAssignment_5_3 = (Assignment)cGroup_5.eContents().get(3);
		private final RuleCall cDelay_unitVSVSTimeUnitEnumRuleCall_5_3_0 = (RuleCall)cDelay_unitAssignment_5_3.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTcDataAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTcDataVSVSStepTelecommandDataParserRuleCall_7_0 = (RuleCall)cTcDataAssignment_7.eContents().get(0);
		private final Assignment cTcHeaderAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTcHeaderVSVSStepTelecommandHeaderParserRuleCall_8_0 = (RuleCall)cTcHeaderAssignment_8.eContents().get(0);
		private final Keyword cTelecommandKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//VSVSStepTelecommand:
		//	'<Telecommand'
		//	'name=' name=STRING
		//	'interface=' interface=[testsetup::VTestSetupSupportedInterface|STRING] ('delay_value=' delay_value=UINT_STRING
		//	'delay_unit=' delay_unit=VSVSTimeUnit)?
		//	'>'
		//	tcData=VSVSStepTelecommandData
		//	tcHeader=VSVSStepTelecommandHeader?
		//	'</Telecommand>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Telecommand' 'name=' name=STRING 'interface=' interface=[testsetup::VTestSetupSupportedInterface|STRING]
		//('delay_value=' delay_value=UINT_STRING 'delay_unit=' delay_unit=VSVSTimeUnit)? '>' tcData=VSVSStepTelecommandData
		//tcHeader=VSVSStepTelecommandHeader? '</Telecommand>'
		public Group getGroup() { return cGroup; }
		
		//'<Telecommand'
		public Keyword getTelecommandKeyword_0() { return cTelecommandKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'interface='
		public Keyword getInterfaceKeyword_3() { return cInterfaceKeyword_3; }
		
		//interface=[testsetup::VTestSetupSupportedInterface|STRING]
		public Assignment getInterfaceAssignment_4() { return cInterfaceAssignment_4; }
		
		//[testsetup::VTestSetupSupportedInterface|STRING]
		public CrossReference getInterfaceVTestSetupSupportedInterfaceCrossReference_4_0() { return cInterfaceVTestSetupSupportedInterfaceCrossReference_4_0; }
		
		//STRING
		public RuleCall getInterfaceVTestSetupSupportedInterfaceSTRINGTerminalRuleCall_4_0_1() { return cInterfaceVTestSetupSupportedInterfaceSTRINGTerminalRuleCall_4_0_1; }
		
		//('delay_value=' delay_value=UINT_STRING 'delay_unit=' delay_unit=VSVSTimeUnit)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'delay_value='
		public Keyword getDelay_valueKeyword_5_0() { return cDelay_valueKeyword_5_0; }
		
		//delay_value=UINT_STRING
		public Assignment getDelay_valueAssignment_5_1() { return cDelay_valueAssignment_5_1; }
		
		//UINT_STRING
		public RuleCall getDelay_valueUINT_STRINGTerminalRuleCall_5_1_0() { return cDelay_valueUINT_STRINGTerminalRuleCall_5_1_0; }
		
		//'delay_unit='
		public Keyword getDelay_unitKeyword_5_2() { return cDelay_unitKeyword_5_2; }
		
		//delay_unit=VSVSTimeUnit
		public Assignment getDelay_unitAssignment_5_3() { return cDelay_unitAssignment_5_3; }
		
		//VSVSTimeUnit
		public RuleCall getDelay_unitVSVSTimeUnitEnumRuleCall_5_3_0() { return cDelay_unitVSVSTimeUnitEnumRuleCall_5_3_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_6() { return cGreaterThanSignKeyword_6; }
		
		//tcData=VSVSStepTelecommandData
		public Assignment getTcDataAssignment_7() { return cTcDataAssignment_7; }
		
		//VSVSStepTelecommandData
		public RuleCall getTcDataVSVSStepTelecommandDataParserRuleCall_7_0() { return cTcDataVSVSStepTelecommandDataParserRuleCall_7_0; }
		
		//tcHeader=VSVSStepTelecommandHeader?
		public Assignment getTcHeaderAssignment_8() { return cTcHeaderAssignment_8; }
		
		//VSVSStepTelecommandHeader
		public RuleCall getTcHeaderVSVSStepTelecommandHeaderParserRuleCall_8_0() { return cTcHeaderVSVSStepTelecommandHeaderParserRuleCall_8_0; }
		
		//'</Telecommand>'
		public Keyword getTelecommandKeyword_9() { return cTelecommandKeyword_9; }
	}
	public class VSVSStepTelecommandDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelecommandData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTelecommandDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTemplateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTcTemplateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTcTemplateVTCTemplateCrossReference_2_0 = (CrossReference)cTcTemplateAssignment_2.eContents().get(0);
		private final RuleCall cTcTemplateVTCTemplateSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cTcTemplateVTCTemplateCrossReference_2_0.eContents().get(1);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cFieldsAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cFieldsVSVSStepTelecommandDataFieldParserRuleCall_3_0_1_0 = (RuleCall)cFieldsAssignment_3_0_1.eContents().get(0);
		private final Keyword cTelecommandDataKeyword_3_0_2 = (Keyword)cGroup_3_0.eContents().get(2);
		private final Keyword cSolidusGreaterThanSignKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		
		//VSVSStepTelecommandData:
		//	'<TelecommandData'
		//	'template=' tcTemplate=[tctemplate::VTCTemplate|STRING] ('>' fields+=VSVSStepTelecommandDataField+
		//	'</TelecommandData>' | '/>');
		@Override public ParserRule getRule() { return rule; }
		
		//'<TelecommandData' 'template=' tcTemplate=[tctemplate::VTCTemplate|STRING] ('>' fields+=VSVSStepTelecommandDataField+
		//'</TelecommandData>' | '/>')
		public Group getGroup() { return cGroup; }
		
		//'<TelecommandData'
		public Keyword getTelecommandDataKeyword_0() { return cTelecommandDataKeyword_0; }
		
		//'template='
		public Keyword getTemplateKeyword_1() { return cTemplateKeyword_1; }
		
		//tcTemplate=[tctemplate::VTCTemplate|STRING]
		public Assignment getTcTemplateAssignment_2() { return cTcTemplateAssignment_2; }
		
		//[tctemplate::VTCTemplate|STRING]
		public CrossReference getTcTemplateVTCTemplateCrossReference_2_0() { return cTcTemplateVTCTemplateCrossReference_2_0; }
		
		//STRING
		public RuleCall getTcTemplateVTCTemplateSTRINGTerminalRuleCall_2_0_1() { return cTcTemplateVTCTemplateSTRINGTerminalRuleCall_2_0_1; }
		
		//('>' fields+=VSVSStepTelecommandDataField+ '</TelecommandData>' | '/>')
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'>' fields+=VSVSStepTelecommandDataField+ '</TelecommandData>'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3_0_0() { return cGreaterThanSignKeyword_3_0_0; }
		
		//fields+=VSVSStepTelecommandDataField+
		public Assignment getFieldsAssignment_3_0_1() { return cFieldsAssignment_3_0_1; }
		
		//VSVSStepTelecommandDataField
		public RuleCall getFieldsVSVSStepTelecommandDataFieldParserRuleCall_3_0_1_0() { return cFieldsVSVSStepTelecommandDataFieldParserRuleCall_3_0_1_0; }
		
		//'</TelecommandData>'
		public Keyword getTelecommandDataKeyword_3_0_2() { return cTelecommandDataKeyword_3_0_2; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3_1() { return cSolidusGreaterThanSignKeyword_3_1; }
	}
	public class VSVSStepTelecommandDataFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelecommandDataField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFieldRefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFieldRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cFieldRefTMTCIFTCFieldCrossReference_2_0 = (CrossReference)cFieldRefAssignment_2.eContents().get(0);
		private final RuleCall cFieldRefTMTCIFTCFieldSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cFieldRefTMTCIFTCFieldCrossReference_2_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueTMTCIFFieldValueTCParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cFieldKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSStepTelecommandDataField:
		//	'<Field'
		//	'fieldRef=' fieldRef=[tc::TMTCIFTCField|STRING]
		//	'>'
		//	value=TMTCIFFieldValueTC
		//	'</Field>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Field' 'fieldRef=' fieldRef=[tc::TMTCIFTCField|STRING] '>' value=TMTCIFFieldValueTC '</Field>'
		public Group getGroup() { return cGroup; }
		
		//'<Field'
		public Keyword getFieldKeyword_0() { return cFieldKeyword_0; }
		
		//'fieldRef='
		public Keyword getFieldRefKeyword_1() { return cFieldRefKeyword_1; }
		
		//fieldRef=[tc::TMTCIFTCField|STRING]
		public Assignment getFieldRefAssignment_2() { return cFieldRefAssignment_2; }
		
		//[tc::TMTCIFTCField|STRING]
		public CrossReference getFieldRefTMTCIFTCFieldCrossReference_2_0() { return cFieldRefTMTCIFTCFieldCrossReference_2_0; }
		
		//STRING
		public RuleCall getFieldRefTMTCIFTCFieldSTRINGTerminalRuleCall_2_0_1() { return cFieldRefTMTCIFTCFieldSTRINGTerminalRuleCall_2_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//value=TMTCIFFieldValueTC
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//TMTCIFFieldValueTC
		public RuleCall getValueTMTCIFFieldValueTCParserRuleCall_4_0() { return cValueTMTCIFFieldValueTCParserRuleCall_4_0; }
		
		//'</Field>'
		public Keyword getFieldKeyword_5() { return cFieldKeyword_5; }
	}
	public class TMTCIFFieldValueTCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.TMTCIFFieldValueTC");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTMTCIFFieldValueRawParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTMTCIFFieldValueFileParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTMTCIFFieldValueEnumParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//TMTCIFFieldValueTC fieldvalue::TMTCIFFieldValue:
		//	TMTCIFFieldValueRaw | TMTCIFFieldValueFile | TMTCIFFieldValueEnum
		@Override public ParserRule getRule() { return rule; }
		
		//TMTCIFFieldValueRaw | TMTCIFFieldValueFile | TMTCIFFieldValueEnum
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TMTCIFFieldValueRaw
		public RuleCall getTMTCIFFieldValueRawParserRuleCall_0() { return cTMTCIFFieldValueRawParserRuleCall_0; }
		
		//TMTCIFFieldValueFile
		public RuleCall getTMTCIFFieldValueFileParserRuleCall_1() { return cTMTCIFFieldValueFileParserRuleCall_1; }
		
		//TMTCIFFieldValueEnum
		public RuleCall getTMTCIFFieldValueEnumParserRuleCall_2() { return cTMTCIFFieldValueEnumParserRuleCall_2; }
	}
	public class VSVSStepTelecommandHeaderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelecommandHeader");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTelecommandHeaderKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFieldsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFieldsVSVSStepTelecommandHeaderFieldParserRuleCall_1_0 = (RuleCall)cFieldsAssignment_1.eContents().get(0);
		private final Keyword cTelecommandHeaderKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//VSVSStepTelecommandHeader:
		//	'<TelecommandHeader>'
		//	fields+=VSVSStepTelecommandHeaderField+
		//	'</TelecommandHeader>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TelecommandHeader>' fields+=VSVSStepTelecommandHeaderField+ '</TelecommandHeader>'
		public Group getGroup() { return cGroup; }
		
		//'<TelecommandHeader>'
		public Keyword getTelecommandHeaderKeyword_0() { return cTelecommandHeaderKeyword_0; }
		
		//fields+=VSVSStepTelecommandHeaderField+
		public Assignment getFieldsAssignment_1() { return cFieldsAssignment_1; }
		
		//VSVSStepTelecommandHeaderField
		public RuleCall getFieldsVSVSStepTelecommandHeaderFieldParserRuleCall_1_0() { return cFieldsVSVSStepTelecommandHeaderFieldParserRuleCall_1_0; }
		
		//'</TelecommandHeader>'
		public Keyword getTelecommandHeaderKeyword_2() { return cTelecommandHeaderKeyword_2; }
	}
	public class VSVSStepTelecommandHeaderFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelecommandHeaderField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHeaderFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFieldRefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFieldRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cFieldRefTMTCIFTCHeaderFieldCrossReference_2_0 = (CrossReference)cFieldRefAssignment_2.eContents().get(0);
		private final RuleCall cFieldRefTMTCIFTCHeaderFieldSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cFieldRefTMTCIFTCHeaderFieldCrossReference_2_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueTMTCIFFieldValueHeaderParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cHeaderFieldKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSStepTelecommandHeaderField:
		//	'<HeaderField'
		//	'fieldRef=' fieldRef=[tcheader::TMTCIFTCHeaderField|STRING]
		//	'>'
		//	value=TMTCIFFieldValueHeader
		//	'</HeaderField>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<HeaderField' 'fieldRef=' fieldRef=[tcheader::TMTCIFTCHeaderField|STRING] '>' value=TMTCIFFieldValueHeader
		//'</HeaderField>'
		public Group getGroup() { return cGroup; }
		
		//'<HeaderField'
		public Keyword getHeaderFieldKeyword_0() { return cHeaderFieldKeyword_0; }
		
		//'fieldRef='
		public Keyword getFieldRefKeyword_1() { return cFieldRefKeyword_1; }
		
		//fieldRef=[tcheader::TMTCIFTCHeaderField|STRING]
		public Assignment getFieldRefAssignment_2() { return cFieldRefAssignment_2; }
		
		//[tcheader::TMTCIFTCHeaderField|STRING]
		public CrossReference getFieldRefTMTCIFTCHeaderFieldCrossReference_2_0() { return cFieldRefTMTCIFTCHeaderFieldCrossReference_2_0; }
		
		//STRING
		public RuleCall getFieldRefTMTCIFTCHeaderFieldSTRINGTerminalRuleCall_2_0_1() { return cFieldRefTMTCIFTCHeaderFieldSTRINGTerminalRuleCall_2_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//value=TMTCIFFieldValueHeader
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//TMTCIFFieldValueHeader
		public RuleCall getValueTMTCIFFieldValueHeaderParserRuleCall_4_0() { return cValueTMTCIFFieldValueHeaderParserRuleCall_4_0; }
		
		//'</HeaderField>'
		public Keyword getHeaderFieldKeyword_5() { return cHeaderFieldKeyword_5; }
	}
	public class TMTCIFFieldValueHeaderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.TMTCIFFieldValueHeader");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTMTCIFFieldValueRawParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTMTCIFFieldValueFileParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TMTCIFFieldValueHeader fieldvalue::TMTCIFFieldValue:
		//	TMTCIFFieldValueRaw | TMTCIFFieldValueFile
		@Override public ParserRule getRule() { return rule; }
		
		//TMTCIFFieldValueRaw | TMTCIFFieldValueFile
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TMTCIFFieldValueRaw
		public RuleCall getTMTCIFFieldValueRawParserRuleCall_0() { return cTMTCIFFieldValueRawParserRuleCall_0; }
		
		//TMTCIFFieldValueFile
		public RuleCall getTMTCIFFieldValueFileParserRuleCall_1() { return cTMTCIFFieldValueFileParserRuleCall_1; }
	}
	public class TMTCIFFieldValueRawElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.TMTCIFFieldValueRaw");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldValueRawKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cValueKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cValueAlternatives_2_0 = (Alternatives)cValueAssignment_2.eContents().get(0);
		private final RuleCall cValueUINT_STRINGTerminalRuleCall_2_0_0 = (RuleCall)cValueAlternatives_2_0.eContents().get(0);
		private final RuleCall cValueHEX_STRINGTerminalRuleCall_2_0_1 = (RuleCall)cValueAlternatives_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TMTCIFFieldValueRaw fieldvalue::TMTCIFFieldValueRaw:
		//	'<FieldValueRaw' 'value=' value=(UINT_STRING | HEX_STRING) '/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<FieldValueRaw' 'value=' value=(UINT_STRING | HEX_STRING) '/>'
		public Group getGroup() { return cGroup; }
		
		//'<FieldValueRaw'
		public Keyword getFieldValueRawKeyword_0() { return cFieldValueRawKeyword_0; }
		
		//'value='
		public Keyword getValueKeyword_1() { return cValueKeyword_1; }
		
		//value=(UINT_STRING | HEX_STRING)
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//(UINT_STRING | HEX_STRING)
		public Alternatives getValueAlternatives_2_0() { return cValueAlternatives_2_0; }
		
		//UINT_STRING
		public RuleCall getValueUINT_STRINGTerminalRuleCall_2_0_0() { return cValueUINT_STRINGTerminalRuleCall_2_0_0; }
		
		//HEX_STRING
		public RuleCall getValueHEX_STRINGTerminalRuleCall_2_0_1() { return cValueHEX_STRINGTerminalRuleCall_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3() { return cSolidusGreaterThanSignKeyword_3; }
	}
	public class TMTCIFFieldValueFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.TMTCIFFieldValueFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldValueFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFilenameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFilenameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFilenameSTRINGTerminalRuleCall_2_0 = (RuleCall)cFilenameAssignment_2.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TMTCIFFieldValueFile fieldvalue::TMTCIFFieldValueFile:
		//	'<FieldValueFile' 'filename=' filename=STRING '/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<FieldValueFile' 'filename=' filename=STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<FieldValueFile'
		public Keyword getFieldValueFileKeyword_0() { return cFieldValueFileKeyword_0; }
		
		//'filename='
		public Keyword getFilenameKeyword_1() { return cFilenameKeyword_1; }
		
		//filename=STRING
		public Assignment getFilenameAssignment_2() { return cFilenameAssignment_2; }
		
		//STRING
		public RuleCall getFilenameSTRINGTerminalRuleCall_2_0() { return cFilenameSTRINGTerminalRuleCall_2_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3() { return cSolidusGreaterThanSignKeyword_3; }
	}
	public class TMTCIFFieldValueEnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.TMTCIFFieldValueEnum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldValueEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEnumRefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEnumRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cEnumRefTMTCIFEnumCrossReference_2_0 = (CrossReference)cEnumRefAssignment_2.eContents().get(0);
		private final RuleCall cEnumRefTMTCIFEnumSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cEnumRefTMTCIFEnumCrossReference_2_0.eContents().get(1);
		private final Keyword cValueRefKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cValueRefTMTCIFEnumValueCrossReference_4_0 = (CrossReference)cValueRefAssignment_4.eContents().get(0);
		private final RuleCall cValueRefTMTCIFEnumValueSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cValueRefTMTCIFEnumValueCrossReference_4_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TMTCIFFieldValueEnum fieldvalue::TMTCIFFieldValueEnum:
		//	'<FieldValueEnum' 'enumRef=' enumRef=[enum_::TMTCIFEnum|STRING] 'valueRef=' valueRef=[enum_::TMTCIFEnumValue|STRING]
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<FieldValueEnum' 'enumRef=' enumRef=[enum_::TMTCIFEnum|STRING] 'valueRef=' valueRef=[enum_::TMTCIFEnumValue|STRING]
		//'/>'
		public Group getGroup() { return cGroup; }
		
		//'<FieldValueEnum'
		public Keyword getFieldValueEnumKeyword_0() { return cFieldValueEnumKeyword_0; }
		
		//'enumRef='
		public Keyword getEnumRefKeyword_1() { return cEnumRefKeyword_1; }
		
		//enumRef=[enum_::TMTCIFEnum|STRING]
		public Assignment getEnumRefAssignment_2() { return cEnumRefAssignment_2; }
		
		//[enum_::TMTCIFEnum|STRING]
		public CrossReference getEnumRefTMTCIFEnumCrossReference_2_0() { return cEnumRefTMTCIFEnumCrossReference_2_0; }
		
		//STRING
		public RuleCall getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_2_0_1() { return cEnumRefTMTCIFEnumSTRINGTerminalRuleCall_2_0_1; }
		
		//'valueRef='
		public Keyword getValueRefKeyword_3() { return cValueRefKeyword_3; }
		
		//valueRef=[enum_::TMTCIFEnumValue|STRING]
		public Assignment getValueRefAssignment_4() { return cValueRefAssignment_4; }
		
		//[enum_::TMTCIFEnumValue|STRING]
		public CrossReference getValueRefTMTCIFEnumValueCrossReference_4_0() { return cValueRefTMTCIFEnumValueCrossReference_4_0; }
		
		//STRING
		public RuleCall getValueRefTMTCIFEnumValueSTRINGTerminalRuleCall_4_0_1() { return cValueRefTMTCIFEnumValueSTRINGTerminalRuleCall_4_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_5() { return cSolidusGreaterThanSignKeyword_5; }
	}
	public class VSVSStepOutputsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutputs");
		private final RuleCall cVSVSStepTelemetrySetParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//VSVSStepOutputs:
		//	VSVSStepTelemetrySet;
		@Override public ParserRule getRule() { return rule; }
		
		//VSVSStepTelemetrySet
		public RuleCall getVSVSStepTelemetrySetParserRuleCall() { return cVSVSStepTelemetrySetParserRuleCall; }
	}
	public class VSVSStepTelemetrySetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetrySet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTelemetrySetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cCheckmodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCheckmodeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCheckmodeVSVSStepTelemetrySetCheckmodeEnumRuleCall_2_0 = (RuleCall)cCheckmodeAssignment_2.eContents().get(0);
		private final Keyword cValid_time_interval_valueKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValid_time_interval_valueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValid_time_interval_valueUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cValid_time_interval_valueAssignment_4.eContents().get(0);
		private final Keyword cValid_time_interval_unitKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cValid_time_interval_unitAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cValid_time_interval_unitVSVSTimeUnitEnumRuleCall_6_0 = (RuleCall)cValid_time_interval_unitAssignment_6.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTelemetryAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTelemetryVSVSStepTelemetryParserRuleCall_8_0 = (RuleCall)cTelemetryAssignment_8.eContents().get(0);
		private final Keyword cTelemetrySetKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//VSVSStepTelemetrySet:
		//	'<TelemetrySet'
		//	'checkmode=' checkmode=VSVSStepTelemetrySetCheckmode
		//	'valid_time_interval_value=' valid_time_interval_value=UINT_STRING
		//	'valid_time_interval_unit=' valid_time_interval_unit=VSVSTimeUnit
		//	'>'
		//	telemetry+=VSVSStepTelemetry+
		//	'</TelemetrySet>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TelemetrySet' 'checkmode=' checkmode=VSVSStepTelemetrySetCheckmode 'valid_time_interval_value='
		//valid_time_interval_value=UINT_STRING 'valid_time_interval_unit=' valid_time_interval_unit=VSVSTimeUnit '>'
		//telemetry+=VSVSStepTelemetry+ '</TelemetrySet>'
		public Group getGroup() { return cGroup; }
		
		//'<TelemetrySet'
		public Keyword getTelemetrySetKeyword_0() { return cTelemetrySetKeyword_0; }
		
		//'checkmode='
		public Keyword getCheckmodeKeyword_1() { return cCheckmodeKeyword_1; }
		
		//checkmode=VSVSStepTelemetrySetCheckmode
		public Assignment getCheckmodeAssignment_2() { return cCheckmodeAssignment_2; }
		
		//VSVSStepTelemetrySetCheckmode
		public RuleCall getCheckmodeVSVSStepTelemetrySetCheckmodeEnumRuleCall_2_0() { return cCheckmodeVSVSStepTelemetrySetCheckmodeEnumRuleCall_2_0; }
		
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
		
		//telemetry+=VSVSStepTelemetry+
		public Assignment getTelemetryAssignment_8() { return cTelemetryAssignment_8; }
		
		//VSVSStepTelemetry
		public RuleCall getTelemetryVSVSStepTelemetryParserRuleCall_8_0() { return cTelemetryVSVSStepTelemetryParserRuleCall_8_0; }
		
		//'</TelemetrySet>'
		public Keyword getTelemetrySetKeyword_9() { return cTelemetrySetKeyword_9; }
	}
	public class VSVSStepTelemetryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetry");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTelemetryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cInterfaceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInterfaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cInterfaceVTestSetupSupportedInterfaceCrossReference_4_0 = (CrossReference)cInterfaceAssignment_4.eContents().get(0);
		private final RuleCall cInterfaceVTestSetupSupportedInterfaceSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cInterfaceVTestSetupSupportedInterfaceCrossReference_4_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cTmDataAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTmDataVSVSStepTelemetryDataParserRuleCall_6_0 = (RuleCall)cTmDataAssignment_6.eContents().get(0);
		private final Assignment cTmHeaderAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTmHeaderVSVSStepTelemetryHeaderParserRuleCall_7_0 = (RuleCall)cTmHeaderAssignment_7.eContents().get(0);
		private final Keyword cTelemetryKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//VSVSStepTelemetry:
		//	'<Telemetry'
		//	'name=' name=STRING
		//	'interface=' interface=[testsetup::VTestSetupSupportedInterface|STRING]
		//	'>'
		//	tmData=VSVSStepTelemetryData
		//	tmHeader=VSVSStepTelemetryHeader?
		//	'</Telemetry>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Telemetry' 'name=' name=STRING 'interface=' interface=[testsetup::VTestSetupSupportedInterface|STRING] '>'
		//tmData=VSVSStepTelemetryData tmHeader=VSVSStepTelemetryHeader? '</Telemetry>'
		public Group getGroup() { return cGroup; }
		
		//'<Telemetry'
		public Keyword getTelemetryKeyword_0() { return cTelemetryKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'interface='
		public Keyword getInterfaceKeyword_3() { return cInterfaceKeyword_3; }
		
		//interface=[testsetup::VTestSetupSupportedInterface|STRING]
		public Assignment getInterfaceAssignment_4() { return cInterfaceAssignment_4; }
		
		//[testsetup::VTestSetupSupportedInterface|STRING]
		public CrossReference getInterfaceVTestSetupSupportedInterfaceCrossReference_4_0() { return cInterfaceVTestSetupSupportedInterfaceCrossReference_4_0; }
		
		//STRING
		public RuleCall getInterfaceVTestSetupSupportedInterfaceSTRINGTerminalRuleCall_4_0_1() { return cInterfaceVTestSetupSupportedInterfaceSTRINGTerminalRuleCall_4_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//tmData=VSVSStepTelemetryData
		public Assignment getTmDataAssignment_6() { return cTmDataAssignment_6; }
		
		//VSVSStepTelemetryData
		public RuleCall getTmDataVSVSStepTelemetryDataParserRuleCall_6_0() { return cTmDataVSVSStepTelemetryDataParserRuleCall_6_0; }
		
		//tmHeader=VSVSStepTelemetryHeader?
		public Assignment getTmHeaderAssignment_7() { return cTmHeaderAssignment_7; }
		
		//VSVSStepTelemetryHeader
		public RuleCall getTmHeaderVSVSStepTelemetryHeaderParserRuleCall_7_0() { return cTmHeaderVSVSStepTelemetryHeaderParserRuleCall_7_0; }
		
		//'</Telemetry>'
		public Keyword getTelemetryKeyword_8() { return cTelemetryKeyword_8; }
	}
	public class VSVSStepTelemetryDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetryData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTelemetryDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTemplateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTmTemplateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTmTemplateVTMTemplateCrossReference_2_0 = (CrossReference)cTmTemplateAssignment_2.eContents().get(0);
		private final RuleCall cTmTemplateVTMTemplateSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cTmTemplateVTMTemplateCrossReference_2_0.eContents().get(1);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cFieldsAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cFieldsVSVSStepTelemetryDataFieldParserRuleCall_3_0_1_0 = (RuleCall)cFieldsAssignment_3_0_1.eContents().get(0);
		private final Keyword cTelemetryDataKeyword_3_0_2 = (Keyword)cGroup_3_0.eContents().get(2);
		private final Keyword cSolidusGreaterThanSignKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		
		//VSVSStepTelemetryData:
		//	'<TelemetryData'
		//	'template=' tmTemplate=[tmtemplate::VTMTemplate|STRING] ('>' fields+=VSVSStepTelemetryDataField+ '</TelemetryData>' |
		//	'/>');
		@Override public ParserRule getRule() { return rule; }
		
		//'<TelemetryData' 'template=' tmTemplate=[tmtemplate::VTMTemplate|STRING] ('>' fields+=VSVSStepTelemetryDataField+
		//'</TelemetryData>' | '/>')
		public Group getGroup() { return cGroup; }
		
		//'<TelemetryData'
		public Keyword getTelemetryDataKeyword_0() { return cTelemetryDataKeyword_0; }
		
		//'template='
		public Keyword getTemplateKeyword_1() { return cTemplateKeyword_1; }
		
		//tmTemplate=[tmtemplate::VTMTemplate|STRING]
		public Assignment getTmTemplateAssignment_2() { return cTmTemplateAssignment_2; }
		
		//[tmtemplate::VTMTemplate|STRING]
		public CrossReference getTmTemplateVTMTemplateCrossReference_2_0() { return cTmTemplateVTMTemplateCrossReference_2_0; }
		
		//STRING
		public RuleCall getTmTemplateVTMTemplateSTRINGTerminalRuleCall_2_0_1() { return cTmTemplateVTMTemplateSTRINGTerminalRuleCall_2_0_1; }
		
		//('>' fields+=VSVSStepTelemetryDataField+ '</TelemetryData>' | '/>')
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'>' fields+=VSVSStepTelemetryDataField+ '</TelemetryData>'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3_0_0() { return cGreaterThanSignKeyword_3_0_0; }
		
		//fields+=VSVSStepTelemetryDataField+
		public Assignment getFieldsAssignment_3_0_1() { return cFieldsAssignment_3_0_1; }
		
		//VSVSStepTelemetryDataField
		public RuleCall getFieldsVSVSStepTelemetryDataFieldParserRuleCall_3_0_1_0() { return cFieldsVSVSStepTelemetryDataFieldParserRuleCall_3_0_1_0; }
		
		//'</TelemetryData>'
		public Keyword getTelemetryDataKeyword_3_0_2() { return cTelemetryDataKeyword_3_0_2; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3_1() { return cSolidusGreaterThanSignKeyword_3_1; }
	}
	public class VSVSStepTelemetryDataFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetryDataField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFieldRefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFieldRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cFieldRefTMTCIFTMFieldCrossReference_2_0 = (CrossReference)cFieldRefAssignment_2.eContents().get(0);
		private final RuleCall cFieldRefTMTCIFTMFieldSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cFieldRefTMTCIFTMFieldCrossReference_2_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueTMTCIFFieldValueTMParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cFieldKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSStepTelemetryDataField:
		//	'<Field'
		//	'fieldRef=' fieldRef=[tm::TMTCIFTMField|STRING]
		//	'>'
		//	value=TMTCIFFieldValueTM
		//	'</Field>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Field' 'fieldRef=' fieldRef=[tm::TMTCIFTMField|STRING] '>' value=TMTCIFFieldValueTM '</Field>'
		public Group getGroup() { return cGroup; }
		
		//'<Field'
		public Keyword getFieldKeyword_0() { return cFieldKeyword_0; }
		
		//'fieldRef='
		public Keyword getFieldRefKeyword_1() { return cFieldRefKeyword_1; }
		
		//fieldRef=[tm::TMTCIFTMField|STRING]
		public Assignment getFieldRefAssignment_2() { return cFieldRefAssignment_2; }
		
		//[tm::TMTCIFTMField|STRING]
		public CrossReference getFieldRefTMTCIFTMFieldCrossReference_2_0() { return cFieldRefTMTCIFTMFieldCrossReference_2_0; }
		
		//STRING
		public RuleCall getFieldRefTMTCIFTMFieldSTRINGTerminalRuleCall_2_0_1() { return cFieldRefTMTCIFTMFieldSTRINGTerminalRuleCall_2_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//value=TMTCIFFieldValueTM
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//TMTCIFFieldValueTM
		public RuleCall getValueTMTCIFFieldValueTMParserRuleCall_4_0() { return cValueTMTCIFFieldValueTMParserRuleCall_4_0; }
		
		//'</Field>'
		public Keyword getFieldKeyword_5() { return cFieldKeyword_5; }
	}
	public class VSVSStepTelemetryHeaderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetryHeader");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTelemetryHeaderKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFieldsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFieldsVSVSStepTelemetryHeaderFieldParserRuleCall_1_0 = (RuleCall)cFieldsAssignment_1.eContents().get(0);
		private final Keyword cTelemetryHeaderKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//VSVSStepTelemetryHeader:
		//	'<TelemetryHeader>'
		//	fields+=VSVSStepTelemetryHeaderField+
		//	'</TelemetryHeader>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TelemetryHeader>' fields+=VSVSStepTelemetryHeaderField+ '</TelemetryHeader>'
		public Group getGroup() { return cGroup; }
		
		//'<TelemetryHeader>'
		public Keyword getTelemetryHeaderKeyword_0() { return cTelemetryHeaderKeyword_0; }
		
		//fields+=VSVSStepTelemetryHeaderField+
		public Assignment getFieldsAssignment_1() { return cFieldsAssignment_1; }
		
		//VSVSStepTelemetryHeaderField
		public RuleCall getFieldsVSVSStepTelemetryHeaderFieldParserRuleCall_1_0() { return cFieldsVSVSStepTelemetryHeaderFieldParserRuleCall_1_0; }
		
		//'</TelemetryHeader>'
		public Keyword getTelemetryHeaderKeyword_2() { return cTelemetryHeaderKeyword_2; }
	}
	public class VSVSStepTelemetryHeaderFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetryHeaderField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHeaderFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFieldRefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFieldRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cFieldRefTMTCIFTMHeaderFieldCrossReference_2_0 = (CrossReference)cFieldRefAssignment_2.eContents().get(0);
		private final RuleCall cFieldRefTMTCIFTMHeaderFieldSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cFieldRefTMTCIFTMHeaderFieldCrossReference_2_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueTMTCIFFieldValueHeaderParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cHeaderFieldKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVSStepTelemetryHeaderField:
		//	'<HeaderField'
		//	'fieldRef=' fieldRef=[tmheader::TMTCIFTMHeaderField|STRING]
		//	'>'
		//	value=TMTCIFFieldValueHeader
		//	'</HeaderField>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<HeaderField' 'fieldRef=' fieldRef=[tmheader::TMTCIFTMHeaderField|STRING] '>' value=TMTCIFFieldValueHeader
		//'</HeaderField>'
		public Group getGroup() { return cGroup; }
		
		//'<HeaderField'
		public Keyword getHeaderFieldKeyword_0() { return cHeaderFieldKeyword_0; }
		
		//'fieldRef='
		public Keyword getFieldRefKeyword_1() { return cFieldRefKeyword_1; }
		
		//fieldRef=[tmheader::TMTCIFTMHeaderField|STRING]
		public Assignment getFieldRefAssignment_2() { return cFieldRefAssignment_2; }
		
		//[tmheader::TMTCIFTMHeaderField|STRING]
		public CrossReference getFieldRefTMTCIFTMHeaderFieldCrossReference_2_0() { return cFieldRefTMTCIFTMHeaderFieldCrossReference_2_0; }
		
		//STRING
		public RuleCall getFieldRefTMTCIFTMHeaderFieldSTRINGTerminalRuleCall_2_0_1() { return cFieldRefTMTCIFTMHeaderFieldSTRINGTerminalRuleCall_2_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//value=TMTCIFFieldValueHeader
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//TMTCIFFieldValueHeader
		public RuleCall getValueTMTCIFFieldValueHeaderParserRuleCall_4_0() { return cValueTMTCIFFieldValueHeaderParserRuleCall_4_0; }
		
		//'</HeaderField>'
		public Keyword getHeaderFieldKeyword_5() { return cHeaderFieldKeyword_5; }
	}
	public class TMTCIFFieldValueTMElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.TMTCIFFieldValueTM");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTMTCIFFieldValueRawParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTMTCIFFieldValueFileParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTMTCIFFieldValueEnumParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//TMTCIFFieldValueTM fieldvalue::TMTCIFFieldValue:
		//	TMTCIFFieldValueRaw | TMTCIFFieldValueFile | TMTCIFFieldValueEnum
		@Override public ParserRule getRule() { return rule; }
		
		//TMTCIFFieldValueRaw | TMTCIFFieldValueFile | TMTCIFFieldValueEnum
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TMTCIFFieldValueRaw
		public RuleCall getTMTCIFFieldValueRawParserRuleCall_0() { return cTMTCIFFieldValueRawParserRuleCall_0; }
		
		//TMTCIFFieldValueFile
		public RuleCall getTMTCIFFieldValueFileParserRuleCall_1() { return cTMTCIFFieldValueFileParserRuleCall_1; }
		
		//TMTCIFFieldValueEnum
		public RuleCall getTMTCIFFieldValueEnumParserRuleCall_2() { return cTMTCIFFieldValueEnumParserRuleCall_2; }
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
	public class VTestSetupConfigurationStatusElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupConfigurationStatus");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cOffEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cOffOffKeyword_0_0 = (Keyword)cOffEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOnEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cOnOnKeyword_1_0 = (Keyword)cOnEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum VTestSetupConfigurationStatus returns testsetup::VTestSetupConfigurationStatus:
		//	off='"off"' | on='"on"';
		public EnumRule getRule() { return rule; }
		
		//off='"off"' | on='"on"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//off='"off"'
		public EnumLiteralDeclaration getOffEnumLiteralDeclaration_0() { return cOffEnumLiteralDeclaration_0; }
		
		//'"off"'
		public Keyword getOffOffKeyword_0_0() { return cOffOffKeyword_0_0; }
		
		//on='"on"'
		public EnumLiteralDeclaration getOnEnumLiteralDeclaration_1() { return cOnEnumLiteralDeclaration_1; }
		
		//'"on"'
		public Keyword getOnOnKeyword_1_0() { return cOnOnKeyword_1_0; }
	}
	public class VSVSStepTelemetrySetCheckmodeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetrySetCheckmode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAllEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAllAllKeyword_0_0 = (Keyword)cAllEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAllunsortedEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAllunsortedAllunsortedKeyword_1_0 = (Keyword)cAllunsortedEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cAnyEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cAnyAnyKeyword_2_0 = (Keyword)cAnyEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum VSVSStepTelemetrySetCheckmode:
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
	private final VSVSTBCsTBDsElements pVSVSTBCsTBDs;
	private final DTBCElements pDTBC;
	private final DTBDElements pDTBD;
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
	private final DTabElements pDTab;
	private final DTextElements pDText;
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
	private final VSVSStepConfigurationsElements pVSVSStepConfigurations;
	private final VSVSStepConfigurationElements pVSVSStepConfiguration;
	private final VTestSetupConfigurationStatusElements eVTestSetupConfigurationStatus;
	private final VSVSStepInputsElements pVSVSStepInputs;
	private final VSVSStepActionElements pVSVSStepAction;
	private final VSVSStepTelecommandSequenceElements pVSVSStepTelecommandSequence;
	private final VSVSStepTelecommandElements pVSVSStepTelecommand;
	private final VSVSStepTelecommandDataElements pVSVSStepTelecommandData;
	private final VSVSStepTelecommandDataFieldElements pVSVSStepTelecommandDataField;
	private final TMTCIFFieldValueTCElements pTMTCIFFieldValueTC;
	private final VSVSStepTelecommandHeaderElements pVSVSStepTelecommandHeader;
	private final VSVSStepTelecommandHeaderFieldElements pVSVSStepTelecommandHeaderField;
	private final TMTCIFFieldValueHeaderElements pTMTCIFFieldValueHeader;
	private final TMTCIFFieldValueRawElements pTMTCIFFieldValueRaw;
	private final TMTCIFFieldValueFileElements pTMTCIFFieldValueFile;
	private final TMTCIFFieldValueEnumElements pTMTCIFFieldValueEnum;
	private final VSVSStepOutputsElements pVSVSStepOutputs;
	private final VSVSStepTelemetrySetElements pVSVSStepTelemetrySet;
	private final VSVSStepTelemetrySetCheckmodeElements eVSVSStepTelemetrySetCheckmode;
	private final VSVSStepTelemetryElements pVSVSStepTelemetry;
	private final VSVSStepTelemetryDataElements pVSVSStepTelemetryData;
	private final VSVSStepTelemetryDataFieldElements pVSVSStepTelemetryDataField;
	private final VSVSStepTelemetryHeaderElements pVSVSStepTelemetryHeader;
	private final VSVSStepTelemetryHeaderFieldElements pVSVSStepTelemetryHeaderField;
	private final TMTCIFFieldValueTMElements pTMTCIFFieldValueTM;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final TerminalRule tUINT_STRING;
	private final TerminalRule tREAL_STRING;
	private final TerminalRule tHEX_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SVSGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVSVSDocument = new VSVSDocumentElements();
		this.pVSVSTBCsTBDs = new VSVSTBCsTBDsElements();
		this.pDTBC = new DTBCElements();
		this.pDTBD = new DTBDElements();
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
		this.pDTab = new DTabElements();
		this.pDText = new DTextElements();
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
		this.pVSVSStepConfigurations = new VSVSStepConfigurationsElements();
		this.pVSVSStepConfiguration = new VSVSStepConfigurationElements();
		this.eVTestSetupConfigurationStatus = new VTestSetupConfigurationStatusElements();
		this.pVSVSStepInputs = new VSVSStepInputsElements();
		this.pVSVSStepAction = new VSVSStepActionElements();
		this.pVSVSStepTelecommandSequence = new VSVSStepTelecommandSequenceElements();
		this.pVSVSStepTelecommand = new VSVSStepTelecommandElements();
		this.pVSVSStepTelecommandData = new VSVSStepTelecommandDataElements();
		this.pVSVSStepTelecommandDataField = new VSVSStepTelecommandDataFieldElements();
		this.pTMTCIFFieldValueTC = new TMTCIFFieldValueTCElements();
		this.pVSVSStepTelecommandHeader = new VSVSStepTelecommandHeaderElements();
		this.pVSVSStepTelecommandHeaderField = new VSVSStepTelecommandHeaderFieldElements();
		this.pTMTCIFFieldValueHeader = new TMTCIFFieldValueHeaderElements();
		this.pTMTCIFFieldValueRaw = new TMTCIFFieldValueRawElements();
		this.pTMTCIFFieldValueFile = new TMTCIFFieldValueFileElements();
		this.pTMTCIFFieldValueEnum = new TMTCIFFieldValueEnumElements();
		this.pVSVSStepOutputs = new VSVSStepOutputsElements();
		this.pVSVSStepTelemetrySet = new VSVSStepTelemetrySetElements();
		this.eVSVSStepTelemetrySetCheckmode = new VSVSStepTelemetrySetCheckmodeElements();
		this.pVSVSStepTelemetry = new VSVSStepTelemetryElements();
		this.pVSVSStepTelemetryData = new VSVSStepTelemetryDataElements();
		this.pVSVSStepTelemetryDataField = new VSVSStepTelemetryDataFieldElements();
		this.pVSVSStepTelemetryHeader = new VSVSStepTelemetryHeaderElements();
		this.pVSVSStepTelemetryHeaderField = new VSVSStepTelemetryHeaderFieldElements();
		this.pTMTCIFFieldValueTM = new TMTCIFFieldValueTMElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
		this.tREAL_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.REAL_STRING");
		this.tHEX_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svs.SVS.HEX_STRING");
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
	//	tbcsTbdsSection=VSVSTBCsTBDs?
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
	
	//VSVSTBCsTBDs:
	//	{VSVSTBCsTBDs}
	//	'<TBCsTBDs>'
	//	tbcs+=DTBC*
	//	tbds+=DTBD*
	//	'</TBCsTBDs>';
	public VSVSTBCsTBDsElements getVSVSTBCsTBDsAccess() {
		return pVSVSTBCsTBDs;
	}
	
	public ParserRule getVSVSTBCsTBDsRule() {
		return getVSVSTBCsTBDsAccess().getRule();
	}
	
	//DTBC doctpl::DTBC:
	//	'<TBC'
	//	'name=' name=STRING ('description=' description=STRING |
	//	'parentTBC=' parentTBC=[doctpl::DTBC|STRING])
	//	'/>'
	public DTBCElements getDTBCAccess() {
		return pDTBC;
	}
	
	public ParserRule getDTBCRule() {
		return getDTBCAccess().getRule();
	}
	
	//DTBD doctpl::DTBD:
	//	'<TBD'
	//	'name=' name=STRING ('description=' description=STRING |
	//	'parentTBD=' parentTBD=[doctpl::DTBD|STRING])
	//	'/>'
	public DTBDElements getDTBDAccess() {
		return pDTBD;
	}
	
	public ParserRule getDTBDRule() {
		return getDTBDAccess().getRule();
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
	//	{doctpl::DListItem}
	//	'<listItem>'
	//	paragraph=DParagraph? ('<sublist>' sublist=DListContent '</sublist>')?
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
	//	'reference=' reference=[doctpl::DReferenceableObject|STRING] ('>' run=DRun '</hyperlink>' | '/>')
	public DHyperlinkElements getDHyperlinkAccess() {
		return pDHyperlink;
	}
	
	public ParserRule getDHyperlinkRule() {
		return getDHyperlinkAccess().getRule();
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
	//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)? ('url='
	//	url=STRING)?
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
	//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)? ('url='
	//	url=STRING)?
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
	//	'<TestingSpecificationDesign'
	//	'testSetup=' testSetup=[testsetup::VTestSetupDocument|STRING]
	//	'>'
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
	//	'<Scenario' 'ref=' scenario=[testsetup::VTestSetupScenarioSection|STRING] '/>' ('<TestCase' 'ref='
	//	testCase+=[VSVSTestCase|STRING] '/>')+
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
	//	'<ProcedureSteps>' ('<PriorActionOverVariable' 'ref='
	//	priorActionOverVariable=[testsetup::VTestSetupSupportedActionOverVariable|STRING] '/>')?
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
	//	'name=' name=STRING ('prev_step=' prev_step=[VSVSProcedureStep|STRING]
	//	'prev_tm_from_prev_step=' prev_tm_from_prev_step=[VSVSStepTelemetry|STRING])? ('replays=' replays=UINT_STRING)?
	//	'>'
	//	configurations=VSVSStepConfigurations?
	//	inputs=VSVSStepInputs
	//	outputs=VSVSStepOutputs?
	//	'</Step>';
	public VSVSProcedureStepElements getVSVSProcedureStepAccess() {
		return pVSVSProcedureStep;
	}
	
	public ParserRule getVSVSProcedureStepRule() {
		return getVSVSProcedureStepAccess().getRule();
	}
	
	//VSVSStepConfigurations:
	//	{VSVSStepConfigurations}
	//	'<Configurations>'
	//	configuration+=VSVSStepConfiguration+
	//	'</Configurations>';
	public VSVSStepConfigurationsElements getVSVSStepConfigurationsAccess() {
		return pVSVSStepConfigurations;
	}
	
	public ParserRule getVSVSStepConfigurationsRule() {
		return getVSVSStepConfigurationsAccess().getRule();
	}
	
	//VSVSStepConfiguration:
	//	'<Configuration'
	//	'ref=' selectedConfiguration=[testsetup::VTestSetupSelectedConfiguration|STRING] ('filterStatus='
	//	filterStatus=VTestSetupConfigurationStatus)? ('printStatus=' printStatus=VTestSetupConfigurationStatus)?
	//	'/>';
	public VSVSStepConfigurationElements getVSVSStepConfigurationAccess() {
		return pVSVSStepConfiguration;
	}
	
	public ParserRule getVSVSStepConfigurationRule() {
		return getVSVSStepConfigurationAccess().getRule();
	}
	
	//enum VTestSetupConfigurationStatus returns testsetup::VTestSetupConfigurationStatus:
	//	off='"off"' | on='"on"';
	public VTestSetupConfigurationStatusElements getVTestSetupConfigurationStatusAccess() {
		return eVTestSetupConfigurationStatus;
	}
	
	public EnumRule getVTestSetupConfigurationStatusRule() {
		return getVTestSetupConfigurationStatusAccess().getRule();
	}
	
	//VSVSStepInputs:
	//	VSVSStepAction | VSVSStepTelecommandSequence;
	public VSVSStepInputsElements getVSVSStepInputsAccess() {
		return pVSVSStepInputs;
	}
	
	public ParserRule getVSVSStepInputsRule() {
		return getVSVSStepInputsAccess().getRule();
	}
	
	//VSVSStepAction:
	//	'<Action'
	//	'selectedAction=' selectedAction=[testsetup::VTestSetupAction|STRING] ('delay_value=' delay_value=UINT_STRING
	//	'delay_unit=' delay_unit=VSVSTimeUnit)? ('span_value=' span_value=UINT_STRING
	//	'span_unit=' span_unit=VSVSTimeUnit)?
	//	'/>';
	public VSVSStepActionElements getVSVSStepActionAccess() {
		return pVSVSStepAction;
	}
	
	public ParserRule getVSVSStepActionRule() {
		return getVSVSStepActionAccess().getRule();
	}
	
	//VSVSStepTelecommandSequence:
	//	{VSVSStepTelecommandSequence}
	//	'<TelecommandSequence>'
	//	telecommand+=VSVSStepTelecommand+
	//	'</TelecommandSequence>';
	public VSVSStepTelecommandSequenceElements getVSVSStepTelecommandSequenceAccess() {
		return pVSVSStepTelecommandSequence;
	}
	
	public ParserRule getVSVSStepTelecommandSequenceRule() {
		return getVSVSStepTelecommandSequenceAccess().getRule();
	}
	
	//VSVSStepTelecommand:
	//	'<Telecommand'
	//	'name=' name=STRING
	//	'interface=' interface=[testsetup::VTestSetupSupportedInterface|STRING] ('delay_value=' delay_value=UINT_STRING
	//	'delay_unit=' delay_unit=VSVSTimeUnit)?
	//	'>'
	//	tcData=VSVSStepTelecommandData
	//	tcHeader=VSVSStepTelecommandHeader?
	//	'</Telecommand>';
	public VSVSStepTelecommandElements getVSVSStepTelecommandAccess() {
		return pVSVSStepTelecommand;
	}
	
	public ParserRule getVSVSStepTelecommandRule() {
		return getVSVSStepTelecommandAccess().getRule();
	}
	
	//VSVSStepTelecommandData:
	//	'<TelecommandData'
	//	'template=' tcTemplate=[tctemplate::VTCTemplate|STRING] ('>' fields+=VSVSStepTelecommandDataField+
	//	'</TelecommandData>' | '/>');
	public VSVSStepTelecommandDataElements getVSVSStepTelecommandDataAccess() {
		return pVSVSStepTelecommandData;
	}
	
	public ParserRule getVSVSStepTelecommandDataRule() {
		return getVSVSStepTelecommandDataAccess().getRule();
	}
	
	//VSVSStepTelecommandDataField:
	//	'<Field'
	//	'fieldRef=' fieldRef=[tc::TMTCIFTCField|STRING]
	//	'>'
	//	value=TMTCIFFieldValueTC
	//	'</Field>';
	public VSVSStepTelecommandDataFieldElements getVSVSStepTelecommandDataFieldAccess() {
		return pVSVSStepTelecommandDataField;
	}
	
	public ParserRule getVSVSStepTelecommandDataFieldRule() {
		return getVSVSStepTelecommandDataFieldAccess().getRule();
	}
	
	//TMTCIFFieldValueTC fieldvalue::TMTCIFFieldValue:
	//	TMTCIFFieldValueRaw | TMTCIFFieldValueFile | TMTCIFFieldValueEnum
	public TMTCIFFieldValueTCElements getTMTCIFFieldValueTCAccess() {
		return pTMTCIFFieldValueTC;
	}
	
	public ParserRule getTMTCIFFieldValueTCRule() {
		return getTMTCIFFieldValueTCAccess().getRule();
	}
	
	//VSVSStepTelecommandHeader:
	//	'<TelecommandHeader>'
	//	fields+=VSVSStepTelecommandHeaderField+
	//	'</TelecommandHeader>';
	public VSVSStepTelecommandHeaderElements getVSVSStepTelecommandHeaderAccess() {
		return pVSVSStepTelecommandHeader;
	}
	
	public ParserRule getVSVSStepTelecommandHeaderRule() {
		return getVSVSStepTelecommandHeaderAccess().getRule();
	}
	
	//VSVSStepTelecommandHeaderField:
	//	'<HeaderField'
	//	'fieldRef=' fieldRef=[tcheader::TMTCIFTCHeaderField|STRING]
	//	'>'
	//	value=TMTCIFFieldValueHeader
	//	'</HeaderField>';
	public VSVSStepTelecommandHeaderFieldElements getVSVSStepTelecommandHeaderFieldAccess() {
		return pVSVSStepTelecommandHeaderField;
	}
	
	public ParserRule getVSVSStepTelecommandHeaderFieldRule() {
		return getVSVSStepTelecommandHeaderFieldAccess().getRule();
	}
	
	//TMTCIFFieldValueHeader fieldvalue::TMTCIFFieldValue:
	//	TMTCIFFieldValueRaw | TMTCIFFieldValueFile
	public TMTCIFFieldValueHeaderElements getTMTCIFFieldValueHeaderAccess() {
		return pTMTCIFFieldValueHeader;
	}
	
	public ParserRule getTMTCIFFieldValueHeaderRule() {
		return getTMTCIFFieldValueHeaderAccess().getRule();
	}
	
	//TMTCIFFieldValueRaw fieldvalue::TMTCIFFieldValueRaw:
	//	'<FieldValueRaw' 'value=' value=(UINT_STRING | HEX_STRING) '/>'
	public TMTCIFFieldValueRawElements getTMTCIFFieldValueRawAccess() {
		return pTMTCIFFieldValueRaw;
	}
	
	public ParserRule getTMTCIFFieldValueRawRule() {
		return getTMTCIFFieldValueRawAccess().getRule();
	}
	
	//TMTCIFFieldValueFile fieldvalue::TMTCIFFieldValueFile:
	//	'<FieldValueFile' 'filename=' filename=STRING '/>'
	public TMTCIFFieldValueFileElements getTMTCIFFieldValueFileAccess() {
		return pTMTCIFFieldValueFile;
	}
	
	public ParserRule getTMTCIFFieldValueFileRule() {
		return getTMTCIFFieldValueFileAccess().getRule();
	}
	
	//TMTCIFFieldValueEnum fieldvalue::TMTCIFFieldValueEnum:
	//	'<FieldValueEnum' 'enumRef=' enumRef=[enum_::TMTCIFEnum|STRING] 'valueRef=' valueRef=[enum_::TMTCIFEnumValue|STRING]
	//	'/>'
	public TMTCIFFieldValueEnumElements getTMTCIFFieldValueEnumAccess() {
		return pTMTCIFFieldValueEnum;
	}
	
	public ParserRule getTMTCIFFieldValueEnumRule() {
		return getTMTCIFFieldValueEnumAccess().getRule();
	}
	
	//VSVSStepOutputs:
	//	VSVSStepTelemetrySet;
	public VSVSStepOutputsElements getVSVSStepOutputsAccess() {
		return pVSVSStepOutputs;
	}
	
	public ParserRule getVSVSStepOutputsRule() {
		return getVSVSStepOutputsAccess().getRule();
	}
	
	//VSVSStepTelemetrySet:
	//	'<TelemetrySet'
	//	'checkmode=' checkmode=VSVSStepTelemetrySetCheckmode
	//	'valid_time_interval_value=' valid_time_interval_value=UINT_STRING
	//	'valid_time_interval_unit=' valid_time_interval_unit=VSVSTimeUnit
	//	'>'
	//	telemetry+=VSVSStepTelemetry+
	//	'</TelemetrySet>';
	public VSVSStepTelemetrySetElements getVSVSStepTelemetrySetAccess() {
		return pVSVSStepTelemetrySet;
	}
	
	public ParserRule getVSVSStepTelemetrySetRule() {
		return getVSVSStepTelemetrySetAccess().getRule();
	}
	
	//enum VSVSStepTelemetrySetCheckmode:
	//	all='"all"' | allunsorted='"allunsorted"' | any='"any"';
	public VSVSStepTelemetrySetCheckmodeElements getVSVSStepTelemetrySetCheckmodeAccess() {
		return eVSVSStepTelemetrySetCheckmode;
	}
	
	public EnumRule getVSVSStepTelemetrySetCheckmodeRule() {
		return getVSVSStepTelemetrySetCheckmodeAccess().getRule();
	}
	
	//VSVSStepTelemetry:
	//	'<Telemetry'
	//	'name=' name=STRING
	//	'interface=' interface=[testsetup::VTestSetupSupportedInterface|STRING]
	//	'>'
	//	tmData=VSVSStepTelemetryData
	//	tmHeader=VSVSStepTelemetryHeader?
	//	'</Telemetry>';
	public VSVSStepTelemetryElements getVSVSStepTelemetryAccess() {
		return pVSVSStepTelemetry;
	}
	
	public ParserRule getVSVSStepTelemetryRule() {
		return getVSVSStepTelemetryAccess().getRule();
	}
	
	//VSVSStepTelemetryData:
	//	'<TelemetryData'
	//	'template=' tmTemplate=[tmtemplate::VTMTemplate|STRING] ('>' fields+=VSVSStepTelemetryDataField+ '</TelemetryData>' |
	//	'/>');
	public VSVSStepTelemetryDataElements getVSVSStepTelemetryDataAccess() {
		return pVSVSStepTelemetryData;
	}
	
	public ParserRule getVSVSStepTelemetryDataRule() {
		return getVSVSStepTelemetryDataAccess().getRule();
	}
	
	//VSVSStepTelemetryDataField:
	//	'<Field'
	//	'fieldRef=' fieldRef=[tm::TMTCIFTMField|STRING]
	//	'>'
	//	value=TMTCIFFieldValueTM
	//	'</Field>';
	public VSVSStepTelemetryDataFieldElements getVSVSStepTelemetryDataFieldAccess() {
		return pVSVSStepTelemetryDataField;
	}
	
	public ParserRule getVSVSStepTelemetryDataFieldRule() {
		return getVSVSStepTelemetryDataFieldAccess().getRule();
	}
	
	//VSVSStepTelemetryHeader:
	//	'<TelemetryHeader>'
	//	fields+=VSVSStepTelemetryHeaderField+
	//	'</TelemetryHeader>';
	public VSVSStepTelemetryHeaderElements getVSVSStepTelemetryHeaderAccess() {
		return pVSVSStepTelemetryHeader;
	}
	
	public ParserRule getVSVSStepTelemetryHeaderRule() {
		return getVSVSStepTelemetryHeaderAccess().getRule();
	}
	
	//VSVSStepTelemetryHeaderField:
	//	'<HeaderField'
	//	'fieldRef=' fieldRef=[tmheader::TMTCIFTMHeaderField|STRING]
	//	'>'
	//	value=TMTCIFFieldValueHeader
	//	'</HeaderField>';
	public VSVSStepTelemetryHeaderFieldElements getVSVSStepTelemetryHeaderFieldAccess() {
		return pVSVSStepTelemetryHeaderField;
	}
	
	public ParserRule getVSVSStepTelemetryHeaderFieldRule() {
		return getVSVSStepTelemetryHeaderFieldAccess().getRule();
	}
	
	//TMTCIFFieldValueTM fieldvalue::TMTCIFFieldValue:
	//	TMTCIFFieldValueRaw | TMTCIFFieldValueFile | TMTCIFFieldValueEnum
	public TMTCIFFieldValueTMElements getTMTCIFFieldValueTMAccess() {
		return pTMTCIFFieldValueTM;
	}
	
	public ParserRule getTMTCIFFieldValueTMRule() {
		return getTMTCIFFieldValueTMAccess().getRule();
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
	
	//terminal HEX_STRING:
	//	'"0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+ '"';
	public TerminalRule getHEX_STRINGRule() {
		return tHEX_STRING;
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
