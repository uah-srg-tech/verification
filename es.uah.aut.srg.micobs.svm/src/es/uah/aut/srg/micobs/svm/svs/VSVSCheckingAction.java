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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Checking Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSCheckingAction#getChecking_period_value <em>Checking period value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSCheckingAction#getChecking_period_unit <em>Checking period unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSCheckingAction()
 * @model
 * @generated
 */
public interface VSVSCheckingAction extends VSVSAction {
	/**
	 * Returns the value of the '<em><b>Checking period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checking period value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checking period value</em>' attribute.
	 * @see #isSetChecking_period_value()
	 * @see #unsetChecking_period_value()
	 * @see #setChecking_period_value(String)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSCheckingAction_Checking_period_value()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getChecking_period_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSCheckingAction#getChecking_period_value <em>Checking period value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checking period value</em>' attribute.
	 * @see #isSetChecking_period_value()
	 * @see #unsetChecking_period_value()
	 * @see #getChecking_period_value()
	 * @generated
	 */
	void setChecking_period_value(String value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSCheckingAction#getChecking_period_value <em>Checking period value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChecking_period_value()
	 * @see #getChecking_period_value()
	 * @see #setChecking_period_value(String)
	 * @generated
	 */
	void unsetChecking_period_value();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSCheckingAction#getChecking_period_value <em>Checking period value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Checking period value</em>' attribute is set.
	 * @see #unsetChecking_period_value()
	 * @see #getChecking_period_value()
	 * @see #setChecking_period_value(String)
	 * @generated
	 */
	boolean isSetChecking_period_value();

	/**
	 * Returns the value of the '<em><b>Checking period unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checking period unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checking period unit</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit
	 * @see #isSetChecking_period_unit()
	 * @see #unsetChecking_period_unit()
	 * @see #setChecking_period_unit(VSVSTimeUnit)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSCheckingAction_Checking_period_unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	VSVSTimeUnit getChecking_period_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSCheckingAction#getChecking_period_unit <em>Checking period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checking period unit</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit
	 * @see #isSetChecking_period_unit()
	 * @see #unsetChecking_period_unit()
	 * @see #getChecking_period_unit()
	 * @generated
	 */
	void setChecking_period_unit(VSVSTimeUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSCheckingAction#getChecking_period_unit <em>Checking period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChecking_period_unit()
	 * @see #getChecking_period_unit()
	 * @see #setChecking_period_unit(VSVSTimeUnit)
	 * @generated
	 */
	void unsetChecking_period_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSCheckingAction#getChecking_period_unit <em>Checking period unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Checking period unit</em>' attribute is set.
	 * @see #unsetChecking_period_unit()
	 * @see #getChecking_period_unit()
	 * @see #setChecking_period_unit(VSVSTimeUnit)
	 * @generated
	 */
	boolean isSetChecking_period_unit();

} // VSVSCheckingAction
