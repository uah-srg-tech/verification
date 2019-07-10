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

import es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;

import es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Step Output Level3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl#getLevel3 <em>Level3</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl#getLevel3_filter <em>Level3 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl#getLevel2 <em>Level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl#getLevel3_from_level2 <em>Level3 from level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl#getLevel2_filter <em>Level2 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl#getLevel2_from_level1 <em>Level2 from level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl#getLevel1_filter <em>Level1 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl#getLevel1_from_level0 <em>Level1 from level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl#getLevel0_filter <em>Level0 filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepOutputLevel3Impl extends VSVSStepOutputImpl implements VSVSStepOutputLevel3 {
	/**
	 * The cached value of the '{@link #getLevel3() <em>Level3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel3()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level3;

	/**
	 * The cached value of the '{@link #getLevel3_filter() <em>Level3 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel3_filter()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepFilter level3_filter;

	/**
	 * The cached value of the '{@link #getLevel2() <em>Level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level2;

	/**
	 * The cached value of the '{@link #getLevel3_from_level2() <em>Level3 from level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel3_from_level2()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFImportImport level3_from_level2;

	/**
	 * The cached value of the '{@link #getLevel2_filter() <em>Level2 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2_filter()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepFilter level2_filter;

	/**
	 * The cached value of the '{@link #getLevel1() <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level1;

	/**
	 * The cached value of the '{@link #getLevel2_from_level1() <em>Level2 from level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2_from_level1()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFImportImport level2_from_level1;

	/**
	 * The cached value of the '{@link #getLevel1_filter() <em>Level1 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_filter()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepFilter level1_filter;

	/**
	 * The cached value of the '{@link #getLevel0() <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level0;

	/**
	 * The cached value of the '{@link #getLevel1_from_level0() <em>Level1 from level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_from_level0()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFImportImport level1_from_level0;

	/**
	 * The cached value of the '{@link #getLevel0_filter() <em>Level0 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0_filter()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepFilter level0_filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepOutputLevel3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_OUTPUT_LEVEL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel3() {
		if (level3 != null && level3.eIsProxy()) {
			InternalEObject oldLevel3 = (InternalEObject)level3;
			level3 = (TMTCIFFormatFormat)eResolveProxy(oldLevel3);
			if (level3 != oldLevel3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3, oldLevel3, level3));
			}
		}
		return level3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel3() {
		return level3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel3(TMTCIFFormatFormat newLevel3) {
		TMTCIFFormatFormat oldLevel3 = level3;
		level3 = newLevel3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3, oldLevel3, level3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepFilter getLevel3_filter() {
		return level3_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel3_filter(VSVSStepFilter newLevel3_filter, NotificationChain msgs) {
		VSVSStepFilter oldLevel3_filter = level3_filter;
		level3_filter = newLevel3_filter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER, oldLevel3_filter, newLevel3_filter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel3_filter(VSVSStepFilter newLevel3_filter) {
		if (newLevel3_filter != level3_filter) {
			NotificationChain msgs = null;
			if (level3_filter != null)
				msgs = ((InternalEObject)level3_filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER, null, msgs);
			if (newLevel3_filter != null)
				msgs = ((InternalEObject)newLevel3_filter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER, null, msgs);
			msgs = basicSetLevel3_filter(newLevel3_filter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER, newLevel3_filter, newLevel3_filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel2() {
		if (level2 != null && level2.eIsProxy()) {
			InternalEObject oldLevel2 = (InternalEObject)level2;
			level2 = (TMTCIFFormatFormat)eResolveProxy(oldLevel2);
			if (level2 != oldLevel2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2, oldLevel2, level2));
			}
		}
		return level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel2() {
		return level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2(TMTCIFFormatFormat newLevel2) {
		TMTCIFFormatFormat oldLevel2 = level2;
		level2 = newLevel2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2, oldLevel2, level2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFImportImport getLevel3_from_level2() {
		if (level3_from_level2 != null && level3_from_level2.eIsProxy()) {
			InternalEObject oldLevel3_from_level2 = (InternalEObject)level3_from_level2;
			level3_from_level2 = (TMTCIFImportImport)eResolveProxy(oldLevel3_from_level2);
			if (level3_from_level2 != oldLevel3_from_level2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2, oldLevel3_from_level2, level3_from_level2));
			}
		}
		return level3_from_level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFImportImport basicGetLevel3_from_level2() {
		return level3_from_level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel3_from_level2(TMTCIFImportImport newLevel3_from_level2) {
		TMTCIFImportImport oldLevel3_from_level2 = level3_from_level2;
		level3_from_level2 = newLevel3_from_level2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2, oldLevel3_from_level2, level3_from_level2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepFilter getLevel2_filter() {
		return level2_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel2_filter(VSVSStepFilter newLevel2_filter, NotificationChain msgs) {
		VSVSStepFilter oldLevel2_filter = level2_filter;
		level2_filter = newLevel2_filter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER, oldLevel2_filter, newLevel2_filter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2_filter(VSVSStepFilter newLevel2_filter) {
		if (newLevel2_filter != level2_filter) {
			NotificationChain msgs = null;
			if (level2_filter != null)
				msgs = ((InternalEObject)level2_filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER, null, msgs);
			if (newLevel2_filter != null)
				msgs = ((InternalEObject)newLevel2_filter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER, null, msgs);
			msgs = basicSetLevel2_filter(newLevel2_filter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER, newLevel2_filter, newLevel2_filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel1() {
		if (level1 != null && level1.eIsProxy()) {
			InternalEObject oldLevel1 = (InternalEObject)level1;
			level1 = (TMTCIFFormatFormat)eResolveProxy(oldLevel1);
			if (level1 != oldLevel1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1, oldLevel1, level1));
			}
		}
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel1() {
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1(TMTCIFFormatFormat newLevel1) {
		TMTCIFFormatFormat oldLevel1 = level1;
		level1 = newLevel1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1, oldLevel1, level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFImportImport getLevel2_from_level1() {
		if (level2_from_level1 != null && level2_from_level1.eIsProxy()) {
			InternalEObject oldLevel2_from_level1 = (InternalEObject)level2_from_level1;
			level2_from_level1 = (TMTCIFImportImport)eResolveProxy(oldLevel2_from_level1);
			if (level2_from_level1 != oldLevel2_from_level1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1, oldLevel2_from_level1, level2_from_level1));
			}
		}
		return level2_from_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFImportImport basicGetLevel2_from_level1() {
		return level2_from_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2_from_level1(TMTCIFImportImport newLevel2_from_level1) {
		TMTCIFImportImport oldLevel2_from_level1 = level2_from_level1;
		level2_from_level1 = newLevel2_from_level1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1, oldLevel2_from_level1, level2_from_level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepFilter getLevel1_filter() {
		return level1_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel1_filter(VSVSStepFilter newLevel1_filter, NotificationChain msgs) {
		VSVSStepFilter oldLevel1_filter = level1_filter;
		level1_filter = newLevel1_filter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER, oldLevel1_filter, newLevel1_filter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_filter(VSVSStepFilter newLevel1_filter) {
		if (newLevel1_filter != level1_filter) {
			NotificationChain msgs = null;
			if (level1_filter != null)
				msgs = ((InternalEObject)level1_filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER, null, msgs);
			if (newLevel1_filter != null)
				msgs = ((InternalEObject)newLevel1_filter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER, null, msgs);
			msgs = basicSetLevel1_filter(newLevel1_filter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER, newLevel1_filter, newLevel1_filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel0() {
		if (level0 != null && level0.eIsProxy()) {
			InternalEObject oldLevel0 = (InternalEObject)level0;
			level0 = (TMTCIFFormatFormat)eResolveProxy(oldLevel0);
			if (level0 != oldLevel0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0, oldLevel0, level0));
			}
		}
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel0() {
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0(TMTCIFFormatFormat newLevel0) {
		TMTCIFFormatFormat oldLevel0 = level0;
		level0 = newLevel0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0, oldLevel0, level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFImportImport getLevel1_from_level0() {
		if (level1_from_level0 != null && level1_from_level0.eIsProxy()) {
			InternalEObject oldLevel1_from_level0 = (InternalEObject)level1_from_level0;
			level1_from_level0 = (TMTCIFImportImport)eResolveProxy(oldLevel1_from_level0);
			if (level1_from_level0 != oldLevel1_from_level0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0, oldLevel1_from_level0, level1_from_level0));
			}
		}
		return level1_from_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFImportImport basicGetLevel1_from_level0() {
		return level1_from_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_from_level0(TMTCIFImportImport newLevel1_from_level0) {
		TMTCIFImportImport oldLevel1_from_level0 = level1_from_level0;
		level1_from_level0 = newLevel1_from_level0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0, oldLevel1_from_level0, level1_from_level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepFilter getLevel0_filter() {
		return level0_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel0_filter(VSVSStepFilter newLevel0_filter, NotificationChain msgs) {
		VSVSStepFilter oldLevel0_filter = level0_filter;
		level0_filter = newLevel0_filter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER, oldLevel0_filter, newLevel0_filter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0_filter(VSVSStepFilter newLevel0_filter) {
		if (newLevel0_filter != level0_filter) {
			NotificationChain msgs = null;
			if (level0_filter != null)
				msgs = ((InternalEObject)level0_filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER, null, msgs);
			if (newLevel0_filter != null)
				msgs = ((InternalEObject)newLevel0_filter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER, null, msgs);
			msgs = basicSetLevel0_filter(newLevel0_filter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER, newLevel0_filter, newLevel0_filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER:
				return basicSetLevel3_filter(null, msgs);
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER:
				return basicSetLevel2_filter(null, msgs);
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER:
				return basicSetLevel1_filter(null, msgs);
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER:
				return basicSetLevel0_filter(null, msgs);
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
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3:
				if (resolve) return getLevel3();
				return basicGetLevel3();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER:
				return getLevel3_filter();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2:
				if (resolve) return getLevel2();
				return basicGetLevel2();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2:
				if (resolve) return getLevel3_from_level2();
				return basicGetLevel3_from_level2();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER:
				return getLevel2_filter();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1:
				if (resolve) return getLevel1();
				return basicGetLevel1();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1:
				if (resolve) return getLevel2_from_level1();
				return basicGetLevel2_from_level1();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER:
				return getLevel1_filter();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0:
				if (resolve) return getLevel0();
				return basicGetLevel0();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0:
				if (resolve) return getLevel1_from_level0();
				return basicGetLevel1_from_level0();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER:
				return getLevel0_filter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3:
				setLevel3((TMTCIFFormatFormat)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER:
				setLevel3_filter((VSVSStepFilter)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2:
				setLevel2((TMTCIFFormatFormat)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2:
				setLevel3_from_level2((TMTCIFImportImport)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER:
				setLevel2_filter((VSVSStepFilter)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1:
				setLevel1((TMTCIFFormatFormat)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1:
				setLevel2_from_level1((TMTCIFImportImport)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER:
				setLevel1_filter((VSVSStepFilter)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0:
				setLevel0((TMTCIFFormatFormat)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0:
				setLevel1_from_level0((TMTCIFImportImport)newValue);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER:
				setLevel0_filter((VSVSStepFilter)newValue);
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
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3:
				setLevel3((TMTCIFFormatFormat)null);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER:
				setLevel3_filter((VSVSStepFilter)null);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2:
				setLevel2((TMTCIFFormatFormat)null);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2:
				setLevel3_from_level2((TMTCIFImportImport)null);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER:
				setLevel2_filter((VSVSStepFilter)null);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1:
				setLevel1((TMTCIFFormatFormat)null);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1:
				setLevel2_from_level1((TMTCIFImportImport)null);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER:
				setLevel1_filter((VSVSStepFilter)null);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0:
				setLevel0((TMTCIFFormatFormat)null);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0:
				setLevel1_from_level0((TMTCIFImportImport)null);
				return;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER:
				setLevel0_filter((VSVSStepFilter)null);
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
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3:
				return level3 != null;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER:
				return level3_filter != null;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2:
				return level2 != null;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2:
				return level3_from_level2 != null;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER:
				return level2_filter != null;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1:
				return level1 != null;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1:
				return level2_from_level1 != null;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER:
				return level1_filter != null;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0:
				return level0 != null;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0:
				return level1_from_level0 != null;
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER:
				return level0_filter != null;
		}
		return super.eIsSet(featureID);
	}

} //VSVSStepOutputLevel3Impl
