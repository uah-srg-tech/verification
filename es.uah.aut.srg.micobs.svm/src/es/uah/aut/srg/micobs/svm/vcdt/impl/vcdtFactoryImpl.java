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
package es.uah.aut.srg.micobs.svm.vcdt.impl;

import es.uah.aut.srg.micobs.svm.vcdt.*;

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
public class vcdtFactoryImpl extends EFactoryImpl implements vcdtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static vcdtFactory init() {
		try {
			vcdtFactory thevcdtFactory = (vcdtFactory)EPackage.Registry.INSTANCE.getEFactory(vcdtPackage.eNS_URI);
			if (thevcdtFactory != null) {
				return thevcdtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new vcdtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vcdtFactoryImpl() {
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
			case vcdtPackage.VCDT_LIST: return createVCDTList();
			case vcdtPackage.VCDT_ITEMS: return createVCDTItems();
			case vcdtPackage.VCDT_ITEM: return createVCDTItem();
			case vcdtPackage.VCDT_PARENT_REF_ITEM: return createVCDTParentRefItem();
			case vcdtPackage.VCDT_PARENT_ITEMS: return createVCDTParentItems();
			case vcdtPackage.VCDT_PARENT_ITEM: return createVCDTParentItem();
			case vcdtPackage.VCDT_REF_ITEM: return createVCDTRefItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCDTList createVCDTList() {
		VCDTListImpl vcdtList = new VCDTListImpl();
		return vcdtList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCDTItems createVCDTItems() {
		VCDTItemsImpl vcdtItems = new VCDTItemsImpl();
		return vcdtItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCDTItem createVCDTItem() {
		VCDTItemImpl vcdtItem = new VCDTItemImpl();
		return vcdtItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCDTParentRefItem createVCDTParentRefItem() {
		VCDTParentRefItemImpl vcdtParentRefItem = new VCDTParentRefItemImpl();
		return vcdtParentRefItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCDTParentItems createVCDTParentItems() {
		VCDTParentItemsImpl vcdtParentItems = new VCDTParentItemsImpl();
		return vcdtParentItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCDTParentItem createVCDTParentItem() {
		VCDTParentItemImpl vcdtParentItem = new VCDTParentItemImpl();
		return vcdtParentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCDTRefItem createVCDTRefItem() {
		VCDTRefItemImpl vcdtRefItem = new VCDTRefItemImpl();
		return vcdtRefItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vcdtPackage getvcdtPackage() {
		return (vcdtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static vcdtPackage getPackage() {
		return vcdtPackage.eINSTANCE;
	}

} //vcdtFactoryImpl
