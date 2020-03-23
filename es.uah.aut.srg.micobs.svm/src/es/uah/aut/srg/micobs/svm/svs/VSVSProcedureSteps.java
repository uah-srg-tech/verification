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
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Procedure Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps#getStep <em>Step</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps#getPriorActionOverVariable <em>Prior Action Over Variable</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureSteps()
 * @model
 * @generated
 */
public interface VSVSProcedureSteps extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureSteps_Step()
	 * @model containment="true" required="true" upper="1900"
	 * @generated
	 */
	EList<VSVSProcedureStep> getStep();

	/**
	 * Returns the value of the '<em><b>Prior Action Over Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Action Over Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Action Over Variable</em>' reference.
	 * @see #setPriorActionOverVariable(VTestSetupSupportedActionOverVariable)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureSteps_PriorActionOverVariable()
	 * @model
	 * @generated
	 */
	VTestSetupSupportedActionOverVariable getPriorActionOverVariable();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps#getPriorActionOverVariable <em>Prior Action Over Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Action Over Variable</em>' reference.
	 * @see #getPriorActionOverVariable()
	 * @generated
	 */
	void setPriorActionOverVariable(VTestSetupSupportedActionOverVariable value);

} // VSVSProcedureSteps
