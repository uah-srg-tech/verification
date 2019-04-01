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
		{ before(grammarAccess.getDBodyAccess().getAlternatives()); }
		(rule__DBody__Alternatives)
		{ after(grammarAccess.getDBodyAccess().getAlternatives()); }
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

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
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

// Entry rule entryRuleDBody_Impl
entryRuleDBody_Impl
:
{ before(grammarAccess.getDBody_ImplRule()); }
	 ruleDBody_Impl
{ after(grammarAccess.getDBody_ImplRule()); } 
	 EOF 
;

// Rule DBody_Impl
ruleDBody_Impl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDBody_ImplAccess().getGroup()); }
		(rule__DBody_Impl__Group__0)
		{ after(grammarAccess.getDBody_ImplAccess().getGroup()); }
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

// Entry rule entryRuleDColumn
entryRuleDColumn
:
{ before(grammarAccess.getDColumnRule()); }
	 ruleDColumn
{ after(grammarAccess.getDColumnRule()); } 
	 EOF 
;

// Rule DColumn
ruleDColumn 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDColumnAccess().getGroup()); }
		(rule__DColumn__Group__0)
		{ after(grammarAccess.getDColumnAccess().getGroup()); }
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
		{ before(grammarAccess.getDTextAccess().getGroup()); }
		(rule__DText__Group__0)
		{ after(grammarAccess.getDTextAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDReferenceableObject_Impl
entryRuleDReferenceableObject_Impl
:
{ before(grammarAccess.getDReferenceableObject_ImplRule()); }
	 ruleDReferenceableObject_Impl
{ after(grammarAccess.getDReferenceableObject_ImplRule()); } 
	 EOF 
;

// Rule DReferenceableObject_Impl
ruleDReferenceableObject_Impl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDReferenceableObject_ImplAccess().getGroup()); }
		(rule__DReferenceableObject_Impl__Group__0)
		{ after(grammarAccess.getDReferenceableObject_ImplAccess().getGroup()); }
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

// Entry rule entryRuleVSSSGeneralDescriptionSubsection
entryRuleVSSSGeneralDescriptionSubsection
:
{ before(grammarAccess.getVSSSGeneralDescriptionSubsectionRule()); }
	 ruleVSSSGeneralDescriptionSubsection
{ after(grammarAccess.getVSSSGeneralDescriptionSubsectionRule()); } 
	 EOF 
;

// Rule VSSSGeneralDescriptionSubsection
ruleVSSSGeneralDescriptionSubsection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getGroup()); }
		(rule__VSSSGeneralDescriptionSubsection__Group__0)
		{ after(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSGeneralRequirement
entryRuleVSSSGeneralRequirement
:
{ before(grammarAccess.getVSSSGeneralRequirementRule()); }
	 ruleVSSSGeneralRequirement
{ after(grammarAccess.getVSSSGeneralRequirementRule()); } 
	 EOF 
;

// Rule VSSSGeneralRequirement
ruleVSSSGeneralRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSGeneralRequirementAccess().getGroup()); }
		(rule__VSSSGeneralRequirement__Group__0)
		{ after(grammarAccess.getVSSSGeneralRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSCapabilitiesRequirement
entryRuleVSSSCapabilitiesRequirement
:
{ before(grammarAccess.getVSSSCapabilitiesRequirementRule()); }
	 ruleVSSSCapabilitiesRequirement
{ after(grammarAccess.getVSSSCapabilitiesRequirementRule()); } 
	 EOF 
;

// Rule VSSSCapabilitiesRequirement
ruleVSSSCapabilitiesRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getGroup()); }
		(rule__VSSSCapabilitiesRequirement__Group__0)
		{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSystemInterfaceRequirement
entryRuleVSSSSystemInterfaceRequirement
:
{ before(grammarAccess.getVSSSSystemInterfaceRequirementRule()); }
	 ruleVSSSSystemInterfaceRequirement
{ after(grammarAccess.getVSSSSystemInterfaceRequirementRule()); } 
	 EOF 
;

// Rule VSSSSystemInterfaceRequirement
ruleVSSSSystemInterfaceRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getGroup()); }
		(rule__VSSSSystemInterfaceRequirement__Group__0)
		{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSAdaptationMissionizationRequirement
entryRuleVSSSAdaptationMissionizationRequirement
:
{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementRule()); }
	 ruleVSSSAdaptationMissionizationRequirement
{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementRule()); } 
	 EOF 
;

// Rule VSSSAdaptationMissionizationRequirement
ruleVSSSAdaptationMissionizationRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getGroup()); }
		(rule__VSSSAdaptationMissionizationRequirement__Group__0)
		{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSComputerResourceRequirement
entryRuleVSSSComputerResourceRequirement
:
{ before(grammarAccess.getVSSSComputerResourceRequirementRule()); }
	 ruleVSSSComputerResourceRequirement
{ after(grammarAccess.getVSSSComputerResourceRequirementRule()); } 
	 EOF 
;

// Rule VSSSComputerResourceRequirement
ruleVSSSComputerResourceRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getGroup()); }
		(rule__VSSSComputerResourceRequirement__Group__0)
		{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSecurityRequirement
entryRuleVSSSSecurityRequirement
:
{ before(grammarAccess.getVSSSSecurityRequirementRule()); }
	 ruleVSSSSecurityRequirement
{ after(grammarAccess.getVSSSSecurityRequirementRule()); } 
	 EOF 
;

// Rule VSSSSecurityRequirement
ruleVSSSSecurityRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSecurityRequirementAccess().getGroup()); }
		(rule__VSSSSecurityRequirement__Group__0)
		{ after(grammarAccess.getVSSSSecurityRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSafetyRequirement
entryRuleVSSSSafetyRequirement
:
{ before(grammarAccess.getVSSSSafetyRequirementRule()); }
	 ruleVSSSSafetyRequirement
{ after(grammarAccess.getVSSSSafetyRequirementRule()); } 
	 EOF 
;

// Rule VSSSSafetyRequirement
ruleVSSSSafetyRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSafetyRequirementAccess().getGroup()); }
		(rule__VSSSSafetyRequirement__Group__0)
		{ after(grammarAccess.getVSSSSafetyRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSReliabiltyAvailabilityRequirement
entryRuleVSSSReliabiltyAvailabilityRequirement
:
{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementRule()); }
	 ruleVSSSReliabiltyAvailabilityRequirement
{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementRule()); } 
	 EOF 
;

// Rule VSSSReliabiltyAvailabilityRequirement
ruleVSSSReliabiltyAvailabilityRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getGroup()); }
		(rule__VSSSReliabiltyAvailabilityRequirement__Group__0)
		{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSQualityRequirement
entryRuleVSSSQualityRequirement
:
{ before(grammarAccess.getVSSSQualityRequirementRule()); }
	 ruleVSSSQualityRequirement
{ after(grammarAccess.getVSSSQualityRequirementRule()); } 
	 EOF 
;

// Rule VSSSQualityRequirement
ruleVSSSQualityRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSQualityRequirementAccess().getGroup()); }
		(rule__VSSSQualityRequirement__Group__0)
		{ after(grammarAccess.getVSSSQualityRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSDesignRequirement
entryRuleVSSSDesignRequirement
:
{ before(grammarAccess.getVSSSDesignRequirementRule()); }
	 ruleVSSSDesignRequirement
{ after(grammarAccess.getVSSSDesignRequirementRule()); } 
	 EOF 
;

// Rule VSSSDesignRequirement
ruleVSSSDesignRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSDesignRequirementAccess().getGroup()); }
		(rule__VSSSDesignRequirement__Group__0)
		{ after(grammarAccess.getVSSSDesignRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSoftwareOperationsRequirement
entryRuleVSSSSoftwareOperationsRequirement
:
{ before(grammarAccess.getVSSSSoftwareOperationsRequirementRule()); }
	 ruleVSSSSoftwareOperationsRequirement
{ after(grammarAccess.getVSSSSoftwareOperationsRequirementRule()); } 
	 EOF 
;

// Rule VSSSSoftwareOperationsRequirement
ruleVSSSSoftwareOperationsRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getGroup()); }
		(rule__VSSSSoftwareOperationsRequirement__Group__0)
		{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSoftwareMaintenanceRequirement
entryRuleVSSSSoftwareMaintenanceRequirement
:
{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementRule()); }
	 ruleVSSSSoftwareMaintenanceRequirement
{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementRule()); } 
	 EOF 
;

// Rule VSSSSoftwareMaintenanceRequirement
ruleVSSSSoftwareMaintenanceRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getGroup()); }
		(rule__VSSSSoftwareMaintenanceRequirement__Group__0)
		{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSSystemSoftwareObservabilityRequirement
entryRuleVSSSSystemSoftwareObservabilityRequirement
:
{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementRule()); }
	 ruleVSSSSystemSoftwareObservabilityRequirement
{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementRule()); } 
	 EOF 
;

// Rule VSSSSystemSoftwareObservabilityRequirement
ruleVSSSSystemSoftwareObservabilityRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getGroup()); }
		(rule__VSSSSystemSoftwareObservabilityRequirement__Group__0)
		{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getGroup()); }
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

// Entry rule entryRuleVSSSVerificationValidationProcessRequirement
entryRuleVSSSVerificationValidationProcessRequirement
:
{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementRule()); }
	 ruleVSSSVerificationValidationProcessRequirement
{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementRule()); } 
	 EOF 
;

// Rule VSSSVerificationValidationProcessRequirement
ruleVSSSVerificationValidationProcessRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getGroup()); }
		(rule__VSSSVerificationValidationProcessRequirement__Group__0)
		{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getGroup()); }
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

// Entry rule entryRuleVSSSValidationRequirement
entryRuleVSSSValidationRequirement
:
{ before(grammarAccess.getVSSSValidationRequirementRule()); }
	 ruleVSSSValidationRequirement
{ after(grammarAccess.getVSSSValidationRequirementRule()); } 
	 EOF 
;

// Rule VSSSValidationRequirement
ruleVSSSValidationRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSValidationRequirementAccess().getGroup()); }
		(rule__VSSSValidationRequirement__Group__0)
		{ after(grammarAccess.getVSSSValidationRequirementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSSSVerificationRequirement
entryRuleVSSSVerificationRequirement
:
{ before(grammarAccess.getVSSSVerificationRequirementRule()); }
	 ruleVSSSVerificationRequirement
{ after(grammarAccess.getVSSSVerificationRequirementRule()); } 
	 EOF 
;

// Rule VSSSVerificationRequirement
ruleVSSSVerificationRequirement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSVerificationRequirementAccess().getGroup()); }
		(rule__VSSSVerificationRequirement__Group__0)
		{ after(grammarAccess.getVSSSVerificationRequirementAccess().getGroup()); }
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

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVersion
entryRuleVersion
:
{ before(grammarAccess.getVersionRule()); }
	 ruleVersion
{ after(grammarAccess.getVersionRule()); } 
	 EOF 
;

// Rule Version
ruleVersion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVersionAccess().getGroup()); }
		(rule__Version__Group__0)
		{ after(grammarAccess.getVersionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVersionedQualifiedName
entryRuleVersionedQualifiedName
:
{ before(grammarAccess.getVersionedQualifiedNameRule()); }
	 ruleVersionedQualifiedName
{ after(grammarAccess.getVersionedQualifiedNameRule()); } 
	 EOF 
;

// Rule VersionedQualifiedName
ruleVersionedQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); }
		(rule__VersionedQualifiedName__Group__0)
		{ after(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule DRunFormatEnableDisable
ruleDRunFormatEnableDisable
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunFormatEnableDisableAccess().getAlternatives()); }
		(rule__DRunFormatEnableDisable__Alternatives)
		{ after(grammarAccess.getDRunFormatEnableDisableAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule VVerificationMethod
ruleVVerificationMethod
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getAlternatives()); }
		(rule__VVerificationMethod__Alternatives)
		{ after(grammarAccess.getVVerificationMethodAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBodyAccess().getDBody_ImplParserRuleCall_0()); }
		ruleDBody_Impl
		{ after(grammarAccess.getDBodyAccess().getDBody_ImplParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDBodyAccess().getDCellParserRuleCall_1()); }
		ruleDCell
		{ after(grammarAccess.getDBodyAccess().getDCellParserRuleCall_1()); }
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

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); }
		RULE_INT
		{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getVersionAccess().getGroup_0_1()); }
		(rule__Version__Group_0_1__0)
		{ after(grammarAccess.getVersionAccess().getGroup_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getVersionAccess().getGroup_1_1_1()); }
		(rule__Version__Group_1_1_1__0)
		{ after(grammarAccess.getVersionAccess().getGroup_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRunFormatEnableDisable__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunFormatEnableDisableAccess().getDisabledEnumLiteralDeclaration_0()); }
		('disabled')
		{ after(grammarAccess.getDRunFormatEnableDisableAccess().getDisabledEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDRunFormatEnableDisableAccess().getEnabledEnumLiteralDeclaration_1()); }
		('enabled')
		{ after(grammarAccess.getDRunFormatEnableDisableAccess().getEnabledEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VVerificationMethod__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getAnalysisEnumLiteralDeclaration_0()); }
		('Analysis')
		{ after(grammarAccess.getVVerificationMethodAccess().getAnalysisEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getInspectionEnumLiteralDeclaration_1()); }
		('Inspection')
		{ after(grammarAccess.getVVerificationMethodAccess().getInspectionEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getTestingEnumLiteralDeclaration_2()); }
		('Testing')
		{ after(grammarAccess.getVVerificationMethodAccess().getTestingEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getReviewEnumLiteralDeclaration_3()); }
		('Review')
		{ after(grammarAccess.getVVerificationMethodAccess().getReviewEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getModelSimulationEnumLiteralDeclaration_4()); }
		('ModelSimulation')
		{ after(grammarAccess.getVVerificationMethodAccess().getModelSimulationEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getWalkThroughEnumLiteralDeclaration_5()); }
		('WalkThrough')
		{ after(grammarAccess.getVVerificationMethodAccess().getWalkThroughEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getCrossReadingEnumLiteralDeclaration_6()); }
		('CrossReading')
		{ after(grammarAccess.getVVerificationMethodAccess().getCrossReadingEnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7()); }
		('DeskChecking')
		{ after(grammarAccess.getVVerificationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getVSSSDocumentKeyword_0()); }
	'VSSSDocument'
	{ after(grammarAccess.getVSSSDocumentAccess().getVSSSDocumentKeyword_0()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getNameAssignment_1()); }
	(rule__VSSSDocument__NameAssignment_1)
	{ after(grammarAccess.getVSSSDocumentAccess().getNameAssignment_1()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getVSSSDocumentAccess().getLeftCurlyBracketKeyword_2()); }
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
	'id'
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
	'issue'
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
	'revision'
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
	'date'
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
	{ before(grammarAccess.getVSSSDocumentAccess().getGroup_11()); }
	(rule__VSSSDocument__Group_11__0)?
	{ after(grammarAccess.getVSSSDocumentAccess().getGroup_11()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionKeyword_12()); }
	'introductionSection'
	{ after(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionKeyword_12()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionKeyword_14()); }
	'applicableDocumentsSection'
	{ after(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionKeyword_14()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionAssignment_15()); }
	(rule__VSSSDocument__ApplicableDocumentsSectionAssignment_15)
	{ after(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionAssignment_15()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionKeyword_16()); }
	'referenceDocumentsSection'
	{ after(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionKeyword_16()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionAssignment_17()); }
	(rule__VSSSDocument__ReferenceDocumentsSectionAssignment_17)
	{ after(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionAssignment_17()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionKeyword_18()); }
	'termsDefinitionsAbbreviationsSection'
	{ after(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionKeyword_18()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_19()); }
	(rule__VSSSDocument__TermsDefinitionsAbbreviationsSectionAssignment_19)
	{ after(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_19()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionKeyword_20()); }
	'generalDescriptionSection'
	{ after(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionKeyword_20()); }
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
	rule__VSSSDocument__Group__22
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
	{ before(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionAssignment_21()); }
	(rule__VSSSDocument__GeneralDescriptionSectionAssignment_21)
	{ after(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__22__Impl
	rule__VSSSDocument__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionKeyword_22()); }
	'specificRequirementsSection'
	{ after(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__23__Impl
	rule__VSSSDocument__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionAssignment_23()); }
	(rule__VSSSDocument__SpecificRequirementsSectionAssignment_23)
	{ after(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionAssignment_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__24__Impl
	rule__VSSSDocument__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionKeyword_24()); }
	'verificationValidationIntegrationSection'
	{ after(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__25__Impl
	rule__VSSSDocument__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionAssignment_25()); }
	(rule__VSSSDocument__VerificationValidationIntegrationSectionAssignment_25)
	{ after(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__26__Impl
	rule__VSSSDocument__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getGroup_26()); }
	(rule__VSSSDocument__Group_26__0)?
	{ after(grammarAccess.getVSSSDocumentAccess().getGroup_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group__27__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getRightCurlyBracketKeyword_27()); }
	'}'
	{ after(grammarAccess.getVSSSDocumentAccess().getRightCurlyBracketKeyword_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSDocument__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group_11__0__Impl
	rule__VSSSDocument__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getParentsKeyword_11_0()); }
	'parents'
	{ after(grammarAccess.getVSSSDocumentAccess().getParentsKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group_11__1__Impl
	rule__VSSSDocument__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getLeftParenthesisKeyword_11_1()); }
	'('
	{ after(grammarAccess.getVSSSDocumentAccess().getLeftParenthesisKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group_11__2__Impl
	rule__VSSSDocument__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getParentsAssignment_11_2()); }
	(rule__VSSSDocument__ParentsAssignment_11_2)
	{ after(grammarAccess.getVSSSDocumentAccess().getParentsAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group_11__3__Impl
	rule__VSSSDocument__Group_11__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getGroup_11_3()); }
	(rule__VSSSDocument__Group_11_3__0)*
	{ after(grammarAccess.getVSSSDocumentAccess().getGroup_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group_11__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getRightParenthesisKeyword_11_4()); }
	')'
	{ after(grammarAccess.getVSSSDocumentAccess().getRightParenthesisKeyword_11_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSDocument__Group_11_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group_11_3__0__Impl
	rule__VSSSDocument__Group_11_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getCommaKeyword_11_3_0()); }
	','
	{ after(grammarAccess.getVSSSDocumentAccess().getCommaKeyword_11_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group_11_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_11_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getParentsAssignment_11_3_1()); }
	(rule__VSSSDocument__ParentsAssignment_11_3_1)
	{ after(grammarAccess.getVSSSDocumentAccess().getParentsAssignment_11_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSDocument__Group_26__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group_26__0__Impl
	rule__VSSSDocument__Group_26__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_26__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionKeyword_26_0()); }
	'systemModelsSection'
	{ after(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionKeyword_26_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_26__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDocument__Group_26__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__Group_26__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionAssignment_26_1()); }
	(rule__VSSSDocument__SystemModelsSectionAssignment_26_1)
	{ after(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionAssignment_26_1()); }
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getVSSSIntroductionKeyword_0()); }
	'VSSSIntroduction'
	{ after(grammarAccess.getVSSSIntroductionAccess().getVSSSIntroductionKeyword_0()); }
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSIntroductionAccess().getLeftCurlyBracketKeyword_1()); }
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
	rule__VSSSIntroduction__Group__3
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getPurposeKeyword_2()); }
	'purpose'
	{ after(grammarAccess.getVSSSIntroductionAccess().getPurposeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__3__Impl
	rule__VSSSIntroduction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getPurposeAssignment_3()); }
	(rule__VSSSIntroduction__PurposeAssignment_3)
	{ after(grammarAccess.getVSSSIntroductionAccess().getPurposeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__4__Impl
	rule__VSSSIntroduction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getObjetiveKeyword_4()); }
	'objetive'
	{ after(grammarAccess.getVSSSIntroductionAccess().getObjetiveKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__5__Impl
	rule__VSSSIntroduction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getObjetiveAssignment_5()); }
	(rule__VSSSIntroduction__ObjetiveAssignment_5)
	{ after(grammarAccess.getVSSSIntroductionAccess().getObjetiveAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__6__Impl
	rule__VSSSIntroduction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getContentKeyword_6()); }
	'content'
	{ after(grammarAccess.getVSSSIntroductionAccess().getContentKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__7__Impl
	rule__VSSSIntroduction__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getContentAssignment_7()); }
	(rule__VSSSIntroduction__ContentAssignment_7)
	{ after(grammarAccess.getVSSSIntroductionAccess().getContentAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__8__Impl
	rule__VSSSIntroduction__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getReasonKeyword_8()); }
	'reason'
	{ after(grammarAccess.getVSSSIntroductionAccess().getReasonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__9__Impl
	rule__VSSSIntroduction__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getReasonAssignment_9()); }
	(rule__VSSSIntroduction__ReasonAssignment_9)
	{ after(grammarAccess.getVSSSIntroductionAccess().getReasonAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getVSSSIntroductionAccess().getRightCurlyBracketKeyword_10()); }
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
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getVSSSApplicableDocumentsKeyword_1()); }
	'VSSSApplicableDocuments'
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getVSSSApplicableDocumentsKeyword_1()); }
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
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getLeftCurlyBracketKeyword_2()); }
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
	rule__VSSSApplicableDocuments__Group__4
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
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getGroup_3()); }
	(rule__VSSSApplicableDocuments__Group_3__0)?
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSApplicableDocuments__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group_3__0__Impl
	rule__VSSSApplicableDocuments__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3_0()); }
	'applicableDocuments'
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group_3__1__Impl
	rule__VSSSApplicableDocuments__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group_3__2__Impl
	rule__VSSSApplicableDocuments__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsAssignment_3_2()); }
	(rule__VSSSApplicableDocuments__ApplicableDocumentsAssignment_3_2)
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group_3__3__Impl
	rule__VSSSApplicableDocuments__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getGroup_3_3()); }
	(rule__VSSSApplicableDocuments__Group_3_3__0)*
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getGroup_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getRightCurlyBracketKeyword_3_4()); }
	'}'
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getRightCurlyBracketKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSApplicableDocuments__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group_3_3__0__Impl
	rule__VSSSApplicableDocuments__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getCommaKeyword_3_3_0()); }
	','
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getCommaKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSApplicableDocuments__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsAssignment_3_3_1()); }
	(rule__VSSSApplicableDocuments__ApplicableDocumentsAssignment_3_3_1)
	{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsAssignment_3_3_1()); }
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
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getVSSSReferenceDocumentsKeyword_1()); }
	'VSSSReferenceDocuments'
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getVSSSReferenceDocumentsKeyword_1()); }
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
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getLeftCurlyBracketKeyword_2()); }
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
	rule__VSSSReferenceDocuments__Group__4
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
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getGroup_3()); }
	(rule__VSSSReferenceDocuments__Group_3__0)?
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSReferenceDocuments__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group_3__0__Impl
	rule__VSSSReferenceDocuments__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3_0()); }
	'referenceDocuments'
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group_3__1__Impl
	rule__VSSSReferenceDocuments__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group_3__2__Impl
	rule__VSSSReferenceDocuments__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsAssignment_3_2()); }
	(rule__VSSSReferenceDocuments__ReferenceDocumentsAssignment_3_2)
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group_3__3__Impl
	rule__VSSSReferenceDocuments__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getGroup_3_3()); }
	(rule__VSSSReferenceDocuments__Group_3_3__0)*
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getGroup_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getRightCurlyBracketKeyword_3_4()); }
	'}'
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getRightCurlyBracketKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSReferenceDocuments__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group_3_3__0__Impl
	rule__VSSSReferenceDocuments__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getCommaKeyword_3_3_0()); }
	','
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getCommaKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReferenceDocuments__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsAssignment_3_3_1()); }
	(rule__VSSSReferenceDocuments__ReferenceDocumentsAssignment_3_3_1)
	{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsAssignment_3_3_1()); }
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
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getVSSSTermsDefinitionsAbbreviationsKeyword_1()); }
	'VSSSTermsDefinitionsAbbreviations'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getVSSSTermsDefinitionsAbbreviationsKeyword_1()); }
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
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_2()); }
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
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_3()); }
	(rule__VSSSTermsDefinitionsAbbreviations__Group_3__0)?
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_3()); }
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
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_4()); }
	(rule__VSSSTermsDefinitionsAbbreviations__Group_4__0)?
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_4()); }
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
	rule__VSSSTermsDefinitionsAbbreviations__Group__6
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
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_5()); }
	(rule__VSSSTermsDefinitionsAbbreviations__Group_5__0)?
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSTermsDefinitionsAbbreviations__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_3__0__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsKeyword_3_0()); }
	'terms'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_3__1__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_3__2__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_3_2()); }
	(rule__VSSSTermsDefinitionsAbbreviations__TermsAssignment_3_2)
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_3__3__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_3_3()); }
	(rule__VSSSTermsDefinitionsAbbreviations__Group_3_3__0)*
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_3_4()); }
	'}'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSTermsDefinitionsAbbreviations__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_3_3__0__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getCommaKeyword_3_3_0()); }
	','
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getCommaKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_3_3_1()); }
	(rule__VSSSTermsDefinitionsAbbreviations__TermsAssignment_3_3_1)
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSTermsDefinitionsAbbreviations__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_4__0__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsKeyword_4_0()); }
	'definitions'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_4__1__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_4__2__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_4_2()); }
	(rule__VSSSTermsDefinitionsAbbreviations__DefinitionsAssignment_4_2)
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_4__3__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_4_3()); }
	(rule__VSSSTermsDefinitionsAbbreviations__Group_4_3__0)*
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_4_4()); }
	'}'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSTermsDefinitionsAbbreviations__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_4_3__0__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getCommaKeyword_4_3_0()); }
	','
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getCommaKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_4_3_1()); }
	(rule__VSSSTermsDefinitionsAbbreviations__DefinitionsAssignment_4_3_1)
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSTermsDefinitionsAbbreviations__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_5__0__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsKeyword_5_0()); }
	'abbreviations'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_5__1__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_5_1()); }
	'{'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getLeftCurlyBracketKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_5__2__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_5_2()); }
	(rule__VSSSTermsDefinitionsAbbreviations__AbbreviationsAssignment_5_2)
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_5__3__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_5_3()); }
	(rule__VSSSTermsDefinitionsAbbreviations__Group_5_3__0)*
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_5_4()); }
	'}'
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getRightCurlyBracketKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSTermsDefinitionsAbbreviations__Group_5_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_5_3__0__Impl
	rule__VSSSTermsDefinitionsAbbreviations__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getCommaKeyword_5_3_0()); }
	','
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getCommaKeyword_5_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSTermsDefinitionsAbbreviations__Group_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__Group_5_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_5_3_1()); }
	(rule__VSSSTermsDefinitionsAbbreviations__AbbreviationsAssignment_5_3_1)
	{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_5_3_1()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getVSSSGeneralDescriptionKeyword_0()); }
	'VSSSGeneralDescription'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getVSSSGeneralDescriptionKeyword_0()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_2()); }
	'productPerspective'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_2()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveAssignment_3()); }
	(rule__VSSSGeneralDescription__ProductPerspectiveAssignment_3)
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveAssignment_3()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitesKeyword_4()); }
	'generalCapabilites'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitesKeyword_4()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitesAssignment_5()); }
	(rule__VSSSGeneralDescription__GeneralCapabilitesAssignment_5)
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitesAssignment_5()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_6()); }
	'generalConstraints'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_6()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsAssignment_7()); }
	(rule__VSSSGeneralDescription__GeneralConstraintsAssignment_7)
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsAssignment_7()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_8()); }
	'operationalEnvironment'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_8()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentAssignment_9()); }
	(rule__VSSSGeneralDescription__OperationalEnvironmentAssignment_9)
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentAssignment_9()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_10()); }
	'assumptionsDependencies'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_10()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesAssignment_11()); }
	(rule__VSSSGeneralDescription__AssumptionsDependenciesAssignment_11)
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesAssignment_11()); }
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
	{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getRightCurlyBracketKeyword_12()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getVSSSSpecificRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getVSSSSpecificRequirementsAction_0()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getVSSSSpecificRequirementsKeyword_1()); }
	'VSSSSpecificRequirements'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getVSSSSpecificRequirementsKeyword_1()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_2()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_3()); }
	(rule__VSSSSpecificRequirements__Group_3__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_3()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_4()); }
	(rule__VSSSSpecificRequirements__Group_4__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_4()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_5()); }
	(rule__VSSSSpecificRequirements__Group_5__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_5()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_6()); }
	(rule__VSSSSpecificRequirements__Group_6__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_6()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_7()); }
	(rule__VSSSSpecificRequirements__Group_7__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_7()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_8()); }
	(rule__VSSSSpecificRequirements__Group_8__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_8()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_9()); }
	(rule__VSSSSpecificRequirements__Group_9__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_9()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_10()); }
	(rule__VSSSSpecificRequirements__Group_10__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_10()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_11()); }
	(rule__VSSSSpecificRequirements__Group_11__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_11()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_12()); }
	(rule__VSSSSpecificRequirements__Group_12__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_12()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_13()); }
	(rule__VSSSSpecificRequirements__Group_13__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_13()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_14()); }
	(rule__VSSSSpecificRequirements__Group_14__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_14()); }
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
	rule__VSSSSpecificRequirements__Group__16
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_15()); }
	(rule__VSSSSpecificRequirements__Group_15__0)?
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_16()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_3__0__Impl
	rule__VSSSSpecificRequirements__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralKeyword_3_0()); }
	'general'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_3__1__Impl
	rule__VSSSSpecificRequirements__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_3__2__Impl
	rule__VSSSSpecificRequirements__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_3_2()); }
	(rule__VSSSSpecificRequirements__GeneralAssignment_3_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_3__3__Impl
	rule__VSSSSpecificRequirements__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_3_3()); }
	(rule__VSSSSpecificRequirements__Group_3_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_3_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_3_3__0__Impl
	rule__VSSSSpecificRequirements__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_3_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_3_3_1()); }
	(rule__VSSSSpecificRequirements__GeneralAssignment_3_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_4__0__Impl
	rule__VSSSSpecificRequirements__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesKeyword_4_0()); }
	'capabilities'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_4__1__Impl
	rule__VSSSSpecificRequirements__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_4__2__Impl
	rule__VSSSSpecificRequirements__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_4_2()); }
	(rule__VSSSSpecificRequirements__CapabilitiesAssignment_4_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_4__3__Impl
	rule__VSSSSpecificRequirements__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_4_3()); }
	(rule__VSSSSpecificRequirements__Group_4_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_4_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_4_3__0__Impl
	rule__VSSSSpecificRequirements__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_4_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_4_3_1()); }
	(rule__VSSSSpecificRequirements__CapabilitiesAssignment_4_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_5__0__Impl
	rule__VSSSSpecificRequirements__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceKeyword_5_0()); }
	'systemInterface'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_5__1__Impl
	rule__VSSSSpecificRequirements__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_5_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_5__2__Impl
	rule__VSSSSpecificRequirements__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_5_2()); }
	(rule__VSSSSpecificRequirements__SystemInterfaceAssignment_5_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_5__3__Impl
	rule__VSSSSpecificRequirements__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_5_3()); }
	(rule__VSSSSpecificRequirements__Group_5_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_5_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_5_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_5_3__0__Impl
	rule__VSSSSpecificRequirements__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_5_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_5_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_5_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_5_3_1()); }
	(rule__VSSSSpecificRequirements__SystemInterfaceAssignment_5_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_5_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_6__0__Impl
	rule__VSSSSpecificRequirements__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationKeyword_6_0()); }
	'adaptationMissionization'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_6__1__Impl
	rule__VSSSSpecificRequirements__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_6_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_6__2__Impl
	rule__VSSSSpecificRequirements__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_6_2()); }
	(rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_6_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_6__3__Impl
	rule__VSSSSpecificRequirements__Group_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_6_3()); }
	(rule__VSSSSpecificRequirements__Group_6_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_6_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_6_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_6_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_6_3__0__Impl
	rule__VSSSSpecificRequirements__Group_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_6_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_6_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_6_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_6_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_6_3_1()); }
	(rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_6_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_6_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_7__0__Impl
	rule__VSSSSpecificRequirements__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceKeyword_7_0()); }
	'computerResource'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_7__1__Impl
	rule__VSSSSpecificRequirements__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_7_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_7__2__Impl
	rule__VSSSSpecificRequirements__Group_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_7_2()); }
	(rule__VSSSSpecificRequirements__ComputerResourceAssignment_7_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_7__3__Impl
	rule__VSSSSpecificRequirements__Group_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_7_3()); }
	(rule__VSSSSpecificRequirements__Group_7_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_7_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_7__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_7_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_7_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_7_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_7_3__0__Impl
	rule__VSSSSpecificRequirements__Group_7_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_7_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_7_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_7_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_7_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_7_3_1()); }
	(rule__VSSSSpecificRequirements__ComputerResourceAssignment_7_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_7_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_8__0__Impl
	rule__VSSSSpecificRequirements__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityKeyword_8_0()); }
	'security'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_8__1__Impl
	rule__VSSSSpecificRequirements__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_8_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_8__2__Impl
	rule__VSSSSpecificRequirements__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_8_2()); }
	(rule__VSSSSpecificRequirements__SecurityAssignment_8_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_8__3__Impl
	rule__VSSSSpecificRequirements__Group_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_8_3()); }
	(rule__VSSSSpecificRequirements__Group_8_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_8_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_8__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_8_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_8_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_8_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_8_3__0__Impl
	rule__VSSSSpecificRequirements__Group_8_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_8_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_8_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_8_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_8_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_8_3_1()); }
	(rule__VSSSSpecificRequirements__SecurityAssignment_8_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_8_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_9__0__Impl
	rule__VSSSSpecificRequirements__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyKeyword_9_0()); }
	'safety'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyKeyword_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_9__1__Impl
	rule__VSSSSpecificRequirements__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_9_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_9__2__Impl
	rule__VSSSSpecificRequirements__Group_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_9_2()); }
	(rule__VSSSSpecificRequirements__SafetyAssignment_9_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_9_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_9__3__Impl
	rule__VSSSSpecificRequirements__Group_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_9_3()); }
	(rule__VSSSSpecificRequirements__Group_9_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_9_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_9__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_9_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_9_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_9_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_9_3__0__Impl
	rule__VSSSSpecificRequirements__Group_9_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_9_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_9_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_9_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_9_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_9_3_1()); }
	(rule__VSSSSpecificRequirements__SafetyAssignment_9_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_9_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_10__0__Impl
	rule__VSSSSpecificRequirements__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityKeyword_10_0()); }
	'reliabiltyAvailability'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_10__1__Impl
	rule__VSSSSpecificRequirements__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_10_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_10__2__Impl
	rule__VSSSSpecificRequirements__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityAssignment_10_2()); }
	(rule__VSSSSpecificRequirements__ReliabiltyAvailabilityAssignment_10_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_10__3__Impl
	rule__VSSSSpecificRequirements__Group_10__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_10_3()); }
	(rule__VSSSSpecificRequirements__Group_10_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_10__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_10_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_10_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_10_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_10_3__0__Impl
	rule__VSSSSpecificRequirements__Group_10_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_10_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_10_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_10_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_10_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityAssignment_10_3_1()); }
	(rule__VSSSSpecificRequirements__ReliabiltyAvailabilityAssignment_10_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityAssignment_10_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_11__0__Impl
	rule__VSSSSpecificRequirements__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityKeyword_11_0()); }
	'quality'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_11__1__Impl
	rule__VSSSSpecificRequirements__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_11_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_11__2__Impl
	rule__VSSSSpecificRequirements__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_11_2()); }
	(rule__VSSSSpecificRequirements__QualityAssignment_11_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_11__3__Impl
	rule__VSSSSpecificRequirements__Group_11__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_11_3()); }
	(rule__VSSSSpecificRequirements__Group_11_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_11__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_11_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_11_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_11_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_11_3__0__Impl
	rule__VSSSSpecificRequirements__Group_11_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_11_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_11_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_11_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_11_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_11_3_1()); }
	(rule__VSSSSpecificRequirements__QualityAssignment_11_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_11_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_12__0__Impl
	rule__VSSSSpecificRequirements__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignKeyword_12_0()); }
	'design'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_12__1__Impl
	rule__VSSSSpecificRequirements__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_12_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_12__2__Impl
	rule__VSSSSpecificRequirements__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_12_2()); }
	(rule__VSSSSpecificRequirements__DesignAssignment_12_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_12__3__Impl
	rule__VSSSSpecificRequirements__Group_12__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_12_3()); }
	(rule__VSSSSpecificRequirements__Group_12_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_12__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_12_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_12_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_12_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_12_3__0__Impl
	rule__VSSSSpecificRequirements__Group_12_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_12_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_12_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_12_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_12_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_12_3_1()); }
	(rule__VSSSSpecificRequirements__DesignAssignment_12_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_12_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_13__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_13__0__Impl
	rule__VSSSSpecificRequirements__Group_13__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsKeyword_13_0()); }
	'softwareOperations'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsKeyword_13_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_13__1__Impl
	rule__VSSSSpecificRequirements__Group_13__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_13_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_13_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_13__2__Impl
	rule__VSSSSpecificRequirements__Group_13__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_13_2()); }
	(rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_13_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_13_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_13__3__Impl
	rule__VSSSSpecificRequirements__Group_13__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_13_3()); }
	(rule__VSSSSpecificRequirements__Group_13_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_13_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_13__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_13_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_13_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_13_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_13_3__0__Impl
	rule__VSSSSpecificRequirements__Group_13_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_13_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_13_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_13_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_13_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_13_3_1()); }
	(rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_13_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_13_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_14__0__Impl
	rule__VSSSSpecificRequirements__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceKeyword_14_0()); }
	'softwareMaintenance'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_14__1__Impl
	rule__VSSSSpecificRequirements__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_14_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_14__2__Impl
	rule__VSSSSpecificRequirements__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_14_2()); }
	(rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_14_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_14__3__Impl
	rule__VSSSSpecificRequirements__Group_14__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_14_3()); }
	(rule__VSSSSpecificRequirements__Group_14_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_14__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_14_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_14_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_14_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_14_3__0__Impl
	rule__VSSSSpecificRequirements__Group_14_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_14_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_14_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_14_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_14_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_14_3_1()); }
	(rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_14_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_14_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_15__0__Impl
	rule__VSSSSpecificRequirements__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityKeyword_15_0()); }
	'systemSoftwareObservability'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityKeyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_15__1__Impl
	rule__VSSSSpecificRequirements__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_15_1()); }
	'{'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getLeftCurlyBracketKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_15__2__Impl
	rule__VSSSSpecificRequirements__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_15_2()); }
	(rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_15_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_15__3__Impl
	rule__VSSSSpecificRequirements__Group_15__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_15_3()); }
	(rule__VSSSSpecificRequirements__Group_15_3__0)*
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_15__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_15_4()); }
	'}'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getRightCurlyBracketKeyword_15_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSpecificRequirements__Group_15_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_15_3__0__Impl
	rule__VSSSSpecificRequirements__Group_15_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_15_3_0()); }
	','
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCommaKeyword_15_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSpecificRequirements__Group_15_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__Group_15_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_15_3_1()); }
	(rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_15_3_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_15_3_1()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVSSSVerificationValidationIntegrationRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVSSSVerificationValidationIntegrationRequirementsAction_0()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVSSSVerificationValidationIntegrationRequirementsKeyword_1()); }
	'VSSSVerificationValidationIntegrationRequirements'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVSSSVerificationValidationIntegrationRequirementsKeyword_1()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_2()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_3()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__Group_3__0)?
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_3()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_4()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__Group_4__0)?
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_4()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_5()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__Group_5__0)?
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_5()); }
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
	rule__VSSSVerificationValidationIntegrationRequirements__Group__7
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_6()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__Group_6__0)?
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationIntegrationRequirements__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3__0__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessKeyword_3_0()); }
	'verificationValidationProcess'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3__1__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3__2__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_3_2()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_3_2)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3__3__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_3_3()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__Group_3_3__0)*
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_3_4()); }
	'}'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationIntegrationRequirements__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3_3__0__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_3_3_0()); }
	','
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_3_3_1()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_3_3_1)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationIntegrationRequirements__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4__0__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachKeyword_4_0()); }
	'validationApproach'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4__1__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_4_1()); }
	'{'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4__2__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_4_2()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_4_2)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4__3__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_4_3()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__Group_4_3__0)*
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_4_4()); }
	'}'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationIntegrationRequirements__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4_3__0__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_4_3_0()); }
	','
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_4_3_1()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_4_3_1)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationIntegrationRequirements__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5__0__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationKeyword_5_0()); }
	'validation'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5__1__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_5_1()); }
	'{'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5__2__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_5_2()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_5_2)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5__3__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_5_3()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__Group_5_3__0)*
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_5_4()); }
	'}'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationIntegrationRequirements__Group_5_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5_3__0__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_5_3_0()); }
	','
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_5_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_5_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_5_3_1()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_5_3_1)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_5_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationIntegrationRequirements__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6__0__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationKeyword_6_0()); }
	'verification'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6__1__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_6_1()); }
	'{'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getLeftCurlyBracketKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6__2__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_6_2()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_6_2)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6__3__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_6_3()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__Group_6_3__0)*
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_6_4()); }
	'}'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getRightCurlyBracketKeyword_6_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationIntegrationRequirements__Group_6_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6_3__0__Impl
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_6_3_0()); }
	','
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getCommaKeyword_6_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationIntegrationRequirements__Group_6_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__Group_6_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_6_3_1()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_6_3_1)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_6_3_1()); }
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
	{ before(grammarAccess.getVSSSSystemModelsAccess().getVSSSSystemModelsKeyword_0()); }
	'VSSSSystemModels'
	{ after(grammarAccess.getVSSSSystemModelsAccess().getVSSSSystemModelsKeyword_0()); }
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
	{ before(grammarAccess.getVSSSSystemModelsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSSystemModelsAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsKeyword_2()); }
	'systemModels'
	{ after(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsKeyword_2()); }
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
	rule__VSSSSystemModels__Group__4
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
	{ before(grammarAccess.getVSSSSystemModelsAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSSystemModelsAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModels__Group__4__Impl
	rule__VSSSSystemModels__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsAssignment_4()); }
	(rule__VSSSSystemModels__SystemModelsAssignment_4)
	{ after(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModels__Group__5__Impl
	rule__VSSSSystemModels__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelsAccess().getGroup_5()); }
	(rule__VSSSSystemModels__Group_5__0)*
	{ after(grammarAccess.getVSSSSystemModelsAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModels__Group__6__Impl
	rule__VSSSSystemModels__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelsAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSSystemModelsAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModels__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelsAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSSystemModelsAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSystemModels__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModels__Group_5__0__Impl
	rule__VSSSSystemModels__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelsAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSSystemModelsAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemModels__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsAssignment_5_1()); }
	(rule__VSSSSystemModels__SystemModelsAssignment_5_1)
	{ after(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DBody_Impl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody_Impl__Group__0__Impl
	rule__DBody_Impl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBody_ImplAccess().getDBodyKeyword_0()); }
	'DBody'
	{ after(grammarAccess.getDBody_ImplAccess().getDBodyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody_Impl__Group__1__Impl
	rule__DBody_Impl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBody_ImplAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDBody_ImplAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody_Impl__Group__2__Impl
	rule__DBody_Impl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBody_ImplAccess().getBodyContentKeyword_2()); }
	'bodyContent'
	{ after(grammarAccess.getDBody_ImplAccess().getBodyContentKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody_Impl__Group__3__Impl
	rule__DBody_Impl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBody_ImplAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getDBody_ImplAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody_Impl__Group__4__Impl
	rule__DBody_Impl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBody_ImplAccess().getBodyContentAssignment_4()); }
	(rule__DBody_Impl__BodyContentAssignment_4)
	{ after(grammarAccess.getDBody_ImplAccess().getBodyContentAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody_Impl__Group__5__Impl
	rule__DBody_Impl__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBody_ImplAccess().getGroup_5()); }
	(rule__DBody_Impl__Group_5__0)*
	{ after(grammarAccess.getDBody_ImplAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody_Impl__Group__6__Impl
	rule__DBody_Impl__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBody_ImplAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getDBody_ImplAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody_Impl__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBody_ImplAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getDBody_ImplAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DBody_Impl__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody_Impl__Group_5__0__Impl
	rule__DBody_Impl__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBody_ImplAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getDBody_ImplAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DBody_Impl__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBody_ImplAccess().getBodyContentAssignment_5_1()); }
	(rule__DBody_Impl__BodyContentAssignment_5_1)
	{ after(grammarAccess.getDBody_ImplAccess().getBodyContentAssignment_5_1()); }
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
	{ before(grammarAccess.getDCellAccess().getDCellKeyword_0()); }
	'DCell'
	{ after(grammarAccess.getDCellAccess().getDCellKeyword_0()); }
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
	{ before(grammarAccess.getDCellAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDCellAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getDCellAccess().getBodyContentKeyword_2()); }
	'bodyContent'
	{ after(grammarAccess.getDCellAccess().getBodyContentKeyword_2()); }
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
	{ before(grammarAccess.getDCellAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getDCellAccess().getLeftCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getDCellAccess().getBodyContentAssignment_4()); }
	(rule__DCell__BodyContentAssignment_4)
	{ after(grammarAccess.getDCellAccess().getBodyContentAssignment_4()); }
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
	{ before(grammarAccess.getDCellAccess().getGroup_5()); }
	(rule__DCell__Group_5__0)*
	{ after(grammarAccess.getDCellAccess().getGroup_5()); }
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
	{ before(grammarAccess.getDCellAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getDCellAccess().getRightCurlyBracketKeyword_6()); }
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
	{ before(grammarAccess.getDCellAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getDCellAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DCell__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group_5__0__Impl
	rule__DCell__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getDCellAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DCell__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDCellAccess().getBodyContentAssignment_5_1()); }
	(rule__DCell__BodyContentAssignment_5_1)
	{ after(grammarAccess.getDCellAccess().getBodyContentAssignment_5_1()); }
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
	{ before(grammarAccess.getDParagraphAccess().getDParagraphKeyword_0()); }
	'DParagraph'
	{ after(grammarAccess.getDParagraphAccess().getDParagraphKeyword_0()); }
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
	{ before(grammarAccess.getDParagraphAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDParagraphAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getDParagraphAccess().getParagraphContentKeyword_2()); }
	'paragraphContent'
	{ after(grammarAccess.getDParagraphAccess().getParagraphContentKeyword_2()); }
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
	{ before(grammarAccess.getDParagraphAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getDParagraphAccess().getLeftCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_4()); }
	(rule__DParagraph__ParagraphContentAssignment_4)
	{ after(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_4()); }
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
	{ before(grammarAccess.getDParagraphAccess().getGroup_5()); }
	(rule__DParagraph__Group_5__0)*
	{ after(grammarAccess.getDParagraphAccess().getGroup_5()); }
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
	{ before(grammarAccess.getDParagraphAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getDParagraphAccess().getRightCurlyBracketKeyword_6()); }
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
	{ before(grammarAccess.getDParagraphAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getDParagraphAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DParagraph__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group_5__0__Impl
	rule__DParagraph__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getDParagraphAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DParagraph__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_5_1()); }
	(rule__DParagraph__ParagraphContentAssignment_5_1)
	{ after(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_5_1()); }
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
	{ before(grammarAccess.getDItemizeAccess().getDItemizeKeyword_0()); }
	'DItemize'
	{ after(grammarAccess.getDItemizeAccess().getDItemizeKeyword_0()); }
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
	{ before(grammarAccess.getDItemizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDItemizeAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getDItemizeAccess().getItemsKeyword_2()); }
	'items'
	{ after(grammarAccess.getDItemizeAccess().getItemsKeyword_2()); }
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
	{ before(grammarAccess.getDItemizeAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getDItemizeAccess().getLeftCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getDItemizeAccess().getItemsAssignment_4()); }
	(rule__DItemize__ItemsAssignment_4)
	{ after(grammarAccess.getDItemizeAccess().getItemsAssignment_4()); }
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
	{ before(grammarAccess.getDItemizeAccess().getGroup_5()); }
	(rule__DItemize__Group_5__0)*
	{ after(grammarAccess.getDItemizeAccess().getGroup_5()); }
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
	{ before(grammarAccess.getDItemizeAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getDItemizeAccess().getRightCurlyBracketKeyword_6()); }
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
	{ before(grammarAccess.getDItemizeAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getDItemizeAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DItemize__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group_5__0__Impl
	rule__DItemize__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getDItemizeAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DItemize__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDItemizeAccess().getItemsAssignment_5_1()); }
	(rule__DItemize__ItemsAssignment_5_1)
	{ after(grammarAccess.getDItemizeAccess().getItemsAssignment_5_1()); }
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
	{ before(grammarAccess.getDEnumerateAccess().getDEnumerateKeyword_0()); }
	'DEnumerate'
	{ after(grammarAccess.getDEnumerateAccess().getDEnumerateKeyword_0()); }
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
	{ before(grammarAccess.getDEnumerateAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDEnumerateAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getDEnumerateAccess().getItemsKeyword_2()); }
	'items'
	{ after(grammarAccess.getDEnumerateAccess().getItemsKeyword_2()); }
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
	{ before(grammarAccess.getDEnumerateAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getDEnumerateAccess().getLeftCurlyBracketKeyword_3()); }
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
	{ before(grammarAccess.getDEnumerateAccess().getItemsAssignment_4()); }
	(rule__DEnumerate__ItemsAssignment_4)
	{ after(grammarAccess.getDEnumerateAccess().getItemsAssignment_4()); }
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
	{ before(grammarAccess.getDEnumerateAccess().getGroup_5()); }
	(rule__DEnumerate__Group_5__0)*
	{ after(grammarAccess.getDEnumerateAccess().getGroup_5()); }
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
	{ before(grammarAccess.getDEnumerateAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getDEnumerateAccess().getRightCurlyBracketKeyword_6()); }
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
	{ before(grammarAccess.getDEnumerateAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getDEnumerateAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DEnumerate__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group_5__0__Impl
	rule__DEnumerate__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getDEnumerateAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DEnumerate__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDEnumerateAccess().getItemsAssignment_5_1()); }
	(rule__DEnumerate__ItemsAssignment_5_1)
	{ after(grammarAccess.getDEnumerateAccess().getItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DColumn__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group__0__Impl
	rule__DColumn__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getDColumnKeyword_0()); }
	'DColumn'
	{ after(grammarAccess.getDColumnAccess().getDColumnKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group__1__Impl
	rule__DColumn__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDColumnAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group__2__Impl
	rule__DColumn__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getSpanKeyword_2()); }
	'span'
	{ after(grammarAccess.getDColumnAccess().getSpanKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group__3__Impl
	rule__DColumn__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getSpanAssignment_3()); }
	(rule__DColumn__SpanAssignment_3)
	{ after(grammarAccess.getDColumnAccess().getSpanAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group__4__Impl
	rule__DColumn__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getCellsKeyword_4()); }
	'cells'
	{ after(grammarAccess.getDColumnAccess().getCellsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group__5__Impl
	rule__DColumn__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getDColumnAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group__6__Impl
	rule__DColumn__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getCellsAssignment_6()); }
	(rule__DColumn__CellsAssignment_6)
	{ after(grammarAccess.getDColumnAccess().getCellsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group__7__Impl
	rule__DColumn__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getGroup_7()); }
	(rule__DColumn__Group_7__0)*
	{ after(grammarAccess.getDColumnAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group__8__Impl
	rule__DColumn__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getDColumnAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getDColumnAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DColumn__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group_7__0__Impl
	rule__DColumn__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getCommaKeyword_7_0()); }
	','
	{ after(grammarAccess.getDColumnAccess().getCommaKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DColumn__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDColumnAccess().getCellsAssignment_7_1()); }
	(rule__DColumn__CellsAssignment_7_1)
	{ after(grammarAccess.getDColumnAccess().getCellsAssignment_7_1()); }
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
	{ before(grammarAccess.getDRunAccess().getDRunKeyword_0()); }
	'DRun'
	{ after(grammarAccess.getDRunAccess().getDRunKeyword_0()); }
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
	{ before(grammarAccess.getDRunAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDRunAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getDRunAccess().getBoldKeyword_2()); }
	'bold'
	{ after(grammarAccess.getDRunAccess().getBoldKeyword_2()); }
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
	{ before(grammarAccess.getDRunAccess().getBoldAssignment_3()); }
	(rule__DRun__BoldAssignment_3)
	{ after(grammarAccess.getDRunAccess().getBoldAssignment_3()); }
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
	{ before(grammarAccess.getDRunAccess().getItalicKeyword_4()); }
	'italic'
	{ after(grammarAccess.getDRunAccess().getItalicKeyword_4()); }
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
	{ before(grammarAccess.getDRunAccess().getItalicAssignment_5()); }
	(rule__DRun__ItalicAssignment_5)
	{ after(grammarAccess.getDRunAccess().getItalicAssignment_5()); }
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
	{ before(grammarAccess.getDRunAccess().getUnderscoreKeyword_6()); }
	'underscore'
	{ after(grammarAccess.getDRunAccess().getUnderscoreKeyword_6()); }
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
	{ before(grammarAccess.getDRunAccess().getUnderscoreAssignment_7()); }
	(rule__DRun__UnderscoreAssignment_7)
	{ after(grammarAccess.getDRunAccess().getUnderscoreAssignment_7()); }
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
	rule__DRun__Group__9
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
	{ before(grammarAccess.getDRunAccess().getTextKeyword_8()); }
	'text'
	{ after(grammarAccess.getDRunAccess().getTextKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group__9__Impl
	rule__DRun__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getTextAssignment_9()); }
	(rule__DRun__TextAssignment_9)
	{ after(grammarAccess.getDRunAccess().getTextAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRun__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRunAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getDRunAccess().getRightCurlyBracketKeyword_10()); }
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
	{ before(grammarAccess.getDHyperlinkAccess().getDHyperlinkKeyword_0()); }
	'DHyperlink'
	{ after(grammarAccess.getDHyperlinkAccess().getDHyperlinkKeyword_0()); }
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
	{ before(grammarAccess.getDHyperlinkAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDHyperlinkAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getDHyperlinkAccess().getReferenceKeyword_2()); }
	'reference'
	{ after(grammarAccess.getDHyperlinkAccess().getReferenceKeyword_2()); }
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
	{ before(grammarAccess.getDHyperlinkAccess().getReferenceAssignment_3()); }
	(rule__DHyperlink__ReferenceAssignment_3)
	{ after(grammarAccess.getDHyperlinkAccess().getReferenceAssignment_3()); }
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
	{ before(grammarAccess.getDHyperlinkAccess().getRunKeyword_4()); }
	'run'
	{ after(grammarAccess.getDHyperlinkAccess().getRunKeyword_4()); }
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
	rule__DHyperlink__Group__6
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
	{ before(grammarAccess.getDHyperlinkAccess().getRunAssignment_5()); }
	(rule__DHyperlink__RunAssignment_5)
	{ after(grammarAccess.getDHyperlinkAccess().getRunAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DHyperlink__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDHyperlinkAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getDHyperlinkAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DText__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DText__Group__0__Impl
	rule__DText__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DText__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTextAccess().getDTextKeyword_0()); }
	'DText'
	{ after(grammarAccess.getDTextAccess().getDTextKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DText__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DText__Group__1__Impl
	rule__DText__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DText__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTextAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDTextAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DText__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DText__Group__2__Impl
	rule__DText__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DText__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTextAccess().getContentKeyword_2()); }
	'content'
	{ after(grammarAccess.getDTextAccess().getContentKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DText__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DText__Group__3__Impl
	rule__DText__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DText__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTextAccess().getContentAssignment_3()); }
	(rule__DText__ContentAssignment_3)
	{ after(grammarAccess.getDTextAccess().getContentAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DText__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DText__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DText__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDTextAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getDTextAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DReferenceableObject_Impl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceableObject_Impl__Group__0__Impl
	rule__DReferenceableObject_Impl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceableObject_Impl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceableObject_ImplAccess().getDReferenceableObjectAction_0()); }
	()
	{ after(grammarAccess.getDReferenceableObject_ImplAccess().getDReferenceableObjectAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceableObject_Impl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceableObject_Impl__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceableObject_Impl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceableObject_ImplAccess().getDReferenceableObjectKeyword_1()); }
	'DReferenceableObject'
	{ after(grammarAccess.getDReferenceableObject_ImplAccess().getDReferenceableObjectKeyword_1()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getDApplicableDocumentKeyword_0()); }
	'DApplicableDocument'
	{ after(grammarAccess.getDApplicableDocumentAccess().getDApplicableDocumentKeyword_0()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDApplicableDocumentAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getTitleKeyword_2()); }
	'title'
	{ after(grammarAccess.getDApplicableDocumentAccess().getTitleKeyword_2()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getTitleAssignment_3()); }
	(rule__DApplicableDocument__TitleAssignment_3)
	{ after(grammarAccess.getDApplicableDocumentAccess().getTitleAssignment_3()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getIssueKeyword_4()); }
	'issue'
	{ after(grammarAccess.getDApplicableDocumentAccess().getIssueKeyword_4()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getIssueAssignment_5()); }
	(rule__DApplicableDocument__IssueAssignment_5)
	{ after(grammarAccess.getDApplicableDocumentAccess().getIssueAssignment_5()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_6()); }
	'revision'
	{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_6()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_7()); }
	(rule__DApplicableDocument__RevisionAssignment_7)
	{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_7()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getDApplicableDocumentAccess().getRightCurlyBracketKeyword_8()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getDReferenceDocumentKeyword_0()); }
	'DReferenceDocument'
	{ after(grammarAccess.getDReferenceDocumentAccess().getDReferenceDocumentKeyword_0()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDReferenceDocumentAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getTitleKeyword_2()); }
	'title'
	{ after(grammarAccess.getDReferenceDocumentAccess().getTitleKeyword_2()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getTitleAssignment_3()); }
	(rule__DReferenceDocument__TitleAssignment_3)
	{ after(grammarAccess.getDReferenceDocumentAccess().getTitleAssignment_3()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getIssueKeyword_4()); }
	'issue'
	{ after(grammarAccess.getDReferenceDocumentAccess().getIssueKeyword_4()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getIssueAssignment_5()); }
	(rule__DReferenceDocument__IssueAssignment_5)
	{ after(grammarAccess.getDReferenceDocumentAccess().getIssueAssignment_5()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_6()); }
	'revision'
	{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_6()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_7()); }
	(rule__DReferenceDocument__RevisionAssignment_7)
	{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_7()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getDReferenceDocumentAccess().getRightCurlyBracketKeyword_8()); }
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
	{ before(grammarAccess.getDListItemAccess().getDListItemKeyword_0()); }
	'DListItem'
	{ after(grammarAccess.getDListItemAccess().getDListItemKeyword_0()); }
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
	{ before(grammarAccess.getDListItemAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getDListItemAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getDListItemAccess().getParagraphKeyword_2()); }
	'paragraph'
	{ after(grammarAccess.getDListItemAccess().getParagraphKeyword_2()); }
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
	{ before(grammarAccess.getDListItemAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getDListItemAccess().getLeftCurlyBracketKeyword_3()); }
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
	rule__DListItem__Group__5
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
	{ before(grammarAccess.getDListItemAccess().getParagraphAssignment_4()); }
	(rule__DListItem__ParagraphAssignment_4)
	{ after(grammarAccess.getDListItemAccess().getParagraphAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group__5__Impl
	rule__DListItem__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getGroup_5()); }
	(rule__DListItem__Group_5__0)*
	{ after(grammarAccess.getDListItemAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group__6__Impl
	rule__DListItem__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getDListItemAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group__7__Impl
	rule__DListItem__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getGroup_7()); }
	(rule__DListItem__Group_7__0)?
	{ after(grammarAccess.getDListItemAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getDListItemAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DListItem__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group_5__0__Impl
	rule__DListItem__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getDListItemAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getParagraphAssignment_5_1()); }
	(rule__DListItem__ParagraphAssignment_5_1)
	{ after(grammarAccess.getDListItemAccess().getParagraphAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DListItem__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group_7__0__Impl
	rule__DListItem__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getSublistKeyword_7_0()); }
	'sublist'
	{ after(grammarAccess.getDListItemAccess().getSublistKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DListItem__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDListItemAccess().getSublistAssignment_7_1()); }
	(rule__DListItem__SublistAssignment_7_1)
	{ after(grammarAccess.getDListItemAccess().getSublistAssignment_7_1()); }
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
	{ before(grammarAccess.getVSSSTermAccess().getVSSSTermKeyword_0()); }
	'VSSSTerm'
	{ after(grammarAccess.getVSSSTermAccess().getVSSSTermKeyword_0()); }
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
	{ before(grammarAccess.getVSSSTermAccess().getNameAssignment_1()); }
	(rule__VSSSTerm__NameAssignment_1)
	{ after(grammarAccess.getVSSSTermAccess().getNameAssignment_1()); }
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
	{ before(grammarAccess.getVSSSTermAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getVSSSTermAccess().getLeftCurlyBracketKeyword_2()); }
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
	{ before(grammarAccess.getVSSSTermAccess().getDescriptionKeyword_3()); }
	'description'
	{ after(grammarAccess.getVSSSTermAccess().getDescriptionKeyword_3()); }
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
	{ before(grammarAccess.getVSSSTermAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getVSSSTermAccess().getRightCurlyBracketKeyword_5()); }
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
	{ before(grammarAccess.getVSSSDefinitionAccess().getVSSSDefinitionKeyword_0()); }
	'VSSSDefinition'
	{ after(grammarAccess.getVSSSDefinitionAccess().getVSSSDefinitionKeyword_0()); }
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
	{ before(grammarAccess.getVSSSDefinitionAccess().getNameAssignment_1()); }
	(rule__VSSSDefinition__NameAssignment_1)
	{ after(grammarAccess.getVSSSDefinitionAccess().getNameAssignment_1()); }
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
	{ before(grammarAccess.getVSSSDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getVSSSDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
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
	{ before(grammarAccess.getVSSSDefinitionAccess().getDescriptionKeyword_3()); }
	'description'
	{ after(grammarAccess.getVSSSDefinitionAccess().getDescriptionKeyword_3()); }
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
	{ before(grammarAccess.getVSSSDefinitionAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getVSSSDefinitionAccess().getRightCurlyBracketKeyword_5()); }
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
	{ before(grammarAccess.getVSSSAbbreviationAccess().getVSSSAbbreviationKeyword_0()); }
	'VSSSAbbreviation'
	{ after(grammarAccess.getVSSSAbbreviationAccess().getVSSSAbbreviationKeyword_0()); }
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
	{ before(grammarAccess.getVSSSAbbreviationAccess().getNameAssignment_1()); }
	(rule__VSSSAbbreviation__NameAssignment_1)
	{ after(grammarAccess.getVSSSAbbreviationAccess().getNameAssignment_1()); }
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
	{ before(grammarAccess.getVSSSAbbreviationAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getVSSSAbbreviationAccess().getLeftCurlyBracketKeyword_2()); }
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
	{ before(grammarAccess.getVSSSAbbreviationAccess().getDescriptionKeyword_3()); }
	'description'
	{ after(grammarAccess.getVSSSAbbreviationAccess().getDescriptionKeyword_3()); }
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
	{ before(grammarAccess.getVSSSAbbreviationAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getVSSSAbbreviationAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSGeneralDescriptionSubsection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescriptionSubsection__Group__0__Impl
	rule__VSSSGeneralDescriptionSubsection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescriptionSubsection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getVSSSGeneralDescriptionSubsectionKeyword_0()); }
	'VSSSGeneralDescriptionSubsection'
	{ after(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getVSSSGeneralDescriptionSubsectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescriptionSubsection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescriptionSubsection__Group__1__Impl
	rule__VSSSGeneralDescriptionSubsection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescriptionSubsection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescriptionSubsection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescriptionSubsection__Group__2__Impl
	rule__VSSSGeneralDescriptionSubsection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescriptionSubsection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyKeyword_2()); }
	'body'
	{ after(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescriptionSubsection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescriptionSubsection__Group__3__Impl
	rule__VSSSGeneralDescriptionSubsection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescriptionSubsection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyAssignment_3()); }
	(rule__VSSSGeneralDescriptionSubsection__BodyAssignment_3)
	{ after(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescriptionSubsection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralDescriptionSubsection__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescriptionSubsection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSGeneralRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirement__Group__0__Impl
	rule__VSSSGeneralRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementAccess().getVSSSGeneralRequirementKeyword_0()); }
	'VSSSGeneralRequirement'
	{ after(grammarAccess.getVSSSGeneralRequirementAccess().getVSSSGeneralRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirement__Group__1__Impl
	rule__VSSSGeneralRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSGeneralRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirement__Group__2__Impl
	rule__VSSSGeneralRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirement__Group__3__Impl
	rule__VSSSGeneralRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSGeneralRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirement__Group__4__Impl
	rule__VSSSGeneralRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSGeneralRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirement__Group__5__Impl
	rule__VSSSGeneralRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementAccess().getGroup_5()); }
	(rule__VSSSGeneralRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSGeneralRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirement__Group__6__Impl
	rule__VSSSGeneralRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSGeneralRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSGeneralRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSGeneralRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirement__Group_5__0__Impl
	rule__VSSSGeneralRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSGeneralRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSGeneralRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSGeneralRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSCapabilitiesRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirement__Group__0__Impl
	rule__VSSSCapabilitiesRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getVSSSCapabilitiesRequirementKeyword_0()); }
	'VSSSCapabilitiesRequirement'
	{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getVSSSCapabilitiesRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirement__Group__1__Impl
	rule__VSSSCapabilitiesRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirement__Group__2__Impl
	rule__VSSSCapabilitiesRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirement__Group__3__Impl
	rule__VSSSCapabilitiesRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirement__Group__4__Impl
	rule__VSSSCapabilitiesRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSCapabilitiesRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirement__Group__5__Impl
	rule__VSSSCapabilitiesRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getGroup_5()); }
	(rule__VSSSCapabilitiesRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirement__Group__6__Impl
	rule__VSSSCapabilitiesRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSCapabilitiesRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirement__Group_5__0__Impl
	rule__VSSSCapabilitiesRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSCapabilitiesRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSCapabilitiesRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSystemInterfaceRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirement__Group__0__Impl
	rule__VSSSSystemInterfaceRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getVSSSSystemInterfaceRequirementKeyword_0()); }
	'VSSSSystemInterfaceRequirement'
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getVSSSSystemInterfaceRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirement__Group__1__Impl
	rule__VSSSSystemInterfaceRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirement__Group__2__Impl
	rule__VSSSSystemInterfaceRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirement__Group__3__Impl
	rule__VSSSSystemInterfaceRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirement__Group__4__Impl
	rule__VSSSSystemInterfaceRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSSystemInterfaceRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirement__Group__5__Impl
	rule__VSSSSystemInterfaceRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getGroup_5()); }
	(rule__VSSSSystemInterfaceRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirement__Group__6__Impl
	rule__VSSSSystemInterfaceRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSystemInterfaceRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirement__Group_5__0__Impl
	rule__VSSSSystemInterfaceRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemInterfaceRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSSystemInterfaceRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSAdaptationMissionizationRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirement__Group__0__Impl
	rule__VSSSAdaptationMissionizationRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getVSSSAdaptationMissionizationRequirementKeyword_0()); }
	'VSSSAdaptationMissionizationRequirement'
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getVSSSAdaptationMissionizationRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirement__Group__1__Impl
	rule__VSSSAdaptationMissionizationRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirement__Group__2__Impl
	rule__VSSSAdaptationMissionizationRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirement__Group__3__Impl
	rule__VSSSAdaptationMissionizationRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirement__Group__4__Impl
	rule__VSSSAdaptationMissionizationRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSAdaptationMissionizationRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirement__Group__5__Impl
	rule__VSSSAdaptationMissionizationRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getGroup_5()); }
	(rule__VSSSAdaptationMissionizationRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirement__Group__6__Impl
	rule__VSSSAdaptationMissionizationRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSAdaptationMissionizationRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirement__Group_5__0__Impl
	rule__VSSSAdaptationMissionizationRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSAdaptationMissionizationRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSAdaptationMissionizationRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSComputerResourceRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirement__Group__0__Impl
	rule__VSSSComputerResourceRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getVSSSComputerResourceRequirementKeyword_0()); }
	'VSSSComputerResourceRequirement'
	{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getVSSSComputerResourceRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirement__Group__1__Impl
	rule__VSSSComputerResourceRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirement__Group__2__Impl
	rule__VSSSComputerResourceRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirement__Group__3__Impl
	rule__VSSSComputerResourceRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirement__Group__4__Impl
	rule__VSSSComputerResourceRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSComputerResourceRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirement__Group__5__Impl
	rule__VSSSComputerResourceRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getGroup_5()); }
	(rule__VSSSComputerResourceRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirement__Group__6__Impl
	rule__VSSSComputerResourceRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSComputerResourceRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirement__Group_5__0__Impl
	rule__VSSSComputerResourceRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSComputerResourceRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSComputerResourceRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSecurityRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirement__Group__0__Impl
	rule__VSSSSecurityRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementAccess().getVSSSSecurityRequirementKeyword_0()); }
	'VSSSSecurityRequirement'
	{ after(grammarAccess.getVSSSSecurityRequirementAccess().getVSSSSecurityRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirement__Group__1__Impl
	rule__VSSSSecurityRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSSecurityRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirement__Group__2__Impl
	rule__VSSSSecurityRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirement__Group__3__Impl
	rule__VSSSSecurityRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSSecurityRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirement__Group__4__Impl
	rule__VSSSSecurityRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSSecurityRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirement__Group__5__Impl
	rule__VSSSSecurityRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementAccess().getGroup_5()); }
	(rule__VSSSSecurityRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSSecurityRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirement__Group__6__Impl
	rule__VSSSSecurityRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSSecurityRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSSecurityRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSecurityRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirement__Group_5__0__Impl
	rule__VSSSSecurityRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSSecurityRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSecurityRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSSecurityRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSafetyRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirement__Group__0__Impl
	rule__VSSSSafetyRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementAccess().getVSSSSafetyRequirementKeyword_0()); }
	'VSSSSafetyRequirement'
	{ after(grammarAccess.getVSSSSafetyRequirementAccess().getVSSSSafetyRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirement__Group__1__Impl
	rule__VSSSSafetyRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSSafetyRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirement__Group__2__Impl
	rule__VSSSSafetyRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirement__Group__3__Impl
	rule__VSSSSafetyRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSSafetyRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirement__Group__4__Impl
	rule__VSSSSafetyRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSSafetyRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirement__Group__5__Impl
	rule__VSSSSafetyRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementAccess().getGroup_5()); }
	(rule__VSSSSafetyRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSSafetyRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirement__Group__6__Impl
	rule__VSSSSafetyRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSSafetyRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSSafetyRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSafetyRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirement__Group_5__0__Impl
	rule__VSSSSafetyRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSSafetyRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSafetyRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSSafetyRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSReliabiltyAvailabilityRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirement__Group__0__Impl
	rule__VSSSReliabiltyAvailabilityRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getVSSSReliabiltyAvailabilityRequirementKeyword_0()); }
	'VSSSReliabiltyAvailabilityRequirement'
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getVSSSReliabiltyAvailabilityRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirement__Group__1__Impl
	rule__VSSSReliabiltyAvailabilityRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirement__Group__2__Impl
	rule__VSSSReliabiltyAvailabilityRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirement__Group__3__Impl
	rule__VSSSReliabiltyAvailabilityRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirement__Group__4__Impl
	rule__VSSSReliabiltyAvailabilityRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSReliabiltyAvailabilityRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirement__Group__5__Impl
	rule__VSSSReliabiltyAvailabilityRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getGroup_5()); }
	(rule__VSSSReliabiltyAvailabilityRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirement__Group__6__Impl
	rule__VSSSReliabiltyAvailabilityRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSReliabiltyAvailabilityRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirement__Group_5__0__Impl
	rule__VSSSReliabiltyAvailabilityRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSReliabiltyAvailabilityRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSQualityRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirement__Group__0__Impl
	rule__VSSSQualityRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementAccess().getVSSSQualityRequirementKeyword_0()); }
	'VSSSQualityRequirement'
	{ after(grammarAccess.getVSSSQualityRequirementAccess().getVSSSQualityRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirement__Group__1__Impl
	rule__VSSSQualityRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSQualityRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirement__Group__2__Impl
	rule__VSSSQualityRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirement__Group__3__Impl
	rule__VSSSQualityRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSQualityRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirement__Group__4__Impl
	rule__VSSSQualityRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSQualityRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirement__Group__5__Impl
	rule__VSSSQualityRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementAccess().getGroup_5()); }
	(rule__VSSSQualityRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSQualityRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirement__Group__6__Impl
	rule__VSSSQualityRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSQualityRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSQualityRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSQualityRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirement__Group_5__0__Impl
	rule__VSSSQualityRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSQualityRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSQualityRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSQualityRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSDesignRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirement__Group__0__Impl
	rule__VSSSDesignRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementAccess().getVSSSDesignRequirementKeyword_0()); }
	'VSSSDesignRequirement'
	{ after(grammarAccess.getVSSSDesignRequirementAccess().getVSSSDesignRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirement__Group__1__Impl
	rule__VSSSDesignRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSDesignRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirement__Group__2__Impl
	rule__VSSSDesignRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirement__Group__3__Impl
	rule__VSSSDesignRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSDesignRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirement__Group__4__Impl
	rule__VSSSDesignRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSDesignRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirement__Group__5__Impl
	rule__VSSSDesignRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementAccess().getGroup_5()); }
	(rule__VSSSDesignRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSDesignRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirement__Group__6__Impl
	rule__VSSSDesignRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSDesignRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSDesignRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSDesignRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirement__Group_5__0__Impl
	rule__VSSSDesignRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSDesignRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSDesignRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSDesignRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSoftwareOperationsRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirement__Group__0__Impl
	rule__VSSSSoftwareOperationsRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getVSSSSoftwareOperationsRequirementKeyword_0()); }
	'VSSSSoftwareOperationsRequirement'
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getVSSSSoftwareOperationsRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirement__Group__1__Impl
	rule__VSSSSoftwareOperationsRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirement__Group__2__Impl
	rule__VSSSSoftwareOperationsRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirement__Group__3__Impl
	rule__VSSSSoftwareOperationsRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirement__Group__4__Impl
	rule__VSSSSoftwareOperationsRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSSoftwareOperationsRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirement__Group__5__Impl
	rule__VSSSSoftwareOperationsRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getGroup_5()); }
	(rule__VSSSSoftwareOperationsRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirement__Group__6__Impl
	rule__VSSSSoftwareOperationsRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSoftwareOperationsRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirement__Group_5__0__Impl
	rule__VSSSSoftwareOperationsRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareOperationsRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSSoftwareOperationsRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSoftwareMaintenanceRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirement__Group__0__Impl
	rule__VSSSSoftwareMaintenanceRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getVSSSSoftwareMaintenanceRequirementKeyword_0()); }
	'VSSSSoftwareMaintenanceRequirement'
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getVSSSSoftwareMaintenanceRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirement__Group__1__Impl
	rule__VSSSSoftwareMaintenanceRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirement__Group__2__Impl
	rule__VSSSSoftwareMaintenanceRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirement__Group__3__Impl
	rule__VSSSSoftwareMaintenanceRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirement__Group__4__Impl
	rule__VSSSSoftwareMaintenanceRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSSoftwareMaintenanceRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirement__Group__5__Impl
	rule__VSSSSoftwareMaintenanceRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getGroup_5()); }
	(rule__VSSSSoftwareMaintenanceRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirement__Group__6__Impl
	rule__VSSSSoftwareMaintenanceRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSoftwareMaintenanceRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirement__Group_5__0__Impl
	rule__VSSSSoftwareMaintenanceRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSoftwareMaintenanceRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSSoftwareMaintenanceRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSystemSoftwareObservabilityRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__0__Impl
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getVSSSSystemSoftwareObservabilityRequirementKeyword_0()); }
	'VSSSSystemSoftwareObservabilityRequirement'
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getVSSSSystemSoftwareObservabilityRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__1__Impl
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__2__Impl
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__3__Impl
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__4__Impl
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSSystemSoftwareObservabilityRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__5__Impl
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getGroup_5()); }
	(rule__VSSSSystemSoftwareObservabilityRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__6__Impl
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSSystemSoftwareObservabilityRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirement__Group_5__0__Impl
	rule__VSSSSystemSoftwareObservabilityRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSSystemSoftwareObservabilityRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSSystemSoftwareObservabilityRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsAssignment_5_1()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getVSSSDocumentItemKeyword_0()); }
	'VSSSDocumentItem'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getVSSSDocumentItemKeyword_0()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getIdKeyword_2()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getIdAssignment_3()); }
	(rule__VSSSDocumentItem__IdAssignment_3)
	{ after(grammarAccess.getVSSSDocumentItemAccess().getIdAssignment_3()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodKeyword_4()); }
	'verificationMethod'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodKeyword_4()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodAssignment_5()); }
	(rule__VSSSDocumentItem__VerificationMethodAssignment_5)
	{ after(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodAssignment_5()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getBodyKeyword_6()); }
	'body'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getBodyKeyword_6()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getBodyAssignment_7()); }
	(rule__VSSSDocumentItem__BodyAssignment_7)
	{ after(grammarAccess.getVSSSDocumentItemAccess().getBodyAssignment_7()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationProcessRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirement__Group__0__Impl
	rule__VSSSVerificationValidationProcessRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getVSSSVerificationValidationProcessRequirementKeyword_0()); }
	'VSSSVerificationValidationProcessRequirement'
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getVSSSVerificationValidationProcessRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirement__Group__1__Impl
	rule__VSSSVerificationValidationProcessRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirement__Group__2__Impl
	rule__VSSSVerificationValidationProcessRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirement__Group__3__Impl
	rule__VSSSVerificationValidationProcessRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirement__Group__4__Impl
	rule__VSSSVerificationValidationProcessRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSVerificationValidationProcessRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirement__Group__5__Impl
	rule__VSSSVerificationValidationProcessRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getGroup_5()); }
	(rule__VSSSVerificationValidationProcessRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirement__Group__6__Impl
	rule__VSSSVerificationValidationProcessRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationValidationProcessRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirement__Group_5__0__Impl
	rule__VSSSVerificationValidationProcessRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationValidationProcessRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSVerificationValidationProcessRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsAssignment_5_1()); }
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
	{ before(grammarAccess.getVSSSValidationApproachAccess().getVSSSValidationApproachKeyword_0()); }
	'VSSSValidationApproach'
	{ after(grammarAccess.getVSSSValidationApproachAccess().getVSSSValidationApproachKeyword_0()); }
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
	{ before(grammarAccess.getVSSSValidationApproachAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSValidationApproachAccess().getLeftCurlyBracketKeyword_1()); }
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
	{ before(grammarAccess.getVSSSValidationApproachAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSValidationApproachAccess().getSssItemsKeyword_2()); }
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
	{ before(grammarAccess.getVSSSValidationApproachAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSValidationApproachAccess().getLeftCurlyBracketKeyword_3()); }
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
	rule__VSSSValidationApproach__Group__5
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
	{ before(grammarAccess.getVSSSValidationApproachAccess().getSssItemsAssignment_4()); }
	(rule__VSSSValidationApproach__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSValidationApproachAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationApproach__Group__5__Impl
	rule__VSSSValidationApproach__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationApproachAccess().getGroup_5()); }
	(rule__VSSSValidationApproach__Group_5__0)*
	{ after(grammarAccess.getVSSSValidationApproachAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationApproach__Group__6__Impl
	rule__VSSSValidationApproach__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationApproachAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSValidationApproachAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationApproach__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationApproachAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSValidationApproachAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSValidationApproach__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationApproach__Group_5__0__Impl
	rule__VSSSValidationApproach__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationApproachAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSValidationApproachAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationApproach__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationApproachAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSValidationApproach__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSValidationApproachAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSValidationRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirement__Group__0__Impl
	rule__VSSSValidationRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementAccess().getVSSSValidationRequirementKeyword_0()); }
	'VSSSValidationRequirement'
	{ after(grammarAccess.getVSSSValidationRequirementAccess().getVSSSValidationRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirement__Group__1__Impl
	rule__VSSSValidationRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSValidationRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirement__Group__2__Impl
	rule__VSSSValidationRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirement__Group__3__Impl
	rule__VSSSValidationRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSValidationRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirement__Group__4__Impl
	rule__VSSSValidationRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSValidationRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirement__Group__5__Impl
	rule__VSSSValidationRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementAccess().getGroup_5()); }
	(rule__VSSSValidationRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSValidationRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirement__Group__6__Impl
	rule__VSSSValidationRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSValidationRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSValidationRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSValidationRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirement__Group_5__0__Impl
	rule__VSSSValidationRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSValidationRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSValidationRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSValidationRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationRequirement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirement__Group__0__Impl
	rule__VSSSVerificationRequirement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementAccess().getVSSSVerificationRequirementKeyword_0()); }
	'VSSSVerificationRequirement'
	{ after(grammarAccess.getVSSSVerificationRequirementAccess().getVSSSVerificationRequirementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirement__Group__1__Impl
	rule__VSSSVerificationRequirement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVSSSVerificationRequirementAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirement__Group__2__Impl
	rule__VSSSVerificationRequirement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsKeyword_2()); }
	'sssItems'
	{ after(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirement__Group__3__Impl
	rule__VSSSVerificationRequirement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getVSSSVerificationRequirementAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirement__Group__4__Impl
	rule__VSSSVerificationRequirement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsAssignment_4()); }
	(rule__VSSSVerificationRequirement__SssItemsAssignment_4)
	{ after(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirement__Group__5__Impl
	rule__VSSSVerificationRequirement__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementAccess().getGroup_5()); }
	(rule__VSSSVerificationRequirement__Group_5__0)*
	{ after(grammarAccess.getVSSSVerificationRequirementAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirement__Group__6__Impl
	rule__VSSSVerificationRequirement__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVSSSVerificationRequirementAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirement__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getVSSSVerificationRequirementAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSVerificationRequirement__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirement__Group_5__0__Impl
	rule__VSSSVerificationRequirement__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementAccess().getCommaKeyword_5_0()); }
	','
	{ after(grammarAccess.getVSSSVerificationRequirementAccess().getCommaKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSVerificationRequirement__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsAssignment_5_1()); }
	(rule__VSSSVerificationRequirement__SssItemsAssignment_5_1)
	{ after(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsAssignment_5_1()); }
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
	{ before(grammarAccess.getVSSSSystemModelAccess().getVSSSSystemModelKeyword_1()); }
	'VSSSSystemModel'
	{ after(grammarAccess.getVSSSSystemModelAccess().getVSSSSystemModelKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__0__Impl
	rule__Version__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getAlternatives_0()); }
	(rule__Version__Alternatives_0)
	{ after(grammarAccess.getVersionAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getGroup_1()); }
	(rule__Version__Group_1__0)*
	{ after(grammarAccess.getVersionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_0_1__0__Impl
	rule__Version__Group_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); }
	(RULE_INT)?
	{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); }
	RULE_ID
	{ after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1__0__Impl
	rule__Version__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getAlternatives_1_1()); }
	(rule__Version__Alternatives_1_1)
	{ after(grammarAccess.getVersionAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_1_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1_1_1__0__Impl
	rule__Version__Group_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); }
	(RULE_INT)?
	{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); }
	RULE_ID
	{ after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__0__Impl
	rule__VersionedQualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__1__Impl
	rule__VersionedQualifiedName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__2__Impl
	rule__VersionedQualifiedName__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); }
	ruleVersion
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSDocument__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getVSSSDocumentAccess().getNameEStringParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getVSSSDocumentAccess().getIdEStringParserRuleCall_4_0()); }
		ruleEString
		{ after(grammarAccess.getVSSSDocumentAccess().getIdEStringParserRuleCall_4_0()); }
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
		{ before(grammarAccess.getVSSSDocumentAccess().getIssueEStringParserRuleCall_6_0()); }
		ruleEString
		{ after(grammarAccess.getVSSSDocumentAccess().getIssueEStringParserRuleCall_6_0()); }
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
		{ before(grammarAccess.getVSSSDocumentAccess().getRevisionEStringParserRuleCall_8_0()); }
		ruleEString
		{ after(grammarAccess.getVSSSDocumentAccess().getRevisionEStringParserRuleCall_8_0()); }
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
		{ before(grammarAccess.getVSSSDocumentAccess().getDateEStringParserRuleCall_10_0()); }
		ruleEString
		{ after(grammarAccess.getVSSSDocumentAccess().getDateEStringParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__ParentsAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getParentsVTraceableDocumentCrossReference_11_2_0()); }
		(
			{ before(grammarAccess.getVSSSDocumentAccess().getParentsVTraceableDocumentEStringParserRuleCall_11_2_0_1()); }
			ruleEString
			{ after(grammarAccess.getVSSSDocumentAccess().getParentsVTraceableDocumentEStringParserRuleCall_11_2_0_1()); }
		)
		{ after(grammarAccess.getVSSSDocumentAccess().getParentsVTraceableDocumentCrossReference_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__ParentsAssignment_11_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getParentsVTraceableDocumentCrossReference_11_3_1_0()); }
		(
			{ before(grammarAccess.getVSSSDocumentAccess().getParentsVTraceableDocumentEStringParserRuleCall_11_3_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getVSSSDocumentAccess().getParentsVTraceableDocumentEStringParserRuleCall_11_3_1_0_1()); }
		)
		{ after(grammarAccess.getVSSSDocumentAccess().getParentsVTraceableDocumentCrossReference_11_3_1_0()); }
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

rule__VSSSDocument__ApplicableDocumentsSectionAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_15_0()); }
		ruleVSSSApplicableDocuments
		{ after(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__ReferenceDocumentsSectionAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_17_0()); }
		ruleVSSSReferenceDocuments
		{ after(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__TermsDefinitionsAbbreviationsSectionAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_19_0()); }
		ruleVSSSTermsDefinitionsAbbreviations
		{ after(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_19_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__GeneralDescriptionSectionAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_21_0()); }
		ruleVSSSGeneralDescription
		{ after(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__SpecificRequirementsSectionAssignment_23
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_23_0()); }
		ruleVSSSSpecificRequirements
		{ after(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_23_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__VerificationValidationIntegrationSectionAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_25_0()); }
		ruleVSSSVerificationValidationIntegrationRequirements
		{ after(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__SystemModelsSectionAssignment_26_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionVSSSSystemModelsParserRuleCall_26_1_0()); }
		ruleVSSSSystemModels
		{ after(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionVSSSSystemModelsParserRuleCall_26_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__PurposeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getPurposeDBodyParserRuleCall_3_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSIntroductionAccess().getPurposeDBodyParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__ObjetiveAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getObjetiveDBodyParserRuleCall_5_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSIntroductionAccess().getObjetiveDBodyParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__ContentAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getContentDBodyParserRuleCall_7_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSIntroductionAccess().getContentDBodyParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__ReasonAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getReasonDBodyParserRuleCall_9_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSIntroductionAccess().getReasonDBodyParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__ApplicableDocumentsAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_3_2_0()); }
		ruleDApplicableDocument
		{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSApplicableDocuments__ApplicableDocumentsAssignment_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_3_3_1_0()); }
		ruleDApplicableDocument
		{ after(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_3_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__ReferenceDocumentsAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_3_2_0()); }
		ruleDReferenceDocument
		{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReferenceDocuments__ReferenceDocumentsAssignment_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_3_3_1_0()); }
		ruleDReferenceDocument
		{ after(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_3_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__TermsAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsVSSSTermParserRuleCall_3_2_0()); }
		ruleVSSSTerm
		{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsVSSSTermParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__TermsAssignment_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsVSSSTermParserRuleCall_3_3_1_0()); }
		ruleVSSSTerm
		{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsVSSSTermParserRuleCall_3_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__DefinitionsAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSSSDefinitionParserRuleCall_4_2_0()); }
		ruleVSSSDefinition
		{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSSSDefinitionParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__DefinitionsAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSSSDefinitionParserRuleCall_4_3_1_0()); }
		ruleVSSSDefinition
		{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSSSDefinitionParserRuleCall_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__AbbreviationsAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSSSAbbreviationParserRuleCall_5_2_0()); }
		ruleVSSSAbbreviation
		{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSSSAbbreviationParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTermsDefinitionsAbbreviations__AbbreviationsAssignment_5_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSSSAbbreviationParserRuleCall_5_3_1_0()); }
		ruleVSSSAbbreviation
		{ after(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSSSAbbreviationParserRuleCall_5_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__ProductPerspectiveAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_3_0()); }
		ruleVSSSGeneralDescriptionSubsection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__GeneralCapabilitesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0()); }
		ruleVSSSGeneralDescriptionSubsection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__GeneralConstraintsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_7_0()); }
		ruleVSSSGeneralDescriptionSubsection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__OperationalEnvironmentAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_9_0()); }
		ruleVSSSGeneralDescriptionSubsection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescription__AssumptionsDependenciesAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_11_0()); }
		ruleVSSSGeneralDescriptionSubsection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__GeneralAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementParserRuleCall_3_2_0()); }
		ruleVSSSGeneralRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__GeneralAssignment_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementParserRuleCall_3_3_1_0()); }
		ruleVSSSGeneralRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementParserRuleCall_3_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__CapabilitiesAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_2_0()); }
		ruleVSSSCapabilitiesRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__CapabilitiesAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_3_1_0()); }
		ruleVSSSCapabilitiesRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SystemInterfaceAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_2_0()); }
		ruleVSSSSystemInterfaceRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SystemInterfaceAssignment_5_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_3_1_0()); }
		ruleVSSSSystemInterfaceRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_2_0()); }
		ruleVSSSAdaptationMissionizationRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_6_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_3_1_0()); }
		ruleVSSSAdaptationMissionizationRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__ComputerResourceAssignment_7_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_2_0()); }
		ruleVSSSComputerResourceRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__ComputerResourceAssignment_7_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_3_1_0()); }
		ruleVSSSComputerResourceRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SecurityAssignment_8_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementParserRuleCall_8_2_0()); }
		ruleVSSSSecurityRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementParserRuleCall_8_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SecurityAssignment_8_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementParserRuleCall_8_3_1_0()); }
		ruleVSSSSecurityRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementParserRuleCall_8_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SafetyAssignment_9_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementParserRuleCall_9_2_0()); }
		ruleVSSSSafetyRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementParserRuleCall_9_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SafetyAssignment_9_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementParserRuleCall_9_3_1_0()); }
		ruleVSSSSafetyRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementParserRuleCall_9_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__ReliabiltyAvailabilityAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_2_0()); }
		ruleVSSSReliabiltyAvailabilityRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__ReliabiltyAvailabilityAssignment_10_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_3_1_0()); }
		ruleVSSSReliabiltyAvailabilityRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__QualityAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementParserRuleCall_11_2_0()); }
		ruleVSSSQualityRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementParserRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__QualityAssignment_11_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementParserRuleCall_11_3_1_0()); }
		ruleVSSSQualityRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementParserRuleCall_11_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__DesignAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementParserRuleCall_12_2_0()); }
		ruleVSSSDesignRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementParserRuleCall_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__DesignAssignment_12_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementParserRuleCall_12_3_1_0()); }
		ruleVSSSDesignRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementParserRuleCall_12_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_13_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_2_0()); }
		ruleVSSSSoftwareOperationsRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_13_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_3_1_0()); }
		ruleVSSSSoftwareOperationsRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_2_0()); }
		ruleVSSSSoftwareMaintenanceRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_14_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_3_1_0()); }
		ruleVSSSSoftwareMaintenanceRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_2_0()); }
		ruleVSSSSystemSoftwareObservabilityRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_15_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_3_1_0()); }
		ruleVSSSSystemSoftwareObservabilityRequirement
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_2_0()); }
		ruleVSSSVerificationValidationProcessRequirement
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_3_1_0()); }
		ruleVSSSVerificationValidationProcessRequirement
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_4_2_0()); }
		ruleVSSSValidationApproach
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_4_3_1_0()); }
		ruleVSSSValidationApproach
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementParserRuleCall_5_2_0()); }
		ruleVSSSValidationRequirement
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_5_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementParserRuleCall_5_3_1_0()); }
		ruleVSSSValidationRequirement
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementParserRuleCall_5_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementParserRuleCall_6_2_0()); }
		ruleVSSSVerificationRequirement
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementParserRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_6_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementParserRuleCall_6_3_1_0()); }
		ruleVSSSVerificationRequirement
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementParserRuleCall_6_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__SystemModelsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsVSSSSystemModelParserRuleCall_4_0()); }
		ruleVSSSSystemModel
		{ after(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsVSSSSystemModelParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemModels__SystemModelsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsVSSSSystemModelParserRuleCall_5_1_0()); }
		ruleVSSSSystemModel
		{ after(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsVSSSSystemModelParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__BodyContentAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBody_ImplAccess().getBodyContentDBodyContentParserRuleCall_4_0()); }
		ruleDBodyContent
		{ after(grammarAccess.getDBody_ImplAccess().getBodyContentDBodyContentParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBody_Impl__BodyContentAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBody_ImplAccess().getBodyContentDBodyContentParserRuleCall_5_1_0()); }
		ruleDBodyContent
		{ after(grammarAccess.getDBody_ImplAccess().getBodyContentDBodyContentParserRuleCall_5_1_0()); }
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

rule__DCell__BodyContentAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_5_1_0()); }
		ruleDBodyContent
		{ after(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__ParagraphContentAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_4_0()); }
		ruleDParagraphContent
		{ after(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DParagraph__ParagraphContentAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_5_1_0()); }
		ruleDParagraphContent
		{ after(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__ItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_4_0()); }
		ruleDListItem
		{ after(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DItemize__ItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_5_1_0()); }
		ruleDListItem
		{ after(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__ItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_4_0()); }
		ruleDListItem
		{ after(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DEnumerate__ItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_5_1_0()); }
		ruleDListItem
		{ after(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__SpanAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDColumnAccess().getSpanEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getDColumnAccess().getSpanEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__CellsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDColumnAccess().getCellsDCellParserRuleCall_6_0()); }
		ruleDCell
		{ after(grammarAccess.getDColumnAccess().getCellsDCellParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__CellsAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDColumnAccess().getCellsDCellParserRuleCall_7_1_0()); }
		ruleDCell
		{ after(grammarAccess.getDColumnAccess().getCellsDCellParserRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__BoldAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getBoldDRunFormatEnableDisableEnumRuleCall_3_0()); }
		ruleDRunFormatEnableDisable
		{ after(grammarAccess.getDRunAccess().getBoldDRunFormatEnableDisableEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__ItalicAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getItalicDRunFormatEnableDisableEnumRuleCall_5_0()); }
		ruleDRunFormatEnableDisable
		{ after(grammarAccess.getDRunAccess().getItalicDRunFormatEnableDisableEnumRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__UnderscoreAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getUnderscoreDRunFormatEnableDisableEnumRuleCall_7_0()); }
		ruleDRunFormatEnableDisable
		{ after(grammarAccess.getDRunAccess().getUnderscoreDRunFormatEnableDisableEnumRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRun__TextAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_9_0()); }
		ruleDText
		{ after(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__ReferenceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectCrossReference_3_0()); }
		(
			{ before(grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectEStringParserRuleCall_3_0_1()); }
			ruleEString
			{ after(grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectEStringParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DHyperlink__RunAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_5_0()); }
		ruleDRun
		{ after(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DText__ContentAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDTextAccess().getContentEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getDTextAccess().getContentEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__TitleAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getTitleEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getDApplicableDocumentAccess().getTitleEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__IssueAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getIssueEStringParserRuleCall_5_0()); }
		ruleEString
		{ after(grammarAccess.getDApplicableDocumentAccess().getIssueEStringParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__RevisionAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionEStringParserRuleCall_7_0()); }
		ruleEString
		{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionEStringParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__TitleAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getTitleEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getDReferenceDocumentAccess().getTitleEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__IssueAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getIssueEStringParserRuleCall_5_0()); }
		ruleEString
		{ after(grammarAccess.getDReferenceDocumentAccess().getIssueEStringParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__RevisionAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionEStringParserRuleCall_7_0()); }
		ruleEString
		{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionEStringParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__ParagraphAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_4_0()); }
		ruleDParagraph
		{ after(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__ParagraphAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_5_1_0()); }
		ruleDParagraph
		{ after(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DListItem__SublistAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_7_1_0()); }
		ruleDListContent
		{ after(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSTerm__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSTermAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getVSSSTermAccess().getNameEStringParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getVSSSTermAccess().getDescriptionDParagraphCrossReference_4_0()); }
		(
			{ before(grammarAccess.getVSSSTermAccess().getDescriptionDParagraphEStringParserRuleCall_4_0_1()); }
			ruleEString
			{ after(grammarAccess.getVSSSTermAccess().getDescriptionDParagraphEStringParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getVSSSTermAccess().getDescriptionDParagraphCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDefinition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDefinitionAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getVSSSDefinitionAccess().getNameEStringParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getVSSSDefinitionAccess().getDescriptionDParagraphCrossReference_4_0()); }
		(
			{ before(grammarAccess.getVSSSDefinitionAccess().getDescriptionDParagraphEStringParserRuleCall_4_0_1()); }
			ruleEString
			{ after(grammarAccess.getVSSSDefinitionAccess().getDescriptionDParagraphEStringParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getVSSSDefinitionAccess().getDescriptionDParagraphCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAbbreviation__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSAbbreviationAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getVSSSAbbreviationAccess().getNameEStringParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getVSSSAbbreviationAccess().getDescriptionDParagraphCrossReference_4_0()); }
		(
			{ before(grammarAccess.getVSSSAbbreviationAccess().getDescriptionDParagraphEStringParserRuleCall_4_0_1()); }
			ruleEString
			{ after(grammarAccess.getVSSSAbbreviationAccess().getDescriptionDParagraphEStringParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getVSSSAbbreviationAccess().getDescriptionDParagraphCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralDescriptionSubsection__BodyAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyDBodyCrossReference_3_0()); }
		(
			{ before(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyDBodyEStringParserRuleCall_3_0_1()); }
			ruleEString
			{ after(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyDBodyEStringParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyDBodyCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__IdAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentItemAccess().getIdEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getVSSSDocumentItemAccess().getIdEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__VerificationMethodAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodVVerificationMethodEnumRuleCall_5_0()); }
		ruleVVerificationMethod
		{ after(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodVVerificationMethodEnumRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__BodyAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentItemAccess().getBodyDBodyCrossReference_7_0()); }
		(
			{ before(grammarAccess.getVSSSDocumentItemAccess().getBodyDBodyEStringParserRuleCall_7_0_1()); }
			ruleEString
			{ after(grammarAccess.getVSSSDocumentItemAccess().getBodyDBodyEStringParserRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getVSSSDocumentItemAccess().getBodyDBodyCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationProcessRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSValidationApproachAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSValidationApproachAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationApproach__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSValidationApproachAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSValidationApproachAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSValidationRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__SssItemsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationRequirement__SssItemsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
