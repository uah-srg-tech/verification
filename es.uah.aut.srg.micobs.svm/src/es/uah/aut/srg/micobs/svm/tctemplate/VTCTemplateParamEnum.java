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
 * A representation of the model object '<em><b>VTC Template Param Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateParamEnum#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateParamEnum()
 * @model
 * @generated
 */
public interface VTCTemplateParamEnum extends VTCTemplateParam {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateParamEnum_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateParamEnum#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // VTCTemplateParamEnum
