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
package es.uah.aut.srg.micobs.svm.testsetup.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DRun;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;

import es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader;

import es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTest Setup Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl#getTcHeader <em>Tc Header</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl#getTmHeader <em>Tm Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTestSetupInterfaceImpl extends MinimalEObjectImpl.Container implements VTestSetupInterface {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DRun description;

	/**
	 * The cached value of the '{@link #getTcHeader() <em>Tc Header</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcHeader()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFTCHeader tcHeader;

	/**
	 * The cached value of the '{@link #getTmHeader() <em>Tm Header</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmHeader()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFTMHeader tmHeader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTestSetupInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return testsetupPackage.Literals.VTEST_SETUP_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRun getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DRun newDescription, NotificationChain msgs) {
		DRun oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_INTERFACE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DRun newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_INTERFACE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_INTERFACE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_INTERFACE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTCHeader getTcHeader() {
		if (tcHeader != null && tcHeader.eIsProxy()) {
			InternalEObject oldTcHeader = (InternalEObject)tcHeader;
			tcHeader = (TMTCIFTCHeader)eResolveProxy(oldTcHeader);
			if (tcHeader != oldTcHeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, testsetupPackage.VTEST_SETUP_INTERFACE__TC_HEADER, oldTcHeader, tcHeader));
			}
		}
		return tcHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTCHeader basicGetTcHeader() {
		return tcHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTcHeader(TMTCIFTCHeader newTcHeader) {
		TMTCIFTCHeader oldTcHeader = tcHeader;
		tcHeader = newTcHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_INTERFACE__TC_HEADER, oldTcHeader, tcHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTMHeader getTmHeader() {
		if (tmHeader != null && tmHeader.eIsProxy()) {
			InternalEObject oldTmHeader = (InternalEObject)tmHeader;
			tmHeader = (TMTCIFTMHeader)eResolveProxy(oldTmHeader);
			if (tmHeader != oldTmHeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, testsetupPackage.VTEST_SETUP_INTERFACE__TM_HEADER, oldTmHeader, tmHeader));
			}
		}
		return tmHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTMHeader basicGetTmHeader() {
		return tmHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmHeader(TMTCIFTMHeader newTmHeader) {
		TMTCIFTMHeader oldTmHeader = tmHeader;
		tmHeader = newTmHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_INTERFACE__TM_HEADER, oldTmHeader, tmHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_INTERFACE__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case testsetupPackage.VTEST_SETUP_INTERFACE__NAME:
				return getName();
			case testsetupPackage.VTEST_SETUP_INTERFACE__DESCRIPTION:
				return getDescription();
			case testsetupPackage.VTEST_SETUP_INTERFACE__TC_HEADER:
				if (resolve) return getTcHeader();
				return basicGetTcHeader();
			case testsetupPackage.VTEST_SETUP_INTERFACE__TM_HEADER:
				if (resolve) return getTmHeader();
				return basicGetTmHeader();
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
			case testsetupPackage.VTEST_SETUP_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_INTERFACE__DESCRIPTION:
				setDescription((DRun)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_INTERFACE__TC_HEADER:
				setTcHeader((TMTCIFTCHeader)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_INTERFACE__TM_HEADER:
				setTmHeader((TMTCIFTMHeader)newValue);
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
			case testsetupPackage.VTEST_SETUP_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case testsetupPackage.VTEST_SETUP_INTERFACE__DESCRIPTION:
				setDescription((DRun)null);
				return;
			case testsetupPackage.VTEST_SETUP_INTERFACE__TC_HEADER:
				setTcHeader((TMTCIFTCHeader)null);
				return;
			case testsetupPackage.VTEST_SETUP_INTERFACE__TM_HEADER:
				setTmHeader((TMTCIFTMHeader)null);
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
			case testsetupPackage.VTEST_SETUP_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case testsetupPackage.VTEST_SETUP_INTERFACE__DESCRIPTION:
				return description != null;
			case testsetupPackage.VTEST_SETUP_INTERFACE__TC_HEADER:
				return tcHeader != null;
			case testsetupPackage.VTEST_SETUP_INTERFACE__TM_HEADER:
				return tmHeader != null;
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

} //VTestSetupInterfaceImpl
