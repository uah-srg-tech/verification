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
package es.uah.aut.srg.micobs.svm.lang.srs.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.srs.ide.contentassist.antlr.internal.InternalSRSParser;
import es.uah.aut.srg.micobs.svm.lang.srs.services.SRSGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class SRSParser extends AbstractContentAssistParser {

	@Inject
	private SRSGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSRSParser createParser() {
		InternalSRSParser result = new InternalSRSParser(null);
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
					put(grammarAccess.getVValidationMethodAccess().getAlternatives(), "rule__VValidationMethod__Alternatives");
					put(grammarAccess.getVSRSDocumentAccess().getGroup(), "rule__VSRSDocument__Group__0");
					put(grammarAccess.getVSRSDocumentAccess().getGroup_20(), "rule__VSRSDocument__Group_20__0");
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
					put(grammarAccess.getVSRSFixedSectionAccess().getGroup(), "rule__VSRSFixedSection__Group__0");
					put(grammarAccess.getVSRSInstantiableSectionAccess().getGroup(), "rule__VSRSInstantiableSection__Group__0");
					put(grammarAccess.getVSRSIntroductionAccess().getGroup(), "rule__VSRSIntroduction__Group__0");
					put(grammarAccess.getVSRSApplicableDocumentsAccess().getGroup(), "rule__VSRSApplicableDocuments__Group__0");
					put(grammarAccess.getVSRSReferenceDocumentsAccess().getGroup(), "rule__VSRSReferenceDocuments__Group__0");
					put(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getGroup(), "rule__VSRSTermsDefinitionsAbbreviations__Group__0");
					put(grammarAccess.getVSRSSoftwareOverviewAccess().getGroup(), "rule__VSRSSoftwareOverview__Group__0");
					put(grammarAccess.getVSRSRequirementsAccess().getGroup(), "rule__VSRSRequirements__Group__0");
					put(grammarAccess.getVSRSTraceabiltyAccess().getGroup(), "rule__VSRSTraceabilty__Group__0");
					put(grammarAccess.getVSRSLogicalModelsAccess().getGroup(), "rule__VSRSLogicalModels__Group__0");
					put(grammarAccess.getVSRSTermAccess().getGroup(), "rule__VSRSTerm__Group__0");
					put(grammarAccess.getVSRSDefinitionAccess().getGroup(), "rule__VSRSDefinition__Group__0");
					put(grammarAccess.getVSRSAbbreviationAccess().getGroup(), "rule__VSRSAbbreviation__Group__0");
					put(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getGroup(), "rule__VSRSInstantiableRequirementSection__Group__0");
					put(grammarAccess.getVSRSGeneralRequirementsAccess().getGroup(), "rule__VSRSGeneralRequirements__Group__0");
					put(grammarAccess.getVSRSFunctionalRequirementsAccess().getGroup(), "rule__VSRSFunctionalRequirements__Group__0");
					put(grammarAccess.getVSRSPerformanceRequirementsAccess().getGroup(), "rule__VSRSPerformanceRequirements__Group__0");
					put(grammarAccess.getVSRSInterfaceRequirementsAccess().getGroup(), "rule__VSRSInterfaceRequirements__Group__0");
					put(grammarAccess.getVSRSOperationalRequirementsAccess().getGroup(), "rule__VSRSOperationalRequirements__Group__0");
					put(grammarAccess.getVSRSResourcesRequirementsAccess().getGroup(), "rule__VSRSResourcesRequirements__Group__0");
					put(grammarAccess.getVSRSDesignRequirementsAccess().getGroup(), "rule__VSRSDesignRequirements__Group__0");
					put(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getGroup(), "rule__VSRSSecurityPrivacyRequirements__Group__0");
					put(grammarAccess.getVSRSPortabilityRequirementsAccess().getGroup(), "rule__VSRSPortabilityRequirements__Group__0");
					put(grammarAccess.getVSRSSWQualityRequirementsAccess().getGroup(), "rule__VSRSSWQualityRequirements__Group__0");
					put(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getGroup(), "rule__VSRSSWReliabiltyRequirements__Group__0");
					put(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getGroup(), "rule__VSRSSWMaintainabilityRequirements__Group__0");
					put(grammarAccess.getVSRSSWSafetyRequirementsAccess().getGroup(), "rule__VSRSSWSafetyRequirements__Group__0");
					put(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getGroup(), "rule__VSRSSWConfigurationDeliveryRequirements__Group__0");
					put(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getGroup(), "rule__VSRSDataDefinitionDBRequirements__Group__0");
					put(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getGroup(), "rule__VSRSHumanFactorsRequirements__Group__0");
					put(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getGroup(), "rule__VSRSAdaptationInstallationRequirements__Group__0");
					put(grammarAccess.getVSRSDocumentItemAccess().getGroup(), "rule__VSRSDocumentItem__Group__0");
					put(grammarAccess.getVSRSDocumentItemAccess().getGroup_9(), "rule__VSRSDocumentItem__Group_9__0");
					put(grammarAccess.getVSRSLogicalModelAccess().getGroup(), "rule__VSRSLogicalModel__Group__0");
					put(grammarAccess.getVSRSDocumentAccess().getNameAssignment_2(), "rule__VSRSDocument__NameAssignment_2");
					put(grammarAccess.getVSRSDocumentAccess().getIdAssignment_4(), "rule__VSRSDocument__IdAssignment_4");
					put(grammarAccess.getVSRSDocumentAccess().getIssueAssignment_6(), "rule__VSRSDocument__IssueAssignment_6");
					put(grammarAccess.getVSRSDocumentAccess().getRevisionAssignment_8(), "rule__VSRSDocument__RevisionAssignment_8");
					put(grammarAccess.getVSRSDocumentAccess().getDateAssignment_10(), "rule__VSRSDocument__DateAssignment_10");
					put(grammarAccess.getVSRSDocumentAccess().getIntroductionSectionAssignment_12(), "rule__VSRSDocument__IntroductionSectionAssignment_12");
					put(grammarAccess.getVSRSDocumentAccess().getApplicableDocumentsSectionAssignment_13(), "rule__VSRSDocument__ApplicableDocumentsSectionAssignment_13");
					put(grammarAccess.getVSRSDocumentAccess().getReferenceDocumentsSectionAssignment_14(), "rule__VSRSDocument__ReferenceDocumentsSectionAssignment_14");
					put(grammarAccess.getVSRSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_15(), "rule__VSRSDocument__TermsDefinitionsAbbreviationsSectionAssignment_15");
					put(grammarAccess.getVSRSDocumentAccess().getGeneralDescriptionSectionAssignment_16(), "rule__VSRSDocument__GeneralDescriptionSectionAssignment_16");
					put(grammarAccess.getVSRSDocumentAccess().getRequirementsSectionAssignment_17(), "rule__VSRSDocument__RequirementsSectionAssignment_17");
					put(grammarAccess.getVSRSDocumentAccess().getTraceabiltySectionAssignment_18(), "rule__VSRSDocument__TraceabiltySectionAssignment_18");
					put(grammarAccess.getVSRSDocumentAccess().getLogicalModelsSectionAssignment_19(), "rule__VSRSDocument__LogicalModelsSectionAssignment_19");
					put(grammarAccess.getVSRSDocumentAccess().getParentsAssignment_20_2(), "rule__VSRSDocument__ParentsAssignment_20_2");
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
					put(grammarAccess.getVSRSFixedSectionAccess().getBodyAssignment_0(), "rule__VSRSFixedSection__BodyAssignment_0");
					put(grammarAccess.getVSRSFixedSectionAccess().getSrsInstatiableSubsectionsAssignment_1(), "rule__VSRSFixedSection__SrsInstatiableSubsectionsAssignment_1");
					put(grammarAccess.getVSRSInstantiableSectionAccess().getNameAssignment_2(), "rule__VSRSInstantiableSection__NameAssignment_2");
					put(grammarAccess.getVSRSInstantiableSectionAccess().getBodyAssignment_4(), "rule__VSRSInstantiableSection__BodyAssignment_4");
					put(grammarAccess.getVSRSIntroductionAccess().getSrsInstatiableSubsectionsAssignment_1(), "rule__VSRSIntroduction__SrsInstatiableSubsectionsAssignment_1");
					put(grammarAccess.getVSRSApplicableDocumentsAccess().getApplicableDocumentsAssignment_2(), "rule__VSRSApplicableDocuments__ApplicableDocumentsAssignment_2");
					put(grammarAccess.getVSRSReferenceDocumentsAccess().getReferenceDocumentsAssignment_2(), "rule__VSRSReferenceDocuments__ReferenceDocumentsAssignment_2");
					put(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2(), "rule__VSRSTermsDefinitionsAbbreviations__TermsAssignment_2");
					put(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3(), "rule__VSRSTermsDefinitionsAbbreviations__DefinitionsAssignment_3");
					put(grammarAccess.getVSRSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4(), "rule__VSRSTermsDefinitionsAbbreviations__AbbreviationsAssignment_4");
					put(grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeAssignment_2(), "rule__VSRSSoftwareOverview__FunctionPurposeAssignment_2");
					put(grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationAssignment_5(), "rule__VSRSSoftwareOverview__EnvironmentalConsiderationAssignment_5");
					put(grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsAssignment_8(), "rule__VSRSSoftwareOverview__RelationOtherSystemsAssignment_8");
					put(grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsAssignment_11(), "rule__VSRSSoftwareOverview__ConstraintsAssignment_11");
					put(grammarAccess.getVSRSRequirementsAccess().getSectionDescriptionAssignment_1(), "rule__VSRSRequirements__SectionDescriptionAssignment_1");
					put(grammarAccess.getVSRSRequirementsAccess().getGeneralAssignment_2(), "rule__VSRSRequirements__GeneralAssignment_2");
					put(grammarAccess.getVSRSRequirementsAccess().getFunctionalAssignment_3(), "rule__VSRSRequirements__FunctionalAssignment_3");
					put(grammarAccess.getVSRSRequirementsAccess().getPerformanceAssignment_4(), "rule__VSRSRequirements__PerformanceAssignment_4");
					put(grammarAccess.getVSRSRequirementsAccess().getInterfaceAssignment_5(), "rule__VSRSRequirements__InterfaceAssignment_5");
					put(grammarAccess.getVSRSRequirementsAccess().getOperationalAssignment_6(), "rule__VSRSRequirements__OperationalAssignment_6");
					put(grammarAccess.getVSRSRequirementsAccess().getResourcesAssignment_7(), "rule__VSRSRequirements__ResourcesAssignment_7");
					put(grammarAccess.getVSRSRequirementsAccess().getDesignAssignment_8(), "rule__VSRSRequirements__DesignAssignment_8");
					put(grammarAccess.getVSRSRequirementsAccess().getSecurityPrivacyAssignment_9(), "rule__VSRSRequirements__SecurityPrivacyAssignment_9");
					put(grammarAccess.getVSRSRequirementsAccess().getPortabilityAssignment_10(), "rule__VSRSRequirements__PortabilityAssignment_10");
					put(grammarAccess.getVSRSRequirementsAccess().getSwQualityAssignment_11(), "rule__VSRSRequirements__SwQualityAssignment_11");
					put(grammarAccess.getVSRSRequirementsAccess().getSwReliabiltyAssignment_12(), "rule__VSRSRequirements__SwReliabiltyAssignment_12");
					put(grammarAccess.getVSRSRequirementsAccess().getSwMaintainabilityAssignment_13(), "rule__VSRSRequirements__SwMaintainabilityAssignment_13");
					put(grammarAccess.getVSRSRequirementsAccess().getSwSafetyAssignment_14(), "rule__VSRSRequirements__SwSafetyAssignment_14");
					put(grammarAccess.getVSRSRequirementsAccess().getSwConfigurationDeliveryAssignment_15(), "rule__VSRSRequirements__SwConfigurationDeliveryAssignment_15");
					put(grammarAccess.getVSRSRequirementsAccess().getDataDefinitionDBAssignment_16(), "rule__VSRSRequirements__DataDefinitionDBAssignment_16");
					put(grammarAccess.getVSRSRequirementsAccess().getHumanFactorsAssignment_17(), "rule__VSRSRequirements__HumanFactorsAssignment_17");
					put(grammarAccess.getVSRSRequirementsAccess().getAdaptationInstallationAssignment_18(), "rule__VSRSRequirements__AdaptationInstallationAssignment_18");
					put(grammarAccess.getVSRSTraceabiltyAccess().getSectionDescriptionAssignment_1(), "rule__VSRSTraceabilty__SectionDescriptionAssignment_1");
					put(grammarAccess.getVSRSLogicalModelsAccess().getLogicalModelsAssignment_2(), "rule__VSRSLogicalModels__LogicalModelsAssignment_2");
					put(grammarAccess.getVSRSTermAccess().getNameAssignment_2(), "rule__VSRSTerm__NameAssignment_2");
					put(grammarAccess.getVSRSTermAccess().getDescriptionAssignment_4(), "rule__VSRSTerm__DescriptionAssignment_4");
					put(grammarAccess.getVSRSDefinitionAccess().getNameAssignment_2(), "rule__VSRSDefinition__NameAssignment_2");
					put(grammarAccess.getVSRSDefinitionAccess().getDescriptionAssignment_4(), "rule__VSRSDefinition__DescriptionAssignment_4");
					put(grammarAccess.getVSRSAbbreviationAccess().getNameAssignment_2(), "rule__VSRSAbbreviation__NameAssignment_2");
					put(grammarAccess.getVSRSAbbreviationAccess().getDescriptionAssignment_4(), "rule__VSRSAbbreviation__DescriptionAssignment_4");
					put(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getNameAssignment_2(), "rule__VSRSInstantiableRequirementSection__NameAssignment_2");
					put(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSectionDescriptionAssignment_4(), "rule__VSRSInstantiableRequirementSection__SectionDescriptionAssignment_4");
					put(grammarAccess.getVSRSInstantiableRequirementSectionAccess().getSrsItemsAssignment_5(), "rule__VSRSInstantiableRequirementSection__SrsItemsAssignment_5");
					put(grammarAccess.getVSRSGeneralRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSGeneralRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSGeneralRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSGeneralRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSGeneralRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSFunctionalRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSFunctionalRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSFunctionalRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSFunctionalRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSFunctionalRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSPerformanceRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSPerformanceRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSPerformanceRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSPerformanceRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSPerformanceRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSInterfaceRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSInterfaceRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSInterfaceRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSInterfaceRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSInterfaceRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSOperationalRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSOperationalRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSOperationalRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSOperationalRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSOperationalRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSResourcesRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSResourcesRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSResourcesRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSResourcesRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSResourcesRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSDesignRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSDesignRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSDesignRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSDesignRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSDesignRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSDesignRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSSecurityPrivacyRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSSecurityPrivacyRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSSecurityPrivacyRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSSecurityPrivacyRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSPortabilityRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSPortabilityRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSPortabilityRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSPortabilityRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSPortabilityRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSSWQualityRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSSWQualityRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSSWQualityRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSSWQualityRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSSWQualityRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSSWReliabiltyRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSSWReliabiltyRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSSWReliabiltyRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSSWReliabiltyRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSSWMaintainabilityRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSSWMaintainabilityRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSSWMaintainabilityRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSSWMaintainabilityRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSSWSafetyRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSSWSafetyRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSSWSafetyRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSSWSafetyRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSSWConfigurationDeliveryRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSSWConfigurationDeliveryRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSSWConfigurationDeliveryRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSSWConfigurationDeliveryRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSDataDefinitionDBRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSDataDefinitionDBRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSDataDefinitionDBRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSDataDefinitionDBRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSHumanFactorsRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSHumanFactorsRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSHumanFactorsRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSHumanFactorsRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSectionDescriptionAssignment_2(), "rule__VSRSAdaptationInstallationRequirements__SectionDescriptionAssignment_2");
					put(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsItemsAssignment_3(), "rule__VSRSAdaptationInstallationRequirements__SrsItemsAssignment_3");
					put(grammarAccess.getVSRSAdaptationInstallationRequirementsAccess().getSrsRequirementSubsectionsAssignment_4(), "rule__VSRSAdaptationInstallationRequirements__SrsRequirementSubsectionsAssignment_4");
					put(grammarAccess.getVSRSDocumentItemAccess().getNameAssignment_2(), "rule__VSRSDocumentItem__NameAssignment_2");
					put(grammarAccess.getVSRSDocumentItemAccess().getValidationMethodAssignment_4(), "rule__VSRSDocumentItem__ValidationMethodAssignment_4");
					put(grammarAccess.getVSRSDocumentItemAccess().getDescriptionAssignment_7(), "rule__VSRSDocumentItem__DescriptionAssignment_7");
					put(grammarAccess.getVSRSDocumentItemAccess().getParentItemAssignment_9_2(), "rule__VSRSDocumentItem__ParentItemAssignment_9_2");
					put(grammarAccess.getVSRSDocumentItemAccess().getExtendedDescriptionAssignment_10(), "rule__VSRSDocumentItem__ExtendedDescriptionAssignment_10");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSRSParser typedParser = (InternalSRSParser) parser;
			typedParser.entryRuleVSRSDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SRSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SRSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}