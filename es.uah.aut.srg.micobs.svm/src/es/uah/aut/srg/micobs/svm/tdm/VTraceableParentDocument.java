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
 * A representation of the model object '<em><b>VTraceable Parent Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableParentDocument#getDocument <em>Document</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableParentDocument#getNotApplicableItem <em>Not Applicable Item</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableParentDocument()
 * @model
 * @generated
 */
public interface VTraceableParentDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(VTraceableDocument)
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableParentDocument_Document()
	 * @model required="true"
	 * @generated
	 */
	VTraceableDocument getDocument();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableParentDocument#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(VTraceableDocument value);

	/**
	 * Returns the value of the '<em><b>Not Applicable Item</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Applicable Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Applicable Item</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableParentDocument_NotApplicableItem()
	 * @model
	 * @generated
	 */
	EList<VTraceableDocumentAbstractItem> getNotApplicableItem();

} // VTraceableParentDocument
