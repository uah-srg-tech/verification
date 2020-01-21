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

import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTestSetup;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupFactory;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;

import es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage;

import es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class testsetupPackageImpl extends EPackageImpl implements testsetupPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTestSetupTestSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTestSetupInterfacesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTestSetupInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTestSetupPacketConfigurationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTestSetupPacketConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTestSetupActionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTestSetupActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTestSetupScenariosSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTestSetupScenarioSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTestSetupSelectedConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vTestSetupActionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vTestSetupConfigurationStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private testsetupPackageImpl() {
		super(eNS_URI, testsetupFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link testsetupPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static testsetupPackage init() {
		if (isInited) return (testsetupPackage)EPackage.Registry.INSTANCE.getEPackage(testsetupPackage.eNS_URI);

		// Obtain or create and register package
		testsetupPackageImpl thetestsetupPackage = (testsetupPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof testsetupPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new testsetupPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		doctplPackage.eINSTANCE.eClass();
		tcheaderPackage.eINSTANCE.eClass();
		tmheaderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetestsetupPackage.createPackageContents();

		// Initialize created meta-data
		thetestsetupPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetestsetupPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(testsetupPackage.eNS_URI, thetestsetupPackage);
		return thetestsetupPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTestSetupTestSetup() {
		return vTestSetupTestSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupTestSetup_Interfaces() {
		return (EReference)vTestSetupTestSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupTestSetup_Configurations() {
		return (EReference)vTestSetupTestSetupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupTestSetup_Actions() {
		return (EReference)vTestSetupTestSetupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupTestSetup_Scenarios() {
		return (EReference)vTestSetupTestSetupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTestSetupInterfacesSection() {
		return vTestSetupInterfacesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupInterfacesSection_Interfaces() {
		return (EReference)vTestSetupInterfacesSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTestSetupInterface() {
		return vTestSetupInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTestSetupInterface_Name() {
		return (EAttribute)vTestSetupInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTestSetupInterface_Id() {
		return (EAttribute)vTestSetupInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupInterface_Description() {
		return (EReference)vTestSetupInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupInterface_TcHeader() {
		return (EReference)vTestSetupInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupInterface_TmHeader() {
		return (EReference)vTestSetupInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTestSetupPacketConfigurationsSection() {
		return vTestSetupPacketConfigurationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupPacketConfigurationsSection_PacketConfigurations() {
		return (EReference)vTestSetupPacketConfigurationsSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTestSetupPacketConfiguration() {
		return vTestSetupPacketConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTestSetupPacketConfiguration_Name() {
		return (EAttribute)vTestSetupPacketConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTestSetupPacketConfiguration_Id() {
		return (EAttribute)vTestSetupPacketConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupPacketConfiguration_Description() {
		return (EReference)vTestSetupPacketConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTestSetupActionsSection() {
		return vTestSetupActionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupActionsSection_Action() {
		return (EReference)vTestSetupActionsSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTestSetupAction() {
		return vTestSetupActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTestSetupAction_Name() {
		return (EAttribute)vTestSetupActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupAction_Description() {
		return (EReference)vTestSetupActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTestSetupAction_Type() {
		return (EAttribute)vTestSetupActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTestSetupScenariosSection() {
		return vTestSetupScenariosSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupScenariosSection_Scenarios() {
		return (EReference)vTestSetupScenariosSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTestSetupScenarioSection() {
		return vTestSetupScenarioSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupScenarioSection_SupportedInterface() {
		return (EReference)vTestSetupScenarioSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupScenarioSection_SelectedConfiguration() {
		return (EReference)vTestSetupScenarioSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupScenarioSection_SupportedAction() {
		return (EReference)vTestSetupScenarioSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupScenarioSection_Body() {
		return (EReference)vTestSetupScenarioSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTestSetupSelectedConfiguration() {
		return vTestSetupSelectedConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTestSetupSelectedConfiguration_Configuration() {
		return (EReference)vTestSetupSelectedConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTestSetupSelectedConfiguration_DefaultFilterStatus() {
		return (EAttribute)vTestSetupSelectedConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTestSetupSelectedConfiguration_DefaultPrintStatus() {
		return (EAttribute)vTestSetupSelectedConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVTestSetupActionType() {
		return vTestSetupActionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVTestSetupConfigurationStatus() {
		return vTestSetupConfigurationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testsetupFactory gettestsetupFactory() {
		return (testsetupFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vTestSetupTestSetupEClass = createEClass(VTEST_SETUP_TEST_SETUP);
		createEReference(vTestSetupTestSetupEClass, VTEST_SETUP_TEST_SETUP__INTERFACES);
		createEReference(vTestSetupTestSetupEClass, VTEST_SETUP_TEST_SETUP__CONFIGURATIONS);
		createEReference(vTestSetupTestSetupEClass, VTEST_SETUP_TEST_SETUP__ACTIONS);
		createEReference(vTestSetupTestSetupEClass, VTEST_SETUP_TEST_SETUP__SCENARIOS);

		vTestSetupInterfacesSectionEClass = createEClass(VTEST_SETUP_INTERFACES_SECTION);
		createEReference(vTestSetupInterfacesSectionEClass, VTEST_SETUP_INTERFACES_SECTION__INTERFACES);

		vTestSetupInterfaceEClass = createEClass(VTEST_SETUP_INTERFACE);
		createEAttribute(vTestSetupInterfaceEClass, VTEST_SETUP_INTERFACE__NAME);
		createEAttribute(vTestSetupInterfaceEClass, VTEST_SETUP_INTERFACE__ID);
		createEReference(vTestSetupInterfaceEClass, VTEST_SETUP_INTERFACE__DESCRIPTION);
		createEReference(vTestSetupInterfaceEClass, VTEST_SETUP_INTERFACE__TC_HEADER);
		createEReference(vTestSetupInterfaceEClass, VTEST_SETUP_INTERFACE__TM_HEADER);

		vTestSetupPacketConfigurationsSectionEClass = createEClass(VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION);
		createEReference(vTestSetupPacketConfigurationsSectionEClass, VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__PACKET_CONFIGURATIONS);

		vTestSetupPacketConfigurationEClass = createEClass(VTEST_SETUP_PACKET_CONFIGURATION);
		createEAttribute(vTestSetupPacketConfigurationEClass, VTEST_SETUP_PACKET_CONFIGURATION__NAME);
		createEAttribute(vTestSetupPacketConfigurationEClass, VTEST_SETUP_PACKET_CONFIGURATION__ID);
		createEReference(vTestSetupPacketConfigurationEClass, VTEST_SETUP_PACKET_CONFIGURATION__DESCRIPTION);

		vTestSetupActionsSectionEClass = createEClass(VTEST_SETUP_ACTIONS_SECTION);
		createEReference(vTestSetupActionsSectionEClass, VTEST_SETUP_ACTIONS_SECTION__ACTION);

		vTestSetupActionEClass = createEClass(VTEST_SETUP_ACTION);
		createEAttribute(vTestSetupActionEClass, VTEST_SETUP_ACTION__NAME);
		createEReference(vTestSetupActionEClass, VTEST_SETUP_ACTION__DESCRIPTION);
		createEAttribute(vTestSetupActionEClass, VTEST_SETUP_ACTION__TYPE);

		vTestSetupScenariosSectionEClass = createEClass(VTEST_SETUP_SCENARIOS_SECTION);
		createEReference(vTestSetupScenariosSectionEClass, VTEST_SETUP_SCENARIOS_SECTION__SCENARIOS);

		vTestSetupScenarioSectionEClass = createEClass(VTEST_SETUP_SCENARIO_SECTION);
		createEReference(vTestSetupScenarioSectionEClass, VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_INTERFACE);
		createEReference(vTestSetupScenarioSectionEClass, VTEST_SETUP_SCENARIO_SECTION__SELECTED_CONFIGURATION);
		createEReference(vTestSetupScenarioSectionEClass, VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION);
		createEReference(vTestSetupScenarioSectionEClass, VTEST_SETUP_SCENARIO_SECTION__BODY);

		vTestSetupSelectedConfigurationEClass = createEClass(VTEST_SETUP_SELECTED_CONFIGURATION);
		createEReference(vTestSetupSelectedConfigurationEClass, VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION);
		createEAttribute(vTestSetupSelectedConfigurationEClass, VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS);
		createEAttribute(vTestSetupSelectedConfigurationEClass, VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS);

		// Create enums
		vTestSetupActionTypeEEnum = createEEnum(VTEST_SETUP_ACTION_TYPE);
		vTestSetupConfigurationStatusEEnum = createEEnum(VTEST_SETUP_CONFIGURATION_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		doctplPackage thedoctplPackage = (doctplPackage)EPackage.Registry.INSTANCE.getEPackage(doctplPackage.eNS_URI);
		tcheaderPackage thetcheaderPackage = (tcheaderPackage)EPackage.Registry.INSTANCE.getEPackage(tcheaderPackage.eNS_URI);
		tmheaderPackage thetmheaderPackage = (tmheaderPackage)EPackage.Registry.INSTANCE.getEPackage(tmheaderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vTestSetupTestSetupEClass.getESuperTypes().add(thedoctplPackage.getDFixedSection());
		vTestSetupInterfacesSectionEClass.getESuperTypes().add(thedoctplPackage.getDFixedSection());
		vTestSetupPacketConfigurationsSectionEClass.getESuperTypes().add(thedoctplPackage.getDFixedSection());
		vTestSetupActionsSectionEClass.getESuperTypes().add(thedoctplPackage.getDFixedSection());
		vTestSetupScenariosSectionEClass.getESuperTypes().add(thedoctplPackage.getDFixedSection());
		vTestSetupScenarioSectionEClass.getESuperTypes().add(thedoctplPackage.getDInstantiableSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(vTestSetupTestSetupEClass, VTestSetupTestSetup.class, "VTestSetupTestSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVTestSetupTestSetup_Interfaces(), this.getVTestSetupInterfacesSection(), null, "interfaces", null, 1, 1, VTestSetupTestSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTestSetupTestSetup_Configurations(), this.getVTestSetupPacketConfigurationsSection(), null, "configurations", null, 0, 1, VTestSetupTestSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTestSetupTestSetup_Actions(), this.getVTestSetupActionsSection(), null, "actions", null, 0, 1, VTestSetupTestSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTestSetupTestSetup_Scenarios(), this.getVTestSetupScenariosSection(), null, "scenarios", null, 1, 1, VTestSetupTestSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTestSetupInterfacesSectionEClass, VTestSetupInterfacesSection.class, "VTestSetupInterfacesSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVTestSetupInterfacesSection_Interfaces(), this.getVTestSetupInterface(), null, "interfaces", null, 1, -1, VTestSetupInterfacesSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTestSetupInterfaceEClass, VTestSetupInterface.class, "VTestSetupInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTestSetupInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, VTestSetupInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVTestSetupInterface_Id(), ecorePackage.getEString(), "id", null, 1, 1, VTestSetupInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTestSetupInterface_Description(), thedoctplPackage.getDRun(), null, "description", null, 1, 1, VTestSetupInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTestSetupInterface_TcHeader(), thetcheaderPackage.getTMTCIFTCHeader(), null, "tcHeader", null, 1, 1, VTestSetupInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTestSetupInterface_TmHeader(), thetmheaderPackage.getTMTCIFTMHeader(), null, "tmHeader", null, 1, 1, VTestSetupInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTestSetupPacketConfigurationsSectionEClass, VTestSetupPacketConfigurationsSection.class, "VTestSetupPacketConfigurationsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVTestSetupPacketConfigurationsSection_PacketConfigurations(), this.getVTestSetupPacketConfiguration(), null, "packetConfigurations", null, 1, -1, VTestSetupPacketConfigurationsSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTestSetupPacketConfigurationEClass, VTestSetupPacketConfiguration.class, "VTestSetupPacketConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTestSetupPacketConfiguration_Name(), ecorePackage.getEString(), "name", null, 1, 1, VTestSetupPacketConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVTestSetupPacketConfiguration_Id(), ecorePackage.getEString(), "id", null, 1, 1, VTestSetupPacketConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTestSetupPacketConfiguration_Description(), thedoctplPackage.getDRun(), null, "description", null, 1, 1, VTestSetupPacketConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTestSetupActionsSectionEClass, VTestSetupActionsSection.class, "VTestSetupActionsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVTestSetupActionsSection_Action(), this.getVTestSetupAction(), null, "action", null, 1, -1, VTestSetupActionsSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTestSetupActionEClass, VTestSetupAction.class, "VTestSetupAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTestSetupAction_Name(), ecorePackage.getEString(), "name", null, 1, 1, VTestSetupAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTestSetupAction_Description(), thedoctplPackage.getDBody(), null, "description", null, 1, 1, VTestSetupAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVTestSetupAction_Type(), this.getVTestSetupActionType(), "type", null, 1, 1, VTestSetupAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTestSetupScenariosSectionEClass, VTestSetupScenariosSection.class, "VTestSetupScenariosSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVTestSetupScenariosSection_Scenarios(), this.getVTestSetupScenarioSection(), null, "scenarios", null, 1, -1, VTestSetupScenariosSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTestSetupScenarioSectionEClass, VTestSetupScenarioSection.class, "VTestSetupScenarioSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVTestSetupScenarioSection_SupportedInterface(), this.getVTestSetupInterface(), null, "supportedInterface", null, 1, -1, VTestSetupScenarioSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTestSetupScenarioSection_SelectedConfiguration(), this.getVTestSetupSelectedConfiguration(), null, "selectedConfiguration", null, 0, -1, VTestSetupScenarioSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTestSetupScenarioSection_SupportedAction(), this.getVTestSetupAction(), null, "supportedAction", null, 0, -1, VTestSetupScenarioSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTestSetupScenarioSection_Body(), thedoctplPackage.getDBody(), null, "body", null, 0, 1, VTestSetupScenarioSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTestSetupSelectedConfigurationEClass, VTestSetupSelectedConfiguration.class, "VTestSetupSelectedConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVTestSetupSelectedConfiguration_Configuration(), this.getVTestSetupPacketConfiguration(), null, "configuration", null, 1, 1, VTestSetupSelectedConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVTestSetupSelectedConfiguration_DefaultFilterStatus(), this.getVTestSetupConfigurationStatus(), "defaultFilterStatus", null, 1, 1, VTestSetupSelectedConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVTestSetupSelectedConfiguration_DefaultPrintStatus(), this.getVTestSetupConfigurationStatus(), "defaultPrintStatus", null, 1, 1, VTestSetupSelectedConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(vTestSetupActionTypeEEnum, VTestSetupActionType.class, "VTestSetupActionType");
		addEEnumLiteral(vTestSetupActionTypeEEnum, VTestSetupActionType.INSTRUCTION);
		addEEnumLiteral(vTestSetupActionTypeEEnum, VTestSetupActionType.CHECKING);

		initEEnum(vTestSetupConfigurationStatusEEnum, VTestSetupConfigurationStatus.class, "VTestSetupConfigurationStatus");
		addEEnumLiteral(vTestSetupConfigurationStatusEEnum, VTestSetupConfigurationStatus.NOT_SET);
		addEEnumLiteral(vTestSetupConfigurationStatusEEnum, VTestSetupConfigurationStatus.OFF);
		addEEnumLiteral(vTestSetupConfigurationStatusEEnum, VTestSetupConfigurationStatus.ON);

		// Create resource
		createResource(eNS_URI);
	}

} //testsetupPackageImpl