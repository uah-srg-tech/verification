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

import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupFactory
 * @model kind="package"
 * @generated
 */
public interface testsetupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testsetup";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/testsetup";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "micobs.svm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	testsetupPackage eINSTANCE = es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupTestSetupImpl <em>VTest Setup Test Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupTestSetupImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupTestSetup()
	 * @generated
	 */
	int VTEST_SETUP_TEST_SETUP = 0;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TEST_SETUP__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TEST_SETUP__INTERFACES = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TEST_SETUP__CONFIGURATIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TEST_SETUP__ACTIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TEST_SETUP__SCENARIOS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VTest Setup Test Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TEST_SETUP_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VTest Setup Test Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TEST_SETUP_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfacesSectionImpl <em>VTest Setup Interfaces Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfacesSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupInterfacesSection()
	 * @generated
	 */
	int VTEST_SETUP_INTERFACES_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACES_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACES_SECTION__INTERFACES = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTest Setup Interfaces Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACES_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTest Setup Interfaces Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACES_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl <em>VTest Setup Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupInterface()
	 * @generated
	 */
	int VTEST_SETUP_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE__ID = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Tc Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE__TC_HEADER = 3;

	/**
	 * The feature id for the '<em><b>Tm Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE__TM_HEADER = 4;

	/**
	 * The number of structural features of the '<em>VTest Setup Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>VTest Setup Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationsSectionImpl <em>VTest Setup Packet Configurations Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationsSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupPacketConfigurationsSection()
	 * @generated
	 */
	int VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION = 3;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Packet Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__PACKET_CONFIGURATIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTest Setup Packet Configurations Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTest Setup Packet Configurations Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationImpl <em>VTest Setup Packet Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupPacketConfiguration()
	 * @generated
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>VTest Setup Packet Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTest Setup Packet Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsSectionImpl <em>VTest Setup Actions Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionsSection()
	 * @generated
	 */
	int VTEST_SETUP_ACTIONS_SECTION = 5;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_SECTION__ACTION = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTest Setup Actions Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTest Setup Actions Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionImpl <em>VTest Setup Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupAction()
	 * @generated
	 */
	int VTEST_SETUP_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>VTest Setup Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTest Setup Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenariosSectionImpl <em>VTest Setup Scenarios Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenariosSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupScenariosSection()
	 * @generated
	 */
	int VTEST_SETUP_SCENARIOS_SECTION = 7;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIOS_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIOS_SECTION__SCENARIOS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTest Setup Scenarios Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIOS_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTest Setup Scenarios Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIOS_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl <em>VTest Setup Scenario Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupScenarioSection()
	 * @generated
	 */
	int VTEST_SETUP_SCENARIO_SECTION = 8;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__SUBSECTIONS = doctplPackage.DINSTANTIABLE_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__NAME = doctplPackage.DINSTANTIABLE_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__DESCRIPTION = doctplPackage.DINSTANTIABLE_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Supported Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_INTERFACE = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__SELECTED_CONFIGURATION = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supported Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__BODY = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VTest Setup Scenario Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION_FEATURE_COUNT = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VTest Setup Scenario Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION_OPERATION_COUNT = doctplPackage.DINSTANTIABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSelectedConfigurationImpl <em>VTest Setup Selected Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSelectedConfigurationImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupSelectedConfiguration()
	 * @generated
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Default Filter Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Default Print Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS = 2;

	/**
	 * The number of structural features of the '<em>VTest Setup Selected Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTest Setup Selected Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType <em>VTest Setup Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionType()
	 * @generated
	 */
	int VTEST_SETUP_ACTION_TYPE = 10;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus <em>VTest Setup Configuration Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupConfigurationStatus()
	 * @generated
	 */
	int VTEST_SETUP_CONFIGURATION_STATUS = 11;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTestSetup <em>VTest Setup Test Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Test Setup</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTestSetup
	 * @generated
	 */
	EClass getVTestSetupTestSetup();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTestSetup#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTestSetup#getInterfaces()
	 * @see #getVTestSetupTestSetup()
	 * @generated
	 */
	EReference getVTestSetupTestSetup_Interfaces();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTestSetup#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configurations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTestSetup#getConfigurations()
	 * @see #getVTestSetupTestSetup()
	 * @generated
	 */
	EReference getVTestSetupTestSetup_Configurations();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTestSetup#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actions</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTestSetup#getActions()
	 * @see #getVTestSetupTestSetup()
	 * @generated
	 */
	EReference getVTestSetupTestSetup_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTestSetup#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenarios</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTestSetup#getScenarios()
	 * @see #getVTestSetupTestSetup()
	 * @generated
	 */
	EReference getVTestSetupTestSetup_Scenarios();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection <em>VTest Setup Interfaces Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Interfaces Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection
	 * @generated
	 */
	EClass getVTestSetupInterfacesSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection#getInterfaces()
	 * @see #getVTestSetupInterfacesSection()
	 * @generated
	 */
	EReference getVTestSetupInterfacesSection_Interfaces();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface <em>VTest Setup Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Interface</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface
	 * @generated
	 */
	EClass getVTestSetupInterface();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getName()
	 * @see #getVTestSetupInterface()
	 * @generated
	 */
	EAttribute getVTestSetupInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getId()
	 * @see #getVTestSetupInterface()
	 * @generated
	 */
	EAttribute getVTestSetupInterface_Id();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getDescription()
	 * @see #getVTestSetupInterface()
	 * @generated
	 */
	EReference getVTestSetupInterface_Description();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTcHeader <em>Tc Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tc Header</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTcHeader()
	 * @see #getVTestSetupInterface()
	 * @generated
	 */
	EReference getVTestSetupInterface_TcHeader();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTmHeader <em>Tm Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Header</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTmHeader()
	 * @see #getVTestSetupInterface()
	 * @generated
	 */
	EReference getVTestSetupInterface_TmHeader();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection <em>VTest Setup Packet Configurations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Packet Configurations Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection
	 * @generated
	 */
	EClass getVTestSetupPacketConfigurationsSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection#getPacketConfigurations <em>Packet Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packet Configurations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection#getPacketConfigurations()
	 * @see #getVTestSetupPacketConfigurationsSection()
	 * @generated
	 */
	EReference getVTestSetupPacketConfigurationsSection_PacketConfigurations();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration <em>VTest Setup Packet Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Packet Configuration</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration
	 * @generated
	 */
	EClass getVTestSetupPacketConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getName()
	 * @see #getVTestSetupPacketConfiguration()
	 * @generated
	 */
	EAttribute getVTestSetupPacketConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getId()
	 * @see #getVTestSetupPacketConfiguration()
	 * @generated
	 */
	EAttribute getVTestSetupPacketConfiguration_Id();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getDescription()
	 * @see #getVTestSetupPacketConfiguration()
	 * @generated
	 */
	EReference getVTestSetupPacketConfiguration_Description();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection <em>VTest Setup Actions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Actions Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection
	 * @generated
	 */
	EClass getVTestSetupActionsSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection#getAction()
	 * @see #getVTestSetupActionsSection()
	 * @generated
	 */
	EReference getVTestSetupActionsSection_Action();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction <em>VTest Setup Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Action</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction
	 * @generated
	 */
	EClass getVTestSetupAction();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getName()
	 * @see #getVTestSetupAction()
	 * @generated
	 */
	EAttribute getVTestSetupAction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getDescription()
	 * @see #getVTestSetupAction()
	 * @generated
	 */
	EReference getVTestSetupAction_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getType()
	 * @see #getVTestSetupAction()
	 * @generated
	 */
	EAttribute getVTestSetupAction_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection <em>VTest Setup Scenarios Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Scenarios Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection
	 * @generated
	 */
	EClass getVTestSetupScenariosSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection#getScenarios()
	 * @see #getVTestSetupScenariosSection()
	 * @generated
	 */
	EReference getVTestSetupScenariosSection_Scenarios();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection <em>VTest Setup Scenario Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Scenario Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection
	 * @generated
	 */
	EClass getVTestSetupScenarioSection();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSupportedInterface <em>Supported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Interface</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSupportedInterface()
	 * @see #getVTestSetupScenarioSection()
	 * @generated
	 */
	EReference getVTestSetupScenarioSection_SupportedInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSelectedConfiguration <em>Selected Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selected Configuration</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSelectedConfiguration()
	 * @see #getVTestSetupScenarioSection()
	 * @generated
	 */
	EReference getVTestSetupScenarioSection_SelectedConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSupportedAction <em>Supported Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Action</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSupportedAction()
	 * @see #getVTestSetupScenarioSection()
	 * @generated
	 */
	EReference getVTestSetupScenarioSection_SupportedAction();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getBody()
	 * @see #getVTestSetupScenarioSection()
	 * @generated
	 */
	EReference getVTestSetupScenarioSection_Body();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration <em>VTest Setup Selected Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Selected Configuration</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration
	 * @generated
	 */
	EClass getVTestSetupSelectedConfiguration();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getConfiguration()
	 * @see #getVTestSetupSelectedConfiguration()
	 * @generated
	 */
	EReference getVTestSetupSelectedConfiguration_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultFilterStatus <em>Default Filter Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Filter Status</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultFilterStatus()
	 * @see #getVTestSetupSelectedConfiguration()
	 * @generated
	 */
	EAttribute getVTestSetupSelectedConfiguration_DefaultFilterStatus();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultPrintStatus <em>Default Print Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Print Status</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultPrintStatus()
	 * @see #getVTestSetupSelectedConfiguration()
	 * @generated
	 */
	EAttribute getVTestSetupSelectedConfiguration_DefaultPrintStatus();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType <em>VTest Setup Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VTest Setup Action Type</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType
	 * @generated
	 */
	EEnum getVTestSetupActionType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus <em>VTest Setup Configuration Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VTest Setup Configuration Status</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @generated
	 */
	EEnum getVTestSetupConfigurationStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	testsetupFactory gettestsetupFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupTestSetupImpl <em>VTest Setup Test Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupTestSetupImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupTestSetup()
		 * @generated
		 */
		EClass VTEST_SETUP_TEST_SETUP = eINSTANCE.getVTestSetupTestSetup();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_TEST_SETUP__INTERFACES = eINSTANCE.getVTestSetupTestSetup_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_TEST_SETUP__CONFIGURATIONS = eINSTANCE.getVTestSetupTestSetup_Configurations();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_TEST_SETUP__ACTIONS = eINSTANCE.getVTestSetupTestSetup_Actions();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_TEST_SETUP__SCENARIOS = eINSTANCE.getVTestSetupTestSetup_Scenarios();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfacesSectionImpl <em>VTest Setup Interfaces Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfacesSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupInterfacesSection()
		 * @generated
		 */
		EClass VTEST_SETUP_INTERFACES_SECTION = eINSTANCE.getVTestSetupInterfacesSection();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_INTERFACES_SECTION__INTERFACES = eINSTANCE.getVTestSetupInterfacesSection_Interfaces();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl <em>VTest Setup Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupInterface()
		 * @generated
		 */
		EClass VTEST_SETUP_INTERFACE = eINSTANCE.getVTestSetupInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_INTERFACE__NAME = eINSTANCE.getVTestSetupInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_INTERFACE__ID = eINSTANCE.getVTestSetupInterface_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_INTERFACE__DESCRIPTION = eINSTANCE.getVTestSetupInterface_Description();

		/**
		 * The meta object literal for the '<em><b>Tc Header</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_INTERFACE__TC_HEADER = eINSTANCE.getVTestSetupInterface_TcHeader();

		/**
		 * The meta object literal for the '<em><b>Tm Header</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_INTERFACE__TM_HEADER = eINSTANCE.getVTestSetupInterface_TmHeader();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationsSectionImpl <em>VTest Setup Packet Configurations Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationsSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupPacketConfigurationsSection()
		 * @generated
		 */
		EClass VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION = eINSTANCE.getVTestSetupPacketConfigurationsSection();

		/**
		 * The meta object literal for the '<em><b>Packet Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__PACKET_CONFIGURATIONS = eINSTANCE.getVTestSetupPacketConfigurationsSection_PacketConfigurations();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationImpl <em>VTest Setup Packet Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupPacketConfiguration()
		 * @generated
		 */
		EClass VTEST_SETUP_PACKET_CONFIGURATION = eINSTANCE.getVTestSetupPacketConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_PACKET_CONFIGURATION__NAME = eINSTANCE.getVTestSetupPacketConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_PACKET_CONFIGURATION__ID = eINSTANCE.getVTestSetupPacketConfiguration_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_PACKET_CONFIGURATION__DESCRIPTION = eINSTANCE.getVTestSetupPacketConfiguration_Description();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsSectionImpl <em>VTest Setup Actions Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionsSection()
		 * @generated
		 */
		EClass VTEST_SETUP_ACTIONS_SECTION = eINSTANCE.getVTestSetupActionsSection();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_ACTIONS_SECTION__ACTION = eINSTANCE.getVTestSetupActionsSection_Action();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionImpl <em>VTest Setup Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupAction()
		 * @generated
		 */
		EClass VTEST_SETUP_ACTION = eINSTANCE.getVTestSetupAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_ACTION__NAME = eINSTANCE.getVTestSetupAction_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_ACTION__DESCRIPTION = eINSTANCE.getVTestSetupAction_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_ACTION__TYPE = eINSTANCE.getVTestSetupAction_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenariosSectionImpl <em>VTest Setup Scenarios Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenariosSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupScenariosSection()
		 * @generated
		 */
		EClass VTEST_SETUP_SCENARIOS_SECTION = eINSTANCE.getVTestSetupScenariosSection();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIOS_SECTION__SCENARIOS = eINSTANCE.getVTestSetupScenariosSection_Scenarios();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl <em>VTest Setup Scenario Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupScenarioSection()
		 * @generated
		 */
		EClass VTEST_SETUP_SCENARIO_SECTION = eINSTANCE.getVTestSetupScenarioSection();

		/**
		 * The meta object literal for the '<em><b>Supported Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_INTERFACE = eINSTANCE.getVTestSetupScenarioSection_SupportedInterface();

		/**
		 * The meta object literal for the '<em><b>Selected Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIO_SECTION__SELECTED_CONFIGURATION = eINSTANCE.getVTestSetupScenarioSection_SelectedConfiguration();

		/**
		 * The meta object literal for the '<em><b>Supported Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION = eINSTANCE.getVTestSetupScenarioSection_SupportedAction();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIO_SECTION__BODY = eINSTANCE.getVTestSetupScenarioSection_Body();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSelectedConfigurationImpl <em>VTest Setup Selected Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSelectedConfigurationImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupSelectedConfiguration()
		 * @generated
		 */
		EClass VTEST_SETUP_SELECTED_CONFIGURATION = eINSTANCE.getVTestSetupSelectedConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION = eINSTANCE.getVTestSetupSelectedConfiguration_Configuration();

		/**
		 * The meta object literal for the '<em><b>Default Filter Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS = eINSTANCE.getVTestSetupSelectedConfiguration_DefaultFilterStatus();

		/**
		 * The meta object literal for the '<em><b>Default Print Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS = eINSTANCE.getVTestSetupSelectedConfiguration_DefaultPrintStatus();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType <em>VTest Setup Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionType()
		 * @generated
		 */
		EEnum VTEST_SETUP_ACTION_TYPE = eINSTANCE.getVTestSetupActionType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus <em>VTest Setup Configuration Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupConfigurationStatus()
		 * @generated
		 */
		EEnum VTEST_SETUP_CONFIGURATION_STATUS = eINSTANCE.getVTestSetupConfigurationStatus();

	}

} //testsetupPackage