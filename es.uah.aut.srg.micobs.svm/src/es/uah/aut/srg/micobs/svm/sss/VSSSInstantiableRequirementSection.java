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
package es.uah.aut.srg.micobs.svm.sss;

import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableGroup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Instantiable Requirement Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection#getSectionDescription <em>Section Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection#getSssItems <em>Sss Items</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSInstantiableRequirementSection()
 * @model
 * @generated
 */
public interface VSSSInstantiableRequirementSection extends VTraceableDocumentInstantiableGroup, DInstantiableSection {
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
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSInstantiableRequirementSection_SectionDescription()
	 * @model containment="true"
	 * @generated
	 */
	DBody getSectionDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection#getSectionDescription <em>Section Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Description</em>' containment reference.
	 * @see #getSectionDescription()
	 * @generated
	 */
	void setSectionDescription(DBody value);

	/**
	 * Returns the value of the '<em><b>Sss Items</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sss Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sss Items</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSInstantiableRequirementSection_SssItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSSSDocumentItem> getSssItems();

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VSSSInstantiableRequirementSection
