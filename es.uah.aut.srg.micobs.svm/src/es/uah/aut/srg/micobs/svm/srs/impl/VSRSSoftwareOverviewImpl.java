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

import es.uah.aut.srg.micobs.doctpl.doc.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.srs.VSRSFixedSection;
import es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSRS Software Overview</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSoftwareOverviewImpl#getFunctionPurpose <em>Function Purpose</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSoftwareOverviewImpl#getEnvironmentalConsideration <em>Environmental Consideration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSoftwareOverviewImpl#getRelationOtherSystems <em>Relation Other Systems</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSoftwareOverviewImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSRSSoftwareOverviewImpl extends DFixedSectionImpl implements VSRSSoftwareOverview {
	/**
	 * The cached value of the '{@link #getFunctionPurpose() <em>Function Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPurpose()
	 * @generated
	 * @ordered
	 */
	protected VSRSFixedSection functionPurpose;

	/**
	 * The cached value of the '{@link #getEnvironmentalConsideration() <em>Environmental Consideration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalConsideration()
	 * @generated
	 * @ordered
	 */
	protected VSRSFixedSection environmentalConsideration;

	/**
	 * The cached value of the '{@link #getRelationOtherSystems() <em>Relation Other Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationOtherSystems()
	 * @generated
	 * @ordered
	 */
	protected VSRSFixedSection relationOtherSystems;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected VSRSFixedSection constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSRSSoftwareOverviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return srsPackage.Literals.VSRS_SOFTWARE_OVERVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSFixedSection getFunctionPurpose() {
		return functionPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionPurpose(VSRSFixedSection newFunctionPurpose, NotificationChain msgs) {
		VSRSFixedSection oldFunctionPurpose = functionPurpose;
		functionPurpose = newFunctionPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE, oldFunctionPurpose, newFunctionPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionPurpose(VSRSFixedSection newFunctionPurpose) {
		if (newFunctionPurpose != functionPurpose) {
			NotificationChain msgs = null;
			if (functionPurpose != null)
				msgs = ((InternalEObject)functionPurpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE, null, msgs);
			if (newFunctionPurpose != null)
				msgs = ((InternalEObject)newFunctionPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE, null, msgs);
			msgs = basicSetFunctionPurpose(newFunctionPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE, newFunctionPurpose, newFunctionPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSFixedSection getEnvironmentalConsideration() {
		return environmentalConsideration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentalConsideration(VSRSFixedSection newEnvironmentalConsideration, NotificationChain msgs) {
		VSRSFixedSection oldEnvironmentalConsideration = environmentalConsideration;
		environmentalConsideration = newEnvironmentalConsideration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATION, oldEnvironmentalConsideration, newEnvironmentalConsideration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironmentalConsideration(VSRSFixedSection newEnvironmentalConsideration) {
		if (newEnvironmentalConsideration != environmentalConsideration) {
			NotificationChain msgs = null;
			if (environmentalConsideration != null)
				msgs = ((InternalEObject)environmentalConsideration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATION, null, msgs);
			if (newEnvironmentalConsideration != null)
				msgs = ((InternalEObject)newEnvironmentalConsideration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATION, null, msgs);
			msgs = basicSetEnvironmentalConsideration(newEnvironmentalConsideration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATION, newEnvironmentalConsideration, newEnvironmentalConsideration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSFixedSection getRelationOtherSystems() {
		return relationOtherSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationOtherSystems(VSRSFixedSection newRelationOtherSystems, NotificationChain msgs) {
		VSRSFixedSection oldRelationOtherSystems = relationOtherSystems;
		relationOtherSystems = newRelationOtherSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS, oldRelationOtherSystems, newRelationOtherSystems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationOtherSystems(VSRSFixedSection newRelationOtherSystems) {
		if (newRelationOtherSystems != relationOtherSystems) {
			NotificationChain msgs = null;
			if (relationOtherSystems != null)
				msgs = ((InternalEObject)relationOtherSystems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS, null, msgs);
			if (newRelationOtherSystems != null)
				msgs = ((InternalEObject)newRelationOtherSystems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS, null, msgs);
			msgs = basicSetRelationOtherSystems(newRelationOtherSystems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS, newRelationOtherSystems, newRelationOtherSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSFixedSection getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(VSRSFixedSection newConstraints, NotificationChain msgs) {
		VSRSFixedSection oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS, oldConstraints, newConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(VSRSFixedSection newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE:
				return basicSetFunctionPurpose(null, msgs);
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATION:
				return basicSetEnvironmentalConsideration(null, msgs);
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS:
				return basicSetRelationOtherSystems(null, msgs);
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
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
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE:
				return getFunctionPurpose();
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATION:
				return getEnvironmentalConsideration();
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS:
				return getRelationOtherSystems();
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS:
				return getConstraints();
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
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE:
				setFunctionPurpose((VSRSFixedSection)newValue);
				return;
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATION:
				setEnvironmentalConsideration((VSRSFixedSection)newValue);
				return;
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS:
				setRelationOtherSystems((VSRSFixedSection)newValue);
				return;
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS:
				setConstraints((VSRSFixedSection)newValue);
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
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE:
				setFunctionPurpose((VSRSFixedSection)null);
				return;
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATION:
				setEnvironmentalConsideration((VSRSFixedSection)null);
				return;
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS:
				setRelationOtherSystems((VSRSFixedSection)null);
				return;
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS:
				setConstraints((VSRSFixedSection)null);
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
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE:
				return functionPurpose != null;
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATION:
				return environmentalConsideration != null;
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS:
				return relationOtherSystems != null;
			case srsPackage.VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS:
				return constraints != null;
		}
		return super.eIsSet(featureID);
	}

} //VSRSSoftwareOverviewImpl