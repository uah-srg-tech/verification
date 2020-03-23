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

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;
import es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection;
import es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

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
 * An implementation of the model object '<em><b>VSSS Introduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl#getSssInstatiableSubsections <em>Sss Instatiable Subsections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSIntroductionImpl extends DFixedSectionImpl implements VSSSIntroduction {
	/**
	 * The cached value of the '{@link #getSssInstatiableSubsections() <em>Sss Instatiable Subsections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSssInstatiableSubsections()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSInstantiableSection> sssInstatiableSubsections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSIntroductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_INTRODUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSInstantiableSection> getSssInstatiableSubsections() {
		if (sssInstatiableSubsections == null) {
			sssInstatiableSubsections = new EObjectContainmentEList<VSSSInstantiableSection>(VSSSInstantiableSection.class, this, sssPackage.VSSS_INTRODUCTION__SSS_INSTATIABLE_SUBSECTIONS);
		}
		return sssInstatiableSubsections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_INTRODUCTION__SSS_INSTATIABLE_SUBSECTIONS:
				return ((InternalEList<?>)getSssInstatiableSubsections()).basicRemove(otherEnd, msgs);
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
			case sssPackage.VSSS_INTRODUCTION__SSS_INSTATIABLE_SUBSECTIONS:
				return getSssInstatiableSubsections();
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
			case sssPackage.VSSS_INTRODUCTION__SSS_INSTATIABLE_SUBSECTIONS:
				getSssInstatiableSubsections().clear();
				getSssInstatiableSubsections().addAll((Collection<? extends VSSSInstantiableSection>)newValue);
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
			case sssPackage.VSSS_INTRODUCTION__SSS_INSTATIABLE_SUBSECTIONS:
				getSssInstatiableSubsections().clear();
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
			case sssPackage.VSSS_INTRODUCTION__SSS_INSTATIABLE_SUBSECTIONS:
				return sssInstatiableSubsections != null && !sssInstatiableSubsections.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		
		for(DAbstractSection subsection : getSssInstatiableSubsections()) {
			subsections.add(subsection);
		}
		return subsections;
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		for(VSSSInstantiableSection subsection : getSssInstatiableSubsections()) {
			objects.addAll(subsection.getReferenceableObjects(ReferenceableObjectType));
		}
		return objects;
	}

} //VSSSIntroductionImpl
