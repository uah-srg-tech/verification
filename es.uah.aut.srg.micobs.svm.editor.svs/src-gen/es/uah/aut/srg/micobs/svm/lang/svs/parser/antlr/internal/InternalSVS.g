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
import org.eclipse.emf.common.util.Enumerator;
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
				lv_issue_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_issue_6_0, grammarAccess.getVSVSDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"issue",
						lv_issue_6_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_7='revision='
		{
			newLeafNode(otherlv_7, grammarAccess.getVSVSDocumentAccess().getRevisionKeyword_7());
		}
		(
			(
				lv_revision_8_0=RULE_UINT_STRING
				{
					newLeafNode(lv_revision_8_0, grammarAccess.getVSVSDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"revision",
						lv_revision_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DParagraphContent");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DParagraph");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DListContent");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DListItem");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DListItem");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRunAttributes");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRunAttributes");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRunAttributes");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DTab");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DText");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.REAL_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DAlignment");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.REAL_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRow");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DCell");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBodyContent");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
								"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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
								"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
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

// Entry rule entryRuleVSVSTestInfo
entryRuleVSVSTestInfo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSTestInfoRule()); }
	iv_ruleVSVSTestInfo=ruleVSVSTestInfo
	{ $current=$iv_ruleVSVSTestInfo.current; }
	EOF;

// Rule VSVSTestInfo
ruleVSVSTestInfo returns [EObject current=null]
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
					grammarAccess.getVSVSTestInfoAccess().getVSVSTestInfoAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestInfoAccess().getBodyDBodyParserRuleCall_1_0());
				}
				lv_body_1_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestInfoRule());
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
					newCompositeNode(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestSetupVTestSetupTestSetupParserRuleCall_4_0());
				}
				lv_testSetup_4_0=ruleVTestSetupTestSetup
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestingSpecificationDesignRule());
					}
					set(
						$current,
						"testSetup",
						lv_testSetup_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupTestSetup");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsVSVSTestDesignParserRuleCall_5_0());
				}
				lv_testDesigns_5_0=ruleVSVSTestDesign
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestingSpecificationDesignRule());
					}
					add(
						$current,
						"testDesigns",
						lv_testDesigns_5_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestDesign");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_6='</TestingSpecificationDesign>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestingSpecificationDesignKeyword_6());
		}
	)
;

// Entry rule entryRuleVTestSetupTestSetup
entryRuleVTestSetupTestSetup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTestSetupTestSetupRule()); }
	iv_ruleVTestSetupTestSetup=ruleVTestSetupTestSetup
	{ $current=$iv_ruleVTestSetupTestSetup.current; }
	EOF;

// Rule VTestSetupTestSetup
ruleVTestSetupTestSetup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TestSetup>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTestSetupTestSetupAccess().getTestSetupKeyword_0());
		}
		otherlv_1='<Interfaces>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupTestSetupAccess().getInterfacesKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupTestSetupAccess().getInterfacesVTestSetupInterfacesSectionParserRuleCall_2_0());
				}
				lv_interfaces_2_0=ruleVTestSetupInterfacesSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupTestSetupRule());
					}
					set(
						$current,
						"interfaces",
						lv_interfaces_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupInterfacesSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='</Interfaces>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupTestSetupAccess().getInterfacesKeyword_3());
		}
		(
			otherlv_4='<PacketConfigurations>'
			{
				newLeafNode(otherlv_4, grammarAccess.getVTestSetupTestSetupAccess().getPacketConfigurationsKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVTestSetupTestSetupAccess().getConfigurationsVTestSetupPacketConfigurationsSectionParserRuleCall_4_1_0());
					}
					lv_configurations_5_0=ruleVTestSetupPacketConfigurationsSection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVTestSetupTestSetupRule());
						}
						set(
							$current,
							"configurations",
							lv_configurations_5_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupPacketConfigurationsSection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6='</PacketConfigurations>'
			{
				newLeafNode(otherlv_6, grammarAccess.getVTestSetupTestSetupAccess().getPacketConfigurationsKeyword_4_2());
			}
		)?
		(
			otherlv_7='<Actions>'
			{
				newLeafNode(otherlv_7, grammarAccess.getVTestSetupTestSetupAccess().getActionsKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVTestSetupTestSetupAccess().getActionsVTestSetupActionsSectionParserRuleCall_5_1_0());
					}
					lv_actions_8_0=ruleVTestSetupActionsSection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVTestSetupTestSetupRule());
						}
						set(
							$current,
							"actions",
							lv_actions_8_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupActionsSection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9='</Actions>'
			{
				newLeafNode(otherlv_9, grammarAccess.getVTestSetupTestSetupAccess().getActionsKeyword_5_2());
			}
		)?
		otherlv_10='<Scenarios>'
		{
			newLeafNode(otherlv_10, grammarAccess.getVTestSetupTestSetupAccess().getScenariosKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupTestSetupAccess().getScenariosVTestSetupScenariosSectionParserRuleCall_7_0());
				}
				lv_scenarios_11_0=ruleVTestSetupScenariosSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupTestSetupRule());
					}
					set(
						$current,
						"scenarios",
						lv_scenarios_11_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupScenariosSection");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='</Scenarios>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVTestSetupTestSetupAccess().getScenariosKeyword_8());
		}
		otherlv_13='</TestSetup>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVTestSetupTestSetupAccess().getTestSetupKeyword_9());
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupInterface");
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
		otherlv_3='id='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupInterfaceAccess().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVTestSetupInterfaceAccess().getIdUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupInterfaceRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_5='tcHeader='
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderKeyword_5());
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
					newLeafNode(otherlv_6, grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderTMTCIFTCHeaderCrossReference_6_0());
				}
			)
		)
		otherlv_7='tmHeader='
		{
			newLeafNode(otherlv_7, grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderKeyword_7());
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
				otherlv_8=RULE_STRING
				{
					newLeafNode(otherlv_8, grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderTMTCIFTMHeaderCrossReference_8_0());
				}
			)
		)
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVTestSetupInterfaceAccess().getGreaterThanSignKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupInterfaceAccess().getDescriptionDRunParserRuleCall_10_0());
				}
				lv_description_10_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupInterfaceRule());
					}
					set(
						$current,
						"description",
						lv_description_10_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='</Interface>'
		{
			newLeafNode(otherlv_11, grammarAccess.getVTestSetupInterfaceAccess().getInterfaceKeyword_11());
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupPacketConfiguration");
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
		otherlv_3='id='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupPacketConfigurationAccess().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVTestSetupPacketConfigurationAccess().getIdUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTestSetupPacketConfigurationRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_5='>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupPacketConfigurationAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupPacketConfigurationAccess().getDescriptionDRunParserRuleCall_6_0());
				}
				lv_description_6_0=ruleDRun
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupPacketConfigurationRule());
					}
					set(
						$current,
						"description",
						lv_description_6_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DRun");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='</PacketConfiguration>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVTestSetupPacketConfigurationAccess().getPacketConfigurationKeyword_7());
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
					newCompositeNode(grammarAccess.getVTestSetupActionsSectionAccess().getActionVTestSetupActionParserRuleCall_1_0());
				}
				lv_action_1_0=ruleVTestSetupAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupActionsSectionRule());
					}
					add(
						$current,
						"action",
						lv_action_1_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupAction");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupActionType");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBody");
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupScenarioSection");
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
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupScenarioSectionAccess().getGreaterThanSignKeyword_3());
		}
		(
			otherlv_4='<Interface'
			{
				newLeafNode(otherlv_4, grammarAccess.getVTestSetupScenarioSectionAccess().getInterfaceKeyword_4_0());
			}
			otherlv_5='ref='
			{
				newLeafNode(otherlv_5, grammarAccess.getVTestSetupScenarioSectionAccess().getRefKeyword_4_1());
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
					otherlv_6=RULE_STRING
					{
						newLeafNode(otherlv_6, grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedInterfaceVTestSetupInterfaceCrossReference_4_2_0());
					}
				)
			)
			otherlv_7='/>'
			{
				newLeafNode(otherlv_7, grammarAccess.getVTestSetupScenarioSectionAccess().getSolidusGreaterThanSignKeyword_4_3());
			}
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupScenarioSectionAccess().getSelectedConfigurationVTestSetupSelectedConfigurationParserRuleCall_5_0());
				}
				lv_selectedConfiguration_8_0=ruleVTestSetupSelectedConfiguration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupScenarioSectionRule());
					}
					add(
						$current,
						"selectedConfiguration",
						lv_selectedConfiguration_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupSelectedConfiguration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_9='<Action'
			{
				newLeafNode(otherlv_9, grammarAccess.getVTestSetupScenarioSectionAccess().getActionKeyword_6_0());
			}
			otherlv_10='ref='
			{
				newLeafNode(otherlv_10, grammarAccess.getVTestSetupScenarioSectionAccess().getRefKeyword_6_1());
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
					otherlv_11=RULE_STRING
					{
						newLeafNode(otherlv_11, grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedActionVTestSetupActionCrossReference_6_2_0());
					}
				)
			)
			otherlv_12='/>'
			{
				newLeafNode(otherlv_12, grammarAccess.getVTestSetupScenarioSectionAccess().getSolidusGreaterThanSignKeyword_6_3());
			}
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupScenarioSectionAccess().getBodyDBodyParserRuleCall_7_0());
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
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14='</Scenario>'
		{
			newLeafNode(otherlv_14, grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioKeyword_8());
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
		otherlv_1='ref='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTestSetupSelectedConfigurationAccess().getRefKeyword_1());
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
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationVTestSetupPacketConfigurationCrossReference_2_0());
				}
			)
		)
		otherlv_3='defaultFilterStatus='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusVTestSetupConfigurationStatusEnumRuleCall_4_0());
				}
				lv_defaultFilterStatus_4_0=ruleVTestSetupConfigurationStatus
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupSelectedConfigurationRule());
					}
					set(
						$current,
						"defaultFilterStatus",
						lv_defaultFilterStatus_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupConfigurationStatus");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='defaultPrintStatus='
		{
			newLeafNode(otherlv_5, grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusVTestSetupConfigurationStatusEnumRuleCall_6_0());
				}
				lv_defaultPrintStatus_6_0=ruleVTestSetupConfigurationStatus
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTestSetupSelectedConfigurationRule());
					}
					set(
						$current,
						"defaultPrintStatus",
						lv_defaultPrintStatus_6_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupConfigurationStatus");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVTestSetupSelectedConfigurationAccess().getSolidusGreaterThanSignKeyword_7());
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
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getIdentifierVSVSTestInfoParserRuleCall_5_0());
				}
				lv_identifier_5_0=ruleVSVSTestInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"identifier",
						lv_identifier_5_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestInfo");
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
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getInputsVSVSTestInfoParserRuleCall_8_0());
				}
				lv_inputs_8_0=ruleVSVSTestInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"inputs",
						lv_inputs_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestInfo");
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
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getOutputsVSVSTestInfoParserRuleCall_11_0());
				}
				lv_outputs_11_0=ruleVSVSTestInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"outputs",
						lv_outputs_11_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestInfo");
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
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaVSVSTestInfoParserRuleCall_14_0());
				}
				lv_passFailCriteria_14_0=ruleVSVSTestInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"passFailCriteria",
						lv_passFailCriteria_14_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestInfo");
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
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsVSVSTestInfoParserRuleCall_17_0());
				}
				lv_environmentalNeeds_17_0=ruleVSVSTestInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"environmentalNeeds",
						lv_environmentalNeeds_17_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestInfo");
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
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsVSVSTestInfoParserRuleCall_20_0());
				}
				lv_specialConstraints_20_0=ruleVSVSTestInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"specialConstraints",
						lv_specialConstraints_20_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestInfo");
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
					newCompositeNode(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesVSVSTestInfoParserRuleCall_23_0());
				}
				lv_interfaceDependencies_23_0=ruleVSVSTestInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestCaseRule());
					}
					set(
						$current,
						"interfaceDependencies",
						lv_interfaceDependencies_23_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestInfo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_24='</InterfaceDependencies>'
		{
			newLeafNode(otherlv_24, grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesKeyword_24());
		}
		(
			otherlv_25='<ValidatingItem'
			{
				newLeafNode(otherlv_25, grammarAccess.getVSVSTestCaseAccess().getValidatingItemKeyword_25_0());
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
						newLeafNode(otherlv_27, grammarAccess.getVSVSTestCaseAccess().getValidatingItemVTraceableDocumentAbstractItemCrossReference_25_2_0());
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
					newCompositeNode(grammarAccess.getVSVSTestProcedureAccess().getIdentifierVSVSTestInfoParserRuleCall_5_0());
				}
				lv_identifier_5_0=ruleVSVSTestInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestProcedureRule());
					}
					set(
						$current,
						"identifier",
						lv_identifier_5_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestInfo");
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
					newCompositeNode(grammarAccess.getVSVSTestProcedureAccess().getPurposeVSVSTestInfoParserRuleCall_8_0());
				}
				lv_purpose_8_0=ruleVSVSTestInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestProcedureRule());
					}
					set(
						$current,
						"purpose",
						lv_purpose_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestInfo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='</Purpose>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSTestProcedureAccess().getPurposeKeyword_9());
		}
		otherlv_10='<Scenario'
		{
			newLeafNode(otherlv_10, grammarAccess.getVSVSTestProcedureAccess().getScenarioKeyword_10());
		}
		otherlv_11='ref='
		{
			newLeafNode(otherlv_11, grammarAccess.getVSVSTestProcedureAccess().getRefKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSTestProcedureRule());
					}
				}
				otherlv_12=RULE_STRING
				{
					newLeafNode(otherlv_12, grammarAccess.getVSVSTestProcedureAccess().getScenarioVTestSetupScenarioSectionCrossReference_12_0());
				}
			)
		)
		otherlv_13='/>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSVSTestProcedureAccess().getSolidusGreaterThanSignKeyword_13());
		}
		(
			otherlv_14='<TestCase'
			{
				newLeafNode(otherlv_14, grammarAccess.getVSVSTestProcedureAccess().getTestCaseKeyword_14_0());
			}
			otherlv_15='ref='
			{
				newLeafNode(otherlv_15, grammarAccess.getVSVSTestProcedureAccess().getRefKeyword_14_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSTestProcedureRule());
						}
					}
					otherlv_16=RULE_STRING
					{
						newLeafNode(otherlv_16, grammarAccess.getVSVSTestProcedureAccess().getTestCaseVSVSTestCaseCrossReference_14_2_0());
					}
				)
			)
			otherlv_17='/>'
			{
				newLeafNode(otherlv_17, grammarAccess.getVSVSTestProcedureAccess().getSolidusGreaterThanSignKeyword_14_3());
			}
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestProcedureAccess().getProcedureStepsVSVSProcedureStepsParserRuleCall_15_0());
				}
				lv_procedureSteps_18_0=ruleVSVSProcedureSteps
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestProcedureRule());
					}
					set(
						$current,
						"procedureSteps",
						lv_procedureSteps_18_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSProcedureSteps");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_19='<TestScript>'
		{
			newLeafNode(otherlv_19, grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestProcedureAccess().getTestScriptVSVSTestInfoParserRuleCall_17_0());
				}
				lv_testScript_20_0=ruleVSVSTestInfo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestProcedureRule());
					}
					set(
						$current,
						"testScript",
						lv_testScript_20_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestInfo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21='</TestScript>'
		{
			newLeafNode(otherlv_21, grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_18());
		}
		otherlv_22='</TestProcedure>'
		{
			newLeafNode(otherlv_22, grammarAccess.getVSVSTestProcedureAccess().getTestProcedureKeyword_19());
		}
	)
;

// Entry rule entryRuleVSVSProcedureSteps
entryRuleVSVSProcedureSteps returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSProcedureStepsRule()); }
	iv_ruleVSVSProcedureSteps=ruleVSVSProcedureSteps
	{ $current=$iv_ruleVSVSProcedureSteps.current; }
	EOF;

// Rule VSVSProcedureSteps
ruleVSVSProcedureSteps returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<ProcedureSteps'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSProcedureStepsAccess().getProcedureStepsKeyword_0());
		}
		otherlv_1='>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSProcedureStepsAccess().getGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSProcedureStepsAccess().getStepVSVSProcedureStepParserRuleCall_2_0());
				}
				lv_step_2_0=ruleVSVSProcedureStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSProcedureStepsRule());
					}
					add(
						$current,
						"step",
						lv_step_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSProcedureStep");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='</ProcedureSteps>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSProcedureStepsAccess().getProcedureStepsKeyword_3());
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
		otherlv_0='<Step'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSProcedureStepAccess().getStepKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSProcedureStepAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSProcedureStepAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSProcedureStepRule());
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
			otherlv_3='prev_step='
			{
				newLeafNode(otherlv_3, grammarAccess.getVSVSProcedureStepAccess().getPrev_stepKeyword_3_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSProcedureStepRule());
						}
					}
					otherlv_4=RULE_STRING
					{
						newLeafNode(otherlv_4, grammarAccess.getVSVSProcedureStepAccess().getPrev_stepVSVSProcedureStepCrossReference_3_1_0());
					}
				)
			)
			otherlv_5='prev_tm_from_prev_step='
			{
				newLeafNode(otherlv_5, grammarAccess.getVSVSProcedureStepAccess().getPrev_tm_from_prev_stepKeyword_3_2());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSProcedureStepRule());
						}
					}
					otherlv_6=RULE_STRING
					{
						newLeafNode(otherlv_6, grammarAccess.getVSVSProcedureStepAccess().getPrev_tm_from_prev_stepVSVSStepTelemetryCrossReference_3_3_0());
					}
				)
			)
		)?
		(
			otherlv_7='replays='
			{
				newLeafNode(otherlv_7, grammarAccess.getVSVSProcedureStepAccess().getReplaysKeyword_4_0());
			}
			(
				(
					lv_replays_8_0=RULE_UINT_STRING
					{
						newLeafNode(lv_replays_8_0, grammarAccess.getVSVSProcedureStepAccess().getReplaysUINT_STRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSProcedureStepRule());
						}
						setWithLastConsumed(
							$current,
							"replays",
							lv_replays_8_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
					}
				)
			)
		)?
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSProcedureStepAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSProcedureStepAccess().getConfigurationsVSVSStepConfigurationsParserRuleCall_6_0());
				}
				lv_configurations_10_0=ruleVSVSStepConfigurations
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSProcedureStepRule());
					}
					set(
						$current,
						"configurations",
						lv_configurations_10_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepConfigurations");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSProcedureStepAccess().getInputsVSVSStepInputsParserRuleCall_7_0());
				}
				lv_inputs_11_0=ruleVSVSStepInputs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSProcedureStepRule());
					}
					set(
						$current,
						"inputs",
						lv_inputs_11_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepInputs");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSProcedureStepAccess().getOutputsVSVSStepOutputsParserRuleCall_8_0());
				}
				lv_outputs_12_0=ruleVSVSStepOutputs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSProcedureStepRule());
					}
					set(
						$current,
						"outputs",
						lv_outputs_12_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutputs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_13='</Step>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSVSProcedureStepAccess().getStepKeyword_9());
		}
	)
;

// Entry rule entryRuleVSVSStepConfigurations
entryRuleVSVSStepConfigurations returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepConfigurationsRule()); }
	iv_ruleVSVSStepConfigurations=ruleVSVSStepConfigurations
	{ $current=$iv_ruleVSVSStepConfigurations.current; }
	EOF;

// Rule VSVSStepConfigurations
ruleVSVSStepConfigurations returns [EObject current=null]
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
					grammarAccess.getVSVSStepConfigurationsAccess().getVSVSStepConfigurationsAction_0(),
					$current);
			}
		)
		otherlv_1='<Configurations>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepConfigurationsAccess().getConfigurationsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepConfigurationsAccess().getConfigurationVSVSStepConfigurationParserRuleCall_2_0());
				}
				lv_configuration_2_0=ruleVSVSStepConfiguration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepConfigurationsRule());
					}
					add(
						$current,
						"configuration",
						lv_configuration_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepConfiguration");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='</Configurations>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepConfigurationsAccess().getConfigurationsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSVSStepConfiguration
entryRuleVSVSStepConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepConfigurationRule()); }
	iv_ruleVSVSStepConfiguration=ruleVSVSStepConfiguration
	{ $current=$iv_ruleVSVSStepConfiguration.current; }
	EOF;

// Rule VSVSStepConfiguration
ruleVSVSStepConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Configuration'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepConfigurationAccess().getConfigurationKeyword_0());
		}
		otherlv_1='ref='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepConfigurationAccess().getRefKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepConfigurationRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getVSVSStepConfigurationAccess().getConfigurationVTestSetupPacketConfigurationCrossReference_2_0());
				}
			)
		)
		(
			otherlv_3='filterStatus='
			{
				newLeafNode(otherlv_3, grammarAccess.getVSVSStepConfigurationAccess().getFilterStatusKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSVSStepConfigurationAccess().getFilterStatusVTestSetupConfigurationStatusEnumRuleCall_3_1_0());
					}
					lv_filterStatus_4_0=ruleVTestSetupConfigurationStatus
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSVSStepConfigurationRule());
						}
						set(
							$current,
							"filterStatus",
							lv_filterStatus_4_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupConfigurationStatus");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='printStatus='
			{
				newLeafNode(otherlv_5, grammarAccess.getVSVSStepConfigurationAccess().getPrintStatusKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSVSStepConfigurationAccess().getPrintStatusVTestSetupConfigurationStatusEnumRuleCall_4_1_0());
					}
					lv_printStatus_6_0=ruleVTestSetupConfigurationStatus
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSVSStepConfigurationRule());
						}
						set(
							$current,
							"printStatus",
							lv_printStatus_6_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VTestSetupConfigurationStatus");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='/>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSVSStepConfigurationAccess().getSolidusGreaterThanSignKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSStepInputs
entryRuleVSVSStepInputs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepInputsRule()); }
	iv_ruleVSVSStepInputs=ruleVSVSStepInputs
	{ $current=$iv_ruleVSVSStepInputs.current; }
	EOF;

// Rule VSVSStepInputs
ruleVSVSStepInputs returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getVSVSStepInputsAccess().getVSVSStepActionParserRuleCall_0());
		}
		this_VSVSStepAction_0=ruleVSVSStepAction
		{
			$current = $this_VSVSStepAction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getVSVSStepInputsAccess().getVSVSStepTelecommandSequenceParserRuleCall_1());
		}
		this_VSVSStepTelecommandSequence_1=ruleVSVSStepTelecommandSequence
		{
			$current = $this_VSVSStepTelecommandSequence_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVSVSStepAction
entryRuleVSVSStepAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepActionRule()); }
	iv_ruleVSVSStepAction=ruleVSVSStepAction
	{ $current=$iv_ruleVSVSStepAction.current; }
	EOF;

// Rule VSVSStepAction
ruleVSVSStepAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Action'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepActionAccess().getActionKeyword_0());
		}
		otherlv_1='selectedAction='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepActionAccess().getSelectedActionKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepActionRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getVSVSStepActionAccess().getSelectedActionVTestSetupActionCrossReference_2_0());
				}
			)
		)
		(
			otherlv_3='delay_value='
			{
				newLeafNode(otherlv_3, grammarAccess.getVSVSStepActionAccess().getDelay_valueKeyword_3_0());
			}
			(
				(
					lv_delay_value_4_0=RULE_UINT_STRING
					{
						newLeafNode(lv_delay_value_4_0, grammarAccess.getVSVSStepActionAccess().getDelay_valueUINT_STRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepActionRule());
						}
						setWithLastConsumed(
							$current,
							"delay_value",
							lv_delay_value_4_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
					}
				)
			)
			otherlv_5='delay_unit='
			{
				newLeafNode(otherlv_5, grammarAccess.getVSVSStepActionAccess().getDelay_unitKeyword_3_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSVSStepActionAccess().getDelay_unitVSVSTimeUnitEnumRuleCall_3_3_0());
					}
					lv_delay_unit_6_0=ruleVSVSTimeUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSVSStepActionRule());
						}
						set(
							$current,
							"delay_unit",
							lv_delay_unit_6_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTimeUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='span_value='
			{
				newLeafNode(otherlv_7, grammarAccess.getVSVSStepActionAccess().getSpan_valueKeyword_4_0());
			}
			(
				(
					lv_span_value_8_0=RULE_UINT_STRING
					{
						newLeafNode(lv_span_value_8_0, grammarAccess.getVSVSStepActionAccess().getSpan_valueUINT_STRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepActionRule());
						}
						setWithLastConsumed(
							$current,
							"span_value",
							lv_span_value_8_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
					}
				)
			)
			otherlv_9='span_unit='
			{
				newLeafNode(otherlv_9, grammarAccess.getVSVSStepActionAccess().getSpan_unitKeyword_4_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSVSStepActionAccess().getSpan_unitVSVSTimeUnitEnumRuleCall_4_3_0());
					}
					lv_span_unit_10_0=ruleVSVSTimeUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSVSStepActionRule());
						}
						set(
							$current,
							"span_unit",
							lv_span_unit_10_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTimeUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_11='/>'
		{
			newLeafNode(otherlv_11, grammarAccess.getVSVSStepActionAccess().getSolidusGreaterThanSignKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSStepTelecommandSequence
entryRuleVSVSStepTelecommandSequence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelecommandSequenceRule()); }
	iv_ruleVSVSStepTelecommandSequence=ruleVSVSStepTelecommandSequence
	{ $current=$iv_ruleVSVSStepTelecommandSequence.current; }
	EOF;

// Rule VSVSStepTelecommandSequence
ruleVSVSStepTelecommandSequence returns [EObject current=null]
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
					grammarAccess.getVSVSStepTelecommandSequenceAccess().getVSVSStepTelecommandSequenceAction_0(),
					$current);
			}
		)
		otherlv_1='<TelecommandSequence>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepTelecommandSequenceAccess().getTelecommandSequenceKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelecommandSequenceAccess().getTelecommandVSVSStepTelecommandParserRuleCall_2_0());
				}
				lv_telecommand_2_0=ruleVSVSStepTelecommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelecommandSequenceRule());
					}
					add(
						$current,
						"telecommand",
						lv_telecommand_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelecommand");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='</TelecommandSequence>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepTelecommandSequenceAccess().getTelecommandSequenceKeyword_3());
		}
	)
;

// Entry rule entryRuleVSVSStepTelecommand
entryRuleVSVSStepTelecommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelecommandRule()); }
	iv_ruleVSVSStepTelecommand=ruleVSVSStepTelecommand
	{ $current=$iv_ruleVSVSStepTelecommand.current; }
	EOF;

// Rule VSVSStepTelecommand
ruleVSVSStepTelecommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Telecommand'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepTelecommandAccess().getTelecommandKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepTelecommandAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSStepTelecommandAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepTelecommandRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='interface='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepTelecommandAccess().getInterfaceKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepTelecommandRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getVSVSStepTelecommandAccess().getInterfaceVTestSetupInterfaceCrossReference_4_0());
				}
			)
		)
		(
			otherlv_5='delay_value='
			{
				newLeafNode(otherlv_5, grammarAccess.getVSVSStepTelecommandAccess().getDelay_valueKeyword_5_0());
			}
			(
				(
					lv_delay_value_6_0=RULE_UINT_STRING
					{
						newLeafNode(lv_delay_value_6_0, grammarAccess.getVSVSStepTelecommandAccess().getDelay_valueUINT_STRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepTelecommandRule());
						}
						setWithLastConsumed(
							$current,
							"delay_value",
							lv_delay_value_6_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
					}
				)
			)
			otherlv_7='delay_unit='
			{
				newLeafNode(otherlv_7, grammarAccess.getVSVSStepTelecommandAccess().getDelay_unitKeyword_5_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSVSStepTelecommandAccess().getDelay_unitVSVSTimeUnitEnumRuleCall_5_3_0());
					}
					lv_delay_unit_8_0=ruleVSVSTimeUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSVSStepTelecommandRule());
						}
						set(
							$current,
							"delay_unit",
							lv_delay_unit_8_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTimeUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSStepTelecommandAccess().getGreaterThanSignKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelecommandAccess().getTcDataVSVSStepTelecommandDataParserRuleCall_7_0());
				}
				lv_tcData_10_0=ruleVSVSStepTelecommandData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelecommandRule());
					}
					set(
						$current,
						"tcData",
						lv_tcData_10_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelecommandData");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelecommandAccess().getTcHeaderVSVSStepTelecommandHeaderParserRuleCall_8_0());
				}
				lv_tcHeader_11_0=ruleVSVSStepTelecommandHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelecommandRule());
					}
					set(
						$current,
						"tcHeader",
						lv_tcHeader_11_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelecommandHeader");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_12='</Telecommand>'
		{
			newLeafNode(otherlv_12, grammarAccess.getVSVSStepTelecommandAccess().getTelecommandKeyword_9());
		}
	)
;

// Entry rule entryRuleVSVSStepTelecommandData
entryRuleVSVSStepTelecommandData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelecommandDataRule()); }
	iv_ruleVSVSStepTelecommandData=ruleVSVSStepTelecommandData
	{ $current=$iv_ruleVSVSStepTelecommandData.current; }
	EOF;

// Rule VSVSStepTelecommandData
ruleVSVSStepTelecommandData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TelecommandData'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepTelecommandDataAccess().getTelecommandDataKeyword_0());
		}
		otherlv_1='template='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepTelecommandDataAccess().getTemplateKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepTelecommandDataRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getVSVSStepTelecommandDataAccess().getTcTemplateVTCTemplateCrossReference_2_0());
				}
			)
		)
		(
			(
				otherlv_3='>'
				{
					newLeafNode(otherlv_3, grammarAccess.getVSVSStepTelecommandDataAccess().getGreaterThanSignKeyword_3_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSVSStepTelecommandDataAccess().getFieldsVSVSStepTelecommandDataFieldParserRuleCall_3_0_1_0());
						}
						lv_fields_4_0=ruleVSVSStepTelecommandDataField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSVSStepTelecommandDataRule());
							}
							add(
								$current,
								"fields",
								lv_fields_4_0,
								"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelecommandDataField");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				otherlv_5='</TelecommandData>'
				{
					newLeafNode(otherlv_5, grammarAccess.getVSVSStepTelecommandDataAccess().getTelecommandDataKeyword_3_0_2());
				}
			)
			    |
			otherlv_6='/>'
			{
				newLeafNode(otherlv_6, grammarAccess.getVSVSStepTelecommandDataAccess().getSolidusGreaterThanSignKeyword_3_1());
			}
		)
	)
;

// Entry rule entryRuleVSVSStepTelecommandDataField
entryRuleVSVSStepTelecommandDataField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelecommandDataFieldRule()); }
	iv_ruleVSVSStepTelecommandDataField=ruleVSVSStepTelecommandDataField
	{ $current=$iv_ruleVSVSStepTelecommandDataField.current; }
	EOF;

// Rule VSVSStepTelecommandDataField
ruleVSVSStepTelecommandDataField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Field'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepTelecommandDataFieldAccess().getFieldKeyword_0());
		}
		otherlv_1='fieldRef='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepTelecommandDataFieldAccess().getFieldRefKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepTelecommandDataFieldRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getVSVSStepTelecommandDataFieldAccess().getFieldRefTMTCIFTCFieldCrossReference_2_0());
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepTelecommandDataFieldAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelecommandDataFieldAccess().getValueTMTCIFFieldValueTCParserRuleCall_4_0());
				}
				lv_value_4_0=ruleTMTCIFFieldValueTC
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelecommandDataFieldRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.TMTCIFFieldValueTC");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Field>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepTelecommandDataFieldAccess().getFieldKeyword_5());
		}
	)
;

// Entry rule entryRuleTMTCIFFieldValueTC
entryRuleTMTCIFFieldValueTC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFieldValueTCRule()); }
	iv_ruleTMTCIFFieldValueTC=ruleTMTCIFFieldValueTC
	{ $current=$iv_ruleTMTCIFFieldValueTC.current; }
	EOF;

// Rule TMTCIFFieldValueTC
ruleTMTCIFFieldValueTC returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getTMTCIFFieldValueTCAccess().getTMTCIFFieldValueRawParserRuleCall_0());
		}
		this_TMTCIFFieldValueRaw_0=ruleTMTCIFFieldValueRaw
		{
			$current = $this_TMTCIFFieldValueRaw_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTMTCIFFieldValueTCAccess().getTMTCIFFieldValueFileParserRuleCall_1());
		}
		this_TMTCIFFieldValueFile_1=ruleTMTCIFFieldValueFile
		{
			$current = $this_TMTCIFFieldValueFile_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTMTCIFFieldValueTCAccess().getTMTCIFFieldValueEnumParserRuleCall_2());
		}
		this_TMTCIFFieldValueEnum_2=ruleTMTCIFFieldValueEnum
		{
			$current = $this_TMTCIFFieldValueEnum_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVSVSStepTelecommandHeader
entryRuleVSVSStepTelecommandHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelecommandHeaderRule()); }
	iv_ruleVSVSStepTelecommandHeader=ruleVSVSStepTelecommandHeader
	{ $current=$iv_ruleVSVSStepTelecommandHeader.current; }
	EOF;

// Rule VSVSStepTelecommandHeader
ruleVSVSStepTelecommandHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TelecommandHeader>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepTelecommandHeaderAccess().getTelecommandHeaderKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelecommandHeaderAccess().getFieldsVSVSStepTelecommandHeaderFieldParserRuleCall_1_0());
				}
				lv_fields_1_0=ruleVSVSStepTelecommandHeaderField
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelecommandHeaderRule());
					}
					add(
						$current,
						"fields",
						lv_fields_1_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelecommandHeaderField");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</TelecommandHeader>'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSVSStepTelecommandHeaderAccess().getTelecommandHeaderKeyword_2());
		}
	)
;

// Entry rule entryRuleVSVSStepTelecommandHeaderField
entryRuleVSVSStepTelecommandHeaderField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelecommandHeaderFieldRule()); }
	iv_ruleVSVSStepTelecommandHeaderField=ruleVSVSStepTelecommandHeaderField
	{ $current=$iv_ruleVSVSStepTelecommandHeaderField.current; }
	EOF;

// Rule VSVSStepTelecommandHeaderField
ruleVSVSStepTelecommandHeaderField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<HeaderField'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepTelecommandHeaderFieldAccess().getHeaderFieldKeyword_0());
		}
		otherlv_1='fieldRef='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepTelecommandHeaderFieldAccess().getFieldRefKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepTelecommandHeaderFieldRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getVSVSStepTelecommandHeaderFieldAccess().getFieldRefTMTCIFTCHeaderFieldCrossReference_2_0());
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepTelecommandHeaderFieldAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelecommandHeaderFieldAccess().getValueTMTCIFFieldValueHeaderParserRuleCall_4_0());
				}
				lv_value_4_0=ruleTMTCIFFieldValueHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelecommandHeaderFieldRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.TMTCIFFieldValueHeader");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</HeaderField>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepTelecommandHeaderFieldAccess().getHeaderFieldKeyword_5());
		}
	)
;

// Entry rule entryRuleTMTCIFFieldValueHeader
entryRuleTMTCIFFieldValueHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFieldValueHeaderRule()); }
	iv_ruleTMTCIFFieldValueHeader=ruleTMTCIFFieldValueHeader
	{ $current=$iv_ruleTMTCIFFieldValueHeader.current; }
	EOF;

// Rule TMTCIFFieldValueHeader
ruleTMTCIFFieldValueHeader returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getTMTCIFFieldValueHeaderAccess().getTMTCIFFieldValueRawParserRuleCall_0());
		}
		this_TMTCIFFieldValueRaw_0=ruleTMTCIFFieldValueRaw
		{
			$current = $this_TMTCIFFieldValueRaw_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTMTCIFFieldValueHeaderAccess().getTMTCIFFieldValueFileParserRuleCall_1());
		}
		this_TMTCIFFieldValueFile_1=ruleTMTCIFFieldValueFile
		{
			$current = $this_TMTCIFFieldValueFile_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTMTCIFFieldValueRaw
entryRuleTMTCIFFieldValueRaw returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFieldValueRawRule()); }
	iv_ruleTMTCIFFieldValueRaw=ruleTMTCIFFieldValueRaw
	{ $current=$iv_ruleTMTCIFFieldValueRaw.current; }
	EOF;

// Rule TMTCIFFieldValueRaw
ruleTMTCIFFieldValueRaw returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<FieldValueRaw'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0());
		}
		otherlv_1='value='
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1());
		}
		(
			(
				(
					lv_value_2_1=RULE_UINT_STRING
					{
						newLeafNode(lv_value_2_1, grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFieldValueRawRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_1,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
					}
					    |
					lv_value_2_2=RULE_HEX_STRING
					{
						newLeafNode(lv_value_2_2, grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFieldValueRawRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_2,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.HEX_STRING");
					}
				)
			)
		)
		otherlv_3='/>'
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleTMTCIFFieldValueFile
entryRuleTMTCIFFieldValueFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFieldValueFileRule()); }
	iv_ruleTMTCIFFieldValueFile=ruleTMTCIFFieldValueFile
	{ $current=$iv_ruleTMTCIFFieldValueFile.current; }
	EOF;

// Rule TMTCIFFieldValueFile
ruleTMTCIFFieldValueFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<FieldValueFile'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueFileAccess().getFieldValueFileKeyword_0());
		}
		otherlv_1='filename='
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameKeyword_1());
		}
		(
			(
				lv_filename_2_0=RULE_STRING
				{
					newLeafNode(lv_filename_2_0, grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFieldValueFileRule());
					}
					setWithLastConsumed(
						$current,
						"filename",
						lv_filename_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='/>'
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFieldValueFileAccess().getSolidusGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleTMTCIFFieldValueEnum
entryRuleTMTCIFFieldValueEnum returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFieldValueEnumRule()); }
	iv_ruleTMTCIFFieldValueEnum=ruleTMTCIFFieldValueEnum
	{ $current=$iv_ruleTMTCIFFieldValueEnum.current; }
	EOF;

// Rule TMTCIFFieldValueEnum
ruleTMTCIFFieldValueEnum returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<FieldValueEnum'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueEnumAccess().getFieldValueEnumKeyword_0());
		}
		otherlv_1='enumRef='
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFieldValueEnumRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumCrossReference_2_0());
				}
			)
		)
		otherlv_3='valueRef='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFieldValueEnumRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueCrossReference_4_0());
				}
			)
		)
		otherlv_5='/>'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFieldValueEnumAccess().getSolidusGreaterThanSignKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSStepOutputs
entryRuleVSVSStepOutputs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepOutputsRule()); }
	iv_ruleVSVSStepOutputs=ruleVSVSStepOutputs
	{ $current=$iv_ruleVSVSStepOutputs.current; }
	EOF;

// Rule VSVSStepOutputs
ruleVSVSStepOutputs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getVSVSStepOutputsAccess().getVSVSStepTelemetrySetParserRuleCall());
	}
	this_VSVSStepTelemetrySet_0=ruleVSVSStepTelemetrySet
	{
		$current = $this_VSVSStepTelemetrySet_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleVSVSStepTelemetrySet
entryRuleVSVSStepTelemetrySet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelemetrySetRule()); }
	iv_ruleVSVSStepTelemetrySet=ruleVSVSStepTelemetrySet
	{ $current=$iv_ruleVSVSStepTelemetrySet.current; }
	EOF;

// Rule VSVSStepTelemetrySet
ruleVSVSStepTelemetrySet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TelemetrySet'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepTelemetrySetAccess().getTelemetrySetKeyword_0());
		}
		otherlv_1='checkmode='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepTelemetrySetAccess().getCheckmodeKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelemetrySetAccess().getCheckmodeVSVSStepTelemetrySetCheckmodeEnumRuleCall_2_0());
				}
				lv_checkmode_2_0=ruleVSVSStepTelemetrySetCheckmode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelemetrySetRule());
					}
					set(
						$current,
						"checkmode",
						lv_checkmode_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetrySetCheckmode");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='valid_time_interval_value='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepTelemetrySetAccess().getValid_time_interval_valueKeyword_3());
		}
		(
			(
				lv_valid_time_interval_value_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_valid_time_interval_value_4_0, grammarAccess.getVSVSStepTelemetrySetAccess().getValid_time_interval_valueUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepTelemetrySetRule());
					}
					setWithLastConsumed(
						$current,
						"valid_time_interval_value",
						lv_valid_time_interval_value_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_5='valid_time_interval_unit='
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepTelemetrySetAccess().getValid_time_interval_unitKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelemetrySetAccess().getValid_time_interval_unitVSVSTimeUnitEnumRuleCall_6_0());
				}
				lv_valid_time_interval_unit_6_0=ruleVSVSTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelemetrySetRule());
					}
					set(
						$current,
						"valid_time_interval_unit",
						lv_valid_time_interval_unit_6_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSVSStepTelemetrySetAccess().getGreaterThanSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelemetrySetAccess().getTelemetryVSVSStepTelemetryParserRuleCall_8_0());
				}
				lv_telemetry_8_0=ruleVSVSStepTelemetry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelemetrySetRule());
					}
					add(
						$current,
						"telemetry",
						lv_telemetry_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetry");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_9='</TelemetrySet>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSStepTelemetrySetAccess().getTelemetrySetKeyword_9());
		}
	)
;

// Entry rule entryRuleVSVSStepTelemetry
entryRuleVSVSStepTelemetry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelemetryRule()); }
	iv_ruleVSVSStepTelemetry=ruleVSVSStepTelemetry
	{ $current=$iv_ruleVSVSStepTelemetry.current; }
	EOF;

// Rule VSVSStepTelemetry
ruleVSVSStepTelemetry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Telemetry'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepTelemetryAccess().getTelemetryKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepTelemetryAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSStepTelemetryAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepTelemetryRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='interface='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepTelemetryAccess().getInterfaceKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepTelemetryRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getVSVSStepTelemetryAccess().getInterfaceVTestSetupInterfaceCrossReference_4_0());
				}
			)
		)
		otherlv_5='>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepTelemetryAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelemetryAccess().getTmDataVSVSStepTelemetryDataParserRuleCall_6_0());
				}
				lv_tmData_6_0=ruleVSVSStepTelemetryData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelemetryRule());
					}
					set(
						$current,
						"tmData",
						lv_tmData_6_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetryData");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelemetryAccess().getTmHeaderVSVSStepTelemetryHeaderParserRuleCall_7_0());
				}
				lv_tmHeader_7_0=ruleVSVSStepTelemetryHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelemetryRule());
					}
					set(
						$current,
						"tmHeader",
						lv_tmHeader_7_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetryHeader");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_8='</Telemetry>'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSVSStepTelemetryAccess().getTelemetryKeyword_8());
		}
	)
;

// Entry rule entryRuleVSVSStepTelemetryData
entryRuleVSVSStepTelemetryData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelemetryDataRule()); }
	iv_ruleVSVSStepTelemetryData=ruleVSVSStepTelemetryData
	{ $current=$iv_ruleVSVSStepTelemetryData.current; }
	EOF;

// Rule VSVSStepTelemetryData
ruleVSVSStepTelemetryData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TelemetryData'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepTelemetryDataAccess().getTelemetryDataKeyword_0());
		}
		otherlv_1='template='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepTelemetryDataAccess().getTemplateKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepTelemetryDataRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getVSVSStepTelemetryDataAccess().getTmTemplateVTMTemplateCrossReference_2_0());
				}
			)
		)
		(
			(
				otherlv_3='>'
				{
					newLeafNode(otherlv_3, grammarAccess.getVSVSStepTelemetryDataAccess().getGreaterThanSignKeyword_3_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVSVSStepTelemetryDataAccess().getFieldsVSVSStepTelemetryDataFieldParserRuleCall_3_0_1_0());
						}
						lv_fields_4_0=ruleVSVSStepTelemetryDataField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVSVSStepTelemetryDataRule());
							}
							add(
								$current,
								"fields",
								lv_fields_4_0,
								"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetryDataField");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				otherlv_5='</TelemetryData>'
				{
					newLeafNode(otherlv_5, grammarAccess.getVSVSStepTelemetryDataAccess().getTelemetryDataKeyword_3_0_2());
				}
			)
			    |
			otherlv_6='/>'
			{
				newLeafNode(otherlv_6, grammarAccess.getVSVSStepTelemetryDataAccess().getSolidusGreaterThanSignKeyword_3_1());
			}
		)
	)
;

// Entry rule entryRuleVSVSStepTelemetryDataField
entryRuleVSVSStepTelemetryDataField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelemetryDataFieldRule()); }
	iv_ruleVSVSStepTelemetryDataField=ruleVSVSStepTelemetryDataField
	{ $current=$iv_ruleVSVSStepTelemetryDataField.current; }
	EOF;

// Rule VSVSStepTelemetryDataField
ruleVSVSStepTelemetryDataField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Field'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepTelemetryDataFieldAccess().getFieldKeyword_0());
		}
		otherlv_1='fieldRef='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepTelemetryDataFieldAccess().getFieldRefKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepTelemetryDataFieldRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getVSVSStepTelemetryDataFieldAccess().getFieldRefTMTCIFTMFieldCrossReference_2_0());
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepTelemetryDataFieldAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelemetryDataFieldAccess().getValueTMTCIFFieldValueTMParserRuleCall_4_0());
				}
				lv_value_4_0=ruleTMTCIFFieldValueTM
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelemetryDataFieldRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.TMTCIFFieldValueTM");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Field>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepTelemetryDataFieldAccess().getFieldKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSStepTelemetryHeader
entryRuleVSVSStepTelemetryHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelemetryHeaderRule()); }
	iv_ruleVSVSStepTelemetryHeader=ruleVSVSStepTelemetryHeader
	{ $current=$iv_ruleVSVSStepTelemetryHeader.current; }
	EOF;

// Rule VSVSStepTelemetryHeader
ruleVSVSStepTelemetryHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TelemetryHeader>'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepTelemetryHeaderAccess().getTelemetryHeaderKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelemetryHeaderAccess().getFieldsVSVSStepTelemetryHeaderFieldParserRuleCall_1_0());
				}
				lv_fields_1_0=ruleVSVSStepTelemetryHeaderField
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelemetryHeaderRule());
					}
					add(
						$current,
						"fields",
						lv_fields_1_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepTelemetryHeaderField");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</TelemetryHeader>'
		{
			newLeafNode(otherlv_2, grammarAccess.getVSVSStepTelemetryHeaderAccess().getTelemetryHeaderKeyword_2());
		}
	)
;

// Entry rule entryRuleVSVSStepTelemetryHeaderField
entryRuleVSVSStepTelemetryHeaderField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepTelemetryHeaderFieldRule()); }
	iv_ruleVSVSStepTelemetryHeaderField=ruleVSVSStepTelemetryHeaderField
	{ $current=$iv_ruleVSVSStepTelemetryHeaderField.current; }
	EOF;

// Rule VSVSStepTelemetryHeaderField
ruleVSVSStepTelemetryHeaderField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<HeaderField'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepTelemetryHeaderFieldAccess().getHeaderFieldKeyword_0());
		}
		otherlv_1='fieldRef='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepTelemetryHeaderFieldAccess().getFieldRefKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepTelemetryHeaderFieldRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getVSVSStepTelemetryHeaderFieldAccess().getFieldRefTMTCIFTMHeaderFieldCrossReference_2_0());
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepTelemetryHeaderFieldAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepTelemetryHeaderFieldAccess().getValueTMTCIFFieldValueRawParserRuleCall_4_0());
				}
				lv_value_4_0=ruleTMTCIFFieldValueRaw
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepTelemetryHeaderFieldRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.TMTCIFFieldValueRaw");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</HeaderField>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepTelemetryHeaderFieldAccess().getHeaderFieldKeyword_5());
		}
	)
;

// Entry rule entryRuleTMTCIFFieldValueTM
entryRuleTMTCIFFieldValueTM returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFieldValueTMRule()); }
	iv_ruleTMTCIFFieldValueTM=ruleTMTCIFFieldValueTM
	{ $current=$iv_ruleTMTCIFFieldValueTM.current; }
	EOF;

// Rule TMTCIFFieldValueTM
ruleTMTCIFFieldValueTM returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getTMTCIFFieldValueTMAccess().getTMTCIFFieldValueRawParserRuleCall_0());
		}
		this_TMTCIFFieldValueRaw_0=ruleTMTCIFFieldValueRaw
		{
			$current = $this_TMTCIFFieldValueRaw_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTMTCIFFieldValueTMAccess().getTMTCIFFieldValueFileParserRuleCall_1());
		}
		this_TMTCIFFieldValueFile_1=ruleTMTCIFFieldValueFile
		{
			$current = $this_TMTCIFFieldValueFile_1.current;
			afterParserOrEnumRuleCall();
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
			enumLiteral_0='"checking"'
			{
				$current = grammarAccess.getVTestSetupActionTypeAccess().getCheckingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVTestSetupActionTypeAccess().getCheckingEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"instruction"'
			{
				$current = grammarAccess.getVTestSetupActionTypeAccess().getInstructionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVTestSetupActionTypeAccess().getInstructionEnumLiteralDeclaration_1());
			}
		)
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

// Rule VSVSTimeUnit
ruleVSVSTimeUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='"miliseconds"'
			{
				$current = grammarAccess.getVSVSTimeUnitAccess().getMilisecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVSVSTimeUnitAccess().getMilisecondsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"seconds"'
			{
				$current = grammarAccess.getVSVSTimeUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVSVSTimeUnitAccess().getSecondsEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule VSVSStepTelemetrySetCheckmode
ruleVSVSStepTelemetrySetCheckmode returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='"all"'
			{
				$current = grammarAccess.getVSVSStepTelemetrySetCheckmodeAccess().getAllEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVSVSStepTelemetrySetCheckmodeAccess().getAllEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"allunsorted"'
			{
				$current = grammarAccess.getVSVSStepTelemetrySetCheckmodeAccess().getAllunsortedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVSVSStepTelemetrySetCheckmodeAccess().getAllunsortedEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='"any"'
			{
				$current = grammarAccess.getVSVSStepTelemetrySetCheckmodeAccess().getAnyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVSVSStepTelemetrySetCheckmodeAccess().getAnyEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_RUNTEXT : '<text>' ( options {greedy=false;} : . )*'</text>';

RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_UINT_STRING : '"' ('0'..'9')+ '"';

RULE_REAL_STRING : '"' ('0'..'9')+ ('.' ('0'..'9')+)? '"';

RULE_HEX_STRING : '"0x' ('0'..'9'|'a'..'f'|'A'..'F')+ '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
