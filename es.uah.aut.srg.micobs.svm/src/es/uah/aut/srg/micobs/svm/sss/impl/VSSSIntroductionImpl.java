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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Introduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl#getVSSSPurpose <em>VSSS Purpose</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl#getVSSSObjetive <em>VSSS Objetive</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl#getVSSSContent <em>VSSS Content</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl#getVSSSReason <em>VSSS Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSIntroductionImpl extends MinimalEObjectImpl.Container implements VSSSIntroduction {
	/**
	 * The cached value of the '{@link #getVSSSPurpose() <em>VSSS Purpose</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSPurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssPurpose;

	/**
	 * The cached value of the '{@link #getVSSSObjetive() <em>VSSS Objetive</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSObjetive()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssObjetive;

	/**
	 * The cached value of the '{@link #getVSSSContent() <em>VSSS Content</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSContent()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssContent;

	/**
	 * The cached value of the '{@link #getVSSSReason() <em>VSSS Reason</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSReason()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssReason;

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
	public EList<String> getVSSSPurpose() {
		if (vsssPurpose == null) {
			vsssPurpose = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_INTRODUCTION__VSSS_PURPOSE);
		}
		return vsssPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVSSSObjetive() {
		if (vsssObjetive == null) {
			vsssObjetive = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_INTRODUCTION__VSSS_OBJETIVE);
		}
		return vsssObjetive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVSSSContent() {
		if (vsssContent == null) {
			vsssContent = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_INTRODUCTION__VSSS_CONTENT);
		}
		return vsssContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVSSSReason() {
		if (vsssReason == null) {
			vsssReason = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_INTRODUCTION__VSSS_REASON);
		}
		return vsssReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case sssPackage.VSSS_INTRODUCTION__VSSS_PURPOSE:
				return getVSSSPurpose();
			case sssPackage.VSSS_INTRODUCTION__VSSS_OBJETIVE:
				return getVSSSObjetive();
			case sssPackage.VSSS_INTRODUCTION__VSSS_CONTENT:
				return getVSSSContent();
			case sssPackage.VSSS_INTRODUCTION__VSSS_REASON:
				return getVSSSReason();
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
			case sssPackage.VSSS_INTRODUCTION__VSSS_PURPOSE:
				getVSSSPurpose().clear();
				getVSSSPurpose().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_INTRODUCTION__VSSS_OBJETIVE:
				getVSSSObjetive().clear();
				getVSSSObjetive().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_INTRODUCTION__VSSS_CONTENT:
				getVSSSContent().clear();
				getVSSSContent().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_INTRODUCTION__VSSS_REASON:
				getVSSSReason().clear();
				getVSSSReason().addAll((Collection<? extends String>)newValue);
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
			case sssPackage.VSSS_INTRODUCTION__VSSS_PURPOSE:
				getVSSSPurpose().clear();
				return;
			case sssPackage.VSSS_INTRODUCTION__VSSS_OBJETIVE:
				getVSSSObjetive().clear();
				return;
			case sssPackage.VSSS_INTRODUCTION__VSSS_CONTENT:
				getVSSSContent().clear();
				return;
			case sssPackage.VSSS_INTRODUCTION__VSSS_REASON:
				getVSSSReason().clear();
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
			case sssPackage.VSSS_INTRODUCTION__VSSS_PURPOSE:
				return vsssPurpose != null && !vsssPurpose.isEmpty();
			case sssPackage.VSSS_INTRODUCTION__VSSS_OBJETIVE:
				return vsssObjetive != null && !vsssObjetive.isEmpty();
			case sssPackage.VSSS_INTRODUCTION__VSSS_CONTENT:
				return vsssContent != null && !vsssContent.isEmpty();
			case sssPackage.VSSS_INTRODUCTION__VSSS_REASON:
				return vsssReason != null && !vsssReason.isEmpty();
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
		result.append(" (VSSSPurpose: ");
		result.append(vsssPurpose);
		result.append(", VSSSObjetive: ");
		result.append(vsssObjetive);
		result.append(", VSSSContent: ");
		result.append(vsssContent);
		result.append(", VSSSReason: ");
		result.append(vsssReason);
		result.append(')');
		return result.toString();
	}

} //VSSSIntroductionImpl
