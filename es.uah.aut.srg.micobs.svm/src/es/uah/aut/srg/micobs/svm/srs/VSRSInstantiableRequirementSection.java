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

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableGroup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSRS Instantiable Requirement Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection#getSectionDescription <em>Section Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection#getSrsItems <em>Srs Items</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSInstantiableRequirementSection()
 * @model
 * @generated
 */
public interface VSRSInstantiableRequirementSection extends VTraceableDocumentInstantiableGroup, es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection {
	/**
	 * Returns the value of the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Description</em>' containment reference.
	 * @see #setSectionDescription(es.uah.aut.srg.micobs.doctpl.doctpl.DBody)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSInstantiableRequirementSection_SectionDescription()
	 * @model containment="true"
	 * @generated
	 */
	es.uah.aut.srg.micobs.doctpl.doctpl.DBody getSectionDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection#getSectionDescription <em>Section Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Description</em>' containment reference.
	 * @see #getSectionDescription()
	 * @generated
	 */
	void setSectionDescription(es.uah.aut.srg.micobs.doctpl.doctpl.DBody value);

	/**
	 * Returns the value of the '<em><b>Srs Items</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srs Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srs Items</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSInstantiableRequirementSection_SrsItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSRSDocumentItem> getSrsItems();

} // VSRSInstantiableRequirementSection
