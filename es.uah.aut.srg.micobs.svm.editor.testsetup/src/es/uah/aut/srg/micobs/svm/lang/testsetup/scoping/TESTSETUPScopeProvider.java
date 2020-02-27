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
package es.uah.aut.srg.micobs.svm.lang.testsetup.scoping;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection;
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class TESTSETUPScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope scope_VTestSetupSupportedInterface_scenarioInterface(VTestSetupScenarioSection scenario, EReference reference) {

		Collection<TMTCIFScenarioInterface> ifaces = new HashSet<TMTCIFScenarioInterface>();
		ifaces.addAll(scenario.getScenario().getScenarioInterfaces());
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(ifaces, new Function<TMTCIFScenarioInterface, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(TMTCIFScenarioInterface from) {
				if (from.getName() != null) {
					return EObjectDescription.create(from.getName(), from);
				}
				else {
					return null;
				}
			}
		});
		return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
	}

	public IScope scope_VTestSetupSupportedInterface_interface(VTestSetupDocument testSetupDoc, EReference reference) {
		
		Collection<VTestSetupInterface> interfaces = new HashSet<VTestSetupInterface>();
		interfaces.addAll(testSetupDoc.getInterfaces().getInterfaces());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(interfaces, new Function<VTestSetupInterface, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTestSetupInterface from) {
				if (from.getName() != null) {
					return EObjectDescription.create(from.getName(), from);
				}
				else {
					return null;
				}
			}
		});
		return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
	}

	public IScope scope_VTestSetupScenarioSection_supportedAction(VTestSetupDocument testSetupDoc, EReference reference) {
		
		Collection<VTestSetupAction> actions = new HashSet<VTestSetupAction>();
		actions.addAll(testSetupDoc.getActions().getAction());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(actions, new Function<VTestSetupAction, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTestSetupAction from) {
				if (from.getName() != null) {
					return EObjectDescription.create(from.getName(), from);
				}
				else {
					return null;
				}
			}
		});
		return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
	}
	
	public IScope scope_VTestSetupSelectedConfiguration_configuration(VTestSetupDocument testSetupDoc, EReference reference) {
		
		Collection<VTestSetupPacketConfiguration> configurations = new HashSet<VTestSetupPacketConfiguration>();
		configurations.addAll(testSetupDoc.getConfigurations().getPacketConfigurations());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(configurations, new Function<VTestSetupPacketConfiguration, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTestSetupPacketConfiguration from) {
				if (from.getName() != null) {
					return EObjectDescription.create(from.getName(), from);
				}
				else {
					return null;
				}
			}
		});
		return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
	}

	public IScope scope_DReferenceableObject(VTestSetupDocument testSetupDoc, EReference reference) {

		Collection<DReferenceableObject> objects = new HashSet<DReferenceableObject>();
		
		objects.addAll(testSetupDoc.getApplicableDocuments());
		objects.addAll(testSetupDoc.getReferenceDocuments());
		objects.addAll(testSetupDoc.getFigures());
		objects.addAll(testSetupDoc.getTables());
		objects.addAll(testSetupDoc.getParagraphs());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(objects, new Function<DReferenceableObject, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(DReferenceableObject from) {
				if (from.getName() != null) {
					return EObjectDescription.create(from.getName(), from);
				}
				else {
					return null;
				}
			}
		});
		return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
	}
}
