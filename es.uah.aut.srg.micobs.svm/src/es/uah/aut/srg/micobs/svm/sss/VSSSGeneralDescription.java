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
 * A representation of the model object '<em><b>VSSS General Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSProductPerspective <em>VSSS Product Perspective</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSGeneralCapabilites <em>VSSS General Capabilites</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSGeneralConstraints <em>VSSS General Constraints</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSOperationalEnvironment <em>VSSS Operational Environment</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSAssumptionsDependencies <em>VSSS Assumptions Dependencies</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription()
 * @model
 * @generated
 */
public interface VSSSGeneralDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>VSSS Product Perspective</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS Product Perspective</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS Product Perspective</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_VSSSProductPerspective()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSProductPerspective();

	/**
	 * Returns the value of the '<em><b>VSSS General Capabilites</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS General Capabilites</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS General Capabilites</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_VSSSGeneralCapabilites()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSGeneralCapabilites();

	/**
	 * Returns the value of the '<em><b>VSSS General Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS General Constraints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS General Constraints</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_VSSSGeneralConstraints()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSGeneralConstraints();

	/**
	 * Returns the value of the '<em><b>VSSS Operational Environment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS Operational Environment</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS Operational Environment</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_VSSSOperationalEnvironment()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSOperationalEnvironment();

	/**
	 * Returns the value of the '<em><b>VSSS Assumptions Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS Assumptions Dependencies</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS Assumptions Dependencies</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_VSSSAssumptionsDependencies()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSAssumptionsDependencies();

} // VSSSGeneralDescription
