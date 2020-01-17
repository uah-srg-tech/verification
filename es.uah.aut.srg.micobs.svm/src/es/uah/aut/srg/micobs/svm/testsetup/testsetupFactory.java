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
package es.uah.aut.srg.micobs.svm.testsetup;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage
 * @generated
 */
public interface testsetupFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	testsetupFactory eINSTANCE = es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VTest Setup Test Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTest Setup Test Setup</em>'.
	 * @generated
	 */
	VTestSetupTestSetup createVTestSetupTestSetup();

	/**
	 * Returns a new object of class '<em>VTest Setup Interfaces Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTest Setup Interfaces Section</em>'.
	 * @generated
	 */
	VTestSetupInterfacesSection createVTestSetupInterfacesSection();

	/**
	 * Returns a new object of class '<em>VTest Setup Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTest Setup Interface</em>'.
	 * @generated
	 */
	VTestSetupInterface createVTestSetupInterface();

	/**
	 * Returns a new object of class '<em>VTest Setup Packet Configurations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTest Setup Packet Configurations Section</em>'.
	 * @generated
	 */
	VTestSetupPacketConfigurationsSection createVTestSetupPacketConfigurationsSection();

	/**
	 * Returns a new object of class '<em>VTest Setup Packet Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTest Setup Packet Configuration</em>'.
	 * @generated
	 */
	VTestSetupPacketConfiguration createVTestSetupPacketConfiguration();

	/**
	 * Returns a new object of class '<em>VTest Setup Actions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTest Setup Actions Section</em>'.
	 * @generated
	 */
	VTestSetupActionsSection createVTestSetupActionsSection();

	/**
	 * Returns a new object of class '<em>VTest Setup Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTest Setup Action</em>'.
	 * @generated
	 */
	VTestSetupAction createVTestSetupAction();

	/**
	 * Returns a new object of class '<em>VTest Setup Scenarios Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTest Setup Scenarios Section</em>'.
	 * @generated
	 */
	VTestSetupScenariosSection createVTestSetupScenariosSection();

	/**
	 * Returns a new object of class '<em>VTest Setup Scenario Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTest Setup Scenario Section</em>'.
	 * @generated
	 */
	VTestSetupScenarioSection createVTestSetupScenarioSection();

	/**
	 * Returns a new object of class '<em>VTest Setup Selected Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTest Setup Selected Configuration</em>'.
	 * @generated
	 */
	VTestSetupSelectedConfiguration createVTestSetupSelectedConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	testsetupPackage gettestsetupPackage();

} //testsetupFactory
