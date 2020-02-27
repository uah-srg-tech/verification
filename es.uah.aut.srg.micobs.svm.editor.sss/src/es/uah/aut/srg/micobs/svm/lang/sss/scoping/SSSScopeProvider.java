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
package es.uah.aut.srg.micobs.svm.lang.sss.scoping;

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
import es.uah.aut.srg.micobs.svm.sss.VSSSDocument;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class SSSScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope scope_DReferenceableObject(VSSSDocument sssDoc, EReference reference) {

		Collection<DReferenceableObject> objects = new HashSet<DReferenceableObject>();
		
		objects.addAll(sssDoc.getApplicableDocuments());
		objects.addAll(sssDoc.getReferenceDocuments());
		objects.addAll(sssDoc.getFigures());
		objects.addAll(sssDoc.getTables());
		objects.addAll(sssDoc.getParagraphs());
		objects.addAll(sssDoc.getTbcs());
		objects.addAll(sssDoc.getTbds());
		
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
