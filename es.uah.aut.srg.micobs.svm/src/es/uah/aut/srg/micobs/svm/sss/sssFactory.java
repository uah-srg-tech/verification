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
	 * Returns a new object of class '<em>VSSSTB Cs TB Ds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSSTB Cs TB Ds</em>'.
	 * @generated
	 */
	VSSSTBCsTBDs createVSSSTBCsTBDs();

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
	 * Returns a new object of class '<em>VSSS Fixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Fixed Section</em>'.
	 * @generated
	 */
	VSSSFixedSection createVSSSFixedSection();

	/**
	 * Returns a new object of class '<em>VSSS Instantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Instantiable Section</em>'.
	 * @generated
	 */
	VSSSInstantiableSection createVSSSInstantiableSection();

	/**
	 * Returns a new object of class '<em>VSSS General Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS General Description</em>'.
	 * @generated
	 */
	VSSSGeneralDescription createVSSSGeneralDescription();

	/**
	 * Returns a new object of class '<em>VSSS Instantiable Requirement Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Instantiable Requirement Section</em>'.
	 * @generated
	 */
	VSSSInstantiableRequirementSection createVSSSInstantiableRequirementSection();

	/**
	 * Returns a new object of class '<em>VSSS Specific Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Specific Requirements</em>'.
	 * @generated
	 */
	VSSSSpecificRequirements createVSSSSpecificRequirements();

	/**
	 * Returns a new object of class '<em>VSSS General Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS General Requirements</em>'.
	 * @generated
	 */
	VSSSGeneralRequirements createVSSSGeneralRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Capabilities Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Capabilities Requirements</em>'.
	 * @generated
	 */
	VSSSCapabilitiesRequirements createVSSSCapabilitiesRequirements();

	/**
	 * Returns a new object of class '<em>VSSS System Interface Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS System Interface Requirements</em>'.
	 * @generated
	 */
	VSSSSystemInterfaceRequirements createVSSSSystemInterfaceRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Adaptation Missionization Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Adaptation Missionization Requirements</em>'.
	 * @generated
	 */
	VSSSAdaptationMissionizationRequirements createVSSSAdaptationMissionizationRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Computer Resource Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Computer Resource Requirements</em>'.
	 * @generated
	 */
	VSSSComputerResourceRequirements createVSSSComputerResourceRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Security Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Security Requirements</em>'.
	 * @generated
	 */
	VSSSSecurityRequirements createVSSSSecurityRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Safety Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Safety Requirements</em>'.
	 * @generated
	 */
	VSSSSafetyRequirements createVSSSSafetyRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Reliability Availability Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Reliability Availability Requirements</em>'.
	 * @generated
	 */
	VSSSReliabilityAvailabilityRequirements createVSSSReliabilityAvailabilityRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Quality Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Quality Requirements</em>'.
	 * @generated
	 */
	VSSSQualityRequirements createVSSSQualityRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Design Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Design Requirements</em>'.
	 * @generated
	 */
	VSSSDesignRequirements createVSSSDesignRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Software Operations Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Software Operations Requirements</em>'.
	 * @generated
	 */
	VSSSSoftwareOperationsRequirements createVSSSSoftwareOperationsRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Software Maintenance Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Software Maintenance Requirements</em>'.
	 * @generated
	 */
	VSSSSoftwareMaintenanceRequirements createVSSSSoftwareMaintenanceRequirements();

	/**
	 * Returns a new object of class '<em>VSSS System Software Observability Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS System Software Observability Requirements</em>'.
	 * @generated
	 */
	VSSSSystemSoftwareObservabilityRequirements createVSSSSystemSoftwareObservabilityRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Verification Validation Integration Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Verification Validation Integration Requirements</em>'.
	 * @generated
	 */
	VSSSVerificationValidationIntegrationRequirements createVSSSVerificationValidationIntegrationRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Verification Validation Process Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Verification Validation Process Requirements</em>'.
	 * @generated
	 */
	VSSSVerificationValidationProcessRequirements createVSSSVerificationValidationProcessRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Validation Approach</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Validation Approach</em>'.
	 * @generated
	 */
	VSSSValidationApproach createVSSSValidationApproach();

	/**
	 * Returns a new object of class '<em>VSSS Verification Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Verification Requirements</em>'.
	 * @generated
	 */
	VSSSVerificationRequirements createVSSSVerificationRequirements();

	/**
	 * Returns a new object of class '<em>VSSS Validation Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSSS Validation Requirements</em>'.
	 * @generated
	 */
	VSSSValidationRequirements createVSSSValidationRequirements();

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
