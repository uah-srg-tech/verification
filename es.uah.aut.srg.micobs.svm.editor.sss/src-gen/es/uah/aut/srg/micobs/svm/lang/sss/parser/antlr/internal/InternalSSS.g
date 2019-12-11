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
				lv_issue_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_issue_6_0, grammarAccess.getVSSSDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"issue",
						lv_issue_6_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
				}
			)
		)
		otherlv_7='revision='
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSDocumentAccess().getRevisionKeyword_7());
		}
		(
			(
				lv_revision_8_0=RULE_UINT_STRING
				{
					newLeafNode(lv_revision_8_0, grammarAccess.getVSSSDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"revision",
						lv_revision_8_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraphContent");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraph");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListContent");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRunAttributes");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRunAttributes");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRunAttributes");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DTab");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DText");
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
		)?
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.REAL_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRow");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DCell");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBodyContent");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
		otherlv_13='/>'
		{
			newLeafNode(otherlv_13, grammarAccess.getDReferenceDocumentAccess().getSolidusGreaterThanSignKeyword_9());
		}
	)
;

// Entry rule entryRuleVSSSFixedSection
entryRuleVSSSFixedSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSFixedSectionRule()); }
	iv_ruleVSSSFixedSection=ruleVSSSFixedSection
	{ $current=$iv_ruleVSSSFixedSection.current; }
	EOF;

// Rule VSSSFixedSection
ruleVSSSFixedSection returns [EObject current=null]
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
					grammarAccess.getVSSSFixedSectionAccess().getVSSSFixedSectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSFixedSectionAccess().getBodyDBodyParserRuleCall_1_0());
				}
				lv_body_1_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSFixedSectionRule());
					}
					set(
						$current,
						"body",
						lv_body_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSFixedSectionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_2_0());
				}
				lv_sssInstatiableSubsections_2_0=ruleVSSSInstatiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSFixedSectionRule());
					}
					add(
						$current,
						"sssInstatiableSubsections",
						lv_sssInstatiableSubsections_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstatiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleVSSSInstatiableSection
entryRuleVSSSInstatiableSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSInstatiableSectionRule()); }
	iv_ruleVSSSInstatiableSection=ruleVSSSInstatiableSection
	{ $current=$iv_ruleVSSSInstatiableSection.current; }
	EOF;

// Rule VSSSInstatiableSection
ruleVSSSInstatiableSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<subsection'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSInstatiableSectionAccess().getSubsectionKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSInstatiableSectionAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSSSInstatiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSInstatiableSectionRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSSSInstatiableSectionAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSInstatiableSectionAccess().getBodyDBodyParserRuleCall_4_0());
				}
				lv_body_4_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSInstatiableSectionRule());
					}
					set(
						$current,
						"body",
						lv_body_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSInstatiableSectionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_5_0());
				}
				lv_sssInstatiableSubsections_5_0=ruleVSSSInstatiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSInstatiableSectionRule());
					}
					add(
						$current,
						"sssInstatiableSubsections",
						lv_sssInstatiableSubsections_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstatiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='</subsection>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSSSInstatiableSectionAccess().getSubsectionKeyword_6());
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
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSIntroductionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_1_0());
				}
				lv_sssInstatiableSubsections_1_0=ruleVSSSInstatiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSIntroductionRule());
					}
					add(
						$current,
						"sssInstatiableSubsections",
						lv_sssInstatiableSubsections_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstatiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</Introduction>'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSIntroductionAccess().getIntroductionKeyword_2());
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
		otherlv_1='<ProductPerspective>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSFixedSectionParserRuleCall_2_0());
				}
				lv_productPerspective_2_0=ruleVSSSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"productPerspective",
						lv_productPerspective_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='</ProductPerspective>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_3());
		}
		otherlv_4='<GeneralCapabilities>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesVSSSFixedSectionParserRuleCall_5_0());
				}
				lv_generalCapabilities_5_0=ruleVSSSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"generalCapabilities",
						lv_generalCapabilities_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='</GeneralCapabilities>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesKeyword_6());
		}
		otherlv_7='<GeneralConstraints>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSFixedSectionParserRuleCall_8_0());
				}
				lv_generalConstraints_8_0=ruleVSSSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"generalConstraints",
						lv_generalConstraints_8_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='</GeneralConstraints>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_9());
		}
		otherlv_10='<OperationalEnvironment>'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSFixedSectionParserRuleCall_11_0());
				}
				lv_operationalEnvironment_11_0=ruleVSSSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"operationalEnvironment",
						lv_operationalEnvironment_11_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='</OperationalEnvironment>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_12());
		}
		otherlv_13='<AssumptionsDependencies>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSFixedSectionParserRuleCall_14_0());
				}
				lv_assumptionsDependencies_14_0=ruleVSSSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"assumptionsDependencies",
						lv_assumptionsDependencies_14_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='</AssumptionsDependencies>'
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
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_1_0());
				}
				lv_sectionDescription_1_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementsParserRuleCall_2_0());
				}
				lv_general_2_0=ruleVSSSGeneralRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"general",
						lv_general_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_3_0());
				}
				lv_capabilities_3_0=ruleVSSSCapabilitiesRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"capabilities",
						lv_capabilities_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSCapabilitiesRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_4_0());
				}
				lv_systemInterface_4_0=ruleVSSSSystemInterfaceRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"systemInterface",
						lv_systemInterface_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemInterfaceRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_5_0());
				}
				lv_adaptationMissionization_5_0=ruleVSSSAdaptationMissionizationRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"adaptationMissionization",
						lv_adaptationMissionization_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAdaptationMissionizationRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementsParserRuleCall_6_0());
				}
				lv_computerResource_6_0=ruleVSSSComputerResourceRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"computerResource",
						lv_computerResource_6_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSComputerResourceRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementsParserRuleCall_7_0());
				}
				lv_security_7_0=ruleVSSSSecurityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"security",
						lv_security_7_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSecurityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementsParserRuleCall_8_0());
				}
				lv_safety_8_0=ruleVSSSSafetyRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"safety",
						lv_safety_8_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSafetyRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabilityAvailabilityVSSSReliabilityAvailabilityRequirementsParserRuleCall_9_0());
				}
				lv_reliabilityAvailability_9_0=ruleVSSSReliabilityAvailabilityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"reliabilityAvailability",
						lv_reliabilityAvailability_9_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReliabilityAvailabilityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementsParserRuleCall_10_0());
				}
				lv_quality_10_0=ruleVSSSQualityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"quality",
						lv_quality_10_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSQualityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementsParserRuleCall_11_0());
				}
				lv_design_11_0=ruleVSSSDesignRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"design",
						lv_design_11_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDesignRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_12_0());
				}
				lv_softwareOperations_12_0=ruleVSSSSoftwareOperationsRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"softwareOperations",
						lv_softwareOperations_12_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareOperationsRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_13_0());
				}
				lv_softwareMaintenance_13_0=ruleVSSSSoftwareMaintenanceRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"softwareMaintenance",
						lv_softwareMaintenance_13_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareMaintenanceRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_14_0());
				}
				lv_systemSoftwareObservability_14_0=ruleVSSSSystemSoftwareObservabilityRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
					}
					set(
						$current,
						"systemSoftwareObservability",
						lv_systemSoftwareObservability_14_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemSoftwareObservabilityRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='</SpecificRequirements>'
		{
			newLeafNode(otherlv_15, grammarAccess.getVSSSSpecificRequirementsAccess().getSpecificRequirementsKeyword_15());
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
					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_1_0());
				}
				lv_sectionDescription_1_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_2_0());
				}
				lv_verificationValidationProcess_2_0=ruleVSSSVerificationValidationProcessRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
					}
					set(
						$current,
						"verificationValidationProcess",
						lv_verificationValidationProcess_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationProcessRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_3_0());
				}
				lv_validationApproach_3_0=ruleVSSSValidationApproach
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
					}
					set(
						$current,
						"validationApproach",
						lv_validationApproach_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationApproach");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementsParserRuleCall_4_0());
				}
				lv_validation_4_0=ruleVSSSValidationRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
					}
					set(
						$current,
						"validation",
						lv_validation_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementsParserRuleCall_5_0());
				}
				lv_verification_5_0=ruleVSSSVerificationRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
					}
					set(
						$current,
						"verification",
						lv_verification_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='</VerificationValidationIntegrationRequirements>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationIntegrationRequirementsKeyword_6());
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

// Entry rule entryRuleVSSSInstantiableRequirementSection
entryRuleVSSSInstantiableRequirementSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSInstantiableRequirementSectionRule()); }
	iv_ruleVSSSInstantiableRequirementSection=ruleVSSSInstantiableRequirementSection
	{ $current=$iv_ruleVSSSInstantiableRequirementSection.current; }
	EOF;

// Rule VSSSInstantiableRequirementSection
ruleVSSSInstantiableRequirementSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<subsection'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSubsectionKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSInstantiableRequirementSectionAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSSSInstantiableRequirementSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSInstantiableRequirementSectionRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSSSInstantiableRequirementSectionAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSectionDescriptionDBodyParserRuleCall_4_0());
				}
				lv_sectionDescription_4_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSInstantiableRequirementSectionRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_0());
				}
				lv_sssItems_5_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSInstantiableRequirementSectionRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='</subsection>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSubsectionKeyword_6());
		}
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
					newCompositeNode(grammarAccess.getVSSSGeneralRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</GeneralRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSGeneralRequirementsAccess().getGeneralRequirementsKeyword_5());
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
					newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSCapabilitiesRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSCapabilitiesRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSCapabilitiesRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</CapabilitiesRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSCapabilitiesRequirementsAccess().getCapabilitiesRequirementsKeyword_5());
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
					newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemInterfaceRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemInterfaceRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemInterfaceRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SystemInterfaceRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSystemInterfaceRequirementsKeyword_5());
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
		otherlv_1='<AdaptationMissionizationRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getAdaptationMissionizationRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSAdaptationMissionizationRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSAdaptationMissionizationRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSAdaptationMissionizationRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</AdaptationMissionizationRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getAdaptationMissionizationRequirementsKeyword_5());
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
					newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSComputerResourceRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSComputerResourceRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSComputerResourceRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</ComputerResourceRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSComputerResourceRequirementsAccess().getComputerResourceRequirementsKeyword_5());
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
					newCompositeNode(grammarAccess.getVSSSSecurityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSecurityRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSecurityRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSecurityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSecurityRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SecurityRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSSecurityRequirementsAccess().getSecurityRequirementsKeyword_5());
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
					newCompositeNode(grammarAccess.getVSSSSafetyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSafetyRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSafetyRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSafetyRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSafetyRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SafetyRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSSafetyRequirementsAccess().getSafetyRequirementsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSSSReliabilityAvailabilityRequirements
entryRuleVSSSReliabilityAvailabilityRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSReliabilityAvailabilityRequirementsRule()); }
	iv_ruleVSSSReliabilityAvailabilityRequirements=ruleVSSSReliabilityAvailabilityRequirements
	{ $current=$iv_ruleVSSSReliabilityAvailabilityRequirements.current; }
	EOF;

// Rule VSSSReliabilityAvailabilityRequirements
ruleVSSSReliabilityAvailabilityRequirements returns [EObject current=null]
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
					grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getVSSSReliabilityAvailabilityRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<ReliabilityAvailabilityRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getReliabilityAvailabilityRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
				}
				lv_sssItems_2_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSReliabilityAvailabilityRequirementsRule());
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
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_3_0());
				}
				lv_sectionDescription_3_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSReliabilityAvailabilityRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSReliabilityAvailabilityRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</ReliabilityAvailabilityRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getReliabilityAvailabilityRequirementsKeyword_5());
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
					newCompositeNode(grammarAccess.getVSSSQualityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSQualityRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSQualityRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSQualityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSQualityRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</QualityRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSQualityRequirementsAccess().getQualityRequirementsKeyword_5());
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
					newCompositeNode(grammarAccess.getVSSSDesignRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDesignRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDesignRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDesignRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDesignRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</DesignRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSDesignRequirementsAccess().getDesignRequirementsKeyword_5());
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
					newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSoftwareOperationsRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSoftwareOperationsRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSoftwareOperationsRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SoftwareOperationsRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSoftwareOperationsRequirementsKeyword_5());
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
					newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSoftwareMaintenanceRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSoftwareMaintenanceRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSoftwareMaintenanceRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SoftwareMaintenanceRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSoftwareMaintenanceRequirementsKeyword_5());
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
					newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
				}
				lv_sectionDescription_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsRule());
					}
					set(
						$current,
						"sectionDescription",
						lv_sectionDescription_2_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
				}
				lv_sssItems_3_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
				}
				lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</SystemSoftwareObservabilityRequirements>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSystemSoftwareObservabilityRequirementsKeyword_5());
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
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSDocumentItemAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSSSDocumentItemAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDocumentItemRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSSSDocumentItemAccess().getValidationMethodKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentItemAccess().getValidationMethodVValidationMethodEnumRuleCall_4_0());
				}
				lv_validationMethod_4_0=ruleVValidationMethod
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentItemRule());
					}
					set(
						$current,
						"validationMethod",
						lv_validationMethod_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VValidationMethod");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSDocumentItemAccess().getGreaterThanSignKeyword_5());
		}
		otherlv_6='<description>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSSSDocumentItemAccess().getDescriptionKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentItemAccess().getDescriptionDBodyParserRuleCall_7_0());
				}
				lv_description_7_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentItemRule());
					}
					set(
						$current,
						"description",
						lv_description_7_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='</description>'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSDocumentItemAccess().getDescriptionKeyword_8());
		}
		(
			otherlv_9='<extendedDescription>'
			{
				newLeafNode(otherlv_9, grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionKeyword_9_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionDBodyParserRuleCall_9_1_0());
					}
					lv_extendedDescription_10_0=ruleDBody
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSDocumentItemRule());
						}
						set(
							$current,
							"extendedDescription",
							lv_extendedDescription_10_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_11='</extendedDescription>'
			{
				newLeafNode(otherlv_11, grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionKeyword_9_2());
			}
		)?
		otherlv_12='</Item>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSSSDocumentItemAccess().getItemKeyword_10());
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
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0());
				}
				lv_sssRequirementSubsections_3_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationProcessRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='</VerificationValidationProcessRequirements>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVerificationValidationProcessRequirementsKeyword_4());
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
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSValidationApproachAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0());
				}
				lv_sssRequirementSubsections_3_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSValidationApproachRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='</ValidationApproach>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSSSValidationApproachAccess().getValidationApproachKeyword_4());
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
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSValidationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0());
				}
				lv_sssRequirementSubsections_3_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSValidationRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='</ValidationRequirements>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSSSValidationRequirementsAccess().getValidationRequirementsKeyword_4());
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
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0());
				}
				lv_sssRequirementSubsections_3_0=ruleVSSSInstantiableRequirementSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationRequirementsRule());
					}
					add(
						$current,
						"sssRequirementSubsections",
						lv_sssRequirementSubsections_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='</VerificationRequirements>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSSSVerificationRequirementsAccess().getVerificationRequirementsKeyword_4());
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
