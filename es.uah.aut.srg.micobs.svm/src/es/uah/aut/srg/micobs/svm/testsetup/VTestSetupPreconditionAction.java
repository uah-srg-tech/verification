/**
 * Copyright (c) 2020 UAH Space Research Group.
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
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioPrecondition;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTest Setup Precondition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPreconditionAction#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPreconditionAction#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPreconditionAction#getScenarioPrecondition <em>Scenario Precondition</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupPreconditionAction()
 * @model
 * @generated
 */
public interface VTestSetupPreconditionAction extends EObject {
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
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupPreconditionAction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPreconditionAction#getName <em>Name</em>}' attribute.
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
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupPreconditionAction_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DBody getDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPreconditionAction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DBody value);

	/**
	 * Returns the value of the '<em><b>Scenario Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Precondition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Precondition</em>' reference.
	 * @see #setScenarioPrecondition(TMTCIFScenarioPrecondition)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupPreconditionAction_ScenarioPrecondition()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFScenarioPrecondition getScenarioPrecondition();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPreconditionAction#getScenarioPrecondition <em>Scenario Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Precondition</em>' reference.
	 * @see #getScenarioPrecondition()
	 * @generated
	 */
	void setScenarioPrecondition(TMTCIFScenarioPrecondition value);

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VTestSetupPreconditionAction
