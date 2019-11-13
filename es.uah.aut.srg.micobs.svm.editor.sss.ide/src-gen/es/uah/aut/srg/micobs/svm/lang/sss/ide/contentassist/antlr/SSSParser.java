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
package es.uah.aut.srg.micobs.svm.lang.sss.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.sss.ide.contentassist.antlr.internal.InternalSSSParser;
import es.uah.aut.srg.micobs.svm.lang.sss.services.SSSGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class SSSParser extends AbstractContentAssistParser {

	@Inject
	private SSSGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSSSParser createParser() {
		InternalSSSParser result = new InternalSSSParser(null);
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
					put(grammarAccess.getDAlignmentAccess().getAlternatives(), "rule__DAlignment__Alternatives");
					put(grammarAccess.getDRunAttributesAccess().getAlternatives(), "rule__DRunAttributes__Alternatives");
					put(grammarAccess.getVValidationMethodAccess().getAlternatives(), "rule__VValidationMethod__Alternatives");
					put(grammarAccess.getVSSSDocumentAccess().getGroup(), "rule__VSSSDocument__Group__0");
					put(grammarAccess.getDBodyAccess().getGroup(), "rule__DBody__Group__0");
					put(grammarAccess.getDParagraphAccess().getGroup(), "rule__DParagraph__Group__0");
					put(grammarAccess.getDParagraphAccess().getGroup_1(), "rule__DParagraph__Group_1__0");
					put(grammarAccess.getDParagraphAccess().getGroup_2(), "rule__DParagraph__Group_2__0");
					put(grammarAccess.getDListItemAccess().getGroup(), "rule__DListItem__Group__0");
					put(grammarAccess.getDListItemAccess().getGroup_2(), "rule__DListItem__Group_2__0");
					put(grammarAccess.getDItemizeAccess().getGroup(), "rule__DItemize__Group__0");
					put(grammarAccess.getDItemizeAccess().getGroup_1(), "rule__DItemize__Group_1__0");
					put(grammarAccess.getDItemizeAccess().getGroup_2(), "rule__DItemize__Group_2__0");
					put(grammarAccess.getDEnumerateAccess().getGroup(), "rule__DEnumerate__Group__0");
					put(grammarAccess.getDEnumerateAccess().getGroup_1(), "rule__DEnumerate__Group_1__0");
					put(grammarAccess.getDEnumerateAccess().getGroup_2(), "rule__DEnumerate__Group_2__0");
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
					put(grammarAccess.getDTableFromFileAccess().getGroup(), "rule__DTableFromFile__Group__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_9(), "rule__DTableFromFile__Group_9__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_10(), "rule__DTableFromFile__Group_10__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_11(), "rule__DTableFromFile__Group_11__0");
					put(grammarAccess.getDBasicTableAccess().getGroup(), "rule__DBasicTable__Group__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_3(), "rule__DBasicTable__Group_3__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_4(), "rule__DBasicTable__Group_4__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_5(), "rule__DBasicTable__Group_5__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_6(), "rule__DBasicTable__Group_6__0");
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
					put(grammarAccess.getVSSSFixedSectionAccess().getGroup(), "rule__VSSSFixedSection__Group__0");
					put(grammarAccess.getVSSSInstatiableSectionAccess().getGroup(), "rule__VSSSInstatiableSection__Group__0");
					put(grammarAccess.getVSSSIntroductionAccess().getGroup(), "rule__VSSSIntroduction__Group__0");
					put(grammarAccess.getVSSSApplicableDocumentsAccess().getGroup(), "rule__VSSSApplicableDocuments__Group__0");
					put(grammarAccess.getVSSSReferenceDocumentsAccess().getGroup(), "rule__VSSSReferenceDocuments__Group__0");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup(), "rule__VSSSTermsDefinitionsAbbreviations__Group__0");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getGroup(), "rule__VSSSGeneralDescription__Group__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup(), "rule__VSSSSpecificRequirements__Group__0");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup(), "rule__VSSSVerificationValidationIntegrationRequirements__Group__0");
					put(grammarAccess.getVSSSSystemModelsAccess().getGroup(), "rule__VSSSSystemModels__Group__0");
					put(grammarAccess.getVSSSTermAccess().getGroup(), "rule__VSSSTerm__Group__0");
					put(grammarAccess.getVSSSDefinitionAccess().getGroup(), "rule__VSSSDefinition__Group__0");
					put(grammarAccess.getVSSSAbbreviationAccess().getGroup(), "rule__VSSSAbbreviation__Group__0");
					put(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getGroup(), "rule__VSSSInstantiableRequirementSection__Group__0");
					put(grammarAccess.getVSSSGeneralRequirementsAccess().getGroup(), "rule__VSSSGeneralRequirements__Group__0");
					put(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getGroup(), "rule__VSSSCapabilitiesRequirements__Group__0");
					put(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getGroup(), "rule__VSSSSystemInterfaceRequirements__Group__0");
					put(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getGroup(), "rule__VSSSAdaptationMissionizationRequirements__Group__0");
					put(grammarAccess.getVSSSComputerResourceRequirementsAccess().getGroup(), "rule__VSSSComputerResourceRequirements__Group__0");
					put(grammarAccess.getVSSSSecurityRequirementsAccess().getGroup(), "rule__VSSSSecurityRequirements__Group__0");
					put(grammarAccess.getVSSSSafetyRequirementsAccess().getGroup(), "rule__VSSSSafetyRequirements__Group__0");
					put(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getGroup(), "rule__VSSSReliabilityAvailabilityRequirements__Group__0");
					put(grammarAccess.getVSSSQualityRequirementsAccess().getGroup(), "rule__VSSSQualityRequirements__Group__0");
					put(grammarAccess.getVSSSDesignRequirementsAccess().getGroup(), "rule__VSSSDesignRequirements__Group__0");
					put(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getGroup(), "rule__VSSSSoftwareOperationsRequirements__Group__0");
					put(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getGroup(), "rule__VSSSSoftwareMaintenanceRequirements__Group__0");
					put(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getGroup(), "rule__VSSSSystemSoftwareObservabilityRequirements__Group__0");
					put(grammarAccess.getVSSSDocumentItemAccess().getGroup(), "rule__VSSSDocumentItem__Group__0");
					put(grammarAccess.getVSSSDocumentItemAccess().getGroup_9(), "rule__VSSSDocumentItem__Group_9__0");
					put(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getGroup(), "rule__VSSSVerificationValidationProcessRequirements__Group__0");
					put(grammarAccess.getVSSSValidationApproachAccess().getGroup(), "rule__VSSSValidationApproach__Group__0");
					put(grammarAccess.getVSSSValidationRequirementsAccess().getGroup(), "rule__VSSSValidationRequirements__Group__0");
					put(grammarAccess.getVSSSVerificationRequirementsAccess().getGroup(), "rule__VSSSVerificationRequirements__Group__0");
					put(grammarAccess.getVSSSSystemModelAccess().getGroup(), "rule__VSSSSystemModel__Group__0");
					put(grammarAccess.getVSSSDocumentAccess().getNameAssignment_2(), "rule__VSSSDocument__NameAssignment_2");
					put(grammarAccess.getVSSSDocumentAccess().getIdAssignment_4(), "rule__VSSSDocument__IdAssignment_4");
					put(grammarAccess.getVSSSDocumentAccess().getIssueAssignment_6(), "rule__VSSSDocument__IssueAssignment_6");
					put(grammarAccess.getVSSSDocumentAccess().getRevisionAssignment_8(), "rule__VSSSDocument__RevisionAssignment_8");
					put(grammarAccess.getVSSSDocumentAccess().getDateAssignment_10(), "rule__VSSSDocument__DateAssignment_10");
					put(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionAssignment_12(), "rule__VSSSDocument__IntroductionSectionAssignment_12");
					put(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionAssignment_13(), "rule__VSSSDocument__ApplicableDocumentsSectionAssignment_13");
					put(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionAssignment_14(), "rule__VSSSDocument__ReferenceDocumentsSectionAssignment_14");
					put(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_15(), "rule__VSSSDocument__TermsDefinitionsAbbreviationsSectionAssignment_15");
					put(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionAssignment_16(), "rule__VSSSDocument__GeneralDescriptionSectionAssignment_16");
					put(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionAssignment_17(), "rule__VSSSDocument__SpecificRequirementsSectionAssignment_17");
					put(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionAssignment_18(), "rule__VSSSDocument__VerificationValidationIntegrationSectionAssignment_18");
					put(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionAssignment_19(), "rule__VSSSDocument__SystemModelsSectionAssignment_19");
					put(grammarAccess.getDBodyAccess().getBodyContentAssignment_1(), "rule__DBody__BodyContentAssignment_1");
					put(grammarAccess.getDParagraphAccess().getStyleAssignment_1_1(), "rule__DParagraph__StyleAssignment_1_1");
					put(grammarAccess.getDParagraphAccess().getAlignmentAssignment_2_1(), "rule__DParagraph__AlignmentAssignment_2_1");
					put(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_4(), "rule__DParagraph__ParagraphContentAssignment_4");
					put(grammarAccess.getDListItemAccess().getParagraphAssignment_1(), "rule__DListItem__ParagraphAssignment_1");
					put(grammarAccess.getDListItemAccess().getSublistAssignment_2_1(), "rule__DListItem__SublistAssignment_2_1");
					put(grammarAccess.getDItemizeAccess().getAlignmentAssignment_1_1(), "rule__DItemize__AlignmentAssignment_1_1");
					put(grammarAccess.getDItemizeAccess().getStyleAssignment_2_1(), "rule__DItemize__StyleAssignment_2_1");
					put(grammarAccess.getDItemizeAccess().getItemsAssignment_4(), "rule__DItemize__ItemsAssignment_4");
					put(grammarAccess.getDEnumerateAccess().getAlignmentAssignment_1_1(), "rule__DEnumerate__AlignmentAssignment_1_1");
					put(grammarAccess.getDEnumerateAccess().getStyleAssignment_2_1(), "rule__DEnumerate__StyleAssignment_2_1");
					put(grammarAccess.getDEnumerateAccess().getItemsAssignment_4(), "rule__DEnumerate__ItemsAssignment_4");
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
					put(grammarAccess.getDFigureFromFileAccess().getCaptionAssignment_11_1(), "rule__DFigureFromFile__CaptionAssignment_11_1");
					put(grammarAccess.getDTableFromFileAccess().getNameAssignment_2(), "rule__DTableFromFile__NameAssignment_2");
					put(grammarAccess.getDTableFromFileAccess().getReferenceFileAssignment_4(), "rule__DTableFromFile__ReferenceFileAssignment_4");
					put(grammarAccess.getDTableFromFileAccess().getWidthAssignment_6(), "rule__DTableFromFile__WidthAssignment_6");
					put(grammarAccess.getDTableFromFileAccess().getHeightAssignment_8(), "rule__DTableFromFile__HeightAssignment_8");
					put(grammarAccess.getDTableFromFileAccess().getAlignmentAssignment_9_1(), "rule__DTableFromFile__AlignmentAssignment_9_1");
					put(grammarAccess.getDTableFromFileAccess().getStyleAssignment_10_1(), "rule__DTableFromFile__StyleAssignment_10_1");
					put(grammarAccess.getDTableFromFileAccess().getCaptionAssignment_11_1(), "rule__DTableFromFile__CaptionAssignment_11_1");
					put(grammarAccess.getDBasicTableAccess().getNameAssignment_2(), "rule__DBasicTable__NameAssignment_2");
					put(grammarAccess.getDBasicTableAccess().getWidthAssignment_3_1(), "rule__DBasicTable__WidthAssignment_3_1");
					put(grammarAccess.getDBasicTableAccess().getAlignmentAssignment_4_1(), "rule__DBasicTable__AlignmentAssignment_4_1");
					put(grammarAccess.getDBasicTableAccess().getStyleAssignment_5_1(), "rule__DBasicTable__StyleAssignment_5_1");
					put(grammarAccess.getDBasicTableAccess().getCaptionAssignment_6_1(), "rule__DBasicTable__CaptionAssignment_6_1");
					put(grammarAccess.getDBasicTableAccess().getRowsAssignment_8(), "rule__DBasicTable__RowsAssignment_8");
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
					put(grammarAccess.getVSSSFixedSectionAccess().getBodyAssignment_1(), "rule__VSSSFixedSection__BodyAssignment_1");
					put(grammarAccess.getVSSSFixedSectionAccess().getSssInstatiableSubsectionsAssignment_2(), "rule__VSSSFixedSection__SssInstatiableSubsectionsAssignment_2");
					put(grammarAccess.getVSSSInstatiableSectionAccess().getNameAssignment_2(), "rule__VSSSInstatiableSection__NameAssignment_2");
					put(grammarAccess.getVSSSInstatiableSectionAccess().getBodyAssignment_4(), "rule__VSSSInstatiableSection__BodyAssignment_4");
					put(grammarAccess.getVSSSInstatiableSectionAccess().getSssInstatiableSubsectionsAssignment_5(), "rule__VSSSInstatiableSection__SssInstatiableSubsectionsAssignment_5");
					put(grammarAccess.getVSSSIntroductionAccess().getSssInstatiableSubsectionsAssignment_1(), "rule__VSSSIntroduction__SssInstatiableSubsectionsAssignment_1");
					put(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsAssignment_2(), "rule__VSSSApplicableDocuments__ApplicableDocumentsAssignment_2");
					put(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsAssignment_2(), "rule__VSSSReferenceDocuments__ReferenceDocumentsAssignment_2");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2(), "rule__VSSSTermsDefinitionsAbbreviations__TermsAssignment_2");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3(), "rule__VSSSTermsDefinitionsAbbreviations__DefinitionsAssignment_3");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4(), "rule__VSSSTermsDefinitionsAbbreviations__AbbreviationsAssignment_4");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveAssignment_2(), "rule__VSSSGeneralDescription__ProductPerspectiveAssignment_2");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesAssignment_5(), "rule__VSSSGeneralDescription__GeneralCapabilitiesAssignment_5");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsAssignment_8(), "rule__VSSSGeneralDescription__GeneralConstraintsAssignment_8");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentAssignment_11(), "rule__VSSSGeneralDescription__OperationalEnvironmentAssignment_11");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesAssignment_14(), "rule__VSSSGeneralDescription__AssumptionsDependenciesAssignment_14");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSectionDescriptionAssignment_1(), "rule__VSSSSpecificRequirements__SectionDescriptionAssignment_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_2(), "rule__VSSSSpecificRequirements__GeneralAssignment_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_3(), "rule__VSSSSpecificRequirements__CapabilitiesAssignment_3");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_4(), "rule__VSSSSpecificRequirements__SystemInterfaceAssignment_4");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_5(), "rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_5");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_6(), "rule__VSSSSpecificRequirements__ComputerResourceAssignment_6");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_7(), "rule__VSSSSpecificRequirements__SecurityAssignment_7");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_8(), "rule__VSSSSpecificRequirements__SafetyAssignment_8");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabilityAvailabilityAssignment_9(), "rule__VSSSSpecificRequirements__ReliabilityAvailabilityAssignment_9");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_10(), "rule__VSSSSpecificRequirements__QualityAssignment_10");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_11(), "rule__VSSSSpecificRequirements__DesignAssignment_11");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_12(), "rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_12");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_13(), "rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_13");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_14(), "rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_14");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getSectionDescriptionAssignment_1(), "rule__VSSSVerificationValidationIntegrationRequirements__SectionDescriptionAssignment_1");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_2(), "rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_2");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_3(), "rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_3");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_4(), "rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_4");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_5(), "rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_5");
					put(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsAssignment_2(), "rule__VSSSSystemModels__SystemModelsAssignment_2");
					put(grammarAccess.getVSSSTermAccess().getNameAssignment_2(), "rule__VSSSTerm__NameAssignment_2");
					put(grammarAccess.getVSSSTermAccess().getDescriptionAssignment_4(), "rule__VSSSTerm__DescriptionAssignment_4");
					put(grammarAccess.getVSSSDefinitionAccess().getNameAssignment_2(), "rule__VSSSDefinition__NameAssignment_2");
					put(grammarAccess.getVSSSDefinitionAccess().getDescriptionAssignment_4(), "rule__VSSSDefinition__DescriptionAssignment_4");
					put(grammarAccess.getVSSSAbbreviationAccess().getNameAssignment_2(), "rule__VSSSAbbreviation__NameAssignment_2");
					put(grammarAccess.getVSSSAbbreviationAccess().getDescriptionAssignment_4(), "rule__VSSSAbbreviation__DescriptionAssignment_4");
					put(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getNameAssignment_2(), "rule__VSSSInstantiableRequirementSection__NameAssignment_2");
					put(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSectionDescriptionAssignment_4(), "rule__VSSSInstantiableRequirementSection__SectionDescriptionAssignment_4");
					put(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSssItemsAssignment_5(), "rule__VSSSInstantiableRequirementSection__SssItemsAssignment_5");
					put(grammarAccess.getVSSSGeneralRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSGeneralRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSGeneralRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSGeneralRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSGeneralRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSCapabilitiesRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSCapabilitiesRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSCapabilitiesRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSSystemInterfaceRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSSystemInterfaceRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSSystemInterfaceRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSAdaptationMissionizationRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSAdaptationMissionizationRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSAdaptationMissionizationRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSComputerResourceRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSComputerResourceRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSComputerResourceRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSSecurityRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSSecurityRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSSecurityRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSSecurityRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSSecurityRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSSafetyRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSSafetyRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSSafetyRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSSafetyRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSSafetyRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSReliabilityAvailabilityRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSectionDescriptionAssignment_3(), "rule__VSSSReliabilityAvailabilityRequirements__SectionDescriptionAssignment_3");
					put(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSReliabilityAvailabilityRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSQualityRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSQualityRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSQualityRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSQualityRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSQualityRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSDesignRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSDesignRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSDesignRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSDesignRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSDesignRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSSoftwareOperationsRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSSoftwareOperationsRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSSoftwareOperationsRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSSoftwareMaintenanceRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSSoftwareMaintenanceRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSSoftwareMaintenanceRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSSSSystemSoftwareObservabilityRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsAssignment_3(), "rule__VSSSSystemSoftwareObservabilityRequirements__SssItemsAssignment_3");
					put(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssRequirementSubsectionsAssignment_4(), "rule__VSSSSystemSoftwareObservabilityRequirements__SssRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSSSDocumentItemAccess().getNameAssignment_2(), "rule__VSSSDocumentItem__NameAssignment_2");
					put(grammarAccess.getVSSSDocumentItemAccess().getValidationMethodAssignment_4(), "rule__VSSSDocumentItem__ValidationMethodAssignment_4");
					put(grammarAccess.getVSSSDocumentItemAccess().getDescriptionAssignment_7(), "rule__VSSSDocumentItem__DescriptionAssignment_7");
					put(grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionAssignment_9_1(), "rule__VSSSDocumentItem__ExtendedDescriptionAssignment_9_1");
					put(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSVerificationValidationProcessRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssRequirementSubsectionsAssignment_3(), "rule__VSSSVerificationValidationProcessRequirements__SssRequirementSubsectionsAssignment_3");
					put(grammarAccess.getVSSSValidationApproachAccess().getSssItemsAssignment_2(), "rule__VSSSValidationApproach__SssItemsAssignment_2");
					put(grammarAccess.getVSSSValidationApproachAccess().getSssRequirementSubsectionsAssignment_3(), "rule__VSSSValidationApproach__SssRequirementSubsectionsAssignment_3");
					put(grammarAccess.getVSSSValidationRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSValidationRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSValidationRequirementsAccess().getSssRequirementSubsectionsAssignment_3(), "rule__VSSSValidationRequirements__SssRequirementSubsectionsAssignment_3");
					put(grammarAccess.getVSSSVerificationRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSVerificationRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSVerificationRequirementsAccess().getSssRequirementSubsectionsAssignment_3(), "rule__VSSSVerificationRequirements__SssRequirementSubsectionsAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSSSParser typedParser = (InternalSSSParser) parser;
			typedParser.entryRuleVSSSDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SSSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SSSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
