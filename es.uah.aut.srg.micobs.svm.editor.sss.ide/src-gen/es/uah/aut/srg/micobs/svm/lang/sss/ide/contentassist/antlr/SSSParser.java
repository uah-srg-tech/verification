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
					put(grammarAccess.getDReferenceableObjectAccess().getAlternatives(), "rule__DReferenceableObject__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getVVerificationMethodAccess().getAlternatives(), "rule__VVerificationMethod__Alternatives");
					put(grammarAccess.getVSSSDocumentAccess().getGroup(), "rule__VSSSDocument__Group__0");
					put(grammarAccess.getDBodyAccess().getGroup(), "rule__DBody__Group__0");
					put(grammarAccess.getDParagraphAccess().getGroup(), "rule__DParagraph__Group__0");
					put(grammarAccess.getDListItemAccess().getGroup(), "rule__DListItem__Group__0");
					put(grammarAccess.getDListItemAccess().getGroup_2(), "rule__DListItem__Group_2__0");
					put(grammarAccess.getDItemizeAccess().getGroup(), "rule__DItemize__Group__0");
					put(grammarAccess.getDEnumerateAccess().getGroup(), "rule__DEnumerate__Group__0");
					put(grammarAccess.getDRunAccess().getGroup(), "rule__DRun__Group__0");
					put(grammarAccess.getDHyperlinkAccess().getGroup(), "rule__DHyperlink__Group__0");
					put(grammarAccess.getDFigureAccess().getGroup(), "rule__DFigure__Group__0");
					put(grammarAccess.getDPictureAsTableAccess().getGroup(), "rule__DPictureAsTable__Group__0");
					put(grammarAccess.getDBasicTableAccess().getGroup(), "rule__DBasicTable__Group__0");
					put(grammarAccess.getDRowAccess().getGroup(), "rule__DRow__Group__0");
					put(grammarAccess.getDColumnAccess().getGroup(), "rule__DColumn__Group__0");
					put(grammarAccess.getDCellAccess().getGroup(), "rule__DCell__Group__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup(), "rule__DApplicableDocument__Group__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup(), "rule__DReferenceDocument__Group__0");
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
					put(grammarAccess.getVSSSGeneralRequirementsAccess().getGroup(), "rule__VSSSGeneralRequirements__Group__0");
					put(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getGroup(), "rule__VSSSCapabilitiesRequirements__Group__0");
					put(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getGroup(), "rule__VSSSSystemInterfaceRequirements__Group__0");
					put(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getGroup(), "rule__VSSSAdaptationMissionizationRequirements__Group__0");
					put(grammarAccess.getVSSSComputerResourceRequirementsAccess().getGroup(), "rule__VSSSComputerResourceRequirements__Group__0");
					put(grammarAccess.getVSSSSecurityRequirementsAccess().getGroup(), "rule__VSSSSecurityRequirements__Group__0");
					put(grammarAccess.getVSSSSafetyRequirementsAccess().getGroup(), "rule__VSSSSafetyRequirements__Group__0");
					put(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getGroup(), "rule__VSSSReliabiltyAvailabilityRequirements__Group__0");
					put(grammarAccess.getVSSSQualityRequirementsAccess().getGroup(), "rule__VSSSQualityRequirements__Group__0");
					put(grammarAccess.getVSSSDesignRequirementsAccess().getGroup(), "rule__VSSSDesignRequirements__Group__0");
					put(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getGroup(), "rule__VSSSSoftwareOperationsRequirements__Group__0");
					put(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getGroup(), "rule__VSSSSoftwareMaintenanceRequirements__Group__0");
					put(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getGroup(), "rule__VSSSSystemSoftwareObservabilityRequirements__Group__0");
					put(grammarAccess.getVSSSDocumentItemAccess().getGroup(), "rule__VSSSDocumentItem__Group__0");
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
					put(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_1(), "rule__DParagraph__ParagraphContentAssignment_1");
					put(grammarAccess.getDListItemAccess().getParagraphAssignment_1(), "rule__DListItem__ParagraphAssignment_1");
					put(grammarAccess.getDListItemAccess().getSublistAssignment_2_1(), "rule__DListItem__SublistAssignment_2_1");
					put(grammarAccess.getDItemizeAccess().getItemsAssignment_1(), "rule__DItemize__ItemsAssignment_1");
					put(grammarAccess.getDEnumerateAccess().getItemsAssignment_1(), "rule__DEnumerate__ItemsAssignment_1");
					put(grammarAccess.getDRunAccess().getTextAssignment_5(), "rule__DRun__TextAssignment_5");
					put(grammarAccess.getDHyperlinkAccess().getReferenceAssignment_2(), "rule__DHyperlink__ReferenceAssignment_2");
					put(grammarAccess.getDHyperlinkAccess().getRunAssignment_4(), "rule__DHyperlink__RunAssignment_4");
					put(grammarAccess.getDTextAccess().getContentAssignment(), "rule__DText__ContentAssignment");
					put(grammarAccess.getDFigureAccess().getReferenceAssignment_2(), "rule__DFigure__ReferenceAssignment_2");
					put(grammarAccess.getDFigureAccess().getCaptionAssignment_4(), "rule__DFigure__CaptionAssignment_4");
					put(grammarAccess.getDPictureAsTableAccess().getReferenceAssignment_2(), "rule__DPictureAsTable__ReferenceAssignment_2");
					put(grammarAccess.getDPictureAsTableAccess().getCaptionAssignment_4(), "rule__DPictureAsTable__CaptionAssignment_4");
					put(grammarAccess.getDBasicTableAccess().getCaptionAssignment_2(), "rule__DBasicTable__CaptionAssignment_2");
					put(grammarAccess.getDBasicTableAccess().getRowsAssignment_4(), "rule__DBasicTable__RowsAssignment_4");
					put(grammarAccess.getDRowAccess().getSpanAssignment_2(), "rule__DRow__SpanAssignment_2");
					put(grammarAccess.getDRowAccess().getColumnsAssignment_4(), "rule__DRow__ColumnsAssignment_4");
					put(grammarAccess.getDColumnAccess().getSpanAssignment_2(), "rule__DColumn__SpanAssignment_2");
					put(grammarAccess.getDColumnAccess().getCellsAssignment_4(), "rule__DColumn__CellsAssignment_4");
					put(grammarAccess.getDCellAccess().getBodyContentAssignment_1(), "rule__DCell__BodyContentAssignment_1");
					put(grammarAccess.getDApplicableDocumentAccess().getTitleAssignment_2(), "rule__DApplicableDocument__TitleAssignment_2");
					put(grammarAccess.getDApplicableDocumentAccess().getIssueAssignment_4(), "rule__DApplicableDocument__IssueAssignment_4");
					put(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_6(), "rule__DApplicableDocument__RevisionAssignment_6");
					put(grammarAccess.getDReferenceDocumentAccess().getTitleAssignment_2(), "rule__DReferenceDocument__TitleAssignment_2");
					put(grammarAccess.getDReferenceDocumentAccess().getIssueAssignment_4(), "rule__DReferenceDocument__IssueAssignment_4");
					put(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_6(), "rule__DReferenceDocument__RevisionAssignment_6");
					put(grammarAccess.getVSSSIntroductionAccess().getPurposeAssignment_2(), "rule__VSSSIntroduction__PurposeAssignment_2");
					put(grammarAccess.getVSSSIntroductionAccess().getObjectiveAssignment_5(), "rule__VSSSIntroduction__ObjectiveAssignment_5");
					put(grammarAccess.getVSSSIntroductionAccess().getContentAssignment_8(), "rule__VSSSIntroduction__ContentAssignment_8");
					put(grammarAccess.getVSSSIntroductionAccess().getReasonAssignment_11(), "rule__VSSSIntroduction__ReasonAssignment_11");
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
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_1(), "rule__VSSSSpecificRequirements__GeneralAssignment_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_2(), "rule__VSSSSpecificRequirements__CapabilitiesAssignment_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_3(), "rule__VSSSSpecificRequirements__SystemInterfaceAssignment_3");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_4(), "rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_4");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_5(), "rule__VSSSSpecificRequirements__ComputerResourceAssignment_5");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_6(), "rule__VSSSSpecificRequirements__SecurityAssignment_6");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_7(), "rule__VSSSSpecificRequirements__SafetyAssignment_7");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityAssignment_8(), "rule__VSSSSpecificRequirements__ReliabiltyAvailabilityAssignment_8");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_9(), "rule__VSSSSpecificRequirements__QualityAssignment_9");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_10(), "rule__VSSSSpecificRequirements__DesignAssignment_10");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_11(), "rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_11");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_12(), "rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_12");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_13(), "rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_13");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_1(), "rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_1");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_2(), "rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_2");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_3(), "rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_3");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_4(), "rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_4");
					put(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsAssignment_2(), "rule__VSSSSystemModels__SystemModelsAssignment_2");
					put(grammarAccess.getVSSSTermAccess().getNameAssignment_2(), "rule__VSSSTerm__NameAssignment_2");
					put(grammarAccess.getVSSSTermAccess().getDescriptionAssignment_4(), "rule__VSSSTerm__DescriptionAssignment_4");
					put(grammarAccess.getVSSSDefinitionAccess().getNameAssignment_2(), "rule__VSSSDefinition__NameAssignment_2");
					put(grammarAccess.getVSSSDefinitionAccess().getDescriptionAssignment_4(), "rule__VSSSDefinition__DescriptionAssignment_4");
					put(grammarAccess.getVSSSAbbreviationAccess().getNameAssignment_2(), "rule__VSSSAbbreviation__NameAssignment_2");
					put(grammarAccess.getVSSSAbbreviationAccess().getDescriptionAssignment_4(), "rule__VSSSAbbreviation__DescriptionAssignment_4");
					put(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyAssignment(), "rule__VSSSGeneralDescriptionSubsection__BodyAssignment");
					put(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSGeneralRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSCapabilitiesRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSSystemInterfaceRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSAdaptationMissionizationRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSComputerResourceRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSSecurityRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSSafetyRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSReliabiltyAvailabilityRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSReliabiltyAvailabilityRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSQualityRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSDesignRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSSoftwareOperationsRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSSoftwareMaintenanceRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSSystemSoftwareObservabilityRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSDocumentItemAccess().getIdAssignment_2(), "rule__VSSSDocumentItem__IdAssignment_2");
					put(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodAssignment_4(), "rule__VSSSDocumentItem__VerificationMethodAssignment_4");
					put(grammarAccess.getVSSSDocumentItemAccess().getBodyAssignment_6(), "rule__VSSSDocumentItem__BodyAssignment_6");
					put(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSVerificationValidationProcessRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSValidationApproachAccess().getSssItemsAssignment_2(), "rule__VSSSValidationApproach__SssItemsAssignment_2");
					put(grammarAccess.getVSSSValidationRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSValidationRequirements__SssItemsAssignment_2");
					put(grammarAccess.getVSSSVerificationRequirementsAccess().getSssItemsAssignment_2(), "rule__VSSSVerificationRequirements__SssItemsAssignment_2");
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
