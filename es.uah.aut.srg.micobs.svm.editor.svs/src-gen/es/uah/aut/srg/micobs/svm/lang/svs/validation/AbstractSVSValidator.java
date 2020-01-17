/*******************************************************************************
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.svm.lang.svs.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.ImportUriValidator;

@ComposedChecks(validators = {ImportUriValidator.class})
public abstract class AbstractSVSValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/svm/svs"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/doctpl/doctpl"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/svm/testsetup"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/tmtcif/fieldvalue"));
		return result;
	}
	
}
