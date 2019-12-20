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

import es.uah.aut.srg.micobs.svm.svs.VSVSConfigurationStatus;
import es.uah.aut.srg.micobs.svm.svs.VSVSPacketConfiguration;
import es.uah.aut.srg.micobs.svm.svs.VSVSSelectedConfiguration;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Selected Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSSelectedConfigurationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSSelectedConfigurationImpl#getDefaultFilterStatus <em>Default Filter Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSSelectedConfigurationImpl#getDefaultPrintStatus <em>Default Print Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSSelectedConfigurationImpl extends MinimalEObjectImpl.Container implements VSVSSelectedConfiguration {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected VSVSPacketConfiguration configuration;

	/**
	 * The default value of the '{@link #getDefaultFilterStatus() <em>Default Filter Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFilterStatus()
	 * @generated
	 * @ordered
	 */
	protected static final VSVSConfigurationStatus DEFAULT_FILTER_STATUS_EDEFAULT = VSVSConfigurationStatus.NOT_SET;

	/**
	 * The cached value of the '{@link #getDefaultFilterStatus() <em>Default Filter Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFilterStatus()
	 * @generated
	 * @ordered
	 */
	protected VSVSConfigurationStatus defaultFilterStatus = DEFAULT_FILTER_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultPrintStatus() <em>Default Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPrintStatus()
	 * @generated
	 * @ordered
	 */
	protected static final VSVSConfigurationStatus DEFAULT_PRINT_STATUS_EDEFAULT = VSVSConfigurationStatus.NOT_SET;

	/**
	 * The cached value of the '{@link #getDefaultPrintStatus() <em>Default Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPrintStatus()
	 * @generated
	 * @ordered
	 */
	protected VSVSConfigurationStatus defaultPrintStatus = DEFAULT_PRINT_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSSelectedConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_SELECTED_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSPacketConfiguration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (VSVSPacketConfiguration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_SELECTED_CONFIGURATION__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSPacketConfiguration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(VSVSPacketConfiguration newConfiguration) {
		VSVSPacketConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_SELECTED_CONFIGURATION__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSConfigurationStatus getDefaultFilterStatus() {
		return defaultFilterStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFilterStatus(VSVSConfigurationStatus newDefaultFilterStatus) {
		VSVSConfigurationStatus oldDefaultFilterStatus = defaultFilterStatus;
		defaultFilterStatus = newDefaultFilterStatus == null ? DEFAULT_FILTER_STATUS_EDEFAULT : newDefaultFilterStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS, oldDefaultFilterStatus, defaultFilterStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSConfigurationStatus getDefaultPrintStatus() {
		return defaultPrintStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultPrintStatus(VSVSConfigurationStatus newDefaultPrintStatus) {
		VSVSConfigurationStatus oldDefaultPrintStatus = defaultPrintStatus;
		defaultPrintStatus = newDefaultPrintStatus == null ? DEFAULT_PRINT_STATUS_EDEFAULT : newDefaultPrintStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS, oldDefaultPrintStatus, defaultPrintStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case svsPackage.VSVS_SELECTED_CONFIGURATION__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
			case svsPackage.VSVS_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS:
				return getDefaultFilterStatus();
			case svsPackage.VSVS_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS:
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
			case svsPackage.VSVS_SELECTED_CONFIGURATION__CONFIGURATION:
				setConfiguration((VSVSPacketConfiguration)newValue);
				return;
			case svsPackage.VSVS_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS:
				setDefaultFilterStatus((VSVSConfigurationStatus)newValue);
				return;
			case svsPackage.VSVS_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS:
				setDefaultPrintStatus((VSVSConfigurationStatus)newValue);
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
			case svsPackage.VSVS_SELECTED_CONFIGURATION__CONFIGURATION:
				setConfiguration((VSVSPacketConfiguration)null);
				return;
			case svsPackage.VSVS_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS:
				setDefaultFilterStatus(DEFAULT_FILTER_STATUS_EDEFAULT);
				return;
			case svsPackage.VSVS_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS:
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
			case svsPackage.VSVS_SELECTED_CONFIGURATION__CONFIGURATION:
				return configuration != null;
			case svsPackage.VSVS_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS:
				return defaultFilterStatus != DEFAULT_FILTER_STATUS_EDEFAULT;
			case svsPackage.VSVS_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS:
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

} //VSVSSelectedConfigurationImpl
