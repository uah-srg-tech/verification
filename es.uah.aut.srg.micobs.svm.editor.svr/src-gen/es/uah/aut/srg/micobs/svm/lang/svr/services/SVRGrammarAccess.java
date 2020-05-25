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
package es.uah.aut.srg.micobs.svm.lang.svr.services;

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
public class SVRGrammarAccess extends AbstractGrammarElementFinder {
	
	public class VSVRDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSVRKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Keyword cSvsParentKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cNameKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cSvsParentAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final CrossReference cSvsParentVSVSDocumentCrossReference_14_0 = (CrossReference)cSvsParentAssignment_14.eContents().get(0);
		private final RuleCall cSvsParentVSVSDocumentSTRINGTerminalRuleCall_14_0_1 = (RuleCall)cSvsParentVSVSDocumentCrossReference_14_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final Keyword cTcrParentKeyword_16_0 = (Keyword)cGroup_16.eContents().get(0);
		private final Keyword cNameKeyword_16_1 = (Keyword)cGroup_16.eContents().get(1);
		private final Assignment cTcrParentAssignment_16_2 = (Assignment)cGroup_16.eContents().get(2);
		private final CrossReference cTcrParentVTCRTestCampaignReportCrossReference_16_2_0 = (CrossReference)cTcrParentAssignment_16_2.eContents().get(0);
		private final RuleCall cTcrParentVTCRTestCampaignReportSTRINGTerminalRuleCall_16_2_0_1 = (RuleCall)cTcrParentVTCRTestCampaignReportCrossReference_16_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_16_3 = (Keyword)cGroup_16.eContents().get(3);
		private final Assignment cTbcsTbdsSectionAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTbcsTbdsSectionVSVRTBCsTBDsParserRuleCall_17_0 = (RuleCall)cTbcsTbdsSectionAssignment_17.eContents().get(0);
		private final Assignment cIntroductionSectionAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cIntroductionSectionVSVRIntroductionParserRuleCall_18_0 = (RuleCall)cIntroductionSectionAssignment_18.eContents().get(0);
		private final Assignment cApplicableDocumentsSectionAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cApplicableDocumentsSectionVSVRApplicableDocumentsParserRuleCall_19_0 = (RuleCall)cApplicableDocumentsSectionAssignment_19.eContents().get(0);
		private final Assignment cReferenceDocumentsSectionAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cReferenceDocumentsSectionVSVRReferenceDocumentsParserRuleCall_20_0 = (RuleCall)cReferenceDocumentsSectionAssignment_20.eContents().get(0);
		private final Assignment cTermsDefinitionsAbbreviationsSectionAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cTermsDefinitionsAbbreviationsSectionVSVRTermsDefinitionsAbbreviationsParserRuleCall_21_0 = (RuleCall)cTermsDefinitionsAbbreviationsSectionAssignment_21.eContents().get(0);
		private final Assignment cSwValProcessVerificationSectionAssignment_22 = (Assignment)cGroup.eContents().get(22);
		private final RuleCall cSwValProcessVerificationSectionVSVRSWValProcessVerificationParserRuleCall_22_0 = (RuleCall)cSwValProcessVerificationSectionAssignment_22.eContents().get(0);
		private final Keyword cSVRKeyword_23 = (Keyword)cGroup.eContents().get(23);
		
		//VSVRDocument:
		//	'<SVR'
		//	'name=' name=STRING
		//	'id=' id=STRING
		//	'issue=' issue=UINT_STRING
		//	'revision=' revision=UINT_STRING
		//	'date=' date=STRING
		//	'>'
		//	'<svsParent' 'name=' svsParent=[svs::VSVSDocument|STRING] '/>' ('<tcrParent' 'name='
		//	tcrParent+=[tcr::VTCRTestCampaignReport|STRING] '/>')*
		//	tbcsTbdsSection=VSVRTBCsTBDs?
		//	introductionSection=VSVRIntroduction
		//	applicableDocumentsSection=VSVRApplicableDocuments
		//	referenceDocumentsSection=VSVRReferenceDocuments
		//	termsDefinitionsAbbreviationsSection=VSVRTermsDefinitionsAbbreviations
		//	swValProcessVerificationSection=VSVRSWValProcessVerification
		//	'</SVR>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<SVR' 'name=' name=STRING 'id=' id=STRING 'issue=' issue=UINT_STRING 'revision=' revision=UINT_STRING 'date='
		//date=STRING '>' '<svsParent' 'name=' svsParent=[svs::VSVSDocument|STRING] '/>' ('<tcrParent' 'name='
		//tcrParent+=[tcr::VTCRTestCampaignReport|STRING] '/>')* tbcsTbdsSection=VSVRTBCsTBDs?
		//introductionSection=VSVRIntroduction applicableDocumentsSection=VSVRApplicableDocuments
		//referenceDocumentsSection=VSVRReferenceDocuments
		//termsDefinitionsAbbreviationsSection=VSVRTermsDefinitionsAbbreviations
		//swValProcessVerificationSection=VSVRSWValProcessVerification '</SVR>'
		public Group getGroup() { return cGroup; }
		
		//'<SVR'
		public Keyword getSVRKeyword_0() { return cSVRKeyword_0; }
		
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
		
		//'<svsParent'
		public Keyword getSvsParentKeyword_12() { return cSvsParentKeyword_12; }
		
		//'name='
		public Keyword getNameKeyword_13() { return cNameKeyword_13; }
		
		//svsParent=[svs::VSVSDocument|STRING]
		public Assignment getSvsParentAssignment_14() { return cSvsParentAssignment_14; }
		
		//[svs::VSVSDocument|STRING]
		public CrossReference getSvsParentVSVSDocumentCrossReference_14_0() { return cSvsParentVSVSDocumentCrossReference_14_0; }
		
		//STRING
		public RuleCall getSvsParentVSVSDocumentSTRINGTerminalRuleCall_14_0_1() { return cSvsParentVSVSDocumentSTRINGTerminalRuleCall_14_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_15() { return cSolidusGreaterThanSignKeyword_15; }
		
		//('<tcrParent' 'name=' tcrParent+=[tcr::VTCRTestCampaignReport|STRING] '/>')*
		public Group getGroup_16() { return cGroup_16; }
		
		//'<tcrParent'
		public Keyword getTcrParentKeyword_16_0() { return cTcrParentKeyword_16_0; }
		
		//'name='
		public Keyword getNameKeyword_16_1() { return cNameKeyword_16_1; }
		
		//tcrParent+=[tcr::VTCRTestCampaignReport|STRING]
		public Assignment getTcrParentAssignment_16_2() { return cTcrParentAssignment_16_2; }
		
		//[tcr::VTCRTestCampaignReport|STRING]
		public CrossReference getTcrParentVTCRTestCampaignReportCrossReference_16_2_0() { return cTcrParentVTCRTestCampaignReportCrossReference_16_2_0; }
		
		//STRING
		public RuleCall getTcrParentVTCRTestCampaignReportSTRINGTerminalRuleCall_16_2_0_1() { return cTcrParentVTCRTestCampaignReportSTRINGTerminalRuleCall_16_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_16_3() { return cSolidusGreaterThanSignKeyword_16_3; }
		
		//tbcsTbdsSection=VSVRTBCsTBDs?
		public Assignment getTbcsTbdsSectionAssignment_17() { return cTbcsTbdsSectionAssignment_17; }
		
		//VSVRTBCsTBDs
		public RuleCall getTbcsTbdsSectionVSVRTBCsTBDsParserRuleCall_17_0() { return cTbcsTbdsSectionVSVRTBCsTBDsParserRuleCall_17_0; }
		
		//introductionSection=VSVRIntroduction
		public Assignment getIntroductionSectionAssignment_18() { return cIntroductionSectionAssignment_18; }
		
		//VSVRIntroduction
		public RuleCall getIntroductionSectionVSVRIntroductionParserRuleCall_18_0() { return cIntroductionSectionVSVRIntroductionParserRuleCall_18_0; }
		
		//applicableDocumentsSection=VSVRApplicableDocuments
		public Assignment getApplicableDocumentsSectionAssignment_19() { return cApplicableDocumentsSectionAssignment_19; }
		
		//VSVRApplicableDocuments
		public RuleCall getApplicableDocumentsSectionVSVRApplicableDocumentsParserRuleCall_19_0() { return cApplicableDocumentsSectionVSVRApplicableDocumentsParserRuleCall_19_0; }
		
		//referenceDocumentsSection=VSVRReferenceDocuments
		public Assignment getReferenceDocumentsSectionAssignment_20() { return cReferenceDocumentsSectionAssignment_20; }
		
		//VSVRReferenceDocuments
		public RuleCall getReferenceDocumentsSectionVSVRReferenceDocumentsParserRuleCall_20_0() { return cReferenceDocumentsSectionVSVRReferenceDocumentsParserRuleCall_20_0; }
		
		//termsDefinitionsAbbreviationsSection=VSVRTermsDefinitionsAbbreviations
		public Assignment getTermsDefinitionsAbbreviationsSectionAssignment_21() { return cTermsDefinitionsAbbreviationsSectionAssignment_21; }
		
		//VSVRTermsDefinitionsAbbreviations
		public RuleCall getTermsDefinitionsAbbreviationsSectionVSVRTermsDefinitionsAbbreviationsParserRuleCall_21_0() { return cTermsDefinitionsAbbreviationsSectionVSVRTermsDefinitionsAbbreviationsParserRuleCall_21_0; }
		
		//swValProcessVerificationSection=VSVRSWValProcessVerification
		public Assignment getSwValProcessVerificationSectionAssignment_22() { return cSwValProcessVerificationSectionAssignment_22; }
		
		//VSVRSWValProcessVerification
		public RuleCall getSwValProcessVerificationSectionVSVRSWValProcessVerificationParserRuleCall_22_0() { return cSwValProcessVerificationSectionVSVRSWValProcessVerificationParserRuleCall_22_0; }
		
		//'</SVR>'
		public Keyword getSVRKeyword_23() { return cSVRKeyword_23; }
	}
	public class VSVRTBCsTBDsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRTBCsTBDs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVRTBCsTBDsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTBCsTBDsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTbcsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTbcsDTBCParserRuleCall_2_0 = (RuleCall)cTbcsAssignment_2.eContents().get(0);
		private final Assignment cTbdsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTbdsDTBDParserRuleCall_3_0 = (RuleCall)cTbdsAssignment_3.eContents().get(0);
		private final Keyword cTBCsTBDsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSVRTBCsTBDs:
		//	{VSVRTBCsTBDs}
		//	'<TBCsTBDs>'
		//	tbcs+=DTBC*
		//	tbds+=DTBD*
		//	'</TBCsTBDs>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVRTBCsTBDs} '<TBCsTBDs>' tbcs+=DTBC* tbds+=DTBD* '</TBCsTBDs>'
		public Group getGroup() { return cGroup; }
		
		//{VSVRTBCsTBDs}
		public Action getVSVRTBCsTBDsAction_0() { return cVSVRTBCsTBDsAction_0; }
		
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DTBC");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DTBD");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DBody");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DBodyContent");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DParagraph");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DListItem");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DListContent");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DItemize");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DEnumerate");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DParagraphContent");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DRun");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DHyperlink");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DTab");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DText");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DFigureFromFile");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DTableFromFile");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DBasicTable");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DRow");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DCell");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DApplicableDocument");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DReferenceDocument");
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
	public class VSVRFixedSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRFixedSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVRFixedSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyDBodyParserRuleCall_1_0 = (RuleCall)cBodyAssignment_1.eContents().get(0);
		private final Assignment cSvrInstatiableSubsectionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_2_0 = (RuleCall)cSvrInstatiableSubsectionsAssignment_2.eContents().get(0);
		
		//VSVRFixedSection:
		//	{VSVRFixedSection} body=DBody?
		//	svrInstatiableSubsections+=VSVRInstantiableSection*;
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVRFixedSection} body=DBody? svrInstatiableSubsections+=VSVRInstantiableSection*
		public Group getGroup() { return cGroup; }
		
		//{VSVRFixedSection}
		public Action getVSVRFixedSectionAction_0() { return cVSVRFixedSectionAction_0; }
		
		//body=DBody?
		public Assignment getBodyAssignment_1() { return cBodyAssignment_1; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_1_0() { return cBodyDBodyParserRuleCall_1_0; }
		
		//svrInstatiableSubsections+=VSVRInstantiableSection*
		public Assignment getSvrInstatiableSubsectionsAssignment_2() { return cSvrInstatiableSubsectionsAssignment_2; }
		
		//VSVRInstantiableSection
		public RuleCall getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_2_0() { return cSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_2_0; }
	}
	public class VSVRInstantiableSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRInstantiableSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubsectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBodyAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBodyDBodyParserRuleCall_4_0 = (RuleCall)cBodyAssignment_4.eContents().get(0);
		private final Assignment cSvrInstatiableSubsectionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_5_0 = (RuleCall)cSvrInstatiableSubsectionsAssignment_5.eContents().get(0);
		private final Keyword cSubsectionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//VSVRInstantiableSection:
		//	'<subsection'
		//	'name=' name=STRING
		//	'>'
		//	body=DBody?
		//	svrInstatiableSubsections+=VSVRInstantiableSection*
		//	'</subsection>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<subsection' 'name=' name=STRING '>' body=DBody? svrInstatiableSubsections+=VSVRInstantiableSection* '</subsection>'
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
		
		//svrInstatiableSubsections+=VSVRInstantiableSection*
		public Assignment getSvrInstatiableSubsectionsAssignment_5() { return cSvrInstatiableSubsectionsAssignment_5; }
		
		//VSVRInstantiableSection
		public RuleCall getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_5_0() { return cSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_5_0; }
		
		//'</subsection>'
		public Keyword getSubsectionKeyword_6() { return cSubsectionKeyword_6; }
	}
	public class VSVRIntroductionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRIntroduction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntroductionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSvrInstatiableSubsectionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_1_0 = (RuleCall)cSvrInstatiableSubsectionsAssignment_1.eContents().get(0);
		private final Keyword cIntroductionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//VSVRIntroduction:
		//	'<Introduction>'
		//	svrInstatiableSubsections+=VSVRInstantiableSection+
		//	'</Introduction>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Introduction>' svrInstatiableSubsections+=VSVRInstantiableSection+ '</Introduction>'
		public Group getGroup() { return cGroup; }
		
		//'<Introduction>'
		public Keyword getIntroductionKeyword_0() { return cIntroductionKeyword_0; }
		
		//svrInstatiableSubsections+=VSVRInstantiableSection+
		public Assignment getSvrInstatiableSubsectionsAssignment_1() { return cSvrInstatiableSubsectionsAssignment_1; }
		
		//VSVRInstantiableSection
		public RuleCall getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_1_0() { return cSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_1_0; }
		
		//'</Introduction>'
		public Keyword getIntroductionKeyword_2() { return cIntroductionKeyword_2; }
	}
	public class VSVRApplicableDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRApplicableDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVRApplicableDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cApplicableDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0 = (RuleCall)cApplicableDocumentsAssignment_2.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVRApplicableDocuments:
		//	{VSVRApplicableDocuments}
		//	'<ApplicableDocuments>'
		//	applicableDocuments+=DApplicableDocument*
		//	'</ApplicableDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVRApplicableDocuments} '<ApplicableDocuments>' applicableDocuments+=DApplicableDocument* '</ApplicableDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VSVRApplicableDocuments}
		public Action getVSVRApplicableDocumentsAction_0() { return cVSVRApplicableDocumentsAction_0; }
		
		//'<ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_1() { return cApplicableDocumentsKeyword_1; }
		
		//applicableDocuments+=DApplicableDocument*
		public Assignment getApplicableDocumentsAssignment_2() { return cApplicableDocumentsAssignment_2; }
		
		//DApplicableDocument
		public RuleCall getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0() { return cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0; }
		
		//'</ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_3() { return cApplicableDocumentsKeyword_3; }
	}
	public class VSVRReferenceDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRReferenceDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVRReferenceDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cReferenceDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0 = (RuleCall)cReferenceDocumentsAssignment_2.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSVRReferenceDocuments:
		//	{VSVRReferenceDocuments}
		//	'<ReferenceDocuments>'
		//	referenceDocuments+=DReferenceDocument*
		//	'</ReferenceDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVRReferenceDocuments} '<ReferenceDocuments>' referenceDocuments+=DReferenceDocument* '</ReferenceDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VSVRReferenceDocuments}
		public Action getVSVRReferenceDocumentsAction_0() { return cVSVRReferenceDocumentsAction_0; }
		
		//'<ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_1() { return cReferenceDocumentsKeyword_1; }
		
		//referenceDocuments+=DReferenceDocument*
		public Assignment getReferenceDocumentsAssignment_2() { return cReferenceDocumentsAssignment_2; }
		
		//DReferenceDocument
		public RuleCall getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0() { return cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0; }
		
		//'</ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_3() { return cReferenceDocumentsKeyword_3; }
	}
	public class VSVRTermsDefinitionsAbbreviationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRTermsDefinitionsAbbreviations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVRTermsDefinitionsAbbreviationsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTermsDefinitionsAbbreviationsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTermsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTermsVSVRTermParserRuleCall_2_0 = (RuleCall)cTermsAssignment_2.eContents().get(0);
		private final Assignment cDefinitionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefinitionsVSVRDefinitionParserRuleCall_3_0 = (RuleCall)cDefinitionsAssignment_3.eContents().get(0);
		private final Assignment cAbbreviationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAbbreviationsVSVRAbbreviationParserRuleCall_4_0 = (RuleCall)cAbbreviationsAssignment_4.eContents().get(0);
		private final Keyword cTermsDefinitionsAbbreviationsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVRTermsDefinitionsAbbreviations:
		//	{VSVRTermsDefinitionsAbbreviations}
		//	'<TermsDefinitionsAbbreviations>'
		//	terms+=VSVRTerm*
		//	definitions+=VSVRDefinition*
		//	abbreviations+=VSVRAbbreviation*
		//	'</TermsDefinitionsAbbreviations>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVRTermsDefinitionsAbbreviations} '<TermsDefinitionsAbbreviations>' terms+=VSVRTerm* definitions+=VSVRDefinition*
		//abbreviations+=VSVRAbbreviation* '</TermsDefinitionsAbbreviations>'
		public Group getGroup() { return cGroup; }
		
		//{VSVRTermsDefinitionsAbbreviations}
		public Action getVSVRTermsDefinitionsAbbreviationsAction_0() { return cVSVRTermsDefinitionsAbbreviationsAction_0; }
		
		//'<TermsDefinitionsAbbreviations>'
		public Keyword getTermsDefinitionsAbbreviationsKeyword_1() { return cTermsDefinitionsAbbreviationsKeyword_1; }
		
		//terms+=VSVRTerm*
		public Assignment getTermsAssignment_2() { return cTermsAssignment_2; }
		
		//VSVRTerm
		public RuleCall getTermsVSVRTermParserRuleCall_2_0() { return cTermsVSVRTermParserRuleCall_2_0; }
		
		//definitions+=VSVRDefinition*
		public Assignment getDefinitionsAssignment_3() { return cDefinitionsAssignment_3; }
		
		//VSVRDefinition
		public RuleCall getDefinitionsVSVRDefinitionParserRuleCall_3_0() { return cDefinitionsVSVRDefinitionParserRuleCall_3_0; }
		
		//abbreviations+=VSVRAbbreviation*
		public Assignment getAbbreviationsAssignment_4() { return cAbbreviationsAssignment_4; }
		
		//VSVRAbbreviation
		public RuleCall getAbbreviationsVSVRAbbreviationParserRuleCall_4_0() { return cAbbreviationsVSVRAbbreviationParserRuleCall_4_0; }
		
		//'</TermsDefinitionsAbbreviations>'
		public Keyword getTermsDefinitionsAbbreviationsKeyword_5() { return cTermsDefinitionsAbbreviationsKeyword_5; }
	}
	public class VSVRTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cTermKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVRTerm:
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
	public class VSVRDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cDefinitionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVRDefinition:
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
	public class VSVRAbbreviationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRAbbreviation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAbbreviationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cAbbreviationKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSVRAbbreviation:
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
	public class VSVRSWValProcessVerificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRSWValProcessVerification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSVRSWValProcessVerificationAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSWValProcessVerificationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBodyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBodyDBodyParserRuleCall_2_0 = (RuleCall)cBodyAssignment_2.eContents().get(0);
		private final Keyword cTraceabilityKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTraceabilityAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTraceabilityVSVRFixedSectionParserRuleCall_4_0 = (RuleCall)cTraceabilityAssignment_4.eContents().get(0);
		private final Keyword cTraceabilityKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cFeasibilityKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cFeasibilityAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cFeasibilityVSVRFixedSectionParserRuleCall_7_0 = (RuleCall)cFeasibilityAssignment_7.eContents().get(0);
		private final Keyword cFeasibilityKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cSWValProcessVerificationKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//VSVRSWValProcessVerification:
		//	{VSVRSWValProcessVerification}
		//	'<SWValProcessVerification>'
		//	body=DBody?
		//	'<Traceability>' traceability=VSVRFixedSection '</Traceability>'
		//	'<Feasibility>' feasibility=VSVRFixedSection '</Feasibility>'
		//	'</SWValProcessVerification>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSVRSWValProcessVerification} '<SWValProcessVerification>' body=DBody? '<Traceability>' traceability=VSVRFixedSection
		//'</Traceability>' '<Feasibility>' feasibility=VSVRFixedSection '</Feasibility>' '</SWValProcessVerification>'
		public Group getGroup() { return cGroup; }
		
		//{VSVRSWValProcessVerification}
		public Action getVSVRSWValProcessVerificationAction_0() { return cVSVRSWValProcessVerificationAction_0; }
		
		//'<SWValProcessVerification>'
		public Keyword getSWValProcessVerificationKeyword_1() { return cSWValProcessVerificationKeyword_1; }
		
		//body=DBody?
		public Assignment getBodyAssignment_2() { return cBodyAssignment_2; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_2_0() { return cBodyDBodyParserRuleCall_2_0; }
		
		//'<Traceability>'
		public Keyword getTraceabilityKeyword_3() { return cTraceabilityKeyword_3; }
		
		//traceability=VSVRFixedSection
		public Assignment getTraceabilityAssignment_4() { return cTraceabilityAssignment_4; }
		
		//VSVRFixedSection
		public RuleCall getTraceabilityVSVRFixedSectionParserRuleCall_4_0() { return cTraceabilityVSVRFixedSectionParserRuleCall_4_0; }
		
		//'</Traceability>'
		public Keyword getTraceabilityKeyword_5() { return cTraceabilityKeyword_5; }
		
		//'<Feasibility>'
		public Keyword getFeasibilityKeyword_6() { return cFeasibilityKeyword_6; }
		
		//feasibility=VSVRFixedSection
		public Assignment getFeasibilityAssignment_7() { return cFeasibilityAssignment_7; }
		
		//VSVRFixedSection
		public RuleCall getFeasibilityVSVRFixedSectionParserRuleCall_7_0() { return cFeasibilityVSVRFixedSectionParserRuleCall_7_0; }
		
		//'</Feasibility>'
		public Keyword getFeasibilityKeyword_8() { return cFeasibilityKeyword_8; }
		
		//'</SWValProcessVerification>'
		public Keyword getSWValProcessVerificationKeyword_9() { return cSWValProcessVerificationKeyword_9; }
	}
	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.INTEGER");
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
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DAlignment");
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
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.DRunAttributes");
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
	
	private final VSVRDocumentElements pVSVRDocument;
	private final VSVRTBCsTBDsElements pVSVRTBCsTBDs;
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
	private final VSVRFixedSectionElements pVSVRFixedSection;
	private final VSVRInstantiableSectionElements pVSVRInstantiableSection;
	private final VSVRIntroductionElements pVSVRIntroduction;
	private final VSVRApplicableDocumentsElements pVSVRApplicableDocuments;
	private final VSVRReferenceDocumentsElements pVSVRReferenceDocuments;
	private final VSVRTermsDefinitionsAbbreviationsElements pVSVRTermsDefinitionsAbbreviations;
	private final VSVRTermElements pVSVRTerm;
	private final VSVRDefinitionElements pVSVRDefinition;
	private final VSVRAbbreviationElements pVSVRAbbreviation;
	private final VSVRSWValProcessVerificationElements pVSVRSWValProcessVerification;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final TerminalRule tUINT_STRING;
	private final TerminalRule tREAL_STRING;
	private final TerminalRule tHEX_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SVRGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVSVRDocument = new VSVRDocumentElements();
		this.pVSVRTBCsTBDs = new VSVRTBCsTBDsElements();
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
		this.tRUNTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.RUNTEXT");
		this.pDFigureFromFile = new DFigureFromFileElements();
		this.pDTableFromFile = new DTableFromFileElements();
		this.pDBasicTable = new DBasicTableElements();
		this.pDRow = new DRowElements();
		this.pDCell = new DCellElements();
		this.pDApplicableDocument = new DApplicableDocumentElements();
		this.pDReferenceDocument = new DReferenceDocumentElements();
		this.pVSVRFixedSection = new VSVRFixedSectionElements();
		this.pVSVRInstantiableSection = new VSVRInstantiableSectionElements();
		this.pVSVRIntroduction = new VSVRIntroductionElements();
		this.pVSVRApplicableDocuments = new VSVRApplicableDocumentsElements();
		this.pVSVRReferenceDocuments = new VSVRReferenceDocumentsElements();
		this.pVSVRTermsDefinitionsAbbreviations = new VSVRTermsDefinitionsAbbreviationsElements();
		this.pVSVRTerm = new VSVRTermElements();
		this.pVSVRDefinition = new VSVRDefinitionElements();
		this.pVSVRAbbreviation = new VSVRAbbreviationElements();
		this.pVSVRSWValProcessVerification = new VSVRSWValProcessVerificationElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
		this.tREAL_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.REAL_STRING");
		this.tHEX_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.svr.SVR.HEX_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.svm.lang.svr.SVR".equals(grammar.getName())) {
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

	
	//VSVRDocument:
	//	'<SVR'
	//	'name=' name=STRING
	//	'id=' id=STRING
	//	'issue=' issue=UINT_STRING
	//	'revision=' revision=UINT_STRING
	//	'date=' date=STRING
	//	'>'
	//	'<svsParent' 'name=' svsParent=[svs::VSVSDocument|STRING] '/>' ('<tcrParent' 'name='
	//	tcrParent+=[tcr::VTCRTestCampaignReport|STRING] '/>')*
	//	tbcsTbdsSection=VSVRTBCsTBDs?
	//	introductionSection=VSVRIntroduction
	//	applicableDocumentsSection=VSVRApplicableDocuments
	//	referenceDocumentsSection=VSVRReferenceDocuments
	//	termsDefinitionsAbbreviationsSection=VSVRTermsDefinitionsAbbreviations
	//	swValProcessVerificationSection=VSVRSWValProcessVerification
	//	'</SVR>';
	public VSVRDocumentElements getVSVRDocumentAccess() {
		return pVSVRDocument;
	}
	
	public ParserRule getVSVRDocumentRule() {
		return getVSVRDocumentAccess().getRule();
	}
	
	//VSVRTBCsTBDs:
	//	{VSVRTBCsTBDs}
	//	'<TBCsTBDs>'
	//	tbcs+=DTBC*
	//	tbds+=DTBD*
	//	'</TBCsTBDs>';
	public VSVRTBCsTBDsElements getVSVRTBCsTBDsAccess() {
		return pVSVRTBCsTBDs;
	}
	
	public ParserRule getVSVRTBCsTBDsRule() {
		return getVSVRTBCsTBDsAccess().getRule();
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
	
	//VSVRFixedSection:
	//	{VSVRFixedSection} body=DBody?
	//	svrInstatiableSubsections+=VSVRInstantiableSection*;
	public VSVRFixedSectionElements getVSVRFixedSectionAccess() {
		return pVSVRFixedSection;
	}
	
	public ParserRule getVSVRFixedSectionRule() {
		return getVSVRFixedSectionAccess().getRule();
	}
	
	//VSVRInstantiableSection:
	//	'<subsection'
	//	'name=' name=STRING
	//	'>'
	//	body=DBody?
	//	svrInstatiableSubsections+=VSVRInstantiableSection*
	//	'</subsection>';
	public VSVRInstantiableSectionElements getVSVRInstantiableSectionAccess() {
		return pVSVRInstantiableSection;
	}
	
	public ParserRule getVSVRInstantiableSectionRule() {
		return getVSVRInstantiableSectionAccess().getRule();
	}
	
	//VSVRIntroduction:
	//	'<Introduction>'
	//	svrInstatiableSubsections+=VSVRInstantiableSection+
	//	'</Introduction>';
	public VSVRIntroductionElements getVSVRIntroductionAccess() {
		return pVSVRIntroduction;
	}
	
	public ParserRule getVSVRIntroductionRule() {
		return getVSVRIntroductionAccess().getRule();
	}
	
	//VSVRApplicableDocuments:
	//	{VSVRApplicableDocuments}
	//	'<ApplicableDocuments>'
	//	applicableDocuments+=DApplicableDocument*
	//	'</ApplicableDocuments>';
	public VSVRApplicableDocumentsElements getVSVRApplicableDocumentsAccess() {
		return pVSVRApplicableDocuments;
	}
	
	public ParserRule getVSVRApplicableDocumentsRule() {
		return getVSVRApplicableDocumentsAccess().getRule();
	}
	
	//VSVRReferenceDocuments:
	//	{VSVRReferenceDocuments}
	//	'<ReferenceDocuments>'
	//	referenceDocuments+=DReferenceDocument*
	//	'</ReferenceDocuments>';
	public VSVRReferenceDocumentsElements getVSVRReferenceDocumentsAccess() {
		return pVSVRReferenceDocuments;
	}
	
	public ParserRule getVSVRReferenceDocumentsRule() {
		return getVSVRReferenceDocumentsAccess().getRule();
	}
	
	//VSVRTermsDefinitionsAbbreviations:
	//	{VSVRTermsDefinitionsAbbreviations}
	//	'<TermsDefinitionsAbbreviations>'
	//	terms+=VSVRTerm*
	//	definitions+=VSVRDefinition*
	//	abbreviations+=VSVRAbbreviation*
	//	'</TermsDefinitionsAbbreviations>';
	public VSVRTermsDefinitionsAbbreviationsElements getVSVRTermsDefinitionsAbbreviationsAccess() {
		return pVSVRTermsDefinitionsAbbreviations;
	}
	
	public ParserRule getVSVRTermsDefinitionsAbbreviationsRule() {
		return getVSVRTermsDefinitionsAbbreviationsAccess().getRule();
	}
	
	//VSVRTerm:
	//	'<Term'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Term>';
	public VSVRTermElements getVSVRTermAccess() {
		return pVSVRTerm;
	}
	
	public ParserRule getVSVRTermRule() {
		return getVSVRTermAccess().getRule();
	}
	
	//VSVRDefinition:
	//	'<Definition'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Definition>';
	public VSVRDefinitionElements getVSVRDefinitionAccess() {
		return pVSVRDefinition;
	}
	
	public ParserRule getVSVRDefinitionRule() {
		return getVSVRDefinitionAccess().getRule();
	}
	
	//VSVRAbbreviation:
	//	'<Abbreviation'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Abbreviation>';
	public VSVRAbbreviationElements getVSVRAbbreviationAccess() {
		return pVSVRAbbreviation;
	}
	
	public ParserRule getVSVRAbbreviationRule() {
		return getVSVRAbbreviationAccess().getRule();
	}
	
	//VSVRSWValProcessVerification:
	//	{VSVRSWValProcessVerification}
	//	'<SWValProcessVerification>'
	//	body=DBody?
	//	'<Traceability>' traceability=VSVRFixedSection '</Traceability>'
	//	'<Feasibility>' feasibility=VSVRFixedSection '</Feasibility>'
	//	'</SWValProcessVerification>';
	public VSVRSWValProcessVerificationElements getVSVRSWValProcessVerificationAccess() {
		return pVSVRSWValProcessVerification;
	}
	
	public ParserRule getVSVRSWValProcessVerificationRule() {
		return getVSVRSWValProcessVerificationAccess().getRule();
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
