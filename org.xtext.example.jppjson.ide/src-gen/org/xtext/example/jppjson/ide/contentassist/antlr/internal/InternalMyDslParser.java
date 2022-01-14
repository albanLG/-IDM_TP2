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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "':'", "'{'", "'}'", "','", "'['", "']'", "'+'", "'null'"
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



    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:53:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleExpression EOF )
            // InternalMyDsl.g:55:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:62:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:68:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:69:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:69:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEntity EOF )
            // InternalMyDsl.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:87:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Entity__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Entity__Alternatives )
            // InternalMyDsl.g:94:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:103:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleElement EOF )
            // InternalMyDsl.g:105:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:112:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Element__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Element__Group__0 )
            // InternalMyDsl.g:119:4: rule__Element__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:128:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleValue EOF )
            // InternalMyDsl.g:130:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:137:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Value__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Value__Alternatives )
            // InternalMyDsl.g:144:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleJsonString"
    // InternalMyDsl.g:153:1: entryRuleJsonString : ruleJsonString EOF ;
    public final void entryRuleJsonString() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleJsonString EOF )
            // InternalMyDsl.g:155:1: ruleJsonString EOF
            {
             before(grammarAccess.getJsonStringRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonString();

            state._fsp--;

             after(grammarAccess.getJsonStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonString"


    // $ANTLR start "ruleJsonString"
    // InternalMyDsl.g:162:1: ruleJsonString : ( ( rule__JsonString__ValAssignment ) ) ;
    public final void ruleJsonString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__JsonString__ValAssignment ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__JsonString__ValAssignment ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__JsonString__ValAssignment ) )
            // InternalMyDsl.g:168:3: ( rule__JsonString__ValAssignment )
            {
             before(grammarAccess.getJsonStringAccess().getValAssignment()); 
            // InternalMyDsl.g:169:3: ( rule__JsonString__ValAssignment )
            // InternalMyDsl.g:169:4: rule__JsonString__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJsonStringAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonString"


    // $ANTLR start "entryRuleJsonBoolean"
    // InternalMyDsl.g:178:1: entryRuleJsonBoolean : ruleJsonBoolean EOF ;
    public final void entryRuleJsonBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleJsonBoolean EOF )
            // InternalMyDsl.g:180:1: ruleJsonBoolean EOF
            {
             before(grammarAccess.getJsonBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonBoolean();

            state._fsp--;

             after(grammarAccess.getJsonBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonBoolean"


    // $ANTLR start "ruleJsonBoolean"
    // InternalMyDsl.g:187:1: ruleJsonBoolean : ( ( rule__JsonBoolean__ValAssignment ) ) ;
    public final void ruleJsonBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__JsonBoolean__ValAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__JsonBoolean__ValAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__JsonBoolean__ValAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__JsonBoolean__ValAssignment )
            {
             before(grammarAccess.getJsonBooleanAccess().getValAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__JsonBoolean__ValAssignment )
            // InternalMyDsl.g:194:4: rule__JsonBoolean__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JsonBoolean__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJsonBooleanAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonBoolean"


    // $ANTLR start "entryRuleJsonEmpty"
    // InternalMyDsl.g:203:1: entryRuleJsonEmpty : ruleJsonEmpty EOF ;
    public final void entryRuleJsonEmpty() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleJsonEmpty EOF )
            // InternalMyDsl.g:205:1: ruleJsonEmpty EOF
            {
             before(grammarAccess.getJsonEmptyRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonEmpty();

            state._fsp--;

             after(grammarAccess.getJsonEmptyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonEmpty"


    // $ANTLR start "ruleJsonEmpty"
    // InternalMyDsl.g:212:1: ruleJsonEmpty : ( ( rule__JsonEmpty__ValAssignment ) ) ;
    public final void ruleJsonEmpty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__JsonEmpty__ValAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__JsonEmpty__ValAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__JsonEmpty__ValAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__JsonEmpty__ValAssignment )
            {
             before(grammarAccess.getJsonEmptyAccess().getValAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__JsonEmpty__ValAssignment )
            // InternalMyDsl.g:219:4: rule__JsonEmpty__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JsonEmpty__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJsonEmptyAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonEmpty"


    // $ANTLR start "entryRuleJsonInteger"
    // InternalMyDsl.g:228:1: entryRuleJsonInteger : ruleJsonInteger EOF ;
    public final void entryRuleJsonInteger() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleJsonInteger EOF )
            // InternalMyDsl.g:230:1: ruleJsonInteger EOF
            {
             before(grammarAccess.getJsonIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonInteger();

            state._fsp--;

             after(grammarAccess.getJsonIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonInteger"


    // $ANTLR start "ruleJsonInteger"
    // InternalMyDsl.g:237:1: ruleJsonInteger : ( ( rule__JsonInteger__ValAssignment ) ) ;
    public final void ruleJsonInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__JsonInteger__ValAssignment ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__JsonInteger__ValAssignment ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__JsonInteger__ValAssignment ) )
            // InternalMyDsl.g:243:3: ( rule__JsonInteger__ValAssignment )
            {
             before(grammarAccess.getJsonIntegerAccess().getValAssignment()); 
            // InternalMyDsl.g:244:3: ( rule__JsonInteger__ValAssignment )
            // InternalMyDsl.g:244:4: rule__JsonInteger__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JsonInteger__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJsonIntegerAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonInteger"


    // $ANTLR start "entryRuleJObject"
    // InternalMyDsl.g:253:1: entryRuleJObject : ruleJObject EOF ;
    public final void entryRuleJObject() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleJObject EOF )
            // InternalMyDsl.g:255:1: ruleJObject EOF
            {
             before(grammarAccess.getJObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleJObject();

            state._fsp--;

             after(grammarAccess.getJObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJObject"


    // $ANTLR start "ruleJObject"
    // InternalMyDsl.g:262:1: ruleJObject : ( ( rule__JObject__Group__0 ) ) ;
    public final void ruleJObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__JObject__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__JObject__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__JObject__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__JObject__Group__0 )
            {
             before(grammarAccess.getJObjectAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__JObject__Group__0 )
            // InternalMyDsl.g:269:4: rule__JObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJObject"


    // $ANTLR start "entryRuleJArray"
    // InternalMyDsl.g:278:1: entryRuleJArray : ruleJArray EOF ;
    public final void entryRuleJArray() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleJArray EOF )
            // InternalMyDsl.g:280:1: ruleJArray EOF
            {
             before(grammarAccess.getJArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleJArray();

            state._fsp--;

             after(grammarAccess.getJArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJArray"


    // $ANTLR start "ruleJArray"
    // InternalMyDsl.g:287:1: ruleJArray : ( ( rule__JArray__Group__0 ) ) ;
    public final void ruleJArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__JArray__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__JArray__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__JArray__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__JArray__Group__0 )
            {
             before(grammarAccess.getJArrayAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__JArray__Group__0 )
            // InternalMyDsl.g:294:4: rule__JArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJArray"


    // $ANTLR start "entryRuleBinExp"
    // InternalMyDsl.g:303:1: entryRuleBinExp : ruleBinExp EOF ;
    public final void entryRuleBinExp() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleBinExp EOF )
            // InternalMyDsl.g:305:1: ruleBinExp EOF
            {
             before(grammarAccess.getBinExpRule()); 
            pushFollow(FOLLOW_1);
            ruleBinExp();

            state._fsp--;

             after(grammarAccess.getBinExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinExp"


    // $ANTLR start "ruleBinExp"
    // InternalMyDsl.g:312:1: ruleBinExp : ( ( rule__BinExp__Group__0 ) ) ;
    public final void ruleBinExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__BinExp__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__BinExp__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__BinExp__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__BinExp__Group__0 )
            {
             before(grammarAccess.getBinExpAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__BinExp__Group__0 )
            // InternalMyDsl.g:319:4: rule__BinExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinExp"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:327:1: rule__Expression__Alternatives : ( ( ruleBinExp ) | ( ruleValue ) | ( ruleEntity ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( ruleBinExp ) | ( ruleValue ) | ( ruleEntity ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==19) ) {
                    alt1=1;
                }
                else if ( (LA1_1==EOF||LA1_1==16||LA1_1==18) ) {
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
            case 11:
            case 12:
            case 20:
                {
                alt1=2;
                }
                break;
            case 14:
            case 17:
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
                    // InternalMyDsl.g:332:2: ( ruleBinExp )
                    {
                    // InternalMyDsl.g:332:2: ( ruleBinExp )
                    // InternalMyDsl.g:333:3: ruleBinExp
                    {
                     before(grammarAccess.getExpressionAccess().getBinExpParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBinExp();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinExpParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:338:2: ( ruleValue )
                    {
                    // InternalMyDsl.g:338:2: ( ruleValue )
                    // InternalMyDsl.g:339:3: ruleValue
                    {
                     before(grammarAccess.getExpressionAccess().getValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:344:2: ( ruleEntity )
                    {
                    // InternalMyDsl.g:344:2: ( ruleEntity )
                    // InternalMyDsl.g:345:3: ruleEntity
                    {
                     before(grammarAccess.getExpressionAccess().getEntityParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getEntityParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalMyDsl.g:354:1: rule__Entity__Alternatives : ( ( ruleJObject ) | ( ruleJArray ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:1: ( ( ruleJObject ) | ( ruleJArray ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:359:2: ( ruleJObject )
                    {
                    // InternalMyDsl.g:359:2: ( ruleJObject )
                    // InternalMyDsl.g:360:3: ruleJObject
                    {
                     before(grammarAccess.getEntityAccess().getJObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJObject();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getJObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:365:2: ( ruleJArray )
                    {
                    // InternalMyDsl.g:365:2: ( ruleJArray )
                    // InternalMyDsl.g:366:3: ruleJArray
                    {
                     before(grammarAccess.getEntityAccess().getJArrayParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJArray();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getJArrayParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMyDsl.g:375:1: rule__Value__Alternatives : ( ( ruleJsonString ) | ( ruleJsonBoolean ) | ( ruleJsonEmpty ) | ( ruleJsonInteger ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:379:1: ( ( ruleJsonString ) | ( ruleJsonBoolean ) | ( ruleJsonEmpty ) | ( ruleJsonInteger ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case 11:
            case 12:
                {
                alt3=2;
                }
                break;
            case 20:
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
                    // InternalMyDsl.g:380:2: ( ruleJsonString )
                    {
                    // InternalMyDsl.g:380:2: ( ruleJsonString )
                    // InternalMyDsl.g:381:3: ruleJsonString
                    {
                     before(grammarAccess.getValueAccess().getJsonStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonString();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJsonStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:386:2: ( ruleJsonBoolean )
                    {
                    // InternalMyDsl.g:386:2: ( ruleJsonBoolean )
                    // InternalMyDsl.g:387:3: ruleJsonBoolean
                    {
                     before(grammarAccess.getValueAccess().getJsonBooleanParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonBoolean();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJsonBooleanParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:392:2: ( ruleJsonEmpty )
                    {
                    // InternalMyDsl.g:392:2: ( ruleJsonEmpty )
                    // InternalMyDsl.g:393:3: ruleJsonEmpty
                    {
                     before(grammarAccess.getValueAccess().getJsonEmptyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonEmpty();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJsonEmptyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:398:2: ( ruleJsonInteger )
                    {
                    // InternalMyDsl.g:398:2: ( ruleJsonInteger )
                    // InternalMyDsl.g:399:3: ruleJsonInteger
                    {
                     before(grammarAccess.getValueAccess().getJsonIntegerParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonInteger();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJsonIntegerParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__JsonBoolean__ValAlternatives_0"
    // InternalMyDsl.g:408:1: rule__JsonBoolean__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__JsonBoolean__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:412:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:413:2: ( 'true' )
                    {
                    // InternalMyDsl.g:413:2: ( 'true' )
                    // InternalMyDsl.g:414:3: 'true'
                    {
                     before(grammarAccess.getJsonBooleanAccess().getValTrueKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getJsonBooleanAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:419:2: ( 'false' )
                    {
                    // InternalMyDsl.g:419:2: ( 'false' )
                    // InternalMyDsl.g:420:3: 'false'
                    {
                     before(grammarAccess.getJsonBooleanAccess().getValFalseKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getJsonBooleanAccess().getValFalseKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__ValAlternatives_0"


    // $ANTLR start "rule__Element__Group__0"
    // InternalMyDsl.g:429:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalMyDsl.g:434:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalMyDsl.g:441:1: rule__Element__Group__0__Impl : ( ( rule__Element__KeyAssignment_0 ) ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( ( ( rule__Element__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:446:1: ( ( rule__Element__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:446:1: ( ( rule__Element__KeyAssignment_0 ) )
            // InternalMyDsl.g:447:2: ( rule__Element__KeyAssignment_0 )
            {
             before(grammarAccess.getElementAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:448:2: ( rule__Element__KeyAssignment_0 )
            // InternalMyDsl.g:448:3: rule__Element__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Element__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalMyDsl.g:456:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:460:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalMyDsl.g:461:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Element__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalMyDsl.g:468:1: rule__Element__Group__1__Impl : ( ':' ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:472:1: ( ( ':' ) )
            // InternalMyDsl.g:473:1: ( ':' )
            {
            // InternalMyDsl.g:473:1: ( ':' )
            // InternalMyDsl.g:474:2: ':'
            {
             before(grammarAccess.getElementAccess().getColonKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Element__Group__2"
    // InternalMyDsl.g:483:1: rule__Element__Group__2 : rule__Element__Group__2__Impl ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:487:1: ( rule__Element__Group__2__Impl )
            // InternalMyDsl.g:488:2: rule__Element__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__2"


    // $ANTLR start "rule__Element__Group__2__Impl"
    // InternalMyDsl.g:494:1: rule__Element__Group__2__Impl : ( ( rule__Element__ValueAssignment_2 ) ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:498:1: ( ( ( rule__Element__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:499:1: ( ( rule__Element__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:499:1: ( ( rule__Element__ValueAssignment_2 ) )
            // InternalMyDsl.g:500:2: ( rule__Element__ValueAssignment_2 )
            {
             before(grammarAccess.getElementAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:501:2: ( rule__Element__ValueAssignment_2 )
            // InternalMyDsl.g:501:3: rule__Element__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Element__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__2__Impl"


    // $ANTLR start "rule__JObject__Group__0"
    // InternalMyDsl.g:510:1: rule__JObject__Group__0 : rule__JObject__Group__0__Impl rule__JObject__Group__1 ;
    public final void rule__JObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( rule__JObject__Group__0__Impl rule__JObject__Group__1 )
            // InternalMyDsl.g:515:2: rule__JObject__Group__0__Impl rule__JObject__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__JObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group__0"


    // $ANTLR start "rule__JObject__Group__0__Impl"
    // InternalMyDsl.g:522:1: rule__JObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:526:1: ( ( '{' ) )
            // InternalMyDsl.g:527:1: ( '{' )
            {
            // InternalMyDsl.g:527:1: ( '{' )
            // InternalMyDsl.g:528:2: '{'
            {
             before(grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group__0__Impl"


    // $ANTLR start "rule__JObject__Group__1"
    // InternalMyDsl.g:537:1: rule__JObject__Group__1 : rule__JObject__Group__1__Impl rule__JObject__Group__2 ;
    public final void rule__JObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( rule__JObject__Group__1__Impl rule__JObject__Group__2 )
            // InternalMyDsl.g:542:2: rule__JObject__Group__1__Impl rule__JObject__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__JObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group__1"


    // $ANTLR start "rule__JObject__Group__1__Impl"
    // InternalMyDsl.g:549:1: rule__JObject__Group__1__Impl : ( ( rule__JObject__Group_1__0 )? ) ;
    public final void rule__JObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( ( ( rule__JObject__Group_1__0 )? ) )
            // InternalMyDsl.g:554:1: ( ( rule__JObject__Group_1__0 )? )
            {
            // InternalMyDsl.g:554:1: ( ( rule__JObject__Group_1__0 )? )
            // InternalMyDsl.g:555:2: ( rule__JObject__Group_1__0 )?
            {
             before(grammarAccess.getJObjectAccess().getGroup_1()); 
            // InternalMyDsl.g:556:2: ( rule__JObject__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:556:3: rule__JObject__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JObject__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJObjectAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group__1__Impl"


    // $ANTLR start "rule__JObject__Group__2"
    // InternalMyDsl.g:564:1: rule__JObject__Group__2 : rule__JObject__Group__2__Impl ;
    public final void rule__JObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:568:1: ( rule__JObject__Group__2__Impl )
            // InternalMyDsl.g:569:2: rule__JObject__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JObject__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group__2"


    // $ANTLR start "rule__JObject__Group__2__Impl"
    // InternalMyDsl.g:575:1: rule__JObject__Group__2__Impl : ( '}' ) ;
    public final void rule__JObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:579:1: ( ( '}' ) )
            // InternalMyDsl.g:580:1: ( '}' )
            {
            // InternalMyDsl.g:580:1: ( '}' )
            // InternalMyDsl.g:581:2: '}'
            {
             before(grammarAccess.getJObjectAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJObjectAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group__2__Impl"


    // $ANTLR start "rule__JObject__Group_1__0"
    // InternalMyDsl.g:591:1: rule__JObject__Group_1__0 : rule__JObject__Group_1__0__Impl rule__JObject__Group_1__1 ;
    public final void rule__JObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( rule__JObject__Group_1__0__Impl rule__JObject__Group_1__1 )
            // InternalMyDsl.g:596:2: rule__JObject__Group_1__0__Impl rule__JObject__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__JObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JObject__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group_1__0"


    // $ANTLR start "rule__JObject__Group_1__0__Impl"
    // InternalMyDsl.g:603:1: rule__JObject__Group_1__0__Impl : ( ( rule__JObject__ElementAssignment_1_0 ) ) ;
    public final void rule__JObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( ( ( rule__JObject__ElementAssignment_1_0 ) ) )
            // InternalMyDsl.g:608:1: ( ( rule__JObject__ElementAssignment_1_0 ) )
            {
            // InternalMyDsl.g:608:1: ( ( rule__JObject__ElementAssignment_1_0 ) )
            // InternalMyDsl.g:609:2: ( rule__JObject__ElementAssignment_1_0 )
            {
             before(grammarAccess.getJObjectAccess().getElementAssignment_1_0()); 
            // InternalMyDsl.g:610:2: ( rule__JObject__ElementAssignment_1_0 )
            // InternalMyDsl.g:610:3: rule__JObject__ElementAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__JObject__ElementAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getJObjectAccess().getElementAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group_1__0__Impl"


    // $ANTLR start "rule__JObject__Group_1__1"
    // InternalMyDsl.g:618:1: rule__JObject__Group_1__1 : rule__JObject__Group_1__1__Impl ;
    public final void rule__JObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:622:1: ( rule__JObject__Group_1__1__Impl )
            // InternalMyDsl.g:623:2: rule__JObject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JObject__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group_1__1"


    // $ANTLR start "rule__JObject__Group_1__1__Impl"
    // InternalMyDsl.g:629:1: rule__JObject__Group_1__1__Impl : ( ( rule__JObject__Group_1_1__0 )* ) ;
    public final void rule__JObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:633:1: ( ( ( rule__JObject__Group_1_1__0 )* ) )
            // InternalMyDsl.g:634:1: ( ( rule__JObject__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:634:1: ( ( rule__JObject__Group_1_1__0 )* )
            // InternalMyDsl.g:635:2: ( rule__JObject__Group_1_1__0 )*
            {
             before(grammarAccess.getJObjectAccess().getGroup_1_1()); 
            // InternalMyDsl.g:636:2: ( rule__JObject__Group_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:636:3: rule__JObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__JObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJObjectAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group_1__1__Impl"


    // $ANTLR start "rule__JObject__Group_1_1__0"
    // InternalMyDsl.g:645:1: rule__JObject__Group_1_1__0 : rule__JObject__Group_1_1__0__Impl rule__JObject__Group_1_1__1 ;
    public final void rule__JObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( rule__JObject__Group_1_1__0__Impl rule__JObject__Group_1_1__1 )
            // InternalMyDsl.g:650:2: rule__JObject__Group_1_1__0__Impl rule__JObject__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__JObject__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JObject__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group_1_1__0"


    // $ANTLR start "rule__JObject__Group_1_1__0__Impl"
    // InternalMyDsl.g:657:1: rule__JObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__JObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( ( ',' ) )
            // InternalMyDsl.g:662:1: ( ',' )
            {
            // InternalMyDsl.g:662:1: ( ',' )
            // InternalMyDsl.g:663:2: ','
            {
             before(grammarAccess.getJObjectAccess().getCommaKeyword_1_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJObjectAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group_1_1__0__Impl"


    // $ANTLR start "rule__JObject__Group_1_1__1"
    // InternalMyDsl.g:672:1: rule__JObject__Group_1_1__1 : rule__JObject__Group_1_1__1__Impl ;
    public final void rule__JObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( rule__JObject__Group_1_1__1__Impl )
            // InternalMyDsl.g:677:2: rule__JObject__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JObject__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group_1_1__1"


    // $ANTLR start "rule__JObject__Group_1_1__1__Impl"
    // InternalMyDsl.g:683:1: rule__JObject__Group_1_1__1__Impl : ( ( rule__JObject__ElementAssignment_1_1_1 ) ) ;
    public final void rule__JObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:687:1: ( ( ( rule__JObject__ElementAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:688:1: ( ( rule__JObject__ElementAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:688:1: ( ( rule__JObject__ElementAssignment_1_1_1 ) )
            // InternalMyDsl.g:689:2: ( rule__JObject__ElementAssignment_1_1_1 )
            {
             before(grammarAccess.getJObjectAccess().getElementAssignment_1_1_1()); 
            // InternalMyDsl.g:690:2: ( rule__JObject__ElementAssignment_1_1_1 )
            // InternalMyDsl.g:690:3: rule__JObject__ElementAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JObject__ElementAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJObjectAccess().getElementAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__Group_1_1__1__Impl"


    // $ANTLR start "rule__JArray__Group__0"
    // InternalMyDsl.g:699:1: rule__JArray__Group__0 : rule__JArray__Group__0__Impl rule__JArray__Group__1 ;
    public final void rule__JArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( rule__JArray__Group__0__Impl rule__JArray__Group__1 )
            // InternalMyDsl.g:704:2: rule__JArray__Group__0__Impl rule__JArray__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__JArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group__0"


    // $ANTLR start "rule__JArray__Group__0__Impl"
    // InternalMyDsl.g:711:1: rule__JArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( ( '[' ) )
            // InternalMyDsl.g:716:1: ( '[' )
            {
            // InternalMyDsl.g:716:1: ( '[' )
            // InternalMyDsl.g:717:2: '['
            {
             before(grammarAccess.getJArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJArrayAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group__0__Impl"


    // $ANTLR start "rule__JArray__Group__1"
    // InternalMyDsl.g:726:1: rule__JArray__Group__1 : rule__JArray__Group__1__Impl rule__JArray__Group__2 ;
    public final void rule__JArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( rule__JArray__Group__1__Impl rule__JArray__Group__2 )
            // InternalMyDsl.g:731:2: rule__JArray__Group__1__Impl rule__JArray__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__JArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group__1"


    // $ANTLR start "rule__JArray__Group__1__Impl"
    // InternalMyDsl.g:738:1: rule__JArray__Group__1__Impl : ( ( rule__JArray__Group_1__0 )? ) ;
    public final void rule__JArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( ( ( rule__JArray__Group_1__0 )? ) )
            // InternalMyDsl.g:743:1: ( ( rule__JArray__Group_1__0 )? )
            {
            // InternalMyDsl.g:743:1: ( ( rule__JArray__Group_1__0 )? )
            // InternalMyDsl.g:744:2: ( rule__JArray__Group_1__0 )?
            {
             before(grammarAccess.getJArrayAccess().getGroup_1()); 
            // InternalMyDsl.g:745:2: ( rule__JArray__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_INT)||(LA7_0>=11 && LA7_0<=12)||LA7_0==14||LA7_0==17||LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:745:3: rule__JArray__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JArray__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJArrayAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group__1__Impl"


    // $ANTLR start "rule__JArray__Group__2"
    // InternalMyDsl.g:753:1: rule__JArray__Group__2 : rule__JArray__Group__2__Impl ;
    public final void rule__JArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( rule__JArray__Group__2__Impl )
            // InternalMyDsl.g:758:2: rule__JArray__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JArray__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group__2"


    // $ANTLR start "rule__JArray__Group__2__Impl"
    // InternalMyDsl.g:764:1: rule__JArray__Group__2__Impl : ( ']' ) ;
    public final void rule__JArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:768:1: ( ( ']' ) )
            // InternalMyDsl.g:769:1: ( ']' )
            {
            // InternalMyDsl.g:769:1: ( ']' )
            // InternalMyDsl.g:770:2: ']'
            {
             before(grammarAccess.getJArrayAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJArrayAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group__2__Impl"


    // $ANTLR start "rule__JArray__Group_1__0"
    // InternalMyDsl.g:780:1: rule__JArray__Group_1__0 : rule__JArray__Group_1__0__Impl rule__JArray__Group_1__1 ;
    public final void rule__JArray__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( rule__JArray__Group_1__0__Impl rule__JArray__Group_1__1 )
            // InternalMyDsl.g:785:2: rule__JArray__Group_1__0__Impl rule__JArray__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__JArray__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JArray__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group_1__0"


    // $ANTLR start "rule__JArray__Group_1__0__Impl"
    // InternalMyDsl.g:792:1: rule__JArray__Group_1__0__Impl : ( ( rule__JArray__ExpressionAssignment_1_0 ) ) ;
    public final void rule__JArray__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( ( ( rule__JArray__ExpressionAssignment_1_0 ) ) )
            // InternalMyDsl.g:797:1: ( ( rule__JArray__ExpressionAssignment_1_0 ) )
            {
            // InternalMyDsl.g:797:1: ( ( rule__JArray__ExpressionAssignment_1_0 ) )
            // InternalMyDsl.g:798:2: ( rule__JArray__ExpressionAssignment_1_0 )
            {
             before(grammarAccess.getJArrayAccess().getExpressionAssignment_1_0()); 
            // InternalMyDsl.g:799:2: ( rule__JArray__ExpressionAssignment_1_0 )
            // InternalMyDsl.g:799:3: rule__JArray__ExpressionAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__JArray__ExpressionAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getJArrayAccess().getExpressionAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group_1__0__Impl"


    // $ANTLR start "rule__JArray__Group_1__1"
    // InternalMyDsl.g:807:1: rule__JArray__Group_1__1 : rule__JArray__Group_1__1__Impl ;
    public final void rule__JArray__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( rule__JArray__Group_1__1__Impl )
            // InternalMyDsl.g:812:2: rule__JArray__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JArray__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group_1__1"


    // $ANTLR start "rule__JArray__Group_1__1__Impl"
    // InternalMyDsl.g:818:1: rule__JArray__Group_1__1__Impl : ( ( rule__JArray__Group_1_1__0 )* ) ;
    public final void rule__JArray__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:822:1: ( ( ( rule__JArray__Group_1_1__0 )* ) )
            // InternalMyDsl.g:823:1: ( ( rule__JArray__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:823:1: ( ( rule__JArray__Group_1_1__0 )* )
            // InternalMyDsl.g:824:2: ( rule__JArray__Group_1_1__0 )*
            {
             before(grammarAccess.getJArrayAccess().getGroup_1_1()); 
            // InternalMyDsl.g:825:2: ( rule__JArray__Group_1_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:825:3: rule__JArray__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__JArray__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getJArrayAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group_1__1__Impl"


    // $ANTLR start "rule__JArray__Group_1_1__0"
    // InternalMyDsl.g:834:1: rule__JArray__Group_1_1__0 : rule__JArray__Group_1_1__0__Impl rule__JArray__Group_1_1__1 ;
    public final void rule__JArray__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:838:1: ( rule__JArray__Group_1_1__0__Impl rule__JArray__Group_1_1__1 )
            // InternalMyDsl.g:839:2: rule__JArray__Group_1_1__0__Impl rule__JArray__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__JArray__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JArray__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group_1_1__0"


    // $ANTLR start "rule__JArray__Group_1_1__0__Impl"
    // InternalMyDsl.g:846:1: rule__JArray__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__JArray__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:850:1: ( ( ',' ) )
            // InternalMyDsl.g:851:1: ( ',' )
            {
            // InternalMyDsl.g:851:1: ( ',' )
            // InternalMyDsl.g:852:2: ','
            {
             before(grammarAccess.getJArrayAccess().getCommaKeyword_1_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJArrayAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group_1_1__0__Impl"


    // $ANTLR start "rule__JArray__Group_1_1__1"
    // InternalMyDsl.g:861:1: rule__JArray__Group_1_1__1 : rule__JArray__Group_1_1__1__Impl ;
    public final void rule__JArray__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:865:1: ( rule__JArray__Group_1_1__1__Impl )
            // InternalMyDsl.g:866:2: rule__JArray__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JArray__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group_1_1__1"


    // $ANTLR start "rule__JArray__Group_1_1__1__Impl"
    // InternalMyDsl.g:872:1: rule__JArray__Group_1_1__1__Impl : ( ( rule__JArray__ExpressionAssignment_1_1_1 ) ) ;
    public final void rule__JArray__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:876:1: ( ( ( rule__JArray__ExpressionAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:877:1: ( ( rule__JArray__ExpressionAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:877:1: ( ( rule__JArray__ExpressionAssignment_1_1_1 ) )
            // InternalMyDsl.g:878:2: ( rule__JArray__ExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getJArrayAccess().getExpressionAssignment_1_1_1()); 
            // InternalMyDsl.g:879:2: ( rule__JArray__ExpressionAssignment_1_1_1 )
            // InternalMyDsl.g:879:3: rule__JArray__ExpressionAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JArray__ExpressionAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJArrayAccess().getExpressionAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__Group_1_1__1__Impl"


    // $ANTLR start "rule__BinExp__Group__0"
    // InternalMyDsl.g:888:1: rule__BinExp__Group__0 : rule__BinExp__Group__0__Impl rule__BinExp__Group__1 ;
    public final void rule__BinExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:892:1: ( rule__BinExp__Group__0__Impl rule__BinExp__Group__1 )
            // InternalMyDsl.g:893:2: rule__BinExp__Group__0__Impl rule__BinExp__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__BinExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExp__Group__0"


    // $ANTLR start "rule__BinExp__Group__0__Impl"
    // InternalMyDsl.g:900:1: rule__BinExp__Group__0__Impl : ( ( rule__BinExp__ValAssignment_0 ) ) ;
    public final void rule__BinExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( ( ( rule__BinExp__ValAssignment_0 ) ) )
            // InternalMyDsl.g:905:1: ( ( rule__BinExp__ValAssignment_0 ) )
            {
            // InternalMyDsl.g:905:1: ( ( rule__BinExp__ValAssignment_0 ) )
            // InternalMyDsl.g:906:2: ( rule__BinExp__ValAssignment_0 )
            {
             before(grammarAccess.getBinExpAccess().getValAssignment_0()); 
            // InternalMyDsl.g:907:2: ( rule__BinExp__ValAssignment_0 )
            // InternalMyDsl.g:907:3: rule__BinExp__ValAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BinExp__ValAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBinExpAccess().getValAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExp__Group__0__Impl"


    // $ANTLR start "rule__BinExp__Group__1"
    // InternalMyDsl.g:915:1: rule__BinExp__Group__1 : rule__BinExp__Group__1__Impl rule__BinExp__Group__2 ;
    public final void rule__BinExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:919:1: ( rule__BinExp__Group__1__Impl rule__BinExp__Group__2 )
            // InternalMyDsl.g:920:2: rule__BinExp__Group__1__Impl rule__BinExp__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__BinExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExp__Group__1"


    // $ANTLR start "rule__BinExp__Group__1__Impl"
    // InternalMyDsl.g:927:1: rule__BinExp__Group__1__Impl : ( '+' ) ;
    public final void rule__BinExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( ( '+' ) )
            // InternalMyDsl.g:932:1: ( '+' )
            {
            // InternalMyDsl.g:932:1: ( '+' )
            // InternalMyDsl.g:933:2: '+'
            {
             before(grammarAccess.getBinExpAccess().getPlusSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBinExpAccess().getPlusSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExp__Group__1__Impl"


    // $ANTLR start "rule__BinExp__Group__2"
    // InternalMyDsl.g:942:1: rule__BinExp__Group__2 : rule__BinExp__Group__2__Impl ;
    public final void rule__BinExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( rule__BinExp__Group__2__Impl )
            // InternalMyDsl.g:947:2: rule__BinExp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinExp__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExp__Group__2"


    // $ANTLR start "rule__BinExp__Group__2__Impl"
    // InternalMyDsl.g:953:1: rule__BinExp__Group__2__Impl : ( ( rule__BinExp__RvalAssignment_2 ) ) ;
    public final void rule__BinExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:957:1: ( ( ( rule__BinExp__RvalAssignment_2 ) ) )
            // InternalMyDsl.g:958:1: ( ( rule__BinExp__RvalAssignment_2 ) )
            {
            // InternalMyDsl.g:958:1: ( ( rule__BinExp__RvalAssignment_2 ) )
            // InternalMyDsl.g:959:2: ( rule__BinExp__RvalAssignment_2 )
            {
             before(grammarAccess.getBinExpAccess().getRvalAssignment_2()); 
            // InternalMyDsl.g:960:2: ( rule__BinExp__RvalAssignment_2 )
            // InternalMyDsl.g:960:3: rule__BinExp__RvalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BinExp__RvalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinExpAccess().getRvalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExp__Group__2__Impl"


    // $ANTLR start "rule__Element__KeyAssignment_0"
    // InternalMyDsl.g:969:1: rule__Element__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Element__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:974:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:974:2: ( RULE_STRING )
            // InternalMyDsl.g:975:3: RULE_STRING
            {
             before(grammarAccess.getElementAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__KeyAssignment_0"


    // $ANTLR start "rule__Element__ValueAssignment_2"
    // InternalMyDsl.g:984:1: rule__Element__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Element__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( ruleValue ) )
            // InternalMyDsl.g:989:2: ( ruleValue )
            {
            // InternalMyDsl.g:989:2: ( ruleValue )
            // InternalMyDsl.g:990:3: ruleValue
            {
             before(grammarAccess.getElementAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getElementAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ValueAssignment_2"


    // $ANTLR start "rule__JsonString__ValAssignment"
    // InternalMyDsl.g:999:1: rule__JsonString__ValAssignment : ( RULE_STRING ) ;
    public final void rule__JsonString__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1003:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1004:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1004:2: ( RULE_STRING )
            // InternalMyDsl.g:1005:3: RULE_STRING
            {
             before(grammarAccess.getJsonStringAccess().getValSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJsonStringAccess().getValSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonString__ValAssignment"


    // $ANTLR start "rule__JsonBoolean__ValAssignment"
    // InternalMyDsl.g:1014:1: rule__JsonBoolean__ValAssignment : ( ( rule__JsonBoolean__ValAlternatives_0 ) ) ;
    public final void rule__JsonBoolean__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( ( ( rule__JsonBoolean__ValAlternatives_0 ) ) )
            // InternalMyDsl.g:1019:2: ( ( rule__JsonBoolean__ValAlternatives_0 ) )
            {
            // InternalMyDsl.g:1019:2: ( ( rule__JsonBoolean__ValAlternatives_0 ) )
            // InternalMyDsl.g:1020:3: ( rule__JsonBoolean__ValAlternatives_0 )
            {
             before(grammarAccess.getJsonBooleanAccess().getValAlternatives_0()); 
            // InternalMyDsl.g:1021:3: ( rule__JsonBoolean__ValAlternatives_0 )
            // InternalMyDsl.g:1021:4: rule__JsonBoolean__ValAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__JsonBoolean__ValAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getJsonBooleanAccess().getValAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__ValAssignment"


    // $ANTLR start "rule__JsonEmpty__ValAssignment"
    // InternalMyDsl.g:1029:1: rule__JsonEmpty__ValAssignment : ( ( 'null' ) ) ;
    public final void rule__JsonEmpty__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1033:1: ( ( ( 'null' ) ) )
            // InternalMyDsl.g:1034:2: ( ( 'null' ) )
            {
            // InternalMyDsl.g:1034:2: ( ( 'null' ) )
            // InternalMyDsl.g:1035:3: ( 'null' )
            {
             before(grammarAccess.getJsonEmptyAccess().getValNullKeyword_0()); 
            // InternalMyDsl.g:1036:3: ( 'null' )
            // InternalMyDsl.g:1037:4: 'null'
            {
             before(grammarAccess.getJsonEmptyAccess().getValNullKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getJsonEmptyAccess().getValNullKeyword_0()); 

            }

             after(grammarAccess.getJsonEmptyAccess().getValNullKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEmpty__ValAssignment"


    // $ANTLR start "rule__JsonInteger__ValAssignment"
    // InternalMyDsl.g:1048:1: rule__JsonInteger__ValAssignment : ( RULE_INT ) ;
    public final void rule__JsonInteger__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1053:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1053:2: ( RULE_INT )
            // InternalMyDsl.g:1054:3: RULE_INT
            {
             before(grammarAccess.getJsonIntegerAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getJsonIntegerAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonInteger__ValAssignment"


    // $ANTLR start "rule__JObject__ElementAssignment_1_0"
    // InternalMyDsl.g:1063:1: rule__JObject__ElementAssignment_1_0 : ( ruleElement ) ;
    public final void rule__JObject__ElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1067:1: ( ( ruleElement ) )
            // InternalMyDsl.g:1068:2: ( ruleElement )
            {
            // InternalMyDsl.g:1068:2: ( ruleElement )
            // InternalMyDsl.g:1069:3: ruleElement
            {
             before(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__ElementAssignment_1_0"


    // $ANTLR start "rule__JObject__ElementAssignment_1_1_1"
    // InternalMyDsl.g:1078:1: rule__JObject__ElementAssignment_1_1_1 : ( ruleElement ) ;
    public final void rule__JObject__ElementAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( ( ruleElement ) )
            // InternalMyDsl.g:1083:2: ( ruleElement )
            {
            // InternalMyDsl.g:1083:2: ( ruleElement )
            // InternalMyDsl.g:1084:3: ruleElement
            {
             before(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getJObjectAccess().getElementElementParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JObject__ElementAssignment_1_1_1"


    // $ANTLR start "rule__JArray__ExpressionAssignment_1_0"
    // InternalMyDsl.g:1093:1: rule__JArray__ExpressionAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__JArray__ExpressionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:1098:2: ( ruleExpression )
            {
            // InternalMyDsl.g:1098:2: ( ruleExpression )
            // InternalMyDsl.g:1099:3: ruleExpression
            {
             before(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__ExpressionAssignment_1_0"


    // $ANTLR start "rule__JArray__ExpressionAssignment_1_1_1"
    // InternalMyDsl.g:1108:1: rule__JArray__ExpressionAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__JArray__ExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:1113:2: ( ruleExpression )
            {
            // InternalMyDsl.g:1113:2: ( ruleExpression )
            // InternalMyDsl.g:1114:3: ruleExpression
            {
             before(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getJArrayAccess().getExpressionExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JArray__ExpressionAssignment_1_1_1"


    // $ANTLR start "rule__BinExp__ValAssignment_0"
    // InternalMyDsl.g:1123:1: rule__BinExp__ValAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BinExp__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1127:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1128:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1128:2: ( RULE_STRING )
            // InternalMyDsl.g:1129:3: RULE_STRING
            {
             before(grammarAccess.getBinExpAccess().getValSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBinExpAccess().getValSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExp__ValAssignment_0"


    // $ANTLR start "rule__BinExp__RvalAssignment_2"
    // InternalMyDsl.g:1138:1: rule__BinExp__RvalAssignment_2 : ( RULE_STRING ) ;
    public final void rule__BinExp__RvalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1143:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1143:2: ( RULE_STRING )
            // InternalMyDsl.g:1144:3: RULE_STRING
            {
             before(grammarAccess.getBinExpAccess().getRvalSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBinExpAccess().getRvalSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinExp__RvalAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000101830L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000165830L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000125830L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});

}