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

import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Document Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem#getExtendedDescription <em>Extended Description</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocumentItem()
 * @model
 * @generated
 */
public interface VSSSDocumentItem extends VTraceableDocumentAbstractItem {
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
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocumentItem_Description()
	 * @model containment="true"
	 * @generated
	 */
	DBody getDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem#getDescription <em>Description</em>}' containment reference.
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
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocumentItem_ExtendedDescription()
	 * @model containment="true"
	 * @generated
	 */
	DBody getExtendedDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem#getExtendedDescription <em>Extended Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Description</em>' containment reference.
	 * @see #getExtendedDescription()
	 * @generated
	 */
	void setExtendedDescription(DBody value);

} // VSSSDocumentItem
