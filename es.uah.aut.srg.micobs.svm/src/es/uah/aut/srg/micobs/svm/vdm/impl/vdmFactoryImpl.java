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
package es.uah.aut.srg.micobs.svm.vdm.impl;

import es.uah.aut.srg.micobs.svm.vdm.*;

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
public class vdmFactoryImpl extends EFactoryImpl implements vdmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static vdmFactory init() {
		try {
			vdmFactory thevdmFactory = (vdmFactory)EPackage.Registry.INSTANCE.getEFactory(vdmPackage.eNS_URI);
			if (thevdmFactory != null) {
				return thevdmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new vdmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vdmFactoryImpl() {
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
			case vdmPackage.VVALIDATION_DOCUMENT: return createVValidationDocument();
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_GROUP: return createVValidationDocumentAbstractGroup();
			case vdmPackage.VVALIDATION_DOCUMENT_FIXED_GROUP: return createVValidationDocumentFixedGroup();
			case vdmPackage.VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP: return createVValidationDocumentInstantiableGroup();
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM: return createVValidationDocumentAbstractItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VValidationDocument createVValidationDocument() {
		VValidationDocumentImpl vValidationDocument = new VValidationDocumentImpl();
		return vValidationDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VValidationDocumentAbstractGroup createVValidationDocumentAbstractGroup() {
		VValidationDocumentAbstractGroupImpl vValidationDocumentAbstractGroup = new VValidationDocumentAbstractGroupImpl();
		return vValidationDocumentAbstractGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VValidationDocumentFixedGroup createVValidationDocumentFixedGroup() {
		VValidationDocumentFixedGroupImpl vValidationDocumentFixedGroup = new VValidationDocumentFixedGroupImpl();
		return vValidationDocumentFixedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VValidationDocumentInstantiableGroup createVValidationDocumentInstantiableGroup() {
		VValidationDocumentInstantiableGroupImpl vValidationDocumentInstantiableGroup = new VValidationDocumentInstantiableGroupImpl();
		return vValidationDocumentInstantiableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VValidationDocumentAbstractItem createVValidationDocumentAbstractItem() {
		VValidationDocumentAbstractItemImpl vValidationDocumentAbstractItem = new VValidationDocumentAbstractItemImpl();
		return vValidationDocumentAbstractItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vdmPackage getvdmPackage() {
		return (vdmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static vdmPackage getPackage() {
		return vdmPackage.eINSTANCE;
	}

} //vdmFactoryImpl
