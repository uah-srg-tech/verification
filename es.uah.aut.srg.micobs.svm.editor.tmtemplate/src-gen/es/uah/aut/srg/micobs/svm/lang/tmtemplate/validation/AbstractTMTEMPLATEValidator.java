/*
 * generated by Xtext 2.10.0
 */
package es.uah.aut.srg.micobs.svm.lang.tmtemplate.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.ImportUriValidator;

@ComposedChecks(validators = {ImportUriValidator.class})
public abstract class AbstractTMTEMPLATEValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/svm/tmtemplate"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/tmtcif/fieldvalue"));
		return result;
	}
	
}
