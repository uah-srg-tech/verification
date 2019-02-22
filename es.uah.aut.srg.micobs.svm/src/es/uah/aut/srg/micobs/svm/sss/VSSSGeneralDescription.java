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
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getProductPerspective <em>Product Perspective</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralCapabilites <em>General Capabilites</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralConstraints <em>General Constraints</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getOperationalEnvironment <em>Operational Environment</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getAssumptionsDependencies <em>Assumptions Dependencies</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription()
 * @model
 * @generated
 */
public interface VSSSGeneralDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Perspective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Perspective</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Perspective</em>' attribute.
	 * @see #setProductPerspective(String)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_ProductPerspective()
	 * @model required="true"
	 * @generated
	 */
	String getProductPerspective();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getProductPerspective <em>Product Perspective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Perspective</em>' attribute.
	 * @see #getProductPerspective()
	 * @generated
	 */
	void setProductPerspective(String value);

	/**
	 * Returns the value of the '<em><b>General Capabilites</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Capabilites</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Capabilites</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_GeneralCapabilites()
	 * @model
	 * @generated
	 */
	EList<String> getGeneralCapabilites();

	/**
	 * Returns the value of the '<em><b>General Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Constraints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Constraints</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_GeneralConstraints()
	 * @model
	 * @generated
	 */
	EList<String> getGeneralConstraints();

	/**
	 * Returns the value of the '<em><b>Operational Environment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Environment</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Environment</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_OperationalEnvironment()
	 * @model
	 * @generated
	 */
	EList<String> getOperationalEnvironment();

	/**
	 * Returns the value of the '<em><b>Assumptions Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions Dependencies</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions Dependencies</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_AssumptionsDependencies()
	 * @model
	 * @generated
	 */
	EList<String> getAssumptionsDependencies();

} // VSSSGeneralDescription
