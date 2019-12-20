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

import es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Step Telecommand Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandData#getTcTemplate <em>Tc Template</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandData#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelecommandData()
 * @model
 * @generated
 */
public interface VSVSStepTelecommandData extends EObject {
	/**
	 * Returns the value of the '<em><b>Tc Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tc Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tc Template</em>' reference.
	 * @see #setTcTemplate(VTCTemplate)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelecommandData_TcTemplate()
	 * @model required="true"
	 * @generated
	 */
	VTCTemplate getTcTemplate();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandData#getTcTemplate <em>Tc Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tc Template</em>' reference.
	 * @see #getTcTemplate()
	 * @generated
	 */
	void setTcTemplate(VTCTemplate value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandDataField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelecommandData_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSVSStepTelecommandDataField> getFields();

} // VSVSStepTelecommandData
