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

import es.uah.aut.srg.micobs.doctpl.doc.DBody;
import es.uah.aut.srg.micobs.doctpl.doc.DSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Introduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getObjetive <em>Objetive</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getContent <em>Content</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSIntroduction()
 * @model
 * @generated
 */
public interface VSSSIntroduction extends DSection {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' reference.
	 * @see #setPurpose(DBody)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSIntroduction_Purpose()
	 * @model required="true"
	 * @generated
	 */
	DBody getPurpose();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getPurpose <em>Purpose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(DBody value);

	/**
	 * Returns the value of the '<em><b>Objetive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objetive</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objetive</em>' reference.
	 * @see #setObjetive(DBody)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSIntroduction_Objetive()
	 * @model required="true"
	 * @generated
	 */
	DBody getObjetive();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getObjetive <em>Objetive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objetive</em>' reference.
	 * @see #getObjetive()
	 * @generated
	 */
	void setObjetive(DBody value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(DBody)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSIntroduction_Content()
	 * @model required="true"
	 * @generated
	 */
	DBody getContent();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(DBody value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' reference.
	 * @see #setReason(DBody)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSIntroduction_Reason()
	 * @model required="true"
	 * @generated
	 */
	DBody getReason();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getReason <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(DBody value);

} // VSSSIntroduction
