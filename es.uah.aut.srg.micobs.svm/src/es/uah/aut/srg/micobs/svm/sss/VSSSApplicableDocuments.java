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
package es.uah.aut.srg.micobs.svm.sss;

import es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DSection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Applicable Documents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments#getApplicableDocuments <em>Applicable Documents</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSApplicableDocuments()
 * @model
 * @generated
 */
public interface VSSSApplicableDocuments extends DSection {
	/**
	 * Returns the value of the '<em><b>Applicable Documents</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Documents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Documents</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSApplicableDocuments_ApplicableDocuments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DApplicableDocument> getApplicableDocuments();

} // VSSSApplicableDocuments
