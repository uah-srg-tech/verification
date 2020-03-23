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

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;
import es.uah.aut.srg.micobs.svm.sss.VSSSAbstractRequirementSection;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirements;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Verification Validation Integration Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl#getSectionDescription <em>Section Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl#getVerificationValidationProcess <em>Verification Validation Process</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl#getValidationApproach <em>Validation Approach</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl#getValidation <em>Validation</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl#getVerification <em>Verification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSVerificationValidationIntegrationRequirementsImpl extends DFixedSectionImpl implements VSSSVerificationValidationIntegrationRequirements {
	/**
	 * The cached value of the '{@link #getSectionDescription() <em>Section Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionDescription()
	 * @generated
	 * @ordered
	 */
	protected DBody sectionDescription;

	/**
	 * The cached value of the '{@link #getVerificationValidationProcess() <em>Verification Validation Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationValidationProcess()
	 * @generated
	 * @ordered
	 */
	protected VSSSVerificationValidationProcessRequirements verificationValidationProcess;

	/**
	 * The cached value of the '{@link #getValidationApproach() <em>Validation Approach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationApproach()
	 * @generated
	 * @ordered
	 */
	protected VSSSValidationApproach validationApproach;

	/**
	 * The cached value of the '{@link #getValidation() <em>Validation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected VSSSValidationRequirements validation;

	/**
	 * The cached value of the '{@link #getVerification() <em>Verification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerification()
	 * @generated
	 * @ordered
	 */
	protected VSSSVerificationRequirements verification;

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
	public DBody getSectionDescription() {
		return sectionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionDescription(DBody newSectionDescription, NotificationChain msgs) {
		DBody oldSectionDescription = sectionDescription;
		sectionDescription = newSectionDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SECTION_DESCRIPTION, oldSectionDescription, newSectionDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionDescription(DBody newSectionDescription) {
		if (newSectionDescription != sectionDescription) {
			NotificationChain msgs = null;
			if (sectionDescription != null)
				msgs = ((InternalEObject)sectionDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SECTION_DESCRIPTION, null, msgs);
			if (newSectionDescription != null)
				msgs = ((InternalEObject)newSectionDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SECTION_DESCRIPTION, null, msgs);
			msgs = basicSetSectionDescription(newSectionDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SECTION_DESCRIPTION, newSectionDescription, newSectionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSVerificationValidationProcessRequirements getVerificationValidationProcess() {
		return verificationValidationProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationValidationProcess(VSSSVerificationValidationProcessRequirements newVerificationValidationProcess, NotificationChain msgs) {
		VSSSVerificationValidationProcessRequirements oldVerificationValidationProcess = verificationValidationProcess;
		verificationValidationProcess = newVerificationValidationProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS, oldVerificationValidationProcess, newVerificationValidationProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationValidationProcess(VSSSVerificationValidationProcessRequirements newVerificationValidationProcess) {
		if (newVerificationValidationProcess != verificationValidationProcess) {
			NotificationChain msgs = null;
			if (verificationValidationProcess != null)
				msgs = ((InternalEObject)verificationValidationProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS, null, msgs);
			if (newVerificationValidationProcess != null)
				msgs = ((InternalEObject)newVerificationValidationProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS, null, msgs);
			msgs = basicSetVerificationValidationProcess(newVerificationValidationProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS, newVerificationValidationProcess, newVerificationValidationProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSValidationApproach getValidationApproach() {
		return validationApproach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidationApproach(VSSSValidationApproach newValidationApproach, NotificationChain msgs) {
		VSSSValidationApproach oldValidationApproach = validationApproach;
		validationApproach = newValidationApproach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH, oldValidationApproach, newValidationApproach);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationApproach(VSSSValidationApproach newValidationApproach) {
		if (newValidationApproach != validationApproach) {
			NotificationChain msgs = null;
			if (validationApproach != null)
				msgs = ((InternalEObject)validationApproach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH, null, msgs);
			if (newValidationApproach != null)
				msgs = ((InternalEObject)newValidationApproach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH, null, msgs);
			msgs = basicSetValidationApproach(newValidationApproach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH, newValidationApproach, newValidationApproach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSValidationRequirements getValidation() {
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidation(VSSSValidationRequirements newValidation, NotificationChain msgs) {
		VSSSValidationRequirements oldValidation = validation;
		validation = newValidation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION, oldValidation, newValidation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidation(VSSSValidationRequirements newValidation) {
		if (newValidation != validation) {
			NotificationChain msgs = null;
			if (validation != null)
				msgs = ((InternalEObject)validation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION, null, msgs);
			if (newValidation != null)
				msgs = ((InternalEObject)newValidation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION, null, msgs);
			msgs = basicSetValidation(newValidation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION, newValidation, newValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSVerificationRequirements getVerification() {
		return verification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerification(VSSSVerificationRequirements newVerification, NotificationChain msgs) {
		VSSSVerificationRequirements oldVerification = verification;
		verification = newVerification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION, oldVerification, newVerification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerification(VSSSVerificationRequirements newVerification) {
		if (newVerification != verification) {
			NotificationChain msgs = null;
			if (verification != null)
				msgs = ((InternalEObject)verification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION, null, msgs);
			if (newVerification != null)
				msgs = ((InternalEObject)newVerification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION, null, msgs);
			msgs = basicSetVerification(newVerification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION, newVerification, newVerification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SECTION_DESCRIPTION:
				return basicSetSectionDescription(null, msgs);
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS:
				return basicSetVerificationValidationProcess(null, msgs);
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH:
				return basicSetValidationApproach(null, msgs);
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION:
				return basicSetValidation(null, msgs);
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION:
				return basicSetVerification(null, msgs);
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
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SECTION_DESCRIPTION:
				return getSectionDescription();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SECTION_DESCRIPTION:
				setSectionDescription((DBody)newValue);
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS:
				setVerificationValidationProcess((VSSSVerificationValidationProcessRequirements)newValue);
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH:
				setValidationApproach((VSSSValidationApproach)newValue);
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION:
				setValidation((VSSSValidationRequirements)newValue);
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION:
				setVerification((VSSSVerificationRequirements)newValue);
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
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SECTION_DESCRIPTION:
				setSectionDescription((DBody)null);
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS:
				setVerificationValidationProcess((VSSSVerificationValidationProcessRequirements)null);
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH:
				setValidationApproach((VSSSValidationApproach)null);
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION:
				setValidation((VSSSValidationRequirements)null);
				return;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION:
				setVerification((VSSSVerificationRequirements)null);
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
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SECTION_DESCRIPTION:
				return sectionDescription != null;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS:
				return verificationValidationProcess != null;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH:
				return validationApproach != null;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION:
				return validation != null;
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION:
				return verification != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		subsections.add((DAbstractSection) getVerificationValidationProcess());
		subsections.add((DAbstractSection) getValidationApproach());
		subsections.add((DAbstractSection) getValidation());
		subsections.add((DAbstractSection) getVerification());
		return subsections;
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		if(getSectionDescription() != null) {
			objects.addAll(getSectionDescription().getReferenceableObjects(ReferenceableObjectType));
		}
		for(DAbstractSection subsection : getSubsections()) {
			objects.addAll(((VSSSAbstractRequirementSection)subsection).getReferenceableObjects(ReferenceableObjectType));
		}
		return objects;
	}

} //VSSSVerificationValidationIntegrationRequirementsImpl
