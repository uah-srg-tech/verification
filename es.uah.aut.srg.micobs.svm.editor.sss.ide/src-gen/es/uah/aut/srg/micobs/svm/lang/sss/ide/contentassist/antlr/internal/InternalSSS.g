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

// Entry rule entryRuleDFigure
entryRuleDFigure
:
{ before(grammarAccess.getDFigureRule()); }
	 ruleDFigure
{ after(grammarAccess.getDFigureRule()); } 
	 EOF 
;

// Rule DFigure
ruleDFigure 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDFigureAccess().getGroup()); }
		(rule__DFigure__Group__0)
		{ after(grammarAccess.getDFigureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDPictureAsTable
entryRuleDPictureAsTable
:
{ before(grammarAccess.getDPictureAsTableRule()); }
	 ruleDPictureAsTable
{ after(grammarAccess.getDPictureAsTableRule()); } 
	 EOF 
;

// Rule DPictureAsTable
ruleDPictureAsTable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDPictureAsTableAccess().getGroup()); }
		(rule__DPictureAsTable__Group__0)
		{ after(grammarAccess.getDPictureAsTableAccess().getGroup()); }
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
		{ before(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyAssignment()); }
		(rule__VSSSGeneralDescriptionSubsection__BodyAssignment)
		{ after(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyAssignment()); }
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

// Entry rule entryRuleVSSSReliabiltyAvailabilityRequirements
entryRuleVSSSReliabiltyAvailabilityRequirements
:
{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsRule()); }
	 ruleVSSSReliabiltyAvailabilityRequirements
{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsRule()); } 
	 EOF 
;

// Rule VSSSReliabiltyAvailabilityRequirements
ruleVSSSReliabiltyAvailabilityRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getGroup()); }
		(rule__VSSSReliabiltyAvailabilityRequirements__Group__0)
		{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getGroup()); }
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
		{ before(grammarAccess.getDBodyContentAccess().getDFigureParserRuleCall_3()); }
		ruleDFigure
		{ after(grammarAccess.getDBodyContentAccess().getDFigureParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getDBodyContentAccess().getDPictureAsTableParserRuleCall_4()); }
		ruleDPictureAsTable
		{ after(grammarAccess.getDBodyContentAccess().getDPictureAsTableParserRuleCall_4()); }
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

rule__VVerificationMethod__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getAnalysisEnumLiteralDeclaration_0()); }
		('"Analysis"')
		{ after(grammarAccess.getVVerificationMethodAccess().getAnalysisEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getInspectionEnumLiteralDeclaration_1()); }
		('"Inspection"')
		{ after(grammarAccess.getVVerificationMethodAccess().getInspectionEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getTestingEnumLiteralDeclaration_2()); }
		('"Testing"')
		{ after(grammarAccess.getVVerificationMethodAccess().getTestingEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getReviewEnumLiteralDeclaration_3()); }
		('"Review"')
		{ after(grammarAccess.getVVerificationMethodAccess().getReviewEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getModelSimulationEnumLiteralDeclaration_4()); }
		('"ModelSimulation"')
		{ after(grammarAccess.getVVerificationMethodAccess().getModelSimulationEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getWalkThroughEnumLiteralDeclaration_5()); }
		('"WalkThrough"')
		{ after(grammarAccess.getVVerificationMethodAccess().getWalkThroughEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getCrossReadingEnumLiteralDeclaration_6()); }
		('"CrossReading"')
		{ after(grammarAccess.getVVerificationMethodAccess().getCrossReadingEnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getVVerificationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7()); }
		('"DeskChecking"')
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
	{ before(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionAssignment_12()); }
	(rule__VSSSDocument__IntroductionSectionAssignment_12)
	{ after(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionAssignment_12()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionAssignment_13()); }
	(rule__VSSSDocument__ApplicableDocumentsSectionAssignment_13)
	{ after(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionAssignment_13()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionAssignment_14()); }
	(rule__VSSSDocument__ReferenceDocumentsSectionAssignment_14)
	{ after(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionAssignment_14()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_15()); }
	(rule__VSSSDocument__TermsDefinitionsAbbreviationsSectionAssignment_15)
	{ after(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_15()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionAssignment_16()); }
	(rule__VSSSDocument__GeneralDescriptionSectionAssignment_16)
	{ after(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionAssignment_16()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionAssignment_17()); }
	(rule__VSSSDocument__SpecificRequirementsSectionAssignment_17)
	{ after(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionAssignment_17()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionAssignment_18()); }
	(rule__VSSSDocument__VerificationValidationIntegrationSectionAssignment_18)
	{ after(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionAssignment_18()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionAssignment_19()); }
	(rule__VSSSDocument__SystemModelsSectionAssignment_19)
	{ after(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionAssignment_19()); }
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
	{ before(grammarAccess.getVSSSDocumentAccess().getSSSKeyword_20()); }
	'</SSS>'
	{ after(grammarAccess.getVSSSDocumentAccess().getSSSKeyword_20()); }
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
	{ before(grammarAccess.getDRunAccess().getBoldKeyword_1()); }
	('bold')?
	{ after(grammarAccess.getDRunAccess().getBoldKeyword_1()); }
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
	{ before(grammarAccess.getDRunAccess().getItalicKeyword_2()); }
	('italic')?
	{ after(grammarAccess.getDRunAccess().getItalicKeyword_2()); }
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
	{ before(grammarAccess.getDRunAccess().getUnderscoreKeyword_3()); }
	('underscore')?
	{ after(grammarAccess.getDRunAccess().getUnderscoreKeyword_3()); }
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
	(rule__DHyperlink__RunAssignment_4)
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


rule__DFigure__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigure__Group__0__Impl
	rule__DFigure__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureAccess().getFigureKeyword_0()); }
	'<figure'
	{ after(grammarAccess.getDFigureAccess().getFigureKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigure__Group__1__Impl
	rule__DFigure__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getDFigureAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigure__Group__2__Impl
	rule__DFigure__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureAccess().getNameAssignment_2()); }
	(rule__DFigure__NameAssignment_2)
	{ after(grammarAccess.getDFigureAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigure__Group__3__Impl
	rule__DFigure__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureAccess().getReferenceKeyword_3()); }
	'reference='
	{ after(grammarAccess.getDFigureAccess().getReferenceKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigure__Group__4__Impl
	rule__DFigure__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureAccess().getReferenceAssignment_4()); }
	(rule__DFigure__ReferenceAssignment_4)
	{ after(grammarAccess.getDFigureAccess().getReferenceAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigure__Group__5__Impl
	rule__DFigure__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureAccess().getCaptionKeyword_5()); }
	'caption='
	{ after(grammarAccess.getDFigureAccess().getCaptionKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigure__Group__6__Impl
	rule__DFigure__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureAccess().getCaptionAssignment_6()); }
	(rule__DFigure__CaptionAssignment_6)
	{ after(grammarAccess.getDFigureAccess().getCaptionAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DFigure__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDFigureAccess().getSolidusGreaterThanSignKeyword_7()); }
	'/>'
	{ after(grammarAccess.getDFigureAccess().getSolidusGreaterThanSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DPictureAsTable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DPictureAsTable__Group__0__Impl
	rule__DPictureAsTable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDPictureAsTableAccess().getPictureAsTableKeyword_0()); }
	'<pictureAsTable'
	{ after(grammarAccess.getDPictureAsTableAccess().getPictureAsTableKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DPictureAsTable__Group__1__Impl
	rule__DPictureAsTable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDPictureAsTableAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getDPictureAsTableAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DPictureAsTable__Group__2__Impl
	rule__DPictureAsTable__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDPictureAsTableAccess().getNameAssignment_2()); }
	(rule__DPictureAsTable__NameAssignment_2)
	{ after(grammarAccess.getDPictureAsTableAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DPictureAsTable__Group__3__Impl
	rule__DPictureAsTable__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDPictureAsTableAccess().getReferenceKeyword_3()); }
	'reference='
	{ after(grammarAccess.getDPictureAsTableAccess().getReferenceKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DPictureAsTable__Group__4__Impl
	rule__DPictureAsTable__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDPictureAsTableAccess().getReferenceAssignment_4()); }
	(rule__DPictureAsTable__ReferenceAssignment_4)
	{ after(grammarAccess.getDPictureAsTableAccess().getReferenceAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DPictureAsTable__Group__5__Impl
	rule__DPictureAsTable__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDPictureAsTableAccess().getCaptionKeyword_5()); }
	'caption='
	{ after(grammarAccess.getDPictureAsTableAccess().getCaptionKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DPictureAsTable__Group__6__Impl
	rule__DPictureAsTable__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDPictureAsTableAccess().getCaptionAssignment_6()); }
	(rule__DPictureAsTable__CaptionAssignment_6)
	{ after(grammarAccess.getDPictureAsTableAccess().getCaptionAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DPictureAsTable__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDPictureAsTableAccess().getSolidusGreaterThanSignKeyword_7()); }
	'/>'
	{ after(grammarAccess.getDPictureAsTableAccess().getSolidusGreaterThanSignKeyword_7()); }
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
	{ before(grammarAccess.getDBasicTableAccess().getCaptionKeyword_3()); }
	'caption='
	{ after(grammarAccess.getDBasicTableAccess().getCaptionKeyword_3()); }
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
	{ before(grammarAccess.getDBasicTableAccess().getCaptionAssignment_4()); }
	(rule__DBasicTable__CaptionAssignment_4)
	{ after(grammarAccess.getDBasicTableAccess().getCaptionAssignment_4()); }
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
	{ before(grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_5()); }
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
	(
		{ before(grammarAccess.getDBasicTableAccess().getRowsAssignment_6()); }
		(rule__DBasicTable__RowsAssignment_6)
		{ after(grammarAccess.getDBasicTableAccess().getRowsAssignment_6()); }
	)
	(
		{ before(grammarAccess.getDBasicTableAccess().getRowsAssignment_6()); }
		(rule__DBasicTable__RowsAssignment_6)*
		{ after(grammarAccess.getDBasicTableAccess().getRowsAssignment_6()); }
	)
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
	{ before(grammarAccess.getDBasicTableAccess().getBasicTableKeyword_7()); }
	'</basicTable>'
	{ after(grammarAccess.getDBasicTableAccess().getBasicTableKeyword_7()); }
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
	'<row'
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
	{ before(grammarAccess.getDRowAccess().getSpanKeyword_1()); }
	'span='
	{ after(grammarAccess.getDRowAccess().getSpanKeyword_1()); }
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
	rule__DRow__Group__3
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
	{ before(grammarAccess.getDRowAccess().getSpanAssignment_2()); }
	(rule__DRow__SpanAssignment_2)
	{ after(grammarAccess.getDRowAccess().getSpanAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRow__Group__3__Impl
	rule__DRow__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRowAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getDRowAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRow__Group__4__Impl
	rule__DRow__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDRowAccess().getColumnsAssignment_4()); }
		(rule__DRow__ColumnsAssignment_4)
		{ after(grammarAccess.getDRowAccess().getColumnsAssignment_4()); }
	)
	(
		{ before(grammarAccess.getDRowAccess().getColumnsAssignment_4()); }
		(rule__DRow__ColumnsAssignment_4)*
		{ after(grammarAccess.getDRowAccess().getColumnsAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DRow__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDRowAccess().getRowKeyword_5()); }
	'</row>'
	{ after(grammarAccess.getDRowAccess().getRowKeyword_5()); }
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
	{ before(grammarAccess.getDColumnAccess().getColumnKeyword_0()); }
	'<column'
	{ after(grammarAccess.getDColumnAccess().getColumnKeyword_0()); }
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
	{ before(grammarAccess.getDColumnAccess().getSpanKeyword_1()); }
	'span='
	{ after(grammarAccess.getDColumnAccess().getSpanKeyword_1()); }
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
	{ before(grammarAccess.getDColumnAccess().getSpanAssignment_2()); }
	(rule__DColumn__SpanAssignment_2)
	{ after(grammarAccess.getDColumnAccess().getSpanAssignment_2()); }
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
	{ before(grammarAccess.getDColumnAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getDColumnAccess().getGreaterThanSignKeyword_3()); }
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
	(
		{ before(grammarAccess.getDColumnAccess().getCellsAssignment_4()); }
		(rule__DColumn__CellsAssignment_4)
		{ after(grammarAccess.getDColumnAccess().getCellsAssignment_4()); }
	)
	(
		{ before(grammarAccess.getDColumnAccess().getCellsAssignment_4()); }
		(rule__DColumn__CellsAssignment_4)*
		{ after(grammarAccess.getDColumnAccess().getCellsAssignment_4()); }
	)
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
	{ before(grammarAccess.getDColumnAccess().getColumnKeyword_5()); }
	'</column>'
	{ after(grammarAccess.getDColumnAccess().getColumnKeyword_5()); }
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
	'<cell>'
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
	(
		{ before(grammarAccess.getDCellAccess().getBodyContentAssignment_1()); }
		(rule__DCell__BodyContentAssignment_1)
		{ after(grammarAccess.getDCellAccess().getBodyContentAssignment_1()); }
	)
	(
		{ before(grammarAccess.getDCellAccess().getBodyContentAssignment_1()); }
		(rule__DCell__BodyContentAssignment_1)*
		{ after(grammarAccess.getDCellAccess().getBodyContentAssignment_1()); }
	)
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
	{ before(grammarAccess.getDCellAccess().getCellKeyword_2()); }
	'</cell>'
	{ after(grammarAccess.getDCellAccess().getCellKeyword_2()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getIssueKeyword_5()); }
	'issue='
	{ after(grammarAccess.getDApplicableDocumentAccess().getIssueKeyword_5()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getIssueAssignment_6()); }
	(rule__DApplicableDocument__IssueAssignment_6)
	{ after(grammarAccess.getDApplicableDocumentAccess().getIssueAssignment_6()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_7()); }
	'revision='
	{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_7()); }
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_8()); }
	(rule__DApplicableDocument__RevisionAssignment_8)
	{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_8()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getIssueKeyword_5()); }
	'issue='
	{ after(grammarAccess.getDReferenceDocumentAccess().getIssueKeyword_5()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getIssueAssignment_6()); }
	(rule__DReferenceDocument__IssueAssignment_6)
	{ after(grammarAccess.getDReferenceDocumentAccess().getIssueAssignment_6()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_7()); }
	'revision='
	{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_7()); }
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_8()); }
	(rule__DReferenceDocument__RevisionAssignment_8)
	{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_8()); }
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getPurposeKeyword_1()); }
	'<purpose>'
	{ after(grammarAccess.getVSSSIntroductionAccess().getPurposeKeyword_1()); }
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getPurposeAssignment_2()); }
	(rule__VSSSIntroduction__PurposeAssignment_2)
	{ after(grammarAccess.getVSSSIntroductionAccess().getPurposeAssignment_2()); }
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getPurposeKeyword_3()); }
	'</purpose>'
	{ after(grammarAccess.getVSSSIntroductionAccess().getPurposeKeyword_3()); }
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getObjectiveKeyword_4()); }
	'<objective>'
	{ after(grammarAccess.getVSSSIntroductionAccess().getObjectiveKeyword_4()); }
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getObjectiveAssignment_5()); }
	(rule__VSSSIntroduction__ObjectiveAssignment_5)
	{ after(grammarAccess.getVSSSIntroductionAccess().getObjectiveAssignment_5()); }
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getObjectiveKeyword_6()); }
	'</objective>'
	{ after(grammarAccess.getVSSSIntroductionAccess().getObjectiveKeyword_6()); }
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getContentKeyword_7()); }
	'<content>'
	{ after(grammarAccess.getVSSSIntroductionAccess().getContentKeyword_7()); }
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getContentAssignment_8()); }
	(rule__VSSSIntroduction__ContentAssignment_8)
	{ after(grammarAccess.getVSSSIntroductionAccess().getContentAssignment_8()); }
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getContentKeyword_9()); }
	'</content>'
	{ after(grammarAccess.getVSSSIntroductionAccess().getContentKeyword_9()); }
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
	rule__VSSSIntroduction__Group__11
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
	{ before(grammarAccess.getVSSSIntroductionAccess().getReasonKeyword_10()); }
	'<reason>'
	{ after(grammarAccess.getVSSSIntroductionAccess().getReasonKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__11__Impl
	rule__VSSSIntroduction__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getReasonAssignment_11()); }
	(rule__VSSSIntroduction__ReasonAssignment_11)
	{ after(grammarAccess.getVSSSIntroductionAccess().getReasonAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__12__Impl
	rule__VSSSIntroduction__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getReasonKeyword_12()); }
	'</reason>'
	{ after(grammarAccess.getVSSSIntroductionAccess().getReasonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSIntroduction__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSIntroductionAccess().getIntroductionKeyword_13()); }
	'</Introduction>'
	{ after(grammarAccess.getVSSSIntroductionAccess().getIntroductionKeyword_13()); }
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
	'<productPerspective>'
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
	'</productPerspective>'
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
	'<generalCapabilities>'
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
	'</generalCapabilities>'
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
	'<generalConstraints>'
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
	'</generalConstraints>'
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
	'<operationalEnvironment>'
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
	'</operationalEnvironment>'
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
	'<assumptionsDependencies>'
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
	'</assumptionsDependencies>'
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_1()); }
	(rule__VSSSSpecificRequirements__GeneralAssignment_1)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_1()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_2()); }
	(rule__VSSSSpecificRequirements__CapabilitiesAssignment_2)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_2()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_3()); }
	(rule__VSSSSpecificRequirements__SystemInterfaceAssignment_3)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_3()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_4()); }
	(rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_4)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_4()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_5()); }
	(rule__VSSSSpecificRequirements__ComputerResourceAssignment_5)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_5()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_6()); }
	(rule__VSSSSpecificRequirements__SecurityAssignment_6)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_6()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_7()); }
	(rule__VSSSSpecificRequirements__SafetyAssignment_7)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_7()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityAssignment_8()); }
	(rule__VSSSSpecificRequirements__ReliabiltyAvailabilityAssignment_8)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityAssignment_8()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_9()); }
	(rule__VSSSSpecificRequirements__QualityAssignment_9)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_9()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_10()); }
	(rule__VSSSSpecificRequirements__DesignAssignment_10)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_10()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_11()); }
	(rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_11)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_11()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_12()); }
	(rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_12)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_12()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_13()); }
	(rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_13)
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_13()); }
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
	{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSpecificRequirementsKeyword_14()); }
	'</SpecificRequirements>'
	{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSpecificRequirementsKeyword_14()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_1()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_1)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_1()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_2()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_2)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_2()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_3()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_3)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_3()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_4()); }
	(rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_4)
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_4()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationIntegrationRequirementsKeyword_5()); }
	'</VerificationValidationIntegrationRequirements>'
	{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationIntegrationRequirementsKeyword_5()); }
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
	{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSGeneralRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getGeneralRequirementsKeyword_3()); }
	'</GeneralRequirements>'
	{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getGeneralRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSCapabilitiesRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getCapabilitiesRequirementsKeyword_3()); }
	'</CapabilitiesRequirements>'
	{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getCapabilitiesRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSSystemInterfaceRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSystemInterfaceRequirementsKeyword_3()); }
	'</SystemInterfaceRequirements>'
	{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSystemInterfaceRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getVSSSAdaptationMissionizationRequirementsKeyword_1()); }
	'<VSSSAdaptationMissionizationRequirements>'
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getVSSSAdaptationMissionizationRequirementsKeyword_1()); }
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
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSAdaptationMissionizationRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getVSSSAdaptationMissionizationRequirementsKeyword_3()); }
	'</VSSSAdaptationMissionizationRequirements>'
	{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getVSSSAdaptationMissionizationRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSComputerResourceRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getComputerResourceRequirementsKeyword_3()); }
	'</ComputerResourceRequirements>'
	{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getComputerResourceRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSSecurityRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getSecurityRequirementsKeyword_3()); }
	'</SecurityRequirements>'
	{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getSecurityRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSSafetyRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getSafetyRequirementsKeyword_3()); }
	'</SafetyRequirements>'
	{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getSafetyRequirementsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSSSReliabiltyAvailabilityRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirements__Group__0__Impl
	rule__VSSSReliabiltyAvailabilityRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getVSSSReliabiltyAvailabilityRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getVSSSReliabiltyAvailabilityRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirements__Group__1__Impl
	rule__VSSSReliabiltyAvailabilityRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getReliabiltyAvailabilityRequirementsKeyword_1()); }
	'<ReliabiltyAvailabilityRequirements>'
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getReliabiltyAvailabilityRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirements__Group__2__Impl
	rule__VSSSReliabiltyAvailabilityRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSReliabiltyAvailabilityRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getSssItemsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSSSReliabiltyAvailabilityRequirements__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getReliabiltyAvailabilityRequirementsKeyword_3()); }
	'</ReliabiltyAvailabilityRequirements>'
	{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getReliabiltyAvailabilityRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSQualityRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSQualityRequirementsAccess().getQualityRequirementsKeyword_3()); }
	'</QualityRequirements>'
	{ after(grammarAccess.getVSSSQualityRequirementsAccess().getQualityRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSDesignRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSDesignRequirementsAccess().getDesignRequirementsKeyword_3()); }
	'</DesignRequirements>'
	{ after(grammarAccess.getVSSSDesignRequirementsAccess().getDesignRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSSoftwareOperationsRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSoftwareOperationsRequirementsKeyword_3()); }
	'</SoftwareOperationsRequirements>'
	{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSoftwareOperationsRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSSoftwareMaintenanceRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSoftwareMaintenanceRequirementsKeyword_3()); }
	'</SoftwareMaintenanceRequirements>'
	{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSoftwareMaintenanceRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsAssignment_2()); }
	(rule__VSSSSystemSoftwareObservabilityRequirements__SssItemsAssignment_2)*
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsAssignment_2()); }
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
	{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSystemSoftwareObservabilityRequirementsKeyword_3()); }
	'</SystemSoftwareObservabilityRequirements>'
	{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSystemSoftwareObservabilityRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getIdKeyword_1()); }
	'id='
	{ after(grammarAccess.getVSSSDocumentItemAccess().getIdKeyword_1()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getIdAssignment_2()); }
	(rule__VSSSDocumentItem__IdAssignment_2)
	{ after(grammarAccess.getVSSSDocumentItemAccess().getIdAssignment_2()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodKeyword_3()); }
	'verificationMethod='
	{ after(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodKeyword_3()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodAssignment_4()); }
	(rule__VSSSDocumentItem__VerificationMethodAssignment_4)
	{ after(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodAssignment_4()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getBodyAssignment_6()); }
	(rule__VSSSDocumentItem__BodyAssignment_6)
	{ after(grammarAccess.getVSSSDocumentItemAccess().getBodyAssignment_6()); }
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
	{ before(grammarAccess.getVSSSDocumentItemAccess().getItemKeyword_7()); }
	'</Item>'
	{ after(grammarAccess.getVSSSDocumentItemAccess().getItemKeyword_7()); }
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
	{ before(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVerificationValidationProcessRequirementsKeyword_3()); }
	'</VerificationValidationProcessRequirements>'
	{ after(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVerificationValidationProcessRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSValidationApproachAccess().getValidationApproachKeyword_3()); }
	'</ValidationApproach>'
	{ after(grammarAccess.getVSSSValidationApproachAccess().getValidationApproachKeyword_3()); }
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
	{ before(grammarAccess.getVSSSValidationRequirementsAccess().getValidationRequirementsKeyword_3()); }
	'</ValidationRequirements>'
	{ after(grammarAccess.getVSSSValidationRequirementsAccess().getValidationRequirementsKeyword_3()); }
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
	{ before(grammarAccess.getVSSSVerificationRequirementsAccess().getVerificationRequirementsKeyword_3()); }
	'</VerificationRequirements>'
	{ after(grammarAccess.getVSSSVerificationRequirementsAccess().getVerificationRequirementsKeyword_3()); }
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
		{ before(grammarAccess.getVSSSDocumentAccess().getIssueSTRINGTerminalRuleCall_6_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSDocumentAccess().getIssueSTRINGTerminalRuleCall_6_0()); }
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
		{ before(grammarAccess.getVSSSDocumentAccess().getRevisionSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSDocumentAccess().getRevisionSTRINGTerminalRuleCall_8_0()); }
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

rule__VSSSDocument__IntroductionSectionAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionVSSSIntroductionParserRuleCall_12_0()); }
		ruleVSSSIntroduction
		{ after(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionVSSSIntroductionParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__ApplicableDocumentsSectionAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_13_0()); }
		ruleVSSSApplicableDocuments
		{ after(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__ReferenceDocumentsSectionAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_14_0()); }
		ruleVSSSReferenceDocuments
		{ after(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__TermsDefinitionsAbbreviationsSectionAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_15_0()); }
		ruleVSSSTermsDefinitionsAbbreviations
		{ after(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__GeneralDescriptionSectionAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_16_0()); }
		ruleVSSSGeneralDescription
		{ after(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__SpecificRequirementsSectionAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_17_0()); }
		ruleVSSSSpecificRequirements
		{ after(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__VerificationValidationIntegrationSectionAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_18_0()); }
		ruleVSSSVerificationValidationIntegrationRequirements
		{ after(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocument__SystemModelsSectionAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionVSSSSystemModelsParserRuleCall_19_0()); }
		ruleVSSSSystemModels
		{ after(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionVSSSSystemModelsParserRuleCall_19_0()); }
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

rule__DFigure__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getDFigureAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__ReferenceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureAccess().getReferenceSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getDFigureAccess().getReferenceSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DFigure__CaptionAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDFigureAccess().getCaptionSTRINGTerminalRuleCall_6_0()); }
		RULE_STRING
		{ after(grammarAccess.getDFigureAccess().getCaptionSTRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDPictureAsTableAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getDPictureAsTableAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__ReferenceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDPictureAsTableAccess().getReferenceSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getDPictureAsTableAccess().getReferenceSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DPictureAsTable__CaptionAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDPictureAsTableAccess().getCaptionSTRINGTerminalRuleCall_6_0()); }
		RULE_STRING
		{ after(grammarAccess.getDPictureAsTableAccess().getCaptionSTRINGTerminalRuleCall_6_0()); }
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

rule__DBasicTable__CaptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBasicTableAccess().getCaptionSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getDBasicTableAccess().getCaptionSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DBasicTable__RowsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_6_0()); }
		ruleDRow
		{ after(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__SpanAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRowAccess().getSpanSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getDRowAccess().getSpanSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DRow__ColumnsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDRowAccess().getColumnsDColumnParserRuleCall_4_0()); }
		ruleDColumn
		{ after(grammarAccess.getDRowAccess().getColumnsDColumnParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__SpanAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDColumnAccess().getSpanSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getDColumnAccess().getSpanSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DColumn__CellsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDColumnAccess().getCellsDCellParserRuleCall_4_0()); }
		ruleDCell
		{ after(grammarAccess.getDColumnAccess().getCellsDCellParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DCell__BodyContentAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_1_0()); }
		ruleDBodyContent
		{ after(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_1_0()); }
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

rule__DApplicableDocument__IssueAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getIssueSTRINGTerminalRuleCall_6_0()); }
		RULE_STRING
		{ after(grammarAccess.getDApplicableDocumentAccess().getIssueSTRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__RevisionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionSTRINGTerminalRuleCall_8_0()); }
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

rule__DReferenceDocument__IssueAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getIssueSTRINGTerminalRuleCall_6_0()); }
		RULE_STRING
		{ after(grammarAccess.getDReferenceDocumentAccess().getIssueSTRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__RevisionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__PurposeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getPurposeDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSIntroductionAccess().getPurposeDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__ObjectiveAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getObjectiveDBodyParserRuleCall_5_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSIntroductionAccess().getObjectiveDBodyParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__ContentAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getContentDBodyParserRuleCall_8_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSIntroductionAccess().getContentDBodyParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSIntroduction__ReasonAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSIntroductionAccess().getReasonDBodyParserRuleCall_11_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSIntroductionAccess().getReasonDBodyParserRuleCall_11_0()); }
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
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_2_0()); }
		ruleVSSSGeneralDescriptionSubsection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_2_0()); }
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
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0()); }
		ruleVSSSGeneralDescriptionSubsection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0()); }
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
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_8_0()); }
		ruleVSSSGeneralDescriptionSubsection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_8_0()); }
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
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_11_0()); }
		ruleVSSSGeneralDescriptionSubsection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_11_0()); }
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
		{ before(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_14_0()); }
		ruleVSSSGeneralDescriptionSubsection
		{ after(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__GeneralAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementsParserRuleCall_1_0()); }
		ruleVSSSGeneralRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementsParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__CapabilitiesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_2_0()); }
		ruleVSSSCapabilitiesRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SystemInterfaceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_3_0()); }
		ruleVSSSSystemInterfaceRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_4_0()); }
		ruleVSSSAdaptationMissionizationRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__ComputerResourceAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementsParserRuleCall_5_0()); }
		ruleVSSSComputerResourceRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementsParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SecurityAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementsParserRuleCall_6_0()); }
		ruleVSSSSecurityRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementsParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SafetyAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementsParserRuleCall_7_0()); }
		ruleVSSSSafetyRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementsParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__ReliabiltyAvailabilityAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementsParserRuleCall_8_0()); }
		ruleVSSSReliabiltyAvailabilityRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementsParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__QualityAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementsParserRuleCall_9_0()); }
		ruleVSSSQualityRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementsParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__DesignAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementsParserRuleCall_10_0()); }
		ruleVSSSDesignRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementsParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_11_0()); }
		ruleVSSSSoftwareOperationsRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_12_0()); }
		ruleVSSSSoftwareMaintenanceRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_13_0()); }
		ruleVSSSSystemSoftwareObservabilityRequirements
		{ after(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_1_0()); }
		ruleVSSSVerificationValidationProcessRequirements
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_2_0()); }
		ruleVSSSValidationApproach
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementsParserRuleCall_3_0()); }
		ruleVSSSValidationRequirements
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementsParserRuleCall_4_0()); }
		ruleVSSSVerificationRequirements
		{ after(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementsParserRuleCall_4_0()); }
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

rule__VSSSGeneralDescriptionSubsection__BodyAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyDBodyParserRuleCall_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyDBodyParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSGeneralRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSCapabilitiesRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemInterfaceRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSAdaptationMissionizationRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSComputerResourceRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSecurityRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSafetyRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSReliabiltyAvailabilityRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSQualityRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDesignRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareOperationsRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSoftwareMaintenanceRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSSystemSoftwareObservabilityRequirements__SssItemsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
		ruleVSSSDocumentItem
		{ after(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__IdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentItemAccess().getIdSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSSSDocumentItemAccess().getIdSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__VerificationMethodAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodVVerificationMethodEnumRuleCall_4_0()); }
		ruleVVerificationMethod
		{ after(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodVVerificationMethodEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSSSDocumentItem__BodyAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSSSDocumentItemAccess().getBodyDBodyParserRuleCall_6_0()); }
		ruleDBody
		{ after(grammarAccess.getVSSSDocumentItemAccess().getBodyDBodyParserRuleCall_6_0()); }
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

RULE_RUNTEXT : '<text>' ( options {greedy=false;} : . )*'</text>';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
