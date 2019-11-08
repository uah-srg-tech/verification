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
package es.uah.aut.srg.micobs.svm.lang.srs.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.srs.services.SRSGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SRSSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SRSGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DRun_BoldTrueKeyword_1_q;
	protected AbstractElementAlias match_DRun_ItalicsTrueKeyword_2_q;
	protected AbstractElementAlias match_DRun_UnderlineTrueKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SRSGrammarAccess) access;
		match_DRun_BoldTrueKeyword_1_q = new TokenAlias(false, true, grammarAccess.getDRunAccess().getBoldTrueKeyword_1());
		match_DRun_ItalicsTrueKeyword_2_q = new TokenAlias(false, true, grammarAccess.getDRunAccess().getItalicsTrueKeyword_2());
		match_DRun_UnderlineTrueKeyword_3_q = new TokenAlias(false, true, grammarAccess.getDRunAccess().getUnderlineTrueKeyword_3());
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
			if (match_DRun_BoldTrueKeyword_1_q.equals(syntax))
				emit_DRun_BoldTrueKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DRun_ItalicsTrueKeyword_2_q.equals(syntax))
				emit_DRun_ItalicsTrueKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DRun_UnderlineTrueKeyword_3_q.equals(syntax))
				emit_DRun_UnderlineTrueKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'bold="true"'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '<run' (ambiguity) 'italics="true"'? 'underline="true"'? '>' tab=DTab
	 *     (rule start) '<run' (ambiguity) 'italics="true"'? 'underline="true"'? '>' text=DText
	 *     (rule start) '<run' (ambiguity) 'italics="true"'? 'underline="true"'? 'color=' color=STRING
	 */
	protected void emit_DRun_BoldTrueKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'italics="true"'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '<run' 'bold="true"'? (ambiguity) 'underline="true"'? '>' tab=DTab
	 *     (rule start) '<run' 'bold="true"'? (ambiguity) 'underline="true"'? '>' text=DText
	 *     (rule start) '<run' 'bold="true"'? (ambiguity) 'underline="true"'? 'color=' color=STRING
	 */
	protected void emit_DRun_ItalicsTrueKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'underline="true"'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '<run' 'bold="true"'? 'italics="true"'? (ambiguity) '>' tab=DTab
	 *     (rule start) '<run' 'bold="true"'? 'italics="true"'? (ambiguity) '>' text=DText
	 *     (rule start) '<run' 'bold="true"'? 'italics="true"'? (ambiguity) 'color=' color=STRING
	 */
	protected void emit_DRun_UnderlineTrueKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
