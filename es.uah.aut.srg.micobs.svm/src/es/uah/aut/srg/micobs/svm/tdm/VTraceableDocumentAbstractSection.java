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
package es.uah.aut.srg.micobs.svm.tdm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTraceable Document Abstract Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentAbstractSection()
 * @model
 * @generated
 */
public interface VTraceableDocumentAbstractSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVTraceableDocumentAbstractSection_Group()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<VTraceableDocumentAbstractGroup> getGroup();

} // VTraceableDocumentAbstractSection
