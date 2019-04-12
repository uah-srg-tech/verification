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

import es.uah.aut.srg.micobs.doctpl.doc.DFixedSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSRS Software Overview</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getFunctionPurpose <em>Function Purpose</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getEnvironmentalConsideration <em>Environmental Consideration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getRelationOtherSystems <em>Relation Other Systems</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSSoftwareOverview()
 * @model
 * @generated
 */
public interface VSRSSoftwareOverview extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Function Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Purpose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Purpose</em>' containment reference.
	 * @see #setFunctionPurpose(VSRSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSSoftwareOverview_FunctionPurpose()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSFixedSection getFunctionPurpose();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getFunctionPurpose <em>Function Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Purpose</em>' containment reference.
	 * @see #getFunctionPurpose()
	 * @generated
	 */
	void setFunctionPurpose(VSRSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Environmental Consideration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environmental Consideration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environmental Consideration</em>' containment reference.
	 * @see #setEnvironmentalConsideration(VSRSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSSoftwareOverview_EnvironmentalConsideration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSFixedSection getEnvironmentalConsideration();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getEnvironmentalConsideration <em>Environmental Consideration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environmental Consideration</em>' containment reference.
	 * @see #getEnvironmentalConsideration()
	 * @generated
	 */
	void setEnvironmentalConsideration(VSRSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Relation Other Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Other Systems</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Other Systems</em>' containment reference.
	 * @see #setRelationOtherSystems(VSRSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSSoftwareOverview_RelationOtherSystems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSFixedSection getRelationOtherSystems();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getRelationOtherSystems <em>Relation Other Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Other Systems</em>' containment reference.
	 * @see #getRelationOtherSystems()
	 * @generated
	 */
	void setRelationOtherSystems(VSRSFixedSection value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(VSRSFixedSection)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSSoftwareOverview_Constraints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSFixedSection getConstraints();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(VSRSFixedSection value);

} // VSRSSoftwareOverview
