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
package es.uah.aut.srg.micobs.svm.tdm.impl;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.tdm.VValidationMethod;
import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;

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
 * An implementation of the model object '<em><b>VTraceable Document Abstract Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl#getValidationMethod <em>Validation Method</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl#getParentItem <em>Parent Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VTraceableDocumentAbstractItemImpl extends MinimalEObjectImpl.Container implements VTraceableDocumentAbstractItem {
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
	 * The default value of the '{@link #getValidationMethod() <em>Validation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final VValidationMethod VALIDATION_METHOD_EDEFAULT = VValidationMethod.ANALYSIS;

	/**
	 * The cached value of the '{@link #getValidationMethod() <em>Validation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationMethod()
	 * @generated
	 * @ordered
	 */
	protected VValidationMethod validationMethod = VALIDATION_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentItem() <em>Parent Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentItem()
	 * @generated
	 * @ordered
	 */
	protected EList<VTraceableDocumentAbstractItem> parentItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTraceableDocumentAbstractItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tdmPackage.Literals.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VValidationMethod getValidationMethod() {
		return validationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationMethod(VValidationMethod newValidationMethod) {
		VValidationMethod oldValidationMethod = validationMethod;
		validationMethod = newValidationMethod == null ? VALIDATION_METHOD_EDEFAULT : newValidationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VALIDATION_METHOD, oldValidationMethod, validationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTraceableDocumentAbstractGroup getGroup() {
		VTraceableDocumentAbstractGroup group = basicGetGroup();
		return group != null && group.eIsProxy() ? (VTraceableDocumentAbstractGroup)eResolveProxy((InternalEObject)group) : group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTraceableDocumentAbstractGroup basicGetGroup() {
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
	public void setGroup(VTraceableDocumentAbstractGroup newGroup) {
		// TODO: implement this method to set the 'Group' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTraceableDocumentAbstractItem> getParentItem() {
		if (parentItem == null) {
			parentItem = new EObjectResolvingEList<VTraceableDocumentAbstractItem>(VTraceableDocumentAbstractItem.class, this, tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__PARENT_ITEM);
		}
		return parentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__NAME:
				return getName();
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VALIDATION_METHOD:
				return getValidationMethod();
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__PARENT_ITEM:
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
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__NAME:
				setName((String)newValue);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VALIDATION_METHOD:
				setValidationMethod((VValidationMethod)newValue);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP:
				setGroup((VTraceableDocumentAbstractGroup)newValue);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__PARENT_ITEM:
				getParentItem().clear();
				getParentItem().addAll((Collection<? extends VTraceableDocumentAbstractItem>)newValue);
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
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VALIDATION_METHOD:
				setValidationMethod(VALIDATION_METHOD_EDEFAULT);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP:
				setGroup((VTraceableDocumentAbstractGroup)null);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__PARENT_ITEM:
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
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VALIDATION_METHOD:
				return validationMethod != VALIDATION_METHOD_EDEFAULT;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP:
				return basicGetGroup() != null;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__PARENT_ITEM:
				return parentItem != null && !parentItem.isEmpty();
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
		result.append(", validationMethod: ");
		result.append(validationMethod);
		result.append(')');
		return result.toString();
	}

} //VTraceableDocumentAbstractItemImpl
