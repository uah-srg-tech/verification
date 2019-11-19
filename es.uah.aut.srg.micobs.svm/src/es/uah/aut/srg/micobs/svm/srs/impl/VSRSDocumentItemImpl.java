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
package es.uah.aut.srg.micobs.svm.srs.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem;
import es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItemModes;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSRS Document Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentItemImpl#getExtendedDescription <em>Extended Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentItemImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSRSDocumentItemImpl extends VTraceableDocumentAbstractItemImpl implements VSRSDocumentItem {
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
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<VSRSDocumentItemModes> mode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSRSDocumentItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return srsPackage.Literals.VSRS_DOCUMENT_ITEM;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT_ITEM__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT_ITEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT_ITEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT_ITEM__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION, oldExtendedDescription, newExtendedDescription);
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
				msgs = ((InternalEObject)extendedDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION, null, msgs);
			if (newExtendedDescription != null)
				msgs = ((InternalEObject)newExtendedDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION, null, msgs);
			msgs = basicSetExtendedDescription(newExtendedDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION, newExtendedDescription, newExtendedDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSRSDocumentItemModes> getMode() {
		if (mode == null) {
			mode = new EDataTypeUniqueEList<VSRSDocumentItemModes>(VSRSDocumentItemModes.class, this, srsPackage.VSRS_DOCUMENT_ITEM__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_DOCUMENT_ITEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case srsPackage.VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION:
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
			case srsPackage.VSRS_DOCUMENT_ITEM__DESCRIPTION:
				return getDescription();
			case srsPackage.VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION:
				return getExtendedDescription();
			case srsPackage.VSRS_DOCUMENT_ITEM__MODE:
				return getMode();
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
			case srsPackage.VSRS_DOCUMENT_ITEM__DESCRIPTION:
				setDescription((DBody)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION:
				setExtendedDescription((DBody)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT_ITEM__MODE:
				getMode().clear();
				getMode().addAll((Collection<? extends VSRSDocumentItemModes>)newValue);
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
			case srsPackage.VSRS_DOCUMENT_ITEM__DESCRIPTION:
				setDescription((DBody)null);
				return;
			case srsPackage.VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION:
				setExtendedDescription((DBody)null);
				return;
			case srsPackage.VSRS_DOCUMENT_ITEM__MODE:
				getMode().clear();
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
			case srsPackage.VSRS_DOCUMENT_ITEM__DESCRIPTION:
				return description != null;
			case srsPackage.VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION:
				return extendedDescription != null;
			case srsPackage.VSRS_DOCUMENT_ITEM__MODE:
				return mode != null && !mode.isEmpty();
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

	@Override
	public VTraceableDocumentAbstractGroup basicGetGroup() {
		final EObject parent = eContainer();
		if (parent instanceof VSRSInstantiableRequirementSectionImpl) {
			return (VTraceableDocumentAbstractGroup)parent.eContainer();
		}
		else {
			return (VTraceableDocumentAbstractGroup)eContainer();
		}
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		if(getDescription() != null) {
			objects.addAll(getDescription().getReferenceableObjects(ReferenceableObjectType));
		}
		if(getExtendedDescription() != null) {
			objects.addAll(getExtendedDescription().getReferenceableObjects(ReferenceableObjectType));
		}
		return objects;
	}

} //VSRSDocumentItemImpl
