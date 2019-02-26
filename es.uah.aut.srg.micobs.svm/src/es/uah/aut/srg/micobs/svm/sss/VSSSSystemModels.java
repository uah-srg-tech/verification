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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS System Models</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels#getSystemModel <em>System Model</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSystemModels()
 * @model
 * @generated
 */
public interface VSSSSystemModels extends EObject {
	/**
	 * Returns the value of the '<em><b>System Model</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Model</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Model</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSystemModels_SystemModel()
	 * @model
	 * @generated
	 */
	EList<String> getSystemModel();

} // VSSSSystemModels
