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

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;
import es.uah.aut.srg.micobs.svm.srs.VSRSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSRS Applicable Documents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSApplicableDocumentsImpl#getApplicableDocuments <em>Applicable Documents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSRSApplicableDocumentsImpl extends DFixedSectionImpl implements VSRSApplicableDocuments {
	/**
	 * The cached value of the '{@link #getApplicableDocuments() <em>Applicable Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<DApplicableDocument> applicableDocuments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSRSApplicableDocumentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return srsPackage.Literals.VSRS_APPLICABLE_DOCUMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DApplicableDocument> getApplicableDocuments() {
		if (applicableDocuments == null) {
			applicableDocuments = new EObjectContainmentEList<DApplicableDocument>(DApplicableDocument.class, this, srsPackage.VSRS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS);
		}
		return applicableDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS:
				return ((InternalEList<?>)getApplicableDocuments()).basicRemove(otherEnd, msgs);
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
			case srsPackage.VSRS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS:
				return getApplicableDocuments();
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
			case srsPackage.VSRS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				getApplicableDocuments().addAll((Collection<? extends DApplicableDocument>)newValue);
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
			case srsPackage.VSRS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
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
			case srsPackage.VSRS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS:
				return applicableDocuments != null && !applicableDocuments.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		return ECollections.emptyEList();
	}

} //VSRSApplicableDocumentsImpl
