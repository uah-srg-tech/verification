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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Selected Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSSelectedConfiguration#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSSelectedConfiguration#getDefaultFilterStatus <em>Default Filter Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSSelectedConfiguration#getDefaultPrintStatus <em>Default Print Status</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSSelectedConfiguration()
 * @model
 * @generated
 */
public interface VSVSSelectedConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(VSVSPacketConfiguration)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSSelectedConfiguration_Configuration()
	 * @model required="true"
	 * @generated
	 */
	VSVSPacketConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSSelectedConfiguration#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(VSVSPacketConfiguration value);

	/**
	 * Returns the value of the '<em><b>Default Filter Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Filter Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Filter Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus
	 * @see #setDefaultFilterStatus(VSVSConfigurationStatus)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSSelectedConfiguration_DefaultFilterStatus()
	 * @model required="true"
	 * @generated
	 */
	VSVSConfigurationStatus getDefaultFilterStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSSelectedConfiguration#getDefaultFilterStatus <em>Default Filter Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Filter Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus
	 * @see #getDefaultFilterStatus()
	 * @generated
	 */
	void setDefaultFilterStatus(VSVSConfigurationStatus value);

	/**
	 * Returns the value of the '<em><b>Default Print Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Print Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Print Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus
	 * @see #setDefaultPrintStatus(VSVSConfigurationStatus)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSSelectedConfiguration_DefaultPrintStatus()
	 * @model required="true"
	 * @generated
	 */
	VSVSConfigurationStatus getDefaultPrintStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSSelectedConfiguration#getDefaultPrintStatus <em>Default Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Print Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus
	 * @see #getDefaultPrintStatus()
	 * @generated
	 */
	void setDefaultPrintStatus(VSVSConfigurationStatus value);

} // VSVSSelectedConfiguration
