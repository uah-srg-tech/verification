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
package es.uah.aut.srg.micobs.svm.testsetup.impl;

import es.uah.aut.srg.micobs.svm.testsetup.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class testsetupFactoryImpl extends EFactoryImpl implements testsetupFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static testsetupFactory init() {
		try {
			testsetupFactory thetestsetupFactory = (testsetupFactory)EPackage.Registry.INSTANCE.getEFactory(testsetupPackage.eNS_URI);
			if (thetestsetupFactory != null) {
				return thetestsetupFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new testsetupFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testsetupFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case testsetupPackage.VTEST_SETUP_TEST_SETUP: return createVTestSetupTestSetup();
			case testsetupPackage.VTEST_SETUP_INTERFACES_SECTION: return createVTestSetupInterfacesSection();
			case testsetupPackage.VTEST_SETUP_INTERFACE: return createVTestSetupInterface();
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION: return createVTestSetupPacketConfigurationsSection();
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATION: return createVTestSetupPacketConfiguration();
			case testsetupPackage.VTEST_SETUP_ACTIONS_SECTION: return createVTestSetupActionsSection();
			case testsetupPackage.VTEST_SETUP_ACTION: return createVTestSetupAction();
			case testsetupPackage.VTEST_SETUP_SCENARIOS_SECTION: return createVTestSetupScenariosSection();
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION: return createVTestSetupScenarioSection();
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION: return createVTestSetupSelectedConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case testsetupPackage.VTEST_SETUP_ACTION_TYPE:
				return createVTestSetupActionTypeFromString(eDataType, initialValue);
			case testsetupPackage.VTEST_SETUP_CONFIGURATION_STATUS:
				return createVTestSetupConfigurationStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case testsetupPackage.VTEST_SETUP_ACTION_TYPE:
				return convertVTestSetupActionTypeToString(eDataType, instanceValue);
			case testsetupPackage.VTEST_SETUP_CONFIGURATION_STATUS:
				return convertVTestSetupConfigurationStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupTestSetup createVTestSetupTestSetup() {
		VTestSetupTestSetupImpl vTestSetupTestSetup = new VTestSetupTestSetupImpl();
		return vTestSetupTestSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupInterfacesSection createVTestSetupInterfacesSection() {
		VTestSetupInterfacesSectionImpl vTestSetupInterfacesSection = new VTestSetupInterfacesSectionImpl();
		return vTestSetupInterfacesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupInterface createVTestSetupInterface() {
		VTestSetupInterfaceImpl vTestSetupInterface = new VTestSetupInterfaceImpl();
		return vTestSetupInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupPacketConfigurationsSection createVTestSetupPacketConfigurationsSection() {
		VTestSetupPacketConfigurationsSectionImpl vTestSetupPacketConfigurationsSection = new VTestSetupPacketConfigurationsSectionImpl();
		return vTestSetupPacketConfigurationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupPacketConfiguration createVTestSetupPacketConfiguration() {
		VTestSetupPacketConfigurationImpl vTestSetupPacketConfiguration = new VTestSetupPacketConfigurationImpl();
		return vTestSetupPacketConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupActionsSection createVTestSetupActionsSection() {
		VTestSetupActionsSectionImpl vTestSetupActionsSection = new VTestSetupActionsSectionImpl();
		return vTestSetupActionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupAction createVTestSetupAction() {
		VTestSetupActionImpl vTestSetupAction = new VTestSetupActionImpl();
		return vTestSetupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupScenariosSection createVTestSetupScenariosSection() {
		VTestSetupScenariosSectionImpl vTestSetupScenariosSection = new VTestSetupScenariosSectionImpl();
		return vTestSetupScenariosSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupScenarioSection createVTestSetupScenarioSection() {
		VTestSetupScenarioSectionImpl vTestSetupScenarioSection = new VTestSetupScenarioSectionImpl();
		return vTestSetupScenarioSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupSelectedConfiguration createVTestSetupSelectedConfiguration() {
		VTestSetupSelectedConfigurationImpl vTestSetupSelectedConfiguration = new VTestSetupSelectedConfigurationImpl();
		return vTestSetupSelectedConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupActionType createVTestSetupActionTypeFromString(EDataType eDataType, String initialValue) {
		VTestSetupActionType result = VTestSetupActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVTestSetupActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupConfigurationStatus createVTestSetupConfigurationStatusFromString(EDataType eDataType, String initialValue) {
		VTestSetupConfigurationStatus result = VTestSetupConfigurationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVTestSetupConfigurationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testsetupPackage gettestsetupPackage() {
		return (testsetupPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static testsetupPackage getPackage() {
		return testsetupPackage.eINSTANCE;
	}

} //testsetupFactoryImpl
