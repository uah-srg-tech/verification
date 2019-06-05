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
package es.uah.aut.srg.micobs.svm.vdm.impl;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;

import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.vdm.vdmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VValidation Document Abstract Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractItemImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractItemImpl#getValidatingItems <em>Validating Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VValidationDocumentAbstractItemImpl extends MinimalEObjectImpl.Container implements VValidationDocumentAbstractItem {
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
	 * The cached value of the '{@link #getValidatingItems() <em>Validating Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatingItems()
	 * @generated
	 * @ordered
	 */
	protected EList<VTraceableDocumentAbstractItem> validatingItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VValidationDocumentAbstractItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return vdmPackage.Literals.VVALIDATION_DOCUMENT_ABSTRACT_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VValidationDocumentAbstractGroup getGroup() {
		VValidationDocumentAbstractGroup group = basicGetGroup();
		return group != null && group.eIsProxy() ? (VValidationDocumentAbstractGroup)eResolveProxy((InternalEObject)group) : group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VValidationDocumentAbstractGroup basicGetGroup() {
		// TODO: implement this method to return the 'Group' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(VValidationDocumentAbstractGroup newGroup) {
		// TODO: implement this method to set the 'Group' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTraceableDocumentAbstractItem> getValidatingItems() {
		if (validatingItems == null) {
			validatingItems = new EObjectResolvingEList<VTraceableDocumentAbstractItem>(VTraceableDocumentAbstractItem.class, this, vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__VALIDATING_ITEMS);
		}
		return validatingItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__NAME:
				return getName();
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__VALIDATING_ITEMS:
				return getValidatingItems();
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
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__NAME:
				setName((String)newValue);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__GROUP:
				setGroup((VValidationDocumentAbstractGroup)newValue);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__VALIDATING_ITEMS:
				getValidatingItems().clear();
				getValidatingItems().addAll((Collection<? extends VTraceableDocumentAbstractItem>)newValue);
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
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__GROUP:
				setGroup((VValidationDocumentAbstractGroup)null);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__VALIDATING_ITEMS:
				getValidatingItems().clear();
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
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__GROUP:
				return basicGetGroup() != null;
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__VALIDATING_ITEMS:
				return validatingItems != null && !validatingItems.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //VValidationDocumentAbstractItemImpl
