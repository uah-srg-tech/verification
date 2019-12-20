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
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Scenario Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection#getSupportedInterface <em>Supported Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection#getSelectedConfiguration <em>Selected Configuration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection#getSupportedAction <em>Supported Action</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSScenarioSection()
 * @model
 * @generated
 */
public interface VSVSScenarioSection extends VSVSInstantiableSection {
	/**
	 * Returns the value of the '<em><b>Supported Interface</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Interface</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSScenarioSection_SupportedInterface()
	 * @model required="true"
	 * @generated
	 */
	EList<VSVSInterface> getSupportedInterface();

	/**
	 * Returns the value of the '<em><b>Selected Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSSelectedConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Configuration</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSScenarioSection_SelectedConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSVSSelectedConfiguration> getSelectedConfiguration();

	/**
	 * Returns the value of the '<em><b>Supported Action</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Action</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSScenarioSection_SupportedAction()
	 * @model
	 * @generated
	 */
	EList<VSVSAction> getSupportedAction();

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VSVSScenarioSection
