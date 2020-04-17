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

import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioPacketConfig;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTest Setup Selected Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultFilterStatus <em>Default Filter Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultPrintStatus <em>Default Print Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getScenarioPacketConfig <em>Scenario Packet Config</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupSelectedConfiguration()
 * @model
 * @generated
 */
public interface VTestSetupSelectedConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupSelectedConfiguration_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(VTestSetupPacketConfiguration)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupSelectedConfiguration_Configuration()
	 * @model required="true"
	 * @generated
	 */
	VTestSetupPacketConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(VTestSetupPacketConfiguration value);

	/**
	 * Returns the value of the '<em><b>Default Filter Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Filter Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Filter Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @see #setDefaultFilterStatus(VTestSetupConfigurationStatus)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupSelectedConfiguration_DefaultFilterStatus()
	 * @model required="true"
	 * @generated
	 */
	VTestSetupConfigurationStatus getDefaultFilterStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultFilterStatus <em>Default Filter Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Filter Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @see #getDefaultFilterStatus()
	 * @generated
	 */
	void setDefaultFilterStatus(VTestSetupConfigurationStatus value);

	/**
	 * Returns the value of the '<em><b>Default Print Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Print Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Print Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @see #setDefaultPrintStatus(VTestSetupConfigurationStatus)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupSelectedConfiguration_DefaultPrintStatus()
	 * @model required="true"
	 * @generated
	 */
	VTestSetupConfigurationStatus getDefaultPrintStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultPrintStatus <em>Default Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Print Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @see #getDefaultPrintStatus()
	 * @generated
	 */
	void setDefaultPrintStatus(VTestSetupConfigurationStatus value);

	/**
	 * Returns the value of the '<em><b>Scenario Packet Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Packet Config</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Packet Config</em>' reference.
	 * @see #setScenarioPacketConfig(TMTCIFScenarioPacketConfig)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupSelectedConfiguration_ScenarioPacketConfig()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFScenarioPacketConfig getScenarioPacketConfig();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getScenarioPacketConfig <em>Scenario Packet Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Packet Config</em>' reference.
	 * @see #getScenarioPacketConfig()
	 * @generated
	 */
	void setScenarioPacketConfig(TMTCIFScenarioPacketConfig value);

} // VTestSetupSelectedConfiguration
