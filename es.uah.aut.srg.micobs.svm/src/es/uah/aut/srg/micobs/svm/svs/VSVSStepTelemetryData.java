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

import es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Step Telemetry Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryData#getTmTemplate <em>Tm Template</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryData#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelemetryData()
 * @model
 * @generated
 */
public interface VSVSStepTelemetryData extends EObject {
	/**
	 * Returns the value of the '<em><b>Tm Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Template</em>' reference.
	 * @see #setTmTemplate(VTMTemplate)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelemetryData_TmTemplate()
	 * @model required="true"
	 * @generated
	 */
	VTMTemplate getTmTemplate();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryData#getTmTemplate <em>Tm Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Template</em>' reference.
	 * @see #getTmTemplate()
	 * @generated
	 */
	void setTmTemplate(VTMTemplate value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryDataField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelemetryData_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSVSStepTelemetryDataField> getFields();

} // VSVSStepTelemetryData
