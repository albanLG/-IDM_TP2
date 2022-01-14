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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'true'", "'false'", "'null'", "'{'", "','", "'}'", "'['", "']'", "'+'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Expression";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:64:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:65:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:71:1: ruleExpression returns [EObject current=null] : (this_BinExp_0= ruleBinExp | this_Value_1= ruleValue | this_Entity_2= ruleEntity ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinExp_0 = null;

        EObject this_Value_1 = null;

        EObject this_Entity_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (this_BinExp_0= ruleBinExp | this_Value_1= ruleValue | this_Entity_2= ruleEntity ) )
            // InternalMyDsl.g:78:2: (this_BinExp_0= ruleBinExp | this_Value_1= ruleValue | this_Entity_2= ruleEntity )
            {
            // InternalMyDsl.g:78:2: (this_BinExp_0= ruleBinExp | this_Value_1= ruleValue | this_Entity_2= ruleEntity )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==20) ) {
                    alt1=1;
                }
                else if ( (LA1_1==EOF||LA1_1==16||LA1_1==19) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 12:
            case 13:
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
            case 18:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:79:3: this_BinExp_0= ruleBinExp
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBinExpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinExp_0=ruleBinExp();

                    state._fsp--;


                    			current = this_BinExp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:88:3: this_Value_1= ruleValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Value_1=ruleValue();

                    state._fsp--;


                    			current = this_Value_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:97:3: this_Entity_2= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getEntityParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_2=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:109:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:109:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:110:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:116:1: ruleEntity returns [EObject current=null] : (this_JObject_0= ruleJObject | this_JArray_1= ruleJArray ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_JObject_0 = null;

        EObject this_JArray_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:122:2: ( (this_JObject_0= ruleJObject | this_JArray_1= ruleJArray ) )
            // InternalMyDsl.g:123:2: (this_JObject_0= ruleJObject | this_JArray_1= ruleJArray )
            {
            // InternalMyDsl.g:123:2: (this_JObject_0= ruleJObject | this_JArray_1= ruleJArray )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:124:3: this_JObject_0= ruleJObject
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getJObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JObject_0=ruleJObject();

                    state._fsp--;


                    			current = this_JObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:133:3: this_JArray_1= ruleJArray
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getJArrayParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JArray_1=ruleJArray();

                    state._fsp--;


                    			current = this_JArray_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:145:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:145:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:146:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:152:1: ruleElement returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:158:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalMyDsl.g:159:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalMyDsl.g:159:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalMyDsl.g:160:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalMyDsl.g:160:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalMyDsl.g:161:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:161:4: (lv_key_0_0= RULE_STRING )
            // InternalMyDsl.g:162:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_key_0_0, grammarAccess.getElementAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getElementAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:182:3: ( (lv_value_2_0= ruleValue ) )
            // InternalMyDsl.g:183:4: (lv_value_2_0= ruleValue )
            {
            // InternalMyDsl.g:183:4: (lv_value_2_0= ruleValue )
            // InternalMyDsl.g:184:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getElementAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.jppjson.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:205:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMyDsl.g:205:46: (iv_ruleValue= ruleValue EOF )
            // InternalMyDsl.g:206:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:212:1: ruleValue returns [EObject current=null] : (this_JsonString_0= ruleJsonString | this_JsonBoolean_1= ruleJsonBoolean | this_JsonEmpty_2= ruleJsonEmpty | this_JsonInteger_3= ruleJsonInteger ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_JsonString_0 = null;

        EObject this_JsonBoolean_1 = null;

        EObject this_JsonEmpty_2 = null;

        EObject this_JsonInteger_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:218:2: ( (this_JsonString_0= ruleJsonString | this_JsonBoolean_1= ruleJsonBoolean | this_JsonEmpty_2= ruleJsonEmpty | this_JsonInteger_3= ruleJsonInteger ) )
            // InternalMyDsl.g:219:2: (this_JsonString_0= ruleJsonString | this_JsonBoolean_1= ruleJsonBoolean | this_JsonEmpty_2= ruleJsonEmpty | this_JsonInteger_3= ruleJsonInteger )
            {
            // InternalMyDsl.g:219:2: (this_JsonString_0= ruleJsonString | this_JsonBoolean_1= ruleJsonBoolean | this_JsonEmpty_2= ruleJsonEmpty | this_JsonInteger_3= ruleJsonInteger )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case 12:
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case RULE_INT:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:220:3: this_JsonString_0= ruleJsonString
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getJsonStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonString_0=ruleJsonString();

                    state._fsp--;


                    			current = this_JsonString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:229:3: this_JsonBoolean_1= ruleJsonBoolean
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getJsonBooleanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonBoolean_1=ruleJsonBoolean();

                    state._fsp--;


                    			current = this_JsonBoolean_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:238:3: this_JsonEmpty_2= ruleJsonEmpty
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getJsonEmptyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonEmpty_2=ruleJsonEmpty();

                    state._fsp--;


                    			current = this_JsonEmpty_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:247:3: this_JsonInteger_3= ruleJsonInteger
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getJsonIntegerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonInteger_3=ruleJsonInteger();

                    state._fsp--;


                    			current = this_JsonInteger_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleJsonString"
    // InternalMyDsl.g:259:1: entryRuleJsonString returns [EObject current=null] : iv_ruleJsonString= ruleJsonString EOF ;
    public final EObject entryRuleJsonString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonString = null;


        try {
            // InternalMyDsl.g:259:51: (iv_ruleJsonString= ruleJsonString EOF )
            // InternalMyDsl.g:260:2: iv_ruleJsonString= ruleJsonString EOF
            {
             newCompositeNode(grammarAccess.getJsonStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonString=ruleJsonString();

            state._fsp--;

             current =iv_ruleJsonString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonString"


    // $ANTLR start "ruleJsonString"
    // InternalMyDsl.g:266:1: ruleJsonString returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleJsonString() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:272:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:273:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:273:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalMyDsl.g:274:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:274:3: (lv_val_0_0= RULE_STRING )
            // InternalMyDsl.g:275:4: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getJsonStringAccess().getValSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJsonStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonString"


    // $ANTLR start "entryRuleJsonBoolean"
    // InternalMyDsl.g:294:1: entryRuleJsonBoolean returns [EObject current=null] : iv_ruleJsonBoolean= ruleJsonBoolean EOF ;
    public final EObject entryRuleJsonBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonBoolean = null;


        try {
            // InternalMyDsl.g:294:52: (iv_ruleJsonBoolean= ruleJsonBoolean EOF )
            // InternalMyDsl.g:295:2: iv_ruleJsonBoolean= ruleJsonBoolean EOF
            {
             newCompositeNode(grammarAccess.getJsonBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonBoolean=ruleJsonBoolean();

            state._fsp--;

             current =iv_ruleJsonBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonBoolean"


    // $ANTLR start "ruleJsonBoolean"
    // InternalMyDsl.g:301:1: ruleJsonBoolean returns [EObject current=null] : ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) ;
    public final EObject ruleJsonBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:307:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) )
            // InternalMyDsl.g:308:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            {
            // InternalMyDsl.g:308:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            // InternalMyDsl.g:309:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            {
            // InternalMyDsl.g:309:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            // InternalMyDsl.g:310:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            {
            // InternalMyDsl.g:310:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:311:5: lv_val_0_1= 'true'
                    {
                    lv_val_0_1=(Token)match(input,12,FOLLOW_2); 

                    					newLeafNode(lv_val_0_1, grammarAccess.getJsonBooleanAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJsonBooleanRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:322:5: lv_val_0_2= 'false'
                    {
                    lv_val_0_2=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(lv_val_0_2, grammarAccess.getJsonBooleanAccess().getValFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJsonBooleanRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonBoolean"


    // $ANTLR start "entryRuleJsonEmpty"
    // InternalMyDsl.g:338:1: entryRuleJsonEmpty returns [EObject current=null] : iv_ruleJsonEmpty= ruleJsonEmpty EOF ;
    public final EObject entryRuleJsonEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonEmpty = null;


        try {
            // InternalMyDsl.g:338:50: (iv_ruleJsonEmpty= ruleJsonEmpty EOF )
            // InternalMyDsl.g:339:2: iv_ruleJsonEmpty= ruleJsonEmpty EOF
            {
             newCompositeNode(grammarAccess.getJsonEmptyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonEmpty=ruleJsonEmpty();

            state._fsp--;

             current =iv_ruleJsonEmpty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonEmpty"


    // $ANTLR start "ruleJsonEmpty"
    // InternalMyDsl.g:345:1: ruleJsonEmpty returns [EObject current=null] : ( (lv_val_0_0= 'null' ) ) ;
    public final EObject ruleJsonEmpty() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:351:2: ( ( (lv_val_0_0= 'null' ) ) )
            // InternalMyDsl.g:352:2: ( (lv_val_0_0= 'null' ) )
            {
            // InternalMyDsl.g:352:2: ( (lv_val_0_0= 'null' ) )
            // InternalMyDsl.g:353:3: (lv_val_0_0= 'null' )
            {
            // InternalMyDsl.g:353:3: (lv_val_0_0= 'null' )
            // InternalMyDsl.g:354:4: lv_val_0_0= 'null'
            {
            lv_val_0_0=(Token)match(input,14,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getJsonEmptyAccess().getValNullKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJsonEmptyRule());
            				}
            				setWithLastConsumed(current, "val", lv_val_0_0, "null");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonEmpty"


    // $ANTLR start "entryRuleJsonInteger"
    // InternalMyDsl.g:369:1: entryRuleJsonInteger returns [EObject current=null] : iv_ruleJsonInteger= ruleJsonInteger EOF ;
    public final EObject entryRuleJsonInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonInteger = null;


        try {
            // InternalMyDsl.g:369:52: (iv_ruleJsonInteger= ruleJsonInteger EOF )
            // InternalMyDsl.g:370:2: iv_ruleJsonInteger= ruleJsonInteger EOF
            {
             newCompositeNode(grammarAccess.getJsonIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonInteger=ruleJsonInteger();

            state._fsp--;

             current =iv_ruleJsonInteger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonInteger"


    // $ANTLR start "ruleJsonInteger"
    // InternalMyDsl.g:376:1: ruleJsonInteger returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleJsonInteger() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:382:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:383:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:383:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalMyDsl.g:384:3: (lv_val_0_0= RULE_INT )
            {
            // InternalMyDsl.g:384:3: (lv_val_0_0= RULE_INT )
            // InternalMyDsl.g:385:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getJsonIntegerAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJsonIntegerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonInteger"


    // $ANTLR start "entryRuleJObject"
    // InternalMyDsl.g:404:1: entryRuleJObject returns [EObject current=null] : iv_ruleJObject= ruleJObject EOF ;
    public final EObject entryRuleJObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJObject = null;


        try {
            // InternalMyDsl.g:404:48: (iv_ruleJObject= ruleJObject EOF )
            // InternalMyDsl.g:405:2: iv_ruleJObject= ruleJObject EOF
            {
             newCompositeNode(grammarAccess.getJObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJObject=ruleJObject();

            state._fsp--;

             current =iv_ruleJObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJObject"


    // $ANTLR start "ruleJObject"
    // InternalMyDsl.g:411:1: ruleJObject returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleJObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_element_1_0 = null;

        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:417:2: ( (otherlv_0= '{' ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )? otherlv_4= '}' ) )
            // InternalMyDsl.g:418:2: (otherlv_0= '{' ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )? otherlv_4= '}' )
            {
            // InternalMyDsl.g:418:2: (otherlv_0= '{' ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )? otherlv_4= '}' )
            // InternalMyDsl.g:419:3: otherlv_0= '{' ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:423:3: ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:424:4: ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )*
                    {
                    // InternalMyDsl.g:424:4: ( (lv_element_1_0= ruleElement ) )
                    // InternalMyDsl.g:425:5: (lv_element_1_0= ruleElement )
                    {
                    // InternalMyDsl.g:425:5: (lv_element_1_0= ruleElement )
                    // InternalMyDsl.g:426:6: lv_element_1_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_element_1_0=ruleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJObjectRule());
                    						}
                    						add(
                    							current,
                    							"element",
                    							lv_element_1_0,
                    							"org.xtext.example.jppjson.MyDsl.Element");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:443:4: (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:444:5: otherlv_2= ',' ( (lv_element_3_0= ruleElement ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getJObjectAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMyDsl.g:448:5: ( (lv_element_3_0= ruleElement ) )
                    	    // InternalMyDsl.g:449:6: (lv_element_3_0= ruleElement )
                    	    {
                    	    // InternalMyDsl.g:449:6: (lv_element_3_0= ruleElement )
                    	    // InternalMyDsl.g:450:7: lv_element_3_0= ruleElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_element_3_0=ruleElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"element",
                    	    								lv_element_3_0,
                    	    								"org.xtext.example.jppjson.MyDsl.Element");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJObjectAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJObject"


    // $ANTLR start "entryRuleJArray"
    // InternalMyDsl.g:477:1: entryRuleJArray returns [EObject current=null] : iv_ruleJArray= ruleJArray EOF ;
    public final EObject entryRuleJArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJArray = null;


        try {
            // InternalMyDsl.g:477:47: (iv_ruleJArray= ruleJArray EOF )
            // InternalMyDsl.g:478:2: iv_ruleJArray= ruleJArray EOF
            {
             newCompositeNode(grammarAccess.getJArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJArray=ruleJArray();

            state._fsp--;

             current =iv_ruleJArray; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJArray"


    // $ANTLR start "ruleJArray"
    // InternalMyDsl.g:484:1: ruleJArray returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? otherlv_4= ']' ) ;
    public final EObject ruleJArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:490:2: ( (otherlv_0= '[' ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? otherlv_4= ']' ) )
            // InternalMyDsl.g:491:2: (otherlv_0= '[' ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? otherlv_4= ']' )
            {
            // InternalMyDsl.g:491:2: (otherlv_0= '[' ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? otherlv_4= ']' )
            // InternalMyDsl.g:492:3: otherlv_0= '[' ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getJArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMyDsl.g:496:3: ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_INT)||(LA8_0>=12 && LA8_0<=15)||LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:497:4: ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )*
                    {
                    // InternalMyDsl.g:497:4: ( (lv_expression_1_0= ruleExpression ) )
                    // InternalMyDsl.g:498:5: (lv_expression_1_0= ruleExpression )
                    {
                    // InternalMyDsl.g:498:5: (lv_expression_1_0= ruleExpression )
                    // InternalMyDsl.g:499:6: lv_expression_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJArrayRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_1_0,
                    							"org.xtext.example.jppjson.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:516:4: (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:517:5: otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_10); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getJArrayAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMyDsl.g:521:5: ( (lv_expression_3_0= ruleExpression ) )
                    	    // InternalMyDsl.g:522:6: (lv_expression_3_0= ruleExpression )
                    	    {
                    	    // InternalMyDsl.g:522:6: (lv_expression_3_0= ruleExpression )
                    	    // InternalMyDsl.g:523:7: lv_expression_3_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_expression_3_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expression",
                    	    								lv_expression_3_0,
                    	    								"org.xtext.example.jppjson.MyDsl.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJArrayAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJArray"


    // $ANTLR start "entryRuleBinExp"
    // InternalMyDsl.g:550:1: entryRuleBinExp returns [EObject current=null] : iv_ruleBinExp= ruleBinExp EOF ;
    public final EObject entryRuleBinExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinExp = null;


        try {
            // InternalMyDsl.g:550:47: (iv_ruleBinExp= ruleBinExp EOF )
            // InternalMyDsl.g:551:2: iv_ruleBinExp= ruleBinExp EOF
            {
             newCompositeNode(grammarAccess.getBinExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinExp=ruleBinExp();

            state._fsp--;

             current =iv_ruleBinExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinExp"


    // $ANTLR start "ruleBinExp"
    // InternalMyDsl.g:557:1: ruleBinExp returns [EObject current=null] : ( ( (lv_val_0_0= RULE_STRING ) ) otherlv_1= '+' ( (lv_rval_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleBinExp() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token otherlv_1=null;
        Token lv_rval_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:563:2: ( ( ( (lv_val_0_0= RULE_STRING ) ) otherlv_1= '+' ( (lv_rval_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:564:2: ( ( (lv_val_0_0= RULE_STRING ) ) otherlv_1= '+' ( (lv_rval_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:564:2: ( ( (lv_val_0_0= RULE_STRING ) ) otherlv_1= '+' ( (lv_rval_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:565:3: ( (lv_val_0_0= RULE_STRING ) ) otherlv_1= '+' ( (lv_rval_2_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:565:3: ( (lv_val_0_0= RULE_STRING ) )
            // InternalMyDsl.g:566:4: (lv_val_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:566:4: (lv_val_0_0= RULE_STRING )
            // InternalMyDsl.g:567:5: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_val_0_0, grammarAccess.getBinExpAccess().getValSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBinExpAccess().getPlusSignKeyword_1());
            		
            // InternalMyDsl.g:587:3: ( (lv_rval_2_0= RULE_STRING ) )
            // InternalMyDsl.g:588:4: (lv_rval_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:588:4: (lv_rval_2_0= RULE_STRING )
            // InternalMyDsl.g:589:5: lv_rval_2_0= RULE_STRING
            {
            lv_rval_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_rval_2_0, grammarAccess.getBinExpAccess().getRvalSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rval",
            						lv_rval_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinExp"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000CF030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000004F030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});

}