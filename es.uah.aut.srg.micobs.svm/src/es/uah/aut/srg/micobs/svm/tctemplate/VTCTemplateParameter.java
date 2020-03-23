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
package es.uah.aut.srg.micobs.svm.tctemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTC Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateParameter#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateParameter()
 * @model
 * @generated
 */
public interface VTCTemplateParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(VTCTemplateData)
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateParameter_Data()
	 * @model required="true"
	 * @generated
	 */
	VTCTemplateData getData();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateParameter#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(VTCTemplateData value);

} // VTCTemplateParameter
