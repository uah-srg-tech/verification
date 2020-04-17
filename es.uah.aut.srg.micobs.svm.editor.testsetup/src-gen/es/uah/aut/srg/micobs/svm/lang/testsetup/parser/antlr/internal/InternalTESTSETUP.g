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
grammar InternalTESTSETUP;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.testsetup.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.testsetup.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.micobs.svm.lang.testsetup.services.TESTSETUPGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private TESTSETUPGrammarAccess grammarAccess;

    public InternalTESTSETUPParser(TokenStream input, TESTSETUPGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "VTestSetupDocument";
   	}

   	@Override
   	protected TESTSETUPGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleVTestSetupDocument
entryRuleVTestSetupDocument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupDocumentRule()); }
	iv_ruleVTestSetupDocument=ruleVTestSetupDocument
	{ $current=$iv_ruleVTestSetupDocument.current; }
	EOF;

// Rule VTestSetupDocument
ruleVTestSetupDocument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TestSetup'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTestSetupDocumentAccess().getTestSetupKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupDocumentAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVTestSetupDocumentAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='id='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupDocumentAccess().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVTestSetupDocumentAccess().getIdSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='issue='
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupDocumentAccess().getIssueKeyword_5());
		}
		(
			(
				lv_issue_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_issue_6_0, grammarAccess.getVTestSetupDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"issue",
						lv_issue_6_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
				}
			)
		)
		otherlv_7='revision='
		{
			newLeafNode(otherlv_7, grammarAccess.getVTestSetupDocumentAccess().getRevisionKeyword_7());
		}
		(
			(
				lv_revision_8_0=RULE_UINT_STRING
				{
					newLeafNode(lv_revision_8_0, grammarAccess.getVTestSetupDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"revision",
						lv_revision_8_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
				}
			)
		)
		otherlv_9='date='
		{
			newLeafNode(otherlv_9, grammarAccess.getVTestSetupDocumentAccess().getDateKeyword_9());
		}
		(
			(
				lv_date_10_0=RULE_STRING
				{
					newLeafNode(lv_date_10_0, grammarAccess.getVTestSetupDocumentAccess().getDateSTRINGTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"date",
						lv_date_10_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_11='>'
		{
			newLeafNode(otherlv_11, grammarAccess.getVTestSetupDocumentAccess().getGreaterThanSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupDocumentAccess().getTbcsTbdsSectionVTestSetupTBCsTBDsParserRuleCall_12_0());
				}
				lv_tbcsTbdsSection_12_0=ruleVTestSetupTBCsTBDs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupDocumentRule());
					}
					set(
						$current,
						"tbcsTbdsSection",
						lv_tbcsTbdsSection_12_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupTBCsTBDs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupDocumentAccess().getApplicableDocumentsSectionVTestSetupApplicableDocumentsParserRuleCall_13_0());
				}
				lv_applicableDocumentsSection_13_0=ruleVTestSetupApplicableDocuments
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupDocumentRule());
					}
					set(
						$current,
						"applicableDocumentsSection",
						lv_applicableDocumentsSection_13_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupApplicableDocuments");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupDocumentAccess().getReferenceDocumentsSectionVTestSetupReferenceDocumentsParserRuleCall_14_0());
				}
				lv_referenceDocumentsSection_14_0=ruleVTestSetupReferenceDocuments
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupDocumentRule());
					}
					set(
						$current,
						"referenceDocumentsSection",
						lv_referenceDocumentsSection_14_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupReferenceDocuments");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='<Interfaces>'
		{
			newLeafNode(otherlv_15, grammarAccess.getVTestSetupDocumentAccess().getInterfacesKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupDocumentAccess().getInterfacesVTestSetupInterfacesSectionParserRuleCall_16_0());
				}
				lv_interfaces_16_0=ruleVTestSetupInterfacesSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupDocumentRule());
					}
					set(
						$current,
						"interfaces",
						lv_interfaces_16_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupInterfacesSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17='</Interfaces>'
		{
			newLeafNode(otherlv_17, grammarAccess.getVTestSetupDocumentAccess().getInterfacesKeyword_17());
		}
		(
			otherlv_18='<PacketConfigurations>'
			{
				newLeafNode(otherlv_18, grammarAccess.getVTestSetupDocumentAccess().getPacketConfigurationsKeyword_18_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVTestSetupDocumentAccess().getConfigurationsVTestSetupPacketConfigurationsSectionParserRuleCall_18_1_0());
					}
					lv_configurations_19_0=ruleVTestSetupPacketConfigurationsSection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVTestSetupDocumentRule());
						}
						set(
							$current,
							"configurations",
							lv_configurations_19_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupPacketConfigurationsSection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_20='</PacketConfigurations>'
			{
				newLeafNode(otherlv_20, grammarAccess.getVTestSetupDocumentAccess().getPacketConfigurationsKeyword_18_2());
			}
		)?
		(
			otherlv_21='<Actions>'
			{
				newLeafNode(otherlv_21, grammarAccess.getVTestSetupDocumentAccess().getActionsKeyword_19_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVTestSetupDocumentAccess().getActionsVTestSetupActionsSectionParserRuleCall_19_1_0());
					}
					lv_actions_22_0=ruleVTestSetupActionsSection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVTestSetupDocumentRule());
						}
						set(
							$current,
							"actions",
							lv_actions_22_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupActionsSection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_23='</Actions>'
			{
				newLeafNode(otherlv_23, grammarAccess.getVTestSetupDocumentAccess().getActionsKeyword_19_2());
			}
		)?
		(
			otherlv_24='<ActionsOverVariables>'
			{
				newLeafNode(otherlv_24, grammarAccess.getVTestSetupDocumentAccess().getActionsOverVariablesKeyword_20_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVTestSetupDocumentAccess().getActionsOverVariablesVTestSetupActionsOverVariablesSectionParserRuleCall_20_1_0());
					}
					lv_actionsOverVariables_25_0=ruleVTestSetupActionsOverVariablesSection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVTestSetupDocumentRule());
						}
						set(
							$current,
							"actionsOverVariables",
							lv_actionsOverVariables_25_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupActionsOverVariablesSection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_26='</ActionsOverVariables>'
			{
				newLeafNode(otherlv_26, grammarAccess.getVTestSetupDocumentAccess().getActionsOverVariablesKeyword_20_2());
			}
		)?
		otherlv_27='<Scenarios>'
		{
			newLeafNode(otherlv_27, grammarAccess.getVTestSetupDocumentAccess().getScenariosKeyword_21());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupDocumentAccess().getScenariosVTestSetupScenariosSectionParserRuleCall_22_0());
				}
				lv_scenarios_28_0=ruleVTestSetupScenariosSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupDocumentRule());
					}
					set(
						$current,
						"scenarios",
						lv_scenarios_28_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupScenariosSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29='</Scenarios>'
		{
			newLeafNode(otherlv_29, grammarAccess.getVTestSetupDocumentAccess().getScenariosKeyword_23());
		}
		otherlv_30='</TestSetup>'
		{
			newLeafNode(otherlv_30, grammarAccess.getVTestSetupDocumentAccess().getTestSetupKeyword_24());
		}
	)
;

// Entry rule entryRuleVTestSetupTBCsTBDs
entryRuleVTestSetupTBCsTBDs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupTBCsTBDsRule()); }
	iv_ruleVTestSetupTBCsTBDs=ruleVTestSetupTBCsTBDs
	{ $current=$iv_ruleVTestSetupTBCsTBDs.current; }
	EOF;

// Rule VTestSetupTBCsTBDs
ruleVTestSetupTBCsTBDs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVTestSetupTBCsTBDsAccess().getVTestSetupTBCsTBDsAction_0(),
					$current);
			}
		)
		otherlv_1='<TBCsTBDs>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupTBCsTBDsAccess().getTBCsTBDsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupTBCsTBDsAccess().getTbcsDTBCParserRuleCall_2_0());
				}
				lv_tbcs_2_0=ruleDTBC
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupTBCsTBDsRule());
					}
					add(
						$current,
						"tbcs",
						lv_tbcs_2_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DTBC");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupTBCsTBDsAccess().getTbdsDTBDParserRuleCall_3_0());
				}
				lv_tbds_3_0=ruleDTBD
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupTBCsTBDsRule());
					}
					add(
						$current,
						"tbds",
						lv_tbds_3_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DTBD");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='</TBCsTBDs>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVTestSetupTBCsTBDsAccess().getTBCsTBDsKeyword_4());
		}
	)
;

// Entry rule entryRuleDTBC
entryRuleDTBC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDTBCRule()); }
	iv_ruleDTBC=ruleDTBC
	{ $current=$iv_ruleDTBC.current; }
	EOF;

// Rule DTBC
ruleDTBC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TBC'
		{
			newLeafNode(otherlv_0, grammarAccess.getDTBCAccess().getTBCKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getDTBCAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDTBCAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDTBCRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='description='
		{
			newLeafNode(otherlv_3, grammarAccess.getDTBCAccess().getDescriptionKeyword_3());
		}
		(
			(
				lv_description_4_0=RULE_STRING
				{
					newLeafNode(lv_description_4_0, grammarAccess.getDTBCAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDTBCRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='/>'
		{
			newLeafNode(otherlv_5, grammarAccess.getDTBCAccess().getSolidusGreaterThanSignKeyword_5());
		}
	)
;

// Entry rule entryRuleDTBD
entryRuleDTBD returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDTBDRule()); }
	iv_ruleDTBD=ruleDTBD
	{ $current=$iv_ruleDTBD.current; }
	EOF;

// Rule DTBD
ruleDTBD returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TBD'
		{
			newLeafNode(otherlv_0, grammarAccess.getDTBDAccess().getTBDKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getDTBDAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDTBDAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDTBDRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='description='
		{
			newLeafNode(otherlv_3, grammarAccess.getDTBDAccess().getDescriptionKeyword_3());
		}
		(
			(
				lv_description_4_0=RULE_STRING
				{
					newLeafNode(lv_description_4_0, grammarAccess.getDTBDAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDTBDRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='/>'
		{
			newLeafNode(otherlv_5, grammarAccess.getDTBDAccess().getSolidusGreaterThanSignKeyword_5());
		}
	)
;

// Entry rule entryRuleVTestSetupApplicableDocuments
entryRuleVTestSetupApplicableDocuments returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupApplicableDocumentsRule()); }
	iv_ruleVTestSetupApplicableDocuments=ruleVTestSetupApplicableDocuments
	{ $current=$iv_ruleVTestSetupApplicableDocuments.current; }
	EOF;

// Rule VTestSetupApplicableDocuments
ruleVTestSetupApplicableDocuments returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVTestSetupApplicableDocumentsAccess().getVTestSetupApplicableDocumentsAction_0(),
					$current);
			}
		)
		otherlv_1='<ApplicableDocuments>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0());
				}
				lv_applicableDocuments_2_0=ruleDApplicableDocument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupApplicableDocumentsRule());
					}
					add(
						$current,
						"applicableDocuments",
						lv_applicableDocuments_2_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DApplicableDocument");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ApplicableDocuments>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsKeyword_3());
		}
	)
;

// Entry rule entryRuleVTestSetupReferenceDocuments
entryRuleVTestSetupReferenceDocuments returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupReferenceDocumentsRule()); }
	iv_ruleVTestSetupReferenceDocuments=ruleVTestSetupReferenceDocuments
	{ $current=$iv_ruleVTestSetupReferenceDocuments.current; }
	EOF;

// Rule VTestSetupReferenceDocuments
ruleVTestSetupReferenceDocuments returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVTestSetupReferenceDocumentsAccess().getVTestSetupReferenceDocumentsAction_0(),
					$current);
			}
		)
		otherlv_1='<ReferenceDocuments>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0());
				}
				lv_referenceDocuments_2_0=ruleDReferenceDocument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupReferenceDocumentsRule());
					}
					add(
						$current,
						"referenceDocuments",
						lv_referenceDocuments_2_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DReferenceDocument");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ReferenceDocuments>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsKeyword_3());
		}
	)
;

// Entry rule entryRuleDApplicableDocument
entryRuleDApplicableDocument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDApplicableDocumentRule()); }
	iv_ruleDApplicableDocument=ruleDApplicableDocument
	{ $current=$iv_ruleDApplicableDocument.current; }
	EOF;

// Rule DApplicableDocument
ruleDApplicableDocument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<ApplicableDocument'
		{
			newLeafNode(otherlv_0, grammarAccess.getDApplicableDocumentAccess().getApplicableDocumentKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getDApplicableDocumentAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDApplicableDocumentAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDApplicableDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='title='
		{
			newLeafNode(otherlv_3, grammarAccess.getDApplicableDocumentAccess().getTitleKeyword_3());
		}
		(
			(
				lv_title_4_0=RULE_STRING
				{
					newLeafNode(lv_title_4_0, grammarAccess.getDApplicableDocumentAccess().getTitleSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDApplicableDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"title",
						lv_title_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='id='
		{
			newLeafNode(otherlv_5, grammarAccess.getDApplicableDocumentAccess().getIdKeyword_5());
		}
		(
			(
				lv_id_6_0=RULE_STRING
				{
					newLeafNode(lv_id_6_0, grammarAccess.getDApplicableDocumentAccess().getIdSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDApplicableDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_7='issue='
			{
				newLeafNode(otherlv_7, grammarAccess.getDApplicableDocumentAccess().getIssueKeyword_7_0());
			}
			(
				(
					lv_issue_8_0=RULE_UINT_STRING
					{
						newLeafNode(lv_issue_8_0, grammarAccess.getDApplicableDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDApplicableDocumentRule());
						}
						setWithLastConsumed(
							$current,
							"issue",
							lv_issue_8_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
					}
				)
			)
			(
				otherlv_9='revision='
				{
					newLeafNode(otherlv_9, grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_7_2_0());
				}
				(
					(
						lv_revision_10_0=RULE_UINT_STRING
						{
							newLeafNode(lv_revision_10_0, grammarAccess.getDApplicableDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDApplicableDocumentRule());
							}
							setWithLastConsumed(
								$current,
								"revision",
								lv_revision_10_0,
								"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
						}
					)
				)
			)?
		)?
		(
			otherlv_11='date='
			{
				newLeafNode(otherlv_11, grammarAccess.getDApplicableDocumentAccess().getDateKeyword_8_0());
			}
			(
				(
					lv_date_12_0=RULE_STRING
					{
						newLeafNode(lv_date_12_0, grammarAccess.getDApplicableDocumentAccess().getDateSTRINGTerminalRuleCall_8_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDApplicableDocumentRule());
						}
						setWithLastConsumed(
							$current,
							"date",
							lv_date_12_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_13='url='
			{
				newLeafNode(otherlv_13, grammarAccess.getDApplicableDocumentAccess().getUrlKeyword_9_0());
			}
			(
				(
					lv_url_14_0=RULE_STRING
					{
						newLeafNode(lv_url_14_0, grammarAccess.getDApplicableDocumentAccess().getUrlSTRINGTerminalRuleCall_9_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDApplicableDocumentRule());
						}
						setWithLastConsumed(
							$current,
							"url",
							lv_url_14_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_15='/>'
		{
			newLeafNode(otherlv_15, grammarAccess.getDApplicableDocumentAccess().getSolidusGreaterThanSignKeyword_10());
		}
	)
;

// Entry rule entryRuleDReferenceDocument
entryRuleDReferenceDocument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDReferenceDocumentRule()); }
	iv_ruleDReferenceDocument=ruleDReferenceDocument
	{ $current=$iv_ruleDReferenceDocument.current; }
	EOF;

// Rule DReferenceDocument
ruleDReferenceDocument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<ReferenceDocument'
		{
			newLeafNode(otherlv_0, grammarAccess.getDReferenceDocumentAccess().getReferenceDocumentKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getDReferenceDocumentAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDReferenceDocumentAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDReferenceDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='title='
		{
			newLeafNode(otherlv_3, grammarAccess.getDReferenceDocumentAccess().getTitleKeyword_3());
		}
		(
			(
				lv_title_4_0=RULE_STRING
				{
					newLeafNode(lv_title_4_0, grammarAccess.getDReferenceDocumentAccess().getTitleSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDReferenceDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"title",
						lv_title_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='id='
		{
			newLeafNode(otherlv_5, grammarAccess.getDReferenceDocumentAccess().getIdKeyword_5());
		}
		(
			(
				lv_id_6_0=RULE_STRING
				{
					newLeafNode(lv_id_6_0, grammarAccess.getDReferenceDocumentAccess().getIdSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDReferenceDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_7='issue='
			{
				newLeafNode(otherlv_7, grammarAccess.getDReferenceDocumentAccess().getIssueKeyword_7_0());
			}
			(
				(
					lv_issue_8_0=RULE_UINT_STRING
					{
						newLeafNode(lv_issue_8_0, grammarAccess.getDReferenceDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDReferenceDocumentRule());
						}
						setWithLastConsumed(
							$current,
							"issue",
							lv_issue_8_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
					}
				)
			)
			(
				otherlv_9='revision='
				{
					newLeafNode(otherlv_9, grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_7_2_0());
				}
				(
					(
						lv_revision_10_0=RULE_UINT_STRING
						{
							newLeafNode(lv_revision_10_0, grammarAccess.getDReferenceDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDReferenceDocumentRule());
							}
							setWithLastConsumed(
								$current,
								"revision",
								lv_revision_10_0,
								"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
						}
					)
				)
			)?
		)?
		(
			otherlv_11='date='
			{
				newLeafNode(otherlv_11, grammarAccess.getDReferenceDocumentAccess().getDateKeyword_8_0());
			}
			(
				(
					lv_date_12_0=RULE_STRING
					{
						newLeafNode(lv_date_12_0, grammarAccess.getDReferenceDocumentAccess().getDateSTRINGTerminalRuleCall_8_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDReferenceDocumentRule());
						}
						setWithLastConsumed(
							$current,
							"date",
							lv_date_12_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_13='url='
			{
				newLeafNode(otherlv_13, grammarAccess.getDReferenceDocumentAccess().getUrlKeyword_9_0());
			}
			(
				(
					lv_url_14_0=RULE_STRING
					{
						newLeafNode(lv_url_14_0, grammarAccess.getDReferenceDocumentAccess().getUrlSTRINGTerminalRuleCall_9_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDReferenceDocumentRule());
						}
						setWithLastConsumed(
							$current,
							"url",
							lv_url_14_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_15='/>'
		{
			newLeafNode(otherlv_15, grammarAccess.getDReferenceDocumentAccess().getSolidusGreaterThanSignKeyword_10());
		}
	)
;

// Entry rule entryRuleVTestSetupInterfacesSection
entryRuleVTestSetupInterfacesSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupInterfacesSectionRule()); }
	iv_ruleVTestSetupInterfacesSection=ruleVTestSetupInterfacesSection
	{ $current=$iv_ruleVTestSetupInterfacesSection.current; }
	EOF;

// Rule VTestSetupInterfacesSection
ruleVTestSetupInterfacesSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVTestSetupInterfacesSectionAccess().getVTestSetupInterfacesSectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupInterfacesSectionAccess().getInterfacesVTestSetupInterfaceParserRuleCall_1_0());
				}
				lv_interfaces_1_0=ruleVTestSetupInterface
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupInterfacesSectionRule());
					}
					add(
						$current,
						"interfaces",
						lv_interfaces_1_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupInterface");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleVTestSetupInterface
entryRuleVTestSetupInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupInterfaceRule()); }
	iv_ruleVTestSetupInterface=ruleVTestSetupInterface
	{ $current=$iv_ruleVTestSetupInterface.current; }
	EOF;

// Rule VTestSetupInterface
ruleVTestSetupInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Interface'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTestSetupInterfaceAccess().getInterfaceKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupInterfaceAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVTestSetupInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupInterfaceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='tcHeader='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupInterfaceRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderTMTCIFTCHeaderCrossReference_4_0());
				}
			)
		)
		otherlv_5='tmHeader='
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderKeyword_5());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupInterfaceRule());
					}
				}
				otherlv_6=RULE_STRING
				{
					newLeafNode(otherlv_6, grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderTMTCIFTMHeaderCrossReference_6_0());
				}
			)
		)
		otherlv_7='>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVTestSetupInterfaceAccess().getGreaterThanSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupInterfaceAccess().getDescriptionDRunParserRuleCall_8_0());
				}
				lv_description_8_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupInterfaceRule());
					}
					set(
						$current,
						"description",
						lv_description_8_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='</Interface>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVTestSetupInterfaceAccess().getInterfaceKeyword_9());
		}
	)
;

// Entry rule entryRuleVTestSetupPacketConfigurationsSection
entryRuleVTestSetupPacketConfigurationsSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupPacketConfigurationsSectionRule()); }
	iv_ruleVTestSetupPacketConfigurationsSection=ruleVTestSetupPacketConfigurationsSection
	{ $current=$iv_ruleVTestSetupPacketConfigurationsSection.current; }
	EOF;

// Rule VTestSetupPacketConfigurationsSection
ruleVTestSetupPacketConfigurationsSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getVTestSetupPacketConfigurationsSectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getPacketConfigurationsVTestSetupPacketConfigurationParserRuleCall_1_0());
				}
				lv_packetConfigurations_1_0=ruleVTestSetupPacketConfiguration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupPacketConfigurationsSectionRule());
					}
					add(
						$current,
						"packetConfigurations",
						lv_packetConfigurations_1_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupPacketConfiguration");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleVTestSetupPacketConfiguration
entryRuleVTestSetupPacketConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupPacketConfigurationRule()); }
	iv_ruleVTestSetupPacketConfiguration=ruleVTestSetupPacketConfiguration
	{ $current=$iv_ruleVTestSetupPacketConfiguration.current; }
	EOF;

// Rule VTestSetupPacketConfiguration
ruleVTestSetupPacketConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<PacketConfiguration'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTestSetupPacketConfigurationAccess().getPacketConfigurationKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupPacketConfigurationAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVTestSetupPacketConfigurationAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupPacketConfigurationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupPacketConfigurationAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupPacketConfigurationAccess().getDescriptionDRunParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupPacketConfigurationRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</PacketConfiguration>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupPacketConfigurationAccess().getPacketConfigurationKeyword_5());
		}
	)
;

// Entry rule entryRuleVTestSetupActionsSection
entryRuleVTestSetupActionsSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupActionsSectionRule()); }
	iv_ruleVTestSetupActionsSection=ruleVTestSetupActionsSection
	{ $current=$iv_ruleVTestSetupActionsSection.current; }
	EOF;

// Rule VTestSetupActionsSection
ruleVTestSetupActionsSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVTestSetupActionsSectionAccess().getVTestSetupActionsSectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupActionsSectionAccess().getActionsVTestSetupActionParserRuleCall_1_0());
				}
				lv_actions_1_0=ruleVTestSetupAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupActionsSectionRule());
					}
					add(
						$current,
						"actions",
						lv_actions_1_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupAction");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleVTestSetupAction
entryRuleVTestSetupAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupActionRule()); }
	iv_ruleVTestSetupAction=ruleVTestSetupAction
	{ $current=$iv_ruleVTestSetupAction.current; }
	EOF;

// Rule VTestSetupAction
ruleVTestSetupAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Action'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTestSetupActionAccess().getActionKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupActionAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVTestSetupActionAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupActionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='type='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupActionAccess().getTypeKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupActionAccess().getTypeVTestSetupActionTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleVTestSetupActionType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupActionRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupActionType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupActionAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupActionAccess().getDescriptionDBodyParserRuleCall_6_0());
				}
				lv_description_6_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupActionRule());
					}
					set(
						$current,
						"description",
						lv_description_6_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='</Action>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVTestSetupActionAccess().getActionKeyword_7());
		}
	)
;

// Entry rule entryRuleVTestSetupActionsOverVariablesSection
entryRuleVTestSetupActionsOverVariablesSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupActionsOverVariablesSectionRule()); }
	iv_ruleVTestSetupActionsOverVariablesSection=ruleVTestSetupActionsOverVariablesSection
	{ $current=$iv_ruleVTestSetupActionsOverVariablesSection.current; }
	EOF;

// Rule VTestSetupActionsOverVariablesSection
ruleVTestSetupActionsOverVariablesSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVTestSetupActionsOverVariablesSectionAccess().getVTestSetupActionsOverVariablesSectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupActionsOverVariablesSectionAccess().getActionsOverVariableVTestSetupActionOverVariableParserRuleCall_1_0());
				}
				lv_actionsOverVariable_1_0=ruleVTestSetupActionOverVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupActionsOverVariablesSectionRule());
					}
					add(
						$current,
						"actionsOverVariable",
						lv_actionsOverVariable_1_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupActionOverVariable");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleVTestSetupActionOverVariable
entryRuleVTestSetupActionOverVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupActionOverVariableRule()); }
	iv_ruleVTestSetupActionOverVariable=ruleVTestSetupActionOverVariable
	{ $current=$iv_ruleVTestSetupActionOverVariable.current; }
	EOF;

// Rule VTestSetupActionOverVariable
ruleVTestSetupActionOverVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<ActionOverVariable'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTestSetupActionOverVariableAccess().getActionOverVariableKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupActionOverVariableAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVTestSetupActionOverVariableAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupActionOverVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='type='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupActionOverVariableAccess().getTypeKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupActionOverVariableAccess().getTypeVTestSetupActionOverVariableTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleVTestSetupActionOverVariableType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupActionOverVariableRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupActionOverVariableType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupActionOverVariableAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupActionOverVariableAccess().getDescriptionDBodyParserRuleCall_6_0());
				}
				lv_description_6_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupActionOverVariableRule());
					}
					set(
						$current,
						"description",
						lv_description_6_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='</ActionOverVariable>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVTestSetupActionOverVariableAccess().getActionOverVariableKeyword_7());
		}
	)
;

// Entry rule entryRuleVTestSetupScenariosSection
entryRuleVTestSetupScenariosSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupScenariosSectionRule()); }
	iv_ruleVTestSetupScenariosSection=ruleVTestSetupScenariosSection
	{ $current=$iv_ruleVTestSetupScenariosSection.current; }
	EOF;

// Rule VTestSetupScenariosSection
ruleVTestSetupScenariosSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVTestSetupScenariosSectionAccess().getVTestSetupScenariosSectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupScenariosSectionAccess().getScenariosVTestSetupScenarioSectionParserRuleCall_1_0());
				}
				lv_scenarios_1_0=ruleVTestSetupScenarioSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupScenariosSectionRule());
					}
					add(
						$current,
						"scenarios",
						lv_scenarios_1_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupScenarioSection");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleVTestSetupScenarioSection
entryRuleVTestSetupScenarioSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupScenarioSectionRule()); }
	iv_ruleVTestSetupScenarioSection=ruleVTestSetupScenarioSection
	{ $current=$iv_ruleVTestSetupScenarioSection.current; }
	EOF;

// Rule VTestSetupScenarioSection
ruleVTestSetupScenarioSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Scenario'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupScenarioSectionAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVTestSetupScenarioSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupScenarioSectionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='scenario='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupScenarioSectionRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioTMTCIFScenarioCrossReference_4_0());
				}
			)
		)
		otherlv_5='>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupScenarioSectionAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedInterfaceVTestSetupSupportedInterfaceParserRuleCall_6_0());
				}
				lv_supportedInterface_6_0=ruleVTestSetupSupportedInterface
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupScenarioSectionRule());
					}
					add(
						$current,
						"supportedInterface",
						lv_supportedInterface_6_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupSupportedInterface");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupScenarioSectionAccess().getSelectedConfigurationVTestSetupSelectedConfigurationParserRuleCall_7_0());
				}
				lv_selectedConfiguration_7_0=ruleVTestSetupSelectedConfiguration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupScenarioSectionRule());
					}
					add(
						$current,
						"selectedConfiguration",
						lv_selectedConfiguration_7_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupSelectedConfiguration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_8='<Action'
			{
				newLeafNode(otherlv_8, grammarAccess.getVTestSetupScenarioSectionAccess().getActionKeyword_8_0());
			}
			otherlv_9='ref='
			{
				newLeafNode(otherlv_9, grammarAccess.getVTestSetupScenarioSectionAccess().getRefKeyword_8_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVTestSetupScenarioSectionRule());
						}
					}
					otherlv_10=RULE_STRING
					{
						newLeafNode(otherlv_10, grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedActionVTestSetupActionCrossReference_8_2_0());
					}
				)
			)
			otherlv_11='/>'
			{
				newLeafNode(otherlv_11, grammarAccess.getVTestSetupScenarioSectionAccess().getSolidusGreaterThanSignKeyword_8_3());
			}
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedActionOverVariableVTestSetupSupportedActionOverVariableParserRuleCall_9_0());
				}
				lv_supportedActionOverVariable_12_0=ruleVTestSetupSupportedActionOverVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupScenarioSectionRule());
					}
					add(
						$current,
						"supportedActionOverVariable",
						lv_supportedActionOverVariable_12_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupSupportedActionOverVariable");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupScenarioSectionAccess().getBodyDBodyParserRuleCall_10_0());
				}
				lv_body_13_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupScenarioSectionRule());
					}
					set(
						$current,
						"body",
						lv_body_13_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14='</Scenario>'
		{
			newLeafNode(otherlv_14, grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioKeyword_11());
		}
	)
;

// Entry rule entryRuleVTestSetupSupportedInterface
entryRuleVTestSetupSupportedInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupSupportedInterfaceRule()); }
	iv_ruleVTestSetupSupportedInterface=ruleVTestSetupSupportedInterface
	{ $current=$iv_ruleVTestSetupSupportedInterface.current; }
	EOF;

// Rule VTestSetupSupportedInterface
ruleVTestSetupSupportedInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Interface'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupSupportedInterfaceAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVTestSetupSupportedInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupSupportedInterfaceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='ref='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupSupportedInterfaceAccess().getRefKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupSupportedInterfaceRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceVTestSetupInterfaceCrossReference_4_0());
				}
			)
		)
		otherlv_5='scenarioInterface='
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceKeyword_5());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupSupportedInterfaceRule());
					}
				}
				otherlv_6=RULE_STRING
				{
					newLeafNode(otherlv_6, grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceTMTCIFScenarioInterfaceCrossReference_6_0());
				}
			)
		)
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVTestSetupSupportedInterfaceAccess().getSolidusGreaterThanSignKeyword_7());
		}
	)
;

// Entry rule entryRuleVTestSetupSelectedConfiguration
entryRuleVTestSetupSelectedConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupSelectedConfigurationRule()); }
	iv_ruleVTestSetupSelectedConfiguration=ruleVTestSetupSelectedConfiguration
	{ $current=$iv_ruleVTestSetupSelectedConfiguration.current; }
	EOF;

// Rule VTestSetupSelectedConfiguration
ruleVTestSetupSelectedConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Configuration'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupSelectedConfigurationAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVTestSetupSelectedConfigurationAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupSelectedConfigurationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='ref='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupSelectedConfigurationAccess().getRefKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupSelectedConfigurationRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationVTestSetupPacketConfigurationCrossReference_4_0());
				}
			)
		)
		otherlv_5='scenarioPacketConfig='
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupSelectedConfigurationAccess().getScenarioPacketConfigKeyword_5());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupSelectedConfigurationRule());
					}
				}
				otherlv_6=RULE_STRING
				{
					newLeafNode(otherlv_6, grammarAccess.getVTestSetupSelectedConfigurationAccess().getScenarioPacketConfigTMTCIFScenarioPacketConfigCrossReference_6_0());
				}
			)
		)
		otherlv_7='defaultFilterStatus='
		{
			newLeafNode(otherlv_7, grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusVTestSetupConfigurationStatusEnumRuleCall_8_0());
				}
				lv_defaultFilterStatus_8_0=ruleVTestSetupConfigurationStatus
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupSelectedConfigurationRule());
					}
					set(
						$current,
						"defaultFilterStatus",
						lv_defaultFilterStatus_8_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupConfigurationStatus");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='defaultPrintStatus='
		{
			newLeafNode(otherlv_9, grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusVTestSetupConfigurationStatusEnumRuleCall_10_0());
				}
				lv_defaultPrintStatus_10_0=ruleVTestSetupConfigurationStatus
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupSelectedConfigurationRule());
					}
					set(
						$current,
						"defaultPrintStatus",
						lv_defaultPrintStatus_10_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.VTestSetupConfigurationStatus");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='/>'
		{
			newLeafNode(otherlv_11, grammarAccess.getVTestSetupSelectedConfigurationAccess().getSolidusGreaterThanSignKeyword_11());
		}
	)
;

// Entry rule entryRuleVTestSetupSupportedActionOverVariable
entryRuleVTestSetupSupportedActionOverVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupSupportedActionOverVariableRule()); }
	iv_ruleVTestSetupSupportedActionOverVariable=ruleVTestSetupSupportedActionOverVariable
	{ $current=$iv_ruleVTestSetupSupportedActionOverVariable.current; }
	EOF;

// Rule VTestSetupSupportedActionOverVariable
ruleVTestSetupSupportedActionOverVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<ActionOverVariable'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTestSetupSupportedActionOverVariableAccess().getActionOverVariableKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupSupportedActionOverVariableAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVTestSetupSupportedActionOverVariableAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupSupportedActionOverVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='ref='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupSupportedActionOverVariableAccess().getRefKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupSupportedActionOverVariableRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getVTestSetupSupportedActionOverVariableAccess().getActionOverVariableVTestSetupActionOverVariableCrossReference_4_0());
				}
			)
		)
		otherlv_5='scenarioVariable='
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupSupportedActionOverVariableAccess().getScenarioVariableKeyword_5());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupSupportedActionOverVariableRule());
					}
				}
				otherlv_6=RULE_STRING
				{
					newLeafNode(otherlv_6, grammarAccess.getVTestSetupSupportedActionOverVariableAccess().getScenarioVariableTMTCIFScenarioVariableCrossReference_6_0());
				}
			)
		)
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVTestSetupSupportedActionOverVariableAccess().getSolidusGreaterThanSignKeyword_7());
		}
	)
;

// Entry rule entryRuleDBody
entryRuleDBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDBodyRule()); }
	iv_ruleDBody=ruleDBody
	{ $current=$iv_ruleDBody.current; }
	EOF;

// Rule DBody
ruleDBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<body>'
		{
			newLeafNode(otherlv_0, grammarAccess.getDBodyAccess().getBodyKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDBodyAccess().getBodyContentDBodyContentParserRuleCall_1_0());
				}
				lv_bodyContent_1_0=ruleDBodyContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDBodyRule());
					}
					add(
						$current,
						"bodyContent",
						lv_bodyContent_1_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DBodyContent");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</body>'
		{
			newLeafNode(otherlv_2, grammarAccess.getDBodyAccess().getBodyKeyword_2());
		}
	)
;

// Entry rule entryRuleDBodyContent
entryRuleDBodyContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDBodyContentRule()); }
	iv_ruleDBodyContent=ruleDBodyContent
	{ $current=$iv_ruleDBodyContent.current; }
	EOF;

// Rule DBodyContent
ruleDBodyContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDBodyContentAccess().getDParagraphParserRuleCall_0());
		}
		this_DParagraph_0=ruleDParagraph
		{
			$current = $this_DParagraph_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDBodyContentAccess().getDItemizeParserRuleCall_1());
		}
		this_DItemize_1=ruleDItemize
		{
			$current = $this_DItemize_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDBodyContentAccess().getDEnumerateParserRuleCall_2());
		}
		this_DEnumerate_2=ruleDEnumerate
		{
			$current = $this_DEnumerate_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDBodyContentAccess().getDFigureFromFileParserRuleCall_3());
		}
		this_DFigureFromFile_3=ruleDFigureFromFile
		{
			$current = $this_DFigureFromFile_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDBodyContentAccess().getDTableFromFileParserRuleCall_4());
		}
		this_DTableFromFile_4=ruleDTableFromFile
		{
			$current = $this_DTableFromFile_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDBodyContentAccess().getDBasicTableParserRuleCall_5());
		}
		this_DBasicTable_5=ruleDBasicTable
		{
			$current = $this_DBasicTable_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDParagraph
entryRuleDParagraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDParagraphRule()); }
	iv_ruleDParagraph=ruleDParagraph
	{ $current=$iv_ruleDParagraph.current; }
	EOF;

// Rule DParagraph
ruleDParagraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<paragraph'
		{
			newLeafNode(otherlv_0, grammarAccess.getDParagraphAccess().getParagraphKeyword_0());
		}
		(
			otherlv_1='name='
			{
				newLeafNode(otherlv_1, grammarAccess.getDParagraphAccess().getNameKeyword_1_0());
			}
			(
				(
					lv_name_2_0=RULE_STRING
					{
						newLeafNode(lv_name_2_0, grammarAccess.getDParagraphAccess().getNameSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDParagraphRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_3='alignment='
			{
				newLeafNode(otherlv_3, grammarAccess.getDParagraphAccess().getAlignmentKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDParagraphAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0());
					}
					lv_alignment_4_0=ruleDAlignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDParagraphRule());
						}
						set(
							$current,
							"alignment",
							lv_alignment_4_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DAlignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='style='
			{
				newLeafNode(otherlv_5, grammarAccess.getDParagraphAccess().getStyleKeyword_3_0());
			}
			(
				(
					lv_style_6_0=RULE_STRING
					{
						newLeafNode(lv_style_6_0, grammarAccess.getDParagraphAccess().getStyleSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDParagraphRule());
						}
						setWithLastConsumed(
							$current,
							"style",
							lv_style_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_7='indent='
			{
				newLeafNode(otherlv_7, grammarAccess.getDParagraphAccess().getIndentKeyword_4_0());
			}
			(
				(
					lv_indent_8_0=RULE_REAL_STRING
					{
						newLeafNode(lv_indent_8_0, grammarAccess.getDParagraphAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDParagraphRule());
						}
						setWithLastConsumed(
							$current,
							"indent",
							lv_indent_8_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.REAL_STRING");
					}
				)
			)
		)?
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getDParagraphAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_6_0());
				}
				lv_paragraphContent_10_0=ruleDParagraphContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDParagraphRule());
					}
					add(
						$current,
						"paragraphContent",
						lv_paragraphContent_10_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DParagraphContent");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_11='</paragraph>'
		{
			newLeafNode(otherlv_11, grammarAccess.getDParagraphAccess().getParagraphKeyword_7());
		}
	)
;

// Entry rule entryRuleDListItem
entryRuleDListItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDListItemRule()); }
	iv_ruleDListItem=ruleDListItem
	{ $current=$iv_ruleDListItem.current; }
	EOF;

// Rule DListItem
ruleDListItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getDListItemAccess().getDListItemAction_0(),
					$current);
			}
		)
		otherlv_1='<listItem>'
		{
			newLeafNode(otherlv_1, grammarAccess.getDListItemAccess().getListItemKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_2_0());
				}
				lv_paragraph_2_0=ruleDParagraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDListItemRule());
					}
					set(
						$current,
						"paragraph",
						lv_paragraph_2_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DParagraph");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_3='<sublist>'
			{
				newLeafNode(otherlv_3, grammarAccess.getDListItemAccess().getSublistKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_3_1_0());
					}
					lv_sublist_4_0=ruleDListContent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDListItemRule());
						}
						set(
							$current,
							"sublist",
							lv_sublist_4_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DListContent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5='</sublist>'
			{
				newLeafNode(otherlv_5, grammarAccess.getDListItemAccess().getSublistKeyword_3_2());
			}
		)?
		otherlv_6='</listItem>'
		{
			newLeafNode(otherlv_6, grammarAccess.getDListItemAccess().getListItemKeyword_4());
		}
	)
;

// Entry rule entryRuleDListContent
entryRuleDListContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDListContentRule()); }
	iv_ruleDListContent=ruleDListContent
	{ $current=$iv_ruleDListContent.current; }
	EOF;

// Rule DListContent
ruleDListContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDListContentAccess().getDItemizeParserRuleCall_0());
		}
		this_DItemize_0=ruleDItemize
		{
			$current = $this_DItemize_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDListContentAccess().getDEnumerateParserRuleCall_1());
		}
		this_DEnumerate_1=ruleDEnumerate
		{
			$current = $this_DEnumerate_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDItemize
entryRuleDItemize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDItemizeRule()); }
	iv_ruleDItemize=ruleDItemize
	{ $current=$iv_ruleDItemize.current; }
	EOF;

// Rule DItemize
ruleDItemize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<itemize'
		{
			newLeafNode(otherlv_0, grammarAccess.getDItemizeAccess().getItemizeKeyword_0());
		}
		(
			otherlv_1='name='
			{
				newLeafNode(otherlv_1, grammarAccess.getDItemizeAccess().getNameKeyword_1_0());
			}
			(
				(
					lv_name_2_0=RULE_STRING
					{
						newLeafNode(lv_name_2_0, grammarAccess.getDItemizeAccess().getNameSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDItemizeRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_3='alignment='
			{
				newLeafNode(otherlv_3, grammarAccess.getDItemizeAccess().getAlignmentKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDItemizeAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0());
					}
					lv_alignment_4_0=ruleDAlignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDItemizeRule());
						}
						set(
							$current,
							"alignment",
							lv_alignment_4_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DAlignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='style='
			{
				newLeafNode(otherlv_5, grammarAccess.getDItemizeAccess().getStyleKeyword_3_0());
			}
			(
				(
					lv_style_6_0=RULE_STRING
					{
						newLeafNode(lv_style_6_0, grammarAccess.getDItemizeAccess().getStyleSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDItemizeRule());
						}
						setWithLastConsumed(
							$current,
							"style",
							lv_style_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_7='indent='
			{
				newLeafNode(otherlv_7, grammarAccess.getDItemizeAccess().getIndentKeyword_4_0());
			}
			(
				(
					lv_indent_8_0=RULE_REAL_STRING
					{
						newLeafNode(lv_indent_8_0, grammarAccess.getDItemizeAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDItemizeRule());
						}
						setWithLastConsumed(
							$current,
							"indent",
							lv_indent_8_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.REAL_STRING");
					}
				)
			)
		)?
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getDItemizeAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_6_0());
				}
				lv_items_10_0=ruleDListItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDItemizeRule());
					}
					add(
						$current,
						"items",
						lv_items_10_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DListItem");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_11='</itemize>'
		{
			newLeafNode(otherlv_11, grammarAccess.getDItemizeAccess().getItemizeKeyword_7());
		}
	)
;

// Entry rule entryRuleDEnumerate
entryRuleDEnumerate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDEnumerateRule()); }
	iv_ruleDEnumerate=ruleDEnumerate
	{ $current=$iv_ruleDEnumerate.current; }
	EOF;

// Rule DEnumerate
ruleDEnumerate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<enumerate'
		{
			newLeafNode(otherlv_0, grammarAccess.getDEnumerateAccess().getEnumerateKeyword_0());
		}
		(
			otherlv_1='name='
			{
				newLeafNode(otherlv_1, grammarAccess.getDEnumerateAccess().getNameKeyword_1_0());
			}
			(
				(
					lv_name_2_0=RULE_STRING
					{
						newLeafNode(lv_name_2_0, grammarAccess.getDEnumerateAccess().getNameSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDEnumerateRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_3='alignment='
			{
				newLeafNode(otherlv_3, grammarAccess.getDEnumerateAccess().getAlignmentKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDEnumerateAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0());
					}
					lv_alignment_4_0=ruleDAlignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDEnumerateRule());
						}
						set(
							$current,
							"alignment",
							lv_alignment_4_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DAlignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='style='
			{
				newLeafNode(otherlv_5, grammarAccess.getDEnumerateAccess().getStyleKeyword_3_0());
			}
			(
				(
					lv_style_6_0=RULE_STRING
					{
						newLeafNode(lv_style_6_0, grammarAccess.getDEnumerateAccess().getStyleSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDEnumerateRule());
						}
						setWithLastConsumed(
							$current,
							"style",
							lv_style_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_7='indent='
			{
				newLeafNode(otherlv_7, grammarAccess.getDEnumerateAccess().getIndentKeyword_4_0());
			}
			(
				(
					lv_indent_8_0=RULE_REAL_STRING
					{
						newLeafNode(lv_indent_8_0, grammarAccess.getDEnumerateAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDEnumerateRule());
						}
						setWithLastConsumed(
							$current,
							"indent",
							lv_indent_8_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.REAL_STRING");
					}
				)
			)
		)?
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getDEnumerateAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_6_0());
				}
				lv_items_10_0=ruleDListItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDEnumerateRule());
					}
					add(
						$current,
						"items",
						lv_items_10_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DListItem");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_11='</enumerate>'
		{
			newLeafNode(otherlv_11, grammarAccess.getDEnumerateAccess().getEnumerateKeyword_7());
		}
	)
;

// Entry rule entryRuleDParagraphContent
entryRuleDParagraphContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDParagraphContentRule()); }
	iv_ruleDParagraphContent=ruleDParagraphContent
	{ $current=$iv_ruleDParagraphContent.current; }
	EOF;

// Rule DParagraphContent
ruleDParagraphContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDParagraphContentAccess().getDRunParserRuleCall_0());
		}
		this_DRun_0=ruleDRun
		{
			$current = $this_DRun_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDParagraphContentAccess().getDHyperlinkParserRuleCall_1());
		}
		this_DHyperlink_1=ruleDHyperlink
		{
			$current = $this_DHyperlink_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDRun
entryRuleDRun returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDRunRule()); }
	iv_ruleDRun=ruleDRun
	{ $current=$iv_ruleDRun.current; }
	EOF;

// Rule DRun
ruleDRun returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<run'
		{
			newLeafNode(otherlv_0, grammarAccess.getDRunAccess().getRunKeyword_0());
		}
		(
			otherlv_1='bold='
			{
				newLeafNode(otherlv_1, grammarAccess.getDRunAccess().getBoldKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDRunAccess().getBoldDRunAttributesEnumRuleCall_1_1_0());
					}
					lv_bold_2_0=ruleDRunAttributes
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDRunRule());
						}
						set(
							$current,
							"bold",
							lv_bold_2_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DRunAttributes");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_3='italics='
			{
				newLeafNode(otherlv_3, grammarAccess.getDRunAccess().getItalicsKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDRunAccess().getItalicsDRunAttributesEnumRuleCall_2_1_0());
					}
					lv_italics_4_0=ruleDRunAttributes
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDRunRule());
						}
						set(
							$current,
							"italics",
							lv_italics_4_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DRunAttributes");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='underline='
			{
				newLeafNode(otherlv_5, grammarAccess.getDRunAccess().getUnderlineKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDRunAccess().getUnderlineDRunAttributesEnumRuleCall_3_1_0());
					}
					lv_underline_6_0=ruleDRunAttributes
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDRunRule());
						}
						set(
							$current,
							"underline",
							lv_underline_6_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DRunAttributes");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='color='
			{
				newLeafNode(otherlv_7, grammarAccess.getDRunAccess().getColorKeyword_4_0());
			}
			(
				(
					lv_color_8_0=RULE_STRING
					{
						newLeafNode(lv_color_8_0, grammarAccess.getDRunAccess().getColorSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDRunRule());
						}
						setWithLastConsumed(
							$current,
							"color",
							lv_color_8_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getDRunAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDRunAccess().getTabDTabParserRuleCall_6_0());
				}
				lv_tab_10_0=ruleDTab
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDRunRule());
					}
					set(
						$current,
						"tab",
						lv_tab_10_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DTab");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_7_0());
				}
				lv_text_11_0=ruleDText
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDRunRule());
					}
					set(
						$current,
						"text",
						lv_text_11_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DText");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='</run>'
		{
			newLeafNode(otherlv_12, grammarAccess.getDRunAccess().getRunKeyword_8());
		}
	)
;

// Entry rule entryRuleDHyperlink
entryRuleDHyperlink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDHyperlinkRule()); }
	iv_ruleDHyperlink=ruleDHyperlink
	{ $current=$iv_ruleDHyperlink.current; }
	EOF;

// Rule DHyperlink
ruleDHyperlink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<hyperlink'
		{
			newLeafNode(otherlv_0, grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_0());
		}
		otherlv_1='reference='
		{
			newLeafNode(otherlv_1, grammarAccess.getDHyperlinkAccess().getReferenceKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDHyperlinkRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectCrossReference_2_0());
				}
			)
		)
		(
			(
				otherlv_3='>'
				{
					newLeafNode(otherlv_3, grammarAccess.getDHyperlinkAccess().getGreaterThanSignKeyword_3_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_3_0_1_0());
						}
						lv_run_4_0=ruleDRun
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDHyperlinkRule());
							}
							set(
								$current,
								"run",
								lv_run_4_0,
								"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DRun");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_5='</hyperlink>'
				{
					newLeafNode(otherlv_5, grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_3_0_2());
				}
			)
			    |
			otherlv_6='/>'
			{
				newLeafNode(otherlv_6, grammarAccess.getDHyperlinkAccess().getSolidusGreaterThanSignKeyword_3_1());
			}
		)
	)
;

// Entry rule entryRuleDTab
entryRuleDTab returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDTabRule()); }
	iv_ruleDTab=ruleDTab
	{ $current=$iv_ruleDTab.current; }
	EOF;

// Rule DTab
ruleDTab returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getDTabAccess().getDTabAction_0(),
					$current);
			}
		)
		otherlv_1='<tab/>'
		{
			newLeafNode(otherlv_1, grammarAccess.getDTabAccess().getTabKeyword_1());
		}
	)
;

// Entry rule entryRuleDText
entryRuleDText returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDTextRule()); }
	iv_ruleDText=ruleDText
	{ $current=$iv_ruleDText.current; }
	EOF;

// Rule DText
ruleDText returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_content_0_0=RULE_RUNTEXT
			{
				newLeafNode(lv_content_0_0, grammarAccess.getDTextAccess().getContentRUNTEXTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDTextRule());
				}
				setWithLastConsumed(
					$current,
					"content",
					lv_content_0_0,
					"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.RUNTEXT");
			}
		)
	)
;

// Entry rule entryRuleDFigureFromFile
entryRuleDFigureFromFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDFigureFromFileRule()); }
	iv_ruleDFigureFromFile=ruleDFigureFromFile
	{ $current=$iv_ruleDFigureFromFile.current; }
	EOF;

// Rule DFigureFromFile
ruleDFigureFromFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<figureFromFile'
		{
			newLeafNode(otherlv_0, grammarAccess.getDFigureFromFileAccess().getFigureFromFileKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getDFigureFromFileAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDFigureFromFileAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDFigureFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='referenceFile='
		{
			newLeafNode(otherlv_3, grammarAccess.getDFigureFromFileAccess().getReferenceFileKeyword_3());
		}
		(
			(
				lv_referenceFile_4_0=RULE_STRING
				{
					newLeafNode(lv_referenceFile_4_0, grammarAccess.getDFigureFromFileAccess().getReferenceFileSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDFigureFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"referenceFile",
						lv_referenceFile_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='width='
		{
			newLeafNode(otherlv_5, grammarAccess.getDFigureFromFileAccess().getWidthKeyword_5());
		}
		(
			(
				lv_width_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_width_6_0, grammarAccess.getDFigureFromFileAccess().getWidthUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDFigureFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"width",
						lv_width_6_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
				}
			)
		)
		otherlv_7='height='
		{
			newLeafNode(otherlv_7, grammarAccess.getDFigureFromFileAccess().getHeightKeyword_7());
		}
		(
			(
				lv_height_8_0=RULE_UINT_STRING
				{
					newLeafNode(lv_height_8_0, grammarAccess.getDFigureFromFileAccess().getHeightUINT_STRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDFigureFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"height",
						lv_height_8_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
				}
			)
		)
		(
			otherlv_9='alignment='
			{
				newLeafNode(otherlv_9, grammarAccess.getDFigureFromFileAccess().getAlignmentKeyword_9_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDFigureFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0());
					}
					lv_alignment_10_0=ruleDAlignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDFigureFromFileRule());
						}
						set(
							$current,
							"alignment",
							lv_alignment_10_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DAlignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_11='style='
			{
				newLeafNode(otherlv_11, grammarAccess.getDFigureFromFileAccess().getStyleKeyword_10_0());
			}
			(
				(
					lv_style_12_0=RULE_STRING
					{
						newLeafNode(lv_style_12_0, grammarAccess.getDFigureFromFileAccess().getStyleSTRINGTerminalRuleCall_10_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDFigureFromFileRule());
						}
						setWithLastConsumed(
							$current,
							"style",
							lv_style_12_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_13='indent='
			{
				newLeafNode(otherlv_13, grammarAccess.getDFigureFromFileAccess().getIndentKeyword_11_0());
			}
			(
				(
					lv_indent_14_0=RULE_REAL_STRING
					{
						newLeafNode(lv_indent_14_0, grammarAccess.getDFigureFromFileAccess().getIndentREAL_STRINGTerminalRuleCall_11_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDFigureFromFileRule());
						}
						setWithLastConsumed(
							$current,
							"indent",
							lv_indent_14_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.REAL_STRING");
					}
				)
			)
		)?
		(
			otherlv_15='caption='
			{
				newLeafNode(otherlv_15, grammarAccess.getDFigureFromFileAccess().getCaptionKeyword_12_0());
			}
			(
				(
					lv_caption_16_0=RULE_STRING
					{
						newLeafNode(lv_caption_16_0, grammarAccess.getDFigureFromFileAccess().getCaptionSTRINGTerminalRuleCall_12_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDFigureFromFileRule());
						}
						setWithLastConsumed(
							$current,
							"caption",
							lv_caption_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_17='/>'
		{
			newLeafNode(otherlv_17, grammarAccess.getDFigureFromFileAccess().getSolidusGreaterThanSignKeyword_13());
		}
	)
;

// Entry rule entryRuleDTableFromFile
entryRuleDTableFromFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDTableFromFileRule()); }
	iv_ruleDTableFromFile=ruleDTableFromFile
	{ $current=$iv_ruleDTableFromFile.current; }
	EOF;

// Rule DTableFromFile
ruleDTableFromFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<tableFromFile'
		{
			newLeafNode(otherlv_0, grammarAccess.getDTableFromFileAccess().getTableFromFileKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getDTableFromFileAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDTableFromFileAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDTableFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='referenceFile='
		{
			newLeafNode(otherlv_3, grammarAccess.getDTableFromFileAccess().getReferenceFileKeyword_3());
		}
		(
			(
				lv_referenceFile_4_0=RULE_STRING
				{
					newLeafNode(lv_referenceFile_4_0, grammarAccess.getDTableFromFileAccess().getReferenceFileSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDTableFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"referenceFile",
						lv_referenceFile_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='width='
		{
			newLeafNode(otherlv_5, grammarAccess.getDTableFromFileAccess().getWidthKeyword_5());
		}
		(
			(
				lv_width_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_width_6_0, grammarAccess.getDTableFromFileAccess().getWidthUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDTableFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"width",
						lv_width_6_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
				}
			)
		)
		otherlv_7='height='
		{
			newLeafNode(otherlv_7, grammarAccess.getDTableFromFileAccess().getHeightKeyword_7());
		}
		(
			(
				lv_height_8_0=RULE_UINT_STRING
				{
					newLeafNode(lv_height_8_0, grammarAccess.getDTableFromFileAccess().getHeightUINT_STRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDTableFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"height",
						lv_height_8_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
				}
			)
		)
		(
			otherlv_9='alignment='
			{
				newLeafNode(otherlv_9, grammarAccess.getDTableFromFileAccess().getAlignmentKeyword_9_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDTableFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0());
					}
					lv_alignment_10_0=ruleDAlignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDTableFromFileRule());
						}
						set(
							$current,
							"alignment",
							lv_alignment_10_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DAlignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_11='style='
			{
				newLeafNode(otherlv_11, grammarAccess.getDTableFromFileAccess().getStyleKeyword_10_0());
			}
			(
				(
					lv_style_12_0=RULE_STRING
					{
						newLeafNode(lv_style_12_0, grammarAccess.getDTableFromFileAccess().getStyleSTRINGTerminalRuleCall_10_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDTableFromFileRule());
						}
						setWithLastConsumed(
							$current,
							"style",
							lv_style_12_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_13='indent='
			{
				newLeafNode(otherlv_13, grammarAccess.getDTableFromFileAccess().getIndentKeyword_11_0());
			}
			(
				(
					lv_indent_14_0=RULE_REAL_STRING
					{
						newLeafNode(lv_indent_14_0, grammarAccess.getDTableFromFileAccess().getIndentREAL_STRINGTerminalRuleCall_11_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDTableFromFileRule());
						}
						setWithLastConsumed(
							$current,
							"indent",
							lv_indent_14_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.REAL_STRING");
					}
				)
			)
		)?
		(
			otherlv_15='caption='
			{
				newLeafNode(otherlv_15, grammarAccess.getDTableFromFileAccess().getCaptionKeyword_12_0());
			}
			(
				(
					lv_caption_16_0=RULE_STRING
					{
						newLeafNode(lv_caption_16_0, grammarAccess.getDTableFromFileAccess().getCaptionSTRINGTerminalRuleCall_12_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDTableFromFileRule());
						}
						setWithLastConsumed(
							$current,
							"caption",
							lv_caption_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_17='/>'
		{
			newLeafNode(otherlv_17, grammarAccess.getDTableFromFileAccess().getSolidusGreaterThanSignKeyword_13());
		}
	)
;

// Entry rule entryRuleDBasicTable
entryRuleDBasicTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDBasicTableRule()); }
	iv_ruleDBasicTable=ruleDBasicTable
	{ $current=$iv_ruleDBasicTable.current; }
	EOF;

// Rule DBasicTable
ruleDBasicTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<basicTable'
		{
			newLeafNode(otherlv_0, grammarAccess.getDBasicTableAccess().getBasicTableKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getDBasicTableAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDBasicTableAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDBasicTableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_3='width='
			{
				newLeafNode(otherlv_3, grammarAccess.getDBasicTableAccess().getWidthKeyword_3_0());
			}
			(
				(
					lv_width_4_0=RULE_UINT_STRING
					{
						newLeafNode(lv_width_4_0, grammarAccess.getDBasicTableAccess().getWidthUINT_STRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBasicTableRule());
						}
						setWithLastConsumed(
							$current,
							"width",
							lv_width_4_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
					}
				)
			)
		)?
		(
			otherlv_5='alignment='
			{
				newLeafNode(otherlv_5, grammarAccess.getDBasicTableAccess().getAlignmentKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDBasicTableAccess().getAlignmentDAlignmentEnumRuleCall_4_1_0());
					}
					lv_alignment_6_0=ruleDAlignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDBasicTableRule());
						}
						set(
							$current,
							"alignment",
							lv_alignment_6_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DAlignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='style='
			{
				newLeafNode(otherlv_7, grammarAccess.getDBasicTableAccess().getStyleKeyword_5_0());
			}
			(
				(
					lv_style_8_0=RULE_STRING
					{
						newLeafNode(lv_style_8_0, grammarAccess.getDBasicTableAccess().getStyleSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBasicTableRule());
						}
						setWithLastConsumed(
							$current,
							"style",
							lv_style_8_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_9='indent='
			{
				newLeafNode(otherlv_9, grammarAccess.getDBasicTableAccess().getIndentKeyword_6_0());
			}
			(
				(
					lv_indent_10_0=RULE_REAL_STRING
					{
						newLeafNode(lv_indent_10_0, grammarAccess.getDBasicTableAccess().getIndentREAL_STRINGTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBasicTableRule());
						}
						setWithLastConsumed(
							$current,
							"indent",
							lv_indent_10_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.REAL_STRING");
					}
				)
			)
		)?
		(
			otherlv_11='caption='
			{
				newLeafNode(otherlv_11, grammarAccess.getDBasicTableAccess().getCaptionKeyword_7_0());
			}
			(
				(
					lv_caption_12_0=RULE_STRING
					{
						newLeafNode(lv_caption_12_0, grammarAccess.getDBasicTableAccess().getCaptionSTRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDBasicTableRule());
						}
						setWithLastConsumed(
							$current,
							"caption",
							lv_caption_12_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_13='>'
		{
			newLeafNode(otherlv_13, grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_9_0());
				}
				lv_rows_14_0=ruleDRow
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDBasicTableRule());
					}
					add(
						$current,
						"rows",
						lv_rows_14_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DRow");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_15='</basicTable>'
		{
			newLeafNode(otherlv_15, grammarAccess.getDBasicTableAccess().getBasicTableKeyword_10());
		}
	)
;

// Entry rule entryRuleDRow
entryRuleDRow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDRowRule()); }
	iv_ruleDRow=ruleDRow
	{ $current=$iv_ruleDRow.current; }
	EOF;

// Rule DRow
ruleDRow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<row>'
		{
			newLeafNode(otherlv_0, grammarAccess.getDRowAccess().getRowKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDRowAccess().getCellsDCellParserRuleCall_1_0());
				}
				lv_cells_1_0=ruleDCell
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDRowRule());
					}
					add(
						$current,
						"cells",
						lv_cells_1_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DCell");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</row>'
		{
			newLeafNode(otherlv_2, grammarAccess.getDRowAccess().getRowKeyword_2());
		}
	)
;

// Entry rule entryRuleDCell
entryRuleDCell returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDCellRule()); }
	iv_ruleDCell=ruleDCell
	{ $current=$iv_ruleDCell.current; }
	EOF;

// Rule DCell
ruleDCell returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<cell'
		{
			newLeafNode(otherlv_0, grammarAccess.getDCellAccess().getCellKeyword_0());
		}
		(
			otherlv_1='colSpan='
			{
				newLeafNode(otherlv_1, grammarAccess.getDCellAccess().getColSpanKeyword_1_0());
			}
			(
				(
					lv_colSpan_2_0=RULE_UINT_STRING
					{
						newLeafNode(lv_colSpan_2_0, grammarAccess.getDCellAccess().getColSpanUINT_STRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDCellRule());
						}
						setWithLastConsumed(
							$current,
							"colSpan",
							lv_colSpan_2_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
					}
				)
			)
		)?
		(
			otherlv_3='rowSpan='
			{
				newLeafNode(otherlv_3, grammarAccess.getDCellAccess().getRowSpanKeyword_2_0());
			}
			(
				(
					lv_rowSpan_4_0=RULE_UINT_STRING
					{
						newLeafNode(lv_rowSpan_4_0, grammarAccess.getDCellAccess().getRowSpanUINT_STRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDCellRule());
						}
						setWithLastConsumed(
							$current,
							"rowSpan",
							lv_rowSpan_4_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
					}
				)
			)
		)?
		(
			otherlv_5='width='
			{
				newLeafNode(otherlv_5, grammarAccess.getDCellAccess().getWidthKeyword_3_0());
			}
			(
				(
					lv_width_6_0=RULE_UINT_STRING
					{
						newLeafNode(lv_width_6_0, grammarAccess.getDCellAccess().getWidthUINT_STRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDCellRule());
						}
						setWithLastConsumed(
							$current,
							"width",
							lv_width_6_0,
							"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.UINT_STRING");
					}
				)
			)
		)?
		(
			otherlv_7='shadow='
			{
				newLeafNode(otherlv_7, grammarAccess.getDCellAccess().getShadowKeyword_4_0());
			}
			(
				(
					lv_shadow_8_0=RULE_STRING
					{
						newLeafNode(lv_shadow_8_0, grammarAccess.getDCellAccess().getShadowSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDCellRule());
						}
						setWithLastConsumed(
							$current,
							"shadow",
							lv_shadow_8_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getDCellAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_6_0());
				}
				lv_bodyContent_10_0=ruleDBodyContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDCellRule());
					}
					add(
						$current,
						"bodyContent",
						lv_bodyContent_10_0,
						"es.uah.aut.srg.micobs.svm.lang.testsetup.TESTSETUP.DBodyContent");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_11='</cell>'
		{
			newLeafNode(otherlv_11, grammarAccess.getDCellAccess().getCellKeyword_7());
		}
	)
;

// Rule VTestSetupActionType
ruleVTestSetupActionType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='"instruction"'
			{
				$current = grammarAccess.getVTestSetupActionTypeAccess().getInstructionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVTestSetupActionTypeAccess().getInstructionEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"tmtc_checking"'
			{
				$current = grammarAccess.getVTestSetupActionTypeAccess().getTmtc_checkingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVTestSetupActionTypeAccess().getTmtc_checkingEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='"checking"'
			{
				$current = grammarAccess.getVTestSetupActionTypeAccess().getCheckingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVTestSetupActionTypeAccess().getCheckingEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule VTestSetupActionOverVariableType
ruleVTestSetupActionOverVariableType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='"reset"'
		{
			$current = grammarAccess.getVTestSetupActionOverVariableTypeAccess().getResetEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getVTestSetupActionOverVariableTypeAccess().getResetEnumLiteralDeclaration());
		}
	)
;

// Rule VTestSetupConfigurationStatus
ruleVTestSetupConfigurationStatus returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='"off"'
			{
				$current = grammarAccess.getVTestSetupConfigurationStatusAccess().getOffEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVTestSetupConfigurationStatusAccess().getOffEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"on"'
			{
				$current = grammarAccess.getVTestSetupConfigurationStatusAccess().getOnEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVTestSetupConfigurationStatusAccess().getOnEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule DAlignment
ruleDAlignment returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='"left"'
			{
				$current = grammarAccess.getDAlignmentAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDAlignmentAccess().getLeftEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"center"'
			{
				$current = grammarAccess.getDAlignmentAccess().getCenterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDAlignmentAccess().getCenterEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='"right"'
			{
				$current = grammarAccess.getDAlignmentAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDAlignmentAccess().getRightEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='"justified"'
			{
				$current = grammarAccess.getDAlignmentAccess().getJustifiedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDAlignmentAccess().getJustifiedEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule DRunAttributes
ruleDRunAttributes returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='"true"'
			{
				$current = grammarAccess.getDRunAttributesAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDRunAttributesAccess().getTRUEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"false"'
			{
				$current = grammarAccess.getDRunAttributesAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDRunAttributesAccess().getFALSEEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_RUNTEXT : '<text>' ( options {greedy=false;} : . )*'</text>';

RULE_UINT_STRING : '"' ('0'..'9')+ '"';

RULE_REAL_STRING : '"' ('0'..'9')+ ('.' ('0'..'9')+)? '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
