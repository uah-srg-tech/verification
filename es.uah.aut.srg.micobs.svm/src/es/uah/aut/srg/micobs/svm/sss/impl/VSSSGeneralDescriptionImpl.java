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
import es.uah.aut.srg.micobs.svm.sss.VSSSFixedSection;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
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
 * An implementation of the model object '<em><b>VSSS General Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getProductPerspective <em>Product Perspective</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getGeneralCapabilities <em>General Capabilities</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getGeneralConstraints <em>General Constraints</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getOperationalEnvironment <em>Operational Environment</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getAssumptionsDependencies <em>Assumptions Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSGeneralDescriptionImpl extends es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl implements VSSSGeneralDescription {
	/**
	 * The cached value of the '{@link #getProductPerspective() <em>Product Perspective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPerspective()
	 * @generated
	 * @ordered
	 */
	protected VSSSFixedSection productPerspective;

	/**
	 * The cached value of the '{@link #getGeneralCapabilities() <em>General Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralCapabilities()
	 * @generated
	 * @ordered
	 */
	protected VSSSFixedSection generalCapabilities;

	/**
	 * The cached value of the '{@link #getGeneralConstraints() <em>General Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralConstraints()
	 * @generated
	 * @ordered
	 */
	protected VSSSFixedSection generalConstraints;

	/**
	 * The cached value of the '{@link #getOperationalEnvironment() <em>Operational Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalEnvironment()
	 * @generated
	 * @ordered
	 */
	protected VSSSFixedSection operationalEnvironment;

	/**
	 * The cached value of the '{@link #getAssumptionsDependencies() <em>Assumptions Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptionsDependencies()
	 * @generated
	 * @ordered
	 */
	protected VSSSFixedSection assumptionsDependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSGeneralDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_GENERAL_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSFixedSection getProductPerspective() {
		return productPerspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductPerspective(VSSSFixedSection newProductPerspective, NotificationChain msgs) {
		VSSSFixedSection oldProductPerspective = productPerspective;
		productPerspective = newProductPerspective;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE, oldProductPerspective, newProductPerspective);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductPerspective(VSSSFixedSection newProductPerspective) {
		if (newProductPerspective != productPerspective) {
			NotificationChain msgs = null;
			if (productPerspective != null)
				msgs = ((InternalEObject)productPerspective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE, null, msgs);
			if (newProductPerspective != null)
				msgs = ((InternalEObject)newProductPerspective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE, null, msgs);
			msgs = basicSetProductPerspective(newProductPerspective, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE, newProductPerspective, newProductPerspective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSFixedSection getGeneralCapabilities() {
		return generalCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralCapabilities(VSSSFixedSection newGeneralCapabilities, NotificationChain msgs) {
		VSSSFixedSection oldGeneralCapabilities = generalCapabilities;
		generalCapabilities = newGeneralCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES, oldGeneralCapabilities, newGeneralCapabilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralCapabilities(VSSSFixedSection newGeneralCapabilities) {
		if (newGeneralCapabilities != generalCapabilities) {
			NotificationChain msgs = null;
			if (generalCapabilities != null)
				msgs = ((InternalEObject)generalCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES, null, msgs);
			if (newGeneralCapabilities != null)
				msgs = ((InternalEObject)newGeneralCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES, null, msgs);
			msgs = basicSetGeneralCapabilities(newGeneralCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES, newGeneralCapabilities, newGeneralCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSFixedSection getGeneralConstraints() {
		return generalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralConstraints(VSSSFixedSection newGeneralConstraints, NotificationChain msgs) {
		VSSSFixedSection oldGeneralConstraints = generalConstraints;
		generalConstraints = newGeneralConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS, oldGeneralConstraints, newGeneralConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralConstraints(VSSSFixedSection newGeneralConstraints) {
		if (newGeneralConstraints != generalConstraints) {
			NotificationChain msgs = null;
			if (generalConstraints != null)
				msgs = ((InternalEObject)generalConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS, null, msgs);
			if (newGeneralConstraints != null)
				msgs = ((InternalEObject)newGeneralConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS, null, msgs);
			msgs = basicSetGeneralConstraints(newGeneralConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS, newGeneralConstraints, newGeneralConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSFixedSection getOperationalEnvironment() {
		return operationalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalEnvironment(VSSSFixedSection newOperationalEnvironment, NotificationChain msgs) {
		VSSSFixedSection oldOperationalEnvironment = operationalEnvironment;
		operationalEnvironment = newOperationalEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT, oldOperationalEnvironment, newOperationalEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalEnvironment(VSSSFixedSection newOperationalEnvironment) {
		if (newOperationalEnvironment != operationalEnvironment) {
			NotificationChain msgs = null;
			if (operationalEnvironment != null)
				msgs = ((InternalEObject)operationalEnvironment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT, null, msgs);
			if (newOperationalEnvironment != null)
				msgs = ((InternalEObject)newOperationalEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT, null, msgs);
			msgs = basicSetOperationalEnvironment(newOperationalEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT, newOperationalEnvironment, newOperationalEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSFixedSection getAssumptionsDependencies() {
		return assumptionsDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssumptionsDependencies(VSSSFixedSection newAssumptionsDependencies, NotificationChain msgs) {
		VSSSFixedSection oldAssumptionsDependencies = assumptionsDependencies;
		assumptionsDependencies = newAssumptionsDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES, oldAssumptionsDependencies, newAssumptionsDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssumptionsDependencies(VSSSFixedSection newAssumptionsDependencies) {
		if (newAssumptionsDependencies != assumptionsDependencies) {
			NotificationChain msgs = null;
			if (assumptionsDependencies != null)
				msgs = ((InternalEObject)assumptionsDependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES, null, msgs);
			if (newAssumptionsDependencies != null)
				msgs = ((InternalEObject)newAssumptionsDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES, null, msgs);
			msgs = basicSetAssumptionsDependencies(newAssumptionsDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES, newAssumptionsDependencies, newAssumptionsDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE:
				return basicSetProductPerspective(null, msgs);
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES:
				return basicSetGeneralCapabilities(null, msgs);
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				return basicSetGeneralConstraints(null, msgs);
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				return basicSetOperationalEnvironment(null, msgs);
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				return basicSetAssumptionsDependencies(null, msgs);
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
			case sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE:
				return getProductPerspective();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES:
				return getGeneralCapabilities();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				return getGeneralConstraints();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				return getOperationalEnvironment();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				return getAssumptionsDependencies();
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
			case sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE:
				setProductPerspective((VSSSFixedSection)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES:
				setGeneralCapabilities((VSSSFixedSection)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				setGeneralConstraints((VSSSFixedSection)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				setOperationalEnvironment((VSSSFixedSection)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				setAssumptionsDependencies((VSSSFixedSection)newValue);
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
			case sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE:
				setProductPerspective((VSSSFixedSection)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES:
				setGeneralCapabilities((VSSSFixedSection)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				setGeneralConstraints((VSSSFixedSection)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				setOperationalEnvironment((VSSSFixedSection)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				setAssumptionsDependencies((VSSSFixedSection)null);
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
			case sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE:
				return productPerspective != null;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES:
				return generalCapabilities != null;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				return generalConstraints != null;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				return operationalEnvironment != null;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				return assumptionsDependencies != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		subsections.add((DAbstractSection) getProductPerspective());
		subsections.add((DAbstractSection) getGeneralCapabilities());
		subsections.add((DAbstractSection) getGeneralConstraints());
		subsections.add((DAbstractSection) getOperationalEnvironment());
		subsections.add((DAbstractSection) getAssumptionsDependencies());
		return subsections;
	}

} //VSSSGeneralDescriptionImpl
