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
package es.uah.aut.srg.micobs.svm.sss;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage
 * @generated
 */
public interface sssFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	sssFactory eINSTANCE = es.uah.aut.srg.micobs.svm.sss.impl.sssFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VSSS Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Document</em>'.
	 * @generated
	 */
	VSSSDocument createVSSSDocument();

	/**
	 * Returns a new object of class '<em>VSSS Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Introduction</em>'.
	 * @generated
	 */
	VSSSIntroduction createVSSSIntroduction();

	/**
	 * Returns a new object of class '<em>VSSS Applicable Documents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Applicable Documents</em>'.
	 * @generated
	 */
	VSSSApplicableDocuments createVSSSApplicableDocuments();

	/**
	 * Returns a new object of class '<em>VSSS Reference Documents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Reference Documents</em>'.
	 * @generated
	 */
	VSSSReferenceDocuments createVSSSReferenceDocuments();

	/**
	 * Returns a new object of class '<em>VSSS Terms Definitions Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Terms Definitions Abbreviations</em>'.
	 * @generated
	 */
	VSSSTermsDefinitionsAbbreviations createVSSSTermsDefinitionsAbbreviations();

	/**
	 * Returns a new object of class '<em>VSSS Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Term</em>'.
	 * @generated
	 */
	VSSSTerm createVSSSTerm();

	/**
	 * Returns a new object of class '<em>VSSS Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Definition</em>'.
	 * @generated
	 */
	VSSSDefinition createVSSSDefinition();

	/**
	 * Returns a new object of class '<em>VSSS Abbreviation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Abbreviation</em>'.
	 * @generated
	 */
	VSSSAbbreviation createVSSSAbbreviation();

	/**
	 * Returns a new object of class '<em>VSSS General Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS General Description</em>'.
	 * @generated
	 */
	VSSSGeneralDescription createVSSSGeneralDescription();

	/**
	 * Returns a new object of class '<em>VSSS Specific Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Specific Requirements</em>'.
	 * @generated
	 */
	VSSSSpecificRequirements createVSSSSpecificRequirements();

	/**
	 * Returns a new object of class '<em>VSSS General Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS General Requirement</em>'.
	 * @generated
	 */
	VSSSGeneralRequirement createVSSSGeneralRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Capabilities Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Capabilities Requirement</em>'.
	 * @generated
	 */
	VSSSCapabilitiesRequirement createVSSSCapabilitiesRequirement();

	/**
	 * Returns a new object of class '<em>VSSS System Interface Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS System Interface Requirement</em>'.
	 * @generated
	 */
	VSSSSystemInterfaceRequirement createVSSSSystemInterfaceRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Adaptation Missionization Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Adaptation Missionization Requirement</em>'.
	 * @generated
	 */
	VSSSAdaptationMissionizationRequirement createVSSSAdaptationMissionizationRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Computer Resource Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Computer Resource Requirement</em>'.
	 * @generated
	 */
	VSSSComputerResourceRequirement createVSSSComputerResourceRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Security Requirement</em>'.
	 * @generated
	 */
	VSSSSecurityRequirement createVSSSSecurityRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Safety Requirement</em>'.
	 * @generated
	 */
	VSSSSafetyRequirement createVSSSSafetyRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Reliabilty Availability Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Reliabilty Availability Requirement</em>'.
	 * @generated
	 */
	VSSSReliabiltyAvailabilityRequirement createVSSSReliabiltyAvailabilityRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Quality Requirement</em>'.
	 * @generated
	 */
	VSSSQualityRequirement createVSSSQualityRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Design Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Design Requirement</em>'.
	 * @generated
	 */
	VSSSDesignRequirement createVSSSDesignRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Software Operations Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Software Operations Requirement</em>'.
	 * @generated
	 */
	VSSSSoftwareOperationsRequirement createVSSSSoftwareOperationsRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Software Maintenance Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Software Maintenance Requirement</em>'.
	 * @generated
	 */
	VSSSSoftwareMaintenanceRequirement createVSSSSoftwareMaintenanceRequirement();

	/**
	 * Returns a new object of class '<em>VSSS System Software Observability Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS System Software Observability Requirement</em>'.
	 * @generated
	 */
	VSSSSystemSoftwareObservabilityRequirement createVSSSSystemSoftwareObservabilityRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Verification Validation Integration Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Verification Validation Integration Requirements</em>'.
	 * @generated
	 */
	VSSSVerificationValidationIntegrationRequirements createVSSSVerificationValidationIntegrationRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Verification Validation Process Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Verification Validation Process Requirement</em>'.
	 * @generated
	 */
	VSSSVerificationValidationProcessRequirement createVSSSVerificationValidationProcessRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Validation Approach</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Validation Approach</em>'.
	 * @generated
	 */
	VSSSValidationApproach createVSSSValidationApproach();

	/**
	 * Returns a new object of class '<em>VSSS Verification Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Verification Requirement</em>'.
	 * @generated
	 */
	VSSSVerificationRequirement createVSSSVerificationRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Validation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Validation Requirement</em>'.
	 * @generated
	 */
	VSSSValidationRequirement createVSSSValidationRequirement();

	/**
	 * Returns a new object of class '<em>VSSS Document Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Document Item</em>'.
	 * @generated
	 */
	VSSSDocumentItem createVSSSDocumentItem();

	/**
	 * Returns a new object of class '<em>VSSS System Models</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS System Models</em>'.
	 * @generated
	 */
	VSSSSystemModels createVSSSSystemModels();

	/**
	 * Returns a new object of class '<em>VSSS System Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS System Model</em>'.
	 * @generated
	 */
	VSSSSystemModel createVSSSSystemModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	sssPackage getsssPackage();

} //sssFactory
