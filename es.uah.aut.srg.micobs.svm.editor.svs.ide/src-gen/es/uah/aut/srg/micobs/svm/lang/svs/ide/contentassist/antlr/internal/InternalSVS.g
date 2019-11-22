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
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.svs.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.svs.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.micobs.svm.lang.svs.services.SVSGrammarAccess;

}
@parser::members {
	private SVSGrammarAccess grammarAccess;

	public void setGrammarAccess(SVSGrammarAccess grammarAccess) {
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

// Entry rule entryRuleVSVSDocument
entryRuleVSVSDocument
:
{ before(grammarAccess.getVSVSDocumentRule()); }
	 ruleVSVSDocument
{ after(grammarAccess.getVSVSDocumentRule()); } 
	 EOF 
;

// Rule VSVSDocument
ruleVSVSDocument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getGroup()); }
		(rule__VSVSDocument__Group__0)
		{ after(grammarAccess.getVSVSDocumentAccess().getGroup()); }
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

// Entry rule entryRuleVSVSTestInfo
entryRuleVSVSTestInfo
:
{ before(grammarAccess.getVSVSTestInfoRule()); }
	 ruleVSVSTestInfo
{ after(grammarAccess.getVSVSTestInfoRule()); } 
	 EOF 
;

// Rule VSVSTestInfo
ruleVSVSTestInfo 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSTestInfoAccess().getGroup()); }
		(rule__VSVSTestInfo__Group__0)
		{ after(grammarAccess.getVSVSTestInfoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSFixedSection
entryRuleVSVSFixedSection
:
{ before(grammarAccess.getVSVSFixedSectionRule()); }
	 ruleVSVSFixedSection
{ after(grammarAccess.getVSVSFixedSectionRule()); } 
	 EOF 
;

// Rule VSVSFixedSection
ruleVSVSFixedSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSFixedSectionAccess().getGroup()); }
		(rule__VSVSFixedSection__Group__0)
		{ after(grammarAccess.getVSVSFixedSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSInstantiableSection
entryRuleVSVSInstantiableSection
:
{ before(grammarAccess.getVSVSInstantiableSectionRule()); }
	 ruleVSVSInstantiableSection
{ after(grammarAccess.getVSVSInstantiableSectionRule()); } 
	 EOF 
;

// Rule VSVSInstantiableSection
ruleVSVSInstantiableSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSInstantiableSectionAccess().getGroup()); }
		(rule__VSVSInstantiableSection__Group__0)
		{ after(grammarAccess.getVSVSInstantiableSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSIntroduction
entryRuleVSVSIntroduction
:
{ before(grammarAccess.getVSVSIntroductionRule()); }
	 ruleVSVSIntroduction
{ after(grammarAccess.getVSVSIntroductionRule()); } 
	 EOF 
;

// Rule VSVSIntroduction
ruleVSVSIntroduction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSIntroductionAccess().getGroup()); }
		(rule__VSVSIntroduction__Group__0)
		{ after(grammarAccess.getVSVSIntroductionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSApplicableDocuments
entryRuleVSVSApplicableDocuments
:
{ before(grammarAccess.getVSVSApplicableDocumentsRule()); }
	 ruleVSVSApplicableDocuments
{ after(grammarAccess.getVSVSApplicableDocumentsRule()); } 
	 EOF 
;

// Rule VSVSApplicableDocuments
ruleVSVSApplicableDocuments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSApplicableDocumentsAccess().getGroup()); }
		(rule__VSVSApplicableDocuments__Group__0)
		{ after(grammarAccess.getVSVSApplicableDocumentsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSReferenceDocuments
entryRuleVSVSReferenceDocuments
:
{ before(grammarAccess.getVSVSReferenceDocumentsRule()); }
	 ruleVSVSReferenceDocuments
{ after(grammarAccess.getVSVSReferenceDocumentsRule()); } 
	 EOF 
;

// Rule VSVSReferenceDocuments
ruleVSVSReferenceDocuments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSReferenceDocumentsAccess().getGroup()); }
		(rule__VSVSReferenceDocuments__Group__0)
		{ after(grammarAccess.getVSVSReferenceDocumentsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSTermsDefinitionsAbbreviations
entryRuleVSVSTermsDefinitionsAbbreviations
:
{ before(grammarAccess.getVSVSTermsDefinitionsAbbreviationsRule()); }
	 ruleVSVSTermsDefinitionsAbbreviations
{ after(grammarAccess.getVSVSTermsDefinitionsAbbreviationsRule()); } 
	 EOF 
;

// Rule VSVSTermsDefinitionsAbbreviations
ruleVSVSTermsDefinitionsAbbreviations 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getGroup()); }
		(rule__VSVSTermsDefinitionsAbbreviations__Group__0)
		{ after(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSSoftwareOverview
entryRuleVSVSSoftwareOverview
:
{ before(grammarAccess.getVSVSSoftwareOverviewRule()); }
	 ruleVSVSSoftwareOverview
{ after(grammarAccess.getVSVSSoftwareOverviewRule()); } 
	 EOF 
;

// Rule VSVSSoftwareOverview
ruleVSVSSoftwareOverview 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSSoftwareOverviewAccess().getGroup()); }
		(rule__VSVSSoftwareOverview__Group__0)
		{ after(grammarAccess.getVSVSSoftwareOverviewAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSTaskIdentification
entryRuleVSVSTaskIdentification
:
{ before(grammarAccess.getVSVSTaskIdentificationRule()); }
	 ruleVSVSTaskIdentification
{ after(grammarAccess.getVSVSTaskIdentificationRule()); } 
	 EOF 
;

// Rule VSVSTaskIdentification
ruleVSVSTaskIdentification 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSTaskIdentificationAccess().getGroup()); }
		(rule__VSVSTaskIdentification__Group__0)
		{ after(grammarAccess.getVSVSTaskIdentificationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSTestingSpecificationDesign
entryRuleVSVSTestingSpecificationDesign
:
{ before(grammarAccess.getVSVSTestingSpecificationDesignRule()); }
	 ruleVSVSTestingSpecificationDesign
{ after(grammarAccess.getVSVSTestingSpecificationDesignRule()); } 
	 EOF 
;

// Rule VSVSTestingSpecificationDesign
ruleVSVSTestingSpecificationDesign 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGroup()); }
		(rule__VSVSTestingSpecificationDesign__Group__0)
		{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSInterfacesSection
entryRuleVSVSInterfacesSection
:
{ before(grammarAccess.getVSVSInterfacesSectionRule()); }
	 ruleVSVSInterfacesSection
{ after(grammarAccess.getVSVSInterfacesSectionRule()); } 
	 EOF 
;

// Rule VSVSInterfacesSection
ruleVSVSInterfacesSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSInterfacesSectionAccess().getGroup()); }
		(rule__VSVSInterfacesSection__Group__0)
		{ after(grammarAccess.getVSVSInterfacesSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSInterface
entryRuleVSVSInterface
:
{ before(grammarAccess.getVSVSInterfaceRule()); }
	 ruleVSVSInterface
{ after(grammarAccess.getVSVSInterfaceRule()); } 
	 EOF 
;

// Rule VSVSInterface
ruleVSVSInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSInterfaceAccess().getGroup()); }
		(rule__VSVSInterface__Group__0)
		{ after(grammarAccess.getVSVSInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSScenariosSection
entryRuleVSVSScenariosSection
:
{ before(grammarAccess.getVSVSScenariosSectionRule()); }
	 ruleVSVSScenariosSection
{ after(grammarAccess.getVSVSScenariosSectionRule()); } 
	 EOF 
;

// Rule VSVSScenariosSection
ruleVSVSScenariosSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSScenariosSectionAccess().getGroup()); }
		(rule__VSVSScenariosSection__Group__0)
		{ after(grammarAccess.getVSVSScenariosSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSScenarioSection
entryRuleVSVSScenarioSection
:
{ before(grammarAccess.getVSVSScenarioSectionRule()); }
	 ruleVSVSScenarioSection
{ after(grammarAccess.getVSVSScenarioSectionRule()); } 
	 EOF 
;

// Rule VSVSScenarioSection
ruleVSVSScenarioSection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSScenarioSectionAccess().getGroup()); }
		(rule__VSVSScenarioSection__Group__0)
		{ after(grammarAccess.getVSVSScenarioSectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSTestCases
entryRuleVSVSTestCases
:
{ before(grammarAccess.getVSVSTestCasesRule()); }
	 ruleVSVSTestCases
{ after(grammarAccess.getVSVSTestCasesRule()); } 
	 EOF 
;

// Rule VSVSTestCases
ruleVSVSTestCases 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSTestCasesAccess().getGroup()); }
		(rule__VSVSTestCases__Group__0)
		{ after(grammarAccess.getVSVSTestCasesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSTestProcedures
entryRuleVSVSTestProcedures
:
{ before(grammarAccess.getVSVSTestProceduresRule()); }
	 ruleVSVSTestProcedures
{ after(grammarAccess.getVSVSTestProceduresRule()); } 
	 EOF 
;

// Rule VSVSTestProcedures
ruleVSVSTestProcedures 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSTestProceduresAccess().getGroup()); }
		(rule__VSVSTestProcedures__Group__0)
		{ after(grammarAccess.getVSVSTestProceduresAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSAnalysisInspectionReview
entryRuleVSVSAnalysisInspectionReview
:
{ before(grammarAccess.getVSVSAnalysisInspectionReviewRule()); }
	 ruleVSVSAnalysisInspectionReview
{ after(grammarAccess.getVSVSAnalysisInspectionReviewRule()); } 
	 EOF 
;

// Rule VSVSAnalysisInspectionReview
ruleVSVSAnalysisInspectionReview 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getGroup()); }
		(rule__VSVSAnalysisInspectionReview__Group__0)
		{ after(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSTestPlatformRequirements
entryRuleVSVSTestPlatformRequirements
:
{ before(grammarAccess.getVSVSTestPlatformRequirementsRule()); }
	 ruleVSVSTestPlatformRequirements
{ after(grammarAccess.getVSVSTestPlatformRequirementsRule()); } 
	 EOF 
;

// Rule VSVSTestPlatformRequirements
ruleVSVSTestPlatformRequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSTestPlatformRequirementsAccess().getGroup()); }
		(rule__VSVSTestPlatformRequirements__Group__0)
		{ after(grammarAccess.getVSVSTestPlatformRequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSAdditionalInformation
entryRuleVSVSAdditionalInformation
:
{ before(grammarAccess.getVSVSAdditionalInformationRule()); }
	 ruleVSVSAdditionalInformation
{ after(grammarAccess.getVSVSAdditionalInformationRule()); } 
	 EOF 
;

// Rule VSVSAdditionalInformation
ruleVSVSAdditionalInformation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSAdditionalInformationAccess().getGroup()); }
		(rule__VSVSAdditionalInformation__Group__0)
		{ after(grammarAccess.getVSVSAdditionalInformationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSTerm
entryRuleVSVSTerm
:
{ before(grammarAccess.getVSVSTermRule()); }
	 ruleVSVSTerm
{ after(grammarAccess.getVSVSTermRule()); } 
	 EOF 
;

// Rule VSVSTerm
ruleVSVSTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSTermAccess().getGroup()); }
		(rule__VSVSTerm__Group__0)
		{ after(grammarAccess.getVSVSTermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSDefinition
entryRuleVSVSDefinition
:
{ before(grammarAccess.getVSVSDefinitionRule()); }
	 ruleVSVSDefinition
{ after(grammarAccess.getVSVSDefinitionRule()); } 
	 EOF 
;

// Rule VSVSDefinition
ruleVSVSDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSDefinitionAccess().getGroup()); }
		(rule__VSVSDefinition__Group__0)
		{ after(grammarAccess.getVSVSDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSAbbreviation
entryRuleVSVSAbbreviation
:
{ before(grammarAccess.getVSVSAbbreviationRule()); }
	 ruleVSVSAbbreviation
{ after(grammarAccess.getVSVSAbbreviationRule()); } 
	 EOF 
;

// Rule VSVSAbbreviation
ruleVSVSAbbreviation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSAbbreviationAccess().getGroup()); }
		(rule__VSVSAbbreviation__Group__0)
		{ after(grammarAccess.getVSVSAbbreviationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSTestDesign
entryRuleVSVSTestDesign
:
{ before(grammarAccess.getVSVSTestDesignRule()); }
	 ruleVSVSTestDesign
{ after(grammarAccess.getVSVSTestDesignRule()); } 
	 EOF 
;

// Rule VSVSTestDesign
ruleVSVSTestDesign 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSTestDesignAccess().getGroup()); }
		(rule__VSVSTestDesign__Group__0)
		{ after(grammarAccess.getVSVSTestDesignAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSTestCase
entryRuleVSVSTestCase
:
{ before(grammarAccess.getVSVSTestCaseRule()); }
	 ruleVSVSTestCase
{ after(grammarAccess.getVSVSTestCaseRule()); } 
	 EOF 
;

// Rule VSVSTestCase
ruleVSVSTestCase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getGroup()); }
		(rule__VSVSTestCase__Group__0)
		{ after(grammarAccess.getVSVSTestCaseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSTestProcedure
entryRuleVSVSTestProcedure
:
{ before(grammarAccess.getVSVSTestProcedureRule()); }
	 ruleVSVSTestProcedure
{ after(grammarAccess.getVSVSTestProcedureRule()); } 
	 EOF 
;

// Rule VSVSTestProcedure
ruleVSVSTestProcedure 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getGroup()); }
		(rule__VSVSTestProcedure__Group__0)
		{ after(grammarAccess.getVSVSTestProcedureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSProcedureSteps
entryRuleVSVSProcedureSteps
:
{ before(grammarAccess.getVSVSProcedureStepsRule()); }
	 ruleVSVSProcedureSteps
{ after(grammarAccess.getVSVSProcedureStepsRule()); } 
	 EOF 
;

// Rule VSVSProcedureSteps
ruleVSVSProcedureSteps 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSProcedureStepsAccess().getGroup()); }
		(rule__VSVSProcedureSteps__Group__0)
		{ after(grammarAccess.getVSVSProcedureStepsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSProcedureStep
entryRuleVSVSProcedureStep
:
{ before(grammarAccess.getVSVSProcedureStepRule()); }
	 ruleVSVSProcedureStep
{ after(grammarAccess.getVSVSProcedureStepRule()); } 
	 EOF 
;

// Rule VSVSProcedureStep
ruleVSVSProcedureStep 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSProcedureStepAccess().getGroup()); }
		(rule__VSVSProcedureStep__Group__0)
		{ after(grammarAccess.getVSVSProcedureStepAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSStepInputs
entryRuleVSVSStepInputs
:
{ before(grammarAccess.getVSVSStepInputsRule()); }
	 ruleVSVSStepInputs
{ after(grammarAccess.getVSVSStepInputsRule()); } 
	 EOF 
;

// Rule VSVSStepInputs
ruleVSVSStepInputs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSStepInputsAccess().getGroup()); }
		(rule__VSVSStepInputs__Group__0)
		{ after(grammarAccess.getVSVSStepInputsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSStepInput
entryRuleVSVSStepInput
:
{ before(grammarAccess.getVSVSStepInputRule()); }
	 ruleVSVSStepInput
{ after(grammarAccess.getVSVSStepInputRule()); } 
	 EOF 
;

// Rule VSVSStepInput
ruleVSVSStepInput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSStepInputAccess().getGroup()); }
		(rule__VSVSStepInput__Group__0)
		{ after(grammarAccess.getVSVSStepInputAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSStepOutputs
entryRuleVSVSStepOutputs
:
{ before(grammarAccess.getVSVSStepOutputsRule()); }
	 ruleVSVSStepOutputs
{ after(grammarAccess.getVSVSStepOutputsRule()); } 
	 EOF 
;

// Rule VSVSStepOutputs
ruleVSVSStepOutputs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSStepOutputsAccess().getGroup()); }
		(rule__VSVSStepOutputs__Group__0)
		{ after(grammarAccess.getVSVSStepOutputsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVSVSStepOutput
entryRuleVSVSStepOutput
:
{ before(grammarAccess.getVSVSStepOutputRule()); }
	 ruleVSVSStepOutput
{ after(grammarAccess.getVSVSStepOutputRule()); } 
	 EOF 
;

// Rule VSVSStepOutput
ruleVSVSStepOutput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVSVSStepOutputAccess().getGroup()); }
		(rule__VSVSStepOutput__Group__0)
		{ after(grammarAccess.getVSVSStepOutputAccess().getGroup()); }
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

// Rule VSVSTimeUnit
ruleVSVSTimeUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTimeUnitAccess().getAlternatives()); }
		(rule__VSVSTimeUnit__Alternatives)
		{ after(grammarAccess.getVSVSTimeUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule VSVSStepOutputsCheckmode
ruleVSVSStepOutputsCheckmode
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepOutputsCheckmodeAccess().getAlternatives()); }
		(rule__VSVSStepOutputsCheckmode__Alternatives)
		{ after(grammarAccess.getVSVSStepOutputsCheckmodeAccess().getAlternatives()); }
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

rule__VSVSTimeUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTimeUnitAccess().getMilisecondsEnumLiteralDeclaration_0()); }
		('"miliseconds"')
		{ after(grammarAccess.getVSVSTimeUnitAccess().getMilisecondsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVSVSTimeUnitAccess().getSecondsEnumLiteralDeclaration_1()); }
		('"seconds"')
		{ after(grammarAccess.getVSVSTimeUnitAccess().getSecondsEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputsCheckmode__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepOutputsCheckmodeAccess().getAllEnumLiteralDeclaration_0()); }
		('"all"')
		{ after(grammarAccess.getVSVSStepOutputsCheckmodeAccess().getAllEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVSVSStepOutputsCheckmodeAccess().getAllunsortedEnumLiteralDeclaration_1()); }
		('"allunsorted"')
		{ after(grammarAccess.getVSVSStepOutputsCheckmodeAccess().getAllunsortedEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getVSVSStepOutputsCheckmodeAccess().getAnyEnumLiteralDeclaration_2()); }
		('"any"')
		{ after(grammarAccess.getVSVSStepOutputsCheckmodeAccess().getAnyEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__0__Impl
	rule__VSVSDocument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getSVSKeyword_0()); }
	'<SVS'
	{ after(grammarAccess.getVSVSDocumentAccess().getSVSKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__1__Impl
	rule__VSVSDocument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSDocumentAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__2__Impl
	rule__VSVSDocument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getNameAssignment_2()); }
	(rule__VSVSDocument__NameAssignment_2)
	{ after(grammarAccess.getVSVSDocumentAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__3__Impl
	rule__VSVSDocument__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getIdKeyword_3()); }
	'id='
	{ after(grammarAccess.getVSVSDocumentAccess().getIdKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__4__Impl
	rule__VSVSDocument__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getIdAssignment_4()); }
	(rule__VSVSDocument__IdAssignment_4)
	{ after(grammarAccess.getVSVSDocumentAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__5__Impl
	rule__VSVSDocument__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getIssueKeyword_5()); }
	'issue='
	{ after(grammarAccess.getVSVSDocumentAccess().getIssueKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__6__Impl
	rule__VSVSDocument__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getIssueAssignment_6()); }
	(rule__VSVSDocument__IssueAssignment_6)
	{ after(grammarAccess.getVSVSDocumentAccess().getIssueAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__7__Impl
	rule__VSVSDocument__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getRevisionKeyword_7()); }
	'revision='
	{ after(grammarAccess.getVSVSDocumentAccess().getRevisionKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__8__Impl
	rule__VSVSDocument__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getRevisionAssignment_8()); }
	(rule__VSVSDocument__RevisionAssignment_8)
	{ after(grammarAccess.getVSVSDocumentAccess().getRevisionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__9__Impl
	rule__VSVSDocument__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getDateKeyword_9()); }
	'date='
	{ after(grammarAccess.getVSVSDocumentAccess().getDateKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__10__Impl
	rule__VSVSDocument__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getDateAssignment_10()); }
	(rule__VSVSDocument__DateAssignment_10)
	{ after(grammarAccess.getVSVSDocumentAccess().getDateAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__11__Impl
	rule__VSVSDocument__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getGreaterThanSignKeyword_11()); }
	'>'
	{ after(grammarAccess.getVSVSDocumentAccess().getGreaterThanSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__12__Impl
	rule__VSVSDocument__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getGroup_12()); }
	(rule__VSVSDocument__Group_12__0)*
	{ after(grammarAccess.getVSVSDocumentAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__13__Impl
	rule__VSVSDocument__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getIntroductionSectionAssignment_13()); }
	(rule__VSVSDocument__IntroductionSectionAssignment_13)
	{ after(grammarAccess.getVSVSDocumentAccess().getIntroductionSectionAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__14__Impl
	rule__VSVSDocument__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getApplicableDocumentsSectionAssignment_14()); }
	(rule__VSVSDocument__ApplicableDocumentsSectionAssignment_14)
	{ after(grammarAccess.getVSVSDocumentAccess().getApplicableDocumentsSectionAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__15__Impl
	rule__VSVSDocument__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getReferenceDocumentsSectionAssignment_15()); }
	(rule__VSVSDocument__ReferenceDocumentsSectionAssignment_15)
	{ after(grammarAccess.getVSVSDocumentAccess().getReferenceDocumentsSectionAssignment_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__16__Impl
	rule__VSVSDocument__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_16()); }
	(rule__VSVSDocument__TermsDefinitionsAbbreviationsSectionAssignment_16)
	{ after(grammarAccess.getVSVSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__17__Impl
	rule__VSVSDocument__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getSoftwareOverviewSectionAssignment_17()); }
	(rule__VSVSDocument__SoftwareOverviewSectionAssignment_17)
	{ after(grammarAccess.getVSVSDocumentAccess().getSoftwareOverviewSectionAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__18__Impl
	rule__VSVSDocument__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getTaskIdentificationSectionAssignment_18()); }
	(rule__VSVSDocument__TaskIdentificationSectionAssignment_18)
	{ after(grammarAccess.getVSVSDocumentAccess().getTaskIdentificationSectionAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__19__Impl
	rule__VSVSDocument__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getTestingSpecificationDesignSectionAssignment_19()); }
	(rule__VSVSDocument__TestingSpecificationDesignSectionAssignment_19)
	{ after(grammarAccess.getVSVSDocumentAccess().getTestingSpecificationDesignSectionAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__20__Impl
	rule__VSVSDocument__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getTestCasesSectionAssignment_20()); }
	(rule__VSVSDocument__TestCasesSectionAssignment_20)
	{ after(grammarAccess.getVSVSDocumentAccess().getTestCasesSectionAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__21__Impl
	rule__VSVSDocument__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getTestProceduresSectionAssignment_21()); }
	(rule__VSVSDocument__TestProceduresSectionAssignment_21)
	{ after(grammarAccess.getVSVSDocumentAccess().getTestProceduresSectionAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__22__Impl
	rule__VSVSDocument__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getAnalysisInspectionReviewSectionAssignment_22()); }
	(rule__VSVSDocument__AnalysisInspectionReviewSectionAssignment_22)
	{ after(grammarAccess.getVSVSDocumentAccess().getAnalysisInspectionReviewSectionAssignment_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__23__Impl
	rule__VSVSDocument__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getTestPlatformRequirementsSectionAssignment_23()); }
	(rule__VSVSDocument__TestPlatformRequirementsSectionAssignment_23)
	{ after(grammarAccess.getVSVSDocumentAccess().getTestPlatformRequirementsSectionAssignment_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__24__Impl
	rule__VSVSDocument__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getAdditionalInformationSectionAssignment_24()); }
	(rule__VSVSDocument__AdditionalInformationSectionAssignment_24)
	{ after(grammarAccess.getVSVSDocumentAccess().getAdditionalInformationSectionAssignment_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group__25__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getSVSKeyword_25()); }
	'</SVS>'
	{ after(grammarAccess.getVSVSDocumentAccess().getSVSKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSDocument__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group_12__0__Impl
	rule__VSVSDocument__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getParentKeyword_12_0()); }
	'<parent'
	{ after(grammarAccess.getVSVSDocumentAccess().getParentKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group_12__1__Impl
	rule__VSVSDocument__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getNameKeyword_12_1()); }
	'name='
	{ after(grammarAccess.getVSVSDocumentAccess().getNameKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group_12__2__Impl
	rule__VSVSDocument__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getParentsAssignment_12_2()); }
	(rule__VSVSDocument__ParentsAssignment_12_2)
	{ after(grammarAccess.getVSVSDocumentAccess().getParentsAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDocument__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDocumentAccess().getSolidusGreaterThanSignKeyword_12_3()); }
	'/>'
	{ after(grammarAccess.getVSVSDocumentAccess().getSolidusGreaterThanSignKeyword_12_3()); }
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


rule__VSVSTestInfo__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestInfo__Group__0__Impl
	rule__VSVSTestInfo__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestInfo__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestInfoAccess().getVSVSTestInfoAction_0()); }
	()
	{ after(grammarAccess.getVSVSTestInfoAccess().getVSVSTestInfoAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestInfo__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestInfo__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestInfo__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestInfoAccess().getBodyAssignment_1()); }
	(rule__VSVSTestInfo__BodyAssignment_1)?
	{ after(grammarAccess.getVSVSTestInfoAccess().getBodyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSFixedSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSFixedSection__Group__0__Impl
	rule__VSVSFixedSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSFixedSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSFixedSectionAccess().getVSVSFixedSectionAction_0()); }
	()
	{ after(grammarAccess.getVSVSFixedSectionAccess().getVSVSFixedSectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSFixedSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSFixedSection__Group__1__Impl
	rule__VSVSFixedSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSFixedSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSFixedSectionAccess().getBodyAssignment_1()); }
	(rule__VSVSFixedSection__BodyAssignment_1)?
	{ after(grammarAccess.getVSVSFixedSectionAccess().getBodyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSFixedSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSFixedSection__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSFixedSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSFixedSectionAccess().getSvsInstatiableSubsectionsAssignment_2()); }
	(rule__VSVSFixedSection__SvsInstatiableSubsectionsAssignment_2)*
	{ after(grammarAccess.getVSVSFixedSectionAccess().getSvsInstatiableSubsectionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSInstantiableSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInstantiableSection__Group__0__Impl
	rule__VSVSInstantiableSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInstantiableSectionAccess().getSubsectionKeyword_0()); }
	'<subsection'
	{ after(grammarAccess.getVSVSInstantiableSectionAccess().getSubsectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInstantiableSection__Group__1__Impl
	rule__VSVSInstantiableSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInstantiableSectionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSInstantiableSectionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInstantiableSection__Group__2__Impl
	rule__VSVSInstantiableSection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInstantiableSectionAccess().getNameAssignment_2()); }
	(rule__VSVSInstantiableSection__NameAssignment_2)
	{ after(grammarAccess.getVSVSInstantiableSectionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInstantiableSection__Group__3__Impl
	rule__VSVSInstantiableSection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInstantiableSectionAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVSInstantiableSectionAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInstantiableSection__Group__4__Impl
	rule__VSVSInstantiableSection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInstantiableSectionAccess().getBodyAssignment_4()); }
	(rule__VSVSInstantiableSection__BodyAssignment_4)?
	{ after(grammarAccess.getVSVSInstantiableSectionAccess().getBodyAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInstantiableSection__Group__5__Impl
	rule__VSVSInstantiableSection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInstantiableSectionAccess().getSvsInstatiableSubsectionsAssignment_5()); }
	(rule__VSVSInstantiableSection__SvsInstatiableSubsectionsAssignment_5)*
	{ after(grammarAccess.getVSVSInstantiableSectionAccess().getSvsInstatiableSubsectionsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInstantiableSection__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInstantiableSectionAccess().getSubsectionKeyword_6()); }
	'</subsection>'
	{ after(grammarAccess.getVSVSInstantiableSectionAccess().getSubsectionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSIntroduction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSIntroduction__Group__0__Impl
	rule__VSVSIntroduction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSIntroduction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSIntroductionAccess().getIntroductionKeyword_0()); }
	'<Introduction>'
	{ after(grammarAccess.getVSVSIntroductionAccess().getIntroductionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSIntroduction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSIntroduction__Group__1__Impl
	rule__VSVSIntroduction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSIntroduction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSIntroductionAccess().getSvsInstatiableSubsectionsAssignment_1()); }
		(rule__VSVSIntroduction__SvsInstatiableSubsectionsAssignment_1)
		{ after(grammarAccess.getVSVSIntroductionAccess().getSvsInstatiableSubsectionsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getVSVSIntroductionAccess().getSvsInstatiableSubsectionsAssignment_1()); }
		(rule__VSVSIntroduction__SvsInstatiableSubsectionsAssignment_1)*
		{ after(grammarAccess.getVSVSIntroductionAccess().getSvsInstatiableSubsectionsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSIntroduction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSIntroduction__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSIntroduction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSIntroductionAccess().getIntroductionKeyword_2()); }
	'</Introduction>'
	{ after(grammarAccess.getVSVSIntroductionAccess().getIntroductionKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSApplicableDocuments__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSApplicableDocuments__Group__0__Impl
	rule__VSVSApplicableDocuments__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSApplicableDocuments__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSApplicableDocumentsAccess().getVSVSApplicableDocumentsAction_0()); }
	()
	{ after(grammarAccess.getVSVSApplicableDocumentsAccess().getVSVSApplicableDocumentsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSApplicableDocuments__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSApplicableDocuments__Group__1__Impl
	rule__VSVSApplicableDocuments__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSApplicableDocuments__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsKeyword_1()); }
	'<ApplicableDocuments>'
	{ after(grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSApplicableDocuments__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSApplicableDocuments__Group__2__Impl
	rule__VSVSApplicableDocuments__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSApplicableDocuments__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsAssignment_2()); }
	(rule__VSVSApplicableDocuments__ApplicableDocumentsAssignment_2)*
	{ after(grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSApplicableDocuments__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSApplicableDocuments__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSApplicableDocuments__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3()); }
	'</ApplicableDocuments>'
	{ after(grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSReferenceDocuments__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSReferenceDocuments__Group__0__Impl
	rule__VSVSReferenceDocuments__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSReferenceDocuments__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSReferenceDocumentsAccess().getVSVSReferenceDocumentsAction_0()); }
	()
	{ after(grammarAccess.getVSVSReferenceDocumentsAccess().getVSVSReferenceDocumentsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSReferenceDocuments__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSReferenceDocuments__Group__1__Impl
	rule__VSVSReferenceDocuments__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSReferenceDocuments__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsKeyword_1()); }
	'<ReferenceDocuments>'
	{ after(grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSReferenceDocuments__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSReferenceDocuments__Group__2__Impl
	rule__VSVSReferenceDocuments__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSReferenceDocuments__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsAssignment_2()); }
	(rule__VSVSReferenceDocuments__ReferenceDocumentsAssignment_2)*
	{ after(grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSReferenceDocuments__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSReferenceDocuments__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSReferenceDocuments__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3()); }
	'</ReferenceDocuments>'
	{ after(grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTermsDefinitionsAbbreviations__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTermsDefinitionsAbbreviations__Group__0__Impl
	rule__VSVSTermsDefinitionsAbbreviations__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getVSVSTermsDefinitionsAbbreviationsAction_0()); }
	()
	{ after(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getVSVSTermsDefinitionsAbbreviationsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTermsDefinitionsAbbreviations__Group__1__Impl
	rule__VSVSTermsDefinitionsAbbreviations__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1()); }
	'<TermsDefinitionsAbbreviations>'
	{ after(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTermsDefinitionsAbbreviations__Group__2__Impl
	rule__VSVSTermsDefinitionsAbbreviations__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2()); }
	(rule__VSVSTermsDefinitionsAbbreviations__TermsAssignment_2)*
	{ after(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTermsDefinitionsAbbreviations__Group__3__Impl
	rule__VSVSTermsDefinitionsAbbreviations__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3()); }
	(rule__VSVSTermsDefinitionsAbbreviations__DefinitionsAssignment_3)*
	{ after(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTermsDefinitionsAbbreviations__Group__4__Impl
	rule__VSVSTermsDefinitionsAbbreviations__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4()); }
	(rule__VSVSTermsDefinitionsAbbreviations__AbbreviationsAssignment_4)*
	{ after(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTermsDefinitionsAbbreviations__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5()); }
	'</TermsDefinitionsAbbreviations>'
	{ after(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSSoftwareOverview__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSSoftwareOverview__Group__0__Impl
	rule__VSVSSoftwareOverview__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSSoftwareOverview__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSSoftwareOverviewAccess().getVSVSSoftwareOverviewAction_0()); }
	()
	{ after(grammarAccess.getVSVSSoftwareOverviewAccess().getVSVSSoftwareOverviewAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSSoftwareOverview__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSSoftwareOverview__Group__1__Impl
	rule__VSVSSoftwareOverview__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSSoftwareOverview__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSSoftwareOverviewAccess().getSoftwareOverviewKeyword_1()); }
	'<SoftwareOverview>'
	{ after(grammarAccess.getVSVSSoftwareOverviewAccess().getSoftwareOverviewKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSSoftwareOverview__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSSoftwareOverview__Group__2__Impl
	rule__VSVSSoftwareOverview__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSSoftwareOverview__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSSoftwareOverviewAccess().getBodyAssignment_2()); }
	(rule__VSVSSoftwareOverview__BodyAssignment_2)?
	{ after(grammarAccess.getVSVSSoftwareOverviewAccess().getBodyAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSSoftwareOverview__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSSoftwareOverview__Group__3__Impl
	rule__VSVSSoftwareOverview__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSSoftwareOverview__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSSoftwareOverviewAccess().getSvsInstatiableSubsectionsAssignment_3()); }
	(rule__VSVSSoftwareOverview__SvsInstatiableSubsectionsAssignment_3)*
	{ after(grammarAccess.getVSVSSoftwareOverviewAccess().getSvsInstatiableSubsectionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSSoftwareOverview__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSSoftwareOverview__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSSoftwareOverview__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSSoftwareOverviewAccess().getSoftwareOverviewKeyword_4()); }
	'</SoftwareOverview>'
	{ after(grammarAccess.getVSVSSoftwareOverviewAccess().getSoftwareOverviewKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTaskIdentification__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__0__Impl
	rule__VSVSTaskIdentification__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getTaskIdentificationKeyword_0()); }
	'<TaskIdentification>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getTaskIdentificationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__1__Impl
	rule__VSVSTaskIdentification__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaKeyword_1()); }
	'<TaskCriteria>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__2__Impl
	rule__VSVSTaskIdentification__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaAssignment_2()); }
	(rule__VSVSTaskIdentification__TaskCriteriaAssignment_2)
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__3__Impl
	rule__VSVSTaskIdentification__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaKeyword_3()); }
	'</TaskCriteria>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__4__Impl
	rule__VSVSTaskIdentification__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedKeyword_4()); }
	'<FeaturesToBeTested>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__5__Impl
	rule__VSVSTaskIdentification__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedAssignment_5()); }
	(rule__VSVSTaskIdentification__FeaturesToBeTestedAssignment_5)
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__6__Impl
	rule__VSVSTaskIdentification__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedKeyword_6()); }
	'</FeaturesToBeTested>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__7__Impl
	rule__VSVSTaskIdentification__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedKeyword_7()); }
	'<FeaturesNotToBeTested>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__8__Impl
	rule__VSVSTaskIdentification__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedAssignment_8()); }
	(rule__VSVSTaskIdentification__FeaturesNotToBeTestedAssignment_8)
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__9__Impl
	rule__VSVSTaskIdentification__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedKeyword_9()); }
	'</FeaturesNotToBeTested>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__10__Impl
	rule__VSVSTaskIdentification__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaKeyword_10()); }
	'<TestPassFailCriteria>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__11__Impl
	rule__VSVSTaskIdentification__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaAssignment_11()); }
	(rule__VSVSTaskIdentification__TestPassFailCriteriaAssignment_11)
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__12__Impl
	rule__VSVSTaskIdentification__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaKeyword_12()); }
	'</TestPassFailCriteria>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__13__Impl
	rule__VSVSTaskIdentification__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedKeyword_13()); }
	'<ItemsCanNotBeValidated>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__14__Impl
	rule__VSVSTaskIdentification__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedAssignment_14()); }
	(rule__VSVSTaskIdentification__ItemsCanNotBeValidatedAssignment_14)
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__15__Impl
	rule__VSVSTaskIdentification__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedKeyword_15()); }
	'</ItemsCanNotBeValidated>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__16__Impl
	rule__VSVSTaskIdentification__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeKeyword_16()); }
	'<ManuallyAutoGeneratedCode>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__17__Impl
	rule__VSVSTaskIdentification__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeAssignment_17()); }
	(rule__VSVSTaskIdentification__ManuallyAutoGeneratedCodeAssignment_17)
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__18__Impl
	rule__VSVSTaskIdentification__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeKeyword_18()); }
	'</ManuallyAutoGeneratedCode>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTaskIdentification__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTaskIdentificationAccess().getTaskIdentificationKeyword_19()); }
	'</TaskIdentification>'
	{ after(grammarAccess.getVSVSTaskIdentificationAccess().getTaskIdentificationKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTestingSpecificationDesign__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__0__Impl
	rule__VSVSTestingSpecificationDesign__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestingSpecificationDesignKeyword_0()); }
	'<TestingSpecificationDesign>'
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestingSpecificationDesignKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__1__Impl
	rule__VSVSTestingSpecificationDesign__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralKeyword_1()); }
	'<General>'
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__2__Impl
	rule__VSVSTestingSpecificationDesign__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralAssignment_2()); }
	(rule__VSVSTestingSpecificationDesign__GeneralAssignment_2)
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__3__Impl
	rule__VSVSTestingSpecificationDesign__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralKeyword_3()); }
	'</General>'
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__4__Impl
	rule__VSVSTestingSpecificationDesign__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getInterfacesKeyword_4()); }
	'<Interfaces>'
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getInterfacesKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__5__Impl
	rule__VSVSTestingSpecificationDesign__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getInterfacesAssignment_5()); }
	(rule__VSVSTestingSpecificationDesign__InterfacesAssignment_5)
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getInterfacesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__6__Impl
	rule__VSVSTestingSpecificationDesign__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getInterfacesKeyword_6()); }
	'</Interfaces>'
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getInterfacesKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__7__Impl
	rule__VSVSTestingSpecificationDesign__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosKeyword_7()); }
	'<Scenarios>'
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__8__Impl
	rule__VSVSTestingSpecificationDesign__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosAssignment_8()); }
	(rule__VSVSTestingSpecificationDesign__ScenariosAssignment_8)
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__9__Impl
	rule__VSVSTestingSpecificationDesign__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosKeyword_9()); }
	'</Scenarios>'
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__10__Impl
	rule__VSVSTestingSpecificationDesign__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsAssignment_10()); }
		(rule__VSVSTestingSpecificationDesign__TestDesignsAssignment_10)
		{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsAssignment_10()); }
	)
	(
		{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsAssignment_10()); }
		(rule__VSVSTestingSpecificationDesign__TestDesignsAssignment_10)*
		{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsAssignment_10()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestingSpecificationDesign__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestingSpecificationDesignKeyword_11()); }
	'</TestingSpecificationDesign>'
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestingSpecificationDesignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSInterfacesSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInterfacesSection__Group__0__Impl
	rule__VSVSInterfacesSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterfacesSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInterfacesSectionAccess().getVSVSInterfacesSectionAction_0()); }
	()
	{ after(grammarAccess.getVSVSInterfacesSectionAccess().getVSVSInterfacesSectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterfacesSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInterfacesSection__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterfacesSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSInterfacesSectionAccess().getInterfacesAssignment_1()); }
		(rule__VSVSInterfacesSection__InterfacesAssignment_1)
		{ after(grammarAccess.getVSVSInterfacesSectionAccess().getInterfacesAssignment_1()); }
	)
	(
		{ before(grammarAccess.getVSVSInterfacesSectionAccess().getInterfacesAssignment_1()); }
		(rule__VSVSInterfacesSection__InterfacesAssignment_1)*
		{ after(grammarAccess.getVSVSInterfacesSectionAccess().getInterfacesAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInterface__Group__0__Impl
	rule__VSVSInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInterfaceAccess().getInterfaceKeyword_0()); }
	'<Interface'
	{ after(grammarAccess.getVSVSInterfaceAccess().getInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInterface__Group__1__Impl
	rule__VSVSInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInterfaceAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSInterfaceAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInterface__Group__2__Impl
	rule__VSVSInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInterfaceAccess().getNameAssignment_2()); }
	(rule__VSVSInterface__NameAssignment_2)
	{ after(grammarAccess.getVSVSInterfaceAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInterface__Group__3__Impl
	rule__VSVSInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInterfaceAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVSInterfaceAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInterface__Group__4__Impl
	rule__VSVSInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInterfaceAccess().getDescriptionAssignment_4()); }
	(rule__VSVSInterface__DescriptionAssignment_4)
	{ after(grammarAccess.getVSVSInterfaceAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSInterface__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSInterfaceAccess().getInterfaceKeyword_5()); }
	'</Interface>'
	{ after(grammarAccess.getVSVSInterfaceAccess().getInterfaceKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSScenariosSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenariosSection__Group__0__Impl
	rule__VSVSScenariosSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenariosSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSScenariosSectionAccess().getVSVSScenariosSectionAction_0()); }
	()
	{ after(grammarAccess.getVSVSScenariosSectionAccess().getVSVSScenariosSectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenariosSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenariosSection__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenariosSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSScenariosSectionAccess().getScenariosAssignment_1()); }
		(rule__VSVSScenariosSection__ScenariosAssignment_1)
		{ after(grammarAccess.getVSVSScenariosSectionAccess().getScenariosAssignment_1()); }
	)
	(
		{ before(grammarAccess.getVSVSScenariosSectionAccess().getScenariosAssignment_1()); }
		(rule__VSVSScenariosSection__ScenariosAssignment_1)*
		{ after(grammarAccess.getVSVSScenariosSectionAccess().getScenariosAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSScenarioSection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenarioSection__Group__0__Impl
	rule__VSVSScenarioSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSScenarioSectionAccess().getScenarioKeyword_0()); }
	'<Scenario'
	{ after(grammarAccess.getVSVSScenarioSectionAccess().getScenarioKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenarioSection__Group__1__Impl
	rule__VSVSScenarioSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSScenarioSectionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSScenarioSectionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenarioSection__Group__2__Impl
	rule__VSVSScenarioSection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSScenarioSectionAccess().getNameAssignment_2()); }
	(rule__VSVSScenarioSection__NameAssignment_2)
	{ after(grammarAccess.getVSVSScenarioSectionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenarioSection__Group__3__Impl
	rule__VSVSScenarioSection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSScenarioSectionAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVSScenarioSectionAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenarioSection__Group__4__Impl
	rule__VSVSScenarioSection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSScenarioSectionAccess().getGroup_4()); }
		(rule__VSVSScenarioSection__Group_4__0)
		{ after(grammarAccess.getVSVSScenarioSectionAccess().getGroup_4()); }
	)
	(
		{ before(grammarAccess.getVSVSScenarioSectionAccess().getGroup_4()); }
		(rule__VSVSScenarioSection__Group_4__0)*
		{ after(grammarAccess.getVSVSScenarioSectionAccess().getGroup_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenarioSection__Group__5__Impl
	rule__VSVSScenarioSection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSScenarioSectionAccess().getBodyAssignment_5()); }
	(rule__VSVSScenarioSection__BodyAssignment_5)
	{ after(grammarAccess.getVSVSScenarioSectionAccess().getBodyAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenarioSection__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSScenarioSectionAccess().getScenarioKeyword_6()); }
	'</Scenario>'
	{ after(grammarAccess.getVSVSScenarioSectionAccess().getScenarioKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSScenarioSection__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenarioSection__Group_4__0__Impl
	rule__VSVSScenarioSection__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSScenarioSectionAccess().getInterfaceKeyword_4_0()); }
	'<Interface'
	{ after(grammarAccess.getVSVSScenarioSectionAccess().getInterfaceKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenarioSection__Group_4__1__Impl
	rule__VSVSScenarioSection__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSScenarioSectionAccess().getRefKeyword_4_1()); }
	'ref='
	{ after(grammarAccess.getVSVSScenarioSectionAccess().getRefKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenarioSection__Group_4__2__Impl
	rule__VSVSScenarioSection__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSScenarioSectionAccess().getInterfaceAssignment_4_2()); }
	(rule__VSVSScenarioSection__InterfaceAssignment_4_2)
	{ after(grammarAccess.getVSVSScenarioSectionAccess().getInterfaceAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSScenarioSection__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSScenarioSectionAccess().getSolidusGreaterThanSignKeyword_4_3()); }
	'/>'
	{ after(grammarAccess.getVSVSScenarioSectionAccess().getSolidusGreaterThanSignKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTestCases__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCases__Group__0__Impl
	rule__VSVSTestCases__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCasesAccess().getTestCasesKeyword_0()); }
	'<TestCases>'
	{ after(grammarAccess.getVSVSTestCasesAccess().getTestCasesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCases__Group__1__Impl
	rule__VSVSTestCases__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCasesAccess().getGeneralKeyword_1()); }
	'<General>'
	{ after(grammarAccess.getVSVSTestCasesAccess().getGeneralKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCases__Group__2__Impl
	rule__VSVSTestCases__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCasesAccess().getGeneralAssignment_2()); }
	(rule__VSVSTestCases__GeneralAssignment_2)
	{ after(grammarAccess.getVSVSTestCasesAccess().getGeneralAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCases__Group__3__Impl
	rule__VSVSTestCases__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCasesAccess().getGeneralKeyword_3()); }
	'</General>'
	{ after(grammarAccess.getVSVSTestCasesAccess().getGeneralKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCases__Group__4__Impl
	rule__VSVSTestCases__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSTestCasesAccess().getTestCasesAssignment_4()); }
		(rule__VSVSTestCases__TestCasesAssignment_4)
		{ after(grammarAccess.getVSVSTestCasesAccess().getTestCasesAssignment_4()); }
	)
	(
		{ before(grammarAccess.getVSVSTestCasesAccess().getTestCasesAssignment_4()); }
		(rule__VSVSTestCases__TestCasesAssignment_4)*
		{ after(grammarAccess.getVSVSTestCasesAccess().getTestCasesAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCases__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCasesAccess().getTestCasesKeyword_5()); }
	'</TestCases>'
	{ after(grammarAccess.getVSVSTestCasesAccess().getTestCasesKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTestProcedures__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedures__Group__0__Impl
	rule__VSVSTestProcedures__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresKeyword_0()); }
	'<TestProcedures>'
	{ after(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedures__Group__1__Impl
	rule__VSVSTestProcedures__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProceduresAccess().getGeneralKeyword_1()); }
	'<General>'
	{ after(grammarAccess.getVSVSTestProceduresAccess().getGeneralKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedures__Group__2__Impl
	rule__VSVSTestProcedures__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProceduresAccess().getGeneralAssignment_2()); }
	(rule__VSVSTestProcedures__GeneralAssignment_2)
	{ after(grammarAccess.getVSVSTestProceduresAccess().getGeneralAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedures__Group__3__Impl
	rule__VSVSTestProcedures__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProceduresAccess().getGeneralKeyword_3()); }
	'</General>'
	{ after(grammarAccess.getVSVSTestProceduresAccess().getGeneralKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedures__Group__4__Impl
	rule__VSVSTestProcedures__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresAssignment_4()); }
		(rule__VSVSTestProcedures__TestProceduresAssignment_4)
		{ after(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresAssignment_4()); }
	)
	(
		{ before(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresAssignment_4()); }
		(rule__VSVSTestProcedures__TestProceduresAssignment_4)*
		{ after(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedures__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresKeyword_5()); }
	'</TestProcedures>'
	{ after(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSAnalysisInspectionReview__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAnalysisInspectionReview__Group__0__Impl
	rule__VSVSAnalysisInspectionReview__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAnalysisInspectionReview__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getVSVSAnalysisInspectionReviewAction_0()); }
	()
	{ after(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getVSVSAnalysisInspectionReviewAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAnalysisInspectionReview__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAnalysisInspectionReview__Group__1__Impl
	rule__VSVSAnalysisInspectionReview__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAnalysisInspectionReview__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getAnalysisInspectionReviewKeyword_1()); }
	'<AnalysisInspectionReview>'
	{ after(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getAnalysisInspectionReviewKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAnalysisInspectionReview__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAnalysisInspectionReview__Group__2__Impl
	rule__VSVSAnalysisInspectionReview__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAnalysisInspectionReview__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getBodyAssignment_2()); }
	(rule__VSVSAnalysisInspectionReview__BodyAssignment_2)?
	{ after(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getBodyAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAnalysisInspectionReview__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAnalysisInspectionReview__Group__3__Impl
	rule__VSVSAnalysisInspectionReview__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAnalysisInspectionReview__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getSvsInstatiableSubsectionsAssignment_3()); }
	(rule__VSVSAnalysisInspectionReview__SvsInstatiableSubsectionsAssignment_3)*
	{ after(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getSvsInstatiableSubsectionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAnalysisInspectionReview__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAnalysisInspectionReview__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAnalysisInspectionReview__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getAnalysisInspectionReviewKeyword_4()); }
	'</AnalysisInspectionReview>'
	{ after(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getAnalysisInspectionReviewKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTestPlatformRequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestPlatformRequirements__Group__0__Impl
	rule__VSVSTestPlatformRequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestPlatformRequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestPlatformRequirementsAccess().getVSVSTestPlatformRequirementsAction_0()); }
	()
	{ after(grammarAccess.getVSVSTestPlatformRequirementsAccess().getVSVSTestPlatformRequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestPlatformRequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestPlatformRequirements__Group__1__Impl
	rule__VSVSTestPlatformRequirements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestPlatformRequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestPlatformRequirementsAccess().getTestPlatformRequirementsKeyword_1()); }
	'<TestPlatformRequirements>'
	{ after(grammarAccess.getVSVSTestPlatformRequirementsAccess().getTestPlatformRequirementsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestPlatformRequirements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestPlatformRequirements__Group__2__Impl
	rule__VSVSTestPlatformRequirements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestPlatformRequirements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestPlatformRequirementsAccess().getBodyAssignment_2()); }
	(rule__VSVSTestPlatformRequirements__BodyAssignment_2)?
	{ after(grammarAccess.getVSVSTestPlatformRequirementsAccess().getBodyAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestPlatformRequirements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestPlatformRequirements__Group__3__Impl
	rule__VSVSTestPlatformRequirements__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestPlatformRequirements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestPlatformRequirementsAccess().getSvsInstatiableSubsectionsAssignment_3()); }
	(rule__VSVSTestPlatformRequirements__SvsInstatiableSubsectionsAssignment_3)*
	{ after(grammarAccess.getVSVSTestPlatformRequirementsAccess().getSvsInstatiableSubsectionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestPlatformRequirements__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestPlatformRequirements__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestPlatformRequirements__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestPlatformRequirementsAccess().getTestPlatformRequirementsKeyword_4()); }
	'</TestPlatformRequirements>'
	{ after(grammarAccess.getVSVSTestPlatformRequirementsAccess().getTestPlatformRequirementsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSAdditionalInformation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAdditionalInformation__Group__0__Impl
	rule__VSVSAdditionalInformation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAdditionalInformation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAdditionalInformationAccess().getVSVSAdditionalInformationAction_0()); }
	()
	{ after(grammarAccess.getVSVSAdditionalInformationAccess().getVSVSAdditionalInformationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAdditionalInformation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAdditionalInformation__Group__1__Impl
	rule__VSVSAdditionalInformation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAdditionalInformation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAdditionalInformationAccess().getAdditionalInformationKeyword_1()); }
	'<AdditionalInformation>'
	{ after(grammarAccess.getVSVSAdditionalInformationAccess().getAdditionalInformationKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAdditionalInformation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAdditionalInformation__Group__2__Impl
	rule__VSVSAdditionalInformation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAdditionalInformation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAdditionalInformationAccess().getBodyAssignment_2()); }
	(rule__VSVSAdditionalInformation__BodyAssignment_2)?
	{ after(grammarAccess.getVSVSAdditionalInformationAccess().getBodyAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAdditionalInformation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAdditionalInformation__Group__3__Impl
	rule__VSVSAdditionalInformation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAdditionalInformation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAdditionalInformationAccess().getSvsInstatiableSubsectionsAssignment_3()); }
	(rule__VSVSAdditionalInformation__SvsInstatiableSubsectionsAssignment_3)*
	{ after(grammarAccess.getVSVSAdditionalInformationAccess().getSvsInstatiableSubsectionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAdditionalInformation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAdditionalInformation__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAdditionalInformation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAdditionalInformationAccess().getAdditionalInformationKeyword_4()); }
	'</AdditionalInformation>'
	{ after(grammarAccess.getVSVSAdditionalInformationAccess().getAdditionalInformationKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTerm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTerm__Group__0__Impl
	rule__VSVSTerm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermAccess().getTermKeyword_0()); }
	'<Term'
	{ after(grammarAccess.getVSVSTermAccess().getTermKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTerm__Group__1__Impl
	rule__VSVSTerm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSTermAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTerm__Group__2__Impl
	rule__VSVSTerm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermAccess().getNameAssignment_2()); }
	(rule__VSVSTerm__NameAssignment_2)
	{ after(grammarAccess.getVSVSTermAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTerm__Group__3__Impl
	rule__VSVSTerm__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVSTermAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTerm__Group__4__Impl
	rule__VSVSTerm__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermAccess().getDescriptionAssignment_4()); }
	(rule__VSVSTerm__DescriptionAssignment_4)
	{ after(grammarAccess.getVSVSTermAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTerm__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTermAccess().getTermKeyword_5()); }
	'</Term>'
	{ after(grammarAccess.getVSVSTermAccess().getTermKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDefinition__Group__0__Impl
	rule__VSVSDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDefinitionAccess().getDefinitionKeyword_0()); }
	'<Definition'
	{ after(grammarAccess.getVSVSDefinitionAccess().getDefinitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDefinition__Group__1__Impl
	rule__VSVSDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDefinitionAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSDefinitionAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDefinition__Group__2__Impl
	rule__VSVSDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDefinitionAccess().getNameAssignment_2()); }
	(rule__VSVSDefinition__NameAssignment_2)
	{ after(grammarAccess.getVSVSDefinitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDefinition__Group__3__Impl
	rule__VSVSDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDefinitionAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVSDefinitionAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDefinition__Group__4__Impl
	rule__VSVSDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDefinitionAccess().getDescriptionAssignment_4()); }
	(rule__VSVSDefinition__DescriptionAssignment_4)
	{ after(grammarAccess.getVSVSDefinitionAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSDefinitionAccess().getDefinitionKeyword_5()); }
	'</Definition>'
	{ after(grammarAccess.getVSVSDefinitionAccess().getDefinitionKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSAbbreviation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAbbreviation__Group__0__Impl
	rule__VSVSAbbreviation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAbbreviationAccess().getAbbreviationKeyword_0()); }
	'<Abbreviation'
	{ after(grammarAccess.getVSVSAbbreviationAccess().getAbbreviationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAbbreviation__Group__1__Impl
	rule__VSVSAbbreviation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAbbreviationAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSAbbreviationAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAbbreviation__Group__2__Impl
	rule__VSVSAbbreviation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAbbreviationAccess().getNameAssignment_2()); }
	(rule__VSVSAbbreviation__NameAssignment_2)
	{ after(grammarAccess.getVSVSAbbreviationAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAbbreviation__Group__3__Impl
	rule__VSVSAbbreviation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAbbreviationAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVSAbbreviationAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAbbreviation__Group__4__Impl
	rule__VSVSAbbreviation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAbbreviationAccess().getDescriptionAssignment_4()); }
	(rule__VSVSAbbreviation__DescriptionAssignment_4)
	{ after(grammarAccess.getVSVSAbbreviationAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSAbbreviation__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSAbbreviationAccess().getAbbreviationKeyword_5()); }
	'</Abbreviation>'
	{ after(grammarAccess.getVSVSAbbreviationAccess().getAbbreviationKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTestDesign__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__0__Impl
	rule__VSVSTestDesign__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getTestDesignKeyword_0()); }
	'<TestDesign'
	{ after(grammarAccess.getVSVSTestDesignAccess().getTestDesignKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__1__Impl
	rule__VSVSTestDesign__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSTestDesignAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__2__Impl
	rule__VSVSTestDesign__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getNameAssignment_2()); }
	(rule__VSVSTestDesign__NameAssignment_2)
	{ after(grammarAccess.getVSVSTestDesignAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__3__Impl
	rule__VSVSTestDesign__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVSTestDesignAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__4__Impl
	rule__VSVSTestDesign__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getGeneralKeyword_4()); }
	'<General>'
	{ after(grammarAccess.getVSVSTestDesignAccess().getGeneralKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__5__Impl
	rule__VSVSTestDesign__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getGeneralAssignment_5()); }
	(rule__VSVSTestDesign__GeneralAssignment_5)
	{ after(grammarAccess.getVSVSTestDesignAccess().getGeneralAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__6__Impl
	rule__VSVSTestDesign__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getGeneralKeyword_6()); }
	'</General>'
	{ after(grammarAccess.getVSVSTestDesignAccess().getGeneralKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__7__Impl
	rule__VSVSTestDesign__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedKeyword_7()); }
	'<FeaturesToBeTested>'
	{ after(grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__8__Impl
	rule__VSVSTestDesign__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedAssignment_8()); }
	(rule__VSVSTestDesign__FeaturesToBeTestedAssignment_8)
	{ after(grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__9__Impl
	rule__VSVSTestDesign__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedKeyword_9()); }
	'</FeaturesToBeTested>'
	{ after(grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__10__Impl
	rule__VSVSTestDesign__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsKeyword_10()); }
	'<ApproachRefinements>'
	{ after(grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__11__Impl
	rule__VSVSTestDesign__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsAssignment_11()); }
	(rule__VSVSTestDesign__ApproachRefinementsAssignment_11)
	{ after(grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__12__Impl
	rule__VSVSTestDesign__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsKeyword_12()); }
	'</ApproachRefinements>'
	{ after(grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestDesign__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestDesignAccess().getTestDesignKeyword_13()); }
	'</TestDesign>'
	{ after(grammarAccess.getVSVSTestDesignAccess().getTestDesignKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTestCase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__0__Impl
	rule__VSVSTestCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getTestCaseKeyword_0()); }
	'<TestCase'
	{ after(grammarAccess.getVSVSTestCaseAccess().getTestCaseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__1__Impl
	rule__VSVSTestCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSTestCaseAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__2__Impl
	rule__VSVSTestCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getNameAssignment_2()); }
	(rule__VSVSTestCase__NameAssignment_2)
	{ after(grammarAccess.getVSVSTestCaseAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__3__Impl
	rule__VSVSTestCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__4__Impl
	rule__VSVSTestCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getIdentifierKeyword_4()); }
	'<Identifier>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getIdentifierKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__5__Impl
	rule__VSVSTestCase__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getIdentifierAssignment_5()); }
	(rule__VSVSTestCase__IdentifierAssignment_5)
	{ after(grammarAccess.getVSVSTestCaseAccess().getIdentifierAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__6__Impl
	rule__VSVSTestCase__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getIdentifierKeyword_6()); }
	'</Identifier>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getIdentifierKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__7__Impl
	rule__VSVSTestCase__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getInputsKeyword_7()); }
	'<Inputs>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getInputsKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__8__Impl
	rule__VSVSTestCase__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getInputsAssignment_8()); }
	(rule__VSVSTestCase__InputsAssignment_8)
	{ after(grammarAccess.getVSVSTestCaseAccess().getInputsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__9__Impl
	rule__VSVSTestCase__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getInputsKeyword_9()); }
	'</Inputs>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getInputsKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__10__Impl
	rule__VSVSTestCase__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getOutputsKeyword_10()); }
	'<Outputs>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getOutputsKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__11__Impl
	rule__VSVSTestCase__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getOutputsAssignment_11()); }
	(rule__VSVSTestCase__OutputsAssignment_11)
	{ after(grammarAccess.getVSVSTestCaseAccess().getOutputsAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__12__Impl
	rule__VSVSTestCase__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getOutputsKeyword_12()); }
	'</Outputs>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getOutputsKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__13__Impl
	rule__VSVSTestCase__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaKeyword_13()); }
	'<PassFailCriteria>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__14__Impl
	rule__VSVSTestCase__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaAssignment_14()); }
	(rule__VSVSTestCase__PassFailCriteriaAssignment_14)
	{ after(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__15__Impl
	rule__VSVSTestCase__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaKeyword_15()); }
	'</PassFailCriteria>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__16__Impl
	rule__VSVSTestCase__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsKeyword_16()); }
	'<EnvironmentalNeeds>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__17__Impl
	rule__VSVSTestCase__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsAssignment_17()); }
	(rule__VSVSTestCase__EnvironmentalNeedsAssignment_17)
	{ after(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__18__Impl
	rule__VSVSTestCase__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsKeyword_18()); }
	'</EnvironmentalNeeds>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__19__Impl
	rule__VSVSTestCase__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsKeyword_19()); }
	'<SpecialConstraints>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__20__Impl
	rule__VSVSTestCase__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsAssignment_20()); }
	(rule__VSVSTestCase__SpecialConstraintsAssignment_20)
	{ after(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__21__Impl
	rule__VSVSTestCase__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsKeyword_21()); }
	'</SpecialConstraints>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__22__Impl
	rule__VSVSTestCase__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesKeyword_22()); }
	'<InterfaceDependencies>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__23__Impl
	rule__VSVSTestCase__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesAssignment_23()); }
	(rule__VSVSTestCase__InterfaceDependenciesAssignment_23)
	{ after(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesAssignment_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__24__Impl
	rule__VSVSTestCase__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesKeyword_24()); }
	'</InterfaceDependencies>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__25__Impl
	rule__VSVSTestCase__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getGroup_25()); }
		(rule__VSVSTestCase__Group_25__0)
		{ after(grammarAccess.getVSVSTestCaseAccess().getGroup_25()); }
	)
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getGroup_25()); }
		(rule__VSVSTestCase__Group_25__0)*
		{ after(grammarAccess.getVSVSTestCaseAccess().getGroup_25()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group__26__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getTestCaseKeyword_26()); }
	'</TestCase>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getTestCaseKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTestCase__Group_25__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group_25__0__Impl
	rule__VSVSTestCase__Group_25__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group_25__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getValidatingItemKeyword_25_0()); }
	'<ValidatingItem'
	{ after(grammarAccess.getVSVSTestCaseAccess().getValidatingItemKeyword_25_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group_25__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group_25__1__Impl
	rule__VSVSTestCase__Group_25__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group_25__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getNameKeyword_25_1()); }
	'name='
	{ after(grammarAccess.getVSVSTestCaseAccess().getNameKeyword_25_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group_25__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group_25__2__Impl
	rule__VSVSTestCase__Group_25__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group_25__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getValidatingItemAssignment_25_2()); }
	(rule__VSVSTestCase__ValidatingItemAssignment_25_2)
	{ after(grammarAccess.getVSVSTestCaseAccess().getValidatingItemAssignment_25_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group_25__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestCase__Group_25__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__Group_25__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestCaseAccess().getSolidusGreaterThanSignKeyword_25_3()); }
	'/>'
	{ after(grammarAccess.getVSVSTestCaseAccess().getSolidusGreaterThanSignKeyword_25_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTestProcedure__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__0__Impl
	rule__VSVSTestProcedure__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getTestProcedureKeyword_0()); }
	'<TestProcedure'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getTestProcedureKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__1__Impl
	rule__VSVSTestProcedure__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSTestProcedureAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__2__Impl
	rule__VSVSTestProcedure__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getNameAssignment_2()); }
	(rule__VSVSTestProcedure__NameAssignment_2)
	{ after(grammarAccess.getVSVSTestProcedureAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__3__Impl
	rule__VSVSTestProcedure__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__4__Impl
	rule__VSVSTestProcedure__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getIdentifierKeyword_4()); }
	'<Identifier>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getIdentifierKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__5__Impl
	rule__VSVSTestProcedure__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getIdentifierAssignment_5()); }
	(rule__VSVSTestProcedure__IdentifierAssignment_5)
	{ after(grammarAccess.getVSVSTestProcedureAccess().getIdentifierAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__6__Impl
	rule__VSVSTestProcedure__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getIdentifierKeyword_6()); }
	'</Identifier>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getIdentifierKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__7__Impl
	rule__VSVSTestProcedure__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getPurposeKeyword_7()); }
	'<Purpose>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getPurposeKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__8__Impl
	rule__VSVSTestProcedure__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getPurposeAssignment_8()); }
	(rule__VSVSTestProcedure__PurposeAssignment_8)
	{ after(grammarAccess.getVSVSTestProcedureAccess().getPurposeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__9__Impl
	rule__VSVSTestProcedure__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getPurposeKeyword_9()); }
	'</Purpose>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getPurposeKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__10__Impl
	rule__VSVSTestProcedure__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getScenarioKeyword_10()); }
	'<Scenario'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getScenarioKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__11__Impl
	rule__VSVSTestProcedure__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getRefKeyword_11()); }
	'ref='
	{ after(grammarAccess.getVSVSTestProcedureAccess().getRefKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__12__Impl
	rule__VSVSTestProcedure__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getScenarioAssignment_12()); }
	(rule__VSVSTestProcedure__ScenarioAssignment_12)
	{ after(grammarAccess.getVSVSTestProcedureAccess().getScenarioAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__13__Impl
	rule__VSVSTestProcedure__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getSolidusGreaterThanSignKeyword_13()); }
	'/>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getSolidusGreaterThanSignKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__14__Impl
	rule__VSVSTestProcedure__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getGroup_14()); }
		(rule__VSVSTestProcedure__Group_14__0)
		{ after(grammarAccess.getVSVSTestProcedureAccess().getGroup_14()); }
	)
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getGroup_14()); }
		(rule__VSVSTestProcedure__Group_14__0)*
		{ after(grammarAccess.getVSVSTestProcedureAccess().getGroup_14()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__15__Impl
	rule__VSVSTestProcedure__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getProcedureStepsAssignment_15()); }
	(rule__VSVSTestProcedure__ProcedureStepsAssignment_15)
	{ after(grammarAccess.getVSVSTestProcedureAccess().getProcedureStepsAssignment_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__16__Impl
	rule__VSVSTestProcedure__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_16()); }
	'<TestScript>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__17__Impl
	rule__VSVSTestProcedure__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getTestScriptAssignment_17()); }
	(rule__VSVSTestProcedure__TestScriptAssignment_17)
	{ after(grammarAccess.getVSVSTestProcedureAccess().getTestScriptAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__18__Impl
	rule__VSVSTestProcedure__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_18()); }
	'</TestScript>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group__19__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getTestProcedureKeyword_19()); }
	'</TestProcedure>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getTestProcedureKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSTestProcedure__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group_14__0__Impl
	rule__VSVSTestProcedure__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getTestCaseKeyword_14_0()); }
	'<TestCase'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getTestCaseKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group_14__1__Impl
	rule__VSVSTestProcedure__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getRefKeyword_14_1()); }
	'ref='
	{ after(grammarAccess.getVSVSTestProcedureAccess().getRefKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group_14__2__Impl
	rule__VSVSTestProcedure__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getTestCaseAssignment_14_2()); }
	(rule__VSVSTestProcedure__TestCaseAssignment_14_2)
	{ after(grammarAccess.getVSVSTestProcedureAccess().getTestCaseAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSTestProcedure__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSTestProcedureAccess().getSolidusGreaterThanSignKeyword_14_3()); }
	'/>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getSolidusGreaterThanSignKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSProcedureSteps__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureSteps__Group__0__Impl
	rule__VSVSProcedureSteps__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureSteps__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepsAccess().getProcedureStepsKeyword_0()); }
	'<ProcedureSteps'
	{ after(grammarAccess.getVSVSProcedureStepsAccess().getProcedureStepsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureSteps__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureSteps__Group__1__Impl
	rule__VSVSProcedureSteps__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureSteps__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepsAccess().getGreaterThanSignKeyword_1()); }
	'>'
	{ after(grammarAccess.getVSVSProcedureStepsAccess().getGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureSteps__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureSteps__Group__2__Impl
	rule__VSVSProcedureSteps__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureSteps__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSProcedureStepsAccess().getStepAssignment_2()); }
		(rule__VSVSProcedureSteps__StepAssignment_2)
		{ after(grammarAccess.getVSVSProcedureStepsAccess().getStepAssignment_2()); }
	)
	(
		{ before(grammarAccess.getVSVSProcedureStepsAccess().getStepAssignment_2()); }
		(rule__VSVSProcedureSteps__StepAssignment_2)*
		{ after(grammarAccess.getVSVSProcedureStepsAccess().getStepAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureSteps__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureSteps__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureSteps__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepsAccess().getProcedureStepsKeyword_3()); }
	'</ProcedureSteps>'
	{ after(grammarAccess.getVSVSProcedureStepsAccess().getProcedureStepsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSProcedureStep__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group__0__Impl
	rule__VSVSProcedureStep__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getStepKeyword_0()); }
	'<Step'
	{ after(grammarAccess.getVSVSProcedureStepAccess().getStepKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group__1__Impl
	rule__VSVSProcedureStep__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSProcedureStepAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group__2__Impl
	rule__VSVSProcedureStep__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getNameAssignment_2()); }
	(rule__VSVSProcedureStep__NameAssignment_2)
	{ after(grammarAccess.getVSVSProcedureStepAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group__3__Impl
	rule__VSVSProcedureStep__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getGroup_3()); }
	(rule__VSVSProcedureStep__Group_3__0)?
	{ after(grammarAccess.getVSVSProcedureStepAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group__4__Impl
	rule__VSVSProcedureStep__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getGroup_4()); }
	(rule__VSVSProcedureStep__Group_4__0)?
	{ after(grammarAccess.getVSVSProcedureStepAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group__5__Impl
	rule__VSVSProcedureStep__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getGreaterThanSignKeyword_5()); }
	'>'
	{ after(grammarAccess.getVSVSProcedureStepAccess().getGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group__6__Impl
	rule__VSVSProcedureStep__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getInputsAssignment_6()); }
	(rule__VSVSProcedureStep__InputsAssignment_6)
	{ after(grammarAccess.getVSVSProcedureStepAccess().getInputsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group__7__Impl
	rule__VSVSProcedureStep__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getOutputsAssignment_7()); }
	(rule__VSVSProcedureStep__OutputsAssignment_7)?
	{ after(grammarAccess.getVSVSProcedureStepAccess().getOutputsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getStepKeyword_8()); }
	'</Step>'
	{ after(grammarAccess.getVSVSProcedureStepAccess().getStepKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSProcedureStep__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group_3__0__Impl
	rule__VSVSProcedureStep__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getPrev_step_idrefKeyword_3_0()); }
	'prev_step_idref='
	{ after(grammarAccess.getVSVSProcedureStepAccess().getPrev_step_idrefKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group_3__1__Impl
	rule__VSVSProcedureStep__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getPrev_step_idrefAssignment_3_1()); }
	(rule__VSVSProcedureStep__Prev_step_idrefAssignment_3_1)
	{ after(grammarAccess.getVSVSProcedureStepAccess().getPrev_step_idrefAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group_3__2__Impl
	rule__VSVSProcedureStep__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getOutput_idref_from_prev_stepKeyword_3_2()); }
	'output_idref_from_prev_step='
	{ after(grammarAccess.getVSVSProcedureStepAccess().getOutput_idref_from_prev_stepKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getOutput_idref_from_prev_stepAssignment_3_3()); }
	(rule__VSVSProcedureStep__Output_idref_from_prev_stepAssignment_3_3)
	{ after(grammarAccess.getVSVSProcedureStepAccess().getOutput_idref_from_prev_stepAssignment_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSProcedureStep__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group_4__0__Impl
	rule__VSVSProcedureStep__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getReplaysKeyword_4_0()); }
	'replays='
	{ after(grammarAccess.getVSVSProcedureStepAccess().getReplaysKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSProcedureStep__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSProcedureStepAccess().getReplaysAssignment_4_1()); }
	(rule__VSVSProcedureStep__ReplaysAssignment_4_1)
	{ after(grammarAccess.getVSVSProcedureStepAccess().getReplaysAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSStepInputs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInputs__Group__0__Impl
	rule__VSVSStepInputs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInputs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputsAccess().getVSVSStepInputsAction_0()); }
	()
	{ after(grammarAccess.getVSVSStepInputsAccess().getVSVSStepInputsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInputs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInputs__Group__1__Impl
	rule__VSVSStepInputs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInputs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputsAccess().getInputsKeyword_1()); }
	'<Inputs>'
	{ after(grammarAccess.getVSVSStepInputsAccess().getInputsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInputs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInputs__Group__2__Impl
	rule__VSVSStepInputs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInputs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSStepInputsAccess().getInputAssignment_2()); }
		(rule__VSVSStepInputs__InputAssignment_2)
		{ after(grammarAccess.getVSVSStepInputsAccess().getInputAssignment_2()); }
	)
	(
		{ before(grammarAccess.getVSVSStepInputsAccess().getInputAssignment_2()); }
		(rule__VSVSStepInputs__InputAssignment_2)*
		{ after(grammarAccess.getVSVSStepInputsAccess().getInputAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInputs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInputs__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInputs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputsAccess().getInputsKeyword_3()); }
	'</Inputs>'
	{ after(grammarAccess.getVSVSStepInputsAccess().getInputsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSStepInput__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInput__Group__0__Impl
	rule__VSVSStepInput__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputAccess().getInputKeyword_0()); }
	'<Input'
	{ after(grammarAccess.getVSVSStepInputAccess().getInputKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInput__Group__1__Impl
	rule__VSVSStepInput__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSStepInputAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInput__Group__2__Impl
	rule__VSVSStepInput__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputAccess().getNameAssignment_2()); }
	(rule__VSVSStepInput__NameAssignment_2)
	{ after(grammarAccess.getVSVSStepInputAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInput__Group__3__Impl
	rule__VSVSStepInput__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputAccess().getInterfaceKeyword_3()); }
	'interface='
	{ after(grammarAccess.getVSVSStepInputAccess().getInterfaceKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInput__Group__4__Impl
	rule__VSVSStepInput__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputAccess().getInterfaceAssignment_4()); }
	(rule__VSVSStepInput__InterfaceAssignment_4)
	{ after(grammarAccess.getVSVSStepInputAccess().getInterfaceAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInput__Group__5__Impl
	rule__VSVSStepInput__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputAccess().getDelay_valueKeyword_5()); }
	'delay_value='
	{ after(grammarAccess.getVSVSStepInputAccess().getDelay_valueKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInput__Group__6__Impl
	rule__VSVSStepInput__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputAccess().getDelay_valueAssignment_6()); }
	(rule__VSVSStepInput__Delay_valueAssignment_6)
	{ after(grammarAccess.getVSVSStepInputAccess().getDelay_valueAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInput__Group__7__Impl
	rule__VSVSStepInput__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputAccess().getDelay_unitKeyword_7()); }
	'delay_unit='
	{ after(grammarAccess.getVSVSStepInputAccess().getDelay_unitKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInput__Group__8__Impl
	rule__VSVSStepInput__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputAccess().getDelay_unitAssignment_8()); }
	(rule__VSVSStepInput__Delay_unitAssignment_8)
	{ after(grammarAccess.getVSVSStepInputAccess().getDelay_unitAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepInput__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepInputAccess().getSolidusGreaterThanSignKeyword_9()); }
	'/>'
	{ after(grammarAccess.getVSVSStepInputAccess().getSolidusGreaterThanSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSStepOutputs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutputs__Group__0__Impl
	rule__VSVSStepOutputs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputsAccess().getOutputsKeyword_0()); }
	'<Outputs'
	{ after(grammarAccess.getVSVSStepOutputsAccess().getOutputsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutputs__Group__1__Impl
	rule__VSVSStepOutputs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputsAccess().getCheckmodeKeyword_1()); }
	'checkmode='
	{ after(grammarAccess.getVSVSStepOutputsAccess().getCheckmodeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutputs__Group__2__Impl
	rule__VSVSStepOutputs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputsAccess().getCheckmodeAssignment_2()); }
	(rule__VSVSStepOutputs__CheckmodeAssignment_2)
	{ after(grammarAccess.getVSVSStepOutputsAccess().getCheckmodeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutputs__Group__3__Impl
	rule__VSVSStepOutputs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_valueKeyword_3()); }
	'valid_time_interval_value='
	{ after(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_valueKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutputs__Group__4__Impl
	rule__VSVSStepOutputs__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_valueAssignment_4()); }
	(rule__VSVSStepOutputs__Valid_time_interval_valueAssignment_4)
	{ after(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_valueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutputs__Group__5__Impl
	rule__VSVSStepOutputs__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_unitKeyword_5()); }
	'valid_time_interval_unit='
	{ after(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_unitKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutputs__Group__6__Impl
	rule__VSVSStepOutputs__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_unitAssignment_6()); }
	(rule__VSVSStepOutputs__Valid_time_interval_unitAssignment_6)
	{ after(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_unitAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutputs__Group__7__Impl
	rule__VSVSStepOutputs__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputsAccess().getGreaterThanSignKeyword_7()); }
	'>'
	{ after(grammarAccess.getVSVSStepOutputsAccess().getGreaterThanSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutputs__Group__8__Impl
	rule__VSVSStepOutputs__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVSVSStepOutputsAccess().getOutputAssignment_8()); }
		(rule__VSVSStepOutputs__OutputAssignment_8)
		{ after(grammarAccess.getVSVSStepOutputsAccess().getOutputAssignment_8()); }
	)
	(
		{ before(grammarAccess.getVSVSStepOutputsAccess().getOutputAssignment_8()); }
		(rule__VSVSStepOutputs__OutputAssignment_8)*
		{ after(grammarAccess.getVSVSStepOutputsAccess().getOutputAssignment_8()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutputs__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputsAccess().getOutputsKeyword_9()); }
	'</Outputs>'
	{ after(grammarAccess.getVSVSStepOutputsAccess().getOutputsKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VSVSStepOutput__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutput__Group__0__Impl
	rule__VSVSStepOutput__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputAccess().getOutputKeyword_0()); }
	'<Output'
	{ after(grammarAccess.getVSVSStepOutputAccess().getOutputKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutput__Group__1__Impl
	rule__VSVSStepOutput__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVSVSStepOutputAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutput__Group__2__Impl
	rule__VSVSStepOutput__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputAccess().getNameAssignment_2()); }
	(rule__VSVSStepOutput__NameAssignment_2)
	{ after(grammarAccess.getVSVSStepOutputAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutput__Group__3__Impl
	rule__VSVSStepOutput__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputAccess().getInterfaceKeyword_3()); }
	'interface='
	{ after(grammarAccess.getVSVSStepOutputAccess().getInterfaceKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutput__Group__4__Impl
	rule__VSVSStepOutput__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputAccess().getInterfaceAssignment_4()); }
	(rule__VSVSStepOutput__InterfaceAssignment_4)
	{ after(grammarAccess.getVSVSStepOutputAccess().getInterfaceAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VSVSStepOutput__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVSVSStepOutputAccess().getSolidusGreaterThanSignKeyword_5()); }
	'/>'
	{ after(grammarAccess.getVSVSStepOutputAccess().getSolidusGreaterThanSignKeyword_5()); }
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


rule__VSVSDocument__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSDocumentAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getIdSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSDocumentAccess().getIdSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__IssueAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVSVSDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__RevisionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVSVSDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__DateAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getDateSTRINGTerminalRuleCall_10_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSDocumentAccess().getDateSTRINGTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__ParentsAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getParentsVTraceableDocumentCrossReference_12_2_0()); }
		(
			{ before(grammarAccess.getVSVSDocumentAccess().getParentsVTraceableDocumentSTRINGTerminalRuleCall_12_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVSDocumentAccess().getParentsVTraceableDocumentSTRINGTerminalRuleCall_12_2_0_1()); }
		)
		{ after(grammarAccess.getVSVSDocumentAccess().getParentsVTraceableDocumentCrossReference_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__IntroductionSectionAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getIntroductionSectionVSVSIntroductionParserRuleCall_13_0()); }
		ruleVSVSIntroduction
		{ after(grammarAccess.getVSVSDocumentAccess().getIntroductionSectionVSVSIntroductionParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__ApplicableDocumentsSectionAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getApplicableDocumentsSectionVSVSApplicableDocumentsParserRuleCall_14_0()); }
		ruleVSVSApplicableDocuments
		{ after(grammarAccess.getVSVSDocumentAccess().getApplicableDocumentsSectionVSVSApplicableDocumentsParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__ReferenceDocumentsSectionAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getReferenceDocumentsSectionVSVSReferenceDocumentsParserRuleCall_15_0()); }
		ruleVSVSReferenceDocuments
		{ after(grammarAccess.getVSVSDocumentAccess().getReferenceDocumentsSectionVSVSReferenceDocumentsParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__TermsDefinitionsAbbreviationsSectionAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSVSTermsDefinitionsAbbreviationsParserRuleCall_16_0()); }
		ruleVSVSTermsDefinitionsAbbreviations
		{ after(grammarAccess.getVSVSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSVSTermsDefinitionsAbbreviationsParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__SoftwareOverviewSectionAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getSoftwareOverviewSectionVSVSSoftwareOverviewParserRuleCall_17_0()); }
		ruleVSVSSoftwareOverview
		{ after(grammarAccess.getVSVSDocumentAccess().getSoftwareOverviewSectionVSVSSoftwareOverviewParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__TaskIdentificationSectionAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getTaskIdentificationSectionVSVSTaskIdentificationParserRuleCall_18_0()); }
		ruleVSVSTaskIdentification
		{ after(grammarAccess.getVSVSDocumentAccess().getTaskIdentificationSectionVSVSTaskIdentificationParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__TestingSpecificationDesignSectionAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getTestingSpecificationDesignSectionVSVSTestingSpecificationDesignParserRuleCall_19_0()); }
		ruleVSVSTestingSpecificationDesign
		{ after(grammarAccess.getVSVSDocumentAccess().getTestingSpecificationDesignSectionVSVSTestingSpecificationDesignParserRuleCall_19_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__TestCasesSectionAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getTestCasesSectionVSVSTestCasesParserRuleCall_20_0()); }
		ruleVSVSTestCases
		{ after(grammarAccess.getVSVSDocumentAccess().getTestCasesSectionVSVSTestCasesParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__TestProceduresSectionAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getTestProceduresSectionVSVSTestProceduresParserRuleCall_21_0()); }
		ruleVSVSTestProcedures
		{ after(grammarAccess.getVSVSDocumentAccess().getTestProceduresSectionVSVSTestProceduresParserRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__AnalysisInspectionReviewSectionAssignment_22
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getAnalysisInspectionReviewSectionVSVSAnalysisInspectionReviewParserRuleCall_22_0()); }
		ruleVSVSAnalysisInspectionReview
		{ after(grammarAccess.getVSVSDocumentAccess().getAnalysisInspectionReviewSectionVSVSAnalysisInspectionReviewParserRuleCall_22_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__TestPlatformRequirementsSectionAssignment_23
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getTestPlatformRequirementsSectionVSVSTestPlatformRequirementsParserRuleCall_23_0()); }
		ruleVSVSTestPlatformRequirements
		{ after(grammarAccess.getVSVSDocumentAccess().getTestPlatformRequirementsSectionVSVSTestPlatformRequirementsParserRuleCall_23_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDocument__AdditionalInformationSectionAssignment_24
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDocumentAccess().getAdditionalInformationSectionVSVSAdditionalInformationParserRuleCall_24_0()); }
		ruleVSVSAdditionalInformation
		{ after(grammarAccess.getVSVSDocumentAccess().getAdditionalInformationSectionVSVSAdditionalInformationParserRuleCall_24_0()); }
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

rule__VSVSTestInfo__BodyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestInfoAccess().getBodyDBodyParserRuleCall_1_0()); }
		ruleDBody
		{ after(grammarAccess.getVSVSTestInfoAccess().getBodyDBodyParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSFixedSection__BodyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSFixedSectionAccess().getBodyDBodyParserRuleCall_1_0()); }
		ruleDBody
		{ after(grammarAccess.getVSVSFixedSectionAccess().getBodyDBodyParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSFixedSection__SvsInstatiableSubsectionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSFixedSectionAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_2_0()); }
		ruleVSVSInstantiableSection
		{ after(grammarAccess.getVSVSFixedSectionAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSInstantiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSInstantiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__BodyAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSInstantiableSectionAccess().getBodyDBodyParserRuleCall_4_0()); }
		ruleDBody
		{ after(grammarAccess.getVSVSInstantiableSectionAccess().getBodyDBodyParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInstantiableSection__SvsInstatiableSubsectionsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSInstantiableSectionAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_5_0()); }
		ruleVSVSInstantiableSection
		{ after(grammarAccess.getVSVSInstantiableSectionAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSIntroduction__SvsInstatiableSubsectionsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSIntroductionAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_1_0()); }
		ruleVSVSInstantiableSection
		{ after(grammarAccess.getVSVSIntroductionAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSApplicableDocuments__ApplicableDocumentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0()); }
		ruleDApplicableDocument
		{ after(grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSReferenceDocuments__ReferenceDocumentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0()); }
		ruleDReferenceDocument
		{ after(grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__TermsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsVSVSTermParserRuleCall_2_0()); }
		ruleVSVSTerm
		{ after(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsVSVSTermParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__DefinitionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSVSDefinitionParserRuleCall_3_0()); }
		ruleVSVSDefinition
		{ after(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSVSDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTermsDefinitionsAbbreviations__AbbreviationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSVSAbbreviationParserRuleCall_4_0()); }
		ruleVSVSAbbreviation
		{ after(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSVSAbbreviationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSSoftwareOverview__BodyAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSSoftwareOverviewAccess().getBodyDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSVSSoftwareOverviewAccess().getBodyDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSSoftwareOverview__SvsInstatiableSubsectionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSSoftwareOverviewAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0()); }
		ruleVSVSInstantiableSection
		{ after(grammarAccess.getVSVSSoftwareOverviewAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__TaskCriteriaAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaVSVSFixedSectionParserRuleCall_2_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaVSVSFixedSectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__FeaturesToBeTestedAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedVSVSFixedSectionParserRuleCall_5_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedVSVSFixedSectionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__FeaturesNotToBeTestedAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedVSVSFixedSectionParserRuleCall_8_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedVSVSFixedSectionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__TestPassFailCriteriaAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaVSVSFixedSectionParserRuleCall_11_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaVSVSFixedSectionParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__ItemsCanNotBeValidatedAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedVSVSFixedSectionParserRuleCall_14_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedVSVSFixedSectionParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTaskIdentification__ManuallyAutoGeneratedCodeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeVSVSFixedSectionParserRuleCall_17_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeVSVSFixedSectionParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__GeneralAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralVSVSFixedSectionParserRuleCall_2_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralVSVSFixedSectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__InterfacesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getInterfacesVSVSInterfacesSectionParserRuleCall_5_0()); }
		ruleVSVSInterfacesSection
		{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getInterfacesVSVSInterfacesSectionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__ScenariosAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosVSVSScenariosSectionParserRuleCall_8_0()); }
		ruleVSVSScenariosSection
		{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosVSVSScenariosSectionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestingSpecificationDesign__TestDesignsAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsVSVSTestDesignParserRuleCall_10_0()); }
		ruleVSVSTestDesign
		{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsVSVSTestDesignParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterfacesSection__InterfacesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSInterfacesSectionAccess().getInterfacesVSVSInterfaceParserRuleCall_1_0()); }
		ruleVSVSInterface
		{ after(grammarAccess.getVSVSInterfacesSectionAccess().getInterfacesVSVSInterfaceParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSInterface__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSInterfaceAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSVSInterfaceAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenariosSection__ScenariosAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSScenariosSectionAccess().getScenariosVSVSScenarioSectionParserRuleCall_1_0()); }
		ruleVSVSScenarioSection
		{ after(grammarAccess.getVSVSScenariosSectionAccess().getScenariosVSVSScenarioSectionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSScenarioSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSScenarioSectionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__InterfaceAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSScenarioSectionAccess().getInterfaceVSVSInterfaceCrossReference_4_2_0()); }
		(
			{ before(grammarAccess.getVSVSScenarioSectionAccess().getInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVSScenarioSectionAccess().getInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_2_0_1()); }
		)
		{ after(grammarAccess.getVSVSScenarioSectionAccess().getInterfaceVSVSInterfaceCrossReference_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSScenarioSection__BodyAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSScenarioSectionAccess().getBodyDBodyParserRuleCall_5_0()); }
		ruleDBody
		{ after(grammarAccess.getVSVSScenarioSectionAccess().getBodyDBodyParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__GeneralAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCasesAccess().getGeneralVSVSFixedSectionParserRuleCall_2_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestCasesAccess().getGeneralVSVSFixedSectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCases__TestCasesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCasesAccess().getTestCasesVSVSTestCaseParserRuleCall_4_0()); }
		ruleVSVSTestCase
		{ after(grammarAccess.getVSVSTestCasesAccess().getTestCasesVSVSTestCaseParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__GeneralAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestProceduresAccess().getGeneralVSVSFixedSectionParserRuleCall_2_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestProceduresAccess().getGeneralVSVSFixedSectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedures__TestProceduresAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresVSVSTestProcedureParserRuleCall_4_0()); }
		ruleVSVSTestProcedure
		{ after(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresVSVSTestProcedureParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAnalysisInspectionReview__BodyAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getBodyDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getBodyDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAnalysisInspectionReview__SvsInstatiableSubsectionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0()); }
		ruleVSVSInstantiableSection
		{ after(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestPlatformRequirements__BodyAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestPlatformRequirementsAccess().getBodyDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSVSTestPlatformRequirementsAccess().getBodyDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestPlatformRequirements__SvsInstatiableSubsectionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestPlatformRequirementsAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0()); }
		ruleVSVSInstantiableSection
		{ after(grammarAccess.getVSVSTestPlatformRequirementsAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAdditionalInformation__BodyAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSAdditionalInformationAccess().getBodyDBodyParserRuleCall_2_0()); }
		ruleDBody
		{ after(grammarAccess.getVSVSAdditionalInformationAccess().getBodyDBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAdditionalInformation__SvsInstatiableSubsectionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSAdditionalInformationAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0()); }
		ruleVSVSInstantiableSection
		{ after(grammarAccess.getVSVSAdditionalInformationAccess().getSvsInstatiableSubsectionsVSVSInstantiableSectionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTermAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSTermAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTerm__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTermAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSVSTermAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSDefinition__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSVSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSAbbreviation__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0()); }
		ruleDRun
		{ after(grammarAccess.getVSVSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestDesignAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSTestDesignAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__GeneralAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestDesignAccess().getGeneralVSVSFixedSectionParserRuleCall_5_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestDesignAccess().getGeneralVSVSFixedSectionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__FeaturesToBeTestedAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedVSVSFixedSectionParserRuleCall_8_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedVSVSFixedSectionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestDesign__ApproachRefinementsAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsVSVSFixedSectionParserRuleCall_11_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsVSVSFixedSectionParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSTestCaseAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__IdentifierAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getIdentifierVSVSTestInfoParserRuleCall_5_0()); }
		ruleVSVSTestInfo
		{ after(grammarAccess.getVSVSTestCaseAccess().getIdentifierVSVSTestInfoParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__InputsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getInputsVSVSTestInfoParserRuleCall_8_0()); }
		ruleVSVSTestInfo
		{ after(grammarAccess.getVSVSTestCaseAccess().getInputsVSVSTestInfoParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__OutputsAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getOutputsVSVSTestInfoParserRuleCall_11_0()); }
		ruleVSVSTestInfo
		{ after(grammarAccess.getVSVSTestCaseAccess().getOutputsVSVSTestInfoParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__PassFailCriteriaAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaVSVSTestInfoParserRuleCall_14_0()); }
		ruleVSVSTestInfo
		{ after(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaVSVSTestInfoParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__EnvironmentalNeedsAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsVSVSTestInfoParserRuleCall_17_0()); }
		ruleVSVSTestInfo
		{ after(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsVSVSTestInfoParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__SpecialConstraintsAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsVSVSTestInfoParserRuleCall_20_0()); }
		ruleVSVSTestInfo
		{ after(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsVSVSTestInfoParserRuleCall_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__InterfaceDependenciesAssignment_23
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesVSVSTestInfoParserRuleCall_23_0()); }
		ruleVSVSTestInfo
		{ after(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesVSVSTestInfoParserRuleCall_23_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__ValidatingItemAssignment_25_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getValidatingItemVTraceableDocumentAbstractItemCrossReference_25_2_0()); }
		(
			{ before(grammarAccess.getVSVSTestCaseAccess().getValidatingItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_25_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVSTestCaseAccess().getValidatingItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_25_2_0_1()); }
		)
		{ after(grammarAccess.getVSVSTestCaseAccess().getValidatingItemVTraceableDocumentAbstractItemCrossReference_25_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSTestProcedureAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__IdentifierAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getIdentifierVSVSTestInfoParserRuleCall_5_0()); }
		ruleVSVSTestInfo
		{ after(grammarAccess.getVSVSTestProcedureAccess().getIdentifierVSVSTestInfoParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__PurposeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getPurposeVSVSTestInfoParserRuleCall_8_0()); }
		ruleVSVSTestInfo
		{ after(grammarAccess.getVSVSTestProcedureAccess().getPurposeVSVSTestInfoParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__ScenarioAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getScenarioVSVSScenarioSectionCrossReference_12_0()); }
		(
			{ before(grammarAccess.getVSVSTestProcedureAccess().getScenarioVSVSScenarioSectionSTRINGTerminalRuleCall_12_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVSTestProcedureAccess().getScenarioVSVSScenarioSectionSTRINGTerminalRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getVSVSTestProcedureAccess().getScenarioVSVSScenarioSectionCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__TestCaseAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getTestCaseVSVSTestCaseCrossReference_14_2_0()); }
		(
			{ before(grammarAccess.getVSVSTestProcedureAccess().getTestCaseVSVSTestCaseSTRINGTerminalRuleCall_14_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVSTestProcedureAccess().getTestCaseVSVSTestCaseSTRINGTerminalRuleCall_14_2_0_1()); }
		)
		{ after(grammarAccess.getVSVSTestProcedureAccess().getTestCaseVSVSTestCaseCrossReference_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__ProcedureStepsAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getProcedureStepsVSVSProcedureStepsParserRuleCall_15_0()); }
		ruleVSVSProcedureSteps
		{ after(grammarAccess.getVSVSTestProcedureAccess().getProcedureStepsVSVSProcedureStepsParserRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__TestScriptAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getTestScriptVSVSTestInfoParserRuleCall_17_0()); }
		ruleVSVSTestInfo
		{ after(grammarAccess.getVSVSTestProcedureAccess().getTestScriptVSVSTestInfoParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureSteps__StepAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSProcedureStepsAccess().getStepVSVSProcedureStepParserRuleCall_2_0()); }
		ruleVSVSProcedureStep
		{ after(grammarAccess.getVSVSProcedureStepsAccess().getStepVSVSProcedureStepParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSProcedureStepAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSProcedureStepAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Prev_step_idrefAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSProcedureStepAccess().getPrev_step_idrefVSVSProcedureStepCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getVSVSProcedureStepAccess().getPrev_step_idrefVSVSProcedureStepSTRINGTerminalRuleCall_3_1_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVSProcedureStepAccess().getPrev_step_idrefVSVSProcedureStepSTRINGTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getVSVSProcedureStepAccess().getPrev_step_idrefVSVSProcedureStepCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__Output_idref_from_prev_stepAssignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSProcedureStepAccess().getOutput_idref_from_prev_stepVSVSStepOutputCrossReference_3_3_0()); }
		(
			{ before(grammarAccess.getVSVSProcedureStepAccess().getOutput_idref_from_prev_stepVSVSStepOutputSTRINGTerminalRuleCall_3_3_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVSProcedureStepAccess().getOutput_idref_from_prev_stepVSVSStepOutputSTRINGTerminalRuleCall_3_3_0_1()); }
		)
		{ after(grammarAccess.getVSVSProcedureStepAccess().getOutput_idref_from_prev_stepVSVSStepOutputCrossReference_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__ReplaysAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSProcedureStepAccess().getReplaysUINT_STRINGTerminalRuleCall_4_1_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVSVSProcedureStepAccess().getReplaysUINT_STRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__InputsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSProcedureStepAccess().getInputsVSVSStepInputsParserRuleCall_6_0()); }
		ruleVSVSStepInputs
		{ after(grammarAccess.getVSVSProcedureStepAccess().getInputsVSVSStepInputsParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSProcedureStep__OutputsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSProcedureStepAccess().getOutputsVSVSStepOutputsParserRuleCall_7_0()); }
		ruleVSVSStepOutputs
		{ after(grammarAccess.getVSVSProcedureStepAccess().getOutputsVSVSStepOutputsParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInputs__InputAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepInputsAccess().getInputVSVSStepInputParserRuleCall_2_0()); }
		ruleVSVSStepInput
		{ after(grammarAccess.getVSVSStepInputsAccess().getInputVSVSStepInputParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepInputAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSStepInputAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__InterfaceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepInputAccess().getInterfaceVSVSInterfaceCrossReference_4_0()); }
		(
			{ before(grammarAccess.getVSVSStepInputAccess().getInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVSStepInputAccess().getInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getVSVSStepInputAccess().getInterfaceVSVSInterfaceCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Delay_valueAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepInputAccess().getDelay_valueUINT_STRINGTerminalRuleCall_6_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVSVSStepInputAccess().getDelay_valueUINT_STRINGTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepInput__Delay_unitAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepInputAccess().getDelay_unitVSVSTimeUnitEnumRuleCall_8_0()); }
		ruleVSVSTimeUnit
		{ after(grammarAccess.getVSVSStepInputAccess().getDelay_unitVSVSTimeUnitEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__CheckmodeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepOutputsAccess().getCheckmodeVSVSStepOutputsCheckmodeEnumRuleCall_2_0()); }
		ruleVSVSStepOutputsCheckmode
		{ after(grammarAccess.getVSVSStepOutputsAccess().getCheckmodeVSVSStepOutputsCheckmodeEnumRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Valid_time_interval_valueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_valueUINT_STRINGTerminalRuleCall_4_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_valueUINT_STRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__Valid_time_interval_unitAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_unitVSVSTimeUnitEnumRuleCall_6_0()); }
		ruleVSVSTimeUnit
		{ after(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_unitVSVSTimeUnitEnumRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutputs__OutputAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepOutputsAccess().getOutputVSVSStepOutputParserRuleCall_8_0()); }
		ruleVSVSStepOutput
		{ after(grammarAccess.getVSVSStepOutputsAccess().getOutputVSVSStepOutputParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepOutputAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSStepOutputAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSStepOutput__InterfaceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSStepOutputAccess().getInterfaceVSVSInterfaceCrossReference_4_0()); }
		(
			{ before(grammarAccess.getVSVSStepOutputAccess().getInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVSStepOutputAccess().getInterfaceVSVSInterfaceSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getVSVSStepOutputAccess().getInterfaceVSVSInterfaceCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

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
