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
package es.uah.aut.srg.micobs.svm.testsetup;

import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTest Setup Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupAction()
 * @model
 * @generated
 */
public interface VTestSetupAction extends EObject {
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
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupAction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupAction_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DBody getDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DBody value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType
	 * @see #setType(VTestSetupActionType)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupAction_Type()
	 * @model required="true"
	 * @generated
	 */
	VTestSetupActionType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType
	 * @see #getType()
	 * @generated
	 */
	void setType(VTestSetupActionType value);

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VTestSetupAction
