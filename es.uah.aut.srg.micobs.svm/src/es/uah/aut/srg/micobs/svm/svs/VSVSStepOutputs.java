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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Step Outputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getCheckmode <em>Checkmode</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getValid_time_interval_value <em>Valid time interval value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getValid_time_interval_unit <em>Valid time interval unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepOutputs()
 * @model
 * @generated
 */
public interface VSVSStepOutputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Checkmode</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputsCheckmode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkmode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkmode</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputsCheckmode
	 * @see #isSetCheckmode()
	 * @see #unsetCheckmode()
	 * @see #setCheckmode(VSVSStepOutputsCheckmode)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepOutputs_Checkmode()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	VSVSStepOutputsCheckmode getCheckmode();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getCheckmode <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkmode</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputsCheckmode
	 * @see #isSetCheckmode()
	 * @see #unsetCheckmode()
	 * @see #getCheckmode()
	 * @generated
	 */
	void setCheckmode(VSVSStepOutputsCheckmode value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getCheckmode <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCheckmode()
	 * @see #getCheckmode()
	 * @see #setCheckmode(VSVSStepOutputsCheckmode)
	 * @generated
	 */
	void unsetCheckmode();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getCheckmode <em>Checkmode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Checkmode</em>' attribute is set.
	 * @see #unsetCheckmode()
	 * @see #getCheckmode()
	 * @see #setCheckmode(VSVSStepOutputsCheckmode)
	 * @generated
	 */
	boolean isSetCheckmode();

	/**
	 * Returns the value of the '<em><b>Valid time interval value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid time interval value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid time interval value</em>' attribute.
	 * @see #setValid_time_interval_value(String)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepOutputs_Valid_time_interval_value()
	 * @model required="true"
	 * @generated
	 */
	String getValid_time_interval_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getValid_time_interval_value <em>Valid time interval value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid time interval value</em>' attribute.
	 * @see #getValid_time_interval_value()
	 * @generated
	 */
	void setValid_time_interval_value(String value);

	/**
	 * Returns the value of the '<em><b>Valid time interval unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid time interval unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid time interval unit</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit
	 * @see #isSetValid_time_interval_unit()
	 * @see #unsetValid_time_interval_unit()
	 * @see #setValid_time_interval_unit(VSVSTimeUnit)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepOutputs_Valid_time_interval_unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	VSVSTimeUnit getValid_time_interval_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getValid_time_interval_unit <em>Valid time interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid time interval unit</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit
	 * @see #isSetValid_time_interval_unit()
	 * @see #unsetValid_time_interval_unit()
	 * @see #getValid_time_interval_unit()
	 * @generated
	 */
	void setValid_time_interval_unit(VSVSTimeUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getValid_time_interval_unit <em>Valid time interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValid_time_interval_unit()
	 * @see #getValid_time_interval_unit()
	 * @see #setValid_time_interval_unit(VSVSTimeUnit)
	 * @generated
	 */
	void unsetValid_time_interval_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getValid_time_interval_unit <em>Valid time interval unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valid time interval unit</em>' attribute is set.
	 * @see #unsetValid_time_interval_unit()
	 * @see #getValid_time_interval_unit()
	 * @see #setValid_time_interval_unit(VSVSTimeUnit)
	 * @generated
	 */
	boolean isSetValid_time_interval_unit();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepOutputs_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VSVSStepOutput> getOutput();

} // VSVSStepOutputs
