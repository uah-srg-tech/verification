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
package es.uah.aut.srg.micobs.svm.tdm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTraceable Document Abstract Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getValidationMethod <em>Validation Method</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getGroup <em>Group</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getParentItem <em>Parent Item</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentAbstractItem()
 * @model abstract="true"
 * @generated
 */
public interface VTraceableDocumentAbstractItem extends EObject {
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
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentAbstractItem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Validation Method</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.tdm.VValidationMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Method</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VValidationMethod
	 * @see #setValidationMethod(VValidationMethod)
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentAbstractItem_ValidationMethod()
	 * @model required="true"
	 * @generated
	 */
	VValidationMethod getValidationMethod();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getValidationMethod <em>Validation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Method</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VValidationMethod
	 * @see #getValidationMethod()
	 * @generated
	 */
	void setValidationMethod(VValidationMethod value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(VTraceableDocumentAbstractGroup)
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentAbstractItem_Group()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	VTraceableDocumentAbstractGroup getGroup();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(VTraceableDocumentAbstractGroup value);

	/**
	 * Returns the value of the '<em><b>Parent Item</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Item</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentAbstractItem_ParentItem()
	 * @model
	 * @generated
	 */
	EList<VTraceableDocumentAbstractItem> getParentItem();

} // VTraceableDocumentAbstractItem
