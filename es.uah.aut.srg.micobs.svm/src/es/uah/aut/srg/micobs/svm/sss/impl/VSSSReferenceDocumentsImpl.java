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

import es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Reference Documents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSReferenceDocumentsImpl#getVSSSReferenceDocument <em>VSSS Reference Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSReferenceDocumentsImpl extends MinimalEObjectImpl.Container implements VSSSReferenceDocuments {
	/**
	 * The cached value of the '{@link #getVSSSReferenceDocument() <em>VSSS Reference Document</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSReferenceDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssReferenceDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSReferenceDocumentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_REFERENCE_DOCUMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVSSSReferenceDocument() {
		if (vsssReferenceDocument == null) {
			vsssReferenceDocument = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_REFERENCE_DOCUMENTS__VSSS_REFERENCE_DOCUMENT);
		}
		return vsssReferenceDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case sssPackage.VSSS_REFERENCE_DOCUMENTS__VSSS_REFERENCE_DOCUMENT:
				return getVSSSReferenceDocument();
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
			case sssPackage.VSSS_REFERENCE_DOCUMENTS__VSSS_REFERENCE_DOCUMENT:
				getVSSSReferenceDocument().clear();
				getVSSSReferenceDocument().addAll((Collection<? extends String>)newValue);
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
			case sssPackage.VSSS_REFERENCE_DOCUMENTS__VSSS_REFERENCE_DOCUMENT:
				getVSSSReferenceDocument().clear();
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
			case sssPackage.VSSS_REFERENCE_DOCUMENTS__VSSS_REFERENCE_DOCUMENT:
				return vsssReferenceDocument != null && !vsssReferenceDocument.isEmpty();
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
		result.append(" (VSSSReferenceDocument: ");
		result.append(vsssReferenceDocument);
		result.append(')');
		return result.toString();
	}

} //VSSSReferenceDocumentsImpl
