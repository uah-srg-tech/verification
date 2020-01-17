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

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Step Telemetry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry#getInterface <em>Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry#getTmData <em>Tm Data</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry#getTmHeader <em>Tm Header</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelemetry()
 * @model
 * @generated
 */
public interface VSVSStepTelemetry extends EObject {
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
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelemetry_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(VTestSetupInterface)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelemetry_Interface()
	 * @model required="true"
	 * @generated
	 */
	VTestSetupInterface getInterface();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(VTestSetupInterface value);

	/**
	 * Returns the value of the '<em><b>Tm Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Data</em>' containment reference.
	 * @see #setTmData(VSVSStepTelemetryData)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelemetry_TmData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSStepTelemetryData getTmData();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry#getTmData <em>Tm Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Data</em>' containment reference.
	 * @see #getTmData()
	 * @generated
	 */
	void setTmData(VSVSStepTelemetryData value);

	/**
	 * Returns the value of the '<em><b>Tm Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Header</em>' containment reference.
	 * @see #setTmHeader(VSVSStepTelemetryHeader)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelemetry_TmHeader()
	 * @model containment="true"
	 * @generated
	 */
	VSVSStepTelemetryHeader getTmHeader();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry#getTmHeader <em>Tm Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Header</em>' containment reference.
	 * @see #getTmHeader()
	 * @generated
	 */
	void setTmHeader(VSVSStepTelemetryHeader value);

} // VSVSStepTelemetry
