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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VValidation Document Abstract Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup#getItems <em>Items</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup#getDoc <em>Doc</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocumentAbstractGroup()
 * @model
 * @generated
 */
public interface VValidationDocumentAbstractGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocumentAbstractGroup_Items()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<VValidationDocumentAbstractItem> getItems();

	/**
	 * Returns the value of the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' reference.
	 * @see #setDoc(VValidationDocument)
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocumentAbstractGroup_Doc()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	VValidationDocument getDoc();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup#getDoc <em>Doc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' reference.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(VValidationDocument value);

} // VValidationDocumentAbstractGroup
