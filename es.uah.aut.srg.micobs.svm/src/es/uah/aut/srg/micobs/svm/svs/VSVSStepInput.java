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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Step Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_value <em>Delay value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_unit <em>Delay unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInput()
 * @model
 * @generated
 */
public interface VSVSStepInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInput_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Ref</em>' attribute.
	 * @see #setIfRef(String)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInput_IfRef()
	 * @model required="true"
	 * @generated
	 */
	String getIfRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getIfRef <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Ref</em>' attribute.
	 * @see #getIfRef()
	 * @generated
	 */
	void setIfRef(String value);

	/**
	 * Returns the value of the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay value</em>' attribute.
	 * @see #isSetDelay_value()
	 * @see #unsetDelay_value()
	 * @see #setDelay_value(String)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInput_Delay_value()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getDelay_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_value <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay value</em>' attribute.
	 * @see #isSetDelay_value()
	 * @see #unsetDelay_value()
	 * @see #getDelay_value()
	 * @generated
	 */
	void setDelay_value(String value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_value <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelay_value()
	 * @see #getDelay_value()
	 * @see #setDelay_value(String)
	 * @generated
	 */
	void unsetDelay_value();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_value <em>Delay value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delay value</em>' attribute is set.
	 * @see #unsetDelay_value()
	 * @see #getDelay_value()
	 * @see #setDelay_value(String)
	 * @generated
	 */
	boolean isSetDelay_value();

	/**
	 * Returns the value of the '<em><b>Delay unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay unit</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepUnit
	 * @see #isSetDelay_unit()
	 * @see #unsetDelay_unit()
	 * @see #setDelay_unit(VSVSStepUnit)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInput_Delay_unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	VSVSStepUnit getDelay_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_unit <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay unit</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepUnit
	 * @see #isSetDelay_unit()
	 * @see #unsetDelay_unit()
	 * @see #getDelay_unit()
	 * @generated
	 */
	void setDelay_unit(VSVSStepUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_unit <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelay_unit()
	 * @see #getDelay_unit()
	 * @see #setDelay_unit(VSVSStepUnit)
	 * @generated
	 */
	void unsetDelay_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_unit <em>Delay unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delay unit</em>' attribute is set.
	 * @see #unsetDelay_unit()
	 * @see #getDelay_unit()
	 * @see #setDelay_unit(VSVSStepUnit)
	 * @generated
	 */
	boolean isSetDelay_unit();

} // VSVSStepInput
