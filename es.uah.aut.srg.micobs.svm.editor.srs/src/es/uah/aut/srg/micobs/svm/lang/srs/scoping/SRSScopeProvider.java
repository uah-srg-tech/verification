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

import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBC;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBD;
import es.uah.aut.srg.micobs.svm.srs.VSRSDocument;
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

	public IScope scope_DReferenceableObject(VSRSDocument srsDoc, EReference reference) {

		Collection<DReferenceableObject> objects = new HashSet<DReferenceableObject>();
		
		objects.addAll(srsDoc.getApplicableDocuments());
		objects.addAll(srsDoc.getReferenceDocuments());
		objects.addAll(srsDoc.getFigures());
		objects.addAll(srsDoc.getTables());
		objects.addAll(srsDoc.getParagraphs());
		objects.addAll(srsDoc.getTbcs());
		objects.addAll(srsDoc.getTbds());
		
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
	
	public IScope scope_DTBC_parentTBC(VSRSDocument srsDoc, EReference reference) {
		
		Collection<DTBC> tbcs = new HashSet<DTBC>();
		
		for(VTraceableParentDocument docParent : srsDoc.getParents()) {
			tbcs.addAll(((DDocumentTemplate)docParent.getDocument()).getTbcs());
		}
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(tbcs, new Function<DTBC, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(DTBC from) {
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
	
	public IScope scope_DTBD_parentTBD(VSRSDocument srsDoc, EReference reference) {
		
		Collection<DTBD> tbds = new HashSet<DTBD>();
		
		for(VTraceableParentDocument docParent : srsDoc.getParents()) {
			tbds.addAll(((DDocumentTemplate)docParent.getDocument()).getTbds());
		}
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(tbds, new Function<DTBD, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(DTBD from) {
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