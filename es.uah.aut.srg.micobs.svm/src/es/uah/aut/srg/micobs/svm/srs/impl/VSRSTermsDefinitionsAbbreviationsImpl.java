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

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.srs.VSRSAbbreviation;
import es.uah.aut.srg.micobs.svm.srs.VSRSDefinition;
import es.uah.aut.srg.micobs.svm.srs.VSRSTerm;
import es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSRS Terms Definitions Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSTermsDefinitionsAbbreviationsImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSTermsDefinitionsAbbreviationsImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSTermsDefinitionsAbbreviationsImpl#getAbbreviations <em>Abbreviations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSRSTermsDefinitionsAbbreviationsImpl extends DFixedSectionImpl implements VSRSTermsDefinitionsAbbreviations {
	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<VSRSTerm> terms;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<VSRSDefinition> definitions;

	/**
	 * The cached value of the '{@link #getAbbreviations() <em>Abbreviations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviations()
	 * @generated
	 * @ordered
	 */
	protected EList<VSRSAbbreviation> abbreviations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSRSTermsDefinitionsAbbreviationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return srsPackage.Literals.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSRSTerm> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<VSRSTerm>(VSRSTerm.class, this, srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSRSDefinition> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentEList<VSRSDefinition>(VSRSDefinition.class, this, srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSRSAbbreviation> getAbbreviations() {
		if (abbreviations == null) {
			abbreviations = new EObjectContainmentEList<VSRSAbbreviation>(VSRSAbbreviation.class, this, srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS);
		}
		return abbreviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS:
				return ((InternalEList<?>)getAbbreviations()).basicRemove(otherEnd, msgs);
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
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS:
				return getTerms();
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS:
				return getDefinitions();
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS:
				return getAbbreviations();
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
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS:
				getTerms().clear();
				getTerms().addAll((Collection<? extends VSRSTerm>)newValue);
				return;
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends VSRSDefinition>)newValue);
				return;
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS:
				getAbbreviations().clear();
				getAbbreviations().addAll((Collection<? extends VSRSAbbreviation>)newValue);
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
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS:
				getTerms().clear();
				return;
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS:
				getDefinitions().clear();
				return;
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS:
				getAbbreviations().clear();
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
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS:
				return terms != null && !terms.isEmpty();
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS:
				return abbreviations != null && !abbreviations.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		return ECollections.emptyEList();
	}

} //VSRSTermsDefinitionsAbbreviationsImpl
