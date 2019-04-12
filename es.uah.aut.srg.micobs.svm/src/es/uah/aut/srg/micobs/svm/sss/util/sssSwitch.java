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
package es.uah.aut.srg.micobs.svm.sss.util;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doc.DFixedSection;

import es.uah.aut.srg.micobs.doctpl.doc.DInstantiableSection;
import es.uah.aut.srg.micobs.svm.sss.*;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;
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
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage
 * @generated
 */
public class sssSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static sssPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sssSwitch() {
		if (modelPackage == null) {
			modelPackage = sssPackage.eINSTANCE;
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
			case sssPackage.VSSS_DOCUMENT: {
				VSSSDocument vsssDocument = (VSSSDocument)theEObject;
				T result = caseVSSSDocument(vsssDocument);
				if (result == null) result = caseVTraceableDocument(vsssDocument);
				if (result == null) result = caseDDocumentTemplate(vsssDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_INTRODUCTION: {
				VSSSIntroduction vsssIntroduction = (VSSSIntroduction)theEObject;
				T result = caseVSSSIntroduction(vsssIntroduction);
				if (result == null) result = caseDFixedSection(vsssIntroduction);
				if (result == null) result = caseDAbstractSection(vsssIntroduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_APPLICABLE_DOCUMENTS: {
				VSSSApplicableDocuments vsssApplicableDocuments = (VSSSApplicableDocuments)theEObject;
				T result = caseVSSSApplicableDocuments(vsssApplicableDocuments);
				if (result == null) result = caseDFixedSection(vsssApplicableDocuments);
				if (result == null) result = caseDAbstractSection(vsssApplicableDocuments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_REFERENCE_DOCUMENTS: {
				VSSSReferenceDocuments vsssReferenceDocuments = (VSSSReferenceDocuments)theEObject;
				T result = caseVSSSReferenceDocuments(vsssReferenceDocuments);
				if (result == null) result = caseDFixedSection(vsssReferenceDocuments);
				if (result == null) result = caseDAbstractSection(vsssReferenceDocuments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS: {
				VSSSTermsDefinitionsAbbreviations vsssTermsDefinitionsAbbreviations = (VSSSTermsDefinitionsAbbreviations)theEObject;
				T result = caseVSSSTermsDefinitionsAbbreviations(vsssTermsDefinitionsAbbreviations);
				if (result == null) result = caseDFixedSection(vsssTermsDefinitionsAbbreviations);
				if (result == null) result = caseDAbstractSection(vsssTermsDefinitionsAbbreviations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_ABSTRACT_BRIEF_DESCRIPTION: {
				VSSSAbstractBriefDescription vsssAbstractBriefDescription = (VSSSAbstractBriefDescription)theEObject;
				T result = caseVSSSAbstractBriefDescription(vsssAbstractBriefDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_TERM: {
				VSSSTerm vsssTerm = (VSSSTerm)theEObject;
				T result = caseVSSSTerm(vsssTerm);
				if (result == null) result = caseVSSSAbstractBriefDescription(vsssTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_DEFINITION: {
				VSSSDefinition vsssDefinition = (VSSSDefinition)theEObject;
				T result = caseVSSSDefinition(vsssDefinition);
				if (result == null) result = caseVSSSAbstractBriefDescription(vsssDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_ABBREVIATION: {
				VSSSAbbreviation vsssAbbreviation = (VSSSAbbreviation)theEObject;
				T result = caseVSSSAbbreviation(vsssAbbreviation);
				if (result == null) result = caseVSSSAbstractBriefDescription(vsssAbbreviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_FIXED_SECTION: {
				VSSSFixedSection vsssFixedSection = (VSSSFixedSection)theEObject;
				T result = caseVSSSFixedSection(vsssFixedSection);
				if (result == null) result = caseDFixedSection(vsssFixedSection);
				if (result == null) result = caseDAbstractSection(vsssFixedSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_INSTANTIABLE_SECTION: {
				VSSSInstantiableSection vsssInstantiableSection = (VSSSInstantiableSection)theEObject;
				T result = caseVSSSInstantiableSection(vsssInstantiableSection);
				if (result == null) result = caseDInstantiableSection(vsssInstantiableSection);
				if (result == null) result = caseDAbstractSection(vsssInstantiableSection);
				if (result == null) result = caseMCommonReferenceableObj(vsssInstantiableSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_GENERAL_DESCRIPTION: {
				VSSSGeneralDescription vsssGeneralDescription = (VSSSGeneralDescription)theEObject;
				T result = caseVSSSGeneralDescription(vsssGeneralDescription);
				if (result == null) result = caseDFixedSection(vsssGeneralDescription);
				if (result == null) result = caseDAbstractSection(vsssGeneralDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_ABSTRACT_REQUIREMENT_SECTION: {
				VSSSAbstractRequirementSection vsssAbstractRequirementSection = (VSSSAbstractRequirementSection)theEObject;
				T result = caseVSSSAbstractRequirementSection(vsssAbstractRequirementSection);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssAbstractRequirementSection);
				if (result == null) result = caseDFixedSection(vsssAbstractRequirementSection);
				if (result == null) result = caseDAbstractSection(vsssAbstractRequirementSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_INSTANTIABLE_REQUIREMENT_SECTION: {
				VSSSInstantiableRequirementSection vsssInstantiableRequirementSection = (VSSSInstantiableRequirementSection)theEObject;
				T result = caseVSSSInstantiableRequirementSection(vsssInstantiableRequirementSection);
				if (result == null) result = caseDInstantiableSection(vsssInstantiableRequirementSection);
				if (result == null) result = caseDAbstractSection(vsssInstantiableRequirementSection);
				if (result == null) result = caseMCommonReferenceableObj(vsssInstantiableRequirementSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS: {
				VSSSSpecificRequirements vsssSpecificRequirements = (VSSSSpecificRequirements)theEObject;
				T result = caseVSSSSpecificRequirements(vsssSpecificRequirements);
				if (result == null) result = caseDFixedSection(vsssSpecificRequirements);
				if (result == null) result = caseDAbstractSection(vsssSpecificRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_GENERAL_REQUIREMENTS: {
				VSSSGeneralRequirements vsssGeneralRequirements = (VSSSGeneralRequirements)theEObject;
				T result = caseVSSSGeneralRequirements(vsssGeneralRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssGeneralRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssGeneralRequirements);
				if (result == null) result = caseDFixedSection(vsssGeneralRequirements);
				if (result == null) result = caseDAbstractSection(vsssGeneralRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_CAPABILITIES_REQUIREMENTS: {
				VSSSCapabilitiesRequirements vsssCapabilitiesRequirements = (VSSSCapabilitiesRequirements)theEObject;
				T result = caseVSSSCapabilitiesRequirements(vsssCapabilitiesRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssCapabilitiesRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssCapabilitiesRequirements);
				if (result == null) result = caseDFixedSection(vsssCapabilitiesRequirements);
				if (result == null) result = caseDAbstractSection(vsssCapabilitiesRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SYSTEM_INTERFACE_REQUIREMENTS: {
				VSSSSystemInterfaceRequirements vsssSystemInterfaceRequirements = (VSSSSystemInterfaceRequirements)theEObject;
				T result = caseVSSSSystemInterfaceRequirements(vsssSystemInterfaceRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssSystemInterfaceRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSystemInterfaceRequirements);
				if (result == null) result = caseDFixedSection(vsssSystemInterfaceRequirements);
				if (result == null) result = caseDAbstractSection(vsssSystemInterfaceRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS: {
				VSSSAdaptationMissionizationRequirements vsssAdaptationMissionizationRequirements = (VSSSAdaptationMissionizationRequirements)theEObject;
				T result = caseVSSSAdaptationMissionizationRequirements(vsssAdaptationMissionizationRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssAdaptationMissionizationRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssAdaptationMissionizationRequirements);
				if (result == null) result = caseDFixedSection(vsssAdaptationMissionizationRequirements);
				if (result == null) result = caseDAbstractSection(vsssAdaptationMissionizationRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_COMPUTER_RESOURCE_REQUIREMENTS: {
				VSSSComputerResourceRequirements vsssComputerResourceRequirements = (VSSSComputerResourceRequirements)theEObject;
				T result = caseVSSSComputerResourceRequirements(vsssComputerResourceRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssComputerResourceRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssComputerResourceRequirements);
				if (result == null) result = caseDFixedSection(vsssComputerResourceRequirements);
				if (result == null) result = caseDAbstractSection(vsssComputerResourceRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SECURITY_REQUIREMENTS: {
				VSSSSecurityRequirements vsssSecurityRequirements = (VSSSSecurityRequirements)theEObject;
				T result = caseVSSSSecurityRequirements(vsssSecurityRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssSecurityRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSecurityRequirements);
				if (result == null) result = caseDFixedSection(vsssSecurityRequirements);
				if (result == null) result = caseDAbstractSection(vsssSecurityRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SAFETY_REQUIREMENTS: {
				VSSSSafetyRequirements vsssSafetyRequirements = (VSSSSafetyRequirements)theEObject;
				T result = caseVSSSSafetyRequirements(vsssSafetyRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssSafetyRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSafetyRequirements);
				if (result == null) result = caseDFixedSection(vsssSafetyRequirements);
				if (result == null) result = caseDAbstractSection(vsssSafetyRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS: {
				VSSSReliabiltyAvailabilityRequirements vsssReliabiltyAvailabilityRequirements = (VSSSReliabiltyAvailabilityRequirements)theEObject;
				T result = caseVSSSReliabiltyAvailabilityRequirements(vsssReliabiltyAvailabilityRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssReliabiltyAvailabilityRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssReliabiltyAvailabilityRequirements);
				if (result == null) result = caseDFixedSection(vsssReliabiltyAvailabilityRequirements);
				if (result == null) result = caseDAbstractSection(vsssReliabiltyAvailabilityRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_QUALITY_REQUIREMENTS: {
				VSSSQualityRequirements vsssQualityRequirements = (VSSSQualityRequirements)theEObject;
				T result = caseVSSSQualityRequirements(vsssQualityRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssQualityRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssQualityRequirements);
				if (result == null) result = caseDFixedSection(vsssQualityRequirements);
				if (result == null) result = caseDAbstractSection(vsssQualityRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_DESIGN_REQUIREMENTS: {
				VSSSDesignRequirements vsssDesignRequirements = (VSSSDesignRequirements)theEObject;
				T result = caseVSSSDesignRequirements(vsssDesignRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssDesignRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssDesignRequirements);
				if (result == null) result = caseDFixedSection(vsssDesignRequirements);
				if (result == null) result = caseDAbstractSection(vsssDesignRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS: {
				VSSSSoftwareOperationsRequirements vsssSoftwareOperationsRequirements = (VSSSSoftwareOperationsRequirements)theEObject;
				T result = caseVSSSSoftwareOperationsRequirements(vsssSoftwareOperationsRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssSoftwareOperationsRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSoftwareOperationsRequirements);
				if (result == null) result = caseDFixedSection(vsssSoftwareOperationsRequirements);
				if (result == null) result = caseDAbstractSection(vsssSoftwareOperationsRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS: {
				VSSSSoftwareMaintenanceRequirements vsssSoftwareMaintenanceRequirements = (VSSSSoftwareMaintenanceRequirements)theEObject;
				T result = caseVSSSSoftwareMaintenanceRequirements(vsssSoftwareMaintenanceRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssSoftwareMaintenanceRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSoftwareMaintenanceRequirements);
				if (result == null) result = caseDFixedSection(vsssSoftwareMaintenanceRequirements);
				if (result == null) result = caseDAbstractSection(vsssSoftwareMaintenanceRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS: {
				VSSSSystemSoftwareObservabilityRequirements vsssSystemSoftwareObservabilityRequirements = (VSSSSystemSoftwareObservabilityRequirements)theEObject;
				T result = caseVSSSSystemSoftwareObservabilityRequirements(vsssSystemSoftwareObservabilityRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssSystemSoftwareObservabilityRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSystemSoftwareObservabilityRequirements);
				if (result == null) result = caseDFixedSection(vsssSystemSoftwareObservabilityRequirements);
				if (result == null) result = caseDAbstractSection(vsssSystemSoftwareObservabilityRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS: {
				VSSSVerificationValidationIntegrationRequirements vsssVerificationValidationIntegrationRequirements = (VSSSVerificationValidationIntegrationRequirements)theEObject;
				T result = caseVSSSVerificationValidationIntegrationRequirements(vsssVerificationValidationIntegrationRequirements);
				if (result == null) result = caseDFixedSection(vsssVerificationValidationIntegrationRequirements);
				if (result == null) result = caseDAbstractSection(vsssVerificationValidationIntegrationRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS: {
				VSSSVerificationValidationProcessRequirements vsssVerificationValidationProcessRequirements = (VSSSVerificationValidationProcessRequirements)theEObject;
				T result = caseVSSSVerificationValidationProcessRequirements(vsssVerificationValidationProcessRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssVerificationValidationProcessRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssVerificationValidationProcessRequirements);
				if (result == null) result = caseDFixedSection(vsssVerificationValidationProcessRequirements);
				if (result == null) result = caseDAbstractSection(vsssVerificationValidationProcessRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_VALIDATION_APPROACH: {
				VSSSValidationApproach vsssValidationApproach = (VSSSValidationApproach)theEObject;
				T result = caseVSSSValidationApproach(vsssValidationApproach);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssValidationApproach);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssValidationApproach);
				if (result == null) result = caseDFixedSection(vsssValidationApproach);
				if (result == null) result = caseDAbstractSection(vsssValidationApproach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_VERIFICATION_REQUIREMENTS: {
				VSSSVerificationRequirements vsssVerificationRequirements = (VSSSVerificationRequirements)theEObject;
				T result = caseVSSSVerificationRequirements(vsssVerificationRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssVerificationRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssVerificationRequirements);
				if (result == null) result = caseDFixedSection(vsssVerificationRequirements);
				if (result == null) result = caseDAbstractSection(vsssVerificationRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_VALIDATION_REQUIREMENTS: {
				VSSSValidationRequirements vsssValidationRequirements = (VSSSValidationRequirements)theEObject;
				T result = caseVSSSValidationRequirements(vsssValidationRequirements);
				if (result == null) result = caseVSSSAbstractRequirementSection(vsssValidationRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssValidationRequirements);
				if (result == null) result = caseDFixedSection(vsssValidationRequirements);
				if (result == null) result = caseDAbstractSection(vsssValidationRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_DOCUMENT_ITEM: {
				VSSSDocumentItem vsssDocumentItem = (VSSSDocumentItem)theEObject;
				T result = caseVSSSDocumentItem(vsssDocumentItem);
				if (result == null) result = caseVTraceableDocumentAbstractItem(vsssDocumentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SYSTEM_MODELS: {
				VSSSSystemModels vsssSystemModels = (VSSSSystemModels)theEObject;
				T result = caseVSSSSystemModels(vsssSystemModels);
				if (result == null) result = caseDFixedSection(vsssSystemModels);
				if (result == null) result = caseDAbstractSection(vsssSystemModels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SYSTEM_MODEL: {
				VSSSSystemModel vsssSystemModel = (VSSSSystemModel)theEObject;
				T result = caseVSSSSystemModel(vsssSystemModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSDocument(VSSSDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Introduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSIntroduction(VSSSIntroduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Applicable Documents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Applicable Documents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSApplicableDocuments(VSSSApplicableDocuments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Reference Documents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Reference Documents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSReferenceDocuments(VSSSReferenceDocuments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Terms Definitions Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Terms Definitions Abbreviations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSTermsDefinitionsAbbreviations(VSSSTermsDefinitionsAbbreviations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Abstract Brief Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Abstract Brief Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSAbstractBriefDescription(VSSSAbstractBriefDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSTerm(VSSSTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSDefinition(VSSSDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Abbreviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Abbreviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSAbbreviation(VSSSAbbreviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Fixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Fixed Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSFixedSection(VSSSFixedSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Instantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Instantiable Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSInstantiableSection(VSSSInstantiableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS General Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS General Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSGeneralDescription(VSSSGeneralDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Abstract Requirement Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Abstract Requirement Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSAbstractRequirementSection(VSSSAbstractRequirementSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Specific Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Specific Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSpecificRequirements(VSSSSpecificRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Instantiable Requirement Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Instantiable Requirement Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSInstantiableRequirementSection(VSSSInstantiableRequirementSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS General Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS General Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSGeneralRequirements(VSSSGeneralRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Capabilities Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Capabilities Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSCapabilitiesRequirements(VSSSCapabilitiesRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS System Interface Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS System Interface Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSystemInterfaceRequirements(VSSSSystemInterfaceRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Adaptation Missionization Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Adaptation Missionization Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSAdaptationMissionizationRequirements(VSSSAdaptationMissionizationRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Computer Resource Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Computer Resource Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSComputerResourceRequirements(VSSSComputerResourceRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Security Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Security Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSecurityRequirements(VSSSSecurityRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Safety Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Safety Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSafetyRequirements(VSSSSafetyRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Reliabilty Availability Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Reliabilty Availability Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSReliabiltyAvailabilityRequirements(VSSSReliabiltyAvailabilityRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Quality Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Quality Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSQualityRequirements(VSSSQualityRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Design Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Design Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSDesignRequirements(VSSSDesignRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Software Operations Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Software Operations Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSoftwareOperationsRequirements(VSSSSoftwareOperationsRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Software Maintenance Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Software Maintenance Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSoftwareMaintenanceRequirements(VSSSSoftwareMaintenanceRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS System Software Observability Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS System Software Observability Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSystemSoftwareObservabilityRequirements(VSSSSystemSoftwareObservabilityRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Verification Validation Integration Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Verification Validation Integration Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSVerificationValidationIntegrationRequirements(VSSSVerificationValidationIntegrationRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Verification Validation Process Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Verification Validation Process Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSVerificationValidationProcessRequirements(VSSSVerificationValidationProcessRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Validation Approach</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Validation Approach</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSValidationApproach(VSSSValidationApproach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Verification Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Verification Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSVerificationRequirements(VSSSVerificationRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Validation Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Validation Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSValidationRequirements(VSSSValidationRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Document Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Document Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSDocumentItem(VSSSDocumentItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS System Models</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS System Models</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSystemModels(VSSSSystemModels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS System Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS System Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSystemModel(VSSSSystemModel object) {
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
	public T caseDDocumentTemplate(DDocumentTemplate object) {
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
	public T caseDAbstractSection(DAbstractSection object) {
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
	public T caseDFixedSection(DFixedSection object) {
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
	public T caseDInstantiableSection(DInstantiableSection object) {
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

} //sssSwitch
