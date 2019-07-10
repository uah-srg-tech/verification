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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Step Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs#getInput_level_3 <em>Input level 3</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs#getInput_level_2 <em>Input level 2</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs#getInput_level_1 <em>Input level 1</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs#getInput_level_0 <em>Input level 0</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputs()
 * @model
 * @generated
 */
public interface VSVSStepInputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Input level 3</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input level 3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input level 3</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputs_Input_level_3()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSVSStepInputLevel3> getInput_level_3();

	/**
	 * Returns the value of the '<em><b>Input level 2</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input level 2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input level 2</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputs_Input_level_2()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSVSStepInputLevel2> getInput_level_2();

	/**
	 * Returns the value of the '<em><b>Input level 1</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input level 1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input level 1</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputs_Input_level_1()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSVSStepInputLevel1> getInput_level_1();

	/**
	 * Returns the value of the '<em><b>Input level 0</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input level 0</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input level 0</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputs_Input_level_0()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSVSStepInputLevel0> getInput_level_0();

} // VSVSStepInputs
