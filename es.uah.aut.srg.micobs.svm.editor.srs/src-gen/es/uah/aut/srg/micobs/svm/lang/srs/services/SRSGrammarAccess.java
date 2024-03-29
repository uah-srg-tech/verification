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
package es.uah.aut.srg.micobs.svm.lang.srs.services;

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
public class SRSGrammarAccess extends AbstractGrammarElementFinder {
	
	public class VSRSDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSRSKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Assignment cParentsAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cParentsVTraceableParentDocumentParserRuleCall_12_0 = (RuleCall)cParentsAssignment_12.eContents().get(0);
		private final Assignment cTbcsTbdsSectionAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cTbcsTbdsSectionVSRSTBCsTBDsParserRuleCall_13_0 = (RuleCall)cTbcsTbdsSectionAssignment_13.eContents().get(0);
		private final Assignment cIntroductionSectionAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cIntroductionSectionVSRSIntroductionParserRuleCall_14_0 = (RuleCall)cIntroductionSectionAssignment_14.eContents().get(0);
		private final Assignment cApplicableDocumentsSectionAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cApplicableDocumentsSectionVSRSApplicableDocumentsParserRuleCall_15_0 = (RuleCall)cApplicableDocumentsSectionAssignment_15.eContents().get(0);
		private final Assignment cReferenceDocumentsSectionAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cReferenceDocumentsSectionVSRSReferenceDocumentsParserRuleCall_16_0 = (RuleCall)cReferenceDocumentsSectionAssignment_16.eContents().get(0);
		private final Assignment cTermsDefinitionsAbbreviationsSectionAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTermsDefinitionsAbbreviationsSectionVSRSTermsDefinitionsAbbreviationsParserRuleCall_17_0 = (RuleCall)cTermsDefinitionsAbbreviationsSectionAssignment_17.eContents().get(0);
		private final Assignment cSoftwareOverviewSectionAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cSoftwareOverviewSectionVSRSSoftwareOverviewParserRuleCall_18_0 = (RuleCall)cSoftwareOverviewSectionAssignment_18.eContents().get(0);
		private final Assignment cRequirementsSectionAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cRequirementsSectionVSRSRequirementsParserRuleCall_19_0 = (RuleCall)cRequirementsSectionAssignment_19.eContents().get(0);
		private final Assignment cLogicalModelsSectionAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final RuleCall cLogicalModelsSectionVSRSLogicalModelsParserRuleCall_20_0 = (RuleCall)cLogicalModelsSectionAssignment_20.eContents().get(0);
		private final Keyword cSRSKeyword_21 = (Keyword)cGroup.eContents().get(21);
		
		//VSRSDocument:
		//	'<SRS'
		//	'name=' name=STRING
		//	'id=' id=STRING
		//	'issue=' issue=UINT_STRING
		//	'revision=' revision=UINT_STRING
		//	'date=' date=STRING
		//	'>'
		//	parents+=VTraceableParentDocument*
		//	tbcsTbdsSection=VSRSTBCsTBDs?
		//	introductionSection=VSRSIntroduction
		//	applicableDocumentsSection=VSRSApplicableDocuments
		//	referenceDocumentsSection=VSRSReferenceDocuments
		//	termsDefinitionsAbbreviationsSection=VSRSTermsDefinitionsAbbreviations
		//	softwareOverviewSection=VSRSSoftwareOverview
		//	requirementsSection=VSRSRequirements
		//	logicalModelsSection=VSRSLogicalModels
		//	'</SRS>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<SRS' 'name=' name=STRING 'id=' id=STRING 'issue=' issue=UINT_STRING 'revision=' revision=UINT_STRING 'date='
		//date=STRING '>' parents+=VTraceableParentDocument* tbcsTbdsSection=VSRSTBCsTBDs? introductionSection=VSRSIntroduction
		//applicableDocumentsSection=VSRSApplicableDocuments referenceDocumentsSection=VSRSReferenceDocuments
		//termsDefinitionsAbbreviationsSection=VSRSTermsDefinitionsAbbreviations softwareOverviewSection=VSRSSoftwareOverview
		//requirementsSection=VSRSRequirements logicalModelsSection=VSRSLogicalModels '</SRS>'
		public Group getGroup() { return cGroup; }
		
		//'<SRS'
		public Keyword getSRSKeyword_0() { return cSRSKeyword_0; }
		
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
		
		//parents+=VTraceableParentDocument*
		public Assignment getParentsAssignment_12() { return cParentsAssignment_12; }
		
		//VTraceableParentDocument
		public RuleCall getParentsVTraceableParentDocumentParserRuleCall_12_0() { return cParentsVTraceableParentDocumentParserRuleCall_12_0; }
		
		//tbcsTbdsSection=VSRSTBCsTBDs?
		public Assignment getTbcsTbdsSectionAssignment_13() { return cTbcsTbdsSectionAssignment_13; }
		
		//VSRSTBCsTBDs
		public RuleCall getTbcsTbdsSectionVSRSTBCsTBDsParserRuleCall_13_0() { return cTbcsTbdsSectionVSRSTBCsTBDsParserRuleCall_13_0; }
		
		//introductionSection=VSRSIntroduction
		public Assignment getIntroductionSectionAssignment_14() { return cIntroductionSectionAssignment_14; }
		
		//VSRSIntroduction
		public RuleCall getIntroductionSectionVSRSIntroductionParserRuleCall_14_0() { return cIntroductionSectionVSRSIntroductionParserRuleCall_14_0; }
		
		//applicableDocumentsSection=VSRSApplicableDocuments
		public Assignment getApplicableDocumentsSectionAssignment_15() { return cApplicableDocumentsSectionAssignment_15; }
		
		//VSRSApplicableDocuments
		public RuleCall getApplicableDocumentsSectionVSRSApplicableDocumentsParserRuleCall_15_0() { return cApplicableDocumentsSectionVSRSApplicableDocumentsParserRuleCall_15_0; }
		
		//referenceDocumentsSection=VSRSReferenceDocuments
		public Assignment getReferenceDocumentsSectionAssignment_16() { return cReferenceDocumentsSectionAssignment_16; }
		
		//VSRSReferenceDocuments
		public RuleCall getReferenceDocumentsSectionVSRSReferenceDocumentsParserRuleCall_16_0() { return cReferenceDocumentsSectionVSRSReferenceDocumentsParserRuleCall_16_0; }
		
		//termsDefinitionsAbbreviationsSection=VSRSTermsDefinitionsAbbreviations
		public Assignment getTermsDefinitionsAbbreviationsSectionAssignment_17() { return cTermsDefinitionsAbbreviationsSectionAssignment_17; }
		
		//VSRSTermsDefinitionsAbbreviations
		public RuleCall getTermsDefinitionsAbbreviationsSectionVSRSTermsDefinitionsAbbreviationsParserRuleCall_17_0() { return cTermsDefinitionsAbbreviationsSectionVSRSTermsDefinitionsAbbreviationsParserRuleCall_17_0; }
		
		//softwareOverviewSection=VSRSSoftwareOverview
		public Assignment getSoftwareOverviewSectionAssignment_18() { return cSoftwareOverviewSectionAssignment_18; }
		
		//VSRSSoftwareOverview
		public RuleCall getSoftwareOverviewSectionVSRSSoftwareOverviewParserRuleCall_18_0() { return cSoftwareOverviewSectionVSRSSoftwareOverviewParserRuleCall_18_0; }
		
		//requirementsSection=VSRSRequirements
		public Assignment getRequirementsSectionAssignment_19() { return cRequirementsSectionAssignment_19; }
		
		//VSRSRequirements
		public RuleCall getRequirementsSectionVSRSRequirementsParserRuleCall_19_0() { return cRequirementsSectionVSRSRequirementsParserRuleCall_19_0; }
		
		//logicalModelsSection=VSRSLogicalModels
		public Assignment getLogicalModelsSectionAssignment_20() { return cLogicalModelsSectionAssignment_20; }
		
		//VSRSLogicalModels
		public RuleCall getLogicalModelsSectionVSRSLogicalModelsParserRuleCall_20_0() { return cLogicalModelsSectionVSRSLogicalModelsParserRuleCall_20_0; }
		
		//'</SRS>'
		public Keyword getSRSKeyword_21() { return cSRSKeyword_21; }
	}
	public class VSRSTBCsTBDsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSTBCsTBDs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSTBCsTBDsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTBCsTBDsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTbcsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTbcsDTBCParserRuleCall_2_0 = (RuleCall)cTbcsAssignment_2.eContents().get(0);
		private final Assignment cTbdsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTbdsDTBDParserRuleCall_3_0 = (RuleCall)cTbdsAssignment_3.eContents().get(0);
		private final Keyword cTBCsTBDsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSRSTBCsTBDs:
		//	{VSRSTBCsTBDs}
		//	'<TBCsTBDs>'
		//	tbcs+=DTBC*
		//	tbds+=DTBD*
		//	'</TBCsTBDs>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSTBCsTBDs} '<TBCsTBDs>' tbcs+=DTBC* tbds+=DTBD* '</TBCsTBDs>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSTBCsTBDs}
		public Action getVSRSTBCsTBDsAction_0() { return cVSRSTBCsTBDsAction_0; }
		
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DTBC");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DTBD");
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
	public class VTraceableParentDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VTraceableParentDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cDocumentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDocumentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cDocumentVTraceableDocumentCrossReference_2_0 = (CrossReference)cDocumentAssignment_2.eContents().get(0);
		private final RuleCall cDocumentVTraceableDocumentSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cDocumentVTraceableDocumentCrossReference_2_0.eContents().get(1);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Group cGroup_3_0_1 = (Group)cGroup_3_0.eContents().get(1);
		private final Keyword cNotApplicableItemKeyword_3_0_1_0 = (Keyword)cGroup_3_0_1.eContents().get(0);
		private final Keyword cItemKeyword_3_0_1_1 = (Keyword)cGroup_3_0_1.eContents().get(1);
		private final Assignment cNotApplicableItemAssignment_3_0_1_2 = (Assignment)cGroup_3_0_1.eContents().get(2);
		private final CrossReference cNotApplicableItemVTraceableDocumentAbstractItemCrossReference_3_0_1_2_0 = (CrossReference)cNotApplicableItemAssignment_3_0_1_2.eContents().get(0);
		private final RuleCall cNotApplicableItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_3_0_1_2_0_1 = (RuleCall)cNotApplicableItemVTraceableDocumentAbstractItemCrossReference_3_0_1_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_3_0_1_3 = (Keyword)cGroup_3_0_1.eContents().get(3);
		private final Keyword cParentKeyword_3_0_2 = (Keyword)cGroup_3_0.eContents().get(2);
		private final Keyword cSolidusGreaterThanSignKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		
		//VTraceableParentDocument tdm::VTraceableParentDocument:
		//	'<parent' 'document=' document=[tdm::VTraceableDocument|STRING] ('>' ('<notApplicableItem' 'item='
		//	notApplicableItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+ '</parent>' | '/>')
		@Override public ParserRule getRule() { return rule; }
		
		//'<parent' 'document=' document=[tdm::VTraceableDocument|STRING] ('>' ('<notApplicableItem' 'item='
		//notApplicableItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+ '</parent>' | '/>')
		public Group getGroup() { return cGroup; }
		
		//'<parent'
		public Keyword getParentKeyword_0() { return cParentKeyword_0; }
		
		//'document='
		public Keyword getDocumentKeyword_1() { return cDocumentKeyword_1; }
		
		//document=[tdm::VTraceableDocument|STRING]
		public Assignment getDocumentAssignment_2() { return cDocumentAssignment_2; }
		
		//[tdm::VTraceableDocument|STRING]
		public CrossReference getDocumentVTraceableDocumentCrossReference_2_0() { return cDocumentVTraceableDocumentCrossReference_2_0; }
		
		//STRING
		public RuleCall getDocumentVTraceableDocumentSTRINGTerminalRuleCall_2_0_1() { return cDocumentVTraceableDocumentSTRINGTerminalRuleCall_2_0_1; }
		
		//('>' ('<notApplicableItem' 'item=' notApplicableItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+ '</parent>' |
		//'/>')
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'>' ('<notApplicableItem' 'item=' notApplicableItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+ '</parent>'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3_0_0() { return cGreaterThanSignKeyword_3_0_0; }
		
		//('<notApplicableItem' 'item=' notApplicableItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+
		public Group getGroup_3_0_1() { return cGroup_3_0_1; }
		
		//'<notApplicableItem'
		public Keyword getNotApplicableItemKeyword_3_0_1_0() { return cNotApplicableItemKeyword_3_0_1_0; }
		
		//'item='
		public Keyword getItemKeyword_3_0_1_1() { return cItemKeyword_3_0_1_1; }
		
		//notApplicableItem+=[tdm::VTraceableDocumentAbstractItem|STRING]
		public Assignment getNotApplicableItemAssignment_3_0_1_2() { return cNotApplicableItemAssignment_3_0_1_2; }
		
		//[tdm::VTraceableDocumentAbstractItem|STRING]
		public CrossReference getNotApplicableItemVTraceableDocumentAbstractItemCrossReference_3_0_1_2_0() { return cNotApplicableItemVTraceableDocumentAbstractItemCrossReference_3_0_1_2_0; }
		
		//STRING
		public RuleCall getNotApplicableItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_3_0_1_2_0_1() { return cNotApplicableItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_3_0_1_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3_0_1_3() { return cSolidusGreaterThanSignKeyword_3_0_1_3; }
		
		//'</parent>'
		public Keyword getParentKeyword_3_0_2() { return cParentKeyword_3_0_2; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3_1() { return cSolidusGreaterThanSignKeyword_3_1; }
	}
	public class DBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBodyContent");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DParagraph");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DListItem");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DListContent");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DItemize");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DEnumerate");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DParagraphContent");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRun");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DHyperlink");
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
	public class DTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DText");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DTab");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DFigureFromFile");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DTableFromFile");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBasicTable");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRow");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DCell");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DApplicableDocument");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DReferenceDocument");
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
	public class VSRSFixedSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSFixedSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSFixedSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyDBodyParserRuleCall_1_0 = (RuleCall)cBodyAssignment_1.eContents().get(0);
		private final Assignment cSrsInstatiableSubsectionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_2_0 = (RuleCall)cSrsInstatiableSubsectionsAssignment_2.eContents().get(0);
		
		//VSRSFixedSection:
		//	{VSRSFixedSection} body=DBody?
		//	srsInstatiableSubsections+=VSRSInstantiableSection*;
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSFixedSection} body=DBody? srsInstatiableSubsections+=VSRSInstantiableSection*
		public Group getGroup() { return cGroup; }
		
		//{VSRSFixedSection}
		public Action getVSRSFixedSectionAction_0() { return cVSRSFixedSectionAction_0; }
		
		//body=DBody?
		public Assignment getBodyAssignment_1() { return cBodyAssignment_1; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_1_0() { return cBodyDBodyParserRuleCall_1_0; }
		
		//srsInstatiableSubsections+=VSRSInstantiableSection*
		public Assignment getSrsInstatiableSubsectionsAssignment_2() { return cSrsInstatiableSubsectionsAssignment_2; }
		
		//VSRSInstantiableSection
		public RuleCall getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_2_0() { return cSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_2_0; }
	}
	public class VSRSInstantiableSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubsectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBodyAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBodyDBodyParserRuleCall_4_0 = (RuleCall)cBodyAssignment_4.eContents().get(0);
		private final Assignment cSrsInstatiableSubsectionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_5_0 = (RuleCall)cSrsInstatiableSubsectionsAssignment_5.eContents().get(0);
		private final Keyword cSubsectionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//VSRSInstantiableSection:
		//	'<subsection'
		//	'name=' name=STRING
		//	'>'
		//	body=DBody?
		//	srsInstatiableSubsections+=VSRSInstantiableSection*
		//	'</subsection>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<subsection' 'name=' name=STRING '>' body=DBody? srsInstatiableSubsections+=VSRSInstantiableSection* '</subsection>'
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
		
		//srsInstatiableSubsections+=VSRSInstantiableSection*
		public Assignment getSrsInstatiableSubsectionsAssignment_5() { return cSrsInstatiableSubsectionsAssignment_5; }
		
		//VSRSInstantiableSection
		public RuleCall getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_5_0() { return cSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_5_0; }
		
		//'</subsection>'
		public Keyword getSubsectionKeyword_6() { return cSubsectionKeyword_6; }
	}
	public class VSRSIntroductionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSIntroduction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntroductionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSrsInstatiableSubsectionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0 = (RuleCall)cSrsInstatiableSubsectionsAssignment_1.eContents().get(0);
		private final Keyword cIntroductionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//VSRSIntroduction:
		//	'<Introduction>'
		//	srsInstatiableSubsections+=VSRSInstantiableSection+
		//	'</Introduction>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Introduction>' srsInstatiableSubsections+=VSRSInstantiableSection+ '</Introduction>'
		public Group getGroup() { return cGroup; }
		
		//'<Introduction>'
		public Keyword getIntroductionKeyword_0() { return cIntroductionKeyword_0; }
		
		//srsInstatiableSubsections+=VSRSInstantiableSection+
		public Assignment getSrsInstatiableSubsectionsAssignment_1() { return cSrsInstatiableSubsectionsAssignment_1; }
		
		//VSRSInstantiableSection
		public RuleCall getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0() { return cSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0; }
		
		//'</Introduction>'
		public Keyword getIntroductionKeyword_2() { return cIntroductionKeyword_2; }
	}
	public class VSRSApplicableDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSApplicableDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSApplicableDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cApplicableDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0 = (RuleCall)cApplicableDocumentsAssignment_2.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSRSApplicableDocuments:
		//	{VSRSApplicableDocuments}
		//	'<ApplicableDocuments>'
		//	applicableDocuments+=DApplicableDocument*
		//	'</ApplicableDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSApplicableDocuments} '<ApplicableDocuments>' applicableDocuments+=DApplicableDocument* '</ApplicableDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSApplicableDocuments}
		public Action getVSRSApplicableDocumentsAction_0() { return cVSRSApplicableDocumentsAction_0; }
		
		//'<ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_1() { return cApplicableDocumentsKeyword_1; }
		
		//applicableDocuments+=DApplicableDocument*
		public Assignment getApplicableDocumentsAssignment_2() { return cApplicableDocumentsAssignment_2; }
		
		//DApplicableDocument
		public RuleCall getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0() { return cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0; }
		
		//'</ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_3() { return cApplicableDocumentsKeyword_3; }
	}
	public class VSRSReferenceDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSReferenceDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSReferenceDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cReferenceDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0 = (RuleCall)cReferenceDocumentsAssignment_2.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSRSReferenceDocuments:
		//	{VSRSReferenceDocuments}
		//	'<ReferenceDocuments>'
		//	referenceDocuments+=DReferenceDocument*
		//	'</ReferenceDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSReferenceDocuments} '<ReferenceDocuments>' referenceDocuments+=DReferenceDocument* '</ReferenceDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSReferenceDocuments}
		public Action getVSRSReferenceDocumentsAction_0() { return cVSRSReferenceDocumentsAction_0; }
		
		//'<ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_1() { return cReferenceDocumentsKeyword_1; }
		
		//referenceDocuments+=DReferenceDocument*
		public Assignment getReferenceDocumentsAssignment_2() { return cReferenceDocumentsAssignment_2; }
		
		//DReferenceDocument
		public RuleCall getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0() { return cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0; }
		
		//'</ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_3() { return cReferenceDocumentsKeyword_3; }
	}
	public class VSRSTermsDefinitionsAbbreviationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSTermsDefinitionsAbbreviations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSTermsDefinitionsAbbreviationsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTermsDefinitionsAbbreviationsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTermsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTermsVSRSTermParserRuleCall_2_0 = (RuleCall)cTermsAssignment_2.eContents().get(0);
		private final Assignment cDefinitionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefinitionsVSRSDefinitionParserRuleCall_3_0 = (RuleCall)cDefinitionsAssignment_3.eContents().get(0);
		private final Assignment cAbbreviationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAbbreviationsVSRSAbbreviationParserRuleCall_4_0 = (RuleCall)cAbbreviationsAssignment_4.eContents().get(0);
		private final Keyword cTermsDefinitionsAbbreviationsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSTermsDefinitionsAbbreviations:
		//	{VSRSTermsDefinitionsAbbreviations}
		//	'<TermsDefinitionsAbbreviations>'
		//	terms+=VSRSTerm*
		//	definitions+=VSRSDefinition*
		//	abbreviations+=VSRSAbbreviation*
		//	'</TermsDefinitionsAbbreviations>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSTermsDefinitionsAbbreviations} '<TermsDefinitionsAbbreviations>' terms+=VSRSTerm* definitions+=VSRSDefinition*
		//abbreviations+=VSRSAbbreviation* '</TermsDefinitionsAbbreviations>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSTermsDefinitionsAbbreviations}
		public Action getVSRSTermsDefinitionsAbbreviationsAction_0() { return cVSRSTermsDefinitionsAbbreviationsAction_0; }
		
		//'<TermsDefinitionsAbbreviations>'
		public Keyword getTermsDefinitionsAbbreviationsKeyword_1() { return cTermsDefinitionsAbbreviationsKeyword_1; }
		
		//terms+=VSRSTerm*
		public Assignment getTermsAssignment_2() { return cTermsAssignment_2; }
		
		//VSRSTerm
		public RuleCall getTermsVSRSTermParserRuleCall_2_0() { return cTermsVSRSTermParserRuleCall_2_0; }
		
		//definitions+=VSRSDefinition*
		public Assignment getDefinitionsAssignment_3() { return cDefinitionsAssignment_3; }
		
		//VSRSDefinition
		public RuleCall getDefinitionsVSRSDefinitionParserRuleCall_3_0() { return cDefinitionsVSRSDefinitionParserRuleCall_3_0; }
		
		//abbreviations+=VSRSAbbreviation*
		public Assignment getAbbreviationsAssignment_4() { return cAbbreviationsAssignment_4; }
		
		//VSRSAbbreviation
		public RuleCall getAbbreviationsVSRSAbbreviationParserRuleCall_4_0() { return cAbbreviationsVSRSAbbreviationParserRuleCall_4_0; }
		
		//'</TermsDefinitionsAbbreviations>'
		public Keyword getTermsDefinitionsAbbreviationsKeyword_5() { return cTermsDefinitionsAbbreviationsKeyword_5; }
	}
	public class VSRSSoftwareOverviewElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSoftwareOverview");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSoftwareOverviewKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFunctionPurposeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFunctionPurposeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFunctionPurposeVSRSFixedSectionParserRuleCall_2_0 = (RuleCall)cFunctionPurposeAssignment_2.eContents().get(0);
		private final Keyword cFunctionPurposeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEnvironmentalConsiderationsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cEnvironmentalConsiderationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEnvironmentalConsiderationsVSRSFixedSectionParserRuleCall_5_0 = (RuleCall)cEnvironmentalConsiderationsAssignment_5.eContents().get(0);
		private final Keyword cEnvironmentalConsiderationsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRelationOtherSystemsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRelationOtherSystemsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cRelationOtherSystemsVSRSFixedSectionParserRuleCall_8_0 = (RuleCall)cRelationOtherSystemsAssignment_8.eContents().get(0);
		private final Keyword cRelationOtherSystemsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cConstraintsKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cConstraintsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cConstraintsVSRSFixedSectionParserRuleCall_11_0 = (RuleCall)cConstraintsAssignment_11.eContents().get(0);
		private final Keyword cConstraintsKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSoftwareOverviewKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//VSRSSoftwareOverview:
		//	'<SoftwareOverview>'
		//	'<FunctionPurpose>' functionPurpose=VSRSFixedSection '</FunctionPurpose>'
		//	'<EnvironmentalConsiderations>' environmentalConsiderations=VSRSFixedSection '</EnvironmentalConsiderations>'
		//	'<RelationOtherSystems>' relationOtherSystems=VSRSFixedSection '</RelationOtherSystems>'
		//	'<Constraints>' constraints=VSRSFixedSection '</Constraints>'
		//	'</SoftwareOverview>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<SoftwareOverview>' '<FunctionPurpose>' functionPurpose=VSRSFixedSection '</FunctionPurpose>'
		//'<EnvironmentalConsiderations>' environmentalConsiderations=VSRSFixedSection '</EnvironmentalConsiderations>'
		//'<RelationOtherSystems>' relationOtherSystems=VSRSFixedSection '</RelationOtherSystems>' '<Constraints>'
		//constraints=VSRSFixedSection '</Constraints>' '</SoftwareOverview>'
		public Group getGroup() { return cGroup; }
		
		//'<SoftwareOverview>'
		public Keyword getSoftwareOverviewKeyword_0() { return cSoftwareOverviewKeyword_0; }
		
		//'<FunctionPurpose>'
		public Keyword getFunctionPurposeKeyword_1() { return cFunctionPurposeKeyword_1; }
		
		//functionPurpose=VSRSFixedSection
		public Assignment getFunctionPurposeAssignment_2() { return cFunctionPurposeAssignment_2; }
		
		//VSRSFixedSection
		public RuleCall getFunctionPurposeVSRSFixedSectionParserRuleCall_2_0() { return cFunctionPurposeVSRSFixedSectionParserRuleCall_2_0; }
		
		//'</FunctionPurpose>'
		public Keyword getFunctionPurposeKeyword_3() { return cFunctionPurposeKeyword_3; }
		
		//'<EnvironmentalConsiderations>'
		public Keyword getEnvironmentalConsiderationsKeyword_4() { return cEnvironmentalConsiderationsKeyword_4; }
		
		//environmentalConsiderations=VSRSFixedSection
		public Assignment getEnvironmentalConsiderationsAssignment_5() { return cEnvironmentalConsiderationsAssignment_5; }
		
		//VSRSFixedSection
		public RuleCall getEnvironmentalConsiderationsVSRSFixedSectionParserRuleCall_5_0() { return cEnvironmentalConsiderationsVSRSFixedSectionParserRuleCall_5_0; }
		
		//'</EnvironmentalConsiderations>'
		public Keyword getEnvironmentalConsiderationsKeyword_6() { return cEnvironmentalConsiderationsKeyword_6; }
		
		//'<RelationOtherSystems>'
		public Keyword getRelationOtherSystemsKeyword_7() { return cRelationOtherSystemsKeyword_7; }
		
		//relationOtherSystems=VSRSFixedSection
		public Assignment getRelationOtherSystemsAssignment_8() { return cRelationOtherSystemsAssignment_8; }
		
		//VSRSFixedSection
		public RuleCall getRelationOtherSystemsVSRSFixedSectionParserRuleCall_8_0() { return cRelationOtherSystemsVSRSFixedSectionParserRuleCall_8_0; }
		
		//'</RelationOtherSystems>'
		public Keyword getRelationOtherSystemsKeyword_9() { return cRelationOtherSystemsKeyword_9; }
		
		//'<Constraints>'
		public Keyword getConstraintsKeyword_10() { return cConstraintsKeyword_10; }
		
		//constraints=VSRSFixedSection
		public Assignment getConstraintsAssignment_11() { return cConstraintsAssignment_11; }
		
		//VSRSFixedSection
		public RuleCall getConstraintsVSRSFixedSectionParserRuleCall_11_0() { return cConstraintsVSRSFixedSectionParserRuleCall_11_0; }
		
		//'</Constraints>'
		public Keyword getConstraintsKeyword_12() { return cConstraintsKeyword_12; }
		
		//'</SoftwareOverview>'
		public Keyword getSoftwareOverviewKeyword_13() { return cSoftwareOverviewKeyword_13; }
	}
	public class VSRSRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequirementsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSectionDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_1_0 = (RuleCall)cSectionDescriptionAssignment_1.eContents().get(0);
		private final Assignment cGeneralAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGeneralVSRSGeneralRequirementsParserRuleCall_2_0 = (RuleCall)cGeneralAssignment_2.eContents().get(0);
		private final Assignment cFunctionalAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFunctionalVSRSFunctionalRequirementsParserRuleCall_3_0 = (RuleCall)cFunctionalAssignment_3.eContents().get(0);
		private final Assignment cPerformanceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPerformanceVSRSPerformanceRequirementsParserRuleCall_4_0 = (RuleCall)cPerformanceAssignment_4.eContents().get(0);
		private final Assignment cInterfaceAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cInterfaceVSRSInterfaceRequirementsParserRuleCall_5_0 = (RuleCall)cInterfaceAssignment_5.eContents().get(0);
		private final Assignment cOperationalAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cOperationalVSRSOperationalRequirementsParserRuleCall_6_0 = (RuleCall)cOperationalAssignment_6.eContents().get(0);
		private final Assignment cResourcesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cResourcesVSRSResourcesRequirementsParserRuleCall_7_0 = (RuleCall)cResourcesAssignment_7.eContents().get(0);
		private final Assignment cDesignAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDesignVSRSDesignRequirementsParserRuleCall_8_0 = (RuleCall)cDesignAssignment_8.eContents().get(0);
		private final Assignment cSecurityPrivacyAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cSecurityPrivacyVSRSSecurityPrivacyRequirementsParserRuleCall_9_0 = (RuleCall)cSecurityPrivacyAssignment_9.eContents().get(0);
		private final Assignment cPortabilityAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cPortabilityVSRSPortabilityRequirementsParserRuleCall_10_0 = (RuleCall)cPortabilityAssignment_10.eContents().get(0);
		private final Assignment cSwQualityAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cSwQualityVSRSSWQualityRequirementsParserRuleCall_11_0 = (RuleCall)cSwQualityAssignment_11.eContents().get(0);
		private final Assignment cSwReliabilityAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cSwReliabilityVSRSSWReliabilityRequirementsParserRuleCall_12_0 = (RuleCall)cSwReliabilityAssignment_12.eContents().get(0);
		private final Assignment cSwMaintainabilityAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cSwMaintainabilityVSRSSWMaintainabilityRequirementsParserRuleCall_13_0 = (RuleCall)cSwMaintainabilityAssignment_13.eContents().get(0);
		private final Assignment cSwSafetyAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cSwSafetyVSRSSWSafetyRequirementsParserRuleCall_14_0 = (RuleCall)cSwSafetyAssignment_14.eContents().get(0);
		private final Assignment cSwConfigurationDeliveryAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cSwConfigurationDeliveryVSRSSWConfigurationDeliveryRequirementsParserRuleCall_15_0 = (RuleCall)cSwConfigurationDeliveryAssignment_15.eContents().get(0);
		private final Assignment cDataDefinitionDBAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cDataDefinitionDBVSRSDataDefinitionDBRequirementsParserRuleCall_16_0 = (RuleCall)cDataDefinitionDBAssignment_16.eContents().get(0);
		private final Assignment cHumanFactorsAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cHumanFactorsVSRSHumanFactorsRequirementsParserRuleCall_17_0 = (RuleCall)cHumanFactorsAssignment_17.eContents().get(0);
		private final Assignment cAdaptationInstallationAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cAdaptationInstallationVSRSAdaptationInstallationRequirementsParserRuleCall_18_0 = (RuleCall)cAdaptationInstallationAssignment_18.eContents().get(0);
		private final Keyword cRequirementsKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//VSRSRequirements:
		//	'<Requirements>'
		//	sectionDescription=DBody?
		//	general=VSRSGeneralRequirements
		//	functional=VSRSFunctionalRequirements
		//	performance=VSRSPerformanceRequirements
		//	interface=VSRSInterfaceRequirements
		//	operational=VSRSOperationalRequirements
		//	resources=VSRSResourcesRequirements
		//	design=VSRSDesignRequirements
		//	securityPrivacy=VSRSSecurityPrivacyRequirements
		//	portability=VSRSPortabilityRequirements
		//	swQuality=VSRSSWQualityRequirements
		//	swReliability=VSRSSWReliabilityRequirements
		//	swMaintainability=VSRSSWMaintainabilityRequirements
		//	swSafety=VSRSSWSafetyRequirements
		//	swConfigurationDelivery=VSRSSWConfigurationDeliveryRequirements
		//	dataDefinitionDB=VSRSDataDefinitionDBRequirements
		//	humanFactors=VSRSHumanFactorsRequirements
		//	adaptationInstallation=VSRSAdaptationInstallationRequirements
		//	'</Requirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Requirements>' sectionDescription=DBody? general=VSRSGeneralRequirements functional=VSRSFunctionalRequirements
		//performance=VSRSPerformanceRequirements interface=VSRSInterfaceRequirements operational=VSRSOperationalRequirements
		//resources=VSRSResourcesRequirements design=VSRSDesignRequirements securityPrivacy=VSRSSecurityPrivacyRequirements
		//portability=VSRSPortabilityRequirements swQuality=VSRSSWQualityRequirements
		//swReliability=VSRSSWReliabilityRequirements swMaintainability=VSRSSWMaintainabilityRequirements
		//swSafety=VSRSSWSafetyRequirements swConfigurationDelivery=VSRSSWConfigurationDeliveryRequirements
		//dataDefinitionDB=VSRSDataDefinitionDBRequirements humanFactors=VSRSHumanFactorsRequirements
		//adaptationInstallation=VSRSAdaptationInstallationRequirements '</Requirements>'
		public Group getGroup() { return cGroup; }
		
		//'<Requirements>'
		public Keyword getRequirementsKeyword_0() { return cRequirementsKeyword_0; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_1() { return cSectionDescriptionAssignment_1; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_1_0() { return cSectionDescriptionDBodyParserRuleCall_1_0; }
		
		//general=VSRSGeneralRequirements
		public Assignment getGeneralAssignment_2() { return cGeneralAssignment_2; }
		
		//VSRSGeneralRequirements
		public RuleCall getGeneralVSRSGeneralRequirementsParserRuleCall_2_0() { return cGeneralVSRSGeneralRequirementsParserRuleCall_2_0; }
		
		//functional=VSRSFunctionalRequirements
		public Assignment getFunctionalAssignment_3() { return cFunctionalAssignment_3; }
		
		//VSRSFunctionalRequirements
		public RuleCall getFunctionalVSRSFunctionalRequirementsParserRuleCall_3_0() { return cFunctionalVSRSFunctionalRequirementsParserRuleCall_3_0; }
		
		//performance=VSRSPerformanceRequirements
		public Assignment getPerformanceAssignment_4() { return cPerformanceAssignment_4; }
		
		//VSRSPerformanceRequirements
		public RuleCall getPerformanceVSRSPerformanceRequirementsParserRuleCall_4_0() { return cPerformanceVSRSPerformanceRequirementsParserRuleCall_4_0; }
		
		//interface=VSRSInterfaceRequirements
		public Assignment getInterfaceAssignment_5() { return cInterfaceAssignment_5; }
		
		//VSRSInterfaceRequirements
		public RuleCall getInterfaceVSRSInterfaceRequirementsParserRuleCall_5_0() { return cInterfaceVSRSInterfaceRequirementsParserRuleCall_5_0; }
		
		//operational=VSRSOperationalRequirements
		public Assignment getOperationalAssignment_6() { return cOperationalAssignment_6; }
		
		//VSRSOperationalRequirements
		public RuleCall getOperationalVSRSOperationalRequirementsParserRuleCall_6_0() { return cOperationalVSRSOperationalRequirementsParserRuleCall_6_0; }
		
		//resources=VSRSResourcesRequirements
		public Assignment getResourcesAssignment_7() { return cResourcesAssignment_7; }
		
		//VSRSResourcesRequirements
		public RuleCall getResourcesVSRSResourcesRequirementsParserRuleCall_7_0() { return cResourcesVSRSResourcesRequirementsParserRuleCall_7_0; }
		
		//design=VSRSDesignRequirements
		public Assignment getDesignAssignment_8() { return cDesignAssignment_8; }
		
		//VSRSDesignRequirements
		public RuleCall getDesignVSRSDesignRequirementsParserRuleCall_8_0() { return cDesignVSRSDesignRequirementsParserRuleCall_8_0; }
		
		//securityPrivacy=VSRSSecurityPrivacyRequirements
		public Assignment getSecurityPrivacyAssignment_9() { return cSecurityPrivacyAssignment_9; }
		
		//VSRSSecurityPrivacyRequirements
		public RuleCall getSecurityPrivacyVSRSSecurityPrivacyRequirementsParserRuleCall_9_0() { return cSecurityPrivacyVSRSSecurityPrivacyRequirementsParserRuleCall_9_0; }
		
		//portability=VSRSPortabilityRequirements
		public Assignment getPortabilityAssignment_10() { return cPortabilityAssignment_10; }
		
		//VSRSPortabilityRequirements
		public RuleCall getPortabilityVSRSPortabilityRequirementsParserRuleCall_10_0() { return cPortabilityVSRSPortabilityRequirementsParserRuleCall_10_0; }
		
		//swQuality=VSRSSWQualityRequirements
		public Assignment getSwQualityAssignment_11() { return cSwQualityAssignment_11; }
		
		//VSRSSWQualityRequirements
		public RuleCall getSwQualityVSRSSWQualityRequirementsParserRuleCall_11_0() { return cSwQualityVSRSSWQualityRequirementsParserRuleCall_11_0; }
		
		//swReliability=VSRSSWReliabilityRequirements
		public Assignment getSwReliabilityAssignment_12() { return cSwReliabilityAssignment_12; }
		
		//VSRSSWReliabilityRequirements
		public RuleCall getSwReliabilityVSRSSWReliabilityRequirementsParserRuleCall_12_0() { return cSwReliabilityVSRSSWReliabilityRequirementsParserRuleCall_12_0; }
		
		//swMaintainability=VSRSSWMaintainabilityRequirements
		public Assignment getSwMaintainabilityAssignment_13() { return cSwMaintainabilityAssignment_13; }
		
		//VSRSSWMaintainabilityRequirements
		public RuleCall getSwMaintainabilityVSRSSWMaintainabilityRequirementsParserRuleCall_13_0() { return cSwMaintainabilityVSRSSWMaintainabilityRequirementsParserRuleCall_13_0; }
		
		//swSafety=VSRSSWSafetyRequirements
		public Assignment getSwSafetyAssignment_14() { return cSwSafetyAssignment_14; }
		
		//VSRSSWSafetyRequirements
		public RuleCall getSwSafetyVSRSSWSafetyRequirementsParserRuleCall_14_0() { return cSwSafetyVSRSSWSafetyRequirementsParserRuleCall_14_0; }
		
		//swConfigurationDelivery=VSRSSWConfigurationDeliveryRequirements
		public Assignment getSwConfigurationDeliveryAssignment_15() { return cSwConfigurationDeliveryAssignment_15; }
		
		//VSRSSWConfigurationDeliveryRequirements
		public RuleCall getSwConfigurationDeliveryVSRSSWConfigurationDeliveryRequirementsParserRuleCall_15_0() { return cSwConfigurationDeliveryVSRSSWConfigurationDeliveryRequirementsParserRuleCall_15_0; }
		
		//dataDefinitionDB=VSRSDataDefinitionDBRequirements
		public Assignment getDataDefinitionDBAssignment_16() { return cDataDefinitionDBAssignment_16; }
		
		//VSRSDataDefinitionDBRequirements
		public RuleCall getDataDefinitionDBVSRSDataDefinitionDBRequirementsParserRuleCall_16_0() { return cDataDefinitionDBVSRSDataDefinitionDBRequirementsParserRuleCall_16_0; }
		
		//humanFactors=VSRSHumanFactorsRequirements
		public Assignment getHumanFactorsAssignment_17() { return cHumanFactorsAssignment_17; }
		
		//VSRSHumanFactorsRequirements
		public RuleCall getHumanFactorsVSRSHumanFactorsRequirementsParserRuleCall_17_0() { return cHumanFactorsVSRSHumanFactorsRequirementsParserRuleCall_17_0; }
		
		//adaptationInstallation=VSRSAdaptationInstallationRequirements
		public Assignment getAdaptationInstallationAssignment_18() { return cAdaptationInstallationAssignment_18; }
		
		//VSRSAdaptationInstallationRequirements
		public RuleCall getAdaptationInstallationVSRSAdaptationInstallationRequirementsParserRuleCall_18_0() { return cAdaptationInstallationVSRSAdaptationInstallationRequirementsParserRuleCall_18_0; }
		
		//'</Requirements>'
		public Keyword getRequirementsKeyword_19() { return cRequirementsKeyword_19; }
	}
	public class VSRSLogicalModelsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSLogicalModels");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSLogicalModelsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLogicalModelsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLogicalModelsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLogicalModelsVSRSLogicalModelParserRuleCall_2_0 = (RuleCall)cLogicalModelsAssignment_2.eContents().get(0);
		private final Keyword cLogicalModelsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSRSLogicalModels:
		//	{VSRSLogicalModels}
		//	'<LogicalModels>'
		//	logicalModels+=VSRSLogicalModel*
		//	'</LogicalModels>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSLogicalModels} '<LogicalModels>' logicalModels+=VSRSLogicalModel* '</LogicalModels>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSLogicalModels}
		public Action getVSRSLogicalModelsAction_0() { return cVSRSLogicalModelsAction_0; }
		
		//'<LogicalModels>'
		public Keyword getLogicalModelsKeyword_1() { return cLogicalModelsKeyword_1; }
		
		//logicalModels+=VSRSLogicalModel*
		public Assignment getLogicalModelsAssignment_2() { return cLogicalModelsAssignment_2; }
		
		//VSRSLogicalModel
		public RuleCall getLogicalModelsVSRSLogicalModelParserRuleCall_2_0() { return cLogicalModelsVSRSLogicalModelParserRuleCall_2_0; }
		
		//'</LogicalModels>'
		public Keyword getLogicalModelsKeyword_3() { return cLogicalModelsKeyword_3; }
	}
	public class VSRSTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cTermKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSTerm:
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
	public class VSRSDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cDefinitionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSDefinition:
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
	public class VSRSAbbreviationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSAbbreviation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAbbreviationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cAbbreviationKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSAbbreviation:
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
	public class VSRSInstantiableRequirementSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubsectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSectionDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_4_0 = (RuleCall)cSectionDescriptionAssignment_4.eContents().get(0);
		private final Assignment cSrsItemsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_5_0 = (RuleCall)cSrsItemsAssignment_5.eContents().get(0);
		private final Keyword cSubsectionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//VSRSInstantiableRequirementSection:
		//	'<subsection'
		//	'name=' name=STRING
		//	'>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	'</subsection>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<subsection' 'name=' name=STRING '>' sectionDescription=DBody? srsItems+=VSRSDocumentItem* '</subsection>'
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
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_4() { return cSectionDescriptionAssignment_4; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_4_0() { return cSectionDescriptionDBodyParserRuleCall_4_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_5() { return cSrsItemsAssignment_5; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_5_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_5_0; }
		
		//'</subsection>'
		public Keyword getSubsectionKeyword_6() { return cSubsectionKeyword_6; }
	}
	public class VSRSGeneralRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSGeneralRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSGeneralRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGeneralRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cGeneralRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSGeneralRequirements:
		//	{VSRSGeneralRequirements}
		//	'<GeneralRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</GeneralRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSGeneralRequirements} '<GeneralRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</GeneralRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSGeneralRequirements}
		public Action getVSRSGeneralRequirementsAction_0() { return cVSRSGeneralRequirementsAction_0; }
		
		//'<GeneralRequirements>'
		public Keyword getGeneralRequirementsKeyword_1() { return cGeneralRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</GeneralRequirements>'
		public Keyword getGeneralRequirementsKeyword_5() { return cGeneralRequirementsKeyword_5; }
	}
	public class VSRSFunctionalRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSFunctionalRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSFunctionalRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFunctionalRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cFunctionalRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSFunctionalRequirements:
		//	{VSRSFunctionalRequirements}
		//	'<FunctionalRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</FunctionalRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSFunctionalRequirements} '<FunctionalRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</FunctionalRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSFunctionalRequirements}
		public Action getVSRSFunctionalRequirementsAction_0() { return cVSRSFunctionalRequirementsAction_0; }
		
		//'<FunctionalRequirements>'
		public Keyword getFunctionalRequirementsKeyword_1() { return cFunctionalRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</FunctionalRequirements>'
		public Keyword getFunctionalRequirementsKeyword_5() { return cFunctionalRequirementsKeyword_5; }
	}
	public class VSRSPerformanceRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSPerformanceRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSPerformanceRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPerformanceRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cPerformanceRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSPerformanceRequirements:
		//	{VSRSPerformanceRequirements}
		//	'<PerformanceRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</PerformanceRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSPerformanceRequirements} '<PerformanceRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</PerformanceRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSPerformanceRequirements}
		public Action getVSRSPerformanceRequirementsAction_0() { return cVSRSPerformanceRequirementsAction_0; }
		
		//'<PerformanceRequirements>'
		public Keyword getPerformanceRequirementsKeyword_1() { return cPerformanceRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</PerformanceRequirements>'
		public Keyword getPerformanceRequirementsKeyword_5() { return cPerformanceRequirementsKeyword_5; }
	}
	public class VSRSInterfaceRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInterfaceRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSInterfaceRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInterfaceRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cInterfaceRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSInterfaceRequirements:
		//	{VSRSInterfaceRequirements}
		//	'<InterfaceRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</InterfaceRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSInterfaceRequirements} '<InterfaceRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</InterfaceRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSInterfaceRequirements}
		public Action getVSRSInterfaceRequirementsAction_0() { return cVSRSInterfaceRequirementsAction_0; }
		
		//'<InterfaceRequirements>'
		public Keyword getInterfaceRequirementsKeyword_1() { return cInterfaceRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</InterfaceRequirements>'
		public Keyword getInterfaceRequirementsKeyword_5() { return cInterfaceRequirementsKeyword_5; }
	}
	public class VSRSOperationalRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSOperationalRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSOperationalRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOperationalRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cOperationalRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSOperationalRequirements:
		//	{VSRSOperationalRequirements}
		//	'<OperationalRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</OperationalRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSOperationalRequirements} '<OperationalRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</OperationalRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSOperationalRequirements}
		public Action getVSRSOperationalRequirementsAction_0() { return cVSRSOperationalRequirementsAction_0; }
		
		//'<OperationalRequirements>'
		public Keyword getOperationalRequirementsKeyword_1() { return cOperationalRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</OperationalRequirements>'
		public Keyword getOperationalRequirementsKeyword_5() { return cOperationalRequirementsKeyword_5; }
	}
	public class VSRSResourcesRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSResourcesRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSResourcesRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cResourcesRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cResourcesRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSResourcesRequirements:
		//	{VSRSResourcesRequirements}
		//	'<ResourcesRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</ResourcesRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSResourcesRequirements} '<ResourcesRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</ResourcesRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSResourcesRequirements}
		public Action getVSRSResourcesRequirementsAction_0() { return cVSRSResourcesRequirementsAction_0; }
		
		//'<ResourcesRequirements>'
		public Keyword getResourcesRequirementsKeyword_1() { return cResourcesRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</ResourcesRequirements>'
		public Keyword getResourcesRequirementsKeyword_5() { return cResourcesRequirementsKeyword_5; }
	}
	public class VSRSDesignRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDesignRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSDesignRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDesignRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cDesignRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSDesignRequirements:
		//	{VSRSDesignRequirements}
		//	'<DesignRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</DesignRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSDesignRequirements} '<DesignRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</DesignRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSDesignRequirements}
		public Action getVSRSDesignRequirementsAction_0() { return cVSRSDesignRequirementsAction_0; }
		
		//'<DesignRequirements>'
		public Keyword getDesignRequirementsKeyword_1() { return cDesignRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</DesignRequirements>'
		public Keyword getDesignRequirementsKeyword_5() { return cDesignRequirementsKeyword_5; }
	}
	public class VSRSSecurityPrivacyRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSecurityPrivacyRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSecurityPrivacyRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSecurityPrivacyRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSecurityPrivacyRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSecurityPrivacyRequirements:
		//	{VSRSSecurityPrivacyRequirements}
		//	'<SecurityPrivacyRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SecurityPrivacyRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSecurityPrivacyRequirements} '<SecurityPrivacyRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</SecurityPrivacyRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSecurityPrivacyRequirements}
		public Action getVSRSSecurityPrivacyRequirementsAction_0() { return cVSRSSecurityPrivacyRequirementsAction_0; }
		
		//'<SecurityPrivacyRequirements>'
		public Keyword getSecurityPrivacyRequirementsKeyword_1() { return cSecurityPrivacyRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SecurityPrivacyRequirements>'
		public Keyword getSecurityPrivacyRequirementsKeyword_5() { return cSecurityPrivacyRequirementsKeyword_5; }
	}
	public class VSRSPortabilityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSPortabilityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSPortabilityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPortabilityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cPortabilityRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSPortabilityRequirements:
		//	{VSRSPortabilityRequirements}
		//	'<PortabilityRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</PortabilityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSPortabilityRequirements} '<PortabilityRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</PortabilityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSPortabilityRequirements}
		public Action getVSRSPortabilityRequirementsAction_0() { return cVSRSPortabilityRequirementsAction_0; }
		
		//'<PortabilityRequirements>'
		public Keyword getPortabilityRequirementsKeyword_1() { return cPortabilityRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</PortabilityRequirements>'
		public Keyword getPortabilityRequirementsKeyword_5() { return cPortabilityRequirementsKeyword_5; }
	}
	public class VSRSSWQualityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWQualityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSWQualityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSWQualityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSWQualityRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSWQualityRequirements:
		//	{VSRSSWQualityRequirements}
		//	'<SWQualityRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SWQualityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSWQualityRequirements} '<SWQualityRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</SWQualityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSWQualityRequirements}
		public Action getVSRSSWQualityRequirementsAction_0() { return cVSRSSWQualityRequirementsAction_0; }
		
		//'<SWQualityRequirements>'
		public Keyword getSWQualityRequirementsKeyword_1() { return cSWQualityRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SWQualityRequirements>'
		public Keyword getSWQualityRequirementsKeyword_5() { return cSWQualityRequirementsKeyword_5; }
	}
	public class VSRSSWReliabilityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWReliabilityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSWReliabilityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSWReliabilityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSWReliabilityRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSWReliabilityRequirements:
		//	{VSRSSWReliabilityRequirements}
		//	'<SWReliabilityRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SWReliabilityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSWReliabilityRequirements} '<SWReliabilityRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</SWReliabilityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSWReliabilityRequirements}
		public Action getVSRSSWReliabilityRequirementsAction_0() { return cVSRSSWReliabilityRequirementsAction_0; }
		
		//'<SWReliabilityRequirements>'
		public Keyword getSWReliabilityRequirementsKeyword_1() { return cSWReliabilityRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SWReliabilityRequirements>'
		public Keyword getSWReliabilityRequirementsKeyword_5() { return cSWReliabilityRequirementsKeyword_5; }
	}
	public class VSRSSWMaintainabilityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWMaintainabilityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSWMaintainabilityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSWMaintainabilityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSWMaintainabilityRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSWMaintainabilityRequirements:
		//	{VSRSSWMaintainabilityRequirements}
		//	'<SWMaintainabilityRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SWMaintainabilityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSWMaintainabilityRequirements} '<SWMaintainabilityRequirements>' sectionDescription=DBody?
		//srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//'</SWMaintainabilityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSWMaintainabilityRequirements}
		public Action getVSRSSWMaintainabilityRequirementsAction_0() { return cVSRSSWMaintainabilityRequirementsAction_0; }
		
		//'<SWMaintainabilityRequirements>'
		public Keyword getSWMaintainabilityRequirementsKeyword_1() { return cSWMaintainabilityRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SWMaintainabilityRequirements>'
		public Keyword getSWMaintainabilityRequirementsKeyword_5() { return cSWMaintainabilityRequirementsKeyword_5; }
	}
	public class VSRSSWSafetyRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWSafetyRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSWSafetyRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSWSafetyRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSWSafetyRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSWSafetyRequirements:
		//	{VSRSSWSafetyRequirements}
		//	'<SWSafetyRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SWSafetyRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSWSafetyRequirements} '<SWSafetyRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</SWSafetyRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSWSafetyRequirements}
		public Action getVSRSSWSafetyRequirementsAction_0() { return cVSRSSWSafetyRequirementsAction_0; }
		
		//'<SWSafetyRequirements>'
		public Keyword getSWSafetyRequirementsKeyword_1() { return cSWSafetyRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SWSafetyRequirements>'
		public Keyword getSWSafetyRequirementsKeyword_5() { return cSWSafetyRequirementsKeyword_5; }
	}
	public class VSRSSWConfigurationDeliveryRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWConfigurationDeliveryRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSWConfigurationDeliveryRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSWConfigurationDeliveryRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSWConfigurationDeliveryRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSWConfigurationDeliveryRequirements:
		//	{VSRSSWConfigurationDeliveryRequirements}
		//	'<SWConfigurationDeliveryRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SWConfigurationDeliveryRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSWConfigurationDeliveryRequirements} '<SWConfigurationDeliveryRequirements>' sectionDescription=DBody?
		//srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//'</SWConfigurationDeliveryRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSWConfigurationDeliveryRequirements}
		public Action getVSRSSWConfigurationDeliveryRequirementsAction_0() { return cVSRSSWConfigurationDeliveryRequirementsAction_0; }
		
		//'<SWConfigurationDeliveryRequirements>'
		public Keyword getSWConfigurationDeliveryRequirementsKeyword_1() { return cSWConfigurationDeliveryRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SWConfigurationDeliveryRequirements>'
		public Keyword getSWConfigurationDeliveryRequirementsKeyword_5() { return cSWConfigurationDeliveryRequirementsKeyword_5; }
	}
	public class VSRSDataDefinitionDBRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDataDefinitionDBRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSDataDefinitionDBRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDataDefinitionDBRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cDataDefinitionDBRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSDataDefinitionDBRequirements:
		//	{VSRSDataDefinitionDBRequirements}
		//	'<DataDefinitionDBRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</DataDefinitionDBRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSDataDefinitionDBRequirements} '<DataDefinitionDBRequirements>' sectionDescription=DBody?
		//srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//'</DataDefinitionDBRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSDataDefinitionDBRequirements}
		public Action getVSRSDataDefinitionDBRequirementsAction_0() { return cVSRSDataDefinitionDBRequirementsAction_0; }
		
		//'<DataDefinitionDBRequirements>'
		public Keyword getDataDefinitionDBRequirementsKeyword_1() { return cDataDefinitionDBRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</DataDefinitionDBRequirements>'
		public Keyword getDataDefinitionDBRequirementsKeyword_5() { return cDataDefinitionDBRequirementsKeyword_5; }
	}
	public class VSRSHumanFactorsRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSHumanFactorsRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSHumanFactorsRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cHumanFactorsRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cHumanFactorsRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSHumanFactorsRequirements:
		//	{VSRSHumanFactorsRequirements}
		//	'<HumanFactorsRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</HumanFactorsRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSHumanFactorsRequirements} '<HumanFactorsRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</HumanFactorsRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSHumanFactorsRequirements}
		public Action getVSRSHumanFactorsRequirementsAction_0() { return cVSRSHumanFactorsRequirementsAction_0; }
		
		//'<HumanFactorsRequirements>'
		public Keyword getHumanFactorsRequirementsKeyword_1() { return cHumanFactorsRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</HumanFactorsRequirements>'
		public Keyword getHumanFactorsRequirementsKeyword_5() { return cHumanFactorsRequirementsKeyword_5; }
	}
	public class VSRSAdaptationInstallationRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSAdaptationInstallationRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSAdaptationInstallationRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAdaptationInstallationRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cAdaptationInstallationRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSAdaptationInstallationRequirements:
		//	{VSRSAdaptationInstallationRequirements}
		//	'<AdaptationInstallationRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</AdaptationInstallationRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSAdaptationInstallationRequirements} '<AdaptationInstallationRequirements>' sectionDescription=DBody?
		//srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//'</AdaptationInstallationRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSAdaptationInstallationRequirements}
		public Action getVSRSAdaptationInstallationRequirementsAction_0() { return cVSRSAdaptationInstallationRequirementsAction_0; }
		
		//'<AdaptationInstallationRequirements>'
		public Keyword getAdaptationInstallationRequirementsKeyword_1() { return cAdaptationInstallationRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</AdaptationInstallationRequirements>'
		public Keyword getAdaptationInstallationRequirementsKeyword_5() { return cAdaptationInstallationRequirementsKeyword_5; }
	}
	public class VSRSDocumentItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cValidationMethodKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValidationMethodAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValidationMethodVValidationMethodEnumRuleCall_4_0 = (RuleCall)cValidationMethodAssignment_4.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cModeKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cNameKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cModeAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cModeVSRSDocumentItemModesEnumRuleCall_6_2_0 = (RuleCall)cModeAssignment_6_2.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cDescriptionKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDescriptionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDescriptionDBodyParserRuleCall_8_0 = (RuleCall)cDescriptionAssignment_8.eContents().get(0);
		private final Keyword cDescriptionKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cExtendedDescriptionKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cExtendedDescriptionAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cExtendedDescriptionDBodyParserRuleCall_10_1_0 = (RuleCall)cExtendedDescriptionAssignment_10_1.eContents().get(0);
		private final Keyword cExtendedDescriptionKeyword_10_2 = (Keyword)cGroup_10.eContents().get(2);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cParentItemKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cNameKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cParentItemAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final CrossReference cParentItemVTraceableDocumentAbstractItemCrossReference_11_2_0 = (CrossReference)cParentItemAssignment_11_2.eContents().get(0);
		private final RuleCall cParentItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_11_2_0_1 = (RuleCall)cParentItemVTraceableDocumentAbstractItemCrossReference_11_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Keyword cItemKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//VSRSDocumentItem:
		//	'<Item'
		//	'name=' name=STRING
		//	'validationMethod=' validationMethod=VValidationMethod
		//	'>' ('<mode' 'name=' mode+=VSRSDocumentItemModes '/>')*
		//	'<description>'
		//	description=DBody
		//	'</description>' ('<extendedDescription>'
		//	extendedDescription=DBody
		//	'</extendedDescription>')? ('<parentItem' 'name=' parentItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')*
		//	'</Item>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Item' 'name=' name=STRING 'validationMethod=' validationMethod=VValidationMethod '>' ('<mode' 'name='
		//mode+=VSRSDocumentItemModes '/>')* '<description>' description=DBody '</description>' ('<extendedDescription>'
		//extendedDescription=DBody '</extendedDescription>')? ('<parentItem' 'name='
		//parentItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')* '</Item>'
		public Group getGroup() { return cGroup; }
		
		//'<Item'
		public Keyword getItemKeyword_0() { return cItemKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'validationMethod='
		public Keyword getValidationMethodKeyword_3() { return cValidationMethodKeyword_3; }
		
		//validationMethod=VValidationMethod
		public Assignment getValidationMethodAssignment_4() { return cValidationMethodAssignment_4; }
		
		//VValidationMethod
		public RuleCall getValidationMethodVValidationMethodEnumRuleCall_4_0() { return cValidationMethodVValidationMethodEnumRuleCall_4_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//('<mode' 'name=' mode+=VSRSDocumentItemModes '/>')*
		public Group getGroup_6() { return cGroup_6; }
		
		//'<mode'
		public Keyword getModeKeyword_6_0() { return cModeKeyword_6_0; }
		
		//'name='
		public Keyword getNameKeyword_6_1() { return cNameKeyword_6_1; }
		
		//mode+=VSRSDocumentItemModes
		public Assignment getModeAssignment_6_2() { return cModeAssignment_6_2; }
		
		//VSRSDocumentItemModes
		public RuleCall getModeVSRSDocumentItemModesEnumRuleCall_6_2_0() { return cModeVSRSDocumentItemModesEnumRuleCall_6_2_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_6_3() { return cSolidusGreaterThanSignKeyword_6_3; }
		
		//'<description>'
		public Keyword getDescriptionKeyword_7() { return cDescriptionKeyword_7; }
		
		//description=DBody
		public Assignment getDescriptionAssignment_8() { return cDescriptionAssignment_8; }
		
		//DBody
		public RuleCall getDescriptionDBodyParserRuleCall_8_0() { return cDescriptionDBodyParserRuleCall_8_0; }
		
		//'</description>'
		public Keyword getDescriptionKeyword_9() { return cDescriptionKeyword_9; }
		
		//('<extendedDescription>' extendedDescription=DBody '</extendedDescription>')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'<extendedDescription>'
		public Keyword getExtendedDescriptionKeyword_10_0() { return cExtendedDescriptionKeyword_10_0; }
		
		//extendedDescription=DBody
		public Assignment getExtendedDescriptionAssignment_10_1() { return cExtendedDescriptionAssignment_10_1; }
		
		//DBody
		public RuleCall getExtendedDescriptionDBodyParserRuleCall_10_1_0() { return cExtendedDescriptionDBodyParserRuleCall_10_1_0; }
		
		//'</extendedDescription>'
		public Keyword getExtendedDescriptionKeyword_10_2() { return cExtendedDescriptionKeyword_10_2; }
		
		//('<parentItem' 'name=' parentItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')*
		public Group getGroup_11() { return cGroup_11; }
		
		//'<parentItem'
		public Keyword getParentItemKeyword_11_0() { return cParentItemKeyword_11_0; }
		
		//'name='
		public Keyword getNameKeyword_11_1() { return cNameKeyword_11_1; }
		
		//parentItem+=[tdm::VTraceableDocumentAbstractItem|STRING]
		public Assignment getParentItemAssignment_11_2() { return cParentItemAssignment_11_2; }
		
		//[tdm::VTraceableDocumentAbstractItem|STRING]
		public CrossReference getParentItemVTraceableDocumentAbstractItemCrossReference_11_2_0() { return cParentItemVTraceableDocumentAbstractItemCrossReference_11_2_0; }
		
		//STRING
		public RuleCall getParentItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_11_2_0_1() { return cParentItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_11_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_11_3() { return cSolidusGreaterThanSignKeyword_11_3; }
		
		//'</Item>'
		public Keyword getItemKeyword_12() { return cItemKeyword_12; }
	}
	public class VSRSLogicalModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSLogicalModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSLogicalModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLogicalModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//VSRSLogicalModel:
		//	{VSRSLogicalModel}
		//	'<LogicalModel/>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSLogicalModel} '<LogicalModel/>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSLogicalModel}
		public Action getVSRSLogicalModelAction_0() { return cVSRSLogicalModelAction_0; }
		
		//'<LogicalModel/>'
		public Keyword getLogicalModelKeyword_1() { return cLogicalModelKeyword_1; }
	}
	
	public class DAlignmentElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DAlignment");
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
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRunAttributes");
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
	public class VValidationMethodElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VValidationMethod");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAnalysisEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAnalysisAnalysisKeyword_0_0 = (Keyword)cAnalysisEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cInspectionEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cInspectionInspectionKeyword_1_0 = (Keyword)cInspectionEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cTestingEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cTestingTestingKeyword_2_0 = (Keyword)cTestingEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cReviewEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cReviewReviewKeyword_3_0 = (Keyword)cReviewEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cModelSimulationEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cModelSimulationModelSimulationKeyword_4_0 = (Keyword)cModelSimulationEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cWalkThroughEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cWalkThroughWalkThroughKeyword_5_0 = (Keyword)cWalkThroughEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cCrossReadingEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cCrossReadingCrossReadingKeyword_6_0 = (Keyword)cCrossReadingEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cDeskCheckingEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cDeskCheckingDeskCheckingKeyword_7_0 = (Keyword)cDeskCheckingEnumLiteralDeclaration_7.eContents().get(0);
		
		//enum VValidationMethod returns tdm::VValidationMethod:
		//	Analysis='"Analysis"' | Inspection='"Inspection"' | Testing='"Testing"' |
		//	Review='"Review"' | ModelSimulation='"ModelSimulation"' | WalkThrough='"WalkThrough"' |
		//	CrossReading='"CrossReading"' | DeskChecking='"DeskChecking"';
		public EnumRule getRule() { return rule; }
		
		//Analysis='"Analysis"' | Inspection='"Inspection"' | Testing='"Testing"' | Review='"Review"' |
		//ModelSimulation='"ModelSimulation"' | WalkThrough='"WalkThrough"' | CrossReading='"CrossReading"' |
		//DeskChecking='"DeskChecking"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Analysis='"Analysis"'
		public EnumLiteralDeclaration getAnalysisEnumLiteralDeclaration_0() { return cAnalysisEnumLiteralDeclaration_0; }
		
		//'"Analysis"'
		public Keyword getAnalysisAnalysisKeyword_0_0() { return cAnalysisAnalysisKeyword_0_0; }
		
		//Inspection='"Inspection"'
		public EnumLiteralDeclaration getInspectionEnumLiteralDeclaration_1() { return cInspectionEnumLiteralDeclaration_1; }
		
		//'"Inspection"'
		public Keyword getInspectionInspectionKeyword_1_0() { return cInspectionInspectionKeyword_1_0; }
		
		//Testing='"Testing"'
		public EnumLiteralDeclaration getTestingEnumLiteralDeclaration_2() { return cTestingEnumLiteralDeclaration_2; }
		
		//'"Testing"'
		public Keyword getTestingTestingKeyword_2_0() { return cTestingTestingKeyword_2_0; }
		
		//Review='"Review"'
		public EnumLiteralDeclaration getReviewEnumLiteralDeclaration_3() { return cReviewEnumLiteralDeclaration_3; }
		
		//'"Review"'
		public Keyword getReviewReviewKeyword_3_0() { return cReviewReviewKeyword_3_0; }
		
		//ModelSimulation='"ModelSimulation"'
		public EnumLiteralDeclaration getModelSimulationEnumLiteralDeclaration_4() { return cModelSimulationEnumLiteralDeclaration_4; }
		
		//'"ModelSimulation"'
		public Keyword getModelSimulationModelSimulationKeyword_4_0() { return cModelSimulationModelSimulationKeyword_4_0; }
		
		//WalkThrough='"WalkThrough"'
		public EnumLiteralDeclaration getWalkThroughEnumLiteralDeclaration_5() { return cWalkThroughEnumLiteralDeclaration_5; }
		
		//'"WalkThrough"'
		public Keyword getWalkThroughWalkThroughKeyword_5_0() { return cWalkThroughWalkThroughKeyword_5_0; }
		
		//CrossReading='"CrossReading"'
		public EnumLiteralDeclaration getCrossReadingEnumLiteralDeclaration_6() { return cCrossReadingEnumLiteralDeclaration_6; }
		
		//'"CrossReading"'
		public Keyword getCrossReadingCrossReadingKeyword_6_0() { return cCrossReadingCrossReadingKeyword_6_0; }
		
		//DeskChecking='"DeskChecking"'
		public EnumLiteralDeclaration getDeskCheckingEnumLiteralDeclaration_7() { return cDeskCheckingEnumLiteralDeclaration_7; }
		
		//'"DeskChecking"'
		public Keyword getDeskCheckingDeskCheckingKeyword_7_0() { return cDeskCheckingDeskCheckingKeyword_7_0; }
	}
	public class VSRSDocumentItemModesElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItemModes");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cOffEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cOffOffKeyword_0_0 = (Keyword)cOffEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBootEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBootBootKeyword_1_0 = (Keyword)cBootEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSafeEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSafeSafeKeyword_2_0 = (Keyword)cSafeEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cConfigurationEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cConfigurationConfigurationKeyword_3_0 = (Keyword)cConfigurationEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cOperationalEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cOperationalOperationalKeyword_4_0 = (Keyword)cOperationalEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum VSRSDocumentItemModes:
		//	Off='"Off"' | Boot='"Boot"' | Safe='"Safe"' |
		//	Configuration='"Configuration"' | Operational='"Operational"';
		public EnumRule getRule() { return rule; }
		
		//Off='"Off"' | Boot='"Boot"' | Safe='"Safe"' | Configuration='"Configuration"' | Operational='"Operational"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Off='"Off"'
		public EnumLiteralDeclaration getOffEnumLiteralDeclaration_0() { return cOffEnumLiteralDeclaration_0; }
		
		//'"Off"'
		public Keyword getOffOffKeyword_0_0() { return cOffOffKeyword_0_0; }
		
		//Boot='"Boot"'
		public EnumLiteralDeclaration getBootEnumLiteralDeclaration_1() { return cBootEnumLiteralDeclaration_1; }
		
		//'"Boot"'
		public Keyword getBootBootKeyword_1_0() { return cBootBootKeyword_1_0; }
		
		//Safe='"Safe"'
		public EnumLiteralDeclaration getSafeEnumLiteralDeclaration_2() { return cSafeEnumLiteralDeclaration_2; }
		
		//'"Safe"'
		public Keyword getSafeSafeKeyword_2_0() { return cSafeSafeKeyword_2_0; }
		
		//Configuration='"Configuration"'
		public EnumLiteralDeclaration getConfigurationEnumLiteralDeclaration_3() { return cConfigurationEnumLiteralDeclaration_3; }
		
		//'"Configuration"'
		public Keyword getConfigurationConfigurationKeyword_3_0() { return cConfigurationConfigurationKeyword_3_0; }
		
		//Operational='"Operational"'
		public EnumLiteralDeclaration getOperationalEnumLiteralDeclaration_4() { return cOperationalEnumLiteralDeclaration_4; }
		
		//'"Operational"'
		public Keyword getOperationalOperationalKeyword_4_0() { return cOperationalOperationalKeyword_4_0; }
	}
	
	private final VSRSDocumentElements pVSRSDocument;
	private final VSRSTBCsTBDsElements pVSRSTBCsTBDs;
	private final DTBCElements pDTBC;
	private final DTBDElements pDTBD;
	private final VTraceableParentDocumentElements pVTraceableParentDocument;
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
	private final VSRSFixedSectionElements pVSRSFixedSection;
	private final VSRSInstantiableSectionElements pVSRSInstantiableSection;
	private final VSRSIntroductionElements pVSRSIntroduction;
	private final VSRSApplicableDocumentsElements pVSRSApplicableDocuments;
	private final VSRSReferenceDocumentsElements pVSRSReferenceDocuments;
	private final VSRSTermsDefinitionsAbbreviationsElements pVSRSTermsDefinitionsAbbreviations;
	private final VSRSSoftwareOverviewElements pVSRSSoftwareOverview;
	private final VSRSRequirementsElements pVSRSRequirements;
	private final VSRSLogicalModelsElements pVSRSLogicalModels;
	private final VSRSTermElements pVSRSTerm;
	private final VSRSDefinitionElements pVSRSDefinition;
	private final VSRSAbbreviationElements pVSRSAbbreviation;
	private final VSRSInstantiableRequirementSectionElements pVSRSInstantiableRequirementSection;
	private final VSRSGeneralRequirementsElements pVSRSGeneralRequirements;
	private final VSRSFunctionalRequirementsElements pVSRSFunctionalRequirements;
	private final VSRSPerformanceRequirementsElements pVSRSPerformanceRequirements;
	private final VSRSInterfaceRequirementsElements pVSRSInterfaceRequirements;
	private final VSRSOperationalRequirementsElements pVSRSOperationalRequirements;
	private final VSRSResourcesRequirementsElements pVSRSResourcesRequirements;
	private final VSRSDesignRequirementsElements pVSRSDesignRequirements;
	private final VSRSSecurityPrivacyRequirementsElements pVSRSSecurityPrivacyRequirements;
	private final VSRSPortabilityRequirementsElements pVSRSPortabilityRequirements;
	private final VSRSSWQualityRequirementsElements pVSRSSWQualityRequirements;
	private final VSRSSWReliabilityRequirementsElements pVSRSSWReliabilityRequirements;
	private final VSRSSWMaintainabilityRequirementsElements pVSRSSWMaintainabilityRequirements;
	private final VSRSSWSafetyRequirementsElements pVSRSSWSafetyRequirements;
	private final VSRSSWConfigurationDeliveryRequirementsElements pVSRSSWConfigurationDeliveryRequirements;
	private final VSRSDataDefinitionDBRequirementsElements pVSRSDataDefinitionDBRequirements;
	private final VSRSHumanFactorsRequirementsElements pVSRSHumanFactorsRequirements;
	private final VSRSAdaptationInstallationRequirementsElements pVSRSAdaptationInstallationRequirements;
	private final VSRSDocumentItemElements pVSRSDocumentItem;
	private final VValidationMethodElements eVValidationMethod;
	private final VSRSDocumentItemModesElements eVSRSDocumentItemModes;
	private final VSRSLogicalModelElements pVSRSLogicalModel;
	private final TerminalRule tUINT_STRING;
	private final TerminalRule tREAL_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SRSGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVSRSDocument = new VSRSDocumentElements();
		this.pVSRSTBCsTBDs = new VSRSTBCsTBDsElements();
		this.pDTBC = new DTBCElements();
		this.pDTBD = new DTBDElements();
		this.pVTraceableParentDocument = new VTraceableParentDocumentElements();
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
		this.tRUNTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.RUNTEXT");
		this.pDFigureFromFile = new DFigureFromFileElements();
		this.pDTableFromFile = new DTableFromFileElements();
		this.pDBasicTable = new DBasicTableElements();
		this.pDRow = new DRowElements();
		this.pDCell = new DCellElements();
		this.pDApplicableDocument = new DApplicableDocumentElements();
		this.pDReferenceDocument = new DReferenceDocumentElements();
		this.pVSRSFixedSection = new VSRSFixedSectionElements();
		this.pVSRSInstantiableSection = new VSRSInstantiableSectionElements();
		this.pVSRSIntroduction = new VSRSIntroductionElements();
		this.pVSRSApplicableDocuments = new VSRSApplicableDocumentsElements();
		this.pVSRSReferenceDocuments = new VSRSReferenceDocumentsElements();
		this.pVSRSTermsDefinitionsAbbreviations = new VSRSTermsDefinitionsAbbreviationsElements();
		this.pVSRSSoftwareOverview = new VSRSSoftwareOverviewElements();
		this.pVSRSRequirements = new VSRSRequirementsElements();
		this.pVSRSLogicalModels = new VSRSLogicalModelsElements();
		this.pVSRSTerm = new VSRSTermElements();
		this.pVSRSDefinition = new VSRSDefinitionElements();
		this.pVSRSAbbreviation = new VSRSAbbreviationElements();
		this.pVSRSInstantiableRequirementSection = new VSRSInstantiableRequirementSectionElements();
		this.pVSRSGeneralRequirements = new VSRSGeneralRequirementsElements();
		this.pVSRSFunctionalRequirements = new VSRSFunctionalRequirementsElements();
		this.pVSRSPerformanceRequirements = new VSRSPerformanceRequirementsElements();
		this.pVSRSInterfaceRequirements = new VSRSInterfaceRequirementsElements();
		this.pVSRSOperationalRequirements = new VSRSOperationalRequirementsElements();
		this.pVSRSResourcesRequirements = new VSRSResourcesRequirementsElements();
		this.pVSRSDesignRequirements = new VSRSDesignRequirementsElements();
		this.pVSRSSecurityPrivacyRequirements = new VSRSSecurityPrivacyRequirementsElements();
		this.pVSRSPortabilityRequirements = new VSRSPortabilityRequirementsElements();
		this.pVSRSSWQualityRequirements = new VSRSSWQualityRequirementsElements();
		this.pVSRSSWReliabilityRequirements = new VSRSSWReliabilityRequirementsElements();
		this.pVSRSSWMaintainabilityRequirements = new VSRSSWMaintainabilityRequirementsElements();
		this.pVSRSSWSafetyRequirements = new VSRSSWSafetyRequirementsElements();
		this.pVSRSSWConfigurationDeliveryRequirements = new VSRSSWConfigurationDeliveryRequirementsElements();
		this.pVSRSDataDefinitionDBRequirements = new VSRSDataDefinitionDBRequirementsElements();
		this.pVSRSHumanFactorsRequirements = new VSRSHumanFactorsRequirementsElements();
		this.pVSRSAdaptationInstallationRequirements = new VSRSAdaptationInstallationRequirementsElements();
		this.pVSRSDocumentItem = new VSRSDocumentItemElements();
		this.eVValidationMethod = new VValidationMethodElements();
		this.eVSRSDocumentItemModes = new VSRSDocumentItemModesElements();
		this.pVSRSLogicalModel = new VSRSLogicalModelElements();
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
		this.tREAL_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.REAL_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.svm.lang.srs.SRS".equals(grammar.getName())) {
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

	
	//VSRSDocument:
	//	'<SRS'
	//	'name=' name=STRING
	//	'id=' id=STRING
	//	'issue=' issue=UINT_STRING
	//	'revision=' revision=UINT_STRING
	//	'date=' date=STRING
	//	'>'
	//	parents+=VTraceableParentDocument*
	//	tbcsTbdsSection=VSRSTBCsTBDs?
	//	introductionSection=VSRSIntroduction
	//	applicableDocumentsSection=VSRSApplicableDocuments
	//	referenceDocumentsSection=VSRSReferenceDocuments
	//	termsDefinitionsAbbreviationsSection=VSRSTermsDefinitionsAbbreviations
	//	softwareOverviewSection=VSRSSoftwareOverview
	//	requirementsSection=VSRSRequirements
	//	logicalModelsSection=VSRSLogicalModels
	//	'</SRS>';
	public VSRSDocumentElements getVSRSDocumentAccess() {
		return pVSRSDocument;
	}
	
	public ParserRule getVSRSDocumentRule() {
		return getVSRSDocumentAccess().getRule();
	}
	
	//VSRSTBCsTBDs:
	//	{VSRSTBCsTBDs}
	//	'<TBCsTBDs>'
	//	tbcs+=DTBC*
	//	tbds+=DTBD*
	//	'</TBCsTBDs>';
	public VSRSTBCsTBDsElements getVSRSTBCsTBDsAccess() {
		return pVSRSTBCsTBDs;
	}
	
	public ParserRule getVSRSTBCsTBDsRule() {
		return getVSRSTBCsTBDsAccess().getRule();
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
	
	//VTraceableParentDocument tdm::VTraceableParentDocument:
	//	'<parent' 'document=' document=[tdm::VTraceableDocument|STRING] ('>' ('<notApplicableItem' 'item='
	//	notApplicableItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')+ '</parent>' | '/>')
	public VTraceableParentDocumentElements getVTraceableParentDocumentAccess() {
		return pVTraceableParentDocument;
	}
	
	public ParserRule getVTraceableParentDocumentRule() {
		return getVTraceableParentDocumentAccess().getRule();
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
	
	//VSRSFixedSection:
	//	{VSRSFixedSection} body=DBody?
	//	srsInstatiableSubsections+=VSRSInstantiableSection*;
	public VSRSFixedSectionElements getVSRSFixedSectionAccess() {
		return pVSRSFixedSection;
	}
	
	public ParserRule getVSRSFixedSectionRule() {
		return getVSRSFixedSectionAccess().getRule();
	}
	
	//VSRSInstantiableSection:
	//	'<subsection'
	//	'name=' name=STRING
	//	'>'
	//	body=DBody?
	//	srsInstatiableSubsections+=VSRSInstantiableSection*
	//	'</subsection>';
	public VSRSInstantiableSectionElements getVSRSInstantiableSectionAccess() {
		return pVSRSInstantiableSection;
	}
	
	public ParserRule getVSRSInstantiableSectionRule() {
		return getVSRSInstantiableSectionAccess().getRule();
	}
	
	//VSRSIntroduction:
	//	'<Introduction>'
	//	srsInstatiableSubsections+=VSRSInstantiableSection+
	//	'</Introduction>';
	public VSRSIntroductionElements getVSRSIntroductionAccess() {
		return pVSRSIntroduction;
	}
	
	public ParserRule getVSRSIntroductionRule() {
		return getVSRSIntroductionAccess().getRule();
	}
	
	//VSRSApplicableDocuments:
	//	{VSRSApplicableDocuments}
	//	'<ApplicableDocuments>'
	//	applicableDocuments+=DApplicableDocument*
	//	'</ApplicableDocuments>';
	public VSRSApplicableDocumentsElements getVSRSApplicableDocumentsAccess() {
		return pVSRSApplicableDocuments;
	}
	
	public ParserRule getVSRSApplicableDocumentsRule() {
		return getVSRSApplicableDocumentsAccess().getRule();
	}
	
	//VSRSReferenceDocuments:
	//	{VSRSReferenceDocuments}
	//	'<ReferenceDocuments>'
	//	referenceDocuments+=DReferenceDocument*
	//	'</ReferenceDocuments>';
	public VSRSReferenceDocumentsElements getVSRSReferenceDocumentsAccess() {
		return pVSRSReferenceDocuments;
	}
	
	public ParserRule getVSRSReferenceDocumentsRule() {
		return getVSRSReferenceDocumentsAccess().getRule();
	}
	
	//VSRSTermsDefinitionsAbbreviations:
	//	{VSRSTermsDefinitionsAbbreviations}
	//	'<TermsDefinitionsAbbreviations>'
	//	terms+=VSRSTerm*
	//	definitions+=VSRSDefinition*
	//	abbreviations+=VSRSAbbreviation*
	//	'</TermsDefinitionsAbbreviations>';
	public VSRSTermsDefinitionsAbbreviationsElements getVSRSTermsDefinitionsAbbreviationsAccess() {
		return pVSRSTermsDefinitionsAbbreviations;
	}
	
	public ParserRule getVSRSTermsDefinitionsAbbreviationsRule() {
		return getVSRSTermsDefinitionsAbbreviationsAccess().getRule();
	}
	
	//VSRSSoftwareOverview:
	//	'<SoftwareOverview>'
	//	'<FunctionPurpose>' functionPurpose=VSRSFixedSection '</FunctionPurpose>'
	//	'<EnvironmentalConsiderations>' environmentalConsiderations=VSRSFixedSection '</EnvironmentalConsiderations>'
	//	'<RelationOtherSystems>' relationOtherSystems=VSRSFixedSection '</RelationOtherSystems>'
	//	'<Constraints>' constraints=VSRSFixedSection '</Constraints>'
	//	'</SoftwareOverview>';
	public VSRSSoftwareOverviewElements getVSRSSoftwareOverviewAccess() {
		return pVSRSSoftwareOverview;
	}
	
	public ParserRule getVSRSSoftwareOverviewRule() {
		return getVSRSSoftwareOverviewAccess().getRule();
	}
	
	//VSRSRequirements:
	//	'<Requirements>'
	//	sectionDescription=DBody?
	//	general=VSRSGeneralRequirements
	//	functional=VSRSFunctionalRequirements
	//	performance=VSRSPerformanceRequirements
	//	interface=VSRSInterfaceRequirements
	//	operational=VSRSOperationalRequirements
	//	resources=VSRSResourcesRequirements
	//	design=VSRSDesignRequirements
	//	securityPrivacy=VSRSSecurityPrivacyRequirements
	//	portability=VSRSPortabilityRequirements
	//	swQuality=VSRSSWQualityRequirements
	//	swReliability=VSRSSWReliabilityRequirements
	//	swMaintainability=VSRSSWMaintainabilityRequirements
	//	swSafety=VSRSSWSafetyRequirements
	//	swConfigurationDelivery=VSRSSWConfigurationDeliveryRequirements
	//	dataDefinitionDB=VSRSDataDefinitionDBRequirements
	//	humanFactors=VSRSHumanFactorsRequirements
	//	adaptationInstallation=VSRSAdaptationInstallationRequirements
	//	'</Requirements>';
	public VSRSRequirementsElements getVSRSRequirementsAccess() {
		return pVSRSRequirements;
	}
	
	public ParserRule getVSRSRequirementsRule() {
		return getVSRSRequirementsAccess().getRule();
	}
	
	//VSRSLogicalModels:
	//	{VSRSLogicalModels}
	//	'<LogicalModels>'
	//	logicalModels+=VSRSLogicalModel*
	//	'</LogicalModels>';
	public VSRSLogicalModelsElements getVSRSLogicalModelsAccess() {
		return pVSRSLogicalModels;
	}
	
	public ParserRule getVSRSLogicalModelsRule() {
		return getVSRSLogicalModelsAccess().getRule();
	}
	
	//VSRSTerm:
	//	'<Term'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Term>';
	public VSRSTermElements getVSRSTermAccess() {
		return pVSRSTerm;
	}
	
	public ParserRule getVSRSTermRule() {
		return getVSRSTermAccess().getRule();
	}
	
	//VSRSDefinition:
	//	'<Definition'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Definition>';
	public VSRSDefinitionElements getVSRSDefinitionAccess() {
		return pVSRSDefinition;
	}
	
	public ParserRule getVSRSDefinitionRule() {
		return getVSRSDefinitionAccess().getRule();
	}
	
	//VSRSAbbreviation:
	//	'<Abbreviation'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Abbreviation>';
	public VSRSAbbreviationElements getVSRSAbbreviationAccess() {
		return pVSRSAbbreviation;
	}
	
	public ParserRule getVSRSAbbreviationRule() {
		return getVSRSAbbreviationAccess().getRule();
	}
	
	//VSRSInstantiableRequirementSection:
	//	'<subsection'
	//	'name=' name=STRING
	//	'>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	'</subsection>';
	public VSRSInstantiableRequirementSectionElements getVSRSInstantiableRequirementSectionAccess() {
		return pVSRSInstantiableRequirementSection;
	}
	
	public ParserRule getVSRSInstantiableRequirementSectionRule() {
		return getVSRSInstantiableRequirementSectionAccess().getRule();
	}
	
	//VSRSGeneralRequirements:
	//	{VSRSGeneralRequirements}
	//	'<GeneralRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</GeneralRequirements>';
	public VSRSGeneralRequirementsElements getVSRSGeneralRequirementsAccess() {
		return pVSRSGeneralRequirements;
	}
	
	public ParserRule getVSRSGeneralRequirementsRule() {
		return getVSRSGeneralRequirementsAccess().getRule();
	}
	
	//VSRSFunctionalRequirements:
	//	{VSRSFunctionalRequirements}
	//	'<FunctionalRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</FunctionalRequirements>';
	public VSRSFunctionalRequirementsElements getVSRSFunctionalRequirementsAccess() {
		return pVSRSFunctionalRequirements;
	}
	
	public ParserRule getVSRSFunctionalRequirementsRule() {
		return getVSRSFunctionalRequirementsAccess().getRule();
	}
	
	//VSRSPerformanceRequirements:
	//	{VSRSPerformanceRequirements}
	//	'<PerformanceRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</PerformanceRequirements>';
	public VSRSPerformanceRequirementsElements getVSRSPerformanceRequirementsAccess() {
		return pVSRSPerformanceRequirements;
	}
	
	public ParserRule getVSRSPerformanceRequirementsRule() {
		return getVSRSPerformanceRequirementsAccess().getRule();
	}
	
	//VSRSInterfaceRequirements:
	//	{VSRSInterfaceRequirements}
	//	'<InterfaceRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</InterfaceRequirements>';
	public VSRSInterfaceRequirementsElements getVSRSInterfaceRequirementsAccess() {
		return pVSRSInterfaceRequirements;
	}
	
	public ParserRule getVSRSInterfaceRequirementsRule() {
		return getVSRSInterfaceRequirementsAccess().getRule();
	}
	
	//VSRSOperationalRequirements:
	//	{VSRSOperationalRequirements}
	//	'<OperationalRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</OperationalRequirements>';
	public VSRSOperationalRequirementsElements getVSRSOperationalRequirementsAccess() {
		return pVSRSOperationalRequirements;
	}
	
	public ParserRule getVSRSOperationalRequirementsRule() {
		return getVSRSOperationalRequirementsAccess().getRule();
	}
	
	//VSRSResourcesRequirements:
	//	{VSRSResourcesRequirements}
	//	'<ResourcesRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</ResourcesRequirements>';
	public VSRSResourcesRequirementsElements getVSRSResourcesRequirementsAccess() {
		return pVSRSResourcesRequirements;
	}
	
	public ParserRule getVSRSResourcesRequirementsRule() {
		return getVSRSResourcesRequirementsAccess().getRule();
	}
	
	//VSRSDesignRequirements:
	//	{VSRSDesignRequirements}
	//	'<DesignRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</DesignRequirements>';
	public VSRSDesignRequirementsElements getVSRSDesignRequirementsAccess() {
		return pVSRSDesignRequirements;
	}
	
	public ParserRule getVSRSDesignRequirementsRule() {
		return getVSRSDesignRequirementsAccess().getRule();
	}
	
	//VSRSSecurityPrivacyRequirements:
	//	{VSRSSecurityPrivacyRequirements}
	//	'<SecurityPrivacyRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SecurityPrivacyRequirements>';
	public VSRSSecurityPrivacyRequirementsElements getVSRSSecurityPrivacyRequirementsAccess() {
		return pVSRSSecurityPrivacyRequirements;
	}
	
	public ParserRule getVSRSSecurityPrivacyRequirementsRule() {
		return getVSRSSecurityPrivacyRequirementsAccess().getRule();
	}
	
	//VSRSPortabilityRequirements:
	//	{VSRSPortabilityRequirements}
	//	'<PortabilityRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</PortabilityRequirements>';
	public VSRSPortabilityRequirementsElements getVSRSPortabilityRequirementsAccess() {
		return pVSRSPortabilityRequirements;
	}
	
	public ParserRule getVSRSPortabilityRequirementsRule() {
		return getVSRSPortabilityRequirementsAccess().getRule();
	}
	
	//VSRSSWQualityRequirements:
	//	{VSRSSWQualityRequirements}
	//	'<SWQualityRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SWQualityRequirements>';
	public VSRSSWQualityRequirementsElements getVSRSSWQualityRequirementsAccess() {
		return pVSRSSWQualityRequirements;
	}
	
	public ParserRule getVSRSSWQualityRequirementsRule() {
		return getVSRSSWQualityRequirementsAccess().getRule();
	}
	
	//VSRSSWReliabilityRequirements:
	//	{VSRSSWReliabilityRequirements}
	//	'<SWReliabilityRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SWReliabilityRequirements>';
	public VSRSSWReliabilityRequirementsElements getVSRSSWReliabilityRequirementsAccess() {
		return pVSRSSWReliabilityRequirements;
	}
	
	public ParserRule getVSRSSWReliabilityRequirementsRule() {
		return getVSRSSWReliabilityRequirementsAccess().getRule();
	}
	
	//VSRSSWMaintainabilityRequirements:
	//	{VSRSSWMaintainabilityRequirements}
	//	'<SWMaintainabilityRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SWMaintainabilityRequirements>';
	public VSRSSWMaintainabilityRequirementsElements getVSRSSWMaintainabilityRequirementsAccess() {
		return pVSRSSWMaintainabilityRequirements;
	}
	
	public ParserRule getVSRSSWMaintainabilityRequirementsRule() {
		return getVSRSSWMaintainabilityRequirementsAccess().getRule();
	}
	
	//VSRSSWSafetyRequirements:
	//	{VSRSSWSafetyRequirements}
	//	'<SWSafetyRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SWSafetyRequirements>';
	public VSRSSWSafetyRequirementsElements getVSRSSWSafetyRequirementsAccess() {
		return pVSRSSWSafetyRequirements;
	}
	
	public ParserRule getVSRSSWSafetyRequirementsRule() {
		return getVSRSSWSafetyRequirementsAccess().getRule();
	}
	
	//VSRSSWConfigurationDeliveryRequirements:
	//	{VSRSSWConfigurationDeliveryRequirements}
	//	'<SWConfigurationDeliveryRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SWConfigurationDeliveryRequirements>';
	public VSRSSWConfigurationDeliveryRequirementsElements getVSRSSWConfigurationDeliveryRequirementsAccess() {
		return pVSRSSWConfigurationDeliveryRequirements;
	}
	
	public ParserRule getVSRSSWConfigurationDeliveryRequirementsRule() {
		return getVSRSSWConfigurationDeliveryRequirementsAccess().getRule();
	}
	
	//VSRSDataDefinitionDBRequirements:
	//	{VSRSDataDefinitionDBRequirements}
	//	'<DataDefinitionDBRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</DataDefinitionDBRequirements>';
	public VSRSDataDefinitionDBRequirementsElements getVSRSDataDefinitionDBRequirementsAccess() {
		return pVSRSDataDefinitionDBRequirements;
	}
	
	public ParserRule getVSRSDataDefinitionDBRequirementsRule() {
		return getVSRSDataDefinitionDBRequirementsAccess().getRule();
	}
	
	//VSRSHumanFactorsRequirements:
	//	{VSRSHumanFactorsRequirements}
	//	'<HumanFactorsRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</HumanFactorsRequirements>';
	public VSRSHumanFactorsRequirementsElements getVSRSHumanFactorsRequirementsAccess() {
		return pVSRSHumanFactorsRequirements;
	}
	
	public ParserRule getVSRSHumanFactorsRequirementsRule() {
		return getVSRSHumanFactorsRequirementsAccess().getRule();
	}
	
	//VSRSAdaptationInstallationRequirements:
	//	{VSRSAdaptationInstallationRequirements}
	//	'<AdaptationInstallationRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</AdaptationInstallationRequirements>';
	public VSRSAdaptationInstallationRequirementsElements getVSRSAdaptationInstallationRequirementsAccess() {
		return pVSRSAdaptationInstallationRequirements;
	}
	
	public ParserRule getVSRSAdaptationInstallationRequirementsRule() {
		return getVSRSAdaptationInstallationRequirementsAccess().getRule();
	}
	
	//VSRSDocumentItem:
	//	'<Item'
	//	'name=' name=STRING
	//	'validationMethod=' validationMethod=VValidationMethod
	//	'>' ('<mode' 'name=' mode+=VSRSDocumentItemModes '/>')*
	//	'<description>'
	//	description=DBody
	//	'</description>' ('<extendedDescription>'
	//	extendedDescription=DBody
	//	'</extendedDescription>')? ('<parentItem' 'name=' parentItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')*
	//	'</Item>';
	public VSRSDocumentItemElements getVSRSDocumentItemAccess() {
		return pVSRSDocumentItem;
	}
	
	public ParserRule getVSRSDocumentItemRule() {
		return getVSRSDocumentItemAccess().getRule();
	}
	
	//enum VValidationMethod returns tdm::VValidationMethod:
	//	Analysis='"Analysis"' | Inspection='"Inspection"' | Testing='"Testing"' |
	//	Review='"Review"' | ModelSimulation='"ModelSimulation"' | WalkThrough='"WalkThrough"' |
	//	CrossReading='"CrossReading"' | DeskChecking='"DeskChecking"';
	public VValidationMethodElements getVValidationMethodAccess() {
		return eVValidationMethod;
	}
	
	public EnumRule getVValidationMethodRule() {
		return getVValidationMethodAccess().getRule();
	}
	
	//enum VSRSDocumentItemModes:
	//	Off='"Off"' | Boot='"Boot"' | Safe='"Safe"' |
	//	Configuration='"Configuration"' | Operational='"Operational"';
	public VSRSDocumentItemModesElements getVSRSDocumentItemModesAccess() {
		return eVSRSDocumentItemModes;
	}
	
	public EnumRule getVSRSDocumentItemModesRule() {
		return getVSRSDocumentItemModesAccess().getRule();
	}
	
	//VSRSLogicalModel:
	//	{VSRSLogicalModel}
	//	'<LogicalModel/>';
	public VSRSLogicalModelElements getVSRSLogicalModelAccess() {
		return pVSRSLogicalModel;
	}
	
	public ParserRule getVSRSLogicalModelRule() {
		return getVSRSLogicalModelAccess().getRule();
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
