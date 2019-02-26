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

import es.uah.aut.srg.micobs.common.MCommonPackageElement;

import es.uah.aut.srg.micobs.svm.sss.*;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedSection;

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
			case sssPackage.VSSS_INTRODUCTION: {
				VSSSIntroduction vsssIntroduction = (VSSSIntroduction)theEObject;
				T result = caseVSSSIntroduction(vsssIntroduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_APPLICABLE_DOCUMENT: {
				VSSSApplicableDocument vsssApplicableDocument = (VSSSApplicableDocument)theEObject;
				T result = caseVSSSApplicableDocument(vsssApplicableDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_REFERENCE_DOCUMENT: {
				VSSSReferenceDocument vsssReferenceDocument = (VSSSReferenceDocument)theEObject;
				T result = caseVSSSReferenceDocument(vsssReferenceDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS: {
				VSSSTermsDefinitionsAbbreviations vsssTermsDefinitionsAbbreviations = (VSSSTermsDefinitionsAbbreviations)theEObject;
				T result = caseVSSSTermsDefinitionsAbbreviations(vsssTermsDefinitionsAbbreviations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_BRIEF_DESCRIPTION: {
				VSSSBriefDescription vsssBriefDescription = (VSSSBriefDescription)theEObject;
				T result = caseVSSSBriefDescription(vsssBriefDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_TERM: {
				VSSSTerm vsssTerm = (VSSSTerm)theEObject;
				T result = caseVSSSTerm(vsssTerm);
				if (result == null) result = caseVSSSBriefDescription(vsssTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_DEFINITION: {
				VSSSDefinition vsssDefinition = (VSSSDefinition)theEObject;
				T result = caseVSSSDefinition(vsssDefinition);
				if (result == null) result = caseVSSSBriefDescription(vsssDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_ABBREVIATION: {
				VSSSAbbreviation vsssAbbreviation = (VSSSAbbreviation)theEObject;
				T result = caseVSSSAbbreviation(vsssAbbreviation);
				if (result == null) result = caseVSSSBriefDescription(vsssAbbreviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_GENERAL_DESCRIPTION: {
				VSSSGeneralDescription vsssGeneralDescription = (VSSSGeneralDescription)theEObject;
				T result = caseVSSSGeneralDescription(vsssGeneralDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS: {
				VSSSSpecificRequirements vsssSpecificRequirements = (VSSSSpecificRequirements)theEObject;
				T result = caseVSSSSpecificRequirements(vsssSpecificRequirements);
				if (result == null) result = caseVTraceableDocumentFixedSection(vsssSpecificRequirements);
				if (result == null) result = caseVTraceableDocumentAbstractSection(vsssSpecificRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_GENERAL_REQUIREMENT: {
				VSSSGeneralRequirement vsssGeneralRequirement = (VSSSGeneralRequirement)theEObject;
				T result = caseVSSSGeneralRequirement(vsssGeneralRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssGeneralRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssGeneralRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_CAPABILITIES_REQUIREMENT: {
				VSSSCapabilitiesRequirement vsssCapabilitiesRequirement = (VSSSCapabilitiesRequirement)theEObject;
				T result = caseVSSSCapabilitiesRequirement(vsssCapabilitiesRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssCapabilitiesRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssCapabilitiesRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SYSTEM_INTERFACE_REQUIREMENT: {
				VSSSSystemInterfaceRequirement vsssSystemInterfaceRequirement = (VSSSSystemInterfaceRequirement)theEObject;
				T result = caseVSSSSystemInterfaceRequirement(vsssSystemInterfaceRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssSystemInterfaceRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSystemInterfaceRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT: {
				VSSSAdaptationMissionizationRequirement vsssAdaptationMissionizationRequirement = (VSSSAdaptationMissionizationRequirement)theEObject;
				T result = caseVSSSAdaptationMissionizationRequirement(vsssAdaptationMissionizationRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssAdaptationMissionizationRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssAdaptationMissionizationRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_COMPUTER_RESOURCE_REQUIREMENT: {
				VSSSComputerResourceRequirement vsssComputerResourceRequirement = (VSSSComputerResourceRequirement)theEObject;
				T result = caseVSSSComputerResourceRequirement(vsssComputerResourceRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssComputerResourceRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssComputerResourceRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SECURITY_REQUIREMENT: {
				VSSSSecurityRequirement vsssSecurityRequirement = (VSSSSecurityRequirement)theEObject;
				T result = caseVSSSSecurityRequirement(vsssSecurityRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssSecurityRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSecurityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SAFETY_REQUIREMENT: {
				VSSSSafetyRequirement vsssSafetyRequirement = (VSSSSafetyRequirement)theEObject;
				T result = caseVSSSSafetyRequirement(vsssSafetyRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssSafetyRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSafetyRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT: {
				VSSSReliabiltyAvailabilityRequirement vsssReliabiltyAvailabilityRequirement = (VSSSReliabiltyAvailabilityRequirement)theEObject;
				T result = caseVSSSReliabiltyAvailabilityRequirement(vsssReliabiltyAvailabilityRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssReliabiltyAvailabilityRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssReliabiltyAvailabilityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_QUALITY_REQUIREMENT: {
				VSSSQualityRequirement vsssQualityRequirement = (VSSSQualityRequirement)theEObject;
				T result = caseVSSSQualityRequirement(vsssQualityRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssQualityRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssQualityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_DESIGN_REQUIREMENT: {
				VSSSDesignRequirement vsssDesignRequirement = (VSSSDesignRequirement)theEObject;
				T result = caseVSSSDesignRequirement(vsssDesignRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssDesignRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssDesignRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SOFTWARE_OPERATIONS_REQUIREMENT: {
				VSSSSoftwareOperationsRequirement vsssSoftwareOperationsRequirement = (VSSSSoftwareOperationsRequirement)theEObject;
				T result = caseVSSSSoftwareOperationsRequirement(vsssSoftwareOperationsRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssSoftwareOperationsRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSoftwareOperationsRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT: {
				VSSSSoftwareMaintenanceRequirement vsssSoftwareMaintenanceRequirement = (VSSSSoftwareMaintenanceRequirement)theEObject;
				T result = caseVSSSSoftwareMaintenanceRequirement(vsssSoftwareMaintenanceRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssSoftwareMaintenanceRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSoftwareMaintenanceRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT: {
				VSSSSystemSoftwareObservabilityRequirement vsssSystemSoftwareObservabilityRequirement = (VSSSSystemSoftwareObservabilityRequirement)theEObject;
				T result = caseVSSSSystemSoftwareObservabilityRequirement(vsssSystemSoftwareObservabilityRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssSystemSoftwareObservabilityRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssSystemSoftwareObservabilityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION: {
				VSSSVerificationValidationIntegration vsssVerificationValidationIntegration = (VSSSVerificationValidationIntegration)theEObject;
				T result = caseVSSSVerificationValidationIntegration(vsssVerificationValidationIntegration);
				if (result == null) result = caseVTraceableDocumentFixedSection(vsssVerificationValidationIntegration);
				if (result == null) result = caseVTraceableDocumentAbstractSection(vsssVerificationValidationIntegration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT: {
				VSSSVerificationValidationProcessRequirement vsssVerificationValidationProcessRequirement = (VSSSVerificationValidationProcessRequirement)theEObject;
				T result = caseVSSSVerificationValidationProcessRequirement(vsssVerificationValidationProcessRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssVerificationValidationProcessRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssVerificationValidationProcessRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_VALIDATION_APPROACH: {
				VSSSValidationApproach vsssValidationApproach = (VSSSValidationApproach)theEObject;
				T result = caseVSSSValidationApproach(vsssValidationApproach);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssValidationApproach);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssValidationApproach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_VERIFICATION_REQUIREMENT: {
				VSSSVerificationRequirement vsssVerificationRequirement = (VSSSVerificationRequirement)theEObject;
				T result = caseVSSSVerificationRequirement(vsssVerificationRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssVerificationRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssVerificationRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_VALIDATION_REQUIREMENT: {
				VSSSValidationRequirement vsssValidationRequirement = (VSSSValidationRequirement)theEObject;
				T result = caseVSSSValidationRequirement(vsssValidationRequirement);
				if (result == null) result = caseVTraceableDocumentFixedGroup(vsssValidationRequirement);
				if (result == null) result = caseVTraceableDocumentAbstractGroup(vsssValidationRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_SYSTEM_MODELS: {
				VSSSSystemModels vsssSystemModels = (VSSSSystemModels)theEObject;
				T result = caseVSSSSystemModels(vsssSystemModels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case sssPackage.VSSS_DOCUMENT: {
				VSSSDocument vsssDocument = (VSSSDocument)theEObject;
				T result = caseVSSSDocument(vsssDocument);
				if (result == null) result = caseVTraceableDocument(vsssDocument);
				if (result == null) result = caseMCommonPackageElement(vsssDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Applicable Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Applicable Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSApplicableDocument(VSSSApplicableDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Reference Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Reference Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSReferenceDocument(VSSSReferenceDocument object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Brief Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Brief Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSBriefDescription(VSSSBriefDescription object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>VSSS General Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS General Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSGeneralRequirement(VSSSGeneralRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Capabilities Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Capabilities Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSCapabilitiesRequirement(VSSSCapabilitiesRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS System Interface Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS System Interface Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSystemInterfaceRequirement(VSSSSystemInterfaceRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Adaptation Missionization Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Adaptation Missionization Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSAdaptationMissionizationRequirement(VSSSAdaptationMissionizationRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Computer Resource Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Computer Resource Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSComputerResourceRequirement(VSSSComputerResourceRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Security Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSecurityRequirement(VSSSSecurityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Safety Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSafetyRequirement(VSSSSafetyRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Reliabilty Availability Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Reliabilty Availability Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSReliabiltyAvailabilityRequirement(VSSSReliabiltyAvailabilityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Quality Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSQualityRequirement(VSSSQualityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Design Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Design Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSDesignRequirement(VSSSDesignRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Software Operations Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Software Operations Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSoftwareOperationsRequirement(VSSSSoftwareOperationsRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Software Maintenance Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Software Maintenance Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSoftwareMaintenanceRequirement(VSSSSoftwareMaintenanceRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS System Software Observability Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS System Software Observability Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSSystemSoftwareObservabilityRequirement(VSSSSystemSoftwareObservabilityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Verification Validation Integration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Verification Validation Integration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSVerificationValidationIntegration(VSSSVerificationValidationIntegration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Verification Validation Process Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Verification Validation Process Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSVerificationValidationProcessRequirement(VSSSVerificationValidationProcessRequirement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Verification Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Verification Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSVerificationRequirement(VSSSVerificationRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSSS Validation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSSS Validation Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSSSValidationRequirement(VSSSValidationRequirement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>VTraceable Document Abstract Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTraceable Document Abstract Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTraceableDocumentAbstractSection(VTraceableDocumentAbstractSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTraceable Document Fixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTraceable Document Fixed Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTraceableDocumentFixedSection(VTraceableDocumentFixedSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Package Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Package Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageElement(MCommonPackageElement object) {
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
