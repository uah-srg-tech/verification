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
package es.uah.aut.srg.micobs.svm.testsetup.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsOverVariablesSection;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTest Setup Actions Over Variables Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsOverVariablesSectionImpl#getActionOverVariable <em>Action Over Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTestSetupActionsOverVariablesSectionImpl extends DFixedSectionImpl implements VTestSetupActionsOverVariablesSection {
	/**
	 * The cached value of the '{@link #getActionOverVariable() <em>Action Over Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionOverVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<VTestSetupActionOverVariable> actionOverVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTestSetupActionsOverVariablesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return testsetupPackage.Literals.VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTestSetupActionOverVariable> getActionOverVariable() {
		if (actionOverVariable == null) {
			actionOverVariable = new EObjectContainmentEList<VTestSetupActionOverVariable>(VTestSetupActionOverVariable.class, this, testsetupPackage.VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION__ACTION_OVER_VARIABLE);
		}
		return actionOverVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION__ACTION_OVER_VARIABLE:
				return ((InternalEList<?>)getActionOverVariable()).basicRemove(otherEnd, msgs);
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
			case testsetupPackage.VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION__ACTION_OVER_VARIABLE:
				return getActionOverVariable();
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
			case testsetupPackage.VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION__ACTION_OVER_VARIABLE:
				getActionOverVariable().clear();
				getActionOverVariable().addAll((Collection<? extends VTestSetupActionOverVariable>)newValue);
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
			case testsetupPackage.VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION__ACTION_OVER_VARIABLE:
				getActionOverVariable().clear();
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
			case testsetupPackage.VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION__ACTION_OVER_VARIABLE:
				return actionOverVariable != null && !actionOverVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<DAbstractSection> getSubsections() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		for(VTestSetupActionOverVariable action : getActionOverVariable()) {
			objects.addAll(action.getReferenceableObjects(ReferenceableObjectType));
		}
		return objects;
	}

} //VTestSetupActionsOverVariablesSectionImpl
