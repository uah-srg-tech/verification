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
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Instantiable Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection#getBody <em>Body</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection#getSssInstatiableSubsections <em>Sss Instatiable Subsections</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSInstantiableSection()
 * @model
 * @generated
 */
public interface VSSSInstantiableSection extends DInstantiableSection {
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
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSInstantiableSection_Body()
	 * @model containment="true"
	 * @generated
	 */
	DBody getBody();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(DBody value);

	/**
	 * Returns the value of the '<em><b>Sss Instatiable Subsections</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sss Instatiable Subsections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sss Instatiable Subsections</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSInstantiableSection_SssInstatiableSubsections()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSSSInstantiableSection> getSssInstatiableSubsections();

} // VSSSInstantiableSection
