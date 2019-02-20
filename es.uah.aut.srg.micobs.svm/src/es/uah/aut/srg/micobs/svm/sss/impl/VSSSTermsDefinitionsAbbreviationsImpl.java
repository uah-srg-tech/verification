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

import es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Terms Definitions Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl#getVSSSTerm <em>VSSS Term</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl#getVSSSDefinition <em>VSSS Definition</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl#getVSSSAbbreviation <em>VSSS Abbreviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSTermsDefinitionsAbbreviationsImpl extends MinimalEObjectImpl.Container implements VSSSTermsDefinitionsAbbreviations {
	/**
	 * The cached value of the '{@link #getVSSSTerm() <em>VSSS Term</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssTerm;

	/**
	 * The cached value of the '{@link #getVSSSDefinition() <em>VSSS Definition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssDefinition;

	/**
	 * The cached value of the '{@link #getVSSSAbbreviation() <em>VSSS Abbreviation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSSSAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vsssAbbreviation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSTermsDefinitionsAbbreviationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVSSSTerm() {
		if (vsssTerm == null) {
			vsssTerm = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_TERM);
		}
		return vsssTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVSSSDefinition() {
		if (vsssDefinition == null) {
			vsssDefinition = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_DEFINITION);
		}
		return vsssDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVSSSAbbreviation() {
		if (vsssAbbreviation == null) {
			vsssAbbreviation = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_ABBREVIATION);
		}
		return vsssAbbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_TERM:
				return getVSSSTerm();
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_DEFINITION:
				return getVSSSDefinition();
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_ABBREVIATION:
				return getVSSSAbbreviation();
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
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_TERM:
				getVSSSTerm().clear();
				getVSSSTerm().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_DEFINITION:
				getVSSSDefinition().clear();
				getVSSSDefinition().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_ABBREVIATION:
				getVSSSAbbreviation().clear();
				getVSSSAbbreviation().addAll((Collection<? extends String>)newValue);
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
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_TERM:
				getVSSSTerm().clear();
				return;
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_DEFINITION:
				getVSSSDefinition().clear();
				return;
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_ABBREVIATION:
				getVSSSAbbreviation().clear();
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
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_TERM:
				return vsssTerm != null && !vsssTerm.isEmpty();
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_DEFINITION:
				return vsssDefinition != null && !vsssDefinition.isEmpty();
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_ABBREVIATION:
				return vsssAbbreviation != null && !vsssAbbreviation.isEmpty();
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
		result.append(" (VSSSTerm: ");
		result.append(vsssTerm);
		result.append(", VSSSDefinition: ");
		result.append(vsssDefinition);
		result.append(", VSSSAbbreviation: ");
		result.append(vsssAbbreviation);
		result.append(')');
		return result.toString();
	}

} //VSSSTermsDefinitionsAbbreviationsImpl
