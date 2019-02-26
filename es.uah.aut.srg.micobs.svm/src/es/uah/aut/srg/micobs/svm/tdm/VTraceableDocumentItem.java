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

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTraceable Document Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getVerificationMethod <em>Verification Method</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentItem()
 * @model abstract="true"
 * @generated
 */
public interface VTraceableDocumentItem extends MCommonReferenceableObj {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentItem_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Verification Method</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.tdm.VVerificationMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Method</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VVerificationMethod
	 * @see #setVerificationMethod(VVerificationMethod)
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentItem_VerificationMethod()
	 * @model required="true"
	 * @generated
	 */
	VVerificationMethod getVerificationMethod();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getVerificationMethod <em>Verification Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Method</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VVerificationMethod
	 * @see #getVerificationMethod()
	 * @generated
	 */
	void setVerificationMethod(VVerificationMethod value);

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
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentItem_Group()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	VTraceableDocumentAbstractGroup getGroup();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(VTraceableDocumentAbstractGroup value);

} // VTraceableDocumentItem
