/*
 * generated by Xtext 2.10.0
 */
package es.uah.aut.srg.micobs.svm.lang.tmtemplate;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class TMTEMPLATEStandaloneSetup extends TMTEMPLATEStandaloneSetupGenerated {

	public static void doSetup() {
		new TMTEMPLATEStandaloneSetup().createInjectorAndDoEMFRegistration();
	}				
}