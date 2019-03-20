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

import es.uah.aut.srg.micobs.doctpl.doc.DBody;

import es.uah.aut.srg.micobs.doctpl.doc.impl.DSectionImpl;

import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import org.eclipse.emf.common.notify.Notification;

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
public class VSSSGeneralDescriptionImpl extends DSectionImpl implements VSSSGeneralDescription {
	/**
	 * The cached value of the '{@link #getProductPerspective() <em>Product Perspective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPerspective()
	 * @generated
	 * @ordered
	 */
	protected DBody productPerspective;

	/**
	 * The cached value of the '{@link #getGeneralCapabilites() <em>General Capabilites</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralCapabilites()
	 * @generated
	 * @ordered
	 */
	protected DBody generalCapabilites;

	/**
	 * The cached value of the '{@link #getGeneralConstraints() <em>General Constraints</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralConstraints()
	 * @generated
	 * @ordered
	 */
	protected DBody generalConstraints;

	/**
	 * The cached value of the '{@link #getOperationalEnvironment() <em>Operational Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalEnvironment()
	 * @generated
	 * @ordered
	 */
	protected DBody operationalEnvironment;

	/**
	 * The cached value of the '{@link #getAssumptionsDependencies() <em>Assumptions Dependencies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptionsDependencies()
	 * @generated
	 * @ordered
	 */
	protected DBody assumptionsDependencies;

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
	public DBody getProductPerspective() {
		if (productPerspective != null && productPerspective.eIsProxy()) {
			InternalEObject oldProductPerspective = (InternalEObject)productPerspective;
			productPerspective = (DBody)eResolveProxy(oldProductPerspective);
			if (productPerspective != oldProductPerspective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE, oldProductPerspective, productPerspective));
			}
		}
		return productPerspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody basicGetProductPerspective() {
		return productPerspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductPerspective(DBody newProductPerspective) {
		DBody oldProductPerspective = productPerspective;
		productPerspective = newProductPerspective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE, oldProductPerspective, productPerspective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getGeneralCapabilites() {
		if (generalCapabilites != null && generalCapabilites.eIsProxy()) {
			InternalEObject oldGeneralCapabilites = (InternalEObject)generalCapabilites;
			generalCapabilites = (DBody)eResolveProxy(oldGeneralCapabilites);
			if (generalCapabilites != oldGeneralCapabilites) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES, oldGeneralCapabilites, generalCapabilites));
			}
		}
		return generalCapabilites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody basicGetGeneralCapabilites() {
		return generalCapabilites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralCapabilites(DBody newGeneralCapabilites) {
		DBody oldGeneralCapabilites = generalCapabilites;
		generalCapabilites = newGeneralCapabilites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES, oldGeneralCapabilites, generalCapabilites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getGeneralConstraints() {
		if (generalConstraints != null && generalConstraints.eIsProxy()) {
			InternalEObject oldGeneralConstraints = (InternalEObject)generalConstraints;
			generalConstraints = (DBody)eResolveProxy(oldGeneralConstraints);
			if (generalConstraints != oldGeneralConstraints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS, oldGeneralConstraints, generalConstraints));
			}
		}
		return generalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody basicGetGeneralConstraints() {
		return generalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralConstraints(DBody newGeneralConstraints) {
		DBody oldGeneralConstraints = generalConstraints;
		generalConstraints = newGeneralConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS, oldGeneralConstraints, generalConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getOperationalEnvironment() {
		if (operationalEnvironment != null && operationalEnvironment.eIsProxy()) {
			InternalEObject oldOperationalEnvironment = (InternalEObject)operationalEnvironment;
			operationalEnvironment = (DBody)eResolveProxy(oldOperationalEnvironment);
			if (operationalEnvironment != oldOperationalEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT, oldOperationalEnvironment, operationalEnvironment));
			}
		}
		return operationalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody basicGetOperationalEnvironment() {
		return operationalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalEnvironment(DBody newOperationalEnvironment) {
		DBody oldOperationalEnvironment = operationalEnvironment;
		operationalEnvironment = newOperationalEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT, oldOperationalEnvironment, operationalEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getAssumptionsDependencies() {
		if (assumptionsDependencies != null && assumptionsDependencies.eIsProxy()) {
			InternalEObject oldAssumptionsDependencies = (InternalEObject)assumptionsDependencies;
			assumptionsDependencies = (DBody)eResolveProxy(oldAssumptionsDependencies);
			if (assumptionsDependencies != oldAssumptionsDependencies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES, oldAssumptionsDependencies, assumptionsDependencies));
			}
		}
		return assumptionsDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody basicGetAssumptionsDependencies() {
		return assumptionsDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssumptionsDependencies(DBody newAssumptionsDependencies) {
		DBody oldAssumptionsDependencies = assumptionsDependencies;
		assumptionsDependencies = newAssumptionsDependencies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES, oldAssumptionsDependencies, assumptionsDependencies));
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
				if (resolve) return getProductPerspective();
				return basicGetProductPerspective();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES:
				if (resolve) return getGeneralCapabilites();
				return basicGetGeneralCapabilites();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				if (resolve) return getGeneralConstraints();
				return basicGetGeneralConstraints();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				if (resolve) return getOperationalEnvironment();
				return basicGetOperationalEnvironment();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				if (resolve) return getAssumptionsDependencies();
				return basicGetAssumptionsDependencies();
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
				setProductPerspective((DBody)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES:
				setGeneralCapabilites((DBody)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				setGeneralConstraints((DBody)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				setOperationalEnvironment((DBody)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				setAssumptionsDependencies((DBody)newValue);
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
				setProductPerspective((DBody)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES:
				setGeneralCapabilites((DBody)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				setGeneralConstraints((DBody)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				setOperationalEnvironment((DBody)null);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				setAssumptionsDependencies((DBody)null);
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

} //VSSSGeneralDescriptionImpl
