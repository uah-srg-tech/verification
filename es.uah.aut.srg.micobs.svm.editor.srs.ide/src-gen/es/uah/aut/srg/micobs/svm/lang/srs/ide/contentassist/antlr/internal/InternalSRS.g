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
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.srs.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.srs.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.micobs.svm.lang.srs.services.SRSGrammarAccess;

}
@parser::members {
	private SRSGrammarAccess grammarAccess;

	public void setGrammarAccess(SRSGrammarAccess grammarAccess) {
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

// Entry rule entryRuleVSRSDocument
entryRuleVSRSDocument
:
{ before(grammarAccess.getVSRSDocumentRule()); }
	 ruleVSRSDocument
{ after(grammarAccess.getVSRSDocumentRule()); } 
	 EOF 
;

// Rule VSRSDocument
ruleVSRSDocument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getGroup()); }
		(rule__VSRSDocument__Group__0)
		{ after(grammarAccess.getVSRSDocumentAccess().getGroup()); }
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

// Entry rule entryRuleVSRSFixedSection
entryRuleVSRSFixedSection
:
{ before(grammarAccess.getVSRSFixedSectionRule()); }
	 ruleVSRSFixedSection
{ after(grammarAccess.getVSRSFixedSectionRule()); } 
	 EOF 
;

// Rule VSRSFixedSection
ruleVSRSFixedSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSFixedSectionAccess().getGroup()); }
		(rule__VSRSFixedSection__Group__0)
		{ after(grammarAccess.getVSRSFixedSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSInstantiableSection
entryRuleVSRSInstantiableSection
:
{ before(grammarAccess.getVSRSInstantiableSectionRule()); }
	 ruleVSRSInstantiableSection
{ after(grammarAccess.getVSRSInstantiableSectionRule()); } 
	 EOF 
;

// Rule VSRSInstantiableSection
ruleVSRSInstantiableSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSInstantiableSectionAccess().getGroup()); }
		(rule__VSRSInstantiableSection__Group__0)
		{ after(grammarAccess.getVSRSInstantiableSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSIntroduction
entryRuleVSRSIntroduction
:
{ before(grammarAccess.getVSRSIntroductionRule()); }
	 ruleVSRSIntroduction
{ after(grammarAccess.getVSRSIntroductionRule()); } 
	 EOF 
;

// Rule VSRSIntroduction
ruleVSRSIntroduction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSIntroductionAccess().getGroup()); }
		(rule__VSRSIntroduction__Group__0)
		{ after(grammarAccess.getVSRSIntroductionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSApplicableDocuments
entryRuleVSRSApplicableDocuments
:
{ before(grammarAccess.getVSRSApplicableDocumentsRule()); }
	 ruleVSRSApplicableDocuments
{ after(grammarAccess.getVSRSApplicableDocumentsRule()); } 
	 EOF 
;

// Rule VSRSApplicableDocuments
ruleVSRSApplicableDocuments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSApplicableDocumentsAccess().getGroup()); }
		(rule__VSRSApplicableDocuments__Group__0)
		{ after(grammarAccess.getVSRSApplicableDocumentsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSReferenceDocuments
entryRuleVSRSReferenceDocuments
:
{ before(grammarAccess.getVSRSReferenceDocumentsRule()); }
	 ruleVSRSReferenceDocuments
{ after(grammarAccess.getVSRSReferenceDocumentsRule()); } 
	 EOF 
;

// Rule VSRSReferenceDocuments
ruleVSRSReferenceDocuments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSReferenceDocumentsAccess().getGroup()); }
		(rule__VSRSReferenceDocuments__Group__0)
		{ after(grammarAccess.getVSRSReferenceDocumentsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSTermsDefinitionsAbbreviations
entryRuleVSRSTermsDefinitionsAbbreviations
:
{ before(grammarAccess.getVSRSTermsDefinitionsAbbreviationsRule()); }
	 ruleVSRSTermsDefinitionsAbbreviations
{ after(grammarAccess.getVSRSTermsDefinitionsAbbreviationsRule()); } 
	 EOF 
;

// Rule VSRSTermsDefinitionsAbbreviations
ruleVSRSTermsDefinitionsAbbreviations 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getGroup()); }
		(rule__VSRSTermsDefinitionsAbbreviations__Group__0)
		{ after(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSSoftwareOverview
entryRuleVSRSSoftwareOverview
:
{ before(grammarAccess.getVSRSSoftwareOverviewRule()); }
	 ruleVSRSSoftwareOverview
{ after(grammarAccess.getVSRSSoftwareOverviewRule()); } 
	 EOF 
;

// Rule VSRSSoftwareOverview
ruleVSRSSoftwareOverview 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getGroup()); }
		(rule__VSRSSoftwareOverview__Group__0)
		{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSRequirements
entryRuleVSRSRequirements
:
{ before(grammarAccess.getVSRSRequirementsRule()); }
	 ruleVSRSRequirements
{ after(grammarAccess.getVSRSRequirementsRule()); } 
	 EOF 
;

// Rule VSRSRequirements
ruleVSRSRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getGroup()); }
		(rule__VSRSRequirements__Group__0)
		{ after(grammarAccess.getVSRSRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSLogicalModels
entryRuleVSRSLogicalModels
:
{ before(grammarAccess.getVSRSLogicalModelsRule()); }
	 ruleVSRSLogicalModels
{ after(grammarAccess.getVSRSLogicalModelsRule()); } 
	 EOF 
;

// Rule VSRSLogicalModels
ruleVSRSLogicalModels 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSLogicalModelsAccess().getGroup()); }
		(rule__VSRSLogicalModels__Group__0)
		{ after(grammarAccess.getVSRSLogicalModelsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSTerm
entryRuleVSRSTerm
:
{ before(grammarAccess.getVSRSTermRule()); }
	 ruleVSRSTerm
{ after(grammarAccess.getVSRSTermRule()); } 
	 EOF 
;

// Rule VSRSTerm
ruleVSRSTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSTermAccess().getGroup()); }
		(rule__VSRSTerm__Group__0)
		{ after(grammarAccess.getVSRSTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSDefinition
entryRuleVSRSDefinition
:
{ before(grammarAccess.getVSRSDefinitionRule()); }
	 ruleVSRSDefinition
{ after(grammarAccess.getVSRSDefinitionRule()); } 
	 EOF 
;

// Rule VSRSDefinition
ruleVSRSDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSDefinitionAccess().getGroup()); }
		(rule__VSRSDefinition__Group__0)
		{ after(grammarAccess.getVSRSDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSAbbreviation
entryRuleVSRSAbbreviation
:
{ before(grammarAccess.getVSRSAbbreviationRule()); }
	 ruleVSRSAbbreviation
{ after(grammarAccess.getVSRSAbbreviationRule()); } 
	 EOF 
;

// Rule VSRSAbbreviation
ruleVSRSAbbreviation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSAbbreviationAccess().getGroup()); }
		(rule__VSRSAbbreviation__Group__0)
		{ after(grammarAccess.getVSRSAbbreviationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSInstantiableRequirementSection
entryRuleVSRSInstantiableRequirementSection
:
{ before(grammarAccess.getVSRSInstantiableRequirementSectionRule()); }
	 ruleVSRSInstantiableRequirementSection
{ after(grammarAccess.getVSRSInstantiableRequirementSectionRule()); } 
	 EOF 
;

// Rule VSRSInstantiableRequirementSection
ruleVSRSInstantiableRequirementSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getGroup()); }
		(rule__VSRSInstantiableRequirementSection__Group__0)
		{ after(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSGeneralRequirements
entryRuleVSRSGeneralRequirements
:
{ before(grammarAccess.getVSRSGeneralRequirementsRule()); }
	 ruleVSRSGeneralRequirements
{ after(grammarAccess.getVSRSGeneralRequirementsRule()); } 
	 EOF 
;

// Rule VSRSGeneralRequirements
ruleVSRSGeneralRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSGeneralRequirementsAccess().getGroup()); }
		(rule__VSRSGeneralRequirements__Group__0)
		{ after(grammarAccess.getVSRSGeneralRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSFunctionalRequirements
entryRuleVSRSFunctionalRequirements
:
{ before(grammarAccess.getVSRSFunctionalRequirementsRule()); }
	 ruleVSRSFunctionalRequirements
{ after(grammarAccess.getVSRSFunctionalRequirementsRule()); } 
	 EOF 
;

// Rule VSRSFunctionalRequirements
ruleVSRSFunctionalRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSFunctionalRequirementsAccess().getGroup()); }
		(rule__VSRSFunctionalRequirements__Group__0)
		{ after(grammarAccess.getVSRSFunctionalRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSPerformanceRequirements
entryRuleVSRSPerformanceRequirements
:
{ before(grammarAccess.getVSRSPerformanceRequirementsRule()); }
	 ruleVSRSPerformanceRequirements
{ after(grammarAccess.getVSRSPerformanceRequirementsRule()); } 
	 EOF 
;

// Rule VSRSPerformanceRequirements
ruleVSRSPerformanceRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSPerformanceRequirementsAccess().getGroup()); }
		(rule__VSRSPerformanceRequirements__Group__0)
		{ after(grammarAccess.getVSRSPerformanceRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSInterfaceRequirements
entryRuleVSRSInterfaceRequirements
:
{ before(grammarAccess.getVSRSInterfaceRequirementsRule()); }
	 ruleVSRSInterfaceRequirements
{ after(grammarAccess.getVSRSInterfaceRequirementsRule()); } 
	 EOF 
;

// Rule VSRSInterfaceRequirements
ruleVSRSInterfaceRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSInterfaceRequirementsAccess().getGroup()); }
		(rule__VSRSInterfaceRequirements__Group__0)
		{ after(grammarAccess.getVSRSInterfaceRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSOperationalRequirements
entryRuleVSRSOperationalRequirements
:
{ before(grammarAccess.getVSRSOperationalRequirementsRule()); }
	 ruleVSRSOperationalRequirements
{ after(grammarAccess.getVSRSOperationalRequirementsRule()); } 
	 EOF 
;

// Rule VSRSOperationalRequirements
ruleVSRSOperationalRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSOperationalRequirementsAccess().getGroup()); }
		(rule__VSRSOperationalRequirements__Group__0)
		{ after(grammarAccess.getVSRSOperationalRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSResourcesRequirements
entryRuleVSRSResourcesRequirements
:
{ before(grammarAccess.getVSRSResourcesRequirementsRule()); }
	 ruleVSRSResourcesRequirements
{ after(grammarAccess.getVSRSResourcesRequirementsRule()); } 
	 EOF 
;

// Rule VSRSResourcesRequirements
ruleVSRSResourcesRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSResourcesRequirementsAccess().getGroup()); }
		(rule__VSRSResourcesRequirements__Group__0)
		{ after(grammarAccess.getVSRSResourcesRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSDesignRequirements
entryRuleVSRSDesignRequirements
:
{ before(grammarAccess.getVSRSDesignRequirementsRule()); }
	 ruleVSRSDesignRequirements
{ after(grammarAccess.getVSRSDesignRequirementsRule()); } 
	 EOF 
;

// Rule VSRSDesignRequirements
ruleVSRSDesignRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSDesignRequirementsAccess().getGroup()); }
		(rule__VSRSDesignRequirements__Group__0)
		{ after(grammarAccess.getVSRSDesignRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSSecurityPrivacyRequirements
entryRuleVSRSSecurityPrivacyRequirements
:
{ before(grammarAccess.getVSRSSecurityPrivacyRequirementsRule()); }
	 ruleVSRSSecurityPrivacyRequirements
{ after(grammarAccess.getVSRSSecurityPrivacyRequirementsRule()); } 
	 EOF 
;

// Rule VSRSSecurityPrivacyRequirements
ruleVSRSSecurityPrivacyRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getGroup()); }
		(rule__VSRSSecurityPrivacyRequirements__Group__0)
		{ after(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSPortabilityRequirements
entryRuleVSRSPortabilityRequirements
:
{ before(grammarAccess.getVSRSPortabilityRequirementsRule()); }
	 ruleVSRSPortabilityRequirements
{ after(grammarAccess.getVSRSPortabilityRequirementsRule()); } 
	 EOF 
;

// Rule VSRSPortabilityRequirements
ruleVSRSPortabilityRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSPortabilityRequirementsAccess().getGroup()); }
		(rule__VSRSPortabilityRequirements__Group__0)
		{ after(grammarAccess.getVSRSPortabilityRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSSWQualityRequirements
entryRuleVSRSSWQualityRequirements
:
{ before(grammarAccess.getVSRSSWQualityRequirementsRule()); }
	 ruleVSRSSWQualityRequirements
{ after(grammarAccess.getVSRSSWQualityRequirementsRule()); } 
	 EOF 
;

// Rule VSRSSWQualityRequirements
ruleVSRSSWQualityRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSSWQualityRequirementsAccess().getGroup()); }
		(rule__VSRSSWQualityRequirements__Group__0)
		{ after(grammarAccess.getVSRSSWQualityRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSSWReliabiltyRequirements
entryRuleVSRSSWReliabiltyRequirements
:
{ before(grammarAccess.getVSRSSWReliabiltyRequirementsRule()); }
	 ruleVSRSSWReliabiltyRequirements
{ after(grammarAccess.getVSRSSWReliabiltyRequirementsRule()); } 
	 EOF 
;

// Rule VSRSSWReliabiltyRequirements
ruleVSRSSWReliabiltyRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getGroup()); }
		(rule__VSRSSWReliabiltyRequirements__Group__0)
		{ after(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSSWMaintainabilityRequirements
entryRuleVSRSSWMaintainabilityRequirements
:
{ before(grammarAccess.getVSRSSWMaintainabilityRequirementsRule()); }
	 ruleVSRSSWMaintainabilityRequirements
{ after(grammarAccess.getVSRSSWMaintainabilityRequirementsRule()); } 
	 EOF 
;

// Rule VSRSSWMaintainabilityRequirements
ruleVSRSSWMaintainabilityRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getGroup()); }
		(rule__VSRSSWMaintainabilityRequirements__Group__0)
		{ after(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSSWSafetyRequirements
entryRuleVSRSSWSafetyRequirements
:
{ before(grammarAccess.getVSRSSWSafetyRequirementsRule()); }
	 ruleVSRSSWSafetyRequirements
{ after(grammarAccess.getVSRSSWSafetyRequirementsRule()); } 
	 EOF 
;

// Rule VSRSSWSafetyRequirements
ruleVSRSSWSafetyRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSSWSafetyRequirementsAccess().getGroup()); }
		(rule__VSRSSWSafetyRequirements__Group__0)
		{ after(grammarAccess.getVSRSSWSafetyRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSSWConfigurationDeliveryRequirements
entryRuleVSRSSWConfigurationDeliveryRequirements
:
{ before(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsRule()); }
	 ruleVSRSSWConfigurationDeliveryRequirements
{ after(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsRule()); } 
	 EOF 
;

// Rule VSRSSWConfigurationDeliveryRequirements
ruleVSRSSWConfigurationDeliveryRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getGroup()); }
		(rule__VSRSSWConfigurationDeliveryRequirements__Group__0)
		{ after(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSDataDefinitionDBRequirements
entryRuleVSRSDataDefinitionDBRequirements
:
{ before(grammarAccess.getVSRSDataDefinitionDBRequirementsRule()); }
	 ruleVSRSDataDefinitionDBRequirements
{ after(grammarAccess.getVSRSDataDefinitionDBRequirementsRule()); } 
	 EOF 
;

// Rule VSRSDataDefinitionDBRequirements
ruleVSRSDataDefinitionDBRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getGroup()); }
		(rule__VSRSDataDefinitionDBRequirements__Group__0)
		{ after(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSHumanFactorsRequirements
entryRuleVSRSHumanFactorsRequirements
:
{ before(grammarAccess.getVSRSHumanFactorsRequirementsRule()); }
	 ruleVSRSHumanFactorsRequirements
{ after(grammarAccess.getVSRSHumanFactorsRequirementsRule()); } 
	 EOF 
;

// Rule VSRSHumanFactorsRequirements
ruleVSRSHumanFactorsRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getGroup()); }
		(rule__VSRSHumanFactorsRequirements__Group__0)
		{ after(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSAdaptationInstallationRequirements
entryRuleVSRSAdaptationInstallationRequirements
:
{ before(grammarAccess.getVSRSAdaptationInstallationRequirementsRule()); }
	 ruleVSRSAdaptationInstallationRequirements
{ after(grammarAccess.getVSRSAdaptationInstallationRequirementsRule()); } 
	 EOF 
;

// Rule VSRSAdaptationInstallationRequirements
ruleVSRSAdaptationInstallationRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getGroup()); }
		(rule__VSRSAdaptationInstallationRequirements__Group__0)
		{ after(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSDocumentItem
entryRuleVSRSDocumentItem
:
{ before(grammarAccess.getVSRSDocumentItemRule()); }
	 ruleVSRSDocumentItem
{ after(grammarAccess.getVSRSDocumentItemRule()); } 
	 EOF 
;

// Rule VSRSDocumentItem
ruleVSRSDocumentItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSDocumentItemAccess().getGroup()); }
		(rule__VSRSDocumentItem__Group__0)
		{ after(grammarAccess.getVSRSDocumentItemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSRSLogicalModel
entryRuleVSRSLogicalModel
:
{ before(grammarAccess.getVSRSLogicalModelRule()); }
	 ruleVSRSLogicalModel
{ after(grammarAccess.getVSRSLogicalModelRule()); } 
	 EOF 
;

// Rule VSRSLogicalModel
ruleVSRSLogicalModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSRSLogicalModelAccess().getGroup()); }
		(rule__VSRSLogicalModel__Group__0)
		{ after(grammarAccess.getVSRSLogicalModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule DMergeType
ruleDMergeType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDMergeTypeAccess().getAlternatives()); }
		(rule__DMergeType__Alternatives)
		{ after(grammarAccess.getDMergeTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule VValidationMethod
ruleVValidationMethod
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVValidationMethodAccess().getAlternatives()); }
		(rule__VValidationMethod__Alternatives)
		{ after(grammarAccess.getVValidationMethodAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule VSRSDocumentItemModes
ruleVSRSDocumentItemModes
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentItemModesAccess().getAlternatives()); }
		(rule__VSRSDocumentItemModes__Alternatives)
		{ after(grammarAccess.getVSRSDocumentItemModesAccess().getAlternatives()); }
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

rule__DMergeType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDMergeTypeAccess().getRestartEnumLiteralDeclaration_0()); }
		('"restart"')
		{ after(grammarAccess.getDMergeTypeAccess().getRestartEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDMergeTypeAccess().getContinueEnumLiteralDeclaration_1()); }
		('"continue"')
		{ after(grammarAccess.getDMergeTypeAccess().getContinueEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VValidationMethod__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVValidationMethodAccess().getAnalysisEnumLiteralDeclaration_0()); }
		('"Analysis"')
		{ after(grammarAccess.getVValidationMethodAccess().getAnalysisEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVValidationMethodAccess().getInspectionEnumLiteralDeclaration_1()); }
		('"Inspection"')
		{ after(grammarAccess.getVValidationMethodAccess().getInspectionEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getVValidationMethodAccess().getTestingEnumLiteralDeclaration_2()); }
		('"Testing"')
		{ after(grammarAccess.getVValidationMethodAccess().getTestingEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getVValidationMethodAccess().getReviewEnumLiteralDeclaration_3()); }
		('"Review"')
		{ after(grammarAccess.getVValidationMethodAccess().getReviewEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getVValidationMethodAccess().getModelSimulationEnumLiteralDeclaration_4()); }
		('"ModelSimulation"')
		{ after(grammarAccess.getVValidationMethodAccess().getModelSimulationEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getVValidationMethodAccess().getWalkThroughEnumLiteralDeclaration_5()); }
		('"WalkThrough"')
		{ after(grammarAccess.getVValidationMethodAccess().getWalkThroughEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getVValidationMethodAccess().getCrossReadingEnumLiteralDeclaration_6()); }
		('"CrossReading"')
		{ after(grammarAccess.getVValidationMethodAccess().getCrossReadingEnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getVValidationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7()); }
		('"DeskChecking"')
		{ after(grammarAccess.getVValidationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItemModes__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentItemModesAccess().getOffEnumLiteralDeclaration_0()); }
		('"Off"')
		{ after(grammarAccess.getVSRSDocumentItemModesAccess().getOffEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVSRSDocumentItemModesAccess().getBootEnumLiteralDeclaration_1()); }
		('"Boot"')
		{ after(grammarAccess.getVSRSDocumentItemModesAccess().getBootEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getVSRSDocumentItemModesAccess().getSafeEnumLiteralDeclaration_2()); }
		('"Safe"')
		{ after(grammarAccess.getVSRSDocumentItemModesAccess().getSafeEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getVSRSDocumentItemModesAccess().getConfigurationEnumLiteralDeclaration_3()); }
		('"Configuration"')
		{ after(grammarAccess.getVSRSDocumentItemModesAccess().getConfigurationEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getVSRSDocumentItemModesAccess().getOperationalEnumLiteralDeclaration_4()); }
		('"Operational"')
		{ after(grammarAccess.getVSRSDocumentItemModesAccess().getOperationalEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__0__Impl
	rule__VSRSDocument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getSRSKeyword_0()); }
	'<SRS'
	{ after(grammarAccess.getVSRSDocumentAccess().getSRSKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__1__Impl
	rule__VSRSDocument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSRSDocumentAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__2__Impl
	rule__VSRSDocument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getNameAssignment_2()); }
	(rule__VSRSDocument__NameAssignment_2)
	{ after(grammarAccess.getVSRSDocumentAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__3__Impl
	rule__VSRSDocument__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getIdKeyword_3()); }
	'id='
	{ after(grammarAccess.getVSRSDocumentAccess().getIdKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__4__Impl
	rule__VSRSDocument__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getIdAssignment_4()); }
	(rule__VSRSDocument__IdAssignment_4)
	{ after(grammarAccess.getVSRSDocumentAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__5__Impl
	rule__VSRSDocument__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getIssueKeyword_5()); }
	'issue='
	{ after(grammarAccess.getVSRSDocumentAccess().getIssueKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__6__Impl
	rule__VSRSDocument__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getIssueAssignment_6()); }
	(rule__VSRSDocument__IssueAssignment_6)
	{ after(grammarAccess.getVSRSDocumentAccess().getIssueAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__7__Impl
	rule__VSRSDocument__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getRevisionKeyword_7()); }
	'revision='
	{ after(grammarAccess.getVSRSDocumentAccess().getRevisionKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__8__Impl
	rule__VSRSDocument__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getRevisionAssignment_8()); }
	(rule__VSRSDocument__RevisionAssignment_8)
	{ after(grammarAccess.getVSRSDocumentAccess().getRevisionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__9__Impl
	rule__VSRSDocument__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getDateKeyword_9()); }
	'date='
	{ after(grammarAccess.getVSRSDocumentAccess().getDateKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__10__Impl
	rule__VSRSDocument__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getDateAssignment_10()); }
	(rule__VSRSDocument__DateAssignment_10)
	{ after(grammarAccess.getVSRSDocumentAccess().getDateAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__11__Impl
	rule__VSRSDocument__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getGreaterThanSignKeyword_11()); }
	'>'
	{ after(grammarAccess.getVSRSDocumentAccess().getGreaterThanSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__12__Impl
	rule__VSRSDocument__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getGroup_12()); }
	(rule__VSRSDocument__Group_12__0)*
	{ after(grammarAccess.getVSRSDocumentAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__13__Impl
	rule__VSRSDocument__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getIntroductionSectionAssignment_13()); }
	(rule__VSRSDocument__IntroductionSectionAssignment_13)
	{ after(grammarAccess.getVSRSDocumentAccess().getIntroductionSectionAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__14__Impl
	rule__VSRSDocument__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getApplicableDocumentsSectionAssignment_14()); }
	(rule__VSRSDocument__ApplicableDocumentsSectionAssignment_14)
	{ after(grammarAccess.getVSRSDocumentAccess().getApplicableDocumentsSectionAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__15__Impl
	rule__VSRSDocument__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getReferenceDocumentsSectionAssignment_15()); }
	(rule__VSRSDocument__ReferenceDocumentsSectionAssignment_15)
	{ after(grammarAccess.getVSRSDocumentAccess().getReferenceDocumentsSectionAssignment_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__16__Impl
	rule__VSRSDocument__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_16()); }
	(rule__VSRSDocument__TermsDefinitionsAbbreviationsSectionAssignment_16)
	{ after(grammarAccess.getVSRSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__17__Impl
	rule__VSRSDocument__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getSoftwareOverviewSectionAssignment_17()); }
	(rule__VSRSDocument__SoftwareOverviewSectionAssignment_17)
	{ after(grammarAccess.getVSRSDocumentAccess().getSoftwareOverviewSectionAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__18__Impl
	rule__VSRSDocument__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getRequirementsSectionAssignment_18()); }
	(rule__VSRSDocument__RequirementsSectionAssignment_18)
	{ after(grammarAccess.getVSRSDocumentAccess().getRequirementsSectionAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__19__Impl
	rule__VSRSDocument__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getLogicalModelsSectionAssignment_19()); }
	(rule__VSRSDocument__LogicalModelsSectionAssignment_19)
	{ after(grammarAccess.getVSRSDocumentAccess().getLogicalModelsSectionAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group__20__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getSRSKeyword_20()); }
	'</SRS>'
	{ after(grammarAccess.getVSRSDocumentAccess().getSRSKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSDocument__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group_12__0__Impl
	rule__VSRSDocument__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getParentKeyword_12_0()); }
	'<parent'
	{ after(grammarAccess.getVSRSDocumentAccess().getParentKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group_12__1__Impl
	rule__VSRSDocument__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getNameKeyword_12_1()); }
	'name='
	{ after(grammarAccess.getVSRSDocumentAccess().getNameKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group_12__2__Impl
	rule__VSRSDocument__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getParentsAssignment_12_2()); }
	(rule__VSRSDocument__ParentsAssignment_12_2)
	{ after(grammarAccess.getVSRSDocumentAccess().getParentsAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocument__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentAccess().getSolidusGreaterThanSignKeyword_12_3()); }
	'/>'
	{ after(grammarAccess.getVSRSDocumentAccess().getSolidusGreaterThanSignKeyword_12_3()); }
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
	'<paragraph>'
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
	(
		{ before(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_1()); }
		(rule__DParagraph__ParagraphContentAssignment_1)
		{ after(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_1()); }
	)
	(
		{ before(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_1()); }
		(rule__DParagraph__ParagraphContentAssignment_1)*
		{ after(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_1()); }
	)
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
	{ before(grammarAccess.getDParagraphAccess().getParagraphKeyword_2()); }
	'</paragraph>'
	{ after(grammarAccess.getDParagraphAccess().getParagraphKeyword_2()); }
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
	{ before(grammarAccess.getDListItemAccess().getListItemKeyword_0()); }
	'<listItem>'
	{ after(grammarAccess.getDListItemAccess().getListItemKeyword_0()); }
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
	(
		{ before(grammarAccess.getDListItemAccess().getParagraphAssignment_1()); }
		(rule__DListItem__ParagraphAssignment_1)
		{ after(grammarAccess.getDListItemAccess().getParagraphAssignment_1()); }
	)
	(
		{ before(grammarAccess.getDListItemAccess().getParagraphAssignment_1()); }
		(rule__DListItem__ParagraphAssignment_1)*
		{ after(grammarAccess.getDListItemAccess().getParagraphAssignment_1()); }
	)
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
	{ before(grammarAccess.getDListItemAccess().getGroup_2()); }
	(rule__DListItem__Group_2__0)?
	{ after(grammarAccess.getDListItemAccess().getGroup_2()); }
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
	{ before(grammarAccess.getDListItemAccess().getListItemKeyword_3()); }
	'</listItem>'
	{ after(grammarAccess.getDListItemAccess().getListItemKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DListItem__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group_2__0__Impl
	rule__DListItem__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getSublistKeyword_2_0()); }
	'<sublist>'
	{ after(grammarAccess.getDListItemAccess().getSublistKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group_2__1__Impl
	rule__DListItem__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getSublistAssignment_2_1()); }
	(rule__DListItem__SublistAssignment_2_1)
	{ after(grammarAccess.getDListItemAccess().getSublistAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getSublistKeyword_2_2()); }
	'</sublist>'
	{ after(grammarAccess.getDListItemAccess().getSublistKeyword_2_2()); }
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
	'<itemize>'
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
	(
		{ before(grammarAccess.getDItemizeAccess().getItemsAssignment_1()); }
		(rule__DItemize__ItemsAssignment_1)
		{ after(grammarAccess.getDItemizeAccess().getItemsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getDItemizeAccess().getItemsAssignment_1()); }
		(rule__DItemize__ItemsAssignment_1)*
		{ after(grammarAccess.getDItemizeAccess().getItemsAssignment_1()); }
	)
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
	{ before(grammarAccess.getDItemizeAccess().getItemizeKeyword_2()); }
	'</itemize>'
	{ after(grammarAccess.getDItemizeAccess().getItemizeKeyword_2()); }
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
	'<enumerate>'
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
	(
		{ before(grammarAccess.getDEnumerateAccess().getItemsAssignment_1()); }
		(rule__DEnumerate__ItemsAssignment_1)
		{ after(grammarAccess.getDEnumerateAccess().getItemsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getDEnumerateAccess().getItemsAssignment_1()); }
		(rule__DEnumerate__ItemsAssignment_1)*
		{ after(grammarAccess.getDEnumerateAccess().getItemsAssignment_1()); }
	)
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
	{ before(grammarAccess.getDEnumerateAccess().getEnumerateKeyword_2()); }
	'</enumerate>'
	{ after(grammarAccess.getDEnumerateAccess().getEnumerateKeyword_2()); }
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
	{ before(grammarAccess.getDRunAccess().getBoldTrueKeyword_1()); }
	('bold="true"')?
	{ after(grammarAccess.getDRunAccess().getBoldTrueKeyword_1()); }
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
	{ before(grammarAccess.getDRunAccess().getItalicsTrueKeyword_2()); }
	('italics="true"')?
	{ after(grammarAccess.getDRunAccess().getItalicsTrueKeyword_2()); }
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
	{ before(grammarAccess.getDRunAccess().getUnderlineTrueKeyword_3()); }
	('underline="true"')?
	{ after(grammarAccess.getDRunAccess().getUnderlineTrueKeyword_3()); }
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
	{ before(grammarAccess.getDRunAccess().getGreaterThanSignKeyword_4()); }
	'>'
	{ after(grammarAccess.getDRunAccess().getGreaterThanSignKeyword_4()); }
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
	{ before(grammarAccess.getDRunAccess().getTextAssignment_5()); }
	(rule__DRun__TextAssignment_5)
	{ after(grammarAccess.getDRunAccess().getTextAssignment_5()); }
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
	{ before(grammarAccess.getDRunAccess().getRunKeyword_6()); }
	'</run>'
	{ after(grammarAccess.getDRunAccess().getRunKeyword_6()); }
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
	rule__DHyperlink__Group__4
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
	{ before(grammarAccess.getDHyperlinkAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getDHyperlinkAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DHyperlink__Group__4__Impl
	rule__DHyperlink__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDHyperlinkAccess().getRunAssignment_4()); }
	(rule__DHyperlink__RunAssignment_4)?
	{ after(grammarAccess.getDHyperlinkAccess().getRunAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DHyperlink__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_5()); }
	'</hyperlink>'
	{ after(grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_5()); }
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
	{ before(grammarAccess.getDFigureFromFileAccess().getGroup_5()); }
	(rule__DFigureFromFile__Group_5__0)?
	{ after(grammarAccess.getDFigureFromFileAccess().getGroup_5()); }
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
	{ before(grammarAccess.getDFigureFromFileAccess().getSolidusGreaterThanSignKeyword_6()); }
	'/>'
	{ after(grammarAccess.getDFigureFromFileAccess().getSolidusGreaterThanSignKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DFigureFromFile__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group_5__0__Impl
	rule__DFigureFromFile__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getCaptionKeyword_5_0()); }
	'caption='
	{ after(grammarAccess.getDFigureFromFileAccess().getCaptionKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigureFromFile__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigureFromFile__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureFromFileAccess().getCaptionAssignment_5_1()); }
	(rule__DFigureFromFile__CaptionAssignment_5_1)
	{ after(grammarAccess.getDFigureFromFileAccess().getCaptionAssignment_5_1()); }
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
	{ before(grammarAccess.getDTableFromFileAccess().getGroup_5()); }
	(rule__DTableFromFile__Group_5__0)?
	{ after(grammarAccess.getDTableFromFileAccess().getGroup_5()); }
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
	{ before(grammarAccess.getDTableFromFileAccess().getSolidusGreaterThanSignKeyword_6()); }
	'/>'
	{ after(grammarAccess.getDTableFromFileAccess().getSolidusGreaterThanSignKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DTableFromFile__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group_5__0__Impl
	rule__DTableFromFile__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getCaptionKeyword_5_0()); }
	'caption='
	{ after(grammarAccess.getDTableFromFileAccess().getCaptionKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTableFromFile__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTableFromFile__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTableFromFileAccess().getCaptionAssignment_5_1()); }
	(rule__DTableFromFile__CaptionAssignment_5_1)
	{ after(grammarAccess.getDTableFromFileAccess().getCaptionAssignment_5_1()); }
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
	{ before(grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_4()); }
	'>'
	{ after(grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_4()); }
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
	(
		{ before(grammarAccess.getDBasicTableAccess().getRowsAssignment_5()); }
		(rule__DBasicTable__RowsAssignment_5)
		{ after(grammarAccess.getDBasicTableAccess().getRowsAssignment_5()); }
	)
	(
		{ before(grammarAccess.getDBasicTableAccess().getRowsAssignment_5()); }
		(rule__DBasicTable__RowsAssignment_5)*
		{ after(grammarAccess.getDBasicTableAccess().getRowsAssignment_5()); }
	)
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
	{ before(grammarAccess.getDBasicTableAccess().getBasicTableKeyword_6()); }
	'</basicTable>'
	{ after(grammarAccess.getDBasicTableAccess().getBasicTableKeyword_6()); }
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
	{ before(grammarAccess.getDBasicTableAccess().getCaptionKeyword_3_0()); }
	'caption='
	{ after(grammarAccess.getDBasicTableAccess().getCaptionKeyword_3_0()); }
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
	{ before(grammarAccess.getDBasicTableAccess().getCaptionAssignment_3_1()); }
	(rule__DBasicTable__CaptionAssignment_3_1)
	{ after(grammarAccess.getDBasicTableAccess().getCaptionAssignment_3_1()); }
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
	{ before(grammarAccess.getDCellAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getDCellAccess().getGreaterThanSignKeyword_3()); }
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
	(
		{ before(grammarAccess.getDCellAccess().getBodyContentAssignment_4()); }
		(rule__DCell__BodyContentAssignment_4)
		{ after(grammarAccess.getDCellAccess().getBodyContentAssignment_4()); }
	)
	(
		{ before(grammarAccess.getDCellAccess().getBodyContentAssignment_4()); }
		(rule__DCell__BodyContentAssignment_4)*
		{ after(grammarAccess.getDCellAccess().getBodyContentAssignment_4()); }
	)
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
	{ before(grammarAccess.getDCellAccess().getCellKeyword_5()); }
	'</cell>'
	{ after(grammarAccess.getDCellAccess().getCellKeyword_5()); }
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
	{ before(grammarAccess.getDCellAccess().getGridSpanKeyword_1_0()); }
	'gridSpan='
	{ after(grammarAccess.getDCellAccess().getGridSpanKeyword_1_0()); }
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
	{ before(grammarAccess.getDCellAccess().getGridSpanAssignment_1_1()); }
	(rule__DCell__GridSpanAssignment_1_1)
	{ after(grammarAccess.getDCellAccess().getGridSpanAssignment_1_1()); }
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
	{ before(grammarAccess.getDCellAccess().getVMergeKeyword_2_0()); }
	'vMerge='
	{ after(grammarAccess.getDCellAccess().getVMergeKeyword_2_0()); }
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
	{ before(grammarAccess.getDCellAccess().getVMergeAssignment_2_1()); }
	(rule__DCell__VMergeAssignment_2_1)
	{ after(grammarAccess.getDCellAccess().getVMergeAssignment_2_1()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getSolidusGreaterThanSignKeyword_9()); }
	'/>'
	{ after(grammarAccess.getDApplicableDocumentAccess().getSolidusGreaterThanSignKeyword_9()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getSolidusGreaterThanSignKeyword_9()); }
	'/>'
	{ after(grammarAccess.getDReferenceDocumentAccess().getSolidusGreaterThanSignKeyword_9()); }
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


rule__VSRSFixedSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSFixedSection__Group__0__Impl
	rule__VSRSFixedSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFixedSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSFixedSectionAccess().getVSRSFixedSectionAction_0()); }
	()
	{ after(grammarAccess.getVSRSFixedSectionAccess().getVSRSFixedSectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFixedSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSFixedSection__Group__1__Impl
	rule__VSRSFixedSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFixedSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSFixedSectionAccess().getBodyAssignment_1()); }
	(rule__VSRSFixedSection__BodyAssignment_1)?
	{ after(grammarAccess.getVSRSFixedSectionAccess().getBodyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFixedSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSFixedSection__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFixedSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSFixedSectionAccess().getSrsInstatiableSubsectionsAssignment_2()); }
	(rule__VSRSFixedSection__SrsInstatiableSubsectionsAssignment_2)*
	{ after(grammarAccess.getVSRSFixedSectionAccess().getSrsInstatiableSubsectionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSInstantiableSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableSection__Group__0__Impl
	rule__VSRSInstantiableSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableSectionAccess().getSubsectionKeyword_0()); }
	'<subsection'
	{ after(grammarAccess.getVSRSInstantiableSectionAccess().getSubsectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableSection__Group__1__Impl
	rule__VSRSInstantiableSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableSectionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSRSInstantiableSectionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableSection__Group__2__Impl
	rule__VSRSInstantiableSection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableSectionAccess().getNameAssignment_2()); }
	(rule__VSRSInstantiableSection__NameAssignment_2)
	{ after(grammarAccess.getVSRSInstantiableSectionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableSection__Group__3__Impl
	rule__VSRSInstantiableSection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableSectionAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSRSInstantiableSectionAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableSection__Group__4__Impl
	rule__VSRSInstantiableSection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableSectionAccess().getBodyAssignment_4()); }
	(rule__VSRSInstantiableSection__BodyAssignment_4)?
	{ after(grammarAccess.getVSRSInstantiableSectionAccess().getBodyAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableSection__Group__5__Impl
	rule__VSRSInstantiableSection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableSectionAccess().getSrsInstatiableSubsectionsAssignment_5()); }
	(rule__VSRSInstantiableSection__SrsInstatiableSubsectionsAssignment_5)*
	{ after(grammarAccess.getVSRSInstantiableSectionAccess().getSrsInstatiableSubsectionsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableSection__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableSectionAccess().getSubsectionKeyword_6()); }
	'</subsection>'
	{ after(grammarAccess.getVSRSInstantiableSectionAccess().getSubsectionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSIntroduction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSIntroduction__Group__0__Impl
	rule__VSRSIntroduction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSIntroduction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSIntroductionAccess().getIntroductionKeyword_0()); }
	'<Introduction>'
	{ after(grammarAccess.getVSRSIntroductionAccess().getIntroductionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSIntroduction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSIntroduction__Group__1__Impl
	rule__VSRSIntroduction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSIntroduction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSRSIntroductionAccess().getSrsInstatiableSubsectionsAssignment_1()); }
		(rule__VSRSIntroduction__SrsInstatiableSubsectionsAssignment_1)
		{ after(grammarAccess.getVSRSIntroductionAccess().getSrsInstatiableSubsectionsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getVSRSIntroductionAccess().getSrsInstatiableSubsectionsAssignment_1()); }
		(rule__VSRSIntroduction__SrsInstatiableSubsectionsAssignment_1)*
		{ after(grammarAccess.getVSRSIntroductionAccess().getSrsInstatiableSubsectionsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSIntroduction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSIntroduction__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSIntroduction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSIntroductionAccess().getIntroductionKeyword_2()); }
	'</Introduction>'
	{ after(grammarAccess.getVSRSIntroductionAccess().getIntroductionKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSApplicableDocuments__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSApplicableDocuments__Group__0__Impl
	rule__VSRSApplicableDocuments__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSApplicableDocuments__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSApplicableDocumentsAccess().getVSRSApplicableDocumentsAction_0()); }
	()
	{ after(grammarAccess.getVSRSApplicableDocumentsAccess().getVSRSApplicableDocumentsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSApplicableDocuments__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSApplicableDocuments__Group__1__Impl
	rule__VSRSApplicableDocuments__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSApplicableDocuments__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsKeyword_1()); }
	'<ApplicableDocuments>'
	{ after(grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSApplicableDocuments__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSApplicableDocuments__Group__2__Impl
	rule__VSRSApplicableDocuments__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSApplicableDocuments__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsAssignment_2()); }
	(rule__VSRSApplicableDocuments__ApplicableDocumentsAssignment_2)*
	{ after(grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSApplicableDocuments__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSApplicableDocuments__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSApplicableDocuments__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3()); }
	'</ApplicableDocuments>'
	{ after(grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSReferenceDocuments__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSReferenceDocuments__Group__0__Impl
	rule__VSRSReferenceDocuments__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSReferenceDocuments__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSReferenceDocumentsAccess().getVSRSReferenceDocumentsAction_0()); }
	()
	{ after(grammarAccess.getVSRSReferenceDocumentsAccess().getVSRSReferenceDocumentsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSReferenceDocuments__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSReferenceDocuments__Group__1__Impl
	rule__VSRSReferenceDocuments__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSReferenceDocuments__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsKeyword_1()); }
	'<ReferenceDocuments>'
	{ after(grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSReferenceDocuments__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSReferenceDocuments__Group__2__Impl
	rule__VSRSReferenceDocuments__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSReferenceDocuments__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsAssignment_2()); }
	(rule__VSRSReferenceDocuments__ReferenceDocumentsAssignment_2)*
	{ after(grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSReferenceDocuments__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSReferenceDocuments__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSReferenceDocuments__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3()); }
	'</ReferenceDocuments>'
	{ after(grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSTermsDefinitionsAbbreviations__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTermsDefinitionsAbbreviations__Group__0__Impl
	rule__VSRSTermsDefinitionsAbbreviations__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getVSRSTermsDefinitionsAbbreviationsAction_0()); }
	()
	{ after(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getVSRSTermsDefinitionsAbbreviationsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTermsDefinitionsAbbreviations__Group__1__Impl
	rule__VSRSTermsDefinitionsAbbreviations__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1()); }
	'<TermsDefinitionsAbbreviations>'
	{ after(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTermsDefinitionsAbbreviations__Group__2__Impl
	rule__VSRSTermsDefinitionsAbbreviations__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2()); }
	(rule__VSRSTermsDefinitionsAbbreviations__TermsAssignment_2)*
	{ after(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTermsDefinitionsAbbreviations__Group__3__Impl
	rule__VSRSTermsDefinitionsAbbreviations__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3()); }
	(rule__VSRSTermsDefinitionsAbbreviations__DefinitionsAssignment_3)*
	{ after(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTermsDefinitionsAbbreviations__Group__4__Impl
	rule__VSRSTermsDefinitionsAbbreviations__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4()); }
	(rule__VSRSTermsDefinitionsAbbreviations__AbbreviationsAssignment_4)*
	{ after(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTermsDefinitionsAbbreviations__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5()); }
	'</TermsDefinitionsAbbreviations>'
	{ after(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSSoftwareOverview__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__0__Impl
	rule__VSRSSoftwareOverview__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getSoftwareOverviewKeyword_0()); }
	'<SoftwareOverview>'
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getSoftwareOverviewKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__1__Impl
	rule__VSRSSoftwareOverview__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeKeyword_1()); }
	'<FunctionPurpose>'
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__2__Impl
	rule__VSRSSoftwareOverview__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeAssignment_2()); }
	(rule__VSRSSoftwareOverview__FunctionPurposeAssignment_2)
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__3__Impl
	rule__VSRSSoftwareOverview__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeKeyword_3()); }
	'</FunctionPurpose>'
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__4__Impl
	rule__VSRSSoftwareOverview__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsKeyword_4()); }
	'<EnvironmentalConsiderations>'
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__5__Impl
	rule__VSRSSoftwareOverview__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsAssignment_5()); }
	(rule__VSRSSoftwareOverview__EnvironmentalConsiderationsAssignment_5)
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__6__Impl
	rule__VSRSSoftwareOverview__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsKeyword_6()); }
	'</EnvironmentalConsiderations>'
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__7__Impl
	rule__VSRSSoftwareOverview__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsKeyword_7()); }
	'<RelationOtherSystems>'
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__8__Impl
	rule__VSRSSoftwareOverview__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsAssignment_8()); }
	(rule__VSRSSoftwareOverview__RelationOtherSystemsAssignment_8)
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__9__Impl
	rule__VSRSSoftwareOverview__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsKeyword_9()); }
	'</RelationOtherSystems>'
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__10__Impl
	rule__VSRSSoftwareOverview__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsKeyword_10()); }
	'<Constraints>'
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__11__Impl
	rule__VSRSSoftwareOverview__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsAssignment_11()); }
	(rule__VSRSSoftwareOverview__ConstraintsAssignment_11)
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__12__Impl
	rule__VSRSSoftwareOverview__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsKeyword_12()); }
	'</Constraints>'
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSoftwareOverview__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getSoftwareOverviewKeyword_13()); }
	'</SoftwareOverview>'
	{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getSoftwareOverviewKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__0__Impl
	rule__VSRSRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getRequirementsKeyword_0()); }
	'<Requirements>'
	{ after(grammarAccess.getVSRSRequirementsAccess().getRequirementsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__1__Impl
	rule__VSRSRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getSectionDescriptionAssignment_1()); }
	(rule__VSRSRequirements__SectionDescriptionAssignment_1)?
	{ after(grammarAccess.getVSRSRequirementsAccess().getSectionDescriptionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__2__Impl
	rule__VSRSRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getGeneralAssignment_2()); }
	(rule__VSRSRequirements__GeneralAssignment_2)
	{ after(grammarAccess.getVSRSRequirementsAccess().getGeneralAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__3__Impl
	rule__VSRSRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getFunctionalAssignment_3()); }
	(rule__VSRSRequirements__FunctionalAssignment_3)
	{ after(grammarAccess.getVSRSRequirementsAccess().getFunctionalAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__4__Impl
	rule__VSRSRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getPerformanceAssignment_4()); }
	(rule__VSRSRequirements__PerformanceAssignment_4)
	{ after(grammarAccess.getVSRSRequirementsAccess().getPerformanceAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__5__Impl
	rule__VSRSRequirements__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getInterfaceAssignment_5()); }
	(rule__VSRSRequirements__InterfaceAssignment_5)
	{ after(grammarAccess.getVSRSRequirementsAccess().getInterfaceAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__6__Impl
	rule__VSRSRequirements__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getOperationalAssignment_6()); }
	(rule__VSRSRequirements__OperationalAssignment_6)
	{ after(grammarAccess.getVSRSRequirementsAccess().getOperationalAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__7__Impl
	rule__VSRSRequirements__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getResourcesAssignment_7()); }
	(rule__VSRSRequirements__ResourcesAssignment_7)
	{ after(grammarAccess.getVSRSRequirementsAccess().getResourcesAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__8__Impl
	rule__VSRSRequirements__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getDesignAssignment_8()); }
	(rule__VSRSRequirements__DesignAssignment_8)
	{ after(grammarAccess.getVSRSRequirementsAccess().getDesignAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__9__Impl
	rule__VSRSRequirements__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getSecurityPrivacyAssignment_9()); }
	(rule__VSRSRequirements__SecurityPrivacyAssignment_9)
	{ after(grammarAccess.getVSRSRequirementsAccess().getSecurityPrivacyAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__10__Impl
	rule__VSRSRequirements__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getPortabilityAssignment_10()); }
	(rule__VSRSRequirements__PortabilityAssignment_10)
	{ after(grammarAccess.getVSRSRequirementsAccess().getPortabilityAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__11__Impl
	rule__VSRSRequirements__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getSwQualityAssignment_11()); }
	(rule__VSRSRequirements__SwQualityAssignment_11)
	{ after(grammarAccess.getVSRSRequirementsAccess().getSwQualityAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__12__Impl
	rule__VSRSRequirements__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getSwReliabiltyAssignment_12()); }
	(rule__VSRSRequirements__SwReliabiltyAssignment_12)
	{ after(grammarAccess.getVSRSRequirementsAccess().getSwReliabiltyAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__13__Impl
	rule__VSRSRequirements__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getSwMaintainabilityAssignment_13()); }
	(rule__VSRSRequirements__SwMaintainabilityAssignment_13)
	{ after(grammarAccess.getVSRSRequirementsAccess().getSwMaintainabilityAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__14__Impl
	rule__VSRSRequirements__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getSwSafetyAssignment_14()); }
	(rule__VSRSRequirements__SwSafetyAssignment_14)
	{ after(grammarAccess.getVSRSRequirementsAccess().getSwSafetyAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__15__Impl
	rule__VSRSRequirements__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getSwConfigurationDeliveryAssignment_15()); }
	(rule__VSRSRequirements__SwConfigurationDeliveryAssignment_15)
	{ after(grammarAccess.getVSRSRequirementsAccess().getSwConfigurationDeliveryAssignment_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__16__Impl
	rule__VSRSRequirements__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getDataDefinitionDBAssignment_16()); }
	(rule__VSRSRequirements__DataDefinitionDBAssignment_16)
	{ after(grammarAccess.getVSRSRequirementsAccess().getDataDefinitionDBAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__17__Impl
	rule__VSRSRequirements__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getHumanFactorsAssignment_17()); }
	(rule__VSRSRequirements__HumanFactorsAssignment_17)
	{ after(grammarAccess.getVSRSRequirementsAccess().getHumanFactorsAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__18__Impl
	rule__VSRSRequirements__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getAdaptationInstallationAssignment_18()); }
	(rule__VSRSRequirements__AdaptationInstallationAssignment_18)
	{ after(grammarAccess.getVSRSRequirementsAccess().getAdaptationInstallationAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSRequirements__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSRequirementsAccess().getRequirementsKeyword_19()); }
	'</Requirements>'
	{ after(grammarAccess.getVSRSRequirementsAccess().getRequirementsKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSLogicalModels__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSLogicalModels__Group__0__Impl
	rule__VSRSLogicalModels__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSLogicalModels__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSLogicalModelsAccess().getVSRSLogicalModelsAction_0()); }
	()
	{ after(grammarAccess.getVSRSLogicalModelsAccess().getVSRSLogicalModelsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSLogicalModels__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSLogicalModels__Group__1__Impl
	rule__VSRSLogicalModels__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSLogicalModels__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsKeyword_1()); }
	'<LogicalModels>'
	{ after(grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSLogicalModels__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSLogicalModels__Group__2__Impl
	rule__VSRSLogicalModels__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSLogicalModels__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsAssignment_2()); }
	(rule__VSRSLogicalModels__LogicalModelsAssignment_2)*
	{ after(grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSLogicalModels__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSLogicalModels__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSLogicalModels__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsKeyword_3()); }
	'</LogicalModels>'
	{ after(grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTerm__Group__0__Impl
	rule__VSRSTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermAccess().getTermKeyword_0()); }
	'<Term'
	{ after(grammarAccess.getVSRSTermAccess().getTermKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTerm__Group__1__Impl
	rule__VSRSTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSRSTermAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTerm__Group__2__Impl
	rule__VSRSTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermAccess().getNameAssignment_2()); }
	(rule__VSRSTerm__NameAssignment_2)
	{ after(grammarAccess.getVSRSTermAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTerm__Group__3__Impl
	rule__VSRSTerm__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSRSTermAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTerm__Group__4__Impl
	rule__VSRSTerm__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermAccess().getDescriptionAssignment_4()); }
	(rule__VSRSTerm__DescriptionAssignment_4)
	{ after(grammarAccess.getVSRSTermAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSTerm__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSTermAccess().getTermKeyword_5()); }
	'</Term>'
	{ after(grammarAccess.getVSRSTermAccess().getTermKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDefinition__Group__0__Impl
	rule__VSRSDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDefinitionAccess().getDefinitionKeyword_0()); }
	'<Definition'
	{ after(grammarAccess.getVSRSDefinitionAccess().getDefinitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDefinition__Group__1__Impl
	rule__VSRSDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDefinitionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSRSDefinitionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDefinition__Group__2__Impl
	rule__VSRSDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDefinitionAccess().getNameAssignment_2()); }
	(rule__VSRSDefinition__NameAssignment_2)
	{ after(grammarAccess.getVSRSDefinitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDefinition__Group__3__Impl
	rule__VSRSDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDefinitionAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSRSDefinitionAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDefinition__Group__4__Impl
	rule__VSRSDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDefinitionAccess().getDescriptionAssignment_4()); }
	(rule__VSRSDefinition__DescriptionAssignment_4)
	{ after(grammarAccess.getVSRSDefinitionAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDefinitionAccess().getDefinitionKeyword_5()); }
	'</Definition>'
	{ after(grammarAccess.getVSRSDefinitionAccess().getDefinitionKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSAbbreviation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAbbreviation__Group__0__Impl
	rule__VSRSAbbreviation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAbbreviationAccess().getAbbreviationKeyword_0()); }
	'<Abbreviation'
	{ after(grammarAccess.getVSRSAbbreviationAccess().getAbbreviationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAbbreviation__Group__1__Impl
	rule__VSRSAbbreviation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAbbreviationAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSRSAbbreviationAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAbbreviation__Group__2__Impl
	rule__VSRSAbbreviation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAbbreviationAccess().getNameAssignment_2()); }
	(rule__VSRSAbbreviation__NameAssignment_2)
	{ after(grammarAccess.getVSRSAbbreviationAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAbbreviation__Group__3__Impl
	rule__VSRSAbbreviation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAbbreviationAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSRSAbbreviationAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAbbreviation__Group__4__Impl
	rule__VSRSAbbreviation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAbbreviationAccess().getDescriptionAssignment_4()); }
	(rule__VSRSAbbreviation__DescriptionAssignment_4)
	{ after(grammarAccess.getVSRSAbbreviationAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAbbreviation__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAbbreviationAccess().getAbbreviationKeyword_5()); }
	'</Abbreviation>'
	{ after(grammarAccess.getVSRSAbbreviationAccess().getAbbreviationKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSInstantiableRequirementSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableRequirementSection__Group__0__Impl
	rule__VSRSInstantiableRequirementSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSubsectionKeyword_0()); }
	'<subsection'
	{ after(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSubsectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableRequirementSection__Group__1__Impl
	rule__VSRSInstantiableRequirementSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableRequirementSection__Group__2__Impl
	rule__VSRSInstantiableRequirementSection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getNameAssignment_2()); }
	(rule__VSRSInstantiableRequirementSection__NameAssignment_2)
	{ after(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableRequirementSection__Group__3__Impl
	rule__VSRSInstantiableRequirementSection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableRequirementSection__Group__4__Impl
	rule__VSRSInstantiableRequirementSection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSectionDescriptionAssignment_4()); }
	(rule__VSRSInstantiableRequirementSection__SectionDescriptionAssignment_4)?
	{ after(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSectionDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableRequirementSection__Group__5__Impl
	rule__VSRSInstantiableRequirementSection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSrsItemsAssignment_5()); }
	(rule__VSRSInstantiableRequirementSection__SrsItemsAssignment_5)*
	{ after(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSrsItemsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInstantiableRequirementSection__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSubsectionKeyword_6()); }
	'</subsection>'
	{ after(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSubsectionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSGeneralRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSGeneralRequirements__Group__0__Impl
	rule__VSRSGeneralRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSGeneralRequirementsAccess().getVSRSGeneralRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSGeneralRequirementsAccess().getVSRSGeneralRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSGeneralRequirements__Group__1__Impl
	rule__VSRSGeneralRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSGeneralRequirementsAccess().getGeneralRequirementsKeyword_1()); }
	'<GeneralRequirements>'
	{ after(grammarAccess.getVSRSGeneralRequirementsAccess().getGeneralRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSGeneralRequirements__Group__2__Impl
	rule__VSRSGeneralRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSGeneralRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSGeneralRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSGeneralRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSGeneralRequirements__Group__3__Impl
	rule__VSRSGeneralRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSGeneralRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSGeneralRequirements__Group__4__Impl
	rule__VSRSGeneralRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSGeneralRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSGeneralRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSGeneralRequirementsAccess().getGeneralRequirementsKeyword_5()); }
	'</GeneralRequirements>'
	{ after(grammarAccess.getVSRSGeneralRequirementsAccess().getGeneralRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSFunctionalRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSFunctionalRequirements__Group__0__Impl
	rule__VSRSFunctionalRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSFunctionalRequirementsAccess().getVSRSFunctionalRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSFunctionalRequirementsAccess().getVSRSFunctionalRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSFunctionalRequirements__Group__1__Impl
	rule__VSRSFunctionalRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSFunctionalRequirementsAccess().getFunctionalRequirementsKeyword_1()); }
	'<FunctionalRequirements>'
	{ after(grammarAccess.getVSRSFunctionalRequirementsAccess().getFunctionalRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSFunctionalRequirements__Group__2__Impl
	rule__VSRSFunctionalRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSFunctionalRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSFunctionalRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSFunctionalRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSFunctionalRequirements__Group__3__Impl
	rule__VSRSFunctionalRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSFunctionalRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSFunctionalRequirements__Group__4__Impl
	rule__VSRSFunctionalRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSFunctionalRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSFunctionalRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSFunctionalRequirementsAccess().getFunctionalRequirementsKeyword_5()); }
	'</FunctionalRequirements>'
	{ after(grammarAccess.getVSRSFunctionalRequirementsAccess().getFunctionalRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSPerformanceRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPerformanceRequirements__Group__0__Impl
	rule__VSRSPerformanceRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPerformanceRequirementsAccess().getVSRSPerformanceRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSPerformanceRequirementsAccess().getVSRSPerformanceRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPerformanceRequirements__Group__1__Impl
	rule__VSRSPerformanceRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPerformanceRequirementsAccess().getPerformanceRequirementsKeyword_1()); }
	'<PerformanceRequirements>'
	{ after(grammarAccess.getVSRSPerformanceRequirementsAccess().getPerformanceRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPerformanceRequirements__Group__2__Impl
	rule__VSRSPerformanceRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPerformanceRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSPerformanceRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSPerformanceRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPerformanceRequirements__Group__3__Impl
	rule__VSRSPerformanceRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSPerformanceRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPerformanceRequirements__Group__4__Impl
	rule__VSRSPerformanceRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSPerformanceRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPerformanceRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPerformanceRequirementsAccess().getPerformanceRequirementsKeyword_5()); }
	'</PerformanceRequirements>'
	{ after(grammarAccess.getVSRSPerformanceRequirementsAccess().getPerformanceRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSInterfaceRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInterfaceRequirements__Group__0__Impl
	rule__VSRSInterfaceRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInterfaceRequirementsAccess().getVSRSInterfaceRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSInterfaceRequirementsAccess().getVSRSInterfaceRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInterfaceRequirements__Group__1__Impl
	rule__VSRSInterfaceRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInterfaceRequirementsAccess().getInterfaceRequirementsKeyword_1()); }
	'<InterfaceRequirements>'
	{ after(grammarAccess.getVSRSInterfaceRequirementsAccess().getInterfaceRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInterfaceRequirements__Group__2__Impl
	rule__VSRSInterfaceRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInterfaceRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSInterfaceRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSInterfaceRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInterfaceRequirements__Group__3__Impl
	rule__VSRSInterfaceRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSInterfaceRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInterfaceRequirements__Group__4__Impl
	rule__VSRSInterfaceRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSInterfaceRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSInterfaceRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSInterfaceRequirementsAccess().getInterfaceRequirementsKeyword_5()); }
	'</InterfaceRequirements>'
	{ after(grammarAccess.getVSRSInterfaceRequirementsAccess().getInterfaceRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSOperationalRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSOperationalRequirements__Group__0__Impl
	rule__VSRSOperationalRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSOperationalRequirementsAccess().getVSRSOperationalRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSOperationalRequirementsAccess().getVSRSOperationalRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSOperationalRequirements__Group__1__Impl
	rule__VSRSOperationalRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSOperationalRequirementsAccess().getOperationalRequirementsKeyword_1()); }
	'<OperationalRequirements>'
	{ after(grammarAccess.getVSRSOperationalRequirementsAccess().getOperationalRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSOperationalRequirements__Group__2__Impl
	rule__VSRSOperationalRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSOperationalRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSOperationalRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSOperationalRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSOperationalRequirements__Group__3__Impl
	rule__VSRSOperationalRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSOperationalRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSOperationalRequirements__Group__4__Impl
	rule__VSRSOperationalRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSOperationalRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSOperationalRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSOperationalRequirementsAccess().getOperationalRequirementsKeyword_5()); }
	'</OperationalRequirements>'
	{ after(grammarAccess.getVSRSOperationalRequirementsAccess().getOperationalRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSResourcesRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSResourcesRequirements__Group__0__Impl
	rule__VSRSResourcesRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSResourcesRequirementsAccess().getVSRSResourcesRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSResourcesRequirementsAccess().getVSRSResourcesRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSResourcesRequirements__Group__1__Impl
	rule__VSRSResourcesRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSResourcesRequirementsAccess().getResourcesRequirementsKeyword_1()); }
	'<ResourcesRequirements>'
	{ after(grammarAccess.getVSRSResourcesRequirementsAccess().getResourcesRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSResourcesRequirements__Group__2__Impl
	rule__VSRSResourcesRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSResourcesRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSResourcesRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSResourcesRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSResourcesRequirements__Group__3__Impl
	rule__VSRSResourcesRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSResourcesRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSResourcesRequirements__Group__4__Impl
	rule__VSRSResourcesRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSResourcesRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSResourcesRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSResourcesRequirementsAccess().getResourcesRequirementsKeyword_5()); }
	'</ResourcesRequirements>'
	{ after(grammarAccess.getVSRSResourcesRequirementsAccess().getResourcesRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSDesignRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDesignRequirements__Group__0__Impl
	rule__VSRSDesignRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDesignRequirementsAccess().getVSRSDesignRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSDesignRequirementsAccess().getVSRSDesignRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDesignRequirements__Group__1__Impl
	rule__VSRSDesignRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDesignRequirementsAccess().getDesignRequirementsKeyword_1()); }
	'<DesignRequirements>'
	{ after(grammarAccess.getVSRSDesignRequirementsAccess().getDesignRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDesignRequirements__Group__2__Impl
	rule__VSRSDesignRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDesignRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSDesignRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSDesignRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDesignRequirements__Group__3__Impl
	rule__VSRSDesignRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDesignRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSDesignRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSDesignRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDesignRequirements__Group__4__Impl
	rule__VSRSDesignRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDesignRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSDesignRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSDesignRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDesignRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDesignRequirementsAccess().getDesignRequirementsKeyword_5()); }
	'</DesignRequirements>'
	{ after(grammarAccess.getVSRSDesignRequirementsAccess().getDesignRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSSecurityPrivacyRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSecurityPrivacyRequirements__Group__0__Impl
	rule__VSRSSecurityPrivacyRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getVSRSSecurityPrivacyRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getVSRSSecurityPrivacyRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSecurityPrivacyRequirements__Group__1__Impl
	rule__VSRSSecurityPrivacyRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSecurityPrivacyRequirementsKeyword_1()); }
	'<SecurityPrivacyRequirements>'
	{ after(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSecurityPrivacyRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSecurityPrivacyRequirements__Group__2__Impl
	rule__VSRSSecurityPrivacyRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSSecurityPrivacyRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSecurityPrivacyRequirements__Group__3__Impl
	rule__VSRSSecurityPrivacyRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSSecurityPrivacyRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSecurityPrivacyRequirements__Group__4__Impl
	rule__VSRSSecurityPrivacyRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSSecurityPrivacyRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSecurityPrivacyRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSecurityPrivacyRequirementsKeyword_5()); }
	'</SecurityPrivacyRequirements>'
	{ after(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSecurityPrivacyRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSPortabilityRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPortabilityRequirements__Group__0__Impl
	rule__VSRSPortabilityRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPortabilityRequirementsAccess().getVSRSPortabilityRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSPortabilityRequirementsAccess().getVSRSPortabilityRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPortabilityRequirements__Group__1__Impl
	rule__VSRSPortabilityRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPortabilityRequirementsAccess().getPortabilityRequirementsKeyword_1()); }
	'<PortabilityRequirements>'
	{ after(grammarAccess.getVSRSPortabilityRequirementsAccess().getPortabilityRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPortabilityRequirements__Group__2__Impl
	rule__VSRSPortabilityRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPortabilityRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSPortabilityRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSPortabilityRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPortabilityRequirements__Group__3__Impl
	rule__VSRSPortabilityRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSPortabilityRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPortabilityRequirements__Group__4__Impl
	rule__VSRSPortabilityRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSPortabilityRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSPortabilityRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSPortabilityRequirementsAccess().getPortabilityRequirementsKeyword_5()); }
	'</PortabilityRequirements>'
	{ after(grammarAccess.getVSRSPortabilityRequirementsAccess().getPortabilityRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSSWQualityRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWQualityRequirements__Group__0__Impl
	rule__VSRSSWQualityRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWQualityRequirementsAccess().getVSRSSWQualityRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSSWQualityRequirementsAccess().getVSRSSWQualityRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWQualityRequirements__Group__1__Impl
	rule__VSRSSWQualityRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWQualityRequirementsAccess().getSWQualityRequirementsKeyword_1()); }
	'<SWQualityRequirements>'
	{ after(grammarAccess.getVSRSSWQualityRequirementsAccess().getSWQualityRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWQualityRequirements__Group__2__Impl
	rule__VSRSSWQualityRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWQualityRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSSWQualityRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSSWQualityRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWQualityRequirements__Group__3__Impl
	rule__VSRSSWQualityRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSSWQualityRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWQualityRequirements__Group__4__Impl
	rule__VSRSSWQualityRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSSWQualityRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWQualityRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWQualityRequirementsAccess().getSWQualityRequirementsKeyword_5()); }
	'</SWQualityRequirements>'
	{ after(grammarAccess.getVSRSSWQualityRequirementsAccess().getSWQualityRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSSWReliabiltyRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWReliabiltyRequirements__Group__0__Impl
	rule__VSRSSWReliabiltyRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getVSRSSWReliabiltyRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getVSRSSWReliabiltyRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWReliabiltyRequirements__Group__1__Impl
	rule__VSRSSWReliabiltyRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSWReliabiltyRequirementsKeyword_1()); }
	'<SWReliabiltyRequirements>'
	{ after(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSWReliabiltyRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWReliabiltyRequirements__Group__2__Impl
	rule__VSRSSWReliabiltyRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSSWReliabiltyRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWReliabiltyRequirements__Group__3__Impl
	rule__VSRSSWReliabiltyRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSSWReliabiltyRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWReliabiltyRequirements__Group__4__Impl
	rule__VSRSSWReliabiltyRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSSWReliabiltyRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWReliabiltyRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSWReliabiltyRequirementsKeyword_5()); }
	'</SWReliabiltyRequirements>'
	{ after(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSWReliabiltyRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSSWMaintainabilityRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWMaintainabilityRequirements__Group__0__Impl
	rule__VSRSSWMaintainabilityRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getVSRSSWMaintainabilityRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getVSRSSWMaintainabilityRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWMaintainabilityRequirements__Group__1__Impl
	rule__VSRSSWMaintainabilityRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSWMaintainabilityRequirementsKeyword_1()); }
	'<SWMaintainabilityRequirements>'
	{ after(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSWMaintainabilityRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWMaintainabilityRequirements__Group__2__Impl
	rule__VSRSSWMaintainabilityRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSSWMaintainabilityRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWMaintainabilityRequirements__Group__3__Impl
	rule__VSRSSWMaintainabilityRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSSWMaintainabilityRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWMaintainabilityRequirements__Group__4__Impl
	rule__VSRSSWMaintainabilityRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSSWMaintainabilityRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWMaintainabilityRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSWMaintainabilityRequirementsKeyword_5()); }
	'</SWMaintainabilityRequirements>'
	{ after(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSWMaintainabilityRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSSWSafetyRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWSafetyRequirements__Group__0__Impl
	rule__VSRSSWSafetyRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWSafetyRequirementsAccess().getVSRSSWSafetyRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSSWSafetyRequirementsAccess().getVSRSSWSafetyRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWSafetyRequirements__Group__1__Impl
	rule__VSRSSWSafetyRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSWSafetyRequirementsKeyword_1()); }
	'<SWSafetyRequirements>'
	{ after(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSWSafetyRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWSafetyRequirements__Group__2__Impl
	rule__VSRSSWSafetyRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSSWSafetyRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWSafetyRequirements__Group__3__Impl
	rule__VSRSSWSafetyRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSSWSafetyRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWSafetyRequirements__Group__4__Impl
	rule__VSRSSWSafetyRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSSWSafetyRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWSafetyRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSWSafetyRequirementsKeyword_5()); }
	'</SWSafetyRequirements>'
	{ after(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSWSafetyRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSSWConfigurationDeliveryRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWConfigurationDeliveryRequirements__Group__0__Impl
	rule__VSRSSWConfigurationDeliveryRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getVSRSSWConfigurationDeliveryRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getVSRSSWConfigurationDeliveryRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWConfigurationDeliveryRequirements__Group__1__Impl
	rule__VSRSSWConfigurationDeliveryRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSWConfigurationDeliveryRequirementsKeyword_1()); }
	'<SWConfigurationDeliveryRequirements>'
	{ after(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSWConfigurationDeliveryRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWConfigurationDeliveryRequirements__Group__2__Impl
	rule__VSRSSWConfigurationDeliveryRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSSWConfigurationDeliveryRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWConfigurationDeliveryRequirements__Group__3__Impl
	rule__VSRSSWConfigurationDeliveryRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSSWConfigurationDeliveryRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWConfigurationDeliveryRequirements__Group__4__Impl
	rule__VSRSSWConfigurationDeliveryRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSSWConfigurationDeliveryRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSSWConfigurationDeliveryRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSWConfigurationDeliveryRequirementsKeyword_5()); }
	'</SWConfigurationDeliveryRequirements>'
	{ after(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSWConfigurationDeliveryRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSDataDefinitionDBRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDataDefinitionDBRequirements__Group__0__Impl
	rule__VSRSDataDefinitionDBRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getVSRSDataDefinitionDBRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getVSRSDataDefinitionDBRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDataDefinitionDBRequirements__Group__1__Impl
	rule__VSRSDataDefinitionDBRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getDataDefinitionDBRequirementsKeyword_1()); }
	'<DataDefinitionDBRequirements>'
	{ after(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getDataDefinitionDBRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDataDefinitionDBRequirements__Group__2__Impl
	rule__VSRSDataDefinitionDBRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSDataDefinitionDBRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDataDefinitionDBRequirements__Group__3__Impl
	rule__VSRSDataDefinitionDBRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSDataDefinitionDBRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDataDefinitionDBRequirements__Group__4__Impl
	rule__VSRSDataDefinitionDBRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSDataDefinitionDBRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDataDefinitionDBRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getDataDefinitionDBRequirementsKeyword_5()); }
	'</DataDefinitionDBRequirements>'
	{ after(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getDataDefinitionDBRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSHumanFactorsRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSHumanFactorsRequirements__Group__0__Impl
	rule__VSRSHumanFactorsRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getVSRSHumanFactorsRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getVSRSHumanFactorsRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSHumanFactorsRequirements__Group__1__Impl
	rule__VSRSHumanFactorsRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getHumanFactorsRequirementsKeyword_1()); }
	'<HumanFactorsRequirements>'
	{ after(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getHumanFactorsRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSHumanFactorsRequirements__Group__2__Impl
	rule__VSRSHumanFactorsRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSHumanFactorsRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSHumanFactorsRequirements__Group__3__Impl
	rule__VSRSHumanFactorsRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSHumanFactorsRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSHumanFactorsRequirements__Group__4__Impl
	rule__VSRSHumanFactorsRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSHumanFactorsRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSHumanFactorsRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getHumanFactorsRequirementsKeyword_5()); }
	'</HumanFactorsRequirements>'
	{ after(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getHumanFactorsRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSAdaptationInstallationRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAdaptationInstallationRequirements__Group__0__Impl
	rule__VSRSAdaptationInstallationRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getVSRSAdaptationInstallationRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getVSRSAdaptationInstallationRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAdaptationInstallationRequirements__Group__1__Impl
	rule__VSRSAdaptationInstallationRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getAdaptationInstallationRequirementsKeyword_1()); }
	'<AdaptationInstallationRequirements>'
	{ after(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getAdaptationInstallationRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAdaptationInstallationRequirements__Group__2__Impl
	rule__VSRSAdaptationInstallationRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSRSAdaptationInstallationRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAdaptationInstallationRequirements__Group__3__Impl
	rule__VSRSAdaptationInstallationRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsItemsAssignment_3()); }
	(rule__VSRSAdaptationInstallationRequirements__SrsItemsAssignment_3)*
	{ after(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAdaptationInstallationRequirements__Group__4__Impl
	rule__VSRSAdaptationInstallationRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
	(rule__VSRSAdaptationInstallationRequirements__SrsRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSAdaptationInstallationRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getAdaptationInstallationRequirementsKeyword_5()); }
	'</AdaptationInstallationRequirements>'
	{ after(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getAdaptationInstallationRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSDocumentItem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__0__Impl
	rule__VSRSDocumentItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getItemKeyword_0()); }
	'<Item'
	{ after(grammarAccess.getVSRSDocumentItemAccess().getItemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__1__Impl
	rule__VSRSDocumentItem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSRSDocumentItemAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__2__Impl
	rule__VSRSDocumentItem__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getNameAssignment_2()); }
	(rule__VSRSDocumentItem__NameAssignment_2)
	{ after(grammarAccess.getVSRSDocumentItemAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__3__Impl
	rule__VSRSDocumentItem__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getValidationMethodKeyword_3()); }
	'validationMethod='
	{ after(grammarAccess.getVSRSDocumentItemAccess().getValidationMethodKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__4__Impl
	rule__VSRSDocumentItem__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getValidationMethodAssignment_4()); }
	(rule__VSRSDocumentItem__ValidationMethodAssignment_4)
	{ after(grammarAccess.getVSRSDocumentItemAccess().getValidationMethodAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__5__Impl
	rule__VSRSDocumentItem__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getVSRSDocumentItemAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__6__Impl
	rule__VSRSDocumentItem__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getGroup_6()); }
	(rule__VSRSDocumentItem__Group_6__0)*
	{ after(grammarAccess.getVSRSDocumentItemAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__7__Impl
	rule__VSRSDocumentItem__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getDescriptionKeyword_7()); }
	'<description>'
	{ after(grammarAccess.getVSRSDocumentItemAccess().getDescriptionKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__8__Impl
	rule__VSRSDocumentItem__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getDescriptionAssignment_8()); }
	(rule__VSRSDocumentItem__DescriptionAssignment_8)
	{ after(grammarAccess.getVSRSDocumentItemAccess().getDescriptionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__9__Impl
	rule__VSRSDocumentItem__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getDescriptionKeyword_9()); }
	'</description>'
	{ after(grammarAccess.getVSRSDocumentItemAccess().getDescriptionKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__10__Impl
	rule__VSRSDocumentItem__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getGroup_10()); }
	(rule__VSRSDocumentItem__Group_10__0)?
	{ after(grammarAccess.getVSRSDocumentItemAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__11__Impl
	rule__VSRSDocumentItem__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getGroup_11()); }
	(rule__VSRSDocumentItem__Group_11__0)*
	{ after(grammarAccess.getVSRSDocumentItemAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getItemKeyword_12()); }
	'</Item>'
	{ after(grammarAccess.getVSRSDocumentItemAccess().getItemKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSDocumentItem__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group_6__0__Impl
	rule__VSRSDocumentItem__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getModeKeyword_6_0()); }
	'<mode'
	{ after(grammarAccess.getVSRSDocumentItemAccess().getModeKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group_6__1__Impl
	rule__VSRSDocumentItem__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getNameKeyword_6_1()); }
	'name='
	{ after(grammarAccess.getVSRSDocumentItemAccess().getNameKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group_6__2__Impl
	rule__VSRSDocumentItem__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getModeAssignment_6_2()); }
	(rule__VSRSDocumentItem__ModeAssignment_6_2)
	{ after(grammarAccess.getVSRSDocumentItemAccess().getModeAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getSolidusGreaterThanSignKeyword_6_3()); }
	'/>'
	{ after(grammarAccess.getVSRSDocumentItemAccess().getSolidusGreaterThanSignKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSDocumentItem__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group_10__0__Impl
	rule__VSRSDocumentItem__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionKeyword_10_0()); }
	'<extendedDescription>'
	{ after(grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group_10__1__Impl
	rule__VSRSDocumentItem__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionAssignment_10_1()); }
	(rule__VSRSDocumentItem__ExtendedDescriptionAssignment_10_1)
	{ after(grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group_10__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionKeyword_10_2()); }
	'</extendedDescription>'
	{ after(grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionKeyword_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSDocumentItem__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group_11__0__Impl
	rule__VSRSDocumentItem__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getParentItemKeyword_11_0()); }
	'<parentItem'
	{ after(grammarAccess.getVSRSDocumentItemAccess().getParentItemKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group_11__1__Impl
	rule__VSRSDocumentItem__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getNameKeyword_11_1()); }
	'name='
	{ after(grammarAccess.getVSRSDocumentItemAccess().getNameKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group_11__2__Impl
	rule__VSRSDocumentItem__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getParentItemAssignment_11_2()); }
	(rule__VSRSDocumentItem__ParentItemAssignment_11_2)
	{ after(grammarAccess.getVSRSDocumentItemAccess().getParentItemAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSDocumentItem__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSDocumentItemAccess().getSolidusGreaterThanSignKeyword_11_3()); }
	'/>'
	{ after(grammarAccess.getVSRSDocumentItemAccess().getSolidusGreaterThanSignKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSLogicalModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSLogicalModel__Group__0__Impl
	rule__VSRSLogicalModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSLogicalModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSLogicalModelAccess().getVSRSLogicalModelAction_0()); }
	()
	{ after(grammarAccess.getVSRSLogicalModelAccess().getVSRSLogicalModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSLogicalModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSRSLogicalModel__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSLogicalModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSRSLogicalModelAccess().getLogicalModelKeyword_1()); }
	'<LogicalModel/>'
	{ after(grammarAccess.getVSRSLogicalModelAccess().getLogicalModelKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSRSDocument__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSRSDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getIdSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSRSDocumentAccess().getIdSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__IssueAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVSRSDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__RevisionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVSRSDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__DateAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getDateSTRINGTerminalRuleCall_10_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSRSDocumentAccess().getDateSTRINGTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__ParentsAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getParentsVTraceableDocumentCrossReference_12_2_0()); }
		(
			{ before(grammarAccess.getVSRSDocumentAccess().getParentsVTraceableDocumentSTRINGTerminalRuleCall_12_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSRSDocumentAccess().getParentsVTraceableDocumentSTRINGTerminalRuleCall_12_2_0_1()); }
		)
		{ after(grammarAccess.getVSRSDocumentAccess().getParentsVTraceableDocumentCrossReference_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__IntroductionSectionAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getIntroductionSectionVSRSIntroductionParserRuleCall_13_0()); }
		ruleVSRSIntroduction
		{ after(grammarAccess.getVSRSDocumentAccess().getIntroductionSectionVSRSIntroductionParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__ApplicableDocumentsSectionAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getApplicableDocumentsSectionVSRSApplicableDocumentsParserRuleCall_14_0()); }
		ruleVSRSApplicableDocuments
		{ after(grammarAccess.getVSRSDocumentAccess().getApplicableDocumentsSectionVSRSApplicableDocumentsParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__ReferenceDocumentsSectionAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getReferenceDocumentsSectionVSRSReferenceDocumentsParserRuleCall_15_0()); }
		ruleVSRSReferenceDocuments
		{ after(grammarAccess.getVSRSDocumentAccess().getReferenceDocumentsSectionVSRSReferenceDocumentsParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__TermsDefinitionsAbbreviationsSectionAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSRSTermsDefinitionsAbbreviationsParserRuleCall_16_0()); }
		ruleVSRSTermsDefinitionsAbbreviations
		{ after(grammarAccess.getVSRSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSRSTermsDefinitionsAbbreviationsParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__SoftwareOverviewSectionAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getSoftwareOverviewSectionVSRSSoftwareOverviewParserRuleCall_17_0()); }
		ruleVSRSSoftwareOverview
		{ after(grammarAccess.getVSRSDocumentAccess().getSoftwareOverviewSectionVSRSSoftwareOverviewParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__RequirementsSectionAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getRequirementsSectionVSRSRequirementsParserRuleCall_18_0()); }
		ruleVSRSRequirements
		{ after(grammarAccess.getVSRSDocumentAccess().getRequirementsSectionVSRSRequirementsParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocument__LogicalModelsSectionAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentAccess().getLogicalModelsSectionVSRSLogicalModelsParserRuleCall_19_0()); }
		ruleVSRSLogicalModels
		{ after(grammarAccess.getVSRSDocumentAccess().getLogicalModelsSectionVSRSLogicalModelsParserRuleCall_19_0()); }
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

rule__DParagraph__ParagraphContentAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_1_0()); }
		ruleDParagraphContent
		{ after(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__ParagraphAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_1_0()); }
		ruleDParagraph
		{ after(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__SublistAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_2_1_0()); }
		ruleDListContent
		{ after(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__ItemsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_1_0()); }
		ruleDListItem
		{ after(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__ItemsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_1_0()); }
		ruleDListItem
		{ after(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__TextAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_5_0()); }
		ruleDText
		{ after(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_5_0()); }
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

rule__DHyperlink__RunAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_4_0()); }
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

rule__DFigureFromFile__CaptionAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureFromFileAccess().getCaptionSTRINGTerminalRuleCall_5_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDFigureFromFileAccess().getCaptionSTRINGTerminalRuleCall_5_1_0()); }
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

rule__DTableFromFile__CaptionAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTableFromFileAccess().getCaptionSTRINGTerminalRuleCall_5_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDTableFromFileAccess().getCaptionSTRINGTerminalRuleCall_5_1_0()); }
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

rule__DBasicTable__CaptionAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBasicTableAccess().getCaptionSTRINGTerminalRuleCall_3_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDBasicTableAccess().getCaptionSTRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__RowsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_5_0()); }
		ruleDRow
		{ after(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_5_0()); }
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

rule__DCell__GridSpanAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDCellAccess().getGridSpanUINT_STRINGTerminalRuleCall_1_1_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getDCellAccess().getGridSpanUINT_STRINGTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__VMergeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDCellAccess().getVMergeDMergeTypeEnumRuleCall_2_1_0()); }
		ruleDMergeType
		{ after(grammarAccess.getDCellAccess().getVMergeDMergeTypeEnumRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__BodyContentAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_4_0()); }
		ruleDBodyContent
		{ after(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_4_0()); }
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

rule__VSRSFixedSection__BodyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSFixedSectionAccess().getBodyDBodyParserRuleCall_1_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSFixedSectionAccess().getBodyDBodyParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFixedSection__SrsInstatiableSubsectionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSFixedSectionAccess().getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_2_0()); }
		ruleVSRSInstantiableSection
		{ after(grammarAccess.getVSRSFixedSectionAccess().getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSInstantiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSRSInstantiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__BodyAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSInstantiableSectionAccess().getBodyDBodyParserRuleCall_4_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSInstantiableSectionAccess().getBodyDBodyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableSection__SrsInstatiableSubsectionsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSInstantiableSectionAccess().getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_5_0()); }
		ruleVSRSInstantiableSection
		{ after(grammarAccess.getVSRSInstantiableSectionAccess().getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSIntroduction__SrsInstatiableSubsectionsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSIntroductionAccess().getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0()); }
		ruleVSRSInstantiableSection
		{ after(grammarAccess.getVSRSIntroductionAccess().getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSApplicableDocuments__ApplicableDocumentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0()); }
		ruleDApplicableDocument
		{ after(grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSReferenceDocuments__ReferenceDocumentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0()); }
		ruleDReferenceDocument
		{ after(grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__TermsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsVSRSTermParserRuleCall_2_0()); }
		ruleVSRSTerm
		{ after(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsVSRSTermParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__DefinitionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSRSDefinitionParserRuleCall_3_0()); }
		ruleVSRSDefinition
		{ after(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSRSDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTermsDefinitionsAbbreviations__AbbreviationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSRSAbbreviationParserRuleCall_4_0()); }
		ruleVSRSAbbreviation
		{ after(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSRSAbbreviationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__FunctionPurposeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeVSRSFixedSectionParserRuleCall_2_0()); }
		ruleVSRSFixedSection
		{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeVSRSFixedSectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__EnvironmentalConsiderationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsVSRSFixedSectionParserRuleCall_5_0()); }
		ruleVSRSFixedSection
		{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsVSRSFixedSectionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__RelationOtherSystemsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsVSRSFixedSectionParserRuleCall_8_0()); }
		ruleVSRSFixedSection
		{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsVSRSFixedSectionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSoftwareOverview__ConstraintsAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsVSRSFixedSectionParserRuleCall_11_0()); }
		ruleVSRSFixedSection
		{ after(grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsVSRSFixedSectionParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__SectionDescriptionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_1_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__GeneralAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getGeneralVSRSGeneralRequirementsParserRuleCall_2_0()); }
		ruleVSRSGeneralRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getGeneralVSRSGeneralRequirementsParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__FunctionalAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getFunctionalVSRSFunctionalRequirementsParserRuleCall_3_0()); }
		ruleVSRSFunctionalRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getFunctionalVSRSFunctionalRequirementsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__PerformanceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getPerformanceVSRSPerformanceRequirementsParserRuleCall_4_0()); }
		ruleVSRSPerformanceRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getPerformanceVSRSPerformanceRequirementsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__InterfaceAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getInterfaceVSRSInterfaceRequirementsParserRuleCall_5_0()); }
		ruleVSRSInterfaceRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getInterfaceVSRSInterfaceRequirementsParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__OperationalAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getOperationalVSRSOperationalRequirementsParserRuleCall_6_0()); }
		ruleVSRSOperationalRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getOperationalVSRSOperationalRequirementsParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__ResourcesAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getResourcesVSRSResourcesRequirementsParserRuleCall_7_0()); }
		ruleVSRSResourcesRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getResourcesVSRSResourcesRequirementsParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__DesignAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getDesignVSRSDesignRequirementsParserRuleCall_8_0()); }
		ruleVSRSDesignRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getDesignVSRSDesignRequirementsParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__SecurityPrivacyAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getSecurityPrivacyVSRSSecurityPrivacyRequirementsParserRuleCall_9_0()); }
		ruleVSRSSecurityPrivacyRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getSecurityPrivacyVSRSSecurityPrivacyRequirementsParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__PortabilityAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getPortabilityVSRSPortabilityRequirementsParserRuleCall_10_0()); }
		ruleVSRSPortabilityRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getPortabilityVSRSPortabilityRequirementsParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__SwQualityAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getSwQualityVSRSSWQualityRequirementsParserRuleCall_11_0()); }
		ruleVSRSSWQualityRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getSwQualityVSRSSWQualityRequirementsParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__SwReliabiltyAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getSwReliabiltyVSRSSWReliabiltyRequirementsParserRuleCall_12_0()); }
		ruleVSRSSWReliabiltyRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getSwReliabiltyVSRSSWReliabiltyRequirementsParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__SwMaintainabilityAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getSwMaintainabilityVSRSSWMaintainabilityRequirementsParserRuleCall_13_0()); }
		ruleVSRSSWMaintainabilityRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getSwMaintainabilityVSRSSWMaintainabilityRequirementsParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__SwSafetyAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getSwSafetyVSRSSWSafetyRequirementsParserRuleCall_14_0()); }
		ruleVSRSSWSafetyRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getSwSafetyVSRSSWSafetyRequirementsParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__SwConfigurationDeliveryAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getSwConfigurationDeliveryVSRSSWConfigurationDeliveryRequirementsParserRuleCall_15_0()); }
		ruleVSRSSWConfigurationDeliveryRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getSwConfigurationDeliveryVSRSSWConfigurationDeliveryRequirementsParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__DataDefinitionDBAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getDataDefinitionDBVSRSDataDefinitionDBRequirementsParserRuleCall_16_0()); }
		ruleVSRSDataDefinitionDBRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getDataDefinitionDBVSRSDataDefinitionDBRequirementsParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__HumanFactorsAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getHumanFactorsVSRSHumanFactorsRequirementsParserRuleCall_17_0()); }
		ruleVSRSHumanFactorsRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getHumanFactorsVSRSHumanFactorsRequirementsParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSRequirements__AdaptationInstallationAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSRequirementsAccess().getAdaptationInstallationVSRSAdaptationInstallationRequirementsParserRuleCall_18_0()); }
		ruleVSRSAdaptationInstallationRequirements
		{ after(grammarAccess.getVSRSRequirementsAccess().getAdaptationInstallationVSRSAdaptationInstallationRequirementsParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSLogicalModels__LogicalModelsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsVSRSLogicalModelParserRuleCall_2_0()); }
		ruleVSRSLogicalModel
		{ after(grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsVSRSLogicalModelParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSTermAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSRSTermAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSTerm__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSTermAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSRSTermAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSRSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDefinition__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSRSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSRSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAbbreviation__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSRSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__SectionDescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSectionDescriptionDBodyParserRuleCall_4_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSectionDescriptionDBodyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInstantiableRequirementSection__SrsItemsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSrsItemsVSRSDocumentItemParserRuleCall_5_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSrsItemsVSRSDocumentItemParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSGeneralRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSGeneralRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSGeneralRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSFunctionalRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSFunctionalRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSFunctionalRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSPerformanceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSPerformanceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPerformanceRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSInterfaceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSInterfaceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSInterfaceRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSOperationalRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSOperationalRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSOperationalRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSResourcesRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSResourcesRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSResourcesRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDesignRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSDesignRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDesignRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSDesignRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDesignRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDesignRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSDesignRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSecurityPrivacyRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSPortabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSPortabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSPortabilityRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWQualityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSSWQualityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWQualityRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWReliabiltyRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWMaintainabilityRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWSafetyRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSSWConfigurationDeliveryRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDataDefinitionDBRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSHumanFactorsRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__SrsItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
		ruleVSRSDocumentItem
		{ after(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsItemsVSRSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSAdaptationInstallationRequirements__SrsRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSRSInstantiableRequirementSection
		{ after(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentItemAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSRSDocumentItemAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__ValidationMethodAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentItemAccess().getValidationMethodVValidationMethodEnumRuleCall_4_0()); }
		ruleVValidationMethod
		{ after(grammarAccess.getVSRSDocumentItemAccess().getValidationMethodVValidationMethodEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__ModeAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentItemAccess().getModeVSRSDocumentItemModesEnumRuleCall_6_2_0()); }
		ruleVSRSDocumentItemModes
		{ after(grammarAccess.getVSRSDocumentItemAccess().getModeVSRSDocumentItemModesEnumRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__DescriptionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentItemAccess().getDescriptionDBodyParserRuleCall_8_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSDocumentItemAccess().getDescriptionDBodyParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__ExtendedDescriptionAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionDBodyParserRuleCall_10_1_0()); }
		ruleDBody
		{ after(grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionDBodyParserRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSRSDocumentItem__ParentItemAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSRSDocumentItemAccess().getParentItemVTraceableDocumentAbstractItemCrossReference_11_2_0()); }
		(
			{ before(grammarAccess.getVSRSDocumentItemAccess().getParentItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_11_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSRSDocumentItemAccess().getParentItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_11_2_0_1()); }
		)
		{ after(grammarAccess.getVSRSDocumentItemAccess().getParentItemVTraceableDocumentAbstractItemCrossReference_11_2_0()); }
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
