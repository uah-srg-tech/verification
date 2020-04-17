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
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.sss.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.sss.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.micobs.svm.lang.sss.services.SSSGrammarAccess;

}
@parser::members {
	private SSSGrammarAccess grammarAccess;

	public void setGrammarAccess(SSSGrammarAccess grammarAccess) {
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

// Entry rule entryRuleVSSSDocument
entryRuleVSSSDocument
:
{ before(grammarAccess.getVSSSDocumentRule()); }
	 ruleVSSSDocument
{ after(grammarAccess.getVSSSDocumentRule()); } 
	 EOF 
;

// Rule VSSSDocument
ruleVSSSDocument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getGroup()); }
		(rule__VSSSDocument__Group__0)
		{ after(grammarAccess.getVSSSDocumentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSTBCsTBDs
entryRuleVSSTBCsTBDs
:
{ before(grammarAccess.getVSSTBCsTBDsRule()); }
	 ruleVSSTBCsTBDs
{ after(grammarAccess.getVSSTBCsTBDsRule()); } 
	 EOF 
;

// Rule VSSTBCsTBDs
ruleVSSTBCsTBDs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSTBCsTBDsAccess().getGroup()); }
		(rule__VSSTBCsTBDs__Group__0)
		{ after(grammarAccess.getVSSTBCsTBDsAccess().getGroup()); }
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

// Entry rule entryRuleVSSSFixedSection
entryRuleVSSSFixedSection
:
{ before(grammarAccess.getVSSSFixedSectionRule()); }
	 ruleVSSSFixedSection
{ after(grammarAccess.getVSSSFixedSectionRule()); } 
	 EOF 
;

// Rule VSSSFixedSection
ruleVSSSFixedSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSFixedSectionAccess().getGroup()); }
		(rule__VSSSFixedSection__Group__0)
		{ after(grammarAccess.getVSSSFixedSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSInstatiableSection
entryRuleVSSSInstatiableSection
:
{ before(grammarAccess.getVSSSInstatiableSectionRule()); }
	 ruleVSSSInstatiableSection
{ after(grammarAccess.getVSSSInstatiableSectionRule()); } 
	 EOF 
;

// Rule VSSSInstatiableSection
ruleVSSSInstatiableSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSInstatiableSectionAccess().getGroup()); }
		(rule__VSSSInstatiableSection__Group__0)
		{ after(grammarAccess.getVSSSInstatiableSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSIntroduction
entryRuleVSSSIntroduction
:
{ before(grammarAccess.getVSSSIntroductionRule()); }
	 ruleVSSSIntroduction
{ after(grammarAccess.getVSSSIntroductionRule()); } 
	 EOF 
;

// Rule VSSSIntroduction
ruleVSSSIntroduction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getGroup()); }
		(rule__VSSSIntroduction__Group__0)
		{ after(grammarAccess.getVSSSIntroductionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSApplicableDocuments
entryRuleVSSSApplicableDocuments
:
{ before(grammarAccess.getVSSSApplicableDocumentsRule()); }
	 ruleVSSSApplicableDocuments
{ after(grammarAccess.getVSSSApplicableDocumentsRule()); } 
	 EOF 
;

// Rule VSSSApplicableDocuments
ruleVSSSApplicableDocuments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getGroup()); }
		(rule__VSSSApplicableDocuments__Group__0)
		{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSReferenceDocuments
entryRuleVSSSReferenceDocuments
:
{ before(grammarAccess.getVSSSReferenceDocumentsRule()); }
	 ruleVSSSReferenceDocuments
{ after(grammarAccess.getVSSSReferenceDocumentsRule()); } 
	 EOF 
;

// Rule VSSSReferenceDocuments
ruleVSSSReferenceDocuments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getGroup()); }
		(rule__VSSSReferenceDocuments__Group__0)
		{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSTermsDefinitionsAbbreviations
entryRuleVSSSTermsDefinitionsAbbreviations
:
{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule()); }
	 ruleVSSSTermsDefinitionsAbbreviations
{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule()); } 
	 EOF 
;

// Rule VSSSTermsDefinitionsAbbreviations
ruleVSSSTermsDefinitionsAbbreviations 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup()); }
		(rule__VSSSTermsDefinitionsAbbreviations__Group__0)
		{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSGeneralDescription
entryRuleVSSSGeneralDescription
:
{ before(grammarAccess.getVSSSGeneralDescriptionRule()); }
	 ruleVSSSGeneralDescription
{ after(grammarAccess.getVSSSGeneralDescriptionRule()); } 
	 EOF 
;

// Rule VSSSGeneralDescription
ruleVSSSGeneralDescription 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGroup()); }
		(rule__VSSSGeneralDescription__Group__0)
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSpecificRequirements
entryRuleVSSSSpecificRequirements
:
{ before(grammarAccess.getVSSSSpecificRequirementsRule()); }
	 ruleVSSSSpecificRequirements
{ after(grammarAccess.getVSSSSpecificRequirementsRule()); } 
	 EOF 
;

// Rule VSSSSpecificRequirements
ruleVSSSSpecificRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup()); }
		(rule__VSSSSpecificRequirements__Group__0)
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSVerificationValidationIntegrationRequirements
entryRuleVSSSVerificationValidationIntegrationRequirements
:
{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule()); }
	 ruleVSSSVerificationValidationIntegrationRequirements
{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule()); } 
	 EOF 
;

// Rule VSSSVerificationValidationIntegrationRequirements
ruleVSSSVerificationValidationIntegrationRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup()); }
		(rule__VSSSVerificationValidationIntegrationRequirements__Group__0)
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSystemModels
entryRuleVSSSSystemModels
:
{ before(grammarAccess.getVSSSSystemModelsRule()); }
	 ruleVSSSSystemModels
{ after(grammarAccess.getVSSSSystemModelsRule()); } 
	 EOF 
;

// Rule VSSSSystemModels
ruleVSSSSystemModels 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSystemModelsAccess().getGroup()); }
		(rule__VSSSSystemModels__Group__0)
		{ after(grammarAccess.getVSSSSystemModelsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSTerm
entryRuleVSSSTerm
:
{ before(grammarAccess.getVSSSTermRule()); }
	 ruleVSSSTerm
{ after(grammarAccess.getVSSSTermRule()); } 
	 EOF 
;

// Rule VSSSTerm
ruleVSSSTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSTermAccess().getGroup()); }
		(rule__VSSSTerm__Group__0)
		{ after(grammarAccess.getVSSSTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSDefinition
entryRuleVSSSDefinition
:
{ before(grammarAccess.getVSSSDefinitionRule()); }
	 ruleVSSSDefinition
{ after(grammarAccess.getVSSSDefinitionRule()); } 
	 EOF 
;

// Rule VSSSDefinition
ruleVSSSDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSDefinitionAccess().getGroup()); }
		(rule__VSSSDefinition__Group__0)
		{ after(grammarAccess.getVSSSDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSAbbreviation
entryRuleVSSSAbbreviation
:
{ before(grammarAccess.getVSSSAbbreviationRule()); }
	 ruleVSSSAbbreviation
{ after(grammarAccess.getVSSSAbbreviationRule()); } 
	 EOF 
;

// Rule VSSSAbbreviation
ruleVSSSAbbreviation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSAbbreviationAccess().getGroup()); }
		(rule__VSSSAbbreviation__Group__0)
		{ after(grammarAccess.getVSSSAbbreviationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSInstantiableRequirementSection
entryRuleVSSSInstantiableRequirementSection
:
{ before(grammarAccess.getVSSSInstantiableRequirementSectionRule()); }
	 ruleVSSSInstantiableRequirementSection
{ after(grammarAccess.getVSSSInstantiableRequirementSectionRule()); } 
	 EOF 
;

// Rule VSSSInstantiableRequirementSection
ruleVSSSInstantiableRequirementSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getGroup()); }
		(rule__VSSSInstantiableRequirementSection__Group__0)
		{ after(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSGeneralRequirements
entryRuleVSSSGeneralRequirements
:
{ before(grammarAccess.getVSSSGeneralRequirementsRule()); }
	 ruleVSSSGeneralRequirements
{ after(grammarAccess.getVSSSGeneralRequirementsRule()); } 
	 EOF 
;

// Rule VSSSGeneralRequirements
ruleVSSSGeneralRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getGroup()); }
		(rule__VSSSGeneralRequirements__Group__0)
		{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSCapabilitiesRequirements
entryRuleVSSSCapabilitiesRequirements
:
{ before(grammarAccess.getVSSSCapabilitiesRequirementsRule()); }
	 ruleVSSSCapabilitiesRequirements
{ after(grammarAccess.getVSSSCapabilitiesRequirementsRule()); } 
	 EOF 
;

// Rule VSSSCapabilitiesRequirements
ruleVSSSCapabilitiesRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getGroup()); }
		(rule__VSSSCapabilitiesRequirements__Group__0)
		{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSystemInterfaceRequirements
entryRuleVSSSSystemInterfaceRequirements
:
{ before(grammarAccess.getVSSSSystemInterfaceRequirementsRule()); }
	 ruleVSSSSystemInterfaceRequirements
{ after(grammarAccess.getVSSSSystemInterfaceRequirementsRule()); } 
	 EOF 
;

// Rule VSSSSystemInterfaceRequirements
ruleVSSSSystemInterfaceRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getGroup()); }
		(rule__VSSSSystemInterfaceRequirements__Group__0)
		{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSAdaptationMissionizationRequirements
entryRuleVSSSAdaptationMissionizationRequirements
:
{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsRule()); }
	 ruleVSSSAdaptationMissionizationRequirements
{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsRule()); } 
	 EOF 
;

// Rule VSSSAdaptationMissionizationRequirements
ruleVSSSAdaptationMissionizationRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getGroup()); }
		(rule__VSSSAdaptationMissionizationRequirements__Group__0)
		{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSComputerResourceRequirements
entryRuleVSSSComputerResourceRequirements
:
{ before(grammarAccess.getVSSSComputerResourceRequirementsRule()); }
	 ruleVSSSComputerResourceRequirements
{ after(grammarAccess.getVSSSComputerResourceRequirementsRule()); } 
	 EOF 
;

// Rule VSSSComputerResourceRequirements
ruleVSSSComputerResourceRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getGroup()); }
		(rule__VSSSComputerResourceRequirements__Group__0)
		{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSecurityRequirements
entryRuleVSSSSecurityRequirements
:
{ before(grammarAccess.getVSSSSecurityRequirementsRule()); }
	 ruleVSSSSecurityRequirements
{ after(grammarAccess.getVSSSSecurityRequirementsRule()); } 
	 EOF 
;

// Rule VSSSSecurityRequirements
ruleVSSSSecurityRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getGroup()); }
		(rule__VSSSSecurityRequirements__Group__0)
		{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSafetyRequirements
entryRuleVSSSSafetyRequirements
:
{ before(grammarAccess.getVSSSSafetyRequirementsRule()); }
	 ruleVSSSSafetyRequirements
{ after(grammarAccess.getVSSSSafetyRequirementsRule()); } 
	 EOF 
;

// Rule VSSSSafetyRequirements
ruleVSSSSafetyRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getGroup()); }
		(rule__VSSSSafetyRequirements__Group__0)
		{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSReliabilityAvailabilityRequirements
entryRuleVSSSReliabilityAvailabilityRequirements
:
{ before(grammarAccess.getVSSSReliabilityAvailabilityRequirementsRule()); }
	 ruleVSSSReliabilityAvailabilityRequirements
{ after(grammarAccess.getVSSSReliabilityAvailabilityRequirementsRule()); } 
	 EOF 
;

// Rule VSSSReliabilityAvailabilityRequirements
ruleVSSSReliabilityAvailabilityRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getGroup()); }
		(rule__VSSSReliabilityAvailabilityRequirements__Group__0)
		{ after(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSQualityRequirements
entryRuleVSSSQualityRequirements
:
{ before(grammarAccess.getVSSSQualityRequirementsRule()); }
	 ruleVSSSQualityRequirements
{ after(grammarAccess.getVSSSQualityRequirementsRule()); } 
	 EOF 
;

// Rule VSSSQualityRequirements
ruleVSSSQualityRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSQualityRequirementsAccess().getGroup()); }
		(rule__VSSSQualityRequirements__Group__0)
		{ after(grammarAccess.getVSSSQualityRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSDesignRequirements
entryRuleVSSSDesignRequirements
:
{ before(grammarAccess.getVSSSDesignRequirementsRule()); }
	 ruleVSSSDesignRequirements
{ after(grammarAccess.getVSSSDesignRequirementsRule()); } 
	 EOF 
;

// Rule VSSSDesignRequirements
ruleVSSSDesignRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSDesignRequirementsAccess().getGroup()); }
		(rule__VSSSDesignRequirements__Group__0)
		{ after(grammarAccess.getVSSSDesignRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSoftwareOperationsRequirements
entryRuleVSSSSoftwareOperationsRequirements
:
{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsRule()); }
	 ruleVSSSSoftwareOperationsRequirements
{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsRule()); } 
	 EOF 
;

// Rule VSSSSoftwareOperationsRequirements
ruleVSSSSoftwareOperationsRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getGroup()); }
		(rule__VSSSSoftwareOperationsRequirements__Group__0)
		{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSoftwareMaintenanceRequirements
entryRuleVSSSSoftwareMaintenanceRequirements
:
{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsRule()); }
	 ruleVSSSSoftwareMaintenanceRequirements
{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsRule()); } 
	 EOF 
;

// Rule VSSSSoftwareMaintenanceRequirements
ruleVSSSSoftwareMaintenanceRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getGroup()); }
		(rule__VSSSSoftwareMaintenanceRequirements__Group__0)
		{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSystemSoftwareObservabilityRequirements
entryRuleVSSSSystemSoftwareObservabilityRequirements
:
{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsRule()); }
	 ruleVSSSSystemSoftwareObservabilityRequirements
{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsRule()); } 
	 EOF 
;

// Rule VSSSSystemSoftwareObservabilityRequirements
ruleVSSSSystemSoftwareObservabilityRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getGroup()); }
		(rule__VSSSSystemSoftwareObservabilityRequirements__Group__0)
		{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSDocumentItem
entryRuleVSSSDocumentItem
:
{ before(grammarAccess.getVSSSDocumentItemRule()); }
	 ruleVSSSDocumentItem
{ after(grammarAccess.getVSSSDocumentItemRule()); } 
	 EOF 
;

// Rule VSSSDocumentItem
ruleVSSSDocumentItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSDocumentItemAccess().getGroup()); }
		(rule__VSSSDocumentItem__Group__0)
		{ after(grammarAccess.getVSSSDocumentItemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSVerificationValidationProcessRequirements
entryRuleVSSSVerificationValidationProcessRequirements
:
{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementsRule()); }
	 ruleVSSSVerificationValidationProcessRequirements
{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementsRule()); } 
	 EOF 
;

// Rule VSSSVerificationValidationProcessRequirements
ruleVSSSVerificationValidationProcessRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getGroup()); }
		(rule__VSSSVerificationValidationProcessRequirements__Group__0)
		{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSValidationApproach
entryRuleVSSSValidationApproach
:
{ before(grammarAccess.getVSSSValidationApproachRule()); }
	 ruleVSSSValidationApproach
{ after(grammarAccess.getVSSSValidationApproachRule()); } 
	 EOF 
;

// Rule VSSSValidationApproach
ruleVSSSValidationApproach 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSValidationApproachAccess().getGroup()); }
		(rule__VSSSValidationApproach__Group__0)
		{ after(grammarAccess.getVSSSValidationApproachAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSValidationRequirements
entryRuleVSSSValidationRequirements
:
{ before(grammarAccess.getVSSSValidationRequirementsRule()); }
	 ruleVSSSValidationRequirements
{ after(grammarAccess.getVSSSValidationRequirementsRule()); } 
	 EOF 
;

// Rule VSSSValidationRequirements
ruleVSSSValidationRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSValidationRequirementsAccess().getGroup()); }
		(rule__VSSSValidationRequirements__Group__0)
		{ after(grammarAccess.getVSSSValidationRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSVerificationRequirements
entryRuleVSSSVerificationRequirements
:
{ before(grammarAccess.getVSSSVerificationRequirementsRule()); }
	 ruleVSSSVerificationRequirements
{ after(grammarAccess.getVSSSVerificationRequirementsRule()); } 
	 EOF 
;

// Rule VSSSVerificationRequirements
ruleVSSSVerificationRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSVerificationRequirementsAccess().getGroup()); }
		(rule__VSSSVerificationRequirements__Group__0)
		{ after(grammarAccess.getVSSSVerificationRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSystemModel
entryRuleVSSSSystemModel
:
{ before(grammarAccess.getVSSSSystemModelRule()); }
	 ruleVSSSSystemModel
{ after(grammarAccess.getVSSSSystemModelRule()); } 
	 EOF 
;

// Rule VSSSSystemModel
ruleVSSSSystemModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSystemModelAccess().getGroup()); }
		(rule__VSSSSystemModel__Group__0)
		{ after(grammarAccess.getVSSSSystemModelAccess().getGroup()); }
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

rule__VSSSDocument__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__0__Impl
	rule__VSSSDocument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getSSSKeyword_0()); }
	'<SSS'
	{ after(grammarAccess.getVSSSDocumentAccess().getSSSKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__1__Impl
	rule__VSSSDocument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSSSDocumentAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__2__Impl
	rule__VSSSDocument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getNameAssignment_2()); }
	(rule__VSSSDocument__NameAssignment_2)
	{ after(grammarAccess.getVSSSDocumentAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__3__Impl
	rule__VSSSDocument__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getIdKeyword_3()); }
	'id='
	{ after(grammarAccess.getVSSSDocumentAccess().getIdKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__4__Impl
	rule__VSSSDocument__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getIdAssignment_4()); }
	(rule__VSSSDocument__IdAssignment_4)
	{ after(grammarAccess.getVSSSDocumentAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__5__Impl
	rule__VSSSDocument__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getIssueKeyword_5()); }
	'issue='
	{ after(grammarAccess.getVSSSDocumentAccess().getIssueKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__6__Impl
	rule__VSSSDocument__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getIssueAssignment_6()); }
	(rule__VSSSDocument__IssueAssignment_6)
	{ after(grammarAccess.getVSSSDocumentAccess().getIssueAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__7__Impl
	rule__VSSSDocument__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getRevisionKeyword_7()); }
	'revision='
	{ after(grammarAccess.getVSSSDocumentAccess().getRevisionKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__8__Impl
	rule__VSSSDocument__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getRevisionAssignment_8()); }
	(rule__VSSSDocument__RevisionAssignment_8)
	{ after(grammarAccess.getVSSSDocumentAccess().getRevisionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__9__Impl
	rule__VSSSDocument__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getDateKeyword_9()); }
	'date='
	{ after(grammarAccess.getVSSSDocumentAccess().getDateKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__10__Impl
	rule__VSSSDocument__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getDateAssignment_10()); }
	(rule__VSSSDocument__DateAssignment_10)
	{ after(grammarAccess.getVSSSDocumentAccess().getDateAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__11__Impl
	rule__VSSSDocument__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getGreaterThanSignKeyword_11()); }
	'>'
	{ after(grammarAccess.getVSSSDocumentAccess().getGreaterThanSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__12__Impl
	rule__VSSSDocument__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getTbcsTbdsSectionAssignment_12()); }
	(rule__VSSSDocument__TbcsTbdsSectionAssignment_12)?
	{ after(grammarAccess.getVSSSDocumentAccess().getTbcsTbdsSectionAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__13__Impl
	rule__VSSSDocument__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionAssignment_13()); }
	(rule__VSSSDocument__IntroductionSectionAssignment_13)
	{ after(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__14__Impl
	rule__VSSSDocument__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionAssignment_14()); }
	(rule__VSSSDocument__ApplicableDocumentsSectionAssignment_14)
	{ after(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__15__Impl
	rule__VSSSDocument__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionAssignment_15()); }
	(rule__VSSSDocument__ReferenceDocumentsSectionAssignment_15)
	{ after(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionAssignment_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__16__Impl
	rule__VSSSDocument__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_16()); }
	(rule__VSSSDocument__TermsDefinitionsAbbreviationsSectionAssignment_16)
	{ after(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__17__Impl
	rule__VSSSDocument__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionAssignment_17()); }
	(rule__VSSSDocument__GeneralDescriptionSectionAssignment_17)
	{ after(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__18__Impl
	rule__VSSSDocument__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionAssignment_18()); }
	(rule__VSSSDocument__SpecificRequirementsSectionAssignment_18)
	{ after(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__19__Impl
	rule__VSSSDocument__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionAssignment_19()); }
	(rule__VSSSDocument__VerificationValidationIntegrationSectionAssignment_19)
	{ after(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__20__Impl
	rule__VSSSDocument__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionAssignment_20()); }
	(rule__VSSSDocument__SystemModelsSectionAssignment_20)
	{ after(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__21__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getSSSKeyword_21()); }
	'</SSS>'
	{ after(grammarAccess.getVSSSDocumentAccess().getSSSKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSTBCsTBDs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSTBCsTBDs__Group__0__Impl
	rule__VSSTBCsTBDs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSTBCsTBDs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSTBCsTBDsAccess().getVSSSTBCsTBDsAction_0()); }
	()
	{ after(grammarAccess.getVSSTBCsTBDsAccess().getVSSSTBCsTBDsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSTBCsTBDs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSTBCsTBDs__Group__1__Impl
	rule__VSSTBCsTBDs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSTBCsTBDs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSTBCsTBDsAccess().getTBCsTBDsKeyword_1()); }
	'<TBCsTBDs>'
	{ after(grammarAccess.getVSSTBCsTBDsAccess().getTBCsTBDsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSTBCsTBDs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSTBCsTBDs__Group__2__Impl
	rule__VSSTBCsTBDs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSTBCsTBDs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSTBCsTBDsAccess().getTbcsAssignment_2()); }
	(rule__VSSTBCsTBDs__TbcsAssignment_2)*
	{ after(grammarAccess.getVSSTBCsTBDsAccess().getTbcsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSTBCsTBDs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSTBCsTBDs__Group__3__Impl
	rule__VSSTBCsTBDs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSTBCsTBDs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSTBCsTBDsAccess().getTbdsAssignment_3()); }
	(rule__VSSTBCsTBDs__TbdsAssignment_3)*
	{ after(grammarAccess.getVSSTBCsTBDsAccess().getTbdsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSTBCsTBDs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSTBCsTBDs__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSTBCsTBDs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSTBCsTBDsAccess().getTBCsTBDsKeyword_4()); }
	'</TBCsTBDs>'
	{ after(grammarAccess.getVSSTBCsTBDsAccess().getTBCsTBDsKeyword_4()); }
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
	{ before(grammarAccess.getDTBCAccess().getDescriptionKeyword_3()); }
	'description='
	{ after(grammarAccess.getDTBCAccess().getDescriptionKeyword_3()); }
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
	rule__DTBC__Group__5
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
	{ before(grammarAccess.getDTBCAccess().getDescriptionAssignment_4()); }
	(rule__DTBC__DescriptionAssignment_4)
	{ after(grammarAccess.getDTBCAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBC__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBC__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBCAccess().getSolidusGreaterThanSignKeyword_5()); }
	'/>'
	{ after(grammarAccess.getDTBCAccess().getSolidusGreaterThanSignKeyword_5()); }
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
	{ before(grammarAccess.getDTBDAccess().getDescriptionKeyword_3()); }
	'description='
	{ after(grammarAccess.getDTBDAccess().getDescriptionKeyword_3()); }
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
	rule__DTBD__Group__5
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
	{ before(grammarAccess.getDTBDAccess().getDescriptionAssignment_4()); }
	(rule__DTBD__DescriptionAssignment_4)
	{ after(grammarAccess.getDTBDAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DTBD__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DTBD__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTBDAccess().getSolidusGreaterThanSignKeyword_5()); }
	'/>'
	{ after(grammarAccess.getDTBDAccess().getSolidusGreaterThanSignKeyword_5()); }
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


rule__VSSSFixedSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSFixedSection__Group__0__Impl
	rule__VSSSFixedSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSFixedSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSFixedSectionAccess().getVSSSFixedSectionAction_0()); }
	()
	{ after(grammarAccess.getVSSSFixedSectionAccess().getVSSSFixedSectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSFixedSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSFixedSection__Group__1__Impl
	rule__VSSSFixedSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSFixedSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSFixedSectionAccess().getBodyAssignment_1()); }
	(rule__VSSSFixedSection__BodyAssignment_1)?
	{ after(grammarAccess.getVSSSFixedSectionAccess().getBodyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSFixedSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSFixedSection__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSFixedSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSFixedSectionAccess().getSssInstatiableSubsectionsAssignment_2()); }
	(rule__VSSSFixedSection__SssInstatiableSubsectionsAssignment_2)*
	{ after(grammarAccess.getVSSSFixedSectionAccess().getSssInstatiableSubsectionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSInstatiableSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstatiableSection__Group__0__Impl
	rule__VSSSInstatiableSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstatiableSectionAccess().getSubsectionKeyword_0()); }
	'<subsection'
	{ after(grammarAccess.getVSSSInstatiableSectionAccess().getSubsectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstatiableSection__Group__1__Impl
	rule__VSSSInstatiableSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstatiableSectionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSSSInstatiableSectionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstatiableSection__Group__2__Impl
	rule__VSSSInstatiableSection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstatiableSectionAccess().getNameAssignment_2()); }
	(rule__VSSSInstatiableSection__NameAssignment_2)
	{ after(grammarAccess.getVSSSInstatiableSectionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstatiableSection__Group__3__Impl
	rule__VSSSInstatiableSection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstatiableSectionAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSSSInstatiableSectionAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstatiableSection__Group__4__Impl
	rule__VSSSInstatiableSection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstatiableSectionAccess().getBodyAssignment_4()); }
	(rule__VSSSInstatiableSection__BodyAssignment_4)?
	{ after(grammarAccess.getVSSSInstatiableSectionAccess().getBodyAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstatiableSection__Group__5__Impl
	rule__VSSSInstatiableSection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstatiableSectionAccess().getSssInstatiableSubsectionsAssignment_5()); }
	(rule__VSSSInstatiableSection__SssInstatiableSubsectionsAssignment_5)*
	{ after(grammarAccess.getVSSSInstatiableSectionAccess().getSssInstatiableSubsectionsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstatiableSection__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstatiableSectionAccess().getSubsectionKeyword_6()); }
	'</subsection>'
	{ after(grammarAccess.getVSSSInstatiableSectionAccess().getSubsectionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSIntroduction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__0__Impl
	rule__VSSSIntroduction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getIntroductionKeyword_0()); }
	'<Introduction>'
	{ after(grammarAccess.getVSSSIntroductionAccess().getIntroductionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__1__Impl
	rule__VSSSIntroduction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getSssInstatiableSubsectionsAssignment_1()); }
		(rule__VSSSIntroduction__SssInstatiableSubsectionsAssignment_1)
		{ after(grammarAccess.getVSSSIntroductionAccess().getSssInstatiableSubsectionsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getSssInstatiableSubsectionsAssignment_1()); }
		(rule__VSSSIntroduction__SssInstatiableSubsectionsAssignment_1)*
		{ after(grammarAccess.getVSSSIntroductionAccess().getSssInstatiableSubsectionsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getIntroductionKeyword_2()); }
	'</Introduction>'
	{ after(grammarAccess.getVSSSIntroductionAccess().getIntroductionKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSApplicableDocuments__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group__0__Impl
	rule__VSSSApplicableDocuments__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getVSSSApplicableDocumentsAction_0()); }
	()
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getVSSSApplicableDocumentsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group__1__Impl
	rule__VSSSApplicableDocuments__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsKeyword_1()); }
	'<ApplicableDocuments>'
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group__2__Impl
	rule__VSSSApplicableDocuments__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsAssignment_2()); }
	(rule__VSSSApplicableDocuments__ApplicableDocumentsAssignment_2)*
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3()); }
	'</ApplicableDocuments>'
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSReferenceDocuments__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group__0__Impl
	rule__VSSSReferenceDocuments__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getVSSSReferenceDocumentsAction_0()); }
	()
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getVSSSReferenceDocumentsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group__1__Impl
	rule__VSSSReferenceDocuments__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsKeyword_1()); }
	'<ReferenceDocuments>'
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group__2__Impl
	rule__VSSSReferenceDocuments__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsAssignment_2()); }
	(rule__VSSSReferenceDocuments__ReferenceDocumentsAssignment_2)*
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3()); }
	'</ReferenceDocuments>'
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSTermsDefinitionsAbbreviations__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group__0__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getVSSSTermsDefinitionsAbbreviationsAction_0()); }
	()
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getVSSSTermsDefinitionsAbbreviationsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group__1__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1()); }
	'<TermsDefinitionsAbbreviations>'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group__2__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2()); }
	(rule__VSSSTermsDefinitionsAbbreviations__TermsAssignment_2)*
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group__3__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3()); }
	(rule__VSSSTermsDefinitionsAbbreviations__DefinitionsAssignment_3)*
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group__4__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4()); }
	(rule__VSSSTermsDefinitionsAbbreviations__AbbreviationsAssignment_4)*
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5()); }
	'</TermsDefinitionsAbbreviations>'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSGeneralDescription__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__0__Impl
	rule__VSSSGeneralDescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralDescriptionKeyword_0()); }
	'<GeneralDescription>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralDescriptionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__1__Impl
	rule__VSSSGeneralDescription__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_1()); }
	'<ProductPerspective>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__2__Impl
	rule__VSSSGeneralDescription__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveAssignment_2()); }
	(rule__VSSSGeneralDescription__ProductPerspectiveAssignment_2)
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__3__Impl
	rule__VSSSGeneralDescription__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_3()); }
	'</ProductPerspective>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__4__Impl
	rule__VSSSGeneralDescription__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesKeyword_4()); }
	'<GeneralCapabilities>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__5__Impl
	rule__VSSSGeneralDescription__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesAssignment_5()); }
	(rule__VSSSGeneralDescription__GeneralCapabilitiesAssignment_5)
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__6__Impl
	rule__VSSSGeneralDescription__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesKeyword_6()); }
	'</GeneralCapabilities>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__7__Impl
	rule__VSSSGeneralDescription__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_7()); }
	'<GeneralConstraints>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__8__Impl
	rule__VSSSGeneralDescription__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsAssignment_8()); }
	(rule__VSSSGeneralDescription__GeneralConstraintsAssignment_8)
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__9__Impl
	rule__VSSSGeneralDescription__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_9()); }
	'</GeneralConstraints>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__10__Impl
	rule__VSSSGeneralDescription__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_10()); }
	'<OperationalEnvironment>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__11__Impl
	rule__VSSSGeneralDescription__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentAssignment_11()); }
	(rule__VSSSGeneralDescription__OperationalEnvironmentAssignment_11)
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__12__Impl
	rule__VSSSGeneralDescription__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_12()); }
	'</OperationalEnvironment>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__13__Impl
	rule__VSSSGeneralDescription__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_13()); }
	'<AssumptionsDependencies>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__14__Impl
	rule__VSSSGeneralDescription__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesAssignment_14()); }
	(rule__VSSSGeneralDescription__AssumptionsDependenciesAssignment_14)
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__15__Impl
	rule__VSSSGeneralDescription__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_15()); }
	'</AssumptionsDependencies>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescription__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralDescriptionKeyword_16()); }
	'</GeneralDescription>'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralDescriptionKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__0__Impl
	rule__VSSSSpecificRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSpecificRequirementsKeyword_0()); }
	'<SpecificRequirements>'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSpecificRequirementsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__1__Impl
	rule__VSSSSpecificRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSectionDescriptionAssignment_1()); }
	(rule__VSSSSpecificRequirements__SectionDescriptionAssignment_1)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSectionDescriptionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__2__Impl
	rule__VSSSSpecificRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_2()); }
	(rule__VSSSSpecificRequirements__GeneralAssignment_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__3__Impl
	rule__VSSSSpecificRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_3()); }
	(rule__VSSSSpecificRequirements__CapabilitiesAssignment_3)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__4__Impl
	rule__VSSSSpecificRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_4()); }
	(rule__VSSSSpecificRequirements__SystemInterfaceAssignment_4)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__5__Impl
	rule__VSSSSpecificRequirements__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_5()); }
	(rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_5)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__6__Impl
	rule__VSSSSpecificRequirements__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_6()); }
	(rule__VSSSSpecificRequirements__ComputerResourceAssignment_6)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__7__Impl
	rule__VSSSSpecificRequirements__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_7()); }
	(rule__VSSSSpecificRequirements__SecurityAssignment_7)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__8__Impl
	rule__VSSSSpecificRequirements__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_8()); }
	(rule__VSSSSpecificRequirements__SafetyAssignment_8)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__9__Impl
	rule__VSSSSpecificRequirements__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabilityAvailabilityAssignment_9()); }
	(rule__VSSSSpecificRequirements__ReliabilityAvailabilityAssignment_9)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabilityAvailabilityAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__10__Impl
	rule__VSSSSpecificRequirements__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_10()); }
	(rule__VSSSSpecificRequirements__QualityAssignment_10)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__11__Impl
	rule__VSSSSpecificRequirements__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_11()); }
	(rule__VSSSSpecificRequirements__DesignAssignment_11)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__12__Impl
	rule__VSSSSpecificRequirements__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_12()); }
	(rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_12)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__13__Impl
	rule__VSSSSpecificRequirements__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_13()); }
	(rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_13)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__14__Impl
	rule__VSSSSpecificRequirements__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_14()); }
	(rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_14)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSpecificRequirementsKeyword_15()); }
	'</SpecificRequirements>'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSpecificRequirementsKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationIntegrationRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group__0__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationIntegrationRequirementsKeyword_0()); }
	'<VerificationValidationIntegrationRequirements>'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationIntegrationRequirementsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group__1__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getSectionDescriptionAssignment_1()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__SectionDescriptionAssignment_1)?
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getSectionDescriptionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group__2__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_2()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_2)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group__3__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_3()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_3)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group__4__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_4()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_4)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group__5__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_5()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_5)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationIntegrationRequirementsKeyword_6()); }
	'</VerificationValidationIntegrationRequirements>'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationIntegrationRequirementsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSystemModels__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModels__Group__0__Impl
	rule__VSSSSystemModels__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelsAccess().getVSSSSystemModelsAction_0()); }
	()
	{ after(grammarAccess.getVSSSSystemModelsAccess().getVSSSSystemModelsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModels__Group__1__Impl
	rule__VSSSSystemModels__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsKeyword_1()); }
	'<SystemModels>'
	{ after(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModels__Group__2__Impl
	rule__VSSSSystemModels__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsAssignment_2()); }
	(rule__VSSSSystemModels__SystemModelsAssignment_2)*
	{ after(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModels__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsKeyword_3()); }
	'</SystemModels>'
	{ after(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTerm__Group__0__Impl
	rule__VSSSTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermAccess().getTermKeyword_0()); }
	'<Term'
	{ after(grammarAccess.getVSSSTermAccess().getTermKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTerm__Group__1__Impl
	rule__VSSSTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSSSTermAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTerm__Group__2__Impl
	rule__VSSSTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermAccess().getNameAssignment_2()); }
	(rule__VSSSTerm__NameAssignment_2)
	{ after(grammarAccess.getVSSSTermAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTerm__Group__3__Impl
	rule__VSSSTerm__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSSSTermAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTerm__Group__4__Impl
	rule__VSSSTerm__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermAccess().getDescriptionAssignment_4()); }
	(rule__VSSSTerm__DescriptionAssignment_4)
	{ after(grammarAccess.getVSSSTermAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTerm__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermAccess().getTermKeyword_5()); }
	'</Term>'
	{ after(grammarAccess.getVSSSTermAccess().getTermKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDefinition__Group__0__Impl
	rule__VSSSDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDefinitionAccess().getDefinitionKeyword_0()); }
	'<Definition'
	{ after(grammarAccess.getVSSSDefinitionAccess().getDefinitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDefinition__Group__1__Impl
	rule__VSSSDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDefinitionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSSSDefinitionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDefinition__Group__2__Impl
	rule__VSSSDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDefinitionAccess().getNameAssignment_2()); }
	(rule__VSSSDefinition__NameAssignment_2)
	{ after(grammarAccess.getVSSSDefinitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDefinition__Group__3__Impl
	rule__VSSSDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDefinitionAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSSSDefinitionAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDefinition__Group__4__Impl
	rule__VSSSDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDefinitionAccess().getDescriptionAssignment_4()); }
	(rule__VSSSDefinition__DescriptionAssignment_4)
	{ after(grammarAccess.getVSSSDefinitionAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDefinitionAccess().getDefinitionKeyword_5()); }
	'</Definition>'
	{ after(grammarAccess.getVSSSDefinitionAccess().getDefinitionKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSAbbreviation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAbbreviation__Group__0__Impl
	rule__VSSSAbbreviation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAbbreviationAccess().getAbbreviationKeyword_0()); }
	'<Abbreviation'
	{ after(grammarAccess.getVSSSAbbreviationAccess().getAbbreviationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAbbreviation__Group__1__Impl
	rule__VSSSAbbreviation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAbbreviationAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSSSAbbreviationAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAbbreviation__Group__2__Impl
	rule__VSSSAbbreviation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAbbreviationAccess().getNameAssignment_2()); }
	(rule__VSSSAbbreviation__NameAssignment_2)
	{ after(grammarAccess.getVSSSAbbreviationAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAbbreviation__Group__3__Impl
	rule__VSSSAbbreviation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAbbreviationAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSSSAbbreviationAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAbbreviation__Group__4__Impl
	rule__VSSSAbbreviation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAbbreviationAccess().getDescriptionAssignment_4()); }
	(rule__VSSSAbbreviation__DescriptionAssignment_4)
	{ after(grammarAccess.getVSSSAbbreviationAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAbbreviation__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAbbreviationAccess().getAbbreviationKeyword_5()); }
	'</Abbreviation>'
	{ after(grammarAccess.getVSSSAbbreviationAccess().getAbbreviationKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSInstantiableRequirementSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstantiableRequirementSection__Group__0__Impl
	rule__VSSSInstantiableRequirementSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSubsectionKeyword_0()); }
	'<subsection'
	{ after(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSubsectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstantiableRequirementSection__Group__1__Impl
	rule__VSSSInstantiableRequirementSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstantiableRequirementSection__Group__2__Impl
	rule__VSSSInstantiableRequirementSection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getNameAssignment_2()); }
	(rule__VSSSInstantiableRequirementSection__NameAssignment_2)
	{ after(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstantiableRequirementSection__Group__3__Impl
	rule__VSSSInstantiableRequirementSection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstantiableRequirementSection__Group__4__Impl
	rule__VSSSInstantiableRequirementSection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSectionDescriptionAssignment_4()); }
	(rule__VSSSInstantiableRequirementSection__SectionDescriptionAssignment_4)?
	{ after(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSectionDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstantiableRequirementSection__Group__5__Impl
	rule__VSSSInstantiableRequirementSection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSssItemsAssignment_5()); }
	(rule__VSSSInstantiableRequirementSection__SssItemsAssignment_5)*
	{ after(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSssItemsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSInstantiableRequirementSection__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSubsectionKeyword_6()); }
	'</subsection>'
	{ after(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSubsectionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSGeneralRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirements__Group__0__Impl
	rule__VSSSGeneralRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getVSSSGeneralRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getVSSSGeneralRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirements__Group__1__Impl
	rule__VSSSGeneralRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getGeneralRequirementsKeyword_1()); }
	'<GeneralRequirements>'
	{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getGeneralRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirements__Group__2__Impl
	rule__VSSSGeneralRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSGeneralRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirements__Group__3__Impl
	rule__VSSSGeneralRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSGeneralRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirements__Group__4__Impl
	rule__VSSSGeneralRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSGeneralRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getGeneralRequirementsKeyword_5()); }
	'</GeneralRequirements>'
	{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getGeneralRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSCapabilitiesRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirements__Group__0__Impl
	rule__VSSSCapabilitiesRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getVSSSCapabilitiesRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getVSSSCapabilitiesRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirements__Group__1__Impl
	rule__VSSSCapabilitiesRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getCapabilitiesRequirementsKeyword_1()); }
	'<CapabilitiesRequirements>'
	{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getCapabilitiesRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirements__Group__2__Impl
	rule__VSSSCapabilitiesRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSCapabilitiesRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirements__Group__3__Impl
	rule__VSSSCapabilitiesRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSCapabilitiesRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirements__Group__4__Impl
	rule__VSSSCapabilitiesRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSCapabilitiesRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getCapabilitiesRequirementsKeyword_5()); }
	'</CapabilitiesRequirements>'
	{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getCapabilitiesRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSystemInterfaceRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirements__Group__0__Impl
	rule__VSSSSystemInterfaceRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getVSSSSystemInterfaceRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getVSSSSystemInterfaceRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirements__Group__1__Impl
	rule__VSSSSystemInterfaceRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSystemInterfaceRequirementsKeyword_1()); }
	'<SystemInterfaceRequirements>'
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSystemInterfaceRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirements__Group__2__Impl
	rule__VSSSSystemInterfaceRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSSystemInterfaceRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirements__Group__3__Impl
	rule__VSSSSystemInterfaceRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSSystemInterfaceRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirements__Group__4__Impl
	rule__VSSSSystemInterfaceRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSSystemInterfaceRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSystemInterfaceRequirementsKeyword_5()); }
	'</SystemInterfaceRequirements>'
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSystemInterfaceRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSAdaptationMissionizationRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirements__Group__0__Impl
	rule__VSSSAdaptationMissionizationRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getVSSSAdaptationMissionizationRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getVSSSAdaptationMissionizationRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirements__Group__1__Impl
	rule__VSSSAdaptationMissionizationRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getAdaptationMissionizationRequirementsKeyword_1()); }
	'<AdaptationMissionizationRequirements>'
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getAdaptationMissionizationRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirements__Group__2__Impl
	rule__VSSSAdaptationMissionizationRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSAdaptationMissionizationRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirements__Group__3__Impl
	rule__VSSSAdaptationMissionizationRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSAdaptationMissionizationRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirements__Group__4__Impl
	rule__VSSSAdaptationMissionizationRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSAdaptationMissionizationRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getAdaptationMissionizationRequirementsKeyword_5()); }
	'</AdaptationMissionizationRequirements>'
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getAdaptationMissionizationRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSComputerResourceRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirements__Group__0__Impl
	rule__VSSSComputerResourceRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getVSSSComputerResourceRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getVSSSComputerResourceRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirements__Group__1__Impl
	rule__VSSSComputerResourceRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getComputerResourceRequirementsKeyword_1()); }
	'<ComputerResourceRequirements>'
	{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getComputerResourceRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirements__Group__2__Impl
	rule__VSSSComputerResourceRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSComputerResourceRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirements__Group__3__Impl
	rule__VSSSComputerResourceRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSComputerResourceRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirements__Group__4__Impl
	rule__VSSSComputerResourceRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSComputerResourceRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getComputerResourceRequirementsKeyword_5()); }
	'</ComputerResourceRequirements>'
	{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getComputerResourceRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSecurityRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirements__Group__0__Impl
	rule__VSSSSecurityRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getVSSSSecurityRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getVSSSSecurityRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirements__Group__1__Impl
	rule__VSSSSecurityRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getSecurityRequirementsKeyword_1()); }
	'<SecurityRequirements>'
	{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getSecurityRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirements__Group__2__Impl
	rule__VSSSSecurityRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSSecurityRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirements__Group__3__Impl
	rule__VSSSSecurityRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSSecurityRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirements__Group__4__Impl
	rule__VSSSSecurityRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSSecurityRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getSecurityRequirementsKeyword_5()); }
	'</SecurityRequirements>'
	{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getSecurityRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSafetyRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirements__Group__0__Impl
	rule__VSSSSafetyRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getVSSSSafetyRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getVSSSSafetyRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirements__Group__1__Impl
	rule__VSSSSafetyRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getSafetyRequirementsKeyword_1()); }
	'<SafetyRequirements>'
	{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getSafetyRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirements__Group__2__Impl
	rule__VSSSSafetyRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSSafetyRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirements__Group__3__Impl
	rule__VSSSSafetyRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSSafetyRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirements__Group__4__Impl
	rule__VSSSSafetyRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSSafetyRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getSafetyRequirementsKeyword_5()); }
	'</SafetyRequirements>'
	{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getSafetyRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSReliabilityAvailabilityRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabilityAvailabilityRequirements__Group__0__Impl
	rule__VSSSReliabilityAvailabilityRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getVSSSReliabilityAvailabilityRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getVSSSReliabilityAvailabilityRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabilityAvailabilityRequirements__Group__1__Impl
	rule__VSSSReliabilityAvailabilityRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getReliabilityAvailabilityRequirementsKeyword_1()); }
	'<ReliabilityAvailabilityRequirements>'
	{ after(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getReliabilityAvailabilityRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabilityAvailabilityRequirements__Group__2__Impl
	rule__VSSSReliabilityAvailabilityRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSReliabilityAvailabilityRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssItemsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabilityAvailabilityRequirements__Group__3__Impl
	rule__VSSSReliabilityAvailabilityRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSectionDescriptionAssignment_3()); }
	(rule__VSSSReliabilityAvailabilityRequirements__SectionDescriptionAssignment_3)?
	{ after(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSectionDescriptionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabilityAvailabilityRequirements__Group__4__Impl
	rule__VSSSReliabilityAvailabilityRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSReliabilityAvailabilityRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabilityAvailabilityRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getReliabilityAvailabilityRequirementsKeyword_5()); }
	'</ReliabilityAvailabilityRequirements>'
	{ after(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getReliabilityAvailabilityRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSQualityRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirements__Group__0__Impl
	rule__VSSSQualityRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementsAccess().getVSSSQualityRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSQualityRequirementsAccess().getVSSSQualityRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirements__Group__1__Impl
	rule__VSSSQualityRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementsAccess().getQualityRequirementsKeyword_1()); }
	'<QualityRequirements>'
	{ after(grammarAccess.getVSSSQualityRequirementsAccess().getQualityRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirements__Group__2__Impl
	rule__VSSSQualityRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSQualityRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSQualityRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirements__Group__3__Impl
	rule__VSSSQualityRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSQualityRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirements__Group__4__Impl
	rule__VSSSQualityRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSQualityRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSQualityRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementsAccess().getQualityRequirementsKeyword_5()); }
	'</QualityRequirements>'
	{ after(grammarAccess.getVSSSQualityRequirementsAccess().getQualityRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSDesignRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirements__Group__0__Impl
	rule__VSSSDesignRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementsAccess().getVSSSDesignRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSDesignRequirementsAccess().getVSSSDesignRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirements__Group__1__Impl
	rule__VSSSDesignRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementsAccess().getDesignRequirementsKeyword_1()); }
	'<DesignRequirements>'
	{ after(grammarAccess.getVSSSDesignRequirementsAccess().getDesignRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirements__Group__2__Impl
	rule__VSSSDesignRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSDesignRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSDesignRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirements__Group__3__Impl
	rule__VSSSDesignRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSDesignRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirements__Group__4__Impl
	rule__VSSSDesignRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSDesignRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSDesignRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementsAccess().getDesignRequirementsKeyword_5()); }
	'</DesignRequirements>'
	{ after(grammarAccess.getVSSSDesignRequirementsAccess().getDesignRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSoftwareOperationsRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirements__Group__0__Impl
	rule__VSSSSoftwareOperationsRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getVSSSSoftwareOperationsRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getVSSSSoftwareOperationsRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirements__Group__1__Impl
	rule__VSSSSoftwareOperationsRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSoftwareOperationsRequirementsKeyword_1()); }
	'<SoftwareOperationsRequirements>'
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSoftwareOperationsRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirements__Group__2__Impl
	rule__VSSSSoftwareOperationsRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSSoftwareOperationsRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirements__Group__3__Impl
	rule__VSSSSoftwareOperationsRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSSoftwareOperationsRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirements__Group__4__Impl
	rule__VSSSSoftwareOperationsRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSSoftwareOperationsRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSoftwareOperationsRequirementsKeyword_5()); }
	'</SoftwareOperationsRequirements>'
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSoftwareOperationsRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSoftwareMaintenanceRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirements__Group__0__Impl
	rule__VSSSSoftwareMaintenanceRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getVSSSSoftwareMaintenanceRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getVSSSSoftwareMaintenanceRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirements__Group__1__Impl
	rule__VSSSSoftwareMaintenanceRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSoftwareMaintenanceRequirementsKeyword_1()); }
	'<SoftwareMaintenanceRequirements>'
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSoftwareMaintenanceRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirements__Group__2__Impl
	rule__VSSSSoftwareMaintenanceRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSSoftwareMaintenanceRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirements__Group__3__Impl
	rule__VSSSSoftwareMaintenanceRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSSoftwareMaintenanceRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirements__Group__4__Impl
	rule__VSSSSoftwareMaintenanceRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSSoftwareMaintenanceRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSoftwareMaintenanceRequirementsKeyword_5()); }
	'</SoftwareMaintenanceRequirements>'
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSoftwareMaintenanceRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSystemSoftwareObservabilityRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirements__Group__0__Impl
	rule__VSSSSystemSoftwareObservabilityRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getVSSSSystemSoftwareObservabilityRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getVSSSSystemSoftwareObservabilityRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirements__Group__1__Impl
	rule__VSSSSystemSoftwareObservabilityRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSystemSoftwareObservabilityRequirementsKeyword_1()); }
	'<SystemSoftwareObservabilityRequirements>'
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSystemSoftwareObservabilityRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirements__Group__2__Impl
	rule__VSSSSystemSoftwareObservabilityRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSectionDescriptionAssignment_2()); }
	(rule__VSSSSystemSoftwareObservabilityRequirements__SectionDescriptionAssignment_2)?
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSectionDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirements__Group__3__Impl
	rule__VSSSSystemSoftwareObservabilityRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsAssignment_3()); }
	(rule__VSSSSystemSoftwareObservabilityRequirements__SssItemsAssignment_3)*
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirements__Group__4__Impl
	rule__VSSSSystemSoftwareObservabilityRequirements__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
	(rule__VSSSSystemSoftwareObservabilityRequirements__SssRequirementSubsectionsAssignment_4)*
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssRequirementSubsectionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirements__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSystemSoftwareObservabilityRequirementsKeyword_5()); }
	'</SystemSoftwareObservabilityRequirements>'
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSystemSoftwareObservabilityRequirementsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSDocumentItem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group__0__Impl
	rule__VSSSDocumentItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getItemKeyword_0()); }
	'<Item'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getItemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group__1__Impl
	rule__VSSSDocumentItem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSSSDocumentItemAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group__2__Impl
	rule__VSSSDocumentItem__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getNameAssignment_2()); }
	(rule__VSSSDocumentItem__NameAssignment_2)
	{ after(grammarAccess.getVSSSDocumentItemAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group__3__Impl
	rule__VSSSDocumentItem__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getValidationMethodKeyword_3()); }
	'validationMethod='
	{ after(grammarAccess.getVSSSDocumentItemAccess().getValidationMethodKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group__4__Impl
	rule__VSSSDocumentItem__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getValidationMethodAssignment_4()); }
	(rule__VSSSDocumentItem__ValidationMethodAssignment_4)
	{ after(grammarAccess.getVSSSDocumentItemAccess().getValidationMethodAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group__5__Impl
	rule__VSSSDocumentItem__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group__6__Impl
	rule__VSSSDocumentItem__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getDescriptionKeyword_6()); }
	'<description>'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getDescriptionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group__7__Impl
	rule__VSSSDocumentItem__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getDescriptionAssignment_7()); }
	(rule__VSSSDocumentItem__DescriptionAssignment_7)
	{ after(grammarAccess.getVSSSDocumentItemAccess().getDescriptionAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group__8__Impl
	rule__VSSSDocumentItem__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getDescriptionKeyword_8()); }
	'</description>'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getDescriptionKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group__9__Impl
	rule__VSSSDocumentItem__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getGroup_9()); }
	(rule__VSSSDocumentItem__Group_9__0)?
	{ after(grammarAccess.getVSSSDocumentItemAccess().getGroup_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getItemKeyword_10()); }
	'</Item>'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getItemKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSDocumentItem__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group_9__0__Impl
	rule__VSSSDocumentItem__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionKeyword_9_0()); }
	'<extendedDescription>'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionKeyword_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group_9__1__Impl
	rule__VSSSDocumentItem__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionAssignment_9_1()); }
	(rule__VSSSDocumentItem__ExtendedDescriptionAssignment_9_1)
	{ after(grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionAssignment_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group_9__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocumentItem__Group_9__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__Group_9__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionKeyword_9_2()); }
	'</extendedDescription>'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionKeyword_9_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationProcessRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirements__Group__0__Impl
	rule__VSSSVerificationValidationProcessRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVSSSVerificationValidationProcessRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVSSSVerificationValidationProcessRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirements__Group__1__Impl
	rule__VSSSVerificationValidationProcessRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVerificationValidationProcessRequirementsKeyword_1()); }
	'<VerificationValidationProcessRequirements>'
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVerificationValidationProcessRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirements__Group__2__Impl
	rule__VSSSVerificationValidationProcessRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSVerificationValidationProcessRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssItemsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirements__Group__3__Impl
	rule__VSSSVerificationValidationProcessRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssRequirementSubsectionsAssignment_3()); }
	(rule__VSSSVerificationValidationProcessRequirements__SssRequirementSubsectionsAssignment_3)*
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssRequirementSubsectionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirements__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVerificationValidationProcessRequirementsKeyword_4()); }
	'</VerificationValidationProcessRequirements>'
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVerificationValidationProcessRequirementsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSValidationApproach__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationApproach__Group__0__Impl
	rule__VSSSValidationApproach__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationApproachAccess().getVSSSValidationApproachAction_0()); }
	()
	{ after(grammarAccess.getVSSSValidationApproachAccess().getVSSSValidationApproachAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationApproach__Group__1__Impl
	rule__VSSSValidationApproach__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationApproachAccess().getValidationApproachKeyword_1()); }
	'<ValidationApproach>'
	{ after(grammarAccess.getVSSSValidationApproachAccess().getValidationApproachKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationApproach__Group__2__Impl
	rule__VSSSValidationApproach__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationApproachAccess().getSssItemsAssignment_2()); }
	(rule__VSSSValidationApproach__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSValidationApproachAccess().getSssItemsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationApproach__Group__3__Impl
	rule__VSSSValidationApproach__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationApproachAccess().getSssRequirementSubsectionsAssignment_3()); }
	(rule__VSSSValidationApproach__SssRequirementSubsectionsAssignment_3)*
	{ after(grammarAccess.getVSSSValidationApproachAccess().getSssRequirementSubsectionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationApproach__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationApproachAccess().getValidationApproachKeyword_4()); }
	'</ValidationApproach>'
	{ after(grammarAccess.getVSSSValidationApproachAccess().getValidationApproachKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSValidationRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirements__Group__0__Impl
	rule__VSSSValidationRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementsAccess().getVSSSValidationRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSValidationRequirementsAccess().getVSSSValidationRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirements__Group__1__Impl
	rule__VSSSValidationRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementsAccess().getValidationRequirementsKeyword_1()); }
	'<ValidationRequirements>'
	{ after(grammarAccess.getVSSSValidationRequirementsAccess().getValidationRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirements__Group__2__Impl
	rule__VSSSValidationRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSValidationRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSValidationRequirementsAccess().getSssItemsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirements__Group__3__Impl
	rule__VSSSValidationRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementsAccess().getSssRequirementSubsectionsAssignment_3()); }
	(rule__VSSSValidationRequirements__SssRequirementSubsectionsAssignment_3)*
	{ after(grammarAccess.getVSSSValidationRequirementsAccess().getSssRequirementSubsectionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirements__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementsAccess().getValidationRequirementsKeyword_4()); }
	'</ValidationRequirements>'
	{ after(grammarAccess.getVSSSValidationRequirementsAccess().getValidationRequirementsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirements__Group__0__Impl
	rule__VSSSVerificationRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementsAccess().getVSSSVerificationRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSVerificationRequirementsAccess().getVSSSVerificationRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirements__Group__1__Impl
	rule__VSSSVerificationRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementsAccess().getVerificationRequirementsKeyword_1()); }
	'<VerificationRequirements>'
	{ after(grammarAccess.getVSSSVerificationRequirementsAccess().getVerificationRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirements__Group__2__Impl
	rule__VSSSVerificationRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSVerificationRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSVerificationRequirementsAccess().getSssItemsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirements__Group__3__Impl
	rule__VSSSVerificationRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementsAccess().getSssRequirementSubsectionsAssignment_3()); }
	(rule__VSSSVerificationRequirements__SssRequirementSubsectionsAssignment_3)*
	{ after(grammarAccess.getVSSSVerificationRequirementsAccess().getSssRequirementSubsectionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirements__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementsAccess().getVerificationRequirementsKeyword_4()); }
	'</VerificationRequirements>'
	{ after(grammarAccess.getVSSSVerificationRequirementsAccess().getVerificationRequirementsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSystemModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModel__Group__0__Impl
	rule__VSSSSystemModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelAccess().getVSSSSystemModelAction_0()); }
	()
	{ after(grammarAccess.getVSSSSystemModelAccess().getVSSSSystemModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModel__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelAccess().getSystemModelKeyword_1()); }
	'<SystemModel/>'
	{ after(grammarAccess.getVSSSSystemModelAccess().getSystemModelKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSDocument__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getIdSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSDocumentAccess().getIdSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__IssueAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVSSSDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__RevisionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVSSSDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__DateAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getDateSTRINGTerminalRuleCall_10_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSDocumentAccess().getDateSTRINGTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__TbcsTbdsSectionAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getTbcsTbdsSectionVSSTBCsTBDsParserRuleCall_12_0()); }
		ruleVSSTBCsTBDs
		{ after(grammarAccess.getVSSSDocumentAccess().getTbcsTbdsSectionVSSTBCsTBDsParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__IntroductionSectionAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionVSSSIntroductionParserRuleCall_13_0()); }
		ruleVSSSIntroduction
		{ after(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionVSSSIntroductionParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__ApplicableDocumentsSectionAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_14_0()); }
		ruleVSSSApplicableDocuments
		{ after(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__ReferenceDocumentsSectionAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_15_0()); }
		ruleVSSSReferenceDocuments
		{ after(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__TermsDefinitionsAbbreviationsSectionAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_16_0()); }
		ruleVSSSTermsDefinitionsAbbreviations
		{ after(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__GeneralDescriptionSectionAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_17_0()); }
		ruleVSSSGeneralDescription
		{ after(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__SpecificRequirementsSectionAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_18_0()); }
		ruleVSSSSpecificRequirements
		{ after(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__VerificationValidationIntegrationSectionAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_19_0()); }
		ruleVSSSVerificationValidationIntegrationRequirements
		{ after(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_19_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__SystemModelsSectionAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionVSSSSystemModelsParserRuleCall_20_0()); }
		ruleVSSSSystemModels
		{ after(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionVSSSSystemModelsParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSTBCsTBDs__TbcsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSTBCsTBDsAccess().getTbcsDTBCParserRuleCall_2_0()); }
		ruleDTBC
		{ after(grammarAccess.getVSSTBCsTBDsAccess().getTbcsDTBCParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSTBCsTBDs__TbdsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSTBCsTBDsAccess().getTbdsDTBDParserRuleCall_3_0()); }
		ruleDTBD
		{ after(grammarAccess.getVSSTBCsTBDsAccess().getTbdsDTBDParserRuleCall_3_0()); }
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

rule__DTBC__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTBCAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getDTBCAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); }
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

rule__DTBD__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTBDAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getDTBDAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); }
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

rule__VSSSFixedSection__BodyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSFixedSectionAccess().getBodyDBodyParserRuleCall_1_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSFixedSectionAccess().getBodyDBodyParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSFixedSection__SssInstatiableSubsectionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSFixedSectionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_2_0()); }
		ruleVSSSInstatiableSection
		{ after(grammarAccess.getVSSSFixedSectionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSInstatiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSInstatiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__BodyAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSInstatiableSectionAccess().getBodyDBodyParserRuleCall_4_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSInstatiableSectionAccess().getBodyDBodyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstatiableSection__SssInstatiableSubsectionsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSInstatiableSectionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_5_0()); }
		ruleVSSSInstatiableSection
		{ after(grammarAccess.getVSSSInstatiableSectionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__SssInstatiableSubsectionsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_1_0()); }
		ruleVSSSInstatiableSection
		{ after(grammarAccess.getVSSSIntroductionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__ApplicableDocumentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0()); }
		ruleDApplicableDocument
		{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__ReferenceDocumentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0()); }
		ruleDReferenceDocument
		{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__TermsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsVSSSTermParserRuleCall_2_0()); }
		ruleVSSSTerm
		{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsVSSSTermParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__DefinitionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSSSDefinitionParserRuleCall_3_0()); }
		ruleVSSSDefinition
		{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSSSDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__AbbreviationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSSSAbbreviationParserRuleCall_4_0()); }
		ruleVSSSAbbreviation
		{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSSSAbbreviationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__ProductPerspectiveAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSFixedSectionParserRuleCall_2_0()); }
		ruleVSSSFixedSection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSFixedSectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__GeneralCapabilitiesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesVSSSFixedSectionParserRuleCall_5_0()); }
		ruleVSSSFixedSection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesVSSSFixedSectionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__GeneralConstraintsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSFixedSectionParserRuleCall_8_0()); }
		ruleVSSSFixedSection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSFixedSectionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__OperationalEnvironmentAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSFixedSectionParserRuleCall_11_0()); }
		ruleVSSSFixedSection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSFixedSectionParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__AssumptionsDependenciesAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSFixedSectionParserRuleCall_14_0()); }
		ruleVSSSFixedSection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSFixedSectionParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SectionDescriptionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_1_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__GeneralAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementsParserRuleCall_2_0()); }
		ruleVSSSGeneralRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementsParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__CapabilitiesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_3_0()); }
		ruleVSSSCapabilitiesRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SystemInterfaceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_4_0()); }
		ruleVSSSSystemInterfaceRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_5_0()); }
		ruleVSSSAdaptationMissionizationRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__ComputerResourceAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementsParserRuleCall_6_0()); }
		ruleVSSSComputerResourceRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementsParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SecurityAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementsParserRuleCall_7_0()); }
		ruleVSSSSecurityRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementsParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SafetyAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementsParserRuleCall_8_0()); }
		ruleVSSSSafetyRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementsParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__ReliabilityAvailabilityAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabilityAvailabilityVSSSReliabilityAvailabilityRequirementsParserRuleCall_9_0()); }
		ruleVSSSReliabilityAvailabilityRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabilityAvailabilityVSSSReliabilityAvailabilityRequirementsParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__QualityAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementsParserRuleCall_10_0()); }
		ruleVSSSQualityRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementsParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__DesignAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementsParserRuleCall_11_0()); }
		ruleVSSSDesignRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementsParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_12_0()); }
		ruleVSSSSoftwareOperationsRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_13_0()); }
		ruleVSSSSoftwareMaintenanceRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_14_0()); }
		ruleVSSSSystemSoftwareObservabilityRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__SectionDescriptionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_1_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_2_0()); }
		ruleVSSSVerificationValidationProcessRequirements
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_3_0()); }
		ruleVSSSValidationApproach
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementsParserRuleCall_4_0()); }
		ruleVSSSValidationRequirements
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementsParserRuleCall_5_0()); }
		ruleVSSSVerificationRequirements
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementsParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__SystemModelsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsVSSSSystemModelParserRuleCall_2_0()); }
		ruleVSSSSystemModel
		{ after(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsVSSSSystemModelParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSTermAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSSSTermAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSSSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSSSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__SectionDescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSectionDescriptionDBodyParserRuleCall_4_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSectionDescriptionDBodyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSInstantiableRequirementSection__SssItemsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__SectionDescriptionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_3_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabilityAvailabilityRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSQualityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSQualityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSQualityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSQualityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDesignRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSDesignRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDesignRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSDesignRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__SectionDescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__SssItemsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__SssRequirementSubsectionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentItemAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSDocumentItemAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__ValidationMethodAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentItemAccess().getValidationMethodVValidationMethodEnumRuleCall_4_0()); }
		ruleVValidationMethod
		{ after(grammarAccess.getVSSSDocumentItemAccess().getValidationMethodVValidationMethodEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__DescriptionAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentItemAccess().getDescriptionDBodyParserRuleCall_7_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSDocumentItemAccess().getDescriptionDBodyParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__ExtendedDescriptionAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionDBodyParserRuleCall_9_1_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionDBodyParserRuleCall_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirements__SssRequirementSubsectionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSValidationApproachAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSValidationApproachAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__SssRequirementSubsectionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSValidationApproachAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSValidationApproachAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSValidationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSValidationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirements__SssRequirementSubsectionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSValidationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSValidationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSVerificationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirements__SssRequirementSubsectionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0()); }
		ruleVSSSInstantiableRequirementSection
		{ after(grammarAccess.getVSSSVerificationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

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
