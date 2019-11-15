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

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Test Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestDesignImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestDesignImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestDesignImpl#getFeaturesToBeTested <em>Features To Be Tested</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestDesignImpl#getApproachRefinements <em>Approach Refinements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSTestDesignImpl extends DFixedSectionImpl implements VSVSTestDesign {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getFeaturesToBeTested() <em>Features To Be Tested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturesToBeTested()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedSection featuresToBeTested;

	/**
	 * The cached value of the '{@link #getApproachRefinements() <em>Approach Refinements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproachRefinements()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedSection approachRefinements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSTestDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_TEST_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_DESIGN__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_DESIGN__GENERAL, oldGeneral, newGeneral);
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
				msgs = ((InternalEObject)general).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_DESIGN__GENERAL, null, msgs);
			if (newGeneral != null)
				msgs = ((InternalEObject)newGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_DESIGN__GENERAL, null, msgs);
			msgs = basicSetGeneral(newGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_DESIGN__GENERAL, newGeneral, newGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedSection getFeaturesToBeTested() {
		return featuresToBeTested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeaturesToBeTested(VSVSFixedSection newFeaturesToBeTested, NotificationChain msgs) {
		VSVSFixedSection oldFeaturesToBeTested = featuresToBeTested;
		featuresToBeTested = newFeaturesToBeTested;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED, oldFeaturesToBeTested, newFeaturesToBeTested);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturesToBeTested(VSVSFixedSection newFeaturesToBeTested) {
		if (newFeaturesToBeTested != featuresToBeTested) {
			NotificationChain msgs = null;
			if (featuresToBeTested != null)
				msgs = ((InternalEObject)featuresToBeTested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED, null, msgs);
			if (newFeaturesToBeTested != null)
				msgs = ((InternalEObject)newFeaturesToBeTested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED, null, msgs);
			msgs = basicSetFeaturesToBeTested(newFeaturesToBeTested, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED, newFeaturesToBeTested, newFeaturesToBeTested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedSection getApproachRefinements() {
		return approachRefinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApproachRefinements(VSVSFixedSection newApproachRefinements, NotificationChain msgs) {
		VSVSFixedSection oldApproachRefinements = approachRefinements;
		approachRefinements = newApproachRefinements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_DESIGN__APPROACH_REFINEMENTS, oldApproachRefinements, newApproachRefinements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproachRefinements(VSVSFixedSection newApproachRefinements) {
		if (newApproachRefinements != approachRefinements) {
			NotificationChain msgs = null;
			if (approachRefinements != null)
				msgs = ((InternalEObject)approachRefinements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_DESIGN__APPROACH_REFINEMENTS, null, msgs);
			if (newApproachRefinements != null)
				msgs = ((InternalEObject)newApproachRefinements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_DESIGN__APPROACH_REFINEMENTS, null, msgs);
			msgs = basicSetApproachRefinements(newApproachRefinements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_DESIGN__APPROACH_REFINEMENTS, newApproachRefinements, newApproachRefinements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_TEST_DESIGN__GENERAL:
				return basicSetGeneral(null, msgs);
			case svsPackage.VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED:
				return basicSetFeaturesToBeTested(null, msgs);
			case svsPackage.VSVS_TEST_DESIGN__APPROACH_REFINEMENTS:
				return basicSetApproachRefinements(null, msgs);
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
			case svsPackage.VSVS_TEST_DESIGN__NAME:
				return getName();
			case svsPackage.VSVS_TEST_DESIGN__GENERAL:
				return getGeneral();
			case svsPackage.VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED:
				return getFeaturesToBeTested();
			case svsPackage.VSVS_TEST_DESIGN__APPROACH_REFINEMENTS:
				return getApproachRefinements();
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
			case svsPackage.VSVS_TEST_DESIGN__NAME:
				setName((String)newValue);
				return;
			case svsPackage.VSVS_TEST_DESIGN__GENERAL:
				setGeneral((VSVSFixedSection)newValue);
				return;
			case svsPackage.VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED:
				setFeaturesToBeTested((VSVSFixedSection)newValue);
				return;
			case svsPackage.VSVS_TEST_DESIGN__APPROACH_REFINEMENTS:
				setApproachRefinements((VSVSFixedSection)newValue);
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
			case svsPackage.VSVS_TEST_DESIGN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case svsPackage.VSVS_TEST_DESIGN__GENERAL:
				setGeneral((VSVSFixedSection)null);
				return;
			case svsPackage.VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED:
				setFeaturesToBeTested((VSVSFixedSection)null);
				return;
			case svsPackage.VSVS_TEST_DESIGN__APPROACH_REFINEMENTS:
				setApproachRefinements((VSVSFixedSection)null);
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
			case svsPackage.VSVS_TEST_DESIGN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case svsPackage.VSVS_TEST_DESIGN__GENERAL:
				return general != null;
			case svsPackage.VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED:
				return featuresToBeTested != null;
			case svsPackage.VSVS_TEST_DESIGN__APPROACH_REFINEMENTS:
				return approachRefinements != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		return ECollections.emptyEList();
	}

} //VSVSTestDesignImpl
