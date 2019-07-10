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

import es.uah.aut.srg.micobs.svm.svs.VSVSStepEnableDisable;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Step Special Packets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepSpecialPacketsImpl#getEnable <em>Enable</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepSpecialPacketsImpl#getDisable <em>Disable</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepSpecialPacketsImpl#getEnable_print <em>Enable print</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepSpecialPacketsImpl#getDisable_print <em>Disable print</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepSpecialPacketsImpl extends MinimalEObjectImpl.Container implements VSVSStepSpecialPackets {
	/**
	 * The cached value of the '{@link #getEnable() <em>Enable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepEnableDisable> enable;

	/**
	 * The cached value of the '{@link #getDisable() <em>Disable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisable()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepEnableDisable> disable;

	/**
	 * The cached value of the '{@link #getEnable_print() <em>Enable print</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable_print()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepEnableDisable> enable_print;

	/**
	 * The cached value of the '{@link #getDisable_print() <em>Disable print</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisable_print()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepEnableDisable> disable_print;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepSpecialPacketsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_SPECIAL_PACKETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSStepEnableDisable> getEnable() {
		if (enable == null) {
			enable = new EObjectContainmentEList<VSVSStepEnableDisable>(VSVSStepEnableDisable.class, this, svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE);
		}
		return enable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSStepEnableDisable> getDisable() {
		if (disable == null) {
			disable = new EObjectContainmentEList<VSVSStepEnableDisable>(VSVSStepEnableDisable.class, this, svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE);
		}
		return disable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSStepEnableDisable> getEnable_print() {
		if (enable_print == null) {
			enable_print = new EObjectContainmentEList<VSVSStepEnableDisable>(VSVSStepEnableDisable.class, this, svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE_PRINT);
		}
		return enable_print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSStepEnableDisable> getDisable_print() {
		if (disable_print == null) {
			disable_print = new EObjectContainmentEList<VSVSStepEnableDisable>(VSVSStepEnableDisable.class, this, svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE_PRINT);
		}
		return disable_print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE:
				return ((InternalEList<?>)getEnable()).basicRemove(otherEnd, msgs);
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE:
				return ((InternalEList<?>)getDisable()).basicRemove(otherEnd, msgs);
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE_PRINT:
				return ((InternalEList<?>)getEnable_print()).basicRemove(otherEnd, msgs);
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE_PRINT:
				return ((InternalEList<?>)getDisable_print()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE:
				return getEnable();
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE:
				return getDisable();
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE_PRINT:
				return getEnable_print();
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE_PRINT:
				return getDisable_print();
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
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE:
				getEnable().clear();
				getEnable().addAll((Collection<? extends VSVSStepEnableDisable>)newValue);
				return;
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE:
				getDisable().clear();
				getDisable().addAll((Collection<? extends VSVSStepEnableDisable>)newValue);
				return;
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE_PRINT:
				getEnable_print().clear();
				getEnable_print().addAll((Collection<? extends VSVSStepEnableDisable>)newValue);
				return;
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE_PRINT:
				getDisable_print().clear();
				getDisable_print().addAll((Collection<? extends VSVSStepEnableDisable>)newValue);
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
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE:
				getEnable().clear();
				return;
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE:
				getDisable().clear();
				return;
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE_PRINT:
				getEnable_print().clear();
				return;
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE_PRINT:
				getDisable_print().clear();
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
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE:
				return enable != null && !enable.isEmpty();
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE:
				return disable != null && !disable.isEmpty();
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__ENABLE_PRINT:
				return enable_print != null && !enable_print.isEmpty();
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS__DISABLE_PRINT:
				return disable_print != null && !disable_print.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VSVSStepSpecialPacketsImpl
