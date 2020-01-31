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
package es.uah.aut.srg.micobs.svm.testsetup.impl;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;

import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTest Setup Supported Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedInterfaceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedInterfaceImpl#getScenarioInterface <em>Scenario Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTestSetupSupportedInterfaceImpl extends MinimalEObjectImpl.Container implements VTestSetupSupportedInterface {
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
	protected VTestSetupInterface interface_;

	/**
	 * The cached value of the '{@link #getScenarioInterface() <em>Scenario Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioInterface()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFScenarioInterface scenarioInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTestSetupSupportedInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupInterface getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (VTestSetupInterface)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupInterface basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(VTestSetupInterface newInterface) {
		VTestSetupInterface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFScenarioInterface getScenarioInterface() {
		if (scenarioInterface != null && scenarioInterface.eIsProxy()) {
			InternalEObject oldScenarioInterface = (InternalEObject)scenarioInterface;
			scenarioInterface = (TMTCIFScenarioInterface)eResolveProxy(oldScenarioInterface);
			if (scenarioInterface != oldScenarioInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__SCENARIO_INTERFACE, oldScenarioInterface, scenarioInterface));
			}
		}
		return scenarioInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFScenarioInterface basicGetScenarioInterface() {
		return scenarioInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioInterface(TMTCIFScenarioInterface newScenarioInterface) {
		TMTCIFScenarioInterface oldScenarioInterface = scenarioInterface;
		scenarioInterface = newScenarioInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__SCENARIO_INTERFACE, oldScenarioInterface, scenarioInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__NAME:
				return getName();
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__SCENARIO_INTERFACE:
				if (resolve) return getScenarioInterface();
				return basicGetScenarioInterface();
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
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__INTERFACE:
				setInterface((VTestSetupInterface)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__SCENARIO_INTERFACE:
				setScenarioInterface((TMTCIFScenarioInterface)newValue);
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
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__INTERFACE:
				setInterface((VTestSetupInterface)null);
				return;
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__SCENARIO_INTERFACE:
				setScenarioInterface((TMTCIFScenarioInterface)null);
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
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__INTERFACE:
				return interface_ != null;
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE__SCENARIO_INTERFACE:
				return scenarioInterface != null;
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

} //VTestSetupSupportedInterfaceImpl
