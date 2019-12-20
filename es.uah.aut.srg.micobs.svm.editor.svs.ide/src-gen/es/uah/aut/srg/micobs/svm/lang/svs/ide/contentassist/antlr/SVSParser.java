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
					put(grammarAccess.getVSVSStepInputsAccess().getAlternatives(), "rule__VSVSStepInputs__Alternatives");
					put(grammarAccess.getVSVSStepTelecommandDataAccess().getAlternatives_3(), "rule__VSVSStepTelecommandData__Alternatives_3");
					put(grammarAccess.getTMTCIFFieldValueTCAccess().getAlternatives(), "rule__TMTCIFFieldValueTC__Alternatives");
					put(grammarAccess.getTMTCIFFieldValueHeaderAccess().getAlternatives(), "rule__TMTCIFFieldValueHeader__Alternatives");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0(), "rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0");
					put(grammarAccess.getVSVSStepTelemetryDataAccess().getAlternatives_3(), "rule__VSVSStepTelemetryData__Alternatives_3");
					put(grammarAccess.getTMTCIFFieldValueTMAccess().getAlternatives(), "rule__TMTCIFFieldValueTM__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getDAlignmentAccess().getAlternatives(), "rule__DAlignment__Alternatives");
					put(grammarAccess.getDRunAttributesAccess().getAlternatives(), "rule__DRunAttributes__Alternatives");
					put(grammarAccess.getVSVSActionTypeAccess().getAlternatives(), "rule__VSVSActionType__Alternatives");
					put(grammarAccess.getVSVSConfigurationStatusAccess().getAlternatives(), "rule__VSVSConfigurationStatus__Alternatives");
					put(grammarAccess.getVSVSTimeUnitAccess().getAlternatives(), "rule__VSVSTimeUnit__Alternatives");
					put(grammarAccess.getVSVSStepTelemetrySetCheckmodeAccess().getAlternatives(), "rule__VSVSStepTelemetrySetCheckmode__Alternatives");
					put(grammarAccess.getVSVSDocumentAccess().getGroup(), "rule__VSVSDocument__Group__0");
					put(grammarAccess.getVSVSDocumentAccess().getGroup_12(), "rule__VSVSDocument__Group_12__0");
					put(grammarAccess.getDBodyAccess().getGroup(), "rule__DBody__Group__0");
					put(grammarAccess.getDParagraphAccess().getGroup(), "rule__DParagraph__Group__0");
					put(grammarAccess.getDParagraphAccess().getGroup_1(), "rule__DParagraph__Group_1__0");
					put(grammarAccess.getDParagraphAccess().getGroup_2(), "rule__DParagraph__Group_2__0");
					put(grammarAccess.getDParagraphAccess().getGroup_3(), "rule__DParagraph__Group_3__0");
					put(grammarAccess.getDParagraphAccess().getGroup_4(), "rule__DParagraph__Group_4__0");
					put(grammarAccess.getDListItemAccess().getGroup(), "rule__DListItem__Group__0");
					put(grammarAccess.getDListItemAccess().getGroup_3(), "rule__DListItem__Group_3__0");
					put(grammarAccess.getDItemizeAccess().getGroup(), "rule__DItemize__Group__0");
					put(grammarAccess.getDItemizeAccess().getGroup_1(), "rule__DItemize__Group_1__0");
					put(grammarAccess.getDItemizeAccess().getGroup_2(), "rule__DItemize__Group_2__0");
					put(grammarAccess.getDItemizeAccess().getGroup_3(), "rule__DItemize__Group_3__0");
					put(grammarAccess.getDItemizeAccess().getGroup_4(), "rule__DItemize__Group_4__0");
					put(grammarAccess.getDEnumerateAccess().getGroup(), "rule__DEnumerate__Group__0");
					put(grammarAccess.getDEnumerateAccess().getGroup_1(), "rule__DEnumerate__Group_1__0");
					put(grammarAccess.getDEnumerateAccess().getGroup_2(), "rule__DEnumerate__Group_2__0");
					put(grammarAccess.getDEnumerateAccess().getGroup_3(), "rule__DEnumerate__Group_3__0");
					put(grammarAccess.getDEnumerateAccess().getGroup_4(), "rule__DEnumerate__Group_4__0");
					put(grammarAccess.getDRunAccess().getGroup(), "rule__DRun__Group__0");
					put(grammarAccess.getDRunAccess().getGroup_1(), "rule__DRun__Group_1__0");
					put(grammarAccess.getDRunAccess().getGroup_2(), "rule__DRun__Group_2__0");
					put(grammarAccess.getDRunAccess().getGroup_3(), "rule__DRun__Group_3__0");
					put(grammarAccess.getDRunAccess().getGroup_4(), "rule__DRun__Group_4__0");
					put(grammarAccess.getDHyperlinkAccess().getGroup(), "rule__DHyperlink__Group__0");
					put(grammarAccess.getDTabAccess().getGroup(), "rule__DTab__Group__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup(), "rule__DFigureFromFile__Group__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup_9(), "rule__DFigureFromFile__Group_9__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup_10(), "rule__DFigureFromFile__Group_10__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup_11(), "rule__DFigureFromFile__Group_11__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup_12(), "rule__DFigureFromFile__Group_12__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup(), "rule__DTableFromFile__Group__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_9(), "rule__DTableFromFile__Group_9__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_10(), "rule__DTableFromFile__Group_10__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_11(), "rule__DTableFromFile__Group_11__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_12(), "rule__DTableFromFile__Group_12__0");
					put(grammarAccess.getDBasicTableAccess().getGroup(), "rule__DBasicTable__Group__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_3(), "rule__DBasicTable__Group_3__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_4(), "rule__DBasicTable__Group_4__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_5(), "rule__DBasicTable__Group_5__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_6(), "rule__DBasicTable__Group_6__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_7(), "rule__DBasicTable__Group_7__0");
					put(grammarAccess.getDRowAccess().getGroup(), "rule__DRow__Group__0");
					put(grammarAccess.getDCellAccess().getGroup(), "rule__DCell__Group__0");
					put(grammarAccess.getDCellAccess().getGroup_1(), "rule__DCell__Group_1__0");
					put(grammarAccess.getDCellAccess().getGroup_2(), "rule__DCell__Group_2__0");
					put(grammarAccess.getDCellAccess().getGroup_3(), "rule__DCell__Group_3__0");
					put(grammarAccess.getDCellAccess().getGroup_4(), "rule__DCell__Group_4__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup(), "rule__DApplicableDocument__Group__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup_7(), "rule__DApplicableDocument__Group_7__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup_7_2(), "rule__DApplicableDocument__Group_7_2__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup_8(), "rule__DApplicableDocument__Group_8__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup(), "rule__DReferenceDocument__Group__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup_7(), "rule__DReferenceDocument__Group_7__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup_7_2(), "rule__DReferenceDocument__Group_7_2__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup_8(), "rule__DReferenceDocument__Group_8__0");
					put(grammarAccess.getVSVSTestInfoAccess().getGroup(), "rule__VSVSTestInfo__Group__0");
					put(grammarAccess.getVSVSFixedSectionAccess().getGroup(), "rule__VSVSFixedSection__Group__0");
					put(grammarAccess.getVSVSInstantiableSectionAccess().getGroup(), "rule__VSVSInstantiableSection__Group__0");
					put(grammarAccess.getVSVSIntroductionAccess().getGroup(), "rule__VSVSIntroduction__Group__0");
					put(grammarAccess.getVSVSApplicableDocumentsAccess().getGroup(), "rule__VSVSApplicableDocuments__Group__0");
					put(grammarAccess.getVSVSReferenceDocumentsAccess().getGroup(), "rule__VSVSReferenceDocuments__Group__0");
					put(grammarAccess.getVSVSTermsDefinitionsAbbreviationsAccess().getGroup(), "rule__VSVSTermsDefinitionsAbbreviations__Group__0");
					put(grammarAccess.getVSVSSoftwareOverviewAccess().getGroup(), "rule__VSVSSoftwareOverview__Group__0");
					put(grammarAccess.getVSVSTaskIdentificationAccess().getGroup(), "rule__VSVSTaskIdentification__Group__0");
					put(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGroup(), "rule__VSVSTestingSpecificationDesign__Group__0");
					put(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGroup_7(), "rule__VSVSTestingSpecificationDesign__Group_7__0");
					put(grammarAccess.getVSVSTestingSpecificationDesignAccess().getGroup_8(), "rule__VSVSTestingSpecificationDesign__Group_8__0");
					put(grammarAccess.getVSVSInterfacesSectionAccess().getGroup(), "rule__VSVSInterfacesSection__Group__0");
					put(grammarAccess.getVSVSInterfaceAccess().getGroup(), "rule__VSVSInterface__Group__0");
					put(grammarAccess.getVSVSPacketConfigurationsSectionAccess().getGroup(), "rule__VSVSPacketConfigurationsSection__Group__0");
					put(grammarAccess.getVSVSPacketConfigurationAccess().getGroup(), "rule__VSVSPacketConfiguration__Group__0");
					put(grammarAccess.getVSVSActionsSectionAccess().getGroup(), "rule__VSVSActionsSection__Group__0");
					put(grammarAccess.getVSVSActionAccess().getGroup(), "rule__VSVSAction__Group__0");
					put(grammarAccess.getVSVSScenariosSectionAccess().getGroup(), "rule__VSVSScenariosSection__Group__0");
					put(grammarAccess.getVSVSScenarioSectionAccess().getGroup(), "rule__VSVSScenarioSection__Group__0");
					put(grammarAccess.getVSVSScenarioSectionAccess().getGroup_4(), "rule__VSVSScenarioSection__Group_4__0");
					put(grammarAccess.getVSVSScenarioSectionAccess().getGroup_6(), "rule__VSVSScenarioSection__Group_6__0");
					put(grammarAccess.getVSVSSelectedConfigurationAccess().getGroup(), "rule__VSVSSelectedConfiguration__Group__0");
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
					put(grammarAccess.getVSVSTestProcedureAccess().getGroup_14(), "rule__VSVSTestProcedure__Group_14__0");
					put(grammarAccess.getVSVSProcedureStepsAccess().getGroup(), "rule__VSVSProcedureSteps__Group__0");
					put(grammarAccess.getVSVSProcedureStepAccess().getGroup(), "rule__VSVSProcedureStep__Group__0");
					put(grammarAccess.getVSVSProcedureStepAccess().getGroup_3(), "rule__VSVSProcedureStep__Group_3__0");
					put(grammarAccess.getVSVSProcedureStepAccess().getGroup_4(), "rule__VSVSProcedureStep__Group_4__0");
					put(grammarAccess.getVSVSStepConfigurationsAccess().getGroup(), "rule__VSVSStepConfigurations__Group__0");
					put(grammarAccess.getVSVSStepConfigurationAccess().getGroup(), "rule__VSVSStepConfiguration__Group__0");
					put(grammarAccess.getVSVSStepConfigurationAccess().getGroup_3(), "rule__VSVSStepConfiguration__Group_3__0");
					put(grammarAccess.getVSVSStepConfigurationAccess().getGroup_4(), "rule__VSVSStepConfiguration__Group_4__0");
					put(grammarAccess.getVSVSStepActionAccess().getGroup(), "rule__VSVSStepAction__Group__0");
					put(grammarAccess.getVSVSStepActionAccess().getGroup_3(), "rule__VSVSStepAction__Group_3__0");
					put(grammarAccess.getVSVSStepActionAccess().getGroup_4(), "rule__VSVSStepAction__Group_4__0");
					put(grammarAccess.getVSVSStepTelecommandSequenceAccess().getGroup(), "rule__VSVSStepTelecommandSequence__Group__0");
					put(grammarAccess.getVSVSStepTelecommandAccess().getGroup(), "rule__VSVSStepTelecommand__Group__0");
					put(grammarAccess.getVSVSStepTelecommandAccess().getGroup_5(), "rule__VSVSStepTelecommand__Group_5__0");
					put(grammarAccess.getVSVSStepTelecommandDataAccess().getGroup(), "rule__VSVSStepTelecommandData__Group__0");
					put(grammarAccess.getVSVSStepTelecommandDataAccess().getGroup_3_0(), "rule__VSVSStepTelecommandData__Group_3_0__0");
					put(grammarAccess.getVSVSStepTelecommandDataFieldAccess().getGroup(), "rule__VSVSStepTelecommandDataField__Group__0");
					put(grammarAccess.getVSVSStepTelecommandHeaderAccess().getGroup(), "rule__VSVSStepTelecommandHeader__Group__0");
					put(grammarAccess.getVSVSStepTelecommandHeaderFieldAccess().getGroup(), "rule__VSVSStepTelecommandHeaderField__Group__0");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup(), "rule__TMTCIFFieldValueRaw__Group__0");
					put(grammarAccess.getTMTCIFFieldValueFileAccess().getGroup(), "rule__TMTCIFFieldValueFile__Group__0");
					put(grammarAccess.getTMTCIFFieldValueEnumAccess().getGroup(), "rule__TMTCIFFieldValueEnum__Group__0");
					put(grammarAccess.getVSVSStepTelemetrySetAccess().getGroup(), "rule__VSVSStepTelemetrySet__Group__0");
					put(grammarAccess.getVSVSStepTelemetryAccess().getGroup(), "rule__VSVSStepTelemetry__Group__0");
					put(grammarAccess.getVSVSStepTelemetryDataAccess().getGroup(), "rule__VSVSStepTelemetryData__Group__0");
					put(grammarAccess.getVSVSStepTelemetryDataAccess().getGroup_3_0(), "rule__VSVSStepTelemetryData__Group_3_0__0");
					put(grammarAccess.getVSVSStepTelemetryDataFieldAccess().getGroup(), "rule__VSVSStepTelemetryDataField__Group__0");
					put(grammarAccess.getVSVSStepTelemetryHeaderAccess().getGroup(), "rule__VSVSStepTelemetryHeader__Group__0");
					put(grammarAccess.getVSVSStepTelemetryHeaderFieldAccess().getGroup(), "rule__VSVSStepTelemetryHeaderField__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getVersionedQualifiedNameAccess().getGroup(), "rule__VersionedQualifiedName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup(), "rule__VersionedQualifiedReferenceName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0(), "rule__VersionedQualifiedReferenceName__Group_0__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2(), "rule__VersionedQualifiedReferenceName__Group_2__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
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
					put(grammarAccess.getDParagraphAccess().getNameAssignment_1_1(), "rule__DParagraph__NameAssignment_1_1");
					put(grammarAccess.getDParagraphAccess().getAlignmentAssignment_2_1(), "rule__DParagraph__AlignmentAssignment_2_1");
					put(grammarAccess.getDParagraphAccess().getStyleAssignment_3_1(), "rule__DParagraph__StyleAssignment_3_1");
					put(grammarAccess.getDParagraphAccess().getIndentAssignment_4_1(), "rule__DParagraph__IndentAssignment_4_1");
					put(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_6(), "rule__DParagraph__ParagraphContentAssignment_6");
					put(grammarAccess.getDListItemAccess().getParagraphAssignment_2(), "rule__DListItem__ParagraphAssignment_2");
					put(grammarAccess.getDListItemAccess().getSublistAssignment_3_1(), "rule__DListItem__SublistAssignment_3_1");
					put(grammarAccess.getDItemizeAccess().getNameAssignment_1_1(), "rule__DItemize__NameAssignment_1_1");
					put(grammarAccess.getDItemizeAccess().getAlignmentAssignment_2_1(), "rule__DItemize__AlignmentAssignment_2_1");
					put(grammarAccess.getDItemizeAccess().getStyleAssignment_3_1(), "rule__DItemize__StyleAssignment_3_1");
					put(grammarAccess.getDItemizeAccess().getIndentAssignment_4_1(), "rule__DItemize__IndentAssignment_4_1");
					put(grammarAccess.getDItemizeAccess().getItemsAssignment_6(), "rule__DItemize__ItemsAssignment_6");
					put(grammarAccess.getDEnumerateAccess().getNameAssignment_1_1(), "rule__DEnumerate__NameAssignment_1_1");
					put(grammarAccess.getDEnumerateAccess().getAlignmentAssignment_2_1(), "rule__DEnumerate__AlignmentAssignment_2_1");
					put(grammarAccess.getDEnumerateAccess().getStyleAssignment_3_1(), "rule__DEnumerate__StyleAssignment_3_1");
					put(grammarAccess.getDEnumerateAccess().getIndentAssignment_4_1(), "rule__DEnumerate__IndentAssignment_4_1");
					put(grammarAccess.getDEnumerateAccess().getItemsAssignment_6(), "rule__DEnumerate__ItemsAssignment_6");
					put(grammarAccess.getDRunAccess().getBoldAssignment_1_1(), "rule__DRun__BoldAssignment_1_1");
					put(grammarAccess.getDRunAccess().getItalicsAssignment_2_1(), "rule__DRun__ItalicsAssignment_2_1");
					put(grammarAccess.getDRunAccess().getUnderlineAssignment_3_1(), "rule__DRun__UnderlineAssignment_3_1");
					put(grammarAccess.getDRunAccess().getColorAssignment_4_1(), "rule__DRun__ColorAssignment_4_1");
					put(grammarAccess.getDRunAccess().getTabAssignment_6(), "rule__DRun__TabAssignment_6");
					put(grammarAccess.getDRunAccess().getTextAssignment_7(), "rule__DRun__TextAssignment_7");
					put(grammarAccess.getDHyperlinkAccess().getReferenceAssignment_2(), "rule__DHyperlink__ReferenceAssignment_2");
					put(grammarAccess.getDHyperlinkAccess().getRunAssignment_4(), "rule__DHyperlink__RunAssignment_4");
					put(grammarAccess.getDTextAccess().getContentAssignment(), "rule__DText__ContentAssignment");
					put(grammarAccess.getDFigureFromFileAccess().getNameAssignment_2(), "rule__DFigureFromFile__NameAssignment_2");
					put(grammarAccess.getDFigureFromFileAccess().getReferenceFileAssignment_4(), "rule__DFigureFromFile__ReferenceFileAssignment_4");
					put(grammarAccess.getDFigureFromFileAccess().getWidthAssignment_6(), "rule__DFigureFromFile__WidthAssignment_6");
					put(grammarAccess.getDFigureFromFileAccess().getHeightAssignment_8(), "rule__DFigureFromFile__HeightAssignment_8");
					put(grammarAccess.getDFigureFromFileAccess().getAlignmentAssignment_9_1(), "rule__DFigureFromFile__AlignmentAssignment_9_1");
					put(grammarAccess.getDFigureFromFileAccess().getStyleAssignment_10_1(), "rule__DFigureFromFile__StyleAssignment_10_1");
					put(grammarAccess.getDFigureFromFileAccess().getIndentAssignment_11_1(), "rule__DFigureFromFile__IndentAssignment_11_1");
					put(grammarAccess.getDFigureFromFileAccess().getCaptionAssignment_12_1(), "rule__DFigureFromFile__CaptionAssignment_12_1");
					put(grammarAccess.getDTableFromFileAccess().getNameAssignment_2(), "rule__DTableFromFile__NameAssignment_2");
					put(grammarAccess.getDTableFromFileAccess().getReferenceFileAssignment_4(), "rule__DTableFromFile__ReferenceFileAssignment_4");
					put(grammarAccess.getDTableFromFileAccess().getWidthAssignment_6(), "rule__DTableFromFile__WidthAssignment_6");
					put(grammarAccess.getDTableFromFileAccess().getHeightAssignment_8(), "rule__DTableFromFile__HeightAssignment_8");
					put(grammarAccess.getDTableFromFileAccess().getAlignmentAssignment_9_1(), "rule__DTableFromFile__AlignmentAssignment_9_1");
					put(grammarAccess.getDTableFromFileAccess().getStyleAssignment_10_1(), "rule__DTableFromFile__StyleAssignment_10_1");
					put(grammarAccess.getDTableFromFileAccess().getIndentAssignment_11_1(), "rule__DTableFromFile__IndentAssignment_11_1");
					put(grammarAccess.getDTableFromFileAccess().getCaptionAssignment_12_1(), "rule__DTableFromFile__CaptionAssignment_12_1");
					put(grammarAccess.getDBasicTableAccess().getNameAssignment_2(), "rule__DBasicTable__NameAssignment_2");
					put(grammarAccess.getDBasicTableAccess().getWidthAssignment_3_1(), "rule__DBasicTable__WidthAssignment_3_1");
					put(grammarAccess.getDBasicTableAccess().getAlignmentAssignment_4_1(), "rule__DBasicTable__AlignmentAssignment_4_1");
					put(grammarAccess.getDBasicTableAccess().getStyleAssignment_5_1(), "rule__DBasicTable__StyleAssignment_5_1");
					put(grammarAccess.getDBasicTableAccess().getIndentAssignment_6_1(), "rule__DBasicTable__IndentAssignment_6_1");
					put(grammarAccess.getDBasicTableAccess().getCaptionAssignment_7_1(), "rule__DBasicTable__CaptionAssignment_7_1");
					put(grammarAccess.getDBasicTableAccess().getRowsAssignment_9(), "rule__DBasicTable__RowsAssignment_9");
					put(grammarAccess.getDRowAccess().getCellsAssignment_1(), "rule__DRow__CellsAssignment_1");
					put(grammarAccess.getDCellAccess().getColSpanAssignment_1_1(), "rule__DCell__ColSpanAssignment_1_1");
					put(grammarAccess.getDCellAccess().getRowSpanAssignment_2_1(), "rule__DCell__RowSpanAssignment_2_1");
					put(grammarAccess.getDCellAccess().getWidthAssignment_3_1(), "rule__DCell__WidthAssignment_3_1");
					put(grammarAccess.getDCellAccess().getShadowAssignment_4_1(), "rule__DCell__ShadowAssignment_4_1");
					put(grammarAccess.getDCellAccess().getBodyContentAssignment_6(), "rule__DCell__BodyContentAssignment_6");
					put(grammarAccess.getDApplicableDocumentAccess().getNameAssignment_2(), "rule__DApplicableDocument__NameAssignment_2");
					put(grammarAccess.getDApplicableDocumentAccess().getTitleAssignment_4(), "rule__DApplicableDocument__TitleAssignment_4");
					put(grammarAccess.getDApplicableDocumentAccess().getIdAssignment_6(), "rule__DApplicableDocument__IdAssignment_6");
					put(grammarAccess.getDApplicableDocumentAccess().getIssueAssignment_7_1(), "rule__DApplicableDocument__IssueAssignment_7_1");
					put(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_7_2_1(), "rule__DApplicableDocument__RevisionAssignment_7_2_1");
					put(grammarAccess.getDApplicableDocumentAccess().getDateAssignment_8_1(), "rule__DApplicableDocument__DateAssignment_8_1");
					put(grammarAccess.getDReferenceDocumentAccess().getNameAssignment_2(), "rule__DReferenceDocument__NameAssignment_2");
					put(grammarAccess.getDReferenceDocumentAccess().getTitleAssignment_4(), "rule__DReferenceDocument__TitleAssignment_4");
					put(grammarAccess.getDReferenceDocumentAccess().getIdAssignment_6(), "rule__DReferenceDocument__IdAssignment_6");
					put(grammarAccess.getDReferenceDocumentAccess().getIssueAssignment_7_1(), "rule__DReferenceDocument__IssueAssignment_7_1");
					put(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_7_2_1(), "rule__DReferenceDocument__RevisionAssignment_7_2_1");
					put(grammarAccess.getDReferenceDocumentAccess().getDateAssignment_8_1(), "rule__DReferenceDocument__DateAssignment_8_1");
					put(grammarAccess.getVSVSTestInfoAccess().getBodyAssignment_1(), "rule__VSVSTestInfo__BodyAssignment_1");
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
					put(grammarAccess.getVSVSTestingSpecificationDesignAccess().getInterfacesAssignment_5(), "rule__VSVSTestingSpecificationDesign__InterfacesAssignment_5");
					put(grammarAccess.getVSVSTestingSpecificationDesignAccess().getConfigurationsAssignment_7_1(), "rule__VSVSTestingSpecificationDesign__ConfigurationsAssignment_7_1");
					put(grammarAccess.getVSVSTestingSpecificationDesignAccess().getActionsAssignment_8_1(), "rule__VSVSTestingSpecificationDesign__ActionsAssignment_8_1");
					put(grammarAccess.getVSVSTestingSpecificationDesignAccess().getScenariosAssignment_10(), "rule__VSVSTestingSpecificationDesign__ScenariosAssignment_10");
					put(grammarAccess.getVSVSTestingSpecificationDesignAccess().getTestDesignsAssignment_12(), "rule__VSVSTestingSpecificationDesign__TestDesignsAssignment_12");
					put(grammarAccess.getVSVSInterfacesSectionAccess().getInterfacesAssignment_1(), "rule__VSVSInterfacesSection__InterfacesAssignment_1");
					put(grammarAccess.getVSVSInterfaceAccess().getNameAssignment_2(), "rule__VSVSInterface__NameAssignment_2");
					put(grammarAccess.getVSVSInterfaceAccess().getIdAssignment_4(), "rule__VSVSInterface__IdAssignment_4");
					put(grammarAccess.getVSVSInterfaceAccess().getTcHeaderAssignment_6(), "rule__VSVSInterface__TcHeaderAssignment_6");
					put(grammarAccess.getVSVSInterfaceAccess().getTmHeaderAssignment_8(), "rule__VSVSInterface__TmHeaderAssignment_8");
					put(grammarAccess.getVSVSInterfaceAccess().getDescriptionAssignment_10(), "rule__VSVSInterface__DescriptionAssignment_10");
					put(grammarAccess.getVSVSPacketConfigurationsSectionAccess().getPacketConfigurationsAssignment_1(), "rule__VSVSPacketConfigurationsSection__PacketConfigurationsAssignment_1");
					put(grammarAccess.getVSVSPacketConfigurationAccess().getNameAssignment_2(), "rule__VSVSPacketConfiguration__NameAssignment_2");
					put(grammarAccess.getVSVSPacketConfigurationAccess().getIdAssignment_4(), "rule__VSVSPacketConfiguration__IdAssignment_4");
					put(grammarAccess.getVSVSPacketConfigurationAccess().getDescriptionAssignment_6(), "rule__VSVSPacketConfiguration__DescriptionAssignment_6");
					put(grammarAccess.getVSVSActionsSectionAccess().getActionAssignment_1(), "rule__VSVSActionsSection__ActionAssignment_1");
					put(grammarAccess.getVSVSActionAccess().getNameAssignment_2(), "rule__VSVSAction__NameAssignment_2");
					put(grammarAccess.getVSVSActionAccess().getTypeAssignment_4(), "rule__VSVSAction__TypeAssignment_4");
					put(grammarAccess.getVSVSActionAccess().getDescriptionAssignment_6(), "rule__VSVSAction__DescriptionAssignment_6");
					put(grammarAccess.getVSVSScenariosSectionAccess().getScenariosAssignment_1(), "rule__VSVSScenariosSection__ScenariosAssignment_1");
					put(grammarAccess.getVSVSScenarioSectionAccess().getNameAssignment_2(), "rule__VSVSScenarioSection__NameAssignment_2");
					put(grammarAccess.getVSVSScenarioSectionAccess().getSupportedInterfaceAssignment_4_2(), "rule__VSVSScenarioSection__SupportedInterfaceAssignment_4_2");
					put(grammarAccess.getVSVSScenarioSectionAccess().getSelectedConfigurationAssignment_5(), "rule__VSVSScenarioSection__SelectedConfigurationAssignment_5");
					put(grammarAccess.getVSVSScenarioSectionAccess().getSupportedActionAssignment_6_2(), "rule__VSVSScenarioSection__SupportedActionAssignment_6_2");
					put(grammarAccess.getVSVSScenarioSectionAccess().getBodyAssignment_7(), "rule__VSVSScenarioSection__BodyAssignment_7");
					put(grammarAccess.getVSVSSelectedConfigurationAccess().getConfigurationAssignment_2(), "rule__VSVSSelectedConfiguration__ConfigurationAssignment_2");
					put(grammarAccess.getVSVSSelectedConfigurationAccess().getDefaultFilterStatusAssignment_4(), "rule__VSVSSelectedConfiguration__DefaultFilterStatusAssignment_4");
					put(grammarAccess.getVSVSSelectedConfigurationAccess().getDefaultPrintStatusAssignment_6(), "rule__VSVSSelectedConfiguration__DefaultPrintStatusAssignment_6");
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
					put(grammarAccess.getVSVSTestCaseAccess().getValidatingItemAssignment_25_2(), "rule__VSVSTestCase__ValidatingItemAssignment_25_2");
					put(grammarAccess.getVSVSTestProcedureAccess().getNameAssignment_2(), "rule__VSVSTestProcedure__NameAssignment_2");
					put(grammarAccess.getVSVSTestProcedureAccess().getIdentifierAssignment_5(), "rule__VSVSTestProcedure__IdentifierAssignment_5");
					put(grammarAccess.getVSVSTestProcedureAccess().getPurposeAssignment_8(), "rule__VSVSTestProcedure__PurposeAssignment_8");
					put(grammarAccess.getVSVSTestProcedureAccess().getScenarioAssignment_12(), "rule__VSVSTestProcedure__ScenarioAssignment_12");
					put(grammarAccess.getVSVSTestProcedureAccess().getTestCaseAssignment_14_2(), "rule__VSVSTestProcedure__TestCaseAssignment_14_2");
					put(grammarAccess.getVSVSTestProcedureAccess().getProcedureStepsAssignment_15(), "rule__VSVSTestProcedure__ProcedureStepsAssignment_15");
					put(grammarAccess.getVSVSTestProcedureAccess().getTestScriptAssignment_17(), "rule__VSVSTestProcedure__TestScriptAssignment_17");
					put(grammarAccess.getVSVSProcedureStepsAccess().getStepAssignment_2(), "rule__VSVSProcedureSteps__StepAssignment_2");
					put(grammarAccess.getVSVSProcedureStepAccess().getNameAssignment_2(), "rule__VSVSProcedureStep__NameAssignment_2");
					put(grammarAccess.getVSVSProcedureStepAccess().getPrev_stepAssignment_3_1(), "rule__VSVSProcedureStep__Prev_stepAssignment_3_1");
					put(grammarAccess.getVSVSProcedureStepAccess().getPrev_tm_from_prev_stepAssignment_3_3(), "rule__VSVSProcedureStep__Prev_tm_from_prev_stepAssignment_3_3");
					put(grammarAccess.getVSVSProcedureStepAccess().getReplaysAssignment_4_1(), "rule__VSVSProcedureStep__ReplaysAssignment_4_1");
					put(grammarAccess.getVSVSProcedureStepAccess().getConfigurationsAssignment_6(), "rule__VSVSProcedureStep__ConfigurationsAssignment_6");
					put(grammarAccess.getVSVSProcedureStepAccess().getInputsAssignment_7(), "rule__VSVSProcedureStep__InputsAssignment_7");
					put(grammarAccess.getVSVSProcedureStepAccess().getOutputsAssignment_8(), "rule__VSVSProcedureStep__OutputsAssignment_8");
					put(grammarAccess.getVSVSStepConfigurationsAccess().getConfigurationAssignment_2(), "rule__VSVSStepConfigurations__ConfigurationAssignment_2");
					put(grammarAccess.getVSVSStepConfigurationAccess().getConfigurationAssignment_2(), "rule__VSVSStepConfiguration__ConfigurationAssignment_2");
					put(grammarAccess.getVSVSStepConfigurationAccess().getFilterStatusAssignment_3_1(), "rule__VSVSStepConfiguration__FilterStatusAssignment_3_1");
					put(grammarAccess.getVSVSStepConfigurationAccess().getPrintStatusAssignment_4_1(), "rule__VSVSStepConfiguration__PrintStatusAssignment_4_1");
					put(grammarAccess.getVSVSStepActionAccess().getSelectedActionAssignment_2(), "rule__VSVSStepAction__SelectedActionAssignment_2");
					put(grammarAccess.getVSVSStepActionAccess().getDelay_valueAssignment_3_1(), "rule__VSVSStepAction__Delay_valueAssignment_3_1");
					put(grammarAccess.getVSVSStepActionAccess().getDelay_unitAssignment_3_3(), "rule__VSVSStepAction__Delay_unitAssignment_3_3");
					put(grammarAccess.getVSVSStepActionAccess().getSpan_valueAssignment_4_1(), "rule__VSVSStepAction__Span_valueAssignment_4_1");
					put(grammarAccess.getVSVSStepActionAccess().getSpan_unitAssignment_4_3(), "rule__VSVSStepAction__Span_unitAssignment_4_3");
					put(grammarAccess.getVSVSStepTelecommandSequenceAccess().getTelecommandAssignment_2(), "rule__VSVSStepTelecommandSequence__TelecommandAssignment_2");
					put(grammarAccess.getVSVSStepTelecommandAccess().getNameAssignment_2(), "rule__VSVSStepTelecommand__NameAssignment_2");
					put(grammarAccess.getVSVSStepTelecommandAccess().getInterfaceAssignment_4(), "rule__VSVSStepTelecommand__InterfaceAssignment_4");
					put(grammarAccess.getVSVSStepTelecommandAccess().getDelay_valueAssignment_5_1(), "rule__VSVSStepTelecommand__Delay_valueAssignment_5_1");
					put(grammarAccess.getVSVSStepTelecommandAccess().getDelay_unitAssignment_5_3(), "rule__VSVSStepTelecommand__Delay_unitAssignment_5_3");
					put(grammarAccess.getVSVSStepTelecommandAccess().getTcDataAssignment_7(), "rule__VSVSStepTelecommand__TcDataAssignment_7");
					put(grammarAccess.getVSVSStepTelecommandAccess().getTcHeaderAssignment_8(), "rule__VSVSStepTelecommand__TcHeaderAssignment_8");
					put(grammarAccess.getVSVSStepTelecommandDataAccess().getTcTemplateAssignment_2(), "rule__VSVSStepTelecommandData__TcTemplateAssignment_2");
					put(grammarAccess.getVSVSStepTelecommandDataAccess().getFieldsAssignment_3_0_1(), "rule__VSVSStepTelecommandData__FieldsAssignment_3_0_1");
					put(grammarAccess.getVSVSStepTelecommandDataFieldAccess().getFieldRefAssignment_2(), "rule__VSVSStepTelecommandDataField__FieldRefAssignment_2");
					put(grammarAccess.getVSVSStepTelecommandDataFieldAccess().getValueAssignment_4(), "rule__VSVSStepTelecommandDataField__ValueAssignment_4");
					put(grammarAccess.getVSVSStepTelecommandHeaderAccess().getFieldsAssignment_1(), "rule__VSVSStepTelecommandHeader__FieldsAssignment_1");
					put(grammarAccess.getVSVSStepTelecommandHeaderFieldAccess().getFieldRefAssignment_2(), "rule__VSVSStepTelecommandHeaderField__FieldRefAssignment_2");
					put(grammarAccess.getVSVSStepTelecommandHeaderFieldAccess().getValueAssignment_4(), "rule__VSVSStepTelecommandHeaderField__ValueAssignment_4");
					put(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2(), "rule__TMTCIFFieldValueRaw__ValueAssignment_2");
					put(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameAssignment_2(), "rule__TMTCIFFieldValueFile__FilenameAssignment_2");
					put(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefAssignment_2(), "rule__TMTCIFFieldValueEnum__EnumRefAssignment_2");
					put(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefAssignment_4(), "rule__TMTCIFFieldValueEnum__ValueRefAssignment_4");
					put(grammarAccess.getVSVSStepTelemetrySetAccess().getCheckmodeAssignment_2(), "rule__VSVSStepTelemetrySet__CheckmodeAssignment_2");
					put(grammarAccess.getVSVSStepTelemetrySetAccess().getValid_time_interval_valueAssignment_4(), "rule__VSVSStepTelemetrySet__Valid_time_interval_valueAssignment_4");
					put(grammarAccess.getVSVSStepTelemetrySetAccess().getValid_time_interval_unitAssignment_6(), "rule__VSVSStepTelemetrySet__Valid_time_interval_unitAssignment_6");
					put(grammarAccess.getVSVSStepTelemetrySetAccess().getTelemetryAssignment_8(), "rule__VSVSStepTelemetrySet__TelemetryAssignment_8");
					put(grammarAccess.getVSVSStepTelemetryAccess().getNameAssignment_2(), "rule__VSVSStepTelemetry__NameAssignment_2");
					put(grammarAccess.getVSVSStepTelemetryAccess().getInterfaceAssignment_4(), "rule__VSVSStepTelemetry__InterfaceAssignment_4");
					put(grammarAccess.getVSVSStepTelemetryAccess().getTmDataAssignment_6(), "rule__VSVSStepTelemetry__TmDataAssignment_6");
					put(grammarAccess.getVSVSStepTelemetryAccess().getTmHeaderAssignment_7(), "rule__VSVSStepTelemetry__TmHeaderAssignment_7");
					put(grammarAccess.getVSVSStepTelemetryDataAccess().getTmTemplateAssignment_2(), "rule__VSVSStepTelemetryData__TmTemplateAssignment_2");
					put(grammarAccess.getVSVSStepTelemetryDataAccess().getFieldsAssignment_3_0_1(), "rule__VSVSStepTelemetryData__FieldsAssignment_3_0_1");
					put(grammarAccess.getVSVSStepTelemetryDataFieldAccess().getFieldRefAssignment_2(), "rule__VSVSStepTelemetryDataField__FieldRefAssignment_2");
					put(grammarAccess.getVSVSStepTelemetryDataFieldAccess().getValueAssignment_4(), "rule__VSVSStepTelemetryDataField__ValueAssignment_4");
					put(grammarAccess.getVSVSStepTelemetryHeaderAccess().getFieldsAssignment_1(), "rule__VSVSStepTelemetryHeader__FieldsAssignment_1");
					put(grammarAccess.getVSVSStepTelemetryHeaderFieldAccess().getFieldRefAssignment_2(), "rule__VSVSStepTelemetryHeaderField__FieldRefAssignment_2");
					put(grammarAccess.getVSVSStepTelemetryHeaderFieldAccess().getValueAssignment_4(), "rule__VSVSStepTelemetryHeaderField__ValueAssignment_4");
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
