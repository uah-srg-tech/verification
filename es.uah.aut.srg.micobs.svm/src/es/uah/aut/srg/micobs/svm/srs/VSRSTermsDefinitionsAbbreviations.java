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
package es.uah.aut.srg.micobs.svm.srs;

import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSRS Terms Definitions Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations#getTerms <em>Terms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations#getAbbreviations <em>Abbreviations</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSTermsDefinitionsAbbreviations()
 * @model
 * @generated
 */
public interface VSRSTermsDefinitionsAbbreviations extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.srs.VSRSTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSTermsDefinitionsAbbreviations_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSRSTerm> getTerms();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.srs.VSRSDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSTermsDefinitionsAbbreviations_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSRSDefinition> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Abbreviations</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.srs.VSRSAbbreviation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviations</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSTermsDefinitionsAbbreviations_Abbreviations()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSRSAbbreviation> getAbbreviations();

} // VSRSTermsDefinitionsAbbreviations
