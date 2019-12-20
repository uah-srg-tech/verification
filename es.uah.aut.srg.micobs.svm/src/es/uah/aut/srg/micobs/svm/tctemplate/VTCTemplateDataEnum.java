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

import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnum;
import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnumValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTC Template Data Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateDataEnum#getEnumRef <em>Enum Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateDataEnum#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateDataEnum()
 * @model
 * @generated
 */
public interface VTCTemplateDataEnum extends VTCTemplateData {
	/**
	 * Returns the value of the '<em><b>Enum Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Ref</em>' reference.
	 * @see #setEnumRef(TMTCIFEnum)
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateDataEnum_EnumRef()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFEnum getEnumRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateDataEnum#getEnumRef <em>Enum Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Ref</em>' reference.
	 * @see #getEnumRef()
	 * @generated
	 */
	void setEnumRef(TMTCIFEnum value);

	/**
	 * Returns the value of the '<em><b>Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Ref</em>' reference.
	 * @see #setValueRef(TMTCIFEnumValue)
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateDataEnum_ValueRef()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFEnumValue getValueRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateDataEnum#getValueRef <em>Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ref</em>' reference.
	 * @see #getValueRef()
	 * @generated
	 */
	void setValueRef(TMTCIFEnumValue value);

} // VTCTemplateDataEnum
