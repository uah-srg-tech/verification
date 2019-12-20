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
 * A representation of the model object '<em><b>VSVS Step Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getSelectedAction <em>Selected Action</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getDelay_value <em>Delay value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getDelay_unit <em>Delay unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getSpan_value <em>Span value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getSpan_unit <em>Span unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepAction()
 * @model
 * @generated
 */
public interface VSVSStepAction extends VSVSStepInputs {
	/**
	 * Returns the value of the '<em><b>Selected Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Action</em>' reference.
	 * @see #setSelectedAction(VSVSAction)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepAction_SelectedAction()
	 * @model required="true"
	 * @generated
	 */
	VSVSAction getSelectedAction();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getSelectedAction <em>Selected Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Action</em>' reference.
	 * @see #getSelectedAction()
	 * @generated
	 */
	void setSelectedAction(VSVSAction value);

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
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepAction_Delay_value()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDelay_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getDelay_value <em>Delay value</em>}' attribute.
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
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getDelay_value <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelay_value()
	 * @see #getDelay_value()
	 * @see #setDelay_value(String)
	 * @generated
	 */
	void unsetDelay_value();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getDelay_value <em>Delay value</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay unit</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit
	 * @see #isSetDelay_unit()
	 * @see #unsetDelay_unit()
	 * @see #setDelay_unit(VSVSTimeUnit)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepAction_Delay_unit()
	 * @model unsettable="true"
	 * @generated
	 */
	VSVSTimeUnit getDelay_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getDelay_unit <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay unit</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit
	 * @see #isSetDelay_unit()
	 * @see #unsetDelay_unit()
	 * @see #getDelay_unit()
	 * @generated
	 */
	void setDelay_unit(VSVSTimeUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getDelay_unit <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelay_unit()
	 * @see #getDelay_unit()
	 * @see #setDelay_unit(VSVSTimeUnit)
	 * @generated
	 */
	void unsetDelay_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getDelay_unit <em>Delay unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delay unit</em>' attribute is set.
	 * @see #unsetDelay_unit()
	 * @see #getDelay_unit()
	 * @see #setDelay_unit(VSVSTimeUnit)
	 * @generated
	 */
	boolean isSetDelay_unit();

	/**
	 * Returns the value of the '<em><b>Span value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span value</em>' attribute.
	 * @see #isSetSpan_value()
	 * @see #unsetSpan_value()
	 * @see #setSpan_value(String)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepAction_Span_value()
	 * @model unsettable="true"
	 * @generated
	 */
	String getSpan_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getSpan_value <em>Span value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span value</em>' attribute.
	 * @see #isSetSpan_value()
	 * @see #unsetSpan_value()
	 * @see #getSpan_value()
	 * @generated
	 */
	void setSpan_value(String value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getSpan_value <em>Span value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpan_value()
	 * @see #getSpan_value()
	 * @see #setSpan_value(String)
	 * @generated
	 */
	void unsetSpan_value();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getSpan_value <em>Span value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Span value</em>' attribute is set.
	 * @see #unsetSpan_value()
	 * @see #getSpan_value()
	 * @see #setSpan_value(String)
	 * @generated
	 */
	boolean isSetSpan_value();

	/**
	 * Returns the value of the '<em><b>Span unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span unit</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit
	 * @see #isSetSpan_unit()
	 * @see #unsetSpan_unit()
	 * @see #setSpan_unit(VSVSTimeUnit)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepAction_Span_unit()
	 * @model unsettable="true"
	 * @generated
	 */
	VSVSTimeUnit getSpan_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getSpan_unit <em>Span unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span unit</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit
	 * @see #isSetSpan_unit()
	 * @see #unsetSpan_unit()
	 * @see #getSpan_unit()
	 * @generated
	 */
	void setSpan_unit(VSVSTimeUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getSpan_unit <em>Span unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpan_unit()
	 * @see #getSpan_unit()
	 * @see #setSpan_unit(VSVSTimeUnit)
	 * @generated
	 */
	void unsetSpan_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction#getSpan_unit <em>Span unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Span unit</em>' attribute is set.
	 * @see #unsetSpan_unit()
	 * @see #getSpan_unit()
	 * @see #setSpan_unit(VSVSTimeUnit)
	 * @generated
	 */
	boolean isSetSpan_unit();

} // VSVSStepAction
