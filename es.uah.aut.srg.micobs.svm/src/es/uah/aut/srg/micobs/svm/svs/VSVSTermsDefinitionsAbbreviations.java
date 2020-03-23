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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Terms Definitions Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations#getTerms <em>Terms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations#getAbbreviations <em>Abbreviations</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTermsDefinitionsAbbreviations()
 * @model
 * @generated
 */
public interface VSVSTermsDefinitionsAbbreviations extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTermsDefinitionsAbbreviations_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSVSTerm> getTerms();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTermsDefinitionsAbbreviations_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSVSDefinition> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Abbreviations</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSAbbreviation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviations</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSTermsDefinitionsAbbreviations_Abbreviations()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSVSAbbreviation> getAbbreviations();

} // VSVSTermsDefinitionsAbbreviations
