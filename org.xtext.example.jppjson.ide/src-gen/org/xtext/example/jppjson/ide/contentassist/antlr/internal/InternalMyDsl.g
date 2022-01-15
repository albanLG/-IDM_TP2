/*
 * generated by Xtext 2.25.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.jppjson.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.jppjson.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.jppjson.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAlternatives()); }
		(rule__Expression__Alternatives)
		{ after(grammarAccess.getExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getAlternatives()); }
		(rule__Entity__Alternatives)
		{ after(grammarAccess.getEntityAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElement
entryRuleElement
:
{ before(grammarAccess.getElementRule()); }
	 ruleElement
{ after(grammarAccess.getElementRule()); } 
	 EOF 
;

// Rule Element
ruleElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementAccess().getGroup()); }
		(rule__Element__Group__0)
		{ after(grammarAccess.getElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValue
entryRuleValue
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValueAccess().getAlternatives()); }
		(rule__Value__Alternatives)
		{ after(grammarAccess.getValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJsonString
entryRuleJsonString
:
{ before(grammarAccess.getJsonStringRule()); }
	 ruleJsonString
{ after(grammarAccess.getJsonStringRule()); } 
	 EOF 
;

// Rule JsonString
ruleJsonString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJsonStringAccess().getValAssignment()); }
		(rule__JsonString__ValAssignment)
		{ after(grammarAccess.getJsonStringAccess().getValAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJsonBoolean
entryRuleJsonBoolean
:
{ before(grammarAccess.getJsonBooleanRule()); }
	 ruleJsonBoolean
{ after(grammarAccess.getJsonBooleanRule()); } 
	 EOF 
;

// Rule JsonBoolean
ruleJsonBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJsonBooleanAccess().getValAssignment()); }
		(rule__JsonBoolean__ValAssignment)
		{ after(grammarAccess.getJsonBooleanAccess().getValAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJsonEmpty
entryRuleJsonEmpty
:
{ before(grammarAccess.getJsonEmptyRule()); }
	 ruleJsonEmpty
{ after(grammarAccess.getJsonEmptyRule()); } 
	 EOF 
;

// Rule JsonEmpty
ruleJsonEmpty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJsonEmptyAccess().getValAssignment()); }
		(rule__JsonEmpty__ValAssignment)
		{ after(grammarAccess.getJsonEmptyAccess().getValAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJsonInteger
entryRuleJsonInteger
:
{ before(grammarAccess.getJsonIntegerRule()); }
	 ruleJsonInteger
{ after(grammarAccess.getJsonIntegerRule()); } 
	 EOF 
;

// Rule JsonInteger
ruleJsonInteger 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJsonIntegerAccess().getValAssignment()); }
		(rule__JsonInteger__ValAssignment)
		{ after(grammarAccess.getJsonIntegerAccess().getValAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJObject
entryRuleJObject
:
{ before(grammarAccess.getJObjectRule()); }
	 ruleJObject
{ after(grammarAccess.getJObjectRule()); } 
	 EOF 
;

// Rule JObject
ruleJObject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJObjectAccess().getGroup()); }
		(rule__JObject__Group__0)
		{ after(grammarAccess.getJObjectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleJArray
entryRuleJArray
:
{ before(grammarAccess.getJArrayRule()); }
	 ruleJArray
{ after(grammarAccess.getJArrayRule()); } 
	 EOF 
;

// Rule JArray
ruleJArray 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJArrayAccess().getGroup()); }
		(rule__JArray__Group__0)
		{ after(grammarAccess.getJArrayAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBinExp
entryRuleBinExp
:
{ before(grammarAccess.getBinExpRule()); }
	 ruleBinExp
{ after(grammarAccess.getBinExpRule()); } 
	 EOF 
;

// Rule BinExp
ruleBinExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBinExpAccess().getGroup()); }
		(rule__BinExp__Group__0)
		{ after(grammarAccess.getBinExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getBinExpParserRuleCall_0()); }
		ruleBinExp
		{ after(grammarAccess.getExpressionAccess().getBinExpParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getValueParserRuleCall_1()); }
		ruleValue
		{ after(grammarAccess.getExpressionAccess().getValueParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getEntityParserRuleCall_2()); }
		ruleEntity
		{ after(grammarAccess.getExpressionAccess().getEntityParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getJObjectParserRuleCall_0()); }
		ruleJObject
		{ after(grammarAccess.getEntityAccess().getJObjectParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEntityAccess().getJArrayParserRuleCall_1()); }
		ruleJArray
		{ after(grammarAccess.getEntityAccess().getJArrayParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValueAccess().getJsonStringParserRuleCall_0()); }
		ruleJsonString
		{ after(grammarAccess.getValueAccess().getJsonStringParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getJsonBooleanParserRuleCall_1()); }
		ruleJsonBoolean
		{ after(grammarAccess.getValueAccess().getJsonBooleanParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getJsonEmptyParserRuleCall_2()); }
		ruleJsonEmpty
		{ after(grammarAccess.getValueAccess().getJsonEmptyParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getJsonIntegerParserRuleCall_3()); }
		ruleJsonInteger
		{ after(grammarAccess.getValueAccess().getJsonIntegerParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JsonBoolean__ValAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJsonBooleanAccess().getValTrueKeyword_0_0()); }
		'true'
		{ after(grammarAccess.getJsonBooleanAccess().getValTrueKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getJsonBooleanAccess().getValFalseKeyword_0_1()); }
		'false'
		{ after(grammarAccess.getJsonBooleanAccess().getValFalseKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Element__Group__0__Impl
	rule__Element__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementAccess().getKeyAssignment_0()); }
	(rule__Element__KeyAssignment_0)
	{ after(grammarAccess.getElementAccess().getKeyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Element__Group__1__Impl
	rule__Element__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getElementAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Element__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getElementAccess().getValueAssignment_2()); }
	(rule__Element__ValueAssignment_2)
	{ after(grammarAccess.getElementAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JObject__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JObject__Group__0__Impl
	rule__JObject__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JObject__Group__1__Impl
	rule__JObject__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJObjectAccess().getGroup_1()); }
	(rule__JObject__Group_1__0)?
	{ after(grammarAccess.getJObjectAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JObject__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJObjectAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getJObjectAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JObject__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JObject__Group_1__0__Impl
	rule__JObject__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJObjectAccess().getElementAssignment_1_0()); }
	(rule__JObject__ElementAssignment_1_0)
	{ after(grammarAccess.getJObjectAccess().getElementAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JObject__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJObjectAccess().getGroup_1_1()); }
	(rule__JObject__Group_1_1__0)*
	{ after(grammarAccess.getJObjectAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JObject__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JObject__Group_1_1__0__Impl
	rule__JObject__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJObjectAccess().getCommaKeyword_1_1_0()); }
	','
	{ after(grammarAccess.getJObjectAccess().getCommaKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JObject__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJObjectAccess().getElementAssignment_1_1_1()); }
	(rule__JObject__ElementAssignment_1_1_1)
	{ after(grammarAccess.getJObjectAccess().getElementAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JArray__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group__0__Impl
	rule__JArray__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getLeftSquareBracketKeyword_0()); }
	'['
	{ after(grammarAccess.getJArrayAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group__1__Impl
	rule__JArray__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getGroup_1()); }
	(rule__JArray__Group_1__0)?
	{ after(grammarAccess.getJArrayAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getRightSquareBracketKeyword_2()); }
	']'
	{ after(grammarAccess.getJArrayAccess().getRightSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JArray__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group_1__0__Impl
	rule__JArray__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getExpressionAssignment_1_0()); }
	(rule__JArray__ExpressionAssignment_1_0)
	{ after(grammarAccess.getJArrayAccess().getExpressionAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getGroup_1_1()); }
	(rule__JArray__Group_1_1__0)*
	{ after(grammarAccess.getJArrayAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JArray__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group_1_1__0__Impl
	rule__JArray__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getCommaKeyword_1_1_0()); }
	','
	{ after(grammarAccess.getJArrayAccess().getCommaKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JArray__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJArrayAccess().getExpressionAssignment_1_1_1()); }
	(rule__JArray__ExpressionAssignment_1_1_1)
	{ after(grammarAccess.getJArrayAccess().getExpressionAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BinExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinExp__Group__0__Impl
	rule__BinExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BinExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinExpAccess().getValAssignment_0()); }
	(rule__BinExp__ValAssignment_0)
	{ after(grammarAccess.getBinExpAccess().getValAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinExp__Group__1__Impl
	rule__BinExp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BinExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinExpAccess().getPlusSignKeyword_1()); }
	'+'
	{ after(grammarAccess.getBinExpAccess().getPlusSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinExp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinExp__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BinExp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinExpAccess().getRvalAssignment_2()); }
	(rule__BinExp__RvalAssignment_2)
	{ after(grammarAccess.getBinExpAccess().getRvalAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Element__KeyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getKeySTRINGTerminalRuleCall_0_0()); }
		RULE_STRING
		{ after(grammarAccess.getElementAccess().getKeySTRINGTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getValueExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getElementAccess().getValueExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JsonString__ValAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJsonStringAccess().getValSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getJsonStringAccess().getValSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JsonBoolean__ValAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJsonBooleanAccess().getValAlternatives_0()); }
		(rule__JsonBoolean__ValAlternatives_0)
		{ after(grammarAccess.getJsonBooleanAccess().getValAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JsonEmpty__ValAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJsonEmptyAccess().getValNullKeyword_0()); }
		(
			{ before(grammarAccess.getJsonEmptyAccess().getValNullKeyword_0()); }
			'null'
			{ after(grammarAccess.getJsonEmptyAccess().getValNullKeyword_0()); }
		)
		{ after(grammarAccess.getJsonEmptyAccess().getValNullKeyword_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JsonInteger__ValAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJsonIntegerAccess().getValINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getJsonIntegerAccess().getValINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__ElementAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_0_0()); }
		ruleElement
		{ after(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JObject__ElementAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_1_1_0()); }
		ruleElement
		{ after(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__ExpressionAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_0_0()); }
		ruleExpression
		{ after(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JArray__ExpressionAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinExp__ValAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinExpAccess().getValSTRINGTerminalRuleCall_0_0()); }
		RULE_STRING
		{ after(grammarAccess.getBinExpAccess().getValSTRINGTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinExp__RvalAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinExpAccess().getRvalSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getBinExpAccess().getRvalSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
