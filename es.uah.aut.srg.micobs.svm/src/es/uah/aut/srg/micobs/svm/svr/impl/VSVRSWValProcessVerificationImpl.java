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
package es.uah.aut.srg.micobs.svm.svr.impl;

import es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection;
import es.uah.aut.srg.micobs.svm.svr.VSVRSWValProcessVerification;
import es.uah.aut.srg.micobs.svm.svr.svrPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVRSW Val Process Verification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRSWValProcessVerificationImpl#getTraceability <em>Traceability</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRSWValProcessVerificationImpl#getFeasibility <em>Feasibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVRSWValProcessVerificationImpl extends VSVRFixedSectionImpl implements VSVRSWValProcessVerification {
	/**
	 * The cached value of the '{@link #getTraceability() <em>Traceability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceability()
	 * @generated
	 * @ordered
	 */
	protected VSVRFixedSection traceability;

	/**
	 * The cached value of the '{@link #getFeasibility() <em>Feasibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeasibility()
	 * @generated
	 * @ordered
	 */
	protected VSVRFixedSection feasibility;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVRSWValProcessVerificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svrPackage.Literals.VSVRSW_VAL_PROCESS_VERIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRFixedSection getTraceability() {
		return traceability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraceability(VSVRFixedSection newTraceability, NotificationChain msgs) {
		VSVRFixedSection oldTraceability = traceability;
		traceability = newTraceability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__TRACEABILITY, oldTraceability, newTraceability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceability(VSVRFixedSection newTraceability) {
		if (newTraceability != traceability) {
			NotificationChain msgs = null;
			if (traceability != null)
				msgs = ((InternalEObject)traceability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__TRACEABILITY, null, msgs);
			if (newTraceability != null)
				msgs = ((InternalEObject)newTraceability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__TRACEABILITY, null, msgs);
			msgs = basicSetTraceability(newTraceability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__TRACEABILITY, newTraceability, newTraceability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRFixedSection getFeasibility() {
		return feasibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeasibility(VSVRFixedSection newFeasibility, NotificationChain msgs) {
		VSVRFixedSection oldFeasibility = feasibility;
		feasibility = newFeasibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__FEASIBILITY, oldFeasibility, newFeasibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeasibility(VSVRFixedSection newFeasibility) {
		if (newFeasibility != feasibility) {
			NotificationChain msgs = null;
			if (feasibility != null)
				msgs = ((InternalEObject)feasibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__FEASIBILITY, null, msgs);
			if (newFeasibility != null)
				msgs = ((InternalEObject)newFeasibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__FEASIBILITY, null, msgs);
			msgs = basicSetFeasibility(newFeasibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__FEASIBILITY, newFeasibility, newFeasibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__TRACEABILITY:
				return basicSetTraceability(null, msgs);
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__FEASIBILITY:
				return basicSetFeasibility(null, msgs);
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
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__TRACEABILITY:
				return getTraceability();
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__FEASIBILITY:
				return getFeasibility();
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
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__TRACEABILITY:
				setTraceability((VSVRFixedSection)newValue);
				return;
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__FEASIBILITY:
				setFeasibility((VSVRFixedSection)newValue);
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
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__TRACEABILITY:
				setTraceability((VSVRFixedSection)null);
				return;
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__FEASIBILITY:
				setFeasibility((VSVRFixedSection)null);
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
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__TRACEABILITY:
				return traceability != null;
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION__FEASIBILITY:
				return feasibility != null;
		}
		return super.eIsSet(featureID);
	}

} //VSVRSWValProcessVerificationImpl
