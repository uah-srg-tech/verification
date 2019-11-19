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
			otherlv_4='<Scenarios>'
			{
				newLeafNode(otherlv_4, grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosVSVSScenariosSectionParserRuleCall_4_1_0());
					}
					lv_scenarios_5_0=ruleVSVSScenariosSection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSVSTestingSpecificationDesignRule());
						}
						set(
							$current,
							"scenarios",
							lv_scenarios_5_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSScenariosSection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6='</Scenarios>'
			{
				newLeafNode(otherlv_6, grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosKeyword_4_2());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsVSVSTestDesignParserRuleCall_5_0());
				}
				lv_testDesigns_7_0=ruleVSVSTestDesign
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSTestingSpecificationDesignRule());
					}
					add(
						$current,
						"testDesigns",
						lv_testDesigns_7_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSTestDesign");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_8='</TestingSpecificationDesign>'
		{
			newLeafNode(otherlv_8, grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestingSpecificationDesignKeyword_6());
		}
	)
;

// Entry rule entryRuleVSVSScenariosSection
entryRuleVSVSScenariosSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSScenariosSectionRule()); }
	iv_ruleVSVSScenariosSection=ruleVSVSScenariosSection
	{ $current=$iv_ruleVSVSScenariosSection.current; }
	EOF;

// Rule VSVSScenariosSection
ruleVSVSScenariosSection returns [EObject current=null]
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
					grammarAccess.getVSVSScenariosSectionAccess().getVSVSScenariosSectionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSScenariosSectionAccess().getScenariosVSVSScenarioSectionParserRuleCall_1_0());
				}
				lv_scenarios_1_0=ruleVSVSScenarioSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSScenariosSectionRule());
					}
					add(
						$current,
						"scenarios",
						lv_scenarios_1_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSScenarioSection");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleVSVSScenarioSection
entryRuleVSVSScenarioSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSScenarioSectionRule()); }
	iv_ruleVSVSScenarioSection=ruleVSVSScenarioSection
	{ $current=$iv_ruleVSVSScenarioSection.current; }
	EOF;

// Rule VSVSScenarioSection
ruleVSVSScenarioSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Scenario'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSScenarioSectionAccess().getScenarioKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSScenarioSectionAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSScenarioSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSScenarioSectionRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSScenarioSectionAccess().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVSVSScenarioSectionAccess().getIdUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSScenarioSectionRule());
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
			newLeafNode(otherlv_5, grammarAccess.getVSVSScenarioSectionAccess().getGreaterThanSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSScenarioSectionAccess().getBodyDBodyParserRuleCall_6_0());
				}
				lv_body_6_0=ruleDBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSScenarioSectionRule());
					}
					set(
						$current,
						"body",
						lv_body_6_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.DBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='</Scenario>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSVSScenarioSectionAccess().getScenarioKeyword_7());
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
		(
			otherlv_10='<Scenario'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSVSTestProcedureAccess().getScenarioKeyword_10_0());
			}
			otherlv_11='ref='
			{
				newLeafNode(otherlv_11, grammarAccess.getVSVSTestProcedureAccess().getRefKeyword_10_1());
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
						newLeafNode(otherlv_12, grammarAccess.getVSVSTestProcedureAccess().getScenarioVSVSScenarioSectionCrossReference_10_2_0());
					}
				)
			)
			otherlv_13='/>'
			{
				newLeafNode(otherlv_13, grammarAccess.getVSVSTestProcedureAccess().getSolidusGreaterThanSignKeyword_10_3());
			}
		)?
		(
			otherlv_14='<TestCase'
			{
				newLeafNode(otherlv_14, grammarAccess.getVSVSTestProcedureAccess().getTestCaseKeyword_11_0());
			}
			otherlv_15='ref='
			{
				newLeafNode(otherlv_15, grammarAccess.getVSVSTestProcedureAccess().getRefKeyword_11_1());
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
						newLeafNode(otherlv_16, grammarAccess.getVSVSTestProcedureAccess().getTestCaseVSVSTestCaseCrossReference_11_2_0());
					}
				)
			)
			otherlv_17='/>'
			{
				newLeafNode(otherlv_17, grammarAccess.getVSVSTestProcedureAccess().getSolidusGreaterThanSignKeyword_11_3());
			}
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestProcedureAccess().getProcedureStepsVSVSProcedureStepsParserRuleCall_12_0());
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
			newLeafNode(otherlv_19, grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSTestProcedureAccess().getTestScriptVSVSTestInfoParserRuleCall_14_0());
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
			newLeafNode(otherlv_21, grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_15());
		}
		otherlv_22='</TestProcedure>'
		{
			newLeafNode(otherlv_22, grammarAccess.getVSVSTestProcedureAccess().getTestProcedureKeyword_16());
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
		otherlv_0='<step'
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
		otherlv_3='id='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSProcedureStepAccess().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVSVSProcedureStepAccess().getIdUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSProcedureStepRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		(
			otherlv_5='prev_step_idref='
			{
				newLeafNode(otherlv_5, grammarAccess.getVSVSProcedureStepAccess().getPrev_step_idrefKeyword_5_0());
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
						newLeafNode(otherlv_6, grammarAccess.getVSVSProcedureStepAccess().getPrev_step_idrefVSVSProcedureStepCrossReference_5_1_0());
					}
				)
			)
		)?
		(
			otherlv_7='output_idref_from_prev_step='
			{
				newLeafNode(otherlv_7, grammarAccess.getVSVSProcedureStepAccess().getOutput_idref_from_prev_stepKeyword_6_0());
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
					otherlv_8=RULE_STRING
					{
						newLeafNode(otherlv_8, grammarAccess.getVSVSProcedureStepAccess().getOutput_idref_from_prev_stepVSVSStepOutputCrossReference_6_1_0());
					}
				)
			)
		)?
		otherlv_9='mode='
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSProcedureStepAccess().getModeKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSProcedureStepAccess().getModeVSVSStepModeEnumRuleCall_8_0());
				}
				lv_mode_10_0=ruleVSVSStepMode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSProcedureStepRule());
					}
					set(
						$current,
						"mode",
						lv_mode_10_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepMode");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_11='replays='
			{
				newLeafNode(otherlv_11, grammarAccess.getVSVSProcedureStepAccess().getReplaysKeyword_9_0());
			}
			(
				(
					lv_replays_12_0=RULE_STRING
					{
						newLeafNode(lv_replays_12_0, grammarAccess.getVSVSProcedureStepAccess().getReplaysSTRINGTerminalRuleCall_9_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSProcedureStepRule());
						}
						setWithLastConsumed(
							$current,
							"replays",
							lv_replays_12_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_13='>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSVSProcedureStepAccess().getGreaterThanSignKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSProcedureStepAccess().getInputsVSVSStepInputsParserRuleCall_11_0());
				}
				lv_inputs_14_0=ruleVSVSStepInputs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSProcedureStepRule());
					}
					set(
						$current,
						"inputs",
						lv_inputs_14_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepInputs");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSProcedureStepAccess().getOutputsVSVSStepOutputsParserRuleCall_12_0());
				}
				lv_outputs_15_0=ruleVSVSStepOutputs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSProcedureStepRule());
					}
					set(
						$current,
						"outputs",
						lv_outputs_15_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutputs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSProcedureStepAccess().getSpecialPacketsVSVSStepSpecialPacketsParserRuleCall_13_0());
				}
				lv_specialPackets_16_0=ruleVSVSStepSpecialPackets
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSProcedureStepRule());
					}
					set(
						$current,
						"specialPackets",
						lv_specialPackets_16_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepSpecialPackets");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSProcedureStepAccess().getConcurrent_stepsVSVSStepConcurrentStepsParserRuleCall_14_0());
				}
				lv_concurrent_steps_17_0=ruleVSVSStepConcurrentSteps
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSProcedureStepRule());
					}
					set(
						$current,
						"concurrent_steps",
						lv_concurrent_steps_17_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepConcurrentSteps");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_18='</step>'
		{
			newLeafNode(otherlv_18, grammarAccess.getVSVSProcedureStepAccess().getStepKeyword_15());
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
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVSVSStepInputsAccess().getVSVSStepInputsAction_0(),
					$current);
			}
		)
		otherlv_1='<inputs>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepInputsAccess().getInputsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepInputsAccess().getInputVSVSStepInputParserRuleCall_2_0());
				}
				lv_input_2_0=ruleVSVSStepInput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepInputsRule());
					}
					add(
						$current,
						"input",
						lv_input_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepInput");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='</inputs>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepInputsAccess().getInputsKeyword_3());
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
	(
		otherlv_0='<outputs'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepOutputsAccess().getOutputsKeyword_0());
		}
		otherlv_1='checkmode='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepOutputsAccess().getCheckmodeKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputsAccess().getCheckmodeVSVSStepCheckmodeEnumRuleCall_2_0());
				}
				lv_checkmode_2_0=ruleVSVSStepCheckmode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputsRule());
					}
					set(
						$current,
						"checkmode",
						lv_checkmode_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepCheckmode");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='valid_time_interval_value='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_valueKeyword_3());
		}
		(
			(
				lv_valid_time_interval_value_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_valid_time_interval_value_4_0, grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_valueUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputsRule());
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
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_unitKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_unitVSVSStepUnitEnumRuleCall_6_0());
				}
				lv_valid_time_interval_unit_6_0=ruleVSVSStepUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputsRule());
					}
					set(
						$current,
						"valid_time_interval_unit",
						lv_valid_time_interval_unit_6_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVSVSStepOutputsAccess().getGreaterThanSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputsAccess().getOutputVSVSStepOutputParserRuleCall_8_0());
				}
				lv_output_8_0=ruleVSVSStepOutput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputsRule());
					}
					add(
						$current,
						"output",
						lv_output_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepOutput");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_9='</outputs>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSStepOutputsAccess().getOutputsKeyword_9());
		}
	)
;

// Entry rule entryRuleVSVSStepSpecialPackets
entryRuleVSVSStepSpecialPackets returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepSpecialPacketsRule()); }
	iv_ruleVSVSStepSpecialPackets=ruleVSVSStepSpecialPackets
	{ $current=$iv_ruleVSVSStepSpecialPackets.current; }
	EOF;

// Rule VSVSStepSpecialPackets
ruleVSVSStepSpecialPackets returns [EObject current=null]
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
					grammarAccess.getVSVSStepSpecialPacketsAccess().getVSVSStepSpecialPacketsAction_0(),
					$current);
			}
		)
		otherlv_1='<specialPackets>'
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepSpecialPacketsAccess().getSpecialPacketsKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getVSVSStepSpecialPacketsAccess().getEnableVSVSStepEnableParserRuleCall_2_0_0());
					}
					lv_enable_2_0=ruleVSVSStepEnable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSVSStepSpecialPacketsRule());
						}
						add(
							$current,
							"enable",
							lv_enable_2_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepEnable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getVSVSStepSpecialPacketsAccess().getDisableVSVSStepDisableParserRuleCall_2_1_0());
					}
					lv_disable_3_0=ruleVSVSStepDisable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSVSStepSpecialPacketsRule());
						}
						add(
							$current,
							"disable",
							lv_disable_3_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepDisable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getVSVSStepSpecialPacketsAccess().getEnable_printVSVSStepEnablePrintParserRuleCall_2_2_0());
					}
					lv_enable_print_4_0=ruleVSVSStepEnablePrint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSVSStepSpecialPacketsRule());
						}
						add(
							$current,
							"enable_print",
							lv_enable_print_4_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepEnablePrint");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getVSVSStepSpecialPacketsAccess().getDisable_printVSVSStepDisablePrintParserRuleCall_2_3_0());
					}
					lv_disable_print_5_0=ruleVSVSStepDisablePrint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVSVSStepSpecialPacketsRule());
						}
						add(
							$current,
							"disable_print",
							lv_disable_print_5_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepDisablePrint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_6='</specialPackets>'
		{
			newLeafNode(otherlv_6, grammarAccess.getVSVSStepSpecialPacketsAccess().getSpecialPacketsKeyword_3());
		}
	)
;

// Entry rule entryRuleVSVSStepConcurrentSteps
entryRuleVSVSStepConcurrentSteps returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepConcurrentStepsRule()); }
	iv_ruleVSVSStepConcurrentSteps=ruleVSVSStepConcurrentSteps
	{ $current=$iv_ruleVSVSStepConcurrentSteps.current; }
	EOF;

// Rule VSVSStepConcurrentSteps
ruleVSVSStepConcurrentSteps returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<concurrent_steps'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepConcurrentStepsAccess().getConcurrent_stepsKeyword_0());
		}
		otherlv_1='nextStep='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepConcurrentStepsAccess().getNextStepKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepConcurrentStepsAccess().getNextStepVSVSStepNextStepParserRuleCall_2_0());
				}
				lv_nextStep_2_0=ruleVSVSStepNextStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepConcurrentStepsRule());
					}
					set(
						$current,
						"nextStep",
						lv_nextStep_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepNextStep");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepConcurrentStepsAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepConcurrentStepsAccess().getConcurrent_stepVSVSStepConcurrentStepParserRuleCall_4_0());
				}
				lv_concurrent_step_4_0=ruleVSVSStepConcurrentStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepConcurrentStepsRule());
					}
					add(
						$current,
						"concurrent_step",
						lv_concurrent_step_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepConcurrentStep");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='</concurrent_steps>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepConcurrentStepsAccess().getConcurrent_stepsKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSStepInput
entryRuleVSVSStepInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepInputRule()); }
	iv_ruleVSVSStepInput=ruleVSVSStepInput
	{ $current=$iv_ruleVSVSStepInput.current; }
	EOF;

// Rule VSVSStepInput
ruleVSVSStepInput returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getVSVSStepInputAccess().getVSVSStepInputLevel3ParserRuleCall_0());
		}
		this_VSVSStepInputLevel3_0=ruleVSVSStepInputLevel3
		{
			$current = $this_VSVSStepInputLevel3_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getVSVSStepInputAccess().getVSVSStepInputLevel2ParserRuleCall_1());
		}
		this_VSVSStepInputLevel2_1=ruleVSVSStepInputLevel2
		{
			$current = $this_VSVSStepInputLevel2_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getVSVSStepInputAccess().getVSVSStepInputLevel1ParserRuleCall_2());
		}
		this_VSVSStepInputLevel1_2=ruleVSVSStepInputLevel1
		{
			$current = $this_VSVSStepInputLevel1_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getVSVSStepInputAccess().getVSVSStepInputLevel0ParserRuleCall_3());
		}
		this_VSVSStepInputLevel0_3=ruleVSVSStepInputLevel0
		{
			$current = $this_VSVSStepInputLevel0_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVSVSStepInputLevel3
entryRuleVSVSStepInputLevel3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepInputLevel3Rule()); }
	iv_ruleVSVSStepInputLevel3=ruleVSVSStepInputLevel3
	{ $current=$iv_ruleVSVSStepInputLevel3.current; }
	EOF;

// Rule VSVSStepInputLevel3
ruleVSVSStepInputLevel3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<input_level_3'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepInputLevel3Access().getInput_level_3Keyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepInputLevel3Access().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSStepInputLevel3Access().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel3Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='ifRef='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepInputLevel3Access().getIfRefKeyword_3());
		}
		(
			(
				lv_ifRef_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_ifRef_4_0, grammarAccess.getVSVSStepInputLevel3Access().getIfRefUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel3Rule());
					}
					setWithLastConsumed(
						$current,
						"ifRef",
						lv_ifRef_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_5='delay_value='
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepInputLevel3Access().getDelay_valueKeyword_5());
		}
		(
			(
				lv_delay_value_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_delay_value_6_0, grammarAccess.getVSVSStepInputLevel3Access().getDelay_valueUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel3Rule());
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
			newLeafNode(otherlv_7, grammarAccess.getVSVSStepInputLevel3Access().getDelay_unitKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepInputLevel3Access().getDelay_unitVSVSStepUnitEnumRuleCall_8_0());
				}
				lv_delay_unit_8_0=ruleVSVSStepUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepInputLevel3Rule());
					}
					set(
						$current,
						"delay_unit",
						lv_delay_unit_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSStepInputLevel3Access().getGreaterThanSignKeyword_9());
		}
		(
			otherlv_10='<level3'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSVSStepInputLevel3Access().getLevel3Keyword_10_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel3Rule());
						}
					}
					otherlv_11=RULE_STRING
					{
						newLeafNode(otherlv_11, grammarAccess.getVSVSStepInputLevel3Access().getLevel3TMTCIFFormatFormatCrossReference_10_1_0());
					}
				)
			)
			otherlv_12='/>'
			{
				newLeafNode(otherlv_12, grammarAccess.getVSVSStepInputLevel3Access().getSolidusGreaterThanSignKeyword_10_2());
			}
		)?
		otherlv_13='<app_to_level3'
		{
			newLeafNode(otherlv_13, grammarAccess.getVSVSStepInputLevel3Access().getApp_to_level3Keyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel3Rule());
					}
				}
				otherlv_14=RULE_STRING
				{
					newLeafNode(otherlv_14, grammarAccess.getVSVSStepInputLevel3Access().getApp_to_level3TMTCIFExportExportCrossReference_12_0());
				}
			)
		)
		otherlv_15='/>'
		{
			newLeafNode(otherlv_15, grammarAccess.getVSVSStepInputLevel3Access().getSolidusGreaterThanSignKeyword_13());
		}
		(
			otherlv_16='<level2'
			{
				newLeafNode(otherlv_16, grammarAccess.getVSVSStepInputLevel3Access().getLevel2Keyword_14_0());
			}
			otherlv_17='format='
			{
				newLeafNode(otherlv_17, grammarAccess.getVSVSStepInputLevel3Access().getFormatKeyword_14_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel3Rule());
						}
					}
					otherlv_18=RULE_STRING
					{
						newLeafNode(otherlv_18, grammarAccess.getVSVSStepInputLevel3Access().getLevel2TMTCIFFormatFormatCrossReference_14_2_0());
					}
				)
			)
			otherlv_19='/>'
			{
				newLeafNode(otherlv_19, grammarAccess.getVSVSStepInputLevel3Access().getSolidusGreaterThanSignKeyword_14_3());
			}
		)?
		(
			otherlv_20='<level3_to_level2'
			{
				newLeafNode(otherlv_20, grammarAccess.getVSVSStepInputLevel3Access().getLevel3_to_level2Keyword_15_0());
			}
			otherlv_21='export='
			{
				newLeafNode(otherlv_21, grammarAccess.getVSVSStepInputLevel3Access().getExportKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel3Rule());
						}
					}
					otherlv_22=RULE_STRING
					{
						newLeafNode(otherlv_22, grammarAccess.getVSVSStepInputLevel3Access().getLevel3_to_level2TMTCIFExportExportCrossReference_15_2_0());
					}
				)
			)
			otherlv_23='/>'
			{
				newLeafNode(otherlv_23, grammarAccess.getVSVSStepInputLevel3Access().getSolidusGreaterThanSignKeyword_15_3());
			}
		)?
		(
			otherlv_24='<level1'
			{
				newLeafNode(otherlv_24, grammarAccess.getVSVSStepInputLevel3Access().getLevel1Keyword_16_0());
			}
			otherlv_25='format='
			{
				newLeafNode(otherlv_25, grammarAccess.getVSVSStepInputLevel3Access().getFormatKeyword_16_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel3Rule());
						}
					}
					otherlv_26=RULE_STRING
					{
						newLeafNode(otherlv_26, grammarAccess.getVSVSStepInputLevel3Access().getLevel1TMTCIFFormatFormatCrossReference_16_2_0());
					}
				)
			)
			otherlv_27='/>'
			{
				newLeafNode(otherlv_27, grammarAccess.getVSVSStepInputLevel3Access().getSolidusGreaterThanSignKeyword_16_3());
			}
		)?
		(
			otherlv_28='<level2_to_level1'
			{
				newLeafNode(otherlv_28, grammarAccess.getVSVSStepInputLevel3Access().getLevel2_to_level1Keyword_17_0());
			}
			otherlv_29='export='
			{
				newLeafNode(otherlv_29, grammarAccess.getVSVSStepInputLevel3Access().getExportKeyword_17_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel3Rule());
						}
					}
					otherlv_30=RULE_STRING
					{
						newLeafNode(otherlv_30, grammarAccess.getVSVSStepInputLevel3Access().getLevel2_to_level1TMTCIFExportExportCrossReference_17_2_0());
					}
				)
			)
			otherlv_31='/>'
			{
				newLeafNode(otherlv_31, grammarAccess.getVSVSStepInputLevel3Access().getSolidusGreaterThanSignKeyword_17_3());
			}
		)?
		(
			otherlv_32='<level0'
			{
				newLeafNode(otherlv_32, grammarAccess.getVSVSStepInputLevel3Access().getLevel0Keyword_18_0());
			}
			otherlv_33='format='
			{
				newLeafNode(otherlv_33, grammarAccess.getVSVSStepInputLevel3Access().getFormatKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel3Rule());
						}
					}
					otherlv_34=RULE_STRING
					{
						newLeafNode(otherlv_34, grammarAccess.getVSVSStepInputLevel3Access().getLevel0TMTCIFFormatFormatCrossReference_18_2_0());
					}
				)
			)
			otherlv_35='/>'
			{
				newLeafNode(otherlv_35, grammarAccess.getVSVSStepInputLevel3Access().getSolidusGreaterThanSignKeyword_18_3());
			}
		)?
		(
			otherlv_36='<level1_to_level0'
			{
				newLeafNode(otherlv_36, grammarAccess.getVSVSStepInputLevel3Access().getLevel1_to_level0Keyword_19_0());
			}
			otherlv_37='export='
			{
				newLeafNode(otherlv_37, grammarAccess.getVSVSStepInputLevel3Access().getExportKeyword_19_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel3Rule());
						}
					}
					otherlv_38=RULE_STRING
					{
						newLeafNode(otherlv_38, grammarAccess.getVSVSStepInputLevel3Access().getLevel1_to_level0TMTCIFExportExportCrossReference_19_2_0());
					}
				)
			)
			otherlv_39='/>'
			{
				newLeafNode(otherlv_39, grammarAccess.getVSVSStepInputLevel3Access().getSolidusGreaterThanSignKeyword_19_3());
			}
		)?
		otherlv_40='</input_level_3>'
		{
			newLeafNode(otherlv_40, grammarAccess.getVSVSStepInputLevel3Access().getInput_level_3Keyword_20());
		}
	)
;

// Entry rule entryRuleVSVSStepInputLevel2
entryRuleVSVSStepInputLevel2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepInputLevel2Rule()); }
	iv_ruleVSVSStepInputLevel2=ruleVSVSStepInputLevel2
	{ $current=$iv_ruleVSVSStepInputLevel2.current; }
	EOF;

// Rule VSVSStepInputLevel2
ruleVSVSStepInputLevel2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<input_level_2'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepInputLevel2Access().getInput_level_2Keyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepInputLevel2Access().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSStepInputLevel2Access().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel2Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='ifRef='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepInputLevel2Access().getIfRefKeyword_3());
		}
		(
			(
				lv_ifRef_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_ifRef_4_0, grammarAccess.getVSVSStepInputLevel2Access().getIfRefUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel2Rule());
					}
					setWithLastConsumed(
						$current,
						"ifRef",
						lv_ifRef_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_5='delay_value='
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepInputLevel2Access().getDelay_valueKeyword_5());
		}
		(
			(
				lv_delay_value_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_delay_value_6_0, grammarAccess.getVSVSStepInputLevel2Access().getDelay_valueUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel2Rule());
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
			newLeafNode(otherlv_7, grammarAccess.getVSVSStepInputLevel2Access().getDelay_unitKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepInputLevel2Access().getDelay_unitVSVSStepUnitEnumRuleCall_8_0());
				}
				lv_delay_unit_8_0=ruleVSVSStepUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepInputLevel2Rule());
					}
					set(
						$current,
						"delay_unit",
						lv_delay_unit_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSStepInputLevel2Access().getGreaterThanSignKeyword_9());
		}
		(
			otherlv_10='<level2'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSVSStepInputLevel2Access().getLevel2Keyword_10_0());
			}
			otherlv_11='format='
			{
				newLeafNode(otherlv_11, grammarAccess.getVSVSStepInputLevel2Access().getFormatKeyword_10_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel2Rule());
						}
					}
					otherlv_12=RULE_STRING
					{
						newLeafNode(otherlv_12, grammarAccess.getVSVSStepInputLevel2Access().getLevel2TMTCIFFormatFormatCrossReference_10_2_0());
					}
				)
			)
			otherlv_13='/>'
			{
				newLeafNode(otherlv_13, grammarAccess.getVSVSStepInputLevel2Access().getSolidusGreaterThanSignKeyword_10_3());
			}
		)?
		otherlv_14='<app_to_level2'
		{
			newLeafNode(otherlv_14, grammarAccess.getVSVSStepInputLevel2Access().getApp_to_level2Keyword_11());
		}
		otherlv_15='export='
		{
			newLeafNode(otherlv_15, grammarAccess.getVSVSStepInputLevel2Access().getExportKeyword_12());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel2Rule());
					}
				}
				otherlv_16=RULE_STRING
				{
					newLeafNode(otherlv_16, grammarAccess.getVSVSStepInputLevel2Access().getApp_to_level2TMTCIFExportExportCrossReference_13_0());
				}
			)
		)
		otherlv_17='/>'
		{
			newLeafNode(otherlv_17, grammarAccess.getVSVSStepInputLevel2Access().getSolidusGreaterThanSignKeyword_14());
		}
		(
			otherlv_18='<level1'
			{
				newLeafNode(otherlv_18, grammarAccess.getVSVSStepInputLevel2Access().getLevel1Keyword_15_0());
			}
			otherlv_19='format='
			{
				newLeafNode(otherlv_19, grammarAccess.getVSVSStepInputLevel2Access().getFormatKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel2Rule());
						}
					}
					otherlv_20=RULE_STRING
					{
						newLeafNode(otherlv_20, grammarAccess.getVSVSStepInputLevel2Access().getLevel1TMTCIFFormatFormatCrossReference_15_2_0());
					}
				)
			)
			otherlv_21='/>'
			{
				newLeafNode(otherlv_21, grammarAccess.getVSVSStepInputLevel2Access().getSolidusGreaterThanSignKeyword_15_3());
			}
		)?
		(
			otherlv_22='<level2_to_level1'
			{
				newLeafNode(otherlv_22, grammarAccess.getVSVSStepInputLevel2Access().getLevel2_to_level1Keyword_16_0());
			}
			otherlv_23='export='
			{
				newLeafNode(otherlv_23, grammarAccess.getVSVSStepInputLevel2Access().getExportKeyword_16_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel2Rule());
						}
					}
					otherlv_24=RULE_STRING
					{
						newLeafNode(otherlv_24, grammarAccess.getVSVSStepInputLevel2Access().getLevel2_to_level1TMTCIFExportExportCrossReference_16_2_0());
					}
				)
			)
			otherlv_25='/>'
			{
				newLeafNode(otherlv_25, grammarAccess.getVSVSStepInputLevel2Access().getSolidusGreaterThanSignKeyword_16_3());
			}
		)?
		(
			otherlv_26='<level0'
			{
				newLeafNode(otherlv_26, grammarAccess.getVSVSStepInputLevel2Access().getLevel0Keyword_17_0());
			}
			otherlv_27='format='
			{
				newLeafNode(otherlv_27, grammarAccess.getVSVSStepInputLevel2Access().getFormatKeyword_17_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel2Rule());
						}
					}
					otherlv_28=RULE_STRING
					{
						newLeafNode(otherlv_28, grammarAccess.getVSVSStepInputLevel2Access().getLevel0TMTCIFFormatFormatCrossReference_17_2_0());
					}
				)
			)
			otherlv_29='/>'
			{
				newLeafNode(otherlv_29, grammarAccess.getVSVSStepInputLevel2Access().getSolidusGreaterThanSignKeyword_17_3());
			}
		)?
		(
			otherlv_30='<level1_to_level0'
			{
				newLeafNode(otherlv_30, grammarAccess.getVSVSStepInputLevel2Access().getLevel1_to_level0Keyword_18_0());
			}
			otherlv_31='export='
			{
				newLeafNode(otherlv_31, grammarAccess.getVSVSStepInputLevel2Access().getExportKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel2Rule());
						}
					}
					otherlv_32=RULE_STRING
					{
						newLeafNode(otherlv_32, grammarAccess.getVSVSStepInputLevel2Access().getLevel1_to_level0TMTCIFExportExportCrossReference_18_2_0());
					}
				)
			)
			otherlv_33='/>'
			{
				newLeafNode(otherlv_33, grammarAccess.getVSVSStepInputLevel2Access().getSolidusGreaterThanSignKeyword_18_3());
			}
		)?
		otherlv_34='</input_level_2>'
		{
			newLeafNode(otherlv_34, grammarAccess.getVSVSStepInputLevel2Access().getInput_level_2Keyword_19());
		}
	)
;

// Entry rule entryRuleVSVSStepInputLevel1
entryRuleVSVSStepInputLevel1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepInputLevel1Rule()); }
	iv_ruleVSVSStepInputLevel1=ruleVSVSStepInputLevel1
	{ $current=$iv_ruleVSVSStepInputLevel1.current; }
	EOF;

// Rule VSVSStepInputLevel1
ruleVSVSStepInputLevel1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<input_level_1'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepInputLevel1Access().getInput_level_1Keyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepInputLevel1Access().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSStepInputLevel1Access().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel1Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='ifRef='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepInputLevel1Access().getIfRefKeyword_3());
		}
		(
			(
				lv_ifRef_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_ifRef_4_0, grammarAccess.getVSVSStepInputLevel1Access().getIfRefUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel1Rule());
					}
					setWithLastConsumed(
						$current,
						"ifRef",
						lv_ifRef_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_5='delay_value='
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepInputLevel1Access().getDelay_valueKeyword_5());
		}
		(
			(
				lv_delay_value_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_delay_value_6_0, grammarAccess.getVSVSStepInputLevel1Access().getDelay_valueUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel1Rule());
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
			newLeafNode(otherlv_7, grammarAccess.getVSVSStepInputLevel1Access().getDelay_unitKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepInputLevel1Access().getDelay_unitVSVSStepUnitEnumRuleCall_8_0());
				}
				lv_delay_unit_8_0=ruleVSVSStepUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepInputLevel1Rule());
					}
					set(
						$current,
						"delay_unit",
						lv_delay_unit_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSStepInputLevel1Access().getGreaterThanSignKeyword_9());
		}
		(
			otherlv_10='<level1'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSVSStepInputLevel1Access().getLevel1Keyword_10_0());
			}
			otherlv_11='format='
			{
				newLeafNode(otherlv_11, grammarAccess.getVSVSStepInputLevel1Access().getFormatKeyword_10_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel1Rule());
						}
					}
					otherlv_12=RULE_STRING
					{
						newLeafNode(otherlv_12, grammarAccess.getVSVSStepInputLevel1Access().getLevel1TMTCIFFormatFormatCrossReference_10_2_0());
					}
				)
			)
			otherlv_13='/>'
			{
				newLeafNode(otherlv_13, grammarAccess.getVSVSStepInputLevel1Access().getSolidusGreaterThanSignKeyword_10_3());
			}
		)?
		otherlv_14='<app_to_level1'
		{
			newLeafNode(otherlv_14, grammarAccess.getVSVSStepInputLevel1Access().getApp_to_level1Keyword_11());
		}
		otherlv_15='export='
		{
			newLeafNode(otherlv_15, grammarAccess.getVSVSStepInputLevel1Access().getExportKeyword_12());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel1Rule());
					}
				}
				otherlv_16=RULE_STRING
				{
					newLeafNode(otherlv_16, grammarAccess.getVSVSStepInputLevel1Access().getApp_to_level1TMTCIFExportExportCrossReference_13_0());
				}
			)
		)
		otherlv_17='/>'
		{
			newLeafNode(otherlv_17, grammarAccess.getVSVSStepInputLevel1Access().getSolidusGreaterThanSignKeyword_14());
		}
		(
			otherlv_18='<level0'
			{
				newLeafNode(otherlv_18, grammarAccess.getVSVSStepInputLevel1Access().getLevel0Keyword_15_0());
			}
			otherlv_19='format='
			{
				newLeafNode(otherlv_19, grammarAccess.getVSVSStepInputLevel1Access().getFormatKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel1Rule());
						}
					}
					otherlv_20=RULE_STRING
					{
						newLeafNode(otherlv_20, grammarAccess.getVSVSStepInputLevel1Access().getLevel0TMTCIFFormatFormatCrossReference_15_2_0());
					}
				)
			)
			otherlv_21='/>'
			{
				newLeafNode(otherlv_21, grammarAccess.getVSVSStepInputLevel1Access().getSolidusGreaterThanSignKeyword_15_3());
			}
		)?
		(
			otherlv_22='<level1_to_level0'
			{
				newLeafNode(otherlv_22, grammarAccess.getVSVSStepInputLevel1Access().getLevel1_to_level0Keyword_16_0());
			}
			otherlv_23='export='
			{
				newLeafNode(otherlv_23, grammarAccess.getVSVSStepInputLevel1Access().getExportKeyword_16_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel1Rule());
						}
					}
					otherlv_24=RULE_STRING
					{
						newLeafNode(otherlv_24, grammarAccess.getVSVSStepInputLevel1Access().getLevel1_to_level0TMTCIFExportExportCrossReference_16_2_0());
					}
				)
			)
			otherlv_25='/>'
			{
				newLeafNode(otherlv_25, grammarAccess.getVSVSStepInputLevel1Access().getSolidusGreaterThanSignKeyword_16_3());
			}
		)?
		otherlv_26='</input_level_1>'
		{
			newLeafNode(otherlv_26, grammarAccess.getVSVSStepInputLevel1Access().getInput_level_1Keyword_17());
		}
	)
;

// Entry rule entryRuleVSVSStepInputLevel0
entryRuleVSVSStepInputLevel0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepInputLevel0Rule()); }
	iv_ruleVSVSStepInputLevel0=ruleVSVSStepInputLevel0
	{ $current=$iv_ruleVSVSStepInputLevel0.current; }
	EOF;

// Rule VSVSStepInputLevel0
ruleVSVSStepInputLevel0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<input_level_0'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepInputLevel0Access().getInput_level_0Keyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepInputLevel0Access().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSStepInputLevel0Access().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel0Rule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='ifRef='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepInputLevel0Access().getIfRefKeyword_3());
		}
		(
			(
				lv_ifRef_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_ifRef_4_0, grammarAccess.getVSVSStepInputLevel0Access().getIfRefUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel0Rule());
					}
					setWithLastConsumed(
						$current,
						"ifRef",
						lv_ifRef_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_5='delay_value='
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepInputLevel0Access().getDelay_valueKeyword_5());
		}
		(
			(
				lv_delay_value_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_delay_value_6_0, grammarAccess.getVSVSStepInputLevel0Access().getDelay_valueUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel0Rule());
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
			newLeafNode(otherlv_7, grammarAccess.getVSVSStepInputLevel0Access().getDelay_unitKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepInputLevel0Access().getDelay_unitVSVSStepUnitEnumRuleCall_8_0());
				}
				lv_delay_unit_8_0=ruleVSVSStepUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepInputLevel0Rule());
					}
					set(
						$current,
						"delay_unit",
						lv_delay_unit_8_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSStepInputLevel0Access().getGreaterThanSignKeyword_9());
		}
		(
			otherlv_10='<level0'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSVSStepInputLevel0Access().getLevel0Keyword_10_0());
			}
			otherlv_11='format='
			{
				newLeafNode(otherlv_11, grammarAccess.getVSVSStepInputLevel0Access().getFormatKeyword_10_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepInputLevel0Rule());
						}
					}
					otherlv_12=RULE_STRING
					{
						newLeafNode(otherlv_12, grammarAccess.getVSVSStepInputLevel0Access().getLevel0TMTCIFFormatFormatCrossReference_10_2_0());
					}
				)
			)
			otherlv_13='/>'
			{
				newLeafNode(otherlv_13, grammarAccess.getVSVSStepInputLevel0Access().getSolidusGreaterThanSignKeyword_10_3());
			}
		)?
		otherlv_14='<app_to_level0'
		{
			newLeafNode(otherlv_14, grammarAccess.getVSVSStepInputLevel0Access().getApp_to_level0Keyword_11());
		}
		otherlv_15='export='
		{
			newLeafNode(otherlv_15, grammarAccess.getVSVSStepInputLevel0Access().getExportKeyword_12());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepInputLevel0Rule());
					}
				}
				otherlv_16=RULE_STRING
				{
					newLeafNode(otherlv_16, grammarAccess.getVSVSStepInputLevel0Access().getApp_to_level0TMTCIFExportExportCrossReference_13_0());
				}
			)
		)
		otherlv_17='/>'
		{
			newLeafNode(otherlv_17, grammarAccess.getVSVSStepInputLevel0Access().getSolidusGreaterThanSignKeyword_14());
		}
		otherlv_18='</input_level_0>'
		{
			newLeafNode(otherlv_18, grammarAccess.getVSVSStepInputLevel0Access().getInput_level_0Keyword_15());
		}
	)
;

// Entry rule entryRuleVSVSStepOutput
entryRuleVSVSStepOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepOutputRule()); }
	iv_ruleVSVSStepOutput=ruleVSVSStepOutput
	{ $current=$iv_ruleVSVSStepOutput.current; }
	EOF;

// Rule VSVSStepOutput
ruleVSVSStepOutput returns [EObject current=null]
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
			newCompositeNode(grammarAccess.getVSVSStepOutputAccess().getVSVSStepOutputLevel3ParserRuleCall_0());
		}
		this_VSVSStepOutputLevel3_0=ruleVSVSStepOutputLevel3
		{
			$current = $this_VSVSStepOutputLevel3_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getVSVSStepOutputAccess().getVSVSStepOutputLevel2ParserRuleCall_1());
		}
		this_VSVSStepOutputLevel2_1=ruleVSVSStepOutputLevel2
		{
			$current = $this_VSVSStepOutputLevel2_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getVSVSStepOutputAccess().getVSVSStepOutputLevel1ParserRuleCall_2());
		}
		this_VSVSStepOutputLevel1_2=ruleVSVSStepOutputLevel1
		{
			$current = $this_VSVSStepOutputLevel1_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getVSVSStepOutputAccess().getVSVSStepOutputLevel0ParserRuleCall_3());
		}
		this_VSVSStepOutputLevel0_3=ruleVSVSStepOutputLevel0
		{
			$current = $this_VSVSStepOutputLevel0_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVSVSStepOutputLevel3
entryRuleVSVSStepOutputLevel3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepOutputLevel3Rule()); }
	iv_ruleVSVSStepOutputLevel3=ruleVSVSStepOutputLevel3
	{ $current=$iv_ruleVSVSStepOutputLevel3.current; }
	EOF;

// Rule VSVSStepOutputLevel3
ruleVSVSStepOutputLevel3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<output_level_3'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepOutputLevel3Access().getOutput_level_3Keyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepOutputLevel3Access().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSStepOutputLevel3Access().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel3Rule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepOutputLevel3Access().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVSVSStepOutputLevel3Access().getIdUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel3Rule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_5='ifRef='
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepOutputLevel3Access().getIfRefKeyword_5());
		}
		(
			(
				lv_ifRef_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_ifRef_6_0, grammarAccess.getVSVSStepOutputLevel3Access().getIfRefUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel3Rule());
					}
					setWithLastConsumed(
						$current,
						"ifRef",
						lv_ifRef_6_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		(
			otherlv_7='optional='
			{
				newLeafNode(otherlv_7, grammarAccess.getVSVSStepOutputLevel3Access().getOptionalKeyword_7_0());
			}
			(
				(
					lv_optional_8_0=RULE_UINT_STRING
					{
						newLeafNode(lv_optional_8_0, grammarAccess.getVSVSStepOutputLevel3Access().getOptionalUINT_STRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel3Rule());
						}
						setWithLastConsumed(
							$current,
							"optional",
							lv_optional_8_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
					}
				)
			)
		)?
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSStepOutputLevel3Access().getGreaterThanSignKeyword_8());
		}
		(
			otherlv_10='<level3'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSVSStepOutputLevel3Access().getLevel3Keyword_9_0());
			}
			otherlv_11='format='
			{
				newLeafNode(otherlv_11, grammarAccess.getVSVSStepOutputLevel3Access().getFormatKeyword_9_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel3Rule());
						}
					}
					otherlv_12=RULE_STRING
					{
						newLeafNode(otherlv_12, grammarAccess.getVSVSStepOutputLevel3Access().getLevel3TMTCIFFormatFormatCrossReference_9_2_0());
					}
				)
			)
			otherlv_13='/>'
			{
				newLeafNode(otherlv_13, grammarAccess.getVSVSStepOutputLevel3Access().getSolidusGreaterThanSignKeyword_9_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputLevel3Access().getLevel3_filterVSVSStepLevel3FilterParserRuleCall_10_0());
				}
				lv_level3_filter_14_0=ruleVSVSStepLevel3Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputLevel3Rule());
					}
					set(
						$current,
						"level3_filter",
						lv_level3_filter_14_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel3Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_15='<level2'
			{
				newLeafNode(otherlv_15, grammarAccess.getVSVSStepOutputLevel3Access().getLevel2Keyword_11_0());
			}
			otherlv_16='format='
			{
				newLeafNode(otherlv_16, grammarAccess.getVSVSStepOutputLevel3Access().getFormatKeyword_11_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel3Rule());
						}
					}
					otherlv_17=RULE_STRING
					{
						newLeafNode(otherlv_17, grammarAccess.getVSVSStepOutputLevel3Access().getLevel2TMTCIFFormatFormatCrossReference_11_2_0());
					}
				)
			)
			otherlv_18='/>'
			{
				newLeafNode(otherlv_18, grammarAccess.getVSVSStepOutputLevel3Access().getSolidusGreaterThanSignKeyword_11_3());
			}
		)?
		(
			otherlv_19='<level3_from_level2'
			{
				newLeafNode(otherlv_19, grammarAccess.getVSVSStepOutputLevel3Access().getLevel3_from_level2Keyword_12_0());
			}
			otherlv_20='import='
			{
				newLeafNode(otherlv_20, grammarAccess.getVSVSStepOutputLevel3Access().getImportKeyword_12_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel3Rule());
						}
					}
					otherlv_21=RULE_STRING
					{
						newLeafNode(otherlv_21, grammarAccess.getVSVSStepOutputLevel3Access().getLevel3_from_level2TMTCIFImportImportCrossReference_12_2_0());
					}
				)
			)
			otherlv_22='/>'
			{
				newLeafNode(otherlv_22, grammarAccess.getVSVSStepOutputLevel3Access().getSolidusGreaterThanSignKeyword_12_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputLevel3Access().getLevel2_filterVSVSStepLevel2FilterParserRuleCall_13_0());
				}
				lv_level2_filter_23_0=ruleVSVSStepLevel2Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputLevel3Rule());
					}
					set(
						$current,
						"level2_filter",
						lv_level2_filter_23_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel2Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_24='<level1'
			{
				newLeafNode(otherlv_24, grammarAccess.getVSVSStepOutputLevel3Access().getLevel1Keyword_14_0());
			}
			otherlv_25='format='
			{
				newLeafNode(otherlv_25, grammarAccess.getVSVSStepOutputLevel3Access().getFormatKeyword_14_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel3Rule());
						}
					}
					otherlv_26=RULE_STRING
					{
						newLeafNode(otherlv_26, grammarAccess.getVSVSStepOutputLevel3Access().getLevel1TMTCIFFormatFormatCrossReference_14_2_0());
					}
				)
			)
			otherlv_27='/>'
			{
				newLeafNode(otherlv_27, grammarAccess.getVSVSStepOutputLevel3Access().getSolidusGreaterThanSignKeyword_14_3());
			}
		)?
		(
			otherlv_28='<level2_from_level1'
			{
				newLeafNode(otherlv_28, grammarAccess.getVSVSStepOutputLevel3Access().getLevel2_from_level1Keyword_15_0());
			}
			otherlv_29='import='
			{
				newLeafNode(otherlv_29, grammarAccess.getVSVSStepOutputLevel3Access().getImportKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel3Rule());
						}
					}
					otherlv_30=RULE_STRING
					{
						newLeafNode(otherlv_30, grammarAccess.getVSVSStepOutputLevel3Access().getLevel2_from_level1TMTCIFImportImportCrossReference_15_2_0());
					}
				)
			)
			otherlv_31='/>'
			{
				newLeafNode(otherlv_31, grammarAccess.getVSVSStepOutputLevel3Access().getSolidusGreaterThanSignKeyword_15_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputLevel3Access().getLevel1_filterVSVSStepLevel1FilterParserRuleCall_16_0());
				}
				lv_level1_filter_32_0=ruleVSVSStepLevel1Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputLevel3Rule());
					}
					set(
						$current,
						"level1_filter",
						lv_level1_filter_32_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel1Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_33='<level0'
			{
				newLeafNode(otherlv_33, grammarAccess.getVSVSStepOutputLevel3Access().getLevel0Keyword_17_0());
			}
			otherlv_34='format='
			{
				newLeafNode(otherlv_34, grammarAccess.getVSVSStepOutputLevel3Access().getFormatKeyword_17_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel3Rule());
						}
					}
					otherlv_35=RULE_STRING
					{
						newLeafNode(otherlv_35, grammarAccess.getVSVSStepOutputLevel3Access().getLevel0TMTCIFFormatFormatCrossReference_17_2_0());
					}
				)
			)
			otherlv_36='/>'
			{
				newLeafNode(otherlv_36, grammarAccess.getVSVSStepOutputLevel3Access().getSolidusGreaterThanSignKeyword_17_3());
			}
		)?
		(
			otherlv_37='<level1_from_level0'
			{
				newLeafNode(otherlv_37, grammarAccess.getVSVSStepOutputLevel3Access().getLevel1_from_level0Keyword_18_0());
			}
			otherlv_38='import='
			{
				newLeafNode(otherlv_38, grammarAccess.getVSVSStepOutputLevel3Access().getImportKeyword_18_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel3Rule());
						}
					}
					otherlv_39=RULE_STRING
					{
						newLeafNode(otherlv_39, grammarAccess.getVSVSStepOutputLevel3Access().getLevel1_from_level0TMTCIFImportImportCrossReference_18_2_0());
					}
				)
			)
			otherlv_40='/>'
			{
				newLeafNode(otherlv_40, grammarAccess.getVSVSStepOutputLevel3Access().getSolidusGreaterThanSignKeyword_18_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputLevel3Access().getLevel0_filterVSVSStepLevel0FilterParserRuleCall_19_0());
				}
				lv_level0_filter_41_0=ruleVSVSStepLevel0Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputLevel3Rule());
					}
					set(
						$current,
						"level0_filter",
						lv_level0_filter_41_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel0Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_42='</output_level_3>'
		{
			newLeafNode(otherlv_42, grammarAccess.getVSVSStepOutputLevel3Access().getOutput_level_3Keyword_20());
		}
	)
;

// Entry rule entryRuleVSVSStepOutputLevel2
entryRuleVSVSStepOutputLevel2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepOutputLevel2Rule()); }
	iv_ruleVSVSStepOutputLevel2=ruleVSVSStepOutputLevel2
	{ $current=$iv_ruleVSVSStepOutputLevel2.current; }
	EOF;

// Rule VSVSStepOutputLevel2
ruleVSVSStepOutputLevel2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<output_level_2'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepOutputLevel2Access().getOutput_level_2Keyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepOutputLevel2Access().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSStepOutputLevel2Access().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel2Rule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepOutputLevel2Access().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVSVSStepOutputLevel2Access().getIdUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel2Rule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_5='ifRef='
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepOutputLevel2Access().getIfRefKeyword_5());
		}
		(
			(
				lv_ifRef_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_ifRef_6_0, grammarAccess.getVSVSStepOutputLevel2Access().getIfRefUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel2Rule());
					}
					setWithLastConsumed(
						$current,
						"ifRef",
						lv_ifRef_6_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		(
			otherlv_7='optional='
			{
				newLeafNode(otherlv_7, grammarAccess.getVSVSStepOutputLevel2Access().getOptionalKeyword_7_0());
			}
			(
				(
					lv_optional_8_0=RULE_UINT_STRING
					{
						newLeafNode(lv_optional_8_0, grammarAccess.getVSVSStepOutputLevel2Access().getOptionalUINT_STRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel2Rule());
						}
						setWithLastConsumed(
							$current,
							"optional",
							lv_optional_8_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
					}
				)
			)
		)?
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSStepOutputLevel2Access().getGreaterThanSignKeyword_8());
		}
		(
			otherlv_10='<level2'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSVSStepOutputLevel2Access().getLevel2Keyword_9_0());
			}
			otherlv_11='format='
			{
				newLeafNode(otherlv_11, grammarAccess.getVSVSStepOutputLevel2Access().getFormatKeyword_9_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel2Rule());
						}
					}
					otherlv_12=RULE_STRING
					{
						newLeafNode(otherlv_12, grammarAccess.getVSVSStepOutputLevel2Access().getLevel2TMTCIFFormatFormatCrossReference_9_2_0());
					}
				)
			)
			otherlv_13='/>'
			{
				newLeafNode(otherlv_13, grammarAccess.getVSVSStepOutputLevel2Access().getSolidusGreaterThanSignKeyword_9_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputLevel2Access().getLevel2_filterVSVSStepLevel2FilterParserRuleCall_10_0());
				}
				lv_level2_filter_14_0=ruleVSVSStepLevel2Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputLevel2Rule());
					}
					set(
						$current,
						"level2_filter",
						lv_level2_filter_14_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel2Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_15='<level1'
			{
				newLeafNode(otherlv_15, grammarAccess.getVSVSStepOutputLevel2Access().getLevel1Keyword_11_0());
			}
			otherlv_16='format='
			{
				newLeafNode(otherlv_16, grammarAccess.getVSVSStepOutputLevel2Access().getFormatKeyword_11_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel2Rule());
						}
					}
					otherlv_17=RULE_STRING
					{
						newLeafNode(otherlv_17, grammarAccess.getVSVSStepOutputLevel2Access().getLevel1TMTCIFFormatFormatCrossReference_11_2_0());
					}
				)
			)
			otherlv_18='/>'
			{
				newLeafNode(otherlv_18, grammarAccess.getVSVSStepOutputLevel2Access().getSolidusGreaterThanSignKeyword_11_3());
			}
		)?
		(
			otherlv_19='<level2_from_level1'
			{
				newLeafNode(otherlv_19, grammarAccess.getVSVSStepOutputLevel2Access().getLevel2_from_level1Keyword_12_0());
			}
			otherlv_20='import='
			{
				newLeafNode(otherlv_20, grammarAccess.getVSVSStepOutputLevel2Access().getImportKeyword_12_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel2Rule());
						}
					}
					otherlv_21=RULE_STRING
					{
						newLeafNode(otherlv_21, grammarAccess.getVSVSStepOutputLevel2Access().getLevel2_from_level1TMTCIFImportImportCrossReference_12_2_0());
					}
				)
			)
			otherlv_22='/>'
			{
				newLeafNode(otherlv_22, grammarAccess.getVSVSStepOutputLevel2Access().getSolidusGreaterThanSignKeyword_12_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputLevel2Access().getLevel1_filterVSVSStepLevel1FilterParserRuleCall_13_0());
				}
				lv_level1_filter_23_0=ruleVSVSStepLevel1Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputLevel2Rule());
					}
					set(
						$current,
						"level1_filter",
						lv_level1_filter_23_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel1Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_24='<level0'
			{
				newLeafNode(otherlv_24, grammarAccess.getVSVSStepOutputLevel2Access().getLevel0Keyword_14_0());
			}
			otherlv_25='format='
			{
				newLeafNode(otherlv_25, grammarAccess.getVSVSStepOutputLevel2Access().getFormatKeyword_14_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel2Rule());
						}
					}
					otherlv_26=RULE_STRING
					{
						newLeafNode(otherlv_26, grammarAccess.getVSVSStepOutputLevel2Access().getLevel0TMTCIFFormatFormatCrossReference_14_2_0());
					}
				)
			)
			otherlv_27='/>'
			{
				newLeafNode(otherlv_27, grammarAccess.getVSVSStepOutputLevel2Access().getSolidusGreaterThanSignKeyword_14_3());
			}
		)?
		(
			otherlv_28='<level1_from_level0'
			{
				newLeafNode(otherlv_28, grammarAccess.getVSVSStepOutputLevel2Access().getLevel1_from_level0Keyword_15_0());
			}
			otherlv_29='import='
			{
				newLeafNode(otherlv_29, grammarAccess.getVSVSStepOutputLevel2Access().getImportKeyword_15_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel2Rule());
						}
					}
					otherlv_30=RULE_STRING
					{
						newLeafNode(otherlv_30, grammarAccess.getVSVSStepOutputLevel2Access().getLevel1_from_level0TMTCIFImportImportCrossReference_15_2_0());
					}
				)
			)
			otherlv_31='/>'
			{
				newLeafNode(otherlv_31, grammarAccess.getVSVSStepOutputLevel2Access().getSolidusGreaterThanSignKeyword_15_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputLevel2Access().getLevel0_filterVSVSStepLevel0FilterParserRuleCall_16_0());
				}
				lv_level0_filter_32_0=ruleVSVSStepLevel0Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputLevel2Rule());
					}
					set(
						$current,
						"level0_filter",
						lv_level0_filter_32_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel0Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='</output_level_2>'
		{
			newLeafNode(otherlv_33, grammarAccess.getVSVSStepOutputLevel2Access().getOutput_level_2Keyword_17());
		}
	)
;

// Entry rule entryRuleVSVSStepOutputLevel1
entryRuleVSVSStepOutputLevel1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepOutputLevel1Rule()); }
	iv_ruleVSVSStepOutputLevel1=ruleVSVSStepOutputLevel1
	{ $current=$iv_ruleVSVSStepOutputLevel1.current; }
	EOF;

// Rule VSVSStepOutputLevel1
ruleVSVSStepOutputLevel1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<output_level_1'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepOutputLevel1Access().getOutput_level_1Keyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepOutputLevel1Access().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSStepOutputLevel1Access().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel1Rule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepOutputLevel1Access().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVSVSStepOutputLevel1Access().getIdUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel1Rule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_5='ifRef='
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepOutputLevel1Access().getIfRefKeyword_5());
		}
		(
			(
				lv_ifRef_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_ifRef_6_0, grammarAccess.getVSVSStepOutputLevel1Access().getIfRefUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel1Rule());
					}
					setWithLastConsumed(
						$current,
						"ifRef",
						lv_ifRef_6_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		(
			otherlv_7='optional='
			{
				newLeafNode(otherlv_7, grammarAccess.getVSVSStepOutputLevel1Access().getOptionalKeyword_7_0());
			}
			(
				(
					lv_optional_8_0=RULE_UINT_STRING
					{
						newLeafNode(lv_optional_8_0, grammarAccess.getVSVSStepOutputLevel1Access().getOptionalUINT_STRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel1Rule());
						}
						setWithLastConsumed(
							$current,
							"optional",
							lv_optional_8_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
					}
				)
			)
		)?
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSStepOutputLevel1Access().getGreaterThanSignKeyword_8());
		}
		(
			otherlv_10='<level1'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSVSStepOutputLevel1Access().getLevel1Keyword_9_0());
			}
			otherlv_11='format='
			{
				newLeafNode(otherlv_11, grammarAccess.getVSVSStepOutputLevel1Access().getFormatKeyword_9_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel1Rule());
						}
					}
					otherlv_12=RULE_STRING
					{
						newLeafNode(otherlv_12, grammarAccess.getVSVSStepOutputLevel1Access().getLevel1TMTCIFFormatFormatCrossReference_9_2_0());
					}
				)
			)
			otherlv_13='/>'
			{
				newLeafNode(otherlv_13, grammarAccess.getVSVSStepOutputLevel1Access().getSolidusGreaterThanSignKeyword_9_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputLevel1Access().getLevel1_filterVSVSStepLevel1FilterParserRuleCall_10_0());
				}
				lv_level1_filter_14_0=ruleVSVSStepLevel1Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputLevel1Rule());
					}
					set(
						$current,
						"level1_filter",
						lv_level1_filter_14_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel1Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_15='<level0'
			{
				newLeafNode(otherlv_15, grammarAccess.getVSVSStepOutputLevel1Access().getLevel0Keyword_11_0());
			}
			otherlv_16='format='
			{
				newLeafNode(otherlv_16, grammarAccess.getVSVSStepOutputLevel1Access().getFormatKeyword_11_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel1Rule());
						}
					}
					otherlv_17=RULE_STRING
					{
						newLeafNode(otherlv_17, grammarAccess.getVSVSStepOutputLevel1Access().getLevel0TMTCIFFormatFormatCrossReference_11_2_0());
					}
				)
			)
			otherlv_18='/>'
			{
				newLeafNode(otherlv_18, grammarAccess.getVSVSStepOutputLevel1Access().getSolidusGreaterThanSignKeyword_11_3());
			}
		)?
		(
			otherlv_19='<level1_from_level0'
			{
				newLeafNode(otherlv_19, grammarAccess.getVSVSStepOutputLevel1Access().getLevel1_from_level0Keyword_12_0());
			}
			otherlv_20='import='
			{
				newLeafNode(otherlv_20, grammarAccess.getVSVSStepOutputLevel1Access().getImportKeyword_12_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel1Rule());
						}
					}
					otherlv_21=RULE_STRING
					{
						newLeafNode(otherlv_21, grammarAccess.getVSVSStepOutputLevel1Access().getLevel1_from_level0TMTCIFImportImportCrossReference_12_2_0());
					}
				)
			)
			otherlv_22='/>'
			{
				newLeafNode(otherlv_22, grammarAccess.getVSVSStepOutputLevel1Access().getSolidusGreaterThanSignKeyword_12_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputLevel1Access().getLevel0_filterVSVSStepLevel0FilterParserRuleCall_13_0());
				}
				lv_level0_filter_23_0=ruleVSVSStepLevel0Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputLevel1Rule());
					}
					set(
						$current,
						"level0_filter",
						lv_level0_filter_23_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel0Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_24='</output_level_1>'
		{
			newLeafNode(otherlv_24, grammarAccess.getVSVSStepOutputLevel1Access().getOutput_level_1Keyword_14());
		}
	)
;

// Entry rule entryRuleVSVSStepOutputLevel0
entryRuleVSVSStepOutputLevel0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepOutputLevel0Rule()); }
	iv_ruleVSVSStepOutputLevel0=ruleVSVSStepOutputLevel0
	{ $current=$iv_ruleVSVSStepOutputLevel0.current; }
	EOF;

// Rule VSVSStepOutputLevel0
ruleVSVSStepOutputLevel0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<output_level_0'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepOutputLevel0Access().getOutput_level_0Keyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepOutputLevel0Access().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVSVSStepOutputLevel0Access().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel0Rule());
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
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepOutputLevel0Access().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVSVSStepOutputLevel0Access().getIdUINT_STRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel0Rule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_5='ifRef='
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepOutputLevel0Access().getIfRefKeyword_5());
		}
		(
			(
				lv_ifRef_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_ifRef_6_0, grammarAccess.getVSVSStepOutputLevel0Access().getIfRefUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepOutputLevel0Rule());
					}
					setWithLastConsumed(
						$current,
						"ifRef",
						lv_ifRef_6_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		(
			otherlv_7='optional='
			{
				newLeafNode(otherlv_7, grammarAccess.getVSVSStepOutputLevel0Access().getOptionalKeyword_7_0());
			}
			(
				(
					lv_optional_8_0=RULE_UINT_STRING
					{
						newLeafNode(lv_optional_8_0, grammarAccess.getVSVSStepOutputLevel0Access().getOptionalUINT_STRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel0Rule());
						}
						setWithLastConsumed(
							$current,
							"optional",
							lv_optional_8_0,
							"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
					}
				)
			)
		)?
		otherlv_9='>'
		{
			newLeafNode(otherlv_9, grammarAccess.getVSVSStepOutputLevel0Access().getGreaterThanSignKeyword_8());
		}
		(
			otherlv_10='<level0'
			{
				newLeafNode(otherlv_10, grammarAccess.getVSVSStepOutputLevel0Access().getLevel0Keyword_9_0());
			}
			otherlv_11='format='
			{
				newLeafNode(otherlv_11, grammarAccess.getVSVSStepOutputLevel0Access().getFormatKeyword_9_1());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepOutputLevel0Rule());
						}
					}
					otherlv_12=RULE_STRING
					{
						newLeafNode(otherlv_12, grammarAccess.getVSVSStepOutputLevel0Access().getLevel0TMTCIFFormatFormatCrossReference_9_2_0());
					}
				)
			)
			otherlv_13='/>'
			{
				newLeafNode(otherlv_13, grammarAccess.getVSVSStepOutputLevel0Access().getSolidusGreaterThanSignKeyword_9_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepOutputLevel0Access().getLevel0_filterVSVSStepLevel0FilterParserRuleCall_10_0());
				}
				lv_level0_filter_14_0=ruleVSVSStepLevel0Filter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepOutputLevel0Rule());
					}
					set(
						$current,
						"level0_filter",
						lv_level0_filter_14_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepLevel0Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='</output_level_0>'
		{
			newLeafNode(otherlv_15, grammarAccess.getVSVSStepOutputLevel0Access().getOutput_level_0Keyword_11());
		}
	)
;

// Entry rule entryRuleVSVSStepLevel3Filter
entryRuleVSVSStepLevel3Filter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepLevel3FilterRule()); }
	iv_ruleVSVSStepLevel3Filter=ruleVSVSStepLevel3Filter
	{ $current=$iv_ruleVSVSStepLevel3Filter.current; }
	EOF;

// Rule VSVSStepLevel3Filter
ruleVSVSStepLevel3Filter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<level3_filter'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepLevel3FilterAccess().getLevel3_filterKeyword_0());
		}
		otherlv_1='apply_def_filter='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepLevel3FilterAccess().getApply_def_filterKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepLevel3FilterAccess().getApply_def_filterVSVSStepYesNoEnumRuleCall_2_0());
				}
				lv_apply_def_filter_2_0=ruleVSVSStepYesNo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepLevel3FilterRule());
					}
					set(
						$current,
						"apply_def_filter",
						lv_apply_def_filter_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepYesNo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='extra_filter='
			{
				newLeafNode(otherlv_3, grammarAccess.getVSVSStepLevel3FilterAccess().getExtra_filterKeyword_3_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepLevel3FilterRule());
						}
					}
					otherlv_4=RULE_STRING
					{
						newLeafNode(otherlv_4, grammarAccess.getVSVSStepLevel3FilterAccess().getExtra_filterTMTCIFFilterFilterCrossReference_3_1_0());
					}
				)
			)
		)?
		otherlv_5='/>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepLevel3FilterAccess().getSolidusGreaterThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleVSVSStepLevel2Filter
entryRuleVSVSStepLevel2Filter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepLevel2FilterRule()); }
	iv_ruleVSVSStepLevel2Filter=ruleVSVSStepLevel2Filter
	{ $current=$iv_ruleVSVSStepLevel2Filter.current; }
	EOF;

// Rule VSVSStepLevel2Filter
ruleVSVSStepLevel2Filter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<level2_filter'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepLevel2FilterAccess().getLevel2_filterKeyword_0());
		}
		otherlv_1='apply_def_filter='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepLevel2FilterAccess().getApply_def_filterKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepLevel2FilterAccess().getApply_def_filterVSVSStepYesNoEnumRuleCall_2_0());
				}
				lv_apply_def_filter_2_0=ruleVSVSStepYesNo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepLevel2FilterRule());
					}
					set(
						$current,
						"apply_def_filter",
						lv_apply_def_filter_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepYesNo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='extra_filter='
			{
				newLeafNode(otherlv_3, grammarAccess.getVSVSStepLevel2FilterAccess().getExtra_filterKeyword_3_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepLevel2FilterRule());
						}
					}
					otherlv_4=RULE_STRING
					{
						newLeafNode(otherlv_4, grammarAccess.getVSVSStepLevel2FilterAccess().getExtra_filterTMTCIFFilterFilterCrossReference_3_1_0());
					}
				)
			)
		)?
		otherlv_5='/>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepLevel2FilterAccess().getSolidusGreaterThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleVSVSStepLevel1Filter
entryRuleVSVSStepLevel1Filter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepLevel1FilterRule()); }
	iv_ruleVSVSStepLevel1Filter=ruleVSVSStepLevel1Filter
	{ $current=$iv_ruleVSVSStepLevel1Filter.current; }
	EOF;

// Rule VSVSStepLevel1Filter
ruleVSVSStepLevel1Filter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<level1_filter'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepLevel1FilterAccess().getLevel1_filterKeyword_0());
		}
		otherlv_1='apply_def_filter='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepLevel1FilterAccess().getApply_def_filterKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepLevel1FilterAccess().getApply_def_filterVSVSStepYesNoEnumRuleCall_2_0());
				}
				lv_apply_def_filter_2_0=ruleVSVSStepYesNo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepLevel1FilterRule());
					}
					set(
						$current,
						"apply_def_filter",
						lv_apply_def_filter_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepYesNo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='extra_filter='
			{
				newLeafNode(otherlv_3, grammarAccess.getVSVSStepLevel1FilterAccess().getExtra_filterKeyword_3_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepLevel1FilterRule());
						}
					}
					otherlv_4=RULE_STRING
					{
						newLeafNode(otherlv_4, grammarAccess.getVSVSStepLevel1FilterAccess().getExtra_filterTMTCIFFilterFilterCrossReference_3_1_0());
					}
				)
			)
		)?
		otherlv_5='/>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepLevel1FilterAccess().getSolidusGreaterThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleVSVSStepLevel0Filter
entryRuleVSVSStepLevel0Filter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepLevel0FilterRule()); }
	iv_ruleVSVSStepLevel0Filter=ruleVSVSStepLevel0Filter
	{ $current=$iv_ruleVSVSStepLevel0Filter.current; }
	EOF;

// Rule VSVSStepLevel0Filter
ruleVSVSStepLevel0Filter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<level0_filter'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepLevel0FilterAccess().getLevel0_filterKeyword_0());
		}
		otherlv_1='apply_def_filter='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepLevel0FilterAccess().getApply_def_filterKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepLevel0FilterAccess().getApply_def_filterVSVSStepYesNoEnumRuleCall_2_0());
				}
				lv_apply_def_filter_2_0=ruleVSVSStepYesNo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepLevel0FilterRule());
					}
					set(
						$current,
						"apply_def_filter",
						lv_apply_def_filter_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepYesNo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='extra_filter='
			{
				newLeafNode(otherlv_3, grammarAccess.getVSVSStepLevel0FilterAccess().getExtra_filterKeyword_3_0());
			}
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVSVSStepLevel0FilterRule());
						}
					}
					otherlv_4=RULE_STRING
					{
						newLeafNode(otherlv_4, grammarAccess.getVSVSStepLevel0FilterAccess().getExtra_filterTMTCIFFilterFilterCrossReference_3_1_0());
					}
				)
			)
		)?
		otherlv_5='/>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepLevel0FilterAccess().getSolidusGreaterThanSignKeyword_4());
		}
	)
;

// Entry rule entryRuleVSVSStepEnable
entryRuleVSVSStepEnable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepEnableRule()); }
	iv_ruleVSVSStepEnable=ruleVSVSStepEnable
	{ $current=$iv_ruleVSVSStepEnable.current; }
	EOF;

// Rule VSVSStepEnable
ruleVSVSStepEnable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<enable'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepEnableAccess().getEnableKeyword_0());
		}
		otherlv_1='id='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepEnableAccess().getIdKeyword_1());
		}
		(
			(
				lv_id_2_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_2_0, grammarAccess.getVSVSStepEnableAccess().getIdUINT_STRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepEnableRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_3='/>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepEnableAccess().getSolidusGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleVSVSStepDisable
entryRuleVSVSStepDisable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepDisableRule()); }
	iv_ruleVSVSStepDisable=ruleVSVSStepDisable
	{ $current=$iv_ruleVSVSStepDisable.current; }
	EOF;

// Rule VSVSStepDisable
ruleVSVSStepDisable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<disable'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepDisableAccess().getDisableKeyword_0());
		}
		otherlv_1='id='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepDisableAccess().getIdKeyword_1());
		}
		(
			(
				lv_id_2_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_2_0, grammarAccess.getVSVSStepDisableAccess().getIdUINT_STRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepDisableRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_3='/>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepDisableAccess().getSolidusGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleVSVSStepEnablePrint
entryRuleVSVSStepEnablePrint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepEnablePrintRule()); }
	iv_ruleVSVSStepEnablePrint=ruleVSVSStepEnablePrint
	{ $current=$iv_ruleVSVSStepEnablePrint.current; }
	EOF;

// Rule VSVSStepEnablePrint
ruleVSVSStepEnablePrint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<enable_print'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepEnablePrintAccess().getEnable_printKeyword_0());
		}
		otherlv_1='id='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepEnablePrintAccess().getIdKeyword_1());
		}
		(
			(
				lv_id_2_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_2_0, grammarAccess.getVSVSStepEnablePrintAccess().getIdUINT_STRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepEnablePrintRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_3='/>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepEnablePrintAccess().getSolidusGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleVSVSStepDisablePrint
entryRuleVSVSStepDisablePrint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepDisablePrintRule()); }
	iv_ruleVSVSStepDisablePrint=ruleVSVSStepDisablePrint
	{ $current=$iv_ruleVSVSStepDisablePrint.current; }
	EOF;

// Rule VSVSStepDisablePrint
ruleVSVSStepDisablePrint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<disable_print'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepDisablePrintAccess().getDisable_printKeyword_0());
		}
		otherlv_1='id='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepDisablePrintAccess().getIdKeyword_1());
		}
		(
			(
				lv_id_2_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_2_0, grammarAccess.getVSVSStepDisablePrintAccess().getIdUINT_STRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepDisablePrintRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_3='/>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepDisablePrintAccess().getSolidusGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleVSVSStepNextStep
entryRuleVSVSStepNextStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepNextStepRule()); }
	iv_ruleVSVSStepNextStep=ruleVSVSStepNextStep
	{ $current=$iv_ruleVSVSStepNextStep.current; }
	EOF;

// Rule VSVSStepNextStep
ruleVSVSStepNextStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<nextStep'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepNextStepAccess().getNextStepKeyword_0());
		}
		otherlv_1='id='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepNextStepAccess().getIdKeyword_1());
		}
		(
			(
				lv_id_2_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_2_0, grammarAccess.getVSVSStepNextStepAccess().getIdUINT_STRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepNextStepRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_3='isConcurrent='
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepNextStepAccess().getIsConcurrentKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVSVSStepNextStepAccess().getIsConcurrentVSVSStepYesNoEnumRuleCall_4_0());
				}
				lv_isConcurrent_4_0=ruleVSVSStepYesNo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVSVSStepNextStepRule());
					}
					set(
						$current,
						"isConcurrent",
						lv_isConcurrent_4_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.VSVSStepYesNo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='/>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVSVSStepNextStepAccess().getSolidusGreaterThanSignKeyword_5());
		}
	)
;

// Entry rule entryRuleVSVSStepConcurrentStep
entryRuleVSVSStepConcurrentStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVSVSStepConcurrentStepRule()); }
	iv_ruleVSVSStepConcurrentStep=ruleVSVSStepConcurrentStep
	{ $current=$iv_ruleVSVSStepConcurrentStep.current; }
	EOF;

// Rule VSVSStepConcurrentStep
ruleVSVSStepConcurrentStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<concurrent_step'
		{
			newLeafNode(otherlv_0, grammarAccess.getVSVSStepConcurrentStepAccess().getConcurrent_stepKeyword_0());
		}
		otherlv_1='id='
		{
			newLeafNode(otherlv_1, grammarAccess.getVSVSStepConcurrentStepAccess().getIdKeyword_1());
		}
		(
			(
				lv_id_2_0=RULE_UINT_STRING
				{
					newLeafNode(lv_id_2_0, grammarAccess.getVSVSStepConcurrentStepAccess().getIdUINT_STRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVSVSStepConcurrentStepRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_2_0,
						"es.uah.aut.srg.micobs.svm.lang.svs.SVS.UINT_STRING");
				}
			)
		)
		otherlv_3='/>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVSVSStepConcurrentStepAccess().getSolidusGreaterThanSignKeyword_3());
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

// Rule VSVSStepMode
ruleVSVSStepMode returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='"continuous"'
			{
				$current = grammarAccess.getVSVSStepModeAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVSVSStepModeAccess().getContinuousEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"manual"'
			{
				$current = grammarAccess.getVSVSStepModeAccess().getManualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVSVSStepModeAccess().getManualEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='"concurrent"'
			{
				$current = grammarAccess.getVSVSStepModeAccess().getConcurrentEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVSVSStepModeAccess().getConcurrentEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule VSVSStepUnit
ruleVSVSStepUnit returns [Enumerator current=null]
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
				$current = grammarAccess.getVSVSStepUnitAccess().getMilisecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVSVSStepUnitAccess().getMilisecondsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"seconds"'
			{
				$current = grammarAccess.getVSVSStepUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVSVSStepUnitAccess().getSecondsEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule VSVSStepCheckmode
ruleVSVSStepCheckmode returns [Enumerator current=null]
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
				$current = grammarAccess.getVSVSStepCheckmodeAccess().getAllEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVSVSStepCheckmodeAccess().getAllEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"allunsorted"'
			{
				$current = grammarAccess.getVSVSStepCheckmodeAccess().getAllunsortedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVSVSStepCheckmodeAccess().getAllunsortedEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='"any"'
			{
				$current = grammarAccess.getVSVSStepCheckmodeAccess().getAnyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVSVSStepCheckmodeAccess().getAnyEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule VSVSStepYesNo
ruleVSVSStepYesNo returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='"yes"'
			{
				$current = grammarAccess.getVSVSStepYesNoAccess().getYesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVSVSStepYesNoAccess().getYesEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='"no"'
			{
				$current = grammarAccess.getVSVSStepYesNoAccess().getNoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVSVSStepYesNoAccess().getNoEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_RUNTEXT : '<text>' ( options {greedy=false;} : . )*'</text>';

RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_UINT_STRING : '"' ('0'..'9')+ '"';

RULE_REAL_STRING : '"' ('0'..'9')+ ('.' ('0'..'9')+)? '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
