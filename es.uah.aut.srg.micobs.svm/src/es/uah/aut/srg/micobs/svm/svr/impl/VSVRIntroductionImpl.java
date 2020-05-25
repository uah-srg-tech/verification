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
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection;
import es.uah.aut.srg.micobs.svm.svr.VSVRIntroduction;
import es.uah.aut.srg.micobs.svm.svr.svrPackage;

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
 * An implementation of the model object '<em><b>VSVR Introduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRIntroductionImpl#getSvrInstatiableSubsections <em>Svr Instatiable Subsections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVRIntroductionImpl extends DFixedSectionImpl implements VSVRIntroduction {
	/**
	 * The cached value of the '{@link #getSvrInstatiableSubsections() <em>Svr Instatiable Subsections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvrInstatiableSubsections()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVRInstantiableSection> svrInstatiableSubsections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVRIntroductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svrPackage.Literals.VSVR_INTRODUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVRInstantiableSection> getSvrInstatiableSubsections() {
		if (svrInstatiableSubsections == null) {
			svrInstatiableSubsections = new EObjectContainmentEList<VSVRInstantiableSection>(VSVRInstantiableSection.class, this, svrPackage.VSVR_INTRODUCTION__SVR_INSTATIABLE_SUBSECTIONS);
		}
		return svrInstatiableSubsections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svrPackage.VSVR_INTRODUCTION__SVR_INSTATIABLE_SUBSECTIONS:
				return ((InternalEList<?>)getSvrInstatiableSubsections()).basicRemove(otherEnd, msgs);
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
			case svrPackage.VSVR_INTRODUCTION__SVR_INSTATIABLE_SUBSECTIONS:
				return getSvrInstatiableSubsections();
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
			case svrPackage.VSVR_INTRODUCTION__SVR_INSTATIABLE_SUBSECTIONS:
				getSvrInstatiableSubsections().clear();
				getSvrInstatiableSubsections().addAll((Collection<? extends VSVRInstantiableSection>)newValue);
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
			case svrPackage.VSVR_INTRODUCTION__SVR_INSTATIABLE_SUBSECTIONS:
				getSvrInstatiableSubsections().clear();
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
			case svrPackage.VSVR_INTRODUCTION__SVR_INSTATIABLE_SUBSECTIONS:
				return svrInstatiableSubsections != null && !svrInstatiableSubsections.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		
		for(DAbstractSection subsection : getSvrInstatiableSubsections()) {
			subsections.add(subsection);
		}
		return subsections;
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		for(VSVRInstantiableSection subsection : getSvrInstatiableSubsections()) {
			objects.addAll(subsection.getReferenceableObjects(ReferenceableObjectType));
		}
		return objects;
	}

} //VSVRIntroductionImpl
