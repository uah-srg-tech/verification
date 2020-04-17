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
grammar InternalSRS;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.srs.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.srs.parser.antlr.internal;

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
import es.uah.aut.srg.micobs.svm.lang.srs.services.SRSGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private SRSGrammarAccess grammarAccess;

    public InternalSRSParser(TokenStream input, SRSGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "VSRSDocument";
   	}

   	@Override
   	protected SRSGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleVSRSDocument
entryRuleVSRSDocument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSDocumentRule()); }
	iv_ruleVSRSDocument=ruleVSRSDocument
	{ $current=$iv_ruleVSRSDocument.current; }
	EOF;

// Rule VSRSDocument
ruleVSRSDocument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<SRS'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSRSDocumentAccess().getSRSKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSDocumentAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSRSDocumentAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSRSDocumentRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSRSDocumentAccess().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVSRSDocumentAccess().getIdSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSRSDocumentRule());
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
			newLeafNode(otherlv_5, grammarAccess.getVSRSDocumentAccess().getIssueKeyword_5());
		}
		(
			(
				lv_issue_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_issue_6_0, grammarAccess.getVSRSDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSRSDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"issue",
						lv_issue_6_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
				}
			)
		)
		otherlv_7='revision='
		{
			newLeafNode(otherlv_7, grammarAccess.getVSRSDocumentAccess().getRevisionKeyword_7());
		}
		(
			(
				lv_revision_8_0=RULE_UINT_STRING
				{
					newLeafNode(lv_revision_8_0, grammarAccess.getVSRSDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSRSDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"revision",
						lv_revision_8_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
				}
			)
		)
		otherlv_9='date='
		{
			newLeafNode(otherlv_9, grammarAccess.getVSRSDocumentAccess().getDateKeyword_9());
		}
		(
			(
				lv_date_10_0=RULE_STRING
				{
					newLeafNode(lv_date_10_0, grammarAccess.getVSRSDocumentAccess().getDateSTRINGTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSRSDocumentRule());
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
			newLeafNode(otherlv_11, grammarAccess.getVSRSDocumentAccess().getGreaterThanSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDocumentAccess().getParentsVTraceableParentDocumentParserRuleCall_12_0());
				}
				lv_parents_12_0=ruleVTraceableParentDocument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDocumentRule());
					}
					add(
						$current,
						"parents",
						lv_parents_12_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VTraceableParentDocument");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDocumentAccess().getTbcsTbdsSectionVSRSTBCsTBDsParserRuleCall_13_0());
				}
				lv_tbcsTbdsSection_13_0=ruleVSRSTBCsTBDs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDocumentRule());
					}
					set(
						$current,
						"tbcsTbdsSection",
						lv_tbcsTbdsSection_13_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSTBCsTBDs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDocumentAccess().getIntroductionSectionVSRSIntroductionParserRuleCall_14_0());
				}
				lv_introductionSection_14_0=ruleVSRSIntroduction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDocumentRule());
					}
					set(
						$current,
						"introductionSection",
						lv_introductionSection_14_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSIntroduction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDocumentAccess().getApplicableDocumentsSectionVSRSApplicableDocumentsParserRuleCall_15_0());
				}
				lv_applicableDocumentsSection_15_0=ruleVSRSApplicableDocuments
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDocumentRule());
					}
					set(
						$current,
						"applicableDocumentsSection",
						lv_applicableDocumentsSection_15_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSApplicableDocuments");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDocumentAccess().getReferenceDocumentsSectionVSRSReferenceDocumentsParserRuleCall_16_0());
				}
				lv_referenceDocumentsSection_16_0=ruleVSRSReferenceDocuments
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDocumentRule());
					}
					set(
						$current,
						"referenceDocumentsSection",
						lv_referenceDocumentsSection_16_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSReferenceDocuments");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSRSTermsDefinitionsAbbreviationsParserRuleCall_17_0());
				}
				lv_termsDefinitionsAbbreviationsSection_17_0=ruleVSRSTermsDefinitionsAbbreviations
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDocumentRule());
					}
					set(
						$current,
						"termsDefinitionsAbbreviationsSection",
						lv_termsDefinitionsAbbreviationsSection_17_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSTermsDefinitionsAbbreviations");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDocumentAccess().getSoftwareOverviewSectionVSRSSoftwareOverviewParserRuleCall_18_0());
				}
				lv_softwareOverviewSection_18_0=ruleVSRSSoftwareOverview
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDocumentRule());
					}
					set(
						$current,
						"softwareOverviewSection",
						lv_softwareOverviewSection_18_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSoftwareOverview");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDocumentAccess().getRequirementsSectionVSRSRequirementsParserRuleCall_19_0());
				}
				lv_requirementsSection_19_0=ruleVSRSRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDocumentRule());
					}
					set(
						$current,
						"requirementsSection",
						lv_requirementsSection_19_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDocumentAccess().getLogicalModelsSectionVSRSLogicalModelsParserRuleCall_20_0());
				}
				lv_logicalModelsSection_20_0=ruleVSRSLogicalModels
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDocumentRule());
					}
					set(
						$current,
						"logicalModelsSection",
						lv_logicalModelsSection_20_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSLogicalModels");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21='</SRS>'
		{
			newLeafNode(otherlv_21, grammarAccess.getVSRSDocumentAccess().getSRSKeyword_21());
		}
	)
;

// Entry rule entryRuleVSRSTBCsTBDs
entryRuleVSRSTBCsTBDs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSTBCsTBDsRule()); }
	iv_ruleVSRSTBCsTBDs=ruleVSRSTBCsTBDs
	{ $current=$iv_ruleVSRSTBCsTBDs.current; }
	EOF;

// Rule VSRSTBCsTBDs
ruleVSRSTBCsTBDs returns [EObject current=null]
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
					grammarAccess.getVSRSTBCsTBDsAccess().getVSRSTBCsTBDsAction_0(),
					$current);
			}
		)
		otherlv_1='<TBCsTBDs>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSTBCsTBDsAccess().getTBCsTBDsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSTBCsTBDsAccess().getTbcsDTBCParserRuleCall_2_0());
				}
				lv_tbcs_2_0=ruleDTBC
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSTBCsTBDsRule());
					}
					add(
						$current,
						"tbcs",
						lv_tbcs_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DTBC");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSTBCsTBDsAccess().getTbdsDTBDParserRuleCall_3_0());
				}
				lv_tbds_3_0=ruleDTBD
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSTBCsTBDsRule());
					}
					add(
						$current,
						"tbds",
						lv_tbds_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DTBD");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='</TBCsTBDs>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSRSTBCsTBDsAccess().getTBCsTBDsKeyword_4());
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
		(
			(
				otherlv_3='description='
				{
					newLeafNode(otherlv_3, grammarAccess.getDTBCAccess().getDescriptionKeyword_3_0_0());
				}
				(
					(
						lv_description_4_0=RULE_STRING
						{
							newLeafNode(lv_description_4_0, grammarAccess.getDTBCAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0());
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
			)
			    |
			(
				otherlv_5='parentTBC='
				{
					newLeafNode(otherlv_5, grammarAccess.getDTBCAccess().getParentTBCKeyword_3_1_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDTBCRule());
							}
						}
						otherlv_6=RULE_STRING
						{
							newLeafNode(otherlv_6, grammarAccess.getDTBCAccess().getParentTBCDTBCCrossReference_3_1_1_0());
						}
					)
				)
			)
		)
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getDTBCAccess().getSolidusGreaterThanSignKeyword_4());
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
		(
			(
				otherlv_3='description='
				{
					newLeafNode(otherlv_3, grammarAccess.getDTBDAccess().getDescriptionKeyword_3_0_0());
				}
				(
					(
						lv_description_4_0=RULE_STRING
						{
							newLeafNode(lv_description_4_0, grammarAccess.getDTBDAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0());
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
			)
			    |
			(
				otherlv_5='parentTBD='
				{
					newLeafNode(otherlv_5, grammarAccess.getDTBDAccess().getParentTBDKeyword_3_1_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDTBDRule());
							}
						}
						otherlv_6=RULE_STRING
						{
							newLeafNode(otherlv_6, grammarAccess.getDTBDAccess().getParentTBDDTBDCrossReference_3_1_1_0());
						}
					)
				)
			)
		)
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getDTBDAccess().getSolidusGreaterThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleVTraceableParentDocument
entryRuleVTraceableParentDocument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTraceableParentDocumentRule()); }
	iv_ruleVTraceableParentDocument=ruleVTraceableParentDocument
	{ $current=$iv_ruleVTraceableParentDocument.current; }
	EOF;

// Rule VTraceableParentDocument
ruleVTraceableParentDocument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<parent'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTraceableParentDocumentAccess().getParentKeyword_0());
		}
		otherlv_1='document='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTraceableParentDocumentAccess().getDocumentKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTraceableParentDocumentRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getVTraceableParentDocumentAccess().getDocumentVTraceableDocumentCrossReference_2_0());
				}
			)
		)
		(
			(
				otherlv_3='>'
				{
					newLeafNode(otherlv_3, grammarAccess.getVTraceableParentDocumentAccess().getGreaterThanSignKeyword_3_0_0());
				}
				(
					otherlv_4='<notApplicableItem'
					{
						newLeafNode(otherlv_4, grammarAccess.getVTraceableParentDocumentAccess().getNotApplicableItemKeyword_3_0_1_0());
					}
					otherlv_5='item='
					{
						newLeafNode(otherlv_5, grammarAccess.getVTraceableParentDocumentAccess().getItemKeyword_3_0_1_1());
					}
					(
						(
							{
								/* */
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getVTraceableParentDocumentRule());
								}
							}
							otherlv_6=RULE_STRING
							{
								newLeafNode(otherlv_6, grammarAccess.getVTraceableParentDocumentAccess().getNotApplicableItemVTraceableDocumentAbstractItemCrossReference_3_0_1_2_0());
							}
						)
					)
					otherlv_7='/>'
					{
						newLeafNode(otherlv_7, grammarAccess.getVTraceableParentDocumentAccess().getSolidusGreaterThanSignKeyword_3_0_1_3());
					}
				)+
				otherlv_8='</parent>'
				{
					newLeafNode(otherlv_8, grammarAccess.getVTraceableParentDocumentAccess().getParentKeyword_3_0_2());
				}
			)
			    |
			otherlv_9='/>'
			{
				newLeafNode(otherlv_9, grammarAccess.getVTraceableParentDocumentAccess().getSolidusGreaterThanSignKeyword_3_1());
			}
		)
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBodyContent");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DParagraphContent");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DParagraph");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DListContent");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DListItem");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DListItem");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRunAttributes");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRunAttributes");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRunAttributes");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DTab");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DText");
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
								"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRun");
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
					"es.uah.aut.srg.micobs.svm.lang.srs.SRS.RUNTEXT");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.REAL_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRow");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DCell");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBodyContent");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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
								"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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
								"es.uah.aut.srg.micobs.svm.lang.srs.SRS.UINT_STRING");
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

// Entry rule entryRuleVSRSFixedSection
entryRuleVSRSFixedSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSFixedSectionRule()); }
	iv_ruleVSRSFixedSection=ruleVSRSFixedSection
	{ $current=$iv_ruleVSRSFixedSection.current; }
	EOF;

// Rule VSRSFixedSection
ruleVSRSFixedSection returns [EObject current=null]
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
					grammarAccess.getVSRSFixedSectionAccess().getVSRSFixedSectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSFixedSectionAccess().getBodyDBodyParserRuleCall_1_0());
				}
				lv_body_1_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSFixedSectionRule());
					}
					set(
						$current,
						"body",
						lv_body_1_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSFixedSectionAccess().getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_2_0());
				}
				lv_srsInstatiableSubsections_2_0=ruleVSRSInstantiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSFixedSectionRule());
					}
					add(
						$current,
						"srsInstatiableSubsections",
						lv_srsInstatiableSubsections_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleVSRSInstantiableSection
entryRuleVSRSInstantiableSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSInstantiableSectionRule()); }
	iv_ruleVSRSInstantiableSection=ruleVSRSInstantiableSection
	{ $current=$iv_ruleVSRSInstantiableSection.current; }
	EOF;

// Rule VSRSInstantiableSection
ruleVSRSInstantiableSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<subsection'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSRSInstantiableSectionAccess().getSubsectionKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSInstantiableSectionAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSRSInstantiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSRSInstantiableSectionRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSRSInstantiableSectionAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSInstantiableSectionAccess().getBodyDBodyParserRuleCall_4_0());
				}
				lv_body_4_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSInstantiableSectionRule());
					}
					set(
						$current,
						"body",
						lv_body_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSInstantiableSectionAccess().getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_5_0());
				}
				lv_srsInstatiableSubsections_5_0=ruleVSRSInstantiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSInstantiableSectionRule());
					}
					add(
						$current,
						"srsInstatiableSubsections",
						lv_srsInstatiableSubsections_5_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='</subsection>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSRSInstantiableSectionAccess().getSubsectionKeyword_6());
		}
	)
;

// Entry rule entryRuleVSRSIntroduction
entryRuleVSRSIntroduction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSIntroductionRule()); }
	iv_ruleVSRSIntroduction=ruleVSRSIntroduction
	{ $current=$iv_ruleVSRSIntroduction.current; }
	EOF;

// Rule VSRSIntroduction
ruleVSRSIntroduction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Introduction>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSRSIntroductionAccess().getIntroductionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSIntroductionAccess().getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0());
				}
				lv_srsInstatiableSubsections_1_0=ruleVSRSInstantiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSIntroductionRule());
					}
					add(
						$current,
						"srsInstatiableSubsections",
						lv_srsInstatiableSubsections_1_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</Introduction>'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSRSIntroductionAccess().getIntroductionKeyword_2());
		}
	)
;

// Entry rule entryRuleVSRSApplicableDocuments
entryRuleVSRSApplicableDocuments returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSApplicableDocumentsRule()); }
	iv_ruleVSRSApplicableDocuments=ruleVSRSApplicableDocuments
	{ $current=$iv_ruleVSRSApplicableDocuments.current; }
	EOF;

// Rule VSRSApplicableDocuments
ruleVSRSApplicableDocuments returns [EObject current=null]
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
					grammarAccess.getVSRSApplicableDocumentsAccess().getVSRSApplicableDocumentsAction_0(),
					$current);
			}
		)
		otherlv_1='<ApplicableDocuments>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0());
				}
				lv_applicableDocuments_2_0=ruleDApplicableDocument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSApplicableDocumentsRule());
					}
					add(
						$current,
						"applicableDocuments",
						lv_applicableDocuments_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DApplicableDocument");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ApplicableDocuments>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSRSReferenceDocuments
entryRuleVSRSReferenceDocuments returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSReferenceDocumentsRule()); }
	iv_ruleVSRSReferenceDocuments=ruleVSRSReferenceDocuments
	{ $current=$iv_ruleVSRSReferenceDocuments.current; }
	EOF;

// Rule VSRSReferenceDocuments
ruleVSRSReferenceDocuments returns [EObject current=null]
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
					grammarAccess.getVSRSReferenceDocumentsAccess().getVSRSReferenceDocumentsAction_0(),
					$current);
			}
		)
		otherlv_1='<ReferenceDocuments>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0());
				}
				lv_referenceDocuments_2_0=ruleDReferenceDocument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSReferenceDocumentsRule());
					}
					add(
						$current,
						"referenceDocuments",
						lv_referenceDocuments_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DReferenceDocument");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ReferenceDocuments>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSRSTermsDefinitionsAbbreviations
entryRuleVSRSTermsDefinitionsAbbreviations returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSTermsDefinitionsAbbreviationsRule()); }
	iv_ruleVSRSTermsDefinitionsAbbreviations=ruleVSRSTermsDefinitionsAbbreviations
	{ $current=$iv_ruleVSRSTermsDefinitionsAbbreviations.current; }
	EOF;

// Rule VSRSTermsDefinitionsAbbreviations
ruleVSRSTermsDefinitionsAbbreviations returns [EObject current=null]
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
					grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getVSRSTermsDefinitionsAbbreviationsAction_0(),
					$current);
			}
		)
		otherlv_1='<TermsDefinitionsAbbreviations>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsVSRSTermParserRuleCall_2_0());
				}
				lv_terms_2_0=ruleVSRSTerm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSTermsDefinitionsAbbreviationsRule());
					}
					add(
						$current,
						"terms",
						lv_terms_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSTerm");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSRSDefinitionParserRuleCall_3_0());
				}
				lv_definitions_3_0=ruleVSRSDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSTermsDefinitionsAbbreviationsRule());
					}
					add(
						$current,
						"definitions",
						lv_definitions_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSRSAbbreviationParserRuleCall_4_0());
				}
				lv_abbreviations_4_0=ruleVSRSAbbreviation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSTermsDefinitionsAbbreviationsRule());
					}
					add(
						$current,
						"abbreviations",
						lv_abbreviations_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSAbbreviation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</TermsDefinitionsAbbreviations>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSSoftwareOverview
entryRuleVSRSSoftwareOverview returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSSoftwareOverviewRule()); }
	iv_ruleVSRSSoftwareOverview=ruleVSRSSoftwareOverview
	{ $current=$iv_ruleVSRSSoftwareOverview.current; }
	EOF;

// Rule VSRSSoftwareOverview
ruleVSRSSoftwareOverview returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<SoftwareOverview>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSRSSoftwareOverviewAccess().getSoftwareOverviewKeyword_0());
		}
		otherlv_1='<FunctionPurpose>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeVSRSFixedSectionParserRuleCall_2_0());
				}
				lv_functionPurpose_2_0=ruleVSRSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSoftwareOverviewRule());
					}
					set(
						$current,
						"functionPurpose",
						lv_functionPurpose_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='</FunctionPurpose>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeKeyword_3());
		}
		otherlv_4='<EnvironmentalConsiderations>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsVSRSFixedSectionParserRuleCall_5_0());
				}
				lv_environmentalConsiderations_5_0=ruleVSRSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSoftwareOverviewRule());
					}
					set(
						$current,
						"environmentalConsiderations",
						lv_environmentalConsiderations_5_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='</EnvironmentalConsiderations>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsKeyword_6());
		}
		otherlv_7='<RelationOtherSystems>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsVSRSFixedSectionParserRuleCall_8_0());
				}
				lv_relationOtherSystems_8_0=ruleVSRSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSoftwareOverviewRule());
					}
					set(
						$current,
						"relationOtherSystems",
						lv_relationOtherSystems_8_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='</RelationOtherSystems>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsKeyword_9());
		}
		otherlv_10='<Constraints>'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsVSRSFixedSectionParserRuleCall_11_0());
				}
				lv_constraints_11_0=ruleVSRSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSoftwareOverviewRule());
					}
					set(
						$current,
						"constraints",
						lv_constraints_11_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='</Constraints>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsKeyword_12());
		}
		otherlv_13='</SoftwareOverview>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSRSSoftwareOverviewAccess().getSoftwareOverviewKeyword_13());
		}
	)
;

// Entry rule entryRuleVSRSRequirements
entryRuleVSRSRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSRequirementsRule()); }
	iv_ruleVSRSRequirements=ruleVSRSRequirements
	{ $current=$iv_ruleVSRSRequirements.current; }
	EOF;

// Rule VSRSRequirements
ruleVSRSRequirements returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Requirements>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSRSRequirementsAccess().getRequirementsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_1_0());
				}
				lv_sectionDescription_1_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_1_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getGeneralVSRSGeneralRequirementsParserRuleCall_2_0());
				}
				lv_general_2_0=ruleVSRSGeneralRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"general",
						lv_general_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSGeneralRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getFunctionalVSRSFunctionalRequirementsParserRuleCall_3_0());
				}
				lv_functional_3_0=ruleVSRSFunctionalRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"functional",
						lv_functional_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSFunctionalRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getPerformanceVSRSPerformanceRequirementsParserRuleCall_4_0());
				}
				lv_performance_4_0=ruleVSRSPerformanceRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"performance",
						lv_performance_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSPerformanceRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getInterfaceVSRSInterfaceRequirementsParserRuleCall_5_0());
				}
				lv_interface_5_0=ruleVSRSInterfaceRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"interface",
						lv_interface_5_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInterfaceRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getOperationalVSRSOperationalRequirementsParserRuleCall_6_0());
				}
				lv_operational_6_0=ruleVSRSOperationalRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"operational",
						lv_operational_6_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSOperationalRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getResourcesVSRSResourcesRequirementsParserRuleCall_7_0());
				}
				lv_resources_7_0=ruleVSRSResourcesRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"resources",
						lv_resources_7_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSResourcesRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getDesignVSRSDesignRequirementsParserRuleCall_8_0());
				}
				lv_design_8_0=ruleVSRSDesignRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"design",
						lv_design_8_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDesignRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getSecurityPrivacyVSRSSecurityPrivacyRequirementsParserRuleCall_9_0());
				}
				lv_securityPrivacy_9_0=ruleVSRSSecurityPrivacyRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"securityPrivacy",
						lv_securityPrivacy_9_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSecurityPrivacyRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getPortabilityVSRSPortabilityRequirementsParserRuleCall_10_0());
				}
				lv_portability_10_0=ruleVSRSPortabilityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"portability",
						lv_portability_10_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSPortabilityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getSwQualityVSRSSWQualityRequirementsParserRuleCall_11_0());
				}
				lv_swQuality_11_0=ruleVSRSSWQualityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"swQuality",
						lv_swQuality_11_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWQualityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getSwReliabilityVSRSSWReliabilityRequirementsParserRuleCall_12_0());
				}
				lv_swReliability_12_0=ruleVSRSSWReliabilityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"swReliability",
						lv_swReliability_12_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWReliabilityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getSwMaintainabilityVSRSSWMaintainabilityRequirementsParserRuleCall_13_0());
				}
				lv_swMaintainability_13_0=ruleVSRSSWMaintainabilityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"swMaintainability",
						lv_swMaintainability_13_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWMaintainabilityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getSwSafetyVSRSSWSafetyRequirementsParserRuleCall_14_0());
				}
				lv_swSafety_14_0=ruleVSRSSWSafetyRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"swSafety",
						lv_swSafety_14_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWSafetyRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getSwConfigurationDeliveryVSRSSWConfigurationDeliveryRequirementsParserRuleCall_15_0());
				}
				lv_swConfigurationDelivery_15_0=ruleVSRSSWConfigurationDeliveryRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"swConfigurationDelivery",
						lv_swConfigurationDelivery_15_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWConfigurationDeliveryRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getDataDefinitionDBVSRSDataDefinitionDBRequirementsParserRuleCall_16_0());
				}
				lv_dataDefinitionDB_16_0=ruleVSRSDataDefinitionDBRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"dataDefinitionDB",
						lv_dataDefinitionDB_16_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDataDefinitionDBRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getHumanFactorsVSRSHumanFactorsRequirementsParserRuleCall_17_0());
				}
				lv_humanFactors_17_0=ruleVSRSHumanFactorsRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"humanFactors",
						lv_humanFactors_17_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSHumanFactorsRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSRequirementsAccess().getAdaptationInstallationVSRSAdaptationInstallationRequirementsParserRuleCall_18_0());
				}
				lv_adaptationInstallation_18_0=ruleVSRSAdaptationInstallationRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSRequirementsRule());
					}
					set(
						$current,
						"adaptationInstallation",
						lv_adaptationInstallation_18_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSAdaptationInstallationRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_19='</Requirements>'
		{
			newLeafNode(otherlv_19, grammarAccess.getVSRSRequirementsAccess().getRequirementsKeyword_19());
		}
	)
;

// Entry rule entryRuleVSRSLogicalModels
entryRuleVSRSLogicalModels returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSLogicalModelsRule()); }
	iv_ruleVSRSLogicalModels=ruleVSRSLogicalModels
	{ $current=$iv_ruleVSRSLogicalModels.current; }
	EOF;

// Rule VSRSLogicalModels
ruleVSRSLogicalModels returns [EObject current=null]
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
					grammarAccess.getVSRSLogicalModelsAccess().getVSRSLogicalModelsAction_0(),
					$current);
			}
		)
		otherlv_1='<LogicalModels>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsVSRSLogicalModelParserRuleCall_2_0());
				}
				lv_logicalModels_2_0=ruleVSRSLogicalModel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSLogicalModelsRule());
					}
					add(
						$current,
						"logicalModels",
						lv_logicalModels_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSLogicalModel");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</LogicalModels>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSRSTerm
entryRuleVSRSTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSTermRule()); }
	iv_ruleVSRSTerm=ruleVSRSTerm
	{ $current=$iv_ruleVSRSTerm.current; }
	EOF;

// Rule VSRSTerm
ruleVSRSTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Term'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSRSTermAccess().getTermKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSTermAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSRSTermAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSRSTermRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSRSTermAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSTermAccess().getDescriptionDRunParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSTermRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Term>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSTermAccess().getTermKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSDefinition
entryRuleVSRSDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSDefinitionRule()); }
	iv_ruleVSRSDefinition=ruleVSRSDefinition
	{ $current=$iv_ruleVSRSDefinition.current; }
	EOF;

// Rule VSRSDefinition
ruleVSRSDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Definition'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSRSDefinitionAccess().getDefinitionKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSDefinitionAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSRSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSRSDefinitionRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSRSDefinitionAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDefinitionRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Definition>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSDefinitionAccess().getDefinitionKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSAbbreviation
entryRuleVSRSAbbreviation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSAbbreviationRule()); }
	iv_ruleVSRSAbbreviation=ruleVSRSAbbreviation
	{ $current=$iv_ruleVSRSAbbreviation.current; }
	EOF;

// Rule VSRSAbbreviation
ruleVSRSAbbreviation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Abbreviation'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSRSAbbreviationAccess().getAbbreviationKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSAbbreviationAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSRSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSRSAbbreviationRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSRSAbbreviationAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSAbbreviationRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Abbreviation>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSAbbreviationAccess().getAbbreviationKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSInstantiableRequirementSection
entryRuleVSRSInstantiableRequirementSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSInstantiableRequirementSectionRule()); }
	iv_ruleVSRSInstantiableRequirementSection=ruleVSRSInstantiableRequirementSection
	{ $current=$iv_ruleVSRSInstantiableRequirementSection.current; }
	EOF;

// Rule VSRSInstantiableRequirementSection
ruleVSRSInstantiableRequirementSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<subsection'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSubsectionKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSInstantiableRequirementSectionAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSRSInstantiableRequirementSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSRSInstantiableRequirementSectionRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSRSInstantiableRequirementSectionAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSectionDescriptionDBodyParserRuleCall_4_0());
				}
				lv_sectionDescription_4_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSInstantiableRequirementSectionRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSrsItemsVSRSDocumentItemParserRuleCall_5_0());
				}
				lv_srsItems_5_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSInstantiableRequirementSectionRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_5_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='</subsection>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSubsectionKeyword_6());
		}
	)
;

// Entry rule entryRuleVSRSGeneralRequirements
entryRuleVSRSGeneralRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSGeneralRequirementsRule()); }
	iv_ruleVSRSGeneralRequirements=ruleVSRSGeneralRequirements
	{ $current=$iv_ruleVSRSGeneralRequirements.current; }
	EOF;

// Rule VSRSGeneralRequirements
ruleVSRSGeneralRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSGeneralRequirementsAccess().getVSRSGeneralRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<GeneralRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSGeneralRequirementsAccess().getGeneralRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSGeneralRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSGeneralRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSGeneralRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSGeneralRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</GeneralRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSGeneralRequirementsAccess().getGeneralRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSFunctionalRequirements
entryRuleVSRSFunctionalRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSFunctionalRequirementsRule()); }
	iv_ruleVSRSFunctionalRequirements=ruleVSRSFunctionalRequirements
	{ $current=$iv_ruleVSRSFunctionalRequirements.current; }
	EOF;

// Rule VSRSFunctionalRequirements
ruleVSRSFunctionalRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSFunctionalRequirementsAccess().getVSRSFunctionalRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<FunctionalRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSFunctionalRequirementsAccess().getFunctionalRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSFunctionalRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSFunctionalRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSFunctionalRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSFunctionalRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</FunctionalRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSFunctionalRequirementsAccess().getFunctionalRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSPerformanceRequirements
entryRuleVSRSPerformanceRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSPerformanceRequirementsRule()); }
	iv_ruleVSRSPerformanceRequirements=ruleVSRSPerformanceRequirements
	{ $current=$iv_ruleVSRSPerformanceRequirements.current; }
	EOF;

// Rule VSRSPerformanceRequirements
ruleVSRSPerformanceRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSPerformanceRequirementsAccess().getVSRSPerformanceRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<PerformanceRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSPerformanceRequirementsAccess().getPerformanceRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSPerformanceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSPerformanceRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSPerformanceRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSPerformanceRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</PerformanceRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSPerformanceRequirementsAccess().getPerformanceRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSInterfaceRequirements
entryRuleVSRSInterfaceRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSInterfaceRequirementsRule()); }
	iv_ruleVSRSInterfaceRequirements=ruleVSRSInterfaceRequirements
	{ $current=$iv_ruleVSRSInterfaceRequirements.current; }
	EOF;

// Rule VSRSInterfaceRequirements
ruleVSRSInterfaceRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSInterfaceRequirementsAccess().getVSRSInterfaceRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<InterfaceRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSInterfaceRequirementsAccess().getInterfaceRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSInterfaceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSInterfaceRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSInterfaceRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSInterfaceRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</InterfaceRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSInterfaceRequirementsAccess().getInterfaceRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSOperationalRequirements
entryRuleVSRSOperationalRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSOperationalRequirementsRule()); }
	iv_ruleVSRSOperationalRequirements=ruleVSRSOperationalRequirements
	{ $current=$iv_ruleVSRSOperationalRequirements.current; }
	EOF;

// Rule VSRSOperationalRequirements
ruleVSRSOperationalRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSOperationalRequirementsAccess().getVSRSOperationalRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<OperationalRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSOperationalRequirementsAccess().getOperationalRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSOperationalRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSOperationalRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSOperationalRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSOperationalRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</OperationalRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSOperationalRequirementsAccess().getOperationalRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSResourcesRequirements
entryRuleVSRSResourcesRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSResourcesRequirementsRule()); }
	iv_ruleVSRSResourcesRequirements=ruleVSRSResourcesRequirements
	{ $current=$iv_ruleVSRSResourcesRequirements.current; }
	EOF;

// Rule VSRSResourcesRequirements
ruleVSRSResourcesRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSResourcesRequirementsAccess().getVSRSResourcesRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<ResourcesRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSResourcesRequirementsAccess().getResourcesRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSResourcesRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSResourcesRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSResourcesRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSResourcesRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</ResourcesRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSResourcesRequirementsAccess().getResourcesRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSDesignRequirements
entryRuleVSRSDesignRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSDesignRequirementsRule()); }
	iv_ruleVSRSDesignRequirements=ruleVSRSDesignRequirements
	{ $current=$iv_ruleVSRSDesignRequirements.current; }
	EOF;

// Rule VSRSDesignRequirements
ruleVSRSDesignRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSDesignRequirementsAccess().getVSRSDesignRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<DesignRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSDesignRequirementsAccess().getDesignRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDesignRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDesignRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDesignRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDesignRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDesignRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDesignRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</DesignRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSDesignRequirementsAccess().getDesignRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSSecurityPrivacyRequirements
entryRuleVSRSSecurityPrivacyRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSSecurityPrivacyRequirementsRule()); }
	iv_ruleVSRSSecurityPrivacyRequirements=ruleVSRSSecurityPrivacyRequirements
	{ $current=$iv_ruleVSRSSecurityPrivacyRequirements.current; }
	EOF;

// Rule VSRSSecurityPrivacyRequirements
ruleVSRSSecurityPrivacyRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getVSRSSecurityPrivacyRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SecurityPrivacyRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSecurityPrivacyRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSecurityPrivacyRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSecurityPrivacyRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSecurityPrivacyRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SecurityPrivacyRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSecurityPrivacyRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSPortabilityRequirements
entryRuleVSRSPortabilityRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSPortabilityRequirementsRule()); }
	iv_ruleVSRSPortabilityRequirements=ruleVSRSPortabilityRequirements
	{ $current=$iv_ruleVSRSPortabilityRequirements.current; }
	EOF;

// Rule VSRSPortabilityRequirements
ruleVSRSPortabilityRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSPortabilityRequirementsAccess().getVSRSPortabilityRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<PortabilityRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSPortabilityRequirementsAccess().getPortabilityRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSPortabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSPortabilityRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSPortabilityRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSPortabilityRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</PortabilityRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSPortabilityRequirementsAccess().getPortabilityRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSSWQualityRequirements
entryRuleVSRSSWQualityRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSSWQualityRequirementsRule()); }
	iv_ruleVSRSSWQualityRequirements=ruleVSRSSWQualityRequirements
	{ $current=$iv_ruleVSRSSWQualityRequirements.current; }
	EOF;

// Rule VSRSSWQualityRequirements
ruleVSRSSWQualityRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSSWQualityRequirementsAccess().getVSRSSWQualityRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SWQualityRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSSWQualityRequirementsAccess().getSWQualityRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWQualityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWQualityRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWQualityRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWQualityRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SWQualityRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSSWQualityRequirementsAccess().getSWQualityRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSSWReliabilityRequirements
entryRuleVSRSSWReliabilityRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSSWReliabilityRequirementsRule()); }
	iv_ruleVSRSSWReliabilityRequirements=ruleVSRSSWReliabilityRequirements
	{ $current=$iv_ruleVSRSSWReliabilityRequirements.current; }
	EOF;

// Rule VSRSSWReliabilityRequirements
ruleVSRSSWReliabilityRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSSWReliabilityRequirementsAccess().getVSRSSWReliabilityRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SWReliabilityRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSSWReliabilityRequirementsAccess().getSWReliabilityRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWReliabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWReliabilityRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWReliabilityRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWReliabilityRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWReliabilityRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWReliabilityRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SWReliabilityRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSSWReliabilityRequirementsAccess().getSWReliabilityRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSSWMaintainabilityRequirements
entryRuleVSRSSWMaintainabilityRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSSWMaintainabilityRequirementsRule()); }
	iv_ruleVSRSSWMaintainabilityRequirements=ruleVSRSSWMaintainabilityRequirements
	{ $current=$iv_ruleVSRSSWMaintainabilityRequirements.current; }
	EOF;

// Rule VSRSSWMaintainabilityRequirements
ruleVSRSSWMaintainabilityRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getVSRSSWMaintainabilityRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SWMaintainabilityRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSWMaintainabilityRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWMaintainabilityRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWMaintainabilityRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWMaintainabilityRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SWMaintainabilityRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSWMaintainabilityRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSSWSafetyRequirements
entryRuleVSRSSWSafetyRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSSWSafetyRequirementsRule()); }
	iv_ruleVSRSSWSafetyRequirements=ruleVSRSSWSafetyRequirements
	{ $current=$iv_ruleVSRSSWSafetyRequirements.current; }
	EOF;

// Rule VSRSSWSafetyRequirements
ruleVSRSSWSafetyRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSSWSafetyRequirementsAccess().getVSRSSWSafetyRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SWSafetyRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSSWSafetyRequirementsAccess().getSWSafetyRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWSafetyRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWSafetyRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWSafetyRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SWSafetyRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSSWSafetyRequirementsAccess().getSWSafetyRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSSWConfigurationDeliveryRequirements
entryRuleVSRSSWConfigurationDeliveryRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsRule()); }
	iv_ruleVSRSSWConfigurationDeliveryRequirements=ruleVSRSSWConfigurationDeliveryRequirements
	{ $current=$iv_ruleVSRSSWConfigurationDeliveryRequirements.current; }
	EOF;

// Rule VSRSSWConfigurationDeliveryRequirements
ruleVSRSSWConfigurationDeliveryRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getVSRSSWConfigurationDeliveryRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SWConfigurationDeliveryRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSWConfigurationDeliveryRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SWConfigurationDeliveryRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSWConfigurationDeliveryRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSDataDefinitionDBRequirements
entryRuleVSRSDataDefinitionDBRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSDataDefinitionDBRequirementsRule()); }
	iv_ruleVSRSDataDefinitionDBRequirements=ruleVSRSDataDefinitionDBRequirements
	{ $current=$iv_ruleVSRSDataDefinitionDBRequirements.current; }
	EOF;

// Rule VSRSDataDefinitionDBRequirements
ruleVSRSDataDefinitionDBRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getVSRSDataDefinitionDBRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<DataDefinitionDBRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getDataDefinitionDBRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDataDefinitionDBRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDataDefinitionDBRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDataDefinitionDBRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</DataDefinitionDBRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getDataDefinitionDBRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSHumanFactorsRequirements
entryRuleVSRSHumanFactorsRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSHumanFactorsRequirementsRule()); }
	iv_ruleVSRSHumanFactorsRequirements=ruleVSRSHumanFactorsRequirements
	{ $current=$iv_ruleVSRSHumanFactorsRequirements.current; }
	EOF;

// Rule VSRSHumanFactorsRequirements
ruleVSRSHumanFactorsRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSHumanFactorsRequirementsAccess().getVSRSHumanFactorsRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<HumanFactorsRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSHumanFactorsRequirementsAccess().getHumanFactorsRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSHumanFactorsRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSHumanFactorsRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSHumanFactorsRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</HumanFactorsRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSHumanFactorsRequirementsAccess().getHumanFactorsRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSAdaptationInstallationRequirements
entryRuleVSRSAdaptationInstallationRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSAdaptationInstallationRequirementsRule()); }
	iv_ruleVSRSAdaptationInstallationRequirements=ruleVSRSAdaptationInstallationRequirements
	{ $current=$iv_ruleVSRSAdaptationInstallationRequirements.current; }
	EOF;

// Rule VSRSAdaptationInstallationRequirements
ruleVSRSAdaptationInstallationRequirements returns [EObject current=null]
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
					grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getVSRSAdaptationInstallationRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<AdaptationInstallationRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getAdaptationInstallationRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSAdaptationInstallationRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0());
				}
				lv_srsItems_3_0=ruleVSRSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSAdaptationInstallationRequirementsRule());
					}
					add(
						$current,
						"srsItems",
						lv_srsItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_srsRequirementSubsections_4_0=ruleVSRSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSAdaptationInstallationRequirementsRule());
					}
					add(
						$current,
						"srsRequirementSubsections",
						lv_srsRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</AdaptationInstallationRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getAdaptationInstallationRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSRSDocumentItem
entryRuleVSRSDocumentItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSDocumentItemRule()); }
	iv_ruleVSRSDocumentItem=ruleVSRSDocumentItem
	{ $current=$iv_ruleVSRSDocumentItem.current; }
	EOF;

// Rule VSRSDocumentItem
ruleVSRSDocumentItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Item'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSRSDocumentItemAccess().getItemKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSDocumentItemAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSRSDocumentItemAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSRSDocumentItemRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='validationMethod='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSRSDocumentItemAccess().getValidationMethodKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDocumentItemAccess().getValidationMethodVValidationMethodEnumRuleCall_4_0());
				}
				lv_validationMethod_4_0=ruleVValidationMethod
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDocumentItemRule());
					}
					set(
						$current,
						"validationMethod",
						lv_validationMethod_4_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VValidationMethod");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSRSDocumentItemAccess().getGreaterThanSignKeyword_5());
		}
		(
			otherlv_6='<mode'
			{
				newLeafNode(otherlv_6, grammarAccess.getVSRSDocumentItemAccess().getModeKeyword_6_0());
			}
			otherlv_7='name='
			{
				newLeafNode(otherlv_7, grammarAccess.getVSRSDocumentItemAccess().getNameKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSRSDocumentItemAccess().getModeVSRSDocumentItemModesEnumRuleCall_6_2_0());
					}
					lv_mode_8_0=ruleVSRSDocumentItemModes
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSRSDocumentItemRule());
						}
						add(
							$current,
							"mode",
							lv_mode_8_0,
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItemModes");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9='/>'
			{
				newLeafNode(otherlv_9, grammarAccess.getVSRSDocumentItemAccess().getSolidusGreaterThanSignKeyword_6_3());
			}
		)*
		otherlv_10='<description>'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSRSDocumentItemAccess().getDescriptionKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSRSDocumentItemAccess().getDescriptionDBodyParserRuleCall_8_0());
				}
				lv_description_11_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSRSDocumentItemRule());
					}
					set(
						$current,
						"description",
						lv_description_11_0,
						"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='</description>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSRSDocumentItemAccess().getDescriptionKeyword_9());
		}
		(
			otherlv_13='<extendedDescription>'
			{
				newLeafNode(otherlv_13, grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionDBodyParserRuleCall_10_1_0());
					}
					lv_extendedDescription_14_0=ruleDBody
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSRSDocumentItemRule());
						}
						set(
							$current,
							"extendedDescription",
							lv_extendedDescription_14_0,
							"es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_15='</extendedDescription>'
			{
				newLeafNode(otherlv_15, grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionKeyword_10_2());
			}
		)?
		(
			otherlv_16='<parentItem'
			{
				newLeafNode(otherlv_16, grammarAccess.getVSRSDocumentItemAccess().getParentItemKeyword_11_0());
			}
			otherlv_17='name='
			{
				newLeafNode(otherlv_17, grammarAccess.getVSRSDocumentItemAccess().getNameKeyword_11_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSRSDocumentItemRule());
						}
					}
					otherlv_18=RULE_STRING
					{
						newLeafNode(otherlv_18, grammarAccess.getVSRSDocumentItemAccess().getParentItemVTraceableDocumentAbstractItemCrossReference_11_2_0());
					}
				)
			)
			otherlv_19='/>'
			{
				newLeafNode(otherlv_19, grammarAccess.getVSRSDocumentItemAccess().getSolidusGreaterThanSignKeyword_11_3());
			}
		)*
		otherlv_20='</Item>'
		{
			newLeafNode(otherlv_20, grammarAccess.getVSRSDocumentItemAccess().getItemKeyword_12());
		}
	)
;

// Entry rule entryRuleVSRSLogicalModel
entryRuleVSRSLogicalModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSRSLogicalModelRule()); }
	iv_ruleVSRSLogicalModel=ruleVSRSLogicalModel
	{ $current=$iv_ruleVSRSLogicalModel.current; }
	EOF;

// Rule VSRSLogicalModel
ruleVSRSLogicalModel returns [EObject current=null]
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
					grammarAccess.getVSRSLogicalModelAccess().getVSRSLogicalModelAction_0(),
					$current);
			}
		)
		otherlv_1='<LogicalModel/>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSRSLogicalModelAccess().getLogicalModelKeyword_1());
		}
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

// Rule VValidationMethod
ruleVValidationMethod returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='"Analysis"'
			{
				$current = grammarAccess.getVValidationMethodAccess().getAnalysisEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVValidationMethodAccess().getAnalysisEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"Inspection"'
			{
				$current = grammarAccess.getVValidationMethodAccess().getInspectionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVValidationMethodAccess().getInspectionEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='"Testing"'
			{
				$current = grammarAccess.getVValidationMethodAccess().getTestingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVValidationMethodAccess().getTestingEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='"Review"'
			{
				$current = grammarAccess.getVValidationMethodAccess().getReviewEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getVValidationMethodAccess().getReviewEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='"ModelSimulation"'
			{
				$current = grammarAccess.getVValidationMethodAccess().getModelSimulationEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getVValidationMethodAccess().getModelSimulationEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='"WalkThrough"'
			{
				$current = grammarAccess.getVValidationMethodAccess().getWalkThroughEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getVValidationMethodAccess().getWalkThroughEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='"CrossReading"'
			{
				$current = grammarAccess.getVValidationMethodAccess().getCrossReadingEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getVValidationMethodAccess().getCrossReadingEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='"DeskChecking"'
			{
				$current = grammarAccess.getVValidationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getVValidationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7());
			}
		)
	)
;

// Rule VSRSDocumentItemModes
ruleVSRSDocumentItemModes returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='"Off"'
			{
				$current = grammarAccess.getVSRSDocumentItemModesAccess().getOffEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVSRSDocumentItemModesAccess().getOffEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"Boot"'
			{
				$current = grammarAccess.getVSRSDocumentItemModesAccess().getBootEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVSRSDocumentItemModesAccess().getBootEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='"Safe"'
			{
				$current = grammarAccess.getVSRSDocumentItemModesAccess().getSafeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVSRSDocumentItemModesAccess().getSafeEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='"Configuration"'
			{
				$current = grammarAccess.getVSRSDocumentItemModesAccess().getConfigurationEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getVSRSDocumentItemModesAccess().getConfigurationEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='"Operational"'
			{
				$current = grammarAccess.getVSRSDocumentItemModesAccess().getOperationalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getVSRSDocumentItemModesAccess().getOperationalEnumLiteralDeclaration_4());
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
