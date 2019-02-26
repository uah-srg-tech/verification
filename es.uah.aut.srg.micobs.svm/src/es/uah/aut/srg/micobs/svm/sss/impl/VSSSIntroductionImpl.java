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

import es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
public class VSSSIntroductionImpl extends MinimalEObjectImpl.Container implements VSSSIntroduction {
	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjetive() <em>Objetive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetive()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJETIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjetive() <em>Objetive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetive()
	 * @generated
	 * @ordered
	 */
	protected String objetive = OBJETIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

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
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_INTRODUCTION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjetive() {
		return objetive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjetive(String newObjetive) {
		String oldObjetive = objetive;
		objetive = newObjetive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_INTRODUCTION__OBJETIVE, oldObjetive, objetive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_INTRODUCTION__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
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
				return getPurpose();
			case sssPackage.VSSS_INTRODUCTION__OBJETIVE:
				return getObjetive();
			case sssPackage.VSSS_INTRODUCTION__CONTENT:
				return getContent();
			case sssPackage.VSSS_INTRODUCTION__REASON:
				return getReason();
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
				setPurpose((String)newValue);
				return;
			case sssPackage.VSSS_INTRODUCTION__OBJETIVE:
				setObjetive((String)newValue);
				return;
			case sssPackage.VSSS_INTRODUCTION__CONTENT:
				setContent((String)newValue);
				return;
			case sssPackage.VSSS_INTRODUCTION__REASON:
				setReason((String)newValue);
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
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case sssPackage.VSSS_INTRODUCTION__OBJETIVE:
				setObjetive(OBJETIVE_EDEFAULT);
				return;
			case sssPackage.VSSS_INTRODUCTION__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case sssPackage.VSSS_INTRODUCTION__REASON:
				setReason(REASON_EDEFAULT);
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
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case sssPackage.VSSS_INTRODUCTION__OBJETIVE:
				return OBJETIVE_EDEFAULT == null ? objetive != null : !OBJETIVE_EDEFAULT.equals(objetive);
			case sssPackage.VSSS_INTRODUCTION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case sssPackage.VSSS_INTRODUCTION__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
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
		result.append(" (purpose: ");
		result.append(purpose);
		result.append(", objetive: ");
		result.append(objetive);
		result.append(", content: ");
		result.append(content);
		result.append(", reason: ");
		result.append(reason);
		result.append(')');
		return result.toString();
	}

} //VSSSIntroductionImpl
