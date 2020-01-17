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
package es.uah.aut.srg.micobs.svm.svs;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Step Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration#getFilterStatus <em>Filter Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration#getPrintStatus <em>Print Status</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepConfiguration()
 * @model
 * @generated
 */
public interface VSVSStepConfiguration extends EObject {

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
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepConfiguration_Configuration()
	 * @model required="true"
	 * @generated
	 */
	VTestSetupPacketConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(VTestSetupPacketConfiguration value);

	/**
	 * Returns the value of the '<em><b>Filter Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @see #setFilterStatus(VTestSetupConfigurationStatus)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepConfiguration_FilterStatus()
	 * @model
	 * @generated
	 */
	VTestSetupConfigurationStatus getFilterStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration#getFilterStatus <em>Filter Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @see #getFilterStatus()
	 * @generated
	 */
	void setFilterStatus(VTestSetupConfigurationStatus value);

	/**
	 * Returns the value of the '<em><b>Print Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @see #setPrintStatus(VTestSetupConfigurationStatus)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepConfiguration_PrintStatus()
	 * @model
	 * @generated
	 */
	VTestSetupConfigurationStatus getPrintStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration#getPrintStatus <em>Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @see #getPrintStatus()
	 * @generated
	 */
	void setPrintStatus(VTestSetupConfigurationStatus value);

} // VSVSStepConfiguration
