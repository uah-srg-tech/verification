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

import es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirement;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedSectionImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Specific Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSystemInterface <em>System Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getAdaptationMissionization <em>Adaptation Missionization</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getComputerResource <em>Computer Resource</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSafety <em>Safety</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getReliabiltyAvailability <em>Reliabilty Availability</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSoftwareOperations <em>Software Operations</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSoftwareMaintenance <em>Software Maintenance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSystemSoftwareObservability <em>System Software Observability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSSpecificRequirementsImpl extends VTraceableDocumentFixedSectionImpl implements VSSSSpecificRequirements {
	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSGeneralDescription> general;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSCapabilitiesRequirement> capabilities;

	/**
	 * The cached value of the '{@link #getSystemInterface() <em>System Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSSystemInterfaceRequirement> systemInterface;

	/**
	 * The cached value of the '{@link #getAdaptationMissionization() <em>Adaptation Missionization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationMissionization()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSAdaptationMissionizationRequirement> adaptationMissionization;

	/**
	 * The cached value of the '{@link #getComputerResource() <em>Computer Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputerResource()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSComputerResourceRequirement> computerResource;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSSecurityRequirement> security;

	/**
	 * The cached value of the '{@link #getSafety() <em>Safety</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafety()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSSafetyRequirement> safety;

	/**
	 * The cached value of the '{@link #getReliabiltyAvailability() <em>Reliabilty Availability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabiltyAvailability()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSReliabiltyAvailabilityRequirement> reliabiltyAvailability;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSQualityRequirement> quality;

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSDesignRequirement> design;

	/**
	 * The cached value of the '{@link #getSoftwareOperations() <em>Software Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSSoftwareOperationsRequirement> softwareOperations;

	/**
	 * The cached value of the '{@link #getSoftwareMaintenance() <em>Software Maintenance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareMaintenance()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSSoftwareMaintenanceRequirement> softwareMaintenance;

	/**
	 * The cached value of the '{@link #getSystemSoftwareObservability() <em>System Software Observability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemSoftwareObservability()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSSystemSoftwareObservabilityRequirement> systemSoftwareObservability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSSpecificRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_SPECIFIC_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSGeneralDescription> getGeneral() {
		if (general == null) {
			general = new EObjectContainmentEList<VSSSGeneralDescription>(VSSSGeneralDescription.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL);
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSCapabilitiesRequirement> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<VSSSCapabilitiesRequirement>(VSSSCapabilitiesRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSSystemInterfaceRequirement> getSystemInterface() {
		if (systemInterface == null) {
			systemInterface = new EObjectContainmentEList<VSSSSystemInterfaceRequirement>(VSSSSystemInterfaceRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE);
		}
		return systemInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSAdaptationMissionizationRequirement> getAdaptationMissionization() {
		if (adaptationMissionization == null) {
			adaptationMissionization = new EObjectContainmentEList<VSSSAdaptationMissionizationRequirement>(VSSSAdaptationMissionizationRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION);
		}
		return adaptationMissionization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSComputerResourceRequirement> getComputerResource() {
		if (computerResource == null) {
			computerResource = new EObjectContainmentEList<VSSSComputerResourceRequirement>(VSSSComputerResourceRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE);
		}
		return computerResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSSecurityRequirement> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<VSSSSecurityRequirement>(VSSSSecurityRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSSafetyRequirement> getSafety() {
		if (safety == null) {
			safety = new EObjectContainmentEList<VSSSSafetyRequirement>(VSSSSafetyRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY);
		}
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSReliabiltyAvailabilityRequirement> getReliabiltyAvailability() {
		if (reliabiltyAvailability == null) {
			reliabiltyAvailability = new EObjectContainmentEList<VSSSReliabiltyAvailabilityRequirement>(VSSSReliabiltyAvailabilityRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY);
		}
		return reliabiltyAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSQualityRequirement> getQuality() {
		if (quality == null) {
			quality = new EObjectContainmentEList<VSSSQualityRequirement>(VSSSQualityRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY);
		}
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSDesignRequirement> getDesign() {
		if (design == null) {
			design = new EObjectContainmentEList<VSSSDesignRequirement>(VSSSDesignRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN);
		}
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSSoftwareOperationsRequirement> getSoftwareOperations() {
		if (softwareOperations == null) {
			softwareOperations = new EObjectContainmentEList<VSSSSoftwareOperationsRequirement>(VSSSSoftwareOperationsRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS);
		}
		return softwareOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSSoftwareMaintenanceRequirement> getSoftwareMaintenance() {
		if (softwareMaintenance == null) {
			softwareMaintenance = new EObjectContainmentEList<VSSSSoftwareMaintenanceRequirement>(VSSSSoftwareMaintenanceRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE);
		}
		return softwareMaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSSystemSoftwareObservabilityRequirement> getSystemSoftwareObservability() {
		if (systemSoftwareObservability == null) {
			systemSoftwareObservability = new EObjectContainmentEList<VSSSSystemSoftwareObservabilityRequirement>(VSSSSystemSoftwareObservabilityRequirement.class, this, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY);
		}
		return systemSoftwareObservability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL:
				return ((InternalEList<?>)getGeneral()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE:
				return ((InternalEList<?>)getSystemInterface()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION:
				return ((InternalEList<?>)getAdaptationMissionization()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE:
				return ((InternalEList<?>)getComputerResource()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY:
				return ((InternalEList<?>)getSecurity()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY:
				return ((InternalEList<?>)getSafety()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY:
				return ((InternalEList<?>)getReliabiltyAvailability()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY:
				return ((InternalEList<?>)getQuality()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN:
				return ((InternalEList<?>)getDesign()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS:
				return ((InternalEList<?>)getSoftwareOperations()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE:
				return ((InternalEList<?>)getSoftwareMaintenance()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY:
				return ((InternalEList<?>)getSystemSoftwareObservability()).basicRemove(otherEnd, msgs);
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
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL:
				return getGeneral();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES:
				return getCapabilities();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE:
				return getSystemInterface();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION:
				return getAdaptationMissionization();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE:
				return getComputerResource();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY:
				return getSecurity();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY:
				return getSafety();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY:
				return getReliabiltyAvailability();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY:
				return getQuality();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN:
				return getDesign();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS:
				return getSoftwareOperations();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE:
				return getSoftwareMaintenance();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY:
				return getSystemSoftwareObservability();
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
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends VSSSGeneralDescription>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends VSSSCapabilitiesRequirement>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE:
				getSystemInterface().clear();
				getSystemInterface().addAll((Collection<? extends VSSSSystemInterfaceRequirement>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION:
				getAdaptationMissionization().clear();
				getAdaptationMissionization().addAll((Collection<? extends VSSSAdaptationMissionizationRequirement>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE:
				getComputerResource().clear();
				getComputerResource().addAll((Collection<? extends VSSSComputerResourceRequirement>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends VSSSSecurityRequirement>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY:
				getSafety().clear();
				getSafety().addAll((Collection<? extends VSSSSafetyRequirement>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY:
				getReliabiltyAvailability().clear();
				getReliabiltyAvailability().addAll((Collection<? extends VSSSReliabiltyAvailabilityRequirement>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY:
				getQuality().clear();
				getQuality().addAll((Collection<? extends VSSSQualityRequirement>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN:
				getDesign().clear();
				getDesign().addAll((Collection<? extends VSSSDesignRequirement>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS:
				getSoftwareOperations().clear();
				getSoftwareOperations().addAll((Collection<? extends VSSSSoftwareOperationsRequirement>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE:
				getSoftwareMaintenance().clear();
				getSoftwareMaintenance().addAll((Collection<? extends VSSSSoftwareMaintenanceRequirement>)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY:
				getSystemSoftwareObservability().clear();
				getSystemSoftwareObservability().addAll((Collection<? extends VSSSSystemSoftwareObservabilityRequirement>)newValue);
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
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL:
				getGeneral().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES:
				getCapabilities().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE:
				getSystemInterface().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION:
				getAdaptationMissionization().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE:
				getComputerResource().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY:
				getSecurity().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY:
				getSafety().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY:
				getReliabiltyAvailability().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY:
				getQuality().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN:
				getDesign().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS:
				getSoftwareOperations().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE:
				getSoftwareMaintenance().clear();
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY:
				getSystemSoftwareObservability().clear();
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
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL:
				return general != null && !general.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE:
				return systemInterface != null && !systemInterface.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION:
				return adaptationMissionization != null && !adaptationMissionization.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE:
				return computerResource != null && !computerResource.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY:
				return security != null && !security.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY:
				return safety != null && !safety.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY:
				return reliabiltyAvailability != null && !reliabiltyAvailability.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY:
				return quality != null && !quality.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN:
				return design != null && !design.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS:
				return softwareOperations != null && !softwareOperations.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE:
				return softwareMaintenance != null && !softwareMaintenance.isEmpty();
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY:
				return systemSoftwareObservability != null && !systemSoftwareObservability.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VSSSSpecificRequirementsImpl
