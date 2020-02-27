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
package es.uah.aut.srg.micobs.svm.lang.testsetup.services;

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
public class TESTSETUPGrammarAccess extends AbstractGrammarElementFinder {
	
	public class VTestSetupDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTestSetupKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Assignment cTbcsTbdsSectionAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cTbcsTbdsSectionVTestSetupTBCsTBDsParserRuleCall_12_0 = (RuleCall)cTbcsTbdsSectionAssignment_12.eContents().get(0);
		private final Assignment cApplicableDocumentsSectionAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cApplicableDocumentsSectionVTestSetupApplicableDocumentsParserRuleCall_13_0 = (RuleCall)cApplicableDocumentsSectionAssignment_13.eContents().get(0);
		private final Assignment cReferenceDocumentsSectionAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cReferenceDocumentsSectionVTestSetupReferenceDocumentsParserRuleCall_14_0 = (RuleCall)cReferenceDocumentsSectionAssignment_14.eContents().get(0);
		private final Keyword cInterfacesKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cInterfacesAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cInterfacesVTestSetupInterfacesSectionParserRuleCall_16_0 = (RuleCall)cInterfacesAssignment_16.eContents().get(0);
		private final Keyword cInterfacesKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Group cGroup_18 = (Group)cGroup.eContents().get(18);
		private final Keyword cPacketConfigurationsKeyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final Assignment cConfigurationsAssignment_18_1 = (Assignment)cGroup_18.eContents().get(1);
		private final RuleCall cConfigurationsVTestSetupPacketConfigurationsSectionParserRuleCall_18_1_0 = (RuleCall)cConfigurationsAssignment_18_1.eContents().get(0);
		private final Keyword cPacketConfigurationsKeyword_18_2 = (Keyword)cGroup_18.eContents().get(2);
		private final Group cGroup_19 = (Group)cGroup.eContents().get(19);
		private final Keyword cActionsKeyword_19_0 = (Keyword)cGroup_19.eContents().get(0);
		private final Assignment cActionsAssignment_19_1 = (Assignment)cGroup_19.eContents().get(1);
		private final RuleCall cActionsVTestSetupActionsSectionParserRuleCall_19_1_0 = (RuleCall)cActionsAssignment_19_1.eContents().get(0);
		private final Keyword cActionsKeyword_19_2 = (Keyword)cGroup_19.eContents().get(2);
		private final Keyword cScenariosKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cScenariosAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cScenariosVTestSetupScenariosSectionParserRuleCall_21_0 = (RuleCall)cScenariosAssignment_21.eContents().get(0);
		private final Keyword cScenariosKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cTestSetupKeyword_23 = (Keyword)cGroup.eContents().get(23);
		
		//VTestSetupDocument:
		//	'<TestSetup'
		//	'name=' name=STRING
		//	'id=' id=STRING
		//	'issue=' issue=UINT_STRING
		//	'revision=' revision=UINT_STRING
		//	'date=' date=STRING
		//	'>'
		//	tbcsTbdsSection=VTestSetupTBCsTBDs?
		//	applicableDocumentsSection=VTestSetupApplicableDocuments
		//	referenceDocumentsSection=VTestSetupReferenceDocuments
		//	'<Interfaces>' interfaces=VTestSetupInterfacesSection '</Interfaces>' ('<PacketConfigurations>'
		//	configurations=VTestSetupPacketConfigurationsSection '</PacketConfigurations>')? ('<Actions>'
		//	actions=VTestSetupActionsSection '</Actions>')?
		//	'<Scenarios>' scenarios=VTestSetupScenariosSection '</Scenarios>'
		//	'</TestSetup>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<TestSetup' 'name=' name=STRING 'id=' id=STRING 'issue=' issue=UINT_STRING 'revision=' revision=UINT_STRING 'date='
		//date=STRING '>' tbcsTbdsSection=VTestSetupTBCsTBDs? applicableDocumentsSection=VTestSetupApplicableDocuments
		//referenceDocumentsSection=VTestSetupReferenceDocuments '<Interfaces>' interfaces=VTestSetupInterfacesSection
		//'</Interfaces>' ('<PacketConfigurations>' configurations=VTestSetupPacketConfigurationsSection
		//'</PacketConfigurations>')? ('<Actions>' actions=VTestSetupActionsSection '</Actions>')? '<Scenarios>'
		//scenarios=VTestSetupScenariosSection '</Scenarios>' '</TestSetup>'
		public Group getGroup() { return cGroup; }
		
		//'<TestSetup'
		public Keyword getTestSetupKeyword_0() { return cTestSetupKeyword_0; }
		
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
		
		//tbcsTbdsSection=VTestSetupTBCsTBDs?
		public Assignment getTbcsTbdsSectionAssignment_12() { return cTbcsTbdsSectionAssignment_12; }
		
		//VTestSetupTBCsTBDs
		public RuleCall getTbcsTbdsSectionVTestSetupTBCsTBDsParserRuleCall_12_0() { return cTbcsTbdsSectionVTestSetupTBCsTBDsParserRuleCall_12_0; }
		
		//applicableDocumentsSection=VTestSetupApplicableDocuments
		public Assignment getApplicableDocumentsSectionAssignment_13() { return cApplicableDocumentsSectionAssignment_13; }
		
		//VTestSetupApplicableDocuments
		public RuleCall getApplicableDocumentsSectionVTestSetupApplicableDocumentsParserRuleCall_13_0() { return cApplicableDocumentsSectionVTestSetupApplicableDocumentsParserRuleCall_13_0; }
		
		//referenceDocumentsSection=VTestSetupReferenceDocuments
		public Assignment getReferenceDocumentsSectionAssignment_14() { return cReferenceDocumentsSectionAssignment_14; }
		
		//VTestSetupReferenceDocuments
		public RuleCall getReferenceDocumentsSectionVTestSetupReferenceDocumentsParserRuleCall_14_0() { return cReferenceDocumentsSectionVTestSetupReferenceDocumentsParserRuleCall_14_0; }
		
		//'<Interfaces>'
		public Keyword getInterfacesKeyword_15() { return cInterfacesKeyword_15; }
		
		//interfaces=VTestSetupInterfacesSection
		public Assignment getInterfacesAssignment_16() { return cInterfacesAssignment_16; }
		
		//VTestSetupInterfacesSection
		public RuleCall getInterfacesVTestSetupInterfacesSectionParserRuleCall_16_0() { return cInterfacesVTestSetupInterfacesSectionParserRuleCall_16_0; }
		
		//'</Interfaces>'
		public Keyword getInterfacesKeyword_17() { return cInterfacesKeyword_17; }
		
		//('<PacketConfigurations>' configurations=VTestSetupPacketConfigurationsSection '</PacketConfigurations>')?
		public Group getGroup_18() { return cGroup_18; }
		
		//'<PacketConfigurations>'
		public Keyword getPacketConfigurationsKeyword_18_0() { return cPacketConfigurationsKeyword_18_0; }
		
		//configurations=VTestSetupPacketConfigurationsSection
		public Assignment getConfigurationsAssignment_18_1() { return cConfigurationsAssignment_18_1; }
		
		//VTestSetupPacketConfigurationsSection
		public RuleCall getConfigurationsVTestSetupPacketConfigurationsSectionParserRuleCall_18_1_0() { return cConfigurationsVTestSetupPacketConfigurationsSectionParserRuleCall_18_1_0; }
		
		//'</PacketConfigurations>'
		public Keyword getPacketConfigurationsKeyword_18_2() { return cPacketConfigurationsKeyword_18_2; }
		
		//('<Actions>' actions=VTestSetupActionsSection '</Actions>')?
		public Group getGroup_19() { return cGroup_19; }
		
		//'<Actions>'
		public Keyword getActionsKeyword_19_0() { return cActionsKeyword_19_0; }
		
		//actions=VTestSetupActionsSection
		public Assignment getActionsAssignment_19_1() { return cActionsAssignment_19_1; }
		
		//VTestSetupActionsSection
		public RuleCall getActionsVTestSetupActionsSectionParserRuleCall_19_1_0() { return cActionsVTestSetupActionsSectionParserRuleCall_19_1_0; }
		
		//'</Actions>'
		public Keyword getActionsKeyword_19_2() { return cActionsKeyword_19_2; }
		
		//'<Scenarios>'
		public Keyword getScenariosKeyword_20() { return cScenariosKeyword_20; }
		
		//scenarios=VTestSetupScenariosSection
		public Assignment getScenariosAssignment_21() { return cScenariosAssignment_21; }
		
		//VTestSetupScenariosSection
		public RuleCall getScenariosVTestSetupScenariosSectionParserRuleCall_21_0() { return cScenariosVTestSetupScenariosSectionParserRuleCall_21_0; }
		
		//'</Scenarios>'
		public Keyword getScenariosKeyword_22() { return cScenariosKeyword_22; }
		
		//'</TestSetup>'
		public Keyword getTestSetupKeyword_23() { return cTestSetupKeyword_23; }
	}
	public class VTestSetupTBCsTBDsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupTBCsTBDs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVTestSetupTBCsTBDsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTBCsTBDsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTbcsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTbcsDTBCParserRuleCall_2_0 = (RuleCall)cTbcsAssignment_2.eContents().get(0);
		private final Assignment cTbdsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTbdsDTBDParserRuleCall_3_0 = (RuleCall)cTbdsAssignment_3.eContents().get(0);
		private final Keyword cTBCsTBDsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VTestSetupTBCsTBDs:
		//	{VTestSetupTBCsTBDs}
		//	'<TBCsTBDs>'
		//	tbcs+=DTBC*
		//	tbds+=DTBD*
		//	'</TBCsTBDs>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VTestSetupTBCsTBDs} '<TBCsTBDs>' tbcs+=DTBC* tbds+=DTBD* '</TBCsTBDs>'
		public Group getGroup() { return cGroup; }
		
		//{VTestSetupTBCsTBDs}
		public Action getVTestSetupTBCsTBDsAction_0() { return cVTestSetupTBCsTBDsAction_0; }
		
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DTBC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTBCKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cDescriptionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DTBC doctpl::DTBC:
		//	'<TBC'
		//	'name=' name=STRING
		//	'description=' description=STRING
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<TBC' 'name=' name=STRING 'description=' description=STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<TBC'
		public Keyword getTBCKeyword_0() { return cTBCKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'description='
		public Keyword getDescriptionKeyword_3() { return cDescriptionKeyword_3; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_4_0() { return cDescriptionSTRINGTerminalRuleCall_4_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_5() { return cSolidusGreaterThanSignKeyword_5; }
	}
	public class DTBDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DTBD");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTBDKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cDescriptionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DTBD doctpl::DTBD:
		//	'<TBD'
		//	'name=' name=STRING
		//	'description=' description=STRING
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<TBD' 'name=' name=STRING 'description=' description=STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<TBD'
		public Keyword getTBDKeyword_0() { return cTBDKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'description='
		public Keyword getDescriptionKeyword_3() { return cDescriptionKeyword_3; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_4_0() { return cDescriptionSTRINGTerminalRuleCall_4_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_5() { return cSolidusGreaterThanSignKeyword_5; }
	}
	public class VTestSetupApplicableDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupApplicableDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVTestSetupApplicableDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cApplicableDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0 = (RuleCall)cApplicableDocumentsAssignment_2.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VTestSetupApplicableDocuments:
		//	{VTestSetupApplicableDocuments}
		//	'<ApplicableDocuments>'
		//	applicableDocuments+=DApplicableDocument*
		//	'</ApplicableDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VTestSetupApplicableDocuments} '<ApplicableDocuments>' applicableDocuments+=DApplicableDocument*
		//'</ApplicableDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VTestSetupApplicableDocuments}
		public Action getVTestSetupApplicableDocumentsAction_0() { return cVTestSetupApplicableDocumentsAction_0; }
		
		//'<ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_1() { return cApplicableDocumentsKeyword_1; }
		
		//applicableDocuments+=DApplicableDocument*
		public Assignment getApplicableDocumentsAssignment_2() { return cApplicableDocumentsAssignment_2; }
		
		//DApplicableDocument
		public RuleCall getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0() { return cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0; }
		
		//'</ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_3() { return cApplicableDocumentsKeyword_3; }
	}
	public class VTestSetupReferenceDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupReferenceDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVTestSetupReferenceDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cReferenceDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0 = (RuleCall)cReferenceDocumentsAssignment_2.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VTestSetupReferenceDocuments:
		//	{VTestSetupReferenceDocuments}
		//	'<ReferenceDocuments>'
		//	referenceDocuments+=DReferenceDocument*
		//	'</ReferenceDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VTestSetupReferenceDocuments} '<ReferenceDocuments>' referenceDocuments+=DReferenceDocument* '</ReferenceDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VTestSetupReferenceDocuments}
		public Action getVTestSetupReferenceDocumentsAction_0() { return cVTestSetupReferenceDocumentsAction_0; }
		
		//'<ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_1() { return cReferenceDocumentsKeyword_1; }
		
		//referenceDocuments+=DReferenceDocument*
		public Assignment getReferenceDocumentsAssignment_2() { return cReferenceDocumentsAssignment_2; }
		
		//DReferenceDocument
		public RuleCall getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0() { return cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0; }
		
		//'</ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_3() { return cReferenceDocumentsKeyword_3; }
	}
	public class DApplicableDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DApplicableDocument");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DReferenceDocument");
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
	public class VTestSetupInterfacesSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupInterfacesSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVTestSetupInterfacesSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cInterfacesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInterfacesVTestSetupInterfaceParserRuleCall_1_0 = (RuleCall)cInterfacesAssignment_1.eContents().get(0);
		
		//VTestSetupInterfacesSection:
		//	{VTestSetupInterfacesSection} interfaces+=VTestSetupInterface+;
		@Override public ParserRule getRule() { return rule; }
		
		//{VTestSetupInterfacesSection} interfaces+=VTestSetupInterface+
		public Group getGroup() { return cGroup; }
		
		//{VTestSetupInterfacesSection}
		public Action getVTestSetupInterfacesSectionAction_0() { return cVTestSetupInterfacesSectionAction_0; }
		
		//interfaces+=VTestSetupInterface+
		public Assignment getInterfacesAssignment_1() { return cInterfacesAssignment_1; }
		
		//VTestSetupInterface
		public RuleCall getInterfacesVTestSetupInterfaceParserRuleCall_1_0() { return cInterfacesVTestSetupInterfaceParserRuleCall_1_0; }
	}
	public class VTestSetupInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cTcHeaderKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTcHeaderAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTcHeaderTMTCIFTCHeaderCrossReference_4_0 = (CrossReference)cTcHeaderAssignment_4.eContents().get(0);
		private final RuleCall cTcHeaderTMTCIFTCHeaderSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cTcHeaderTMTCIFTCHeaderCrossReference_4_0.eContents().get(1);
		private final Keyword cTmHeaderKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cTmHeaderAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cTmHeaderTMTCIFTMHeaderCrossReference_6_0 = (CrossReference)cTmHeaderAssignment_6.eContents().get(0);
		private final RuleCall cTmHeaderTMTCIFTMHeaderSTRINGTerminalRuleCall_6_0_1 = (RuleCall)cTmHeaderTMTCIFTMHeaderCrossReference_6_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDescriptionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDescriptionDRunParserRuleCall_8_0 = (RuleCall)cDescriptionAssignment_8.eContents().get(0);
		private final Keyword cInterfaceKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//VTestSetupInterface:
		//	'<Interface'
		//	'name=' name=STRING
		//	'tcHeader=' tcHeader=[tcheader::TMTCIFTCHeader|STRING]
		//	'tmHeader=' tmHeader=[tmheader::TMTCIFTMHeader|STRING]
		//	'>'
		//	description=DRun
		//	'</Interface>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Interface' 'name=' name=STRING 'tcHeader=' tcHeader=[tcheader::TMTCIFTCHeader|STRING] 'tmHeader='
		//tmHeader=[tmheader::TMTCIFTMHeader|STRING] '>' description=DRun '</Interface>'
		public Group getGroup() { return cGroup; }
		
		//'<Interface'
		public Keyword getInterfaceKeyword_0() { return cInterfaceKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'tcHeader='
		public Keyword getTcHeaderKeyword_3() { return cTcHeaderKeyword_3; }
		
		//tcHeader=[tcheader::TMTCIFTCHeader|STRING]
		public Assignment getTcHeaderAssignment_4() { return cTcHeaderAssignment_4; }
		
		//[tcheader::TMTCIFTCHeader|STRING]
		public CrossReference getTcHeaderTMTCIFTCHeaderCrossReference_4_0() { return cTcHeaderTMTCIFTCHeaderCrossReference_4_0; }
		
		//STRING
		public RuleCall getTcHeaderTMTCIFTCHeaderSTRINGTerminalRuleCall_4_0_1() { return cTcHeaderTMTCIFTCHeaderSTRINGTerminalRuleCall_4_0_1; }
		
		//'tmHeader='
		public Keyword getTmHeaderKeyword_5() { return cTmHeaderKeyword_5; }
		
		//tmHeader=[tmheader::TMTCIFTMHeader|STRING]
		public Assignment getTmHeaderAssignment_6() { return cTmHeaderAssignment_6; }
		
		//[tmheader::TMTCIFTMHeader|STRING]
		public CrossReference getTmHeaderTMTCIFTMHeaderCrossReference_6_0() { return cTmHeaderTMTCIFTMHeaderCrossReference_6_0; }
		
		//STRING
		public RuleCall getTmHeaderTMTCIFTMHeaderSTRINGTerminalRuleCall_6_0_1() { return cTmHeaderTMTCIFTMHeaderSTRINGTerminalRuleCall_6_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_7() { return cGreaterThanSignKeyword_7; }
		
		//description=DRun
		public Assignment getDescriptionAssignment_8() { return cDescriptionAssignment_8; }
		
		//DRun
		public RuleCall getDescriptionDRunParserRuleCall_8_0() { return cDescriptionDRunParserRuleCall_8_0; }
		
		//'</Interface>'
		public Keyword getInterfaceKeyword_9() { return cInterfaceKeyword_9; }
	}
	public class VTestSetupPacketConfigurationsSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupPacketConfigurationsSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVTestSetupPacketConfigurationsSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cPacketConfigurationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPacketConfigurationsVTestSetupPacketConfigurationParserRuleCall_1_0 = (RuleCall)cPacketConfigurationsAssignment_1.eContents().get(0);
		
		//VTestSetupPacketConfigurationsSection:
		//	{VTestSetupPacketConfigurationsSection} packetConfigurations+=VTestSetupPacketConfiguration+;
		@Override public ParserRule getRule() { return rule; }
		
		//{VTestSetupPacketConfigurationsSection} packetConfigurations+=VTestSetupPacketConfiguration+
		public Group getGroup() { return cGroup; }
		
		//{VTestSetupPacketConfigurationsSection}
		public Action getVTestSetupPacketConfigurationsSectionAction_0() { return cVTestSetupPacketConfigurationsSectionAction_0; }
		
		//packetConfigurations+=VTestSetupPacketConfiguration+
		public Assignment getPacketConfigurationsAssignment_1() { return cPacketConfigurationsAssignment_1; }
		
		//VTestSetupPacketConfiguration
		public RuleCall getPacketConfigurationsVTestSetupPacketConfigurationParserRuleCall_1_0() { return cPacketConfigurationsVTestSetupPacketConfigurationParserRuleCall_1_0; }
	}
	public class VTestSetupPacketConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupPacketConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPacketConfigurationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIdKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdUINT_STRINGTerminalRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDescriptionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDescriptionDRunParserRuleCall_6_0 = (RuleCall)cDescriptionAssignment_6.eContents().get(0);
		private final Keyword cPacketConfigurationKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VTestSetupPacketConfiguration:
		//	'<PacketConfiguration'
		//	'name=' name=STRING
		//	'id=' id=UINT_STRING
		//	'>'
		//	description=DRun
		//	'</PacketConfiguration>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<PacketConfiguration' 'name=' name=STRING 'id=' id=UINT_STRING '>' description=DRun '</PacketConfiguration>'
		public Group getGroup() { return cGroup; }
		
		//'<PacketConfiguration'
		public Keyword getPacketConfigurationKeyword_0() { return cPacketConfigurationKeyword_0; }
		
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
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//description=DRun
		public Assignment getDescriptionAssignment_6() { return cDescriptionAssignment_6; }
		
		//DRun
		public RuleCall getDescriptionDRunParserRuleCall_6_0() { return cDescriptionDRunParserRuleCall_6_0; }
		
		//'</PacketConfiguration>'
		public Keyword getPacketConfigurationKeyword_7() { return cPacketConfigurationKeyword_7; }
	}
	public class VTestSetupActionsSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupActionsSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVTestSetupActionsSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cActionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cActionVTestSetupActionParserRuleCall_1_0 = (RuleCall)cActionAssignment_1.eContents().get(0);
		
		//VTestSetupActionsSection:
		//	{VTestSetupActionsSection} action+=VTestSetupAction+;
		@Override public ParserRule getRule() { return rule; }
		
		//{VTestSetupActionsSection} action+=VTestSetupAction+
		public Group getGroup() { return cGroup; }
		
		//{VTestSetupActionsSection}
		public Action getVTestSetupActionsSectionAction_0() { return cVTestSetupActionsSectionAction_0; }
		
		//action+=VTestSetupAction+
		public Assignment getActionAssignment_1() { return cActionAssignment_1; }
		
		//VTestSetupAction
		public RuleCall getActionVTestSetupActionParserRuleCall_1_0() { return cActionVTestSetupActionParserRuleCall_1_0; }
	}
	public class VTestSetupActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cTypeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeVTestSetupActionTypeEnumRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDescriptionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDescriptionDBodyParserRuleCall_6_0 = (RuleCall)cDescriptionAssignment_6.eContents().get(0);
		private final Keyword cActionKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VTestSetupAction:
		//	'<Action'
		//	'name=' name=STRING
		//	'type=' type=VTestSetupActionType
		//	'>'
		//	description=DBody
		//	'</Action>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Action' 'name=' name=STRING 'type=' type=VTestSetupActionType '>' description=DBody '</Action>'
		public Group getGroup() { return cGroup; }
		
		//'<Action'
		public Keyword getActionKeyword_0() { return cActionKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'type='
		public Keyword getTypeKeyword_3() { return cTypeKeyword_3; }
		
		//type=VTestSetupActionType
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//VTestSetupActionType
		public RuleCall getTypeVTestSetupActionTypeEnumRuleCall_4_0() { return cTypeVTestSetupActionTypeEnumRuleCall_4_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//description=DBody
		public Assignment getDescriptionAssignment_6() { return cDescriptionAssignment_6; }
		
		//DBody
		public RuleCall getDescriptionDBodyParserRuleCall_6_0() { return cDescriptionDBodyParserRuleCall_6_0; }
		
		//'</Action>'
		public Keyword getActionKeyword_7() { return cActionKeyword_7; }
	}
	public class VTestSetupScenariosSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupScenariosSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVTestSetupScenariosSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cScenariosAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cScenariosVTestSetupScenarioSectionParserRuleCall_1_0 = (RuleCall)cScenariosAssignment_1.eContents().get(0);
		
		//VTestSetupScenariosSection:
		//	{VTestSetupScenariosSection} scenarios+=VTestSetupScenarioSection+;
		@Override public ParserRule getRule() { return rule; }
		
		//{VTestSetupScenariosSection} scenarios+=VTestSetupScenarioSection+
		public Group getGroup() { return cGroup; }
		
		//{VTestSetupScenariosSection}
		public Action getVTestSetupScenariosSectionAction_0() { return cVTestSetupScenariosSectionAction_0; }
		
		//scenarios+=VTestSetupScenarioSection+
		public Assignment getScenariosAssignment_1() { return cScenariosAssignment_1; }
		
		//VTestSetupScenarioSection
		public RuleCall getScenariosVTestSetupScenarioSectionParserRuleCall_1_0() { return cScenariosVTestSetupScenarioSectionParserRuleCall_1_0; }
	}
	public class VTestSetupScenarioSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupScenarioSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cScenarioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cScenarioKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cScenarioAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cScenarioTMTCIFScenarioCrossReference_4_0 = (CrossReference)cScenarioAssignment_4.eContents().get(0);
		private final RuleCall cScenarioTMTCIFScenarioSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cScenarioTMTCIFScenarioCrossReference_4_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cSupportedInterfaceAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSupportedInterfaceVTestSetupSupportedInterfaceParserRuleCall_6_0 = (RuleCall)cSupportedInterfaceAssignment_6.eContents().get(0);
		private final Assignment cSelectedConfigurationAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cSelectedConfigurationVTestSetupSelectedConfigurationParserRuleCall_7_0 = (RuleCall)cSelectedConfigurationAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cActionKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cRefKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cSupportedActionAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final CrossReference cSupportedActionVTestSetupActionCrossReference_8_2_0 = (CrossReference)cSupportedActionAssignment_8_2.eContents().get(0);
		private final RuleCall cSupportedActionVTestSetupActionSTRINGTerminalRuleCall_8_2_0_1 = (RuleCall)cSupportedActionVTestSetupActionCrossReference_8_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_8_3 = (Keyword)cGroup_8.eContents().get(3);
		private final Assignment cBodyAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cBodyDBodyParserRuleCall_9_0 = (RuleCall)cBodyAssignment_9.eContents().get(0);
		private final Keyword cScenarioKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//VTestSetupScenarioSection:
		//	'<Scenario'
		//	'name=' name=STRING
		//	'scenario=' scenario=[scenario::TMTCIFScenario|STRING]
		//	'>'
		//	supportedInterface+=VTestSetupSupportedInterface*
		//	selectedConfiguration+=VTestSetupSelectedConfiguration* ('<Action' 'ref=' supportedAction+=[VTestSetupAction|STRING]
		//	'/>')*
		//	body=DBody
		//	'</Scenario>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Scenario' 'name=' name=STRING 'scenario=' scenario=[scenario::TMTCIFScenario|STRING] '>'
		//supportedInterface+=VTestSetupSupportedInterface* selectedConfiguration+=VTestSetupSelectedConfiguration* ('<Action'
		//'ref=' supportedAction+=[VTestSetupAction|STRING] '/>')* body=DBody '</Scenario>'
		public Group getGroup() { return cGroup; }
		
		//'<Scenario'
		public Keyword getScenarioKeyword_0() { return cScenarioKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'scenario='
		public Keyword getScenarioKeyword_3() { return cScenarioKeyword_3; }
		
		//scenario=[scenario::TMTCIFScenario|STRING]
		public Assignment getScenarioAssignment_4() { return cScenarioAssignment_4; }
		
		//[scenario::TMTCIFScenario|STRING]
		public CrossReference getScenarioTMTCIFScenarioCrossReference_4_0() { return cScenarioTMTCIFScenarioCrossReference_4_0; }
		
		//STRING
		public RuleCall getScenarioTMTCIFScenarioSTRINGTerminalRuleCall_4_0_1() { return cScenarioTMTCIFScenarioSTRINGTerminalRuleCall_4_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//supportedInterface+=VTestSetupSupportedInterface*
		public Assignment getSupportedInterfaceAssignment_6() { return cSupportedInterfaceAssignment_6; }
		
		//VTestSetupSupportedInterface
		public RuleCall getSupportedInterfaceVTestSetupSupportedInterfaceParserRuleCall_6_0() { return cSupportedInterfaceVTestSetupSupportedInterfaceParserRuleCall_6_0; }
		
		//selectedConfiguration+=VTestSetupSelectedConfiguration*
		public Assignment getSelectedConfigurationAssignment_7() { return cSelectedConfigurationAssignment_7; }
		
		//VTestSetupSelectedConfiguration
		public RuleCall getSelectedConfigurationVTestSetupSelectedConfigurationParserRuleCall_7_0() { return cSelectedConfigurationVTestSetupSelectedConfigurationParserRuleCall_7_0; }
		
		//('<Action' 'ref=' supportedAction+=[VTestSetupAction|STRING] '/>')*
		public Group getGroup_8() { return cGroup_8; }
		
		//'<Action'
		public Keyword getActionKeyword_8_0() { return cActionKeyword_8_0; }
		
		//'ref='
		public Keyword getRefKeyword_8_1() { return cRefKeyword_8_1; }
		
		//supportedAction+=[VTestSetupAction|STRING]
		public Assignment getSupportedActionAssignment_8_2() { return cSupportedActionAssignment_8_2; }
		
		//[VTestSetupAction|STRING]
		public CrossReference getSupportedActionVTestSetupActionCrossReference_8_2_0() { return cSupportedActionVTestSetupActionCrossReference_8_2_0; }
		
		//STRING
		public RuleCall getSupportedActionVTestSetupActionSTRINGTerminalRuleCall_8_2_0_1() { return cSupportedActionVTestSetupActionSTRINGTerminalRuleCall_8_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_8_3() { return cSolidusGreaterThanSignKeyword_8_3; }
		
		//body=DBody
		public Assignment getBodyAssignment_9() { return cBodyAssignment_9; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_9_0() { return cBodyDBodyParserRuleCall_9_0; }
		
		//'</Scenario>'
		public Keyword getScenarioKeyword_10() { return cScenarioKeyword_10; }
	}
	public class VTestSetupSupportedInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupSupportedInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cRefKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInterfaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cInterfaceVTestSetupInterfaceCrossReference_4_0 = (CrossReference)cInterfaceAssignment_4.eContents().get(0);
		private final RuleCall cInterfaceVTestSetupInterfaceSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cInterfaceVTestSetupInterfaceCrossReference_4_0.eContents().get(1);
		private final Keyword cScenarioInterfaceKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cScenarioInterfaceAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cScenarioInterfaceTMTCIFScenarioInterfaceCrossReference_6_0 = (CrossReference)cScenarioInterfaceAssignment_6.eContents().get(0);
		private final RuleCall cScenarioInterfaceTMTCIFScenarioInterfaceSTRINGTerminalRuleCall_6_0_1 = (RuleCall)cScenarioInterfaceTMTCIFScenarioInterfaceCrossReference_6_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VTestSetupSupportedInterface:
		//	'<Interface'
		//	'name=' name=STRING
		//	'ref=' interface=[VTestSetupInterface|STRING]
		//	'scenarioInterface=' scenarioInterface=[scenario::TMTCIFScenarioInterface|STRING]
		//	'/>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Interface' 'name=' name=STRING 'ref=' interface=[VTestSetupInterface|STRING] 'scenarioInterface='
		//scenarioInterface=[scenario::TMTCIFScenarioInterface|STRING] '/>'
		public Group getGroup() { return cGroup; }
		
		//'<Interface'
		public Keyword getInterfaceKeyword_0() { return cInterfaceKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'ref='
		public Keyword getRefKeyword_3() { return cRefKeyword_3; }
		
		//interface=[VTestSetupInterface|STRING]
		public Assignment getInterfaceAssignment_4() { return cInterfaceAssignment_4; }
		
		//[VTestSetupInterface|STRING]
		public CrossReference getInterfaceVTestSetupInterfaceCrossReference_4_0() { return cInterfaceVTestSetupInterfaceCrossReference_4_0; }
		
		//STRING
		public RuleCall getInterfaceVTestSetupInterfaceSTRINGTerminalRuleCall_4_0_1() { return cInterfaceVTestSetupInterfaceSTRINGTerminalRuleCall_4_0_1; }
		
		//'scenarioInterface='
		public Keyword getScenarioInterfaceKeyword_5() { return cScenarioInterfaceKeyword_5; }
		
		//scenarioInterface=[scenario::TMTCIFScenarioInterface|STRING]
		public Assignment getScenarioInterfaceAssignment_6() { return cScenarioInterfaceAssignment_6; }
		
		//[scenario::TMTCIFScenarioInterface|STRING]
		public CrossReference getScenarioInterfaceTMTCIFScenarioInterfaceCrossReference_6_0() { return cScenarioInterfaceTMTCIFScenarioInterfaceCrossReference_6_0; }
		
		//STRING
		public RuleCall getScenarioInterfaceTMTCIFScenarioInterfaceSTRINGTerminalRuleCall_6_0_1() { return cScenarioInterfaceTMTCIFScenarioInterfaceSTRINGTerminalRuleCall_6_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_7() { return cSolidusGreaterThanSignKeyword_7; }
	}
	public class VTestSetupSelectedConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupSelectedConfiguration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConfigurationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cRefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConfigurationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cConfigurationVTestSetupPacketConfigurationCrossReference_2_0 = (CrossReference)cConfigurationAssignment_2.eContents().get(0);
		private final RuleCall cConfigurationVTestSetupPacketConfigurationSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cConfigurationVTestSetupPacketConfigurationCrossReference_2_0.eContents().get(1);
		private final Keyword cDefaultFilterStatusKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDefaultFilterStatusAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDefaultFilterStatusVTestSetupConfigurationStatusEnumRuleCall_4_0 = (RuleCall)cDefaultFilterStatusAssignment_4.eContents().get(0);
		private final Keyword cDefaultPrintStatusKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDefaultPrintStatusAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDefaultPrintStatusVTestSetupConfigurationStatusEnumRuleCall_6_0 = (RuleCall)cDefaultPrintStatusAssignment_6.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VTestSetupSelectedConfiguration:
		//	'<Configuration'
		//	'ref=' configuration=[VTestSetupPacketConfiguration|STRING]
		//	'defaultFilterStatus=' defaultFilterStatus=VTestSetupConfigurationStatus
		//	'defaultPrintStatus=' defaultPrintStatus=VTestSetupConfigurationStatus
		//	'/>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Configuration' 'ref=' configuration=[VTestSetupPacketConfiguration|STRING] 'defaultFilterStatus='
		//defaultFilterStatus=VTestSetupConfigurationStatus 'defaultPrintStatus='
		//defaultPrintStatus=VTestSetupConfigurationStatus '/>'
		public Group getGroup() { return cGroup; }
		
		//'<Configuration'
		public Keyword getConfigurationKeyword_0() { return cConfigurationKeyword_0; }
		
		//'ref='
		public Keyword getRefKeyword_1() { return cRefKeyword_1; }
		
		//configuration=[VTestSetupPacketConfiguration|STRING]
		public Assignment getConfigurationAssignment_2() { return cConfigurationAssignment_2; }
		
		//[VTestSetupPacketConfiguration|STRING]
		public CrossReference getConfigurationVTestSetupPacketConfigurationCrossReference_2_0() { return cConfigurationVTestSetupPacketConfigurationCrossReference_2_0; }
		
		//STRING
		public RuleCall getConfigurationVTestSetupPacketConfigurationSTRINGTerminalRuleCall_2_0_1() { return cConfigurationVTestSetupPacketConfigurationSTRINGTerminalRuleCall_2_0_1; }
		
		//'defaultFilterStatus='
		public Keyword getDefaultFilterStatusKeyword_3() { return cDefaultFilterStatusKeyword_3; }
		
		//defaultFilterStatus=VTestSetupConfigurationStatus
		public Assignment getDefaultFilterStatusAssignment_4() { return cDefaultFilterStatusAssignment_4; }
		
		//VTestSetupConfigurationStatus
		public RuleCall getDefaultFilterStatusVTestSetupConfigurationStatusEnumRuleCall_4_0() { return cDefaultFilterStatusVTestSetupConfigurationStatusEnumRuleCall_4_0; }
		
		//'defaultPrintStatus='
		public Keyword getDefaultPrintStatusKeyword_5() { return cDefaultPrintStatusKeyword_5; }
		
		//defaultPrintStatus=VTestSetupConfigurationStatus
		public Assignment getDefaultPrintStatusAssignment_6() { return cDefaultPrintStatusAssignment_6; }
		
		//VTestSetupConfigurationStatus
		public RuleCall getDefaultPrintStatusVTestSetupConfigurationStatusEnumRuleCall_6_0() { return cDefaultPrintStatusVTestSetupConfigurationStatusEnumRuleCall_6_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_7() { return cSolidusGreaterThanSignKeyword_7; }
	}
	public class DBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DBody");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DBodyContent");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DParagraph");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DListItem");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DListContent");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DItemize");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DEnumerate");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DParagraphContent");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DRun");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DHyperlink");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DTab");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DText");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DFigureFromFile");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DTableFromFile");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DBasicTable");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DRow");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DCell");
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
	
	public class VTestSetupActionTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupActionType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCheckingEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCheckingCheckingKeyword_0_0 = (Keyword)cCheckingEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cInstructionEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cInstructionInstructionKeyword_1_0 = (Keyword)cInstructionEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum VTestSetupActionType:
		//	checking='"checking"' | instruction='"instruction"';
		public EnumRule getRule() { return rule; }
		
		//checking='"checking"' | instruction='"instruction"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//checking='"checking"'
		public EnumLiteralDeclaration getCheckingEnumLiteralDeclaration_0() { return cCheckingEnumLiteralDeclaration_0; }
		
		//'"checking"'
		public Keyword getCheckingCheckingKeyword_0_0() { return cCheckingCheckingKeyword_0_0; }
		
		//instruction='"instruction"'
		public EnumLiteralDeclaration getInstructionEnumLiteralDeclaration_1() { return cInstructionEnumLiteralDeclaration_1; }
		
		//'"instruction"'
		public Keyword getInstructionInstructionKeyword_1_0() { return cInstructionInstructionKeyword_1_0; }
	}
	public class VTestSetupConfigurationStatusElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupConfigurationStatus");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cOffEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cOffOffKeyword_0_0 = (Keyword)cOffEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOnEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cOnOnKeyword_1_0 = (Keyword)cOnEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum VTestSetupConfigurationStatus:
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
	public class DAlignmentElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DAlignment");
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
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DRunAttributes");
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
	
	private final VTestSetupDocumentElements pVTestSetupDocument;
	private final VTestSetupTBCsTBDsElements pVTestSetupTBCsTBDs;
	private final DTBCElements pDTBC;
	private final DTBDElements pDTBD;
	private final VTestSetupApplicableDocumentsElements pVTestSetupApplicableDocuments;
	private final VTestSetupReferenceDocumentsElements pVTestSetupReferenceDocuments;
	private final DApplicableDocumentElements pDApplicableDocument;
	private final DReferenceDocumentElements pDReferenceDocument;
	private final VTestSetupInterfacesSectionElements pVTestSetupInterfacesSection;
	private final VTestSetupInterfaceElements pVTestSetupInterface;
	private final VTestSetupPacketConfigurationsSectionElements pVTestSetupPacketConfigurationsSection;
	private final VTestSetupPacketConfigurationElements pVTestSetupPacketConfiguration;
	private final VTestSetupActionsSectionElements pVTestSetupActionsSection;
	private final VTestSetupActionElements pVTestSetupAction;
	private final VTestSetupActionTypeElements eVTestSetupActionType;
	private final VTestSetupScenariosSectionElements pVTestSetupScenariosSection;
	private final VTestSetupScenarioSectionElements pVTestSetupScenarioSection;
	private final VTestSetupSupportedInterfaceElements pVTestSetupSupportedInterface;
	private final VTestSetupSelectedConfigurationElements pVTestSetupSelectedConfiguration;
	private final VTestSetupConfigurationStatusElements eVTestSetupConfigurationStatus;
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
	private final TerminalRule tUINT_STRING;
	private final TerminalRule tREAL_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TESTSETUPGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVTestSetupDocument = new VTestSetupDocumentElements();
		this.pVTestSetupTBCsTBDs = new VTestSetupTBCsTBDsElements();
		this.pDTBC = new DTBCElements();
		this.pDTBD = new DTBDElements();
		this.pVTestSetupApplicableDocuments = new VTestSetupApplicableDocumentsElements();
		this.pVTestSetupReferenceDocuments = new VTestSetupReferenceDocumentsElements();
		this.pDApplicableDocument = new DApplicableDocumentElements();
		this.pDReferenceDocument = new DReferenceDocumentElements();
		this.pVTestSetupInterfacesSection = new VTestSetupInterfacesSectionElements();
		this.pVTestSetupInterface = new VTestSetupInterfaceElements();
		this.pVTestSetupPacketConfigurationsSection = new VTestSetupPacketConfigurationsSectionElements();
		this.pVTestSetupPacketConfiguration = new VTestSetupPacketConfigurationElements();
		this.pVTestSetupActionsSection = new VTestSetupActionsSectionElements();
		this.pVTestSetupAction = new VTestSetupActionElements();
		this.eVTestSetupActionType = new VTestSetupActionTypeElements();
		this.pVTestSetupScenariosSection = new VTestSetupScenariosSectionElements();
		this.pVTestSetupScenarioSection = new VTestSetupScenarioSectionElements();
		this.pVTestSetupSupportedInterface = new VTestSetupSupportedInterfaceElements();
		this.pVTestSetupSelectedConfiguration = new VTestSetupSelectedConfigurationElements();
		this.eVTestSetupConfigurationStatus = new VTestSetupConfigurationStatusElements();
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
		this.tRUNTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.RUNTEXT");
		this.pDFigureFromFile = new DFigureFromFileElements();
		this.pDTableFromFile = new DTableFromFileElements();
		this.pDBasicTable = new DBasicTableElements();
		this.pDRow = new DRowElements();
		this.pDCell = new DCellElements();
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
		this.tREAL_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.REAL_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP".equals(grammar.getName())) {
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

	
	//VTestSetupDocument:
	//	'<TestSetup'
	//	'name=' name=STRING
	//	'id=' id=STRING
	//	'issue=' issue=UINT_STRING
	//	'revision=' revision=UINT_STRING
	//	'date=' date=STRING
	//	'>'
	//	tbcsTbdsSection=VTestSetupTBCsTBDs?
	//	applicableDocumentsSection=VTestSetupApplicableDocuments
	//	referenceDocumentsSection=VTestSetupReferenceDocuments
	//	'<Interfaces>' interfaces=VTestSetupInterfacesSection '</Interfaces>' ('<PacketConfigurations>'
	//	configurations=VTestSetupPacketConfigurationsSection '</PacketConfigurations>')? ('<Actions>'
	//	actions=VTestSetupActionsSection '</Actions>')?
	//	'<Scenarios>' scenarios=VTestSetupScenariosSection '</Scenarios>'
	//	'</TestSetup>';
	public VTestSetupDocumentElements getVTestSetupDocumentAccess() {
		return pVTestSetupDocument;
	}
	
	public ParserRule getVTestSetupDocumentRule() {
		return getVTestSetupDocumentAccess().getRule();
	}
	
	//VTestSetupTBCsTBDs:
	//	{VTestSetupTBCsTBDs}
	//	'<TBCsTBDs>'
	//	tbcs+=DTBC*
	//	tbds+=DTBD*
	//	'</TBCsTBDs>';
	public VTestSetupTBCsTBDsElements getVTestSetupTBCsTBDsAccess() {
		return pVTestSetupTBCsTBDs;
	}
	
	public ParserRule getVTestSetupTBCsTBDsRule() {
		return getVTestSetupTBCsTBDsAccess().getRule();
	}
	
	//DTBC doctpl::DTBC:
	//	'<TBC'
	//	'name=' name=STRING
	//	'description=' description=STRING
	//	'/>'
	public DTBCElements getDTBCAccess() {
		return pDTBC;
	}
	
	public ParserRule getDTBCRule() {
		return getDTBCAccess().getRule();
	}
	
	//DTBD doctpl::DTBD:
	//	'<TBD'
	//	'name=' name=STRING
	//	'description=' description=STRING
	//	'/>'
	public DTBDElements getDTBDAccess() {
		return pDTBD;
	}
	
	public ParserRule getDTBDRule() {
		return getDTBDAccess().getRule();
	}
	
	//VTestSetupApplicableDocuments:
	//	{VTestSetupApplicableDocuments}
	//	'<ApplicableDocuments>'
	//	applicableDocuments+=DApplicableDocument*
	//	'</ApplicableDocuments>';
	public VTestSetupApplicableDocumentsElements getVTestSetupApplicableDocumentsAccess() {
		return pVTestSetupApplicableDocuments;
	}
	
	public ParserRule getVTestSetupApplicableDocumentsRule() {
		return getVTestSetupApplicableDocumentsAccess().getRule();
	}
	
	//VTestSetupReferenceDocuments:
	//	{VTestSetupReferenceDocuments}
	//	'<ReferenceDocuments>'
	//	referenceDocuments+=DReferenceDocument*
	//	'</ReferenceDocuments>';
	public VTestSetupReferenceDocumentsElements getVTestSetupReferenceDocumentsAccess() {
		return pVTestSetupReferenceDocuments;
	}
	
	public ParserRule getVTestSetupReferenceDocumentsRule() {
		return getVTestSetupReferenceDocumentsAccess().getRule();
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
	
	//VTestSetupInterfacesSection:
	//	{VTestSetupInterfacesSection} interfaces+=VTestSetupInterface+;
	public VTestSetupInterfacesSectionElements getVTestSetupInterfacesSectionAccess() {
		return pVTestSetupInterfacesSection;
	}
	
	public ParserRule getVTestSetupInterfacesSectionRule() {
		return getVTestSetupInterfacesSectionAccess().getRule();
	}
	
	//VTestSetupInterface:
	//	'<Interface'
	//	'name=' name=STRING
	//	'tcHeader=' tcHeader=[tcheader::TMTCIFTCHeader|STRING]
	//	'tmHeader=' tmHeader=[tmheader::TMTCIFTMHeader|STRING]
	//	'>'
	//	description=DRun
	//	'</Interface>';
	public VTestSetupInterfaceElements getVTestSetupInterfaceAccess() {
		return pVTestSetupInterface;
	}
	
	public ParserRule getVTestSetupInterfaceRule() {
		return getVTestSetupInterfaceAccess().getRule();
	}
	
	//VTestSetupPacketConfigurationsSection:
	//	{VTestSetupPacketConfigurationsSection} packetConfigurations+=VTestSetupPacketConfiguration+;
	public VTestSetupPacketConfigurationsSectionElements getVTestSetupPacketConfigurationsSectionAccess() {
		return pVTestSetupPacketConfigurationsSection;
	}
	
	public ParserRule getVTestSetupPacketConfigurationsSectionRule() {
		return getVTestSetupPacketConfigurationsSectionAccess().getRule();
	}
	
	//VTestSetupPacketConfiguration:
	//	'<PacketConfiguration'
	//	'name=' name=STRING
	//	'id=' id=UINT_STRING
	//	'>'
	//	description=DRun
	//	'</PacketConfiguration>';
	public VTestSetupPacketConfigurationElements getVTestSetupPacketConfigurationAccess() {
		return pVTestSetupPacketConfiguration;
	}
	
	public ParserRule getVTestSetupPacketConfigurationRule() {
		return getVTestSetupPacketConfigurationAccess().getRule();
	}
	
	//VTestSetupActionsSection:
	//	{VTestSetupActionsSection} action+=VTestSetupAction+;
	public VTestSetupActionsSectionElements getVTestSetupActionsSectionAccess() {
		return pVTestSetupActionsSection;
	}
	
	public ParserRule getVTestSetupActionsSectionRule() {
		return getVTestSetupActionsSectionAccess().getRule();
	}
	
	//VTestSetupAction:
	//	'<Action'
	//	'name=' name=STRING
	//	'type=' type=VTestSetupActionType
	//	'>'
	//	description=DBody
	//	'</Action>';
	public VTestSetupActionElements getVTestSetupActionAccess() {
		return pVTestSetupAction;
	}
	
	public ParserRule getVTestSetupActionRule() {
		return getVTestSetupActionAccess().getRule();
	}
	
	//enum VTestSetupActionType:
	//	checking='"checking"' | instruction='"instruction"';
	public VTestSetupActionTypeElements getVTestSetupActionTypeAccess() {
		return eVTestSetupActionType;
	}
	
	public EnumRule getVTestSetupActionTypeRule() {
		return getVTestSetupActionTypeAccess().getRule();
	}
	
	//VTestSetupScenariosSection:
	//	{VTestSetupScenariosSection} scenarios+=VTestSetupScenarioSection+;
	public VTestSetupScenariosSectionElements getVTestSetupScenariosSectionAccess() {
		return pVTestSetupScenariosSection;
	}
	
	public ParserRule getVTestSetupScenariosSectionRule() {
		return getVTestSetupScenariosSectionAccess().getRule();
	}
	
	//VTestSetupScenarioSection:
	//	'<Scenario'
	//	'name=' name=STRING
	//	'scenario=' scenario=[scenario::TMTCIFScenario|STRING]
	//	'>'
	//	supportedInterface+=VTestSetupSupportedInterface*
	//	selectedConfiguration+=VTestSetupSelectedConfiguration* ('<Action' 'ref=' supportedAction+=[VTestSetupAction|STRING]
	//	'/>')*
	//	body=DBody
	//	'</Scenario>';
	public VTestSetupScenarioSectionElements getVTestSetupScenarioSectionAccess() {
		return pVTestSetupScenarioSection;
	}
	
	public ParserRule getVTestSetupScenarioSectionRule() {
		return getVTestSetupScenarioSectionAccess().getRule();
	}
	
	//VTestSetupSupportedInterface:
	//	'<Interface'
	//	'name=' name=STRING
	//	'ref=' interface=[VTestSetupInterface|STRING]
	//	'scenarioInterface=' scenarioInterface=[scenario::TMTCIFScenarioInterface|STRING]
	//	'/>';
	public VTestSetupSupportedInterfaceElements getVTestSetupSupportedInterfaceAccess() {
		return pVTestSetupSupportedInterface;
	}
	
	public ParserRule getVTestSetupSupportedInterfaceRule() {
		return getVTestSetupSupportedInterfaceAccess().getRule();
	}
	
	//VTestSetupSelectedConfiguration:
	//	'<Configuration'
	//	'ref=' configuration=[VTestSetupPacketConfiguration|STRING]
	//	'defaultFilterStatus=' defaultFilterStatus=VTestSetupConfigurationStatus
	//	'defaultPrintStatus=' defaultPrintStatus=VTestSetupConfigurationStatus
	//	'/>';
	public VTestSetupSelectedConfigurationElements getVTestSetupSelectedConfigurationAccess() {
		return pVTestSetupSelectedConfiguration;
	}
	
	public ParserRule getVTestSetupSelectedConfigurationRule() {
		return getVTestSetupSelectedConfigurationAccess().getRule();
	}
	
	//enum VTestSetupConfigurationStatus:
	//	off='"off"' | on='"on"';
	public VTestSetupConfigurationStatusElements getVTestSetupConfigurationStatusAccess() {
		return eVTestSetupConfigurationStatus;
	}
	
	public EnumRule getVTestSetupConfigurationStatusRule() {
		return getVTestSetupConfigurationStatusAccess().getRule();
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
