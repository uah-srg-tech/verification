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
grammar InternalSVS;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.svs.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.svs.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.micobs.svm.lang.svs.services.SVSGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private SVSGrammarAccess grammarAccess;

    public InternalSVSParser(TokenStream input, SVSGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "VSVSDocument";
   	}

   	@Override
   	protected SVSGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleVSVSDocument
entryRuleVSVSDocument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSDocumentRule()); }
	iv_ruleVSVSDocument=ruleVSVSDocument
	{ $current=$iv_ruleVSVSDocument.current; }
	EOF;

// Rule VSVSDocument
ruleVSVSDocument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<SVS'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSDocumentAccess().getSVSKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSDocumentAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSDocumentAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSDocumentRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSDocumentAccess().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVSVSDocumentAccess().getIdSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSDocumentRule());
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
			newLeafNode(otherlv_5, grammarAccess.getVSVSDocumentAccess().getIssueKeyword_5());
		}
		(
			(
				lv_issue_6_0=RULE_STRING
				{
					newLeafNode(lv_issue_6_0, grammarAccess.getVSVSDocumentAccess().getIssueSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSDocumentRule());
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
			newLeafNode(otherlv_7, grammarAccess.getVSVSDocumentAccess().getRevisionKeyword_7());
		}
		(
			(
				lv_revision_8_0=RULE_STRING
				{
					newLeafNode(lv_revision_8_0, grammarAccess.getVSVSDocumentAccess().getRevisionSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSDocumentRule());
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
			newLeafNode(otherlv_9, grammarAccess.getVSVSDocumentAccess().getDateKeyword_9());
		}
		(
			(
				lv_date_10_0=RULE_STRING
				{
					newLeafNode(lv_date_10_0, grammarAccess.getVSVSDocumentAccess().getDateSTRINGTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSDocumentRule());
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
			newLeafNode(otherlv_11, grammarAccess.getVSVSDocumentAccess().getGreaterThanSignKeyword_11());
		}
		(
			otherlv_12='<parent'
			{
				newLeafNode(otherlv_12, grammarAccess.getVSVSDocumentAccess().getParentKeyword_12_0());
			}
			otherlv_13='name='
			{
				newLeafNode(otherlv_13, grammarAccess.getVSVSDocumentAccess().getNameKeyword_12_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSDocumentRule());
						}
					}
					otherlv_14=RULE_STRING
					{
						newLeafNode(otherlv_14, grammarAccess.getVSVSDocumentAccess().getParentsVTraceableDocumentCrossReference_12_2_0());
					}
				)
			)
			otherlv_15='/>'
			{
				newLeafNode(otherlv_15, grammarAccess.getVSVSDocumentAccess().getSolidusGreaterThanSignKeyword_12_3());
			}
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getIntroductionSectionVSVSIntroductionParserRuleCall_13_0());
				}
				lv_introductionSection_16_0=ruleVSVSIntroduction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"introductionSection",
						lv_introductionSection_16_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSIntroduction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getApplicableDocumentsSectionVSVSApplicableDocumentsParserRuleCall_14_0());
				}
				lv_applicableDocumentsSection_17_0=ruleVSVSApplicableDocuments
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"applicableDocumentsSection",
						lv_applicableDocumentsSection_17_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSApplicableDocuments");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getReferenceDocumentsSectionVSVSReferenceDocumentsParserRuleCall_15_0());
				}
				lv_referenceDocumentsSection_18_0=ruleVSVSReferenceDocuments
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"referenceDocumentsSection",
						lv_referenceDocumentsSection_18_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSReferenceDocuments");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSVSTermsDefinitionsAbbreviationsParserRuleCall_16_0());
				}
				lv_termsDefinitionsAbbreviationsSection_19_0=ruleVSVSTermsDefinitionsAbbreviations
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"termsDefinitionsAbbreviationsSection",
						lv_termsDefinitionsAbbreviationsSection_19_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTermsDefinitionsAbbreviations");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getSoftwareOverviewSectionVSVSSoftwareOverviewParserRuleCall_17_0());
				}
				lv_softwareOverviewSection_20_0=ruleVSVSSoftwareOverview
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"softwareOverviewSection",
						lv_softwareOverviewSection_20_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSSoftwareOverview");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getTaskIdentificationSectionVSVSTaskIdentificationParserRuleCall_18_0());
				}
				lv_taskIdentificationSection_21_0=ruleVSVSTaskIdentification
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"taskIdentificationSection",
						lv_taskIdentificationSection_21_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTaskIdentification");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getTestingSpecificationDesignSectionVSVSTestingSpecificationDesignParserRuleCall_19_0());
				}
				lv_testingSpecificationDesignSection_22_0=ruleVSVSTestingSpecificationDesign
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"testingSpecificationDesignSection",
						lv_testingSpecificationDesignSection_22_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestingSpecificationDesign");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getTestCasesSectionVSVSTestCasesParserRuleCall_20_0());
				}
				lv_testCasesSection_23_0=ruleVSVSTestCases
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"testCasesSection",
						lv_testCasesSection_23_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestCases");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getTestProceduresSectionVSVSTestProceduresParserRuleCall_21_0());
				}
				lv_testProceduresSection_24_0=ruleVSVSTestProcedures
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"testProceduresSection",
						lv_testProceduresSection_24_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestProcedures");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getAnalysisInspectionReviewSectionVSVSAnalysisInspectionReviewParserRuleCall_22_0());
				}
				lv_analysisInspectionReviewSection_25_0=ruleVSVSAnalysisInspectionReview
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"analysisInspectionReviewSection",
						lv_analysisInspectionReviewSection_25_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSAnalysisInspectionReview");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getTestPlatformRequirementsSectionVSVSTestPlatformRequirementsParserRuleCall_23_0());
				}
				lv_testPlatformRequirementsSection_26_0=ruleVSVSTestPlatformRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"testPlatformRequirementsSection",
						lv_testPlatformRequirementsSection_26_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestPlatformRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDocumentAccess().getAdditionalInformationSectionVSVSAdditionalInformationParserRuleCall_24_0());
				}
				lv_additionalInformationSection_27_0=ruleVSVSAdditionalInformation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDocumentRule());
					}
					set(
						$current,
						"additionalInformationSection",
						lv_additionalInformationSection_27_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSAdditionalInformation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_28='</SVS>'
		{
			newLeafNode(otherlv_28, grammarAccess.getVSVSDocumentAccess().getSVSKeyword_25());
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBodyContent");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DParagraphContent");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DParagraph");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DListContent");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DListItem");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DListItem");
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
			otherlv_1='bold="true"'
			{
				newLeafNode(otherlv_1, grammarAccess.getDRunAccess().getBoldTrueKeyword_1());
			}
		)?
		(
			otherlv_2='italics="true"'
			{
				newLeafNode(otherlv_2, grammarAccess.getDRunAccess().getItalicsTrueKeyword_2());
			}
		)?
		(
			otherlv_3='underline="true"'
			{
				newLeafNode(otherlv_3, grammarAccess.getDRunAccess().getUnderlineTrueKeyword_3());
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DText");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRun");
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
					"es.uah.aut.srg.micobs.svm.lang.svs.SVS.RUNTEXT");
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
		(
			otherlv_5='caption='
			{
				newLeafNode(otherlv_5, grammarAccess.getDFigureFromFileAccess().getCaptionKeyword_5_0());
			}
			(
				(
					lv_caption_6_0=RULE_STRING
					{
						newLeafNode(lv_caption_6_0, grammarAccess.getDFigureFromFileAccess().getCaptionSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDFigureFromFileRule());
						}
						setWithLastConsumed(
							$current,
							"caption",
							lv_caption_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getDFigureFromFileAccess().getSolidusGreaterThanSignKeyword_6());
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
		(
			otherlv_5='caption='
			{
				newLeafNode(otherlv_5, grammarAccess.getDTableFromFileAccess().getCaptionKeyword_5_0());
			}
			(
				(
					lv_caption_6_0=RULE_STRING
					{
						newLeafNode(lv_caption_6_0, grammarAccess.getDTableFromFileAccess().getCaptionSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDTableFromFileRule());
						}
						setWithLastConsumed(
							$current,
							"caption",
							lv_caption_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getDTableFromFileAccess().getSolidusGreaterThanSignKeyword_6());
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
			otherlv_3='caption='
			{
				newLeafNode(otherlv_3, grammarAccess.getDBasicTableAccess().getCaptionKeyword_3_0());
			}
			(
				(
					lv_caption_4_0=RULE_STRING
					{
						newLeafNode(lv_caption_4_0, grammarAccess.getDBasicTableAccess().getCaptionSTRINGTerminalRuleCall_3_1_0());
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
		)?
		otherlv_5='>'
		{
			newLeafNode(otherlv_5, grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_5_0());
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRow");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='</basicTable>'
		{
			newLeafNode(otherlv_7, grammarAccess.getDBasicTableAccess().getBasicTableKeyword_6());
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DColumn");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DCell");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBodyContent");
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

// Entry rule entryRuleVSVSFixedSection
entryRuleVSVSFixedSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSFixedSectionRule()); }
	iv_ruleVSVSFixedSection=ruleVSVSFixedSection
	{ $current=$iv_ruleVSVSFixedSection.current; }
	EOF;

// Rule VSVSFixedSection
ruleVSVSFixedSection returns [EObject current=null]
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
					grammarAccess.getVSVSFixedSectionAccess().getVSVSFixedSectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSFixedSectionAccess().getBodyDBodyParserRuleCall_1_0());
				}
				lv_body_1_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSFixedSectionRule());
					}
					set(
						$current,
						"body",
						lv_body_1_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSFixedSectionAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_2_0());
				}
				lv_svsInstatiableSubsections_2_0=ruleVSVSInstantiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSFixedSectionRule());
					}
					add(
						$current,
						"svsInstatiableSubsections",
						lv_svsInstatiableSubsections_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSInstantiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleVSVSInstantiableSection
entryRuleVSVSInstantiableSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSInstantiableSectionRule()); }
	iv_ruleVSVSInstantiableSection=ruleVSVSInstantiableSection
	{ $current=$iv_ruleVSVSInstantiableSection.current; }
	EOF;

// Rule VSVSInstantiableSection
ruleVSVSInstantiableSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<subsection'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSInstantiableSectionAccess().getSubsectionKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSInstantiableSectionAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSInstantiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSInstantiableSectionRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSInstantiableSectionAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSInstantiableSectionAccess().getBodyDBodyParserRuleCall_4_0());
				}
				lv_body_4_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSInstantiableSectionRule());
					}
					set(
						$current,
						"body",
						lv_body_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSInstantiableSectionAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_5_0());
				}
				lv_svsInstatiableSubsections_5_0=ruleVSVSInstantiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSInstantiableSectionRule());
					}
					add(
						$current,
						"svsInstatiableSubsections",
						lv_svsInstatiableSubsections_5_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSInstantiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='</subsection>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSVSInstantiableSectionAccess().getSubsectionKeyword_6());
		}
	)
;

// Entry rule entryRuleVSVSIntroduction
entryRuleVSVSIntroduction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSIntroductionRule()); }
	iv_ruleVSVSIntroduction=ruleVSVSIntroduction
	{ $current=$iv_ruleVSVSIntroduction.current; }
	EOF;

// Rule VSVSIntroduction
ruleVSVSIntroduction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Introduction>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSIntroductionAccess().getIntroductionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSIntroductionAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_1_0());
				}
				lv_svsInstatiableSubsections_1_0=ruleVSVSInstantiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSIntroductionRule());
					}
					add(
						$current,
						"svsInstatiableSubsections",
						lv_svsInstatiableSubsections_1_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSInstantiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</Introduction>'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSVSIntroductionAccess().getIntroductionKeyword_2());
		}
	)
;

// Entry rule entryRuleVSVSApplicableDocuments
entryRuleVSVSApplicableDocuments returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSApplicableDocumentsRule()); }
	iv_ruleVSVSApplicableDocuments=ruleVSVSApplicableDocuments
	{ $current=$iv_ruleVSVSApplicableDocuments.current; }
	EOF;

// Rule VSVSApplicableDocuments
ruleVSVSApplicableDocuments returns [EObject current=null]
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
					grammarAccess.getVSVSApplicableDocumentsAccess().getVSVSApplicableDocumentsAction_0(),
					$current);
			}
		)
		otherlv_1='<ApplicableDocuments>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0());
				}
				lv_applicableDocuments_2_0=ruleDApplicableDocument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSApplicableDocumentsRule());
					}
					add(
						$current,
						"applicableDocuments",
						lv_applicableDocuments_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DApplicableDocument");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ApplicableDocuments>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSVSReferenceDocuments
entryRuleVSVSReferenceDocuments returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSReferenceDocumentsRule()); }
	iv_ruleVSVSReferenceDocuments=ruleVSVSReferenceDocuments
	{ $current=$iv_ruleVSVSReferenceDocuments.current; }
	EOF;

// Rule VSVSReferenceDocuments
ruleVSVSReferenceDocuments returns [EObject current=null]
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
					grammarAccess.getVSVSReferenceDocumentsAccess().getVSVSReferenceDocumentsAction_0(),
					$current);
			}
		)
		otherlv_1='<ReferenceDocuments>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0());
				}
				lv_referenceDocuments_2_0=ruleDReferenceDocument
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSReferenceDocumentsRule());
					}
					add(
						$current,
						"referenceDocuments",
						lv_referenceDocuments_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DReferenceDocument");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='</ReferenceDocuments>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSVSTermsDefinitionsAbbreviations
entryRuleVSVSTermsDefinitionsAbbreviations returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSTermsDefinitionsAbbreviationsRule()); }
	iv_ruleVSVSTermsDefinitionsAbbreviations=ruleVSVSTermsDefinitionsAbbreviations
	{ $current=$iv_ruleVSVSTermsDefinitionsAbbreviations.current; }
	EOF;

// Rule VSVSTermsDefinitionsAbbreviations
ruleVSVSTermsDefinitionsAbbreviations returns [EObject current=null]
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
					grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getVSVSTermsDefinitionsAbbreviationsAction_0(),
					$current);
			}
		)
		otherlv_1='<TermsDefinitionsAbbreviations>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsVSVSTermParserRuleCall_2_0());
				}
				lv_terms_2_0=ruleVSVSTerm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTermsDefinitionsAbbreviationsRule());
					}
					add(
						$current,
						"terms",
						lv_terms_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTerm");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSVSDefinitionParserRuleCall_3_0());
				}
				lv_definitions_3_0=ruleVSVSDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTermsDefinitionsAbbreviationsRule());
					}
					add(
						$current,
						"definitions",
						lv_definitions_3_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSVSAbbreviationParserRuleCall_4_0());
				}
				lv_abbreviations_4_0=ruleVSVSAbbreviation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTermsDefinitionsAbbreviationsRule());
					}
					add(
						$current,
						"abbreviations",
						lv_abbreviations_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSAbbreviation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='</TermsDefinitionsAbbreviations>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSSoftwareOverview
entryRuleVSVSSoftwareOverview returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSSoftwareOverviewRule()); }
	iv_ruleVSVSSoftwareOverview=ruleVSVSSoftwareOverview
	{ $current=$iv_ruleVSVSSoftwareOverview.current; }
	EOF;

// Rule VSVSSoftwareOverview
ruleVSVSSoftwareOverview returns [EObject current=null]
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
					grammarAccess.getVSVSSoftwareOverviewAccess().getVSVSSoftwareOverviewAction_0(),
					$current);
			}
		)
		otherlv_1='<SoftwareOverview>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSSoftwareOverviewAccess().getSoftwareOverviewKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSSoftwareOverviewAccess().getBodyDBodyParserRuleCall_2_0());
				}
				lv_body_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSSoftwareOverviewRule());
					}
					set(
						$current,
						"body",
						lv_body_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSSoftwareOverviewAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0());
				}
				lv_svsInstatiableSubsections_3_0=ruleVSVSInstantiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSSoftwareOverviewRule());
					}
					add(
						$current,
						"svsInstatiableSubsections",
						lv_svsInstatiableSubsections_3_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSInstantiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='</SoftwareOverview>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSVSSoftwareOverviewAccess().getSoftwareOverviewKeyword_4());
		}
	)
;

// Entry rule entryRuleVSVSTaskIdentification
entryRuleVSVSTaskIdentification returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSTaskIdentificationRule()); }
	iv_ruleVSVSTaskIdentification=ruleVSVSTaskIdentification
	{ $current=$iv_ruleVSVSTaskIdentification.current; }
	EOF;

// Rule VSVSTaskIdentification
ruleVSVSTaskIdentification returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TaskIdentification>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSTaskIdentificationAccess().getTaskIdentificationKeyword_0());
		}
		otherlv_1='<TaskCriteria>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaVSVSFixedSectionParserRuleCall_2_0());
				}
				lv_taskCriteria_2_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTaskIdentificationRule());
					}
					set(
						$current,
						"taskCriteria",
						lv_taskCriteria_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='</TaskCriteria>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaKeyword_3());
		}
		otherlv_4='<FeaturesToBeTested>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedVSVSFixedSectionParserRuleCall_5_0());
				}
				lv_featuresToBeTested_5_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTaskIdentificationRule());
					}
					set(
						$current,
						"featuresToBeTested",
						lv_featuresToBeTested_5_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='</FeaturesToBeTested>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedKeyword_6());
		}
		otherlv_7='<FeaturesNotToBeTested>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedVSVSFixedSectionParserRuleCall_8_0());
				}
				lv_featuresNotToBeTested_8_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTaskIdentificationRule());
					}
					set(
						$current,
						"featuresNotToBeTested",
						lv_featuresNotToBeTested_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='</FeaturesNotToBeTested>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedKeyword_9());
		}
		otherlv_10='<TestPassFailCriteria>'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaVSVSFixedSectionParserRuleCall_11_0());
				}
				lv_testPassFailCriteria_11_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTaskIdentificationRule());
					}
					set(
						$current,
						"testPassFailCriteria",
						lv_testPassFailCriteria_11_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='</TestPassFailCriteria>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaKeyword_12());
		}
		otherlv_13='<ItemsCanNotBeValidated>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedVSVSFixedSectionParserRuleCall_14_0());
				}
				lv_itemsCanNotBeValidated_14_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTaskIdentificationRule());
					}
					set(
						$current,
						"itemsCanNotBeValidated",
						lv_itemsCanNotBeValidated_14_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='</ItemsCanNotBeValidated>'
		{
			newLeafNode(otherlv_15, grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedKeyword_15());
		}
		otherlv_16='<ManuallyAutoGeneratedCode>'
		{
			newLeafNode(otherlv_16, grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeVSVSFixedSectionParserRuleCall_17_0());
				}
				lv_manuallyAutoGeneratedCode_17_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTaskIdentificationRule());
					}
					set(
						$current,
						"manuallyAutoGeneratedCode",
						lv_manuallyAutoGeneratedCode_17_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_18='</ManuallyAutoGeneratedCode>'
		{
			newLeafNode(otherlv_18, grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeKeyword_18());
		}
		otherlv_19='</TaskIdentification>'
		{
			newLeafNode(otherlv_19, grammarAccess.getVSVSTaskIdentificationAccess().getTaskIdentificationKeyword_19());
		}
	)
;

// Entry rule entryRuleVSVSTestingSpecificationDesign
entryRuleVSVSTestingSpecificationDesign returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSTestingSpecificationDesignRule()); }
	iv_ruleVSVSTestingSpecificationDesign=ruleVSVSTestingSpecificationDesign
	{ $current=$iv_ruleVSVSTestingSpecificationDesign.current; }
	EOF;

// Rule VSVSTestingSpecificationDesign
ruleVSVSTestingSpecificationDesign returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TestingSpecificationDesign>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestingSpecificationDesignKeyword_0());
		}
		otherlv_1='<General>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralVSVSFixedSectionParserRuleCall_2_0());
				}
				lv_general_2_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestingSpecificationDesignRule());
					}
					set(
						$current,
						"general",
						lv_general_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='</General>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsVSVSTestDesignParserRuleCall_4_0());
				}
				lv_testDesigns_4_0=ruleVSVSTestDesign
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestingSpecificationDesignRule());
					}
					add(
						$current,
						"testDesigns",
						lv_testDesigns_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestDesign");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='</TestingSpecificationDesign>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestingSpecificationDesignKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSTestCases
entryRuleVSVSTestCases returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSTestCasesRule()); }
	iv_ruleVSVSTestCases=ruleVSVSTestCases
	{ $current=$iv_ruleVSVSTestCases.current; }
	EOF;

// Rule VSVSTestCases
ruleVSVSTestCases returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TestCases>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSTestCasesAccess().getTestCasesKeyword_0());
		}
		otherlv_1='<General>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSTestCasesAccess().getGeneralKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestCasesAccess().getGeneralVSVSFixedSectionParserRuleCall_2_0());
				}
				lv_general_2_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCasesRule());
					}
					set(
						$current,
						"general",
						lv_general_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='</General>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSTestCasesAccess().getGeneralKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestCasesAccess().getTestCasesVSVSTestCaseParserRuleCall_4_0());
				}
				lv_testCases_4_0=ruleVSVSTestCase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCasesRule());
					}
					add(
						$current,
						"testCases",
						lv_testCases_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestCase");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='</TestCases>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSTestCasesAccess().getTestCasesKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSTestProcedures
entryRuleVSVSTestProcedures returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSTestProceduresRule()); }
	iv_ruleVSVSTestProcedures=ruleVSVSTestProcedures
	{ $current=$iv_ruleVSVSTestProcedures.current; }
	EOF;

// Rule VSVSTestProcedures
ruleVSVSTestProcedures returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TestProcedures>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSTestProceduresAccess().getTestProceduresKeyword_0());
		}
		otherlv_1='<General>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSTestProceduresAccess().getGeneralKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestProceduresAccess().getGeneralVSVSFixedSectionParserRuleCall_2_0());
				}
				lv_general_2_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestProceduresRule());
					}
					set(
						$current,
						"general",
						lv_general_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='</General>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSTestProceduresAccess().getGeneralKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresVSVSTestProcedureParserRuleCall_4_0());
				}
				lv_testProcedures_4_0=ruleVSVSTestProcedure
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestProceduresRule());
					}
					add(
						$current,
						"testProcedures",
						lv_testProcedures_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestProcedure");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='</TestProcedures>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSTestProceduresAccess().getTestProceduresKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSAnalysisInspectionReview
entryRuleVSVSAnalysisInspectionReview returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSAnalysisInspectionReviewRule()); }
	iv_ruleVSVSAnalysisInspectionReview=ruleVSVSAnalysisInspectionReview
	{ $current=$iv_ruleVSVSAnalysisInspectionReview.current; }
	EOF;

// Rule VSVSAnalysisInspectionReview
ruleVSVSAnalysisInspectionReview returns [EObject current=null]
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
					grammarAccess.getVSVSAnalysisInspectionReviewAccess().getVSVSAnalysisInspectionReviewAction_0(),
					$current);
			}
		)
		otherlv_1='<AnalysisInspectionReview>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSAnalysisInspectionReviewAccess().getAnalysisInspectionReviewKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getBodyDBodyParserRuleCall_2_0());
				}
				lv_body_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSAnalysisInspectionReviewRule());
					}
					set(
						$current,
						"body",
						lv_body_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0());
				}
				lv_svsInstatiableSubsections_3_0=ruleVSVSInstantiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSAnalysisInspectionReviewRule());
					}
					add(
						$current,
						"svsInstatiableSubsections",
						lv_svsInstatiableSubsections_3_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSInstantiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='</AnalysisInspectionReview>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSVSAnalysisInspectionReviewAccess().getAnalysisInspectionReviewKeyword_4());
		}
	)
;

// Entry rule entryRuleVSVSTestPlatformRequirements
entryRuleVSVSTestPlatformRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSTestPlatformRequirementsRule()); }
	iv_ruleVSVSTestPlatformRequirements=ruleVSVSTestPlatformRequirements
	{ $current=$iv_ruleVSVSTestPlatformRequirements.current; }
	EOF;

// Rule VSVSTestPlatformRequirements
ruleVSVSTestPlatformRequirements returns [EObject current=null]
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
					grammarAccess.getVSVSTestPlatformRequirementsAccess().getVSVSTestPlatformRequirementsAction_0(),
					$current);
			}
		)
		otherlv_1='<TestPlatformRequirements>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSTestPlatformRequirementsAccess().getTestPlatformRequirementsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestPlatformRequirementsAccess().getBodyDBodyParserRuleCall_2_0());
				}
				lv_body_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestPlatformRequirementsRule());
					}
					set(
						$current,
						"body",
						lv_body_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestPlatformRequirementsAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0());
				}
				lv_svsInstatiableSubsections_3_0=ruleVSVSInstantiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestPlatformRequirementsRule());
					}
					add(
						$current,
						"svsInstatiableSubsections",
						lv_svsInstatiableSubsections_3_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSInstantiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='</TestPlatformRequirements>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSVSTestPlatformRequirementsAccess().getTestPlatformRequirementsKeyword_4());
		}
	)
;

// Entry rule entryRuleVSVSAdditionalInformation
entryRuleVSVSAdditionalInformation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSAdditionalInformationRule()); }
	iv_ruleVSVSAdditionalInformation=ruleVSVSAdditionalInformation
	{ $current=$iv_ruleVSVSAdditionalInformation.current; }
	EOF;

// Rule VSVSAdditionalInformation
ruleVSVSAdditionalInformation returns [EObject current=null]
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
					grammarAccess.getVSVSAdditionalInformationAccess().getVSVSAdditionalInformationAction_0(),
					$current);
			}
		)
		otherlv_1='<AdditionalInformation>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSAdditionalInformationAccess().getAdditionalInformationKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSAdditionalInformationAccess().getBodyDBodyParserRuleCall_2_0());
				}
				lv_body_2_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSAdditionalInformationRule());
					}
					set(
						$current,
						"body",
						lv_body_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSAdditionalInformationAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0());
				}
				lv_svsInstatiableSubsections_3_0=ruleVSVSInstantiableSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSAdditionalInformationRule());
					}
					add(
						$current,
						"svsInstatiableSubsections",
						lv_svsInstatiableSubsections_3_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSInstantiableSection");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='</AdditionalInformation>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSVSAdditionalInformationAccess().getAdditionalInformationKeyword_4());
		}
	)
;

// Entry rule entryRuleVSVSTerm
entryRuleVSVSTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSTermRule()); }
	iv_ruleVSVSTerm=ruleVSVSTerm
	{ $current=$iv_ruleVSVSTerm.current; }
	EOF;

// Rule VSVSTerm
ruleVSVSTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Term'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSTermAccess().getTermKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSTermAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSTermAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSTermRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSTermAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTermAccess().getDescriptionDRunParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTermRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Term>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSTermAccess().getTermKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSDefinition
entryRuleVSVSDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSDefinitionRule()); }
	iv_ruleVSVSDefinition=ruleVSVSDefinition
	{ $current=$iv_ruleVSVSDefinition.current; }
	EOF;

// Rule VSVSDefinition
ruleVSVSDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Definition'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSDefinitionAccess().getDefinitionKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSDefinitionAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSDefinitionRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSDefinitionAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSDefinitionRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Definition>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSDefinitionAccess().getDefinitionKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSAbbreviation
entryRuleVSVSAbbreviation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSAbbreviationRule()); }
	iv_ruleVSVSAbbreviation=ruleVSVSAbbreviation
	{ $current=$iv_ruleVSVSAbbreviation.current; }
	EOF;

// Rule VSVSAbbreviation
ruleVSVSAbbreviation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Abbreviation'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSAbbreviationAccess().getAbbreviationKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSAbbreviationAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSAbbreviationRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSAbbreviationAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSAbbreviationRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Abbreviation>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSAbbreviationAccess().getAbbreviationKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSTestDesign
entryRuleVSVSTestDesign returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSTestDesignRule()); }
	iv_ruleVSVSTestDesign=ruleVSVSTestDesign
	{ $current=$iv_ruleVSVSTestDesign.current; }
	EOF;

// Rule VSVSTestDesign
ruleVSVSTestDesign returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TestDesign'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSTestDesignAccess().getTestDesignKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSTestDesignAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSTestDesignAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSTestDesignRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSTestDesignAccess().getGreaterThanSignKeyword_3());
		}
		otherlv_4='<General>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSVSTestDesignAccess().getGeneralKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestDesignAccess().getGeneralVSVSFixedSectionParserRuleCall_5_0());
				}
				lv_general_5_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestDesignRule());
					}
					set(
						$current,
						"general",
						lv_general_5_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='</General>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSVSTestDesignAccess().getGeneralKeyword_6());
		}
		otherlv_7='<FeaturesToBeTested>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedVSVSFixedSectionParserRuleCall_8_0());
				}
				lv_featuresToBeTested_8_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestDesignRule());
					}
					set(
						$current,
						"featuresToBeTested",
						lv_featuresToBeTested_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='</FeaturesToBeTested>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedKeyword_9());
		}
		otherlv_10='<ApproachRefinements>'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsVSVSFixedSectionParserRuleCall_11_0());
				}
				lv_approachRefinements_11_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestDesignRule());
					}
					set(
						$current,
						"approachRefinements",
						lv_approachRefinements_11_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='</ApproachRefinements>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsKeyword_12());
		}
		otherlv_13='</TestDesign>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSVSTestDesignAccess().getTestDesignKeyword_13());
		}
	)
;

// Entry rule entryRuleVSVSTestCase
entryRuleVSVSTestCase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSTestCaseRule()); }
	iv_ruleVSVSTestCase=ruleVSVSTestCase
	{ $current=$iv_ruleVSVSTestCase.current; }
	EOF;

// Rule VSVSTestCase
ruleVSVSTestCase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TestCase'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSTestCaseAccess().getTestCaseKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSTestCaseAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSTestCaseAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSTestCaseRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSTestCaseAccess().getGreaterThanSignKeyword_3());
		}
		otherlv_4='<Identifier>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSVSTestCaseAccess().getIdentifierKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getIdentifierVSVSFixedSectionParserRuleCall_5_0());
				}
				lv_identifier_5_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"identifier",
						lv_identifier_5_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='</Identifier>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSVSTestCaseAccess().getIdentifierKeyword_6());
		}
		otherlv_7='<Inputs>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSVSTestCaseAccess().getInputsKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getInputsVSVSFixedSectionParserRuleCall_8_0());
				}
				lv_inputs_8_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"inputs",
						lv_inputs_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='</Inputs>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSTestCaseAccess().getInputsKeyword_9());
		}
		otherlv_10='<Outputs>'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSVSTestCaseAccess().getOutputsKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getOutputsVSVSFixedSectionParserRuleCall_11_0());
				}
				lv_outputs_11_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"outputs",
						lv_outputs_11_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='</Outputs>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSVSTestCaseAccess().getOutputsKeyword_12());
		}
		otherlv_13='<PassFailCriteria>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaVSVSFixedSectionParserRuleCall_14_0());
				}
				lv_passFailCriteria_14_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"passFailCriteria",
						lv_passFailCriteria_14_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='</PassFailCriteria>'
		{
			newLeafNode(otherlv_15, grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaKeyword_15());
		}
		otherlv_16='<EnvironmentalNeeds>'
		{
			newLeafNode(otherlv_16, grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsVSVSFixedSectionParserRuleCall_17_0());
				}
				lv_environmentalNeeds_17_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"environmentalNeeds",
						lv_environmentalNeeds_17_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_18='</EnvironmentalNeeds>'
		{
			newLeafNode(otherlv_18, grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsKeyword_18());
		}
		otherlv_19='<SpecialConstraints>'
		{
			newLeafNode(otherlv_19, grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsKeyword_19());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsVSVSFixedSectionParserRuleCall_20_0());
				}
				lv_specialConstraints_20_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"specialConstraints",
						lv_specialConstraints_20_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21='</SpecialConstraints>'
		{
			newLeafNode(otherlv_21, grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsKeyword_21());
		}
		otherlv_22='<InterfaceDependencies>'
		{
			newLeafNode(otherlv_22, grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesKeyword_22());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesVSVSFixedSectionParserRuleCall_23_0());
				}
				lv_interfaceDependencies_23_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"interfaceDependencies",
						lv_interfaceDependencies_23_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_24='</InterfaceDependencies>'
		{
			newLeafNode(otherlv_24, grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesKeyword_24());
		}
		(
			otherlv_25='<ValidatingItems'
			{
				newLeafNode(otherlv_25, grammarAccess.getVSVSTestCaseAccess().getValidatingItemsKeyword_25_0());
			}
			otherlv_26='name='
			{
				newLeafNode(otherlv_26, grammarAccess.getVSVSTestCaseAccess().getNameKeyword_25_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSTestCaseRule());
						}
					}
					otherlv_27=RULE_STRING
					{
						newLeafNode(otherlv_27, grammarAccess.getVSVSTestCaseAccess().getValidatingItemsVTraceableDocumentAbstractItemCrossReference_25_2_0());
					}
				)
			)
			otherlv_28='/>'
			{
				newLeafNode(otherlv_28, grammarAccess.getVSVSTestCaseAccess().getSolidusGreaterThanSignKeyword_25_3());
			}
		)+
		otherlv_29='</TestCase>'
		{
			newLeafNode(otherlv_29, grammarAccess.getVSVSTestCaseAccess().getTestCaseKeyword_26());
		}
	)
;

// Entry rule entryRuleVSVSTestProcedure
entryRuleVSVSTestProcedure returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSTestProcedureRule()); }
	iv_ruleVSVSTestProcedure=ruleVSVSTestProcedure
	{ $current=$iv_ruleVSVSTestProcedure.current; }
	EOF;

// Rule VSVSTestProcedure
ruleVSVSTestProcedure returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TestProcedure'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSTestProcedureAccess().getTestProcedureKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSTestProcedureAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSTestProcedureAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSTestProcedureRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSTestProcedureAccess().getGreaterThanSignKeyword_3());
		}
		otherlv_4='<Identifier>'
		{
			newLeafNode(otherlv_4, grammarAccess.getVSVSTestProcedureAccess().getIdentifierKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestProcedureAccess().getIdentifierVSVSFixedSectionParserRuleCall_5_0());
				}
				lv_identifier_5_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestProcedureRule());
					}
					set(
						$current,
						"identifier",
						lv_identifier_5_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='</Identifier>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSVSTestProcedureAccess().getIdentifierKeyword_6());
		}
		otherlv_7='<Purpose>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSVSTestProcedureAccess().getPurposeKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestProcedureAccess().getPurposeVSVSFixedSectionParserRuleCall_8_0());
				}
				lv_purpose_8_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestProcedureRule());
					}
					set(
						$current,
						"purpose",
						lv_purpose_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='</Purpose>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSTestProcedureAccess().getPurposeKeyword_9());
		}
		otherlv_10='<Steps>'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSVSTestProcedureAccess().getStepsKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestProcedureAccess().getStepsVSVSProcedureStepParserRuleCall_11_0());
				}
				lv_steps_11_0=ruleVSVSProcedureStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestProcedureRule());
					}
					add(
						$current,
						"steps",
						lv_steps_11_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSProcedureStep");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='</Steps>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSVSTestProcedureAccess().getStepsKeyword_12());
		}
		otherlv_13='<TestScript>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestProcedureAccess().getTestScriptVSVSFixedSectionParserRuleCall_14_0());
				}
				lv_testScript_14_0=ruleVSVSFixedSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestProcedureRule());
					}
					set(
						$current,
						"testScript",
						lv_testScript_14_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSFixedSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='</TestScript>'
		{
			newLeafNode(otherlv_15, grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_15());
		}
		otherlv_16='</TestProcedure>'
		{
			newLeafNode(otherlv_16, grammarAccess.getVSVSTestProcedureAccess().getTestProcedureKeyword_16());
		}
	)
;

// Entry rule entryRuleVSVSProcedureStep
entryRuleVSVSProcedureStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSProcedureStepRule()); }
	iv_ruleVSVSProcedureStep=ruleVSVSProcedureStep
	{ $current=$iv_ruleVSVSProcedureStep.current; }
	EOF;

// Rule VSVSProcedureStep
ruleVSVSProcedureStep returns [EObject current=null]
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
					grammarAccess.getVSVSProcedureStepAccess().getVSVSProcedureStepAction_0(),
					$current);
			}
		)
		otherlv_1='<ProcedureStep'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSProcedureStepAccess().getProcedureStepKeyword_1());
		}
		otherlv_2='/>'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSVSProcedureStepAccess().getSolidusGreaterThanSignKeyword_2());
		}
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
