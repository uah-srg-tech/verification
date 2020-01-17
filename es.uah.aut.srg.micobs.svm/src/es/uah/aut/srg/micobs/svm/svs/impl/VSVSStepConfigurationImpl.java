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

import es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Step Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConfigurationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConfigurationImpl#getFilterStatus <em>Filter Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConfigurationImpl#getPrintStatus <em>Print Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepConfigurationImpl extends MinimalEObjectImpl.Container implements VSVSStepConfiguration {
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
	 * The default value of the '{@link #getFilterStatus() <em>Filter Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterStatus()
	 * @generated
	 * @ordered
	 */
	protected static final VTestSetupConfigurationStatus FILTER_STATUS_EDEFAULT = VTestSetupConfigurationStatus.NOT_SET;
	/**
	 * The cached value of the '{@link #getFilterStatus() <em>Filter Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterStatus()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupConfigurationStatus filterStatus = FILTER_STATUS_EDEFAULT;
	/**
	 * The default value of the '{@link #getPrintStatus() <em>Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintStatus()
	 * @generated
	 * @ordered
	 */
	protected static final VTestSetupConfigurationStatus PRINT_STATUS_EDEFAULT = VTestSetupConfigurationStatus.NOT_SET;
	/**
	 * The cached value of the '{@link #getPrintStatus() <em>Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintStatus()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupConfigurationStatus printStatus = PRINT_STATUS_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_CONFIGURATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_CONFIGURATION__CONFIGURATION, oldConfiguration, configuration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_CONFIGURATION__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupConfigurationStatus getFilterStatus() {
		return filterStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterStatus(VTestSetupConfigurationStatus newFilterStatus) {
		VTestSetupConfigurationStatus oldFilterStatus = filterStatus;
		filterStatus = newFilterStatus == null ? FILTER_STATUS_EDEFAULT : newFilterStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_CONFIGURATION__FILTER_STATUS, oldFilterStatus, filterStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupConfigurationStatus getPrintStatus() {
		return printStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintStatus(VTestSetupConfigurationStatus newPrintStatus) {
		VTestSetupConfigurationStatus oldPrintStatus = printStatus;
		printStatus = newPrintStatus == null ? PRINT_STATUS_EDEFAULT : newPrintStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_CONFIGURATION__PRINT_STATUS, oldPrintStatus, printStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_CONFIGURATION__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
			case svsPackage.VSVS_STEP_CONFIGURATION__FILTER_STATUS:
				return getFilterStatus();
			case svsPackage.VSVS_STEP_CONFIGURATION__PRINT_STATUS:
				return getPrintStatus();
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
			case svsPackage.VSVS_STEP_CONFIGURATION__CONFIGURATION:
				setConfiguration((VTestSetupPacketConfiguration)newValue);
				return;
			case svsPackage.VSVS_STEP_CONFIGURATION__FILTER_STATUS:
				setFilterStatus((VTestSetupConfigurationStatus)newValue);
				return;
			case svsPackage.VSVS_STEP_CONFIGURATION__PRINT_STATUS:
				setPrintStatus((VTestSetupConfigurationStatus)newValue);
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
			case svsPackage.VSVS_STEP_CONFIGURATION__CONFIGURATION:
				setConfiguration((VTestSetupPacketConfiguration)null);
				return;
			case svsPackage.VSVS_STEP_CONFIGURATION__FILTER_STATUS:
				setFilterStatus(FILTER_STATUS_EDEFAULT);
				return;
			case svsPackage.VSVS_STEP_CONFIGURATION__PRINT_STATUS:
				setPrintStatus(PRINT_STATUS_EDEFAULT);
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
			case svsPackage.VSVS_STEP_CONFIGURATION__CONFIGURATION:
				return configuration != null;
			case svsPackage.VSVS_STEP_CONFIGURATION__FILTER_STATUS:
				return filterStatus != FILTER_STATUS_EDEFAULT;
			case svsPackage.VSVS_STEP_CONFIGURATION__PRINT_STATUS:
				return printStatus != PRINT_STATUS_EDEFAULT;
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
		result.append(" (filterStatus: ");
		result.append(filterStatus);
		result.append(", printStatus: ");
		result.append(printStatus);
		result.append(')');
		return result.toString();
	}

} //VSVSStepConfigurationImpl
