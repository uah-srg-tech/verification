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

import es.uah.aut.srg.micobs.doctpl.doc.DBody;
import es.uah.aut.srg.micobs.svm.sss.impl.VSSSInstantiableRequirementSectionImpl;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Document Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentItemImpl#getExtendedDescription <em>Extended Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSDocumentItemImpl extends VTraceableDocumentAbstractItemImpl implements VSSSDocumentItem {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DBody description;
	/**
	 * The cached value of the '{@link #getExtendedDescription() <em>Extended Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedDescription()
	 * @generated
	 * @ordered
	 */
	protected DBody extendedDescription;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSDocumentItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_DOCUMENT_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DBody newDescription, NotificationChain msgs) {
		DBody oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT_ITEM__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DBody newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT_ITEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT_ITEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT_ITEM__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getExtendedDescription() {
		return extendedDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedDescription(DBody newExtendedDescription, NotificationChain msgs) {
		DBody oldExtendedDescription = extendedDescription;
		extendedDescription = newExtendedDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION, oldExtendedDescription, newExtendedDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedDescription(DBody newExtendedDescription) {
		if (newExtendedDescription != extendedDescription) {
			NotificationChain msgs = null;
			if (extendedDescription != null)
				msgs = ((InternalEObject)extendedDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION, null, msgs);
			if (newExtendedDescription != null)
				msgs = ((InternalEObject)newExtendedDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION, null, msgs);
			msgs = basicSetExtendedDescription(newExtendedDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION, newExtendedDescription, newExtendedDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_DOCUMENT_ITEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case sssPackage.VSSS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION:
				return basicSetExtendedDescription(null, msgs);
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
			case sssPackage.VSSS_DOCUMENT_ITEM__DESCRIPTION:
				return getDescription();
			case sssPackage.VSSS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION:
				return getExtendedDescription();
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
			case sssPackage.VSSS_DOCUMENT_ITEM__DESCRIPTION:
				setDescription((DBody)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION:
				setExtendedDescription((DBody)newValue);
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
			case sssPackage.VSSS_DOCUMENT_ITEM__DESCRIPTION:
				setDescription((DBody)null);
				return;
			case sssPackage.VSSS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION:
				setExtendedDescription((DBody)null);
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
			case sssPackage.VSSS_DOCUMENT_ITEM__DESCRIPTION:
				return description != null;
			case sssPackage.VSSS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION:
				return extendedDescription != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public VTraceableDocumentAbstractGroup basicGetGroup() {
		final EObject parent = eContainer();
		if (parent instanceof VSSSInstantiableRequirementSectionImpl) {
			return (VTraceableDocumentAbstractGroup)parent.eContainer();
		}
		else {
			return (VTraceableDocumentAbstractGroup)eContainer();
		}
	}

} //VSSSDocumentItemImpl
