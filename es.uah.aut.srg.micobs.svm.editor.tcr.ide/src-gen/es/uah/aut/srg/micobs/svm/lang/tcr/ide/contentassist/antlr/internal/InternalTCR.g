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
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.tcr.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.tcr.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import es.uah.aut.srg.micobs.svm.lang.tcr.services.TCRGrammarAccess;

}
@parser::members {
	private TCRGrammarAccess grammarAccess;

	public void setGrammarAccess(TCRGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleVTCRTestCampaignReport
entryRuleVTCRTestCampaignReport
:
{ before(grammarAccess.getVTCRTestCampaignReportRule()); }
	 ruleVTCRTestCampaignReport
{ after(grammarAccess.getVTCRTestCampaignReportRule()); } 
	 EOF 
;

// Rule VTCRTestCampaignReport
ruleVTCRTestCampaignReport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTCRTestCampaignReportAccess().getGroup()); }
		(rule__VTCRTestCampaignReport__Group__0)
		{ after(grammarAccess.getVTCRTestCampaignReportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTCRTestReport
entryRuleVTCRTestReport
:
{ before(grammarAccess.getVTCRTestReportRule()); }
	 ruleVTCRTestReport
{ after(grammarAccess.getVTCRTestReportRule()); } 
	 EOF 
;

// Rule VTCRTestReport
ruleVTCRTestReport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTCRTestReportAccess().getGroup()); }
		(rule__VTCRTestReport__Group__0)
		{ after(grammarAccess.getVTCRTestReportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDParagraphEvidence
entryRuleDParagraphEvidence
:
{ before(grammarAccess.getDParagraphEvidenceRule()); }
	 ruleDParagraphEvidence
{ after(grammarAccess.getDParagraphEvidenceRule()); } 
	 EOF 
;

// Rule DParagraphEvidence
ruleDParagraphEvidence 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDParagraphEvidenceAccess().getGroup()); }
		(rule__DParagraphEvidence__Group__0)
		{ after(grammarAccess.getDParagraphEvidenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDParagraphContent
entryRuleDParagraphContent
:
{ before(grammarAccess.getDParagraphContentRule()); }
	 ruleDParagraphContent
{ after(grammarAccess.getDParagraphContentRule()); } 
	 EOF 
;

// Rule DParagraphContent
ruleDParagraphContent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDParagraphContentAccess().getDRunParserRuleCall()); }
		ruleDRun
		{ after(grammarAccess.getDParagraphContentAccess().getDRunParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDRun
entryRuleDRun
:
{ before(grammarAccess.getDRunRule()); }
	 ruleDRun
{ after(grammarAccess.getDRunRule()); } 
	 EOF 
;

// Rule DRun
ruleDRun 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDRunAccess().getGroup()); }
		(rule__DRun__Group__0)
		{ after(grammarAccess.getDRunAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDText
entryRuleDText
:
{ before(grammarAccess.getDTextRule()); }
	 ruleDText
{ after(grammarAccess.getDTextRule()); } 
	 EOF 
;

// Rule DText
ruleDText 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDTextAccess().getContentAssignment()); }
		(rule__DText__ContentAssignment)
		{ after(grammarAccess.getDTextAccess().getContentAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule VTCRTestStatus
ruleVTCRTestStatus
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTCRTestStatusAccess().getAlternatives()); }
		(rule__VTCRTestStatus__Alternatives)
		{ after(grammarAccess.getVTCRTestStatusAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule DRunAttributes
ruleDRunAttributes
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAttributesAccess().getAlternatives()); }
		(rule__DRunAttributes__Alternatives)
		{ after(grammarAccess.getDRunAttributesAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestStatus__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTCRTestStatusAccess().getFailEnumLiteralDeclaration_0()); }
		('"Fail"')
		{ after(grammarAccess.getVTCRTestStatusAccess().getFailEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVTCRTestStatusAccess().getPassEnumLiteralDeclaration_1()); }
		('"Pass"')
		{ after(grammarAccess.getVTCRTestStatusAccess().getPassEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getVTCRTestStatusAccess().getNotTestedEnumLiteralDeclaration_2()); }
		('"NotTested"')
		{ after(grammarAccess.getVTCRTestStatusAccess().getNotTestedEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRunAttributes__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAttributesAccess().getTRUEEnumLiteralDeclaration_0()); }
		('"true"')
		{ after(grammarAccess.getDRunAttributesAccess().getTRUEEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDRunAttributesAccess().getFALSEEnumLiteralDeclaration_1()); }
		('"false"')
		{ after(grammarAccess.getDRunAttributesAccess().getFALSEEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__0__Impl
	rule__VTCRTestCampaignReport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getTestCampaignReportKeyword_0()); }
	'<TestCampaignReport'
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getTestCampaignReportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__1__Impl
	rule__VTCRTestCampaignReport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__2__Impl
	rule__VTCRTestCampaignReport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getNameAssignment_2()); }
	(rule__VTCRTestCampaignReport__NameAssignment_2)
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__3__Impl
	rule__VTCRTestCampaignReport__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getIdKeyword_3()); }
	'id='
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getIdKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__4__Impl
	rule__VTCRTestCampaignReport__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getIdAssignment_4()); }
	(rule__VTCRTestCampaignReport__IdAssignment_4)
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__5__Impl
	rule__VTCRTestCampaignReport__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getIssueKeyword_5()); }
	'issue='
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getIssueKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__6__Impl
	rule__VTCRTestCampaignReport__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getIssueAssignment_6()); }
	(rule__VTCRTestCampaignReport__IssueAssignment_6)
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getIssueAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__7__Impl
	rule__VTCRTestCampaignReport__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getRevisionKeyword_7()); }
	'revision='
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getRevisionKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__8__Impl
	rule__VTCRTestCampaignReport__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getRevisionAssignment_8()); }
	(rule__VTCRTestCampaignReport__RevisionAssignment_8)
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getRevisionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__9__Impl
	rule__VTCRTestCampaignReport__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getDateKeyword_9()); }
	'date='
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getDateKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__10__Impl
	rule__VTCRTestCampaignReport__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getDateAssignment_10()); }
	(rule__VTCRTestCampaignReport__DateAssignment_10)
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getDateAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__11__Impl
	rule__VTCRTestCampaignReport__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getGreaterThanSignKeyword_11()); }
	'>'
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getGreaterThanSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__12__Impl
	rule__VTCRTestCampaignReport__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVTCRTestCampaignReportAccess().getTestReportsAssignment_12()); }
		(rule__VTCRTestCampaignReport__TestReportsAssignment_12)
		{ after(grammarAccess.getVTCRTestCampaignReportAccess().getTestReportsAssignment_12()); }
	)
	(
		{ before(grammarAccess.getVTCRTestCampaignReportAccess().getTestReportsAssignment_12()); }
		(rule__VTCRTestCampaignReport__TestReportsAssignment_12)*
		{ after(grammarAccess.getVTCRTestCampaignReportAccess().getTestReportsAssignment_12()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestCampaignReport__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestCampaignReportAccess().getTestCampaignReportKeyword_13()); }
	'</TestCampaignReport>'
	{ after(grammarAccess.getVTCRTestCampaignReportAccess().getTestCampaignReportKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTCRTestReport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestReport__Group__0__Impl
	rule__VTCRTestReport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestReportAccess().getVTCRTestReportKeyword_0()); }
	'<VTCRTestReport'
	{ after(grammarAccess.getVTCRTestReportAccess().getVTCRTestReportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestReport__Group__1__Impl
	rule__VTCRTestReport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestReportAccess().getTest_procedureKeyword_1()); }
	'test_procedure='
	{ after(grammarAccess.getVTCRTestReportAccess().getTest_procedureKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestReport__Group__2__Impl
	rule__VTCRTestReport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestReportAccess().getTest_procedureAssignment_2()); }
	(rule__VTCRTestReport__Test_procedureAssignment_2)
	{ after(grammarAccess.getVTCRTestReportAccess().getTest_procedureAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestReport__Group__3__Impl
	rule__VTCRTestReport__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestReportAccess().getStatusKeyword_3()); }
	'status='
	{ after(grammarAccess.getVTCRTestReportAccess().getStatusKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestReport__Group__4__Impl
	rule__VTCRTestReport__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestReportAccess().getStatusAssignment_4()); }
	(rule__VTCRTestReport__StatusAssignment_4)
	{ after(grammarAccess.getVTCRTestReportAccess().getStatusAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestReport__Group__5__Impl
	rule__VTCRTestReport__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestReportAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getVTCRTestReportAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestReport__Group__6__Impl
	rule__VTCRTestReport__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestReportAccess().getEvidenceAssignment_6()); }
	(rule__VTCRTestReport__EvidenceAssignment_6)
	{ after(grammarAccess.getVTCRTestReportAccess().getEvidenceAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTCRTestReport__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTCRTestReportAccess().getVTCRTestReportKeyword_7()); }
	'</VTCRTestReport>'
	{ after(grammarAccess.getVTCRTestReportAccess().getVTCRTestReportKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DParagraphEvidence__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraphEvidence__Group__0__Impl
	rule__DParagraphEvidence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraphEvidence__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphEvidenceAccess().getEvidenceKeyword_0()); }
	'<evidence>'
	{ after(grammarAccess.getDParagraphEvidenceAccess().getEvidenceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraphEvidence__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraphEvidence__Group__1__Impl
	rule__DParagraphEvidence__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraphEvidence__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDParagraphEvidenceAccess().getParagraphContentAssignment_1()); }
		(rule__DParagraphEvidence__ParagraphContentAssignment_1)
		{ after(grammarAccess.getDParagraphEvidenceAccess().getParagraphContentAssignment_1()); }
	)
	(
		{ before(grammarAccess.getDParagraphEvidenceAccess().getParagraphContentAssignment_1()); }
		(rule__DParagraphEvidence__ParagraphContentAssignment_1)*
		{ after(grammarAccess.getDParagraphEvidenceAccess().getParagraphContentAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraphEvidence__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraphEvidence__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraphEvidence__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphEvidenceAccess().getEvidenceKeyword_2()); }
	'</evidence>'
	{ after(grammarAccess.getDParagraphEvidenceAccess().getEvidenceKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DRun__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group__0__Impl
	rule__DRun__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getRunKeyword_0()); }
	'<run'
	{ after(grammarAccess.getDRunAccess().getRunKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group__1__Impl
	rule__DRun__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getGroup_1()); }
	(rule__DRun__Group_1__0)?
	{ after(grammarAccess.getDRunAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group__2__Impl
	rule__DRun__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getGroup_2()); }
	(rule__DRun__Group_2__0)?
	{ after(grammarAccess.getDRunAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group__3__Impl
	rule__DRun__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getGroup_3()); }
	(rule__DRun__Group_3__0)?
	{ after(grammarAccess.getDRunAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group__4__Impl
	rule__DRun__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getGroup_4()); }
	(rule__DRun__Group_4__0)?
	{ after(grammarAccess.getDRunAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group__5__Impl
	rule__DRun__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getDRunAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group__6__Impl
	rule__DRun__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getTextAssignment_6()); }
	(rule__DRun__TextAssignment_6)
	{ after(grammarAccess.getDRunAccess().getTextAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getRunKeyword_7()); }
	'</run>'
	{ after(grammarAccess.getDRunAccess().getRunKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DRun__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group_1__0__Impl
	rule__DRun__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getBoldKeyword_1_0()); }
	'bold='
	{ after(grammarAccess.getDRunAccess().getBoldKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getBoldAssignment_1_1()); }
	(rule__DRun__BoldAssignment_1_1)
	{ after(grammarAccess.getDRunAccess().getBoldAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DRun__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group_2__0__Impl
	rule__DRun__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getItalicsKeyword_2_0()); }
	'italics='
	{ after(grammarAccess.getDRunAccess().getItalicsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getItalicsAssignment_2_1()); }
	(rule__DRun__ItalicsAssignment_2_1)
	{ after(grammarAccess.getDRunAccess().getItalicsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DRun__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group_3__0__Impl
	rule__DRun__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getUnderlineKeyword_3_0()); }
	'underline='
	{ after(grammarAccess.getDRunAccess().getUnderlineKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getUnderlineAssignment_3_1()); }
	(rule__DRun__UnderlineAssignment_3_1)
	{ after(grammarAccess.getDRunAccess().getUnderlineAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DRun__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group_4__0__Impl
	rule__DRun__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getColorKeyword_4_0()); }
	'color='
	{ after(grammarAccess.getDRunAccess().getColorKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getColorAssignment_4_1()); }
	(rule__DRun__ColorAssignment_4_1)
	{ after(grammarAccess.getDRunAccess().getColorAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTCRTestCampaignReport__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTCRTestCampaignReportAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTCRTestCampaignReportAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTCRTestCampaignReportAccess().getIdSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTCRTestCampaignReportAccess().getIdSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__IssueAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTCRTestCampaignReportAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVTCRTestCampaignReportAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__RevisionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTCRTestCampaignReportAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVTCRTestCampaignReportAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__DateAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTCRTestCampaignReportAccess().getDateSTRINGTerminalRuleCall_10_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTCRTestCampaignReportAccess().getDateSTRINGTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestCampaignReport__TestReportsAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTCRTestCampaignReportAccess().getTestReportsVTCRTestReportParserRuleCall_12_0()); }
		ruleVTCRTestReport
		{ after(grammarAccess.getVTCRTestCampaignReportAccess().getTestReportsVTCRTestReportParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__Test_procedureAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTCRTestReportAccess().getTest_procedureSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTCRTestReportAccess().getTest_procedureSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__StatusAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTCRTestReportAccess().getStatusVTCRTestStatusEnumRuleCall_4_0()); }
		ruleVTCRTestStatus
		{ after(grammarAccess.getVTCRTestReportAccess().getStatusVTCRTestStatusEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTCRTestReport__EvidenceAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTCRTestReportAccess().getEvidenceDParagraphEvidenceParserRuleCall_6_0()); }
		ruleDParagraphEvidence
		{ after(grammarAccess.getVTCRTestReportAccess().getEvidenceDParagraphEvidenceParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraphEvidence__ParagraphContentAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDParagraphEvidenceAccess().getParagraphContentDParagraphContentParserRuleCall_1_0()); }
		ruleDParagraphContent
		{ after(grammarAccess.getDParagraphEvidenceAccess().getParagraphContentDParagraphContentParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__BoldAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getBoldDRunAttributesEnumRuleCall_1_1_0()); }
		ruleDRunAttributes
		{ after(grammarAccess.getDRunAccess().getBoldDRunAttributesEnumRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__ItalicsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getItalicsDRunAttributesEnumRuleCall_2_1_0()); }
		ruleDRunAttributes
		{ after(grammarAccess.getDRunAccess().getItalicsDRunAttributesEnumRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__UnderlineAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getUnderlineDRunAttributesEnumRuleCall_3_1_0()); }
		ruleDRunAttributes
		{ after(grammarAccess.getDRunAccess().getUnderlineDRunAttributesEnumRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__ColorAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getColorSTRINGTerminalRuleCall_4_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDRunAccess().getColorSTRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__TextAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_6_0()); }
		ruleDText
		{ after(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DText__ContentAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTextAccess().getContentRUNTEXTTerminalRuleCall_0()); }
		RULE_RUNTEXT
		{ after(grammarAccess.getDTextAccess().getContentRUNTEXTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_RUNTEXT : '<text>' ( options {greedy=false;} : . )*'</text>';

RULE_UINT_STRING : '"' ('0'..'9')+ '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
