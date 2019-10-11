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
package es.uah.aut.srg.micobs.svm.srs;

import es.uah.aut.srg.micobs.doctpl.doc.DBody;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSRS Document Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem#getExtendedDescription <em>Extended Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocumentItem()
 * @model
 * @generated
 */
public interface VSRSDocumentItem extends VTraceableDocumentAbstractItem {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DBody)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocumentItem_Description()
	 * @model containment="true"
	 * @generated
	 */
	DBody getDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DBody value);

	/**
	 * Returns the value of the '<em><b>Extended Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Description</em>' containment reference.
	 * @see #setExtendedDescription(DBody)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocumentItem_ExtendedDescription()
	 * @model containment="true"
	 * @generated
	 */
	DBody getExtendedDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem#getExtendedDescription <em>Extended Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Description</em>' containment reference.
	 * @see #getExtendedDescription()
	 * @generated
	 */
	void setExtendedDescription(DBody value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItemModes}.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItemModes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItemModes
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocumentItem_Mode()
	 * @model upper="5"
	 * @generated
	 */
	EList<VSRSDocumentItemModes> getMode();

} // VSRSDocumentItem
