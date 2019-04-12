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
package es.uah.aut.srg.micobs.svm.srs;

import es.uah.aut.srg.micobs.doctpl.doc.DBody;
import es.uah.aut.srg.micobs.doctpl.doc.DFixedSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSRS Traceabilty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSTraceabilty#getSectionDescription <em>Section Description</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSTraceabilty()
 * @model
 * @generated
 */
public interface VSRSTraceabilty extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Description</em>' containment reference.
	 * @see #setSectionDescription(DBody)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSTraceabilty_SectionDescription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DBody getSectionDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSTraceabilty#getSectionDescription <em>Section Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Description</em>' containment reference.
	 * @see #getSectionDescription()
	 * @generated
	 */
	void setSectionDescription(DBody value);

} // VSRSTraceabilty
