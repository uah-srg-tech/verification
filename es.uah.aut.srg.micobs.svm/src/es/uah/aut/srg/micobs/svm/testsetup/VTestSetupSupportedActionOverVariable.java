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

import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTest Setup Supported Action Over Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getActionOverVariable <em>Action Over Variable</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getScenarioVariable <em>Scenario Variable</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupSupportedActionOverVariable()
 * @model
 * @generated
 */
public interface VTestSetupSupportedActionOverVariable extends EObject {
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
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupSupportedActionOverVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action Over Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Over Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Over Variable</em>' reference.
	 * @see #setActionOverVariable(VTestSetupActionOverVariable)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupSupportedActionOverVariable_ActionOverVariable()
	 * @model required="true"
	 * @generated
	 */
	VTestSetupActionOverVariable getActionOverVariable();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getActionOverVariable <em>Action Over Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Over Variable</em>' reference.
	 * @see #getActionOverVariable()
	 * @generated
	 */
	void setActionOverVariable(VTestSetupActionOverVariable value);

	/**
	 * Returns the value of the '<em><b>Scenario Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Variable</em>' reference.
	 * @see #setScenarioVariable(TMTCIFScenarioVariable)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupSupportedActionOverVariable_ScenarioVariable()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFScenarioVariable getScenarioVariable();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getScenarioVariable <em>Scenario Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Variable</em>' reference.
	 * @see #getScenarioVariable()
	 * @generated
	 */
	void setScenarioVariable(TMTCIFScenarioVariable value);

} // VTestSetupSupportedActionOverVariable
