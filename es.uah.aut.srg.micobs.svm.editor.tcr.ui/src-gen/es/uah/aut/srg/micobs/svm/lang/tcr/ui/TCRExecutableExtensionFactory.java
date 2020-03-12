/*******************************************************************************
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.svm.lang.tcr.ui;

import com.google.inject.Injector;
import es.uah.aut.srg.micobs.svm.editor.tcr.ui.internal.TcrActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TCRExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TcrActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TcrActivator.getInstance().getInjector(TcrActivator.ES_UAH_AUT_SRG_MICOBS_SVM_LANG_TCR_TCR);
	}
	
}
