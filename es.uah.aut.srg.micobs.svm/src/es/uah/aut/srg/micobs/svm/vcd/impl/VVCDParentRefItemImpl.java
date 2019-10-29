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

import es.uah.aut.srg.micobs.svm.vcd.VVCDParentRefItem;
import es.uah.aut.srg.micobs.svm.vcd.vcdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VVCD Parent Ref Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentRefItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentRefItemImpl#getParentDoc <em>Parent Doc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VVCDParentRefItemImpl extends MinimalEObjectImpl.Container implements VVCDParentRefItem {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VVCDParentRefItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return vcdPackage.Literals.VVCD_PARENT_REF_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, vcdPackage.VVCD_PARENT_REF_ITEM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, vcdPackage.VVCD_PARENT_REF_ITEM__PARENT_DOC, oldParentDoc, parentDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case vcdPackage.VVCD_PARENT_REF_ITEM__NAME:
				return getName();
			case vcdPackage.VVCD_PARENT_REF_ITEM__PARENT_DOC:
				return getParentDoc();
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
			case vcdPackage.VVCD_PARENT_REF_ITEM__NAME:
				setName((String)newValue);
				return;
			case vcdPackage.VVCD_PARENT_REF_ITEM__PARENT_DOC:
				setParentDoc((String)newValue);
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
			case vcdPackage.VVCD_PARENT_REF_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case vcdPackage.VVCD_PARENT_REF_ITEM__PARENT_DOC:
				setParentDoc(PARENT_DOC_EDEFAULT);
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
			case vcdPackage.VVCD_PARENT_REF_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case vcdPackage.VVCD_PARENT_REF_ITEM__PARENT_DOC:
				return PARENT_DOC_EDEFAULT == null ? parentDoc != null : !PARENT_DOC_EDEFAULT.equals(parentDoc);
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

} //VVCDParentRefItemImpl
