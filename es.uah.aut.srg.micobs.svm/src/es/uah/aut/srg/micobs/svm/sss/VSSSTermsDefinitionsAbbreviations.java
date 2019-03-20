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

import es.uah.aut.srg.micobs.doctpl.doc.DSection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Terms Definitions Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getTerms <em>Terms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getAbbreviations <em>Abbreviations</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSTermsDefinitionsAbbreviations()
 * @model
 * @generated
 */
public interface VSSSTermsDefinitionsAbbreviations extends DSection {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSTermsDefinitionsAbbreviations_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSSSTerm> getTerms();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSTermsDefinitionsAbbreviations_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSSSDefinition> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Abbreviations</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSAbbreviation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviations</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSTermsDefinitionsAbbreviations_Abbreviations()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSSSAbbreviation> getAbbreviations();

} // VSSSTermsDefinitionsAbbreviations
