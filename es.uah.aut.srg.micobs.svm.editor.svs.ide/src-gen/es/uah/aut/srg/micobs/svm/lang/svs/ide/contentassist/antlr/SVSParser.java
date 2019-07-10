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
					put(grammarAccess.getVSVSStepInputsAccess().getAlternatives_2(), "rule__VSVSStepInputs__Alternatives_2");
					put(grammarAccess.getVSVSStepOutputsAccess().getAlternatives_8(), "rule__VSVSStepOutputs__Alternatives_8");
					put(grammarAccess.getVSVSStepSpecialPacketsAccess().getAlternatives_2(), "rule__VSVSStepSpecialPackets__Alternatives_2");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getVSVSStepModeAccess().getAlternatives(), "rule__VSVSStepMode__Alternatives");
					put(grammarAccess.getVSVSStepUnitAccess().getAlternatives(), "rule__VSVSStepUnit__Alternatives");
					put(grammarAccess.getVSVSStepCheckmodeAccess().getAlternatives(), "rule__VSVSStepCheckmode__Alternatives");
					put(grammarAccess.getVSVSStepYesNoAccess().getAlternatives(), "rule__VSVSStepYesNo__Alternatives");
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
					put(grammarAccess.getVSVSTestProcedureAccess().getGroup_10(), "rule__VSVSTestProcedure__Group_10__0");
					put(grammarAccess.getVSVSProcedureStepsAccess().getGroup(), "rule__VSVSProcedureSteps__Group__0");
					put(grammarAccess.getVSVSProcedureStepAccess().getGroup(), "rule__VSVSProcedureStep__Group__0");
					put(grammarAccess.getVSVSProcedureStepAccess().getGroup_5(), "rule__VSVSProcedureStep__Group_5__0");
					put(grammarAccess.getVSVSProcedureStepAccess().getGroup_6(), "rule__VSVSProcedureStep__Group_6__0");
					put(grammarAccess.getVSVSProcedureStepAccess().getGroup_9(), "rule__VSVSProcedureStep__Group_9__0");
					put(grammarAccess.getVSVSStepInputsAccess().getGroup(), "rule__VSVSStepInputs__Group__0");
					put(grammarAccess.getVSVSStepOutputsAccess().getGroup(), "rule__VSVSStepOutputs__Group__0");
					put(grammarAccess.getVSVSStepSpecialPacketsAccess().getGroup(), "rule__VSVSStepSpecialPackets__Group__0");
					put(grammarAccess.getVSVSStepConcurrentStepsAccess().getGroup(), "rule__VSVSStepConcurrentSteps__Group__0");
					put(grammarAccess.getVSVSStepInputLevel3Access().getGroup(), "rule__VSVSStepInputLevel3__Group__0");
					put(grammarAccess.getVSVSStepInputLevel3Access().getGroup_10(), "rule__VSVSStepInputLevel3__Group_10__0");
					put(grammarAccess.getVSVSStepInputLevel3Access().getGroup_14(), "rule__VSVSStepInputLevel3__Group_14__0");
					put(grammarAccess.getVSVSStepInputLevel3Access().getGroup_15(), "rule__VSVSStepInputLevel3__Group_15__0");
					put(grammarAccess.getVSVSStepInputLevel3Access().getGroup_16(), "rule__VSVSStepInputLevel3__Group_16__0");
					put(grammarAccess.getVSVSStepInputLevel3Access().getGroup_17(), "rule__VSVSStepInputLevel3__Group_17__0");
					put(grammarAccess.getVSVSStepInputLevel3Access().getGroup_18(), "rule__VSVSStepInputLevel3__Group_18__0");
					put(grammarAccess.getVSVSStepInputLevel3Access().getGroup_19(), "rule__VSVSStepInputLevel3__Group_19__0");
					put(grammarAccess.getVSVSStepInputLevel2Access().getGroup(), "rule__VSVSStepInputLevel2__Group__0");
					put(grammarAccess.getVSVSStepInputLevel2Access().getGroup_10(), "rule__VSVSStepInputLevel2__Group_10__0");
					put(grammarAccess.getVSVSStepInputLevel2Access().getGroup_15(), "rule__VSVSStepInputLevel2__Group_15__0");
					put(grammarAccess.getVSVSStepInputLevel2Access().getGroup_16(), "rule__VSVSStepInputLevel2__Group_16__0");
					put(grammarAccess.getVSVSStepInputLevel2Access().getGroup_17(), "rule__VSVSStepInputLevel2__Group_17__0");
					put(grammarAccess.getVSVSStepInputLevel2Access().getGroup_18(), "rule__VSVSStepInputLevel2__Group_18__0");
					put(grammarAccess.getVSVSStepInputLevel1Access().getGroup(), "rule__VSVSStepInputLevel1__Group__0");
					put(grammarAccess.getVSVSStepInputLevel1Access().getGroup_10(), "rule__VSVSStepInputLevel1__Group_10__0");
					put(grammarAccess.getVSVSStepInputLevel1Access().getGroup_15(), "rule__VSVSStepInputLevel1__Group_15__0");
					put(grammarAccess.getVSVSStepInputLevel1Access().getGroup_16(), "rule__VSVSStepInputLevel1__Group_16__0");
					put(grammarAccess.getVSVSStepInputLevel0Access().getGroup(), "rule__VSVSStepInputLevel0__Group__0");
					put(grammarAccess.getVSVSStepInputLevel0Access().getGroup_10(), "rule__VSVSStepInputLevel0__Group_10__0");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getGroup(), "rule__VSVSStepOutputLevel3__Group__0");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getGroup_7(), "rule__VSVSStepOutputLevel3__Group_7__0");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getGroup_9(), "rule__VSVSStepOutputLevel3__Group_9__0");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getGroup_11(), "rule__VSVSStepOutputLevel3__Group_11__0");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getGroup_12(), "rule__VSVSStepOutputLevel3__Group_12__0");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getGroup_14(), "rule__VSVSStepOutputLevel3__Group_14__0");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getGroup_15(), "rule__VSVSStepOutputLevel3__Group_15__0");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getGroup_17(), "rule__VSVSStepOutputLevel3__Group_17__0");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getGroup_18(), "rule__VSVSStepOutputLevel3__Group_18__0");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getGroup(), "rule__VSVSStepOutputLevel2__Group__0");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getGroup_7(), "rule__VSVSStepOutputLevel2__Group_7__0");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getGroup_9(), "rule__VSVSStepOutputLevel2__Group_9__0");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getGroup_11(), "rule__VSVSStepOutputLevel2__Group_11__0");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getGroup_12(), "rule__VSVSStepOutputLevel2__Group_12__0");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getGroup_14(), "rule__VSVSStepOutputLevel2__Group_14__0");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getGroup_15(), "rule__VSVSStepOutputLevel2__Group_15__0");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getGroup(), "rule__VSVSStepOutputLevel1__Group__0");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getGroup_7(), "rule__VSVSStepOutputLevel1__Group_7__0");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getGroup_9(), "rule__VSVSStepOutputLevel1__Group_9__0");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getGroup_11(), "rule__VSVSStepOutputLevel1__Group_11__0");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getGroup_12(), "rule__VSVSStepOutputLevel1__Group_12__0");
					put(grammarAccess.getVSVSStepOutputLevel0Access().getGroup(), "rule__VSVSStepOutputLevel0__Group__0");
					put(grammarAccess.getVSVSStepOutputLevel0Access().getGroup_7(), "rule__VSVSStepOutputLevel0__Group_7__0");
					put(grammarAccess.getVSVSStepOutputLevel0Access().getGroup_9(), "rule__VSVSStepOutputLevel0__Group_9__0");
					put(grammarAccess.getVSVSStepLevel3FilterAccess().getGroup(), "rule__VSVSStepLevel3Filter__Group__0");
					put(grammarAccess.getVSVSStepLevel3FilterAccess().getGroup_4(), "rule__VSVSStepLevel3Filter__Group_4__0");
					put(grammarAccess.getVSVSStepLevel2FilterAccess().getGroup(), "rule__VSVSStepLevel2Filter__Group__0");
					put(grammarAccess.getVSVSStepLevel2FilterAccess().getGroup_4(), "rule__VSVSStepLevel2Filter__Group_4__0");
					put(grammarAccess.getVSVSStepLevel1FilterAccess().getGroup(), "rule__VSVSStepLevel1Filter__Group__0");
					put(grammarAccess.getVSVSStepLevel1FilterAccess().getGroup_4(), "rule__VSVSStepLevel1Filter__Group_4__0");
					put(grammarAccess.getVSVSStepLevel0FilterAccess().getGroup(), "rule__VSVSStepLevel0Filter__Group__0");
					put(grammarAccess.getVSVSStepLevel0FilterAccess().getGroup_4(), "rule__VSVSStepLevel0Filter__Group_4__0");
					put(grammarAccess.getVSVSStepEnableAccess().getGroup(), "rule__VSVSStepEnable__Group__0");
					put(grammarAccess.getVSVSStepDisableAccess().getGroup(), "rule__VSVSStepDisable__Group__0");
					put(grammarAccess.getVSVSStepEnablePrintAccess().getGroup(), "rule__VSVSStepEnablePrint__Group__0");
					put(grammarAccess.getVSVSStepDisablePrintAccess().getGroup(), "rule__VSVSStepDisablePrint__Group__0");
					put(grammarAccess.getVSVSStepNextStepAccess().getGroup(), "rule__VSVSStepNextStep__Group__0");
					put(grammarAccess.getVSVSStepConcurrentStepAccess().getGroup(), "rule__VSVSStepConcurrentStep__Group__0");
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
					put(grammarAccess.getVSVSTestProcedureAccess().getTestCaseAssignment_10_2(), "rule__VSVSTestProcedure__TestCaseAssignment_10_2");
					put(grammarAccess.getVSVSTestProcedureAccess().getProcedureStepsAssignment_11(), "rule__VSVSTestProcedure__ProcedureStepsAssignment_11");
					put(grammarAccess.getVSVSTestProcedureAccess().getTestScriptAssignment_13(), "rule__VSVSTestProcedure__TestScriptAssignment_13");
					put(grammarAccess.getVSVSProcedureStepsAccess().getNameAssignment_2(), "rule__VSVSProcedureSteps__NameAssignment_2");
					put(grammarAccess.getVSVSProcedureStepsAccess().getStepAssignment_4(), "rule__VSVSProcedureSteps__StepAssignment_4");
					put(grammarAccess.getVSVSProcedureStepAccess().getNameAssignment_2(), "rule__VSVSProcedureStep__NameAssignment_2");
					put(grammarAccess.getVSVSProcedureStepAccess().getIdAssignment_4(), "rule__VSVSProcedureStep__IdAssignment_4");
					put(grammarAccess.getVSVSProcedureStepAccess().getPrev_step_idrefAssignment_5_1(), "rule__VSVSProcedureStep__Prev_step_idrefAssignment_5_1");
					put(grammarAccess.getVSVSProcedureStepAccess().getOutput_idref_from_prev_stepAssignment_6_1(), "rule__VSVSProcedureStep__Output_idref_from_prev_stepAssignment_6_1");
					put(grammarAccess.getVSVSProcedureStepAccess().getModeAssignment_8(), "rule__VSVSProcedureStep__ModeAssignment_8");
					put(grammarAccess.getVSVSProcedureStepAccess().getReplaysAssignment_9_1(), "rule__VSVSProcedureStep__ReplaysAssignment_9_1");
					put(grammarAccess.getVSVSProcedureStepAccess().getInputsAssignment_11(), "rule__VSVSProcedureStep__InputsAssignment_11");
					put(grammarAccess.getVSVSProcedureStepAccess().getOutputsAssignment_12(), "rule__VSVSProcedureStep__OutputsAssignment_12");
					put(grammarAccess.getVSVSProcedureStepAccess().getSpecialPacketsAssignment_13(), "rule__VSVSProcedureStep__SpecialPacketsAssignment_13");
					put(grammarAccess.getVSVSProcedureStepAccess().getConcurrent_stepsAssignment_14(), "rule__VSVSProcedureStep__Concurrent_stepsAssignment_14");
					put(grammarAccess.getVSVSStepInputsAccess().getInput_level_3Assignment_2_0(), "rule__VSVSStepInputs__Input_level_3Assignment_2_0");
					put(grammarAccess.getVSVSStepInputsAccess().getInput_level_2Assignment_2_1(), "rule__VSVSStepInputs__Input_level_2Assignment_2_1");
					put(grammarAccess.getVSVSStepInputsAccess().getInput_level_1Assignment_2_2(), "rule__VSVSStepInputs__Input_level_1Assignment_2_2");
					put(grammarAccess.getVSVSStepInputsAccess().getInput_level_0Assignment_2_3(), "rule__VSVSStepInputs__Input_level_0Assignment_2_3");
					put(grammarAccess.getVSVSStepOutputsAccess().getCheckmodeAssignment_2(), "rule__VSVSStepOutputs__CheckmodeAssignment_2");
					put(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_valueAssignment_4(), "rule__VSVSStepOutputs__Valid_time_interval_valueAssignment_4");
					put(grammarAccess.getVSVSStepOutputsAccess().getValid_time_interval_unitAssignment_6(), "rule__VSVSStepOutputs__Valid_time_interval_unitAssignment_6");
					put(grammarAccess.getVSVSStepOutputsAccess().getOutput_level_3Assignment_8_0(), "rule__VSVSStepOutputs__Output_level_3Assignment_8_0");
					put(grammarAccess.getVSVSStepOutputsAccess().getOutput_level_2Assignment_8_1(), "rule__VSVSStepOutputs__Output_level_2Assignment_8_1");
					put(grammarAccess.getVSVSStepOutputsAccess().getOutput_level_1Assignment_8_2(), "rule__VSVSStepOutputs__Output_level_1Assignment_8_2");
					put(grammarAccess.getVSVSStepOutputsAccess().getOutput_level_0Assignment_8_3(), "rule__VSVSStepOutputs__Output_level_0Assignment_8_3");
					put(grammarAccess.getVSVSStepSpecialPacketsAccess().getEnableAssignment_2_0(), "rule__VSVSStepSpecialPackets__EnableAssignment_2_0");
					put(grammarAccess.getVSVSStepSpecialPacketsAccess().getDisableAssignment_2_1(), "rule__VSVSStepSpecialPackets__DisableAssignment_2_1");
					put(grammarAccess.getVSVSStepSpecialPacketsAccess().getEnable_printAssignment_2_2(), "rule__VSVSStepSpecialPackets__Enable_printAssignment_2_2");
					put(grammarAccess.getVSVSStepSpecialPacketsAccess().getDisable_printAssignment_2_3(), "rule__VSVSStepSpecialPackets__Disable_printAssignment_2_3");
					put(grammarAccess.getVSVSStepConcurrentStepsAccess().getNextStepAssignment_2(), "rule__VSVSStepConcurrentSteps__NextStepAssignment_2");
					put(grammarAccess.getVSVSStepConcurrentStepsAccess().getConcurrent_stepAssignment_5(), "rule__VSVSStepConcurrentSteps__Concurrent_stepAssignment_5");
					put(grammarAccess.getVSVSStepInputLevel3Access().getNameAssignment_2(), "rule__VSVSStepInputLevel3__NameAssignment_2");
					put(grammarAccess.getVSVSStepInputLevel3Access().getIfRefAssignment_4(), "rule__VSVSStepInputLevel3__IfRefAssignment_4");
					put(grammarAccess.getVSVSStepInputLevel3Access().getDelay_valueAssignment_6(), "rule__VSVSStepInputLevel3__Delay_valueAssignment_6");
					put(grammarAccess.getVSVSStepInputLevel3Access().getDelay_unitAssignment_8(), "rule__VSVSStepInputLevel3__Delay_unitAssignment_8");
					put(grammarAccess.getVSVSStepInputLevel3Access().getLevel3Assignment_10_1(), "rule__VSVSStepInputLevel3__Level3Assignment_10_1");
					put(grammarAccess.getVSVSStepInputLevel3Access().getApp_to_level3Assignment_12(), "rule__VSVSStepInputLevel3__App_to_level3Assignment_12");
					put(grammarAccess.getVSVSStepInputLevel3Access().getLevel2Assignment_14_2(), "rule__VSVSStepInputLevel3__Level2Assignment_14_2");
					put(grammarAccess.getVSVSStepInputLevel3Access().getLevel3_to_level2Assignment_15_2(), "rule__VSVSStepInputLevel3__Level3_to_level2Assignment_15_2");
					put(grammarAccess.getVSVSStepInputLevel3Access().getLevel1Assignment_16_2(), "rule__VSVSStepInputLevel3__Level1Assignment_16_2");
					put(grammarAccess.getVSVSStepInputLevel3Access().getLevel2_to_level1Assignment_17_2(), "rule__VSVSStepInputLevel3__Level2_to_level1Assignment_17_2");
					put(grammarAccess.getVSVSStepInputLevel3Access().getLevel0Assignment_18_2(), "rule__VSVSStepInputLevel3__Level0Assignment_18_2");
					put(grammarAccess.getVSVSStepInputLevel3Access().getLevel1_to_level0Assignment_19_2(), "rule__VSVSStepInputLevel3__Level1_to_level0Assignment_19_2");
					put(grammarAccess.getVSVSStepInputLevel2Access().getNameAssignment_2(), "rule__VSVSStepInputLevel2__NameAssignment_2");
					put(grammarAccess.getVSVSStepInputLevel2Access().getIfRefAssignment_4(), "rule__VSVSStepInputLevel2__IfRefAssignment_4");
					put(grammarAccess.getVSVSStepInputLevel2Access().getDelay_valueAssignment_6(), "rule__VSVSStepInputLevel2__Delay_valueAssignment_6");
					put(grammarAccess.getVSVSStepInputLevel2Access().getDelay_unitAssignment_8(), "rule__VSVSStepInputLevel2__Delay_unitAssignment_8");
					put(grammarAccess.getVSVSStepInputLevel2Access().getLevel2Assignment_10_2(), "rule__VSVSStepInputLevel2__Level2Assignment_10_2");
					put(grammarAccess.getVSVSStepInputLevel2Access().getApp_to_level2Assignment_13(), "rule__VSVSStepInputLevel2__App_to_level2Assignment_13");
					put(grammarAccess.getVSVSStepInputLevel2Access().getLevel1Assignment_15_2(), "rule__VSVSStepInputLevel2__Level1Assignment_15_2");
					put(grammarAccess.getVSVSStepInputLevel2Access().getLevel2_to_level1Assignment_16_2(), "rule__VSVSStepInputLevel2__Level2_to_level1Assignment_16_2");
					put(grammarAccess.getVSVSStepInputLevel2Access().getLevel0Assignment_17_2(), "rule__VSVSStepInputLevel2__Level0Assignment_17_2");
					put(grammarAccess.getVSVSStepInputLevel2Access().getLevel1_to_level0Assignment_18_2(), "rule__VSVSStepInputLevel2__Level1_to_level0Assignment_18_2");
					put(grammarAccess.getVSVSStepInputLevel1Access().getNameAssignment_2(), "rule__VSVSStepInputLevel1__NameAssignment_2");
					put(grammarAccess.getVSVSStepInputLevel1Access().getIfRefAssignment_4(), "rule__VSVSStepInputLevel1__IfRefAssignment_4");
					put(grammarAccess.getVSVSStepInputLevel1Access().getDelay_valueAssignment_6(), "rule__VSVSStepInputLevel1__Delay_valueAssignment_6");
					put(grammarAccess.getVSVSStepInputLevel1Access().getDelay_unitAssignment_8(), "rule__VSVSStepInputLevel1__Delay_unitAssignment_8");
					put(grammarAccess.getVSVSStepInputLevel1Access().getLevel1Assignment_10_2(), "rule__VSVSStepInputLevel1__Level1Assignment_10_2");
					put(grammarAccess.getVSVSStepInputLevel1Access().getApp_to_level1Assignment_13(), "rule__VSVSStepInputLevel1__App_to_level1Assignment_13");
					put(grammarAccess.getVSVSStepInputLevel1Access().getLevel0Assignment_15_2(), "rule__VSVSStepInputLevel1__Level0Assignment_15_2");
					put(grammarAccess.getVSVSStepInputLevel1Access().getLevel1_to_level0Assignment_16_2(), "rule__VSVSStepInputLevel1__Level1_to_level0Assignment_16_2");
					put(grammarAccess.getVSVSStepInputLevel0Access().getNameAssignment_2(), "rule__VSVSStepInputLevel0__NameAssignment_2");
					put(grammarAccess.getVSVSStepInputLevel0Access().getIfRefAssignment_4(), "rule__VSVSStepInputLevel0__IfRefAssignment_4");
					put(grammarAccess.getVSVSStepInputLevel0Access().getDelay_valueAssignment_6(), "rule__VSVSStepInputLevel0__Delay_valueAssignment_6");
					put(grammarAccess.getVSVSStepInputLevel0Access().getDelay_unitAssignment_8(), "rule__VSVSStepInputLevel0__Delay_unitAssignment_8");
					put(grammarAccess.getVSVSStepInputLevel0Access().getLevel0Assignment_10_2(), "rule__VSVSStepInputLevel0__Level0Assignment_10_2");
					put(grammarAccess.getVSVSStepInputLevel0Access().getApp_to_level0Assignment_13(), "rule__VSVSStepInputLevel0__App_to_level0Assignment_13");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getNameAssignment_2(), "rule__VSVSStepOutputLevel3__NameAssignment_2");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getIdAssignment_4(), "rule__VSVSStepOutputLevel3__IdAssignment_4");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getIfRefAssignment_6(), "rule__VSVSStepOutputLevel3__IfRefAssignment_6");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getOptionalAssignment_7_1(), "rule__VSVSStepOutputLevel3__OptionalAssignment_7_1");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getLevel3Assignment_9_2(), "rule__VSVSStepOutputLevel3__Level3Assignment_9_2");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getLevel3_filterAssignment_10(), "rule__VSVSStepOutputLevel3__Level3_filterAssignment_10");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getLevel2Assignment_11_2(), "rule__VSVSStepOutputLevel3__Level2Assignment_11_2");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getLevel3_from_level2Assignment_12_2(), "rule__VSVSStepOutputLevel3__Level3_from_level2Assignment_12_2");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getLevel2_filterAssignment_13(), "rule__VSVSStepOutputLevel3__Level2_filterAssignment_13");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getLevel1Assignment_14_2(), "rule__VSVSStepOutputLevel3__Level1Assignment_14_2");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getLevel2_from_level1Assignment_15_2(), "rule__VSVSStepOutputLevel3__Level2_from_level1Assignment_15_2");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getLevel1_filterAssignment_16(), "rule__VSVSStepOutputLevel3__Level1_filterAssignment_16");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getLevel0Assignment_17_2(), "rule__VSVSStepOutputLevel3__Level0Assignment_17_2");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getLevel1_from_level0Assignment_18_2(), "rule__VSVSStepOutputLevel3__Level1_from_level0Assignment_18_2");
					put(grammarAccess.getVSVSStepOutputLevel3Access().getLevel0_filterAssignment_19(), "rule__VSVSStepOutputLevel3__Level0_filterAssignment_19");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getNameAssignment_2(), "rule__VSVSStepOutputLevel2__NameAssignment_2");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getIdAssignment_4(), "rule__VSVSStepOutputLevel2__IdAssignment_4");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getIfRefAssignment_6(), "rule__VSVSStepOutputLevel2__IfRefAssignment_6");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getOptionalAssignment_7_1(), "rule__VSVSStepOutputLevel2__OptionalAssignment_7_1");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getLevel2Assignment_9_2(), "rule__VSVSStepOutputLevel2__Level2Assignment_9_2");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getLevel2_filterAssignment_10(), "rule__VSVSStepOutputLevel2__Level2_filterAssignment_10");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getLevel1Assignment_11_2(), "rule__VSVSStepOutputLevel2__Level1Assignment_11_2");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getLevel2_from_level1Assignment_12_2(), "rule__VSVSStepOutputLevel2__Level2_from_level1Assignment_12_2");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getLevel1_filterAssignment_13(), "rule__VSVSStepOutputLevel2__Level1_filterAssignment_13");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getLevel0Assignment_14_2(), "rule__VSVSStepOutputLevel2__Level0Assignment_14_2");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getLevel1_from_level0Assignment_15_2(), "rule__VSVSStepOutputLevel2__Level1_from_level0Assignment_15_2");
					put(grammarAccess.getVSVSStepOutputLevel2Access().getLevel0_filterAssignment_16(), "rule__VSVSStepOutputLevel2__Level0_filterAssignment_16");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getNameAssignment_2(), "rule__VSVSStepOutputLevel1__NameAssignment_2");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getIdAssignment_4(), "rule__VSVSStepOutputLevel1__IdAssignment_4");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getIfRefAssignment_6(), "rule__VSVSStepOutputLevel1__IfRefAssignment_6");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getOptionalAssignment_7_1(), "rule__VSVSStepOutputLevel1__OptionalAssignment_7_1");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getLevel1Assignment_9_2(), "rule__VSVSStepOutputLevel1__Level1Assignment_9_2");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getLevel1_filterAssignment_10(), "rule__VSVSStepOutputLevel1__Level1_filterAssignment_10");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getLevel0Assignment_11_2(), "rule__VSVSStepOutputLevel1__Level0Assignment_11_2");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getLevel1_from_level0Assignment_12_2(), "rule__VSVSStepOutputLevel1__Level1_from_level0Assignment_12_2");
					put(grammarAccess.getVSVSStepOutputLevel1Access().getLevel0_filterAssignment_13(), "rule__VSVSStepOutputLevel1__Level0_filterAssignment_13");
					put(grammarAccess.getVSVSStepOutputLevel0Access().getNameAssignment_2(), "rule__VSVSStepOutputLevel0__NameAssignment_2");
					put(grammarAccess.getVSVSStepOutputLevel0Access().getIdAssignment_4(), "rule__VSVSStepOutputLevel0__IdAssignment_4");
					put(grammarAccess.getVSVSStepOutputLevel0Access().getIfRefAssignment_6(), "rule__VSVSStepOutputLevel0__IfRefAssignment_6");
					put(grammarAccess.getVSVSStepOutputLevel0Access().getOptionalAssignment_7_1(), "rule__VSVSStepOutputLevel0__OptionalAssignment_7_1");
					put(grammarAccess.getVSVSStepOutputLevel0Access().getLevel0Assignment_9_2(), "rule__VSVSStepOutputLevel0__Level0Assignment_9_2");
					put(grammarAccess.getVSVSStepOutputLevel0Access().getLevel0_filterAssignment_10(), "rule__VSVSStepOutputLevel0__Level0_filterAssignment_10");
					put(grammarAccess.getVSVSStepLevel3FilterAccess().getApply_def_filterAssignment_2(), "rule__VSVSStepLevel3Filter__Apply_def_filterAssignment_2");
					put(grammarAccess.getVSVSStepLevel3FilterAccess().getExtra_filterAssignment_4_1(), "rule__VSVSStepLevel3Filter__Extra_filterAssignment_4_1");
					put(grammarAccess.getVSVSStepLevel2FilterAccess().getApply_def_filterAssignment_2(), "rule__VSVSStepLevel2Filter__Apply_def_filterAssignment_2");
					put(grammarAccess.getVSVSStepLevel2FilterAccess().getExtra_filterAssignment_4_1(), "rule__VSVSStepLevel2Filter__Extra_filterAssignment_4_1");
					put(grammarAccess.getVSVSStepLevel1FilterAccess().getApply_def_filterAssignment_2(), "rule__VSVSStepLevel1Filter__Apply_def_filterAssignment_2");
					put(grammarAccess.getVSVSStepLevel1FilterAccess().getExtra_filterAssignment_4_1(), "rule__VSVSStepLevel1Filter__Extra_filterAssignment_4_1");
					put(grammarAccess.getVSVSStepLevel0FilterAccess().getApply_def_filterAssignment_2(), "rule__VSVSStepLevel0Filter__Apply_def_filterAssignment_2");
					put(grammarAccess.getVSVSStepLevel0FilterAccess().getExtra_filterAssignment_4_1(), "rule__VSVSStepLevel0Filter__Extra_filterAssignment_4_1");
					put(grammarAccess.getVSVSStepEnableAccess().getIdAssignment_2(), "rule__VSVSStepEnable__IdAssignment_2");
					put(grammarAccess.getVSVSStepDisableAccess().getIdAssignment_2(), "rule__VSVSStepDisable__IdAssignment_2");
					put(grammarAccess.getVSVSStepEnablePrintAccess().getIdAssignment_2(), "rule__VSVSStepEnablePrint__IdAssignment_2");
					put(grammarAccess.getVSVSStepDisablePrintAccess().getIdAssignment_2(), "rule__VSVSStepDisablePrint__IdAssignment_2");
					put(grammarAccess.getVSVSStepNextStepAccess().getIdAssignment_2(), "rule__VSVSStepNextStep__IdAssignment_2");
					put(grammarAccess.getVSVSStepNextStepAccess().getIsConcurrentAssignment_5(), "rule__VSVSStepNextStep__IsConcurrentAssignment_5");
					put(grammarAccess.getVSVSStepConcurrentStepAccess().getIdAssignment_2(), "rule__VSVSStepConcurrentStep__IdAssignment_2");
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
