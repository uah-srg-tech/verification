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

import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetrySet;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetrySetCheckmode;
import es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Step Telemetry Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelemetrySetImpl#getCheckmode <em>Checkmode</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelemetrySetImpl#getValid_time_interval_value <em>Valid time interval value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelemetrySetImpl#getValid_time_interval_unit <em>Valid time interval unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelemetrySetImpl#getTelemetry <em>Telemetry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepTelemetrySetImpl extends VSVSStepOutputsImpl implements VSVSStepTelemetrySet {
	/**
	 * The default value of the '{@link #getCheckmode() <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckmode()
	 * @generated
	 * @ordered
	 */
	protected static final VSVSStepTelemetrySetCheckmode CHECKMODE_EDEFAULT = VSVSStepTelemetrySetCheckmode.ALL;

	/**
	 * The cached value of the '{@link #getCheckmode() <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckmode()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepTelemetrySetCheckmode checkmode = CHECKMODE_EDEFAULT;

	/**
	 * This is true if the Checkmode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean checkmodeESet;

	/**
	 * The default value of the '{@link #getValid_time_interval_value() <em>Valid time interval value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_time_interval_value()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_TIME_INTERVAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValid_time_interval_value() <em>Valid time interval value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_time_interval_value()
	 * @generated
	 * @ordered
	 */
	protected String valid_time_interval_value = VALID_TIME_INTERVAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValid_time_interval_unit() <em>Valid time interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_time_interval_unit()
	 * @generated
	 * @ordered
	 */
	protected static final VSVSTimeUnit VALID_TIME_INTERVAL_UNIT_EDEFAULT = VSVSTimeUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getValid_time_interval_unit() <em>Valid time interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_time_interval_unit()
	 * @generated
	 * @ordered
	 */
	protected VSVSTimeUnit valid_time_interval_unit = VALID_TIME_INTERVAL_UNIT_EDEFAULT;

	/**
	 * This is true if the Valid time interval unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valid_time_interval_unitESet;

	/**
	 * The cached value of the '{@link #getTelemetry() <em>Telemetry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelemetry()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepTelemetry> telemetry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepTelemetrySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_TELEMETRY_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetrySetCheckmode getCheckmode() {
		return checkmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckmode(VSVSStepTelemetrySetCheckmode newCheckmode) {
		VSVSStepTelemetrySetCheckmode oldCheckmode = checkmode;
		checkmode = newCheckmode == null ? CHECKMODE_EDEFAULT : newCheckmode;
		boolean oldCheckmodeESet = checkmodeESet;
		checkmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELEMETRY_SET__CHECKMODE, oldCheckmode, checkmode, !oldCheckmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCheckmode() {
		VSVSStepTelemetrySetCheckmode oldCheckmode = checkmode;
		boolean oldCheckmodeESet = checkmodeESet;
		checkmode = CHECKMODE_EDEFAULT;
		checkmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_TELEMETRY_SET__CHECKMODE, oldCheckmode, CHECKMODE_EDEFAULT, oldCheckmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCheckmode() {
		return checkmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValid_time_interval_value() {
		return valid_time_interval_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid_time_interval_value(String newValid_time_interval_value) {
		String oldValid_time_interval_value = valid_time_interval_value;
		valid_time_interval_value = newValid_time_interval_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELEMETRY_SET__VALID_TIME_INTERVAL_VALUE, oldValid_time_interval_value, valid_time_interval_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTimeUnit getValid_time_interval_unit() {
		return valid_time_interval_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid_time_interval_unit(VSVSTimeUnit newValid_time_interval_unit) {
		VSVSTimeUnit oldValid_time_interval_unit = valid_time_interval_unit;
		valid_time_interval_unit = newValid_time_interval_unit == null ? VALID_TIME_INTERVAL_UNIT_EDEFAULT : newValid_time_interval_unit;
		boolean oldValid_time_interval_unitESet = valid_time_interval_unitESet;
		valid_time_interval_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELEMETRY_SET__VALID_TIME_INTERVAL_UNIT, oldValid_time_interval_unit, valid_time_interval_unit, !oldValid_time_interval_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValid_time_interval_unit() {
		VSVSTimeUnit oldValid_time_interval_unit = valid_time_interval_unit;
		boolean oldValid_time_interval_unitESet = valid_time_interval_unitESet;
		valid_time_interval_unit = VALID_TIME_INTERVAL_UNIT_EDEFAULT;
		valid_time_interval_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_TELEMETRY_SET__VALID_TIME_INTERVAL_UNIT, oldValid_time_interval_unit, VALID_TIME_INTERVAL_UNIT_EDEFAULT, oldValid_time_interval_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValid_time_interval_unit() {
		return valid_time_interval_unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSStepTelemetry> getTelemetry() {
		if (telemetry == null) {
			telemetry = new EObjectContainmentEList<VSVSStepTelemetry>(VSVSStepTelemetry.class, this, svsPackage.VSVS_STEP_TELEMETRY_SET__TELEMETRY);
		}
		return telemetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_TELEMETRY_SET__TELEMETRY:
				return ((InternalEList<?>)getTelemetry()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_STEP_TELEMETRY_SET__CHECKMODE:
				return getCheckmode();
			case svsPackage.VSVS_STEP_TELEMETRY_SET__VALID_TIME_INTERVAL_VALUE:
				return getValid_time_interval_value();
			case svsPackage.VSVS_STEP_TELEMETRY_SET__VALID_TIME_INTERVAL_UNIT:
				return getValid_time_interval_unit();
			case svsPackage.VSVS_STEP_TELEMETRY_SET__TELEMETRY:
				return getTelemetry();
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
			case svsPackage.VSVS_STEP_TELEMETRY_SET__CHECKMODE:
				setCheckmode((VSVSStepTelemetrySetCheckmode)newValue);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY_SET__VALID_TIME_INTERVAL_VALUE:
				setValid_time_interval_value((String)newValue);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY_SET__VALID_TIME_INTERVAL_UNIT:
				setValid_time_interval_unit((VSVSTimeUnit)newValue);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY_SET__TELEMETRY:
				getTelemetry().clear();
				getTelemetry().addAll((Collection<? extends VSVSStepTelemetry>)newValue);
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
			case svsPackage.VSVS_STEP_TELEMETRY_SET__CHECKMODE:
				unsetCheckmode();
				return;
			case svsPackage.VSVS_STEP_TELEMETRY_SET__VALID_TIME_INTERVAL_VALUE:
				setValid_time_interval_value(VALID_TIME_INTERVAL_VALUE_EDEFAULT);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY_SET__VALID_TIME_INTERVAL_UNIT:
				unsetValid_time_interval_unit();
				return;
			case svsPackage.VSVS_STEP_TELEMETRY_SET__TELEMETRY:
				getTelemetry().clear();
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
			case svsPackage.VSVS_STEP_TELEMETRY_SET__CHECKMODE:
				return isSetCheckmode();
			case svsPackage.VSVS_STEP_TELEMETRY_SET__VALID_TIME_INTERVAL_VALUE:
				return VALID_TIME_INTERVAL_VALUE_EDEFAULT == null ? valid_time_interval_value != null : !VALID_TIME_INTERVAL_VALUE_EDEFAULT.equals(valid_time_interval_value);
			case svsPackage.VSVS_STEP_TELEMETRY_SET__VALID_TIME_INTERVAL_UNIT:
				return isSetValid_time_interval_unit();
			case svsPackage.VSVS_STEP_TELEMETRY_SET__TELEMETRY:
				return telemetry != null && !telemetry.isEmpty();
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
		result.append(" (checkmode: ");
		if (checkmodeESet) result.append(checkmode); else result.append("<unset>");
		result.append(", valid_time_interval_value: ");
		result.append(valid_time_interval_value);
		result.append(", valid_time_interval_unit: ");
		if (valid_time_interval_unitESet) result.append(valid_time_interval_unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VSVSStepTelemetrySetImpl
