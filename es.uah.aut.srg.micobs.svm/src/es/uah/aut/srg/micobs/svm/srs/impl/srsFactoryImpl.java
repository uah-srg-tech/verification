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
package es.uah.aut.srg.micobs.svm.srs.impl;

import es.uah.aut.srg.micobs.svm.srs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class srsFactoryImpl extends EFactoryImpl implements srsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static srsFactory init() {
		try {
			srsFactory thesrsFactory = (srsFactory)EPackage.Registry.INSTANCE.getEFactory(srsPackage.eNS_URI);
			if (thesrsFactory != null) {
				return thesrsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new srsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public srsFactoryImpl() {
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
			case srsPackage.VSRS_DOCUMENT: return createVSRSDocument();
			case srsPackage.VSRSTB_CS_TB_DS: return createVSRSTBCsTBDs();
			case srsPackage.VSRS_INTRODUCTION: return createVSRSIntroduction();
			case srsPackage.VSRS_APPLICABLE_DOCUMENTS: return createVSRSApplicableDocuments();
			case srsPackage.VSRS_REFERENCE_DOCUMENTS: return createVSRSReferenceDocuments();
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS: return createVSRSTermsDefinitionsAbbreviations();
			case srsPackage.VSRS_TERM: return createVSRSTerm();
			case srsPackage.VSRS_DEFINITION: return createVSRSDefinition();
			case srsPackage.VSRS_ABBREVIATION: return createVSRSAbbreviation();
			case srsPackage.VSRS_FIXED_SECTION: return createVSRSFixedSection();
			case srsPackage.VSRS_INSTANTIABLE_SECTION: return createVSRSInstantiableSection();
			case srsPackage.VSRS_SOFTWARE_OVERVIEW: return createVSRSSoftwareOverview();
			case srsPackage.VSRS_INSTANTIABLE_REQUIREMENT_SECTION: return createVSRSInstantiableRequirementSection();
			case srsPackage.VSRS_REQUIREMENTS: return createVSRSRequirements();
			case srsPackage.VSRS_GENERAL_REQUIREMENTS: return createVSRSGeneralRequirements();
			case srsPackage.VSRS_FUNCTIONAL_REQUIREMENTS: return createVSRSFunctionalRequirements();
			case srsPackage.VSRS_PERFORMANCE_REQUIREMENTS: return createVSRSPerformanceRequirements();
			case srsPackage.VSRS_INTERFACE_REQUIREMENTS: return createVSRSInterfaceRequirements();
			case srsPackage.VSRS_OPERATIONAL_REQUIREMENTS: return createVSRSOperationalRequirements();
			case srsPackage.VSRS_RESOURCES_REQUIREMENTS: return createVSRSResourcesRequirements();
			case srsPackage.VSRS_DESIGN_REQUIREMENTS: return createVSRSDesignRequirements();
			case srsPackage.VSRS_SECURITY_PRIVACY_REQUIREMENTS: return createVSRSSecurityPrivacyRequirements();
			case srsPackage.VSRS_PORTABILITY_REQUIREMENTS: return createVSRSPortabilityRequirements();
			case srsPackage.VSRSSW_QUALITY_REQUIREMENTS: return createVSRSSWQualityRequirements();
			case srsPackage.VSRSSW_RELIABILITY_REQUIREMENTS: return createVSRSSWReliabilityRequirements();
			case srsPackage.VSRSSW_MAINTAINABILITY_REQUIREMENTS: return createVSRSSWMaintainabilityRequirements();
			case srsPackage.VSRSSW_SAFETY_REQUIREMENTS: return createVSRSSWSafetyRequirements();
			case srsPackage.VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS: return createVSRSSWConfigurationDeliveryRequirements();
			case srsPackage.VSRS_DATA_DEFINITION_DB_REQUIREMENTS: return createVSRSDataDefinitionDBRequirements();
			case srsPackage.VSRS_HUMAN_FACTORS_REQUIREMENTS: return createVSRSHumanFactorsRequirements();
			case srsPackage.VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS: return createVSRSAdaptationInstallationRequirements();
			case srsPackage.VSRS_DOCUMENT_ITEM: return createVSRSDocumentItem();
			case srsPackage.VSRS_LOGICAL_MODELS: return createVSRSLogicalModels();
			case srsPackage.VSRS_LOGICAL_MODEL: return createVSRSLogicalModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case srsPackage.VSRS_DOCUMENT_ITEM_MODES:
				return createVSRSDocumentItemModesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case srsPackage.VSRS_DOCUMENT_ITEM_MODES:
				return convertVSRSDocumentItemModesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSDocument createVSRSDocument() {
		VSRSDocumentImpl vsrsDocument = new VSRSDocumentImpl();
		return vsrsDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSTBCsTBDs createVSRSTBCsTBDs() {
		VSRSTBCsTBDsImpl vsrstbCsTBDs = new VSRSTBCsTBDsImpl();
		return vsrstbCsTBDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSIntroduction createVSRSIntroduction() {
		VSRSIntroductionImpl vsrsIntroduction = new VSRSIntroductionImpl();
		return vsrsIntroduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSApplicableDocuments createVSRSApplicableDocuments() {
		VSRSApplicableDocumentsImpl vsrsApplicableDocuments = new VSRSApplicableDocumentsImpl();
		return vsrsApplicableDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSReferenceDocuments createVSRSReferenceDocuments() {
		VSRSReferenceDocumentsImpl vsrsReferenceDocuments = new VSRSReferenceDocumentsImpl();
		return vsrsReferenceDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSTermsDefinitionsAbbreviations createVSRSTermsDefinitionsAbbreviations() {
		VSRSTermsDefinitionsAbbreviationsImpl vsrsTermsDefinitionsAbbreviations = new VSRSTermsDefinitionsAbbreviationsImpl();
		return vsrsTermsDefinitionsAbbreviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSTerm createVSRSTerm() {
		VSRSTermImpl vsrsTerm = new VSRSTermImpl();
		return vsrsTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSDefinition createVSRSDefinition() {
		VSRSDefinitionImpl vsrsDefinition = new VSRSDefinitionImpl();
		return vsrsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSAbbreviation createVSRSAbbreviation() {
		VSRSAbbreviationImpl vsrsAbbreviation = new VSRSAbbreviationImpl();
		return vsrsAbbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSFixedSection createVSRSFixedSection() {
		VSRSFixedSectionImpl vsrsFixedSection = new VSRSFixedSectionImpl();
		return vsrsFixedSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSInstantiableSection createVSRSInstantiableSection() {
		VSRSInstantiableSectionImpl vsrsInstantiableSection = new VSRSInstantiableSectionImpl();
		return vsrsInstantiableSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSoftwareOverview createVSRSSoftwareOverview() {
		VSRSSoftwareOverviewImpl vsrsSoftwareOverview = new VSRSSoftwareOverviewImpl();
		return vsrsSoftwareOverview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSInstantiableRequirementSection createVSRSInstantiableRequirementSection() {
		VSRSInstantiableRequirementSectionImpl vsrsInstantiableRequirementSection = new VSRSInstantiableRequirementSectionImpl();
		return vsrsInstantiableRequirementSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSRequirements createVSRSRequirements() {
		VSRSRequirementsImpl vsrsRequirements = new VSRSRequirementsImpl();
		return vsrsRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSGeneralRequirements createVSRSGeneralRequirements() {
		VSRSGeneralRequirementsImpl vsrsGeneralRequirements = new VSRSGeneralRequirementsImpl();
		return vsrsGeneralRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSFunctionalRequirements createVSRSFunctionalRequirements() {
		VSRSFunctionalRequirementsImpl vsrsFunctionalRequirements = new VSRSFunctionalRequirementsImpl();
		return vsrsFunctionalRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSPerformanceRequirements createVSRSPerformanceRequirements() {
		VSRSPerformanceRequirementsImpl vsrsPerformanceRequirements = new VSRSPerformanceRequirementsImpl();
		return vsrsPerformanceRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSInterfaceRequirements createVSRSInterfaceRequirements() {
		VSRSInterfaceRequirementsImpl vsrsInterfaceRequirements = new VSRSInterfaceRequirementsImpl();
		return vsrsInterfaceRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSOperationalRequirements createVSRSOperationalRequirements() {
		VSRSOperationalRequirementsImpl vsrsOperationalRequirements = new VSRSOperationalRequirementsImpl();
		return vsrsOperationalRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSResourcesRequirements createVSRSResourcesRequirements() {
		VSRSResourcesRequirementsImpl vsrsResourcesRequirements = new VSRSResourcesRequirementsImpl();
		return vsrsResourcesRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSDesignRequirements createVSRSDesignRequirements() {
		VSRSDesignRequirementsImpl vsrsDesignRequirements = new VSRSDesignRequirementsImpl();
		return vsrsDesignRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSecurityPrivacyRequirements createVSRSSecurityPrivacyRequirements() {
		VSRSSecurityPrivacyRequirementsImpl vsrsSecurityPrivacyRequirements = new VSRSSecurityPrivacyRequirementsImpl();
		return vsrsSecurityPrivacyRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSPortabilityRequirements createVSRSPortabilityRequirements() {
		VSRSPortabilityRequirementsImpl vsrsPortabilityRequirements = new VSRSPortabilityRequirementsImpl();
		return vsrsPortabilityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSWQualityRequirements createVSRSSWQualityRequirements() {
		VSRSSWQualityRequirementsImpl vsrsswQualityRequirements = new VSRSSWQualityRequirementsImpl();
		return vsrsswQualityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSWReliabilityRequirements createVSRSSWReliabilityRequirements() {
		VSRSSWReliabilityRequirementsImpl vsrsswReliabilityRequirements = new VSRSSWReliabilityRequirementsImpl();
		return vsrsswReliabilityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSWMaintainabilityRequirements createVSRSSWMaintainabilityRequirements() {
		VSRSSWMaintainabilityRequirementsImpl vsrsswMaintainabilityRequirements = new VSRSSWMaintainabilityRequirementsImpl();
		return vsrsswMaintainabilityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSWSafetyRequirements createVSRSSWSafetyRequirements() {
		VSRSSWSafetyRequirementsImpl vsrsswSafetyRequirements = new VSRSSWSafetyRequirementsImpl();
		return vsrsswSafetyRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSWConfigurationDeliveryRequirements createVSRSSWConfigurationDeliveryRequirements() {
		VSRSSWConfigurationDeliveryRequirementsImpl vsrsswConfigurationDeliveryRequirements = new VSRSSWConfigurationDeliveryRequirementsImpl();
		return vsrsswConfigurationDeliveryRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSDataDefinitionDBRequirements createVSRSDataDefinitionDBRequirements() {
		VSRSDataDefinitionDBRequirementsImpl vsrsDataDefinitionDBRequirements = new VSRSDataDefinitionDBRequirementsImpl();
		return vsrsDataDefinitionDBRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSHumanFactorsRequirements createVSRSHumanFactorsRequirements() {
		VSRSHumanFactorsRequirementsImpl vsrsHumanFactorsRequirements = new VSRSHumanFactorsRequirementsImpl();
		return vsrsHumanFactorsRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSAdaptationInstallationRequirements createVSRSAdaptationInstallationRequirements() {
		VSRSAdaptationInstallationRequirementsImpl vsrsAdaptationInstallationRequirements = new VSRSAdaptationInstallationRequirementsImpl();
		return vsrsAdaptationInstallationRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSDocumentItem createVSRSDocumentItem() {
		VSRSDocumentItemImpl vsrsDocumentItem = new VSRSDocumentItemImpl();
		return vsrsDocumentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSLogicalModels createVSRSLogicalModels() {
		VSRSLogicalModelsImpl vsrsLogicalModels = new VSRSLogicalModelsImpl();
		return vsrsLogicalModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSLogicalModel createVSRSLogicalModel() {
		VSRSLogicalModelImpl vsrsLogicalModel = new VSRSLogicalModelImpl();
		return vsrsLogicalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSDocumentItemModes createVSRSDocumentItemModesFromString(EDataType eDataType, String initialValue) {
		VSRSDocumentItemModes result = VSRSDocumentItemModes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVSRSDocumentItemModesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public srsPackage getsrsPackage() {
		return (srsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static srsPackage getPackage() {
		return srsPackage.eINSTANCE;
	}

} //srsFactoryImpl
