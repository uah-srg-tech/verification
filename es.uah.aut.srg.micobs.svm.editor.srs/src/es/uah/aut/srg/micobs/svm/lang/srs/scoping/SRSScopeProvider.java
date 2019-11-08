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
package es.uah.aut.srg.micobs.svm.lang.srs.scoping;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableParentDocument;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class SRSScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope scope_VTraceableDocument(VTraceableDocument srsDoc, EReference reference) {
		
		IScope scope = delegateGetScope(srsDoc, reference);
		Iterable<IEObjectDescription> elements = scope.getAllElements();
		
		Iterable<IEObjectDescription> fullQN = Iterables.filter(elements, new Predicate<IEObjectDescription>() {

			@Override
			public boolean apply(IEObjectDescription from) {
				if (from.getEObjectOrProxy() != srsDoc) {
					return true;
				}
				else {
					return false;
				}
			}
		});

		return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
	}

	public IScope scope_VTraceableDocumentAbstractItem_parentItem(VTraceableDocument srsDoc, EReference reference) {
		
		Collection<VTraceableDocumentAbstractItem> items = new HashSet<VTraceableDocumentAbstractItem>();
		
		for(VTraceableParentDocument docParent : srsDoc.getParents()) {
			for(VTraceableDocumentAbstractGroup group : docParent.getDocument().getGroups()) {
				items.addAll(group.getItems());
			}
		}
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(items, new Function<VTraceableDocumentAbstractItem, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTraceableDocumentAbstractItem from) {
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

	public IScope scope_VTraceableParentDocument_notApplicableItem(VTraceableParentDocument srsParentDoc, EReference reference) {
		
		Collection<VTraceableDocumentAbstractItem> items = new HashSet<VTraceableDocumentAbstractItem>();
		
		if(srsParentDoc.getDocument() != null)
		{
			VTraceableDocument doc = srsParentDoc.getDocument();
			for(VTraceableDocumentAbstractGroup group : doc.getGroups()) {
				items.addAll(group.getItems());
			}
		}
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(items, new Function<VTraceableDocumentAbstractItem, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTraceableDocumentAbstractItem from) {
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