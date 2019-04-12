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

import es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument;

import es.uah.aut.srg.micobs.doctpl.doc.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.srs.VSRSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSRS Reference Documents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSReferenceDocumentsImpl#getReferenceDocuments <em>Reference Documents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSRSReferenceDocumentsImpl extends DFixedSectionImpl implements VSRSReferenceDocuments {
	/**
	 * The cached value of the '{@link #getReferenceDocuments() <em>Reference Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<DReferenceDocument> referenceDocuments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSRSReferenceDocumentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return srsPackage.Literals.VSRS_REFERENCE_DOCUMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DReferenceDocument> getReferenceDocuments() {
		if (referenceDocuments == null) {
			referenceDocuments = new EObjectContainmentEList<DReferenceDocument>(DReferenceDocument.class, this, srsPackage.VSRS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS);
		}
		return referenceDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS:
				return ((InternalEList<?>)getReferenceDocuments()).basicRemove(otherEnd, msgs);
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
			case srsPackage.VSRS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS:
				return getReferenceDocuments();
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
			case srsPackage.VSRS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				getReferenceDocuments().addAll((Collection<? extends DReferenceDocument>)newValue);
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
			case srsPackage.VSRS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
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
			case srsPackage.VSRS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS:
				return referenceDocuments != null && !referenceDocuments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VSRSReferenceDocumentsImpl
