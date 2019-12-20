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
	 * @see #setConfiguration(VSVSPacketConfiguration)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepConfiguration_Configuration()
	 * @model required="true"
	 * @generated
	 */
	VSVSPacketConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(VSVSPacketConfiguration value);

	/**
	 * Returns the value of the '<em><b>Filter Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus
	 * @see #setFilterStatus(VSVSConfigurationStatus)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepConfiguration_FilterStatus()
	 * @model
	 * @generated
	 */
	VSVSConfigurationStatus getFilterStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration#getFilterStatus <em>Filter Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus
	 * @see #getFilterStatus()
	 * @generated
	 */
	void setFilterStatus(VSVSConfigurationStatus value);

	/**
	 * Returns the value of the '<em><b>Print Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus
	 * @see #setPrintStatus(VSVSConfigurationStatus)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepConfiguration_PrintStatus()
	 * @model
	 * @generated
	 */
	VSVSConfigurationStatus getPrintStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration#getPrintStatus <em>Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus
	 * @see #getPrintStatus()
	 * @generated
	 */
	void setPrintStatus(VSVSConfigurationStatus value);

} // VSVSStepConfiguration
