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

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTest Setup Selected Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSelectedConfigurationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSelectedConfigurationImpl#getDefaultFilterStatus <em>Default Filter Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSelectedConfigurationImpl#getDefaultPrintStatus <em>Default Print Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTestSetupSelectedConfigurationImpl extends MinimalEObjectImpl.Container implements VTestSetupSelectedConfiguration {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupPacketConfiguration configuration;

	/**
	 * The default value of the '{@link #getDefaultFilterStatus() <em>Default Filter Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFilterStatus()
	 * @generated
	 * @ordered
	 */
	protected static final VTestSetupConfigurationStatus DEFAULT_FILTER_STATUS_EDEFAULT = VTestSetupConfigurationStatus.NOT_SET;

	/**
	 * The cached value of the '{@link #getDefaultFilterStatus() <em>Default Filter Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFilterStatus()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupConfigurationStatus defaultFilterStatus = DEFAULT_FILTER_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultPrintStatus() <em>Default Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPrintStatus()
	 * @generated
	 * @ordered
	 */
	protected static final VTestSetupConfigurationStatus DEFAULT_PRINT_STATUS_EDEFAULT = VTestSetupConfigurationStatus.NOT_SET;

	/**
	 * The cached value of the '{@link #getDefaultPrintStatus() <em>Default Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPrintStatus()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupConfigurationStatus defaultPrintStatus = DEFAULT_PRINT_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTestSetupSelectedConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return testsetupPackage.Literals.VTEST_SETUP_SELECTED_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupPacketConfiguration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (VTestSetupPacketConfiguration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupPacketConfiguration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(VTestSetupPacketConfiguration newConfiguration) {
		VTestSetupPacketConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupConfigurationStatus getDefaultFilterStatus() {
		return defaultFilterStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFilterStatus(VTestSetupConfigurationStatus newDefaultFilterStatus) {
		VTestSetupConfigurationStatus oldDefaultFilterStatus = defaultFilterStatus;
		defaultFilterStatus = newDefaultFilterStatus == null ? DEFAULT_FILTER_STATUS_EDEFAULT : newDefaultFilterStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS, oldDefaultFilterStatus, defaultFilterStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupConfigurationStatus getDefaultPrintStatus() {
		return defaultPrintStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultPrintStatus(VTestSetupConfigurationStatus newDefaultPrintStatus) {
		VTestSetupConfigurationStatus oldDefaultPrintStatus = defaultPrintStatus;
		defaultPrintStatus = newDefaultPrintStatus == null ? DEFAULT_PRINT_STATUS_EDEFAULT : newDefaultPrintStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS, oldDefaultPrintStatus, defaultPrintStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS:
				return getDefaultFilterStatus();
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS:
				return getDefaultPrintStatus();
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
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION:
				setConfiguration((VTestSetupPacketConfiguration)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS:
				setDefaultFilterStatus((VTestSetupConfigurationStatus)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS:
				setDefaultPrintStatus((VTestSetupConfigurationStatus)newValue);
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
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION:
				setConfiguration((VTestSetupPacketConfiguration)null);
				return;
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS:
				setDefaultFilterStatus(DEFAULT_FILTER_STATUS_EDEFAULT);
				return;
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS:
				setDefaultPrintStatus(DEFAULT_PRINT_STATUS_EDEFAULT);
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
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION:
				return configuration != null;
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS:
				return defaultFilterStatus != DEFAULT_FILTER_STATUS_EDEFAULT;
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS:
				return defaultPrintStatus != DEFAULT_PRINT_STATUS_EDEFAULT;
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
		result.append(" (defaultFilterStatus: ");
		result.append(defaultFilterStatus);
		result.append(", defaultPrintStatus: ");
		result.append(defaultPrintStatus);
		result.append(')');
		return result.toString();
	}

} //VTestSetupSelectedConfigurationImpl
