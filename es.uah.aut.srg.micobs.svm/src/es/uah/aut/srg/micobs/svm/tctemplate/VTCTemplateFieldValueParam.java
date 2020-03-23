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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTC Template Field Value Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateFieldValueParam#getParamRef <em>Param Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateFieldValueParam()
 * @model
 * @generated
 */
public interface VTCTemplateFieldValueParam extends VTCTemplateFieldValue {
	/**
	 * Returns the value of the '<em><b>Param Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Ref</em>' reference.
	 * @see #setParamRef(VTCTemplateParam)
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateFieldValueParam_ParamRef()
	 * @model required="true"
	 * @generated
	 */
	VTCTemplateParam getParamRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateFieldValueParam#getParamRef <em>Param Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Ref</em>' reference.
	 * @see #getParamRef()
	 * @generated
	 */
	void setParamRef(VTCTemplateParam value);

} // VTCTemplateFieldValueParam
