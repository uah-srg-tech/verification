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
 * A representation of the model object '<em><b>VCDT Parent Ref Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentRefItem#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentRefItem#getParentDoc <em>Parent Doc</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage#getVCDTParentRefItem()
 * @model
 * @generated
 */
public interface VCDTParentRefItem extends EObject {
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
	 * @see es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage#getVCDTParentRefItem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentRefItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Doc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Doc</em>' attribute.
	 * @see #setParentDoc(String)
	 * @see es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage#getVCDTParentRefItem_ParentDoc()
	 * @model required="true"
	 * @generated
	 */
	String getParentDoc();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentRefItem#getParentDoc <em>Parent Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Doc</em>' attribute.
	 * @see #getParentDoc()
	 * @generated
	 */
	void setParentDoc(String value);

} // VCDTParentRefItem
