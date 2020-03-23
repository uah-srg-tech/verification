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

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;

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
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralCapabilities <em>General Capabilities</em>}</li>
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
	 * If the meaning of the '<em>Product Perspective</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Perspective</em>' containment reference.
	 * @see #setProductPerspective(VSSSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_ProductPerspective()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSFixedSection getProductPerspective();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getProductPerspective <em>Product Perspective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Perspective</em>' containment reference.
	 * @see #getProductPerspective()
	 * @generated
	 */
	void setProductPerspective(VSSSFixedSection value);

	/**
	 * Returns the value of the '<em><b>General Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Capabilities</em>' containment reference.
	 * @see #setGeneralCapabilities(VSSSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_GeneralCapabilities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSFixedSection getGeneralCapabilities();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralCapabilities <em>General Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Capabilities</em>' containment reference.
	 * @see #getGeneralCapabilities()
	 * @generated
	 */
	void setGeneralCapabilities(VSSSFixedSection value);

	/**
	 * Returns the value of the '<em><b>General Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Constraints</em>' containment reference.
	 * @see #setGeneralConstraints(VSSSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_GeneralConstraints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSFixedSection getGeneralConstraints();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralConstraints <em>General Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Constraints</em>' containment reference.
	 * @see #getGeneralConstraints()
	 * @generated
	 */
	void setGeneralConstraints(VSSSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Operational Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Environment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Environment</em>' containment reference.
	 * @see #setOperationalEnvironment(VSSSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_OperationalEnvironment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSFixedSection getOperationalEnvironment();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getOperationalEnvironment <em>Operational Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Environment</em>' containment reference.
	 * @see #getOperationalEnvironment()
	 * @generated
	 */
	void setOperationalEnvironment(VSSSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Assumptions Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions Dependencies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions Dependencies</em>' containment reference.
	 * @see #setAssumptionsDependencies(VSSSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSGeneralDescription_AssumptionsDependencies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSFixedSection getAssumptionsDependencies();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getAssumptionsDependencies <em>Assumptions Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumptions Dependencies</em>' containment reference.
	 * @see #getAssumptionsDependencies()
	 * @generated
	 */
	void setAssumptionsDependencies(VSSSFixedSection value);

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VSSSGeneralDescription
