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
package es.uah.aut.srg.micobs.svm.svs.impl;

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCase;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCases;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocument;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentFixedGroupImpl;

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
 * An implementation of the model object '<em><b>VSVS Test Cases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCasesImpl#getSubsections <em>Subsections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCasesImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCasesImpl#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSTestCasesImpl extends VValidationDocumentFixedGroupImpl implements VSVSTestCases {
	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedSection general;

	/**
	 * The cached value of the '{@link #getTestCases() <em>Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSTestCase> testCases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSTestCasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_TEST_CASES;
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		subsections.add((DAbstractSection) getGeneral());
		
		for(DAbstractSection procedure : getTestCases()) {
			subsections.add(procedure);
		}
		return subsections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedSection getGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneral(VSVSFixedSection newGeneral, NotificationChain msgs) {
		VSVSFixedSection oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASES__GENERAL, oldGeneral, newGeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(VSVSFixedSection newGeneral) {
		if (newGeneral != general) {
			NotificationChain msgs = null;
			if (general != null)
				msgs = ((InternalEObject)general).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASES__GENERAL, null, msgs);
			if (newGeneral != null)
				msgs = ((InternalEObject)newGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASES__GENERAL, null, msgs);
			msgs = basicSetGeneral(newGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASES__GENERAL, newGeneral, newGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSTestCase> getTestCases() {
		if (testCases == null) {
			testCases = new EObjectContainmentEList<VSVSTestCase>(VSVSTestCase.class, this, svsPackage.VSVS_TEST_CASES__TEST_CASES);
		}
		return testCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_TEST_CASES__GENERAL:
				return basicSetGeneral(null, msgs);
			case svsPackage.VSVS_TEST_CASES__TEST_CASES:
				return ((InternalEList<?>)getTestCases()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_TEST_CASES__SUBSECTIONS:
				return getSubsections();
			case svsPackage.VSVS_TEST_CASES__GENERAL:
				return getGeneral();
			case svsPackage.VSVS_TEST_CASES__TEST_CASES:
				return getTestCases();
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
			case svsPackage.VSVS_TEST_CASES__SUBSECTIONS:
				getSubsections().clear();
				getSubsections().addAll((Collection<? extends DAbstractSection>)newValue);
				return;
			case svsPackage.VSVS_TEST_CASES__GENERAL:
				setGeneral((VSVSFixedSection)newValue);
				return;
			case svsPackage.VSVS_TEST_CASES__TEST_CASES:
				getTestCases().clear();
				getTestCases().addAll((Collection<? extends VSVSTestCase>)newValue);
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
			case svsPackage.VSVS_TEST_CASES__SUBSECTIONS:
				getSubsections().clear();
				return;
			case svsPackage.VSVS_TEST_CASES__GENERAL:
				setGeneral((VSVSFixedSection)null);
				return;
			case svsPackage.VSVS_TEST_CASES__TEST_CASES:
				getTestCases().clear();
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
			case svsPackage.VSVS_TEST_CASES__SUBSECTIONS:
				return !getSubsections().isEmpty();
			case svsPackage.VSVS_TEST_CASES__GENERAL:
				return general != null;
			case svsPackage.VSVS_TEST_CASES__TEST_CASES:
				return testCases != null && !testCases.isEmpty();
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
				case svsPackage.VSVS_TEST_CASES__SUBSECTIONS: return docPackage.DABSTRACT_SECTION__SUBSECTIONS;
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
				case docPackage.DABSTRACT_SECTION__SUBSECTIONS: return svsPackage.VSVS_TEST_CASES__SUBSECTIONS;
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
	public EList<VValidationDocumentAbstractItem> getItems() {
		EList<VValidationDocumentAbstractItem> items = new BasicEList<VValidationDocumentAbstractItem>();
		
		for(VValidationDocumentAbstractItem item : getTestCases()) {
			items.add(item);
		}
		return items;
	}
	
	@Override
	public VValidationDocument basicGetDoc() {
		return (VValidationDocument)eContainer();
	}

} //VSVSTestCasesImpl
