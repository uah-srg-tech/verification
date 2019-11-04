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
package es.uah.aut.srg.micobs.svm.srs.util;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.svm.srs.*;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableGroup;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage
 * @generated
 */
public class srsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static srsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public srsSwitch() {
		if (modelPackage == null) {
			modelPackage = srsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case srsPackage.VSRS_DOCUMENT: {
				VSRSDocument vsrsDocument = (VSRSDocument)theEObject;
				T result = caseVSRSDocument(vsrsDocument);
				if (result == null) result = caseVTraceableDocument(vsrsDocument);
				if (result == null) result = caseDDocumentTemplate(vsrsDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_INTRODUCTION: {
				VSRSIntroduction vsrsIntroduction = (VSRSIntroduction)theEObject;
				T result = caseVSRSIntroduction(vsrsIntroduction);
				if (result == null) result = caseDFixedSection(vsrsIntroduction);
				if (result == null) result = caseDAbstractSection(vsrsIntroduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_APPLICABLE_DOCUMENTS: {
				VSRSApplicableDocuments vsrsApplicableDocuments = (VSRSApplicableDocuments)theEObject;
				T result = caseVSRSApplicableDocuments(vsrsApplicableDocuments);
				if (result == null) result = caseDFixedSection(vsrsApplicableDocuments);
				if (result == null) result = caseDAbstractSection(vsrsApplicableDocuments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_REFERENCE_DOCUMENTS: {
				VSRSReferenceDocuments vsrsReferenceDocuments = (VSRSReferenceDocuments)theEObject;
				T result = caseVSRSReferenceDocuments(vsrsReferenceDocuments);
				if (result == null) result = caseDFixedSection(vsrsReferenceDocuments);
				if (result == null) result = caseDAbstractSection(vsrsReferenceDocuments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS: {
				VSRSTermsDefinitionsAbbreviations vsrsTermsDefinitionsAbbreviations = (VSRSTermsDefinitionsAbbreviations)theEObject;
				T result = caseVSRSTermsDefinitionsAbbreviations(vsrsTermsDefinitionsAbbreviations);
				if (result == null) result = caseDFixedSection(vsrsTermsDefinitionsAbbreviations);
				if (result == null) result = caseDAbstractSection(vsrsTermsDefinitionsAbbreviations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_ABSTRACT_BRIEF_DESCRIPTION: {
				VSRSAbstractBriefDescription vsrsAbstractBriefDescription = (VSRSAbstractBriefDescription)theEObject;
				T result = caseVSRSAbstractBriefDescription(vsrsAbstractBriefDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_TERM: {
				VSRSTerm vsrsTerm = (VSRSTerm)theEObject;
				T result = caseVSRSTerm(vsrsTerm);
				if (result == null) result = caseVSRSAbstractBriefDescription(vsrsTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_DEFINITION: {
				VSRSDefinition vsrsDefinition = (VSRSDefinition)theEObject;
				T result = caseVSRSDefinition(vsrsDefinition);
				if (result == null) result = caseVSRSAbstractBriefDescription(vsrsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_ABBREVIATION: {
				VSRSAbbreviation vsrsAbbreviation = (VSRSAbbreviation)theEObject;
				T result = caseVSRSAbbreviation(vsrsAbbreviation);
				if (result == null) result = caseVSRSAbstractBriefDescription(vsrsAbbreviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_FIXED_SECTION: {
				VSRSFixedSection vsrsFixedSection = (VSRSFixedSection)theEObject;
				T result = caseVSRSFixedSection(vsrsFixedSection);
				if (result == null) result = caseDFixedSection(vsrsFixedSection);
				if (result == null) result = caseDAbstractSection(vsrsFixedSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_INSTANTIABLE_SECTION: {
				VSRSInstantiableSection vsrsInstantiableSection = (VSRSInstantiableSection)theEObject;
				T result = caseVSRSInstantiableSection(vsrsInstantiableSection);
				if (result == null) result = caseDInstantiableSection(vsrsInstantiableSection);
				if (result == null) result = caseDAbstractSection(vsrsInstantiableSection);
				if (result == null) result = caseMCommonReferenceableObj(vsrsInstantiableSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_SOFTWARE_OVERVIEW: {
				VSRSSoftwareOverview vsrsSoftwareOverview = (VSRSSoftwareOverview)theEObject;
				T result = caseVSRSSoftwareOverview(vsrsSoftwareOverview);
				if (result == null) result = caseDFixedSection(vsrsSoftwareOverview);
				if (result == null) result = caseDAbstractSection(vsrsSoftwareOverview);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION: {
				VSRSAbstractRequirementSection vsrsAbstractRequirementSection = (VSRSAbstractRequirementSection)theEObject;
				T result = caseVSRSAbstractRequirementSection(vsrsAbstractRequirementSection);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsAbstractRequirementSection);
				if (result == null) result = caseDFixedSection(vsrsAbstractRequirementSection);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsAbstractRequirementSection);
				if (result == null) result = caseDAbstractSection(vsrsAbstractRequirementSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_INSTANTIABLE_REQUIREMENT_SECTION: {
				VSRSInstantiableRequirementSection vsrsInstantiableRequirementSection = (VSRSInstantiableRequirementSection)theEObject;
				T result = caseVSRSInstantiableRequirementSection(vsrsInstantiableRequirementSection);
				if (result == null) result = caseVTraceableDocumentInstantiableGroup(vsrsInstantiableRequirementSection);
				if (result == null) result = caseDInstantiableSection(vsrsInstantiableRequirementSection);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsInstantiableRequirementSection);
				if (result == null) result = caseMCommonReferenceableObj(vsrsInstantiableRequirementSection);
				if (result == null) result = caseDAbstractSection(vsrsInstantiableRequirementSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_REQUIREMENTS: {
				VSRSRequirements vsrsRequirements = (VSRSRequirements)theEObject;
				T result = caseVSRSRequirements(vsrsRequirements);
				if (result == null) result = caseDFixedSection(vsrsRequirements);
				if (result == null) result = caseDAbstractSection(vsrsRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_GENERAL_REQUIREMENTS: {
				VSRSGeneralRequirements vsrsGeneralRequirements = (VSRSGeneralRequirements)theEObject;
				T result = caseVSRSGeneralRequirements(vsrsGeneralRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsGeneralRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsGeneralRequirements);
				if (result == null) result = caseDFixedSection(vsrsGeneralRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsGeneralRequirements);
				if (result == null) result = caseDAbstractSection(vsrsGeneralRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_FUNCTIONAL_REQUIREMENTS: {
				VSRSFunctionalRequirements vsrsFunctionalRequirements = (VSRSFunctionalRequirements)theEObject;
				T result = caseVSRSFunctionalRequirements(vsrsFunctionalRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsFunctionalRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsFunctionalRequirements);
				if (result == null) result = caseDFixedSection(vsrsFunctionalRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsFunctionalRequirements);
				if (result == null) result = caseDAbstractSection(vsrsFunctionalRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_PERFORMANCE_REQUIREMENTS: {
				VSRSPerformanceRequirements vsrsPerformanceRequirements = (VSRSPerformanceRequirements)theEObject;
				T result = caseVSRSPerformanceRequirements(vsrsPerformanceRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsPerformanceRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsPerformanceRequirements);
				if (result == null) result = caseDFixedSection(vsrsPerformanceRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsPerformanceRequirements);
				if (result == null) result = caseDAbstractSection(vsrsPerformanceRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_INTERFACE_REQUIREMENTS: {
				VSRSInterfaceRequirements vsrsInterfaceRequirements = (VSRSInterfaceRequirements)theEObject;
				T result = caseVSRSInterfaceRequirements(vsrsInterfaceRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsInterfaceRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsInterfaceRequirements);
				if (result == null) result = caseDFixedSection(vsrsInterfaceRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsInterfaceRequirements);
				if (result == null) result = caseDAbstractSection(vsrsInterfaceRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_OPERATIONAL_REQUIREMENTS: {
				VSRSOperationalRequirements vsrsOperationalRequirements = (VSRSOperationalRequirements)theEObject;
				T result = caseVSRSOperationalRequirements(vsrsOperationalRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsOperationalRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsOperationalRequirements);
				if (result == null) result = caseDFixedSection(vsrsOperationalRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsOperationalRequirements);
				if (result == null) result = caseDAbstractSection(vsrsOperationalRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_RESOURCES_REQUIREMENTS: {
				VSRSResourcesRequirements vsrsResourcesRequirements = (VSRSResourcesRequirements)theEObject;
				T result = caseVSRSResourcesRequirements(vsrsResourcesRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsResourcesRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsResourcesRequirements);
				if (result == null) result = caseDFixedSection(vsrsResourcesRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsResourcesRequirements);
				if (result == null) result = caseDAbstractSection(vsrsResourcesRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_DESIGN_REQUIREMENTS: {
				VSRSDesignRequirements vsrsDesignRequirements = (VSRSDesignRequirements)theEObject;
				T result = caseVSRSDesignRequirements(vsrsDesignRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsDesignRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsDesignRequirements);
				if (result == null) result = caseDFixedSection(vsrsDesignRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsDesignRequirements);
				if (result == null) result = caseDAbstractSection(vsrsDesignRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_SECURITY_PRIVACY_REQUIREMENTS: {
				VSRSSecurityPrivacyRequirements vsrsSecurityPrivacyRequirements = (VSRSSecurityPrivacyRequirements)theEObject;
				T result = caseVSRSSecurityPrivacyRequirements(vsrsSecurityPrivacyRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsSecurityPrivacyRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsSecurityPrivacyRequirements);
				if (result == null) result = caseDFixedSection(vsrsSecurityPrivacyRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsSecurityPrivacyRequirements);
				if (result == null) result = caseDAbstractSection(vsrsSecurityPrivacyRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_PORTABILITY_REQUIREMENTS: {
				VSRSPortabilityRequirements vsrsPortabilityRequirements = (VSRSPortabilityRequirements)theEObject;
				T result = caseVSRSPortabilityRequirements(vsrsPortabilityRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsPortabilityRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsPortabilityRequirements);
				if (result == null) result = caseDFixedSection(vsrsPortabilityRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsPortabilityRequirements);
				if (result == null) result = caseDAbstractSection(vsrsPortabilityRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRSSW_QUALITY_REQUIREMENTS: {
				VSRSSWQualityRequirements vsrsswQualityRequirements = (VSRSSWQualityRequirements)theEObject;
				T result = caseVSRSSWQualityRequirements(vsrsswQualityRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsswQualityRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsswQualityRequirements);
				if (result == null) result = caseDFixedSection(vsrsswQualityRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsswQualityRequirements);
				if (result == null) result = caseDAbstractSection(vsrsswQualityRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRSSW_RELIABILITY_REQUIREMENTS: {
				VSRSSWReliabilityRequirements vsrsswReliabilityRequirements = (VSRSSWReliabilityRequirements)theEObject;
				T result = caseVSRSSWReliabilityRequirements(vsrsswReliabilityRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsswReliabilityRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsswReliabilityRequirements);
				if (result == null) result = caseDFixedSection(vsrsswReliabilityRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsswReliabilityRequirements);
				if (result == null) result = caseDAbstractSection(vsrsswReliabilityRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRSSW_MAINTAINABILITY_REQUIREMENTS: {
				VSRSSWMaintainabilityRequirements vsrsswMaintainabilityRequirements = (VSRSSWMaintainabilityRequirements)theEObject;
				T result = caseVSRSSWMaintainabilityRequirements(vsrsswMaintainabilityRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsswMaintainabilityRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsswMaintainabilityRequirements);
				if (result == null) result = caseDFixedSection(vsrsswMaintainabilityRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsswMaintainabilityRequirements);
				if (result == null) result = caseDAbstractSection(vsrsswMaintainabilityRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRSSW_SAFETY_REQUIREMENTS: {
				VSRSSWSafetyRequirements vsrsswSafetyRequirements = (VSRSSWSafetyRequirements)theEObject;
				T result = caseVSRSSWSafetyRequirements(vsrsswSafetyRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsswSafetyRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsswSafetyRequirements);
				if (result == null) result = caseDFixedSection(vsrsswSafetyRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsswSafetyRequirements);
				if (result == null) result = caseDAbstractSection(vsrsswSafetyRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS: {
				VSRSSWConfigurationDeliveryRequirements vsrsswConfigurationDeliveryRequirements = (VSRSSWConfigurationDeliveryRequirements)theEObject;
				T result = caseVSRSSWConfigurationDeliveryRequirements(vsrsswConfigurationDeliveryRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsswConfigurationDeliveryRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsswConfigurationDeliveryRequirements);
				if (result == null) result = caseDFixedSection(vsrsswConfigurationDeliveryRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsswConfigurationDeliveryRequirements);
				if (result == null) result = caseDAbstractSection(vsrsswConfigurationDeliveryRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_DATA_DEFINITION_DB_REQUIREMENTS: {
				VSRSDataDefinitionDBRequirements vsrsDataDefinitionDBRequirements = (VSRSDataDefinitionDBRequirements)theEObject;
				T result = caseVSRSDataDefinitionDBRequirements(vsrsDataDefinitionDBRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsDataDefinitionDBRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsDataDefinitionDBRequirements);
				if (result == null) result = caseDFixedSection(vsrsDataDefinitionDBRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsDataDefinitionDBRequirements);
				if (result == null) result = caseDAbstractSection(vsrsDataDefinitionDBRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_HUMAN_FACTORS_REQUIREMENTS: {
				VSRSHumanFactorsRequirements vsrsHumanFactorsRequirements = (VSRSHumanFactorsRequirements)theEObject;
				T result = caseVSRSHumanFactorsRequirements(vsrsHumanFactorsRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsHumanFactorsRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsHumanFactorsRequirements);
				if (result == null) result = caseDFixedSection(vsrsHumanFactorsRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsHumanFactorsRequirements);
				if (result == null) result = caseDAbstractSection(vsrsHumanFactorsRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS: {
				VSRSAdaptationInstallationRequirements vsrsAdaptationInstallationRequirements = (VSRSAdaptationInstallationRequirements)theEObject;
				T result = caseVSRSAdaptationInstallationRequirements(vsrsAdaptationInstallationRequirements);
				if (result == null) result = caseVSRSAbstractRequirementSection(vsrsAdaptationInstallationRequirements);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsrsAdaptationInstallationRequirements);
				if (result == null) result = caseDFixedSection(vsrsAdaptationInstallationRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsrsAdaptationInstallationRequirements);
				if (result == null) result = caseDAbstractSection(vsrsAdaptationInstallationRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_DOCUMENT_ITEM: {
				VSRSDocumentItem vsrsDocumentItem = (VSRSDocumentItem)theEObject;
				T result = caseVSRSDocumentItem(vsrsDocumentItem);
				if (result == null) result = caseVTraceableDocumentAbstractItem(vsrsDocumentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_LOGICAL_MODELS: {
				VSRSLogicalModels vsrsLogicalModels = (VSRSLogicalModels)theEObject;
				T result = caseVSRSLogicalModels(vsrsLogicalModels);
				if (result == null) result = caseDFixedSection(vsrsLogicalModels);
				if (result == null) result = caseDAbstractSection(vsrsLogicalModels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case srsPackage.VSRS_LOGICAL_MODEL: {
				VSRSLogicalModel vsrsLogicalModel = (VSRSLogicalModel)theEObject;
				T result = caseVSRSLogicalModel(vsrsLogicalModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSDocument(VSRSDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Introduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSIntroduction(VSRSIntroduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Applicable Documents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Applicable Documents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSApplicableDocuments(VSRSApplicableDocuments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Reference Documents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Reference Documents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSReferenceDocuments(VSRSReferenceDocuments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Terms Definitions Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Terms Definitions Abbreviations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSTermsDefinitionsAbbreviations(VSRSTermsDefinitionsAbbreviations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Abstract Brief Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Abstract Brief Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSAbstractBriefDescription(VSRSAbstractBriefDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSTerm(VSRSTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSDefinition(VSRSDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Abbreviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Abbreviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSAbbreviation(VSRSAbbreviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Fixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Fixed Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSFixedSection(VSRSFixedSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Instantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Instantiable Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSInstantiableSection(VSRSInstantiableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Software Overview</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Software Overview</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSSoftwareOverview(VSRSSoftwareOverview object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Abstract Requirement Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Abstract Requirement Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSAbstractRequirementSection(VSRSAbstractRequirementSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Instantiable Requirement Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Instantiable Requirement Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSInstantiableRequirementSection(VSRSInstantiableRequirementSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSRequirements(VSRSRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS General Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS General Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSGeneralRequirements(VSRSGeneralRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Functional Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Functional Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSFunctionalRequirements(VSRSFunctionalRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Performance Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Performance Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSPerformanceRequirements(VSRSPerformanceRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Interface Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Interface Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSInterfaceRequirements(VSRSInterfaceRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Operational Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Operational Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSOperationalRequirements(VSRSOperationalRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Resources Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Resources Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSResourcesRequirements(VSRSResourcesRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Design Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Design Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSDesignRequirements(VSRSDesignRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Security Privacy Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Security Privacy Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSSecurityPrivacyRequirements(VSRSSecurityPrivacyRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Portability Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Portability Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSPortabilityRequirements(VSRSPortabilityRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRSSW Quality Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRSSW Quality Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSSWQualityRequirements(VSRSSWQualityRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRSSW Reliability Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRSSW Reliability Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSSWReliabilityRequirements(VSRSSWReliabilityRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRSSW Maintainability Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRSSW Maintainability Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSSWMaintainabilityRequirements(VSRSSWMaintainabilityRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRSSW Safety Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRSSW Safety Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSSWSafetyRequirements(VSRSSWSafetyRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRSSW Configuration Delivery Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRSSW Configuration Delivery Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSSWConfigurationDeliveryRequirements(VSRSSWConfigurationDeliveryRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Data Definition DB Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Data Definition DB Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSDataDefinitionDBRequirements(VSRSDataDefinitionDBRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Human Factors Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Human Factors Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSHumanFactorsRequirements(VSRSHumanFactorsRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Adaptation Installation Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Adaptation Installation Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSAdaptationInstallationRequirements(VSRSAdaptationInstallationRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Document Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Document Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSDocumentItem(VSRSDocumentItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Logical Models</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Logical Models</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSLogicalModels(VSRSLogicalModels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSRS Logical Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSRS Logical Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSRSLogicalModel(VSRSLogicalModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTraceable Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTraceable Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTraceableDocument(VTraceableDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDocument Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDocument Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDocumentTemplate(es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAbstract Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAbstract Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAbstractSection(es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFixed Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFixedSection(es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonReferenceableObj(MCommonReferenceableObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DInstantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DInstantiable Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDInstantiableSection(es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTraceable Document Abstract Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTraceable Document Abstract Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTraceableDocumentAbstractGroup(VTraceableDocumentAbstractGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTraceable Document Fixed Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTraceable Document Fixed Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTraceableDocumentFixedGroup(VTraceableDocumentFixedGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTraceable Document Instantiable Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTraceable Document Instantiable Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTraceableDocumentInstantiableGroup(VTraceableDocumentInstantiableGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTraceable Document Abstract Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTraceable Document Abstract Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTraceableDocumentAbstractItem(VTraceableDocumentAbstractItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //srsSwitch
