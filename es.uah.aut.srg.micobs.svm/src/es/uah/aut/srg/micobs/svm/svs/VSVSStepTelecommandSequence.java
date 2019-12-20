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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Step Telecommand Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandSequence#getTelecommand <em>Telecommand</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelecommandSequence()
 * @model
 * @generated
 */
public interface VSVSStepTelecommandSequence extends VSVSStepInputs {
	/**
	 * Returns the value of the '<em><b>Telecommand</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telecommand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telecommand</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelecommandSequence_Telecommand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VSVSStepTelecommand> getTelecommand();

} // VSVSStepTelecommandSequence
