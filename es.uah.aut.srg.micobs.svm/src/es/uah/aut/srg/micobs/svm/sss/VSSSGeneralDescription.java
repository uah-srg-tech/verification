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
 * A representation of the model object '<em><b>VSSS General Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getProductPerspective <em>Product Perspective</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralCapabilites <em>General Capabilites</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralConstraints <em>General Constraints</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getOperationalEnvironment <em>Operational Environment</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getAssumptionsDependencies <em>Assumptions Dependencies</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription()
 * @model
 * @generated
 */
public interface VSSSGeneralDescription extends DSection {
	/**
	 * Returns the value of the '<em><b>Product Perspective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Perspective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Perspective</em>' reference.
	 * @see #setProductPerspective(DBody)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_ProductPerspective()
	 * @model required="true"
	 * @generated
	 */
	DBody getProductPerspective();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getProductPerspective <em>Product Perspective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Perspective</em>' reference.
	 * @see #getProductPerspective()
	 * @generated
	 */
	void setProductPerspective(DBody value);

	/**
	 * Returns the value of the '<em><b>General Capabilites</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Capabilites</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Capabilites</em>' reference.
	 * @see #setGeneralCapabilites(DBody)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_GeneralCapabilites()
	 * @model required="true"
	 * @generated
	 */
	DBody getGeneralCapabilites();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralCapabilites <em>General Capabilites</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Capabilites</em>' reference.
	 * @see #getGeneralCapabilites()
	 * @generated
	 */
	void setGeneralCapabilites(DBody value);

	/**
	 * Returns the value of the '<em><b>General Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Constraints</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Constraints</em>' reference.
	 * @see #setGeneralConstraints(DBody)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_GeneralConstraints()
	 * @model required="true"
	 * @generated
	 */
	DBody getGeneralConstraints();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralConstraints <em>General Constraints</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Constraints</em>' reference.
	 * @see #getGeneralConstraints()
	 * @generated
	 */
	void setGeneralConstraints(DBody value);

	/**
	 * Returns the value of the '<em><b>Operational Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Environment</em>' reference.
	 * @see #setOperationalEnvironment(DBody)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_OperationalEnvironment()
	 * @model required="true"
	 * @generated
	 */
	DBody getOperationalEnvironment();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getOperationalEnvironment <em>Operational Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Environment</em>' reference.
	 * @see #getOperationalEnvironment()
	 * @generated
	 */
	void setOperationalEnvironment(DBody value);

	/**
	 * Returns the value of the '<em><b>Assumptions Dependencies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions Dependencies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions Dependencies</em>' reference.
	 * @see #setAssumptionsDependencies(DBody)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_AssumptionsDependencies()
	 * @model required="true"
	 * @generated
	 */
	DBody getAssumptionsDependencies();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getAssumptionsDependencies <em>Assumptions Dependencies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumptions Dependencies</em>' reference.
	 * @see #getAssumptionsDependencies()
	 * @generated
	 */
	void setAssumptionsDependencies(DBody value);

} // VSSSGeneralDescription
