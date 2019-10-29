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
import es.uah.aut.srg.micobs.svm.vcdt.VCDTRefItem;
import es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VCDT Parent Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemImpl#getParentDoc <em>Parent Doc</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemImpl#getRefItem <em>Ref Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VCDTParentItemImpl extends MinimalEObjectImpl.Container implements VCDTParentItem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentDoc() <em>Parent Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDoc()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_DOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentDoc() <em>Parent Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDoc()
	 * @generated
	 * @ordered
	 */
	protected String parentDoc = PARENT_DOC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefItem() <em>Ref Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefItem()
	 * @generated
	 * @ordered
	 */
	protected EList<VCDTRefItem> refItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCDTParentItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return vcdtPackage.Literals.VCDT_PARENT_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vcdtPackage.VCDT_PARENT_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentDoc() {
		return parentDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentDoc(String newParentDoc) {
		String oldParentDoc = parentDoc;
		parentDoc = newParentDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vcdtPackage.VCDT_PARENT_ITEM__PARENT_DOC, oldParentDoc, parentDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VCDTRefItem> getRefItem() {
		if (refItem == null) {
			refItem = new EObjectContainmentEList<VCDTRefItem>(VCDTRefItem.class, this, vcdtPackage.VCDT_PARENT_ITEM__REF_ITEM);
		}
		return refItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case vcdtPackage.VCDT_PARENT_ITEM__REF_ITEM:
				return ((InternalEList<?>)getRefItem()).basicRemove(otherEnd, msgs);
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
			case vcdtPackage.VCDT_PARENT_ITEM__NAME:
				return getName();
			case vcdtPackage.VCDT_PARENT_ITEM__PARENT_DOC:
				return getParentDoc();
			case vcdtPackage.VCDT_PARENT_ITEM__REF_ITEM:
				return getRefItem();
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
			case vcdtPackage.VCDT_PARENT_ITEM__NAME:
				setName((String)newValue);
				return;
			case vcdtPackage.VCDT_PARENT_ITEM__PARENT_DOC:
				setParentDoc((String)newValue);
				return;
			case vcdtPackage.VCDT_PARENT_ITEM__REF_ITEM:
				getRefItem().clear();
				getRefItem().addAll((Collection<? extends VCDTRefItem>)newValue);
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
			case vcdtPackage.VCDT_PARENT_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case vcdtPackage.VCDT_PARENT_ITEM__PARENT_DOC:
				setParentDoc(PARENT_DOC_EDEFAULT);
				return;
			case vcdtPackage.VCDT_PARENT_ITEM__REF_ITEM:
				getRefItem().clear();
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
			case vcdtPackage.VCDT_PARENT_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case vcdtPackage.VCDT_PARENT_ITEM__PARENT_DOC:
				return PARENT_DOC_EDEFAULT == null ? parentDoc != null : !PARENT_DOC_EDEFAULT.equals(parentDoc);
			case vcdtPackage.VCDT_PARENT_ITEM__REF_ITEM:
				return refItem != null && !refItem.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", parentDoc: ");
		result.append(parentDoc);
		result.append(')');
		return result.toString();
	}

} //VCDTParentItemImpl
