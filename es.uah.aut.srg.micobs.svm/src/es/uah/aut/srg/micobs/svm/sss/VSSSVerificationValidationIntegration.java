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

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedSection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Verification Validation Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getVerificationValidationProcess <em>Verification Validation Process</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getValidationApproach <em>Validation Approach</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getValidation <em>Validation</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getVerification <em>Verification</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegration()
 * @model
 * @generated
 */
public interface VSSSVerificationValidationIntegration extends VTraceableDocumentFixedSection {
	/**
	 * Returns the value of the '<em><b>Verification Validation Process</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Validation Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Validation Process</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegration_VerificationValidationProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSSSVerificationValidationProcessRequirement> getVerificationValidationProcess();

	/**
	 * Returns the value of the '<em><b>Validation Approach</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Approach</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Approach</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegration_ValidationApproach()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSSSValidationApproach> getValidationApproach();

	/**
	 * Returns the value of the '<em><b>Validation</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegration_Validation()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSSSValidationRequirement> getValidation();

	/**
	 * Returns the value of the '<em><b>Verification</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegration_Verification()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSSSVerificationRequirement> getVerification();

} // VSSSVerificationValidationIntegration
