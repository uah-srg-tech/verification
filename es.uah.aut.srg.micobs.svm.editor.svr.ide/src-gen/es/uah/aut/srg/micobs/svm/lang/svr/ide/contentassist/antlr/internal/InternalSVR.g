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
grammar InternalSVR;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.svr.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.svr.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.micobs.svm.lang.svr.services.SVRGrammarAccess;

}
@parser::members {
	private SVRGrammarAccess grammarAccess;

	public void setGrammarAccess(SVRGrammarAccess grammarAccess) {
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

// Entry rule entryRuleVSVRDocument
entryRuleVSVRDocument
:
{ before(grammarAccess.getVSVRDocumentRule()); }
	 ruleVSVRDocument
{ after(grammarAccess.getVSVRDocumentRule()); } 
	 EOF 
;

// Rule VSVRDocument
ruleVSVRDocument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getGroup()); }
		(rule__VSVRDocument__Group__0)
		{ after(grammarAccess.getVSVRDocumentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVRTBCsTBDs
entryRuleVSVRTBCsTBDs
:
{ before(grammarAccess.getVSVRTBCsTBDsRule()); }
	 ruleVSVRTBCsTBDs
{ after(grammarAccess.getVSVRTBCsTBDsRule()); } 
	 EOF 
;

// Rule VSVRTBCsTBDs
ruleVSVRTBCsTBDs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRTBCsTBDsAccess().getGroup()); }
		(rule__VSVRTBCsTBDs__Group__0)
		{ after(grammarAccess.getVSVRTBCsTBDsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDTBC
entryRuleDTBC
:
{ before(grammarAccess.getDTBCRule()); }
	 ruleDTBC
{ after(grammarAccess.getDTBCRule()); } 
	 EOF 
;

// Rule DTBC
ruleDTBC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDTBCAccess().getGroup()); }
		(rule__DTBC__Group__0)
		{ after(grammarAccess.getDTBCAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDTBD
entryRuleDTBD
:
{ before(grammarAccess.getDTBDRule()); }
	 ruleDTBD
{ after(grammarAccess.getDTBDRule()); } 
	 EOF 
;

// Rule DTBD
ruleDTBD 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDTBDAccess().getGroup()); }
		(rule__DTBD__Group__0)
		{ after(grammarAccess.getDTBDAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDBody
entryRuleDBody
:
{ before(grammarAccess.getDBodyRule()); }
	 ruleDBody
{ after(grammarAccess.getDBodyRule()); } 
	 EOF 
;

// Rule DBody
ruleDBody 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDBodyAccess().getGroup()); }
		(rule__DBody__Group__0)
		{ after(grammarAccess.getDBodyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDBodyContent
entryRuleDBodyContent
:
{ before(grammarAccess.getDBodyContentRule()); }
	 ruleDBodyContent
{ after(grammarAccess.getDBodyContentRule()); } 
	 EOF 
;

// Rule DBodyContent
ruleDBodyContent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDBodyContentAccess().getAlternatives()); }
		(rule__DBodyContent__Alternatives)
		{ after(grammarAccess.getDBodyContentAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDParagraph
entryRuleDParagraph
:
{ before(grammarAccess.getDParagraphRule()); }
	 ruleDParagraph
{ after(grammarAccess.getDParagraphRule()); } 
	 EOF 
;

// Rule DParagraph
ruleDParagraph 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDParagraphAccess().getGroup()); }
		(rule__DParagraph__Group__0)
		{ after(grammarAccess.getDParagraphAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDListItem
entryRuleDListItem
:
{ before(grammarAccess.getDListItemRule()); }
	 ruleDListItem
{ after(grammarAccess.getDListItemRule()); } 
	 EOF 
;

// Rule DListItem
ruleDListItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDListItemAccess().getGroup()); }
		(rule__DListItem__Group__0)
		{ after(grammarAccess.getDListItemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDListContent
entryRuleDListContent
:
{ before(grammarAccess.getDListContentRule()); }
	 ruleDListContent
{ after(grammarAccess.getDListContentRule()); } 
	 EOF 
;

// Rule DListContent
ruleDListContent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDListContentAccess().getAlternatives()); }
		(rule__DListContent__Alternatives)
		{ after(grammarAccess.getDListContentAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDItemize
entryRuleDItemize
:
{ before(grammarAccess.getDItemizeRule()); }
	 ruleDItemize
{ after(grammarAccess.getDItemizeRule()); } 
	 EOF 
;

// Rule DItemize
ruleDItemize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDItemizeAccess().getGroup()); }
		(rule__DItemize__Group__0)
		{ after(grammarAccess.getDItemizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDEnumerate
entryRuleDEnumerate
:
{ before(grammarAccess.getDEnumerateRule()); }
	 ruleDEnumerate
{ after(grammarAccess.getDEnumerateRule()); } 
	 EOF 
;

// Rule DEnumerate
ruleDEnumerate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDEnumerateAccess().getGroup()); }
		(rule__DEnumerate__Group__0)
		{ after(grammarAccess.getDEnumerateAccess().getGroup()); }
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
		{ before(grammarAccess.getDParagraphContentAccess().getAlternatives()); }
		(rule__DParagraphContent__Alternatives)
		{ after(grammarAccess.getDParagraphContentAccess().getAlternatives()); }
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

// Entry rule entryRuleDHyperlink
entryRuleDHyperlink
:
{ before(grammarAccess.getDHyperlinkRule()); }
	 ruleDHyperlink
{ after(grammarAccess.getDHyperlinkRule()); } 
	 EOF 
;

// Rule DHyperlink
ruleDHyperlink 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDHyperlinkAccess().getGroup()); }
		(rule__DHyperlink__Group__0)
		{ after(grammarAccess.getDHyperlinkAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDTab
entryRuleDTab
:
{ before(grammarAccess.getDTabRule()); }
	 ruleDTab
{ after(grammarAccess.getDTabRule()); } 
	 EOF 
;

// Rule DTab
ruleDTab 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDTabAccess().getGroup()); }
		(rule__DTab__Group__0)
		{ after(grammarAccess.getDTabAccess().getGroup()); }
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

// Entry rule entryRuleDFigureFromFile
entryRuleDFigureFromFile
:
{ before(grammarAccess.getDFigureFromFileRule()); }
	 ruleDFigureFromFile
{ after(grammarAccess.getDFigureFromFileRule()); } 
	 EOF 
;

// Rule DFigureFromFile
ruleDFigureFromFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDFigureFromFileAccess().getGroup()); }
		(rule__DFigureFromFile__Group__0)
		{ after(grammarAccess.getDFigureFromFileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDTableFromFile
entryRuleDTableFromFile
:
{ before(grammarAccess.getDTableFromFileRule()); }
	 ruleDTableFromFile
{ after(grammarAccess.getDTableFromFileRule()); } 
	 EOF 
;

// Rule DTableFromFile
ruleDTableFromFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDTableFromFileAccess().getGroup()); }
		(rule__DTableFromFile__Group__0)
		{ after(grammarAccess.getDTableFromFileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDBasicTable
entryRuleDBasicTable
:
{ before(grammarAccess.getDBasicTableRule()); }
	 ruleDBasicTable
{ after(grammarAccess.getDBasicTableRule()); } 
	 EOF 
;

// Rule DBasicTable
ruleDBasicTable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDBasicTableAccess().getGroup()); }
		(rule__DBasicTable__Group__0)
		{ after(grammarAccess.getDBasicTableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDRow
entryRuleDRow
:
{ before(grammarAccess.getDRowRule()); }
	 ruleDRow
{ after(grammarAccess.getDRowRule()); } 
	 EOF 
;

// Rule DRow
ruleDRow 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDRowAccess().getGroup()); }
		(rule__DRow__Group__0)
		{ after(grammarAccess.getDRowAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDCell
entryRuleDCell
:
{ before(grammarAccess.getDCellRule()); }
	 ruleDCell
{ after(grammarAccess.getDCellRule()); } 
	 EOF 
;

// Rule DCell
ruleDCell 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDCellAccess().getGroup()); }
		(rule__DCell__Group__0)
		{ after(grammarAccess.getDCellAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDApplicableDocument
entryRuleDApplicableDocument
:
{ before(grammarAccess.getDApplicableDocumentRule()); }
	 ruleDApplicableDocument
{ after(grammarAccess.getDApplicableDocumentRule()); } 
	 EOF 
;

// Rule DApplicableDocument
ruleDApplicableDocument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getGroup()); }
		(rule__DApplicableDocument__Group__0)
		{ after(grammarAccess.getDApplicableDocumentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDReferenceDocument
entryRuleDReferenceDocument
:
{ before(grammarAccess.getDReferenceDocumentRule()); }
	 ruleDReferenceDocument
{ after(grammarAccess.getDReferenceDocumentRule()); } 
	 EOF 
;

// Rule DReferenceDocument
ruleDReferenceDocument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getGroup()); }
		(rule__DReferenceDocument__Group__0)
		{ after(grammarAccess.getDReferenceDocumentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVRFixedSection
entryRuleVSVRFixedSection
:
{ before(grammarAccess.getVSVRFixedSectionRule()); }
	 ruleVSVRFixedSection
{ after(grammarAccess.getVSVRFixedSectionRule()); } 
	 EOF 
;

// Rule VSVRFixedSection
ruleVSVRFixedSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRFixedSectionAccess().getGroup()); }
		(rule__VSVRFixedSection__Group__0)
		{ after(grammarAccess.getVSVRFixedSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVRInstantiableSection
entryRuleVSVRInstantiableSection
:
{ before(grammarAccess.getVSVRInstantiableSectionRule()); }
	 ruleVSVRInstantiableSection
{ after(grammarAccess.getVSVRInstantiableSectionRule()); } 
	 EOF 
;

// Rule VSVRInstantiableSection
ruleVSVRInstantiableSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRInstantiableSectionAccess().getGroup()); }
		(rule__VSVRInstantiableSection__Group__0)
		{ after(grammarAccess.getVSVRInstantiableSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVRIntroduction
entryRuleVSVRIntroduction
:
{ before(grammarAccess.getVSVRIntroductionRule()); }
	 ruleVSVRIntroduction
{ after(grammarAccess.getVSVRIntroductionRule()); } 
	 EOF 
;

// Rule VSVRIntroduction
ruleVSVRIntroduction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRIntroductionAccess().getGroup()); }
		(rule__VSVRIntroduction__Group__0)
		{ after(grammarAccess.getVSVRIntroductionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVRApplicableDocuments
entryRuleVSVRApplicableDocuments
:
{ before(grammarAccess.getVSVRApplicableDocumentsRule()); }
	 ruleVSVRApplicableDocuments
{ after(grammarAccess.getVSVRApplicableDocumentsRule()); } 
	 EOF 
;

// Rule VSVRApplicableDocuments
ruleVSVRApplicableDocuments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRApplicableDocumentsAccess().getGroup()); }
		(rule__VSVRApplicableDocuments__Group__0)
		{ after(grammarAccess.getVSVRApplicableDocumentsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVRReferenceDocuments
entryRuleVSVRReferenceDocuments
:
{ before(grammarAccess.getVSVRReferenceDocumentsRule()); }
	 ruleVSVRReferenceDocuments
{ after(grammarAccess.getVSVRReferenceDocumentsRule()); } 
	 EOF 
;

// Rule VSVRReferenceDocuments
ruleVSVRReferenceDocuments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRReferenceDocumentsAccess().getGroup()); }
		(rule__VSVRReferenceDocuments__Group__0)
		{ after(grammarAccess.getVSVRReferenceDocumentsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVRTermsDefinitionsAbbreviations
entryRuleVSVRTermsDefinitionsAbbreviations
:
{ before(grammarAccess.getVSVRTermsDefinitionsAbbreviationsRule()); }
	 ruleVSVRTermsDefinitionsAbbreviations
{ after(grammarAccess.getVSVRTermsDefinitionsAbbreviationsRule()); } 
	 EOF 
;

// Rule VSVRTermsDefinitionsAbbreviations
ruleVSVRTermsDefinitionsAbbreviations 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getGroup()); }
		(rule__VSVRTermsDefinitionsAbbreviations__Group__0)
		{ after(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVRTerm
entryRuleVSVRTerm
:
{ before(grammarAccess.getVSVRTermRule()); }
	 ruleVSVRTerm
{ after(grammarAccess.getVSVRTermRule()); } 
	 EOF 
;

// Rule VSVRTerm
ruleVSVRTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRTermAccess().getGroup()); }
		(rule__VSVRTerm__Group__0)
		{ after(grammarAccess.getVSVRTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVRDefinition
entryRuleVSVRDefinition
:
{ before(grammarAccess.getVSVRDefinitionRule()); }
	 ruleVSVRDefinition
{ after(grammarAccess.getVSVRDefinitionRule()); } 
	 EOF 
;

// Rule VSVRDefinition
ruleVSVRDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRDefinitionAccess().getGroup()); }
		(rule__VSVRDefinition__Group__0)
		{ after(grammarAccess.getVSVRDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVRAbbreviation
entryRuleVSVRAbbreviation
:
{ before(grammarAccess.getVSVRAbbreviationRule()); }
	 ruleVSVRAbbreviation
{ after(grammarAccess.getVSVRAbbreviationRule()); } 
	 EOF 
;

// Rule VSVRAbbreviation
ruleVSVRAbbreviation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRAbbreviationAccess().getGroup()); }
		(rule__VSVRAbbreviation__Group__0)
		{ after(grammarAccess.getVSVRAbbreviationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVRSWValProcessVerification
entryRuleVSVRSWValProcessVerification
:
{ before(grammarAccess.getVSVRSWValProcessVerificationRule()); }
	 ruleVSVRSWValProcessVerification
{ after(grammarAccess.getVSVRSWValProcessVerificationRule()); } 
	 EOF 
;

// Rule VSVRSWValProcessVerification
ruleVSVRSWValProcessVerification 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getGroup()); }
		(rule__VSVRSWValProcessVerification__Group__0)
		{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule DAlignment
ruleDAlignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDAlignmentAccess().getAlternatives()); }
		(rule__DAlignment__Alternatives)
		{ after(grammarAccess.getDAlignmentAccess().getAlternatives()); }
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

rule__DTBC__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTBCAccess().getGroup_3_0()); }
		(rule__DTBC__Group_3_0__0)
		{ after(grammarAccess.getDTBCAccess().getGroup_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getDTBCAccess().getGroup_3_1()); }
		(rule__DTBC__Group_3_1__0)
		{ after(grammarAccess.getDTBCAccess().getGroup_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTBDAccess().getGroup_3_0()); }
		(rule__DTBD__Group_3_0__0)
		{ after(grammarAccess.getDTBDAccess().getGroup_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getDTBDAccess().getGroup_3_1()); }
		(rule__DTBD__Group_3_1__0)
		{ after(grammarAccess.getDTBDAccess().getGroup_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBodyContent__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBodyContentAccess().getDParagraphParserRuleCall_0()); }
		ruleDParagraph
		{ after(grammarAccess.getDBodyContentAccess().getDParagraphParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDBodyContentAccess().getDItemizeParserRuleCall_1()); }
		ruleDItemize
		{ after(grammarAccess.getDBodyContentAccess().getDItemizeParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDBodyContentAccess().getDEnumerateParserRuleCall_2()); }
		ruleDEnumerate
		{ after(grammarAccess.getDBodyContentAccess().getDEnumerateParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getDBodyContentAccess().getDFigureFromFileParserRuleCall_3()); }
		ruleDFigureFromFile
		{ after(grammarAccess.getDBodyContentAccess().getDFigureFromFileParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getDBodyContentAccess().getDTableFromFileParserRuleCall_4()); }
		ruleDTableFromFile
		{ after(grammarAccess.getDBodyContentAccess().getDTableFromFileParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getDBodyContentAccess().getDBasicTableParserRuleCall_5()); }
		ruleDBasicTable
		{ after(grammarAccess.getDBodyContentAccess().getDBasicTableParserRuleCall_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListContent__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDListContentAccess().getDItemizeParserRuleCall_0()); }
		ruleDItemize
		{ after(grammarAccess.getDListContentAccess().getDItemizeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDListContentAccess().getDEnumerateParserRuleCall_1()); }
		ruleDEnumerate
		{ after(grammarAccess.getDListContentAccess().getDEnumerateParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraphContent__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDParagraphContentAccess().getDRunParserRuleCall_0()); }
		ruleDRun
		{ after(grammarAccess.getDParagraphContentAccess().getDRunParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDParagraphContentAccess().getDHyperlinkParserRuleCall_1()); }
		ruleDHyperlink
		{ after(grammarAccess.getDParagraphContentAccess().getDHyperlinkParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDHyperlinkAccess().getGroup_3_0()); }
		(rule__DHyperlink__Group_3_0__0)
		{ after(grammarAccess.getDHyperlinkAccess().getGroup_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getDHyperlinkAccess().getSolidusGreaterThanSignKeyword_3_1()); }
		'/>'
		{ after(grammarAccess.getDHyperlinkAccess().getSolidusGreaterThanSignKeyword_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DAlignment__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDAlignmentAccess().getLeftEnumLiteralDeclaration_0()); }
		('"left"')
		{ after(grammarAccess.getDAlignmentAccess().getLeftEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDAlignmentAccess().getCenterEnumLiteralDeclaration_1()); }
		('"center"')
		{ after(grammarAccess.getDAlignmentAccess().getCenterEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getDAlignmentAccess().getRightEnumLiteralDeclaration_2()); }
		('"right"')
		{ after(grammarAccess.getDAlignmentAccess().getRightEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getDAlignmentAccess().getJustifiedEnumLiteralDeclaration_3()); }
		('"justified"')
		{ after(grammarAccess.getDAlignmentAccess().getJustifiedEnumLiteralDeclaration_3()); }
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

rule__VSVRDocument__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__0__Impl
	rule__VSVRDocument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getSVRKeyword_0()); }
	'<SVR'
	{ after(grammarAccess.getVSVRDocumentAccess().getSVRKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__1__Impl
	rule__VSVRDocument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVRDocumentAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__2__Impl
	rule__VSVRDocument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getNameAssignment_2()); }
	(rule__VSVRDocument__NameAssignment_2)
	{ after(grammarAccess.getVSVRDocumentAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__3__Impl
	rule__VSVRDocument__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getIdKeyword_3()); }
	'id='
	{ after(grammarAccess.getVSVRDocumentAccess().getIdKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__4__Impl
	rule__VSVRDocument__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getIdAssignment_4()); }
	(rule__VSVRDocument__IdAssignment_4)
	{ after(grammarAccess.getVSVRDocumentAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__5__Impl
	rule__VSVRDocument__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getIssueKeyword_5()); }
	'issue='
	{ after(grammarAccess.getVSVRDocumentAccess().getIssueKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__6__Impl
	rule__VSVRDocument__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getIssueAssignment_6()); }
	(rule__VSVRDocument__IssueAssignment_6)
	{ after(grammarAccess.getVSVRDocumentAccess().getIssueAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__7__Impl
	rule__VSVRDocument__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getRevisionKeyword_7()); }
	'revision='
	{ after(grammarAccess.getVSVRDocumentAccess().getRevisionKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__8__Impl
	rule__VSVRDocument__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getRevisionAssignment_8()); }
	(rule__VSVRDocument__RevisionAssignment_8)
	{ after(grammarAccess.getVSVRDocumentAccess().getRevisionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__9__Impl
	rule__VSVRDocument__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getDateKeyword_9()); }
	'date='
	{ after(grammarAccess.getVSVRDocumentAccess().getDateKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__10__Impl
	rule__VSVRDocument__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getDateAssignment_10()); }
	(rule__VSVRDocument__DateAssignment_10)
	{ after(grammarAccess.getVSVRDocumentAccess().getDateAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__11__Impl
	rule__VSVRDocument__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getGreaterThanSignKeyword_11()); }
	'>'
	{ after(grammarAccess.getVSVRDocumentAccess().getGreaterThanSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__12__Impl
	rule__VSVRDocument__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getSvsParentKeyword_12()); }
	'<svsParent'
	{ after(grammarAccess.getVSVRDocumentAccess().getSvsParentKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__13__Impl
	rule__VSVRDocument__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getNameKeyword_13()); }
	'name='
	{ after(grammarAccess.getVSVRDocumentAccess().getNameKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__14__Impl
	rule__VSVRDocument__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getSvsParentAssignment_14()); }
	(rule__VSVRDocument__SvsParentAssignment_14)
	{ after(grammarAccess.getVSVRDocumentAccess().getSvsParentAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__15__Impl
	rule__VSVRDocument__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getSolidusGreaterThanSignKeyword_15()); }
	'/>'
	{ after(grammarAccess.getVSVRDocumentAccess().getSolidusGreaterThanSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__16__Impl
	rule__VSVRDocument__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getGroup_16()); }
	(rule__VSVRDocument__Group_16__0)*
	{ after(grammarAccess.getVSVRDocumentAccess().getGroup_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__17__Impl
	rule__VSVRDocument__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getTbcsTbdsSectionAssignment_17()); }
	(rule__VSVRDocument__TbcsTbdsSectionAssignment_17)?
	{ after(grammarAccess.getVSVRDocumentAccess().getTbcsTbdsSectionAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__18__Impl
	rule__VSVRDocument__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getIntroductionSectionAssignment_18()); }
	(rule__VSVRDocument__IntroductionSectionAssignment_18)
	{ after(grammarAccess.getVSVRDocumentAccess().getIntroductionSectionAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__19__Impl
	rule__VSVRDocument__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getApplicableDocumentsSectionAssignment_19()); }
	(rule__VSVRDocument__ApplicableDocumentsSectionAssignment_19)
	{ after(grammarAccess.getVSVRDocumentAccess().getApplicableDocumentsSectionAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__20__Impl
	rule__VSVRDocument__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getReferenceDocumentsSectionAssignment_20()); }
	(rule__VSVRDocument__ReferenceDocumentsSectionAssignment_20)
	{ after(grammarAccess.getVSVRDocumentAccess().getReferenceDocumentsSectionAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__21__Impl
	rule__VSVRDocument__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_21()); }
	(rule__VSVRDocument__TermsDefinitionsAbbreviationsSectionAssignment_21)
	{ after(grammarAccess.getVSVRDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__22__Impl
	rule__VSVRDocument__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getSwValProcessVerificationSectionAssignment_22()); }
	(rule__VSVRDocument__SwValProcessVerificationSectionAssignment_22)
	{ after(grammarAccess.getVSVRDocumentAccess().getSwValProcessVerificationSectionAssignment_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group__23__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getSVRKeyword_23()); }
	'</SVR>'
	{ after(grammarAccess.getVSVRDocumentAccess().getSVRKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRDocument__Group_16__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group_16__0__Impl
	rule__VSVRDocument__Group_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group_16__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getTcrParentKeyword_16_0()); }
	'<tcrParent'
	{ after(grammarAccess.getVSVRDocumentAccess().getTcrParentKeyword_16_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group_16__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group_16__1__Impl
	rule__VSVRDocument__Group_16__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group_16__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getNameKeyword_16_1()); }
	'name='
	{ after(grammarAccess.getVSVRDocumentAccess().getNameKeyword_16_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group_16__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group_16__2__Impl
	rule__VSVRDocument__Group_16__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group_16__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getTcrParentAssignment_16_2()); }
	(rule__VSVRDocument__TcrParentAssignment_16_2)
	{ after(grammarAccess.getVSVRDocumentAccess().getTcrParentAssignment_16_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group_16__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDocument__Group_16__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__Group_16__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDocumentAccess().getSolidusGreaterThanSignKeyword_16_3()); }
	'/>'
	{ after(grammarAccess.getVSVRDocumentAccess().getSolidusGreaterThanSignKeyword_16_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRTBCsTBDs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTBCsTBDs__Group__0__Impl
	rule__VSVRTBCsTBDs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTBCsTBDs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTBCsTBDsAccess().getVSVRTBCsTBDsAction_0()); }
	()
	{ after(grammarAccess.getVSVRTBCsTBDsAccess().getVSVRTBCsTBDsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTBCsTBDs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTBCsTBDs__Group__1__Impl
	rule__VSVRTBCsTBDs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTBCsTBDs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTBCsTBDsAccess().getTBCsTBDsKeyword_1()); }
	'<TBCsTBDs>'
	{ after(grammarAccess.getVSVRTBCsTBDsAccess().getTBCsTBDsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTBCsTBDs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTBCsTBDs__Group__2__Impl
	rule__VSVRTBCsTBDs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTBCsTBDs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTBCsTBDsAccess().getTbcsAssignment_2()); }
	(rule__VSVRTBCsTBDs__TbcsAssignment_2)*
	{ after(grammarAccess.getVSVRTBCsTBDsAccess().getTbcsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTBCsTBDs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTBCsTBDs__Group__3__Impl
	rule__VSVRTBCsTBDs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTBCsTBDs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTBCsTBDsAccess().getTbdsAssignment_3()); }
	(rule__VSVRTBCsTBDs__TbdsAssignment_3)*
	{ after(grammarAccess.getVSVRTBCsTBDsAccess().getTbdsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTBCsTBDs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTBCsTBDs__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTBCsTBDs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTBCsTBDsAccess().getTBCsTBDsKeyword_4()); }
	'</TBCsTBDs>'
	{ after(grammarAccess.getVSVRTBCsTBDsAccess().getTBCsTBDsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTBC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBC__Group__0__Impl
	rule__DTBC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBCAccess().getTBCKeyword_0()); }
	'<TBC'
	{ after(grammarAccess.getDTBCAccess().getTBCKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBC__Group__1__Impl
	rule__DTBC__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBCAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getDTBCAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBC__Group__2__Impl
	rule__DTBC__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBCAccess().getNameAssignment_2()); }
	(rule__DTBC__NameAssignment_2)
	{ after(grammarAccess.getDTBCAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBC__Group__3__Impl
	rule__DTBC__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBCAccess().getAlternatives_3()); }
	(rule__DTBC__Alternatives_3)
	{ after(grammarAccess.getDTBCAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBC__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBCAccess().getSolidusGreaterThanSignKeyword_4()); }
	'/>'
	{ after(grammarAccess.getDTBCAccess().getSolidusGreaterThanSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTBC__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBC__Group_3_0__0__Impl
	rule__DTBC__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBCAccess().getDescriptionKeyword_3_0_0()); }
	'description='
	{ after(grammarAccess.getDTBCAccess().getDescriptionKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBC__Group_3_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBCAccess().getDescriptionAssignment_3_0_1()); }
	(rule__DTBC__DescriptionAssignment_3_0_1)
	{ after(grammarAccess.getDTBCAccess().getDescriptionAssignment_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTBC__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBC__Group_3_1__0__Impl
	rule__DTBC__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBCAccess().getParentTBCKeyword_3_1_0()); }
	'parentTBC='
	{ after(grammarAccess.getDTBCAccess().getParentTBCKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBC__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBCAccess().getParentTBCAssignment_3_1_1()); }
	(rule__DTBC__ParentTBCAssignment_3_1_1)
	{ after(grammarAccess.getDTBCAccess().getParentTBCAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTBD__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBD__Group__0__Impl
	rule__DTBD__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBDAccess().getTBDKeyword_0()); }
	'<TBD'
	{ after(grammarAccess.getDTBDAccess().getTBDKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBD__Group__1__Impl
	rule__DTBD__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBDAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getDTBDAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBD__Group__2__Impl
	rule__DTBD__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBDAccess().getNameAssignment_2()); }
	(rule__DTBD__NameAssignment_2)
	{ after(grammarAccess.getDTBDAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBD__Group__3__Impl
	rule__DTBD__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBDAccess().getAlternatives_3()); }
	(rule__DTBD__Alternatives_3)
	{ after(grammarAccess.getDTBDAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBD__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBDAccess().getSolidusGreaterThanSignKeyword_4()); }
	'/>'
	{ after(grammarAccess.getDTBDAccess().getSolidusGreaterThanSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTBD__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBD__Group_3_0__0__Impl
	rule__DTBD__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBDAccess().getDescriptionKeyword_3_0_0()); }
	'description='
	{ after(grammarAccess.getDTBDAccess().getDescriptionKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBD__Group_3_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBDAccess().getDescriptionAssignment_3_0_1()); }
	(rule__DTBD__DescriptionAssignment_3_0_1)
	{ after(grammarAccess.getDTBDAccess().getDescriptionAssignment_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTBD__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBD__Group_3_1__0__Impl
	rule__DTBD__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBDAccess().getParentTBDKeyword_3_1_0()); }
	'parentTBD='
	{ after(grammarAccess.getDTBDAccess().getParentTBDKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBD__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBDAccess().getParentTBDAssignment_3_1_1()); }
	(rule__DTBD__ParentTBDAssignment_3_1_1)
	{ after(grammarAccess.getDTBDAccess().getParentTBDAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DBody__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody__Group__0__Impl
	rule__DBody__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBodyAccess().getBodyKeyword_0()); }
	'<body>'
	{ after(grammarAccess.getDBodyAccess().getBodyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody__Group__1__Impl
	rule__DBody__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDBodyAccess().getBodyContentAssignment_1()); }
		(rule__DBody__BodyContentAssignment_1)
		{ after(grammarAccess.getDBodyAccess().getBodyContentAssignment_1()); }
	)
	(
		{ before(grammarAccess.getDBodyAccess().getBodyContentAssignment_1()); }
		(rule__DBody__BodyContentAssignment_1)*
		{ after(grammarAccess.getDBodyAccess().getBodyContentAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBodyAccess().getBodyKeyword_2()); }
	'</body>'
	{ after(grammarAccess.getDBodyAccess().getBodyKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DParagraph__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group__0__Impl
	rule__DParagraph__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getParagraphKeyword_0()); }
	'<paragraph'
	{ after(grammarAccess.getDParagraphAccess().getParagraphKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group__1__Impl
	rule__DParagraph__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getGroup_1()); }
	(rule__DParagraph__Group_1__0)?
	{ after(grammarAccess.getDParagraphAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group__2__Impl
	rule__DParagraph__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getGroup_2()); }
	(rule__DParagraph__Group_2__0)?
	{ after(grammarAccess.getDParagraphAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group__3__Impl
	rule__DParagraph__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getGroup_3()); }
	(rule__DParagraph__Group_3__0)?
	{ after(grammarAccess.getDParagraphAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group__4__Impl
	rule__DParagraph__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getGroup_4()); }
	(rule__DParagraph__Group_4__0)?
	{ after(grammarAccess.getDParagraphAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group__5__Impl
	rule__DParagraph__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getDParagraphAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group__6__Impl
	rule__DParagraph__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_6()); }
		(rule__DParagraph__ParagraphContentAssignment_6)
		{ after(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_6()); }
	)
	(
		{ before(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_6()); }
		(rule__DParagraph__ParagraphContentAssignment_6)*
		{ after(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getParagraphKeyword_7()); }
	'</paragraph>'
	{ after(grammarAccess.getDParagraphAccess().getParagraphKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DParagraph__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group_1__0__Impl
	rule__DParagraph__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getNameKeyword_1_0()); }
	'name='
	{ after(grammarAccess.getDParagraphAccess().getNameKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getNameAssignment_1_1()); }
	(rule__DParagraph__NameAssignment_1_1)
	{ after(grammarAccess.getDParagraphAccess().getNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DParagraph__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group_2__0__Impl
	rule__DParagraph__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getAlignmentKeyword_2_0()); }
	'alignment='
	{ after(grammarAccess.getDParagraphAccess().getAlignmentKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getAlignmentAssignment_2_1()); }
	(rule__DParagraph__AlignmentAssignment_2_1)
	{ after(grammarAccess.getDParagraphAccess().getAlignmentAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DParagraph__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group_3__0__Impl
	rule__DParagraph__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getStyleKeyword_3_0()); }
	'style='
	{ after(grammarAccess.getDParagraphAccess().getStyleKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getStyleAssignment_3_1()); }
	(rule__DParagraph__StyleAssignment_3_1)
	{ after(grammarAccess.getDParagraphAccess().getStyleAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DParagraph__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group_4__0__Impl
	rule__DParagraph__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getIndentKeyword_4_0()); }
	'indent='
	{ after(grammarAccess.getDParagraphAccess().getIndentKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getIndentAssignment_4_1()); }
	(rule__DParagraph__IndentAssignment_4_1)
	{ after(grammarAccess.getDParagraphAccess().getIndentAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DListItem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group__0__Impl
	rule__DListItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getDListItemAction_0()); }
	()
	{ after(grammarAccess.getDListItemAccess().getDListItemAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group__1__Impl
	rule__DListItem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getListItemKeyword_1()); }
	'<listItem>'
	{ after(grammarAccess.getDListItemAccess().getListItemKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group__2__Impl
	rule__DListItem__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getParagraphAssignment_2()); }
	(rule__DListItem__ParagraphAssignment_2)?
	{ after(grammarAccess.getDListItemAccess().getParagraphAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group__3__Impl
	rule__DListItem__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getGroup_3()); }
	(rule__DListItem__Group_3__0)?
	{ after(grammarAccess.getDListItemAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getListItemKeyword_4()); }
	'</listItem>'
	{ after(grammarAccess.getDListItemAccess().getListItemKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DListItem__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group_3__0__Impl
	rule__DListItem__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getSublistKeyword_3_0()); }
	'<sublist>'
	{ after(grammarAccess.getDListItemAccess().getSublistKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group_3__1__Impl
	rule__DListItem__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getSublistAssignment_3_1()); }
	(rule__DListItem__SublistAssignment_3_1)
	{ after(grammarAccess.getDListItemAccess().getSublistAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getSublistKeyword_3_2()); }
	'</sublist>'
	{ after(grammarAccess.getDListItemAccess().getSublistKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DItemize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group__0__Impl
	rule__DItemize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getItemizeKeyword_0()); }
	'<itemize'
	{ after(grammarAccess.getDItemizeAccess().getItemizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group__1__Impl
	rule__DItemize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getGroup_1()); }
	(rule__DItemize__Group_1__0)?
	{ after(grammarAccess.getDItemizeAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group__2__Impl
	rule__DItemize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getGroup_2()); }
	(rule__DItemize__Group_2__0)?
	{ after(grammarAccess.getDItemizeAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group__3__Impl
	rule__DItemize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getGroup_3()); }
	(rule__DItemize__Group_3__0)?
	{ after(grammarAccess.getDItemizeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group__4__Impl
	rule__DItemize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getGroup_4()); }
	(rule__DItemize__Group_4__0)?
	{ after(grammarAccess.getDItemizeAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group__5__Impl
	rule__DItemize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getDItemizeAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group__6__Impl
	rule__DItemize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDItemizeAccess().getItemsAssignment_6()); }
		(rule__DItemize__ItemsAssignment_6)
		{ after(grammarAccess.getDItemizeAccess().getItemsAssignment_6()); }
	)
	(
		{ before(grammarAccess.getDItemizeAccess().getItemsAssignment_6()); }
		(rule__DItemize__ItemsAssignment_6)*
		{ after(grammarAccess.getDItemizeAccess().getItemsAssignment_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getItemizeKeyword_7()); }
	'</itemize>'
	{ after(grammarAccess.getDItemizeAccess().getItemizeKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DItemize__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group_1__0__Impl
	rule__DItemize__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getNameKeyword_1_0()); }
	'name='
	{ after(grammarAccess.getDItemizeAccess().getNameKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getNameAssignment_1_1()); }
	(rule__DItemize__NameAssignment_1_1)
	{ after(grammarAccess.getDItemizeAccess().getNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DItemize__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group_2__0__Impl
	rule__DItemize__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getAlignmentKeyword_2_0()); }
	'alignment='
	{ after(grammarAccess.getDItemizeAccess().getAlignmentKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getAlignmentAssignment_2_1()); }
	(rule__DItemize__AlignmentAssignment_2_1)
	{ after(grammarAccess.getDItemizeAccess().getAlignmentAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DItemize__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group_3__0__Impl
	rule__DItemize__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getStyleKeyword_3_0()); }
	'style='
	{ after(grammarAccess.getDItemizeAccess().getStyleKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getStyleAssignment_3_1()); }
	(rule__DItemize__StyleAssignment_3_1)
	{ after(grammarAccess.getDItemizeAccess().getStyleAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DItemize__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group_4__0__Impl
	rule__DItemize__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getIndentKeyword_4_0()); }
	'indent='
	{ after(grammarAccess.getDItemizeAccess().getIndentKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getIndentAssignment_4_1()); }
	(rule__DItemize__IndentAssignment_4_1)
	{ after(grammarAccess.getDItemizeAccess().getIndentAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DEnumerate__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group__0__Impl
	rule__DEnumerate__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getEnumerateKeyword_0()); }
	'<enumerate'
	{ after(grammarAccess.getDEnumerateAccess().getEnumerateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group__1__Impl
	rule__DEnumerate__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getGroup_1()); }
	(rule__DEnumerate__Group_1__0)?
	{ after(grammarAccess.getDEnumerateAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group__2__Impl
	rule__DEnumerate__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getGroup_2()); }
	(rule__DEnumerate__Group_2__0)?
	{ after(grammarAccess.getDEnumerateAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group__3__Impl
	rule__DEnumerate__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getGroup_3()); }
	(rule__DEnumerate__Group_3__0)?
	{ after(grammarAccess.getDEnumerateAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group__4__Impl
	rule__DEnumerate__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getGroup_4()); }
	(rule__DEnumerate__Group_4__0)?
	{ after(grammarAccess.getDEnumerateAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group__5__Impl
	rule__DEnumerate__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getDEnumerateAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group__6__Impl
	rule__DEnumerate__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDEnumerateAccess().getItemsAssignment_6()); }
		(rule__DEnumerate__ItemsAssignment_6)
		{ after(grammarAccess.getDEnumerateAccess().getItemsAssignment_6()); }
	)
	(
		{ before(grammarAccess.getDEnumerateAccess().getItemsAssignment_6()); }
		(rule__DEnumerate__ItemsAssignment_6)*
		{ after(grammarAccess.getDEnumerateAccess().getItemsAssignment_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getEnumerateKeyword_7()); }
	'</enumerate>'
	{ after(grammarAccess.getDEnumerateAccess().getEnumerateKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DEnumerate__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group_1__0__Impl
	rule__DEnumerate__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getNameKeyword_1_0()); }
	'name='
	{ after(grammarAccess.getDEnumerateAccess().getNameKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getNameAssignment_1_1()); }
	(rule__DEnumerate__NameAssignment_1_1)
	{ after(grammarAccess.getDEnumerateAccess().getNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DEnumerate__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group_2__0__Impl
	rule__DEnumerate__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getAlignmentKeyword_2_0()); }
	'alignment='
	{ after(grammarAccess.getDEnumerateAccess().getAlignmentKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getAlignmentAssignment_2_1()); }
	(rule__DEnumerate__AlignmentAssignment_2_1)
	{ after(grammarAccess.getDEnumerateAccess().getAlignmentAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DEnumerate__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group_3__0__Impl
	rule__DEnumerate__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getStyleKeyword_3_0()); }
	'style='
	{ after(grammarAccess.getDEnumerateAccess().getStyleKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getStyleAssignment_3_1()); }
	(rule__DEnumerate__StyleAssignment_3_1)
	{ after(grammarAccess.getDEnumerateAccess().getStyleAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DEnumerate__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group_4__0__Impl
	rule__DEnumerate__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getIndentKeyword_4_0()); }
	'indent='
	{ after(grammarAccess.getDEnumerateAccess().getIndentKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getIndentAssignment_4_1()); }
	(rule__DEnumerate__IndentAssignment_4_1)
	{ after(grammarAccess.getDEnumerateAccess().getIndentAssignment_4_1()); }
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
	{ before(grammarAccess.getDRunAccess().getTabAssignment_6()); }
	(rule__DRun__TabAssignment_6)?
	{ after(grammarAccess.getDRunAccess().getTabAssignment_6()); }
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
	rule__DRun__Group__8
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
	{ before(grammarAccess.getDRunAccess().getTextAssignment_7()); }
	(rule__DRun__TextAssignment_7)
	{ after(grammarAccess.getDRunAccess().getTextAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getRunKeyword_8()); }
	'</run>'
	{ after(grammarAccess.getDRunAccess().getRunKeyword_8()); }
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


rule__DHyperlink__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DHyperlink__Group__0__Impl
	rule__DHyperlink__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_0()); }
	'<hyperlink'
	{ after(grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DHyperlink__Group__1__Impl
	rule__DHyperlink__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDHyperlinkAccess().getReferenceKeyword_1()); }
	'reference='
	{ after(grammarAccess.getDHyperlinkAccess().getReferenceKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DHyperlink__Group__2__Impl
	rule__DHyperlink__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDHyperlinkAccess().getReferenceAssignment_2()); }
	(rule__DHyperlink__ReferenceAssignment_2)
	{ after(grammarAccess.getDHyperlinkAccess().getReferenceAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DHyperlink__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDHyperlinkAccess().getAlternatives_3()); }
	(rule__DHyperlink__Alternatives_3)
	{ after(grammarAccess.getDHyperlinkAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DHyperlink__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DHyperlink__Group_3_0__0__Impl
	rule__DHyperlink__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDHyperlinkAccess().getGreaterThanSignKeyword_3_0_0()); }
	'>'
	{ after(grammarAccess.getDHyperlinkAccess().getGreaterThanSignKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DHyperlink__Group_3_0__1__Impl
	rule__DHyperlink__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDHyperlinkAccess().getRunAssignment_3_0_1()); }
	(rule__DHyperlink__RunAssignment_3_0_1)
	{ after(grammarAccess.getDHyperlinkAccess().getRunAssignment_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DHyperlink__Group_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_3_0_2()); }
	'</hyperlink>'
	{ after(grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTab__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTab__Group__0__Impl
	rule__DTab__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTab__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTabAccess().getDTabAction_0()); }
	()
	{ after(grammarAccess.getDTabAccess().getDTabAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTab__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTab__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTab__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTabAccess().getTabKeyword_1()); }
	'<tab/>'
	{ after(grammarAccess.getDTabAccess().getTabKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DFigureFromFile__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__0__Impl
	rule__DFigureFromFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getFigureFromFileKeyword_0()); }
	'<figureFromFile'
	{ after(grammarAccess.getDFigureFromFileAccess().getFigureFromFileKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__1__Impl
	rule__DFigureFromFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getDFigureFromFileAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__2__Impl
	rule__DFigureFromFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getNameAssignment_2()); }
	(rule__DFigureFromFile__NameAssignment_2)
	{ after(grammarAccess.getDFigureFromFileAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__3__Impl
	rule__DFigureFromFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getReferenceFileKeyword_3()); }
	'referenceFile='
	{ after(grammarAccess.getDFigureFromFileAccess().getReferenceFileKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__4__Impl
	rule__DFigureFromFile__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getReferenceFileAssignment_4()); }
	(rule__DFigureFromFile__ReferenceFileAssignment_4)
	{ after(grammarAccess.getDFigureFromFileAccess().getReferenceFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__5__Impl
	rule__DFigureFromFile__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getWidthKeyword_5()); }
	'width='
	{ after(grammarAccess.getDFigureFromFileAccess().getWidthKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__6__Impl
	rule__DFigureFromFile__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getWidthAssignment_6()); }
	(rule__DFigureFromFile__WidthAssignment_6)
	{ after(grammarAccess.getDFigureFromFileAccess().getWidthAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__7__Impl
	rule__DFigureFromFile__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getHeightKeyword_7()); }
	'height='
	{ after(grammarAccess.getDFigureFromFileAccess().getHeightKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__8__Impl
	rule__DFigureFromFile__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getHeightAssignment_8()); }
	(rule__DFigureFromFile__HeightAssignment_8)
	{ after(grammarAccess.getDFigureFromFileAccess().getHeightAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__9__Impl
	rule__DFigureFromFile__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getGroup_9()); }
	(rule__DFigureFromFile__Group_9__0)?
	{ after(grammarAccess.getDFigureFromFileAccess().getGroup_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__10__Impl
	rule__DFigureFromFile__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getGroup_10()); }
	(rule__DFigureFromFile__Group_10__0)?
	{ after(grammarAccess.getDFigureFromFileAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__11__Impl
	rule__DFigureFromFile__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getGroup_11()); }
	(rule__DFigureFromFile__Group_11__0)?
	{ after(grammarAccess.getDFigureFromFileAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__12__Impl
	rule__DFigureFromFile__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getGroup_12()); }
	(rule__DFigureFromFile__Group_12__0)?
	{ after(grammarAccess.getDFigureFromFileAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getSolidusGreaterThanSignKeyword_13()); }
	'/>'
	{ after(grammarAccess.getDFigureFromFileAccess().getSolidusGreaterThanSignKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DFigureFromFile__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group_9__0__Impl
	rule__DFigureFromFile__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getAlignmentKeyword_9_0()); }
	'alignment='
	{ after(grammarAccess.getDFigureFromFileAccess().getAlignmentKeyword_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getAlignmentAssignment_9_1()); }
	(rule__DFigureFromFile__AlignmentAssignment_9_1)
	{ after(grammarAccess.getDFigureFromFileAccess().getAlignmentAssignment_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DFigureFromFile__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group_10__0__Impl
	rule__DFigureFromFile__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getStyleKeyword_10_0()); }
	'style='
	{ after(grammarAccess.getDFigureFromFileAccess().getStyleKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getStyleAssignment_10_1()); }
	(rule__DFigureFromFile__StyleAssignment_10_1)
	{ after(grammarAccess.getDFigureFromFileAccess().getStyleAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DFigureFromFile__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group_11__0__Impl
	rule__DFigureFromFile__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getIndentKeyword_11_0()); }
	'indent='
	{ after(grammarAccess.getDFigureFromFileAccess().getIndentKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getIndentAssignment_11_1()); }
	(rule__DFigureFromFile__IndentAssignment_11_1)
	{ after(grammarAccess.getDFigureFromFileAccess().getIndentAssignment_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DFigureFromFile__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group_12__0__Impl
	rule__DFigureFromFile__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getCaptionKeyword_12_0()); }
	'caption='
	{ after(grammarAccess.getDFigureFromFileAccess().getCaptionKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group_12__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getCaptionAssignment_12_1()); }
	(rule__DFigureFromFile__CaptionAssignment_12_1)
	{ after(grammarAccess.getDFigureFromFileAccess().getCaptionAssignment_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTableFromFile__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__0__Impl
	rule__DTableFromFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getTableFromFileKeyword_0()); }
	'<tableFromFile'
	{ after(grammarAccess.getDTableFromFileAccess().getTableFromFileKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__1__Impl
	rule__DTableFromFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getDTableFromFileAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__2__Impl
	rule__DTableFromFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getNameAssignment_2()); }
	(rule__DTableFromFile__NameAssignment_2)
	{ after(grammarAccess.getDTableFromFileAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__3__Impl
	rule__DTableFromFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getReferenceFileKeyword_3()); }
	'referenceFile='
	{ after(grammarAccess.getDTableFromFileAccess().getReferenceFileKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__4__Impl
	rule__DTableFromFile__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getReferenceFileAssignment_4()); }
	(rule__DTableFromFile__ReferenceFileAssignment_4)
	{ after(grammarAccess.getDTableFromFileAccess().getReferenceFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__5__Impl
	rule__DTableFromFile__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getWidthKeyword_5()); }
	'width='
	{ after(grammarAccess.getDTableFromFileAccess().getWidthKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__6__Impl
	rule__DTableFromFile__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getWidthAssignment_6()); }
	(rule__DTableFromFile__WidthAssignment_6)
	{ after(grammarAccess.getDTableFromFileAccess().getWidthAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__7__Impl
	rule__DTableFromFile__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getHeightKeyword_7()); }
	'height='
	{ after(grammarAccess.getDTableFromFileAccess().getHeightKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__8__Impl
	rule__DTableFromFile__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getHeightAssignment_8()); }
	(rule__DTableFromFile__HeightAssignment_8)
	{ after(grammarAccess.getDTableFromFileAccess().getHeightAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__9__Impl
	rule__DTableFromFile__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getGroup_9()); }
	(rule__DTableFromFile__Group_9__0)?
	{ after(grammarAccess.getDTableFromFileAccess().getGroup_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__10__Impl
	rule__DTableFromFile__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getGroup_10()); }
	(rule__DTableFromFile__Group_10__0)?
	{ after(grammarAccess.getDTableFromFileAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__11__Impl
	rule__DTableFromFile__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getGroup_11()); }
	(rule__DTableFromFile__Group_11__0)?
	{ after(grammarAccess.getDTableFromFileAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__12__Impl
	rule__DTableFromFile__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getGroup_12()); }
	(rule__DTableFromFile__Group_12__0)?
	{ after(grammarAccess.getDTableFromFileAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getSolidusGreaterThanSignKeyword_13()); }
	'/>'
	{ after(grammarAccess.getDTableFromFileAccess().getSolidusGreaterThanSignKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTableFromFile__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group_9__0__Impl
	rule__DTableFromFile__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getAlignmentKeyword_9_0()); }
	'alignment='
	{ after(grammarAccess.getDTableFromFileAccess().getAlignmentKeyword_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getAlignmentAssignment_9_1()); }
	(rule__DTableFromFile__AlignmentAssignment_9_1)
	{ after(grammarAccess.getDTableFromFileAccess().getAlignmentAssignment_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTableFromFile__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group_10__0__Impl
	rule__DTableFromFile__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getStyleKeyword_10_0()); }
	'style='
	{ after(grammarAccess.getDTableFromFileAccess().getStyleKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getStyleAssignment_10_1()); }
	(rule__DTableFromFile__StyleAssignment_10_1)
	{ after(grammarAccess.getDTableFromFileAccess().getStyleAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTableFromFile__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group_11__0__Impl
	rule__DTableFromFile__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getIndentKeyword_11_0()); }
	'indent='
	{ after(grammarAccess.getDTableFromFileAccess().getIndentKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getIndentAssignment_11_1()); }
	(rule__DTableFromFile__IndentAssignment_11_1)
	{ after(grammarAccess.getDTableFromFileAccess().getIndentAssignment_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTableFromFile__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group_12__0__Impl
	rule__DTableFromFile__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getCaptionKeyword_12_0()); }
	'caption='
	{ after(grammarAccess.getDTableFromFileAccess().getCaptionKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group_12__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getCaptionAssignment_12_1()); }
	(rule__DTableFromFile__CaptionAssignment_12_1)
	{ after(grammarAccess.getDTableFromFileAccess().getCaptionAssignment_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DBasicTable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group__0__Impl
	rule__DBasicTable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getBasicTableKeyword_0()); }
	'<basicTable'
	{ after(grammarAccess.getDBasicTableAccess().getBasicTableKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group__1__Impl
	rule__DBasicTable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getDBasicTableAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group__2__Impl
	rule__DBasicTable__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getNameAssignment_2()); }
	(rule__DBasicTable__NameAssignment_2)
	{ after(grammarAccess.getDBasicTableAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group__3__Impl
	rule__DBasicTable__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getGroup_3()); }
	(rule__DBasicTable__Group_3__0)?
	{ after(grammarAccess.getDBasicTableAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group__4__Impl
	rule__DBasicTable__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getGroup_4()); }
	(rule__DBasicTable__Group_4__0)?
	{ after(grammarAccess.getDBasicTableAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group__5__Impl
	rule__DBasicTable__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getGroup_5()); }
	(rule__DBasicTable__Group_5__0)?
	{ after(grammarAccess.getDBasicTableAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group__6__Impl
	rule__DBasicTable__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getGroup_6()); }
	(rule__DBasicTable__Group_6__0)?
	{ after(grammarAccess.getDBasicTableAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group__7__Impl
	rule__DBasicTable__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getGroup_7()); }
	(rule__DBasicTable__Group_7__0)?
	{ after(grammarAccess.getDBasicTableAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group__8__Impl
	rule__DBasicTable__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_8()); }
	'>'
	{ after(grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group__9__Impl
	rule__DBasicTable__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDBasicTableAccess().getRowsAssignment_9()); }
		(rule__DBasicTable__RowsAssignment_9)
		{ after(grammarAccess.getDBasicTableAccess().getRowsAssignment_9()); }
	)
	(
		{ before(grammarAccess.getDBasicTableAccess().getRowsAssignment_9()); }
		(rule__DBasicTable__RowsAssignment_9)*
		{ after(grammarAccess.getDBasicTableAccess().getRowsAssignment_9()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getBasicTableKeyword_10()); }
	'</basicTable>'
	{ after(grammarAccess.getDBasicTableAccess().getBasicTableKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DBasicTable__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group_3__0__Impl
	rule__DBasicTable__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getWidthKeyword_3_0()); }
	'width='
	{ after(grammarAccess.getDBasicTableAccess().getWidthKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getWidthAssignment_3_1()); }
	(rule__DBasicTable__WidthAssignment_3_1)
	{ after(grammarAccess.getDBasicTableAccess().getWidthAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DBasicTable__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group_4__0__Impl
	rule__DBasicTable__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getAlignmentKeyword_4_0()); }
	'alignment='
	{ after(grammarAccess.getDBasicTableAccess().getAlignmentKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getAlignmentAssignment_4_1()); }
	(rule__DBasicTable__AlignmentAssignment_4_1)
	{ after(grammarAccess.getDBasicTableAccess().getAlignmentAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DBasicTable__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group_5__0__Impl
	rule__DBasicTable__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getStyleKeyword_5_0()); }
	'style='
	{ after(grammarAccess.getDBasicTableAccess().getStyleKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getStyleAssignment_5_1()); }
	(rule__DBasicTable__StyleAssignment_5_1)
	{ after(grammarAccess.getDBasicTableAccess().getStyleAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DBasicTable__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group_6__0__Impl
	rule__DBasicTable__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getIndentKeyword_6_0()); }
	'indent='
	{ after(grammarAccess.getDBasicTableAccess().getIndentKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getIndentAssignment_6_1()); }
	(rule__DBasicTable__IndentAssignment_6_1)
	{ after(grammarAccess.getDBasicTableAccess().getIndentAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DBasicTable__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group_7__0__Impl
	rule__DBasicTable__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getCaptionKeyword_7_0()); }
	'caption='
	{ after(grammarAccess.getDBasicTableAccess().getCaptionKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBasicTable__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBasicTableAccess().getCaptionAssignment_7_1()); }
	(rule__DBasicTable__CaptionAssignment_7_1)
	{ after(grammarAccess.getDBasicTableAccess().getCaptionAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DRow__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRow__Group__0__Impl
	rule__DRow__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRowAccess().getRowKeyword_0()); }
	'<row>'
	{ after(grammarAccess.getDRowAccess().getRowKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRow__Group__1__Impl
	rule__DRow__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDRowAccess().getCellsAssignment_1()); }
		(rule__DRow__CellsAssignment_1)
		{ after(grammarAccess.getDRowAccess().getCellsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getDRowAccess().getCellsAssignment_1()); }
		(rule__DRow__CellsAssignment_1)*
		{ after(grammarAccess.getDRowAccess().getCellsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRow__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRowAccess().getRowKeyword_2()); }
	'</row>'
	{ after(grammarAccess.getDRowAccess().getRowKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DCell__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group__0__Impl
	rule__DCell__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getCellKeyword_0()); }
	'<cell'
	{ after(grammarAccess.getDCellAccess().getCellKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group__1__Impl
	rule__DCell__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getGroup_1()); }
	(rule__DCell__Group_1__0)?
	{ after(grammarAccess.getDCellAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group__2__Impl
	rule__DCell__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getGroup_2()); }
	(rule__DCell__Group_2__0)?
	{ after(grammarAccess.getDCellAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group__3__Impl
	rule__DCell__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getGroup_3()); }
	(rule__DCell__Group_3__0)?
	{ after(grammarAccess.getDCellAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group__4__Impl
	rule__DCell__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getGroup_4()); }
	(rule__DCell__Group_4__0)?
	{ after(grammarAccess.getDCellAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group__5__Impl
	rule__DCell__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getDCellAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group__6__Impl
	rule__DCell__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDCellAccess().getBodyContentAssignment_6()); }
		(rule__DCell__BodyContentAssignment_6)
		{ after(grammarAccess.getDCellAccess().getBodyContentAssignment_6()); }
	)
	(
		{ before(grammarAccess.getDCellAccess().getBodyContentAssignment_6()); }
		(rule__DCell__BodyContentAssignment_6)*
		{ after(grammarAccess.getDCellAccess().getBodyContentAssignment_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getCellKeyword_7()); }
	'</cell>'
	{ after(grammarAccess.getDCellAccess().getCellKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DCell__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group_1__0__Impl
	rule__DCell__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getColSpanKeyword_1_0()); }
	'colSpan='
	{ after(grammarAccess.getDCellAccess().getColSpanKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getColSpanAssignment_1_1()); }
	(rule__DCell__ColSpanAssignment_1_1)
	{ after(grammarAccess.getDCellAccess().getColSpanAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DCell__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group_2__0__Impl
	rule__DCell__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getRowSpanKeyword_2_0()); }
	'rowSpan='
	{ after(grammarAccess.getDCellAccess().getRowSpanKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getRowSpanAssignment_2_1()); }
	(rule__DCell__RowSpanAssignment_2_1)
	{ after(grammarAccess.getDCellAccess().getRowSpanAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DCell__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group_3__0__Impl
	rule__DCell__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getWidthKeyword_3_0()); }
	'width='
	{ after(grammarAccess.getDCellAccess().getWidthKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getWidthAssignment_3_1()); }
	(rule__DCell__WidthAssignment_3_1)
	{ after(grammarAccess.getDCellAccess().getWidthAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DCell__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group_4__0__Impl
	rule__DCell__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getShadowKeyword_4_0()); }
	'shadow='
	{ after(grammarAccess.getDCellAccess().getShadowKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getShadowAssignment_4_1()); }
	(rule__DCell__ShadowAssignment_4_1)
	{ after(grammarAccess.getDCellAccess().getShadowAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DApplicableDocument__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group__0__Impl
	rule__DApplicableDocument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getApplicableDocumentKeyword_0()); }
	'<ApplicableDocument'
	{ after(grammarAccess.getDApplicableDocumentAccess().getApplicableDocumentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group__1__Impl
	rule__DApplicableDocument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getDApplicableDocumentAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group__2__Impl
	rule__DApplicableDocument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getNameAssignment_2()); }
	(rule__DApplicableDocument__NameAssignment_2)
	{ after(grammarAccess.getDApplicableDocumentAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group__3__Impl
	rule__DApplicableDocument__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getTitleKeyword_3()); }
	'title='
	{ after(grammarAccess.getDApplicableDocumentAccess().getTitleKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group__4__Impl
	rule__DApplicableDocument__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getTitleAssignment_4()); }
	(rule__DApplicableDocument__TitleAssignment_4)
	{ after(grammarAccess.getDApplicableDocumentAccess().getTitleAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group__5__Impl
	rule__DApplicableDocument__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getIdKeyword_5()); }
	'id='
	{ after(grammarAccess.getDApplicableDocumentAccess().getIdKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group__6__Impl
	rule__DApplicableDocument__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getIdAssignment_6()); }
	(rule__DApplicableDocument__IdAssignment_6)
	{ after(grammarAccess.getDApplicableDocumentAccess().getIdAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group__7__Impl
	rule__DApplicableDocument__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getGroup_7()); }
	(rule__DApplicableDocument__Group_7__0)?
	{ after(grammarAccess.getDApplicableDocumentAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group__8__Impl
	rule__DApplicableDocument__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getGroup_8()); }
	(rule__DApplicableDocument__Group_8__0)?
	{ after(grammarAccess.getDApplicableDocumentAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group__9__Impl
	rule__DApplicableDocument__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getGroup_9()); }
	(rule__DApplicableDocument__Group_9__0)?
	{ after(grammarAccess.getDApplicableDocumentAccess().getGroup_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getSolidusGreaterThanSignKeyword_10()); }
	'/>'
	{ after(grammarAccess.getDApplicableDocumentAccess().getSolidusGreaterThanSignKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DApplicableDocument__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group_7__0__Impl
	rule__DApplicableDocument__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getIssueKeyword_7_0()); }
	'issue='
	{ after(grammarAccess.getDApplicableDocumentAccess().getIssueKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group_7__1__Impl
	rule__DApplicableDocument__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getIssueAssignment_7_1()); }
	(rule__DApplicableDocument__IssueAssignment_7_1)
	{ after(grammarAccess.getDApplicableDocumentAccess().getIssueAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getGroup_7_2()); }
	(rule__DApplicableDocument__Group_7_2__0)?
	{ after(grammarAccess.getDApplicableDocumentAccess().getGroup_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DApplicableDocument__Group_7_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group_7_2__0__Impl
	rule__DApplicableDocument__Group_7_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_7_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_7_2_0()); }
	'revision='
	{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_7_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_7_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group_7_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_7_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_7_2_1()); }
	(rule__DApplicableDocument__RevisionAssignment_7_2_1)
	{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_7_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DApplicableDocument__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group_8__0__Impl
	rule__DApplicableDocument__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getDateKeyword_8_0()); }
	'date='
	{ after(grammarAccess.getDApplicableDocumentAccess().getDateKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getDateAssignment_8_1()); }
	(rule__DApplicableDocument__DateAssignment_8_1)
	{ after(grammarAccess.getDApplicableDocumentAccess().getDateAssignment_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DApplicableDocument__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group_9__0__Impl
	rule__DApplicableDocument__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getUrlKeyword_9_0()); }
	'url='
	{ after(grammarAccess.getDApplicableDocumentAccess().getUrlKeyword_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getUrlAssignment_9_1()); }
	(rule__DApplicableDocument__UrlAssignment_9_1)
	{ after(grammarAccess.getDApplicableDocumentAccess().getUrlAssignment_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DReferenceDocument__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group__0__Impl
	rule__DReferenceDocument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getReferenceDocumentKeyword_0()); }
	'<ReferenceDocument'
	{ after(grammarAccess.getDReferenceDocumentAccess().getReferenceDocumentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group__1__Impl
	rule__DReferenceDocument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getDReferenceDocumentAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group__2__Impl
	rule__DReferenceDocument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getNameAssignment_2()); }
	(rule__DReferenceDocument__NameAssignment_2)
	{ after(grammarAccess.getDReferenceDocumentAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group__3__Impl
	rule__DReferenceDocument__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getTitleKeyword_3()); }
	'title='
	{ after(grammarAccess.getDReferenceDocumentAccess().getTitleKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group__4__Impl
	rule__DReferenceDocument__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getTitleAssignment_4()); }
	(rule__DReferenceDocument__TitleAssignment_4)
	{ after(grammarAccess.getDReferenceDocumentAccess().getTitleAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group__5__Impl
	rule__DReferenceDocument__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getIdKeyword_5()); }
	'id='
	{ after(grammarAccess.getDReferenceDocumentAccess().getIdKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group__6__Impl
	rule__DReferenceDocument__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getIdAssignment_6()); }
	(rule__DReferenceDocument__IdAssignment_6)
	{ after(grammarAccess.getDReferenceDocumentAccess().getIdAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group__7__Impl
	rule__DReferenceDocument__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getGroup_7()); }
	(rule__DReferenceDocument__Group_7__0)?
	{ after(grammarAccess.getDReferenceDocumentAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group__8__Impl
	rule__DReferenceDocument__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getGroup_8()); }
	(rule__DReferenceDocument__Group_8__0)?
	{ after(grammarAccess.getDReferenceDocumentAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group__9__Impl
	rule__DReferenceDocument__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getGroup_9()); }
	(rule__DReferenceDocument__Group_9__0)?
	{ after(grammarAccess.getDReferenceDocumentAccess().getGroup_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getSolidusGreaterThanSignKeyword_10()); }
	'/>'
	{ after(grammarAccess.getDReferenceDocumentAccess().getSolidusGreaterThanSignKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DReferenceDocument__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group_7__0__Impl
	rule__DReferenceDocument__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getIssueKeyword_7_0()); }
	'issue='
	{ after(grammarAccess.getDReferenceDocumentAccess().getIssueKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group_7__1__Impl
	rule__DReferenceDocument__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getIssueAssignment_7_1()); }
	(rule__DReferenceDocument__IssueAssignment_7_1)
	{ after(grammarAccess.getDReferenceDocumentAccess().getIssueAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getGroup_7_2()); }
	(rule__DReferenceDocument__Group_7_2__0)?
	{ after(grammarAccess.getDReferenceDocumentAccess().getGroup_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DReferenceDocument__Group_7_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group_7_2__0__Impl
	rule__DReferenceDocument__Group_7_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_7_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_7_2_0()); }
	'revision='
	{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_7_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_7_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group_7_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_7_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_7_2_1()); }
	(rule__DReferenceDocument__RevisionAssignment_7_2_1)
	{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_7_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DReferenceDocument__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group_8__0__Impl
	rule__DReferenceDocument__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getDateKeyword_8_0()); }
	'date='
	{ after(grammarAccess.getDReferenceDocumentAccess().getDateKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getDateAssignment_8_1()); }
	(rule__DReferenceDocument__DateAssignment_8_1)
	{ after(grammarAccess.getDReferenceDocumentAccess().getDateAssignment_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DReferenceDocument__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group_9__0__Impl
	rule__DReferenceDocument__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getUrlKeyword_9_0()); }
	'url='
	{ after(grammarAccess.getDReferenceDocumentAccess().getUrlKeyword_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getUrlAssignment_9_1()); }
	(rule__DReferenceDocument__UrlAssignment_9_1)
	{ after(grammarAccess.getDReferenceDocumentAccess().getUrlAssignment_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRFixedSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRFixedSection__Group__0__Impl
	rule__VSVRFixedSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRFixedSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRFixedSectionAccess().getVSVRFixedSectionAction_0()); }
	()
	{ after(grammarAccess.getVSVRFixedSectionAccess().getVSVRFixedSectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRFixedSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRFixedSection__Group__1__Impl
	rule__VSVRFixedSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRFixedSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRFixedSectionAccess().getBodyAssignment_1()); }
	(rule__VSVRFixedSection__BodyAssignment_1)?
	{ after(grammarAccess.getVSVRFixedSectionAccess().getBodyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRFixedSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRFixedSection__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRFixedSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRFixedSectionAccess().getSvrInstatiableSubsectionsAssignment_2()); }
	(rule__VSVRFixedSection__SvrInstatiableSubsectionsAssignment_2)*
	{ after(grammarAccess.getVSVRFixedSectionAccess().getSvrInstatiableSubsectionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRInstantiableSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRInstantiableSection__Group__0__Impl
	rule__VSVRInstantiableSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRInstantiableSectionAccess().getSubsectionKeyword_0()); }
	'<subsection'
	{ after(grammarAccess.getVSVRInstantiableSectionAccess().getSubsectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRInstantiableSection__Group__1__Impl
	rule__VSVRInstantiableSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRInstantiableSectionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVRInstantiableSectionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRInstantiableSection__Group__2__Impl
	rule__VSVRInstantiableSection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRInstantiableSectionAccess().getNameAssignment_2()); }
	(rule__VSVRInstantiableSection__NameAssignment_2)
	{ after(grammarAccess.getVSVRInstantiableSectionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRInstantiableSection__Group__3__Impl
	rule__VSVRInstantiableSection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRInstantiableSectionAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVRInstantiableSectionAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRInstantiableSection__Group__4__Impl
	rule__VSVRInstantiableSection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRInstantiableSectionAccess().getBodyAssignment_4()); }
	(rule__VSVRInstantiableSection__BodyAssignment_4)?
	{ after(grammarAccess.getVSVRInstantiableSectionAccess().getBodyAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRInstantiableSection__Group__5__Impl
	rule__VSVRInstantiableSection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRInstantiableSectionAccess().getSvrInstatiableSubsectionsAssignment_5()); }
	(rule__VSVRInstantiableSection__SvrInstatiableSubsectionsAssignment_5)*
	{ after(grammarAccess.getVSVRInstantiableSectionAccess().getSvrInstatiableSubsectionsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRInstantiableSection__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRInstantiableSectionAccess().getSubsectionKeyword_6()); }
	'</subsection>'
	{ after(grammarAccess.getVSVRInstantiableSectionAccess().getSubsectionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRIntroduction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRIntroduction__Group__0__Impl
	rule__VSVRIntroduction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRIntroduction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRIntroductionAccess().getIntroductionKeyword_0()); }
	'<Introduction>'
	{ after(grammarAccess.getVSVRIntroductionAccess().getIntroductionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRIntroduction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRIntroduction__Group__1__Impl
	rule__VSVRIntroduction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRIntroduction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVRIntroductionAccess().getSvrInstatiableSubsectionsAssignment_1()); }
		(rule__VSVRIntroduction__SvrInstatiableSubsectionsAssignment_1)
		{ after(grammarAccess.getVSVRIntroductionAccess().getSvrInstatiableSubsectionsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getVSVRIntroductionAccess().getSvrInstatiableSubsectionsAssignment_1()); }
		(rule__VSVRIntroduction__SvrInstatiableSubsectionsAssignment_1)*
		{ after(grammarAccess.getVSVRIntroductionAccess().getSvrInstatiableSubsectionsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRIntroduction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRIntroduction__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRIntroduction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRIntroductionAccess().getIntroductionKeyword_2()); }
	'</Introduction>'
	{ after(grammarAccess.getVSVRIntroductionAccess().getIntroductionKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRApplicableDocuments__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRApplicableDocuments__Group__0__Impl
	rule__VSVRApplicableDocuments__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRApplicableDocuments__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRApplicableDocumentsAccess().getVSVRApplicableDocumentsAction_0()); }
	()
	{ after(grammarAccess.getVSVRApplicableDocumentsAccess().getVSVRApplicableDocumentsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRApplicableDocuments__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRApplicableDocuments__Group__1__Impl
	rule__VSVRApplicableDocuments__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRApplicableDocuments__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsKeyword_1()); }
	'<ApplicableDocuments>'
	{ after(grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRApplicableDocuments__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRApplicableDocuments__Group__2__Impl
	rule__VSVRApplicableDocuments__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRApplicableDocuments__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsAssignment_2()); }
	(rule__VSVRApplicableDocuments__ApplicableDocumentsAssignment_2)*
	{ after(grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRApplicableDocuments__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRApplicableDocuments__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRApplicableDocuments__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsKeyword_3()); }
	'</ApplicableDocuments>'
	{ after(grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRReferenceDocuments__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRReferenceDocuments__Group__0__Impl
	rule__VSVRReferenceDocuments__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRReferenceDocuments__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRReferenceDocumentsAccess().getVSVRReferenceDocumentsAction_0()); }
	()
	{ after(grammarAccess.getVSVRReferenceDocumentsAccess().getVSVRReferenceDocumentsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRReferenceDocuments__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRReferenceDocuments__Group__1__Impl
	rule__VSVRReferenceDocuments__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRReferenceDocuments__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsKeyword_1()); }
	'<ReferenceDocuments>'
	{ after(grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRReferenceDocuments__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRReferenceDocuments__Group__2__Impl
	rule__VSVRReferenceDocuments__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRReferenceDocuments__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsAssignment_2()); }
	(rule__VSVRReferenceDocuments__ReferenceDocumentsAssignment_2)*
	{ after(grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRReferenceDocuments__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRReferenceDocuments__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRReferenceDocuments__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsKeyword_3()); }
	'</ReferenceDocuments>'
	{ after(grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRTermsDefinitionsAbbreviations__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTermsDefinitionsAbbreviations__Group__0__Impl
	rule__VSVRTermsDefinitionsAbbreviations__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getVSVRTermsDefinitionsAbbreviationsAction_0()); }
	()
	{ after(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getVSVRTermsDefinitionsAbbreviationsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTermsDefinitionsAbbreviations__Group__1__Impl
	rule__VSVRTermsDefinitionsAbbreviations__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1()); }
	'<TermsDefinitionsAbbreviations>'
	{ after(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTermsDefinitionsAbbreviations__Group__2__Impl
	rule__VSVRTermsDefinitionsAbbreviations__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2()); }
	(rule__VSVRTermsDefinitionsAbbreviations__TermsAssignment_2)*
	{ after(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTermsDefinitionsAbbreviations__Group__3__Impl
	rule__VSVRTermsDefinitionsAbbreviations__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3()); }
	(rule__VSVRTermsDefinitionsAbbreviations__DefinitionsAssignment_3)*
	{ after(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTermsDefinitionsAbbreviations__Group__4__Impl
	rule__VSVRTermsDefinitionsAbbreviations__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4()); }
	(rule__VSVRTermsDefinitionsAbbreviations__AbbreviationsAssignment_4)*
	{ after(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTermsDefinitionsAbbreviations__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5()); }
	'</TermsDefinitionsAbbreviations>'
	{ after(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTerm__Group__0__Impl
	rule__VSVRTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermAccess().getTermKeyword_0()); }
	'<Term'
	{ after(grammarAccess.getVSVRTermAccess().getTermKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTerm__Group__1__Impl
	rule__VSVRTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVRTermAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTerm__Group__2__Impl
	rule__VSVRTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermAccess().getNameAssignment_2()); }
	(rule__VSVRTerm__NameAssignment_2)
	{ after(grammarAccess.getVSVRTermAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTerm__Group__3__Impl
	rule__VSVRTerm__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVRTermAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTerm__Group__4__Impl
	rule__VSVRTerm__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermAccess().getDescriptionAssignment_4()); }
	(rule__VSVRTerm__DescriptionAssignment_4)
	{ after(grammarAccess.getVSVRTermAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRTerm__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRTermAccess().getTermKeyword_5()); }
	'</Term>'
	{ after(grammarAccess.getVSVRTermAccess().getTermKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDefinition__Group__0__Impl
	rule__VSVRDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDefinitionAccess().getDefinitionKeyword_0()); }
	'<Definition'
	{ after(grammarAccess.getVSVRDefinitionAccess().getDefinitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDefinition__Group__1__Impl
	rule__VSVRDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDefinitionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVRDefinitionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDefinition__Group__2__Impl
	rule__VSVRDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDefinitionAccess().getNameAssignment_2()); }
	(rule__VSVRDefinition__NameAssignment_2)
	{ after(grammarAccess.getVSVRDefinitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDefinition__Group__3__Impl
	rule__VSVRDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDefinitionAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVRDefinitionAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDefinition__Group__4__Impl
	rule__VSVRDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDefinitionAccess().getDescriptionAssignment_4()); }
	(rule__VSVRDefinition__DescriptionAssignment_4)
	{ after(grammarAccess.getVSVRDefinitionAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRDefinitionAccess().getDefinitionKeyword_5()); }
	'</Definition>'
	{ after(grammarAccess.getVSVRDefinitionAccess().getDefinitionKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRAbbreviation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRAbbreviation__Group__0__Impl
	rule__VSVRAbbreviation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRAbbreviationAccess().getAbbreviationKeyword_0()); }
	'<Abbreviation'
	{ after(grammarAccess.getVSVRAbbreviationAccess().getAbbreviationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRAbbreviation__Group__1__Impl
	rule__VSVRAbbreviation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRAbbreviationAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVRAbbreviationAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRAbbreviation__Group__2__Impl
	rule__VSVRAbbreviation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRAbbreviationAccess().getNameAssignment_2()); }
	(rule__VSVRAbbreviation__NameAssignment_2)
	{ after(grammarAccess.getVSVRAbbreviationAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRAbbreviation__Group__3__Impl
	rule__VSVRAbbreviation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRAbbreviationAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVRAbbreviationAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRAbbreviation__Group__4__Impl
	rule__VSVRAbbreviation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRAbbreviationAccess().getDescriptionAssignment_4()); }
	(rule__VSVRAbbreviation__DescriptionAssignment_4)
	{ after(grammarAccess.getVSVRAbbreviationAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRAbbreviation__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRAbbreviationAccess().getAbbreviationKeyword_5()); }
	'</Abbreviation>'
	{ after(grammarAccess.getVSVRAbbreviationAccess().getAbbreviationKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRSWValProcessVerification__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRSWValProcessVerification__Group__0__Impl
	rule__VSVRSWValProcessVerification__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getVSVRSWValProcessVerificationAction_0()); }
	()
	{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getVSVRSWValProcessVerificationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRSWValProcessVerification__Group__1__Impl
	rule__VSVRSWValProcessVerification__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getSWValProcessVerificationKeyword_1()); }
	'<SWValProcessVerification>'
	{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getSWValProcessVerificationKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRSWValProcessVerification__Group__2__Impl
	rule__VSVRSWValProcessVerification__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getBodyAssignment_2()); }
	(rule__VSVRSWValProcessVerification__BodyAssignment_2)?
	{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getBodyAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRSWValProcessVerification__Group__3__Impl
	rule__VSVRSWValProcessVerification__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityKeyword_3()); }
	'<Traceability>'
	{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRSWValProcessVerification__Group__4__Impl
	rule__VSVRSWValProcessVerification__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityAssignment_4()); }
	(rule__VSVRSWValProcessVerification__TraceabilityAssignment_4)
	{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRSWValProcessVerification__Group__5__Impl
	rule__VSVRSWValProcessVerification__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityKeyword_5()); }
	'</Traceability>'
	{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRSWValProcessVerification__Group__6__Impl
	rule__VSVRSWValProcessVerification__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityKeyword_6()); }
	'<Feasibility>'
	{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRSWValProcessVerification__Group__7__Impl
	rule__VSVRSWValProcessVerification__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityAssignment_7()); }
	(rule__VSVRSWValProcessVerification__FeasibilityAssignment_7)
	{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRSWValProcessVerification__Group__8__Impl
	rule__VSVRSWValProcessVerification__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityKeyword_8()); }
	'</Feasibility>'
	{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVRSWValProcessVerification__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getSWValProcessVerificationKeyword_9()); }
	'</SWValProcessVerification>'
	{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getSWValProcessVerificationKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVRDocument__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVRDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getIdSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVRDocumentAccess().getIdSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__IssueAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVSVRDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__RevisionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVSVRDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__DateAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getDateSTRINGTerminalRuleCall_10_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVRDocumentAccess().getDateSTRINGTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__SvsParentAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getSvsParentVSVSDocumentCrossReference_14_0()); }
		(
			{ before(grammarAccess.getVSVRDocumentAccess().getSvsParentVSVSDocumentSTRINGTerminalRuleCall_14_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVRDocumentAccess().getSvsParentVSVSDocumentSTRINGTerminalRuleCall_14_0_1()); }
		)
		{ after(grammarAccess.getVSVRDocumentAccess().getSvsParentVSVSDocumentCrossReference_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__TcrParentAssignment_16_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getTcrParentVTCRTestCampaignReportCrossReference_16_2_0()); }
		(
			{ before(grammarAccess.getVSVRDocumentAccess().getTcrParentVTCRTestCampaignReportSTRINGTerminalRuleCall_16_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVRDocumentAccess().getTcrParentVTCRTestCampaignReportSTRINGTerminalRuleCall_16_2_0_1()); }
		)
		{ after(grammarAccess.getVSVRDocumentAccess().getTcrParentVTCRTestCampaignReportCrossReference_16_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__TbcsTbdsSectionAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getTbcsTbdsSectionVSVRTBCsTBDsParserRuleCall_17_0()); }
		ruleVSVRTBCsTBDs
		{ after(grammarAccess.getVSVRDocumentAccess().getTbcsTbdsSectionVSVRTBCsTBDsParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__IntroductionSectionAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getIntroductionSectionVSVRIntroductionParserRuleCall_18_0()); }
		ruleVSVRIntroduction
		{ after(grammarAccess.getVSVRDocumentAccess().getIntroductionSectionVSVRIntroductionParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__ApplicableDocumentsSectionAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getApplicableDocumentsSectionVSVRApplicableDocumentsParserRuleCall_19_0()); }
		ruleVSVRApplicableDocuments
		{ after(grammarAccess.getVSVRDocumentAccess().getApplicableDocumentsSectionVSVRApplicableDocumentsParserRuleCall_19_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__ReferenceDocumentsSectionAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getReferenceDocumentsSectionVSVRReferenceDocumentsParserRuleCall_20_0()); }
		ruleVSVRReferenceDocuments
		{ after(grammarAccess.getVSVRDocumentAccess().getReferenceDocumentsSectionVSVRReferenceDocumentsParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__TermsDefinitionsAbbreviationsSectionAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSVRTermsDefinitionsAbbreviationsParserRuleCall_21_0()); }
		ruleVSVRTermsDefinitionsAbbreviations
		{ after(grammarAccess.getVSVRDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSVRTermsDefinitionsAbbreviationsParserRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDocument__SwValProcessVerificationSectionAssignment_22
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDocumentAccess().getSwValProcessVerificationSectionVSVRSWValProcessVerificationParserRuleCall_22_0()); }
		ruleVSVRSWValProcessVerification
		{ after(grammarAccess.getVSVRDocumentAccess().getSwValProcessVerificationSectionVSVRSWValProcessVerificationParserRuleCall_22_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTBCsTBDs__TbcsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRTBCsTBDsAccess().getTbcsDTBCParserRuleCall_2_0()); }
		ruleDTBC
		{ after(grammarAccess.getVSVRTBCsTBDsAccess().getTbcsDTBCParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTBCsTBDs__TbdsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRTBCsTBDsAccess().getTbdsDTBDParserRuleCall_3_0()); }
		ruleDTBD
		{ after(grammarAccess.getVSVRTBCsTBDsAccess().getTbdsDTBDParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTBCAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getDTBCAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__DescriptionAssignment_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTBCAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDTBCAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__ParentTBCAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTBCAccess().getParentTBCDTBCCrossReference_3_1_1_0()); }
		(
			{ before(grammarAccess.getDTBCAccess().getParentTBCDTBCSTRINGTerminalRuleCall_3_1_1_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getDTBCAccess().getParentTBCDTBCSTRINGTerminalRuleCall_3_1_1_0_1()); }
		)
		{ after(grammarAccess.getDTBCAccess().getParentTBCDTBCCrossReference_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTBDAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getDTBDAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__DescriptionAssignment_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTBDAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDTBDAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__ParentTBDAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTBDAccess().getParentTBDDTBDCrossReference_3_1_1_0()); }
		(
			{ before(grammarAccess.getDTBDAccess().getParentTBDDTBDSTRINGTerminalRuleCall_3_1_1_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getDTBDAccess().getParentTBDDTBDSTRINGTerminalRuleCall_3_1_1_0_1()); }
		)
		{ after(grammarAccess.getDTBDAccess().getParentTBDDTBDCrossReference_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody__BodyContentAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBodyAccess().getBodyContentDBodyContentParserRuleCall_1_0()); }
		ruleDBodyContent
		{ after(grammarAccess.getDBodyAccess().getBodyContentDBodyContentParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__NameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDParagraphAccess().getNameSTRINGTerminalRuleCall_1_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDParagraphAccess().getNameSTRINGTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__AlignmentAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDParagraphAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0()); }
		ruleDAlignment
		{ after(grammarAccess.getDParagraphAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__StyleAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDParagraphAccess().getStyleSTRINGTerminalRuleCall_3_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDParagraphAccess().getStyleSTRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__IndentAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDParagraphAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0()); }
		RULE_REAL_STRING
		{ after(grammarAccess.getDParagraphAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__ParagraphContentAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_6_0()); }
		ruleDParagraphContent
		{ after(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__ParagraphAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_2_0()); }
		ruleDParagraph
		{ after(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__SublistAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_3_1_0()); }
		ruleDListContent
		{ after(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__NameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDItemizeAccess().getNameSTRINGTerminalRuleCall_1_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDItemizeAccess().getNameSTRINGTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__AlignmentAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDItemizeAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0()); }
		ruleDAlignment
		{ after(grammarAccess.getDItemizeAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__StyleAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDItemizeAccess().getStyleSTRINGTerminalRuleCall_3_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDItemizeAccess().getStyleSTRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__IndentAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDItemizeAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0()); }
		RULE_REAL_STRING
		{ after(grammarAccess.getDItemizeAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__ItemsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_6_0()); }
		ruleDListItem
		{ after(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__NameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDEnumerateAccess().getNameSTRINGTerminalRuleCall_1_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDEnumerateAccess().getNameSTRINGTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__AlignmentAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDEnumerateAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0()); }
		ruleDAlignment
		{ after(grammarAccess.getDEnumerateAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__StyleAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDEnumerateAccess().getStyleSTRINGTerminalRuleCall_3_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDEnumerateAccess().getStyleSTRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__IndentAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDEnumerateAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0()); }
		RULE_REAL_STRING
		{ after(grammarAccess.getDEnumerateAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__ItemsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_6_0()); }
		ruleDListItem
		{ after(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_6_0()); }
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

rule__DRun__TabAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getTabDTabParserRuleCall_6_0()); }
		ruleDTab
		{ after(grammarAccess.getDRunAccess().getTabDTabParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__TextAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_7_0()); }
		ruleDText
		{ after(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__ReferenceAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectCrossReference_2_0()); }
		(
			{ before(grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectSTRINGTerminalRuleCall_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectSTRINGTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__RunAssignment_3_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_3_0_1_0()); }
		ruleDRun
		{ after(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_3_0_1_0()); }
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

rule__DFigureFromFile__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureFromFileAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getDFigureFromFileAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__ReferenceFileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureFromFileAccess().getReferenceFileSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getDFigureFromFileAccess().getReferenceFileSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__WidthAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureFromFileAccess().getWidthUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDFigureFromFileAccess().getWidthUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__HeightAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureFromFileAccess().getHeightUINT_STRINGTerminalRuleCall_8_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDFigureFromFileAccess().getHeightUINT_STRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__AlignmentAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0()); }
		ruleDAlignment
		{ after(grammarAccess.getDFigureFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__StyleAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureFromFileAccess().getStyleSTRINGTerminalRuleCall_10_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDFigureFromFileAccess().getStyleSTRINGTerminalRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__IndentAssignment_11_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureFromFileAccess().getIndentREAL_STRINGTerminalRuleCall_11_1_0()); }
		RULE_REAL_STRING
		{ after(grammarAccess.getDFigureFromFileAccess().getIndentREAL_STRINGTerminalRuleCall_11_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__CaptionAssignment_12_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureFromFileAccess().getCaptionSTRINGTerminalRuleCall_12_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDFigureFromFileAccess().getCaptionSTRINGTerminalRuleCall_12_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTableFromFileAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getDTableFromFileAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__ReferenceFileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTableFromFileAccess().getReferenceFileSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getDTableFromFileAccess().getReferenceFileSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__WidthAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTableFromFileAccess().getWidthUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDTableFromFileAccess().getWidthUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__HeightAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTableFromFileAccess().getHeightUINT_STRINGTerminalRuleCall_8_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDTableFromFileAccess().getHeightUINT_STRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__AlignmentAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTableFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0()); }
		ruleDAlignment
		{ after(grammarAccess.getDTableFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__StyleAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTableFromFileAccess().getStyleSTRINGTerminalRuleCall_10_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDTableFromFileAccess().getStyleSTRINGTerminalRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__IndentAssignment_11_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTableFromFileAccess().getIndentREAL_STRINGTerminalRuleCall_11_1_0()); }
		RULE_REAL_STRING
		{ after(grammarAccess.getDTableFromFileAccess().getIndentREAL_STRINGTerminalRuleCall_11_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__CaptionAssignment_12_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTableFromFileAccess().getCaptionSTRINGTerminalRuleCall_12_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDTableFromFileAccess().getCaptionSTRINGTerminalRuleCall_12_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBasicTableAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getDBasicTableAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__WidthAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBasicTableAccess().getWidthUINT_STRINGTerminalRuleCall_3_1_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDBasicTableAccess().getWidthUINT_STRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__AlignmentAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBasicTableAccess().getAlignmentDAlignmentEnumRuleCall_4_1_0()); }
		ruleDAlignment
		{ after(grammarAccess.getDBasicTableAccess().getAlignmentDAlignmentEnumRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__StyleAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBasicTableAccess().getStyleSTRINGTerminalRuleCall_5_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDBasicTableAccess().getStyleSTRINGTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__IndentAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBasicTableAccess().getIndentREAL_STRINGTerminalRuleCall_6_1_0()); }
		RULE_REAL_STRING
		{ after(grammarAccess.getDBasicTableAccess().getIndentREAL_STRINGTerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__CaptionAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBasicTableAccess().getCaptionSTRINGTerminalRuleCall_7_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDBasicTableAccess().getCaptionSTRINGTerminalRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__RowsAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_9_0()); }
		ruleDRow
		{ after(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__CellsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRowAccess().getCellsDCellParserRuleCall_1_0()); }
		ruleDCell
		{ after(grammarAccess.getDRowAccess().getCellsDCellParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__ColSpanAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDCellAccess().getColSpanUINT_STRINGTerminalRuleCall_1_1_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDCellAccess().getColSpanUINT_STRINGTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__RowSpanAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDCellAccess().getRowSpanUINT_STRINGTerminalRuleCall_2_1_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDCellAccess().getRowSpanUINT_STRINGTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__WidthAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDCellAccess().getWidthUINT_STRINGTerminalRuleCall_3_1_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDCellAccess().getWidthUINT_STRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__ShadowAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDCellAccess().getShadowSTRINGTerminalRuleCall_4_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDCellAccess().getShadowSTRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__BodyContentAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_6_0()); }
		ruleDBodyContent
		{ after(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getDApplicableDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__TitleAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getTitleSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getDApplicableDocumentAccess().getTitleSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__IdAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getIdSTRINGTerminalRuleCall_6_0()); }
		RULE_STRING
		{ after(grammarAccess.getDApplicableDocumentAccess().getIdSTRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__IssueAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_7_1_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDApplicableDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__RevisionAssignment_7_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__DateAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getDateSTRINGTerminalRuleCall_8_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDApplicableDocumentAccess().getDateSTRINGTerminalRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__UrlAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getUrlSTRINGTerminalRuleCall_9_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDApplicableDocumentAccess().getUrlSTRINGTerminalRuleCall_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getDReferenceDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__TitleAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getTitleSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getDReferenceDocumentAccess().getTitleSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__IdAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getIdSTRINGTerminalRuleCall_6_0()); }
		RULE_STRING
		{ after(grammarAccess.getDReferenceDocumentAccess().getIdSTRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__IssueAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_7_1_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDReferenceDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__RevisionAssignment_7_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__DateAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getDateSTRINGTerminalRuleCall_8_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDReferenceDocumentAccess().getDateSTRINGTerminalRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__UrlAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getUrlSTRINGTerminalRuleCall_9_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDReferenceDocumentAccess().getUrlSTRINGTerminalRuleCall_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRFixedSection__BodyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRFixedSectionAccess().getBodyDBodyParserRuleCall_1_0()); }
		ruleDBody
		{ after(grammarAccess.getVSVRFixedSectionAccess().getBodyDBodyParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRFixedSection__SvrInstatiableSubsectionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRFixedSectionAccess().getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_2_0()); }
		ruleVSVRInstantiableSection
		{ after(grammarAccess.getVSVRFixedSectionAccess().getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRInstantiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVRInstantiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__BodyAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRInstantiableSectionAccess().getBodyDBodyParserRuleCall_4_0()); }
		ruleDBody
		{ after(grammarAccess.getVSVRInstantiableSectionAccess().getBodyDBodyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRInstantiableSection__SvrInstatiableSubsectionsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRInstantiableSectionAccess().getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_5_0()); }
		ruleVSVRInstantiableSection
		{ after(grammarAccess.getVSVRInstantiableSectionAccess().getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRIntroduction__SvrInstatiableSubsectionsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRIntroductionAccess().getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_1_0()); }
		ruleVSVRInstantiableSection
		{ after(grammarAccess.getVSVRIntroductionAccess().getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRApplicableDocuments__ApplicableDocumentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0()); }
		ruleDApplicableDocument
		{ after(grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRReferenceDocuments__ReferenceDocumentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0()); }
		ruleDReferenceDocument
		{ after(grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__TermsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsVSVRTermParserRuleCall_2_0()); }
		ruleVSVRTerm
		{ after(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsVSVRTermParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__DefinitionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getDefinitionsVSVRDefinitionParserRuleCall_3_0()); }
		ruleVSVRDefinition
		{ after(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getDefinitionsVSVRDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTermsDefinitionsAbbreviations__AbbreviationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSVRAbbreviationParserRuleCall_4_0()); }
		ruleVSVRAbbreviation
		{ after(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSVRAbbreviationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRTermAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVRTermAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRTerm__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRTermAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSVRTermAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVRDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRDefinition__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRDefinitionAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSVRDefinitionAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVRAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRAbbreviation__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSVRAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__BodyAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getBodyDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getBodyDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__TraceabilityAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityVSVRFixedSectionParserRuleCall_4_0()); }
		ruleVSVRFixedSection
		{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityVSVRFixedSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVRSWValProcessVerification__FeasibilityAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityVSVRFixedSectionParserRuleCall_7_0()); }
		ruleVSVRFixedSection
		{ after(grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityVSVRFixedSectionParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

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
