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
	 * Returns the value of the '<em><b>Verification Validation Process</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Validation Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Validation Process</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegration_VerificationValidationProcess()
	 * @model
	 * @generated
	 */
	EList<VSSSVerificationValidationProcessRequirement> getVerificationValidationProcess();

	/**
	 * Returns the value of the '<em><b>Validation Approach</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Approach</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Approach</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegration_ValidationApproach()
	 * @model
	 * @generated
	 */
	EList<VSSSValidationApproach> getValidationApproach();

	/**
	 * Returns the value of the '<em><b>Validation</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegration_Validation()
	 * @model
	 * @generated
	 */
	EList<VSSSValidationRequirement> getValidation();

	/**
	 * Returns the value of the '<em><b>Verification</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSVerificationValidationIntegration_Verification()
	 * @model
	 * @generated
	 */
	EList<VSSSVerificationRequirement> getVerification();

} // VSSSVerificationValidationIntegration
