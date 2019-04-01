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
		otherlv_0='VSSSDocument'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSDocumentAccess().getVSSSDocumentKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSDocumentAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='id'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSDocumentAccess().getIdKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getIdEStringParserRuleCall_4_0());
				}
				lv_id_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='issue'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSDocumentAccess().getIssueKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getIssueEStringParserRuleCall_6_0());
				}
				lv_issue_6_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"issue",
						lv_issue_6_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='revision'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSDocumentAccess().getRevisionKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getRevisionEStringParserRuleCall_8_0());
				}
				lv_revision_8_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"revision",
						lv_revision_8_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='date'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSSSDocumentAccess().getDateKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getDateEStringParserRuleCall_10_0());
				}
				lv_date_10_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"date",
						lv_date_10_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_11='parents'
			{
				newLeafNode(otherlv_11, grammarAccess.getVSSSDocumentAccess().getParentsKeyword_11_0());
			}
			otherlv_12='('
			{
				newLeafNode(otherlv_12, grammarAccess.getVSSSDocumentAccess().getLeftParenthesisKeyword_11_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSSSDocumentRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getVSSSDocumentAccess().getParentsVTraceableDocumentCrossReference_11_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getVSSSDocumentAccess().getCommaKeyword_11_3_0());
				}
				(
					(
						{
							/* */
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getVSSSDocumentRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getVSSSDocumentAccess().getParentsVTraceableDocumentCrossReference_11_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_16=')'
			{
				newLeafNode(otherlv_16, grammarAccess.getVSSSDocumentAccess().getRightParenthesisKeyword_11_4());
			}
		)?
		otherlv_17='introductionSection'
		{
			newLeafNode(otherlv_17, grammarAccess.getVSSSDocumentAccess().getIntroductionSectionKeyword_12());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionVSSSIntroductionParserRuleCall_13_0());
				}
				lv_introductionSection_18_0=ruleVSSSIntroduction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"introductionSection",
						lv_introductionSection_18_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSIntroduction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_19='applicableDocumentsSection'
		{
			newLeafNode(otherlv_19, grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionKeyword_14());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_15_0());
				}
				lv_applicableDocumentsSection_20_0=ruleVSSSApplicableDocuments
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"applicableDocumentsSection",
						lv_applicableDocumentsSection_20_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSApplicableDocuments");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21='referenceDocumentsSection'
		{
			newLeafNode(otherlv_21, grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_17_0());
				}
				lv_referenceDocumentsSection_22_0=ruleVSSSReferenceDocuments
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"referenceDocumentsSection",
						lv_referenceDocumentsSection_22_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReferenceDocuments");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_23='termsDefinitionsAbbreviationsSection'
		{
			newLeafNode(otherlv_23, grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionKeyword_18());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_19_0());
				}
				lv_termsDefinitionsAbbreviationsSection_24_0=ruleVSSSTermsDefinitionsAbbreviations
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"termsDefinitionsAbbreviationsSection",
						lv_termsDefinitionsAbbreviationsSection_24_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSTermsDefinitionsAbbreviations");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25='generalDescriptionSection'
		{
			newLeafNode(otherlv_25, grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_21_0());
				}
				lv_generalDescriptionSection_26_0=ruleVSSSGeneralDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"generalDescriptionSection",
						lv_generalDescriptionSection_26_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescription");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_27='specificRequirementsSection'
		{
			newLeafNode(otherlv_27, grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionKeyword_22());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_23_0());
				}
				lv_specificRequirementsSection_28_0=ruleVSSSSpecificRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"specificRequirementsSection",
						lv_specificRequirementsSection_28_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSpecificRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29='verificationValidationIntegrationSection'
		{
			newLeafNode(otherlv_29, grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_25_0());
				}
				lv_verificationValidationIntegrationSection_30_0=ruleVSSSVerificationValidationIntegrationRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
					}
					set(
						$current,
						"verificationValidationIntegrationSection",
						lv_verificationValidationIntegrationSection_30_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationIntegrationRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_31='systemModelsSection'
			{
				newLeafNode(otherlv_31, grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionKeyword_26_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionVSSSSystemModelsParserRuleCall_26_1_0());
					}
					lv_systemModelsSection_32_0=ruleVSSSSystemModels
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
						}
						set(
							$current,
							"systemModelsSection",
							lv_systemModelsSection_32_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemModels");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getVSSSDocumentAccess().getRightCurlyBracketKeyword_27());
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
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDBodyAccess().getDBody_ImplParserRuleCall_0());
		}
		this_DBody_Impl_0=ruleDBody_Impl
		{
			$current = $this_DBody_Impl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDBodyAccess().getDCellParserRuleCall_1());
		}
		this_DCell_1=ruleDCell
		{
			$current = $this_DCell_1.current;
			afterParserOrEnumRuleCall();
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

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
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
		otherlv_0='VSSSIntroduction'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSIntroductionAccess().getVSSSIntroductionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSIntroductionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='purpose'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSIntroductionAccess().getPurposeKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSIntroductionAccess().getPurposeDBodyParserRuleCall_3_0());
				}
				lv_purpose_3_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSIntroductionRule());
					}
					set(
						$current,
						"purpose",
						lv_purpose_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='objetive'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSSSIntroductionAccess().getObjetiveKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSIntroductionAccess().getObjetiveDBodyParserRuleCall_5_0());
				}
				lv_objetive_5_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSIntroductionRule());
					}
					set(
						$current,
						"objetive",
						lv_objetive_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='content'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSSSIntroductionAccess().getContentKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSIntroductionAccess().getContentDBodyParserRuleCall_7_0());
				}
				lv_content_7_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSIntroductionRule());
					}
					set(
						$current,
						"content",
						lv_content_7_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='reason'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSIntroductionAccess().getReasonKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSIntroductionAccess().getReasonDBodyParserRuleCall_9_0());
				}
				lv_reason_9_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSIntroductionRule());
					}
					set(
						$current,
						"reason",
						lv_reason_9_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSSSIntroductionAccess().getRightCurlyBracketKeyword_10());
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
		otherlv_1='VSSSApplicableDocuments'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSApplicableDocumentsAccess().getVSSSApplicableDocumentsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSApplicableDocumentsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='applicableDocuments'
			{
				newLeafNode(otherlv_3, grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getVSSSApplicableDocumentsAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_3_2_0());
					}
					lv_applicableDocuments_5_0=ruleDApplicableDocument
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSApplicableDocumentsRule());
						}
						add(
							$current,
							"applicableDocuments",
							lv_applicableDocuments_5_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DApplicableDocument");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getVSSSApplicableDocumentsAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_3_3_1_0());
						}
						lv_applicableDocuments_7_0=ruleDApplicableDocument
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSApplicableDocumentsRule());
							}
							add(
								$current,
								"applicableDocuments",
								lv_applicableDocuments_7_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DApplicableDocument");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getVSSSApplicableDocumentsAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSSSApplicableDocumentsAccess().getRightCurlyBracketKeyword_4());
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
		otherlv_1='VSSSReferenceDocuments'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSReferenceDocumentsAccess().getVSSSReferenceDocumentsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSReferenceDocumentsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='referenceDocuments'
			{
				newLeafNode(otherlv_3, grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getVSSSReferenceDocumentsAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_3_2_0());
					}
					lv_referenceDocuments_5_0=ruleDReferenceDocument
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSReferenceDocumentsRule());
						}
						add(
							$current,
							"referenceDocuments",
							lv_referenceDocuments_5_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DReferenceDocument");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getVSSSReferenceDocumentsAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_3_3_1_0());
						}
						lv_referenceDocuments_7_0=ruleDReferenceDocument
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSReferenceDocumentsRule());
							}
							add(
								$current,
								"referenceDocuments",
								lv_referenceDocuments_7_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DReferenceDocument");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getVSSSReferenceDocumentsAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSSSReferenceDocumentsAccess().getRightCurlyBracketKeyword_4());
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
		otherlv_1='VSSSTermsDefinitionsAbbreviations'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getVSSSTermsDefinitionsAbbreviationsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='terms'
			{
				newLeafNode(otherlv_3, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsVSSSTermParserRuleCall_3_2_0());
					}
					lv_terms_5_0=ruleVSSSTerm
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
						}
						add(
							$current,
							"terms",
							lv_terms_5_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSTerm");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsVSSSTermParserRuleCall_3_3_1_0());
						}
						lv_terms_7_0=ruleVSSSTerm
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
							}
							add(
								$current,
								"terms",
								lv_terms_7_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSTerm");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		(
			otherlv_9='definitions'
			{
				newLeafNode(otherlv_9, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsKeyword_4_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSSSDefinitionParserRuleCall_4_2_0());
					}
					lv_definitions_11_0=ruleVSSSDefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
						}
						add(
							$current,
							"definitions",
							lv_definitions_11_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDefinition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSSSDefinitionParserRuleCall_4_3_1_0());
						}
						lv_definitions_13_0=ruleVSSSDefinition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
							}
							add(
								$current,
								"definitions",
								lv_definitions_13_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDefinition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_15='abbreviations'
			{
				newLeafNode(otherlv_15, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsKeyword_5_0());
			}
			otherlv_16='{'
			{
				newLeafNode(otherlv_16, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSSSAbbreviationParserRuleCall_5_2_0());
					}
					lv_abbreviations_17_0=ruleVSSSAbbreviation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
						}
						add(
							$current,
							"abbreviations",
							lv_abbreviations_17_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAbbreviation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_18=','
				{
					newLeafNode(otherlv_18, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSSSAbbreviationParserRuleCall_5_3_1_0());
						}
						lv_abbreviations_19_0=ruleVSSSAbbreviation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
							}
							add(
								$current,
								"abbreviations",
								lv_abbreviations_19_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAbbreviation");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_20='}'
			{
				newLeafNode(otherlv_20, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_6());
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
		otherlv_0='VSSSGeneralDescription'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSGeneralDescriptionAccess().getVSSSGeneralDescriptionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSGeneralDescriptionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='productPerspective'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_3_0());
				}
				lv_productPerspective_3_0=ruleVSSSGeneralDescriptionSubsection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"productPerspective",
						lv_productPerspective_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='generalCapabilites'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitesKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0());
				}
				lv_generalCapabilites_5_0=ruleVSSSGeneralDescriptionSubsection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"generalCapabilites",
						lv_generalCapabilites_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='generalConstraints'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_7_0());
				}
				lv_generalConstraints_7_0=ruleVSSSGeneralDescriptionSubsection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"generalConstraints",
						lv_generalConstraints_7_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='operationalEnvironment'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_9_0());
				}
				lv_operationalEnvironment_9_0=ruleVSSSGeneralDescriptionSubsection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"operationalEnvironment",
						lv_operationalEnvironment_9_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10='assumptionsDependencies'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_11_0());
				}
				lv_assumptionsDependencies_11_0=ruleVSSSGeneralDescriptionSubsection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
					}
					set(
						$current,
						"assumptionsDependencies",
						lv_assumptionsDependencies_11_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSSSGeneralDescriptionAccess().getRightCurlyBracketKeyword_12());
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
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVSSSSpecificRequirementsAccess().getVSSSSpecificRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='VSSSSpecificRequirements'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSpecificRequirementsAccess().getVSSSSpecificRequirementsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='general'
			{
				newLeafNode(otherlv_3, grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementParserRuleCall_3_2_0());
					}
					lv_general_5_0=ruleVSSSGeneralRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"general",
							lv_general_5_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementParserRuleCall_3_3_1_0());
						}
						lv_general_7_0=ruleVSSSGeneralRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"general",
								lv_general_7_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		(
			otherlv_9='capabilities'
			{
				newLeafNode(otherlv_9, grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesKeyword_4_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_2_0());
					}
					lv_capabilities_11_0=ruleVSSSCapabilitiesRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"capabilities",
							lv_capabilities_11_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSCapabilitiesRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_3_1_0());
						}
						lv_capabilities_13_0=ruleVSSSCapabilitiesRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"capabilities",
								lv_capabilities_13_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSCapabilitiesRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_15='systemInterface'
			{
				newLeafNode(otherlv_15, grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceKeyword_5_0());
			}
			otherlv_16='{'
			{
				newLeafNode(otherlv_16, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_2_0());
					}
					lv_systemInterface_17_0=ruleVSSSSystemInterfaceRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"systemInterface",
							lv_systemInterface_17_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemInterfaceRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_18=','
				{
					newLeafNode(otherlv_18, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_3_1_0());
						}
						lv_systemInterface_19_0=ruleVSSSSystemInterfaceRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"systemInterface",
								lv_systemInterface_19_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemInterfaceRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_20='}'
			{
				newLeafNode(otherlv_20, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		(
			otherlv_21='adaptationMissionization'
			{
				newLeafNode(otherlv_21, grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationKeyword_6_0());
			}
			otherlv_22='{'
			{
				newLeafNode(otherlv_22, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_2_0());
					}
					lv_adaptationMissionization_23_0=ruleVSSSAdaptationMissionizationRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"adaptationMissionization",
							lv_adaptationMissionization_23_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAdaptationMissionizationRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_24=','
				{
					newLeafNode(otherlv_24, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_3_1_0());
						}
						lv_adaptationMissionization_25_0=ruleVSSSAdaptationMissionizationRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"adaptationMissionization",
								lv_adaptationMissionization_25_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAdaptationMissionizationRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_26='}'
			{
				newLeafNode(otherlv_26, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		(
			otherlv_27='computerResource'
			{
				newLeafNode(otherlv_27, grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceKeyword_7_0());
			}
			otherlv_28='{'
			{
				newLeafNode(otherlv_28, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_2_0());
					}
					lv_computerResource_29_0=ruleVSSSComputerResourceRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"computerResource",
							lv_computerResource_29_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSComputerResourceRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_30=','
				{
					newLeafNode(otherlv_30, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_7_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_3_1_0());
						}
						lv_computerResource_31_0=ruleVSSSComputerResourceRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"computerResource",
								lv_computerResource_31_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSComputerResourceRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_32='}'
			{
				newLeafNode(otherlv_32, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_7_4());
			}
		)?
		(
			otherlv_33='security'
			{
				newLeafNode(otherlv_33, grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityKeyword_8_0());
			}
			otherlv_34='{'
			{
				newLeafNode(otherlv_34, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_8_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementParserRuleCall_8_2_0());
					}
					lv_security_35_0=ruleVSSSSecurityRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"security",
							lv_security_35_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSecurityRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_36=','
				{
					newLeafNode(otherlv_36, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_8_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementParserRuleCall_8_3_1_0());
						}
						lv_security_37_0=ruleVSSSSecurityRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"security",
								lv_security_37_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSecurityRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_38='}'
			{
				newLeafNode(otherlv_38, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_8_4());
			}
		)?
		(
			otherlv_39='safety'
			{
				newLeafNode(otherlv_39, grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyKeyword_9_0());
			}
			otherlv_40='{'
			{
				newLeafNode(otherlv_40, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_9_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementParserRuleCall_9_2_0());
					}
					lv_safety_41_0=ruleVSSSSafetyRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"safety",
							lv_safety_41_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSafetyRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_42=','
				{
					newLeafNode(otherlv_42, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_9_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementParserRuleCall_9_3_1_0());
						}
						lv_safety_43_0=ruleVSSSSafetyRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"safety",
								lv_safety_43_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSafetyRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_44='}'
			{
				newLeafNode(otherlv_44, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_9_4());
			}
		)?
		(
			otherlv_45='reliabiltyAvailability'
			{
				newLeafNode(otherlv_45, grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityKeyword_10_0());
			}
			otherlv_46='{'
			{
				newLeafNode(otherlv_46, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_2_0());
					}
					lv_reliabiltyAvailability_47_0=ruleVSSSReliabiltyAvailabilityRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"reliabiltyAvailability",
							lv_reliabiltyAvailability_47_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReliabiltyAvailabilityRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_48=','
				{
					newLeafNode(otherlv_48, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_10_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_3_1_0());
						}
						lv_reliabiltyAvailability_49_0=ruleVSSSReliabiltyAvailabilityRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"reliabiltyAvailability",
								lv_reliabiltyAvailability_49_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReliabiltyAvailabilityRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_50='}'
			{
				newLeafNode(otherlv_50, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_10_4());
			}
		)?
		(
			otherlv_51='quality'
			{
				newLeafNode(otherlv_51, grammarAccess.getVSSSSpecificRequirementsAccess().getQualityKeyword_11_0());
			}
			otherlv_52='{'
			{
				newLeafNode(otherlv_52, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementParserRuleCall_11_2_0());
					}
					lv_quality_53_0=ruleVSSSQualityRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"quality",
							lv_quality_53_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSQualityRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_54=','
				{
					newLeafNode(otherlv_54, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_11_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementParserRuleCall_11_3_1_0());
						}
						lv_quality_55_0=ruleVSSSQualityRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"quality",
								lv_quality_55_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSQualityRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_56='}'
			{
				newLeafNode(otherlv_56, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_11_4());
			}
		)?
		(
			otherlv_57='design'
			{
				newLeafNode(otherlv_57, grammarAccess.getVSSSSpecificRequirementsAccess().getDesignKeyword_12_0());
			}
			otherlv_58='{'
			{
				newLeafNode(otherlv_58, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_12_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementParserRuleCall_12_2_0());
					}
					lv_design_59_0=ruleVSSSDesignRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"design",
							lv_design_59_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDesignRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_60=','
				{
					newLeafNode(otherlv_60, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_12_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementParserRuleCall_12_3_1_0());
						}
						lv_design_61_0=ruleVSSSDesignRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"design",
								lv_design_61_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDesignRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_62='}'
			{
				newLeafNode(otherlv_62, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_12_4());
			}
		)?
		(
			otherlv_63='softwareOperations'
			{
				newLeafNode(otherlv_63, grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsKeyword_13_0());
			}
			otherlv_64='{'
			{
				newLeafNode(otherlv_64, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_13_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_2_0());
					}
					lv_softwareOperations_65_0=ruleVSSSSoftwareOperationsRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"softwareOperations",
							lv_softwareOperations_65_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareOperationsRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_66=','
				{
					newLeafNode(otherlv_66, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_13_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_3_1_0());
						}
						lv_softwareOperations_67_0=ruleVSSSSoftwareOperationsRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"softwareOperations",
								lv_softwareOperations_67_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareOperationsRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_68='}'
			{
				newLeafNode(otherlv_68, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_13_4());
			}
		)?
		(
			otherlv_69='softwareMaintenance'
			{
				newLeafNode(otherlv_69, grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceKeyword_14_0());
			}
			otherlv_70='{'
			{
				newLeafNode(otherlv_70, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_2_0());
					}
					lv_softwareMaintenance_71_0=ruleVSSSSoftwareMaintenanceRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"softwareMaintenance",
							lv_softwareMaintenance_71_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareMaintenanceRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_72=','
				{
					newLeafNode(otherlv_72, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_14_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_3_1_0());
						}
						lv_softwareMaintenance_73_0=ruleVSSSSoftwareMaintenanceRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"softwareMaintenance",
								lv_softwareMaintenance_73_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareMaintenanceRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_74='}'
			{
				newLeafNode(otherlv_74, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_14_4());
			}
		)?
		(
			otherlv_75='systemSoftwareObservability'
			{
				newLeafNode(otherlv_75, grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityKeyword_15_0());
			}
			otherlv_76='{'
			{
				newLeafNode(otherlv_76, grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_15_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_2_0());
					}
					lv_systemSoftwareObservability_77_0=ruleVSSSSystemSoftwareObservabilityRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
						}
						add(
							$current,
							"systemSoftwareObservability",
							lv_systemSoftwareObservability_77_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemSoftwareObservabilityRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_78=','
				{
					newLeafNode(otherlv_78, grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_15_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_3_1_0());
						}
						lv_systemSoftwareObservability_79_0=ruleVSSSSystemSoftwareObservabilityRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
							}
							add(
								$current,
								"systemSoftwareObservability",
								lv_systemSoftwareObservability_79_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemSoftwareObservabilityRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_80='}'
			{
				newLeafNode(otherlv_80, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_15_4());
			}
		)?
		otherlv_81='}'
		{
			newLeafNode(otherlv_81, grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_16());
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
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVSSSVerificationValidationIntegrationRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='VSSSVerificationValidationIntegrationRequirements'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVSSSVerificationValidationIntegrationRequirementsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='verificationValidationProcess'
			{
				newLeafNode(otherlv_3, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_2_0());
					}
					lv_verificationValidationProcess_5_0=ruleVSSSVerificationValidationProcessRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
						}
						add(
							$current,
							"verificationValidationProcess",
							lv_verificationValidationProcess_5_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationProcessRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_3_1_0());
						}
						lv_verificationValidationProcess_7_0=ruleVSSSVerificationValidationProcessRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
							}
							add(
								$current,
								"verificationValidationProcess",
								lv_verificationValidationProcess_7_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationProcessRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		(
			otherlv_9='validationApproach'
			{
				newLeafNode(otherlv_9, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachKeyword_4_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_4_2_0());
					}
					lv_validationApproach_11_0=ruleVSSSValidationApproach
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
						}
						add(
							$current,
							"validationApproach",
							lv_validationApproach_11_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationApproach");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_4_3_1_0());
						}
						lv_validationApproach_13_0=ruleVSSSValidationApproach
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
							}
							add(
								$current,
								"validationApproach",
								lv_validationApproach_13_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationApproach");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_15='validation'
			{
				newLeafNode(otherlv_15, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationKeyword_5_0());
			}
			otherlv_16='{'
			{
				newLeafNode(otherlv_16, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementParserRuleCall_5_2_0());
					}
					lv_validation_17_0=ruleVSSSValidationRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
						}
						add(
							$current,
							"validation",
							lv_validation_17_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_18=','
				{
					newLeafNode(otherlv_18, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementParserRuleCall_5_3_1_0());
						}
						lv_validation_19_0=ruleVSSSValidationRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
							}
							add(
								$current,
								"validation",
								lv_validation_19_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_20='}'
			{
				newLeafNode(otherlv_20, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		(
			otherlv_21='verification'
			{
				newLeafNode(otherlv_21, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationKeyword_6_0());
			}
			otherlv_22='{'
			{
				newLeafNode(otherlv_22, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementParserRuleCall_6_2_0());
					}
					lv_verification_23_0=ruleVSSSVerificationRequirement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
						}
						add(
							$current,
							"verification",
							lv_verification_23_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationRequirement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_24=','
				{
					newLeafNode(otherlv_24, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementParserRuleCall_6_3_1_0());
						}
						lv_verification_25_0=ruleVSSSVerificationRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
							}
							add(
								$current,
								"verification",
								lv_verification_25_0,
								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationRequirement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_26='}'
			{
				newLeafNode(otherlv_26, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		otherlv_27='}'
		{
			newLeafNode(otherlv_27, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_7());
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
		otherlv_0='VSSSSystemModels'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSSystemModelsAccess().getVSSSSystemModelsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemModelsAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='systemModels'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSSystemModelsAccess().getSystemModelsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSystemModelsAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsVSSSSystemModelParserRuleCall_4_0());
				}
				lv_systemModels_4_0=ruleVSSSSystemModel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemModelsRule());
					}
					add(
						$current,
						"systemModels",
						lv_systemModels_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemModel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSSystemModelsAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsVSSSSystemModelParserRuleCall_5_1_0());
					}
					lv_systemModels_6_0=ruleVSSSSystemModel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSystemModelsRule());
						}
						add(
							$current,
							"systemModels",
							lv_systemModels_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemModel");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSSystemModelsAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSSystemModelsAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleDBody_Impl
entryRuleDBody_Impl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDBody_ImplRule()); }
	iv_ruleDBody_Impl=ruleDBody_Impl
	{ $current=$iv_ruleDBody_Impl.current; }
	EOF;

// Rule DBody_Impl
ruleDBody_Impl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DBody'
		{
			newLeafNode(otherlv_0, grammarAccess.getDBody_ImplAccess().getDBodyKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDBody_ImplAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bodyContent'
		{
			newLeafNode(otherlv_2, grammarAccess.getDBody_ImplAccess().getBodyContentKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getDBody_ImplAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDBody_ImplAccess().getBodyContentDBodyContentParserRuleCall_4_0());
				}
				lv_bodyContent_4_0=ruleDBodyContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDBody_ImplRule());
					}
					add(
						$current,
						"bodyContent",
						lv_bodyContent_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBodyContent");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getDBody_ImplAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDBody_ImplAccess().getBodyContentDBodyContentParserRuleCall_5_1_0());
					}
					lv_bodyContent_6_0=ruleDBodyContent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDBody_ImplRule());
						}
						add(
							$current,
							"bodyContent",
							lv_bodyContent_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBodyContent");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getDBody_ImplAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getDBody_ImplAccess().getRightCurlyBracketKeyword_7());
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
		otherlv_0='DCell'
		{
			newLeafNode(otherlv_0, grammarAccess.getDCellAccess().getDCellKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDCellAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bodyContent'
		{
			newLeafNode(otherlv_2, grammarAccess.getDCellAccess().getBodyContentKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getDCellAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_4_0());
				}
				lv_bodyContent_4_0=ruleDBodyContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDCellRule());
					}
					add(
						$current,
						"bodyContent",
						lv_bodyContent_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBodyContent");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getDCellAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_5_1_0());
					}
					lv_bodyContent_6_0=ruleDBodyContent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDCellRule());
						}
						add(
							$current,
							"bodyContent",
							lv_bodyContent_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBodyContent");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getDCellAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getDCellAccess().getRightCurlyBracketKeyword_7());
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
		otherlv_0='DParagraph'
		{
			newLeafNode(otherlv_0, grammarAccess.getDParagraphAccess().getDParagraphKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDParagraphAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='paragraphContent'
		{
			newLeafNode(otherlv_2, grammarAccess.getDParagraphAccess().getParagraphContentKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getDParagraphAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_4_0());
				}
				lv_paragraphContent_4_0=ruleDParagraphContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDParagraphRule());
					}
					add(
						$current,
						"paragraphContent",
						lv_paragraphContent_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraphContent");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getDParagraphAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_5_1_0());
					}
					lv_paragraphContent_6_0=ruleDParagraphContent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDParagraphRule());
						}
						add(
							$current,
							"paragraphContent",
							lv_paragraphContent_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraphContent");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getDParagraphAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getDParagraphAccess().getRightCurlyBracketKeyword_7());
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
		otherlv_0='DItemize'
		{
			newLeafNode(otherlv_0, grammarAccess.getDItemizeAccess().getDItemizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDItemizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='items'
		{
			newLeafNode(otherlv_2, grammarAccess.getDItemizeAccess().getItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getDItemizeAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_4_0());
				}
				lv_items_4_0=ruleDListItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDItemizeRule());
					}
					add(
						$current,
						"items",
						lv_items_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getDItemizeAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_5_1_0());
					}
					lv_items_6_0=ruleDListItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDItemizeRule());
						}
						add(
							$current,
							"items",
							lv_items_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getDItemizeAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getDItemizeAccess().getRightCurlyBracketKeyword_7());
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
		otherlv_0='DEnumerate'
		{
			newLeafNode(otherlv_0, grammarAccess.getDEnumerateAccess().getDEnumerateKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDEnumerateAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='items'
		{
			newLeafNode(otherlv_2, grammarAccess.getDEnumerateAccess().getItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getDEnumerateAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_4_0());
				}
				lv_items_4_0=ruleDListItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDEnumerateRule());
					}
					add(
						$current,
						"items",
						lv_items_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getDEnumerateAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_5_1_0());
					}
					lv_items_6_0=ruleDListItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDEnumerateRule());
						}
						add(
							$current,
							"items",
							lv_items_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getDEnumerateAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getDEnumerateAccess().getRightCurlyBracketKeyword_7());
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
		otherlv_0='DColumn'
		{
			newLeafNode(otherlv_0, grammarAccess.getDColumnAccess().getDColumnKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDColumnAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='span'
		{
			newLeafNode(otherlv_2, grammarAccess.getDColumnAccess().getSpanKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDColumnAccess().getSpanEStringParserRuleCall_3_0());
				}
				lv_span_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDColumnRule());
					}
					set(
						$current,
						"span",
						lv_span_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='cells'
		{
			newLeafNode(otherlv_4, grammarAccess.getDColumnAccess().getCellsKeyword_4());
		}
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getDColumnAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDColumnAccess().getCellsDCellParserRuleCall_6_0());
				}
				lv_cells_6_0=ruleDCell
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDColumnRule());
					}
					add(
						$current,
						"cells",
						lv_cells_6_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DCell");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getDColumnAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDColumnAccess().getCellsDCellParserRuleCall_7_1_0());
					}
					lv_cells_8_0=ruleDCell
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDColumnRule());
						}
						add(
							$current,
							"cells",
							lv_cells_8_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DCell");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getDColumnAccess().getRightCurlyBracketKeyword_8());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getDColumnAccess().getRightCurlyBracketKeyword_9());
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
		otherlv_0='DRun'
		{
			newLeafNode(otherlv_0, grammarAccess.getDRunAccess().getDRunKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDRunAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bold'
		{
			newLeafNode(otherlv_2, grammarAccess.getDRunAccess().getBoldKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDRunAccess().getBoldDRunFormatEnableDisableEnumRuleCall_3_0());
				}
				lv_bold_3_0=ruleDRunFormatEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDRunRule());
					}
					set(
						$current,
						"bold",
						lv_bold_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRunFormatEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='italic'
		{
			newLeafNode(otherlv_4, grammarAccess.getDRunAccess().getItalicKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDRunAccess().getItalicDRunFormatEnableDisableEnumRuleCall_5_0());
				}
				lv_italic_5_0=ruleDRunFormatEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDRunRule());
					}
					set(
						$current,
						"italic",
						lv_italic_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRunFormatEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='underscore'
		{
			newLeafNode(otherlv_6, grammarAccess.getDRunAccess().getUnderscoreKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDRunAccess().getUnderscoreDRunFormatEnableDisableEnumRuleCall_7_0());
				}
				lv_underscore_7_0=ruleDRunFormatEnableDisable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDRunRule());
					}
					set(
						$current,
						"underscore",
						lv_underscore_7_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRunFormatEnableDisable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='text'
		{
			newLeafNode(otherlv_8, grammarAccess.getDRunAccess().getTextKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_9_0());
				}
				lv_text_9_0=ruleDText
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDRunRule());
					}
					set(
						$current,
						"text",
						lv_text_9_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DText");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getDRunAccess().getRightCurlyBracketKeyword_10());
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
		otherlv_0='DHyperlink'
		{
			newLeafNode(otherlv_0, grammarAccess.getDHyperlinkAccess().getDHyperlinkKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDHyperlinkAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='reference'
		{
			newLeafNode(otherlv_2, grammarAccess.getDHyperlinkAccess().getReferenceKeyword_2());
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
				{
					newCompositeNode(grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='run'
		{
			newLeafNode(otherlv_4, grammarAccess.getDHyperlinkAccess().getRunKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_5_0());
				}
				lv_run_5_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDHyperlinkRule());
					}
					set(
						$current,
						"run",
						lv_run_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getDHyperlinkAccess().getRightCurlyBracketKeyword_6());
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
		otherlv_0='DText'
		{
			newLeafNode(otherlv_0, grammarAccess.getDTextAccess().getDTextKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDTextAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='content'
		{
			newLeafNode(otherlv_2, grammarAccess.getDTextAccess().getContentKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDTextAccess().getContentEStringParserRuleCall_3_0());
				}
				lv_content_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDTextRule());
					}
					set(
						$current,
						"content",
						lv_content_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getDTextAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDReferenceableObject_Impl
entryRuleDReferenceableObject_Impl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDReferenceableObject_ImplRule()); }
	iv_ruleDReferenceableObject_Impl=ruleDReferenceableObject_Impl
	{ $current=$iv_ruleDReferenceableObject_Impl.current; }
	EOF;

// Rule DReferenceableObject_Impl
ruleDReferenceableObject_Impl returns [EObject current=null]
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
					grammarAccess.getDReferenceableObject_ImplAccess().getDReferenceableObjectAction_0(),
					$current);
			}
		)
		otherlv_1='DReferenceableObject'
		{
			newLeafNode(otherlv_1, grammarAccess.getDReferenceableObject_ImplAccess().getDReferenceableObjectKeyword_1());
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
		otherlv_0='DApplicableDocument'
		{
			newLeafNode(otherlv_0, grammarAccess.getDApplicableDocumentAccess().getDApplicableDocumentKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDApplicableDocumentAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='title'
		{
			newLeafNode(otherlv_2, grammarAccess.getDApplicableDocumentAccess().getTitleKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDApplicableDocumentAccess().getTitleEStringParserRuleCall_3_0());
				}
				lv_title_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDApplicableDocumentRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='issue'
		{
			newLeafNode(otherlv_4, grammarAccess.getDApplicableDocumentAccess().getIssueKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDApplicableDocumentAccess().getIssueEStringParserRuleCall_5_0());
				}
				lv_issue_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDApplicableDocumentRule());
					}
					set(
						$current,
						"issue",
						lv_issue_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='revision'
		{
			newLeafNode(otherlv_6, grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDApplicableDocumentAccess().getRevisionEStringParserRuleCall_7_0());
				}
				lv_revision_7_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDApplicableDocumentRule());
					}
					set(
						$current,
						"revision",
						lv_revision_7_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getDApplicableDocumentAccess().getRightCurlyBracketKeyword_8());
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
		otherlv_0='DReferenceDocument'
		{
			newLeafNode(otherlv_0, grammarAccess.getDReferenceDocumentAccess().getDReferenceDocumentKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDReferenceDocumentAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='title'
		{
			newLeafNode(otherlv_2, grammarAccess.getDReferenceDocumentAccess().getTitleKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDReferenceDocumentAccess().getTitleEStringParserRuleCall_3_0());
				}
				lv_title_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDReferenceDocumentRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='issue'
		{
			newLeafNode(otherlv_4, grammarAccess.getDReferenceDocumentAccess().getIssueKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDReferenceDocumentAccess().getIssueEStringParserRuleCall_5_0());
				}
				lv_issue_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDReferenceDocumentRule());
					}
					set(
						$current,
						"issue",
						lv_issue_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='revision'
		{
			newLeafNode(otherlv_6, grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDReferenceDocumentAccess().getRevisionEStringParserRuleCall_7_0());
				}
				lv_revision_7_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDReferenceDocumentRule());
					}
					set(
						$current,
						"revision",
						lv_revision_7_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getDReferenceDocumentAccess().getRightCurlyBracketKeyword_8());
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
		otherlv_0='DListItem'
		{
			newLeafNode(otherlv_0, grammarAccess.getDListItemAccess().getDListItemKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getDListItemAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='paragraph'
		{
			newLeafNode(otherlv_2, grammarAccess.getDListItemAccess().getParagraphKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getDListItemAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_4_0());
				}
				lv_paragraph_4_0=ruleDParagraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDListItemRule());
					}
					add(
						$current,
						"paragraph",
						lv_paragraph_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraph");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getDListItemAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_5_1_0());
					}
					lv_paragraph_6_0=ruleDParagraph
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDListItemRule());
						}
						add(
							$current,
							"paragraph",
							lv_paragraph_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraph");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getDListItemAccess().getRightCurlyBracketKeyword_6());
		}
		(
			otherlv_8='sublist'
			{
				newLeafNode(otherlv_8, grammarAccess.getDListItemAccess().getSublistKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_7_1_0());
					}
					lv_sublist_9_0=ruleDListContent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDListItemRule());
						}
						set(
							$current,
							"sublist",
							lv_sublist_9_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListContent");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getDListItemAccess().getRightCurlyBracketKeyword_8());
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
		otherlv_0='VSSSTerm'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSTermAccess().getVSSSTermKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSTermAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSTermRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSTermAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='description'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSTermAccess().getDescriptionKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSTermRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getVSSSTermAccess().getDescriptionDParagraphCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSTermAccess().getRightCurlyBracketKeyword_5());
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
		otherlv_0='VSSSDefinition'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSDefinitionAccess().getVSSSDefinitionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDefinitionAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='description'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSDefinitionAccess().getDescriptionKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDefinitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getVSSSDefinitionAccess().getDescriptionDParagraphCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSDefinitionAccess().getRightCurlyBracketKeyword_5());
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
		otherlv_0='VSSSAbbreviation'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSAbbreviationAccess().getVSSSAbbreviationKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSAbbreviationAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSAbbreviationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSAbbreviationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='description'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSAbbreviationAccess().getDescriptionKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSAbbreviationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getVSSSAbbreviationAccess().getDescriptionDParagraphCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSSSAbbreviationAccess().getRightCurlyBracketKeyword_5());
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
		otherlv_0='VSSSGeneralDescriptionSubsection'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getVSSSGeneralDescriptionSubsectionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='body'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyKeyword_2());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSGeneralDescriptionSubsectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyDBodyCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleVSSSGeneralRequirement
entryRuleVSSSGeneralRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSGeneralRequirementRule()); }
	iv_ruleVSSSGeneralRequirement=ruleVSSSGeneralRequirement
	{ $current=$iv_ruleVSSSGeneralRequirement.current; }
	EOF;

// Rule VSSSGeneralRequirement
ruleVSSSGeneralRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSGeneralRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSGeneralRequirementAccess().getVSSSGeneralRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSGeneralRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSGeneralRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSGeneralRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSGeneralRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSGeneralRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSGeneralRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSGeneralRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSCapabilitiesRequirement
entryRuleVSSSCapabilitiesRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementRule()); }
	iv_ruleVSSSCapabilitiesRequirement=ruleVSSSCapabilitiesRequirement
	{ $current=$iv_ruleVSSSCapabilitiesRequirement.current; }
	EOF;

// Rule VSSSCapabilitiesRequirement
ruleVSSSCapabilitiesRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSCapabilitiesRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSCapabilitiesRequirementAccess().getVSSSCapabilitiesRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSCapabilitiesRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSCapabilitiesRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSCapabilitiesRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSCapabilitiesRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSCapabilitiesRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSCapabilitiesRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSCapabilitiesRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSSystemInterfaceRequirement
entryRuleVSSSSystemInterfaceRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementRule()); }
	iv_ruleVSSSSystemInterfaceRequirement=ruleVSSSSystemInterfaceRequirement
	{ $current=$iv_ruleVSSSSystemInterfaceRequirement.current; }
	EOF;

// Rule VSSSSystemInterfaceRequirement
ruleVSSSSystemInterfaceRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSSystemInterfaceRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSSystemInterfaceRequirementAccess().getVSSSSystemInterfaceRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemInterfaceRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSystemInterfaceRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemInterfaceRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSSystemInterfaceRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSystemInterfaceRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSSystemInterfaceRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSSystemInterfaceRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSAdaptationMissionizationRequirement
entryRuleVSSSAdaptationMissionizationRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementRule()); }
	iv_ruleVSSSAdaptationMissionizationRequirement=ruleVSSSAdaptationMissionizationRequirement
	{ $current=$iv_ruleVSSSAdaptationMissionizationRequirement.current; }
	EOF;

// Rule VSSSAdaptationMissionizationRequirement
ruleVSSSAdaptationMissionizationRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSAdaptationMissionizationRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getVSSSAdaptationMissionizationRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSAdaptationMissionizationRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSAdaptationMissionizationRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSComputerResourceRequirement
entryRuleVSSSComputerResourceRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementRule()); }
	iv_ruleVSSSComputerResourceRequirement=ruleVSSSComputerResourceRequirement
	{ $current=$iv_ruleVSSSComputerResourceRequirement.current; }
	EOF;

// Rule VSSSComputerResourceRequirement
ruleVSSSComputerResourceRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSComputerResourceRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSComputerResourceRequirementAccess().getVSSSComputerResourceRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSComputerResourceRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSComputerResourceRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSComputerResourceRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSComputerResourceRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSComputerResourceRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSComputerResourceRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSComputerResourceRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSSecurityRequirement
entryRuleVSSSSecurityRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSecurityRequirementRule()); }
	iv_ruleVSSSSecurityRequirement=ruleVSSSSecurityRequirement
	{ $current=$iv_ruleVSSSSecurityRequirement.current; }
	EOF;

// Rule VSSSSecurityRequirement
ruleVSSSSecurityRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSSecurityRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSSecurityRequirementAccess().getVSSSSecurityRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSecurityRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSecurityRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSecurityRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSSecurityRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSecurityRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSSecurityRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSSecurityRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSSafetyRequirement
entryRuleVSSSSafetyRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSafetyRequirementRule()); }
	iv_ruleVSSSSafetyRequirement=ruleVSSSSafetyRequirement
	{ $current=$iv_ruleVSSSSafetyRequirement.current; }
	EOF;

// Rule VSSSSafetyRequirement
ruleVSSSSafetyRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSSafetyRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSSafetyRequirementAccess().getVSSSSafetyRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSafetyRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSafetyRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSafetyRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSSafetyRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSafetyRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSSafetyRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSSafetyRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSReliabiltyAvailabilityRequirement
entryRuleVSSSReliabiltyAvailabilityRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSReliabiltyAvailabilityRequirementRule()); }
	iv_ruleVSSSReliabiltyAvailabilityRequirement=ruleVSSSReliabiltyAvailabilityRequirement
	{ $current=$iv_ruleVSSSReliabiltyAvailabilityRequirement.current; }
	EOF;

// Rule VSSSReliabiltyAvailabilityRequirement
ruleVSSSReliabiltyAvailabilityRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSReliabiltyAvailabilityRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getVSSSReliabiltyAvailabilityRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSReliabiltyAvailabilityRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSReliabiltyAvailabilityRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSQualityRequirement
entryRuleVSSSQualityRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSQualityRequirementRule()); }
	iv_ruleVSSSQualityRequirement=ruleVSSSQualityRequirement
	{ $current=$iv_ruleVSSSQualityRequirement.current; }
	EOF;

// Rule VSSSQualityRequirement
ruleVSSSQualityRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSQualityRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSQualityRequirementAccess().getVSSSQualityRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSQualityRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSQualityRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSQualityRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSQualityRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSQualityRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSQualityRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSQualityRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSQualityRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSDesignRequirement
entryRuleVSSSDesignRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSDesignRequirementRule()); }
	iv_ruleVSSSDesignRequirement=ruleVSSSDesignRequirement
	{ $current=$iv_ruleVSSSDesignRequirement.current; }
	EOF;

// Rule VSSSDesignRequirement
ruleVSSSDesignRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSDesignRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSDesignRequirementAccess().getVSSSDesignRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSDesignRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSDesignRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSDesignRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDesignRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSDesignRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSDesignRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSDesignRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSDesignRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSSoftwareOperationsRequirement
entryRuleVSSSSoftwareOperationsRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementRule()); }
	iv_ruleVSSSSoftwareOperationsRequirement=ruleVSSSSoftwareOperationsRequirement
	{ $current=$iv_ruleVSSSSoftwareOperationsRequirement.current; }
	EOF;

// Rule VSSSSoftwareOperationsRequirement
ruleVSSSSoftwareOperationsRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSSoftwareOperationsRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getVSSSSoftwareOperationsRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSoftwareOperationsRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSoftwareOperationsRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSSoftwareMaintenanceRequirement
entryRuleVSSSSoftwareMaintenanceRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementRule()); }
	iv_ruleVSSSSoftwareMaintenanceRequirement=ruleVSSSSoftwareMaintenanceRequirement
	{ $current=$iv_ruleVSSSSoftwareMaintenanceRequirement.current; }
	EOF;

// Rule VSSSSoftwareMaintenanceRequirement
ruleVSSSSoftwareMaintenanceRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSSoftwareMaintenanceRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getVSSSSoftwareMaintenanceRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSoftwareMaintenanceRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSoftwareMaintenanceRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSSystemSoftwareObservabilityRequirement
entryRuleVSSSSystemSoftwareObservabilityRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementRule()); }
	iv_ruleVSSSSystemSoftwareObservabilityRequirement=ruleVSSSSystemSoftwareObservabilityRequirement
	{ $current=$iv_ruleVSSSSystemSoftwareObservabilityRequirement.current; }
	EOF;

// Rule VSSSSystemSoftwareObservabilityRequirement
ruleVSSSSystemSoftwareObservabilityRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSSystemSoftwareObservabilityRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getVSSSSystemSoftwareObservabilityRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getRightCurlyBracketKeyword_7());
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
		otherlv_0='VSSSDocumentItem'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSDocumentItemAccess().getVSSSDocumentItemKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSDocumentItemAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSDocumentItemAccess().getIdKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentItemAccess().getIdEStringParserRuleCall_3_0());
				}
				lv_id_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentItemRule());
					}
					set(
						$current,
						"id",
						lv_id_3_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='verificationMethod'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodVVerificationMethodEnumRuleCall_5_0());
				}
				lv_verificationMethod_5_0=ruleVVerificationMethod
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSDocumentItemRule());
					}
					set(
						$current,
						"verificationMethod",
						lv_verificationMethod_5_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VVerificationMethod");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='body'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSSSDocumentItemAccess().getBodyKeyword_6());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSSSDocumentItemRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getVSSSDocumentItemAccess().getBodyDBodyCrossReference_7_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSDocumentItemAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleVSSSVerificationValidationProcessRequirement
entryRuleVSSSVerificationValidationProcessRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSVerificationValidationProcessRequirementRule()); }
	iv_ruleVSSSVerificationValidationProcessRequirement=ruleVSSSVerificationValidationProcessRequirement
	{ $current=$iv_ruleVSSSVerificationValidationProcessRequirement.current; }
	EOF;

// Rule VSSSVerificationValidationProcessRequirement
ruleVSSSVerificationValidationProcessRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSVerificationValidationProcessRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getVSSSVerificationValidationProcessRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationProcessRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationProcessRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getRightCurlyBracketKeyword_7());
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
		otherlv_0='VSSSValidationApproach'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSValidationApproachAccess().getVSSSValidationApproachKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSValidationApproachAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSValidationApproachAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSValidationApproachAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSValidationApproachAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSValidationApproachRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSValidationApproachAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSValidationApproachAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSValidationApproachRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSValidationApproachAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSValidationApproachAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSValidationRequirement
entryRuleVSSSValidationRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSValidationRequirementRule()); }
	iv_ruleVSSSValidationRequirement=ruleVSSSValidationRequirement
	{ $current=$iv_ruleVSSSValidationRequirement.current; }
	EOF;

// Rule VSSSValidationRequirement
ruleVSSSValidationRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSValidationRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSValidationRequirementAccess().getVSSSValidationRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSValidationRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSValidationRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSValidationRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSValidationRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSValidationRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSValidationRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSValidationRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSValidationRequirementAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleVSSSVerificationRequirement
entryRuleVSSSVerificationRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSSSVerificationRequirementRule()); }
	iv_ruleVSSSVerificationRequirement=ruleVSSSVerificationRequirement
	{ $current=$iv_ruleVSSSVerificationRequirement.current; }
	EOF;

// Rule VSSSVerificationRequirement
ruleVSSSVerificationRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VSSSVerificationRequirement'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSSSVerificationRequirementAccess().getVSSSVerificationRequirementKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSVerificationRequirementAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sssItems'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSSSVerificationRequirementAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0());
				}
				lv_sssItems_4_0=ruleVSSSDocumentItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSSSVerificationRequirementRule());
					}
					add(
						$current,
						"sssItems",
						lv_sssItems_4_0,
						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getVSSSVerificationRequirementAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0());
					}
					lv_sssItems_6_0=ruleVSSSDocumentItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSSSVerificationRequirementRule());
						}
						add(
							$current,
							"sssItems",
							lv_sssItems_6_0,
							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSSSVerificationRequirementAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSSSVerificationRequirementAccess().getRightCurlyBracketKeyword_7());
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
		otherlv_1='VSSSSystemModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemModelAccess().getVSSSSystemModelKeyword_1());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleVersion
entryRuleVersion returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVersionRule()); }
	iv_ruleVersion=ruleVersion
	{ $current=$iv_ruleVersion.current.getText(); }
	EOF;

// Rule Version
ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
			}
			    |
			(
				(
					this_INT_1=RULE_INT
					{
						$current.merge(this_INT_1);
					}
					{
						newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());
					}
				)?
				this_ID_2=RULE_ID
				{
					$current.merge(this_ID_2);
				}
				{
					newLeafNode(this_ID_2, grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1());
				}
			)
		)
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
			}
			(
				this_INT_4=RULE_INT
				{
					$current.merge(this_INT_4);
				}
				{
					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
				}
				    |
				(
					(
						this_INT_5=RULE_INT
						{
							$current.merge(this_INT_5);
						}
						{
							newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());
						}
					)?
					this_ID_6=RULE_ID
					{
						$current.merge(this_ID_6);
					}
					{
						newLeafNode(this_ID_6, grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleVersionedQualifiedName
entryRuleVersionedQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVersionedQualifiedNameRule()); }
	iv_ruleVersionedQualifiedName=ruleVersionedQualifiedName
	{ $current=$iv_ruleVersionedQualifiedName.current.getText(); }
	EOF;

// Rule VersionedQualifiedName
ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
		}
		this_Version_2=ruleVersion
		{
			$current.merge(this_Version_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Rule DRunFormatEnableDisable
ruleDRunFormatEnableDisable returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='disabled'
			{
				$current = grammarAccess.getDRunFormatEnableDisableAccess().getDisabledEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDRunFormatEnableDisableAccess().getDisabledEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='enabled'
			{
				$current = grammarAccess.getDRunFormatEnableDisableAccess().getEnabledEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDRunFormatEnableDisableAccess().getEnabledEnumLiteralDeclaration_1());
			}
		)
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
			enumLiteral_0='Analysis'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getAnalysisEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVVerificationMethodAccess().getAnalysisEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Inspection'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getInspectionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVVerificationMethodAccess().getInspectionEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Testing'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getTestingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVVerificationMethodAccess().getTestingEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Review'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getReviewEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getVVerificationMethodAccess().getReviewEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='ModelSimulation'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getModelSimulationEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getVVerificationMethodAccess().getModelSimulationEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='WalkThrough'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getWalkThroughEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getVVerificationMethodAccess().getWalkThroughEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='CrossReading'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getCrossReadingEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getVVerificationMethodAccess().getCrossReadingEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='DeskChecking'
			{
				$current = grammarAccess.getVVerificationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getVVerificationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7());
			}
		)
	)
;

RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
