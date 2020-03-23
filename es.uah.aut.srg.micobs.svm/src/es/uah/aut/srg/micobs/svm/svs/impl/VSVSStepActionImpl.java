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
package es.uah.aut.srg.micobs.svm.svs.impl;

import es.uah.aut.srg.micobs.svm.svs.VSVSStepAction;
import es.uah.aut.srg.micobs.svm.svs.VSVSTimeUnit;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Step Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepActionImpl#getSelectedAction <em>Selected Action</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepActionImpl#getDelay_value <em>Delay value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepActionImpl#getDelay_unit <em>Delay unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepActionImpl#getSpan_value <em>Span value</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepActionImpl#getSpan_unit <em>Span unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepActionImpl extends VSVSStepInputsImpl implements VSVSStepAction {
	/**
	 * The cached value of the '{@link #getSelectedAction() <em>Selected Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedAction()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupAction selectedAction;

	/**
	 * The default value of the '{@link #getDelay_value() <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_value()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay_value() <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_value()
	 * @generated
	 * @ordered
	 */
	protected String delay_value = DELAY_VALUE_EDEFAULT;

	/**
	 * This is true if the Delay value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delay_valueESet;

	/**
	 * The default value of the '{@link #getDelay_unit() <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_unit()
	 * @generated
	 * @ordered
	 */
	protected static final VSVSTimeUnit DELAY_UNIT_EDEFAULT = VSVSTimeUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getDelay_unit() <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_unit()
	 * @generated
	 * @ordered
	 */
	protected VSVSTimeUnit delay_unit = DELAY_UNIT_EDEFAULT;

	/**
	 * This is true if the Delay unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delay_unitESet;

	/**
	 * The default value of the '{@link #getSpan_value() <em>Span value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan_value()
	 * @generated
	 * @ordered
	 */
	protected static final String SPAN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpan_value() <em>Span value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan_value()
	 * @generated
	 * @ordered
	 */
	protected String span_value = SPAN_VALUE_EDEFAULT;

	/**
	 * This is true if the Span value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean span_valueESet;

	/**
	 * The default value of the '{@link #getSpan_unit() <em>Span unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan_unit()
	 * @generated
	 * @ordered
	 */
	protected static final VSVSTimeUnit SPAN_UNIT_EDEFAULT = VSVSTimeUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getSpan_unit() <em>Span unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan_unit()
	 * @generated
	 * @ordered
	 */
	protected VSVSTimeUnit span_unit = SPAN_UNIT_EDEFAULT;

	/**
	 * This is true if the Span unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean span_unitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupAction getSelectedAction() {
		if (selectedAction != null && selectedAction.eIsProxy()) {
			InternalEObject oldSelectedAction = (InternalEObject)selectedAction;
			selectedAction = (VTestSetupAction)eResolveProxy(oldSelectedAction);
			if (selectedAction != oldSelectedAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_ACTION__SELECTED_ACTION, oldSelectedAction, selectedAction));
			}
		}
		return selectedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupAction basicGetSelectedAction() {
		return selectedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedAction(VTestSetupAction newSelectedAction) {
		VTestSetupAction oldSelectedAction = selectedAction;
		selectedAction = newSelectedAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_ACTION__SELECTED_ACTION, oldSelectedAction, selectedAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelay_value() {
		return delay_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay_value(String newDelay_value) {
		String oldDelay_value = delay_value;
		delay_value = newDelay_value;
		boolean oldDelay_valueESet = delay_valueESet;
		delay_valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_ACTION__DELAY_VALUE, oldDelay_value, delay_value, !oldDelay_valueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelay_value() {
		String oldDelay_value = delay_value;
		boolean oldDelay_valueESet = delay_valueESet;
		delay_value = DELAY_VALUE_EDEFAULT;
		delay_valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_ACTION__DELAY_VALUE, oldDelay_value, DELAY_VALUE_EDEFAULT, oldDelay_valueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelay_value() {
		return delay_valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTimeUnit getDelay_unit() {
		return delay_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay_unit(VSVSTimeUnit newDelay_unit) {
		VSVSTimeUnit oldDelay_unit = delay_unit;
		delay_unit = newDelay_unit == null ? DELAY_UNIT_EDEFAULT : newDelay_unit;
		boolean oldDelay_unitESet = delay_unitESet;
		delay_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_ACTION__DELAY_UNIT, oldDelay_unit, delay_unit, !oldDelay_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelay_unit() {
		VSVSTimeUnit oldDelay_unit = delay_unit;
		boolean oldDelay_unitESet = delay_unitESet;
		delay_unit = DELAY_UNIT_EDEFAULT;
		delay_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_ACTION__DELAY_UNIT, oldDelay_unit, DELAY_UNIT_EDEFAULT, oldDelay_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelay_unit() {
		return delay_unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpan_value() {
		return span_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan_value(String newSpan_value) {
		String oldSpan_value = span_value;
		span_value = newSpan_value;
		boolean oldSpan_valueESet = span_valueESet;
		span_valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_ACTION__SPAN_VALUE, oldSpan_value, span_value, !oldSpan_valueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpan_value() {
		String oldSpan_value = span_value;
		boolean oldSpan_valueESet = span_valueESet;
		span_value = SPAN_VALUE_EDEFAULT;
		span_valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_ACTION__SPAN_VALUE, oldSpan_value, SPAN_VALUE_EDEFAULT, oldSpan_valueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpan_value() {
		return span_valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTimeUnit getSpan_unit() {
		return span_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan_unit(VSVSTimeUnit newSpan_unit) {
		VSVSTimeUnit oldSpan_unit = span_unit;
		span_unit = newSpan_unit == null ? SPAN_UNIT_EDEFAULT : newSpan_unit;
		boolean oldSpan_unitESet = span_unitESet;
		span_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_ACTION__SPAN_UNIT, oldSpan_unit, span_unit, !oldSpan_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpan_unit() {
		VSVSTimeUnit oldSpan_unit = span_unit;
		boolean oldSpan_unitESet = span_unitESet;
		span_unit = SPAN_UNIT_EDEFAULT;
		span_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_ACTION__SPAN_UNIT, oldSpan_unit, SPAN_UNIT_EDEFAULT, oldSpan_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpan_unit() {
		return span_unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_ACTION__SELECTED_ACTION:
				if (resolve) return getSelectedAction();
				return basicGetSelectedAction();
			case svsPackage.VSVS_STEP_ACTION__DELAY_VALUE:
				return getDelay_value();
			case svsPackage.VSVS_STEP_ACTION__DELAY_UNIT:
				return getDelay_unit();
			case svsPackage.VSVS_STEP_ACTION__SPAN_VALUE:
				return getSpan_value();
			case svsPackage.VSVS_STEP_ACTION__SPAN_UNIT:
				return getSpan_unit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_ACTION__SELECTED_ACTION:
				setSelectedAction((VTestSetupAction)newValue);
				return;
			case svsPackage.VSVS_STEP_ACTION__DELAY_VALUE:
				setDelay_value((String)newValue);
				return;
			case svsPackage.VSVS_STEP_ACTION__DELAY_UNIT:
				setDelay_unit((VSVSTimeUnit)newValue);
				return;
			case svsPackage.VSVS_STEP_ACTION__SPAN_VALUE:
				setSpan_value((String)newValue);
				return;
			case svsPackage.VSVS_STEP_ACTION__SPAN_UNIT:
				setSpan_unit((VSVSTimeUnit)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_ACTION__SELECTED_ACTION:
				setSelectedAction((VTestSetupAction)null);
				return;
			case svsPackage.VSVS_STEP_ACTION__DELAY_VALUE:
				unsetDelay_value();
				return;
			case svsPackage.VSVS_STEP_ACTION__DELAY_UNIT:
				unsetDelay_unit();
				return;
			case svsPackage.VSVS_STEP_ACTION__SPAN_VALUE:
				unsetSpan_value();
				return;
			case svsPackage.VSVS_STEP_ACTION__SPAN_UNIT:
				unsetSpan_unit();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_ACTION__SELECTED_ACTION:
				return selectedAction != null;
			case svsPackage.VSVS_STEP_ACTION__DELAY_VALUE:
				return isSetDelay_value();
			case svsPackage.VSVS_STEP_ACTION__DELAY_UNIT:
				return isSetDelay_unit();
			case svsPackage.VSVS_STEP_ACTION__SPAN_VALUE:
				return isSetSpan_value();
			case svsPackage.VSVS_STEP_ACTION__SPAN_UNIT:
				return isSetSpan_unit();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (delay_value: ");
		if (delay_valueESet) result.append(delay_value); else result.append("<unset>");
		result.append(", delay_unit: ");
		if (delay_unitESet) result.append(delay_unit); else result.append("<unset>");
		result.append(", span_value: ");
		if (span_valueESet) result.append(span_value); else result.append("<unset>");
		result.append(", span_unit: ");
		if (span_unitESet) result.append(span_unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VSVSStepActionImpl
