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

import es.uah.aut.srg.micobs.doctpl.doc.DBody;

import es.uah.aut.srg.micobs.doctpl.doc.impl.DFixedSectionImpl;
import es.uah.aut.srg.micobs.svm.srs.VSRSTraceabilty;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSRS Traceabilty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSTraceabiltyImpl#getSectionDescription <em>Section Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSRSTraceabiltyImpl extends DFixedSectionImpl implements VSRSTraceabilty {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSRSTraceabiltyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return srsPackage.Literals.VSRS_TRACEABILTY;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_TRACEABILTY__SECTION_DESCRIPTION, oldSectionDescription, newSectionDescription);
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
				msgs = ((InternalEObject)sectionDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_TRACEABILTY__SECTION_DESCRIPTION, null, msgs);
			if (newSectionDescription != null)
				msgs = ((InternalEObject)newSectionDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_TRACEABILTY__SECTION_DESCRIPTION, null, msgs);
			msgs = basicSetSectionDescription(newSectionDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_TRACEABILTY__SECTION_DESCRIPTION, newSectionDescription, newSectionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_TRACEABILTY__SECTION_DESCRIPTION:
				return basicSetSectionDescription(null, msgs);
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
			case srsPackage.VSRS_TRACEABILTY__SECTION_DESCRIPTION:
				return getSectionDescription();
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
			case srsPackage.VSRS_TRACEABILTY__SECTION_DESCRIPTION:
				setSectionDescription((DBody)newValue);
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
			case srsPackage.VSRS_TRACEABILTY__SECTION_DESCRIPTION:
				setSectionDescription((DBody)null);
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
			case srsPackage.VSRS_TRACEABILTY__SECTION_DESCRIPTION:
				return sectionDescription != null;
		}
		return super.eIsSet(featureID);
	}

} //VSRSTraceabiltyImpl
