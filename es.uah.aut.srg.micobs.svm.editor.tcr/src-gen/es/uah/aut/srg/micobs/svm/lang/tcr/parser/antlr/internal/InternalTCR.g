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
grammar InternalTCR;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.tcr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.tcr.parser.antlr.internal;

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
import es.uah.aut.srg.micobs.svm.lang.tcr.services.TCRGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private TCRGrammarAccess grammarAccess;

    public InternalTCRParser(TokenStream input, TCRGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "VTCRTestCampaignReport";
   	}

   	@Override
   	protected TCRGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleVTCRTestCampaignReport
entryRuleVTCRTestCampaignReport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTCRTestCampaignReportRule()); }
	iv_ruleVTCRTestCampaignReport=ruleVTCRTestCampaignReport
	{ $current=$iv_ruleVTCRTestCampaignReport.current; }
	EOF;

// Rule VTCRTestCampaignReport
ruleVTCRTestCampaignReport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TestCampaignReport'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTCRTestCampaignReportAccess().getTestCampaignReportKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTCRTestCampaignReportAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVTCRTestCampaignReportAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTCRTestCampaignReportRule());
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
			newLeafNode(otherlv_3, grammarAccess.getVTCRTestCampaignReportAccess().getIdKeyword_3());
		}
		(
			(
				lv_id_4_0=RULE_STRING
				{
					newLeafNode(lv_id_4_0, grammarAccess.getVTCRTestCampaignReportAccess().getIdSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTCRTestCampaignReportRule());
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
			newLeafNode(otherlv_5, grammarAccess.getVTCRTestCampaignReportAccess().getIssueKeyword_5());
		}
		(
			(
				lv_issue_6_0=RULE_UINT_STRING
				{
					newLeafNode(lv_issue_6_0, grammarAccess.getVTCRTestCampaignReportAccess().getIssueUINT_STRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTCRTestCampaignReportRule());
					}
					setWithLastConsumed(
						$current,
						"issue",
						lv_issue_6_0,
						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.UINT_STRING");
				}
			)
		)
		otherlv_7='revision='
		{
			newLeafNode(otherlv_7, grammarAccess.getVTCRTestCampaignReportAccess().getRevisionKeyword_7());
		}
		(
			(
				lv_revision_8_0=RULE_UINT_STRING
				{
					newLeafNode(lv_revision_8_0, grammarAccess.getVTCRTestCampaignReportAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTCRTestCampaignReportRule());
					}
					setWithLastConsumed(
						$current,
						"revision",
						lv_revision_8_0,
						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.UINT_STRING");
				}
			)
		)
		otherlv_9='date='
		{
			newLeafNode(otherlv_9, grammarAccess.getVTCRTestCampaignReportAccess().getDateKeyword_9());
		}
		(
			(
				lv_date_10_0=RULE_STRING
				{
					newLeafNode(lv_date_10_0, grammarAccess.getVTCRTestCampaignReportAccess().getDateSTRINGTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTCRTestCampaignReportRule());
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
			newLeafNode(otherlv_11, grammarAccess.getVTCRTestCampaignReportAccess().getGreaterThanSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTCRTestCampaignReportAccess().getTestReportsVTCRTestReportParserRuleCall_12_0());
				}
				lv_testReports_12_0=ruleVTCRTestReport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTCRTestCampaignReportRule());
					}
					add(
						$current,
						"testReports",
						lv_testReports_12_0,
						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.VTCRTestReport");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_13='</TestCampaignReport>'
		{
			newLeafNode(otherlv_13, grammarAccess.getVTCRTestCampaignReportAccess().getTestCampaignReportKeyword_13());
		}
	)
;

// Entry rule entryRuleVTCRTestReport
entryRuleVTCRTestReport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTCRTestReportRule()); }
	iv_ruleVTCRTestReport=ruleVTCRTestReport
	{ $current=$iv_ruleVTCRTestReport.current; }
	EOF;

// Rule VTCRTestReport
ruleVTCRTestReport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<VTCRTestReport'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTCRTestReportAccess().getVTCRTestReportKeyword_0());
		}
		otherlv_1='test_procedure='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTCRTestReportAccess().getTest_procedureKeyword_1());
		}
		(
			(
				lv_test_procedure_2_0=RULE_STRING
				{
					newLeafNode(lv_test_procedure_2_0, grammarAccess.getVTCRTestReportAccess().getTest_procedureSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTCRTestReportRule());
					}
					setWithLastConsumed(
						$current,
						"test_procedure",
						lv_test_procedure_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVTCRTestReportAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTCRTestReportAccess().getEvidenceDParagraphEvidenceParserRuleCall_4_0());
				}
				lv_evidence_4_0=ruleDParagraphEvidence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTCRTestReportRule());
					}
					set(
						$current,
						"evidence",
						lv_evidence_4_0,
						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DParagraphEvidence");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='<status>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVTCRTestReportAccess().getStatusKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTCRTestReportAccess().getStatusVTCRTestStatusEnumRuleCall_6_0());
				}
				lv_status_6_0=ruleVTCRTestStatus
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTCRTestReportRule());
					}
					set(
						$current,
						"status",
						lv_status_6_0,
						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.VTCRTestStatus");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='</status>'
		{
			newLeafNode(otherlv_7, grammarAccess.getVTCRTestReportAccess().getStatusKeyword_7());
		}
		otherlv_8='</VTCRTestReport>'
		{
			newLeafNode(otherlv_8, grammarAccess.getVTCRTestReportAccess().getVTCRTestReportKeyword_8());
		}
	)
;

// Entry rule entryRuleDParagraphEvidence
entryRuleDParagraphEvidence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDParagraphEvidenceRule()); }
	iv_ruleDParagraphEvidence=ruleDParagraphEvidence
	{ $current=$iv_ruleDParagraphEvidence.current; }
	EOF;

// Rule DParagraphEvidence
ruleDParagraphEvidence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<evidence>'
		{
			newLeafNode(otherlv_0, grammarAccess.getDParagraphEvidenceAccess().getEvidenceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDParagraphEvidenceAccess().getParagraphContentDParagraphContentParserRuleCall_1_0());
				}
				lv_paragraphContent_1_0=ruleDParagraphContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDParagraphEvidenceRule());
					}
					add(
						$current,
						"paragraphContent",
						lv_paragraphContent_1_0,
						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DParagraphContent");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='</evidence>'
		{
			newLeafNode(otherlv_2, grammarAccess.getDParagraphEvidenceAccess().getEvidenceKeyword_2());
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
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getDParagraphContentAccess().getDRunParserRuleCall());
	}
	this_DRun_0=ruleDRun
	{
		$current = $this_DRun_0.current;
		afterParserOrEnumRuleCall();
	}
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
							"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DRunAttributes");
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
							"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DRunAttributes");
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
							"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DRunAttributes");
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
					newCompositeNode(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_6_0());
				}
				lv_text_10_0=ruleDText
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDRunRule());
					}
					set(
						$current,
						"text",
						lv_text_10_0,
						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DText");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='</run>'
		{
			newLeafNode(otherlv_11, grammarAccess.getDRunAccess().getRunKeyword_7());
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
					"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.RUNTEXT");
			}
		)
	)
;

// Rule VTCRTestStatus
ruleVTCRTestStatus returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Fail'
			{
				$current = grammarAccess.getVTCRTestStatusAccess().getFailEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVTCRTestStatusAccess().getFailEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Pass'
			{
				$current = grammarAccess.getVTCRTestStatusAccess().getPassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVTCRTestStatusAccess().getPassEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='NotTested'
			{
				$current = grammarAccess.getVTCRTestStatusAccess().getNotTestedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVTCRTestStatusAccess().getNotTestedEnumLiteralDeclaration_2());
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

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
