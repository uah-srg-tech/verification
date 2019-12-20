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
package es.uah.aut.srg.micobs.svm.tmtemplate.impl;

import es.uah.aut.srg.micobs.svm.tmtemplate.*;

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
public class tmtemplateFactoryImpl extends EFactoryImpl implements tmtemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static tmtemplateFactory init() {
		try {
			tmtemplateFactory thetmtemplateFactory = (tmtemplateFactory)EPackage.Registry.INSTANCE.getEFactory(tmtemplatePackage.eNS_URI);
			if (thetmtemplateFactory != null) {
				return thetmtemplateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new tmtemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmtemplateFactoryImpl() {
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
			case tmtemplatePackage.VTM_TEMPLATE: return createVTMTemplate();
			case tmtemplatePackage.VTM_TEMPLATE_FIELD: return createVTMTemplateField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTMTemplate createVTMTemplate() {
		VTMTemplateImpl vtmTemplate = new VTMTemplateImpl();
		return vtmTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTMTemplateField createVTMTemplateField() {
		VTMTemplateFieldImpl vtmTemplateField = new VTMTemplateFieldImpl();
		return vtmTemplateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmtemplatePackage gettmtemplatePackage() {
		return (tmtemplatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static tmtemplatePackage getPackage() {
		return tmtemplatePackage.eINSTANCE;
	}

} //tmtemplateFactoryImpl
