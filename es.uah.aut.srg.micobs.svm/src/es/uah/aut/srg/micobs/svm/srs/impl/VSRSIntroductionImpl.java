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
import es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableSection;
import es.uah.aut.srg.micobs.svm.srs.VSRSIntroduction;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSRS Introduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSIntroductionImpl#getSrsInstatiableSubsections <em>Srs Instatiable Subsections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSRSIntroductionImpl extends es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl implements VSRSIntroduction {
	/**
	 * The cached value of the '{@link #getSrsInstatiableSubsections() <em>Srs Instatiable Subsections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsInstatiableSubsections()
	 * @generated
	 * @ordered
	 */
	protected EList<VSRSInstantiableSection> srsInstatiableSubsections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSRSIntroductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return srsPackage.Literals.VSRS_INTRODUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSRSInstantiableSection> getSrsInstatiableSubsections() {
		if (srsInstatiableSubsections == null) {
			srsInstatiableSubsections = new EObjectContainmentEList<VSRSInstantiableSection>(VSRSInstantiableSection.class, this, srsPackage.VSRS_INTRODUCTION__SRS_INSTATIABLE_SUBSECTIONS);
		}
		return srsInstatiableSubsections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_INTRODUCTION__SRS_INSTATIABLE_SUBSECTIONS:
				return ((InternalEList<?>)getSrsInstatiableSubsections()).basicRemove(otherEnd, msgs);
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
			case srsPackage.VSRS_INTRODUCTION__SRS_INSTATIABLE_SUBSECTIONS:
				return getSrsInstatiableSubsections();
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
			case srsPackage.VSRS_INTRODUCTION__SRS_INSTATIABLE_SUBSECTIONS:
				getSrsInstatiableSubsections().clear();
				getSrsInstatiableSubsections().addAll((Collection<? extends VSRSInstantiableSection>)newValue);
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
			case srsPackage.VSRS_INTRODUCTION__SRS_INSTATIABLE_SUBSECTIONS:
				getSrsInstatiableSubsections().clear();
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
			case srsPackage.VSRS_INTRODUCTION__SRS_INSTATIABLE_SUBSECTIONS:
				return srsInstatiableSubsections != null && !srsInstatiableSubsections.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		
		for(DAbstractSection subsection : getSrsInstatiableSubsections()) {
			subsections.add(subsection);
		}
		return subsections;
	}

} //VSRSIntroductionImpl
