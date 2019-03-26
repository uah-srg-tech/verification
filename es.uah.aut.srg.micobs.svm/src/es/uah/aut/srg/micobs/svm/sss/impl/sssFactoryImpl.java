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
			case sssPackage.VSSS_INTRODUCTION: return createVSSSIntroduction();
			case sssPackage.VSSS_APPLICABLE_DOCUMENTS: return createVSSSApplicableDocuments();
			case sssPackage.VSSS_REFERENCE_DOCUMENTS: return createVSSSReferenceDocuments();
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS: return createVSSSTermsDefinitionsAbbreviations();
			case sssPackage.VSSS_TERM: return createVSSSTerm();
			case sssPackage.VSSS_DEFINITION: return createVSSSDefinition();
			case sssPackage.VSSS_ABBREVIATION: return createVSSSAbbreviation();
			case sssPackage.VSSS_GENERAL_DESCRIPTION: return createVSSSGeneralDescription();
			case sssPackage.VSSS_PRODUCT_PERSPECTIVE: return createVSSSProductPerspective();
			case sssPackage.VSSS_GENERAL_CAPABILITES: return createVSSSGeneralCapabilites();
			case sssPackage.VSSS_GENERAL_CONSTRAINTS: return createVSSSGeneralConstraints();
			case sssPackage.VSSS_OPERATIONAL_ENVIRONMENT: return createVSSSOperationalEnvironment();
			case sssPackage.VSSS_ASSUMPTIONS_DEPENDENCIES: return createVSSSAssumptionsDependencies();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS: return createVSSSSpecificRequirements();
			case sssPackage.VSSS_GENERAL_REQUIREMENT: return createVSSSGeneralRequirement();
			case sssPackage.VSSS_CAPABILITIES_REQUIREMENT: return createVSSSCapabilitiesRequirement();
			case sssPackage.VSSS_SYSTEM_INTERFACE_REQUIREMENT: return createVSSSSystemInterfaceRequirement();
			case sssPackage.VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT: return createVSSSAdaptationMissionizationRequirement();
			case sssPackage.VSSS_COMPUTER_RESOURCE_REQUIREMENT: return createVSSSComputerResourceRequirement();
			case sssPackage.VSSS_SECURITY_REQUIREMENT: return createVSSSSecurityRequirement();
			case sssPackage.VSSS_SAFETY_REQUIREMENT: return createVSSSSafetyRequirement();
			case sssPackage.VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT: return createVSSSReliabiltyAvailabilityRequirement();
			case sssPackage.VSSS_QUALITY_REQUIREMENT: return createVSSSQualityRequirement();
			case sssPackage.VSSS_DESIGN_REQUIREMENT: return createVSSSDesignRequirement();
			case sssPackage.VSSS_SOFTWARE_OPERATIONS_REQUIREMENT: return createVSSSSoftwareOperationsRequirement();
			case sssPackage.VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT: return createVSSSSoftwareMaintenanceRequirement();
			case sssPackage.VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT: return createVSSSSystemSoftwareObservabilityRequirement();
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS: return createVSSSVerificationValidationIntegrationRequirements();
			case sssPackage.VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT: return createVSSSVerificationValidationProcessRequirement();
			case sssPackage.VSSS_VALIDATION_APPROACH: return createVSSSValidationApproach();
			case sssPackage.VSSS_VERIFICATION_REQUIREMENT: return createVSSSVerificationRequirement();
			case sssPackage.VSSS_VALIDATION_REQUIREMENT: return createVSSSValidationRequirement();
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
	public VSSSGeneralDescription createVSSSGeneralDescription() {
		VSSSGeneralDescriptionImpl vsssGeneralDescription = new VSSSGeneralDescriptionImpl();
		return vsssGeneralDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSProductPerspective createVSSSProductPerspective() {
		VSSSProductPerspectiveImpl vsssProductPerspective = new VSSSProductPerspectiveImpl();
		return vsssProductPerspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSGeneralCapabilites createVSSSGeneralCapabilites() {
		VSSSGeneralCapabilitesImpl vsssGeneralCapabilites = new VSSSGeneralCapabilitesImpl();
		return vsssGeneralCapabilites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSGeneralConstraints createVSSSGeneralConstraints() {
		VSSSGeneralConstraintsImpl vsssGeneralConstraints = new VSSSGeneralConstraintsImpl();
		return vsssGeneralConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSOperationalEnvironment createVSSSOperationalEnvironment() {
		VSSSOperationalEnvironmentImpl vsssOperationalEnvironment = new VSSSOperationalEnvironmentImpl();
		return vsssOperationalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSAssumptionsDependencies createVSSSAssumptionsDependencies() {
		VSSSAssumptionsDependenciesImpl vsssAssumptionsDependencies = new VSSSAssumptionsDependenciesImpl();
		return vsssAssumptionsDependencies;
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
	public VSSSGeneralRequirement createVSSSGeneralRequirement() {
		VSSSGeneralRequirementImpl vsssGeneralRequirement = new VSSSGeneralRequirementImpl();
		return vsssGeneralRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSCapabilitiesRequirement createVSSSCapabilitiesRequirement() {
		VSSSCapabilitiesRequirementImpl vsssCapabilitiesRequirement = new VSSSCapabilitiesRequirementImpl();
		return vsssCapabilitiesRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSystemInterfaceRequirement createVSSSSystemInterfaceRequirement() {
		VSSSSystemInterfaceRequirementImpl vsssSystemInterfaceRequirement = new VSSSSystemInterfaceRequirementImpl();
		return vsssSystemInterfaceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSAdaptationMissionizationRequirement createVSSSAdaptationMissionizationRequirement() {
		VSSSAdaptationMissionizationRequirementImpl vsssAdaptationMissionizationRequirement = new VSSSAdaptationMissionizationRequirementImpl();
		return vsssAdaptationMissionizationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSComputerResourceRequirement createVSSSComputerResourceRequirement() {
		VSSSComputerResourceRequirementImpl vsssComputerResourceRequirement = new VSSSComputerResourceRequirementImpl();
		return vsssComputerResourceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSecurityRequirement createVSSSSecurityRequirement() {
		VSSSSecurityRequirementImpl vsssSecurityRequirement = new VSSSSecurityRequirementImpl();
		return vsssSecurityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSafetyRequirement createVSSSSafetyRequirement() {
		VSSSSafetyRequirementImpl vsssSafetyRequirement = new VSSSSafetyRequirementImpl();
		return vsssSafetyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSReliabiltyAvailabilityRequirement createVSSSReliabiltyAvailabilityRequirement() {
		VSSSReliabiltyAvailabilityRequirementImpl vsssReliabiltyAvailabilityRequirement = new VSSSReliabiltyAvailabilityRequirementImpl();
		return vsssReliabiltyAvailabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSQualityRequirement createVSSSQualityRequirement() {
		VSSSQualityRequirementImpl vsssQualityRequirement = new VSSSQualityRequirementImpl();
		return vsssQualityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSDesignRequirement createVSSSDesignRequirement() {
		VSSSDesignRequirementImpl vsssDesignRequirement = new VSSSDesignRequirementImpl();
		return vsssDesignRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSoftwareOperationsRequirement createVSSSSoftwareOperationsRequirement() {
		VSSSSoftwareOperationsRequirementImpl vsssSoftwareOperationsRequirement = new VSSSSoftwareOperationsRequirementImpl();
		return vsssSoftwareOperationsRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSoftwareMaintenanceRequirement createVSSSSoftwareMaintenanceRequirement() {
		VSSSSoftwareMaintenanceRequirementImpl vsssSoftwareMaintenanceRequirement = new VSSSSoftwareMaintenanceRequirementImpl();
		return vsssSoftwareMaintenanceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSystemSoftwareObservabilityRequirement createVSSSSystemSoftwareObservabilityRequirement() {
		VSSSSystemSoftwareObservabilityRequirementImpl vsssSystemSoftwareObservabilityRequirement = new VSSSSystemSoftwareObservabilityRequirementImpl();
		return vsssSystemSoftwareObservabilityRequirement;
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
	public VSSSVerificationValidationProcessRequirement createVSSSVerificationValidationProcessRequirement() {
		VSSSVerificationValidationProcessRequirementImpl vsssVerificationValidationProcessRequirement = new VSSSVerificationValidationProcessRequirementImpl();
		return vsssVerificationValidationProcessRequirement;
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
	public VSSSVerificationRequirement createVSSSVerificationRequirement() {
		VSSSVerificationRequirementImpl vsssVerificationRequirement = new VSSSVerificationRequirementImpl();
		return vsssVerificationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSValidationRequirement createVSSSValidationRequirement() {
		VSSSValidationRequirementImpl vsssValidationRequirement = new VSSSValidationRequirementImpl();
		return vsssValidationRequirement;
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
