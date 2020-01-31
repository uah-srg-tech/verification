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
grammar InternalTESTSETUP;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.testsetup.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.testsetup.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.micobs.svm.lang.testsetup.services.TESTSETUPGrammarAccess;

}
@parser::members {
	private TESTSETUPGrammarAccess grammarAccess;

	public void setGrammarAccess(TESTSETUPGrammarAccess grammarAccess) {
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

// Entry rule entryRuleVTestSetupDocument
entryRuleVTestSetupDocument
:
{ before(grammarAccess.getVTestSetupDocumentRule()); }
	 ruleVTestSetupDocument
{ after(grammarAccess.getVTestSetupDocumentRule()); } 
	 EOF 
;

// Rule VTestSetupDocument
ruleVTestSetupDocument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getGroup()); }
		(rule__VTestSetupDocument__Group__0)
		{ after(grammarAccess.getVTestSetupDocumentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTestSetupApplicableDocuments
entryRuleVTestSetupApplicableDocuments
:
{ before(grammarAccess.getVTestSetupApplicableDocumentsRule()); }
	 ruleVTestSetupApplicableDocuments
{ after(grammarAccess.getVTestSetupApplicableDocumentsRule()); } 
	 EOF 
;

// Rule VTestSetupApplicableDocuments
ruleVTestSetupApplicableDocuments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupApplicableDocumentsAccess().getGroup()); }
		(rule__VTestSetupApplicableDocuments__Group__0)
		{ after(grammarAccess.getVTestSetupApplicableDocumentsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTestSetupReferenceDocuments
entryRuleVTestSetupReferenceDocuments
:
{ before(grammarAccess.getVTestSetupReferenceDocumentsRule()); }
	 ruleVTestSetupReferenceDocuments
{ after(grammarAccess.getVTestSetupReferenceDocumentsRule()); } 
	 EOF 
;

// Rule VTestSetupReferenceDocuments
ruleVTestSetupReferenceDocuments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupReferenceDocumentsAccess().getGroup()); }
		(rule__VTestSetupReferenceDocuments__Group__0)
		{ after(grammarAccess.getVTestSetupReferenceDocumentsAccess().getGroup()); }
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

// Entry rule entryRuleVTestSetupInterfacesSection
entryRuleVTestSetupInterfacesSection
:
{ before(grammarAccess.getVTestSetupInterfacesSectionRule()); }
	 ruleVTestSetupInterfacesSection
{ after(grammarAccess.getVTestSetupInterfacesSectionRule()); } 
	 EOF 
;

// Rule VTestSetupInterfacesSection
ruleVTestSetupInterfacesSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupInterfacesSectionAccess().getGroup()); }
		(rule__VTestSetupInterfacesSection__Group__0)
		{ after(grammarAccess.getVTestSetupInterfacesSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTestSetupInterface
entryRuleVTestSetupInterface
:
{ before(grammarAccess.getVTestSetupInterfaceRule()); }
	 ruleVTestSetupInterface
{ after(grammarAccess.getVTestSetupInterfaceRule()); } 
	 EOF 
;

// Rule VTestSetupInterface
ruleVTestSetupInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupInterfaceAccess().getGroup()); }
		(rule__VTestSetupInterface__Group__0)
		{ after(grammarAccess.getVTestSetupInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTestSetupPacketConfigurationsSection
entryRuleVTestSetupPacketConfigurationsSection
:
{ before(grammarAccess.getVTestSetupPacketConfigurationsSectionRule()); }
	 ruleVTestSetupPacketConfigurationsSection
{ after(grammarAccess.getVTestSetupPacketConfigurationsSectionRule()); } 
	 EOF 
;

// Rule VTestSetupPacketConfigurationsSection
ruleVTestSetupPacketConfigurationsSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getGroup()); }
		(rule__VTestSetupPacketConfigurationsSection__Group__0)
		{ after(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTestSetupPacketConfiguration
entryRuleVTestSetupPacketConfiguration
:
{ before(grammarAccess.getVTestSetupPacketConfigurationRule()); }
	 ruleVTestSetupPacketConfiguration
{ after(grammarAccess.getVTestSetupPacketConfigurationRule()); } 
	 EOF 
;

// Rule VTestSetupPacketConfiguration
ruleVTestSetupPacketConfiguration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getGroup()); }
		(rule__VTestSetupPacketConfiguration__Group__0)
		{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTestSetupActionsSection
entryRuleVTestSetupActionsSection
:
{ before(grammarAccess.getVTestSetupActionsSectionRule()); }
	 ruleVTestSetupActionsSection
{ after(grammarAccess.getVTestSetupActionsSectionRule()); } 
	 EOF 
;

// Rule VTestSetupActionsSection
ruleVTestSetupActionsSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupActionsSectionAccess().getGroup()); }
		(rule__VTestSetupActionsSection__Group__0)
		{ after(grammarAccess.getVTestSetupActionsSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTestSetupAction
entryRuleVTestSetupAction
:
{ before(grammarAccess.getVTestSetupActionRule()); }
	 ruleVTestSetupAction
{ after(grammarAccess.getVTestSetupActionRule()); } 
	 EOF 
;

// Rule VTestSetupAction
ruleVTestSetupAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupActionAccess().getGroup()); }
		(rule__VTestSetupAction__Group__0)
		{ after(grammarAccess.getVTestSetupActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTestSetupScenariosSection
entryRuleVTestSetupScenariosSection
:
{ before(grammarAccess.getVTestSetupScenariosSectionRule()); }
	 ruleVTestSetupScenariosSection
{ after(grammarAccess.getVTestSetupScenariosSectionRule()); } 
	 EOF 
;

// Rule VTestSetupScenariosSection
ruleVTestSetupScenariosSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupScenariosSectionAccess().getGroup()); }
		(rule__VTestSetupScenariosSection__Group__0)
		{ after(grammarAccess.getVTestSetupScenariosSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTestSetupScenarioSection
entryRuleVTestSetupScenarioSection
:
{ before(grammarAccess.getVTestSetupScenarioSectionRule()); }
	 ruleVTestSetupScenarioSection
{ after(grammarAccess.getVTestSetupScenarioSectionRule()); } 
	 EOF 
;

// Rule VTestSetupScenarioSection
ruleVTestSetupScenarioSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getGroup()); }
		(rule__VTestSetupScenarioSection__Group__0)
		{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTestSetupSupportedInterface
entryRuleVTestSetupSupportedInterface
:
{ before(grammarAccess.getVTestSetupSupportedInterfaceRule()); }
	 ruleVTestSetupSupportedInterface
{ after(grammarAccess.getVTestSetupSupportedInterfaceRule()); } 
	 EOF 
;

// Rule VTestSetupSupportedInterface
ruleVTestSetupSupportedInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getGroup()); }
		(rule__VTestSetupSupportedInterface__Group__0)
		{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTestSetupSelectedConfiguration
entryRuleVTestSetupSelectedConfiguration
:
{ before(grammarAccess.getVTestSetupSelectedConfigurationRule()); }
	 ruleVTestSetupSelectedConfiguration
{ after(grammarAccess.getVTestSetupSelectedConfigurationRule()); } 
	 EOF 
;

// Rule VTestSetupSelectedConfiguration
ruleVTestSetupSelectedConfiguration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getGroup()); }
		(rule__VTestSetupSelectedConfiguration__Group__0)
		{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getGroup()); }
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

// Rule VTestSetupActionType
ruleVTestSetupActionType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupActionTypeAccess().getAlternatives()); }
		(rule__VTestSetupActionType__Alternatives)
		{ after(grammarAccess.getVTestSetupActionTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule VTestSetupConfigurationStatus
ruleVTestSetupConfigurationStatus
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupConfigurationStatusAccess().getAlternatives()); }
		(rule__VTestSetupConfigurationStatus__Alternatives)
		{ after(grammarAccess.getVTestSetupConfigurationStatusAccess().getAlternatives()); }
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

rule__VTestSetupActionType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupActionTypeAccess().getCheckingEnumLiteralDeclaration_0()); }
		('"checking"')
		{ after(grammarAccess.getVTestSetupActionTypeAccess().getCheckingEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVTestSetupActionTypeAccess().getInstructionEnumLiteralDeclaration_1()); }
		('"instruction"')
		{ after(grammarAccess.getVTestSetupActionTypeAccess().getInstructionEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupConfigurationStatus__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupConfigurationStatusAccess().getOffEnumLiteralDeclaration_0()); }
		('"off"')
		{ after(grammarAccess.getVTestSetupConfigurationStatusAccess().getOffEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVTestSetupConfigurationStatusAccess().getOnEnumLiteralDeclaration_1()); }
		('"on"')
		{ after(grammarAccess.getVTestSetupConfigurationStatusAccess().getOnEnumLiteralDeclaration_1()); }
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

rule__VTestSetupDocument__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__0__Impl
	rule__VTestSetupDocument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getTestSetupKeyword_0()); }
	'<TestSetup'
	{ after(grammarAccess.getVTestSetupDocumentAccess().getTestSetupKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__1__Impl
	rule__VTestSetupDocument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVTestSetupDocumentAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__2__Impl
	rule__VTestSetupDocument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getNameAssignment_2()); }
	(rule__VTestSetupDocument__NameAssignment_2)
	{ after(grammarAccess.getVTestSetupDocumentAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__3__Impl
	rule__VTestSetupDocument__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getIdKeyword_3()); }
	'id='
	{ after(grammarAccess.getVTestSetupDocumentAccess().getIdKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__4__Impl
	rule__VTestSetupDocument__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getIdAssignment_4()); }
	(rule__VTestSetupDocument__IdAssignment_4)
	{ after(grammarAccess.getVTestSetupDocumentAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__5__Impl
	rule__VTestSetupDocument__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getIssueKeyword_5()); }
	'issue='
	{ after(grammarAccess.getVTestSetupDocumentAccess().getIssueKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__6__Impl
	rule__VTestSetupDocument__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getIssueAssignment_6()); }
	(rule__VTestSetupDocument__IssueAssignment_6)
	{ after(grammarAccess.getVTestSetupDocumentAccess().getIssueAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__7__Impl
	rule__VTestSetupDocument__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getRevisionKeyword_7()); }
	'revision='
	{ after(grammarAccess.getVTestSetupDocumentAccess().getRevisionKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__8__Impl
	rule__VTestSetupDocument__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getRevisionAssignment_8()); }
	(rule__VTestSetupDocument__RevisionAssignment_8)
	{ after(grammarAccess.getVTestSetupDocumentAccess().getRevisionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__9__Impl
	rule__VTestSetupDocument__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getDateKeyword_9()); }
	'date='
	{ after(grammarAccess.getVTestSetupDocumentAccess().getDateKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__10__Impl
	rule__VTestSetupDocument__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getDateAssignment_10()); }
	(rule__VTestSetupDocument__DateAssignment_10)
	{ after(grammarAccess.getVTestSetupDocumentAccess().getDateAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__11__Impl
	rule__VTestSetupDocument__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getGreaterThanSignKeyword_11()); }
	'>'
	{ after(grammarAccess.getVTestSetupDocumentAccess().getGreaterThanSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__12__Impl
	rule__VTestSetupDocument__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getApplicableDocumentsSectionAssignment_12()); }
	(rule__VTestSetupDocument__ApplicableDocumentsSectionAssignment_12)
	{ after(grammarAccess.getVTestSetupDocumentAccess().getApplicableDocumentsSectionAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__13__Impl
	rule__VTestSetupDocument__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getReferenceDocumentsSectionAssignment_13()); }
	(rule__VTestSetupDocument__ReferenceDocumentsSectionAssignment_13)
	{ after(grammarAccess.getVTestSetupDocumentAccess().getReferenceDocumentsSectionAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__14__Impl
	rule__VTestSetupDocument__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getInterfacesKeyword_14()); }
	'<Interfaces>'
	{ after(grammarAccess.getVTestSetupDocumentAccess().getInterfacesKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__15__Impl
	rule__VTestSetupDocument__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getInterfacesAssignment_15()); }
	(rule__VTestSetupDocument__InterfacesAssignment_15)
	{ after(grammarAccess.getVTestSetupDocumentAccess().getInterfacesAssignment_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__16__Impl
	rule__VTestSetupDocument__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getInterfacesKeyword_16()); }
	'</Interfaces>'
	{ after(grammarAccess.getVTestSetupDocumentAccess().getInterfacesKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__17__Impl
	rule__VTestSetupDocument__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getGroup_17()); }
	(rule__VTestSetupDocument__Group_17__0)?
	{ after(grammarAccess.getVTestSetupDocumentAccess().getGroup_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__18__Impl
	rule__VTestSetupDocument__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getGroup_18()); }
	(rule__VTestSetupDocument__Group_18__0)?
	{ after(grammarAccess.getVTestSetupDocumentAccess().getGroup_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__19__Impl
	rule__VTestSetupDocument__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getScenariosKeyword_19()); }
	'<Scenarios>'
	{ after(grammarAccess.getVTestSetupDocumentAccess().getScenariosKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__20__Impl
	rule__VTestSetupDocument__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getScenariosAssignment_20()); }
	(rule__VTestSetupDocument__ScenariosAssignment_20)
	{ after(grammarAccess.getVTestSetupDocumentAccess().getScenariosAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__21__Impl
	rule__VTestSetupDocument__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getScenariosKeyword_21()); }
	'</Scenarios>'
	{ after(grammarAccess.getVTestSetupDocumentAccess().getScenariosKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group__22__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getTestSetupKeyword_22()); }
	'</TestSetup>'
	{ after(grammarAccess.getVTestSetupDocumentAccess().getTestSetupKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupDocument__Group_17__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group_17__0__Impl
	rule__VTestSetupDocument__Group_17__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group_17__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getPacketConfigurationsKeyword_17_0()); }
	'<PacketConfigurations>'
	{ after(grammarAccess.getVTestSetupDocumentAccess().getPacketConfigurationsKeyword_17_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group_17__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group_17__1__Impl
	rule__VTestSetupDocument__Group_17__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group_17__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getConfigurationsAssignment_17_1()); }
	(rule__VTestSetupDocument__ConfigurationsAssignment_17_1)
	{ after(grammarAccess.getVTestSetupDocumentAccess().getConfigurationsAssignment_17_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group_17__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group_17__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group_17__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getPacketConfigurationsKeyword_17_2()); }
	'</PacketConfigurations>'
	{ after(grammarAccess.getVTestSetupDocumentAccess().getPacketConfigurationsKeyword_17_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupDocument__Group_18__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group_18__0__Impl
	rule__VTestSetupDocument__Group_18__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group_18__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getActionsKeyword_18_0()); }
	'<Actions>'
	{ after(grammarAccess.getVTestSetupDocumentAccess().getActionsKeyword_18_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group_18__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group_18__1__Impl
	rule__VTestSetupDocument__Group_18__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group_18__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getActionsAssignment_18_1()); }
	(rule__VTestSetupDocument__ActionsAssignment_18_1)
	{ after(grammarAccess.getVTestSetupDocumentAccess().getActionsAssignment_18_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group_18__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupDocument__Group_18__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__Group_18__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupDocumentAccess().getActionsKeyword_18_2()); }
	'</Actions>'
	{ after(grammarAccess.getVTestSetupDocumentAccess().getActionsKeyword_18_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupApplicableDocuments__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupApplicableDocuments__Group__0__Impl
	rule__VTestSetupApplicableDocuments__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupApplicableDocuments__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupApplicableDocumentsAccess().getVTestSetupApplicableDocumentsAction_0()); }
	()
	{ after(grammarAccess.getVTestSetupApplicableDocumentsAccess().getVTestSetupApplicableDocumentsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupApplicableDocuments__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupApplicableDocuments__Group__1__Impl
	rule__VTestSetupApplicableDocuments__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupApplicableDocuments__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsKeyword_1()); }
	'<ApplicableDocuments>'
	{ after(grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupApplicableDocuments__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupApplicableDocuments__Group__2__Impl
	rule__VTestSetupApplicableDocuments__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupApplicableDocuments__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsAssignment_2()); }
	(rule__VTestSetupApplicableDocuments__ApplicableDocumentsAssignment_2)*
	{ after(grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupApplicableDocuments__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupApplicableDocuments__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupApplicableDocuments__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsKeyword_3()); }
	'</ApplicableDocuments>'
	{ after(grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupReferenceDocuments__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupReferenceDocuments__Group__0__Impl
	rule__VTestSetupReferenceDocuments__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupReferenceDocuments__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupReferenceDocumentsAccess().getVTestSetupReferenceDocumentsAction_0()); }
	()
	{ after(grammarAccess.getVTestSetupReferenceDocumentsAccess().getVTestSetupReferenceDocumentsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupReferenceDocuments__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupReferenceDocuments__Group__1__Impl
	rule__VTestSetupReferenceDocuments__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupReferenceDocuments__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsKeyword_1()); }
	'<ReferenceDocuments>'
	{ after(grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupReferenceDocuments__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupReferenceDocuments__Group__2__Impl
	rule__VTestSetupReferenceDocuments__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupReferenceDocuments__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsAssignment_2()); }
	(rule__VTestSetupReferenceDocuments__ReferenceDocumentsAssignment_2)*
	{ after(grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupReferenceDocuments__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupReferenceDocuments__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupReferenceDocuments__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsKeyword_3()); }
	'</ReferenceDocuments>'
	{ after(grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsKeyword_3()); }
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


rule__VTestSetupInterfacesSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterfacesSection__Group__0__Impl
	rule__VTestSetupInterfacesSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterfacesSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupInterfacesSectionAccess().getVTestSetupInterfacesSectionAction_0()); }
	()
	{ after(grammarAccess.getVTestSetupInterfacesSectionAccess().getVTestSetupInterfacesSectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterfacesSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterfacesSection__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterfacesSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVTestSetupInterfacesSectionAccess().getInterfacesAssignment_1()); }
		(rule__VTestSetupInterfacesSection__InterfacesAssignment_1)
		{ after(grammarAccess.getVTestSetupInterfacesSectionAccess().getInterfacesAssignment_1()); }
	)
	(
		{ before(grammarAccess.getVTestSetupInterfacesSectionAccess().getInterfacesAssignment_1()); }
		(rule__VTestSetupInterfacesSection__InterfacesAssignment_1)*
		{ after(grammarAccess.getVTestSetupInterfacesSectionAccess().getInterfacesAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterface__Group__0__Impl
	rule__VTestSetupInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupInterfaceAccess().getInterfaceKeyword_0()); }
	'<Interface'
	{ after(grammarAccess.getVTestSetupInterfaceAccess().getInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterface__Group__1__Impl
	rule__VTestSetupInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupInterfaceAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVTestSetupInterfaceAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterface__Group__2__Impl
	rule__VTestSetupInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupInterfaceAccess().getNameAssignment_2()); }
	(rule__VTestSetupInterface__NameAssignment_2)
	{ after(grammarAccess.getVTestSetupInterfaceAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterface__Group__3__Impl
	rule__VTestSetupInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderKeyword_3()); }
	'tcHeader='
	{ after(grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterface__Group__4__Impl
	rule__VTestSetupInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderAssignment_4()); }
	(rule__VTestSetupInterface__TcHeaderAssignment_4)
	{ after(grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterface__Group__5__Impl
	rule__VTestSetupInterface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderKeyword_5()); }
	'tmHeader='
	{ after(grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterface__Group__6__Impl
	rule__VTestSetupInterface__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderAssignment_6()); }
	(rule__VTestSetupInterface__TmHeaderAssignment_6)
	{ after(grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterface__Group__7__Impl
	rule__VTestSetupInterface__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupInterfaceAccess().getGreaterThanSignKeyword_7()); }
	'>'
	{ after(grammarAccess.getVTestSetupInterfaceAccess().getGreaterThanSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterface__Group__8__Impl
	rule__VTestSetupInterface__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupInterfaceAccess().getDescriptionAssignment_8()); }
	(rule__VTestSetupInterface__DescriptionAssignment_8)
	{ after(grammarAccess.getVTestSetupInterfaceAccess().getDescriptionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupInterface__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupInterfaceAccess().getInterfaceKeyword_9()); }
	'</Interface>'
	{ after(grammarAccess.getVTestSetupInterfaceAccess().getInterfaceKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupPacketConfigurationsSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupPacketConfigurationsSection__Group__0__Impl
	rule__VTestSetupPacketConfigurationsSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfigurationsSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getVTestSetupPacketConfigurationsSectionAction_0()); }
	()
	{ after(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getVTestSetupPacketConfigurationsSectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfigurationsSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupPacketConfigurationsSection__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfigurationsSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getPacketConfigurationsAssignment_1()); }
		(rule__VTestSetupPacketConfigurationsSection__PacketConfigurationsAssignment_1)
		{ after(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getPacketConfigurationsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getPacketConfigurationsAssignment_1()); }
		(rule__VTestSetupPacketConfigurationsSection__PacketConfigurationsAssignment_1)*
		{ after(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getPacketConfigurationsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupPacketConfiguration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupPacketConfiguration__Group__0__Impl
	rule__VTestSetupPacketConfiguration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getPacketConfigurationKeyword_0()); }
	'<PacketConfiguration'
	{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getPacketConfigurationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupPacketConfiguration__Group__1__Impl
	rule__VTestSetupPacketConfiguration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupPacketConfiguration__Group__2__Impl
	rule__VTestSetupPacketConfiguration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getNameAssignment_2()); }
	(rule__VTestSetupPacketConfiguration__NameAssignment_2)
	{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupPacketConfiguration__Group__3__Impl
	rule__VTestSetupPacketConfiguration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getIdKeyword_3()); }
	'id='
	{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getIdKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupPacketConfiguration__Group__4__Impl
	rule__VTestSetupPacketConfiguration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getIdAssignment_4()); }
	(rule__VTestSetupPacketConfiguration__IdAssignment_4)
	{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupPacketConfiguration__Group__5__Impl
	rule__VTestSetupPacketConfiguration__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupPacketConfiguration__Group__6__Impl
	rule__VTestSetupPacketConfiguration__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getDescriptionAssignment_6()); }
	(rule__VTestSetupPacketConfiguration__DescriptionAssignment_6)
	{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getDescriptionAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupPacketConfiguration__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getPacketConfigurationKeyword_7()); }
	'</PacketConfiguration>'
	{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getPacketConfigurationKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupActionsSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupActionsSection__Group__0__Impl
	rule__VTestSetupActionsSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupActionsSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupActionsSectionAccess().getVTestSetupActionsSectionAction_0()); }
	()
	{ after(grammarAccess.getVTestSetupActionsSectionAccess().getVTestSetupActionsSectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupActionsSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupActionsSection__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupActionsSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVTestSetupActionsSectionAccess().getActionAssignment_1()); }
		(rule__VTestSetupActionsSection__ActionAssignment_1)
		{ after(grammarAccess.getVTestSetupActionsSectionAccess().getActionAssignment_1()); }
	)
	(
		{ before(grammarAccess.getVTestSetupActionsSectionAccess().getActionAssignment_1()); }
		(rule__VTestSetupActionsSection__ActionAssignment_1)*
		{ after(grammarAccess.getVTestSetupActionsSectionAccess().getActionAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupAction__Group__0__Impl
	rule__VTestSetupAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupActionAccess().getActionKeyword_0()); }
	'<Action'
	{ after(grammarAccess.getVTestSetupActionAccess().getActionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupAction__Group__1__Impl
	rule__VTestSetupAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupActionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVTestSetupActionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupAction__Group__2__Impl
	rule__VTestSetupAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupActionAccess().getNameAssignment_2()); }
	(rule__VTestSetupAction__NameAssignment_2)
	{ after(grammarAccess.getVTestSetupActionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupAction__Group__3__Impl
	rule__VTestSetupAction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupActionAccess().getTypeKeyword_3()); }
	'type='
	{ after(grammarAccess.getVTestSetupActionAccess().getTypeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupAction__Group__4__Impl
	rule__VTestSetupAction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupActionAccess().getTypeAssignment_4()); }
	(rule__VTestSetupAction__TypeAssignment_4)
	{ after(grammarAccess.getVTestSetupActionAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupAction__Group__5__Impl
	rule__VTestSetupAction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupActionAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getVTestSetupActionAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupAction__Group__6__Impl
	rule__VTestSetupAction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupActionAccess().getDescriptionAssignment_6()); }
	(rule__VTestSetupAction__DescriptionAssignment_6)
	{ after(grammarAccess.getVTestSetupActionAccess().getDescriptionAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupAction__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupActionAccess().getActionKeyword_7()); }
	'</Action>'
	{ after(grammarAccess.getVTestSetupActionAccess().getActionKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupScenariosSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenariosSection__Group__0__Impl
	rule__VTestSetupScenariosSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenariosSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenariosSectionAccess().getVTestSetupScenariosSectionAction_0()); }
	()
	{ after(grammarAccess.getVTestSetupScenariosSectionAccess().getVTestSetupScenariosSectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenariosSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenariosSection__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenariosSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVTestSetupScenariosSectionAccess().getScenariosAssignment_1()); }
		(rule__VTestSetupScenariosSection__ScenariosAssignment_1)
		{ after(grammarAccess.getVTestSetupScenariosSectionAccess().getScenariosAssignment_1()); }
	)
	(
		{ before(grammarAccess.getVTestSetupScenariosSectionAccess().getScenariosAssignment_1()); }
		(rule__VTestSetupScenariosSection__ScenariosAssignment_1)*
		{ after(grammarAccess.getVTestSetupScenariosSectionAccess().getScenariosAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupScenarioSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group__0__Impl
	rule__VTestSetupScenarioSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioKeyword_0()); }
	'<Scenario'
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group__1__Impl
	rule__VTestSetupScenarioSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group__2__Impl
	rule__VTestSetupScenarioSection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getNameAssignment_2()); }
	(rule__VTestSetupScenarioSection__NameAssignment_2)
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group__3__Impl
	rule__VTestSetupScenarioSection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioKeyword_3()); }
	'scenario='
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group__4__Impl
	rule__VTestSetupScenarioSection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioAssignment_4()); }
	(rule__VTestSetupScenarioSection__ScenarioAssignment_4)
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group__5__Impl
	rule__VTestSetupScenarioSection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group__6__Impl
	rule__VTestSetupScenarioSection__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedInterfaceAssignment_6()); }
	(rule__VTestSetupScenarioSection__SupportedInterfaceAssignment_6)*
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedInterfaceAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group__7__Impl
	rule__VTestSetupScenarioSection__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getSelectedConfigurationAssignment_7()); }
	(rule__VTestSetupScenarioSection__SelectedConfigurationAssignment_7)*
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getSelectedConfigurationAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group__8__Impl
	rule__VTestSetupScenarioSection__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getGroup_8()); }
	(rule__VTestSetupScenarioSection__Group_8__0)*
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group__9__Impl
	rule__VTestSetupScenarioSection__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getBodyAssignment_9()); }
	(rule__VTestSetupScenarioSection__BodyAssignment_9)
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getBodyAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioKeyword_10()); }
	'</Scenario>'
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupScenarioSection__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group_8__0__Impl
	rule__VTestSetupScenarioSection__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getActionKeyword_8_0()); }
	'<Action'
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getActionKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group_8__1__Impl
	rule__VTestSetupScenarioSection__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getRefKeyword_8_1()); }
	'ref='
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getRefKeyword_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group_8__2__Impl
	rule__VTestSetupScenarioSection__Group_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedActionAssignment_8_2()); }
	(rule__VTestSetupScenarioSection__SupportedActionAssignment_8_2)
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedActionAssignment_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group_8__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupScenarioSection__Group_8__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__Group_8__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getSolidusGreaterThanSignKeyword_8_3()); }
	'/>'
	{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getSolidusGreaterThanSignKeyword_8_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupSupportedInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSupportedInterface__Group__0__Impl
	rule__VTestSetupSupportedInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceKeyword_0()); }
	'<Interface'
	{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSupportedInterface__Group__1__Impl
	rule__VTestSetupSupportedInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSupportedInterface__Group__2__Impl
	rule__VTestSetupSupportedInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getNameAssignment_2()); }
	(rule__VTestSetupSupportedInterface__NameAssignment_2)
	{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSupportedInterface__Group__3__Impl
	rule__VTestSetupSupportedInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getRefKeyword_3()); }
	'ref='
	{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getRefKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSupportedInterface__Group__4__Impl
	rule__VTestSetupSupportedInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceAssignment_4()); }
	(rule__VTestSetupSupportedInterface__InterfaceAssignment_4)
	{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSupportedInterface__Group__5__Impl
	rule__VTestSetupSupportedInterface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceKeyword_5()); }
	'scenarioInterface='
	{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSupportedInterface__Group__6__Impl
	rule__VTestSetupSupportedInterface__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceAssignment_6()); }
	(rule__VTestSetupSupportedInterface__ScenarioInterfaceAssignment_6)
	{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSupportedInterface__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getSolidusGreaterThanSignKeyword_7()); }
	'/>'
	{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getSolidusGreaterThanSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTestSetupSelectedConfiguration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSelectedConfiguration__Group__0__Impl
	rule__VTestSetupSelectedConfiguration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationKeyword_0()); }
	'<Configuration'
	{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSelectedConfiguration__Group__1__Impl
	rule__VTestSetupSelectedConfiguration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getRefKeyword_1()); }
	'ref='
	{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getRefKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSelectedConfiguration__Group__2__Impl
	rule__VTestSetupSelectedConfiguration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationAssignment_2()); }
	(rule__VTestSetupSelectedConfiguration__ConfigurationAssignment_2)
	{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSelectedConfiguration__Group__3__Impl
	rule__VTestSetupSelectedConfiguration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusKeyword_3()); }
	'defaultFilterStatus='
	{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSelectedConfiguration__Group__4__Impl
	rule__VTestSetupSelectedConfiguration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusAssignment_4()); }
	(rule__VTestSetupSelectedConfiguration__DefaultFilterStatusAssignment_4)
	{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSelectedConfiguration__Group__5__Impl
	rule__VTestSetupSelectedConfiguration__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusKeyword_5()); }
	'defaultPrintStatus='
	{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSelectedConfiguration__Group__6__Impl
	rule__VTestSetupSelectedConfiguration__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusAssignment_6()); }
	(rule__VTestSetupSelectedConfiguration__DefaultPrintStatusAssignment_6)
	{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTestSetupSelectedConfiguration__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getSolidusGreaterThanSignKeyword_7()); }
	'/>'
	{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getSolidusGreaterThanSignKeyword_7()); }
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


rule__VTestSetupDocument__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTestSetupDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getIdSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTestSetupDocumentAccess().getIdSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__IssueAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVTestSetupDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__RevisionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVTestSetupDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__DateAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getDateSTRINGTerminalRuleCall_10_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTestSetupDocumentAccess().getDateSTRINGTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__ApplicableDocumentsSectionAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getApplicableDocumentsSectionVTestSetupApplicableDocumentsParserRuleCall_12_0()); }
		ruleVTestSetupApplicableDocuments
		{ after(grammarAccess.getVTestSetupDocumentAccess().getApplicableDocumentsSectionVTestSetupApplicableDocumentsParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__ReferenceDocumentsSectionAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getReferenceDocumentsSectionVTestSetupReferenceDocumentsParserRuleCall_13_0()); }
		ruleVTestSetupReferenceDocuments
		{ after(grammarAccess.getVTestSetupDocumentAccess().getReferenceDocumentsSectionVTestSetupReferenceDocumentsParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__InterfacesAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getInterfacesVTestSetupInterfacesSectionParserRuleCall_15_0()); }
		ruleVTestSetupInterfacesSection
		{ after(grammarAccess.getVTestSetupDocumentAccess().getInterfacesVTestSetupInterfacesSectionParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__ConfigurationsAssignment_17_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getConfigurationsVTestSetupPacketConfigurationsSectionParserRuleCall_17_1_0()); }
		ruleVTestSetupPacketConfigurationsSection
		{ after(grammarAccess.getVTestSetupDocumentAccess().getConfigurationsVTestSetupPacketConfigurationsSectionParserRuleCall_17_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__ActionsAssignment_18_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getActionsVTestSetupActionsSectionParserRuleCall_18_1_0()); }
		ruleVTestSetupActionsSection
		{ after(grammarAccess.getVTestSetupDocumentAccess().getActionsVTestSetupActionsSectionParserRuleCall_18_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupDocument__ScenariosAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupDocumentAccess().getScenariosVTestSetupScenariosSectionParserRuleCall_20_0()); }
		ruleVTestSetupScenariosSection
		{ after(grammarAccess.getVTestSetupDocumentAccess().getScenariosVTestSetupScenariosSectionParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupApplicableDocuments__ApplicableDocumentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0()); }
		ruleDApplicableDocument
		{ after(grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupReferenceDocuments__ReferenceDocumentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0()); }
		ruleDReferenceDocument
		{ after(grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0()); }
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

rule__VTestSetupInterfacesSection__InterfacesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupInterfacesSectionAccess().getInterfacesVTestSetupInterfaceParserRuleCall_1_0()); }
		ruleVTestSetupInterface
		{ after(grammarAccess.getVTestSetupInterfacesSectionAccess().getInterfacesVTestSetupInterfaceParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTestSetupInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__TcHeaderAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderTMTCIFTCHeaderCrossReference_4_0()); }
		(
			{ before(grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderTMTCIFTCHeaderSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderTMTCIFTCHeaderSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderTMTCIFTCHeaderCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__TmHeaderAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderTMTCIFTMHeaderCrossReference_6_0()); }
		(
			{ before(grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderTMTCIFTMHeaderSTRINGTerminalRuleCall_6_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderTMTCIFTMHeaderSTRINGTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderTMTCIFTMHeaderCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupInterface__DescriptionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupInterfaceAccess().getDescriptionDRunParserRuleCall_8_0()); }
		ruleDRun
		{ after(grammarAccess.getVTestSetupInterfaceAccess().getDescriptionDRunParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfigurationsSection__PacketConfigurationsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getPacketConfigurationsVTestSetupPacketConfigurationParserRuleCall_1_0()); }
		ruleVTestSetupPacketConfiguration
		{ after(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getPacketConfigurationsVTestSetupPacketConfigurationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getIdUINT_STRINGTerminalRuleCall_4_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getIdUINT_STRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupPacketConfiguration__DescriptionAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupPacketConfigurationAccess().getDescriptionDRunParserRuleCall_6_0()); }
		ruleDRun
		{ after(grammarAccess.getVTestSetupPacketConfigurationAccess().getDescriptionDRunParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupActionsSection__ActionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupActionsSectionAccess().getActionVTestSetupActionParserRuleCall_1_0()); }
		ruleVTestSetupAction
		{ after(grammarAccess.getVTestSetupActionsSectionAccess().getActionVTestSetupActionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupActionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTestSetupActionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupActionAccess().getTypeVTestSetupActionTypeEnumRuleCall_4_0()); }
		ruleVTestSetupActionType
		{ after(grammarAccess.getVTestSetupActionAccess().getTypeVTestSetupActionTypeEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupAction__DescriptionAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupActionAccess().getDescriptionDBodyParserRuleCall_6_0()); }
		ruleDBody
		{ after(grammarAccess.getVTestSetupActionAccess().getDescriptionDBodyParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenariosSection__ScenariosAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupScenariosSectionAccess().getScenariosVTestSetupScenarioSectionParserRuleCall_1_0()); }
		ruleVTestSetupScenarioSection
		{ after(grammarAccess.getVTestSetupScenariosSectionAccess().getScenariosVTestSetupScenarioSectionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__ScenarioAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioTMTCIFScenarioCrossReference_4_0()); }
		(
			{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioTMTCIFScenarioSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioTMTCIFScenarioSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioTMTCIFScenarioCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__SupportedInterfaceAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedInterfaceVTestSetupSupportedInterfaceParserRuleCall_6_0()); }
		ruleVTestSetupSupportedInterface
		{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedInterfaceVTestSetupSupportedInterfaceParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__SelectedConfigurationAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getSelectedConfigurationVTestSetupSelectedConfigurationParserRuleCall_7_0()); }
		ruleVTestSetupSelectedConfiguration
		{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getSelectedConfigurationVTestSetupSelectedConfigurationParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__SupportedActionAssignment_8_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedActionVTestSetupActionCrossReference_8_2_0()); }
		(
			{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedActionVTestSetupActionSTRINGTerminalRuleCall_8_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedActionVTestSetupActionSTRINGTerminalRuleCall_8_2_0_1()); }
		)
		{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedActionVTestSetupActionCrossReference_8_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupScenarioSection__BodyAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupScenarioSectionAccess().getBodyDBodyParserRuleCall_9_0()); }
		ruleDBody
		{ after(grammarAccess.getVTestSetupScenarioSectionAccess().getBodyDBodyParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__InterfaceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceVTestSetupInterfaceCrossReference_4_0()); }
		(
			{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceVTestSetupInterfaceSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceVTestSetupInterfaceSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceVTestSetupInterfaceCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSupportedInterface__ScenarioInterfaceAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceTMTCIFScenarioInterfaceCrossReference_6_0()); }
		(
			{ before(grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceTMTCIFScenarioInterfaceSTRINGTerminalRuleCall_6_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceTMTCIFScenarioInterfaceSTRINGTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceTMTCIFScenarioInterfaceCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__ConfigurationAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationVTestSetupPacketConfigurationCrossReference_2_0()); }
		(
			{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationVTestSetupPacketConfigurationSTRINGTerminalRuleCall_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationVTestSetupPacketConfigurationSTRINGTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationVTestSetupPacketConfigurationCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__DefaultFilterStatusAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusVTestSetupConfigurationStatusEnumRuleCall_4_0()); }
		ruleVTestSetupConfigurationStatus
		{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusVTestSetupConfigurationStatusEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTestSetupSelectedConfiguration__DefaultPrintStatusAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusVTestSetupConfigurationStatusEnumRuleCall_6_0()); }
		ruleVTestSetupConfigurationStatus
		{ after(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusVTestSetupConfigurationStatusEnumRuleCall_6_0()); }
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
