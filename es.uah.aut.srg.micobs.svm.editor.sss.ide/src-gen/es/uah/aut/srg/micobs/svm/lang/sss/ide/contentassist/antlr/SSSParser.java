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
					put(grammarAccess.getDBodyAccess().getAlternatives(), "rule__DBody__Alternatives");
					put(grammarAccess.getDBodyContentAccess().getAlternatives(), "rule__DBodyContent__Alternatives");
					put(grammarAccess.getDParagraphContentAccess().getAlternatives(), "rule__DParagraphContent__Alternatives");
					put(grammarAccess.getDReferenceableObjectAccess().getAlternatives(), "rule__DReferenceableObject__Alternatives");
					put(grammarAccess.getDListContentAccess().getAlternatives(), "rule__DListContent__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getDRunFormatEnableDisableAccess().getAlternatives(), "rule__DRunFormatEnableDisable__Alternatives");
					put(grammarAccess.getVVerificationMethodAccess().getAlternatives(), "rule__VVerificationMethod__Alternatives");
					put(grammarAccess.getVSSSDocumentAccess().getGroup(), "rule__VSSSDocument__Group__0");
					put(grammarAccess.getVSSSDocumentAccess().getGroup_11(), "rule__VSSSDocument__Group_11__0");
					put(grammarAccess.getVSSSDocumentAccess().getGroup_11_3(), "rule__VSSSDocument__Group_11_3__0");
					put(grammarAccess.getVSSSDocumentAccess().getGroup_26(), "rule__VSSSDocument__Group_26__0");
					put(grammarAccess.getVSSSIntroductionAccess().getGroup(), "rule__VSSSIntroduction__Group__0");
					put(grammarAccess.getVSSSApplicableDocumentsAccess().getGroup(), "rule__VSSSApplicableDocuments__Group__0");
					put(grammarAccess.getVSSSApplicableDocumentsAccess().getGroup_3(), "rule__VSSSApplicableDocuments__Group_3__0");
					put(grammarAccess.getVSSSApplicableDocumentsAccess().getGroup_3_3(), "rule__VSSSApplicableDocuments__Group_3_3__0");
					put(grammarAccess.getVSSSReferenceDocumentsAccess().getGroup(), "rule__VSSSReferenceDocuments__Group__0");
					put(grammarAccess.getVSSSReferenceDocumentsAccess().getGroup_3(), "rule__VSSSReferenceDocuments__Group_3__0");
					put(grammarAccess.getVSSSReferenceDocumentsAccess().getGroup_3_3(), "rule__VSSSReferenceDocuments__Group_3_3__0");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup(), "rule__VSSSTermsDefinitionsAbbreviations__Group__0");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_3(), "rule__VSSSTermsDefinitionsAbbreviations__Group_3__0");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_3_3(), "rule__VSSSTermsDefinitionsAbbreviations__Group_3_3__0");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_4(), "rule__VSSSTermsDefinitionsAbbreviations__Group_4__0");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_4_3(), "rule__VSSSTermsDefinitionsAbbreviations__Group_4_3__0");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_5(), "rule__VSSSTermsDefinitionsAbbreviations__Group_5__0");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getGroup_5_3(), "rule__VSSSTermsDefinitionsAbbreviations__Group_5_3__0");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getGroup(), "rule__VSSSGeneralDescription__Group__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup(), "rule__VSSSSpecificRequirements__Group__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_3(), "rule__VSSSSpecificRequirements__Group_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_3_3(), "rule__VSSSSpecificRequirements__Group_3_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_4(), "rule__VSSSSpecificRequirements__Group_4__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_4_3(), "rule__VSSSSpecificRequirements__Group_4_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_5(), "rule__VSSSSpecificRequirements__Group_5__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_5_3(), "rule__VSSSSpecificRequirements__Group_5_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_6(), "rule__VSSSSpecificRequirements__Group_6__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_6_3(), "rule__VSSSSpecificRequirements__Group_6_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_7(), "rule__VSSSSpecificRequirements__Group_7__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_7_3(), "rule__VSSSSpecificRequirements__Group_7_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_8(), "rule__VSSSSpecificRequirements__Group_8__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_8_3(), "rule__VSSSSpecificRequirements__Group_8_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_9(), "rule__VSSSSpecificRequirements__Group_9__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_9_3(), "rule__VSSSSpecificRequirements__Group_9_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_10(), "rule__VSSSSpecificRequirements__Group_10__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_10_3(), "rule__VSSSSpecificRequirements__Group_10_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_11(), "rule__VSSSSpecificRequirements__Group_11__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_11_3(), "rule__VSSSSpecificRequirements__Group_11_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_12(), "rule__VSSSSpecificRequirements__Group_12__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_12_3(), "rule__VSSSSpecificRequirements__Group_12_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_13(), "rule__VSSSSpecificRequirements__Group_13__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_13_3(), "rule__VSSSSpecificRequirements__Group_13_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_14(), "rule__VSSSSpecificRequirements__Group_14__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_14_3(), "rule__VSSSSpecificRequirements__Group_14_3__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_15(), "rule__VSSSSpecificRequirements__Group_15__0");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGroup_15_3(), "rule__VSSSSpecificRequirements__Group_15_3__0");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup(), "rule__VSSSVerificationValidationIntegrationRequirements__Group__0");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_3(), "rule__VSSSVerificationValidationIntegrationRequirements__Group_3__0");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_3_3(), "rule__VSSSVerificationValidationIntegrationRequirements__Group_3_3__0");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_4(), "rule__VSSSVerificationValidationIntegrationRequirements__Group_4__0");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_4_3(), "rule__VSSSVerificationValidationIntegrationRequirements__Group_4_3__0");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_5(), "rule__VSSSVerificationValidationIntegrationRequirements__Group_5__0");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_5_3(), "rule__VSSSVerificationValidationIntegrationRequirements__Group_5_3__0");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_6(), "rule__VSSSVerificationValidationIntegrationRequirements__Group_6__0");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getGroup_6_3(), "rule__VSSSVerificationValidationIntegrationRequirements__Group_6_3__0");
					put(grammarAccess.getVSSSSystemModelsAccess().getGroup(), "rule__VSSSSystemModels__Group__0");
					put(grammarAccess.getVSSSSystemModelsAccess().getGroup_5(), "rule__VSSSSystemModels__Group_5__0");
					put(grammarAccess.getDBody_ImplAccess().getGroup(), "rule__DBody_Impl__Group__0");
					put(grammarAccess.getDBody_ImplAccess().getGroup_5(), "rule__DBody_Impl__Group_5__0");
					put(grammarAccess.getDCellAccess().getGroup(), "rule__DCell__Group__0");
					put(grammarAccess.getDCellAccess().getGroup_5(), "rule__DCell__Group_5__0");
					put(grammarAccess.getDParagraphAccess().getGroup(), "rule__DParagraph__Group__0");
					put(grammarAccess.getDParagraphAccess().getGroup_5(), "rule__DParagraph__Group_5__0");
					put(grammarAccess.getDItemizeAccess().getGroup(), "rule__DItemize__Group__0");
					put(grammarAccess.getDItemizeAccess().getGroup_5(), "rule__DItemize__Group_5__0");
					put(grammarAccess.getDEnumerateAccess().getGroup(), "rule__DEnumerate__Group__0");
					put(grammarAccess.getDEnumerateAccess().getGroup_5(), "rule__DEnumerate__Group_5__0");
					put(grammarAccess.getDRowAccess().getGroup(), "rule__DRow__Group__0");
					put(grammarAccess.getDRowAccess().getGroup_7(), "rule__DRow__Group_7__0");
					put(grammarAccess.getDColumnAccess().getGroup(), "rule__DColumn__Group__0");
					put(grammarAccess.getDColumnAccess().getGroup_7(), "rule__DColumn__Group_7__0");
					put(grammarAccess.getDRunAccess().getGroup(), "rule__DRun__Group__0");
					put(grammarAccess.getDHyperlinkAccess().getGroup(), "rule__DHyperlink__Group__0");
					put(grammarAccess.getDTextAccess().getGroup(), "rule__DText__Group__0");
					put(grammarAccess.getDReferenceableObject_ImplAccess().getGroup(), "rule__DReferenceableObject_Impl__Group__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup(), "rule__DApplicableDocument__Group__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup(), "rule__DReferenceDocument__Group__0");
					put(grammarAccess.getDListItemAccess().getGroup(), "rule__DListItem__Group__0");
					put(grammarAccess.getDListItemAccess().getGroup_5(), "rule__DListItem__Group_5__0");
					put(grammarAccess.getDListItemAccess().getGroup_7(), "rule__DListItem__Group_7__0");
					put(grammarAccess.getVSSSTermAccess().getGroup(), "rule__VSSSTerm__Group__0");
					put(grammarAccess.getVSSSDefinitionAccess().getGroup(), "rule__VSSSDefinition__Group__0");
					put(grammarAccess.getVSSSAbbreviationAccess().getGroup(), "rule__VSSSAbbreviation__Group__0");
					put(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getGroup(), "rule__VSSSGeneralDescriptionSubsection__Group__0");
					put(grammarAccess.getVSSSGeneralRequirementAccess().getGroup(), "rule__VSSSGeneralRequirement__Group__0");
					put(grammarAccess.getVSSSGeneralRequirementAccess().getGroup_5(), "rule__VSSSGeneralRequirement__Group_5__0");
					put(grammarAccess.getVSSSCapabilitiesRequirementAccess().getGroup(), "rule__VSSSCapabilitiesRequirement__Group__0");
					put(grammarAccess.getVSSSCapabilitiesRequirementAccess().getGroup_5(), "rule__VSSSCapabilitiesRequirement__Group_5__0");
					put(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getGroup(), "rule__VSSSSystemInterfaceRequirement__Group__0");
					put(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getGroup_5(), "rule__VSSSSystemInterfaceRequirement__Group_5__0");
					put(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getGroup(), "rule__VSSSAdaptationMissionizationRequirement__Group__0");
					put(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getGroup_5(), "rule__VSSSAdaptationMissionizationRequirement__Group_5__0");
					put(grammarAccess.getVSSSComputerResourceRequirementAccess().getGroup(), "rule__VSSSComputerResourceRequirement__Group__0");
					put(grammarAccess.getVSSSComputerResourceRequirementAccess().getGroup_5(), "rule__VSSSComputerResourceRequirement__Group_5__0");
					put(grammarAccess.getVSSSSecurityRequirementAccess().getGroup(), "rule__VSSSSecurityRequirement__Group__0");
					put(grammarAccess.getVSSSSecurityRequirementAccess().getGroup_5(), "rule__VSSSSecurityRequirement__Group_5__0");
					put(grammarAccess.getVSSSSafetyRequirementAccess().getGroup(), "rule__VSSSSafetyRequirement__Group__0");
					put(grammarAccess.getVSSSSafetyRequirementAccess().getGroup_5(), "rule__VSSSSafetyRequirement__Group_5__0");
					put(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getGroup(), "rule__VSSSReliabiltyAvailabilityRequirement__Group__0");
					put(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getGroup_5(), "rule__VSSSReliabiltyAvailabilityRequirement__Group_5__0");
					put(grammarAccess.getVSSSQualityRequirementAccess().getGroup(), "rule__VSSSQualityRequirement__Group__0");
					put(grammarAccess.getVSSSQualityRequirementAccess().getGroup_5(), "rule__VSSSQualityRequirement__Group_5__0");
					put(grammarAccess.getVSSSDesignRequirementAccess().getGroup(), "rule__VSSSDesignRequirement__Group__0");
					put(grammarAccess.getVSSSDesignRequirementAccess().getGroup_5(), "rule__VSSSDesignRequirement__Group_5__0");
					put(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getGroup(), "rule__VSSSSoftwareOperationsRequirement__Group__0");
					put(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getGroup_5(), "rule__VSSSSoftwareOperationsRequirement__Group_5__0");
					put(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getGroup(), "rule__VSSSSoftwareMaintenanceRequirement__Group__0");
					put(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getGroup_5(), "rule__VSSSSoftwareMaintenanceRequirement__Group_5__0");
					put(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getGroup(), "rule__VSSSSystemSoftwareObservabilityRequirement__Group__0");
					put(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getGroup_5(), "rule__VSSSSystemSoftwareObservabilityRequirement__Group_5__0");
					put(grammarAccess.getVSSSDocumentItemAccess().getGroup(), "rule__VSSSDocumentItem__Group__0");
					put(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getGroup(), "rule__VSSSVerificationValidationProcessRequirement__Group__0");
					put(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getGroup_5(), "rule__VSSSVerificationValidationProcessRequirement__Group_5__0");
					put(grammarAccess.getVSSSValidationApproachAccess().getGroup(), "rule__VSSSValidationApproach__Group__0");
					put(grammarAccess.getVSSSValidationApproachAccess().getGroup_5(), "rule__VSSSValidationApproach__Group_5__0");
					put(grammarAccess.getVSSSValidationRequirementAccess().getGroup(), "rule__VSSSValidationRequirement__Group__0");
					put(grammarAccess.getVSSSValidationRequirementAccess().getGroup_5(), "rule__VSSSValidationRequirement__Group_5__0");
					put(grammarAccess.getVSSSVerificationRequirementAccess().getGroup(), "rule__VSSSVerificationRequirement__Group__0");
					put(grammarAccess.getVSSSVerificationRequirementAccess().getGroup_5(), "rule__VSSSVerificationRequirement__Group_5__0");
					put(grammarAccess.getVSSSSystemModelAccess().getGroup(), "rule__VSSSSystemModel__Group__0");
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
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getREALAccess().getGroup_1(), "rule__REAL__Group_1__0");
					put(grammarAccess.getREALAccess().getGroup_2(), "rule__REAL__Group_2__0");
					put(grammarAccess.getVSSSDocumentAccess().getNameAssignment_1(), "rule__VSSSDocument__NameAssignment_1");
					put(grammarAccess.getVSSSDocumentAccess().getIdAssignment_4(), "rule__VSSSDocument__IdAssignment_4");
					put(grammarAccess.getVSSSDocumentAccess().getIssueAssignment_6(), "rule__VSSSDocument__IssueAssignment_6");
					put(grammarAccess.getVSSSDocumentAccess().getRevisionAssignment_8(), "rule__VSSSDocument__RevisionAssignment_8");
					put(grammarAccess.getVSSSDocumentAccess().getDateAssignment_10(), "rule__VSSSDocument__DateAssignment_10");
					put(grammarAccess.getVSSSDocumentAccess().getParentsAssignment_11_2(), "rule__VSSSDocument__ParentsAssignment_11_2");
					put(grammarAccess.getVSSSDocumentAccess().getParentsAssignment_11_3_1(), "rule__VSSSDocument__ParentsAssignment_11_3_1");
					put(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionAssignment_13(), "rule__VSSSDocument__IntroductionSectionAssignment_13");
					put(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionAssignment_15(), "rule__VSSSDocument__ApplicableDocumentsSectionAssignment_15");
					put(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionAssignment_17(), "rule__VSSSDocument__ReferenceDocumentsSectionAssignment_17");
					put(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_19(), "rule__VSSSDocument__TermsDefinitionsAbbreviationsSectionAssignment_19");
					put(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionAssignment_21(), "rule__VSSSDocument__GeneralDescriptionSectionAssignment_21");
					put(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionAssignment_23(), "rule__VSSSDocument__SpecificRequirementsSectionAssignment_23");
					put(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionAssignment_25(), "rule__VSSSDocument__VerificationValidationIntegrationSectionAssignment_25");
					put(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionAssignment_26_1(), "rule__VSSSDocument__SystemModelsSectionAssignment_26_1");
					put(grammarAccess.getVSSSIntroductionAccess().getPurposeAssignment_3(), "rule__VSSSIntroduction__PurposeAssignment_3");
					put(grammarAccess.getVSSSIntroductionAccess().getObjetiveAssignment_5(), "rule__VSSSIntroduction__ObjetiveAssignment_5");
					put(grammarAccess.getVSSSIntroductionAccess().getContentAssignment_7(), "rule__VSSSIntroduction__ContentAssignment_7");
					put(grammarAccess.getVSSSIntroductionAccess().getReasonAssignment_9(), "rule__VSSSIntroduction__ReasonAssignment_9");
					put(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsAssignment_3_2(), "rule__VSSSApplicableDocuments__ApplicableDocumentsAssignment_3_2");
					put(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsAssignment_3_3_1(), "rule__VSSSApplicableDocuments__ApplicableDocumentsAssignment_3_3_1");
					put(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsAssignment_3_2(), "rule__VSSSReferenceDocuments__ReferenceDocumentsAssignment_3_2");
					put(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsAssignment_3_3_1(), "rule__VSSSReferenceDocuments__ReferenceDocumentsAssignment_3_3_1");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_3_2(), "rule__VSSSTermsDefinitionsAbbreviations__TermsAssignment_3_2");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsAssignment_3_3_1(), "rule__VSSSTermsDefinitionsAbbreviations__TermsAssignment_3_3_1");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_4_2(), "rule__VSSSTermsDefinitionsAbbreviations__DefinitionsAssignment_4_2");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_4_3_1(), "rule__VSSSTermsDefinitionsAbbreviations__DefinitionsAssignment_4_3_1");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_5_2(), "rule__VSSSTermsDefinitionsAbbreviations__AbbreviationsAssignment_5_2");
					put(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_5_3_1(), "rule__VSSSTermsDefinitionsAbbreviations__AbbreviationsAssignment_5_3_1");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveAssignment_3(), "rule__VSSSGeneralDescription__ProductPerspectiveAssignment_3");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitesAssignment_5(), "rule__VSSSGeneralDescription__GeneralCapabilitesAssignment_5");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsAssignment_7(), "rule__VSSSGeneralDescription__GeneralConstraintsAssignment_7");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentAssignment_9(), "rule__VSSSGeneralDescription__OperationalEnvironmentAssignment_9");
					put(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesAssignment_11(), "rule__VSSSGeneralDescription__AssumptionsDependenciesAssignment_11");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_3_2(), "rule__VSSSSpecificRequirements__GeneralAssignment_3_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralAssignment_3_3_1(), "rule__VSSSSpecificRequirements__GeneralAssignment_3_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_4_2(), "rule__VSSSSpecificRequirements__CapabilitiesAssignment_4_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesAssignment_4_3_1(), "rule__VSSSSpecificRequirements__CapabilitiesAssignment_4_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_5_2(), "rule__VSSSSpecificRequirements__SystemInterfaceAssignment_5_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceAssignment_5_3_1(), "rule__VSSSSpecificRequirements__SystemInterfaceAssignment_5_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_6_2(), "rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_6_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationAssignment_6_3_1(), "rule__VSSSSpecificRequirements__AdaptationMissionizationAssignment_6_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_7_2(), "rule__VSSSSpecificRequirements__ComputerResourceAssignment_7_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceAssignment_7_3_1(), "rule__VSSSSpecificRequirements__ComputerResourceAssignment_7_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_8_2(), "rule__VSSSSpecificRequirements__SecurityAssignment_8_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityAssignment_8_3_1(), "rule__VSSSSpecificRequirements__SecurityAssignment_8_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_9_2(), "rule__VSSSSpecificRequirements__SafetyAssignment_9_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyAssignment_9_3_1(), "rule__VSSSSpecificRequirements__SafetyAssignment_9_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityAssignment_10_2(), "rule__VSSSSpecificRequirements__ReliabiltyAvailabilityAssignment_10_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabiltyAvailabilityAssignment_10_3_1(), "rule__VSSSSpecificRequirements__ReliabiltyAvailabilityAssignment_10_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_11_2(), "rule__VSSSSpecificRequirements__QualityAssignment_11_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityAssignment_11_3_1(), "rule__VSSSSpecificRequirements__QualityAssignment_11_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_12_2(), "rule__VSSSSpecificRequirements__DesignAssignment_12_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignAssignment_12_3_1(), "rule__VSSSSpecificRequirements__DesignAssignment_12_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_13_2(), "rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_13_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsAssignment_13_3_1(), "rule__VSSSSpecificRequirements__SoftwareOperationsAssignment_13_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_14_2(), "rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_14_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceAssignment_14_3_1(), "rule__VSSSSpecificRequirements__SoftwareMaintenanceAssignment_14_3_1");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_15_2(), "rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_15_2");
					put(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityAssignment_15_3_1(), "rule__VSSSSpecificRequirements__SystemSoftwareObservabilityAssignment_15_3_1");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_3_2(), "rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_3_2");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessAssignment_3_3_1(), "rule__VSSSVerificationValidationIntegrationRequirements__VerificationValidationProcessAssignment_3_3_1");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_4_2(), "rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_4_2");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachAssignment_4_3_1(), "rule__VSSSVerificationValidationIntegrationRequirements__ValidationApproachAssignment_4_3_1");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_5_2(), "rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_5_2");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationAssignment_5_3_1(), "rule__VSSSVerificationValidationIntegrationRequirements__ValidationAssignment_5_3_1");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_6_2(), "rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_6_2");
					put(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationAssignment_6_3_1(), "rule__VSSSVerificationValidationIntegrationRequirements__VerificationAssignment_6_3_1");
					put(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsAssignment_4(), "rule__VSSSSystemModels__SystemModelsAssignment_4");
					put(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsAssignment_5_1(), "rule__VSSSSystemModels__SystemModelsAssignment_5_1");
					put(grammarAccess.getDBody_ImplAccess().getBodyContentAssignment_4(), "rule__DBody_Impl__BodyContentAssignment_4");
					put(grammarAccess.getDBody_ImplAccess().getBodyContentAssignment_5_1(), "rule__DBody_Impl__BodyContentAssignment_5_1");
					put(grammarAccess.getDCellAccess().getBodyContentAssignment_4(), "rule__DCell__BodyContentAssignment_4");
					put(grammarAccess.getDCellAccess().getBodyContentAssignment_5_1(), "rule__DCell__BodyContentAssignment_5_1");
					put(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_4(), "rule__DParagraph__ParagraphContentAssignment_4");
					put(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_5_1(), "rule__DParagraph__ParagraphContentAssignment_5_1");
					put(grammarAccess.getDItemizeAccess().getItemsAssignment_4(), "rule__DItemize__ItemsAssignment_4");
					put(grammarAccess.getDItemizeAccess().getItemsAssignment_5_1(), "rule__DItemize__ItemsAssignment_5_1");
					put(grammarAccess.getDEnumerateAccess().getItemsAssignment_4(), "rule__DEnumerate__ItemsAssignment_4");
					put(grammarAccess.getDEnumerateAccess().getItemsAssignment_5_1(), "rule__DEnumerate__ItemsAssignment_5_1");
					put(grammarAccess.getDRowAccess().getSpanAssignment_3(), "rule__DRow__SpanAssignment_3");
					put(grammarAccess.getDRowAccess().getColumnsAssignment_6(), "rule__DRow__ColumnsAssignment_6");
					put(grammarAccess.getDRowAccess().getColumnsAssignment_7_1(), "rule__DRow__ColumnsAssignment_7_1");
					put(grammarAccess.getDColumnAccess().getSpanAssignment_3(), "rule__DColumn__SpanAssignment_3");
					put(grammarAccess.getDColumnAccess().getCellsAssignment_6(), "rule__DColumn__CellsAssignment_6");
					put(grammarAccess.getDColumnAccess().getCellsAssignment_7_1(), "rule__DColumn__CellsAssignment_7_1");
					put(grammarAccess.getDRunAccess().getBoldAssignment_3(), "rule__DRun__BoldAssignment_3");
					put(grammarAccess.getDRunAccess().getItalicAssignment_5(), "rule__DRun__ItalicAssignment_5");
					put(grammarAccess.getDRunAccess().getUnderscoreAssignment_7(), "rule__DRun__UnderscoreAssignment_7");
					put(grammarAccess.getDRunAccess().getTextAssignment_9(), "rule__DRun__TextAssignment_9");
					put(grammarAccess.getDHyperlinkAccess().getReferenceAssignment_3(), "rule__DHyperlink__ReferenceAssignment_3");
					put(grammarAccess.getDHyperlinkAccess().getRunAssignment_5(), "rule__DHyperlink__RunAssignment_5");
					put(grammarAccess.getDTextAccess().getContentAssignment_3(), "rule__DText__ContentAssignment_3");
					put(grammarAccess.getDApplicableDocumentAccess().getTitleAssignment_3(), "rule__DApplicableDocument__TitleAssignment_3");
					put(grammarAccess.getDApplicableDocumentAccess().getIssueAssignment_5(), "rule__DApplicableDocument__IssueAssignment_5");
					put(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_7(), "rule__DApplicableDocument__RevisionAssignment_7");
					put(grammarAccess.getDReferenceDocumentAccess().getTitleAssignment_3(), "rule__DReferenceDocument__TitleAssignment_3");
					put(grammarAccess.getDReferenceDocumentAccess().getIssueAssignment_5(), "rule__DReferenceDocument__IssueAssignment_5");
					put(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_7(), "rule__DReferenceDocument__RevisionAssignment_7");
					put(grammarAccess.getDListItemAccess().getParagraphAssignment_4(), "rule__DListItem__ParagraphAssignment_4");
					put(grammarAccess.getDListItemAccess().getParagraphAssignment_5_1(), "rule__DListItem__ParagraphAssignment_5_1");
					put(grammarAccess.getDListItemAccess().getSublistAssignment_7_1(), "rule__DListItem__SublistAssignment_7_1");
					put(grammarAccess.getVSSSTermAccess().getNameAssignment_1(), "rule__VSSSTerm__NameAssignment_1");
					put(grammarAccess.getVSSSTermAccess().getDescriptionAssignment_4(), "rule__VSSSTerm__DescriptionAssignment_4");
					put(grammarAccess.getVSSSDefinitionAccess().getNameAssignment_1(), "rule__VSSSDefinition__NameAssignment_1");
					put(grammarAccess.getVSSSDefinitionAccess().getDescriptionAssignment_4(), "rule__VSSSDefinition__DescriptionAssignment_4");
					put(grammarAccess.getVSSSAbbreviationAccess().getNameAssignment_1(), "rule__VSSSAbbreviation__NameAssignment_1");
					put(grammarAccess.getVSSSAbbreviationAccess().getDescriptionAssignment_4(), "rule__VSSSAbbreviation__DescriptionAssignment_4");
					put(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyAssignment_3(), "rule__VSSSGeneralDescriptionSubsection__BodyAssignment_3");
					put(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSGeneralRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSGeneralRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSGeneralRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSCapabilitiesRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSCapabilitiesRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSCapabilitiesRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSSystemInterfaceRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSSystemInterfaceRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSSystemInterfaceRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSAdaptationMissionizationRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSAdaptationMissionizationRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSAdaptationMissionizationRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSComputerResourceRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSComputerResourceRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSComputerResourceRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSSecurityRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSSecurityRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSSecurityRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSSafetyRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSSafetyRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSSafetyRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSReliabiltyAvailabilityRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSReliabiltyAvailabilityRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSReliabiltyAvailabilityRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSQualityRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSQualityRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSQualityRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSDesignRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSDesignRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSDesignRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSSoftwareOperationsRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSSoftwareOperationsRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSSoftwareOperationsRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSSoftwareMaintenanceRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSSoftwareMaintenanceRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSSoftwareMaintenanceRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSSystemSoftwareObservabilityRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSSystemSoftwareObservabilityRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSDocumentItemAccess().getIdAssignment_3(), "rule__VSSSDocumentItem__IdAssignment_3");
					put(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodAssignment_5(), "rule__VSSSDocumentItem__VerificationMethodAssignment_5");
					put(grammarAccess.getVSSSDocumentItemAccess().getBodyAssignment_7(), "rule__VSSSDocumentItem__BodyAssignment_7");
					put(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSVerificationValidationProcessRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSVerificationValidationProcessRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSVerificationValidationProcessRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSValidationApproachAccess().getSssItemsAssignment_4(), "rule__VSSSValidationApproach__SssItemsAssignment_4");
					put(grammarAccess.getVSSSValidationApproachAccess().getSssItemsAssignment_5_1(), "rule__VSSSValidationApproach__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSValidationRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSValidationRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSValidationRequirement__SssItemsAssignment_5_1");
					put(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsAssignment_4(), "rule__VSSSVerificationRequirement__SssItemsAssignment_4");
					put(grammarAccess.getVSSSVerificationRequirementAccess().getSssItemsAssignment_5_1(), "rule__VSSSVerificationRequirement__SssItemsAssignment_5_1");
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
