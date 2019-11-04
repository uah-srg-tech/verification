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
package es.uah.aut.srg.micobs.svm.svs.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;
import es.uah.aut.srg.micobs.svm.svs.VSVSFixedTestSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCase;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractItemImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl#getSubsections <em>Subsections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl#getPassFailCriteria <em>Pass Fail Criteria</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl#getEnvironmentalNeeds <em>Environmental Needs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl#getSpecialConstraints <em>Special Constraints</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl#getInterfaceDependencies <em>Interface Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSTestCaseImpl extends VValidationDocumentAbstractItemImpl implements VSVSTestCase {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedTestSection identifier;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedTestSection inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedTestSection outputs;

	/**
	 * The cached value of the '{@link #getPassFailCriteria() <em>Pass Fail Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassFailCriteria()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedTestSection passFailCriteria;

	/**
	 * The cached value of the '{@link #getEnvironmentalNeeds() <em>Environmental Needs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalNeeds()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedTestSection environmentalNeeds;

	/**
	 * The cached value of the '{@link #getSpecialConstraints() <em>Special Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialConstraints()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedTestSection specialConstraints;

	/**
	 * The cached value of the '{@link #getInterfaceDependencies() <em>Interface Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceDependencies()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedTestSection interfaceDependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSTestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_TEST_CASE;
	}

	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subections = new BasicEList<DAbstractSection>();
		subections.add((DAbstractSection) getIdentifier());
		subections.add((DAbstractSection) getInputs());
		subections.add((DAbstractSection) getOutputs());
		subections.add((DAbstractSection) getPassFailCriteria());
		subections.add((DAbstractSection) getEnvironmentalNeeds());
		subections.add((DAbstractSection) getSpecialConstraints());
		subections.add((DAbstractSection) getInterfaceDependencies());
		return subections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedTestSection getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(VSVSFixedTestSection newIdentifier, NotificationChain msgs) {
		VSVSFixedTestSection oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(VSVSFixedTestSection newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedTestSection getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(VSVSFixedTestSection newInputs, NotificationChain msgs) {
		VSVSFixedTestSection oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__INPUTS, oldInputs, newInputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputs(VSVSFixedTestSection newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedTestSection getOutputs() {
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputs(VSVSFixedTestSection newOutputs, NotificationChain msgs) {
		VSVSFixedTestSection oldOutputs = outputs;
		outputs = newOutputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__OUTPUTS, oldOutputs, newOutputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputs(VSVSFixedTestSection newOutputs) {
		if (newOutputs != outputs) {
			NotificationChain msgs = null;
			if (outputs != null)
				msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__OUTPUTS, null, msgs);
			if (newOutputs != null)
				msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__OUTPUTS, null, msgs);
			msgs = basicSetOutputs(newOutputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__OUTPUTS, newOutputs, newOutputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedTestSection getPassFailCriteria() {
		return passFailCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassFailCriteria(VSVSFixedTestSection newPassFailCriteria, NotificationChain msgs) {
		VSVSFixedTestSection oldPassFailCriteria = passFailCriteria;
		passFailCriteria = newPassFailCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__PASS_FAIL_CRITERIA, oldPassFailCriteria, newPassFailCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassFailCriteria(VSVSFixedTestSection newPassFailCriteria) {
		if (newPassFailCriteria != passFailCriteria) {
			NotificationChain msgs = null;
			if (passFailCriteria != null)
				msgs = ((InternalEObject)passFailCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__PASS_FAIL_CRITERIA, null, msgs);
			if (newPassFailCriteria != null)
				msgs = ((InternalEObject)newPassFailCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__PASS_FAIL_CRITERIA, null, msgs);
			msgs = basicSetPassFailCriteria(newPassFailCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__PASS_FAIL_CRITERIA, newPassFailCriteria, newPassFailCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedTestSection getEnvironmentalNeeds() {
		return environmentalNeeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentalNeeds(VSVSFixedTestSection newEnvironmentalNeeds, NotificationChain msgs) {
		VSVSFixedTestSection oldEnvironmentalNeeds = environmentalNeeds;
		environmentalNeeds = newEnvironmentalNeeds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS, oldEnvironmentalNeeds, newEnvironmentalNeeds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironmentalNeeds(VSVSFixedTestSection newEnvironmentalNeeds) {
		if (newEnvironmentalNeeds != environmentalNeeds) {
			NotificationChain msgs = null;
			if (environmentalNeeds != null)
				msgs = ((InternalEObject)environmentalNeeds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS, null, msgs);
			if (newEnvironmentalNeeds != null)
				msgs = ((InternalEObject)newEnvironmentalNeeds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS, null, msgs);
			msgs = basicSetEnvironmentalNeeds(newEnvironmentalNeeds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS, newEnvironmentalNeeds, newEnvironmentalNeeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedTestSection getSpecialConstraints() {
		return specialConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialConstraints(VSVSFixedTestSection newSpecialConstraints, NotificationChain msgs) {
		VSVSFixedTestSection oldSpecialConstraints = specialConstraints;
		specialConstraints = newSpecialConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__SPECIAL_CONSTRAINTS, oldSpecialConstraints, newSpecialConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialConstraints(VSVSFixedTestSection newSpecialConstraints) {
		if (newSpecialConstraints != specialConstraints) {
			NotificationChain msgs = null;
			if (specialConstraints != null)
				msgs = ((InternalEObject)specialConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__SPECIAL_CONSTRAINTS, null, msgs);
			if (newSpecialConstraints != null)
				msgs = ((InternalEObject)newSpecialConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__SPECIAL_CONSTRAINTS, null, msgs);
			msgs = basicSetSpecialConstraints(newSpecialConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__SPECIAL_CONSTRAINTS, newSpecialConstraints, newSpecialConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedTestSection getInterfaceDependencies() {
		return interfaceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceDependencies(VSVSFixedTestSection newInterfaceDependencies, NotificationChain msgs) {
		VSVSFixedTestSection oldInterfaceDependencies = interfaceDependencies;
		interfaceDependencies = newInterfaceDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__INTERFACE_DEPENDENCIES, oldInterfaceDependencies, newInterfaceDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceDependencies(VSVSFixedTestSection newInterfaceDependencies) {
		if (newInterfaceDependencies != interfaceDependencies) {
			NotificationChain msgs = null;
			if (interfaceDependencies != null)
				msgs = ((InternalEObject)interfaceDependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__INTERFACE_DEPENDENCIES, null, msgs);
			if (newInterfaceDependencies != null)
				msgs = ((InternalEObject)newInterfaceDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_CASE__INTERFACE_DEPENDENCIES, null, msgs);
			msgs = basicSetInterfaceDependencies(newInterfaceDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_CASE__INTERFACE_DEPENDENCIES, newInterfaceDependencies, newInterfaceDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_TEST_CASE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case svsPackage.VSVS_TEST_CASE__INPUTS:
				return basicSetInputs(null, msgs);
			case svsPackage.VSVS_TEST_CASE__OUTPUTS:
				return basicSetOutputs(null, msgs);
			case svsPackage.VSVS_TEST_CASE__PASS_FAIL_CRITERIA:
				return basicSetPassFailCriteria(null, msgs);
			case svsPackage.VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS:
				return basicSetEnvironmentalNeeds(null, msgs);
			case svsPackage.VSVS_TEST_CASE__SPECIAL_CONSTRAINTS:
				return basicSetSpecialConstraints(null, msgs);
			case svsPackage.VSVS_TEST_CASE__INTERFACE_DEPENDENCIES:
				return basicSetInterfaceDependencies(null, msgs);
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
			case svsPackage.VSVS_TEST_CASE__SUBSECTIONS:
				return getSubsections();
			case svsPackage.VSVS_TEST_CASE__IDENTIFIER:
				return getIdentifier();
			case svsPackage.VSVS_TEST_CASE__INPUTS:
				return getInputs();
			case svsPackage.VSVS_TEST_CASE__OUTPUTS:
				return getOutputs();
			case svsPackage.VSVS_TEST_CASE__PASS_FAIL_CRITERIA:
				return getPassFailCriteria();
			case svsPackage.VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS:
				return getEnvironmentalNeeds();
			case svsPackage.VSVS_TEST_CASE__SPECIAL_CONSTRAINTS:
				return getSpecialConstraints();
			case svsPackage.VSVS_TEST_CASE__INTERFACE_DEPENDENCIES:
				return getInterfaceDependencies();
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
			case svsPackage.VSVS_TEST_CASE__SUBSECTIONS:
				getSubsections().clear();
				getSubsections().addAll((Collection<? extends es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection>)newValue);
				return;
			case svsPackage.VSVS_TEST_CASE__IDENTIFIER:
				setIdentifier((VSVSFixedTestSection)newValue);
				return;
			case svsPackage.VSVS_TEST_CASE__INPUTS:
				setInputs((VSVSFixedTestSection)newValue);
				return;
			case svsPackage.VSVS_TEST_CASE__OUTPUTS:
				setOutputs((VSVSFixedTestSection)newValue);
				return;
			case svsPackage.VSVS_TEST_CASE__PASS_FAIL_CRITERIA:
				setPassFailCriteria((VSVSFixedTestSection)newValue);
				return;
			case svsPackage.VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS:
				setEnvironmentalNeeds((VSVSFixedTestSection)newValue);
				return;
			case svsPackage.VSVS_TEST_CASE__SPECIAL_CONSTRAINTS:
				setSpecialConstraints((VSVSFixedTestSection)newValue);
				return;
			case svsPackage.VSVS_TEST_CASE__INTERFACE_DEPENDENCIES:
				setInterfaceDependencies((VSVSFixedTestSection)newValue);
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
			case svsPackage.VSVS_TEST_CASE__SUBSECTIONS:
				getSubsections().clear();
				return;
			case svsPackage.VSVS_TEST_CASE__IDENTIFIER:
				setIdentifier((VSVSFixedTestSection)null);
				return;
			case svsPackage.VSVS_TEST_CASE__INPUTS:
				setInputs((VSVSFixedTestSection)null);
				return;
			case svsPackage.VSVS_TEST_CASE__OUTPUTS:
				setOutputs((VSVSFixedTestSection)null);
				return;
			case svsPackage.VSVS_TEST_CASE__PASS_FAIL_CRITERIA:
				setPassFailCriteria((VSVSFixedTestSection)null);
				return;
			case svsPackage.VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS:
				setEnvironmentalNeeds((VSVSFixedTestSection)null);
				return;
			case svsPackage.VSVS_TEST_CASE__SPECIAL_CONSTRAINTS:
				setSpecialConstraints((VSVSFixedTestSection)null);
				return;
			case svsPackage.VSVS_TEST_CASE__INTERFACE_DEPENDENCIES:
				setInterfaceDependencies((VSVSFixedTestSection)null);
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
			case svsPackage.VSVS_TEST_CASE__SUBSECTIONS:
				return !getSubsections().isEmpty();
			case svsPackage.VSVS_TEST_CASE__IDENTIFIER:
				return identifier != null;
			case svsPackage.VSVS_TEST_CASE__INPUTS:
				return inputs != null;
			case svsPackage.VSVS_TEST_CASE__OUTPUTS:
				return outputs != null;
			case svsPackage.VSVS_TEST_CASE__PASS_FAIL_CRITERIA:
				return passFailCriteria != null;
			case svsPackage.VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS:
				return environmentalNeeds != null;
			case svsPackage.VSVS_TEST_CASE__SPECIAL_CONSTRAINTS:
				return specialConstraints != null;
			case svsPackage.VSVS_TEST_CASE__INTERFACE_DEPENDENCIES:
				return interfaceDependencies != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection.class) {
			switch (derivedFeatureID) {
				case svsPackage.VSVS_TEST_CASE__SUBSECTIONS: return doctplPackage.DABSTRACT_SECTION__SUBSECTIONS;
				default: return -1;
			}
		}
		if (baseClass == DFixedSection.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection.class) {
			switch (baseFeatureID) {
				case doctplPackage.DABSTRACT_SECTION__SUBSECTIONS: return svsPackage.VSVS_TEST_CASE__SUBSECTIONS;
				default: return -1;
			}
		}
		if (baseClass == DFixedSection.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	@Override
	public VValidationDocumentAbstractGroup basicGetGroup() {
		return (VValidationDocumentAbstractGroup)eContainer();
	}

} //VSVSTestCaseImpl
