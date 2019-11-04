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

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSReliabilityAvailabilityRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirements;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Specific Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSectionDescription <em>Section Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSystemInterface <em>System Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getAdaptationMissionization <em>Adaptation Missionization</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getComputerResource <em>Computer Resource</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSafety <em>Safety</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getReliabilityAvailability <em>Reliability Availability</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSoftwareOperations <em>Software Operations</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSoftwareMaintenance <em>Software Maintenance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl#getSystemSoftwareObservability <em>System Software Observability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSSpecificRequirementsImpl extends es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl implements VSSSSpecificRequirements {
	/**
	 * The cached value of the '{@link #getSectionDescription() <em>Section Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionDescription()
	 * @generated
	 * @ordered
	 */
	protected es.uah.aut.srg.micobs.doctpl.doctpl.DBody sectionDescription;

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected VSSSGeneralRequirements general;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected VSSSCapabilitiesRequirements capabilities;

	/**
	 * The cached value of the '{@link #getSystemInterface() <em>System Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemInterface()
	 * @generated
	 * @ordered
	 */
	protected VSSSSystemInterfaceRequirements systemInterface;

	/**
	 * The cached value of the '{@link #getAdaptationMissionization() <em>Adaptation Missionization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationMissionization()
	 * @generated
	 * @ordered
	 */
	protected VSSSAdaptationMissionizationRequirements adaptationMissionization;

	/**
	 * The cached value of the '{@link #getComputerResource() <em>Computer Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputerResource()
	 * @generated
	 * @ordered
	 */
	protected VSSSComputerResourceRequirements computerResource;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected VSSSSecurityRequirements security;

	/**
	 * The cached value of the '{@link #getSafety() <em>Safety</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafety()
	 * @generated
	 * @ordered
	 */
	protected VSSSSafetyRequirements safety;

	/**
	 * The cached value of the '{@link #getReliabilityAvailability() <em>Reliability Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityAvailability()
	 * @generated
	 * @ordered
	 */
	protected VSSSReliabilityAvailabilityRequirements reliabilityAvailability;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected VSSSQualityRequirements quality;

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected VSSSDesignRequirements design;

	/**
	 * The cached value of the '{@link #getSoftwareOperations() <em>Software Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareOperations()
	 * @generated
	 * @ordered
	 */
	protected VSSSSoftwareOperationsRequirements softwareOperations;

	/**
	 * The cached value of the '{@link #getSoftwareMaintenance() <em>Software Maintenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareMaintenance()
	 * @generated
	 * @ordered
	 */
	protected VSSSSoftwareMaintenanceRequirements softwareMaintenance;

	/**
	 * The cached value of the '{@link #getSystemSoftwareObservability() <em>System Software Observability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemSoftwareObservability()
	 * @generated
	 * @ordered
	 */
	protected VSSSSystemSoftwareObservabilityRequirements systemSoftwareObservability;

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
	public es.uah.aut.srg.micobs.doctpl.doctpl.DBody getSectionDescription() {
		return sectionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionDescription(es.uah.aut.srg.micobs.doctpl.doctpl.DBody newSectionDescription, NotificationChain msgs) {
		es.uah.aut.srg.micobs.doctpl.doctpl.DBody oldSectionDescription = sectionDescription;
		sectionDescription = newSectionDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECTION_DESCRIPTION, oldSectionDescription, newSectionDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionDescription(es.uah.aut.srg.micobs.doctpl.doctpl.DBody newSectionDescription) {
		if (newSectionDescription != sectionDescription) {
			NotificationChain msgs = null;
			if (sectionDescription != null)
				msgs = ((InternalEObject)sectionDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECTION_DESCRIPTION, null, msgs);
			if (newSectionDescription != null)
				msgs = ((InternalEObject)newSectionDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECTION_DESCRIPTION, null, msgs);
			msgs = basicSetSectionDescription(newSectionDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECTION_DESCRIPTION, newSectionDescription, newSectionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSGeneralRequirements getGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneral(VSSSGeneralRequirements newGeneral, NotificationChain msgs) {
		VSSSGeneralRequirements oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL, oldGeneral, newGeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(VSSSGeneralRequirements newGeneral) {
		if (newGeneral != general) {
			NotificationChain msgs = null;
			if (general != null)
				msgs = ((InternalEObject)general).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL, null, msgs);
			if (newGeneral != null)
				msgs = ((InternalEObject)newGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL, null, msgs);
			msgs = basicSetGeneral(newGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL, newGeneral, newGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSCapabilitiesRequirements getCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilities(VSSSCapabilitiesRequirements newCapabilities, NotificationChain msgs) {
		VSSSCapabilitiesRequirements oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES, oldCapabilities, newCapabilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilities(VSSSCapabilitiesRequirements newCapabilities) {
		if (newCapabilities != capabilities) {
			NotificationChain msgs = null;
			if (capabilities != null)
				msgs = ((InternalEObject)capabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES, null, msgs);
			if (newCapabilities != null)
				msgs = ((InternalEObject)newCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES, null, msgs);
			msgs = basicSetCapabilities(newCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES, newCapabilities, newCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSystemInterfaceRequirements getSystemInterface() {
		return systemInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemInterface(VSSSSystemInterfaceRequirements newSystemInterface, NotificationChain msgs) {
		VSSSSystemInterfaceRequirements oldSystemInterface = systemInterface;
		systemInterface = newSystemInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE, oldSystemInterface, newSystemInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemInterface(VSSSSystemInterfaceRequirements newSystemInterface) {
		if (newSystemInterface != systemInterface) {
			NotificationChain msgs = null;
			if (systemInterface != null)
				msgs = ((InternalEObject)systemInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE, null, msgs);
			if (newSystemInterface != null)
				msgs = ((InternalEObject)newSystemInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE, null, msgs);
			msgs = basicSetSystemInterface(newSystemInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE, newSystemInterface, newSystemInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSAdaptationMissionizationRequirements getAdaptationMissionization() {
		return adaptationMissionization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdaptationMissionization(VSSSAdaptationMissionizationRequirements newAdaptationMissionization, NotificationChain msgs) {
		VSSSAdaptationMissionizationRequirements oldAdaptationMissionization = adaptationMissionization;
		adaptationMissionization = newAdaptationMissionization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION, oldAdaptationMissionization, newAdaptationMissionization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationMissionization(VSSSAdaptationMissionizationRequirements newAdaptationMissionization) {
		if (newAdaptationMissionization != adaptationMissionization) {
			NotificationChain msgs = null;
			if (adaptationMissionization != null)
				msgs = ((InternalEObject)adaptationMissionization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION, null, msgs);
			if (newAdaptationMissionization != null)
				msgs = ((InternalEObject)newAdaptationMissionization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION, null, msgs);
			msgs = basicSetAdaptationMissionization(newAdaptationMissionization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION, newAdaptationMissionization, newAdaptationMissionization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSComputerResourceRequirements getComputerResource() {
		return computerResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputerResource(VSSSComputerResourceRequirements newComputerResource, NotificationChain msgs) {
		VSSSComputerResourceRequirements oldComputerResource = computerResource;
		computerResource = newComputerResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE, oldComputerResource, newComputerResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputerResource(VSSSComputerResourceRequirements newComputerResource) {
		if (newComputerResource != computerResource) {
			NotificationChain msgs = null;
			if (computerResource != null)
				msgs = ((InternalEObject)computerResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE, null, msgs);
			if (newComputerResource != null)
				msgs = ((InternalEObject)newComputerResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE, null, msgs);
			msgs = basicSetComputerResource(newComputerResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE, newComputerResource, newComputerResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSecurityRequirements getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(VSSSSecurityRequirements newSecurity, NotificationChain msgs) {
		VSSSSecurityRequirements oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY, oldSecurity, newSecurity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(VSSSSecurityRequirements newSecurity) {
		if (newSecurity != security) {
			NotificationChain msgs = null;
			if (security != null)
				msgs = ((InternalEObject)security).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY, null, msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY, null, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY, newSecurity, newSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSafetyRequirements getSafety() {
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSafety(VSSSSafetyRequirements newSafety, NotificationChain msgs) {
		VSSSSafetyRequirements oldSafety = safety;
		safety = newSafety;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY, oldSafety, newSafety);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafety(VSSSSafetyRequirements newSafety) {
		if (newSafety != safety) {
			NotificationChain msgs = null;
			if (safety != null)
				msgs = ((InternalEObject)safety).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY, null, msgs);
			if (newSafety != null)
				msgs = ((InternalEObject)newSafety).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY, null, msgs);
			msgs = basicSetSafety(newSafety, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY, newSafety, newSafety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSReliabilityAvailabilityRequirements getReliabilityAvailability() {
		return reliabilityAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliabilityAvailability(VSSSReliabilityAvailabilityRequirements newReliabilityAvailability, NotificationChain msgs) {
		VSSSReliabilityAvailabilityRequirements oldReliabilityAvailability = reliabilityAvailability;
		reliabilityAvailability = newReliabilityAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILITY_AVAILABILITY, oldReliabilityAvailability, newReliabilityAvailability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliabilityAvailability(VSSSReliabilityAvailabilityRequirements newReliabilityAvailability) {
		if (newReliabilityAvailability != reliabilityAvailability) {
			NotificationChain msgs = null;
			if (reliabilityAvailability != null)
				msgs = ((InternalEObject)reliabilityAvailability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILITY_AVAILABILITY, null, msgs);
			if (newReliabilityAvailability != null)
				msgs = ((InternalEObject)newReliabilityAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILITY_AVAILABILITY, null, msgs);
			msgs = basicSetReliabilityAvailability(newReliabilityAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILITY_AVAILABILITY, newReliabilityAvailability, newReliabilityAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSQualityRequirements getQuality() {
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuality(VSSSQualityRequirements newQuality, NotificationChain msgs) {
		VSSSQualityRequirements oldQuality = quality;
		quality = newQuality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY, oldQuality, newQuality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuality(VSSSQualityRequirements newQuality) {
		if (newQuality != quality) {
			NotificationChain msgs = null;
			if (quality != null)
				msgs = ((InternalEObject)quality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY, null, msgs);
			if (newQuality != null)
				msgs = ((InternalEObject)newQuality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY, null, msgs);
			msgs = basicSetQuality(newQuality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY, newQuality, newQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSDesignRequirements getDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(VSSSDesignRequirements newDesign, NotificationChain msgs) {
		VSSSDesignRequirements oldDesign = design;
		design = newDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN, oldDesign, newDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(VSSSDesignRequirements newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN, null, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN, null, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN, newDesign, newDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSoftwareOperationsRequirements getSoftwareOperations() {
		return softwareOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareOperations(VSSSSoftwareOperationsRequirements newSoftwareOperations, NotificationChain msgs) {
		VSSSSoftwareOperationsRequirements oldSoftwareOperations = softwareOperations;
		softwareOperations = newSoftwareOperations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS, oldSoftwareOperations, newSoftwareOperations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareOperations(VSSSSoftwareOperationsRequirements newSoftwareOperations) {
		if (newSoftwareOperations != softwareOperations) {
			NotificationChain msgs = null;
			if (softwareOperations != null)
				msgs = ((InternalEObject)softwareOperations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS, null, msgs);
			if (newSoftwareOperations != null)
				msgs = ((InternalEObject)newSoftwareOperations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS, null, msgs);
			msgs = basicSetSoftwareOperations(newSoftwareOperations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS, newSoftwareOperations, newSoftwareOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSoftwareMaintenanceRequirements getSoftwareMaintenance() {
		return softwareMaintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareMaintenance(VSSSSoftwareMaintenanceRequirements newSoftwareMaintenance, NotificationChain msgs) {
		VSSSSoftwareMaintenanceRequirements oldSoftwareMaintenance = softwareMaintenance;
		softwareMaintenance = newSoftwareMaintenance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE, oldSoftwareMaintenance, newSoftwareMaintenance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareMaintenance(VSSSSoftwareMaintenanceRequirements newSoftwareMaintenance) {
		if (newSoftwareMaintenance != softwareMaintenance) {
			NotificationChain msgs = null;
			if (softwareMaintenance != null)
				msgs = ((InternalEObject)softwareMaintenance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE, null, msgs);
			if (newSoftwareMaintenance != null)
				msgs = ((InternalEObject)newSoftwareMaintenance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE, null, msgs);
			msgs = basicSetSoftwareMaintenance(newSoftwareMaintenance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE, newSoftwareMaintenance, newSoftwareMaintenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSystemSoftwareObservabilityRequirements getSystemSoftwareObservability() {
		return systemSoftwareObservability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemSoftwareObservability(VSSSSystemSoftwareObservabilityRequirements newSystemSoftwareObservability, NotificationChain msgs) {
		VSSSSystemSoftwareObservabilityRequirements oldSystemSoftwareObservability = systemSoftwareObservability;
		systemSoftwareObservability = newSystemSoftwareObservability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY, oldSystemSoftwareObservability, newSystemSoftwareObservability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemSoftwareObservability(VSSSSystemSoftwareObservabilityRequirements newSystemSoftwareObservability) {
		if (newSystemSoftwareObservability != systemSoftwareObservability) {
			NotificationChain msgs = null;
			if (systemSoftwareObservability != null)
				msgs = ((InternalEObject)systemSoftwareObservability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY, null, msgs);
			if (newSystemSoftwareObservability != null)
				msgs = ((InternalEObject)newSystemSoftwareObservability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY, null, msgs);
			msgs = basicSetSystemSoftwareObservability(newSystemSoftwareObservability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY, newSystemSoftwareObservability, newSystemSoftwareObservability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECTION_DESCRIPTION:
				return basicSetSectionDescription(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL:
				return basicSetGeneral(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES:
				return basicSetCapabilities(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE:
				return basicSetSystemInterface(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION:
				return basicSetAdaptationMissionization(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE:
				return basicSetComputerResource(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY:
				return basicSetSecurity(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY:
				return basicSetSafety(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILITY_AVAILABILITY:
				return basicSetReliabilityAvailability(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY:
				return basicSetQuality(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN:
				return basicSetDesign(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS:
				return basicSetSoftwareOperations(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE:
				return basicSetSoftwareMaintenance(null, msgs);
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY:
				return basicSetSystemSoftwareObservability(null, msgs);
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
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECTION_DESCRIPTION:
				return getSectionDescription();
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
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILITY_AVAILABILITY:
				return getReliabilityAvailability();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECTION_DESCRIPTION:
				setSectionDescription((es.uah.aut.srg.micobs.doctpl.doctpl.DBody)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL:
				setGeneral((VSSSGeneralRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES:
				setCapabilities((VSSSCapabilitiesRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE:
				setSystemInterface((VSSSSystemInterfaceRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION:
				setAdaptationMissionization((VSSSAdaptationMissionizationRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE:
				setComputerResource((VSSSComputerResourceRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY:
				setSecurity((VSSSSecurityRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY:
				setSafety((VSSSSafetyRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILITY_AVAILABILITY:
				setReliabilityAvailability((VSSSReliabilityAvailabilityRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY:
				setQuality((VSSSQualityRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN:
				setDesign((VSSSDesignRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS:
				setSoftwareOperations((VSSSSoftwareOperationsRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE:
				setSoftwareMaintenance((VSSSSoftwareMaintenanceRequirements)newValue);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY:
				setSystemSoftwareObservability((VSSSSystemSoftwareObservabilityRequirements)newValue);
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
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECTION_DESCRIPTION:
				setSectionDescription((es.uah.aut.srg.micobs.doctpl.doctpl.DBody)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL:
				setGeneral((VSSSGeneralRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES:
				setCapabilities((VSSSCapabilitiesRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE:
				setSystemInterface((VSSSSystemInterfaceRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION:
				setAdaptationMissionization((VSSSAdaptationMissionizationRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE:
				setComputerResource((VSSSComputerResourceRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY:
				setSecurity((VSSSSecurityRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY:
				setSafety((VSSSSafetyRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILITY_AVAILABILITY:
				setReliabilityAvailability((VSSSReliabilityAvailabilityRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY:
				setQuality((VSSSQualityRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN:
				setDesign((VSSSDesignRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS:
				setSoftwareOperations((VSSSSoftwareOperationsRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE:
				setSoftwareMaintenance((VSSSSoftwareMaintenanceRequirements)null);
				return;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY:
				setSystemSoftwareObservability((VSSSSystemSoftwareObservabilityRequirements)null);
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
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECTION_DESCRIPTION:
				return sectionDescription != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__GENERAL:
				return general != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES:
				return capabilities != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE:
				return systemInterface != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION:
				return adaptationMissionization != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE:
				return computerResource != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SECURITY:
				return security != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SAFETY:
				return safety != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__RELIABILITY_AVAILABILITY:
				return reliabilityAvailability != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__QUALITY:
				return quality != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__DESIGN:
				return design != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS:
				return softwareOperations != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE:
				return softwareMaintenance != null;
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY:
				return systemSoftwareObservability != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		subsections.add((DAbstractSection) getGeneral());
		subsections.add((DAbstractSection) getCapabilities());
		subsections.add((DAbstractSection) getSystemInterface());
		subsections.add((DAbstractSection) getAdaptationMissionization());
		subsections.add((DAbstractSection) getComputerResource());
		subsections.add((DAbstractSection) getSecurity());
		subsections.add((DAbstractSection) getSafety());
		subsections.add((DAbstractSection) getReliabilityAvailability());
		subsections.add((DAbstractSection) getQuality());
		subsections.add((DAbstractSection) getDesign());
		subsections.add((DAbstractSection) getSoftwareOperations());
		subsections.add((DAbstractSection) getSoftwareMaintenance());
		subsections.add((DAbstractSection) getSystemSoftwareObservability());
		return subsections;
	}
	
} //VSSSSpecificRequirementsImpl
