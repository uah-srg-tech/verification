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

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doc.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.sss.VSSSAssumptionsDependencies;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralCapabilites;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralConstraints;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSOperationalEnvironment;
import es.uah.aut.srg.micobs.svm.sss.VSSSProductPerspective;
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
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getGeneralCapabilites <em>General Capabilites</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getGeneralConstraints <em>General Constraints</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getOperationalEnvironment <em>Operational Environment</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getAssumptionsDependencies <em>Assumptions Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSGeneralDescriptionImpl extends DFixedSectionImpl implements VSSSGeneralDescription {
	/**
	 * The cached value of the '{@link #getProductPerspective() <em>Product Perspective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPerspective()
	 * @generated
	 * @ordered
	 */
	protected VSSSProductPerspective productPerspective;

	/**
	 * The cached value of the '{@link #getGeneralCapabilites() <em>General Capabilites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralCapabilites()
	 * @generated
	 * @ordered
	 */
	protected VSSSGeneralCapabilites generalCapabilites;

	/**
	 * The cached value of the '{@link #getGeneralConstraints() <em>General Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralConstraints()
	 * @generated
	 * @ordered
	 */
	protected VSSSGeneralConstraints generalConstraints;

	/**
	 * The cached value of the '{@link #getOperationalEnvironment() <em>Operational Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalEnvironment()
	 * @generated
	 * @ordered
	 */
	protected VSSSOperationalEnvironment operationalEnvironment;

	/**
	 * The cached value of the '{@link #getAssumptionsDependencies() <em>Assumptions Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptionsDependencies()
	 * @generated
	 * @ordered
	 */
	protected VSSSAssumptionsDependencies assumptionsDependencies;

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
	public VSSSProductPerspective getProductPerspective() {
		return productPerspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductPerspective(VSSSProductPerspective newProductPerspective, NotificationChain msgs) {
		VSSSProductPerspective oldProductPerspective = productPerspective;
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
	public void setProductPerspective(VSSSProductPerspective newProductPerspective) {
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
	public VSSSGeneralCapabilites getGeneralCapabilites() {
		return generalCapabilites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralCapabilites(VSSSGeneralCapabilites newGeneralCapabilites, NotificationChain msgs) {
		VSSSGeneralCapabilites oldGeneralCapabilites = generalCapabilites;
		generalCapabilites = newGeneralCapabilites;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES, oldGeneralCapabilites, newGeneralCapabilites);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralCapabilites(VSSSGeneralCapabilites newGeneralCapabilites) {
		if (newGeneralCapabilites != generalCapabilites) {
			NotificationChain msgs = null;
			if (generalCapabilites != null)
				msgs = ((InternalEObject)generalCapabilites).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES, null, msgs);
			if (newGeneralCapabilites != null)
				msgs = ((InternalEObject)newGeneralCapabilites).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES, null, msgs);
			msgs = basicSetGeneralCapabilites(newGeneralCapabilites, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES, newGeneralCapabilites, newGeneralCapabilites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSGeneralConstraints getGeneralConstraints() {
		return generalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralConstraints(VSSSGeneralConstraints newGeneralConstraints, NotificationChain msgs) {
		VSSSGeneralConstraints oldGeneralConstraints = generalConstraints;
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
	public void setGeneralConstraints(VSSSGeneralConstraints newGeneralConstraints) {
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
	public VSSSOperationalEnvironment getOperationalEnvironment() {
		return operationalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalEnvironment(VSSSOperationalEnvironment newOperationalEnvironment, NotificationChain msgs) {
		VSSSOperationalEnvironment oldOperationalEnvironment = operationalEnvironment;
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
	public void setOperationalEnvironment(VSSSOperationalEnvironment newOperationalEnvironment) {
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
	public VSSSAssumptionsDependencies getAssumptionsDependencies() {
		return assumptionsDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssumptionsDependencies(VSSSAssumptionsDependencies newAssumptionsDependencies, NotificationChain msgs) {
		VSSSAssumptionsDependencies oldAssumptionsDependencies = assumptionsDependencies;
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
	public void setAssumptionsDependencies(VSSSAssumptionsDependencies newAssumptionsDependencies) {
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
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES:
				return basicSetGeneralCapabilites(null, msgs);
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
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES:
				return getGeneralCapabilites();
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
				setProductPerspective((VSSSProductPerspective)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES:
				setGeneralCapabilites((VSSSGeneralCapabilites)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				setGeneralConstraints((VSSSGeneralConstraints)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				setOperationalEnvironment((VSSSOperationalEnvironment)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				setAssumptionsDependencies((VSSSAssumptionsDependencies)newValue);
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
				setProductPerspective((VSSSProductPerspective)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES:
				setGeneralCapabilites((VSSSGeneralCapabilites)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				setGeneralConstraints((VSSSGeneralConstraints)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				setOperationalEnvironment((VSSSOperationalEnvironment)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				setAssumptionsDependencies((VSSSAssumptionsDependencies)null);
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
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES:
				return generalCapabilites != null;
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
		subsections.add((DAbstractSection) getGeneralCapabilites());
		subsections.add((DAbstractSection) getGeneralConstraints());
		subsections.add((DAbstractSection) getOperationalEnvironment());
		subsections.add((DAbstractSection) getAssumptionsDependencies());
		return subsections;
	}
	
	@Override
	public DDocumentTemplate getDocument() {
		return (DDocumentTemplate)eContainer();
	}

} //VSSSGeneralDescriptionImpl
