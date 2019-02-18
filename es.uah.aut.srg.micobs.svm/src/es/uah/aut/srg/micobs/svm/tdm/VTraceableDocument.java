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

import es.uah.aut.srg.micobs.common.MCommonPackageElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTraceable Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getIssue <em>Issue</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getDate <em>Date</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getItemGroup <em>Item Group</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getParents <em>Parents</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocument()
 * @model
 * @generated
 */
public interface VTraceableDocument extends MCommonPackageElement {
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
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocument_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' attribute.
	 * @see #setIssue(String)
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocument_Issue()
	 * @model required="true"
	 * @generated
	 */
	String getIssue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getIssue <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocument_Date()
	 * @model required="true"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Item Group</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItemGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Group</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocument_ItemGroup()
	 * @model required="true"
	 * @generated
	 */
	EList<VTraceableDocumentItemGroup> getItemGroup();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocument_Parents()
	 * @model
	 * @generated
	 */
	EList<VTraceableDocumentItem> getParents();

} // VTraceableDocument
