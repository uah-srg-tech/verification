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

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Step Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter#getApply_def_filter <em>Apply def filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter#getExtra_filter <em>Extra filter</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepFilter()
 * @model
 * @generated
 */
public interface VSVSStepFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Apply def filter</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply def filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply def filter</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo
	 * @see #isSetApply_def_filter()
	 * @see #unsetApply_def_filter()
	 * @see #setApply_def_filter(VSVSStepYesNo)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepFilter_Apply_def_filter()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	VSVSStepYesNo getApply_def_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter#getApply_def_filter <em>Apply def filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply def filter</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo
	 * @see #isSetApply_def_filter()
	 * @see #unsetApply_def_filter()
	 * @see #getApply_def_filter()
	 * @generated
	 */
	void setApply_def_filter(VSVSStepYesNo value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter#getApply_def_filter <em>Apply def filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApply_def_filter()
	 * @see #getApply_def_filter()
	 * @see #setApply_def_filter(VSVSStepYesNo)
	 * @generated
	 */
	void unsetApply_def_filter();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter#getApply_def_filter <em>Apply def filter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Apply def filter</em>' attribute is set.
	 * @see #unsetApply_def_filter()
	 * @see #getApply_def_filter()
	 * @see #setApply_def_filter(VSVSStepYesNo)
	 * @generated
	 */
	boolean isSetApply_def_filter();

	/**
	 * Returns the value of the '<em><b>Extra filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra filter</em>' reference.
	 * @see #setExtra_filter(TMTCIFFilterFilter)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepFilter_Extra_filter()
	 * @model
	 * @generated
	 */
	TMTCIFFilterFilter getExtra_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter#getExtra_filter <em>Extra filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra filter</em>' reference.
	 * @see #getExtra_filter()
	 * @generated
	 */
	void setExtra_filter(TMTCIFFilterFilter value);

} // VSVSStepFilter
