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

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.DBody;
import es.uah.aut.srg.micobs.doctpl.doc.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection;
import es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem;
import es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractGroupImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSRS Abstract Requirement Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractRequirementSectionImpl#getSubsections <em>Subsections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractRequirementSectionImpl#getSectionDescription <em>Section Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractRequirementSectionImpl#getSrsItems <em>Srs Items</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractRequirementSectionImpl#getSrsRequirementSubsections <em>Srs Requirement Subsections</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VSRSAbstractRequirementSectionImpl extends VTraceableDocumentAbstractGroupImpl implements VSRSAbstractRequirementSection {
	/**
	 * The cached value of the '{@link #getSectionDescription() <em>Section Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionDescription()
	 * @generated
	 * @ordered
	 */
	protected DBody sectionDescription;

	/**
	 * The cached value of the '{@link #getSrsItems() <em>Srs Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsItems()
	 * @generated
	 * @ordered
	 */
	protected EList<VSRSDocumentItem> srsItems;

	/**
	 * The cached value of the '{@link #getSrsRequirementSubsections() <em>Srs Requirement Subsections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsRequirementSubsections()
	 * @generated
	 * @ordered
	 */
	protected EList<VSRSInstantiableRequirementSection> srsRequirementSubsections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSRSAbstractRequirementSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return srsPackage.Literals.VSRS_ABSTRACT_REQUIREMENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getSectionDescription() {
		return sectionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionDescription(DBody newSectionDescription, NotificationChain msgs) {
		DBody oldSectionDescription = sectionDescription;
		sectionDescription = newSectionDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION, oldSectionDescription, newSectionDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionDescription(DBody newSectionDescription) {
		if (newSectionDescription != sectionDescription) {
			NotificationChain msgs = null;
			if (sectionDescription != null)
				msgs = ((InternalEObject)sectionDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION, null, msgs);
			if (newSectionDescription != null)
				msgs = ((InternalEObject)newSectionDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION, null, msgs);
			msgs = basicSetSectionDescription(newSectionDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION, newSectionDescription, newSectionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSRSDocumentItem> getSrsItems() {
		if (srsItems == null) {
			srsItems = new EObjectContainmentEList<VSRSDocumentItem>(VSRSDocumentItem.class, this, srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS);
		}
		return srsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSRSInstantiableRequirementSection> getSrsRequirementSubsections() {
		if (srsRequirementSubsections == null) {
			srsRequirementSubsections = new EObjectContainmentEList<VSRSInstantiableRequirementSection>(VSRSInstantiableRequirementSection.class, this, srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS);
		}
		return srsRequirementSubsections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION:
				return basicSetSectionDescription(null, msgs);
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS:
				return ((InternalEList<?>)getSrsItems()).basicRemove(otherEnd, msgs);
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS:
				return ((InternalEList<?>)getSrsRequirementSubsections()).basicRemove(otherEnd, msgs);
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
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS:
				return getSubsections();
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION:
				return getSectionDescription();
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS:
				return getSrsItems();
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS:
				return getSrsRequirementSubsections();
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
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS:
				getSubsections().clear();
				getSubsections().addAll((Collection<? extends DAbstractSection>)newValue);
				return;
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION:
				setSectionDescription((DBody)newValue);
				return;
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS:
				getSrsItems().clear();
				getSrsItems().addAll((Collection<? extends VSRSDocumentItem>)newValue);
				return;
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS:
				getSrsRequirementSubsections().clear();
				getSrsRequirementSubsections().addAll((Collection<? extends VSRSInstantiableRequirementSection>)newValue);
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
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS:
				getSubsections().clear();
				return;
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION:
				setSectionDescription((DBody)null);
				return;
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS:
				getSrsItems().clear();
				return;
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS:
				getSrsRequirementSubsections().clear();
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
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS:
				return !getSubsections().isEmpty();
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION:
				return sectionDescription != null;
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS:
				return srsItems != null && !srsItems.isEmpty();
			case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS:
				return srsRequirementSubsections != null && !srsRequirementSubsections.isEmpty();
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
				case srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS: return docPackage.DABSTRACT_SECTION__SUBSECTIONS;
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
				case docPackage.DABSTRACT_SECTION__SUBSECTIONS: return srsPackage.VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;
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
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		subsections.addAll((Collection<? extends DAbstractSection>) getSrsRequirementSubsections());
		return subsections;
	}

	@Override
	public EList<VTraceableDocumentAbstractItem> getItems() {
		EList<VTraceableDocumentAbstractItem> items = new BasicEList<VTraceableDocumentAbstractItem>();
		items.addAll((Collection<? extends VTraceableDocumentAbstractItem>) getSrsItems());
		return items;
	}

} //VSRSAbstractRequirementSectionImpl
