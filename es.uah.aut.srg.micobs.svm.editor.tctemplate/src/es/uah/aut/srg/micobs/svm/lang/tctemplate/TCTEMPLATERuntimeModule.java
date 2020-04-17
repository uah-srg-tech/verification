/*******************************************************************************
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.svm.lang.tctemplate;

import org.eclipse.xtext.naming.IQualifiedNameConverter;

import es.uah.aut.srg.micobs.xtext.MICOBSQualifiedNameProvider.MICOBSDefaultNameConverter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class TCTEMPLATERuntimeModule extends AbstractTCTEMPLATERuntimeModule {

	//added MICOBS qualifier (using :: instead of . for segments) for allowing using . in ref. names
	public Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return MICOBSDefaultNameConverter.class;
	}
}
