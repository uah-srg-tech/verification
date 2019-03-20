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

import es.uah.aut.srg.micobs.doctpl.doc.impl.DSectionImpl;

import es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirement;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Verification Validation Integration Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl#getVerificationValidationProcess <em>Verification Validation Process</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl#getValidationApproach <em>Validation Approach</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl#getValidation <em>Validation</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl#getVerification <em>Verification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSVerificationValidationIntegrationRequirementsImpl extends DSectionImpl implements VSSSVerificationValidationIntegrationRequirements {
	/**
	 * The cached value of the '{@link #getVerificationValidationProcess() <em>Verification Validation Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationValidationProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSVerificationValidationProcessRequirement> verificationValidationProcess;

	/**
	 * The cached value of the '{@link #getValidationApproach() <em>Validation Approach</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationApproach()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSValidationApproach> validationApproach;

	/**
	 * The cached value of the '{@link #getValidation() <em>Validation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSValidationRequirement> validation;

	/**
	 * The cached value of the '{@link #getVerification() <em>Verification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerification()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSVerificationRequirement> verification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSVerificationValidationIntegrationRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSVerificationValidationProcessRequirement> getVerificationValidationProcess() {
		if (verificationValidationProcess == null) {
			verificationValidationProcess = new EObjectContainmentEList<VSSSVerificationValidationProcessRequirement>(VSSSVerificationValidationProcessRequirement.class, this, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS);
		}
		return verificationValidationProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSValidationApproach> getValidationApproach() {
		if (validationApproach == null) {
			validationApproach = new EObjectContainmentEList<VSSSValidationApproach>(VSSSValidationApproach.class, this, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH);
		}
		return validationApproach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSValidationRequirement> getValidation() {
		if (validation == null) {
			validation = new EObjectContainmentEList<VSSSValidationRequirement>(VSSSValidationRequirement.class, this, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION);
		}
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSVerificationRequirement> getVerification() {
		if (verification == null) {
			verification = new EObjectContainmentEList<VSSSVerificationRequirement>(VSSSVerificationRequirement.class, this, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION);
		}
		return verification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS:
				return ((InternalEList<?>)getVerificationValidationProcess()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH:
				return ((InternalEList<?>)getValidationApproach()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION:
				return ((InternalEList<?>)getValidation()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION:
				return ((InternalEList<?>)getVerification()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS:
				return getVerificationValidationProcess();
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH:
				return getValidationApproach();
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION:
				return getValidation();
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION:
				return getVerification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS:
				getVerificationValidationProcess().clear();
				getVerificationValidationProcess().addAll((Collection<? extends VSSSVerificationValidationProcessRequirement>)newValue);
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH:
				getValidationApproach().clear();
				getValidationApproach().addAll((Collection<? extends VSSSValidationApproach>)newValue);
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION:
				getValidation().clear();
				getValidation().addAll((Collection<? extends VSSSValidationRequirement>)newValue);
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION:
				getVerification().clear();
				getVerification().addAll((Collection<? extends VSSSVerificationRequirement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS:
				getVerificationValidationProcess().clear();
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH:
				getValidationApproach().clear();
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION:
				getValidation().clear();
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION:
				getVerification().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS:
				return verificationValidationProcess != null && !verificationValidationProcess.isEmpty();
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH:
				return validationApproach != null && !validationApproach.isEmpty();
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION:
				return validation != null && !validation.isEmpty();
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION:
				return verification != null && !verification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VSSSVerificationValidationIntegrationRequirementsImpl
