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

import es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Step Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepFilterImpl#getApply_def_filter <em>Apply def filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepFilterImpl#getExtra_filter <em>Extra filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepFilterImpl extends MinimalEObjectImpl.Container implements VSVSStepFilter {
	/**
	 * The default value of the '{@link #getApply_def_filter() <em>Apply def filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply_def_filter()
	 * @generated
	 * @ordered
	 */
	protected static final VSVSStepYesNo APPLY_DEF_FILTER_EDEFAULT = VSVSStepYesNo.YES;

	/**
	 * The cached value of the '{@link #getApply_def_filter() <em>Apply def filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply_def_filter()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepYesNo apply_def_filter = APPLY_DEF_FILTER_EDEFAULT;

	/**
	 * This is true if the Apply def filter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean apply_def_filterESet;

	/**
	 * The cached value of the '{@link #getExtra_filter() <em>Extra filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtra_filter()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFilterFilter extra_filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepYesNo getApply_def_filter() {
		return apply_def_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApply_def_filter(VSVSStepYesNo newApply_def_filter) {
		VSVSStepYesNo oldApply_def_filter = apply_def_filter;
		apply_def_filter = newApply_def_filter == null ? APPLY_DEF_FILTER_EDEFAULT : newApply_def_filter;
		boolean oldApply_def_filterESet = apply_def_filterESet;
		apply_def_filterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_FILTER__APPLY_DEF_FILTER, oldApply_def_filter, apply_def_filter, !oldApply_def_filterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApply_def_filter() {
		VSVSStepYesNo oldApply_def_filter = apply_def_filter;
		boolean oldApply_def_filterESet = apply_def_filterESet;
		apply_def_filter = APPLY_DEF_FILTER_EDEFAULT;
		apply_def_filterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_FILTER__APPLY_DEF_FILTER, oldApply_def_filter, APPLY_DEF_FILTER_EDEFAULT, oldApply_def_filterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApply_def_filter() {
		return apply_def_filterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterFilter getExtra_filter() {
		if (extra_filter != null && extra_filter.eIsProxy()) {
			InternalEObject oldExtra_filter = (InternalEObject)extra_filter;
			extra_filter = (TMTCIFFilterFilter)eResolveProxy(oldExtra_filter);
			if (extra_filter != oldExtra_filter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_FILTER__EXTRA_FILTER, oldExtra_filter, extra_filter));
			}
		}
		return extra_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterFilter basicGetExtra_filter() {
		return extra_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtra_filter(TMTCIFFilterFilter newExtra_filter) {
		TMTCIFFilterFilter oldExtra_filter = extra_filter;
		extra_filter = newExtra_filter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_FILTER__EXTRA_FILTER, oldExtra_filter, extra_filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_FILTER__APPLY_DEF_FILTER:
				return getApply_def_filter();
			case svsPackage.VSVS_STEP_FILTER__EXTRA_FILTER:
				if (resolve) return getExtra_filter();
				return basicGetExtra_filter();
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
			case svsPackage.VSVS_STEP_FILTER__APPLY_DEF_FILTER:
				setApply_def_filter((VSVSStepYesNo)newValue);
				return;
			case svsPackage.VSVS_STEP_FILTER__EXTRA_FILTER:
				setExtra_filter((TMTCIFFilterFilter)newValue);
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
			case svsPackage.VSVS_STEP_FILTER__APPLY_DEF_FILTER:
				unsetApply_def_filter();
				return;
			case svsPackage.VSVS_STEP_FILTER__EXTRA_FILTER:
				setExtra_filter((TMTCIFFilterFilter)null);
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
			case svsPackage.VSVS_STEP_FILTER__APPLY_DEF_FILTER:
				return isSetApply_def_filter();
			case svsPackage.VSVS_STEP_FILTER__EXTRA_FILTER:
				return extra_filter != null;
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
		result.append(" (apply_def_filter: ");
		if (apply_def_filterESet) result.append(apply_def_filter); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VSVSStepFilterImpl
