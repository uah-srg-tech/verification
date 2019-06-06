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
	rule__DApplicableDocument__Group_7__3
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
	{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_7_2()); }
	'revision='
	{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DApplicableDocument__Group_7__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_7_3()); }
	(rule__DApplicableDocument__RevisionAssignment_7_3)
	{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_7_3()); }
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
	rule__DReferenceDocument__Group_7__3
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
	{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_7_2()); }
	'revision='
	{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DReferenceDocument__Group_7__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__Group_7__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_7_3()); }
	(rule__DReferenceDocument__RevisionAssignment_7_3)
	{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_7_3()); }
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
	(
		{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsAssignment_4()); }
		(rule__VSVSTestingSpecificationDesign__TestDesignsAssignment_4)
		{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsAssignment_4()); }
	)
	(
		{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsAssignment_4()); }
		(rule__VSVSTestingSpecificationDesign__TestDesignsAssignment_4)*
		{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsAssignment_4()); }
	)
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
	{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestingSpecificationDesignKeyword_5()); }
	'</TestingSpecificationDesign>'
	{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestingSpecificationDesignKeyword_5()); }
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
	{ before(grammarAccess.getVSVSTestCaseAccess().getValidatingItemsKeyword_25_0()); }
	'<ValidatingItems'
	{ after(grammarAccess.getVSVSTestCaseAccess().getValidatingItemsKeyword_25_0()); }
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
	{ before(grammarAccess.getVSVSTestCaseAccess().getValidatingItemsAssignment_25_2()); }
	(rule__VSVSTestCase__ValidatingItemsAssignment_25_2)
	{ after(grammarAccess.getVSVSTestCaseAccess().getValidatingItemsAssignment_25_2()); }
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
	{ before(grammarAccess.getVSVSTestProcedureAccess().getStepsKeyword_10()); }
	'<Steps>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getStepsKeyword_10()); }
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
	{ before(grammarAccess.getVSVSTestProcedureAccess().getStepsAssignment_11()); }
	(rule__VSVSTestProcedure__StepsAssignment_11)
	{ after(grammarAccess.getVSVSTestProcedureAccess().getStepsAssignment_11()); }
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
	{ before(grammarAccess.getVSVSTestProcedureAccess().getStepsKeyword_12()); }
	'</Steps>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getStepsKeyword_12()); }
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
	{ before(grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_13()); }
	'<TestScript>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_13()); }
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
	{ before(grammarAccess.getVSVSTestProcedureAccess().getTestScriptAssignment_14()); }
	(rule__VSVSTestProcedure__TestScriptAssignment_14)
	{ after(grammarAccess.getVSVSTestProcedureAccess().getTestScriptAssignment_14()); }
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
	{ before(grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_15()); }
	'</TestScript>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getTestScriptKeyword_15()); }
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
	{ before(grammarAccess.getVSVSTestProcedureAccess().getTestProcedureKeyword_16()); }
	'</TestProcedure>'
	{ after(grammarAccess.getVSVSTestProcedureAccess().getTestProcedureKeyword_16()); }
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
	{ before(grammarAccess.getVSVSProcedureStepAccess().getVSVSProcedureStepAction_0()); }
	()
	{ after(grammarAccess.getVSVSProcedureStepAccess().getVSVSProcedureStepAction_0()); }
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
	{ before(grammarAccess.getVSVSProcedureStepAccess().getProcedureStepKeyword_1()); }
	'<ProcedureStep'
	{ after(grammarAccess.getVSVSProcedureStepAccess().getProcedureStepKeyword_1()); }
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
	{ before(grammarAccess.getVSVSProcedureStepAccess().getSolidusGreaterThanSignKeyword_2()); }
	'/>'
	{ after(grammarAccess.getVSVSProcedureStepAccess().getSolidusGreaterThanSignKeyword_2()); }
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
		{ before(grammarAccess.getVSVSDocumentAccess().getIssueSTRINGTerminalRuleCall_6_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSDocumentAccess().getIssueSTRINGTerminalRuleCall_6_0()); }
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
		{ before(grammarAccess.getVSVSDocumentAccess().getRevisionSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getVSVSDocumentAccess().getRevisionSTRINGTerminalRuleCall_8_0()); }
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
		{ before(grammarAccess.getDApplicableDocumentAccess().getIssueSTRINGTerminalRuleCall_7_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDApplicableDocumentAccess().getIssueSTRINGTerminalRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DApplicableDocument__RevisionAssignment_7_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDApplicableDocumentAccess().getRevisionSTRINGTerminalRuleCall_7_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getDApplicableDocumentAccess().getRevisionSTRINGTerminalRuleCall_7_3_0()); }
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
		{ before(grammarAccess.getDReferenceDocumentAccess().getIssueSTRINGTerminalRuleCall_7_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDReferenceDocumentAccess().getIssueSTRINGTerminalRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DReferenceDocument__RevisionAssignment_7_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDReferenceDocumentAccess().getRevisionSTRINGTerminalRuleCall_7_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getDReferenceDocumentAccess().getRevisionSTRINGTerminalRuleCall_7_3_0()); }
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

rule__VSVSTestingSpecificationDesign__TestDesignsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsVSVSTestDesignParserRuleCall_4_0()); }
		ruleVSVSTestDesign
		{ after(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsVSVSTestDesignParserRuleCall_4_0()); }
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
		{ before(grammarAccess.getVSVSTestCaseAccess().getIdentifierVSVSFixedSectionParserRuleCall_5_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestCaseAccess().getIdentifierVSVSFixedSectionParserRuleCall_5_0()); }
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
		{ before(grammarAccess.getVSVSTestCaseAccess().getInputsVSVSFixedSectionParserRuleCall_8_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestCaseAccess().getInputsVSVSFixedSectionParserRuleCall_8_0()); }
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
		{ before(grammarAccess.getVSVSTestCaseAccess().getOutputsVSVSFixedSectionParserRuleCall_11_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestCaseAccess().getOutputsVSVSFixedSectionParserRuleCall_11_0()); }
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
		{ before(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaVSVSFixedSectionParserRuleCall_14_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaVSVSFixedSectionParserRuleCall_14_0()); }
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
		{ before(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsVSVSFixedSectionParserRuleCall_17_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsVSVSFixedSectionParserRuleCall_17_0()); }
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
		{ before(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsVSVSFixedSectionParserRuleCall_20_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsVSVSFixedSectionParserRuleCall_20_0()); }
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
		{ before(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesVSVSFixedSectionParserRuleCall_23_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesVSVSFixedSectionParserRuleCall_23_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestCase__ValidatingItemsAssignment_25_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestCaseAccess().getValidatingItemsVTraceableDocumentAbstractItemCrossReference_25_2_0()); }
		(
			{ before(grammarAccess.getVSVSTestCaseAccess().getValidatingItemsVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_25_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVSVSTestCaseAccess().getValidatingItemsVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_25_2_0_1()); }
		)
		{ after(grammarAccess.getVSVSTestCaseAccess().getValidatingItemsVTraceableDocumentAbstractItemCrossReference_25_2_0()); }
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
		{ before(grammarAccess.getVSVSTestProcedureAccess().getIdentifierVSVSFixedSectionParserRuleCall_5_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestProcedureAccess().getIdentifierVSVSFixedSectionParserRuleCall_5_0()); }
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
		{ before(grammarAccess.getVSVSTestProcedureAccess().getPurposeVSVSFixedSectionParserRuleCall_8_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestProcedureAccess().getPurposeVSVSFixedSectionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__StepsAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getStepsVSVSProcedureStepParserRuleCall_11_0()); }
		ruleVSVSProcedureStep
		{ after(grammarAccess.getVSVSTestProcedureAccess().getStepsVSVSProcedureStepParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VSVSTestProcedure__TestScriptAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVSVSTestProcedureAccess().getTestScriptVSVSFixedSectionParserRuleCall_14_0()); }
		ruleVSVSFixedSection
		{ after(grammarAccess.getVSVSTestProcedureAccess().getTestScriptVSVSFixedSectionParserRuleCall_14_0()); }
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
