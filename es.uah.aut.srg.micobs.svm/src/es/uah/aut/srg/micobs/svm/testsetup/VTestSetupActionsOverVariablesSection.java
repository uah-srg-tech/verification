/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.micobs.svm.testsetup;

import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTest Setup Actions Over Variables Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsOverVariablesSection#getActionOverVariable <em>Action Over Variable</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupActionsOverVariablesSection()
 * @model
 * @generated
 */
public interface VTestSetupActionsOverVariablesSection extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Action Over Variable</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Over Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Over Variable</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupActionsOverVariablesSection_ActionOverVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VTestSetupActionOverVariable> getActionOverVariable();

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VTestSetupActionsOverVariablesSection
