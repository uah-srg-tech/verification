/*
 * generated by Xtext 2.10.0
 */
package es.uah.aut.srg.micobs.svm.lang.tmtemplate.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.tmtemplate.services.TMTEMPLATEGrammarAccess;
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
public class TMTEMPLATESyntacticSequencer extends AbstractSyntacticSequencer {

	protected TMTEMPLATEGrammarAccess grammarAccess;
	protected AbstractElementAlias match_VTMTemplate_SolidusGreaterThanSignKeyword_5_1_or___GreaterThanSignKeyword_5_0_0_TMTemplateKeyword_5_0_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TMTEMPLATEGrammarAccess) access;
		match_VTMTemplate_SolidusGreaterThanSignKeyword_5_1_or___GreaterThanSignKeyword_5_0_0_TMTemplateKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getVTMTemplateAccess().getGreaterThanSignKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getVTMTemplateAccess().getTMTemplateKeyword_5_0_2())), new TokenAlias(false, false, grammarAccess.getVTMTemplateAccess().getSolidusGreaterThanSignKeyword_5_1()));
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
			if (match_VTMTemplate_SolidusGreaterThanSignKeyword_5_1_or___GreaterThanSignKeyword_5_0_0_TMTemplateKeyword_5_0_2__.equals(syntax))
				emit_VTMTemplate_SolidusGreaterThanSignKeyword_5_1_or___GreaterThanSignKeyword_5_0_0_TMTemplateKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('>' '</TMTemplate>') | '/>'
	 *
	 * This ambiguous syntax occurs at:
	 *     tmOutput=[TMTCIFTM|STRING] (ambiguity) (rule end)
	 */
	protected void emit_VTMTemplate_SolidusGreaterThanSignKeyword_5_1_or___GreaterThanSignKeyword_5_0_0_TMTemplateKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}