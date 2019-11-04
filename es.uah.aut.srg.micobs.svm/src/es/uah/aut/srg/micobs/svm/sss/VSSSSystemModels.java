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
package es.uah.aut.srg.micobs.svm.sss;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS System Models</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels#getSystemModels <em>System Models</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSystemModels()
 * @model
 * @generated
 */
public interface VSSSSystemModels extends es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection {
	/**
	 * Returns the value of the '<em><b>System Models</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Models</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSystemModels_SystemModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSSSSystemModel> getSystemModels();

} // VSSSSystemModels
