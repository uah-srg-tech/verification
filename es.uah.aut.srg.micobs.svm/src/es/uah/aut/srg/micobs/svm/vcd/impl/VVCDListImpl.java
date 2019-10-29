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

import es.uah.aut.srg.micobs.svm.vcd.VVCDItems;
import es.uah.aut.srg.micobs.svm.vcd.VVCDList;
import es.uah.aut.srg.micobs.svm.vcd.VVCDParentItems;
import es.uah.aut.srg.micobs.svm.vcd.vcdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VVCD List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDListImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDListImpl#getItems <em>Items</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDListImpl#getParentItems <em>Parent Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VVCDListImpl extends MinimalEObjectImpl.Container implements VVCDList {
	/**
	 * The default value of the '{@link #getDoc() <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoc() <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected String doc = DOC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected VVCDItems items;

	/**
	 * The cached value of the '{@link #getParentItems() <em>Parent Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentItems()
	 * @generated
	 * @ordered
	 */
	protected VVCDParentItems parentItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VVCDListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return vcdPackage.Literals.VVCD_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDoc() {
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoc(String newDoc) {
		String oldDoc = doc;
		doc = newDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vcdPackage.VVCD_LIST__DOC, oldDoc, doc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCDItems getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(VVCDItems newItems, NotificationChain msgs) {
		VVCDItems oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, vcdPackage.VVCD_LIST__ITEMS, oldItems, newItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(VVCDItems newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - vcdPackage.VVCD_LIST__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - vcdPackage.VVCD_LIST__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vcdPackage.VVCD_LIST__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCDParentItems getParentItems() {
		return parentItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentItems(VVCDParentItems newParentItems, NotificationChain msgs) {
		VVCDParentItems oldParentItems = parentItems;
		parentItems = newParentItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, vcdPackage.VVCD_LIST__PARENT_ITEMS, oldParentItems, newParentItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentItems(VVCDParentItems newParentItems) {
		if (newParentItems != parentItems) {
			NotificationChain msgs = null;
			if (parentItems != null)
				msgs = ((InternalEObject)parentItems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - vcdPackage.VVCD_LIST__PARENT_ITEMS, null, msgs);
			if (newParentItems != null)
				msgs = ((InternalEObject)newParentItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - vcdPackage.VVCD_LIST__PARENT_ITEMS, null, msgs);
			msgs = basicSetParentItems(newParentItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vcdPackage.VVCD_LIST__PARENT_ITEMS, newParentItems, newParentItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case vcdPackage.VVCD_LIST__ITEMS:
				return basicSetItems(null, msgs);
			case vcdPackage.VVCD_LIST__PARENT_ITEMS:
				return basicSetParentItems(null, msgs);
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
			case vcdPackage.VVCD_LIST__DOC:
				return getDoc();
			case vcdPackage.VVCD_LIST__ITEMS:
				return getItems();
			case vcdPackage.VVCD_LIST__PARENT_ITEMS:
				return getParentItems();
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
			case vcdPackage.VVCD_LIST__DOC:
				setDoc((String)newValue);
				return;
			case vcdPackage.VVCD_LIST__ITEMS:
				setItems((VVCDItems)newValue);
				return;
			case vcdPackage.VVCD_LIST__PARENT_ITEMS:
				setParentItems((VVCDParentItems)newValue);
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
			case vcdPackage.VVCD_LIST__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case vcdPackage.VVCD_LIST__ITEMS:
				setItems((VVCDItems)null);
				return;
			case vcdPackage.VVCD_LIST__PARENT_ITEMS:
				setParentItems((VVCDParentItems)null);
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
			case vcdPackage.VVCD_LIST__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case vcdPackage.VVCD_LIST__ITEMS:
				return items != null;
			case vcdPackage.VVCD_LIST__PARENT_ITEMS:
				return parentItems != null;
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
		result.append(" (doc: ");
		result.append(doc);
		result.append(')');
		return result.toString();
	}

} //VVCDListImpl
