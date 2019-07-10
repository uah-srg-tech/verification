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

import es.uah.aut.srg.micobs.svm.svs.VSVSStepCheckmode;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel0;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepUnit;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Step Outputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputsImpl#getCheckmode <em>Checkmode</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputsImpl#getValid_time_interval_value <em>Valid time interval value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputsImpl#getValid_time_interval_unit <em>Valid time interval unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputsImpl#getOutput_level_3 <em>Output level 3</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputsImpl#getOutput_level_2 <em>Output level 2</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputsImpl#getOutput_level_1 <em>Output level 1</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputsImpl#getOutput_level_0 <em>Output level 0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepOutputsImpl extends MinimalEObjectImpl.Container implements VSVSStepOutputs {
	/**
	 * The default value of the '{@link #getCheckmode() <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckmode()
	 * @generated
	 * @ordered
	 */
	protected static final VSVSStepCheckmode CHECKMODE_EDEFAULT = VSVSStepCheckmode.ALL;

	/**
	 * The cached value of the '{@link #getCheckmode() <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckmode()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepCheckmode checkmode = CHECKMODE_EDEFAULT;

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
	protected static final VSVSStepUnit VALID_TIME_INTERVAL_UNIT_EDEFAULT = VSVSStepUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getValid_time_interval_unit() <em>Valid time interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_time_interval_unit()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepUnit valid_time_interval_unit = VALID_TIME_INTERVAL_UNIT_EDEFAULT;

	/**
	 * This is true if the Valid time interval unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valid_time_interval_unitESet;

	/**
	 * The cached value of the '{@link #getOutput_level_3() <em>Output level 3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_level_3()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepOutputLevel3> output_level_3;

	/**
	 * The cached value of the '{@link #getOutput_level_2() <em>Output level 2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_level_2()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepOutputLevel2> output_level_2;

	/**
	 * The cached value of the '{@link #getOutput_level_1() <em>Output level 1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_level_1()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepOutputLevel1> output_level_1;

	/**
	 * The cached value of the '{@link #getOutput_level_0() <em>Output level 0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_level_0()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepOutputLevel0> output_level_0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepOutputsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_OUTPUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepCheckmode getCheckmode() {
		return checkmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckmode(VSVSStepCheckmode newCheckmode) {
		VSVSStepCheckmode oldCheckmode = checkmode;
		checkmode = newCheckmode == null ? CHECKMODE_EDEFAULT : newCheckmode;
		boolean oldCheckmodeESet = checkmodeESet;
		checkmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUTS__CHECKMODE, oldCheckmode, checkmode, !oldCheckmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCheckmode() {
		VSVSStepCheckmode oldCheckmode = checkmode;
		boolean oldCheckmodeESet = checkmodeESet;
		checkmode = CHECKMODE_EDEFAULT;
		checkmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_OUTPUTS__CHECKMODE, oldCheckmode, CHECKMODE_EDEFAULT, oldCheckmodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_VALUE, oldValid_time_interval_value, valid_time_interval_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepUnit getValid_time_interval_unit() {
		return valid_time_interval_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid_time_interval_unit(VSVSStepUnit newValid_time_interval_unit) {
		VSVSStepUnit oldValid_time_interval_unit = valid_time_interval_unit;
		valid_time_interval_unit = newValid_time_interval_unit == null ? VALID_TIME_INTERVAL_UNIT_EDEFAULT : newValid_time_interval_unit;
		boolean oldValid_time_interval_unitESet = valid_time_interval_unitESet;
		valid_time_interval_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_UNIT, oldValid_time_interval_unit, valid_time_interval_unit, !oldValid_time_interval_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValid_time_interval_unit() {
		VSVSStepUnit oldValid_time_interval_unit = valid_time_interval_unit;
		boolean oldValid_time_interval_unitESet = valid_time_interval_unitESet;
		valid_time_interval_unit = VALID_TIME_INTERVAL_UNIT_EDEFAULT;
		valid_time_interval_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_UNIT, oldValid_time_interval_unit, VALID_TIME_INTERVAL_UNIT_EDEFAULT, oldValid_time_interval_unitESet));
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
	public EList<VSVSStepOutputLevel3> getOutput_level_3() {
		if (output_level_3 == null) {
			output_level_3 = new EObjectContainmentEList<VSVSStepOutputLevel3>(VSVSStepOutputLevel3.class, this, svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_3);
		}
		return output_level_3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSStepOutputLevel2> getOutput_level_2() {
		if (output_level_2 == null) {
			output_level_2 = new EObjectContainmentEList<VSVSStepOutputLevel2>(VSVSStepOutputLevel2.class, this, svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_2);
		}
		return output_level_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSStepOutputLevel1> getOutput_level_1() {
		if (output_level_1 == null) {
			output_level_1 = new EObjectContainmentEList<VSVSStepOutputLevel1>(VSVSStepOutputLevel1.class, this, svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_1);
		}
		return output_level_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSStepOutputLevel0> getOutput_level_0() {
		if (output_level_0 == null) {
			output_level_0 = new EObjectContainmentEList<VSVSStepOutputLevel0>(VSVSStepOutputLevel0.class, this, svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_0);
		}
		return output_level_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_3:
				return ((InternalEList<?>)getOutput_level_3()).basicRemove(otherEnd, msgs);
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_2:
				return ((InternalEList<?>)getOutput_level_2()).basicRemove(otherEnd, msgs);
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_1:
				return ((InternalEList<?>)getOutput_level_1()).basicRemove(otherEnd, msgs);
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_0:
				return ((InternalEList<?>)getOutput_level_0()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_STEP_OUTPUTS__CHECKMODE:
				return getCheckmode();
			case svsPackage.VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_VALUE:
				return getValid_time_interval_value();
			case svsPackage.VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_UNIT:
				return getValid_time_interval_unit();
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_3:
				return getOutput_level_3();
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_2:
				return getOutput_level_2();
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_1:
				return getOutput_level_1();
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_0:
				return getOutput_level_0();
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
			case svsPackage.VSVS_STEP_OUTPUTS__CHECKMODE:
				setCheckmode((VSVSStepCheckmode)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_VALUE:
				setValid_time_interval_value((String)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_UNIT:
				setValid_time_interval_unit((VSVSStepUnit)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_3:
				getOutput_level_3().clear();
				getOutput_level_3().addAll((Collection<? extends VSVSStepOutputLevel3>)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_2:
				getOutput_level_2().clear();
				getOutput_level_2().addAll((Collection<? extends VSVSStepOutputLevel2>)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_1:
				getOutput_level_1().clear();
				getOutput_level_1().addAll((Collection<? extends VSVSStepOutputLevel1>)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_0:
				getOutput_level_0().clear();
				getOutput_level_0().addAll((Collection<? extends VSVSStepOutputLevel0>)newValue);
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
			case svsPackage.VSVS_STEP_OUTPUTS__CHECKMODE:
				unsetCheckmode();
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_VALUE:
				setValid_time_interval_value(VALID_TIME_INTERVAL_VALUE_EDEFAULT);
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_UNIT:
				unsetValid_time_interval_unit();
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_3:
				getOutput_level_3().clear();
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_2:
				getOutput_level_2().clear();
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_1:
				getOutput_level_1().clear();
				return;
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_0:
				getOutput_level_0().clear();
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
			case svsPackage.VSVS_STEP_OUTPUTS__CHECKMODE:
				return isSetCheckmode();
			case svsPackage.VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_VALUE:
				return VALID_TIME_INTERVAL_VALUE_EDEFAULT == null ? valid_time_interval_value != null : !VALID_TIME_INTERVAL_VALUE_EDEFAULT.equals(valid_time_interval_value);
			case svsPackage.VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_UNIT:
				return isSetValid_time_interval_unit();
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_3:
				return output_level_3 != null && !output_level_3.isEmpty();
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_2:
				return output_level_2 != null && !output_level_2.isEmpty();
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_1:
				return output_level_1 != null && !output_level_1.isEmpty();
			case svsPackage.VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_0:
				return output_level_0 != null && !output_level_0.isEmpty();
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

} //VSVSStepOutputsImpl
