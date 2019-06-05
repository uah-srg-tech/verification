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

import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getInputs <em>Inputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getPassFailCriteria <em>Pass Fail Criteria</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getEnvironmentalNeeds <em>Environmental Needs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getSpecialConstraints <em>Special Constraints</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getInterfaceDependencies <em>Interface Dependencies</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestCase()
 * @model
 * @generated
 */
public interface VSVSTestCase extends VValidationDocumentAbstractItem, DFixedSection {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestCase_Identifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getIdentifier();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(VSVSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestCase_Inputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getInputs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(VSVSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference.
	 * @see #setOutputs(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestCase_Outputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getOutputs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getOutputs <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs</em>' containment reference.
	 * @see #getOutputs()
	 * @generated
	 */
	void setOutputs(VSVSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Pass Fail Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pass Fail Criteria</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass Fail Criteria</em>' containment reference.
	 * @see #setPassFailCriteria(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestCase_PassFailCriteria()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getPassFailCriteria();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getPassFailCriteria <em>Pass Fail Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Fail Criteria</em>' containment reference.
	 * @see #getPassFailCriteria()
	 * @generated
	 */
	void setPassFailCriteria(VSVSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Environmental Needs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environmental Needs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environmental Needs</em>' containment reference.
	 * @see #setEnvironmentalNeeds(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestCase_EnvironmentalNeeds()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getEnvironmentalNeeds();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getEnvironmentalNeeds <em>Environmental Needs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environmental Needs</em>' containment reference.
	 * @see #getEnvironmentalNeeds()
	 * @generated
	 */
	void setEnvironmentalNeeds(VSVSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Special Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Constraints</em>' containment reference.
	 * @see #setSpecialConstraints(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestCase_SpecialConstraints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getSpecialConstraints();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getSpecialConstraints <em>Special Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Constraints</em>' containment reference.
	 * @see #getSpecialConstraints()
	 * @generated
	 */
	void setSpecialConstraints(VSVSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Interface Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Dependencies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Dependencies</em>' containment reference.
	 * @see #setInterfaceDependencies(VSVSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTestCase_InterfaceDependencies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSFixedSection getInterfaceDependencies();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getInterfaceDependencies <em>Interface Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Dependencies</em>' containment reference.
	 * @see #getInterfaceDependencies()
	 * @generated
	 */
	void setInterfaceDependencies(VSVSFixedSection value);

} // VSVSTestCase
