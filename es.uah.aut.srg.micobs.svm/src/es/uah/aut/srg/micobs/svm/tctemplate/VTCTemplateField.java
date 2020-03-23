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

import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValue;
import es.uah.aut.srg.tmtcif.tc.TMTCIFTCField;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTC Template Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateField()
 * @model
 * @generated
 */
public interface VTCTemplateField extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Ref</em>' reference.
	 * @see #setFieldRef(TMTCIFTCField)
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateField_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFTCField getFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField#getFieldRef <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' reference.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(TMTCIFTCField value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(TMTCIFFieldValue)
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplateField_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFFieldValue getValue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TMTCIFFieldValue value);

} // VTCTemplateField
