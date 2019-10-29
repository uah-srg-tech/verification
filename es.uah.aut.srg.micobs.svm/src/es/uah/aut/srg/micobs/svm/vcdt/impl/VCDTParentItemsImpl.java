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
package es.uah.aut.srg.micobs.svm.vcdt.impl;

import es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItem;
import es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItems;
import es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage;

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
 * An implementation of the model object '<em><b>VCDT Parent Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemsImpl#getParentItem <em>Parent Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VCDTParentItemsImpl extends MinimalEObjectImpl.Container implements VCDTParentItems {
	/**
	 * The cached value of the '{@link #getParentItem() <em>Parent Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentItem()
	 * @generated
	 * @ordered
	 */
	protected EList<VCDTParentItem> parentItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCDTParentItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return vcdtPackage.Literals.VCDT_PARENT_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VCDTParentItem> getParentItem() {
		if (parentItem == null) {
			parentItem = new EObjectContainmentEList<VCDTParentItem>(VCDTParentItem.class, this, vcdtPackage.VCDT_PARENT_ITEMS__PARENT_ITEM);
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
			case vcdtPackage.VCDT_PARENT_ITEMS__PARENT_ITEM:
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
			case vcdtPackage.VCDT_PARENT_ITEMS__PARENT_ITEM:
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
			case vcdtPackage.VCDT_PARENT_ITEMS__PARENT_ITEM:
				getParentItem().clear();
				getParentItem().addAll((Collection<? extends VCDTParentItem>)newValue);
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
			case vcdtPackage.VCDT_PARENT_ITEMS__PARENT_ITEM:
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
			case vcdtPackage.VCDT_PARENT_ITEMS__PARENT_ITEM:
				return parentItem != null && !parentItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VCDTParentItemsImpl
