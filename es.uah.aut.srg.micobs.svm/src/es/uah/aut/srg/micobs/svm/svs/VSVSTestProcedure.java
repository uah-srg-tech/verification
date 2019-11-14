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
package es.uah.aut.srg.micobs.svm.svs;

import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Test Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getScenario <em>Scenario</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getProcedureSteps <em>Procedure Steps</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getTestScript <em>Test Script</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getTestCase <em>Test Case</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure()
 * @model
 * @generated
 */
public interface VSVSTestProcedure extends DFixedSection {
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
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(VSVSTestInfo)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure_Identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSTestInfo getIdentifier();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(VSVSTestInfo value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(VSVSTestInfo)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure_Purpose()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSTestInfo getPurpose();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(VSVSTestInfo value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference.
	 * @see #setScenario(VSVSScenarioSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure_Scenario()
	 * @model
	 * @generated
	 */
	VSVSScenarioSection getScenario();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(VSVSScenarioSection value);

	/**
	 * Returns the value of the '<em><b>Procedure Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Steps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Steps</em>' containment reference.
	 * @see #setProcedureSteps(VSVSProcedureSteps)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure_ProcedureSteps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSProcedureSteps getProcedureSteps();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getProcedureSteps <em>Procedure Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Steps</em>' containment reference.
	 * @see #getProcedureSteps()
	 * @generated
	 */
	void setProcedureSteps(VSVSProcedureSteps value);

	/**
	 * Returns the value of the '<em><b>Test Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Script</em>' containment reference.
	 * @see #setTestScript(VSVSTestInfo)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure_TestScript()
	 * @model containment="true"
	 * @generated
	 */
	VSVSTestInfo getTestScript();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getTestScript <em>Test Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Script</em>' containment reference.
	 * @see #getTestScript()
	 * @generated
	 */
	void setTestScript(VSVSTestInfo value);

	/**
	 * Returns the value of the '<em><b>Test Case</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Case</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Case</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure_TestCase()
	 * @model required="true"
	 * @generated
	 */
	EList<VSVSTestCase> getTestCase();

} // VSVSTestProcedure
