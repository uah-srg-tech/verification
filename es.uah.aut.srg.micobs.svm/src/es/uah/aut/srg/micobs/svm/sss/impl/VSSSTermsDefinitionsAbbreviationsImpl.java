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
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSTermsDefinitionsAbbreviationsImpl extends MinimalEObjectImpl.Container implements VSSSTermsDefinitionsAbbreviations {
	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<String> term;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<String> definition;

	/**
	 * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> abbreviation;

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
	public EList<String> getTerm() {
		if (term == null) {
			term = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__TERM);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDefinition() {
		if (definition == null) {
			definition = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAbbreviation() {
		if (abbreviation == null) {
			abbreviation = new EDataTypeUniqueEList<String>(String.class, this, sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATION);
		}
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__TERM:
				return getTerm();
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITION:
				return getDefinition();
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATION:
				return getAbbreviation();
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
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends String>)newValue);
				return;
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATION:
				getAbbreviation().clear();
				getAbbreviation().addAll((Collection<? extends String>)newValue);
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
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__TERM:
				getTerm().clear();
				return;
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITION:
				getDefinition().clear();
				return;
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATION:
				getAbbreviation().clear();
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
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__TERM:
				return term != null && !term.isEmpty();
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITION:
				return definition != null && !definition.isEmpty();
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATION:
				return abbreviation != null && !abbreviation.isEmpty();
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
		result.append(" (term: ");
		result.append(term);
		result.append(", definition: ");
		result.append(definition);
		result.append(", abbreviation: ");
		result.append(abbreviation);
		result.append(')');
		return result.toString();
	}

} //VSSSTermsDefinitionsAbbreviationsImpl
