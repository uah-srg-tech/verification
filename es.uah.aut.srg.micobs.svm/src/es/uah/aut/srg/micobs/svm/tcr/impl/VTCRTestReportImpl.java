/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.micobs.svm.tcr.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph;
import es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport;
import es.uah.aut.srg.micobs.svm.tcr.VTCRTestStatus;
import es.uah.aut.srg.micobs.svm.tcr.tcrPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTCR Test Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestReportImpl#getTest_procedure <em>Test procedure</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestReportImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestReportImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTCRTestReportImpl extends MinimalEObjectImpl.Container implements VTCRTestReport {
	/**
	 * The default value of the '{@link #getTest_procedure() <em>Test procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest_procedure()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_PROCEDURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTest_procedure() <em>Test procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest_procedure()
	 * @generated
	 * @ordered
	 */
	protected String test_procedure = TEST_PROCEDURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final VTCRTestStatus STATUS_EDEFAULT = VTCRTestStatus.FAIL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected VTCRTestStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected DParagraph evidence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCRTestReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tcrPackage.Literals.VTCR_TEST_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTest_procedure() {
		return test_procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest_procedure(String newTest_procedure) {
		String oldTest_procedure = test_procedure;
		test_procedure = newTest_procedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcrPackage.VTCR_TEST_REPORT__TEST_PROCEDURE, oldTest_procedure, test_procedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCRTestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(VTCRTestStatus newStatus) {
		VTCRTestStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcrPackage.VTCR_TEST_REPORT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DParagraph getEvidence() {
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidence(DParagraph newEvidence, NotificationChain msgs) {
		DParagraph oldEvidence = evidence;
		evidence = newEvidence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tcrPackage.VTCR_TEST_REPORT__EVIDENCE, oldEvidence, newEvidence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvidence(DParagraph newEvidence) {
		if (newEvidence != evidence) {
			NotificationChain msgs = null;
			if (evidence != null)
				msgs = ((InternalEObject)evidence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tcrPackage.VTCR_TEST_REPORT__EVIDENCE, null, msgs);
			if (newEvidence != null)
				msgs = ((InternalEObject)newEvidence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tcrPackage.VTCR_TEST_REPORT__EVIDENCE, null, msgs);
			msgs = basicSetEvidence(newEvidence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcrPackage.VTCR_TEST_REPORT__EVIDENCE, newEvidence, newEvidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tcrPackage.VTCR_TEST_REPORT__EVIDENCE:
				return basicSetEvidence(null, msgs);
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
			case tcrPackage.VTCR_TEST_REPORT__TEST_PROCEDURE:
				return getTest_procedure();
			case tcrPackage.VTCR_TEST_REPORT__STATUS:
				return getStatus();
			case tcrPackage.VTCR_TEST_REPORT__EVIDENCE:
				return getEvidence();
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
			case tcrPackage.VTCR_TEST_REPORT__TEST_PROCEDURE:
				setTest_procedure((String)newValue);
				return;
			case tcrPackage.VTCR_TEST_REPORT__STATUS:
				setStatus((VTCRTestStatus)newValue);
				return;
			case tcrPackage.VTCR_TEST_REPORT__EVIDENCE:
				setEvidence((DParagraph)newValue);
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
			case tcrPackage.VTCR_TEST_REPORT__TEST_PROCEDURE:
				setTest_procedure(TEST_PROCEDURE_EDEFAULT);
				return;
			case tcrPackage.VTCR_TEST_REPORT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case tcrPackage.VTCR_TEST_REPORT__EVIDENCE:
				setEvidence((DParagraph)null);
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
			case tcrPackage.VTCR_TEST_REPORT__TEST_PROCEDURE:
				return TEST_PROCEDURE_EDEFAULT == null ? test_procedure != null : !TEST_PROCEDURE_EDEFAULT.equals(test_procedure);
			case tcrPackage.VTCR_TEST_REPORT__STATUS:
				return status != STATUS_EDEFAULT;
			case tcrPackage.VTCR_TEST_REPORT__EVIDENCE:
				return evidence != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (test_procedure: ");
		result.append(test_procedure);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //VTCRTestReportImpl
