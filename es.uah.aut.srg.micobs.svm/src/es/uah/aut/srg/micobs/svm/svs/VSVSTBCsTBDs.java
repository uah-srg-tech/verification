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

import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBC;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBD;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVSTB Cs TB Ds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTBCsTBDs#getTbcs <em>Tbcs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTBCsTBDs#getTbds <em>Tbds</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTBCsTBDs()
 * @model
 * @generated
 */
public interface VSVSTBCsTBDs extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Tbcs</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DTBC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbcs</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTBCsTBDs_Tbcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DTBC> getTbcs();

	/**
	 * Returns the value of the '<em><b>Tbds</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DTBD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbds</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTBCsTBDs_Tbds()
	 * @model containment="true"
	 * @generated
	 */
	EList<DTBD> getTbds();

} // VSVSTBCsTBDs
