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
 * A representation of the model object '<em><b>VSVS Step Configurations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfigurations#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepConfigurations()
 * @model
 * @generated
 */
public interface VSVSStepConfigurations extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepConfigurations_Configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VSVSStepConfiguration> getConfiguration();

} // VSVSStepConfigurations
