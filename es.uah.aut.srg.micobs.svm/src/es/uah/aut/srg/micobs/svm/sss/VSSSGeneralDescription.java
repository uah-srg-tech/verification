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

import es.uah.aut.srg.micobs.doctpl.doc.DFixedSection;

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
public interface VSSSGeneralDescription extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Product Perspective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Perspective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Perspective</em>' containment reference.
	 * @see #setProductPerspective(VSSSProductPerspective)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_ProductPerspective()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSProductPerspective getProductPerspective();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getProductPerspective <em>Product Perspective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Perspective</em>' containment reference.
	 * @see #getProductPerspective()
	 * @generated
	 */
	void setProductPerspective(VSSSProductPerspective value);

	/**
	 * Returns the value of the '<em><b>General Capabilites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Capabilites</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Capabilites</em>' containment reference.
	 * @see #setGeneralCapabilites(VSSSGeneralCapabilites)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_GeneralCapabilites()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSGeneralCapabilites getGeneralCapabilites();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralCapabilites <em>General Capabilites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Capabilites</em>' containment reference.
	 * @see #getGeneralCapabilites()
	 * @generated
	 */
	void setGeneralCapabilites(VSSSGeneralCapabilites value);

	/**
	 * Returns the value of the '<em><b>General Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Constraints</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Constraints</em>' containment reference.
	 * @see #setGeneralConstraints(VSSSGeneralConstraints)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_GeneralConstraints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSGeneralConstraints getGeneralConstraints();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralConstraints <em>General Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Constraints</em>' containment reference.
	 * @see #getGeneralConstraints()
	 * @generated
	 */
	void setGeneralConstraints(VSSSGeneralConstraints value);

	/**
	 * Returns the value of the '<em><b>Operational Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Environment</em>' containment reference.
	 * @see #setOperationalEnvironment(VSSSOperationalEnvironment)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_OperationalEnvironment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSOperationalEnvironment getOperationalEnvironment();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getOperationalEnvironment <em>Operational Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Environment</em>' containment reference.
	 * @see #getOperationalEnvironment()
	 * @generated
	 */
	void setOperationalEnvironment(VSSSOperationalEnvironment value);

	/**
	 * Returns the value of the '<em><b>Assumptions Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions Dependencies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions Dependencies</em>' containment reference.
	 * @see #setAssumptionsDependencies(VSSSAssumptionsDependencies)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_AssumptionsDependencies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSAssumptionsDependencies getAssumptionsDependencies();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getAssumptionsDependencies <em>Assumptions Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumptions Dependencies</em>' containment reference.
	 * @see #getAssumptionsDependencies()
	 * @generated
	 */
	void setAssumptionsDependencies(VSSSAssumptionsDependencies value);

} // VSSSGeneralDescription
