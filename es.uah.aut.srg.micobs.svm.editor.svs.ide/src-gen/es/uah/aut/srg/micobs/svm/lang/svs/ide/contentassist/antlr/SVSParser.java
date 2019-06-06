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
package es.uah.aut.srg.micobs.svm.lang.svs.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.svs.ide.contentassist.antlr.internal.InternalSVSParser;
import es.uah.aut.srg.micobs.svm.lang.svs.services.SVSGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class SVSParser extends AbstractContentAssistParser {

	@Inject
	private SVSGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSVSParser createParser() {
		InternalSVSParser result = new InternalSVSParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDBodyContentAccess().getAlternatives(), "rule__DBodyContent__Alternatives");
					put(grammarAccess.getDListContentAccess().getAlternatives(), "rule__DListContent__Alternatives");
					put(grammarAccess.getDParagraphContentAccess().getAlternatives(), "rule__DParagraphContent__Alternatives");
					put(grammarAccess.getVSVSDocumentAccess().getGroup(), "rule__VSVSDocument__Group__0");
					put(grammarAccess.getVSVSDocumentAccess().getGroup_12(), "rule__VSVSDocument__Group_12__0");
					put(grammarAccess.getDBodyAccess().getGroup(), "rule__DBody__Group__0");
					put(grammarAccess.getDParagraphAccess().getGroup(), "rule__DParagraph__Group__0");
					put(grammarAccess.getDListItemAccess().getGroup(), "rule__DListItem__Group__0");
					put(grammarAccess.getDListItemAccess().getGroup_2(), "rule__DListItem__Group_2__0");
					put(grammarAccess.getDItemizeAccess().getGroup(), "rule__DItemize__Group__0");
					put(grammarAccess.getDEnumerateAccess().getGroup(), "rule__DEnumerate__Group__0");
					put(grammarAccess.getDRunAccess().getGroup(), "rule__DRun__Group__0");
					put(grammarAccess.getDHyperlinkAccess().getGroup(), "rule__DHyperlink__Group__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup(), "rule__DFigureFromFile__Group__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup_5(), "rule__DFigureFromFile__Group_5__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup(), "rule__DTableFromFile__Group__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_5(), "rule__DTableFromFile__Group_5__0");
					put(grammarAccess.getDBasicTableAccess().getGroup(), "rule__DBasicTable__Group__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_3(), "rule__DBasicTable__Group_3__0");
					put(grammarAccess.getDRowAccess().getGroup(), "rule__DRow__Group__0");
					put(grammarAccess.getDColumnAccess().getGroup(), "rule__DColumn__Group__0");
					put(grammarAccess.getDCellAccess().getGroup(), "rule__DCell__Group__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup(), "rule__DApplicableDocument__Group__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup_7(), "rule__DApplicableDocument__Group_7__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup_8(), "rule__DApplicableDocument__Group_8__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup(), "rule__DReferenceDocument__Group__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup_7(), "rule__DReferenceDocument__Group_7__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup_8(), "rule__DReferenceDocument__Group_8__0");
					put(grammarAccess.getVSVSFixedSectionAccess().getGroup(), "rule__VSVSFixedSection__Group__0");
					put(grammarAccess.getVSVSInstantiableSectionAccess().getGroup(), "rule__VSVSInstantiableSection__Group__0");
					put(grammarAccess.getVSVSIntroductionAccess().getGroup(), "rule__VSVSIntroduction__Group__0");
					put(grammarAccess.getVSVSApplicableDocumentsAccess().getGroup(), "rule__VSVSApplicableDocuments__Group__0");
					put(grammarAccess.getVSVSReferenceDocumentsAccess().getGroup(), "rule__VSVSReferenceDocuments__Group__0");
					put(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getGroup(), "rule__VSVSTermsDefinitionsAbbreviations__Group__0");
					put(grammarAccess.getVSVSSoftwareOverviewAccess().getGroup(), "rule__VSVSSoftwareOverview__Group__0");
					put(grammarAccess.getVSVSTaskIdentificationAccess().getGroup(), "rule__VSVSTaskIdentification__Group__0");
					put(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGroup(), "rule__VSVSTestingSpecificationDesign__Group__0");
					put(grammarAccess.getVSVSTestCasesAccess().getGroup(), "rule__VSVSTestCases__Group__0");
					put(grammarAccess.getVSVSTestProceduresAccess().getGroup(), "rule__VSVSTestProcedures__Group__0");
					put(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getGroup(), "rule__VSVSAnalysisInspectionReview__Group__0");
					put(grammarAccess.getVSVSTestPlatformRequirementsAccess().getGroup(), "rule__VSVSTestPlatformRequirements__Group__0");
					put(grammarAccess.getVSVSAdditionalInformationAccess().getGroup(), "rule__VSVSAdditionalInformation__Group__0");
					put(grammarAccess.getVSVSTermAccess().getGroup(), "rule__VSVSTerm__Group__0");
					put(grammarAccess.getVSVSDefinitionAccess().getGroup(), "rule__VSVSDefinition__Group__0");
					put(grammarAccess.getVSVSAbbreviationAccess().getGroup(), "rule__VSVSAbbreviation__Group__0");
					put(grammarAccess.getVSVSTestDesignAccess().getGroup(), "rule__VSVSTestDesign__Group__0");
					put(grammarAccess.getVSVSTestCaseAccess().getGroup(), "rule__VSVSTestCase__Group__0");
					put(grammarAccess.getVSVSTestCaseAccess().getGroup_25(), "rule__VSVSTestCase__Group_25__0");
					put(grammarAccess.getVSVSTestProcedureAccess().getGroup(), "rule__VSVSTestProcedure__Group__0");
					put(grammarAccess.getVSVSProcedureStepAccess().getGroup(), "rule__VSVSProcedureStep__Group__0");
					put(grammarAccess.getVSVSDocumentAccess().getNameAssignment_2(), "rule__VSVSDocument__NameAssignment_2");
					put(grammarAccess.getVSVSDocumentAccess().getIdAssignment_4(), "rule__VSVSDocument__IdAssignment_4");
					put(grammarAccess.getVSVSDocumentAccess().getIssueAssignment_6(), "rule__VSVSDocument__IssueAssignment_6");
					put(grammarAccess.getVSVSDocumentAccess().getRevisionAssignment_8(), "rule__VSVSDocument__RevisionAssignment_8");
					put(grammarAccess.getVSVSDocumentAccess().getDateAssignment_10(), "rule__VSVSDocument__DateAssignment_10");
					put(grammarAccess.getVSVSDocumentAccess().getParentsAssignment_12_2(), "rule__VSVSDocument__ParentsAssignment_12_2");
					put(grammarAccess.getVSVSDocumentAccess().getIntroductionSectionAssignment_13(), "rule__VSVSDocument__IntroductionSectionAssignment_13");
					put(grammarAccess.getVSVSDocumentAccess().getApplicableDocumentsSectionAssignment_14(), "rule__VSVSDocument__ApplicableDocumentsSectionAssignment_14");
					put(grammarAccess.getVSVSDocumentAccess().getReferenceDocumentsSectionAssignment_15(), "rule__VSVSDocument__ReferenceDocumentsSectionAssignment_15");
					put(grammarAccess.getVSVSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_16(), "rule__VSVSDocument__TermsDefinitionsAbbreviationsSectionAssignment_16");
					put(grammarAccess.getVSVSDocumentAccess().getSoftwareOverviewSectionAssignment_17(), "rule__VSVSDocument__SoftwareOverviewSectionAssignment_17");
					put(grammarAccess.getVSVSDocumentAccess().getTaskIdentificationSectionAssignment_18(), "rule__VSVSDocument__TaskIdentificationSectionAssignment_18");
					put(grammarAccess.getVSVSDocumentAccess().getTestingSpecificationDesignSectionAssignment_19(), "rule__VSVSDocument__TestingSpecificationDesignSectionAssignment_19");
					put(grammarAccess.getVSVSDocumentAccess().getTestCasesSectionAssignment_20(), "rule__VSVSDocument__TestCasesSectionAssignment_20");
					put(grammarAccess.getVSVSDocumentAccess().getTestProceduresSectionAssignment_21(), "rule__VSVSDocument__TestProceduresSectionAssignment_21");
					put(grammarAccess.getVSVSDocumentAccess().getAnalysisInspectionReviewSectionAssignment_22(), "rule__VSVSDocument__AnalysisInspectionReviewSectionAssignment_22");
					put(grammarAccess.getVSVSDocumentAccess().getTestPlatformRequirementsSectionAssignment_23(), "rule__VSVSDocument__TestPlatformRequirementsSectionAssignment_23");
					put(grammarAccess.getVSVSDocumentAccess().getAdditionalInformationSectionAssignment_24(), "rule__VSVSDocument__AdditionalInformationSectionAssignment_24");
					put(grammarAccess.getDBodyAccess().getBodyContentAssignment_1(), "rule__DBody__BodyContentAssignment_1");
					put(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_1(), "rule__DParagraph__ParagraphContentAssignment_1");
					put(grammarAccess.getDListItemAccess().getParagraphAssignment_1(), "rule__DListItem__ParagraphAssignment_1");
					put(grammarAccess.getDListItemAccess().getSublistAssignment_2_1(), "rule__DListItem__SublistAssignment_2_1");
					put(grammarAccess.getDItemizeAccess().getItemsAssignment_1(), "rule__DItemize__ItemsAssignment_1");
					put(grammarAccess.getDEnumerateAccess().getItemsAssignment_1(), "rule__DEnumerate__ItemsAssignment_1");
					put(grammarAccess.getDRunAccess().getTextAssignment_5(), "rule__DRun__TextAssignment_5");
					put(grammarAccess.getDHyperlinkAccess().getReferenceAssignment_2(), "rule__DHyperlink__ReferenceAssignment_2");
					put(grammarAccess.getDHyperlinkAccess().getRunAssignment_4(), "rule__DHyperlink__RunAssignment_4");
					put(grammarAccess.getDTextAccess().getContentAssignment(), "rule__DText__ContentAssignment");
					put(grammarAccess.getDFigureFromFileAccess().getNameAssignment_2(), "rule__DFigureFromFile__NameAssignment_2");
					put(grammarAccess.getDFigureFromFileAccess().getReferenceFileAssignment_4(), "rule__DFigureFromFile__ReferenceFileAssignment_4");
					put(grammarAccess.getDFigureFromFileAccess().getCaptionAssignment_5_1(), "rule__DFigureFromFile__CaptionAssignment_5_1");
					put(grammarAccess.getDTableFromFileAccess().getNameAssignment_2(), "rule__DTableFromFile__NameAssignment_2");
					put(grammarAccess.getDTableFromFileAccess().getReferenceFileAssignment_4(), "rule__DTableFromFile__ReferenceFileAssignment_4");
					put(grammarAccess.getDTableFromFileAccess().getCaptionAssignment_5_1(), "rule__DTableFromFile__CaptionAssignment_5_1");
					put(grammarAccess.getDBasicTableAccess().getNameAssignment_2(), "rule__DBasicTable__NameAssignment_2");
					put(grammarAccess.getDBasicTableAccess().getCaptionAssignment_3_1(), "rule__DBasicTable__CaptionAssignment_3_1");
					put(grammarAccess.getDBasicTableAccess().getRowsAssignment_5(), "rule__DBasicTable__RowsAssignment_5");
					put(grammarAccess.getDRowAccess().getSpanAssignment_2(), "rule__DRow__SpanAssignment_2");
					put(grammarAccess.getDRowAccess().getColumnsAssignment_4(), "rule__DRow__ColumnsAssignment_4");
					put(grammarAccess.getDColumnAccess().getSpanAssignment_2(), "rule__DColumn__SpanAssignment_2");
					put(grammarAccess.getDColumnAccess().getCellsAssignment_4(), "rule__DColumn__CellsAssignment_4");
					put(grammarAccess.getDCellAccess().getBodyContentAssignment_1(), "rule__DCell__BodyContentAssignment_1");
					put(grammarAccess.getDApplicableDocumentAccess().getNameAssignment_2(), "rule__DApplicableDocument__NameAssignment_2");
					put(grammarAccess.getDApplicableDocumentAccess().getTitleAssignment_4(), "rule__DApplicableDocument__TitleAssignment_4");
					put(grammarAccess.getDApplicableDocumentAccess().getIdAssignment_6(), "rule__DApplicableDocument__IdAssignment_6");
					put(grammarAccess.getDApplicableDocumentAccess().getIssueAssignment_7_1(), "rule__DApplicableDocument__IssueAssignment_7_1");
					put(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_7_3(), "rule__DApplicableDocument__RevisionAssignment_7_3");
					put(grammarAccess.getDApplicableDocumentAccess().getDateAssignment_8_1(), "rule__DApplicableDocument__DateAssignment_8_1");
					put(grammarAccess.getDReferenceDocumentAccess().getNameAssignment_2(), "rule__DReferenceDocument__NameAssignment_2");
					put(grammarAccess.getDReferenceDocumentAccess().getTitleAssignment_4(), "rule__DReferenceDocument__TitleAssignment_4");
					put(grammarAccess.getDReferenceDocumentAccess().getIdAssignment_6(), "rule__DReferenceDocument__IdAssignment_6");
					put(grammarAccess.getDReferenceDocumentAccess().getIssueAssignment_7_1(), "rule__DReferenceDocument__IssueAssignment_7_1");
					put(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_7_3(), "rule__DReferenceDocument__RevisionAssignment_7_3");
					put(grammarAccess.getDReferenceDocumentAccess().getDateAssignment_8_1(), "rule__DReferenceDocument__DateAssignment_8_1");
					put(grammarAccess.getVSVSFixedSectionAccess().getBodyAssignment_1(), "rule__VSVSFixedSection__BodyAssignment_1");
					put(grammarAccess.getVSVSFixedSectionAccess().getSvsInstatiableSubsectionsAssignment_2(), "rule__VSVSFixedSection__SvsInstatiableSubsectionsAssignment_2");
					put(grammarAccess.getVSVSInstantiableSectionAccess().getNameAssignment_2(), "rule__VSVSInstantiableSection__NameAssignment_2");
					put(grammarAccess.getVSVSInstantiableSectionAccess().getBodyAssignment_4(), "rule__VSVSInstantiableSection__BodyAssignment_4");
					put(grammarAccess.getVSVSInstantiableSectionAccess().getSvsInstatiableSubsectionsAssignment_5(), "rule__VSVSInstantiableSection__SvsInstatiableSubsectionsAssignment_5");
					put(grammarAccess.getVSVSIntroductionAccess().getSvsInstatiableSubsectionsAssignment_1(), "rule__VSVSIntroduction__SvsInstatiableSubsectionsAssignment_1");
					put(grammarAccess.getVSVSApplicableDocumentsAccess().getApplicableDocumentsAssignment_2(), "rule__VSVSApplicableDocuments__ApplicableDocumentsAssignment_2");
					put(grammarAccess.getVSVSReferenceDocumentsAccess().getReferenceDocumentsAssignment_2(), "rule__VSVSReferenceDocuments__ReferenceDocumentsAssignment_2");
					put(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2(), "rule__VSVSTermsDefinitionsAbbreviations__TermsAssignment_2");
					put(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3(), "rule__VSVSTermsDefinitionsAbbreviations__DefinitionsAssignment_3");
					put(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4(), "rule__VSVSTermsDefinitionsAbbreviations__AbbreviationsAssignment_4");
					put(grammarAccess.getVSVSSoftwareOverviewAccess().getBodyAssignment_2(), "rule__VSVSSoftwareOverview__BodyAssignment_2");
					put(grammarAccess.getVSVSSoftwareOverviewAccess().getSvsInstatiableSubsectionsAssignment_3(), "rule__VSVSSoftwareOverview__SvsInstatiableSubsectionsAssignment_3");
					put(grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaAssignment_2(), "rule__VSVSTaskIdentification__TaskCriteriaAssignment_2");
					put(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedAssignment_5(), "rule__VSVSTaskIdentification__FeaturesToBeTestedAssignment_5");
					put(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedAssignment_8(), "rule__VSVSTaskIdentification__FeaturesNotToBeTestedAssignment_8");
					put(grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaAssignment_11(), "rule__VSVSTaskIdentification__TestPassFailCriteriaAssignment_11");
					put(grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedAssignment_14(), "rule__VSVSTaskIdentification__ItemsCanNotBeValidatedAssignment_14");
					put(grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeAssignment_17(), "rule__VSVSTaskIdentification__ManuallyAutoGeneratedCodeAssignment_17");
					put(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGeneralAssignment_2(), "rule__VSVSTestingSpecificationDesign__GeneralAssignment_2");
					put(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsAssignment_4(), "rule__VSVSTestingSpecificationDesign__TestDesignsAssignment_4");
					put(grammarAccess.getVSVSTestCasesAccess().getGeneralAssignment_2(), "rule__VSVSTestCases__GeneralAssignment_2");
					put(grammarAccess.getVSVSTestCasesAccess().getTestCasesAssignment_4(), "rule__VSVSTestCases__TestCasesAssignment_4");
					put(grammarAccess.getVSVSTestProceduresAccess().getGeneralAssignment_2(), "rule__VSVSTestProcedures__GeneralAssignment_2");
					put(grammarAccess.getVSVSTestProceduresAccess().getTestProceduresAssignment_4(), "rule__VSVSTestProcedures__TestProceduresAssignment_4");
					put(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getBodyAssignment_2(), "rule__VSVSAnalysisInspectionReview__BodyAssignment_2");
					put(grammarAccess.getVSVSAnalysisInspectionReviewAccess().getSvsInstatiableSubsectionsAssignment_3(), "rule__VSVSAnalysisInspectionReview__SvsInstatiableSubsectionsAssignment_3");
					put(grammarAccess.getVSVSTestPlatformRequirementsAccess().getBodyAssignment_2(), "rule__VSVSTestPlatformRequirements__BodyAssignment_2");
					put(grammarAccess.getVSVSTestPlatformRequirementsAccess().getSvsInstatiableSubsectionsAssignment_3(), "rule__VSVSTestPlatformRequirements__SvsInstatiableSubsectionsAssignment_3");
					put(grammarAccess.getVSVSAdditionalInformationAccess().getBodyAssignment_2(), "rule__VSVSAdditionalInformation__BodyAssignment_2");
					put(grammarAccess.getVSVSAdditionalInformationAccess().getSvsInstatiableSubsectionsAssignment_3(), "rule__VSVSAdditionalInformation__SvsInstatiableSubsectionsAssignment_3");
					put(grammarAccess.getVSVSTermAccess().getNameAssignment_2(), "rule__VSVSTerm__NameAssignment_2");
					put(grammarAccess.getVSVSTermAccess().getDescriptionAssignment_4(), "rule__VSVSTerm__DescriptionAssignment_4");
					put(grammarAccess.getVSVSDefinitionAccess().getNameAssignment_2(), "rule__VSVSDefinition__NameAssignment_2");
					put(grammarAccess.getVSVSDefinitionAccess().getDescriptionAssignment_4(), "rule__VSVSDefinition__DescriptionAssignment_4");
					put(grammarAccess.getVSVSAbbreviationAccess().getNameAssignment_2(), "rule__VSVSAbbreviation__NameAssignment_2");
					put(grammarAccess.getVSVSAbbreviationAccess().getDescriptionAssignment_4(), "rule__VSVSAbbreviation__DescriptionAssignment_4");
					put(grammarAccess.getVSVSTestDesignAccess().getNameAssignment_2(), "rule__VSVSTestDesign__NameAssignment_2");
					put(grammarAccess.getVSVSTestDesignAccess().getGeneralAssignment_5(), "rule__VSVSTestDesign__GeneralAssignment_5");
					put(grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedAssignment_8(), "rule__VSVSTestDesign__FeaturesToBeTestedAssignment_8");
					put(grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsAssignment_11(), "rule__VSVSTestDesign__ApproachRefinementsAssignment_11");
					put(grammarAccess.getVSVSTestCaseAccess().getNameAssignment_2(), "rule__VSVSTestCase__NameAssignment_2");
					put(grammarAccess.getVSVSTestCaseAccess().getIdentifierAssignment_5(), "rule__VSVSTestCase__IdentifierAssignment_5");
					put(grammarAccess.getVSVSTestCaseAccess().getInputsAssignment_8(), "rule__VSVSTestCase__InputsAssignment_8");
					put(grammarAccess.getVSVSTestCaseAccess().getOutputsAssignment_11(), "rule__VSVSTestCase__OutputsAssignment_11");
					put(grammarAccess.getVSVSTestCaseAccess().getPassFailCriteriaAssignment_14(), "rule__VSVSTestCase__PassFailCriteriaAssignment_14");
					put(grammarAccess.getVSVSTestCaseAccess().getEnvironmentalNeedsAssignment_17(), "rule__VSVSTestCase__EnvironmentalNeedsAssignment_17");
					put(grammarAccess.getVSVSTestCaseAccess().getSpecialConstraintsAssignment_20(), "rule__VSVSTestCase__SpecialConstraintsAssignment_20");
					put(grammarAccess.getVSVSTestCaseAccess().getInterfaceDependenciesAssignment_23(), "rule__VSVSTestCase__InterfaceDependenciesAssignment_23");
					put(grammarAccess.getVSVSTestCaseAccess().getValidatingItemsAssignment_25_2(), "rule__VSVSTestCase__ValidatingItemsAssignment_25_2");
					put(grammarAccess.getVSVSTestProcedureAccess().getNameAssignment_2(), "rule__VSVSTestProcedure__NameAssignment_2");
					put(grammarAccess.getVSVSTestProcedureAccess().getIdentifierAssignment_5(), "rule__VSVSTestProcedure__IdentifierAssignment_5");
					put(grammarAccess.getVSVSTestProcedureAccess().getPurposeAssignment_8(), "rule__VSVSTestProcedure__PurposeAssignment_8");
					put(grammarAccess.getVSVSTestProcedureAccess().getStepsAssignment_11(), "rule__VSVSTestProcedure__StepsAssignment_11");
					put(grammarAccess.getVSVSTestProcedureAccess().getTestScriptAssignment_14(), "rule__VSVSTestProcedure__TestScriptAssignment_14");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSVSParser typedParser = (InternalSVSParser) parser;
			typedParser.entryRuleVSVSDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SVSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SVSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
