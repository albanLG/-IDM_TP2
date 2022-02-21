/*
 * generated by Xtext 2.25.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.jppjson.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.jppjson.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.jppjson.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Programme";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgramme
entryRuleProgramme returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgrammeRule()); }
	iv_ruleProgramme=ruleProgramme
	{ $current=$iv_ruleProgramme.current; }
	EOF;

// Rule Programme
ruleProgramme returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getProgrammeAccess().getLoadfilesLoadfileParserRuleCall_0());
			}
			lv_loadfiles_0_0=ruleLoadfile
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getProgrammeRule());
				}
				add(
					$current,
					"loadfiles",
					lv_loadfiles_0_0,
					"org.xtext.example.jppjson.MyDsl.Loadfile");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleLoadfile
entryRuleLoadfile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoadfileRule()); }
	iv_ruleLoadfile=ruleLoadfile
	{ $current=$iv_ruleLoadfile.current; }
	EOF;

// Rule Loadfile
ruleLoadfile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Load('
			{
				newLeafNode(otherlv_0, grammarAccess.getLoadfileAccess().getLoadKeyword_0_0());
			}
			(
				(
					lv_path_1_0=RULE_STRING
					{
						newLeafNode(lv_path_1_0, grammarAccess.getLoadfileAccess().getPathSTRINGTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLoadfileRule());
						}
						setWithLastConsumed(
							$current,
							"path",
							lv_path_1_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getLoadfileAccess().getRightParenthesisKeyword_0_2());
			}
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getLoadfileAccess().getLeftCurlyBracketKeyword_0_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLoadfileAccess().getCommandsCommandParserRuleCall_0_4_0());
					}
					lv_commands_4_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLoadfileRule());
						}
						add(
							$current,
							"commands",
							lv_commands_4_0,
							"org.xtext.example.jppjson.MyDsl.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_5='}'
			{
				newLeafNode(otherlv_5, grammarAccess.getLoadfileAccess().getRightCurlyBracketKeyword_0_5());
			}
		)
		    |
		(
			otherlv_6='Write()'
			{
				newLeafNode(otherlv_6, grammarAccess.getLoadfileAccess().getWriteKeyword_1_0());
			}
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getLoadfileAccess().getLeftCurlyBracketKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLoadfileAccess().getCommandsCommandParserRuleCall_1_2_0());
					}
					lv_commands_8_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLoadfileRule());
						}
						add(
							$current,
							"commands",
							lv_commands_8_0,
							"org.xtext.example.jppjson.MyDsl.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getLoadfileAccess().getRightCurlyBracketKeyword_1_3());
			}
		)
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getCommandAccess().getReadParserRuleCall_0_0());
			}
			this_Read_0=ruleRead
			{
				$current = $this_Read_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getCommandAccess().getToStringParserRuleCall_0_1());
			}
			this_ToString_1=ruleToString
			{
				$current = $this_ToString_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getCommandAccess().getToJSONParserRuleCall_0_2());
			}
			this_ToJSON_2=ruleToJSON
			{
				$current = $this_ToJSON_2.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getCommandAccess().getToCSVParserRuleCall_0_3());
			}
			this_ToCSV_3=ruleToCSV
			{
				$current = $this_ToCSV_3.current;
				afterParserOrEnumRuleCall();
			}
		)
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getSemicolonKeyword_1());
		}
	)
;

// Entry rule entryRuleRead
entryRuleRead returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReadRule()); }
	iv_ruleRead=ruleRead
	{ $current=$iv_ruleRead.current; }
	EOF;

// Rule Read
ruleRead returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Read('
		{
			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
		}
		(
			(
				lv_path_1_0=RULE_STRING
				{
					newLeafNode(lv_path_1_0, grammarAccess.getReadAccess().getPathSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReadRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getReadAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleToString
entryRuleToString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getToStringRule()); }
	iv_ruleToString=ruleToString
	{ $current=$iv_ruleToString.current; }
	EOF;

// Rule ToString
ruleToString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ExportString('
		{
			newLeafNode(otherlv_0, grammarAccess.getToStringAccess().getExportStringKeyword_0());
		}
		(
			(
				lv_path_1_0=RULE_STRING
				{
					newLeafNode(lv_path_1_0, grammarAccess.getToStringAccess().getPathSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getToStringRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getToStringAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleToJSON
entryRuleToJSON returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getToJSONRule()); }
	iv_ruleToJSON=ruleToJSON
	{ $current=$iv_ruleToJSON.current; }
	EOF;

// Rule ToJSON
ruleToJSON returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ExportJson('
		{
			newLeafNode(otherlv_0, grammarAccess.getToJSONAccess().getExportJsonKeyword_0());
		}
		(
			(
				lv_path_1_0=RULE_STRING
				{
					newLeafNode(lv_path_1_0, grammarAccess.getToJSONAccess().getPathSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getToJSONRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getToJSONAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleToCSV
entryRuleToCSV returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getToCSVRule()); }
	iv_ruleToCSV=ruleToCSV
	{ $current=$iv_ruleToCSV.current; }
	EOF;

// Rule ToCSV
ruleToCSV returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ExportCSV('
		{
			newLeafNode(otherlv_0, grammarAccess.getToCSVAccess().getExportCSVKeyword_0());
		}
		(
			(
				lv_path_1_0=RULE_STRING
				{
					newLeafNode(lv_path_1_0, grammarAccess.getToCSVAccess().getPathSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getToCSVRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getToCSVAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getBinExpParserRuleCall_0());
		}
		this_BinExp_0=ruleBinExp
		{
			$current = $this_BinExp_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getValueParserRuleCall_1());
		}
		this_Value_1=ruleValue
		{
			$current = $this_Value_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getEntityParserRuleCall_2());
		}
		this_Entity_2=ruleEntity
		{
			$current = $this_Entity_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEntityAccess().getJObjectParserRuleCall_0());
		}
		this_JObject_0=ruleJObject
		{
			$current = $this_JObject_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntityAccess().getJArrayParserRuleCall_1());
		}
		this_JArray_1=ruleJArray
		{
			$current = $this_JArray_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_key_0_0=RULE_STRING
				{
					newLeafNode(lv_key_0_0, grammarAccess.getElementAccess().getKeySTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getElementRule());
					}
					setWithLastConsumed(
						$current,
						"key",
						lv_key_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getElementAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getValueExpressionParserRuleCall_2_0());
				}
				lv_value_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.xtext.example.jppjson.MyDsl.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getValueAccess().getJsonStringParserRuleCall_0());
		}
		this_JsonString_0=ruleJsonString
		{
			$current = $this_JsonString_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getJsonBooleanParserRuleCall_1());
		}
		this_JsonBoolean_1=ruleJsonBoolean
		{
			$current = $this_JsonBoolean_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getJsonEmptyParserRuleCall_2());
		}
		this_JsonEmpty_2=ruleJsonEmpty
		{
			$current = $this_JsonEmpty_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getJsonIntegerParserRuleCall_3());
		}
		this_JsonInteger_3=ruleJsonInteger
		{
			$current = $this_JsonInteger_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleJsonString
entryRuleJsonString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonStringRule()); }
	iv_ruleJsonString=ruleJsonString
	{ $current=$iv_ruleJsonString.current; }
	EOF;

// Rule JsonString
ruleJsonString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0=RULE_STRING
			{
				newLeafNode(lv_val_0_0, grammarAccess.getJsonStringAccess().getValSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getJsonStringRule());
				}
				setWithLastConsumed(
					$current,
					"val",
					lv_val_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleJsonBoolean
entryRuleJsonBoolean returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonBooleanRule()); }
	iv_ruleJsonBoolean=ruleJsonBoolean
	{ $current=$iv_ruleJsonBoolean.current; }
	EOF;

// Rule JsonBoolean
ruleJsonBoolean returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_val_0_1='true'
				{
					newLeafNode(lv_val_0_1, grammarAccess.getJsonBooleanAccess().getValTrueKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJsonBooleanRule());
					}
					setWithLastConsumed($current, "val", lv_val_0_1, null);
				}
				    |
				lv_val_0_2='false'
				{
					newLeafNode(lv_val_0_2, grammarAccess.getJsonBooleanAccess().getValFalseKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJsonBooleanRule());
					}
					setWithLastConsumed($current, "val", lv_val_0_2, null);
				}
			)
		)
	)
;

// Entry rule entryRuleJsonEmpty
entryRuleJsonEmpty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonEmptyRule()); }
	iv_ruleJsonEmpty=ruleJsonEmpty
	{ $current=$iv_ruleJsonEmpty.current; }
	EOF;

// Rule JsonEmpty
ruleJsonEmpty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0='null'
			{
				newLeafNode(lv_val_0_0, grammarAccess.getJsonEmptyAccess().getValNullKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getJsonEmptyRule());
				}
				setWithLastConsumed($current, "val", lv_val_0_0, "null");
			}
		)
	)
;

// Entry rule entryRuleJsonInteger
entryRuleJsonInteger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonIntegerRule()); }
	iv_ruleJsonInteger=ruleJsonInteger
	{ $current=$iv_ruleJsonInteger.current; }
	EOF;

// Rule JsonInteger
ruleJsonInteger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0=RULE_INT
			{
				newLeafNode(lv_val_0_0, grammarAccess.getJsonIntegerAccess().getValINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getJsonIntegerRule());
				}
				setWithLastConsumed(
					$current,
					"val",
					lv_val_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleJObject
entryRuleJObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJObjectRule()); }
	iv_ruleJObject=ruleJObject
	{ $current=$iv_ruleJObject.current; }
	EOF;

// Rule JObject
ruleJObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_0_0());
					}
					lv_element_1_0=ruleElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJObjectRule());
						}
						add(
							$current,
							"element",
							lv_element_1_0,
							"org.xtext.example.jppjson.MyDsl.Element");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getJObjectAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_1_1_0());
						}
						lv_element_3_0=ruleElement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getJObjectRule());
							}
							add(
								$current,
								"element",
								lv_element_3_0,
								"org.xtext.example.jppjson.MyDsl.Element");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getJObjectAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleJArray
entryRuleJArray returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJArrayRule()); }
	iv_ruleJArray=ruleJArray
	{ $current=$iv_ruleJArray.current; }
	EOF;

// Rule JArray
ruleJArray returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getJArrayAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_0_0());
					}
					lv_expression_1_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJArrayRule());
						}
						add(
							$current,
							"expression",
							lv_expression_1_0,
							"org.xtext.example.jppjson.MyDsl.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getJArrayAccess().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_1_1_0());
						}
						lv_expression_3_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getJArrayRule());
							}
							add(
								$current,
								"expression",
								lv_expression_3_0,
								"org.xtext.example.jppjson.MyDsl.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getJArrayAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleBinExp
entryRuleBinExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBinExpRule()); }
	iv_ruleBinExp=ruleBinExp
	{ $current=$iv_ruleBinExp.current; }
	EOF;

// Rule BinExp
ruleBinExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_val_0_0=RULE_STRING
				{
					newLeafNode(lv_val_0_0, grammarAccess.getBinExpAccess().getValSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBinExpRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_1='+'
		{
			newLeafNode(otherlv_1, grammarAccess.getBinExpAccess().getPlusSignKeyword_1());
		}
		(
			(
				lv_rval_2_0=RULE_STRING
				{
					newLeafNode(lv_rval_2_0, grammarAccess.getBinExpAccess().getRvalSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBinExpRule());
					}
					setWithLastConsumed(
						$current,
						"rval",
						lv_rval_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
