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

import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;

import es.uah.aut.srg.micobs.svm.vdm.VVerificationDocumentItem;
import es.uah.aut.srg.micobs.svm.vdm.vdmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VVerification Document Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VVerificationDocumentItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VVerificationDocumentItemImpl#getEvidenceOf <em>Evidence Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VVerificationDocumentItemImpl extends MCommonReferenceableObjImpl implements VVerificationDocumentItem {
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
	 * The cached value of the '{@link #getEvidenceOf() <em>Evidence Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidenceOf()
	 * @generated
	 * @ordered
	 */
	protected EList<VTraceableDocumentAbstractItem> evidenceOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VVerificationDocumentItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return vdmPackage.Literals.VVERIFICATION_DOCUMENT_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, vdmPackage.VVERIFICATION_DOCUMENT_ITEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTraceableDocumentAbstractItem> getEvidenceOf() {
		if (evidenceOf == null) {
			evidenceOf = new EObjectResolvingEList<VTraceableDocumentAbstractItem>(VTraceableDocumentAbstractItem.class, this, vdmPackage.VVERIFICATION_DOCUMENT_ITEM__EVIDENCE_OF);
		}
		return evidenceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case vdmPackage.VVERIFICATION_DOCUMENT_ITEM__ID:
				return getId();
			case vdmPackage.VVERIFICATION_DOCUMENT_ITEM__EVIDENCE_OF:
				return getEvidenceOf();
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
			case vdmPackage.VVERIFICATION_DOCUMENT_ITEM__ID:
				setId((String)newValue);
				return;
			case vdmPackage.VVERIFICATION_DOCUMENT_ITEM__EVIDENCE_OF:
				getEvidenceOf().clear();
				getEvidenceOf().addAll((Collection<? extends VTraceableDocumentAbstractItem>)newValue);
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
			case vdmPackage.VVERIFICATION_DOCUMENT_ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case vdmPackage.VVERIFICATION_DOCUMENT_ITEM__EVIDENCE_OF:
				getEvidenceOf().clear();
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
			case vdmPackage.VVERIFICATION_DOCUMENT_ITEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case vdmPackage.VVERIFICATION_DOCUMENT_ITEM__EVIDENCE_OF:
				return evidenceOf != null && !evidenceOf.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //VVerificationDocumentItemImpl
