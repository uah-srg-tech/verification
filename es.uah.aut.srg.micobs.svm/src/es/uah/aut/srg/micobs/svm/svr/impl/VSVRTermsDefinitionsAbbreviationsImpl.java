/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.micobs.svm.svr.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.svr.VSVRAbbreviation;
import es.uah.aut.srg.micobs.svm.svr.VSVRDefinition;
import es.uah.aut.srg.micobs.svm.svr.VSVRTerm;
import es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.svr.svrPackage;

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
 * An implementation of the model object '<em><b>VSVR Terms Definitions Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRTermsDefinitionsAbbreviationsImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRTermsDefinitionsAbbreviationsImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRTermsDefinitionsAbbreviationsImpl#getAbbreviations <em>Abbreviations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVRTermsDefinitionsAbbreviationsImpl extends DFixedSectionImpl implements VSVRTermsDefinitionsAbbreviations {
	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVRTerm> terms;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVRDefinition> definitions;

	/**
	 * The cached value of the '{@link #getAbbreviations() <em>Abbreviations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviations()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVRAbbreviation> abbreviations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVRTermsDefinitionsAbbreviationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svrPackage.Literals.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVRTerm> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<VSVRTerm>(VSVRTerm.class, this, svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVRDefinition> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentEList<VSVRDefinition>(VSVRDefinition.class, this, svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVRAbbreviation> getAbbreviations() {
		if (abbreviations == null) {
			abbreviations = new EObjectContainmentEList<VSVRAbbreviation>(VSVRAbbreviation.class, this, svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS);
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
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS:
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
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS:
				return getTerms();
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS:
				return getDefinitions();
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS:
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
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS:
				getTerms().clear();
				getTerms().addAll((Collection<? extends VSVRTerm>)newValue);
				return;
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends VSVRDefinition>)newValue);
				return;
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS:
				getAbbreviations().clear();
				getAbbreviations().addAll((Collection<? extends VSVRAbbreviation>)newValue);
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
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS:
				getTerms().clear();
				return;
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS:
				getDefinitions().clear();
				return;
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS:
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
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS:
				return terms != null && !terms.isEmpty();
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS:
				return abbreviations != null && !abbreviations.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		return ECollections.emptyEList();
	}


} //VSVRTermsDefinitionsAbbreviationsImpl
