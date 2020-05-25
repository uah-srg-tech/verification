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
package es.uah.aut.srg.micobs.svm.svr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVRSW Val Process Verification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRSWValProcessVerification#getTraceability <em>Traceability</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRSWValProcessVerification#getFeasibility <em>Feasibility</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRSWValProcessVerification()
 * @model
 * @generated
 */
public interface VSVRSWValProcessVerification extends VSVRFixedSection {
	/**
	 * Returns the value of the '<em><b>Traceability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traceability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceability</em>' containment reference.
	 * @see #setTraceability(VSVRFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRSWValProcessVerification_Traceability()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVRFixedSection getTraceability();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svr.VSVRSWValProcessVerification#getTraceability <em>Traceability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traceability</em>' containment reference.
	 * @see #getTraceability()
	 * @generated
	 */
	void setTraceability(VSVRFixedSection value);

	/**
	 * Returns the value of the '<em><b>Feasibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feasibility</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feasibility</em>' containment reference.
	 * @see #setFeasibility(VSVRFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRSWValProcessVerification_Feasibility()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVRFixedSection getFeasibility();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svr.VSVRSWValProcessVerification#getFeasibility <em>Feasibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feasibility</em>' containment reference.
	 * @see #getFeasibility()
	 * @generated
	 */
	void setFeasibility(VSVRFixedSection value);

} // VSVRSWValProcessVerification
