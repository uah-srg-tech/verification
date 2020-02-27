/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.micobs.svm.sss.impl;

import es.uah.aut.srg.micobs.svm.sss.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class sssFactoryImpl extends EFactoryImpl implements sssFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static sssFactory init() {
		try {
			sssFactory thesssFactory = (sssFactory)EPackage.Registry.INSTANCE.getEFactory(sssPackage.eNS_URI);
			if (thesssFactory != null) {
				return thesssFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new sssFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sssFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case sssPackage.VSSS_DOCUMENT: return createVSSSDocument();
			case sssPackage.VSSSTB_CS_TB_DS: return createVSSSTBCsTBDs();
			case sssPackage.VSSS_INTRODUCTION: return createVSSSIntroduction();
			case sssPackage.VSSS_APPLICABLE_DOCUMENTS: return createVSSSApplicableDocuments();
			case sssPackage.VSSS_REFERENCE_DOCUMENTS: return createVSSSReferenceDocuments();
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS: return createVSSSTermsDefinitionsAbbreviations();
			case sssPackage.VSSS_TERM: return createVSSSTerm();
			case sssPackage.VSSS_DEFINITION: return createVSSSDefinition();
			case sssPackage.VSSS_ABBREVIATION: return createVSSSAbbreviation();
			case sssPackage.VSSS_FIXED_SECTION: return createVSSSFixedSection();
			case sssPackage.VSSS_INSTANTIABLE_SECTION: return createVSSSInstantiableSection();
			case sssPackage.VSSS_GENERAL_DESCRIPTION: return createVSSSGeneralDescription();
			case sssPackage.VSSS_INSTANTIABLE_REQUIREMENT_SECTION: return createVSSSInstantiableRequirementSection();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS: return createVSSSSpecificRequirements();
			case sssPackage.VSSS_GENERAL_REQUIREMENTS: return createVSSSGeneralRequirements();
			case sssPackage.VSSS_CAPABILITIES_REQUIREMENTS: return createVSSSCapabilitiesRequirements();
			case sssPackage.VSSS_SYSTEM_INTERFACE_REQUIREMENTS: return createVSSSSystemInterfaceRequirements();
			case sssPackage.VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS: return createVSSSAdaptationMissionizationRequirements();
			case sssPackage.VSSS_COMPUTER_RESOURCE_REQUIREMENTS: return createVSSSComputerResourceRequirements();
			case sssPackage.VSSS_SECURITY_REQUIREMENTS: return createVSSSSecurityRequirements();
			case sssPackage.VSSS_SAFETY_REQUIREMENTS: return createVSSSSafetyRequirements();
			case sssPackage.VSSS_RELIABILITY_AVAILABILITY_REQUIREMENTS: return createVSSSReliabilityAvailabilityRequirements();
			case sssPackage.VSSS_QUALITY_REQUIREMENTS: return createVSSSQualityRequirements();
			case sssPackage.VSSS_DESIGN_REQUIREMENTS: return createVSSSDesignRequirements();
			case sssPackage.VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS: return createVSSSSoftwareOperationsRequirements();
			case sssPackage.VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS: return createVSSSSoftwareMaintenanceRequirements();
			case sssPackage.VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS: return createVSSSSystemSoftwareObservabilityRequirements();
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS: return createVSSSVerificationValidationIntegrationRequirements();
			case sssPackage.VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS: return createVSSSVerificationValidationProcessRequirements();
			case sssPackage.VSSS_VALIDATION_APPROACH: return createVSSSValidationApproach();
			case sssPackage.VSSS_VERIFICATION_REQUIREMENTS: return createVSSSVerificationRequirements();
			case sssPackage.VSSS_VALIDATION_REQUIREMENTS: return createVSSSValidationRequirements();
			case sssPackage.VSSS_DOCUMENT_ITEM: return createVSSSDocumentItem();
			case sssPackage.VSSS_SYSTEM_MODELS: return createVSSSSystemModels();
			case sssPackage.VSSS_SYSTEM_MODEL: return createVSSSSystemModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSDocument createVSSSDocument() {
		VSSSDocumentImpl vsssDocument = new VSSSDocumentImpl();
		return vsssDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSTBCsTBDs createVSSSTBCsTBDs() {
		VSSSTBCsTBDsImpl vssstbCsTBDs = new VSSSTBCsTBDsImpl();
		return vssstbCsTBDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSIntroduction createVSSSIntroduction() {
		VSSSIntroductionImpl vsssIntroduction = new VSSSIntroductionImpl();
		return vsssIntroduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSApplicableDocuments createVSSSApplicableDocuments() {
		VSSSApplicableDocumentsImpl vsssApplicableDocuments = new VSSSApplicableDocumentsImpl();
		return vsssApplicableDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSReferenceDocuments createVSSSReferenceDocuments() {
		VSSSReferenceDocumentsImpl vsssReferenceDocuments = new VSSSReferenceDocumentsImpl();
		return vsssReferenceDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSTermsDefinitionsAbbreviations createVSSSTermsDefinitionsAbbreviations() {
		VSSSTermsDefinitionsAbbreviationsImpl vsssTermsDefinitionsAbbreviations = new VSSSTermsDefinitionsAbbreviationsImpl();
		return vsssTermsDefinitionsAbbreviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSTerm createVSSSTerm() {
		VSSSTermImpl vsssTerm = new VSSSTermImpl();
		return vsssTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSDefinition createVSSSDefinition() {
		VSSSDefinitionImpl vsssDefinition = new VSSSDefinitionImpl();
		return vsssDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSAbbreviation createVSSSAbbreviation() {
		VSSSAbbreviationImpl vsssAbbreviation = new VSSSAbbreviationImpl();
		return vsssAbbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSFixedSection createVSSSFixedSection() {
		VSSSFixedSectionImpl vsssFixedSection = new VSSSFixedSectionImpl();
		return vsssFixedSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSInstantiableSection createVSSSInstantiableSection() {
		VSSSInstantiableSectionImpl vsssInstantiableSection = new VSSSInstantiableSectionImpl();
		return vsssInstantiableSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSGeneralDescription createVSSSGeneralDescription() {
		VSSSGeneralDescriptionImpl vsssGeneralDescription = new VSSSGeneralDescriptionImpl();
		return vsssGeneralDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSInstantiableRequirementSection createVSSSInstantiableRequirementSection() {
		VSSSInstantiableRequirementSectionImpl vsssInstantiableRequirementSection = new VSSSInstantiableRequirementSectionImpl();
		return vsssInstantiableRequirementSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSpecificRequirements createVSSSSpecificRequirements() {
		VSSSSpecificRequirementsImpl vsssSpecificRequirements = new VSSSSpecificRequirementsImpl();
		return vsssSpecificRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSGeneralRequirements createVSSSGeneralRequirements() {
		VSSSGeneralRequirementsImpl vsssGeneralRequirements = new VSSSGeneralRequirementsImpl();
		return vsssGeneralRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSCapabilitiesRequirements createVSSSCapabilitiesRequirements() {
		VSSSCapabilitiesRequirementsImpl vsssCapabilitiesRequirements = new VSSSCapabilitiesRequirementsImpl();
		return vsssCapabilitiesRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSystemInterfaceRequirements createVSSSSystemInterfaceRequirements() {
		VSSSSystemInterfaceRequirementsImpl vsssSystemInterfaceRequirements = new VSSSSystemInterfaceRequirementsImpl();
		return vsssSystemInterfaceRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSAdaptationMissionizationRequirements createVSSSAdaptationMissionizationRequirements() {
		VSSSAdaptationMissionizationRequirementsImpl vsssAdaptationMissionizationRequirements = new VSSSAdaptationMissionizationRequirementsImpl();
		return vsssAdaptationMissionizationRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSComputerResourceRequirements createVSSSComputerResourceRequirements() {
		VSSSComputerResourceRequirementsImpl vsssComputerResourceRequirements = new VSSSComputerResourceRequirementsImpl();
		return vsssComputerResourceRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSecurityRequirements createVSSSSecurityRequirements() {
		VSSSSecurityRequirementsImpl vsssSecurityRequirements = new VSSSSecurityRequirementsImpl();
		return vsssSecurityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSafetyRequirements createVSSSSafetyRequirements() {
		VSSSSafetyRequirementsImpl vsssSafetyRequirements = new VSSSSafetyRequirementsImpl();
		return vsssSafetyRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSReliabilityAvailabilityRequirements createVSSSReliabilityAvailabilityRequirements() {
		VSSSReliabilityAvailabilityRequirementsImpl vsssReliabilityAvailabilityRequirements = new VSSSReliabilityAvailabilityRequirementsImpl();
		return vsssReliabilityAvailabilityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSQualityRequirements createVSSSQualityRequirements() {
		VSSSQualityRequirementsImpl vsssQualityRequirements = new VSSSQualityRequirementsImpl();
		return vsssQualityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSDesignRequirements createVSSSDesignRequirements() {
		VSSSDesignRequirementsImpl vsssDesignRequirements = new VSSSDesignRequirementsImpl();
		return vsssDesignRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSoftwareOperationsRequirements createVSSSSoftwareOperationsRequirements() {
		VSSSSoftwareOperationsRequirementsImpl vsssSoftwareOperationsRequirements = new VSSSSoftwareOperationsRequirementsImpl();
		return vsssSoftwareOperationsRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSoftwareMaintenanceRequirements createVSSSSoftwareMaintenanceRequirements() {
		VSSSSoftwareMaintenanceRequirementsImpl vsssSoftwareMaintenanceRequirements = new VSSSSoftwareMaintenanceRequirementsImpl();
		return vsssSoftwareMaintenanceRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSystemSoftwareObservabilityRequirements createVSSSSystemSoftwareObservabilityRequirements() {
		VSSSSystemSoftwareObservabilityRequirementsImpl vsssSystemSoftwareObservabilityRequirements = new VSSSSystemSoftwareObservabilityRequirementsImpl();
		return vsssSystemSoftwareObservabilityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSVerificationValidationIntegrationRequirements createVSSSVerificationValidationIntegrationRequirements() {
		VSSSVerificationValidationIntegrationRequirementsImpl vsssVerificationValidationIntegrationRequirements = new VSSSVerificationValidationIntegrationRequirementsImpl();
		return vsssVerificationValidationIntegrationRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSVerificationValidationProcessRequirements createVSSSVerificationValidationProcessRequirements() {
		VSSSVerificationValidationProcessRequirementsImpl vsssVerificationValidationProcessRequirements = new VSSSVerificationValidationProcessRequirementsImpl();
		return vsssVerificationValidationProcessRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSValidationApproach createVSSSValidationApproach() {
		VSSSValidationApproachImpl vsssValidationApproach = new VSSSValidationApproachImpl();
		return vsssValidationApproach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSVerificationRequirements createVSSSVerificationRequirements() {
		VSSSVerificationRequirementsImpl vsssVerificationRequirements = new VSSSVerificationRequirementsImpl();
		return vsssVerificationRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSValidationRequirements createVSSSValidationRequirements() {
		VSSSValidationRequirementsImpl vsssValidationRequirements = new VSSSValidationRequirementsImpl();
		return vsssValidationRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSDocumentItem createVSSSDocumentItem() {
		VSSSDocumentItemImpl vsssDocumentItem = new VSSSDocumentItemImpl();
		return vsssDocumentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSystemModels createVSSSSystemModels() {
		VSSSSystemModelsImpl vsssSystemModels = new VSSSSystemModelsImpl();
		return vsssSystemModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSystemModel createVSSSSystemModel() {
		VSSSSystemModelImpl vsssSystemModel = new VSSSSystemModelImpl();
		return vsssSystemModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sssPackage getsssPackage() {
		return (sssPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static sssPackage getPackage() {
		return sssPackage.eINSTANCE;
	}

} //sssFactoryImpl
