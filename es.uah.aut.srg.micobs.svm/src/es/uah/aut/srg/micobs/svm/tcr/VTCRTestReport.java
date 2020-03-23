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
package es.uah.aut.srg.micobs.svm.tcr;

import es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTCR Test Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getTest_procedure <em>Test procedure</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getStatus <em>Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tcr.tcrPackage#getVTCRTestReport()
 * @model
 * @generated
 */
public interface VTCRTestReport extends EObject {
	/**
	 * Returns the value of the '<em><b>Test procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test procedure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test procedure</em>' attribute.
	 * @see #setTest_procedure(String)
	 * @see es.uah.aut.srg.micobs.svm.tcr.tcrPackage#getVTCRTestReport_Test_procedure()
	 * @model required="true"
	 * @generated
	 */
	String getTest_procedure();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getTest_procedure <em>Test procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test procedure</em>' attribute.
	 * @see #getTest_procedure()
	 * @generated
	 */
	void setTest_procedure(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.tcr.VTCRTestStatus
	 * @see #setStatus(VTCRTestStatus)
	 * @see es.uah.aut.srg.micobs.svm.tcr.tcrPackage#getVTCRTestReport_Status()
	 * @model required="true"
	 * @generated
	 */
	VTCRTestStatus getStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.tcr.VTCRTestStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(VTCRTestStatus value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference.
	 * @see #setEvidence(DParagraph)
	 * @see es.uah.aut.srg.micobs.svm.tcr.tcrPackage#getVTCRTestReport_Evidence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DParagraph getEvidence();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getEvidence <em>Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence</em>' containment reference.
	 * @see #getEvidence()
	 * @generated
	 */
	void setEvidence(DParagraph value);

} // VTCRTestReport
