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
 * A representation of the model object '<em><b>VTraceable Document Abstract Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getItems <em>Items</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentAbstractGroup()
 * @model abstract="true"
 * @generated
 */
public interface VTraceableDocumentAbstractGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentAbstractGroup_Prefix()
	 * @model required="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentAbstractGroup_Items()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<VTraceableDocumentItem> getItems();

	/**
	 * Returns the value of the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' reference.
	 * @see #setSection(VTraceableDocumentAbstractSection)
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentAbstractGroup_Section()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	VTraceableDocumentAbstractSection getSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getSection <em>Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' reference.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(VTraceableDocumentAbstractSection value);

} // VTraceableDocumentAbstractGroup
