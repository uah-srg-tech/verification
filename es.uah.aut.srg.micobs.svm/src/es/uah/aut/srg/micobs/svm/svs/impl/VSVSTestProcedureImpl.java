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
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCase;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestInfo;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Test Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl#getTestCase <em>Test Case</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl#getProcedureSteps <em>Procedure Steps</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl#getTestScript <em>Test Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSTestProcedureImpl extends DFixedSectionImpl implements VSVSTestProcedure {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected VSVSTestInfo identifier;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected VSVSTestInfo purpose;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupScenarioSection scenario;

	/**
	 * The cached value of the '{@link #getTestCase() <em>Test Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCase()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSTestCase> testCase;

	/**
	 * The cached value of the '{@link #getProcedureSteps() <em>Procedure Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureSteps()
	 * @generated
	 * @ordered
	 */
	protected VSVSProcedureSteps procedureSteps;

	/**
	 * The cached value of the '{@link #getTestScript() <em>Test Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestScript()
	 * @generated
	 * @ordered
	 */
	protected VSVSTestInfo testScript;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSTestProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_TEST_PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_PROCEDURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestInfo getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(VSVSTestInfo newIdentifier, NotificationChain msgs) {
		VSVSTestInfo oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_PROCEDURE__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(VSVSTestInfo newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_PROCEDURE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_PROCEDURE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_PROCEDURE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestInfo getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(VSVSTestInfo newPurpose, NotificationChain msgs) {
		VSVSTestInfo oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_PROCEDURE__PURPOSE, oldPurpose, newPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(VSVSTestInfo newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_PROCEDURE__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_PROCEDURE__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_PROCEDURE__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupScenarioSection getScenario() {
		if (scenario != null && scenario.eIsProxy()) {
			InternalEObject oldScenario = (InternalEObject)scenario;
			scenario = (VTestSetupScenarioSection)eResolveProxy(oldScenario);
			if (scenario != oldScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_TEST_PROCEDURE__SCENARIO, oldScenario, scenario));
			}
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupScenarioSection basicGetScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(VTestSetupScenarioSection newScenario) {
		VTestSetupScenarioSection oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_PROCEDURE__SCENARIO, oldScenario, scenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSProcedureSteps getProcedureSteps() {
		return procedureSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedureSteps(VSVSProcedureSteps newProcedureSteps, NotificationChain msgs) {
		VSVSProcedureSteps oldProcedureSteps = procedureSteps;
		procedureSteps = newProcedureSteps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_PROCEDURE__PROCEDURE_STEPS, oldProcedureSteps, newProcedureSteps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureSteps(VSVSProcedureSteps newProcedureSteps) {
		if (newProcedureSteps != procedureSteps) {
			NotificationChain msgs = null;
			if (procedureSteps != null)
				msgs = ((InternalEObject)procedureSteps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_PROCEDURE__PROCEDURE_STEPS, null, msgs);
			if (newProcedureSteps != null)
				msgs = ((InternalEObject)newProcedureSteps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_PROCEDURE__PROCEDURE_STEPS, null, msgs);
			msgs = basicSetProcedureSteps(newProcedureSteps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_PROCEDURE__PROCEDURE_STEPS, newProcedureSteps, newProcedureSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestInfo getTestScript() {
		return testScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestScript(VSVSTestInfo newTestScript, NotificationChain msgs) {
		VSVSTestInfo oldTestScript = testScript;
		testScript = newTestScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_PROCEDURE__TEST_SCRIPT, oldTestScript, newTestScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestScript(VSVSTestInfo newTestScript) {
		if (newTestScript != testScript) {
			NotificationChain msgs = null;
			if (testScript != null)
				msgs = ((InternalEObject)testScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_PROCEDURE__TEST_SCRIPT, null, msgs);
			if (newTestScript != null)
				msgs = ((InternalEObject)newTestScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TEST_PROCEDURE__TEST_SCRIPT, null, msgs);
			msgs = basicSetTestScript(newTestScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TEST_PROCEDURE__TEST_SCRIPT, newTestScript, newTestScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSTestCase> getTestCase() {
		if (testCase == null) {
			testCase = new EObjectResolvingEList<VSVSTestCase>(VSVSTestCase.class, this, svsPackage.VSVS_TEST_PROCEDURE__TEST_CASE);
		}
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_TEST_PROCEDURE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case svsPackage.VSVS_TEST_PROCEDURE__PURPOSE:
				return basicSetPurpose(null, msgs);
			case svsPackage.VSVS_TEST_PROCEDURE__PROCEDURE_STEPS:
				return basicSetProcedureSteps(null, msgs);
			case svsPackage.VSVS_TEST_PROCEDURE__TEST_SCRIPT:
				return basicSetTestScript(null, msgs);
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
			case svsPackage.VSVS_TEST_PROCEDURE__NAME:
				return getName();
			case svsPackage.VSVS_TEST_PROCEDURE__IDENTIFIER:
				return getIdentifier();
			case svsPackage.VSVS_TEST_PROCEDURE__PURPOSE:
				return getPurpose();
			case svsPackage.VSVS_TEST_PROCEDURE__SCENARIO:
				if (resolve) return getScenario();
				return basicGetScenario();
			case svsPackage.VSVS_TEST_PROCEDURE__TEST_CASE:
				return getTestCase();
			case svsPackage.VSVS_TEST_PROCEDURE__PROCEDURE_STEPS:
				return getProcedureSteps();
			case svsPackage.VSVS_TEST_PROCEDURE__TEST_SCRIPT:
				return getTestScript();
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
			case svsPackage.VSVS_TEST_PROCEDURE__NAME:
				setName((String)newValue);
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__IDENTIFIER:
				setIdentifier((VSVSTestInfo)newValue);
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__PURPOSE:
				setPurpose((VSVSTestInfo)newValue);
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__SCENARIO:
				setScenario((VTestSetupScenarioSection)newValue);
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__TEST_CASE:
				getTestCase().clear();
				getTestCase().addAll((Collection<? extends VSVSTestCase>)newValue);
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__PROCEDURE_STEPS:
				setProcedureSteps((VSVSProcedureSteps)newValue);
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__TEST_SCRIPT:
				setTestScript((VSVSTestInfo)newValue);
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
			case svsPackage.VSVS_TEST_PROCEDURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__IDENTIFIER:
				setIdentifier((VSVSTestInfo)null);
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__PURPOSE:
				setPurpose((VSVSTestInfo)null);
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__SCENARIO:
				setScenario((VTestSetupScenarioSection)null);
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__TEST_CASE:
				getTestCase().clear();
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__PROCEDURE_STEPS:
				setProcedureSteps((VSVSProcedureSteps)null);
				return;
			case svsPackage.VSVS_TEST_PROCEDURE__TEST_SCRIPT:
				setTestScript((VSVSTestInfo)null);
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
			case svsPackage.VSVS_TEST_PROCEDURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case svsPackage.VSVS_TEST_PROCEDURE__IDENTIFIER:
				return identifier != null;
			case svsPackage.VSVS_TEST_PROCEDURE__PURPOSE:
				return purpose != null;
			case svsPackage.VSVS_TEST_PROCEDURE__SCENARIO:
				return scenario != null;
			case svsPackage.VSVS_TEST_PROCEDURE__TEST_CASE:
				return testCase != null && !testCase.isEmpty();
			case svsPackage.VSVS_TEST_PROCEDURE__PROCEDURE_STEPS:
				return procedureSteps != null;
			case svsPackage.VSVS_TEST_PROCEDURE__TEST_SCRIPT:
				return testScript != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		subsections.add(getProcedureSteps());
		return subsections;
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		objects.addAll(getIdentifier().getReferenceableObjects(ReferenceableObjectType));
		objects.addAll(getPurpose().getReferenceableObjects(ReferenceableObjectType));
		objects.addAll(getTestScript().getReferenceableObjects(ReferenceableObjectType));
		return objects;
	}

} //VSVSTestProcedureImpl
