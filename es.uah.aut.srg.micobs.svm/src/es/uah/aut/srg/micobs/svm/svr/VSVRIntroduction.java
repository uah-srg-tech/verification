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
package es.uah.aut.srg.micobs.svm.svr;

import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVR Introduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRIntroduction#getSvrInstatiableSubsections <em>Svr Instatiable Subsections</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRIntroduction()
 * @model
 * @generated
 */
public interface VSVRIntroduction extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Svr Instatiable Subsections</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Svr Instatiable Subsections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svr Instatiable Subsections</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRIntroduction_SvrInstatiableSubsections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VSVRInstantiableSection> getSvrInstatiableSubsections();

	Collection<? extends DReferenceableObject> getReferenceableObjects(String referenceableObjectType);

} // VSVRIntroduction
