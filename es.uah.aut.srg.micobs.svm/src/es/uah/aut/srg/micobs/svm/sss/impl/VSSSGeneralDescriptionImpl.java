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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getVSSSProductPerspective <em>VSSS Product Perspective</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getVSSSGeneralCapabilites <em>VSSS General Capabilites</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getVSSSGeneralConstraints <em>VSSS General Constraints</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getVSSSOperationalEnvironment <em>VSSS Operational Environment</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl#getVSSSAssumptionsDependencies <em>VSSS Assumptions Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSGeneralDescriptionImpl extends MinimalEObjectImpl.Container implements VSSSGeneralDescription {
	/**
	 * The cached value of the '{@link #getVSSSProductPerspective() <em>VSSS Product Perspective</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSProductPerspective()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssProductPerspective;

	/**
	 * The cached value of the '{@link #getVSSSGeneralCapabilites() <em>VSSS General Capabilites</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSGeneralCapabilites()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssGeneralCapabilites;

	/**
	 * The cached value of the '{@link #getVSSSGeneralConstraints() <em>VSSS General Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSGeneralConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssGeneralConstraints;

	/**
	 * The cached value of the '{@link #getVSSSOperationalEnvironment() <em>VSSS Operational Environment</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSOperationalEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssOperationalEnvironment;

	/**
	 * The cached value of the '{@link #getVSSSAssumptionsDependencies() <em>VSSS Assumptions Dependencies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSAssumptionsDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssAssumptionsDependencies;

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
	public EList<String> getVSSSProductPerspective() {
		if (vsssProductPerspective == null) {
			vsssProductPerspective = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_PRODUCT_PERSPECTIVE);
		}
		return vsssProductPerspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVSSSGeneralCapabilites() {
		if (vsssGeneralCapabilites == null) {
			vsssGeneralCapabilites = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CAPABILITES);
		}
		return vsssGeneralCapabilites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVSSSGeneralConstraints() {
		if (vsssGeneralConstraints == null) {
			vsssGeneralConstraints = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CONSTRAINTS);
		}
		return vsssGeneralConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVSSSOperationalEnvironment() {
		if (vsssOperationalEnvironment == null) {
			vsssOperationalEnvironment = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_OPERATIONAL_ENVIRONMENT);
		}
		return vsssOperationalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVSSSAssumptionsDependencies() {
		if (vsssAssumptionsDependencies == null) {
			vsssAssumptionsDependencies = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_ASSUMPTIONS_DEPENDENCIES);
		}
		return vsssAssumptionsDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_PRODUCT_PERSPECTIVE:
				return getVSSSProductPerspective();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CAPABILITES:
				return getVSSSGeneralCapabilites();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CONSTRAINTS:
				return getVSSSGeneralConstraints();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_OPERATIONAL_ENVIRONMENT:
				return getVSSSOperationalEnvironment();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_ASSUMPTIONS_DEPENDENCIES:
				return getVSSSAssumptionsDependencies();
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
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_PRODUCT_PERSPECTIVE:
				getVSSSProductPerspective().clear();
				getVSSSProductPerspective().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CAPABILITES:
				getVSSSGeneralCapabilites().clear();
				getVSSSGeneralCapabilites().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CONSTRAINTS:
				getVSSSGeneralConstraints().clear();
				getVSSSGeneralConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_OPERATIONAL_ENVIRONMENT:
				getVSSSOperationalEnvironment().clear();
				getVSSSOperationalEnvironment().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_ASSUMPTIONS_DEPENDENCIES:
				getVSSSAssumptionsDependencies().clear();
				getVSSSAssumptionsDependencies().addAll((Collection<? extends String>)newValue);
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
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_PRODUCT_PERSPECTIVE:
				getVSSSProductPerspective().clear();
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CAPABILITES:
				getVSSSGeneralCapabilites().clear();
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CONSTRAINTS:
				getVSSSGeneralConstraints().clear();
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_OPERATIONAL_ENVIRONMENT:
				getVSSSOperationalEnvironment().clear();
				return;
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_ASSUMPTIONS_DEPENDENCIES:
				getVSSSAssumptionsDependencies().clear();
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
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_PRODUCT_PERSPECTIVE:
				return vsssProductPerspective != null && !vsssProductPerspective.isEmpty();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CAPABILITES:
				return vsssGeneralCapabilites != null && !vsssGeneralCapabilites.isEmpty();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CONSTRAINTS:
				return vsssGeneralConstraints != null && !vsssGeneralConstraints.isEmpty();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_OPERATIONAL_ENVIRONMENT:
				return vsssOperationalEnvironment != null && !vsssOperationalEnvironment.isEmpty();
			case sssPackage.VSSS_GENERAL_DESCRIPTION__VSSS_ASSUMPTIONS_DEPENDENCIES:
				return vsssAssumptionsDependencies != null && !vsssAssumptionsDependencies.isEmpty();
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
		result.append(" (VSSSProductPerspective: ");
		result.append(vsssProductPerspective);
		result.append(", VSSSGeneralCapabilites: ");
		result.append(vsssGeneralCapabilites);
		result.append(", VSSSGeneralConstraints: ");
		result.append(vsssGeneralConstraints);
		result.append(", VSSSOperationalEnvironment: ");
		result.append(vsssOperationalEnvironment);
		result.append(", VSSSAssumptionsDependencies: ");
		result.append(vsssAssumptionsDependencies);
		result.append(')');
		return result.toString();
	}

} //VSSSGeneralDescriptionImpl
