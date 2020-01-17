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
package es.uah.aut.srg.micobs.svm.testsetup.util;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;

import es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection;
import es.uah.aut.srg.micobs.svm.testsetup.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage
 * @generated
 */
public class testsetupSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static testsetupPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testsetupSwitch() {
		if (modelPackage == null) {
			modelPackage = testsetupPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case testsetupPackage.VTEST_SETUP_TEST_SETUP: {
				VTestSetupTestSetup vTestSetupTestSetup = (VTestSetupTestSetup)theEObject;
				T result = caseVTestSetupTestSetup(vTestSetupTestSetup);
				if (result == null) result = caseDFixedSection(vTestSetupTestSetup);
				if (result == null) result = caseDAbstractSection(vTestSetupTestSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case testsetupPackage.VTEST_SETUP_INTERFACES_SECTION: {
				VTestSetupInterfacesSection vTestSetupInterfacesSection = (VTestSetupInterfacesSection)theEObject;
				T result = caseVTestSetupInterfacesSection(vTestSetupInterfacesSection);
				if (result == null) result = caseDFixedSection(vTestSetupInterfacesSection);
				if (result == null) result = caseDAbstractSection(vTestSetupInterfacesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case testsetupPackage.VTEST_SETUP_INTERFACE: {
				VTestSetupInterface vTestSetupInterface = (VTestSetupInterface)theEObject;
				T result = caseVTestSetupInterface(vTestSetupInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION: {
				VTestSetupPacketConfigurationsSection vTestSetupPacketConfigurationsSection = (VTestSetupPacketConfigurationsSection)theEObject;
				T result = caseVTestSetupPacketConfigurationsSection(vTestSetupPacketConfigurationsSection);
				if (result == null) result = caseDFixedSection(vTestSetupPacketConfigurationsSection);
				if (result == null) result = caseDAbstractSection(vTestSetupPacketConfigurationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATION: {
				VTestSetupPacketConfiguration vTestSetupPacketConfiguration = (VTestSetupPacketConfiguration)theEObject;
				T result = caseVTestSetupPacketConfiguration(vTestSetupPacketConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case testsetupPackage.VTEST_SETUP_ACTIONS_SECTION: {
				VTestSetupActionsSection vTestSetupActionsSection = (VTestSetupActionsSection)theEObject;
				T result = caseVTestSetupActionsSection(vTestSetupActionsSection);
				if (result == null) result = caseDFixedSection(vTestSetupActionsSection);
				if (result == null) result = caseDAbstractSection(vTestSetupActionsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case testsetupPackage.VTEST_SETUP_ACTION: {
				VTestSetupAction vTestSetupAction = (VTestSetupAction)theEObject;
				T result = caseVTestSetupAction(vTestSetupAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case testsetupPackage.VTEST_SETUP_SCENARIOS_SECTION: {
				VTestSetupScenariosSection vTestSetupScenariosSection = (VTestSetupScenariosSection)theEObject;
				T result = caseVTestSetupScenariosSection(vTestSetupScenariosSection);
				if (result == null) result = caseDFixedSection(vTestSetupScenariosSection);
				if (result == null) result = caseDAbstractSection(vTestSetupScenariosSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION: {
				VTestSetupScenarioSection vTestSetupScenarioSection = (VTestSetupScenarioSection)theEObject;
				T result = caseVTestSetupScenarioSection(vTestSetupScenarioSection);
				if (result == null) result = caseDInstantiableSection(vTestSetupScenarioSection);
				if (result == null) result = caseDAbstractSection(vTestSetupScenarioSection);
				if (result == null) result = caseMCommonReferenceableObj(vTestSetupScenarioSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION: {
				VTestSetupSelectedConfiguration vTestSetupSelectedConfiguration = (VTestSetupSelectedConfiguration)theEObject;
				T result = caseVTestSetupSelectedConfiguration(vTestSetupSelectedConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTest Setup Test Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTest Setup Test Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTestSetupTestSetup(VTestSetupTestSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTest Setup Interfaces Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTest Setup Interfaces Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTestSetupInterfacesSection(VTestSetupInterfacesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTest Setup Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTest Setup Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTestSetupInterface(VTestSetupInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTest Setup Packet Configurations Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTest Setup Packet Configurations Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTestSetupPacketConfigurationsSection(VTestSetupPacketConfigurationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTest Setup Packet Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTest Setup Packet Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTestSetupPacketConfiguration(VTestSetupPacketConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTest Setup Actions Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTest Setup Actions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTestSetupActionsSection(VTestSetupActionsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTest Setup Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTest Setup Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTestSetupAction(VTestSetupAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTest Setup Scenarios Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTest Setup Scenarios Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTestSetupScenariosSection(VTestSetupScenariosSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTest Setup Scenario Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTest Setup Scenario Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTestSetupScenarioSection(VTestSetupScenarioSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTest Setup Selected Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTest Setup Selected Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTestSetupSelectedConfiguration(VTestSetupSelectedConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAbstract Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAbstract Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAbstractSection(DAbstractSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFixed Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFixedSection(DFixedSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonReferenceableObj(MCommonReferenceableObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DInstantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DInstantiable Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDInstantiableSection(DInstantiableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //testsetupSwitch
