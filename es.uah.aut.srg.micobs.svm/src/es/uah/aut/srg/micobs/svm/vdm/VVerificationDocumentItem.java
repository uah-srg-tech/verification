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
package es.uah.aut.srg.micobs.svm.vdm;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VVerification Document Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VVerificationDocumentItem#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VVerificationDocumentItem#getEvidenceOf <em>Evidence Of</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVVerificationDocumentItem()
 * @model
 * @generated
 */
public interface VVerificationDocumentItem extends MCommonReferenceableObj {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVVerificationDocumentItem_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vdm.VVerificationDocumentItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Evidence Of</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence Of</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVVerificationDocumentItem_EvidenceOf()
	 * @model required="true"
	 * @generated
	 */
	EList<VTraceableDocumentItem> getEvidenceOf();

} // VVerificationDocumentItem
