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

import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueRaw;

import es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Step Telemetry Header Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeaderField#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeaderField#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelemetryHeaderField()
 * @model
 * @generated
 */
public interface VSVSStepTelemetryHeaderField extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Ref</em>' reference.
	 * @see #setFieldRef(TMTCIFTMHeaderField)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelemetryHeaderField_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFTMHeaderField getFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeaderField#getFieldRef <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' reference.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(TMTCIFTMHeaderField value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(TMTCIFFieldValueRaw)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepTelemetryHeaderField_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFFieldValueRaw getValue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeaderField#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TMTCIFFieldValueRaw value);

} // VSVSStepTelemetryHeaderField
