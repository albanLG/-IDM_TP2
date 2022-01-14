/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.jppjson.serializer;

import com.google.inject.Inject;
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
import org.xtext.example.jppjson.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_JArray_JObject___LeftCurlyBracketKeyword_0_RightCurlyBracketKeyword_2___or___LeftSquareBracketKeyword_0_RightSquareBracketKeyword_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_JArray_JObject___LeftCurlyBracketKeyword_0_RightCurlyBracketKeyword_2___or___LeftSquareBracketKeyword_0_RightSquareBracketKeyword_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getJArrayAccess().getLeftSquareBracketKeyword_0()), new TokenAlias(false, false, grammarAccess.getJArrayAccess().getRightSquareBracketKeyword_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0()), new TokenAlias(false, false, grammarAccess.getJObjectAccess().getRightCurlyBracketKeyword_2())));
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
			if (match_JArray_JObject___LeftCurlyBracketKeyword_0_RightCurlyBracketKeyword_2___or___LeftSquareBracketKeyword_0_RightSquareBracketKeyword_2__.equals(syntax))
				emit_JArray_JObject___LeftCurlyBracketKeyword_0_RightCurlyBracketKeyword_2___or___LeftSquareBracketKeyword_0_RightSquareBracketKeyword_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}') | ('[' ']')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_JArray_JObject___LeftCurlyBracketKeyword_0_RightCurlyBracketKeyword_2___or___LeftSquareBracketKeyword_0_RightSquareBracketKeyword_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
