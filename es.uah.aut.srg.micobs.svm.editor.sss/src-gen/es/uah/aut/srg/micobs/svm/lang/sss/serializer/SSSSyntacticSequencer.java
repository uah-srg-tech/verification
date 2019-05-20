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
package es.uah.aut.srg.micobs.svm.lang.sss.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.sss.services.SSSGrammarAccess;
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
public class SSSSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SSSGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DRun_BoldTrueKeyword_1_q;
	protected AbstractElementAlias match_DRun_ItalicsTrueKeyword_2_q;
	protected AbstractElementAlias match_DRun_UnderlineTrueKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SSSGrammarAccess) access;
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
	 *     (rule start) '<run' (ambiguity) 'italics="true"'? 'underline="true"'? '>' text=DText
	 */
	protected void emit_DRun_BoldTrueKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'italics="true"'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '<run' 'bold="true"'? (ambiguity) 'underline="true"'? '>' text=DText
	 */
	protected void emit_DRun_ItalicsTrueKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'underline="true"'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '<run' 'bold="true"'? 'italics="true"'? (ambiguity) '>' text=DText
	 */
	protected void emit_DRun_UnderlineTrueKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
