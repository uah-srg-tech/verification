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

import es.uah.aut.srg.micobs.doctpl.doc.DFixedSection;

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
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getSteps <em>Steps</em>}</li>
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
	 * @see #setIdentifier(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure_Identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getIdentifier();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(VSVSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure_Purpose()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getPurpose();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(VSVSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VSVSProcedureStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Test Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Script</em>' containment reference.
	 * @see #setTestScript(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestProcedure_TestScript()
	 * @model containment="true"
	 * @generated
	 */
	VSVSFixedSection getTestScript();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getTestScript <em>Test Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Script</em>' containment reference.
	 * @see #getTestScript()
	 * @generated
	 */
	void setTestScript(VSVSFixedSection value);

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
