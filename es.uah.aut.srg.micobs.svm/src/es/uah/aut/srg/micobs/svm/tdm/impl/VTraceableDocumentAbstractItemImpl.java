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
import es.uah.aut.srg.micobs.svm.tdm.VVerificationMethod;
import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTraceable Document Abstract Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl#getVerificationMethod <em>Verification Method</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VTraceableDocumentAbstractItemImpl extends MinimalEObjectImpl.Container implements VTraceableDocumentAbstractItem {
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
	 * The default value of the '{@link #getVerificationMethod() <em>Verification Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final VVerificationMethod VERIFICATION_METHOD_EDEFAULT = VVerificationMethod.ANALYSIS;

	/**
	 * The cached value of the '{@link #getVerificationMethod() <em>Verification Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationMethod()
	 * @generated
	 * @ordered
	 */
	protected VVerificationMethod verificationMethod = VERIFICATION_METHOD_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVerificationMethod getVerificationMethod() {
		return verificationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationMethod(VVerificationMethod newVerificationMethod) {
		VVerificationMethod oldVerificationMethod = verificationMethod;
		verificationMethod = newVerificationMethod == null ? VERIFICATION_METHOD_EDEFAULT : newVerificationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VERIFICATION_METHOD, oldVerificationMethod, verificationMethod));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__ID:
				return getId();
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VERIFICATION_METHOD:
				return getVerificationMethod();
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
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
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__ID:
				setId((String)newValue);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VERIFICATION_METHOD:
				setVerificationMethod((VVerificationMethod)newValue);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP:
				setGroup((VTraceableDocumentAbstractGroup)newValue);
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
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VERIFICATION_METHOD:
				setVerificationMethod(VERIFICATION_METHOD_EDEFAULT);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP:
				setGroup((VTraceableDocumentAbstractGroup)null);
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
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VERIFICATION_METHOD:
				return verificationMethod != VERIFICATION_METHOD_EDEFAULT;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP:
				return basicGetGroup() != null;
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
		result.append(", verificationMethod: ");
		result.append(verificationMethod);
		result.append(')');
		return result.toString();
	}

} //VTraceableDocumentAbstractItemImpl
