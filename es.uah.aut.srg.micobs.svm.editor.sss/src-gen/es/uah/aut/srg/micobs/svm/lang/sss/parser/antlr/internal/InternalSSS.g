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
grammar InternalSSS;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.sss.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.sss.parser.antlr.internal;

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
import es.uah.aut.srg.micobs.svm.lang.sss.services.SSSGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private SSSGrammarAccess grammarAccess;

    public InternalSSSParser(TokenStream input, SSSGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "VSSSDocument";
   	}

   	@Override
   	protected SSSGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleVSSSDocument
entryRuleVSSSDocument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSDocumentRule()); }
	iv_ruleVSSSDocument=ruleVSSSDocument
	{ $current=$iv_ruleVSSSDocument.current; }
	EOF;

// Rule VSSSDocument
ruleVSSSDocument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<SSS'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSDocumentAccess().getSSSKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSDocumentAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSSSDocumentAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDocumentRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSSSDocumentAccess().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVSSSDocumentAccess().getIdSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDocumentRule());
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
			newLeafNode(otherlv_5, grammarAccess.getVSSSDocumentAccess().getIssueKeyword_5());
		}
		(
			(
				lv_issue_6_0=RULE_STRING
				{
					newLeafNode(lv_issue_6_0, grammarAccess.getVSSSDocumentAccess().getIssueSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"issue",
						lv_issue_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_7='revision='
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSDocumentAccess().getRevisionKeyword_7());
		}
		(
			(
				lv_revision_8_0=RULE_STRING
				{
					newLeafNode(lv_revision_8_0, grammarAccess.getVSSSDocumentAccess().getRevisionSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"revision",
						lv_revision_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9='date='
		{
			newLeafNode(otherlv_9, grammarAccess.getVSSSDocumentAccess().getDateKeyword_9());
		}
		(
			(
				lv_date_10_0=RULE_STRING
				{
					newLeafNode(lv_date_10_0, grammarAccess.getVSSSDocumentAccess().getDateSTRINGTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDocumentRule());
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
			newLeafNode(otherlv_11, grammarAccess.getVSSSDocumentAccess().getGreaterThanSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionVSSSIntroductionParserRuleCall_12_0());
				}
				lv_introductionSection_12_0=ruleVSSSIntroduction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"introductionSection",
						lv_introductionSection_12_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSIntroduction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_13_0());
				}
				lv_applicableDocumentsSection_13_0=ruleVSSSApplicableDocuments
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"applicableDocumentsSection",
						lv_applicableDocumentsSection_13_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSApplicableDocuments");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_14_0());
				}
				lv_referenceDocumentsSection_14_0=ruleVSSSReferenceDocuments
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"referenceDocumentsSection",
						lv_referenceDocumentsSection_14_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReferenceDocuments");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_15_0());
				}
				lv_termsDefinitionsAbbreviationsSection_15_0=ruleVSSSTermsDefinitionsAbbreviations
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"termsDefinitionsAbbreviationsSection",
						lv_termsDefinitionsAbbreviationsSection_15_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSTermsDefinitionsAbbreviations");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_16_0());
				}
				lv_generalDescriptionSection_16_0=ruleVSSSGeneralDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"generalDescriptionSection",
						lv_generalDescriptionSection_16_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescription");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_17_0());
				}
				lv_specificRequirementsSection_17_0=ruleVSSSSpecificRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"specificRequirementsSection",
						lv_specificRequirementsSection_17_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSpecificRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_18_0());
				}
				lv_verificationValidationIntegrationSection_18_0=ruleVSSSVerificationValidationIntegrationRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"verificationValidationIntegrationSection",
						lv_verificationValidationIntegrationSection_18_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationIntegrationRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionVSSSSystemModelsParserRuleCall_19_0());
				}
				lv_systemModelsSection_19_0=ruleVSSSSystemModels
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"systemModelsSection",
						lv_systemModelsSection_19_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemModels");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_20='</SSS>'
		{
			newLeafNode(otherlv_20, grammarAccess.getVSSSDocumentAccess().getSSSKeyword_20());
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBodyContent");
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
			newCompositeNode(grammarAccess.getDBodyContentAccess().getDFigureParserRuleCall_3());
		}
		this_DFigure_3=ruleDFigure
		{
			$current = $this_DFigure_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDBodyContentAccess().getDPictureAsTableParserRuleCall_4());
		}
		this_DPictureAsTable_4=ruleDPictureAsTable
		{
			$current = $this_DPictureAsTable_4.current;
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
		otherlv_0='<paragraph>'
		{
			newLeafNode(otherlv_0, grammarAccess.getDParagraphAccess().getParagraphKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_1_0());
				}
				lv_paragraphContent_1_0=ruleDParagraphContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDParagraphRule());
					}
					add(
						$current,
						"paragraphContent",
						lv_paragraphContent_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraphContent");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</paragraph>'
		{
			newLeafNode(otherlv_2, grammarAccess.getDParagraphAccess().getParagraphKeyword_2());
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
		otherlv_0='<listItem>'
		{
			newLeafNode(otherlv_0, grammarAccess.getDListItemAccess().getListItemKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_1_0());
				}
				lv_paragraph_1_0=ruleDParagraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDListItemRule());
					}
					add(
						$current,
						"paragraph",
						lv_paragraph_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraph");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			otherlv_2='<sublist>'
			{
				newLeafNode(otherlv_2, grammarAccess.getDListItemAccess().getSublistKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_2_1_0());
					}
					lv_sublist_3_0=ruleDListContent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDListItemRule());
						}
						set(
							$current,
							"sublist",
							lv_sublist_3_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListContent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4='</sublist>'
			{
				newLeafNode(otherlv_4, grammarAccess.getDListItemAccess().getSublistKeyword_2_2());
			}
		)?
		otherlv_5='</listItem>'
		{
			newLeafNode(otherlv_5, grammarAccess.getDListItemAccess().getListItemKeyword_3());
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
		otherlv_0='<itemize>'
		{
			newLeafNode(otherlv_0, grammarAccess.getDItemizeAccess().getItemizeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_1_0());
				}
				lv_items_1_0=ruleDListItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDItemizeRule());
					}
					add(
						$current,
						"items",
						lv_items_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</itemize>'
		{
			newLeafNode(otherlv_2, grammarAccess.getDItemizeAccess().getItemizeKeyword_2());
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
		otherlv_0='<enumerate>'
		{
			newLeafNode(otherlv_0, grammarAccess.getDEnumerateAccess().getEnumerateKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_1_0());
				}
				lv_items_1_0=ruleDListItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDEnumerateRule());
					}
					add(
						$current,
						"items",
						lv_items_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</enumerate>'
		{
			newLeafNode(otherlv_2, grammarAccess.getDEnumerateAccess().getEnumerateKeyword_2());
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
			otherlv_1='bold'
			{
				newLeafNode(otherlv_1, grammarAccess.getDRunAccess().getBoldKeyword_1());
			}
		)?
		(
			otherlv_2='italic'
			{
				newLeafNode(otherlv_2, grammarAccess.getDRunAccess().getItalicKeyword_2());
			}
		)?
		(
			otherlv_3='underscore'
			{
				newLeafNode(otherlv_3, grammarAccess.getDRunAccess().getUnderscoreKeyword_3());
			}
		)?
		otherlv_4='>'
		{
			newLeafNode(otherlv_4, grammarAccess.getDRunAccess().getGreaterThanSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_5_0());
				}
				lv_text_5_0=ruleDText
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDRunRule());
					}
					set(
						$current,
						"text",
						lv_text_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DText");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='</run>'
		{
			newLeafNode(otherlv_6, grammarAccess.getDRunAccess().getRunKeyword_6());
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
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getDHyperlinkAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_4_0());
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</hyperlink>'
		{
			newLeafNode(otherlv_5, grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_5());
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
					"es.uah.aut.srg.micobs.svm.lang.sss.SSS.RUNTEXT");
			}
		)
	)
;

// Entry rule entryRuleDFigure
entryRuleDFigure returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDFigureRule()); }
	iv_ruleDFigure=ruleDFigure
	{ $current=$iv_ruleDFigure.current; }
	EOF;

// Rule DFigure
ruleDFigure returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<figure'
		{
			newLeafNode(otherlv_0, grammarAccess.getDFigureAccess().getFigureKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getDFigureAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDFigureAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDFigureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='reference='
		{
			newLeafNode(otherlv_3, grammarAccess.getDFigureAccess().getReferenceKeyword_3());
		}
		(
			(
				lv_reference_4_0=RULE_STRING
				{
					newLeafNode(lv_reference_4_0, grammarAccess.getDFigureAccess().getReferenceSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDFigureRule());
					}
					setWithLastConsumed(
						$current,
						"reference",
						lv_reference_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='caption='
		{
			newLeafNode(otherlv_5, grammarAccess.getDFigureAccess().getCaptionKeyword_5());
		}
		(
			(
				lv_caption_6_0=RULE_STRING
				{
					newLeafNode(lv_caption_6_0, grammarAccess.getDFigureAccess().getCaptionSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDFigureRule());
					}
					setWithLastConsumed(
						$current,
						"caption",
						lv_caption_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getDFigureAccess().getSolidusGreaterThanSignKeyword_7());
		}
	)
;

// Entry rule entryRuleDPictureAsTable
entryRuleDPictureAsTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDPictureAsTableRule()); }
	iv_ruleDPictureAsTable=ruleDPictureAsTable
	{ $current=$iv_ruleDPictureAsTable.current; }
	EOF;

// Rule DPictureAsTable
ruleDPictureAsTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<pictureAsTable'
		{
			newLeafNode(otherlv_0, grammarAccess.getDPictureAsTableAccess().getPictureAsTableKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getDPictureAsTableAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDPictureAsTableAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDPictureAsTableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='reference='
		{
			newLeafNode(otherlv_3, grammarAccess.getDPictureAsTableAccess().getReferenceKeyword_3());
		}
		(
			(
				lv_reference_4_0=RULE_STRING
				{
					newLeafNode(lv_reference_4_0, grammarAccess.getDPictureAsTableAccess().getReferenceSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDPictureAsTableRule());
					}
					setWithLastConsumed(
						$current,
						"reference",
						lv_reference_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='caption='
		{
			newLeafNode(otherlv_5, grammarAccess.getDPictureAsTableAccess().getCaptionKeyword_5());
		}
		(
			(
				lv_caption_6_0=RULE_STRING
				{
					newLeafNode(lv_caption_6_0, grammarAccess.getDPictureAsTableAccess().getCaptionSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDPictureAsTableRule());
					}
					setWithLastConsumed(
						$current,
						"caption",
						lv_caption_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getDPictureAsTableAccess().getSolidusGreaterThanSignKeyword_7());
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
		otherlv_3='caption='
		{
			newLeafNode(otherlv_3, grammarAccess.getDBasicTableAccess().getCaptionKeyword_3());
		}
		(
			(
				lv_caption_4_0=RULE_STRING
				{
					newLeafNode(lv_caption_4_0, grammarAccess.getDBasicTableAccess().getCaptionSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDBasicTableRule());
					}
					setWithLastConsumed(
						$current,
						"caption",
						lv_caption_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='>'
		{
			newLeafNode(otherlv_5, grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_6_0());
				}
				lv_rows_6_0=ruleDRow
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDBasicTableRule());
					}
					add(
						$current,
						"rows",
						lv_rows_6_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRow");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='</basicTable>'
		{
			newLeafNode(otherlv_7, grammarAccess.getDBasicTableAccess().getBasicTableKeyword_7());
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
		otherlv_0='<row'
		{
			newLeafNode(otherlv_0, grammarAccess.getDRowAccess().getRowKeyword_0());
		}
		otherlv_1='span='
		{
			newLeafNode(otherlv_1, grammarAccess.getDRowAccess().getSpanKeyword_1());
		}
		(
			(
				lv_span_2_0=RULE_STRING
				{
					newLeafNode(lv_span_2_0, grammarAccess.getDRowAccess().getSpanSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDRowRule());
					}
					setWithLastConsumed(
						$current,
						"span",
						lv_span_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getDRowAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDRowAccess().getColumnsDColumnParserRuleCall_4_0());
				}
				lv_columns_4_0=ruleDColumn
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDRowRule());
					}
					add(
						$current,
						"columns",
						lv_columns_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DColumn");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='</row>'
		{
			newLeafNode(otherlv_5, grammarAccess.getDRowAccess().getRowKeyword_5());
		}
	)
;

// Entry rule entryRuleDColumn
entryRuleDColumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDColumnRule()); }
	iv_ruleDColumn=ruleDColumn
	{ $current=$iv_ruleDColumn.current; }
	EOF;

// Rule DColumn
ruleDColumn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<column'
		{
			newLeafNode(otherlv_0, grammarAccess.getDColumnAccess().getColumnKeyword_0());
		}
		otherlv_1='span='
		{
			newLeafNode(otherlv_1, grammarAccess.getDColumnAccess().getSpanKeyword_1());
		}
		(
			(
				lv_span_2_0=RULE_STRING
				{
					newLeafNode(lv_span_2_0, grammarAccess.getDColumnAccess().getSpanSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDColumnRule());
					}
					setWithLastConsumed(
						$current,
						"span",
						lv_span_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getDColumnAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDColumnAccess().getCellsDCellParserRuleCall_4_0());
				}
				lv_cells_4_0=ruleDCell
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDColumnRule());
					}
					add(
						$current,
						"cells",
						lv_cells_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DCell");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='</column>'
		{
			newLeafNode(otherlv_5, grammarAccess.getDColumnAccess().getColumnKeyword_5());
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
		otherlv_0='<cell>'
		{
			newLeafNode(otherlv_0, grammarAccess.getDCellAccess().getCellKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_1_0());
				}
				lv_bodyContent_1_0=ruleDBodyContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDCellRule());
					}
					add(
						$current,
						"bodyContent",
						lv_bodyContent_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBodyContent");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</cell>'
		{
			newLeafNode(otherlv_2, grammarAccess.getDCellAccess().getCellKeyword_2());
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
					lv_issue_8_0=RULE_STRING
					{
						newLeafNode(lv_issue_8_0, grammarAccess.getDApplicableDocumentAccess().getIssueSTRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDApplicableDocumentRule());
						}
						setWithLastConsumed(
							$current,
							"issue",
							lv_issue_8_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_9='revision='
			{
				newLeafNode(otherlv_9, grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_7_2());
			}
			(
				(
					lv_revision_10_0=RULE_STRING
					{
						newLeafNode(lv_revision_10_0, grammarAccess.getDApplicableDocumentAccess().getRevisionSTRINGTerminalRuleCall_7_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDApplicableDocumentRule());
						}
						setWithLastConsumed(
							$current,
							"revision",
							lv_revision_10_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
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
		otherlv_13='/>'
		{
			newLeafNode(otherlv_13, grammarAccess.getDApplicableDocumentAccess().getSolidusGreaterThanSignKeyword_9());
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
					lv_issue_8_0=RULE_STRING
					{
						newLeafNode(lv_issue_8_0, grammarAccess.getDReferenceDocumentAccess().getIssueSTRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDReferenceDocumentRule());
						}
						setWithLastConsumed(
							$current,
							"issue",
							lv_issue_8_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_9='revision='
			{
				newLeafNode(otherlv_9, grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_7_2());
			}
			(
				(
					lv_revision_10_0=RULE_STRING
					{
						newLeafNode(lv_revision_10_0, grammarAccess.getDReferenceDocumentAccess().getRevisionSTRINGTerminalRuleCall_7_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDReferenceDocumentRule());
						}
						setWithLastConsumed(
							$current,
							"revision",
							lv_revision_10_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
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
		otherlv_13='/>'
		{
			newLeafNode(otherlv_13, grammarAccess.getDReferenceDocumentAccess().getSolidusGreaterThanSignKeyword_9());
		}
	)
;

// Entry rule entryRuleVSSSIntroduction
entryRuleVSSSIntroduction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSIntroductionRule()); }
	iv_ruleVSSSIntroduction=ruleVSSSIntroduction
	{ $current=$iv_ruleVSSSIntroduction.current; }
	EOF;

// Rule VSSSIntroduction
ruleVSSSIntroduction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Introduction>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSIntroductionAccess().getIntroductionKeyword_0());
		}
		otherlv_1='<purpose>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSIntroductionAccess().getPurposeKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSIntroductionAccess().getPurposeDBodyParserRuleCall_2_0());
				}
				lv_purpose_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSIntroductionRule());
					}
					set(
						$current,
						"purpose",
						lv_purpose_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='</purpose>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSIntroductionAccess().getPurposeKeyword_3());
		}
		otherlv_4='<objective>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSSSIntroductionAccess().getObjectiveKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSIntroductionAccess().getObjectiveDBodyParserRuleCall_5_0());
				}
				lv_objective_5_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSIntroductionRule());
					}
					set(
						$current,
						"objective",
						lv_objective_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='</objective>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSSSIntroductionAccess().getObjectiveKeyword_6());
		}
		otherlv_7='<content>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSIntroductionAccess().getContentKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSIntroductionAccess().getContentDBodyParserRuleCall_8_0());
				}
				lv_content_8_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSIntroductionRule());
					}
					set(
						$current,
						"content",
						lv_content_8_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='</content>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSSSIntroductionAccess().getContentKeyword_9());
		}
		otherlv_10='<reason>'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSSSIntroductionAccess().getReasonKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSIntroductionAccess().getReasonDBodyParserRuleCall_11_0());
				}
				lv_reason_11_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSIntroductionRule());
					}
					set(
						$current,
						"reason",
						lv_reason_11_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='</reason>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSSSIntroductionAccess().getReasonKeyword_12());
		}
		otherlv_13='</Introduction>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSSSIntroductionAccess().getIntroductionKeyword_13());
		}
	)
;

// Entry rule entryRuleVSSSApplicableDocuments
entryRuleVSSSApplicableDocuments returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSApplicableDocumentsRule()); }
	iv_ruleVSSSApplicableDocuments=ruleVSSSApplicableDocuments
	{ $current=$iv_ruleVSSSApplicableDocuments.current; }
	EOF;

// Rule VSSSApplicableDocuments
ruleVSSSApplicableDocuments returns [EObject current=null]
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
					grammarAccess.getVSSSApplicableDocumentsAccess().getVSSSApplicableDocumentsAction_0(),
					$current);
			}
		)
		otherlv_1='<ApplicableDocuments>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0());
				}
				lv_applicableDocuments_2_0=ruleDApplicableDocument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSApplicableDocumentsRule());
					}
					add(
						$current,
						"applicableDocuments",
						lv_applicableDocuments_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DApplicableDocument");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ApplicableDocuments>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSReferenceDocuments
entryRuleVSSSReferenceDocuments returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSReferenceDocumentsRule()); }
	iv_ruleVSSSReferenceDocuments=ruleVSSSReferenceDocuments
	{ $current=$iv_ruleVSSSReferenceDocuments.current; }
	EOF;

// Rule VSSSReferenceDocuments
ruleVSSSReferenceDocuments returns [EObject current=null]
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
					grammarAccess.getVSSSReferenceDocumentsAccess().getVSSSReferenceDocumentsAction_0(),
					$current);
			}
		)
		otherlv_1='<ReferenceDocuments>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0());
				}
				lv_referenceDocuments_2_0=ruleDReferenceDocument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSReferenceDocumentsRule());
					}
					add(
						$current,
						"referenceDocuments",
						lv_referenceDocuments_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DReferenceDocument");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ReferenceDocuments>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSTermsDefinitionsAbbreviations
entryRuleVSSSTermsDefinitionsAbbreviations returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule()); }
	iv_ruleVSSSTermsDefinitionsAbbreviations=ruleVSSSTermsDefinitionsAbbreviations
	{ $current=$iv_ruleVSSSTermsDefinitionsAbbreviations.current; }
	EOF;

// Rule VSSSTermsDefinitionsAbbreviations
ruleVSSSTermsDefinitionsAbbreviations returns [EObject current=null]
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
					grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getVSSSTermsDefinitionsAbbreviationsAction_0(),
					$current);
			}
		)
		otherlv_1='<TermsDefinitionsAbbreviations>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsVSSSTermParserRuleCall_2_0());
				}
				lv_terms_2_0=ruleVSSSTerm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
					}
					add(
						$current,
						"terms",
						lv_terms_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSTerm");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSSSDefinitionParserRuleCall_3_0());
				}
				lv_definitions_3_0=ruleVSSSDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
					}
					add(
						$current,
						"definitions",
						lv_definitions_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSSSAbbreviationParserRuleCall_4_0());
				}
				lv_abbreviations_4_0=ruleVSSSAbbreviation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
					}
					add(
						$current,
						"abbreviations",
						lv_abbreviations_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAbbreviation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</TermsDefinitionsAbbreviations>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSSSGeneralDescription
entryRuleVSSSGeneralDescription returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSGeneralDescriptionRule()); }
	iv_ruleVSSSGeneralDescription=ruleVSSSGeneralDescription
	{ $current=$iv_ruleVSSSGeneralDescription.current; }
	EOF;

// Rule VSSSGeneralDescription
ruleVSSSGeneralDescription returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<GeneralDescription>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralDescriptionKeyword_0());
		}
		otherlv_1='<productPerspective>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_2_0());
				}
				lv_productPerspective_2_0=ruleVSSSGeneralDescriptionSubsection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"productPerspective",
						lv_productPerspective_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='</productPerspective>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_3());
		}
		otherlv_4='<generalCapabilities>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0());
				}
				lv_generalCapabilities_5_0=ruleVSSSGeneralDescriptionSubsection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"generalCapabilities",
						lv_generalCapabilities_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='</generalCapabilities>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesKeyword_6());
		}
		otherlv_7='<generalConstraints>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_8_0());
				}
				lv_generalConstraints_8_0=ruleVSSSGeneralDescriptionSubsection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"generalConstraints",
						lv_generalConstraints_8_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='</generalConstraints>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_9());
		}
		otherlv_10='<operationalEnvironment>'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_11_0());
				}
				lv_operationalEnvironment_11_0=ruleVSSSGeneralDescriptionSubsection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"operationalEnvironment",
						lv_operationalEnvironment_11_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='</operationalEnvironment>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_12());
		}
		otherlv_13='<assumptionsDependencies>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_14_0());
				}
				lv_assumptionsDependencies_14_0=ruleVSSSGeneralDescriptionSubsection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"assumptionsDependencies",
						lv_assumptionsDependencies_14_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='</assumptionsDependencies>'
		{
			newLeafNode(otherlv_15, grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_15());
		}
		otherlv_16='</GeneralDescription>'
		{
			newLeafNode(otherlv_16, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralDescriptionKeyword_16());
		}
	)
;

// Entry rule entryRuleVSSSSpecificRequirements
entryRuleVSSSSpecificRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSpecificRequirementsRule()); }
	iv_ruleVSSSSpecificRequirements=ruleVSSSSpecificRequirements
	{ $current=$iv_ruleVSSSSpecificRequirements.current; }
	EOF;

// Rule VSSSSpecificRequirements
ruleVSSSSpecificRequirements returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<SpecificRequirements>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSSpecificRequirementsAccess().getSpecificRequirementsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementsParserRuleCall_1_0());
				}
				lv_general_1_0=ruleVSSSGeneralRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"general",
						lv_general_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_2_0());
				}
				lv_capabilities_2_0=ruleVSSSCapabilitiesRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"capabilities",
						lv_capabilities_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSCapabilitiesRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_3_0());
				}
				lv_systemInterface_3_0=ruleVSSSSystemInterfaceRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"systemInterface",
						lv_systemInterface_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemInterfaceRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_4_0());
				}
				lv_adaptationMissionization_4_0=ruleVSSSAdaptationMissionizationRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"adaptationMissionization",
						lv_adaptationMissionization_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAdaptationMissionizationRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementsParserRuleCall_5_0());
				}
				lv_computerResource_5_0=ruleVSSSComputerResourceRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"computerResource",
						lv_computerResource_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSComputerResourceRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementsParserRuleCall_6_0());
				}
				lv_security_6_0=ruleVSSSSecurityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"security",
						lv_security_6_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSecurityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementsParserRuleCall_7_0());
				}
				lv_safety_7_0=ruleVSSSSafetyRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"safety",
						lv_safety_7_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSafetyRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementsParserRuleCall_8_0());
				}
				lv_reliabiltyAvailability_8_0=ruleVSSSReliabiltyAvailabilityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"reliabiltyAvailability",
						lv_reliabiltyAvailability_8_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReliabiltyAvailabilityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementsParserRuleCall_9_0());
				}
				lv_quality_9_0=ruleVSSSQualityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"quality",
						lv_quality_9_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSQualityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementsParserRuleCall_10_0());
				}
				lv_design_10_0=ruleVSSSDesignRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"design",
						lv_design_10_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDesignRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_11_0());
				}
				lv_softwareOperations_11_0=ruleVSSSSoftwareOperationsRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"softwareOperations",
						lv_softwareOperations_11_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareOperationsRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_12_0());
				}
				lv_softwareMaintenance_12_0=ruleVSSSSoftwareMaintenanceRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"softwareMaintenance",
						lv_softwareMaintenance_12_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareMaintenanceRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_13_0());
				}
				lv_systemSoftwareObservability_13_0=ruleVSSSSystemSoftwareObservabilityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"systemSoftwareObservability",
						lv_systemSoftwareObservability_13_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemSoftwareObservabilityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14='</SpecificRequirements>'
		{
			newLeafNode(otherlv_14, grammarAccess.getVSSSSpecificRequirementsAccess().getSpecificRequirementsKeyword_14());
		}
	)
;

// Entry rule entryRuleVSSSVerificationValidationIntegrationRequirements
entryRuleVSSSVerificationValidationIntegrationRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule()); }
	iv_ruleVSSSVerificationValidationIntegrationRequirements=ruleVSSSVerificationValidationIntegrationRequirements
	{ $current=$iv_ruleVSSSVerificationValidationIntegrationRequirements.current; }
	EOF;

// Rule VSSSVerificationValidationIntegrationRequirements
ruleVSSSVerificationValidationIntegrationRequirements returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<VerificationValidationIntegrationRequirements>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationIntegrationRequirementsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_1_0());
				}
				lv_verificationValidationProcess_1_0=ruleVSSSVerificationValidationProcessRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
					}
					set(
						$current,
						"verificationValidationProcess",
						lv_verificationValidationProcess_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationProcessRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_2_0());
				}
				lv_validationApproach_2_0=ruleVSSSValidationApproach
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
					}
					set(
						$current,
						"validationApproach",
						lv_validationApproach_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationApproach");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementsParserRuleCall_3_0());
				}
				lv_validation_3_0=ruleVSSSValidationRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
					}
					set(
						$current,
						"validation",
						lv_validation_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementsParserRuleCall_4_0());
				}
				lv_verification_4_0=ruleVSSSVerificationRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
					}
					set(
						$current,
						"verification",
						lv_verification_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</VerificationValidationIntegrationRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationIntegrationRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSSSSystemModels
entryRuleVSSSSystemModels returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSystemModelsRule()); }
	iv_ruleVSSSSystemModels=ruleVSSSSystemModels
	{ $current=$iv_ruleVSSSSystemModels.current; }
	EOF;

// Rule VSSSSystemModels
ruleVSSSSystemModels returns [EObject current=null]
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
					grammarAccess.getVSSSSystemModelsAccess().getVSSSSystemModelsAction_0(),
					$current);
			}
		)
		otherlv_1='<SystemModels>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemModelsAccess().getSystemModelsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsVSSSSystemModelParserRuleCall_2_0());
				}
				lv_systemModels_2_0=ruleVSSSSystemModel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemModelsRule());
					}
					add(
						$current,
						"systemModels",
						lv_systemModels_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemModel");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</SystemModels>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSystemModelsAccess().getSystemModelsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSTerm
entryRuleVSSSTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSTermRule()); }
	iv_ruleVSSSTerm=ruleVSSSTerm
	{ $current=$iv_ruleVSSSTerm.current; }
	EOF;

// Rule VSSSTerm
ruleVSSSTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Term'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSTermAccess().getTermKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSTermAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSSSTermAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSTermRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSSSTermAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSTermAccess().getDescriptionDRunParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSTermRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Term>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSTermAccess().getTermKeyword_5());
		}
	)
;

// Entry rule entryRuleVSSSDefinition
entryRuleVSSSDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSDefinitionRule()); }
	iv_ruleVSSSDefinition=ruleVSSSDefinition
	{ $current=$iv_ruleVSSSDefinition.current; }
	EOF;

// Rule VSSSDefinition
ruleVSSSDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Definition'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSDefinitionAccess().getDefinitionKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSDefinitionAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSSSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDefinitionRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSSSDefinitionAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDefinitionRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Definition>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSDefinitionAccess().getDefinitionKeyword_5());
		}
	)
;

// Entry rule entryRuleVSSSAbbreviation
entryRuleVSSSAbbreviation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSAbbreviationRule()); }
	iv_ruleVSSSAbbreviation=ruleVSSSAbbreviation
	{ $current=$iv_ruleVSSSAbbreviation.current; }
	EOF;

// Rule VSSSAbbreviation
ruleVSSSAbbreviation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Abbreviation'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSAbbreviationAccess().getAbbreviationKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSAbbreviationAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSSSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSAbbreviationRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSSSAbbreviationAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSAbbreviationRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Abbreviation>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSAbbreviationAccess().getAbbreviationKeyword_5());
		}
	)
;

// Entry rule entryRuleVSSSGeneralDescriptionSubsection
entryRuleVSSSGeneralDescriptionSubsection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSGeneralDescriptionSubsectionRule()); }
	iv_ruleVSSSGeneralDescriptionSubsection=ruleVSSSGeneralDescriptionSubsection
	{ $current=$iv_ruleVSSSGeneralDescriptionSubsection.current; }
	EOF;

// Rule VSSSGeneralDescriptionSubsection
ruleVSSSGeneralDescriptionSubsection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyDBodyParserRuleCall_0());
			}
			lv_body_0_0=ruleDBody
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionSubsectionRule());
				}
				set(
					$current,
					"body",
					lv_body_0_0,
					"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleVSSSGeneralRequirements
entryRuleVSSSGeneralRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSGeneralRequirementsRule()); }
	iv_ruleVSSSGeneralRequirements=ruleVSSSGeneralRequirements
	{ $current=$iv_ruleVSSSGeneralRequirements.current; }
	EOF;

// Rule VSSSGeneralRequirements
ruleVSSSGeneralRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSGeneralRequirementsAccess().getVSSSGeneralRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<GeneralRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSGeneralRequirementsAccess().getGeneralRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</GeneralRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSGeneralRequirementsAccess().getGeneralRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSCapabilitiesRequirements
entryRuleVSSSCapabilitiesRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementsRule()); }
	iv_ruleVSSSCapabilitiesRequirements=ruleVSSSCapabilitiesRequirements
	{ $current=$iv_ruleVSSSCapabilitiesRequirements.current; }
	EOF;

// Rule VSSSCapabilitiesRequirements
ruleVSSSCapabilitiesRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSCapabilitiesRequirementsAccess().getVSSSCapabilitiesRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<CapabilitiesRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSCapabilitiesRequirementsAccess().getCapabilitiesRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSCapabilitiesRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</CapabilitiesRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSCapabilitiesRequirementsAccess().getCapabilitiesRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSSystemInterfaceRequirements
entryRuleVSSSSystemInterfaceRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementsRule()); }
	iv_ruleVSSSSystemInterfaceRequirements=ruleVSSSSystemInterfaceRequirements
	{ $current=$iv_ruleVSSSSystemInterfaceRequirements.current; }
	EOF;

// Rule VSSSSystemInterfaceRequirements
ruleVSSSSystemInterfaceRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getVSSSSystemInterfaceRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SystemInterfaceRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSystemInterfaceRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemInterfaceRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</SystemInterfaceRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSystemInterfaceRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSAdaptationMissionizationRequirements
entryRuleVSSSAdaptationMissionizationRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementsRule()); }
	iv_ruleVSSSAdaptationMissionizationRequirements=ruleVSSSAdaptationMissionizationRequirements
	{ $current=$iv_ruleVSSSAdaptationMissionizationRequirements.current; }
	EOF;

// Rule VSSSAdaptationMissionizationRequirements
ruleVSSSAdaptationMissionizationRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getVSSSAdaptationMissionizationRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<VSSSAdaptationMissionizationRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getVSSSAdaptationMissionizationRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSAdaptationMissionizationRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</VSSSAdaptationMissionizationRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getVSSSAdaptationMissionizationRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSComputerResourceRequirements
entryRuleVSSSComputerResourceRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementsRule()); }
	iv_ruleVSSSComputerResourceRequirements=ruleVSSSComputerResourceRequirements
	{ $current=$iv_ruleVSSSComputerResourceRequirements.current; }
	EOF;

// Rule VSSSComputerResourceRequirements
ruleVSSSComputerResourceRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSComputerResourceRequirementsAccess().getVSSSComputerResourceRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<ComputerResourceRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSComputerResourceRequirementsAccess().getComputerResourceRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSComputerResourceRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ComputerResourceRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSComputerResourceRequirementsAccess().getComputerResourceRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSSecurityRequirements
entryRuleVSSSSecurityRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSecurityRequirementsRule()); }
	iv_ruleVSSSSecurityRequirements=ruleVSSSSecurityRequirements
	{ $current=$iv_ruleVSSSSecurityRequirements.current; }
	EOF;

// Rule VSSSSecurityRequirements
ruleVSSSSecurityRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSSecurityRequirementsAccess().getVSSSSecurityRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SecurityRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSecurityRequirementsAccess().getSecurityRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSecurityRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</SecurityRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSecurityRequirementsAccess().getSecurityRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSSafetyRequirements
entryRuleVSSSSafetyRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSafetyRequirementsRule()); }
	iv_ruleVSSSSafetyRequirements=ruleVSSSSafetyRequirements
	{ $current=$iv_ruleVSSSSafetyRequirements.current; }
	EOF;

// Rule VSSSSafetyRequirements
ruleVSSSSafetyRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSSafetyRequirementsAccess().getVSSSSafetyRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SafetyRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSafetyRequirementsAccess().getSafetyRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSafetyRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</SafetyRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSafetyRequirementsAccess().getSafetyRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSReliabiltyAvailabilityRequirements
entryRuleVSSSReliabiltyAvailabilityRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsRule()); }
	iv_ruleVSSSReliabiltyAvailabilityRequirements=ruleVSSSReliabiltyAvailabilityRequirements
	{ $current=$iv_ruleVSSSReliabiltyAvailabilityRequirements.current; }
	EOF;

// Rule VSSSReliabiltyAvailabilityRequirements
ruleVSSSReliabiltyAvailabilityRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getVSSSReliabiltyAvailabilityRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<ReliabiltyAvailabilityRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getReliabiltyAvailabilityRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ReliabiltyAvailabilityRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getReliabiltyAvailabilityRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSQualityRequirements
entryRuleVSSSQualityRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSQualityRequirementsRule()); }
	iv_ruleVSSSQualityRequirements=ruleVSSSQualityRequirements
	{ $current=$iv_ruleVSSSQualityRequirements.current; }
	EOF;

// Rule VSSSQualityRequirements
ruleVSSSQualityRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSQualityRequirementsAccess().getVSSSQualityRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<QualityRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSQualityRequirementsAccess().getQualityRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSQualityRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</QualityRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSQualityRequirementsAccess().getQualityRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSDesignRequirements
entryRuleVSSSDesignRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSDesignRequirementsRule()); }
	iv_ruleVSSSDesignRequirements=ruleVSSSDesignRequirements
	{ $current=$iv_ruleVSSSDesignRequirements.current; }
	EOF;

// Rule VSSSDesignRequirements
ruleVSSSDesignRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSDesignRequirementsAccess().getVSSSDesignRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<DesignRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSDesignRequirementsAccess().getDesignRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDesignRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</DesignRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSDesignRequirementsAccess().getDesignRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSSoftwareOperationsRequirements
entryRuleVSSSSoftwareOperationsRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementsRule()); }
	iv_ruleVSSSSoftwareOperationsRequirements=ruleVSSSSoftwareOperationsRequirements
	{ $current=$iv_ruleVSSSSoftwareOperationsRequirements.current; }
	EOF;

// Rule VSSSSoftwareOperationsRequirements
ruleVSSSSoftwareOperationsRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getVSSSSoftwareOperationsRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SoftwareOperationsRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSoftwareOperationsRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSoftwareOperationsRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</SoftwareOperationsRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSoftwareOperationsRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSSoftwareMaintenanceRequirements
entryRuleVSSSSoftwareMaintenanceRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementsRule()); }
	iv_ruleVSSSSoftwareMaintenanceRequirements=ruleVSSSSoftwareMaintenanceRequirements
	{ $current=$iv_ruleVSSSSoftwareMaintenanceRequirements.current; }
	EOF;

// Rule VSSSSoftwareMaintenanceRequirements
ruleVSSSSoftwareMaintenanceRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getVSSSSoftwareMaintenanceRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SoftwareMaintenanceRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSoftwareMaintenanceRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSoftwareMaintenanceRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</SoftwareMaintenanceRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSoftwareMaintenanceRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSSystemSoftwareObservabilityRequirements
entryRuleVSSSSystemSoftwareObservabilityRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsRule()); }
	iv_ruleVSSSSystemSoftwareObservabilityRequirements=ruleVSSSSystemSoftwareObservabilityRequirements
	{ $current=$iv_ruleVSSSSystemSoftwareObservabilityRequirements.current; }
	EOF;

// Rule VSSSSystemSoftwareObservabilityRequirements
ruleVSSSSystemSoftwareObservabilityRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getVSSSSystemSoftwareObservabilityRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<SystemSoftwareObservabilityRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSystemSoftwareObservabilityRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</SystemSoftwareObservabilityRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSystemSoftwareObservabilityRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSDocumentItem
entryRuleVSSSDocumentItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSDocumentItemRule()); }
	iv_ruleVSSSDocumentItem=ruleVSSSDocumentItem
	{ $current=$iv_ruleVSSSDocumentItem.current; }
	EOF;

// Rule VSSSDocumentItem
ruleVSSSDocumentItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Item'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSDocumentItemAccess().getItemKeyword_0());
		}
		otherlv_1='id='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSDocumentItemAccess().getIdKeyword_1());
		}
		(
			(
				lv_id_2_0=RULE_STRING
				{
					newLeafNode(lv_id_2_0, grammarAccess.getVSSSDocumentItemAccess().getIdSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDocumentItemRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='verificationMethod='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodVVerificationMethodEnumRuleCall_4_0());
				}
				lv_verificationMethod_4_0=ruleVVerificationMethod
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentItemRule());
					}
					set(
						$current,
						"verificationMethod",
						lv_verificationMethod_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VVerificationMethod");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSDocumentItemAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentItemAccess().getBodyDBodyParserRuleCall_6_0());
				}
				lv_body_6_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentItemRule());
					}
					set(
						$current,
						"body",
						lv_body_6_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='</Item>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSDocumentItemAccess().getItemKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSVerificationValidationProcessRequirements
entryRuleVSSSVerificationValidationProcessRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSVerificationValidationProcessRequirementsRule()); }
	iv_ruleVSSSVerificationValidationProcessRequirements=ruleVSSSVerificationValidationProcessRequirements
	{ $current=$iv_ruleVSSSVerificationValidationProcessRequirements.current; }
	EOF;

// Rule VSSSVerificationValidationProcessRequirements
ruleVSSSVerificationValidationProcessRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVSSSVerificationValidationProcessRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<VerificationValidationProcessRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVerificationValidationProcessRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationProcessRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</VerificationValidationProcessRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVerificationValidationProcessRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSValidationApproach
entryRuleVSSSValidationApproach returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSValidationApproachRule()); }
	iv_ruleVSSSValidationApproach=ruleVSSSValidationApproach
	{ $current=$iv_ruleVSSSValidationApproach.current; }
	EOF;

// Rule VSSSValidationApproach
ruleVSSSValidationApproach returns [EObject current=null]
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
					grammarAccess.getVSSSValidationApproachAccess().getVSSSValidationApproachAction_0(),
					$current);
			}
		)
		otherlv_1='<ValidationApproach>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSValidationApproachAccess().getValidationApproachKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSValidationApproachAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSValidationApproachRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ValidationApproach>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSValidationApproachAccess().getValidationApproachKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSValidationRequirements
entryRuleVSSSValidationRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSValidationRequirementsRule()); }
	iv_ruleVSSSValidationRequirements=ruleVSSSValidationRequirements
	{ $current=$iv_ruleVSSSValidationRequirements.current; }
	EOF;

// Rule VSSSValidationRequirements
ruleVSSSValidationRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSValidationRequirementsAccess().getVSSSValidationRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<ValidationRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSValidationRequirementsAccess().getValidationRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSValidationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSValidationRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ValidationRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSValidationRequirementsAccess().getValidationRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSVerificationRequirements
entryRuleVSSSVerificationRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSVerificationRequirementsRule()); }
	iv_ruleVSSSVerificationRequirements=ruleVSSSVerificationRequirements
	{ $current=$iv_ruleVSSSVerificationRequirements.current; }
	EOF;

// Rule VSSSVerificationRequirements
ruleVSSSVerificationRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSVerificationRequirementsAccess().getVSSSVerificationRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<VerificationRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSVerificationRequirementsAccess().getVerificationRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</VerificationRequirements>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSVerificationRequirementsAccess().getVerificationRequirementsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSSSSystemModel
entryRuleVSSSSystemModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSystemModelRule()); }
	iv_ruleVSSSSystemModel=ruleVSSSSystemModel
	{ $current=$iv_ruleVSSSSystemModel.current; }
	EOF;

// Rule VSSSSystemModel
ruleVSSSSystemModel returns [EObject current=null]
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
					grammarAccess.getVSSSSystemModelAccess().getVSSSSystemModelAction_0(),
					$current);
			}
		)
		otherlv_1='<SystemModel/>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemModelAccess().getSystemModelKeyword_1());
		}
	)
;

// Rule VVerificationMethod
ruleVVerificationMethod returns [Enumerator current=null]
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
				$current = grammarAccess.getVVerificationMethodAccess().getAnalysisEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVVerificationMethodAccess().getAnalysisEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"Inspection"'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getInspectionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVVerificationMethodAccess().getInspectionEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='"Testing"'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getTestingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVVerificationMethodAccess().getTestingEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='"Review"'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getReviewEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getVVerificationMethodAccess().getReviewEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='"ModelSimulation"'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getModelSimulationEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getVVerificationMethodAccess().getModelSimulationEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='"WalkThrough"'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getWalkThroughEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getVVerificationMethodAccess().getWalkThroughEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='"CrossReading"'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getCrossReadingEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getVVerificationMethodAccess().getCrossReadingEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='"DeskChecking"'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getVVerificationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7());
			}
		)
	)
;

RULE_RUNTEXT : '<text>' ( options {greedy=false;} : . )*'</text>';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
