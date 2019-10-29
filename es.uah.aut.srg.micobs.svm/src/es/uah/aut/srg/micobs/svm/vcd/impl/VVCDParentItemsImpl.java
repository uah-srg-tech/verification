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
package es.uah.aut.srg.micobs.svm.vcd.impl;

import es.uah.aut.srg.micobs.svm.vcd.VVCDParentItem;
import es.uah.aut.srg.micobs.svm.vcd.VVCDParentItems;
import es.uah.aut.srg.micobs.svm.vcd.vcdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VVCD Parent Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentItemsImpl#getParentItem <em>Parent Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VVCDParentItemsImpl extends MinimalEObjectImpl.Container implements VVCDParentItems {
	/**
	 * The cached value of the '{@link #getParentItem() <em>Parent Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentItem()
	 * @generated
	 * @ordered
	 */
	protected EList<VVCDParentItem> parentItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VVCDParentItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return vcdPackage.Literals.VVCD_PARENT_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVCDParentItem> getParentItem() {
		if (parentItem == null) {
			parentItem = new EObjectContainmentEList<VVCDParentItem>(VVCDParentItem.class, this, vcdPackage.VVCD_PARENT_ITEMS__PARENT_ITEM);
		}
		return parentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case vcdPackage.VVCD_PARENT_ITEMS__PARENT_ITEM:
				return ((InternalEList<?>)getParentItem()).basicRemove(otherEnd, msgs);
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
			case vcdPackage.VVCD_PARENT_ITEMS__PARENT_ITEM:
				return getParentItem();
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
			case vcdPackage.VVCD_PARENT_ITEMS__PARENT_ITEM:
				getParentItem().clear();
				getParentItem().addAll((Collection<? extends VVCDParentItem>)newValue);
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
			case vcdPackage.VVCD_PARENT_ITEMS__PARENT_ITEM:
				getParentItem().clear();
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
			case vcdPackage.VVCD_PARENT_ITEMS__PARENT_ITEM:
				return parentItem != null && !parentItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VVCDParentItemsImpl
