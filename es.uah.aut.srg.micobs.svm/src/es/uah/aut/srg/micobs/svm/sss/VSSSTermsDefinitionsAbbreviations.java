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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Terms Definitions Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getVSSSTerm <em>VSSS Term</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getVSSSDefinition <em>VSSS Definition</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getVSSSAbbreviation <em>VSSS Abbreviation</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSTermsDefinitionsAbbreviations()
 * @model
 * @generated
 */
public interface VSSSTermsDefinitionsAbbreviations extends EObject {
	/**
	 * Returns the value of the '<em><b>VSSS Term</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS Term</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS Term</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSTermsDefinitionsAbbreviations_VSSSTerm()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSTerm();

	/**
	 * Returns the value of the '<em><b>VSSS Definition</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS Definition</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS Definition</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSTermsDefinitionsAbbreviations_VSSSDefinition()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSDefinition();

	/**
	 * Returns the value of the '<em><b>VSSS Abbreviation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSSS Abbreviation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSSS Abbreviation</em>' attribute list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSTermsDefinitionsAbbreviations_VSSSAbbreviation()
	 * @model
	 * @generated
	 */
	EList<String> getVSSSAbbreviation();

} // VSSSTermsDefinitionsAbbreviations
