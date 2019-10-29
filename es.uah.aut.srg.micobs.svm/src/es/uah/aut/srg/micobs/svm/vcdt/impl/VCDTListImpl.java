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

import es.uah.aut.srg.micobs.svm.vcdt.VCDTItems;
import es.uah.aut.srg.micobs.svm.vcdt.VCDTList;
import es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItems;
import es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VCDT List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTListImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTListImpl#getItems <em>Items</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTListImpl#getParentItems <em>Parent Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VCDTListImpl extends MinimalEObjectImpl.Container implements VCDTList {
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
	protected VCDTItems items;

	/**
	 * The cached value of the '{@link #getParentItems() <em>Parent Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentItems()
	 * @generated
	 * @ordered
	 */
	protected VCDTParentItems parentItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCDTListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return vcdtPackage.Literals.VCDT_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, vcdtPackage.VCDT_LIST__DOC, oldDoc, doc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCDTItems getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(VCDTItems newItems, NotificationChain msgs) {
		VCDTItems oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, vcdtPackage.VCDT_LIST__ITEMS, oldItems, newItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(VCDTItems newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - vcdtPackage.VCDT_LIST__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - vcdtPackage.VCDT_LIST__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vcdtPackage.VCDT_LIST__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCDTParentItems getParentItems() {
		return parentItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentItems(VCDTParentItems newParentItems, NotificationChain msgs) {
		VCDTParentItems oldParentItems = parentItems;
		parentItems = newParentItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, vcdtPackage.VCDT_LIST__PARENT_ITEMS, oldParentItems, newParentItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentItems(VCDTParentItems newParentItems) {
		if (newParentItems != parentItems) {
			NotificationChain msgs = null;
			if (parentItems != null)
				msgs = ((InternalEObject)parentItems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - vcdtPackage.VCDT_LIST__PARENT_ITEMS, null, msgs);
			if (newParentItems != null)
				msgs = ((InternalEObject)newParentItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - vcdtPackage.VCDT_LIST__PARENT_ITEMS, null, msgs);
			msgs = basicSetParentItems(newParentItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vcdtPackage.VCDT_LIST__PARENT_ITEMS, newParentItems, newParentItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case vcdtPackage.VCDT_LIST__ITEMS:
				return basicSetItems(null, msgs);
			case vcdtPackage.VCDT_LIST__PARENT_ITEMS:
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
			case vcdtPackage.VCDT_LIST__DOC:
				return getDoc();
			case vcdtPackage.VCDT_LIST__ITEMS:
				return getItems();
			case vcdtPackage.VCDT_LIST__PARENT_ITEMS:
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
			case vcdtPackage.VCDT_LIST__DOC:
				setDoc((String)newValue);
				return;
			case vcdtPackage.VCDT_LIST__ITEMS:
				setItems((VCDTItems)newValue);
				return;
			case vcdtPackage.VCDT_LIST__PARENT_ITEMS:
				setParentItems((VCDTParentItems)newValue);
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
			case vcdtPackage.VCDT_LIST__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case vcdtPackage.VCDT_LIST__ITEMS:
				setItems((VCDTItems)null);
				return;
			case vcdtPackage.VCDT_LIST__PARENT_ITEMS:
				setParentItems((VCDTParentItems)null);
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
			case vcdtPackage.VCDT_LIST__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case vcdtPackage.VCDT_LIST__ITEMS:
				return items != null;
			case vcdtPackage.VCDT_LIST__PARENT_ITEMS:
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

} //VCDTListImpl
