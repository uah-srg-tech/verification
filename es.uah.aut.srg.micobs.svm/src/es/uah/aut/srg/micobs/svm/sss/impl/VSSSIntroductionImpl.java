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

import es.uah.aut.srg.micobs.doctpl.doc.impl.DSectionImpl;

import es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Introduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl#getObjetive <em>Objetive</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSIntroductionImpl extends DSectionImpl implements VSSSIntroduction {
	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected DBody purpose;

	/**
	 * The cached value of the '{@link #getObjetive() <em>Objetive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetive()
	 * @generated
	 * @ordered
	 */
	protected DBody objetive;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected DBody content;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected DBody reason;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSIntroductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_INTRODUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getPurpose() {
		if (purpose != null && purpose.eIsProxy()) {
			InternalEObject oldPurpose = (InternalEObject)purpose;
			purpose = (DBody)eResolveProxy(oldPurpose);
			if (purpose != oldPurpose) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, sssPackage.VSSS_INTRODUCTION__PURPOSE, oldPurpose, purpose));
			}
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody basicGetPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(DBody newPurpose) {
		DBody oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_INTRODUCTION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getObjetive() {
		if (objetive != null && objetive.eIsProxy()) {
			InternalEObject oldObjetive = (InternalEObject)objetive;
			objetive = (DBody)eResolveProxy(oldObjetive);
			if (objetive != oldObjetive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, sssPackage.VSSS_INTRODUCTION__OBJETIVE, oldObjetive, objetive));
			}
		}
		return objetive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody basicGetObjetive() {
		return objetive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjetive(DBody newObjetive) {
		DBody oldObjetive = objetive;
		objetive = newObjetive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_INTRODUCTION__OBJETIVE, oldObjetive, objetive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject)content;
			content = (DBody)eResolveProxy(oldContent);
			if (content != oldContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, sssPackage.VSSS_INTRODUCTION__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(DBody newContent) {
		DBody oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_INTRODUCTION__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getReason() {
		if (reason != null && reason.eIsProxy()) {
			InternalEObject oldReason = (InternalEObject)reason;
			reason = (DBody)eResolveProxy(oldReason);
			if (reason != oldReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, sssPackage.VSSS_INTRODUCTION__REASON, oldReason, reason));
			}
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody basicGetReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(DBody newReason) {
		DBody oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_INTRODUCTION__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case sssPackage.VSSS_INTRODUCTION__PURPOSE:
				if (resolve) return getPurpose();
				return basicGetPurpose();
			case sssPackage.VSSS_INTRODUCTION__OBJETIVE:
				if (resolve) return getObjetive();
				return basicGetObjetive();
			case sssPackage.VSSS_INTRODUCTION__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
			case sssPackage.VSSS_INTRODUCTION__REASON:
				if (resolve) return getReason();
				return basicGetReason();
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
			case sssPackage.VSSS_INTRODUCTION__PURPOSE:
				setPurpose((DBody)newValue);
				return;
			case sssPackage.VSSS_INTRODUCTION__OBJETIVE:
				setObjetive((DBody)newValue);
				return;
			case sssPackage.VSSS_INTRODUCTION__CONTENT:
				setContent((DBody)newValue);
				return;
			case sssPackage.VSSS_INTRODUCTION__REASON:
				setReason((DBody)newValue);
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
			case sssPackage.VSSS_INTRODUCTION__PURPOSE:
				setPurpose((DBody)null);
				return;
			case sssPackage.VSSS_INTRODUCTION__OBJETIVE:
				setObjetive((DBody)null);
				return;
			case sssPackage.VSSS_INTRODUCTION__CONTENT:
				setContent((DBody)null);
				return;
			case sssPackage.VSSS_INTRODUCTION__REASON:
				setReason((DBody)null);
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
			case sssPackage.VSSS_INTRODUCTION__PURPOSE:
				return purpose != null;
			case sssPackage.VSSS_INTRODUCTION__OBJETIVE:
				return objetive != null;
			case sssPackage.VSSS_INTRODUCTION__CONTENT:
				return content != null;
			case sssPackage.VSSS_INTRODUCTION__REASON:
				return reason != null;
		}
		return super.eIsSet(featureID);
	}

} //VSSSIntroductionImpl
