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

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doc.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedGroupImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Validation Approach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationApproachImpl#getSubsections <em>Subsections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationApproachImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationApproachImpl#getSssItems <em>Sss Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSValidationApproachImpl extends VTraceableDocumentFixedGroupImpl implements VSSSValidationApproach {
	/**
	 * The cached value of the '{@link #getSssItems() <em>Sss Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSssItems()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSDocumentItem> sssItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSValidationApproachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_VALIDATION_APPROACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAbstractSection> getSubsections() {
		// TODO: implement this method to return the 'Subsections' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDocumentTemplate getDocument() {
		DDocumentTemplate document = basicGetDocument();
		return document != null && document.eIsProxy() ? (DDocumentTemplate)eResolveProxy((InternalEObject)document) : document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DDocumentTemplate basicGetDocument() {
		return (DDocumentTemplate)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(DDocumentTemplate newDocument) {
		// TODO: implement this method to set the 'Document' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSDocumentItem> getSssItems() {
		if (sssItems == null) {
			sssItems = new EObjectContainmentEList<VSSSDocumentItem>(VSSSDocumentItem.class, this, sssPackage.VSSS_VALIDATION_APPROACH__SSS_ITEMS);
		}
		return sssItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_VALIDATION_APPROACH__SSS_ITEMS:
				return ((InternalEList<?>)getSssItems()).basicRemove(otherEnd, msgs);
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
			case sssPackage.VSSS_VALIDATION_APPROACH__SUBSECTIONS:
				return getSubsections();
			case sssPackage.VSSS_VALIDATION_APPROACH__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case sssPackage.VSSS_VALIDATION_APPROACH__SSS_ITEMS:
				return getSssItems();
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
			case sssPackage.VSSS_VALIDATION_APPROACH__SUBSECTIONS:
				getSubsections().clear();
				getSubsections().addAll((Collection<? extends DAbstractSection>)newValue);
				return;
			case sssPackage.VSSS_VALIDATION_APPROACH__DOCUMENT:
				setDocument((DDocumentTemplate)newValue);
				return;
			case sssPackage.VSSS_VALIDATION_APPROACH__SSS_ITEMS:
				getSssItems().clear();
				getSssItems().addAll((Collection<? extends VSSSDocumentItem>)newValue);
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
			case sssPackage.VSSS_VALIDATION_APPROACH__SUBSECTIONS:
				getSubsections().clear();
				return;
			case sssPackage.VSSS_VALIDATION_APPROACH__DOCUMENT:
				setDocument((DDocumentTemplate)null);
				return;
			case sssPackage.VSSS_VALIDATION_APPROACH__SSS_ITEMS:
				getSssItems().clear();
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
			case sssPackage.VSSS_VALIDATION_APPROACH__SUBSECTIONS:
				return !getSubsections().isEmpty();
			case sssPackage.VSSS_VALIDATION_APPROACH__DOCUMENT:
				return basicGetDocument() != null;
			case sssPackage.VSSS_VALIDATION_APPROACH__SSS_ITEMS:
				return sssItems != null && !sssItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DAbstractSection.class) {
			switch (derivedFeatureID) {
				case sssPackage.VSSS_VALIDATION_APPROACH__SUBSECTIONS: return docPackage.DABSTRACT_SECTION__SUBSECTIONS;
				case sssPackage.VSSS_VALIDATION_APPROACH__DOCUMENT: return docPackage.DABSTRACT_SECTION__DOCUMENT;
				default: return -1;
			}
		}
		if (baseClass == DFixedSection.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DAbstractSection.class) {
			switch (baseFeatureID) {
				case docPackage.DABSTRACT_SECTION__SUBSECTIONS: return sssPackage.VSSS_VALIDATION_APPROACH__SUBSECTIONS;
				case docPackage.DABSTRACT_SECTION__DOCUMENT: return sssPackage.VSSS_VALIDATION_APPROACH__DOCUMENT;
				default: return -1;
			}
		}
		if (baseClass == DFixedSection.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	@Override
	public EList<VTraceableDocumentAbstractItem> getItems() {
		EList<VTraceableDocumentAbstractItem> items = new BasicEList<VTraceableDocumentAbstractItem>();
		items.add((VTraceableDocumentAbstractItem) getSssItems());
		return items;
	}
	
	@Override
	public VTraceableDocument getTDocument() {
		return (VTraceableDocument)eContainer();
	}
	

} //VSSSValidationApproachImpl
