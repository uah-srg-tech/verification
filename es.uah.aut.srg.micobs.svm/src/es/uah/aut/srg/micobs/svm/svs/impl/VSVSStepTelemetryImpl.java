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
package es.uah.aut.srg.micobs.svm.svs.impl;

import es.uah.aut.srg.micobs.svm.svs.VSVSInterface;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryData;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeader;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Step Telemetry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelemetryImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelemetryImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelemetryImpl#getTmData <em>Tm Data</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelemetryImpl#getTmHeader <em>Tm Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepTelemetryImpl extends MinimalEObjectImpl.Container implements VSVSStepTelemetry {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected VSVSInterface interface_;

	/**
	 * The cached value of the '{@link #getTmData() <em>Tm Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmData()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepTelemetryData tmData;

	/**
	 * The cached value of the '{@link #getTmHeader() <em>Tm Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmHeader()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepTelemetryHeader tmHeader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepTelemetryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_TELEMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELEMETRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSInterface getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (VSVSInterface)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_TELEMETRY__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSInterface basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(VSVSInterface newInterface) {
		VSVSInterface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELEMETRY__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetryData getTmData() {
		return tmData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTmData(VSVSStepTelemetryData newTmData, NotificationChain msgs) {
		VSVSStepTelemetryData oldTmData = tmData;
		tmData = newTmData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELEMETRY__TM_DATA, oldTmData, newTmData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmData(VSVSStepTelemetryData newTmData) {
		if (newTmData != tmData) {
			NotificationChain msgs = null;
			if (tmData != null)
				msgs = ((InternalEObject)tmData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_TELEMETRY__TM_DATA, null, msgs);
			if (newTmData != null)
				msgs = ((InternalEObject)newTmData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_TELEMETRY__TM_DATA, null, msgs);
			msgs = basicSetTmData(newTmData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELEMETRY__TM_DATA, newTmData, newTmData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetryHeader getTmHeader() {
		return tmHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTmHeader(VSVSStepTelemetryHeader newTmHeader, NotificationChain msgs) {
		VSVSStepTelemetryHeader oldTmHeader = tmHeader;
		tmHeader = newTmHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELEMETRY__TM_HEADER, oldTmHeader, newTmHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmHeader(VSVSStepTelemetryHeader newTmHeader) {
		if (newTmHeader != tmHeader) {
			NotificationChain msgs = null;
			if (tmHeader != null)
				msgs = ((InternalEObject)tmHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_TELEMETRY__TM_HEADER, null, msgs);
			if (newTmHeader != null)
				msgs = ((InternalEObject)newTmHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_TELEMETRY__TM_HEADER, null, msgs);
			msgs = basicSetTmHeader(newTmHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELEMETRY__TM_HEADER, newTmHeader, newTmHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_TELEMETRY__TM_DATA:
				return basicSetTmData(null, msgs);
			case svsPackage.VSVS_STEP_TELEMETRY__TM_HEADER:
				return basicSetTmHeader(null, msgs);
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
			case svsPackage.VSVS_STEP_TELEMETRY__NAME:
				return getName();
			case svsPackage.VSVS_STEP_TELEMETRY__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case svsPackage.VSVS_STEP_TELEMETRY__TM_DATA:
				return getTmData();
			case svsPackage.VSVS_STEP_TELEMETRY__TM_HEADER:
				return getTmHeader();
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
			case svsPackage.VSVS_STEP_TELEMETRY__NAME:
				setName((String)newValue);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY__INTERFACE:
				setInterface((VSVSInterface)newValue);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY__TM_DATA:
				setTmData((VSVSStepTelemetryData)newValue);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY__TM_HEADER:
				setTmHeader((VSVSStepTelemetryHeader)newValue);
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
			case svsPackage.VSVS_STEP_TELEMETRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY__INTERFACE:
				setInterface((VSVSInterface)null);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY__TM_DATA:
				setTmData((VSVSStepTelemetryData)null);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY__TM_HEADER:
				setTmHeader((VSVSStepTelemetryHeader)null);
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
			case svsPackage.VSVS_STEP_TELEMETRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case svsPackage.VSVS_STEP_TELEMETRY__INTERFACE:
				return interface_ != null;
			case svsPackage.VSVS_STEP_TELEMETRY__TM_DATA:
				return tmData != null;
			case svsPackage.VSVS_STEP_TELEMETRY__TM_HEADER:
				return tmHeader != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VSVSStepTelemetryImpl
