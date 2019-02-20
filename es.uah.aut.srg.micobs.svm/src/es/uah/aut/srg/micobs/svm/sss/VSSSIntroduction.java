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
 * A representation of the model object '<em><b>VSSS Introduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSPurpose <em>VSSS Purpose</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSObjetive <em>VSSS Objetive</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSContent <em>VSSS Content</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSReason <em>VSSS Reason</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSIntroduction()
 * @model
 * @generated
 */
public interface VSSSIntroduction extends EObject {
	/**
	 * Returns the value of the '<em><b>VSSS Purpose</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS Purpose</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS Purpose</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSIntroduction_VSSSPurpose()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSPurpose();

	/**
	 * Returns the value of the '<em><b>VSSS Objetive</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS Objetive</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS Objetive</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSIntroduction_VSSSObjetive()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSObjetive();

	/**
	 * Returns the value of the '<em><b>VSSS Content</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS Content</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS Content</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSIntroduction_VSSSContent()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSContent();

	/**
	 * Returns the value of the '<em><b>VSSS Reason</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS Reason</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS Reason</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSIntroduction_VSSSReason()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSReason();

} // VSSSIntroduction
