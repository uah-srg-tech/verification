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
package es.uah.aut.srg.micobs.svm.vdm;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VValidation Document Abstract Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem#getGroup <em>Group</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem#getValidatingItem <em>Validating Item</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocumentAbstractItem()
 * @model
 * @generated
 */
public interface VValidationDocumentAbstractItem extends EObject {
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
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocumentAbstractItem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(VValidationDocumentAbstractGroup)
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocumentAbstractItem_Group()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	VValidationDocumentAbstractGroup getGroup();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(VValidationDocumentAbstractGroup value);

	/**
	 * Returns the value of the '<em><b>Validating Item</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validating Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validating Item</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocumentAbstractItem_ValidatingItem()
	 * @model required="true"
	 * @generated
	 */
	EList<VTraceableDocumentAbstractItem> getValidatingItem();

} // VValidationDocumentAbstractItem
