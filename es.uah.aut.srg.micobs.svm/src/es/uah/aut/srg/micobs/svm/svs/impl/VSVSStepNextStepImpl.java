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

import es.uah.aut.srg.micobs.svm.svs.VSVSStepNextStep;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Step Next Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepNextStepImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepNextStepImpl#getIsConcurrent <em>Is Concurrent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepNextStepImpl extends MinimalEObjectImpl.Container implements VSVSStepNextStep {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsConcurrent() <em>Is Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConcurrent()
	 * @generated
	 * @ordered
	 */
	protected static final VSVSStepYesNo IS_CONCURRENT_EDEFAULT = VSVSStepYesNo.YES;

	/**
	 * The cached value of the '{@link #getIsConcurrent() <em>Is Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConcurrent()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepYesNo isConcurrent = IS_CONCURRENT_EDEFAULT;

	/**
	 * This is true if the Is Concurrent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isConcurrentESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepNextStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_NEXT_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_NEXT_STEP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepYesNo getIsConcurrent() {
		return isConcurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConcurrent(VSVSStepYesNo newIsConcurrent) {
		VSVSStepYesNo oldIsConcurrent = isConcurrent;
		isConcurrent = newIsConcurrent == null ? IS_CONCURRENT_EDEFAULT : newIsConcurrent;
		boolean oldIsConcurrentESet = isConcurrentESet;
		isConcurrentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_NEXT_STEP__IS_CONCURRENT, oldIsConcurrent, isConcurrent, !oldIsConcurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsConcurrent() {
		VSVSStepYesNo oldIsConcurrent = isConcurrent;
		boolean oldIsConcurrentESet = isConcurrentESet;
		isConcurrent = IS_CONCURRENT_EDEFAULT;
		isConcurrentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, svsPackage.VSVS_STEP_NEXT_STEP__IS_CONCURRENT, oldIsConcurrent, IS_CONCURRENT_EDEFAULT, oldIsConcurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsConcurrent() {
		return isConcurrentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_NEXT_STEP__ID:
				return getId();
			case svsPackage.VSVS_STEP_NEXT_STEP__IS_CONCURRENT:
				return getIsConcurrent();
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
			case svsPackage.VSVS_STEP_NEXT_STEP__ID:
				setId((String)newValue);
				return;
			case svsPackage.VSVS_STEP_NEXT_STEP__IS_CONCURRENT:
				setIsConcurrent((VSVSStepYesNo)newValue);
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
			case svsPackage.VSVS_STEP_NEXT_STEP__ID:
				setId(ID_EDEFAULT);
				return;
			case svsPackage.VSVS_STEP_NEXT_STEP__IS_CONCURRENT:
				unsetIsConcurrent();
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
			case svsPackage.VSVS_STEP_NEXT_STEP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case svsPackage.VSVS_STEP_NEXT_STEP__IS_CONCURRENT:
				return isSetIsConcurrent();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", isConcurrent: ");
		if (isConcurrentESet) result.append(isConcurrent); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VSVSStepNextStepImpl
