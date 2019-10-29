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
package es.uah.aut.srg.micobs.svm.vcdt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VCDT List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getDoc <em>Doc</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getItems <em>Items</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getParentItems <em>Parent Items</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage#getVCDTList()
 * @model
 * @generated
 */
public interface VCDTList extends EObject {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage#getVCDTList_Doc()
	 * @model required="true"
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getDoc <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' attribute.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(VCDTItems)
	 * @see es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage#getVCDTList_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VCDTItems getItems();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(VCDTItems value);

	/**
	 * Returns the value of the '<em><b>Parent Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Items</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Items</em>' containment reference.
	 * @see #setParentItems(VCDTParentItems)
	 * @see es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage#getVCDTList_ParentItems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VCDTParentItems getParentItems();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getParentItems <em>Parent Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Items</em>' containment reference.
	 * @see #getParentItems()
	 * @generated
	 */
	void setParentItems(VCDTParentItems value);

} // VCDTList
