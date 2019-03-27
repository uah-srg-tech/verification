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
package es.uah.aut.srg.micobs.svm.tdm;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTraceable Document Instantiable Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableGroup#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentInstantiableGroup()
 * @model abstract="true"
 * @generated
 */
public interface VTraceableDocumentInstantiableGroup extends VTraceableDocumentAbstractGroup, MCommonReferenceableObj {

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentInstantiableGroup_Prefix()
	 * @model required="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableGroup#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);
} // VTraceableDocumentInstantiableGroup
