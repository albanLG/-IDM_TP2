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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Load('", "')'", "'{'", "'}'", "'Write()'", "';'", "'Read('", "'ExportString('", "'ExportJson('", "'ExportCSV('", "':'", "','", "'['", "']'", "'+'", "'null'"
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



    // $ANTLR start "entryRuleProgramme"
    // InternalMyDsl.g:53:1: entryRuleProgramme : ruleProgramme EOF ;
    public final void entryRuleProgramme() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProgramme EOF )
            // InternalMyDsl.g:55:1: ruleProgramme EOF
            {
             before(grammarAccess.getProgrammeRule()); 
            pushFollow(FOLLOW_1);
            ruleProgramme();

            state._fsp--;

             after(grammarAccess.getProgrammeRule()); 
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
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalMyDsl.g:62:1: ruleProgramme : ( ( rule__Programme__LoadfilesAssignment )* ) ;
    public final void ruleProgramme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Programme__LoadfilesAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Programme__LoadfilesAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Programme__LoadfilesAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Programme__LoadfilesAssignment )*
            {
             before(grammarAccess.getProgrammeAccess().getLoadfilesAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Programme__LoadfilesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Programme__LoadfilesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Programme__LoadfilesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgrammeAccess().getLoadfilesAssignment()); 

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
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleLoadfile"
    // InternalMyDsl.g:78:1: entryRuleLoadfile : ruleLoadfile EOF ;
    public final void entryRuleLoadfile() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleLoadfile EOF )
            // InternalMyDsl.g:80:1: ruleLoadfile EOF
            {
             before(grammarAccess.getLoadfileRule()); 
            pushFollow(FOLLOW_1);
            ruleLoadfile();

            state._fsp--;

             after(grammarAccess.getLoadfileRule()); 
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
    // $ANTLR end "entryRuleLoadfile"


    // $ANTLR start "ruleLoadfile"
    // InternalMyDsl.g:87:1: ruleLoadfile : ( ( rule__Loadfile__Alternatives ) ) ;
    public final void ruleLoadfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Loadfile__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Loadfile__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Loadfile__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Loadfile__Alternatives )
            {
             before(grammarAccess.getLoadfileAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Loadfile__Alternatives )
            // InternalMyDsl.g:94:4: rule__Loadfile__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Loadfile__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLoadfileAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLoadfile"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:103:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCommand EOF )
            // InternalMyDsl.g:105:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:112:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Command__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Command__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Command__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Command__Group__0 )
            // InternalMyDsl.g:119:4: rule__Command__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleRead"
    // InternalMyDsl.g:128:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRead EOF )
            // InternalMyDsl.g:130:1: ruleRead EOF
            {
             before(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            ruleRead();

            state._fsp--;

             after(grammarAccess.getReadRule()); 
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
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalMyDsl.g:137:1: ruleRead : ( ( rule__Read__Group__0 ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Read__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Read__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Read__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Read__Group__0 )
            {
             before(grammarAccess.getReadAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Read__Group__0 )
            // InternalMyDsl.g:144:4: rule__Read__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getGroup()); 

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
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleToString"
    // InternalMyDsl.g:153:1: entryRuleToString : ruleToString EOF ;
    public final void entryRuleToString() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleToString EOF )
            // InternalMyDsl.g:155:1: ruleToString EOF
            {
             before(grammarAccess.getToStringRule()); 
            pushFollow(FOLLOW_1);
            ruleToString();

            state._fsp--;

             after(grammarAccess.getToStringRule()); 
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
    // $ANTLR end "entryRuleToString"


    // $ANTLR start "ruleToString"
    // InternalMyDsl.g:162:1: ruleToString : ( ( rule__ToString__Group__0 ) ) ;
    public final void ruleToString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__ToString__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__ToString__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__ToString__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__ToString__Group__0 )
            {
             before(grammarAccess.getToStringAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__ToString__Group__0 )
            // InternalMyDsl.g:169:4: rule__ToString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ToString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToStringAccess().getGroup()); 

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
    // $ANTLR end "ruleToString"


    // $ANTLR start "entryRuleToJSON"
    // InternalMyDsl.g:178:1: entryRuleToJSON : ruleToJSON EOF ;
    public final void entryRuleToJSON() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleToJSON EOF )
            // InternalMyDsl.g:180:1: ruleToJSON EOF
            {
             before(grammarAccess.getToJSONRule()); 
            pushFollow(FOLLOW_1);
            ruleToJSON();

            state._fsp--;

             after(grammarAccess.getToJSONRule()); 
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
    // $ANTLR end "entryRuleToJSON"


    // $ANTLR start "ruleToJSON"
    // InternalMyDsl.g:187:1: ruleToJSON : ( ( rule__ToJSON__Group__0 ) ) ;
    public final void ruleToJSON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__ToJSON__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__ToJSON__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__ToJSON__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__ToJSON__Group__0 )
            {
             before(grammarAccess.getToJSONAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__ToJSON__Group__0 )
            // InternalMyDsl.g:194:4: rule__ToJSON__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ToJSON__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToJSONAccess().getGroup()); 

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
    // $ANTLR end "ruleToJSON"


    // $ANTLR start "entryRuleToCSV"
    // InternalMyDsl.g:203:1: entryRuleToCSV : ruleToCSV EOF ;
    public final void entryRuleToCSV() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleToCSV EOF )
            // InternalMyDsl.g:205:1: ruleToCSV EOF
            {
             before(grammarAccess.getToCSVRule()); 
            pushFollow(FOLLOW_1);
            ruleToCSV();

            state._fsp--;

             after(grammarAccess.getToCSVRule()); 
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
    // $ANTLR end "entryRuleToCSV"


    // $ANTLR start "ruleToCSV"
    // InternalMyDsl.g:212:1: ruleToCSV : ( ( rule__ToCSV__Group__0 ) ) ;
    public final void ruleToCSV() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ToCSV__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ToCSV__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ToCSV__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__ToCSV__Group__0 )
            {
             before(grammarAccess.getToCSVAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__ToCSV__Group__0 )
            // InternalMyDsl.g:219:4: rule__ToCSV__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ToCSV__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToCSVAccess().getGroup()); 

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
    // $ANTLR end "ruleToCSV"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleExpression EOF )
            // InternalMyDsl.g:230:1: ruleExpression EOF
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
    // InternalMyDsl.g:237:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:244:4: rule__Expression__Alternatives
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
    // InternalMyDsl.g:253:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleEntity EOF )
            // InternalMyDsl.g:255:1: ruleEntity EOF
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
    // InternalMyDsl.g:262:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Entity__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__Entity__Alternatives )
            // InternalMyDsl.g:269:4: rule__Entity__Alternatives
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
    // InternalMyDsl.g:278:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleElement EOF )
            // InternalMyDsl.g:280:1: ruleElement EOF
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
    // InternalMyDsl.g:287:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Element__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Element__Group__0 )
            // InternalMyDsl.g:294:4: rule__Element__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleValue EOF )
            // InternalMyDsl.g:305:1: ruleValue EOF
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
    // InternalMyDsl.g:312:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Value__Alternatives ) )
            // InternalMyDsl.g:318:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMyDsl.g:319:3: ( rule__Value__Alternatives )
            // InternalMyDsl.g:319:4: rule__Value__Alternatives
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
    // InternalMyDsl.g:328:1: entryRuleJsonString : ruleJsonString EOF ;
    public final void entryRuleJsonString() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleJsonString EOF )
            // InternalMyDsl.g:330:1: ruleJsonString EOF
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
    // InternalMyDsl.g:337:1: ruleJsonString : ( ( rule__JsonString__ValAssignment ) ) ;
    public final void ruleJsonString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__JsonString__ValAssignment ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__JsonString__ValAssignment ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__JsonString__ValAssignment ) )
            // InternalMyDsl.g:343:3: ( rule__JsonString__ValAssignment )
            {
             before(grammarAccess.getJsonStringAccess().getValAssignment()); 
            // InternalMyDsl.g:344:3: ( rule__JsonString__ValAssignment )
            // InternalMyDsl.g:344:4: rule__JsonString__ValAssignment
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
    // InternalMyDsl.g:353:1: entryRuleJsonBoolean : ruleJsonBoolean EOF ;
    public final void entryRuleJsonBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleJsonBoolean EOF )
            // InternalMyDsl.g:355:1: ruleJsonBoolean EOF
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
    // InternalMyDsl.g:362:1: ruleJsonBoolean : ( ( rule__JsonBoolean__ValAssignment ) ) ;
    public final void ruleJsonBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__JsonBoolean__ValAssignment ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__JsonBoolean__ValAssignment ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__JsonBoolean__ValAssignment ) )
            // InternalMyDsl.g:368:3: ( rule__JsonBoolean__ValAssignment )
            {
             before(grammarAccess.getJsonBooleanAccess().getValAssignment()); 
            // InternalMyDsl.g:369:3: ( rule__JsonBoolean__ValAssignment )
            // InternalMyDsl.g:369:4: rule__JsonBoolean__ValAssignment
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
    // InternalMyDsl.g:378:1: entryRuleJsonEmpty : ruleJsonEmpty EOF ;
    public final void entryRuleJsonEmpty() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleJsonEmpty EOF )
            // InternalMyDsl.g:380:1: ruleJsonEmpty EOF
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
    // InternalMyDsl.g:387:1: ruleJsonEmpty : ( ( rule__JsonEmpty__ValAssignment ) ) ;
    public final void ruleJsonEmpty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__JsonEmpty__ValAssignment ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__JsonEmpty__ValAssignment ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__JsonEmpty__ValAssignment ) )
            // InternalMyDsl.g:393:3: ( rule__JsonEmpty__ValAssignment )
            {
             before(grammarAccess.getJsonEmptyAccess().getValAssignment()); 
            // InternalMyDsl.g:394:3: ( rule__JsonEmpty__ValAssignment )
            // InternalMyDsl.g:394:4: rule__JsonEmpty__ValAssignment
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
    // InternalMyDsl.g:403:1: entryRuleJsonInteger : ruleJsonInteger EOF ;
    public final void entryRuleJsonInteger() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleJsonInteger EOF )
            // InternalMyDsl.g:405:1: ruleJsonInteger EOF
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
    // InternalMyDsl.g:412:1: ruleJsonInteger : ( ( rule__JsonInteger__ValAssignment ) ) ;
    public final void ruleJsonInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__JsonInteger__ValAssignment ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__JsonInteger__ValAssignment ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__JsonInteger__ValAssignment ) )
            // InternalMyDsl.g:418:3: ( rule__JsonInteger__ValAssignment )
            {
             before(grammarAccess.getJsonIntegerAccess().getValAssignment()); 
            // InternalMyDsl.g:419:3: ( rule__JsonInteger__ValAssignment )
            // InternalMyDsl.g:419:4: rule__JsonInteger__ValAssignment
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
    // InternalMyDsl.g:428:1: entryRuleJObject : ruleJObject EOF ;
    public final void entryRuleJObject() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleJObject EOF )
            // InternalMyDsl.g:430:1: ruleJObject EOF
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
    // InternalMyDsl.g:437:1: ruleJObject : ( ( rule__JObject__Group__0 ) ) ;
    public final void ruleJObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__JObject__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__JObject__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__JObject__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__JObject__Group__0 )
            {
             before(grammarAccess.getJObjectAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__JObject__Group__0 )
            // InternalMyDsl.g:444:4: rule__JObject__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleJArray : ruleJArray EOF ;
    public final void entryRuleJArray() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleJArray EOF )
            // InternalMyDsl.g:455:1: ruleJArray EOF
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
    // InternalMyDsl.g:462:1: ruleJArray : ( ( rule__JArray__Group__0 ) ) ;
    public final void ruleJArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__JArray__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__JArray__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__JArray__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__JArray__Group__0 )
            {
             before(grammarAccess.getJArrayAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__JArray__Group__0 )
            // InternalMyDsl.g:469:4: rule__JArray__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleBinExp : ruleBinExp EOF ;
    public final void entryRuleBinExp() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleBinExp EOF )
            // InternalMyDsl.g:480:1: ruleBinExp EOF
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
    // InternalMyDsl.g:487:1: ruleBinExp : ( ( rule__BinExp__Group__0 ) ) ;
    public final void ruleBinExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__BinExp__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__BinExp__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__BinExp__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__BinExp__Group__0 )
            {
             before(grammarAccess.getBinExpAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__BinExp__Group__0 )
            // InternalMyDsl.g:494:4: rule__BinExp__Group__0
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


    // $ANTLR start "rule__Loadfile__Alternatives"
    // InternalMyDsl.g:502:1: rule__Loadfile__Alternatives : ( ( ( rule__Loadfile__Group_0__0 ) ) | ( ( rule__Loadfile__Group_1__0 ) ) );
    public final void rule__Loadfile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:506:1: ( ( ( rule__Loadfile__Group_0__0 ) ) | ( ( rule__Loadfile__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
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
                    // InternalMyDsl.g:507:2: ( ( rule__Loadfile__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:507:2: ( ( rule__Loadfile__Group_0__0 ) )
                    // InternalMyDsl.g:508:3: ( rule__Loadfile__Group_0__0 )
                    {
                     before(grammarAccess.getLoadfileAccess().getGroup_0()); 
                    // InternalMyDsl.g:509:3: ( rule__Loadfile__Group_0__0 )
                    // InternalMyDsl.g:509:4: rule__Loadfile__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loadfile__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLoadfileAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:513:2: ( ( rule__Loadfile__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:513:2: ( ( rule__Loadfile__Group_1__0 ) )
                    // InternalMyDsl.g:514:3: ( rule__Loadfile__Group_1__0 )
                    {
                     before(grammarAccess.getLoadfileAccess().getGroup_1()); 
                    // InternalMyDsl.g:515:3: ( rule__Loadfile__Group_1__0 )
                    // InternalMyDsl.g:515:4: rule__Loadfile__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loadfile__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLoadfileAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Loadfile__Alternatives"


    // $ANTLR start "rule__Command__Alternatives_0"
    // InternalMyDsl.g:523:1: rule__Command__Alternatives_0 : ( ( ruleRead ) | ( ruleToString ) | ( ruleToJSON ) | ( ruleToCSV ) );
    public final void rule__Command__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:527:1: ( ( ruleRead ) | ( ruleToString ) | ( ruleToJSON ) | ( ruleToCSV ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
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
                    // InternalMyDsl.g:528:2: ( ruleRead )
                    {
                    // InternalMyDsl.g:528:2: ( ruleRead )
                    // InternalMyDsl.g:529:3: ruleRead
                    {
                     before(grammarAccess.getCommandAccess().getReadParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRead();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getReadParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:534:2: ( ruleToString )
                    {
                    // InternalMyDsl.g:534:2: ( ruleToString )
                    // InternalMyDsl.g:535:3: ruleToString
                    {
                     before(grammarAccess.getCommandAccess().getToStringParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleToString();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getToStringParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:540:2: ( ruleToJSON )
                    {
                    // InternalMyDsl.g:540:2: ( ruleToJSON )
                    // InternalMyDsl.g:541:3: ruleToJSON
                    {
                     before(grammarAccess.getCommandAccess().getToJSONParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleToJSON();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getToJSONParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:546:2: ( ruleToCSV )
                    {
                    // InternalMyDsl.g:546:2: ( ruleToCSV )
                    // InternalMyDsl.g:547:3: ruleToCSV
                    {
                     before(grammarAccess.getCommandAccess().getToCSVParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleToCSV();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getToCSVParserRuleCall_0_3()); 

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
    // $ANTLR end "rule__Command__Alternatives_0"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:556:1: rule__Expression__Alternatives : ( ( ruleBinExp ) | ( ruleValue ) | ( ruleEntity ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:560:1: ( ( ruleBinExp ) | ( ruleValue ) | ( ruleEntity ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==16||LA4_1==24||LA4_1==26) ) {
                    alt4=2;
                }
                else if ( (LA4_1==27) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 11:
            case 12:
            case 28:
                {
                alt4=2;
                }
                break;
            case 15:
            case 25:
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
                    // InternalMyDsl.g:561:2: ( ruleBinExp )
                    {
                    // InternalMyDsl.g:561:2: ( ruleBinExp )
                    // InternalMyDsl.g:562:3: ruleBinExp
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
                    // InternalMyDsl.g:567:2: ( ruleValue )
                    {
                    // InternalMyDsl.g:567:2: ( ruleValue )
                    // InternalMyDsl.g:568:3: ruleValue
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
                    // InternalMyDsl.g:573:2: ( ruleEntity )
                    {
                    // InternalMyDsl.g:573:2: ( ruleEntity )
                    // InternalMyDsl.g:574:3: ruleEntity
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
    // InternalMyDsl.g:583:1: rule__Entity__Alternatives : ( ( ruleJObject ) | ( ruleJArray ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:587:1: ( ( ruleJObject ) | ( ruleJArray ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:588:2: ( ruleJObject )
                    {
                    // InternalMyDsl.g:588:2: ( ruleJObject )
                    // InternalMyDsl.g:589:3: ruleJObject
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
                    // InternalMyDsl.g:594:2: ( ruleJArray )
                    {
                    // InternalMyDsl.g:594:2: ( ruleJArray )
                    // InternalMyDsl.g:595:3: ruleJArray
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
    // InternalMyDsl.g:604:1: rule__Value__Alternatives : ( ( ruleJsonString ) | ( ruleJsonBoolean ) | ( ruleJsonEmpty ) | ( ruleJsonInteger ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:608:1: ( ( ruleJsonString ) | ( ruleJsonBoolean ) | ( ruleJsonEmpty ) | ( ruleJsonInteger ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case 11:
            case 12:
                {
                alt6=2;
                }
                break;
            case 28:
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
                    // InternalMyDsl.g:609:2: ( ruleJsonString )
                    {
                    // InternalMyDsl.g:609:2: ( ruleJsonString )
                    // InternalMyDsl.g:610:3: ruleJsonString
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
                    // InternalMyDsl.g:615:2: ( ruleJsonBoolean )
                    {
                    // InternalMyDsl.g:615:2: ( ruleJsonBoolean )
                    // InternalMyDsl.g:616:3: ruleJsonBoolean
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
                    // InternalMyDsl.g:621:2: ( ruleJsonEmpty )
                    {
                    // InternalMyDsl.g:621:2: ( ruleJsonEmpty )
                    // InternalMyDsl.g:622:3: ruleJsonEmpty
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
                    // InternalMyDsl.g:627:2: ( ruleJsonInteger )
                    {
                    // InternalMyDsl.g:627:2: ( ruleJsonInteger )
                    // InternalMyDsl.g:628:3: ruleJsonInteger
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
    // InternalMyDsl.g:637:1: rule__JsonBoolean__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__JsonBoolean__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:642:2: ( 'true' )
                    {
                    // InternalMyDsl.g:642:2: ( 'true' )
                    // InternalMyDsl.g:643:3: 'true'
                    {
                     before(grammarAccess.getJsonBooleanAccess().getValTrueKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getJsonBooleanAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:648:2: ( 'false' )
                    {
                    // InternalMyDsl.g:648:2: ( 'false' )
                    // InternalMyDsl.g:649:3: 'false'
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


    // $ANTLR start "rule__Loadfile__Group_0__0"
    // InternalMyDsl.g:658:1: rule__Loadfile__Group_0__0 : rule__Loadfile__Group_0__0__Impl rule__Loadfile__Group_0__1 ;
    public final void rule__Loadfile__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:662:1: ( rule__Loadfile__Group_0__0__Impl rule__Loadfile__Group_0__1 )
            // InternalMyDsl.g:663:2: rule__Loadfile__Group_0__0__Impl rule__Loadfile__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Loadfile__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group_0__1();

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
    // $ANTLR end "rule__Loadfile__Group_0__0"


    // $ANTLR start "rule__Loadfile__Group_0__0__Impl"
    // InternalMyDsl.g:670:1: rule__Loadfile__Group_0__0__Impl : ( 'Load(' ) ;
    public final void rule__Loadfile__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( ( 'Load(' ) )
            // InternalMyDsl.g:675:1: ( 'Load(' )
            {
            // InternalMyDsl.g:675:1: ( 'Load(' )
            // InternalMyDsl.g:676:2: 'Load('
            {
             before(grammarAccess.getLoadfileAccess().getLoadKeyword_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getLoadKeyword_0_0()); 

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
    // $ANTLR end "rule__Loadfile__Group_0__0__Impl"


    // $ANTLR start "rule__Loadfile__Group_0__1"
    // InternalMyDsl.g:685:1: rule__Loadfile__Group_0__1 : rule__Loadfile__Group_0__1__Impl rule__Loadfile__Group_0__2 ;
    public final void rule__Loadfile__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:689:1: ( rule__Loadfile__Group_0__1__Impl rule__Loadfile__Group_0__2 )
            // InternalMyDsl.g:690:2: rule__Loadfile__Group_0__1__Impl rule__Loadfile__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Loadfile__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group_0__2();

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
    // $ANTLR end "rule__Loadfile__Group_0__1"


    // $ANTLR start "rule__Loadfile__Group_0__1__Impl"
    // InternalMyDsl.g:697:1: rule__Loadfile__Group_0__1__Impl : ( ( rule__Loadfile__PathAssignment_0_1 ) ) ;
    public final void rule__Loadfile__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( ( ( rule__Loadfile__PathAssignment_0_1 ) ) )
            // InternalMyDsl.g:702:1: ( ( rule__Loadfile__PathAssignment_0_1 ) )
            {
            // InternalMyDsl.g:702:1: ( ( rule__Loadfile__PathAssignment_0_1 ) )
            // InternalMyDsl.g:703:2: ( rule__Loadfile__PathAssignment_0_1 )
            {
             before(grammarAccess.getLoadfileAccess().getPathAssignment_0_1()); 
            // InternalMyDsl.g:704:2: ( rule__Loadfile__PathAssignment_0_1 )
            // InternalMyDsl.g:704:3: rule__Loadfile__PathAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Loadfile__PathAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadfileAccess().getPathAssignment_0_1()); 

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
    // $ANTLR end "rule__Loadfile__Group_0__1__Impl"


    // $ANTLR start "rule__Loadfile__Group_0__2"
    // InternalMyDsl.g:712:1: rule__Loadfile__Group_0__2 : rule__Loadfile__Group_0__2__Impl rule__Loadfile__Group_0__3 ;
    public final void rule__Loadfile__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:1: ( rule__Loadfile__Group_0__2__Impl rule__Loadfile__Group_0__3 )
            // InternalMyDsl.g:717:2: rule__Loadfile__Group_0__2__Impl rule__Loadfile__Group_0__3
            {
            pushFollow(FOLLOW_6);
            rule__Loadfile__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group_0__3();

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
    // $ANTLR end "rule__Loadfile__Group_0__2"


    // $ANTLR start "rule__Loadfile__Group_0__2__Impl"
    // InternalMyDsl.g:724:1: rule__Loadfile__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Loadfile__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( ( ')' ) )
            // InternalMyDsl.g:729:1: ( ')' )
            {
            // InternalMyDsl.g:729:1: ( ')' )
            // InternalMyDsl.g:730:2: ')'
            {
             before(grammarAccess.getLoadfileAccess().getRightParenthesisKeyword_0_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Loadfile__Group_0__2__Impl"


    // $ANTLR start "rule__Loadfile__Group_0__3"
    // InternalMyDsl.g:739:1: rule__Loadfile__Group_0__3 : rule__Loadfile__Group_0__3__Impl rule__Loadfile__Group_0__4 ;
    public final void rule__Loadfile__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:743:1: ( rule__Loadfile__Group_0__3__Impl rule__Loadfile__Group_0__4 )
            // InternalMyDsl.g:744:2: rule__Loadfile__Group_0__3__Impl rule__Loadfile__Group_0__4
            {
            pushFollow(FOLLOW_7);
            rule__Loadfile__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group_0__4();

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
    // $ANTLR end "rule__Loadfile__Group_0__3"


    // $ANTLR start "rule__Loadfile__Group_0__3__Impl"
    // InternalMyDsl.g:751:1: rule__Loadfile__Group_0__3__Impl : ( '{' ) ;
    public final void rule__Loadfile__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( ( '{' ) )
            // InternalMyDsl.g:756:1: ( '{' )
            {
            // InternalMyDsl.g:756:1: ( '{' )
            // InternalMyDsl.g:757:2: '{'
            {
             before(grammarAccess.getLoadfileAccess().getLeftCurlyBracketKeyword_0_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getLeftCurlyBracketKeyword_0_3()); 

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
    // $ANTLR end "rule__Loadfile__Group_0__3__Impl"


    // $ANTLR start "rule__Loadfile__Group_0__4"
    // InternalMyDsl.g:766:1: rule__Loadfile__Group_0__4 : rule__Loadfile__Group_0__4__Impl rule__Loadfile__Group_0__5 ;
    public final void rule__Loadfile__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( rule__Loadfile__Group_0__4__Impl rule__Loadfile__Group_0__5 )
            // InternalMyDsl.g:771:2: rule__Loadfile__Group_0__4__Impl rule__Loadfile__Group_0__5
            {
            pushFollow(FOLLOW_7);
            rule__Loadfile__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group_0__5();

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
    // $ANTLR end "rule__Loadfile__Group_0__4"


    // $ANTLR start "rule__Loadfile__Group_0__4__Impl"
    // InternalMyDsl.g:778:1: rule__Loadfile__Group_0__4__Impl : ( ( rule__Loadfile__CommandsAssignment_0_4 )* ) ;
    public final void rule__Loadfile__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( ( ( rule__Loadfile__CommandsAssignment_0_4 )* ) )
            // InternalMyDsl.g:783:1: ( ( rule__Loadfile__CommandsAssignment_0_4 )* )
            {
            // InternalMyDsl.g:783:1: ( ( rule__Loadfile__CommandsAssignment_0_4 )* )
            // InternalMyDsl.g:784:2: ( rule__Loadfile__CommandsAssignment_0_4 )*
            {
             before(grammarAccess.getLoadfileAccess().getCommandsAssignment_0_4()); 
            // InternalMyDsl.g:785:2: ( rule__Loadfile__CommandsAssignment_0_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:785:3: rule__Loadfile__CommandsAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Loadfile__CommandsAssignment_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLoadfileAccess().getCommandsAssignment_0_4()); 

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
    // $ANTLR end "rule__Loadfile__Group_0__4__Impl"


    // $ANTLR start "rule__Loadfile__Group_0__5"
    // InternalMyDsl.g:793:1: rule__Loadfile__Group_0__5 : rule__Loadfile__Group_0__5__Impl ;
    public final void rule__Loadfile__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:797:1: ( rule__Loadfile__Group_0__5__Impl )
            // InternalMyDsl.g:798:2: rule__Loadfile__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loadfile__Group_0__5__Impl();

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
    // $ANTLR end "rule__Loadfile__Group_0__5"


    // $ANTLR start "rule__Loadfile__Group_0__5__Impl"
    // InternalMyDsl.g:804:1: rule__Loadfile__Group_0__5__Impl : ( '}' ) ;
    public final void rule__Loadfile__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:808:1: ( ( '}' ) )
            // InternalMyDsl.g:809:1: ( '}' )
            {
            // InternalMyDsl.g:809:1: ( '}' )
            // InternalMyDsl.g:810:2: '}'
            {
             before(grammarAccess.getLoadfileAccess().getRightCurlyBracketKeyword_0_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getRightCurlyBracketKeyword_0_5()); 

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
    // $ANTLR end "rule__Loadfile__Group_0__5__Impl"


    // $ANTLR start "rule__Loadfile__Group_1__0"
    // InternalMyDsl.g:820:1: rule__Loadfile__Group_1__0 : rule__Loadfile__Group_1__0__Impl rule__Loadfile__Group_1__1 ;
    public final void rule__Loadfile__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( rule__Loadfile__Group_1__0__Impl rule__Loadfile__Group_1__1 )
            // InternalMyDsl.g:825:2: rule__Loadfile__Group_1__0__Impl rule__Loadfile__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Loadfile__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group_1__1();

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
    // $ANTLR end "rule__Loadfile__Group_1__0"


    // $ANTLR start "rule__Loadfile__Group_1__0__Impl"
    // InternalMyDsl.g:832:1: rule__Loadfile__Group_1__0__Impl : ( 'Write()' ) ;
    public final void rule__Loadfile__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( ( 'Write()' ) )
            // InternalMyDsl.g:837:1: ( 'Write()' )
            {
            // InternalMyDsl.g:837:1: ( 'Write()' )
            // InternalMyDsl.g:838:2: 'Write()'
            {
             before(grammarAccess.getLoadfileAccess().getWriteKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getWriteKeyword_1_0()); 

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
    // $ANTLR end "rule__Loadfile__Group_1__0__Impl"


    // $ANTLR start "rule__Loadfile__Group_1__1"
    // InternalMyDsl.g:847:1: rule__Loadfile__Group_1__1 : rule__Loadfile__Group_1__1__Impl rule__Loadfile__Group_1__2 ;
    public final void rule__Loadfile__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:851:1: ( rule__Loadfile__Group_1__1__Impl rule__Loadfile__Group_1__2 )
            // InternalMyDsl.g:852:2: rule__Loadfile__Group_1__1__Impl rule__Loadfile__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Loadfile__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group_1__2();

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
    // $ANTLR end "rule__Loadfile__Group_1__1"


    // $ANTLR start "rule__Loadfile__Group_1__1__Impl"
    // InternalMyDsl.g:859:1: rule__Loadfile__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Loadfile__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( ( '{' ) )
            // InternalMyDsl.g:864:1: ( '{' )
            {
            // InternalMyDsl.g:864:1: ( '{' )
            // InternalMyDsl.g:865:2: '{'
            {
             before(grammarAccess.getLoadfileAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getLeftCurlyBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__Loadfile__Group_1__1__Impl"


    // $ANTLR start "rule__Loadfile__Group_1__2"
    // InternalMyDsl.g:874:1: rule__Loadfile__Group_1__2 : rule__Loadfile__Group_1__2__Impl rule__Loadfile__Group_1__3 ;
    public final void rule__Loadfile__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:878:1: ( rule__Loadfile__Group_1__2__Impl rule__Loadfile__Group_1__3 )
            // InternalMyDsl.g:879:2: rule__Loadfile__Group_1__2__Impl rule__Loadfile__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__Loadfile__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group_1__3();

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
    // $ANTLR end "rule__Loadfile__Group_1__2"


    // $ANTLR start "rule__Loadfile__Group_1__2__Impl"
    // InternalMyDsl.g:886:1: rule__Loadfile__Group_1__2__Impl : ( ( rule__Loadfile__CommandsAssignment_1_2 )* ) ;
    public final void rule__Loadfile__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( ( ( rule__Loadfile__CommandsAssignment_1_2 )* ) )
            // InternalMyDsl.g:891:1: ( ( rule__Loadfile__CommandsAssignment_1_2 )* )
            {
            // InternalMyDsl.g:891:1: ( ( rule__Loadfile__CommandsAssignment_1_2 )* )
            // InternalMyDsl.g:892:2: ( rule__Loadfile__CommandsAssignment_1_2 )*
            {
             before(grammarAccess.getLoadfileAccess().getCommandsAssignment_1_2()); 
            // InternalMyDsl.g:893:2: ( rule__Loadfile__CommandsAssignment_1_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=19 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:893:3: rule__Loadfile__CommandsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Loadfile__CommandsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLoadfileAccess().getCommandsAssignment_1_2()); 

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
    // $ANTLR end "rule__Loadfile__Group_1__2__Impl"


    // $ANTLR start "rule__Loadfile__Group_1__3"
    // InternalMyDsl.g:901:1: rule__Loadfile__Group_1__3 : rule__Loadfile__Group_1__3__Impl ;
    public final void rule__Loadfile__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:905:1: ( rule__Loadfile__Group_1__3__Impl )
            // InternalMyDsl.g:906:2: rule__Loadfile__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loadfile__Group_1__3__Impl();

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
    // $ANTLR end "rule__Loadfile__Group_1__3"


    // $ANTLR start "rule__Loadfile__Group_1__3__Impl"
    // InternalMyDsl.g:912:1: rule__Loadfile__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Loadfile__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( ( '}' ) )
            // InternalMyDsl.g:917:1: ( '}' )
            {
            // InternalMyDsl.g:917:1: ( '}' )
            // InternalMyDsl.g:918:2: '}'
            {
             before(grammarAccess.getLoadfileAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getRightCurlyBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__Loadfile__Group_1__3__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // InternalMyDsl.g:928:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalMyDsl.g:933:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__1();

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
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // InternalMyDsl.g:940:1: rule__Command__Group__0__Impl : ( ( rule__Command__Alternatives_0 ) ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( ( ( rule__Command__Alternatives_0 ) ) )
            // InternalMyDsl.g:945:1: ( ( rule__Command__Alternatives_0 ) )
            {
            // InternalMyDsl.g:945:1: ( ( rule__Command__Alternatives_0 ) )
            // InternalMyDsl.g:946:2: ( rule__Command__Alternatives_0 )
            {
             before(grammarAccess.getCommandAccess().getAlternatives_0()); 
            // InternalMyDsl.g:947:2: ( rule__Command__Alternatives_0 )
            // InternalMyDsl.g:947:3: rule__Command__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // InternalMyDsl.g:955:1: rule__Command__Group__1 : rule__Command__Group__1__Impl ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:959:1: ( rule__Command__Group__1__Impl )
            // InternalMyDsl.g:960:2: rule__Command__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__1__Impl();

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
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // InternalMyDsl.g:966:1: rule__Command__Group__1__Impl : ( ';' ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( ( ';' ) )
            // InternalMyDsl.g:971:1: ( ';' )
            {
            // InternalMyDsl.g:971:1: ( ';' )
            // InternalMyDsl.g:972:2: ';'
            {
             before(grammarAccess.getCommandAccess().getSemicolonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__Read__Group__0"
    // InternalMyDsl.g:982:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:986:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // InternalMyDsl.g:987:2: rule__Read__Group__0__Impl rule__Read__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Read__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__1();

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
    // $ANTLR end "rule__Read__Group__0"


    // $ANTLR start "rule__Read__Group__0__Impl"
    // InternalMyDsl.g:994:1: rule__Read__Group__0__Impl : ( 'Read(' ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( ( 'Read(' ) )
            // InternalMyDsl.g:999:1: ( 'Read(' )
            {
            // InternalMyDsl.g:999:1: ( 'Read(' )
            // InternalMyDsl.g:1000:2: 'Read('
            {
             before(grammarAccess.getReadAccess().getReadKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getReadKeyword_0()); 

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
    // $ANTLR end "rule__Read__Group__0__Impl"


    // $ANTLR start "rule__Read__Group__1"
    // InternalMyDsl.g:1009:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1013:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // InternalMyDsl.g:1014:2: rule__Read__Group__1__Impl rule__Read__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Read__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__2();

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
    // $ANTLR end "rule__Read__Group__1"


    // $ANTLR start "rule__Read__Group__1__Impl"
    // InternalMyDsl.g:1021:1: rule__Read__Group__1__Impl : ( ( rule__Read__PathAssignment_1 ) ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( ( ( rule__Read__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1026:1: ( ( rule__Read__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1026:1: ( ( rule__Read__PathAssignment_1 ) )
            // InternalMyDsl.g:1027:2: ( rule__Read__PathAssignment_1 )
            {
             before(grammarAccess.getReadAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1028:2: ( rule__Read__PathAssignment_1 )
            // InternalMyDsl.g:1028:3: rule__Read__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Read__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__Read__Group__1__Impl"


    // $ANTLR start "rule__Read__Group__2"
    // InternalMyDsl.g:1036:1: rule__Read__Group__2 : rule__Read__Group__2__Impl ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1040:1: ( rule__Read__Group__2__Impl )
            // InternalMyDsl.g:1041:2: rule__Read__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__2__Impl();

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
    // $ANTLR end "rule__Read__Group__2"


    // $ANTLR start "rule__Read__Group__2__Impl"
    // InternalMyDsl.g:1047:1: rule__Read__Group__2__Impl : ( ')' ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( ( ')' ) )
            // InternalMyDsl.g:1052:1: ( ')' )
            {
            // InternalMyDsl.g:1052:1: ( ')' )
            // InternalMyDsl.g:1053:2: ')'
            {
             before(grammarAccess.getReadAccess().getRightParenthesisKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Read__Group__2__Impl"


    // $ANTLR start "rule__ToString__Group__0"
    // InternalMyDsl.g:1063:1: rule__ToString__Group__0 : rule__ToString__Group__0__Impl rule__ToString__Group__1 ;
    public final void rule__ToString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1067:1: ( rule__ToString__Group__0__Impl rule__ToString__Group__1 )
            // InternalMyDsl.g:1068:2: rule__ToString__Group__0__Impl rule__ToString__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ToString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToString__Group__1();

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
    // $ANTLR end "rule__ToString__Group__0"


    // $ANTLR start "rule__ToString__Group__0__Impl"
    // InternalMyDsl.g:1075:1: rule__ToString__Group__0__Impl : ( 'ExportString(' ) ;
    public final void rule__ToString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( ( 'ExportString(' ) )
            // InternalMyDsl.g:1080:1: ( 'ExportString(' )
            {
            // InternalMyDsl.g:1080:1: ( 'ExportString(' )
            // InternalMyDsl.g:1081:2: 'ExportString('
            {
             before(grammarAccess.getToStringAccess().getExportStringKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getToStringAccess().getExportStringKeyword_0()); 

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
    // $ANTLR end "rule__ToString__Group__0__Impl"


    // $ANTLR start "rule__ToString__Group__1"
    // InternalMyDsl.g:1090:1: rule__ToString__Group__1 : rule__ToString__Group__1__Impl rule__ToString__Group__2 ;
    public final void rule__ToString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1094:1: ( rule__ToString__Group__1__Impl rule__ToString__Group__2 )
            // InternalMyDsl.g:1095:2: rule__ToString__Group__1__Impl rule__ToString__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ToString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToString__Group__2();

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
    // $ANTLR end "rule__ToString__Group__1"


    // $ANTLR start "rule__ToString__Group__1__Impl"
    // InternalMyDsl.g:1102:1: rule__ToString__Group__1__Impl : ( ( rule__ToString__PathAssignment_1 ) ) ;
    public final void rule__ToString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( ( ( rule__ToString__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1107:1: ( ( rule__ToString__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1107:1: ( ( rule__ToString__PathAssignment_1 ) )
            // InternalMyDsl.g:1108:2: ( rule__ToString__PathAssignment_1 )
            {
             before(grammarAccess.getToStringAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1109:2: ( rule__ToString__PathAssignment_1 )
            // InternalMyDsl.g:1109:3: rule__ToString__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ToString__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getToStringAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__ToString__Group__1__Impl"


    // $ANTLR start "rule__ToString__Group__2"
    // InternalMyDsl.g:1117:1: rule__ToString__Group__2 : rule__ToString__Group__2__Impl ;
    public final void rule__ToString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1121:1: ( rule__ToString__Group__2__Impl )
            // InternalMyDsl.g:1122:2: rule__ToString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToString__Group__2__Impl();

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
    // $ANTLR end "rule__ToString__Group__2"


    // $ANTLR start "rule__ToString__Group__2__Impl"
    // InternalMyDsl.g:1128:1: rule__ToString__Group__2__Impl : ( ')' ) ;
    public final void rule__ToString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( ( ')' ) )
            // InternalMyDsl.g:1133:1: ( ')' )
            {
            // InternalMyDsl.g:1133:1: ( ')' )
            // InternalMyDsl.g:1134:2: ')'
            {
             before(grammarAccess.getToStringAccess().getRightParenthesisKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getToStringAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ToString__Group__2__Impl"


    // $ANTLR start "rule__ToJSON__Group__0"
    // InternalMyDsl.g:1144:1: rule__ToJSON__Group__0 : rule__ToJSON__Group__0__Impl rule__ToJSON__Group__1 ;
    public final void rule__ToJSON__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1148:1: ( rule__ToJSON__Group__0__Impl rule__ToJSON__Group__1 )
            // InternalMyDsl.g:1149:2: rule__ToJSON__Group__0__Impl rule__ToJSON__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ToJSON__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToJSON__Group__1();

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
    // $ANTLR end "rule__ToJSON__Group__0"


    // $ANTLR start "rule__ToJSON__Group__0__Impl"
    // InternalMyDsl.g:1156:1: rule__ToJSON__Group__0__Impl : ( 'ExportJson(' ) ;
    public final void rule__ToJSON__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( ( 'ExportJson(' ) )
            // InternalMyDsl.g:1161:1: ( 'ExportJson(' )
            {
            // InternalMyDsl.g:1161:1: ( 'ExportJson(' )
            // InternalMyDsl.g:1162:2: 'ExportJson('
            {
             before(grammarAccess.getToJSONAccess().getExportJsonKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getToJSONAccess().getExportJsonKeyword_0()); 

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
    // $ANTLR end "rule__ToJSON__Group__0__Impl"


    // $ANTLR start "rule__ToJSON__Group__1"
    // InternalMyDsl.g:1171:1: rule__ToJSON__Group__1 : rule__ToJSON__Group__1__Impl rule__ToJSON__Group__2 ;
    public final void rule__ToJSON__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1175:1: ( rule__ToJSON__Group__1__Impl rule__ToJSON__Group__2 )
            // InternalMyDsl.g:1176:2: rule__ToJSON__Group__1__Impl rule__ToJSON__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ToJSON__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToJSON__Group__2();

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
    // $ANTLR end "rule__ToJSON__Group__1"


    // $ANTLR start "rule__ToJSON__Group__1__Impl"
    // InternalMyDsl.g:1183:1: rule__ToJSON__Group__1__Impl : ( ( rule__ToJSON__PathAssignment_1 ) ) ;
    public final void rule__ToJSON__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1187:1: ( ( ( rule__ToJSON__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1188:1: ( ( rule__ToJSON__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1188:1: ( ( rule__ToJSON__PathAssignment_1 ) )
            // InternalMyDsl.g:1189:2: ( rule__ToJSON__PathAssignment_1 )
            {
             before(grammarAccess.getToJSONAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1190:2: ( rule__ToJSON__PathAssignment_1 )
            // InternalMyDsl.g:1190:3: rule__ToJSON__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ToJSON__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getToJSONAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__ToJSON__Group__1__Impl"


    // $ANTLR start "rule__ToJSON__Group__2"
    // InternalMyDsl.g:1198:1: rule__ToJSON__Group__2 : rule__ToJSON__Group__2__Impl ;
    public final void rule__ToJSON__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1202:1: ( rule__ToJSON__Group__2__Impl )
            // InternalMyDsl.g:1203:2: rule__ToJSON__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToJSON__Group__2__Impl();

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
    // $ANTLR end "rule__ToJSON__Group__2"


    // $ANTLR start "rule__ToJSON__Group__2__Impl"
    // InternalMyDsl.g:1209:1: rule__ToJSON__Group__2__Impl : ( ')' ) ;
    public final void rule__ToJSON__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( ( ')' ) )
            // InternalMyDsl.g:1214:1: ( ')' )
            {
            // InternalMyDsl.g:1214:1: ( ')' )
            // InternalMyDsl.g:1215:2: ')'
            {
             before(grammarAccess.getToJSONAccess().getRightParenthesisKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getToJSONAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ToJSON__Group__2__Impl"


    // $ANTLR start "rule__ToCSV__Group__0"
    // InternalMyDsl.g:1225:1: rule__ToCSV__Group__0 : rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 ;
    public final void rule__ToCSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1229:1: ( rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 )
            // InternalMyDsl.g:1230:2: rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ToCSV__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToCSV__Group__1();

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
    // $ANTLR end "rule__ToCSV__Group__0"


    // $ANTLR start "rule__ToCSV__Group__0__Impl"
    // InternalMyDsl.g:1237:1: rule__ToCSV__Group__0__Impl : ( 'ExportCSV(' ) ;
    public final void rule__ToCSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:1: ( ( 'ExportCSV(' ) )
            // InternalMyDsl.g:1242:1: ( 'ExportCSV(' )
            {
            // InternalMyDsl.g:1242:1: ( 'ExportCSV(' )
            // InternalMyDsl.g:1243:2: 'ExportCSV('
            {
             before(grammarAccess.getToCSVAccess().getExportCSVKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getToCSVAccess().getExportCSVKeyword_0()); 

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
    // $ANTLR end "rule__ToCSV__Group__0__Impl"


    // $ANTLR start "rule__ToCSV__Group__1"
    // InternalMyDsl.g:1252:1: rule__ToCSV__Group__1 : rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 ;
    public final void rule__ToCSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1256:1: ( rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 )
            // InternalMyDsl.g:1257:2: rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ToCSV__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToCSV__Group__2();

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
    // $ANTLR end "rule__ToCSV__Group__1"


    // $ANTLR start "rule__ToCSV__Group__1__Impl"
    // InternalMyDsl.g:1264:1: rule__ToCSV__Group__1__Impl : ( ( rule__ToCSV__PathAssignment_1 ) ) ;
    public final void rule__ToCSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( ( ( rule__ToCSV__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1269:1: ( ( rule__ToCSV__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1269:1: ( ( rule__ToCSV__PathAssignment_1 ) )
            // InternalMyDsl.g:1270:2: ( rule__ToCSV__PathAssignment_1 )
            {
             before(grammarAccess.getToCSVAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1271:2: ( rule__ToCSV__PathAssignment_1 )
            // InternalMyDsl.g:1271:3: rule__ToCSV__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ToCSV__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getToCSVAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__ToCSV__Group__1__Impl"


    // $ANTLR start "rule__ToCSV__Group__2"
    // InternalMyDsl.g:1279:1: rule__ToCSV__Group__2 : rule__ToCSV__Group__2__Impl ;
    public final void rule__ToCSV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1283:1: ( rule__ToCSV__Group__2__Impl )
            // InternalMyDsl.g:1284:2: rule__ToCSV__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToCSV__Group__2__Impl();

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
    // $ANTLR end "rule__ToCSV__Group__2"


    // $ANTLR start "rule__ToCSV__Group__2__Impl"
    // InternalMyDsl.g:1290:1: rule__ToCSV__Group__2__Impl : ( ')' ) ;
    public final void rule__ToCSV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( ( ')' ) )
            // InternalMyDsl.g:1295:1: ( ')' )
            {
            // InternalMyDsl.g:1295:1: ( ')' )
            // InternalMyDsl.g:1296:2: ')'
            {
             before(grammarAccess.getToCSVAccess().getRightParenthesisKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getToCSVAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ToCSV__Group__2__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalMyDsl.g:1306:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1310:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalMyDsl.g:1311:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1318:1: rule__Element__Group__0__Impl : ( ( rule__Element__KeyAssignment_0 ) ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( ( ( rule__Element__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1323:1: ( ( rule__Element__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1323:1: ( ( rule__Element__KeyAssignment_0 ) )
            // InternalMyDsl.g:1324:2: ( rule__Element__KeyAssignment_0 )
            {
             before(grammarAccess.getElementAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1325:2: ( rule__Element__KeyAssignment_0 )
            // InternalMyDsl.g:1325:3: rule__Element__KeyAssignment_0
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
    // InternalMyDsl.g:1333:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1337:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalMyDsl.g:1338:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1345:1: rule__Element__Group__1__Impl : ( ':' ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1349:1: ( ( ':' ) )
            // InternalMyDsl.g:1350:1: ( ':' )
            {
            // InternalMyDsl.g:1350:1: ( ':' )
            // InternalMyDsl.g:1351:2: ':'
            {
             before(grammarAccess.getElementAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1360:1: rule__Element__Group__2 : rule__Element__Group__2__Impl ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( rule__Element__Group__2__Impl )
            // InternalMyDsl.g:1365:2: rule__Element__Group__2__Impl
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
    // InternalMyDsl.g:1371:1: rule__Element__Group__2__Impl : ( ( rule__Element__ValueAssignment_2 ) ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( ( ( rule__Element__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:1376:1: ( ( rule__Element__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:1376:1: ( ( rule__Element__ValueAssignment_2 ) )
            // InternalMyDsl.g:1377:2: ( rule__Element__ValueAssignment_2 )
            {
             before(grammarAccess.getElementAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:1378:2: ( rule__Element__ValueAssignment_2 )
            // InternalMyDsl.g:1378:3: rule__Element__ValueAssignment_2
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
    // InternalMyDsl.g:1387:1: rule__JObject__Group__0 : rule__JObject__Group__0__Impl rule__JObject__Group__1 ;
    public final void rule__JObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( rule__JObject__Group__0__Impl rule__JObject__Group__1 )
            // InternalMyDsl.g:1392:2: rule__JObject__Group__0__Impl rule__JObject__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1399:1: rule__JObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1403:1: ( ( '{' ) )
            // InternalMyDsl.g:1404:1: ( '{' )
            {
            // InternalMyDsl.g:1404:1: ( '{' )
            // InternalMyDsl.g:1405:2: '{'
            {
             before(grammarAccess.getJObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:1414:1: rule__JObject__Group__1 : rule__JObject__Group__1__Impl rule__JObject__Group__2 ;
    public final void rule__JObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( rule__JObject__Group__1__Impl rule__JObject__Group__2 )
            // InternalMyDsl.g:1419:2: rule__JObject__Group__1__Impl rule__JObject__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1426:1: rule__JObject__Group__1__Impl : ( ( rule__JObject__Group_1__0 )? ) ;
    public final void rule__JObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1430:1: ( ( ( rule__JObject__Group_1__0 )? ) )
            // InternalMyDsl.g:1431:1: ( ( rule__JObject__Group_1__0 )? )
            {
            // InternalMyDsl.g:1431:1: ( ( rule__JObject__Group_1__0 )? )
            // InternalMyDsl.g:1432:2: ( rule__JObject__Group_1__0 )?
            {
             before(grammarAccess.getJObjectAccess().getGroup_1()); 
            // InternalMyDsl.g:1433:2: ( rule__JObject__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1433:3: rule__JObject__Group_1__0
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
    // InternalMyDsl.g:1441:1: rule__JObject__Group__2 : rule__JObject__Group__2__Impl ;
    public final void rule__JObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( rule__JObject__Group__2__Impl )
            // InternalMyDsl.g:1446:2: rule__JObject__Group__2__Impl
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
    // InternalMyDsl.g:1452:1: rule__JObject__Group__2__Impl : ( '}' ) ;
    public final void rule__JObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( ( '}' ) )
            // InternalMyDsl.g:1457:1: ( '}' )
            {
            // InternalMyDsl.g:1457:1: ( '}' )
            // InternalMyDsl.g:1458:2: '}'
            {
             before(grammarAccess.getJObjectAccess().getRightCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1468:1: rule__JObject__Group_1__0 : rule__JObject__Group_1__0__Impl rule__JObject__Group_1__1 ;
    public final void rule__JObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1472:1: ( rule__JObject__Group_1__0__Impl rule__JObject__Group_1__1 )
            // InternalMyDsl.g:1473:2: rule__JObject__Group_1__0__Impl rule__JObject__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1480:1: rule__JObject__Group_1__0__Impl : ( ( rule__JObject__ElementAssignment_1_0 ) ) ;
    public final void rule__JObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( ( ( rule__JObject__ElementAssignment_1_0 ) ) )
            // InternalMyDsl.g:1485:1: ( ( rule__JObject__ElementAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1485:1: ( ( rule__JObject__ElementAssignment_1_0 ) )
            // InternalMyDsl.g:1486:2: ( rule__JObject__ElementAssignment_1_0 )
            {
             before(grammarAccess.getJObjectAccess().getElementAssignment_1_0()); 
            // InternalMyDsl.g:1487:2: ( rule__JObject__ElementAssignment_1_0 )
            // InternalMyDsl.g:1487:3: rule__JObject__ElementAssignment_1_0
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
    // InternalMyDsl.g:1495:1: rule__JObject__Group_1__1 : rule__JObject__Group_1__1__Impl ;
    public final void rule__JObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( rule__JObject__Group_1__1__Impl )
            // InternalMyDsl.g:1500:2: rule__JObject__Group_1__1__Impl
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
    // InternalMyDsl.g:1506:1: rule__JObject__Group_1__1__Impl : ( ( rule__JObject__Group_1_1__0 )* ) ;
    public final void rule__JObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( ( ( rule__JObject__Group_1_1__0 )* ) )
            // InternalMyDsl.g:1511:1: ( ( rule__JObject__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:1511:1: ( ( rule__JObject__Group_1_1__0 )* )
            // InternalMyDsl.g:1512:2: ( rule__JObject__Group_1_1__0 )*
            {
             before(grammarAccess.getJObjectAccess().getGroup_1_1()); 
            // InternalMyDsl.g:1513:2: ( rule__JObject__Group_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1513:3: rule__JObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__JObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:1522:1: rule__JObject__Group_1_1__0 : rule__JObject__Group_1_1__0__Impl rule__JObject__Group_1_1__1 ;
    public final void rule__JObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1526:1: ( rule__JObject__Group_1_1__0__Impl rule__JObject__Group_1_1__1 )
            // InternalMyDsl.g:1527:2: rule__JObject__Group_1_1__0__Impl rule__JObject__Group_1_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1534:1: rule__JObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__JObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1538:1: ( ( ',' ) )
            // InternalMyDsl.g:1539:1: ( ',' )
            {
            // InternalMyDsl.g:1539:1: ( ',' )
            // InternalMyDsl.g:1540:2: ','
            {
             before(grammarAccess.getJObjectAccess().getCommaKeyword_1_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1549:1: rule__JObject__Group_1_1__1 : rule__JObject__Group_1_1__1__Impl ;
    public final void rule__JObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( rule__JObject__Group_1_1__1__Impl )
            // InternalMyDsl.g:1554:2: rule__JObject__Group_1_1__1__Impl
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
    // InternalMyDsl.g:1560:1: rule__JObject__Group_1_1__1__Impl : ( ( rule__JObject__ElementAssignment_1_1_1 ) ) ;
    public final void rule__JObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( ( ( rule__JObject__ElementAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:1565:1: ( ( rule__JObject__ElementAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:1565:1: ( ( rule__JObject__ElementAssignment_1_1_1 ) )
            // InternalMyDsl.g:1566:2: ( rule__JObject__ElementAssignment_1_1_1 )
            {
             before(grammarAccess.getJObjectAccess().getElementAssignment_1_1_1()); 
            // InternalMyDsl.g:1567:2: ( rule__JObject__ElementAssignment_1_1_1 )
            // InternalMyDsl.g:1567:3: rule__JObject__ElementAssignment_1_1_1
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
    // InternalMyDsl.g:1576:1: rule__JArray__Group__0 : rule__JArray__Group__0__Impl rule__JArray__Group__1 ;
    public final void rule__JArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1580:1: ( rule__JArray__Group__0__Impl rule__JArray__Group__1 )
            // InternalMyDsl.g:1581:2: rule__JArray__Group__0__Impl rule__JArray__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1588:1: rule__JArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1592:1: ( ( '[' ) )
            // InternalMyDsl.g:1593:1: ( '[' )
            {
            // InternalMyDsl.g:1593:1: ( '[' )
            // InternalMyDsl.g:1594:2: '['
            {
             before(grammarAccess.getJArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1603:1: rule__JArray__Group__1 : rule__JArray__Group__1__Impl rule__JArray__Group__2 ;
    public final void rule__JArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1607:1: ( rule__JArray__Group__1__Impl rule__JArray__Group__2 )
            // InternalMyDsl.g:1608:2: rule__JArray__Group__1__Impl rule__JArray__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1615:1: rule__JArray__Group__1__Impl : ( ( rule__JArray__Group_1__0 )? ) ;
    public final void rule__JArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( ( ( rule__JArray__Group_1__0 )? ) )
            // InternalMyDsl.g:1620:1: ( ( rule__JArray__Group_1__0 )? )
            {
            // InternalMyDsl.g:1620:1: ( ( rule__JArray__Group_1__0 )? )
            // InternalMyDsl.g:1621:2: ( rule__JArray__Group_1__0 )?
            {
             before(grammarAccess.getJArrayAccess().getGroup_1()); 
            // InternalMyDsl.g:1622:2: ( rule__JArray__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_INT)||(LA12_0>=11 && LA12_0<=12)||LA12_0==15||LA12_0==25||LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1622:3: rule__JArray__Group_1__0
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
    // InternalMyDsl.g:1630:1: rule__JArray__Group__2 : rule__JArray__Group__2__Impl ;
    public final void rule__JArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1634:1: ( rule__JArray__Group__2__Impl )
            // InternalMyDsl.g:1635:2: rule__JArray__Group__2__Impl
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
    // InternalMyDsl.g:1641:1: rule__JArray__Group__2__Impl : ( ']' ) ;
    public final void rule__JArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( ( ']' ) )
            // InternalMyDsl.g:1646:1: ( ']' )
            {
            // InternalMyDsl.g:1646:1: ( ']' )
            // InternalMyDsl.g:1647:2: ']'
            {
             before(grammarAccess.getJArrayAccess().getRightSquareBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1657:1: rule__JArray__Group_1__0 : rule__JArray__Group_1__0__Impl rule__JArray__Group_1__1 ;
    public final void rule__JArray__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1661:1: ( rule__JArray__Group_1__0__Impl rule__JArray__Group_1__1 )
            // InternalMyDsl.g:1662:2: rule__JArray__Group_1__0__Impl rule__JArray__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1669:1: rule__JArray__Group_1__0__Impl : ( ( rule__JArray__ExpressionAssignment_1_0 ) ) ;
    public final void rule__JArray__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1673:1: ( ( ( rule__JArray__ExpressionAssignment_1_0 ) ) )
            // InternalMyDsl.g:1674:1: ( ( rule__JArray__ExpressionAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1674:1: ( ( rule__JArray__ExpressionAssignment_1_0 ) )
            // InternalMyDsl.g:1675:2: ( rule__JArray__ExpressionAssignment_1_0 )
            {
             before(grammarAccess.getJArrayAccess().getExpressionAssignment_1_0()); 
            // InternalMyDsl.g:1676:2: ( rule__JArray__ExpressionAssignment_1_0 )
            // InternalMyDsl.g:1676:3: rule__JArray__ExpressionAssignment_1_0
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
    // InternalMyDsl.g:1684:1: rule__JArray__Group_1__1 : rule__JArray__Group_1__1__Impl ;
    public final void rule__JArray__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( rule__JArray__Group_1__1__Impl )
            // InternalMyDsl.g:1689:2: rule__JArray__Group_1__1__Impl
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
    // InternalMyDsl.g:1695:1: rule__JArray__Group_1__1__Impl : ( ( rule__JArray__Group_1_1__0 )* ) ;
    public final void rule__JArray__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( ( ( rule__JArray__Group_1_1__0 )* ) )
            // InternalMyDsl.g:1700:1: ( ( rule__JArray__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:1700:1: ( ( rule__JArray__Group_1_1__0 )* )
            // InternalMyDsl.g:1701:2: ( rule__JArray__Group_1_1__0 )*
            {
             before(grammarAccess.getJArrayAccess().getGroup_1_1()); 
            // InternalMyDsl.g:1702:2: ( rule__JArray__Group_1_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1702:3: rule__JArray__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__JArray__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:1711:1: rule__JArray__Group_1_1__0 : rule__JArray__Group_1_1__0__Impl rule__JArray__Group_1_1__1 ;
    public final void rule__JArray__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1715:1: ( rule__JArray__Group_1_1__0__Impl rule__JArray__Group_1_1__1 )
            // InternalMyDsl.g:1716:2: rule__JArray__Group_1_1__0__Impl rule__JArray__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1723:1: rule__JArray__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__JArray__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1727:1: ( ( ',' ) )
            // InternalMyDsl.g:1728:1: ( ',' )
            {
            // InternalMyDsl.g:1728:1: ( ',' )
            // InternalMyDsl.g:1729:2: ','
            {
             before(grammarAccess.getJArrayAccess().getCommaKeyword_1_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1738:1: rule__JArray__Group_1_1__1 : rule__JArray__Group_1_1__1__Impl ;
    public final void rule__JArray__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1742:1: ( rule__JArray__Group_1_1__1__Impl )
            // InternalMyDsl.g:1743:2: rule__JArray__Group_1_1__1__Impl
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
    // InternalMyDsl.g:1749:1: rule__JArray__Group_1_1__1__Impl : ( ( rule__JArray__ExpressionAssignment_1_1_1 ) ) ;
    public final void rule__JArray__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( ( ( rule__JArray__ExpressionAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:1754:1: ( ( rule__JArray__ExpressionAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:1754:1: ( ( rule__JArray__ExpressionAssignment_1_1_1 ) )
            // InternalMyDsl.g:1755:2: ( rule__JArray__ExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getJArrayAccess().getExpressionAssignment_1_1_1()); 
            // InternalMyDsl.g:1756:2: ( rule__JArray__ExpressionAssignment_1_1_1 )
            // InternalMyDsl.g:1756:3: rule__JArray__ExpressionAssignment_1_1_1
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
    // InternalMyDsl.g:1765:1: rule__BinExp__Group__0 : rule__BinExp__Group__0__Impl rule__BinExp__Group__1 ;
    public final void rule__BinExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1769:1: ( rule__BinExp__Group__0__Impl rule__BinExp__Group__1 )
            // InternalMyDsl.g:1770:2: rule__BinExp__Group__0__Impl rule__BinExp__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1777:1: rule__BinExp__Group__0__Impl : ( ( rule__BinExp__ValAssignment_0 ) ) ;
    public final void rule__BinExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1781:1: ( ( ( rule__BinExp__ValAssignment_0 ) ) )
            // InternalMyDsl.g:1782:1: ( ( rule__BinExp__ValAssignment_0 ) )
            {
            // InternalMyDsl.g:1782:1: ( ( rule__BinExp__ValAssignment_0 ) )
            // InternalMyDsl.g:1783:2: ( rule__BinExp__ValAssignment_0 )
            {
             before(grammarAccess.getBinExpAccess().getValAssignment_0()); 
            // InternalMyDsl.g:1784:2: ( rule__BinExp__ValAssignment_0 )
            // InternalMyDsl.g:1784:3: rule__BinExp__ValAssignment_0
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
    // InternalMyDsl.g:1792:1: rule__BinExp__Group__1 : rule__BinExp__Group__1__Impl rule__BinExp__Group__2 ;
    public final void rule__BinExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1796:1: ( rule__BinExp__Group__1__Impl rule__BinExp__Group__2 )
            // InternalMyDsl.g:1797:2: rule__BinExp__Group__1__Impl rule__BinExp__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1804:1: rule__BinExp__Group__1__Impl : ( '+' ) ;
    public final void rule__BinExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1808:1: ( ( '+' ) )
            // InternalMyDsl.g:1809:1: ( '+' )
            {
            // InternalMyDsl.g:1809:1: ( '+' )
            // InternalMyDsl.g:1810:2: '+'
            {
             before(grammarAccess.getBinExpAccess().getPlusSignKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:1819:1: rule__BinExp__Group__2 : rule__BinExp__Group__2__Impl ;
    public final void rule__BinExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1823:1: ( rule__BinExp__Group__2__Impl )
            // InternalMyDsl.g:1824:2: rule__BinExp__Group__2__Impl
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
    // InternalMyDsl.g:1830:1: rule__BinExp__Group__2__Impl : ( ( rule__BinExp__RvalAssignment_2 ) ) ;
    public final void rule__BinExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( ( ( rule__BinExp__RvalAssignment_2 ) ) )
            // InternalMyDsl.g:1835:1: ( ( rule__BinExp__RvalAssignment_2 ) )
            {
            // InternalMyDsl.g:1835:1: ( ( rule__BinExp__RvalAssignment_2 ) )
            // InternalMyDsl.g:1836:2: ( rule__BinExp__RvalAssignment_2 )
            {
             before(grammarAccess.getBinExpAccess().getRvalAssignment_2()); 
            // InternalMyDsl.g:1837:2: ( rule__BinExp__RvalAssignment_2 )
            // InternalMyDsl.g:1837:3: rule__BinExp__RvalAssignment_2
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


    // $ANTLR start "rule__Programme__LoadfilesAssignment"
    // InternalMyDsl.g:1846:1: rule__Programme__LoadfilesAssignment : ( ruleLoadfile ) ;
    public final void rule__Programme__LoadfilesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1850:1: ( ( ruleLoadfile ) )
            // InternalMyDsl.g:1851:2: ( ruleLoadfile )
            {
            // InternalMyDsl.g:1851:2: ( ruleLoadfile )
            // InternalMyDsl.g:1852:3: ruleLoadfile
            {
             before(grammarAccess.getProgrammeAccess().getLoadfilesLoadfileParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLoadfile();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getLoadfilesLoadfileParserRuleCall_0()); 

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
    // $ANTLR end "rule__Programme__LoadfilesAssignment"


    // $ANTLR start "rule__Loadfile__PathAssignment_0_1"
    // InternalMyDsl.g:1861:1: rule__Loadfile__PathAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Loadfile__PathAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1865:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1866:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1866:2: ( RULE_STRING )
            // InternalMyDsl.g:1867:3: RULE_STRING
            {
             before(grammarAccess.getLoadfileAccess().getPathSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getPathSTRINGTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Loadfile__PathAssignment_0_1"


    // $ANTLR start "rule__Loadfile__CommandsAssignment_0_4"
    // InternalMyDsl.g:1876:1: rule__Loadfile__CommandsAssignment_0_4 : ( ruleCommand ) ;
    public final void rule__Loadfile__CommandsAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:1881:2: ( ruleCommand )
            {
            // InternalMyDsl.g:1881:2: ( ruleCommand )
            // InternalMyDsl.g:1882:3: ruleCommand
            {
             before(grammarAccess.getLoadfileAccess().getCommandsCommandParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getLoadfileAccess().getCommandsCommandParserRuleCall_0_4_0()); 

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
    // $ANTLR end "rule__Loadfile__CommandsAssignment_0_4"


    // $ANTLR start "rule__Loadfile__CommandsAssignment_1_2"
    // InternalMyDsl.g:1891:1: rule__Loadfile__CommandsAssignment_1_2 : ( ruleCommand ) ;
    public final void rule__Loadfile__CommandsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:1896:2: ( ruleCommand )
            {
            // InternalMyDsl.g:1896:2: ( ruleCommand )
            // InternalMyDsl.g:1897:3: ruleCommand
            {
             before(grammarAccess.getLoadfileAccess().getCommandsCommandParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getLoadfileAccess().getCommandsCommandParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Loadfile__CommandsAssignment_1_2"


    // $ANTLR start "rule__Read__PathAssignment_1"
    // InternalMyDsl.g:1906:1: rule__Read__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Read__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1910:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1911:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1911:2: ( RULE_STRING )
            // InternalMyDsl.g:1912:3: RULE_STRING
            {
             before(grammarAccess.getReadAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getPathSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Read__PathAssignment_1"


    // $ANTLR start "rule__ToString__PathAssignment_1"
    // InternalMyDsl.g:1921:1: rule__ToString__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ToString__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1925:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1926:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1926:2: ( RULE_STRING )
            // InternalMyDsl.g:1927:3: RULE_STRING
            {
             before(grammarAccess.getToStringAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getToStringAccess().getPathSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ToString__PathAssignment_1"


    // $ANTLR start "rule__ToJSON__PathAssignment_1"
    // InternalMyDsl.g:1936:1: rule__ToJSON__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ToJSON__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1941:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1941:2: ( RULE_STRING )
            // InternalMyDsl.g:1942:3: RULE_STRING
            {
             before(grammarAccess.getToJSONAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getToJSONAccess().getPathSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ToJSON__PathAssignment_1"


    // $ANTLR start "rule__ToCSV__PathAssignment_1"
    // InternalMyDsl.g:1951:1: rule__ToCSV__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ToCSV__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1955:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1956:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1956:2: ( RULE_STRING )
            // InternalMyDsl.g:1957:3: RULE_STRING
            {
             before(grammarAccess.getToCSVAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getToCSVAccess().getPathSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ToCSV__PathAssignment_1"


    // $ANTLR start "rule__Element__KeyAssignment_0"
    // InternalMyDsl.g:1966:1: rule__Element__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Element__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1971:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1971:2: ( RULE_STRING )
            // InternalMyDsl.g:1972:3: RULE_STRING
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
    // InternalMyDsl.g:1981:1: rule__Element__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Element__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1985:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:1986:2: ( ruleExpression )
            {
            // InternalMyDsl.g:1986:2: ( ruleExpression )
            // InternalMyDsl.g:1987:3: ruleExpression
            {
             before(grammarAccess.getElementAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getElementAccess().getValueExpressionParserRuleCall_2_0()); 

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
    // InternalMyDsl.g:1996:1: rule__JsonString__ValAssignment : ( RULE_STRING ) ;
    public final void rule__JsonString__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2000:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2001:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2001:2: ( RULE_STRING )
            // InternalMyDsl.g:2002:3: RULE_STRING
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
    // InternalMyDsl.g:2011:1: rule__JsonBoolean__ValAssignment : ( ( rule__JsonBoolean__ValAlternatives_0 ) ) ;
    public final void rule__JsonBoolean__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( ( ( rule__JsonBoolean__ValAlternatives_0 ) ) )
            // InternalMyDsl.g:2016:2: ( ( rule__JsonBoolean__ValAlternatives_0 ) )
            {
            // InternalMyDsl.g:2016:2: ( ( rule__JsonBoolean__ValAlternatives_0 ) )
            // InternalMyDsl.g:2017:3: ( rule__JsonBoolean__ValAlternatives_0 )
            {
             before(grammarAccess.getJsonBooleanAccess().getValAlternatives_0()); 
            // InternalMyDsl.g:2018:3: ( rule__JsonBoolean__ValAlternatives_0 )
            // InternalMyDsl.g:2018:4: rule__JsonBoolean__ValAlternatives_0
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
    // InternalMyDsl.g:2026:1: rule__JsonEmpty__ValAssignment : ( ( 'null' ) ) ;
    public final void rule__JsonEmpty__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( ( ( 'null' ) ) )
            // InternalMyDsl.g:2031:2: ( ( 'null' ) )
            {
            // InternalMyDsl.g:2031:2: ( ( 'null' ) )
            // InternalMyDsl.g:2032:3: ( 'null' )
            {
             before(grammarAccess.getJsonEmptyAccess().getValNullKeyword_0()); 
            // InternalMyDsl.g:2033:3: ( 'null' )
            // InternalMyDsl.g:2034:4: 'null'
            {
             before(grammarAccess.getJsonEmptyAccess().getValNullKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2045:1: rule__JsonInteger__ValAssignment : ( RULE_INT ) ;
    public final void rule__JsonInteger__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2049:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2050:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2050:2: ( RULE_INT )
            // InternalMyDsl.g:2051:3: RULE_INT
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
    // InternalMyDsl.g:2060:1: rule__JObject__ElementAssignment_1_0 : ( ruleElement ) ;
    public final void rule__JObject__ElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2064:1: ( ( ruleElement ) )
            // InternalMyDsl.g:2065:2: ( ruleElement )
            {
            // InternalMyDsl.g:2065:2: ( ruleElement )
            // InternalMyDsl.g:2066:3: ruleElement
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
    // InternalMyDsl.g:2075:1: rule__JObject__ElementAssignment_1_1_1 : ( ruleElement ) ;
    public final void rule__JObject__ElementAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2079:1: ( ( ruleElement ) )
            // InternalMyDsl.g:2080:2: ( ruleElement )
            {
            // InternalMyDsl.g:2080:2: ( ruleElement )
            // InternalMyDsl.g:2081:3: ruleElement
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
    // InternalMyDsl.g:2090:1: rule__JArray__ExpressionAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__JArray__ExpressionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2094:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2095:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2095:2: ( ruleExpression )
            // InternalMyDsl.g:2096:3: ruleExpression
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
    // InternalMyDsl.g:2105:1: rule__JArray__ExpressionAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__JArray__ExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2110:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2110:2: ( ruleExpression )
            // InternalMyDsl.g:2111:3: ruleExpression
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
    // InternalMyDsl.g:2120:1: rule__BinExp__ValAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BinExp__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2124:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2125:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2125:2: ( RULE_STRING )
            // InternalMyDsl.g:2126:3: RULE_STRING
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
    // InternalMyDsl.g:2135:1: rule__BinExp__RvalAssignment_2 : ( RULE_STRING ) ;
    public final void rule__BinExp__RvalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2139:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2140:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2140:2: ( RULE_STRING )
            // InternalMyDsl.g:2141:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000790000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000012009830L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000016009830L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});

}