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

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;
import es.uah.aut.srg.micobs.svm.srs.VSRSAdaptationInstallationRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSDataDefinitionDBRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSDesignRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSFunctionalRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSGeneralRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSHumanFactorsRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSInterfaceRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSOperationalRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSPerformanceRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSPortabilityRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSResourcesRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWConfigurationDeliveryRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWMaintainabilityRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWQualityRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWReliabilityRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWSafetyRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSecurityPrivacyRequirements;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSRS Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getSectionDescription <em>Section Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getFunctional <em>Functional</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getPerformance <em>Performance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getOperational <em>Operational</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getSecurityPrivacy <em>Security Privacy</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getPortability <em>Portability</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getSwQuality <em>Sw Quality</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getSwReliability <em>Sw Reliability</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getSwMaintainability <em>Sw Maintainability</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getSwSafety <em>Sw Safety</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getSwConfigurationDelivery <em>Sw Configuration Delivery</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getDataDefinitionDB <em>Data Definition DB</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getHumanFactors <em>Human Factors</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl#getAdaptationInstallation <em>Adaptation Installation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSRSRequirementsImpl extends DFixedSectionImpl implements VSRSRequirements {
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
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected VSRSGeneralRequirements general;

	/**
	 * The cached value of the '{@link #getFunctional() <em>Functional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctional()
	 * @generated
	 * @ordered
	 */
	protected VSRSFunctionalRequirements functional;

	/**
	 * The cached value of the '{@link #getPerformance() <em>Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected VSRSPerformanceRequirements performance;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected VSRSInterfaceRequirements interface_;

	/**
	 * The cached value of the '{@link #getOperational() <em>Operational</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperational()
	 * @generated
	 * @ordered
	 */
	protected VSRSOperationalRequirements operational;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected VSRSResourcesRequirements resources;

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected VSRSDesignRequirements design;

	/**
	 * The cached value of the '{@link #getSecurityPrivacy() <em>Security Privacy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPrivacy()
	 * @generated
	 * @ordered
	 */
	protected VSRSSecurityPrivacyRequirements securityPrivacy;

	/**
	 * The cached value of the '{@link #getPortability() <em>Portability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortability()
	 * @generated
	 * @ordered
	 */
	protected VSRSPortabilityRequirements portability;

	/**
	 * The cached value of the '{@link #getSwQuality() <em>Sw Quality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwQuality()
	 * @generated
	 * @ordered
	 */
	protected VSRSSWQualityRequirements swQuality;

	/**
	 * The cached value of the '{@link #getSwReliability() <em>Sw Reliability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwReliability()
	 * @generated
	 * @ordered
	 */
	protected VSRSSWReliabilityRequirements swReliability;

	/**
	 * The cached value of the '{@link #getSwMaintainability() <em>Sw Maintainability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwMaintainability()
	 * @generated
	 * @ordered
	 */
	protected VSRSSWMaintainabilityRequirements swMaintainability;

	/**
	 * The cached value of the '{@link #getSwSafety() <em>Sw Safety</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwSafety()
	 * @generated
	 * @ordered
	 */
	protected VSRSSWSafetyRequirements swSafety;

	/**
	 * The cached value of the '{@link #getSwConfigurationDelivery() <em>Sw Configuration Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwConfigurationDelivery()
	 * @generated
	 * @ordered
	 */
	protected VSRSSWConfigurationDeliveryRequirements swConfigurationDelivery;

	/**
	 * The cached value of the '{@link #getDataDefinitionDB() <em>Data Definition DB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDefinitionDB()
	 * @generated
	 * @ordered
	 */
	protected VSRSDataDefinitionDBRequirements dataDefinitionDB;

	/**
	 * The cached value of the '{@link #getHumanFactors() <em>Human Factors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanFactors()
	 * @generated
	 * @ordered
	 */
	protected VSRSHumanFactorsRequirements humanFactors;

	/**
	 * The cached value of the '{@link #getAdaptationInstallation() <em>Adaptation Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationInstallation()
	 * @generated
	 * @ordered
	 */
	protected VSRSAdaptationInstallationRequirements adaptationInstallation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSRSRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return srsPackage.Literals.VSRS_REQUIREMENTS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SECTION_DESCRIPTION, oldSectionDescription, newSectionDescription);
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
				msgs = ((InternalEObject)sectionDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SECTION_DESCRIPTION, null, msgs);
			if (newSectionDescription != null)
				msgs = ((InternalEObject)newSectionDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SECTION_DESCRIPTION, null, msgs);
			msgs = basicSetSectionDescription(newSectionDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SECTION_DESCRIPTION, newSectionDescription, newSectionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSGeneralRequirements getGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneral(VSRSGeneralRequirements newGeneral, NotificationChain msgs) {
		VSRSGeneralRequirements oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__GENERAL, oldGeneral, newGeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(VSRSGeneralRequirements newGeneral) {
		if (newGeneral != general) {
			NotificationChain msgs = null;
			if (general != null)
				msgs = ((InternalEObject)general).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__GENERAL, null, msgs);
			if (newGeneral != null)
				msgs = ((InternalEObject)newGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__GENERAL, null, msgs);
			msgs = basicSetGeneral(newGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__GENERAL, newGeneral, newGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSFunctionalRequirements getFunctional() {
		return functional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctional(VSRSFunctionalRequirements newFunctional, NotificationChain msgs) {
		VSRSFunctionalRequirements oldFunctional = functional;
		functional = newFunctional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__FUNCTIONAL, oldFunctional, newFunctional);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctional(VSRSFunctionalRequirements newFunctional) {
		if (newFunctional != functional) {
			NotificationChain msgs = null;
			if (functional != null)
				msgs = ((InternalEObject)functional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__FUNCTIONAL, null, msgs);
			if (newFunctional != null)
				msgs = ((InternalEObject)newFunctional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__FUNCTIONAL, null, msgs);
			msgs = basicSetFunctional(newFunctional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__FUNCTIONAL, newFunctional, newFunctional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSPerformanceRequirements getPerformance() {
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformance(VSRSPerformanceRequirements newPerformance, NotificationChain msgs) {
		VSRSPerformanceRequirements oldPerformance = performance;
		performance = newPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__PERFORMANCE, oldPerformance, newPerformance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformance(VSRSPerformanceRequirements newPerformance) {
		if (newPerformance != performance) {
			NotificationChain msgs = null;
			if (performance != null)
				msgs = ((InternalEObject)performance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__PERFORMANCE, null, msgs);
			if (newPerformance != null)
				msgs = ((InternalEObject)newPerformance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__PERFORMANCE, null, msgs);
			msgs = basicSetPerformance(newPerformance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__PERFORMANCE, newPerformance, newPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSInterfaceRequirements getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(VSRSInterfaceRequirements newInterface, NotificationChain msgs) {
		VSRSInterfaceRequirements oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(VSRSInterfaceRequirements newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__INTERFACE, null, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__INTERFACE, null, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSOperationalRequirements getOperational() {
		return operational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperational(VSRSOperationalRequirements newOperational, NotificationChain msgs) {
		VSRSOperationalRequirements oldOperational = operational;
		operational = newOperational;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__OPERATIONAL, oldOperational, newOperational);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperational(VSRSOperationalRequirements newOperational) {
		if (newOperational != operational) {
			NotificationChain msgs = null;
			if (operational != null)
				msgs = ((InternalEObject)operational).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__OPERATIONAL, null, msgs);
			if (newOperational != null)
				msgs = ((InternalEObject)newOperational).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__OPERATIONAL, null, msgs);
			msgs = basicSetOperational(newOperational, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__OPERATIONAL, newOperational, newOperational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSResourcesRequirements getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(VSRSResourcesRequirements newResources, NotificationChain msgs) {
		VSRSResourcesRequirements oldResources = resources;
		resources = newResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__RESOURCES, oldResources, newResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(VSRSResourcesRequirements newResources) {
		if (newResources != resources) {
			NotificationChain msgs = null;
			if (resources != null)
				msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__RESOURCES, null, msgs);
			if (newResources != null)
				msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__RESOURCES, null, msgs);
			msgs = basicSetResources(newResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__RESOURCES, newResources, newResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSDesignRequirements getDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(VSRSDesignRequirements newDesign, NotificationChain msgs) {
		VSRSDesignRequirements oldDesign = design;
		design = newDesign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__DESIGN, oldDesign, newDesign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign(VSRSDesignRequirements newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__DESIGN, null, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__DESIGN, null, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__DESIGN, newDesign, newDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSecurityPrivacyRequirements getSecurityPrivacy() {
		return securityPrivacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityPrivacy(VSRSSecurityPrivacyRequirements newSecurityPrivacy, NotificationChain msgs) {
		VSRSSecurityPrivacyRequirements oldSecurityPrivacy = securityPrivacy;
		securityPrivacy = newSecurityPrivacy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SECURITY_PRIVACY, oldSecurityPrivacy, newSecurityPrivacy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityPrivacy(VSRSSecurityPrivacyRequirements newSecurityPrivacy) {
		if (newSecurityPrivacy != securityPrivacy) {
			NotificationChain msgs = null;
			if (securityPrivacy != null)
				msgs = ((InternalEObject)securityPrivacy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SECURITY_PRIVACY, null, msgs);
			if (newSecurityPrivacy != null)
				msgs = ((InternalEObject)newSecurityPrivacy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SECURITY_PRIVACY, null, msgs);
			msgs = basicSetSecurityPrivacy(newSecurityPrivacy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SECURITY_PRIVACY, newSecurityPrivacy, newSecurityPrivacy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSPortabilityRequirements getPortability() {
		return portability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortability(VSRSPortabilityRequirements newPortability, NotificationChain msgs) {
		VSRSPortabilityRequirements oldPortability = portability;
		portability = newPortability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__PORTABILITY, oldPortability, newPortability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortability(VSRSPortabilityRequirements newPortability) {
		if (newPortability != portability) {
			NotificationChain msgs = null;
			if (portability != null)
				msgs = ((InternalEObject)portability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__PORTABILITY, null, msgs);
			if (newPortability != null)
				msgs = ((InternalEObject)newPortability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__PORTABILITY, null, msgs);
			msgs = basicSetPortability(newPortability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__PORTABILITY, newPortability, newPortability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSWQualityRequirements getSwQuality() {
		return swQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwQuality(VSRSSWQualityRequirements newSwQuality, NotificationChain msgs) {
		VSRSSWQualityRequirements oldSwQuality = swQuality;
		swQuality = newSwQuality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SW_QUALITY, oldSwQuality, newSwQuality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwQuality(VSRSSWQualityRequirements newSwQuality) {
		if (newSwQuality != swQuality) {
			NotificationChain msgs = null;
			if (swQuality != null)
				msgs = ((InternalEObject)swQuality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SW_QUALITY, null, msgs);
			if (newSwQuality != null)
				msgs = ((InternalEObject)newSwQuality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SW_QUALITY, null, msgs);
			msgs = basicSetSwQuality(newSwQuality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SW_QUALITY, newSwQuality, newSwQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSWReliabilityRequirements getSwReliability() {
		return swReliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwReliability(VSRSSWReliabilityRequirements newSwReliability, NotificationChain msgs) {
		VSRSSWReliabilityRequirements oldSwReliability = swReliability;
		swReliability = newSwReliability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SW_RELIABILITY, oldSwReliability, newSwReliability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwReliability(VSRSSWReliabilityRequirements newSwReliability) {
		if (newSwReliability != swReliability) {
			NotificationChain msgs = null;
			if (swReliability != null)
				msgs = ((InternalEObject)swReliability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SW_RELIABILITY, null, msgs);
			if (newSwReliability != null)
				msgs = ((InternalEObject)newSwReliability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SW_RELIABILITY, null, msgs);
			msgs = basicSetSwReliability(newSwReliability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SW_RELIABILITY, newSwReliability, newSwReliability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSWMaintainabilityRequirements getSwMaintainability() {
		return swMaintainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwMaintainability(VSRSSWMaintainabilityRequirements newSwMaintainability, NotificationChain msgs) {
		VSRSSWMaintainabilityRequirements oldSwMaintainability = swMaintainability;
		swMaintainability = newSwMaintainability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SW_MAINTAINABILITY, oldSwMaintainability, newSwMaintainability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwMaintainability(VSRSSWMaintainabilityRequirements newSwMaintainability) {
		if (newSwMaintainability != swMaintainability) {
			NotificationChain msgs = null;
			if (swMaintainability != null)
				msgs = ((InternalEObject)swMaintainability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SW_MAINTAINABILITY, null, msgs);
			if (newSwMaintainability != null)
				msgs = ((InternalEObject)newSwMaintainability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SW_MAINTAINABILITY, null, msgs);
			msgs = basicSetSwMaintainability(newSwMaintainability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SW_MAINTAINABILITY, newSwMaintainability, newSwMaintainability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSWSafetyRequirements getSwSafety() {
		return swSafety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwSafety(VSRSSWSafetyRequirements newSwSafety, NotificationChain msgs) {
		VSRSSWSafetyRequirements oldSwSafety = swSafety;
		swSafety = newSwSafety;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SW_SAFETY, oldSwSafety, newSwSafety);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwSafety(VSRSSWSafetyRequirements newSwSafety) {
		if (newSwSafety != swSafety) {
			NotificationChain msgs = null;
			if (swSafety != null)
				msgs = ((InternalEObject)swSafety).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SW_SAFETY, null, msgs);
			if (newSwSafety != null)
				msgs = ((InternalEObject)newSwSafety).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SW_SAFETY, null, msgs);
			msgs = basicSetSwSafety(newSwSafety, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SW_SAFETY, newSwSafety, newSwSafety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSWConfigurationDeliveryRequirements getSwConfigurationDelivery() {
		return swConfigurationDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwConfigurationDelivery(VSRSSWConfigurationDeliveryRequirements newSwConfigurationDelivery, NotificationChain msgs) {
		VSRSSWConfigurationDeliveryRequirements oldSwConfigurationDelivery = swConfigurationDelivery;
		swConfigurationDelivery = newSwConfigurationDelivery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY, oldSwConfigurationDelivery, newSwConfigurationDelivery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwConfigurationDelivery(VSRSSWConfigurationDeliveryRequirements newSwConfigurationDelivery) {
		if (newSwConfigurationDelivery != swConfigurationDelivery) {
			NotificationChain msgs = null;
			if (swConfigurationDelivery != null)
				msgs = ((InternalEObject)swConfigurationDelivery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY, null, msgs);
			if (newSwConfigurationDelivery != null)
				msgs = ((InternalEObject)newSwConfigurationDelivery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY, null, msgs);
			msgs = basicSetSwConfigurationDelivery(newSwConfigurationDelivery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY, newSwConfigurationDelivery, newSwConfigurationDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSDataDefinitionDBRequirements getDataDefinitionDB() {
		return dataDefinitionDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataDefinitionDB(VSRSDataDefinitionDBRequirements newDataDefinitionDB, NotificationChain msgs) {
		VSRSDataDefinitionDBRequirements oldDataDefinitionDB = dataDefinitionDB;
		dataDefinitionDB = newDataDefinitionDB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__DATA_DEFINITION_DB, oldDataDefinitionDB, newDataDefinitionDB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDefinitionDB(VSRSDataDefinitionDBRequirements newDataDefinitionDB) {
		if (newDataDefinitionDB != dataDefinitionDB) {
			NotificationChain msgs = null;
			if (dataDefinitionDB != null)
				msgs = ((InternalEObject)dataDefinitionDB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__DATA_DEFINITION_DB, null, msgs);
			if (newDataDefinitionDB != null)
				msgs = ((InternalEObject)newDataDefinitionDB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__DATA_DEFINITION_DB, null, msgs);
			msgs = basicSetDataDefinitionDB(newDataDefinitionDB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__DATA_DEFINITION_DB, newDataDefinitionDB, newDataDefinitionDB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSHumanFactorsRequirements getHumanFactors() {
		return humanFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHumanFactors(VSRSHumanFactorsRequirements newHumanFactors, NotificationChain msgs) {
		VSRSHumanFactorsRequirements oldHumanFactors = humanFactors;
		humanFactors = newHumanFactors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__HUMAN_FACTORS, oldHumanFactors, newHumanFactors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumanFactors(VSRSHumanFactorsRequirements newHumanFactors) {
		if (newHumanFactors != humanFactors) {
			NotificationChain msgs = null;
			if (humanFactors != null)
				msgs = ((InternalEObject)humanFactors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__HUMAN_FACTORS, null, msgs);
			if (newHumanFactors != null)
				msgs = ((InternalEObject)newHumanFactors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__HUMAN_FACTORS, null, msgs);
			msgs = basicSetHumanFactors(newHumanFactors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__HUMAN_FACTORS, newHumanFactors, newHumanFactors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSAdaptationInstallationRequirements getAdaptationInstallation() {
		return adaptationInstallation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdaptationInstallation(VSRSAdaptationInstallationRequirements newAdaptationInstallation, NotificationChain msgs) {
		VSRSAdaptationInstallationRequirements oldAdaptationInstallation = adaptationInstallation;
		adaptationInstallation = newAdaptationInstallation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION, oldAdaptationInstallation, newAdaptationInstallation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationInstallation(VSRSAdaptationInstallationRequirements newAdaptationInstallation) {
		if (newAdaptationInstallation != adaptationInstallation) {
			NotificationChain msgs = null;
			if (adaptationInstallation != null)
				msgs = ((InternalEObject)adaptationInstallation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION, null, msgs);
			if (newAdaptationInstallation != null)
				msgs = ((InternalEObject)newAdaptationInstallation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION, null, msgs);
			msgs = basicSetAdaptationInstallation(newAdaptationInstallation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION, newAdaptationInstallation, newAdaptationInstallation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_REQUIREMENTS__SECTION_DESCRIPTION:
				return basicSetSectionDescription(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__GENERAL:
				return basicSetGeneral(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__FUNCTIONAL:
				return basicSetFunctional(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__PERFORMANCE:
				return basicSetPerformance(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__INTERFACE:
				return basicSetInterface(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__OPERATIONAL:
				return basicSetOperational(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__RESOURCES:
				return basicSetResources(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__DESIGN:
				return basicSetDesign(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__SECURITY_PRIVACY:
				return basicSetSecurityPrivacy(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__PORTABILITY:
				return basicSetPortability(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__SW_QUALITY:
				return basicSetSwQuality(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__SW_RELIABILITY:
				return basicSetSwReliability(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__SW_MAINTAINABILITY:
				return basicSetSwMaintainability(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__SW_SAFETY:
				return basicSetSwSafety(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY:
				return basicSetSwConfigurationDelivery(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__DATA_DEFINITION_DB:
				return basicSetDataDefinitionDB(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__HUMAN_FACTORS:
				return basicSetHumanFactors(null, msgs);
			case srsPackage.VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION:
				return basicSetAdaptationInstallation(null, msgs);
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
			case srsPackage.VSRS_REQUIREMENTS__SECTION_DESCRIPTION:
				return getSectionDescription();
			case srsPackage.VSRS_REQUIREMENTS__GENERAL:
				return getGeneral();
			case srsPackage.VSRS_REQUIREMENTS__FUNCTIONAL:
				return getFunctional();
			case srsPackage.VSRS_REQUIREMENTS__PERFORMANCE:
				return getPerformance();
			case srsPackage.VSRS_REQUIREMENTS__INTERFACE:
				return getInterface();
			case srsPackage.VSRS_REQUIREMENTS__OPERATIONAL:
				return getOperational();
			case srsPackage.VSRS_REQUIREMENTS__RESOURCES:
				return getResources();
			case srsPackage.VSRS_REQUIREMENTS__DESIGN:
				return getDesign();
			case srsPackage.VSRS_REQUIREMENTS__SECURITY_PRIVACY:
				return getSecurityPrivacy();
			case srsPackage.VSRS_REQUIREMENTS__PORTABILITY:
				return getPortability();
			case srsPackage.VSRS_REQUIREMENTS__SW_QUALITY:
				return getSwQuality();
			case srsPackage.VSRS_REQUIREMENTS__SW_RELIABILITY:
				return getSwReliability();
			case srsPackage.VSRS_REQUIREMENTS__SW_MAINTAINABILITY:
				return getSwMaintainability();
			case srsPackage.VSRS_REQUIREMENTS__SW_SAFETY:
				return getSwSafety();
			case srsPackage.VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY:
				return getSwConfigurationDelivery();
			case srsPackage.VSRS_REQUIREMENTS__DATA_DEFINITION_DB:
				return getDataDefinitionDB();
			case srsPackage.VSRS_REQUIREMENTS__HUMAN_FACTORS:
				return getHumanFactors();
			case srsPackage.VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION:
				return getAdaptationInstallation();
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
			case srsPackage.VSRS_REQUIREMENTS__SECTION_DESCRIPTION:
				setSectionDescription((DBody)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__GENERAL:
				setGeneral((VSRSGeneralRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__FUNCTIONAL:
				setFunctional((VSRSFunctionalRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__PERFORMANCE:
				setPerformance((VSRSPerformanceRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__INTERFACE:
				setInterface((VSRSInterfaceRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__OPERATIONAL:
				setOperational((VSRSOperationalRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__RESOURCES:
				setResources((VSRSResourcesRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__DESIGN:
				setDesign((VSRSDesignRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SECURITY_PRIVACY:
				setSecurityPrivacy((VSRSSecurityPrivacyRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__PORTABILITY:
				setPortability((VSRSPortabilityRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SW_QUALITY:
				setSwQuality((VSRSSWQualityRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SW_RELIABILITY:
				setSwReliability((VSRSSWReliabilityRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SW_MAINTAINABILITY:
				setSwMaintainability((VSRSSWMaintainabilityRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SW_SAFETY:
				setSwSafety((VSRSSWSafetyRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY:
				setSwConfigurationDelivery((VSRSSWConfigurationDeliveryRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__DATA_DEFINITION_DB:
				setDataDefinitionDB((VSRSDataDefinitionDBRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__HUMAN_FACTORS:
				setHumanFactors((VSRSHumanFactorsRequirements)newValue);
				return;
			case srsPackage.VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION:
				setAdaptationInstallation((VSRSAdaptationInstallationRequirements)newValue);
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
			case srsPackage.VSRS_REQUIREMENTS__SECTION_DESCRIPTION:
				setSectionDescription((DBody)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__GENERAL:
				setGeneral((VSRSGeneralRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__FUNCTIONAL:
				setFunctional((VSRSFunctionalRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__PERFORMANCE:
				setPerformance((VSRSPerformanceRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__INTERFACE:
				setInterface((VSRSInterfaceRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__OPERATIONAL:
				setOperational((VSRSOperationalRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__RESOURCES:
				setResources((VSRSResourcesRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__DESIGN:
				setDesign((VSRSDesignRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SECURITY_PRIVACY:
				setSecurityPrivacy((VSRSSecurityPrivacyRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__PORTABILITY:
				setPortability((VSRSPortabilityRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SW_QUALITY:
				setSwQuality((VSRSSWQualityRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SW_RELIABILITY:
				setSwReliability((VSRSSWReliabilityRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SW_MAINTAINABILITY:
				setSwMaintainability((VSRSSWMaintainabilityRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SW_SAFETY:
				setSwSafety((VSRSSWSafetyRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY:
				setSwConfigurationDelivery((VSRSSWConfigurationDeliveryRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__DATA_DEFINITION_DB:
				setDataDefinitionDB((VSRSDataDefinitionDBRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__HUMAN_FACTORS:
				setHumanFactors((VSRSHumanFactorsRequirements)null);
				return;
			case srsPackage.VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION:
				setAdaptationInstallation((VSRSAdaptationInstallationRequirements)null);
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
			case srsPackage.VSRS_REQUIREMENTS__SECTION_DESCRIPTION:
				return sectionDescription != null;
			case srsPackage.VSRS_REQUIREMENTS__GENERAL:
				return general != null;
			case srsPackage.VSRS_REQUIREMENTS__FUNCTIONAL:
				return functional != null;
			case srsPackage.VSRS_REQUIREMENTS__PERFORMANCE:
				return performance != null;
			case srsPackage.VSRS_REQUIREMENTS__INTERFACE:
				return interface_ != null;
			case srsPackage.VSRS_REQUIREMENTS__OPERATIONAL:
				return operational != null;
			case srsPackage.VSRS_REQUIREMENTS__RESOURCES:
				return resources != null;
			case srsPackage.VSRS_REQUIREMENTS__DESIGN:
				return design != null;
			case srsPackage.VSRS_REQUIREMENTS__SECURITY_PRIVACY:
				return securityPrivacy != null;
			case srsPackage.VSRS_REQUIREMENTS__PORTABILITY:
				return portability != null;
			case srsPackage.VSRS_REQUIREMENTS__SW_QUALITY:
				return swQuality != null;
			case srsPackage.VSRS_REQUIREMENTS__SW_RELIABILITY:
				return swReliability != null;
			case srsPackage.VSRS_REQUIREMENTS__SW_MAINTAINABILITY:
				return swMaintainability != null;
			case srsPackage.VSRS_REQUIREMENTS__SW_SAFETY:
				return swSafety != null;
			case srsPackage.VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY:
				return swConfigurationDelivery != null;
			case srsPackage.VSRS_REQUIREMENTS__DATA_DEFINITION_DB:
				return dataDefinitionDB != null;
			case srsPackage.VSRS_REQUIREMENTS__HUMAN_FACTORS:
				return humanFactors != null;
			case srsPackage.VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION:
				return adaptationInstallation != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		subsections.add((DAbstractSection) getGeneral());
		subsections.add((DAbstractSection) getFunctional());
		subsections.add((DAbstractSection) getPerformance());
		subsections.add((DAbstractSection) getInterface());
		subsections.add((DAbstractSection) getOperational());
		subsections.add((DAbstractSection) getResources());
		subsections.add((DAbstractSection) getDesign());
		subsections.add((DAbstractSection) getSecurityPrivacy());
		subsections.add((DAbstractSection) getPortability());
		subsections.add((DAbstractSection) getSwQuality());
		subsections.add((DAbstractSection) getSwReliability());
		subsections.add((DAbstractSection) getSwMaintainability());
		subsections.add((DAbstractSection) getSwSafety());
		subsections.add((DAbstractSection) getSwConfigurationDelivery());
		subsections.add((DAbstractSection) getDataDefinitionDB());
		subsections.add((DAbstractSection) getHumanFactors());
		subsections.add((DAbstractSection) getAdaptationInstallation());
		return subsections;
	}

} //VSRSRequirementsImpl
