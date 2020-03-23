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

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VValidation Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getIssue <em>Issue</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getRevision <em>Revision</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getDate <em>Date</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getParents <em>Parents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocument()
 * @model
 * @generated
 */
public interface VValidationDocument extends EObject {
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
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocument_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocument_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' attribute.
	 * @see #setIssue(String)
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocument_Issue()
	 * @model required="true"
	 * @generated
	 */
	String getIssue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getIssue <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(String value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(String)
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocument_Revision()
	 * @model required="true"
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocument_Date()
	 * @model required="true"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocument_Parents()
	 * @model
	 * @generated
	 */
	EList<VTraceableDocument> getParents();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#getVValidationDocument_Groups()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<VValidationDocumentAbstractGroup> getGroups();

} // VValidationDocument
