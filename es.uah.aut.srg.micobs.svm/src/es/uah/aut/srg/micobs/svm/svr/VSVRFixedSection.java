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

import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVR Fixed Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection#getBody <em>Body</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection#getSvrInstatiableSubsections <em>Svr Instatiable Subsections</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRFixedSection()
 * @model
 * @generated
 */
public interface VSVRFixedSection extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(DBody)
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRFixedSection_Body()
	 * @model containment="true"
	 * @generated
	 */
	DBody getBody();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(DBody value);

	/**
	 * Returns the value of the '<em><b>Svr Instatiable Subsections</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Svr Instatiable Subsections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svr Instatiable Subsections</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRFixedSection_SvrInstatiableSubsections()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSVRInstantiableSection> getSvrInstatiableSubsections();

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VSVRFixedSection
