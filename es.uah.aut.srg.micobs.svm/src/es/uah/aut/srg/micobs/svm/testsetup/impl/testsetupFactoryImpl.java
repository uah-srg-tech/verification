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
			case testsetupPackage.VTEST_SETUP_DOCUMENT: return createVTestSetupDocument();
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS: return createVTestSetupTBCsTBDs();
			case testsetupPackage.VTEST_SETUP_APPLICABLE_DOCUMENTS: return createVTestSetupApplicableDocuments();
			case testsetupPackage.VTEST_SETUP_REFERENCE_DOCUMENTS: return createVTestSetupReferenceDocuments();
			case testsetupPackage.VTEST_SETUP_INTERFACES_SECTION: return createVTestSetupInterfacesSection();
			case testsetupPackage.VTEST_SETUP_INTERFACE: return createVTestSetupInterface();
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION: return createVTestSetupPacketConfigurationsSection();
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATION: return createVTestSetupPacketConfiguration();
			case testsetupPackage.VTEST_SETUP_ACTIONS_SECTION: return createVTestSetupActionsSection();
			case testsetupPackage.VTEST_SETUP_ACTION: return createVTestSetupAction();
			case testsetupPackage.VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION: return createVTestSetupActionsOverVariablesSection();
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE: return createVTestSetupActionOverVariable();
			case testsetupPackage.VTEST_SETUP_SCENARIOS_SECTION: return createVTestSetupScenariosSection();
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION: return createVTestSetupScenarioSection();
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE: return createVTestSetupSupportedInterface();
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION: return createVTestSetupSelectedConfiguration();
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE: return createVTestSetupSupportedActionOverVariable();
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
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE_TYPE:
				return createVTestSetupActionOverVariableTypeFromString(eDataType, initialValue);
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
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE_TYPE:
				return convertVTestSetupActionOverVariableTypeToString(eDataType, instanceValue);
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
	public VTestSetupDocument createVTestSetupDocument() {
		VTestSetupDocumentImpl vTestSetupDocument = new VTestSetupDocumentImpl();
		return vTestSetupDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupTBCsTBDs createVTestSetupTBCsTBDs() {
		VTestSetupTBCsTBDsImpl vTestSetupTBCsTBDs = new VTestSetupTBCsTBDsImpl();
		return vTestSetupTBCsTBDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupApplicableDocuments createVTestSetupApplicableDocuments() {
		VTestSetupApplicableDocumentsImpl vTestSetupApplicableDocuments = new VTestSetupApplicableDocumentsImpl();
		return vTestSetupApplicableDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupReferenceDocuments createVTestSetupReferenceDocuments() {
		VTestSetupReferenceDocumentsImpl vTestSetupReferenceDocuments = new VTestSetupReferenceDocumentsImpl();
		return vTestSetupReferenceDocuments;
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
	public VTestSetupActionsOverVariablesSection createVTestSetupActionsOverVariablesSection() {
		VTestSetupActionsOverVariablesSectionImpl vTestSetupActionsOverVariablesSection = new VTestSetupActionsOverVariablesSectionImpl();
		return vTestSetupActionsOverVariablesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupActionOverVariable createVTestSetupActionOverVariable() {
		VTestSetupActionOverVariableImpl vTestSetupActionOverVariable = new VTestSetupActionOverVariableImpl();
		return vTestSetupActionOverVariable;
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
	public VTestSetupSupportedInterface createVTestSetupSupportedInterface() {
		VTestSetupSupportedInterfaceImpl vTestSetupSupportedInterface = new VTestSetupSupportedInterfaceImpl();
		return vTestSetupSupportedInterface;
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
	public VTestSetupSupportedActionOverVariable createVTestSetupSupportedActionOverVariable() {
		VTestSetupSupportedActionOverVariableImpl vTestSetupSupportedActionOverVariable = new VTestSetupSupportedActionOverVariableImpl();
		return vTestSetupSupportedActionOverVariable;
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
	public VTestSetupActionOverVariableType createVTestSetupActionOverVariableTypeFromString(EDataType eDataType, String initialValue) {
		VTestSetupActionOverVariableType result = VTestSetupActionOverVariableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVTestSetupActionOverVariableTypeToString(EDataType eDataType, Object instanceValue) {
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
