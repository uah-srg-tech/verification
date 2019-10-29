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
package es.uah.aut.srg.micobs.svm.vcd.impl;

import es.uah.aut.srg.micobs.svm.vcd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class vcdFactoryImpl extends EFactoryImpl implements vcdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static vcdFactory init() {
		try {
			vcdFactory thevcdFactory = (vcdFactory)EPackage.Registry.INSTANCE.getEFactory(vcdPackage.eNS_URI);
			if (thevcdFactory != null) {
				return thevcdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new vcdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vcdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case vcdPackage.VVCD_LIST: return createVVCDList();
			case vcdPackage.VVCD_ITEMS: return createVVCDItems();
			case vcdPackage.VVCD_ITEM: return createVVCDItem();
			case vcdPackage.VVCD_PARENT_REF_ITEM: return createVVCDParentRefItem();
			case vcdPackage.VVCD_PARENT_ITEMS: return createVVCDParentItems();
			case vcdPackage.VVCD_PARENT_ITEM: return createVVCDParentItem();
			case vcdPackage.VVCD_REF_ITEM: return createVVCDRefItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCDList createVVCDList() {
		VVCDListImpl vvcdList = new VVCDListImpl();
		return vvcdList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCDItems createVVCDItems() {
		VVCDItemsImpl vvcdItems = new VVCDItemsImpl();
		return vvcdItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCDItem createVVCDItem() {
		VVCDItemImpl vvcdItem = new VVCDItemImpl();
		return vvcdItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCDParentRefItem createVVCDParentRefItem() {
		VVCDParentRefItemImpl vvcdParentRefItem = new VVCDParentRefItemImpl();
		return vvcdParentRefItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCDParentItems createVVCDParentItems() {
		VVCDParentItemsImpl vvcdParentItems = new VVCDParentItemsImpl();
		return vvcdParentItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCDParentItem createVVCDParentItem() {
		VVCDParentItemImpl vvcdParentItem = new VVCDParentItemImpl();
		return vvcdParentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCDRefItem createVVCDRefItem() {
		VVCDRefItemImpl vvcdRefItem = new VVCDRefItemImpl();
		return vvcdRefItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vcdPackage getvcdPackage() {
		return (vcdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static vcdPackage getPackage() {
		return vcdPackage.eINSTANCE;
	}

} //vcdFactoryImpl
