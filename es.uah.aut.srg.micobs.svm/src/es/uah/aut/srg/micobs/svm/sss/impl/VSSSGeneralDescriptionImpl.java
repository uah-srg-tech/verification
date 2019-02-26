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

import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
public class VSSSGeneralDescriptionImpl extends MinimalEObjectImpl.Container implements VSSSGeneralDescription {
	/**
	 * The default value of the '{@link #getProductPerspective() <em>Product Perspective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPerspective()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PERSPECTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPerspective() <em>Product Perspective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPerspective()
	 * @generated
	 * @ordered
	 */
	protected String productPerspective = PRODUCT_PERSPECTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneralCapabilites() <em>General Capabilites</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralCapabilites()
	 * @generated
	 * @ordered
	 */
	protected EList<String> generalCapabilites;

	/**
	 * The cached value of the '{@link #getGeneralConstraints() <em>General Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> generalConstraints;

	/**
	 * The cached value of the '{@link #getOperationalEnvironment() <em>Operational Environment</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<String> operationalEnvironment;

	/**
	 * The cached value of the '{@link #getAssumptionsDependencies() <em>Assumptions Dependencies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptionsDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> assumptionsDependencies;

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
	public String getProductPerspective() {
		return productPerspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductPerspective(String newProductPerspective) {
		String oldProductPerspective = productPerspective;
		productPerspective = newProductPerspective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE, oldProductPerspective, productPerspective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGeneralCapabilites() {
		if (generalCapabilites == null) {
			generalCapabilites = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES);
		}
		return generalCapabilites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGeneralConstraints() {
		if (generalConstraints == null) {
			generalConstraints = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS);
		}
		return generalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOperationalEnvironment() {
		if (operationalEnvironment == null) {
			operationalEnvironment = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT);
		}
		return operationalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAssumptionsDependencies() {
		if (assumptionsDependencies == null) {
			assumptionsDependencies = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES);
		}
		return assumptionsDependencies;
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case sssPackage.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE:
				setProductPerspective((String)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES:
				getGeneralCapabilites().clear();
				getGeneralCapabilites().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				getGeneralConstraints().clear();
				getGeneralConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				getOperationalEnvironment().clear();
				getOperationalEnvironment().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				getAssumptionsDependencies().clear();
				getAssumptionsDependencies().addAll((Collection<? extends String>)newValue);
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
				setProductPerspective(PRODUCT_PERSPECTIVE_EDEFAULT);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES:
				getGeneralCapabilites().clear();
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				getGeneralConstraints().clear();
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				getOperationalEnvironment().clear();
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				getAssumptionsDependencies().clear();
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
				return PRODUCT_PERSPECTIVE_EDEFAULT == null ? productPerspective != null : !PRODUCT_PERSPECTIVE_EDEFAULT.equals(productPerspective);
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES:
				return generalCapabilites != null && !generalCapabilites.isEmpty();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS:
				return generalConstraints != null && !generalConstraints.isEmpty();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT:
				return operationalEnvironment != null && !operationalEnvironment.isEmpty();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES:
				return assumptionsDependencies != null && !assumptionsDependencies.isEmpty();
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
		result.append(" (productPerspective: ");
		result.append(productPerspective);
		result.append(", generalCapabilites: ");
		result.append(generalCapabilites);
		result.append(", generalConstraints: ");
		result.append(generalConstraints);
		result.append(", operationalEnvironment: ");
		result.append(operationalEnvironment);
		result.append(", assumptionsDependencies: ");
		result.append(assumptionsDependencies);
		result.append(')');
		return result.toString();
	}

} //VSSSGeneralDescriptionImpl
