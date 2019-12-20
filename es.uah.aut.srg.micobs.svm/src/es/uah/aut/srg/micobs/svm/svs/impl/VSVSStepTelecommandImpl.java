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
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommand;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandData;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandHeader;
import es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Step Telecommand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelecommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelecommandImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelecommandImpl#getDelay_value <em>Delay value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelecommandImpl#getDelay_unit <em>Delay unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelecommandImpl#getTcData <em>Tc Data</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelecommandImpl#getTcHeader <em>Tc Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepTelecommandImpl extends MinimalEObjectImpl.Container implements VSVSStepTelecommand {
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
	 * The default value of the '{@link #getDelay_value() <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_value()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay_value() <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_value()
	 * @generated
	 * @ordered
	 */
	protected String delay_value = DELAY_VALUE_EDEFAULT;

	/**
	 * This is true if the Delay value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delay_valueESet;

	/**
	 * The default value of the '{@link #getDelay_unit() <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_unit()
	 * @generated
	 * @ordered
	 */
	protected static final VSVSTimeUnit DELAY_UNIT_EDEFAULT = VSVSTimeUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getDelay_unit() <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_unit()
	 * @generated
	 * @ordered
	 */
	protected VSVSTimeUnit delay_unit = DELAY_UNIT_EDEFAULT;

	/**
	 * This is true if the Delay unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delay_unitESet;

	/**
	 * The cached value of the '{@link #getTcData() <em>Tc Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcData()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepTelecommandData tcData;

	/**
	 * The cached value of the '{@link #getTcHeader() <em>Tc Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcHeader()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepTelecommandHeader tcHeader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepTelecommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_TELECOMMAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELECOMMAND__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_TELECOMMAND__INTERFACE, oldInterface, interface_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELECOMMAND__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelay_value() {
		return delay_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay_value(String newDelay_value) {
		String oldDelay_value = delay_value;
		delay_value = newDelay_value;
		boolean oldDelay_valueESet = delay_valueESet;
		delay_valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELECOMMAND__DELAY_VALUE, oldDelay_value, delay_value, !oldDelay_valueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelay_value() {
		String oldDelay_value = delay_value;
		boolean oldDelay_valueESet = delay_valueESet;
		delay_value = DELAY_VALUE_EDEFAULT;
		delay_valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_TELECOMMAND__DELAY_VALUE, oldDelay_value, DELAY_VALUE_EDEFAULT, oldDelay_valueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelay_value() {
		return delay_valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTimeUnit getDelay_unit() {
		return delay_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay_unit(VSVSTimeUnit newDelay_unit) {
		VSVSTimeUnit oldDelay_unit = delay_unit;
		delay_unit = newDelay_unit == null ? DELAY_UNIT_EDEFAULT : newDelay_unit;
		boolean oldDelay_unitESet = delay_unitESet;
		delay_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELECOMMAND__DELAY_UNIT, oldDelay_unit, delay_unit, !oldDelay_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelay_unit() {
		VSVSTimeUnit oldDelay_unit = delay_unit;
		boolean oldDelay_unitESet = delay_unitESet;
		delay_unit = DELAY_UNIT_EDEFAULT;
		delay_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_TELECOMMAND__DELAY_UNIT, oldDelay_unit, DELAY_UNIT_EDEFAULT, oldDelay_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelay_unit() {
		return delay_unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelecommandHeader getTcHeader() {
		return tcHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTcHeader(VSVSStepTelecommandHeader newTcHeader, NotificationChain msgs) {
		VSVSStepTelecommandHeader oldTcHeader = tcHeader;
		tcHeader = newTcHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELECOMMAND__TC_HEADER, oldTcHeader, newTcHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTcHeader(VSVSStepTelecommandHeader newTcHeader) {
		if (newTcHeader != tcHeader) {
			NotificationChain msgs = null;
			if (tcHeader != null)
				msgs = ((InternalEObject)tcHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_TELECOMMAND__TC_HEADER, null, msgs);
			if (newTcHeader != null)
				msgs = ((InternalEObject)newTcHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_TELECOMMAND__TC_HEADER, null, msgs);
			msgs = basicSetTcHeader(newTcHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELECOMMAND__TC_HEADER, newTcHeader, newTcHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelecommandData getTcData() {
		return tcData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTcData(VSVSStepTelecommandData newTcData, NotificationChain msgs) {
		VSVSStepTelecommandData oldTcData = tcData;
		tcData = newTcData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELECOMMAND__TC_DATA, oldTcData, newTcData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTcData(VSVSStepTelecommandData newTcData) {
		if (newTcData != tcData) {
			NotificationChain msgs = null;
			if (tcData != null)
				msgs = ((InternalEObject)tcData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_TELECOMMAND__TC_DATA, null, msgs);
			if (newTcData != null)
				msgs = ((InternalEObject)newTcData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_TELECOMMAND__TC_DATA, null, msgs);
			msgs = basicSetTcData(newTcData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELECOMMAND__TC_DATA, newTcData, newTcData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_TELECOMMAND__TC_DATA:
				return basicSetTcData(null, msgs);
			case svsPackage.VSVS_STEP_TELECOMMAND__TC_HEADER:
				return basicSetTcHeader(null, msgs);
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
			case svsPackage.VSVS_STEP_TELECOMMAND__NAME:
				return getName();
			case svsPackage.VSVS_STEP_TELECOMMAND__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case svsPackage.VSVS_STEP_TELECOMMAND__DELAY_VALUE:
				return getDelay_value();
			case svsPackage.VSVS_STEP_TELECOMMAND__DELAY_UNIT:
				return getDelay_unit();
			case svsPackage.VSVS_STEP_TELECOMMAND__TC_DATA:
				return getTcData();
			case svsPackage.VSVS_STEP_TELECOMMAND__TC_HEADER:
				return getTcHeader();
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
			case svsPackage.VSVS_STEP_TELECOMMAND__NAME:
				setName((String)newValue);
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND__INTERFACE:
				setInterface((VSVSInterface)newValue);
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND__DELAY_VALUE:
				setDelay_value((String)newValue);
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND__DELAY_UNIT:
				setDelay_unit((VSVSTimeUnit)newValue);
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND__TC_DATA:
				setTcData((VSVSStepTelecommandData)newValue);
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND__TC_HEADER:
				setTcHeader((VSVSStepTelecommandHeader)newValue);
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
			case svsPackage.VSVS_STEP_TELECOMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND__INTERFACE:
				setInterface((VSVSInterface)null);
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND__DELAY_VALUE:
				unsetDelay_value();
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND__DELAY_UNIT:
				unsetDelay_unit();
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND__TC_DATA:
				setTcData((VSVSStepTelecommandData)null);
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND__TC_HEADER:
				setTcHeader((VSVSStepTelecommandHeader)null);
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
			case svsPackage.VSVS_STEP_TELECOMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case svsPackage.VSVS_STEP_TELECOMMAND__INTERFACE:
				return interface_ != null;
			case svsPackage.VSVS_STEP_TELECOMMAND__DELAY_VALUE:
				return isSetDelay_value();
			case svsPackage.VSVS_STEP_TELECOMMAND__DELAY_UNIT:
				return isSetDelay_unit();
			case svsPackage.VSVS_STEP_TELECOMMAND__TC_DATA:
				return tcData != null;
			case svsPackage.VSVS_STEP_TELECOMMAND__TC_HEADER:
				return tcHeader != null;
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
		result.append(", delay_value: ");
		if (delay_valueESet) result.append(delay_value); else result.append("<unset>");
		result.append(", delay_unit: ");
		if (delay_unitESet) result.append(delay_unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VSVSStepTelecommandImpl
