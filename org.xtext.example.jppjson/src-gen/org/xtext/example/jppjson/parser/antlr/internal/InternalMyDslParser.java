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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Load('", "')'", "'{'", "'}'", "';'", "'AddElement('", "'RemoveElement('", "'EditElement('", "','", "'ExportString('", "'ExportCSV('", "':'", "'true'", "'false'", "'null'", "'['", "']'", "'+'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
        	return "Programme";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgramme"
    // InternalMyDsl.g:64:1: entryRuleProgramme returns [EObject current=null] : iv_ruleProgramme= ruleProgramme EOF ;
    public final EObject entryRuleProgramme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramme = null;


        try {
            // InternalMyDsl.g:64:50: (iv_ruleProgramme= ruleProgramme EOF )
            // InternalMyDsl.g:65:2: iv_ruleProgramme= ruleProgramme EOF
            {
             newCompositeNode(grammarAccess.getProgrammeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramme=ruleProgramme();

            state._fsp--;

             current =iv_ruleProgramme; 
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
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalMyDsl.g:71:1: ruleProgramme returns [EObject current=null] : ( (lv_loadfiles_0_0= ruleLoadfile ) )* ;
    public final EObject ruleProgramme() throws RecognitionException {
        EObject current = null;

        EObject lv_loadfiles_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_loadfiles_0_0= ruleLoadfile ) )* )
            // InternalMyDsl.g:78:2: ( (lv_loadfiles_0_0= ruleLoadfile ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_loadfiles_0_0= ruleLoadfile ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_loadfiles_0_0= ruleLoadfile )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_loadfiles_0_0= ruleLoadfile )
            	    // InternalMyDsl.g:80:4: lv_loadfiles_0_0= ruleLoadfile
            	    {

            	    				newCompositeNode(grammarAccess.getProgrammeAccess().getLoadfilesLoadfileParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_loadfiles_0_0=ruleLoadfile();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgrammeRule());
            	    				}
            	    				add(
            	    					current,
            	    					"loadfiles",
            	    					lv_loadfiles_0_0,
            	    					"org.xtext.example.jppjson.MyDsl.Loadfile");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleLoadfile"
    // InternalMyDsl.g:100:1: entryRuleLoadfile returns [EObject current=null] : iv_ruleLoadfile= ruleLoadfile EOF ;
    public final EObject entryRuleLoadfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadfile = null;


        try {
            // InternalMyDsl.g:100:49: (iv_ruleLoadfile= ruleLoadfile EOF )
            // InternalMyDsl.g:101:2: iv_ruleLoadfile= ruleLoadfile EOF
            {
             newCompositeNode(grammarAccess.getLoadfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadfile=ruleLoadfile();

            state._fsp--;

             current =iv_ruleLoadfile; 
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
    // $ANTLR end "entryRuleLoadfile"


    // $ANTLR start "ruleLoadfile"
    // InternalMyDsl.g:107:1: ruleLoadfile returns [EObject current=null] : (otherlv_0= 'Load(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}' ) ;
    public final EObject ruleLoadfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_commands_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'Load(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'Load(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'Load(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}' )
            // InternalMyDsl.g:115:3: otherlv_0= 'Load(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= '{' ( (lv_commands_4_0= ruleCommand ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadfileAccess().getLoadKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalMyDsl.g:120:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:120:4: (lv_path_1_0= RULE_STRING )
            // InternalMyDsl.g:121:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_path_1_0, grammarAccess.getLoadfileAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadfileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadfileAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadfileAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:145:3: ( (lv_commands_4_0= ruleCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=18)||(LA2_0>=20 && LA2_0<=21)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:146:4: (lv_commands_4_0= ruleCommand )
            	    {
            	    // InternalMyDsl.g:146:4: (lv_commands_4_0= ruleCommand )
            	    // InternalMyDsl.g:147:5: lv_commands_4_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getLoadfileAccess().getCommandsCommandParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_commands_4_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoadfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_4_0,
            	    						"org.xtext.example.jppjson.MyDsl.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLoadfileAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLoadfile"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:172:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDsl.g:172:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDsl.g:173:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:179:1: ruleCommand returns [EObject current=null] : ( (this_EditElement_0= ruleEditElement | this_AddElement_1= ruleAddElement | this_RemoveElement_2= ruleRemoveElement | this_ToString_3= ruleToString | this_ToCSV_4= ruleToCSV ) otherlv_5= ';' ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_EditElement_0 = null;

        EObject this_AddElement_1 = null;

        EObject this_RemoveElement_2 = null;

        EObject this_ToString_3 = null;

        EObject this_ToCSV_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:185:2: ( ( (this_EditElement_0= ruleEditElement | this_AddElement_1= ruleAddElement | this_RemoveElement_2= ruleRemoveElement | this_ToString_3= ruleToString | this_ToCSV_4= ruleToCSV ) otherlv_5= ';' ) )
            // InternalMyDsl.g:186:2: ( (this_EditElement_0= ruleEditElement | this_AddElement_1= ruleAddElement | this_RemoveElement_2= ruleRemoveElement | this_ToString_3= ruleToString | this_ToCSV_4= ruleToCSV ) otherlv_5= ';' )
            {
            // InternalMyDsl.g:186:2: ( (this_EditElement_0= ruleEditElement | this_AddElement_1= ruleAddElement | this_RemoveElement_2= ruleRemoveElement | this_ToString_3= ruleToString | this_ToCSV_4= ruleToCSV ) otherlv_5= ';' )
            // InternalMyDsl.g:187:3: (this_EditElement_0= ruleEditElement | this_AddElement_1= ruleAddElement | this_RemoveElement_2= ruleRemoveElement | this_ToString_3= ruleToString | this_ToCSV_4= ruleToCSV ) otherlv_5= ';'
            {
            // InternalMyDsl.g:187:3: (this_EditElement_0= ruleEditElement | this_AddElement_1= ruleAddElement | this_RemoveElement_2= ruleRemoveElement | this_ToString_3= ruleToString | this_ToCSV_4= ruleToCSV )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:188:4: this_EditElement_0= ruleEditElement
                    {

                    				newCompositeNode(grammarAccess.getCommandAccess().getEditElementParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_8);
                    this_EditElement_0=ruleEditElement();

                    state._fsp--;


                    				current = this_EditElement_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:197:4: this_AddElement_1= ruleAddElement
                    {

                    				newCompositeNode(grammarAccess.getCommandAccess().getAddElementParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_AddElement_1=ruleAddElement();

                    state._fsp--;


                    				current = this_AddElement_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:206:4: this_RemoveElement_2= ruleRemoveElement
                    {

                    				newCompositeNode(grammarAccess.getCommandAccess().getRemoveElementParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_RemoveElement_2=ruleRemoveElement();

                    state._fsp--;


                    				current = this_RemoveElement_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:215:4: this_ToString_3= ruleToString
                    {

                    				newCompositeNode(grammarAccess.getCommandAccess().getToStringParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_8);
                    this_ToString_3=ruleToString();

                    state._fsp--;


                    				current = this_ToString_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:224:4: this_ToCSV_4= ruleToCSV
                    {

                    				newCompositeNode(grammarAccess.getCommandAccess().getToCSVParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_8);
                    this_ToCSV_4=ruleToCSV();

                    state._fsp--;


                    				current = this_ToCSV_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleAddElement"
    // InternalMyDsl.g:241:1: entryRuleAddElement returns [EObject current=null] : iv_ruleAddElement= ruleAddElement EOF ;
    public final EObject entryRuleAddElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddElement = null;


        try {
            // InternalMyDsl.g:241:51: (iv_ruleAddElement= ruleAddElement EOF )
            // InternalMyDsl.g:242:2: iv_ruleAddElement= ruleAddElement EOF
            {
             newCompositeNode(grammarAccess.getAddElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddElement=ruleAddElement();

            state._fsp--;

             current =iv_ruleAddElement; 
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
    // $ANTLR end "entryRuleAddElement"


    // $ANTLR start "ruleAddElement"
    // InternalMyDsl.g:248:1: ruleAddElement returns [EObject current=null] : (otherlv_0= 'AddElement(' ( (lv_element_1_0= ruleElement ) ) otherlv_2= ')' ) ;
    public final EObject ruleAddElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( (otherlv_0= 'AddElement(' ( (lv_element_1_0= ruleElement ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:255:2: (otherlv_0= 'AddElement(' ( (lv_element_1_0= ruleElement ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:255:2: (otherlv_0= 'AddElement(' ( (lv_element_1_0= ruleElement ) ) otherlv_2= ')' )
            // InternalMyDsl.g:256:3: otherlv_0= 'AddElement(' ( (lv_element_1_0= ruleElement ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAddElementAccess().getAddElementKeyword_0());
            		
            // InternalMyDsl.g:260:3: ( (lv_element_1_0= ruleElement ) )
            // InternalMyDsl.g:261:4: (lv_element_1_0= ruleElement )
            {
            // InternalMyDsl.g:261:4: (lv_element_1_0= ruleElement )
            // InternalMyDsl.g:262:5: lv_element_1_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getAddElementAccess().getElementElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_element_1_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddElementRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
            						"org.xtext.example.jppjson.MyDsl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAddElementAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleAddElement"


    // $ANTLR start "entryRuleRemoveElement"
    // InternalMyDsl.g:287:1: entryRuleRemoveElement returns [EObject current=null] : iv_ruleRemoveElement= ruleRemoveElement EOF ;
    public final EObject entryRuleRemoveElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveElement = null;


        try {
            // InternalMyDsl.g:287:54: (iv_ruleRemoveElement= ruleRemoveElement EOF )
            // InternalMyDsl.g:288:2: iv_ruleRemoveElement= ruleRemoveElement EOF
            {
             newCompositeNode(grammarAccess.getRemoveElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveElement=ruleRemoveElement();

            state._fsp--;

             current =iv_ruleRemoveElement; 
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
    // $ANTLR end "entryRuleRemoveElement"


    // $ANTLR start "ruleRemoveElement"
    // InternalMyDsl.g:294:1: ruleRemoveElement returns [EObject current=null] : (otherlv_0= 'RemoveElement(' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleRemoveElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:300:2: ( (otherlv_0= 'RemoveElement(' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:301:2: (otherlv_0= 'RemoveElement(' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:301:2: (otherlv_0= 'RemoveElement(' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // InternalMyDsl.g:302:3: otherlv_0= 'RemoveElement(' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveElementAccess().getRemoveElementKeyword_0());
            		
            // InternalMyDsl.g:306:3: ( (lv_key_1_0= RULE_STRING ) )
            // InternalMyDsl.g:307:4: (lv_key_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:307:4: (lv_key_1_0= RULE_STRING )
            // InternalMyDsl.g:308:5: lv_key_1_0= RULE_STRING
            {
            lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_key_1_0, grammarAccess.getRemoveElementAccess().getKeySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveElementAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleRemoveElement"


    // $ANTLR start "entryRuleEditElement"
    // InternalMyDsl.g:332:1: entryRuleEditElement returns [EObject current=null] : iv_ruleEditElement= ruleEditElement EOF ;
    public final EObject entryRuleEditElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditElement = null;


        try {
            // InternalMyDsl.g:332:52: (iv_ruleEditElement= ruleEditElement EOF )
            // InternalMyDsl.g:333:2: iv_ruleEditElement= ruleEditElement EOF
            {
             newCompositeNode(grammarAccess.getEditElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEditElement=ruleEditElement();

            state._fsp--;

             current =iv_ruleEditElement; 
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
    // $ANTLR end "entryRuleEditElement"


    // $ANTLR start "ruleEditElement"
    // InternalMyDsl.g:339:1: ruleEditElement returns [EObject current=null] : (otherlv_0= 'EditElement(' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleEditElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:345:2: ( (otherlv_0= 'EditElement(' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:346:2: (otherlv_0= 'EditElement(' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:346:2: (otherlv_0= 'EditElement(' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalMyDsl.g:347:3: otherlv_0= 'EditElement(' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEditElementAccess().getEditElementKeyword_0());
            		
            // InternalMyDsl.g:351:3: ( (lv_key_1_0= RULE_STRING ) )
            // InternalMyDsl.g:352:4: (lv_key_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:352:4: (lv_key_1_0= RULE_STRING )
            // InternalMyDsl.g:353:5: lv_key_1_0= RULE_STRING
            {
            lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_key_1_0, grammarAccess.getEditElementAccess().getKeySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEditElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEditElementAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:373:3: ( (lv_value_3_0= ruleExpression ) )
            // InternalMyDsl.g:374:4: (lv_value_3_0= ruleExpression )
            {
            // InternalMyDsl.g:374:4: (lv_value_3_0= ruleExpression )
            // InternalMyDsl.g:375:5: lv_value_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEditElementAccess().getValueExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_value_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEditElementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.jppjson.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEditElementAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleEditElement"


    // $ANTLR start "entryRuleToString"
    // InternalMyDsl.g:400:1: entryRuleToString returns [EObject current=null] : iv_ruleToString= ruleToString EOF ;
    public final EObject entryRuleToString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToString = null;


        try {
            // InternalMyDsl.g:400:49: (iv_ruleToString= ruleToString EOF )
            // InternalMyDsl.g:401:2: iv_ruleToString= ruleToString EOF
            {
             newCompositeNode(grammarAccess.getToStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToString=ruleToString();

            state._fsp--;

             current =iv_ruleToString; 
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
    // $ANTLR end "entryRuleToString"


    // $ANTLR start "ruleToString"
    // InternalMyDsl.g:407:1: ruleToString returns [EObject current=null] : (otherlv_0= 'ExportString(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleToString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:413:2: ( (otherlv_0= 'ExportString(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:414:2: (otherlv_0= 'ExportString(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:414:2: (otherlv_0= 'ExportString(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // InternalMyDsl.g:415:3: otherlv_0= 'ExportString(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getToStringAccess().getExportStringKeyword_0());
            		
            // InternalMyDsl.g:419:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalMyDsl.g:420:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:420:4: (lv_path_1_0= RULE_STRING )
            // InternalMyDsl.g:421:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_path_1_0, grammarAccess.getToStringAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getToStringAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleToString"


    // $ANTLR start "entryRuleToCSV"
    // InternalMyDsl.g:445:1: entryRuleToCSV returns [EObject current=null] : iv_ruleToCSV= ruleToCSV EOF ;
    public final EObject entryRuleToCSV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToCSV = null;


        try {
            // InternalMyDsl.g:445:46: (iv_ruleToCSV= ruleToCSV EOF )
            // InternalMyDsl.g:446:2: iv_ruleToCSV= ruleToCSV EOF
            {
             newCompositeNode(grammarAccess.getToCSVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToCSV=ruleToCSV();

            state._fsp--;

             current =iv_ruleToCSV; 
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
    // $ANTLR end "entryRuleToCSV"


    // $ANTLR start "ruleToCSV"
    // InternalMyDsl.g:452:1: ruleToCSV returns [EObject current=null] : (otherlv_0= 'ExportCSV(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleToCSV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:458:2: ( (otherlv_0= 'ExportCSV(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:459:2: (otherlv_0= 'ExportCSV(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:459:2: (otherlv_0= 'ExportCSV(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // InternalMyDsl.g:460:3: otherlv_0= 'ExportCSV(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getToCSVAccess().getExportCSVKeyword_0());
            		
            // InternalMyDsl.g:464:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalMyDsl.g:465:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:465:4: (lv_path_1_0= RULE_STRING )
            // InternalMyDsl.g:466:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_path_1_0, grammarAccess.getToCSVAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToCSVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getToCSVAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleToCSV"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:490:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:490:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:491:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:497:1: ruleExpression returns [EObject current=null] : (this_BinExp_0= ruleBinExp | this_Value_1= ruleValue | this_Entity_2= ruleEntity ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinExp_0 = null;

        EObject this_Value_1 = null;

        EObject this_Entity_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:503:2: ( (this_BinExp_0= ruleBinExp | this_Value_1= ruleValue | this_Entity_2= ruleEntity ) )
            // InternalMyDsl.g:504:2: (this_BinExp_0= ruleBinExp | this_Value_1= ruleValue | this_Entity_2= ruleEntity )
            {
            // InternalMyDsl.g:504:2: (this_BinExp_0= ruleBinExp | this_Value_1= ruleValue | this_Entity_2= ruleEntity )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==28) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||LA4_1==12||LA4_1==14||LA4_1==19||LA4_1==27) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 23:
            case 24:
            case 25:
                {
                alt4=2;
                }
                break;
            case 13:
            case 26:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:505:3: this_BinExp_0= ruleBinExp
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
                    // InternalMyDsl.g:514:3: this_Value_1= ruleValue
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
                    // InternalMyDsl.g:523:3: this_Entity_2= ruleEntity
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
    // InternalMyDsl.g:535:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:535:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:536:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:542:1: ruleEntity returns [EObject current=null] : (this_JObject_0= ruleJObject | this_JArray_1= ruleJArray ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_JObject_0 = null;

        EObject this_JArray_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:548:2: ( (this_JObject_0= ruleJObject | this_JArray_1= ruleJArray ) )
            // InternalMyDsl.g:549:2: (this_JObject_0= ruleJObject | this_JArray_1= ruleJArray )
            {
            // InternalMyDsl.g:549:2: (this_JObject_0= ruleJObject | this_JArray_1= ruleJArray )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==26) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:550:3: this_JObject_0= ruleJObject
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
                    // InternalMyDsl.g:559:3: this_JArray_1= ruleJArray
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
    // InternalMyDsl.g:571:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:571:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:572:2: iv_ruleElement= ruleElement EOF
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
    // InternalMyDsl.g:578:1: ruleElement returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:584:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:585:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:585:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalMyDsl.g:586:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalMyDsl.g:586:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalMyDsl.g:587:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:587:4: (lv_key_0_0= RULE_STRING )
            // InternalMyDsl.g:588:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getElementAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:608:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalMyDsl.g:609:4: (lv_value_2_0= ruleExpression )
            {
            // InternalMyDsl.g:609:4: (lv_value_2_0= ruleExpression )
            // InternalMyDsl.g:610:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getElementAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.jppjson.MyDsl.Expression");
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
    // InternalMyDsl.g:631:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMyDsl.g:631:46: (iv_ruleValue= ruleValue EOF )
            // InternalMyDsl.g:632:2: iv_ruleValue= ruleValue EOF
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
    // InternalMyDsl.g:638:1: ruleValue returns [EObject current=null] : (this_JsonString_0= ruleJsonString | this_JsonBoolean_1= ruleJsonBoolean | this_JsonEmpty_2= ruleJsonEmpty | this_JsonInteger_3= ruleJsonInteger ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_JsonString_0 = null;

        EObject this_JsonBoolean_1 = null;

        EObject this_JsonEmpty_2 = null;

        EObject this_JsonInteger_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:644:2: ( (this_JsonString_0= ruleJsonString | this_JsonBoolean_1= ruleJsonBoolean | this_JsonEmpty_2= ruleJsonEmpty | this_JsonInteger_3= ruleJsonInteger ) )
            // InternalMyDsl.g:645:2: (this_JsonString_0= ruleJsonString | this_JsonBoolean_1= ruleJsonBoolean | this_JsonEmpty_2= ruleJsonEmpty | this_JsonInteger_3= ruleJsonInteger )
            {
            // InternalMyDsl.g:645:2: (this_JsonString_0= ruleJsonString | this_JsonBoolean_1= ruleJsonBoolean | this_JsonEmpty_2= ruleJsonEmpty | this_JsonInteger_3= ruleJsonInteger )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 23:
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case RULE_INT:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:646:3: this_JsonString_0= ruleJsonString
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
                    // InternalMyDsl.g:655:3: this_JsonBoolean_1= ruleJsonBoolean
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
                    // InternalMyDsl.g:664:3: this_JsonEmpty_2= ruleJsonEmpty
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
                    // InternalMyDsl.g:673:3: this_JsonInteger_3= ruleJsonInteger
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
    // InternalMyDsl.g:685:1: entryRuleJsonString returns [EObject current=null] : iv_ruleJsonString= ruleJsonString EOF ;
    public final EObject entryRuleJsonString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonString = null;


        try {
            // InternalMyDsl.g:685:51: (iv_ruleJsonString= ruleJsonString EOF )
            // InternalMyDsl.g:686:2: iv_ruleJsonString= ruleJsonString EOF
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
    // InternalMyDsl.g:692:1: ruleJsonString returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleJsonString() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:698:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:699:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:699:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalMyDsl.g:700:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:700:3: (lv_val_0_0= RULE_STRING )
            // InternalMyDsl.g:701:4: lv_val_0_0= RULE_STRING
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
    // InternalMyDsl.g:720:1: entryRuleJsonBoolean returns [EObject current=null] : iv_ruleJsonBoolean= ruleJsonBoolean EOF ;
    public final EObject entryRuleJsonBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonBoolean = null;


        try {
            // InternalMyDsl.g:720:52: (iv_ruleJsonBoolean= ruleJsonBoolean EOF )
            // InternalMyDsl.g:721:2: iv_ruleJsonBoolean= ruleJsonBoolean EOF
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
    // InternalMyDsl.g:727:1: ruleJsonBoolean returns [EObject current=null] : ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) ;
    public final EObject ruleJsonBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:733:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) )
            // InternalMyDsl.g:734:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            {
            // InternalMyDsl.g:734:2: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
            // InternalMyDsl.g:735:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            {
            // InternalMyDsl.g:735:3: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
            // InternalMyDsl.g:736:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            {
            // InternalMyDsl.g:736:4: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:737:5: lv_val_0_1= 'true'
                    {
                    lv_val_0_1=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_val_0_1, grammarAccess.getJsonBooleanAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJsonBooleanRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:748:5: lv_val_0_2= 'false'
                    {
                    lv_val_0_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMyDsl.g:764:1: entryRuleJsonEmpty returns [EObject current=null] : iv_ruleJsonEmpty= ruleJsonEmpty EOF ;
    public final EObject entryRuleJsonEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonEmpty = null;


        try {
            // InternalMyDsl.g:764:50: (iv_ruleJsonEmpty= ruleJsonEmpty EOF )
            // InternalMyDsl.g:765:2: iv_ruleJsonEmpty= ruleJsonEmpty EOF
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
    // InternalMyDsl.g:771:1: ruleJsonEmpty returns [EObject current=null] : ( (lv_val_0_0= 'null' ) ) ;
    public final EObject ruleJsonEmpty() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:777:2: ( ( (lv_val_0_0= 'null' ) ) )
            // InternalMyDsl.g:778:2: ( (lv_val_0_0= 'null' ) )
            {
            // InternalMyDsl.g:778:2: ( (lv_val_0_0= 'null' ) )
            // InternalMyDsl.g:779:3: (lv_val_0_0= 'null' )
            {
            // InternalMyDsl.g:779:3: (lv_val_0_0= 'null' )
            // InternalMyDsl.g:780:4: lv_val_0_0= 'null'
            {
            lv_val_0_0=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyDsl.g:795:1: entryRuleJsonInteger returns [EObject current=null] : iv_ruleJsonInteger= ruleJsonInteger EOF ;
    public final EObject entryRuleJsonInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonInteger = null;


        try {
            // InternalMyDsl.g:795:52: (iv_ruleJsonInteger= ruleJsonInteger EOF )
            // InternalMyDsl.g:796:2: iv_ruleJsonInteger= ruleJsonInteger EOF
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
    // InternalMyDsl.g:802:1: ruleJsonInteger returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleJsonInteger() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:808:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:809:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:809:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalMyDsl.g:810:3: (lv_val_0_0= RULE_INT )
            {
            // InternalMyDsl.g:810:3: (lv_val_0_0= RULE_INT )
            // InternalMyDsl.g:811:4: lv_val_0_0= RULE_INT
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
    // InternalMyDsl.g:830:1: entryRuleJObject returns [EObject current=null] : iv_ruleJObject= ruleJObject EOF ;
    public final EObject entryRuleJObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJObject = null;


        try {
            // InternalMyDsl.g:830:48: (iv_ruleJObject= ruleJObject EOF )
            // InternalMyDsl.g:831:2: iv_ruleJObject= ruleJObject EOF
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
    // InternalMyDsl.g:837:1: ruleJObject returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleJObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_element_1_0 = null;

        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:843:2: ( (otherlv_0= '{' ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )? otherlv_4= '}' ) )
            // InternalMyDsl.g:844:2: (otherlv_0= '{' ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )? otherlv_4= '}' )
            {
            // InternalMyDsl.g:844:2: (otherlv_0= '{' ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )? otherlv_4= '}' )
            // InternalMyDsl.g:845:3: otherlv_0= '{' ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:849:3: ( ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:850:4: ( (lv_element_1_0= ruleElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )*
                    {
                    // InternalMyDsl.g:850:4: ( (lv_element_1_0= ruleElement ) )
                    // InternalMyDsl.g:851:5: (lv_element_1_0= ruleElement )
                    {
                    // InternalMyDsl.g:851:5: (lv_element_1_0= ruleElement )
                    // InternalMyDsl.g:852:6: lv_element_1_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalMyDsl.g:869:4: (otherlv_2= ',' ( (lv_element_3_0= ruleElement ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:870:5: otherlv_2= ',' ( (lv_element_3_0= ruleElement ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_4); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getJObjectAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMyDsl.g:874:5: ( (lv_element_3_0= ruleElement ) )
                    	    // InternalMyDsl.g:875:6: (lv_element_3_0= ruleElement )
                    	    {
                    	    // InternalMyDsl.g:875:6: (lv_element_3_0= ruleElement )
                    	    // InternalMyDsl.g:876:7: lv_element_3_0= ruleElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:903:1: entryRuleJArray returns [EObject current=null] : iv_ruleJArray= ruleJArray EOF ;
    public final EObject entryRuleJArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJArray = null;


        try {
            // InternalMyDsl.g:903:47: (iv_ruleJArray= ruleJArray EOF )
            // InternalMyDsl.g:904:2: iv_ruleJArray= ruleJArray EOF
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
    // InternalMyDsl.g:910:1: ruleJArray returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? otherlv_4= ']' ) ;
    public final EObject ruleJArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:916:2: ( (otherlv_0= '[' ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? otherlv_4= ']' ) )
            // InternalMyDsl.g:917:2: (otherlv_0= '[' ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? otherlv_4= ']' )
            {
            // InternalMyDsl.g:917:2: (otherlv_0= '[' ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? otherlv_4= ']' )
            // InternalMyDsl.g:918:3: otherlv_0= '[' ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getJArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMyDsl.g:922:3: ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_INT)||LA11_0==13||(LA11_0>=23 && LA11_0<=26)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:923:4: ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )*
                    {
                    // InternalMyDsl.g:923:4: ( (lv_expression_1_0= ruleExpression ) )
                    // InternalMyDsl.g:924:5: (lv_expression_1_0= ruleExpression )
                    {
                    // InternalMyDsl.g:924:5: (lv_expression_1_0= ruleExpression )
                    // InternalMyDsl.g:925:6: lv_expression_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalMyDsl.g:942:4: (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:943:5: otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_10); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getJArrayAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMyDsl.g:947:5: ( (lv_expression_3_0= ruleExpression ) )
                    	    // InternalMyDsl.g:948:6: (lv_expression_3_0= ruleExpression )
                    	    {
                    	    // InternalMyDsl.g:948:6: (lv_expression_3_0= ruleExpression )
                    	    // InternalMyDsl.g:949:7: lv_expression_3_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

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
    // InternalMyDsl.g:976:1: entryRuleBinExp returns [EObject current=null] : iv_ruleBinExp= ruleBinExp EOF ;
    public final EObject entryRuleBinExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinExp = null;


        try {
            // InternalMyDsl.g:976:47: (iv_ruleBinExp= ruleBinExp EOF )
            // InternalMyDsl.g:977:2: iv_ruleBinExp= ruleBinExp EOF
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
    // InternalMyDsl.g:983:1: ruleBinExp returns [EObject current=null] : ( ( (lv_val_0_0= RULE_STRING ) ) otherlv_1= '+' ( (lv_rval_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleBinExp() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token otherlv_1=null;
        Token lv_rval_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:989:2: ( ( ( (lv_val_0_0= RULE_STRING ) ) otherlv_1= '+' ( (lv_rval_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:990:2: ( ( (lv_val_0_0= RULE_STRING ) ) otherlv_1= '+' ( (lv_rval_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:990:2: ( ( (lv_val_0_0= RULE_STRING ) ) otherlv_1= '+' ( (lv_rval_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:991:3: ( (lv_val_0_0= RULE_STRING ) ) otherlv_1= '+' ( (lv_rval_2_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:991:3: ( (lv_val_0_0= RULE_STRING ) )
            // InternalMyDsl.g:992:4: (lv_val_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:992:4: (lv_val_0_0= RULE_STRING )
            // InternalMyDsl.g:993:5: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBinExpAccess().getPlusSignKeyword_1());
            		
            // InternalMyDsl.g:1013:3: ( (lv_rval_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1014:4: (lv_rval_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1014:4: (lv_rval_2_0= RULE_STRING )
            // InternalMyDsl.g:1015:5: lv_rval_2_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000374000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007802030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000F802030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});

}