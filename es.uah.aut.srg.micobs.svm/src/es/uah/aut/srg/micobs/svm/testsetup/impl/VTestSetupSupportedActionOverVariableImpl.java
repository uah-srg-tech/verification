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

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;

import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTest Setup Supported Action Over Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedActionOverVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedActionOverVariableImpl#getActionOverVariable <em>Action Over Variable</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedActionOverVariableImpl#getScenarioVariable <em>Scenario Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTestSetupSupportedActionOverVariableImpl extends MinimalEObjectImpl.Container implements VTestSetupSupportedActionOverVariable {
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
	 * The cached value of the '{@link #getActionOverVariable() <em>Action Over Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionOverVariable()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupActionOverVariable actionOverVariable;

	/**
	 * The cached value of the '{@link #getScenarioVariable() <em>Scenario Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioVariable()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFScenarioVariable scenarioVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTestSetupSupportedActionOverVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupActionOverVariable getActionOverVariable() {
		if (actionOverVariable != null && actionOverVariable.eIsProxy()) {
			InternalEObject oldActionOverVariable = (InternalEObject)actionOverVariable;
			actionOverVariable = (VTestSetupActionOverVariable)eResolveProxy(oldActionOverVariable);
			if (actionOverVariable != oldActionOverVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__ACTION_OVER_VARIABLE, oldActionOverVariable, actionOverVariable));
			}
		}
		return actionOverVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupActionOverVariable basicGetActionOverVariable() {
		return actionOverVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionOverVariable(VTestSetupActionOverVariable newActionOverVariable) {
		VTestSetupActionOverVariable oldActionOverVariable = actionOverVariable;
		actionOverVariable = newActionOverVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__ACTION_OVER_VARIABLE, oldActionOverVariable, actionOverVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFScenarioVariable getScenarioVariable() {
		if (scenarioVariable != null && scenarioVariable.eIsProxy()) {
			InternalEObject oldScenarioVariable = (InternalEObject)scenarioVariable;
			scenarioVariable = (TMTCIFScenarioVariable)eResolveProxy(oldScenarioVariable);
			if (scenarioVariable != oldScenarioVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__SCENARIO_VARIABLE, oldScenarioVariable, scenarioVariable));
			}
		}
		return scenarioVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFScenarioVariable basicGetScenarioVariable() {
		return scenarioVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioVariable(TMTCIFScenarioVariable newScenarioVariable) {
		TMTCIFScenarioVariable oldScenarioVariable = scenarioVariable;
		scenarioVariable = newScenarioVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__SCENARIO_VARIABLE, oldScenarioVariable, scenarioVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__NAME:
				return getName();
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__ACTION_OVER_VARIABLE:
				if (resolve) return getActionOverVariable();
				return basicGetActionOverVariable();
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__SCENARIO_VARIABLE:
				if (resolve) return getScenarioVariable();
				return basicGetScenarioVariable();
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
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__ACTION_OVER_VARIABLE:
				setActionOverVariable((VTestSetupActionOverVariable)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__SCENARIO_VARIABLE:
				setScenarioVariable((TMTCIFScenarioVariable)newValue);
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
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__ACTION_OVER_VARIABLE:
				setActionOverVariable((VTestSetupActionOverVariable)null);
				return;
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__SCENARIO_VARIABLE:
				setScenarioVariable((TMTCIFScenarioVariable)null);
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
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__ACTION_OVER_VARIABLE:
				return actionOverVariable != null;
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__SCENARIO_VARIABLE:
				return scenarioVariable != null;
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

} //VTestSetupSupportedActionOverVariableImpl
