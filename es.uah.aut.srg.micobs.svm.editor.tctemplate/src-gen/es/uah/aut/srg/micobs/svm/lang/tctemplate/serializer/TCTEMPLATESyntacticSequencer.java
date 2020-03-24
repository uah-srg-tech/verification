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
package es.uah.aut.srg.micobs.svm.lang.tctemplate.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.tctemplate.services.TCTEMPLATEGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class TCTEMPLATESyntacticSequencer extends AbstractSyntacticSequencer {

	protected TCTEMPLATEGrammarAccess grammarAccess;
	protected AbstractElementAlias match_VTCTemplate_SolidusGreaterThanSignKeyword_5_1_or___GreaterThanSignKeyword_5_0_0_TCTemplateKeyword_5_0_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TCTEMPLATEGrammarAccess) access;
		match_VTCTemplate_SolidusGreaterThanSignKeyword_5_1_or___GreaterThanSignKeyword_5_0_0_TCTemplateKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getVTCTemplateAccess().getGreaterThanSignKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getVTCTemplateAccess().getTCTemplateKeyword_5_0_2())), new TokenAlias(false, false, grammarAccess.getVTCTemplateAccess().getSolidusGreaterThanSignKeyword_5_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_VTCTemplate_SolidusGreaterThanSignKeyword_5_1_or___GreaterThanSignKeyword_5_0_0_TCTemplateKeyword_5_0_2__.equals(syntax))
				emit_VTCTemplate_SolidusGreaterThanSignKeyword_5_1_or___GreaterThanSignKeyword_5_0_0_TCTemplateKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('>' '</TCTemplate>') | '/>'
	 *
	 * This ambiguous syntax occurs at:
	 *     tc=[TMTCIFTC|STRING] (ambiguity) (rule end)
	 */
	protected void emit_VTCTemplate_SolidusGreaterThanSignKeyword_5_1_or___GreaterThanSignKeyword_5_0_0_TCTemplateKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
