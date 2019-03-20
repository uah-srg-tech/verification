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
package es.uah.aut.srg.micobs.svm.sss.impl;

import es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirement;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedGroupImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS General Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralRequirementImpl#getSssItems <em>Sss Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSGeneralRequirementImpl extends VTraceableDocumentFixedGroupImpl implements VSSSGeneralRequirement {
	/**
	 * The cached value of the '{@link #getSssItems() <em>Sss Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSssItems()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSDocumentItem> sssItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSGeneralRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_GENERAL_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSDocumentItem> getSssItems() {
		if (sssItems == null) {
			sssItems = new EObjectContainmentEList<VSSSDocumentItem>(VSSSDocumentItem.class, this, sssPackage.VSSS_GENERAL_REQUIREMENT__SSS_ITEMS);
		}
		return sssItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_GENERAL_REQUIREMENT__SSS_ITEMS:
				return ((InternalEList<?>)getSssItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case sssPackage.VSSS_GENERAL_REQUIREMENT__SSS_ITEMS:
				return getSssItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case sssPackage.VSSS_GENERAL_REQUIREMENT__SSS_ITEMS:
				getSssItems().clear();
				getSssItems().addAll((Collection<? extends VSSSDocumentItem>)newValue);
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
			case sssPackage.VSSS_GENERAL_REQUIREMENT__SSS_ITEMS:
				getSssItems().clear();
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
			case sssPackage.VSSS_GENERAL_REQUIREMENT__SSS_ITEMS:
				return sssItems != null && !sssItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VSSSGeneralRequirementImpl
