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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Introduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction#getSvsInstatiableSubsections <em>Svs Instatiable Subsections</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSIntroduction()
 * @model
 * @generated
 */
public interface VSVSIntroduction extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Svs Instatiable Subsections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svs Instatiable Subsections</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSIntroduction_SvsInstatiableSubsections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VSVSInstantiableSection> getSvsInstatiableSubsections();

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VSVSIntroduction
