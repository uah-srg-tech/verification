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

import es.uah.aut.srg.micobs.doctpl.doc.DFixedSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Verification Validation Integration Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerificationValidationProcess <em>Verification Validation Process</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidationApproach <em>Validation Approach</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidation <em>Validation</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerification <em>Verification</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegrationRequirements()
 * @model
 * @generated
 */
public interface VSSSVerificationValidationIntegrationRequirements extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Verification Validation Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Validation Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Validation Process</em>' containment reference.
	 * @see #setVerificationValidationProcess(VSSSVerificationValidationProcessRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegrationRequirements_VerificationValidationProcess()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSVerificationValidationProcessRequirements getVerificationValidationProcess();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerificationValidationProcess <em>Verification Validation Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Validation Process</em>' containment reference.
	 * @see #getVerificationValidationProcess()
	 * @generated
	 */
	void setVerificationValidationProcess(VSSSVerificationValidationProcessRequirements value);

	/**
	 * Returns the value of the '<em><b>Validation Approach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Approach</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Approach</em>' containment reference.
	 * @see #setValidationApproach(VSSSValidationApproach)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegrationRequirements_ValidationApproach()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSValidationApproach getValidationApproach();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidationApproach <em>Validation Approach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Approach</em>' containment reference.
	 * @see #getValidationApproach()
	 * @generated
	 */
	void setValidationApproach(VSSSValidationApproach value);

	/**
	 * Returns the value of the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation</em>' containment reference.
	 * @see #setValidation(VSSSValidationRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegrationRequirements_Validation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSValidationRequirements getValidation();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidation <em>Validation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation</em>' containment reference.
	 * @see #getValidation()
	 * @generated
	 */
	void setValidation(VSSSValidationRequirements value);

	/**
	 * Returns the value of the '<em><b>Verification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification</em>' containment reference.
	 * @see #setVerification(VSSSVerificationRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegrationRequirements_Verification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSVerificationRequirements getVerification();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerification <em>Verification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification</em>' containment reference.
	 * @see #getVerification()
	 * @generated
	 */
	void setVerification(VSSSVerificationRequirements value);

} // VSSSVerificationValidationIntegrationRequirements
