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
package es.uah.aut.srg.micobs.svm.svs;

import es.uah.aut.srg.micobs.doctpl.doc.DFixedSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Test Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getFeaturesToBeTested <em>Features To Be Tested</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getApproachRefinements <em>Approach Refinements</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestDesign()
 * @model
 * @generated
 */
public interface VSVSTestDesign extends DFixedSection {
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
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestDesign_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' containment reference.
	 * @see #setGeneral(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestDesign_General()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getGeneral();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getGeneral <em>General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' containment reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(VSVSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Features To Be Tested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features To Be Tested</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features To Be Tested</em>' containment reference.
	 * @see #setFeaturesToBeTested(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestDesign_FeaturesToBeTested()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getFeaturesToBeTested();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getFeaturesToBeTested <em>Features To Be Tested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features To Be Tested</em>' containment reference.
	 * @see #getFeaturesToBeTested()
	 * @generated
	 */
	void setFeaturesToBeTested(VSVSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Approach Refinements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approach Refinements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approach Refinements</em>' containment reference.
	 * @see #setApproachRefinements(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestDesign_ApproachRefinements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getApproachRefinements();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getApproachRefinements <em>Approach Refinements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approach Refinements</em>' containment reference.
	 * @see #getApproachRefinements()
	 * @generated
	 */
	void setApproachRefinements(VSVSFixedSection value);

} // VSVSTestDesign
