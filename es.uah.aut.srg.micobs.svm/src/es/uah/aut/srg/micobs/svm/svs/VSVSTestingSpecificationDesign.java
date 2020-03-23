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

import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Testing Specification Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign#getTestSetup <em>Test Setup</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign#getTestDesigns <em>Test Designs</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestingSpecificationDesign()
 * @model
 * @generated
 */
public interface VSVSTestingSpecificationDesign extends DFixedSection {
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
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestingSpecificationDesign_General()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getGeneral();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign#getGeneral <em>General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' containment reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(VSVSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Test Setup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Setup</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Setup</em>' reference.
	 * @see #setTestSetup(VTestSetupDocument)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestingSpecificationDesign_TestSetup()
	 * @model required="true"
	 * @generated
	 */
	VTestSetupDocument getTestSetup();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign#getTestSetup <em>Test Setup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Setup</em>' reference.
	 * @see #getTestSetup()
	 * @generated
	 */
	void setTestSetup(VTestSetupDocument value);

	/**
	 * Returns the value of the '<em><b>Test Designs</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Designs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Designs</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestingSpecificationDesign_TestDesigns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VSVSTestDesign> getTestDesigns();

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VSVSTestingSpecificationDesign
