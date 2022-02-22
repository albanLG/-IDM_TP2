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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Load('", "')'", "'{'", "'}'", "';'", "'AddElement('", "'RemoveElement('", "'EditElement('", "','", "'ExportString('", "'ExportCSV('", "':'", "'['", "']'", "'+'", "'null'"
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

                if ( (LA1_0==13) ) {
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
    // InternalMyDsl.g:87:1: ruleLoadfile : ( ( rule__Loadfile__Group__0 ) ) ;
    public final void ruleLoadfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Loadfile__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Loadfile__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Loadfile__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Loadfile__Group__0 )
            {
             before(grammarAccess.getLoadfileAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Loadfile__Group__0 )
            // InternalMyDsl.g:94:4: rule__Loadfile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loadfile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadfileAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAddElement"
    // InternalMyDsl.g:128:1: entryRuleAddElement : ruleAddElement EOF ;
    public final void entryRuleAddElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAddElement EOF )
            // InternalMyDsl.g:130:1: ruleAddElement EOF
            {
             before(grammarAccess.getAddElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAddElement();

            state._fsp--;

             after(grammarAccess.getAddElementRule()); 
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
    // $ANTLR end "entryRuleAddElement"


    // $ANTLR start "ruleAddElement"
    // InternalMyDsl.g:137:1: ruleAddElement : ( ( rule__AddElement__Group__0 ) ) ;
    public final void ruleAddElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__AddElement__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__AddElement__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__AddElement__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__AddElement__Group__0 )
            {
             before(grammarAccess.getAddElementAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__AddElement__Group__0 )
            // InternalMyDsl.g:144:4: rule__AddElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddElementAccess().getGroup()); 

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
    // $ANTLR end "ruleAddElement"


    // $ANTLR start "entryRuleRemoveElement"
    // InternalMyDsl.g:153:1: entryRuleRemoveElement : ruleRemoveElement EOF ;
    public final void entryRuleRemoveElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleRemoveElement EOF )
            // InternalMyDsl.g:155:1: ruleRemoveElement EOF
            {
             before(grammarAccess.getRemoveElementRule()); 
            pushFollow(FOLLOW_1);
            ruleRemoveElement();

            state._fsp--;

             after(grammarAccess.getRemoveElementRule()); 
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
    // $ANTLR end "entryRuleRemoveElement"


    // $ANTLR start "ruleRemoveElement"
    // InternalMyDsl.g:162:1: ruleRemoveElement : ( ( rule__RemoveElement__Group__0 ) ) ;
    public final void ruleRemoveElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__RemoveElement__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__RemoveElement__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__RemoveElement__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__RemoveElement__Group__0 )
            {
             before(grammarAccess.getRemoveElementAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__RemoveElement__Group__0 )
            // InternalMyDsl.g:169:4: rule__RemoveElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveElementAccess().getGroup()); 

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
    // $ANTLR end "ruleRemoveElement"


    // $ANTLR start "entryRuleEditElement"
    // InternalMyDsl.g:178:1: entryRuleEditElement : ruleEditElement EOF ;
    public final void entryRuleEditElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleEditElement EOF )
            // InternalMyDsl.g:180:1: ruleEditElement EOF
            {
             before(grammarAccess.getEditElementRule()); 
            pushFollow(FOLLOW_1);
            ruleEditElement();

            state._fsp--;

             after(grammarAccess.getEditElementRule()); 
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
    // $ANTLR end "entryRuleEditElement"


    // $ANTLR start "ruleEditElement"
    // InternalMyDsl.g:187:1: ruleEditElement : ( ( rule__EditElement__Group__0 ) ) ;
    public final void ruleEditElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__EditElement__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__EditElement__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__EditElement__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__EditElement__Group__0 )
            {
             before(grammarAccess.getEditElementAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__EditElement__Group__0 )
            // InternalMyDsl.g:194:4: rule__EditElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EditElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEditElementAccess().getGroup()); 

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
    // $ANTLR end "ruleEditElement"


    // $ANTLR start "entryRuleToString"
    // InternalMyDsl.g:203:1: entryRuleToString : ruleToString EOF ;
    public final void entryRuleToString() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleToString EOF )
            // InternalMyDsl.g:205:1: ruleToString EOF
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
    // InternalMyDsl.g:212:1: ruleToString : ( ( rule__ToString__Group__0 ) ) ;
    public final void ruleToString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ToString__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ToString__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ToString__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__ToString__Group__0 )
            {
             before(grammarAccess.getToStringAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__ToString__Group__0 )
            // InternalMyDsl.g:219:4: rule__ToString__Group__0
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


    // $ANTLR start "entryRuleToCSV"
    // InternalMyDsl.g:228:1: entryRuleToCSV : ruleToCSV EOF ;
    public final void entryRuleToCSV() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleToCSV EOF )
            // InternalMyDsl.g:230:1: ruleToCSV EOF
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
    // InternalMyDsl.g:237:1: ruleToCSV : ( ( rule__ToCSV__Group__0 ) ) ;
    public final void ruleToCSV() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__ToCSV__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__ToCSV__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__ToCSV__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__ToCSV__Group__0 )
            {
             before(grammarAccess.getToCSVAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__ToCSV__Group__0 )
            // InternalMyDsl.g:244:4: rule__ToCSV__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleExpression EOF )
            // InternalMyDsl.g:255:1: ruleExpression EOF
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
    // InternalMyDsl.g:262:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:269:4: rule__Expression__Alternatives
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
    // InternalMyDsl.g:278:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleEntity EOF )
            // InternalMyDsl.g:280:1: ruleEntity EOF
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
    // InternalMyDsl.g:287:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Entity__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__Entity__Alternatives )
            // InternalMyDsl.g:294:4: rule__Entity__Alternatives
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
    // InternalMyDsl.g:303:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleElement EOF )
            // InternalMyDsl.g:305:1: ruleElement EOF
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
    // InternalMyDsl.g:312:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Element__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Element__Group__0 )
            // InternalMyDsl.g:319:4: rule__Element__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleValue EOF )
            // InternalMyDsl.g:330:1: ruleValue EOF
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
    // InternalMyDsl.g:337:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Value__Alternatives ) )
            // InternalMyDsl.g:343:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMyDsl.g:344:3: ( rule__Value__Alternatives )
            // InternalMyDsl.g:344:4: rule__Value__Alternatives
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
    // InternalMyDsl.g:353:1: entryRuleJsonString : ruleJsonString EOF ;
    public final void entryRuleJsonString() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleJsonString EOF )
            // InternalMyDsl.g:355:1: ruleJsonString EOF
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
    // InternalMyDsl.g:362:1: ruleJsonString : ( ( rule__JsonString__ValAssignment ) ) ;
    public final void ruleJsonString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__JsonString__ValAssignment ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__JsonString__ValAssignment ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__JsonString__ValAssignment ) )
            // InternalMyDsl.g:368:3: ( rule__JsonString__ValAssignment )
            {
             before(grammarAccess.getJsonStringAccess().getValAssignment()); 
            // InternalMyDsl.g:369:3: ( rule__JsonString__ValAssignment )
            // InternalMyDsl.g:369:4: rule__JsonString__ValAssignment
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
    // InternalMyDsl.g:378:1: entryRuleJsonBoolean : ruleJsonBoolean EOF ;
    public final void entryRuleJsonBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleJsonBoolean EOF )
            // InternalMyDsl.g:380:1: ruleJsonBoolean EOF
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
    // InternalMyDsl.g:387:1: ruleJsonBoolean : ( ( rule__JsonBoolean__ValAssignment ) ) ;
    public final void ruleJsonBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__JsonBoolean__ValAssignment ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__JsonBoolean__ValAssignment ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__JsonBoolean__ValAssignment ) )
            // InternalMyDsl.g:393:3: ( rule__JsonBoolean__ValAssignment )
            {
             before(grammarAccess.getJsonBooleanAccess().getValAssignment()); 
            // InternalMyDsl.g:394:3: ( rule__JsonBoolean__ValAssignment )
            // InternalMyDsl.g:394:4: rule__JsonBoolean__ValAssignment
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
    // InternalMyDsl.g:403:1: entryRuleJsonEmpty : ruleJsonEmpty EOF ;
    public final void entryRuleJsonEmpty() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleJsonEmpty EOF )
            // InternalMyDsl.g:405:1: ruleJsonEmpty EOF
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
    // InternalMyDsl.g:412:1: ruleJsonEmpty : ( ( rule__JsonEmpty__ValAssignment ) ) ;
    public final void ruleJsonEmpty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__JsonEmpty__ValAssignment ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__JsonEmpty__ValAssignment ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__JsonEmpty__ValAssignment ) )
            // InternalMyDsl.g:418:3: ( rule__JsonEmpty__ValAssignment )
            {
             before(grammarAccess.getJsonEmptyAccess().getValAssignment()); 
            // InternalMyDsl.g:419:3: ( rule__JsonEmpty__ValAssignment )
            // InternalMyDsl.g:419:4: rule__JsonEmpty__ValAssignment
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
    // InternalMyDsl.g:428:1: entryRuleJsonInteger : ruleJsonInteger EOF ;
    public final void entryRuleJsonInteger() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleJsonInteger EOF )
            // InternalMyDsl.g:430:1: ruleJsonInteger EOF
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
    // InternalMyDsl.g:437:1: ruleJsonInteger : ( ( rule__JsonInteger__ValAssignment ) ) ;
    public final void ruleJsonInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__JsonInteger__ValAssignment ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__JsonInteger__ValAssignment ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__JsonInteger__ValAssignment ) )
            // InternalMyDsl.g:443:3: ( rule__JsonInteger__ValAssignment )
            {
             before(grammarAccess.getJsonIntegerAccess().getValAssignment()); 
            // InternalMyDsl.g:444:3: ( rule__JsonInteger__ValAssignment )
            // InternalMyDsl.g:444:4: rule__JsonInteger__ValAssignment
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
    // InternalMyDsl.g:453:1: entryRuleJObject : ruleJObject EOF ;
    public final void entryRuleJObject() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleJObject EOF )
            // InternalMyDsl.g:455:1: ruleJObject EOF
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
    // InternalMyDsl.g:462:1: ruleJObject : ( ( rule__JObject__Group__0 ) ) ;
    public final void ruleJObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__JObject__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__JObject__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__JObject__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__JObject__Group__0 )
            {
             before(grammarAccess.getJObjectAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__JObject__Group__0 )
            // InternalMyDsl.g:469:4: rule__JObject__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleJArray : ruleJArray EOF ;
    public final void entryRuleJArray() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleJArray EOF )
            // InternalMyDsl.g:480:1: ruleJArray EOF
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
    // InternalMyDsl.g:487:1: ruleJArray : ( ( rule__JArray__Group__0 ) ) ;
    public final void ruleJArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__JArray__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__JArray__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__JArray__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__JArray__Group__0 )
            {
             before(grammarAccess.getJArrayAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__JArray__Group__0 )
            // InternalMyDsl.g:494:4: rule__JArray__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleBinExp : ruleBinExp EOF ;
    public final void entryRuleBinExp() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleBinExp EOF )
            // InternalMyDsl.g:505:1: ruleBinExp EOF
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
    // InternalMyDsl.g:512:1: ruleBinExp : ( ( rule__BinExp__Group__0 ) ) ;
    public final void ruleBinExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__BinExp__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__BinExp__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__BinExp__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__BinExp__Group__0 )
            {
             before(grammarAccess.getBinExpAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__BinExp__Group__0 )
            // InternalMyDsl.g:519:4: rule__BinExp__Group__0
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


    // $ANTLR start "rule__Command__Alternatives_0"
    // InternalMyDsl.g:527:1: rule__Command__Alternatives_0 : ( ( ruleEditElement ) | ( ruleAddElement ) | ( ruleRemoveElement ) | ( ruleToString ) | ( ruleToCSV ) );
    public final void rule__Command__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:531:1: ( ( ruleEditElement ) | ( ruleAddElement ) | ( ruleRemoveElement ) | ( ruleToString ) | ( ruleToCSV ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:532:2: ( ruleEditElement )
                    {
                    // InternalMyDsl.g:532:2: ( ruleEditElement )
                    // InternalMyDsl.g:533:3: ruleEditElement
                    {
                     before(grammarAccess.getCommandAccess().getEditElementParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEditElement();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getEditElementParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:538:2: ( ruleAddElement )
                    {
                    // InternalMyDsl.g:538:2: ( ruleAddElement )
                    // InternalMyDsl.g:539:3: ruleAddElement
                    {
                     before(grammarAccess.getCommandAccess().getAddElementParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAddElement();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getAddElementParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:544:2: ( ruleRemoveElement )
                    {
                    // InternalMyDsl.g:544:2: ( ruleRemoveElement )
                    // InternalMyDsl.g:545:3: ruleRemoveElement
                    {
                     before(grammarAccess.getCommandAccess().getRemoveElementParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRemoveElement();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRemoveElementParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:550:2: ( ruleToString )
                    {
                    // InternalMyDsl.g:550:2: ( ruleToString )
                    // InternalMyDsl.g:551:3: ruleToString
                    {
                     before(grammarAccess.getCommandAccess().getToStringParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleToString();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getToStringParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:556:2: ( ruleToCSV )
                    {
                    // InternalMyDsl.g:556:2: ( ruleToCSV )
                    // InternalMyDsl.g:557:3: ruleToCSV
                    {
                     before(grammarAccess.getCommandAccess().getToCSVParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleToCSV();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getToCSVParserRuleCall_0_4()); 

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
    // InternalMyDsl.g:566:1: rule__Expression__Alternatives : ( ( ruleBinExp ) | ( ruleValue ) | ( ruleEntity ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:570:1: ( ( ruleBinExp ) | ( ruleValue ) | ( ruleEntity ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==27) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==14||LA3_1==16||LA3_1==21||LA3_1==26) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 11:
            case 12:
            case 28:
                {
                alt3=2;
                }
                break;
            case 15:
            case 25:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:571:2: ( ruleBinExp )
                    {
                    // InternalMyDsl.g:571:2: ( ruleBinExp )
                    // InternalMyDsl.g:572:3: ruleBinExp
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
                    // InternalMyDsl.g:577:2: ( ruleValue )
                    {
                    // InternalMyDsl.g:577:2: ( ruleValue )
                    // InternalMyDsl.g:578:3: ruleValue
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
                    // InternalMyDsl.g:583:2: ( ruleEntity )
                    {
                    // InternalMyDsl.g:583:2: ( ruleEntity )
                    // InternalMyDsl.g:584:3: ruleEntity
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
    // InternalMyDsl.g:593:1: rule__Entity__Alternatives : ( ( ruleJObject ) | ( ruleJArray ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:597:1: ( ( ruleJObject ) | ( ruleJArray ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:598:2: ( ruleJObject )
                    {
                    // InternalMyDsl.g:598:2: ( ruleJObject )
                    // InternalMyDsl.g:599:3: ruleJObject
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
                    // InternalMyDsl.g:604:2: ( ruleJArray )
                    {
                    // InternalMyDsl.g:604:2: ( ruleJArray )
                    // InternalMyDsl.g:605:3: ruleJArray
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
    // InternalMyDsl.g:614:1: rule__Value__Alternatives : ( ( ruleJsonString ) | ( ruleJsonBoolean ) | ( ruleJsonEmpty ) | ( ruleJsonInteger ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:618:1: ( ( ruleJsonString ) | ( ruleJsonBoolean ) | ( ruleJsonEmpty ) | ( ruleJsonInteger ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case 11:
            case 12:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case RULE_INT:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:619:2: ( ruleJsonString )
                    {
                    // InternalMyDsl.g:619:2: ( ruleJsonString )
                    // InternalMyDsl.g:620:3: ruleJsonString
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
                    // InternalMyDsl.g:625:2: ( ruleJsonBoolean )
                    {
                    // InternalMyDsl.g:625:2: ( ruleJsonBoolean )
                    // InternalMyDsl.g:626:3: ruleJsonBoolean
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
                    // InternalMyDsl.g:631:2: ( ruleJsonEmpty )
                    {
                    // InternalMyDsl.g:631:2: ( ruleJsonEmpty )
                    // InternalMyDsl.g:632:3: ruleJsonEmpty
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
                    // InternalMyDsl.g:637:2: ( ruleJsonInteger )
                    {
                    // InternalMyDsl.g:637:2: ( ruleJsonInteger )
                    // InternalMyDsl.g:638:3: ruleJsonInteger
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
    // InternalMyDsl.g:647:1: rule__JsonBoolean__ValAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__JsonBoolean__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:652:2: ( 'true' )
                    {
                    // InternalMyDsl.g:652:2: ( 'true' )
                    // InternalMyDsl.g:653:3: 'true'
                    {
                     before(grammarAccess.getJsonBooleanAccess().getValTrueKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getJsonBooleanAccess().getValTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:658:2: ( 'false' )
                    {
                    // InternalMyDsl.g:658:2: ( 'false' )
                    // InternalMyDsl.g:659:3: 'false'
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


    // $ANTLR start "rule__Loadfile__Group__0"
    // InternalMyDsl.g:668:1: rule__Loadfile__Group__0 : rule__Loadfile__Group__0__Impl rule__Loadfile__Group__1 ;
    public final void rule__Loadfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:672:1: ( rule__Loadfile__Group__0__Impl rule__Loadfile__Group__1 )
            // InternalMyDsl.g:673:2: rule__Loadfile__Group__0__Impl rule__Loadfile__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Loadfile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group__1();

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
    // $ANTLR end "rule__Loadfile__Group__0"


    // $ANTLR start "rule__Loadfile__Group__0__Impl"
    // InternalMyDsl.g:680:1: rule__Loadfile__Group__0__Impl : ( 'Load(' ) ;
    public final void rule__Loadfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:684:1: ( ( 'Load(' ) )
            // InternalMyDsl.g:685:1: ( 'Load(' )
            {
            // InternalMyDsl.g:685:1: ( 'Load(' )
            // InternalMyDsl.g:686:2: 'Load('
            {
             before(grammarAccess.getLoadfileAccess().getLoadKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getLoadKeyword_0()); 

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
    // $ANTLR end "rule__Loadfile__Group__0__Impl"


    // $ANTLR start "rule__Loadfile__Group__1"
    // InternalMyDsl.g:695:1: rule__Loadfile__Group__1 : rule__Loadfile__Group__1__Impl rule__Loadfile__Group__2 ;
    public final void rule__Loadfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:699:1: ( rule__Loadfile__Group__1__Impl rule__Loadfile__Group__2 )
            // InternalMyDsl.g:700:2: rule__Loadfile__Group__1__Impl rule__Loadfile__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Loadfile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group__2();

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
    // $ANTLR end "rule__Loadfile__Group__1"


    // $ANTLR start "rule__Loadfile__Group__1__Impl"
    // InternalMyDsl.g:707:1: rule__Loadfile__Group__1__Impl : ( ( rule__Loadfile__PathAssignment_1 ) ) ;
    public final void rule__Loadfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( ( ( rule__Loadfile__PathAssignment_1 ) ) )
            // InternalMyDsl.g:712:1: ( ( rule__Loadfile__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:712:1: ( ( rule__Loadfile__PathAssignment_1 ) )
            // InternalMyDsl.g:713:2: ( rule__Loadfile__PathAssignment_1 )
            {
             before(grammarAccess.getLoadfileAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:714:2: ( rule__Loadfile__PathAssignment_1 )
            // InternalMyDsl.g:714:3: rule__Loadfile__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Loadfile__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadfileAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__Loadfile__Group__1__Impl"


    // $ANTLR start "rule__Loadfile__Group__2"
    // InternalMyDsl.g:722:1: rule__Loadfile__Group__2 : rule__Loadfile__Group__2__Impl rule__Loadfile__Group__3 ;
    public final void rule__Loadfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:726:1: ( rule__Loadfile__Group__2__Impl rule__Loadfile__Group__3 )
            // InternalMyDsl.g:727:2: rule__Loadfile__Group__2__Impl rule__Loadfile__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Loadfile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group__3();

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
    // $ANTLR end "rule__Loadfile__Group__2"


    // $ANTLR start "rule__Loadfile__Group__2__Impl"
    // InternalMyDsl.g:734:1: rule__Loadfile__Group__2__Impl : ( ')' ) ;
    public final void rule__Loadfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:738:1: ( ( ')' ) )
            // InternalMyDsl.g:739:1: ( ')' )
            {
            // InternalMyDsl.g:739:1: ( ')' )
            // InternalMyDsl.g:740:2: ')'
            {
             before(grammarAccess.getLoadfileAccess().getRightParenthesisKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Loadfile__Group__2__Impl"


    // $ANTLR start "rule__Loadfile__Group__3"
    // InternalMyDsl.g:749:1: rule__Loadfile__Group__3 : rule__Loadfile__Group__3__Impl rule__Loadfile__Group__4 ;
    public final void rule__Loadfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:753:1: ( rule__Loadfile__Group__3__Impl rule__Loadfile__Group__4 )
            // InternalMyDsl.g:754:2: rule__Loadfile__Group__3__Impl rule__Loadfile__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Loadfile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group__4();

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
    // $ANTLR end "rule__Loadfile__Group__3"


    // $ANTLR start "rule__Loadfile__Group__3__Impl"
    // InternalMyDsl.g:761:1: rule__Loadfile__Group__3__Impl : ( '{' ) ;
    public final void rule__Loadfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( ( '{' ) )
            // InternalMyDsl.g:766:1: ( '{' )
            {
            // InternalMyDsl.g:766:1: ( '{' )
            // InternalMyDsl.g:767:2: '{'
            {
             before(grammarAccess.getLoadfileAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Loadfile__Group__3__Impl"


    // $ANTLR start "rule__Loadfile__Group__4"
    // InternalMyDsl.g:776:1: rule__Loadfile__Group__4 : rule__Loadfile__Group__4__Impl rule__Loadfile__Group__5 ;
    public final void rule__Loadfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:780:1: ( rule__Loadfile__Group__4__Impl rule__Loadfile__Group__5 )
            // InternalMyDsl.g:781:2: rule__Loadfile__Group__4__Impl rule__Loadfile__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Loadfile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loadfile__Group__5();

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
    // $ANTLR end "rule__Loadfile__Group__4"


    // $ANTLR start "rule__Loadfile__Group__4__Impl"
    // InternalMyDsl.g:788:1: rule__Loadfile__Group__4__Impl : ( ( rule__Loadfile__CommandsAssignment_4 )* ) ;
    public final void rule__Loadfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:792:1: ( ( ( rule__Loadfile__CommandsAssignment_4 )* ) )
            // InternalMyDsl.g:793:1: ( ( rule__Loadfile__CommandsAssignment_4 )* )
            {
            // InternalMyDsl.g:793:1: ( ( rule__Loadfile__CommandsAssignment_4 )* )
            // InternalMyDsl.g:794:2: ( rule__Loadfile__CommandsAssignment_4 )*
            {
             before(grammarAccess.getLoadfileAccess().getCommandsAssignment_4()); 
            // InternalMyDsl.g:795:2: ( rule__Loadfile__CommandsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=20)||(LA7_0>=22 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:795:3: rule__Loadfile__CommandsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Loadfile__CommandsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLoadfileAccess().getCommandsAssignment_4()); 

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
    // $ANTLR end "rule__Loadfile__Group__4__Impl"


    // $ANTLR start "rule__Loadfile__Group__5"
    // InternalMyDsl.g:803:1: rule__Loadfile__Group__5 : rule__Loadfile__Group__5__Impl ;
    public final void rule__Loadfile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:807:1: ( rule__Loadfile__Group__5__Impl )
            // InternalMyDsl.g:808:2: rule__Loadfile__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loadfile__Group__5__Impl();

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
    // $ANTLR end "rule__Loadfile__Group__5"


    // $ANTLR start "rule__Loadfile__Group__5__Impl"
    // InternalMyDsl.g:814:1: rule__Loadfile__Group__5__Impl : ( '}' ) ;
    public final void rule__Loadfile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:818:1: ( ( '}' ) )
            // InternalMyDsl.g:819:1: ( '}' )
            {
            // InternalMyDsl.g:819:1: ( '}' )
            // InternalMyDsl.g:820:2: '}'
            {
             before(grammarAccess.getLoadfileAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Loadfile__Group__5__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // InternalMyDsl.g:830:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalMyDsl.g:835:2: rule__Command__Group__0__Impl rule__Command__Group__1
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
    // InternalMyDsl.g:842:1: rule__Command__Group__0__Impl : ( ( rule__Command__Alternatives_0 ) ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:846:1: ( ( ( rule__Command__Alternatives_0 ) ) )
            // InternalMyDsl.g:847:1: ( ( rule__Command__Alternatives_0 ) )
            {
            // InternalMyDsl.g:847:1: ( ( rule__Command__Alternatives_0 ) )
            // InternalMyDsl.g:848:2: ( rule__Command__Alternatives_0 )
            {
             before(grammarAccess.getCommandAccess().getAlternatives_0()); 
            // InternalMyDsl.g:849:2: ( rule__Command__Alternatives_0 )
            // InternalMyDsl.g:849:3: rule__Command__Alternatives_0
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
    // InternalMyDsl.g:857:1: rule__Command__Group__1 : rule__Command__Group__1__Impl ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:861:1: ( rule__Command__Group__1__Impl )
            // InternalMyDsl.g:862:2: rule__Command__Group__1__Impl
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
    // InternalMyDsl.g:868:1: rule__Command__Group__1__Impl : ( ';' ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( ( ';' ) )
            // InternalMyDsl.g:873:1: ( ';' )
            {
            // InternalMyDsl.g:873:1: ( ';' )
            // InternalMyDsl.g:874:2: ';'
            {
             before(grammarAccess.getCommandAccess().getSemicolonKeyword_1()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__AddElement__Group__0"
    // InternalMyDsl.g:884:1: rule__AddElement__Group__0 : rule__AddElement__Group__0__Impl rule__AddElement__Group__1 ;
    public final void rule__AddElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:888:1: ( rule__AddElement__Group__0__Impl rule__AddElement__Group__1 )
            // InternalMyDsl.g:889:2: rule__AddElement__Group__0__Impl rule__AddElement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AddElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddElement__Group__1();

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
    // $ANTLR end "rule__AddElement__Group__0"


    // $ANTLR start "rule__AddElement__Group__0__Impl"
    // InternalMyDsl.g:896:1: rule__AddElement__Group__0__Impl : ( 'AddElement(' ) ;
    public final void rule__AddElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:900:1: ( ( 'AddElement(' ) )
            // InternalMyDsl.g:901:1: ( 'AddElement(' )
            {
            // InternalMyDsl.g:901:1: ( 'AddElement(' )
            // InternalMyDsl.g:902:2: 'AddElement('
            {
             before(grammarAccess.getAddElementAccess().getAddElementKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAddElementAccess().getAddElementKeyword_0()); 

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
    // $ANTLR end "rule__AddElement__Group__0__Impl"


    // $ANTLR start "rule__AddElement__Group__1"
    // InternalMyDsl.g:911:1: rule__AddElement__Group__1 : rule__AddElement__Group__1__Impl rule__AddElement__Group__2 ;
    public final void rule__AddElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:915:1: ( rule__AddElement__Group__1__Impl rule__AddElement__Group__2 )
            // InternalMyDsl.g:916:2: rule__AddElement__Group__1__Impl rule__AddElement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AddElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddElement__Group__2();

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
    // $ANTLR end "rule__AddElement__Group__1"


    // $ANTLR start "rule__AddElement__Group__1__Impl"
    // InternalMyDsl.g:923:1: rule__AddElement__Group__1__Impl : ( ( rule__AddElement__ElementAssignment_1 ) ) ;
    public final void rule__AddElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:927:1: ( ( ( rule__AddElement__ElementAssignment_1 ) ) )
            // InternalMyDsl.g:928:1: ( ( rule__AddElement__ElementAssignment_1 ) )
            {
            // InternalMyDsl.g:928:1: ( ( rule__AddElement__ElementAssignment_1 ) )
            // InternalMyDsl.g:929:2: ( rule__AddElement__ElementAssignment_1 )
            {
             before(grammarAccess.getAddElementAccess().getElementAssignment_1()); 
            // InternalMyDsl.g:930:2: ( rule__AddElement__ElementAssignment_1 )
            // InternalMyDsl.g:930:3: rule__AddElement__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddElement__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddElementAccess().getElementAssignment_1()); 

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
    // $ANTLR end "rule__AddElement__Group__1__Impl"


    // $ANTLR start "rule__AddElement__Group__2"
    // InternalMyDsl.g:938:1: rule__AddElement__Group__2 : rule__AddElement__Group__2__Impl ;
    public final void rule__AddElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:942:1: ( rule__AddElement__Group__2__Impl )
            // InternalMyDsl.g:943:2: rule__AddElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddElement__Group__2__Impl();

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
    // $ANTLR end "rule__AddElement__Group__2"


    // $ANTLR start "rule__AddElement__Group__2__Impl"
    // InternalMyDsl.g:949:1: rule__AddElement__Group__2__Impl : ( ')' ) ;
    public final void rule__AddElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( ( ')' ) )
            // InternalMyDsl.g:954:1: ( ')' )
            {
            // InternalMyDsl.g:954:1: ( ')' )
            // InternalMyDsl.g:955:2: ')'
            {
             before(grammarAccess.getAddElementAccess().getRightParenthesisKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAddElementAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__AddElement__Group__2__Impl"


    // $ANTLR start "rule__RemoveElement__Group__0"
    // InternalMyDsl.g:965:1: rule__RemoveElement__Group__0 : rule__RemoveElement__Group__0__Impl rule__RemoveElement__Group__1 ;
    public final void rule__RemoveElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:969:1: ( rule__RemoveElement__Group__0__Impl rule__RemoveElement__Group__1 )
            // InternalMyDsl.g:970:2: rule__RemoveElement__Group__0__Impl rule__RemoveElement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RemoveElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveElement__Group__1();

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
    // $ANTLR end "rule__RemoveElement__Group__0"


    // $ANTLR start "rule__RemoveElement__Group__0__Impl"
    // InternalMyDsl.g:977:1: rule__RemoveElement__Group__0__Impl : ( 'RemoveElement(' ) ;
    public final void rule__RemoveElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( ( 'RemoveElement(' ) )
            // InternalMyDsl.g:982:1: ( 'RemoveElement(' )
            {
            // InternalMyDsl.g:982:1: ( 'RemoveElement(' )
            // InternalMyDsl.g:983:2: 'RemoveElement('
            {
             before(grammarAccess.getRemoveElementAccess().getRemoveElementKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRemoveElementAccess().getRemoveElementKeyword_0()); 

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
    // $ANTLR end "rule__RemoveElement__Group__0__Impl"


    // $ANTLR start "rule__RemoveElement__Group__1"
    // InternalMyDsl.g:992:1: rule__RemoveElement__Group__1 : rule__RemoveElement__Group__1__Impl rule__RemoveElement__Group__2 ;
    public final void rule__RemoveElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:996:1: ( rule__RemoveElement__Group__1__Impl rule__RemoveElement__Group__2 )
            // InternalMyDsl.g:997:2: rule__RemoveElement__Group__1__Impl rule__RemoveElement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RemoveElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveElement__Group__2();

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
    // $ANTLR end "rule__RemoveElement__Group__1"


    // $ANTLR start "rule__RemoveElement__Group__1__Impl"
    // InternalMyDsl.g:1004:1: rule__RemoveElement__Group__1__Impl : ( ( rule__RemoveElement__KeyAssignment_1 ) ) ;
    public final void rule__RemoveElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1008:1: ( ( ( rule__RemoveElement__KeyAssignment_1 ) ) )
            // InternalMyDsl.g:1009:1: ( ( rule__RemoveElement__KeyAssignment_1 ) )
            {
            // InternalMyDsl.g:1009:1: ( ( rule__RemoveElement__KeyAssignment_1 ) )
            // InternalMyDsl.g:1010:2: ( rule__RemoveElement__KeyAssignment_1 )
            {
             before(grammarAccess.getRemoveElementAccess().getKeyAssignment_1()); 
            // InternalMyDsl.g:1011:2: ( rule__RemoveElement__KeyAssignment_1 )
            // InternalMyDsl.g:1011:3: rule__RemoveElement__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveElement__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRemoveElementAccess().getKeyAssignment_1()); 

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
    // $ANTLR end "rule__RemoveElement__Group__1__Impl"


    // $ANTLR start "rule__RemoveElement__Group__2"
    // InternalMyDsl.g:1019:1: rule__RemoveElement__Group__2 : rule__RemoveElement__Group__2__Impl ;
    public final void rule__RemoveElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1023:1: ( rule__RemoveElement__Group__2__Impl )
            // InternalMyDsl.g:1024:2: rule__RemoveElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveElement__Group__2__Impl();

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
    // $ANTLR end "rule__RemoveElement__Group__2"


    // $ANTLR start "rule__RemoveElement__Group__2__Impl"
    // InternalMyDsl.g:1030:1: rule__RemoveElement__Group__2__Impl : ( ')' ) ;
    public final void rule__RemoveElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( ( ')' ) )
            // InternalMyDsl.g:1035:1: ( ')' )
            {
            // InternalMyDsl.g:1035:1: ( ')' )
            // InternalMyDsl.g:1036:2: ')'
            {
             before(grammarAccess.getRemoveElementAccess().getRightParenthesisKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRemoveElementAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__RemoveElement__Group__2__Impl"


    // $ANTLR start "rule__EditElement__Group__0"
    // InternalMyDsl.g:1046:1: rule__EditElement__Group__0 : rule__EditElement__Group__0__Impl rule__EditElement__Group__1 ;
    public final void rule__EditElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1050:1: ( rule__EditElement__Group__0__Impl rule__EditElement__Group__1 )
            // InternalMyDsl.g:1051:2: rule__EditElement__Group__0__Impl rule__EditElement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EditElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditElement__Group__1();

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
    // $ANTLR end "rule__EditElement__Group__0"


    // $ANTLR start "rule__EditElement__Group__0__Impl"
    // InternalMyDsl.g:1058:1: rule__EditElement__Group__0__Impl : ( 'EditElement(' ) ;
    public final void rule__EditElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( ( 'EditElement(' ) )
            // InternalMyDsl.g:1063:1: ( 'EditElement(' )
            {
            // InternalMyDsl.g:1063:1: ( 'EditElement(' )
            // InternalMyDsl.g:1064:2: 'EditElement('
            {
             before(grammarAccess.getEditElementAccess().getEditElementKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEditElementAccess().getEditElementKeyword_0()); 

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
    // $ANTLR end "rule__EditElement__Group__0__Impl"


    // $ANTLR start "rule__EditElement__Group__1"
    // InternalMyDsl.g:1073:1: rule__EditElement__Group__1 : rule__EditElement__Group__1__Impl rule__EditElement__Group__2 ;
    public final void rule__EditElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1077:1: ( rule__EditElement__Group__1__Impl rule__EditElement__Group__2 )
            // InternalMyDsl.g:1078:2: rule__EditElement__Group__1__Impl rule__EditElement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EditElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditElement__Group__2();

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
    // $ANTLR end "rule__EditElement__Group__1"


    // $ANTLR start "rule__EditElement__Group__1__Impl"
    // InternalMyDsl.g:1085:1: rule__EditElement__Group__1__Impl : ( ( rule__EditElement__KeyAssignment_1 ) ) ;
    public final void rule__EditElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( ( ( rule__EditElement__KeyAssignment_1 ) ) )
            // InternalMyDsl.g:1090:1: ( ( rule__EditElement__KeyAssignment_1 ) )
            {
            // InternalMyDsl.g:1090:1: ( ( rule__EditElement__KeyAssignment_1 ) )
            // InternalMyDsl.g:1091:2: ( rule__EditElement__KeyAssignment_1 )
            {
             before(grammarAccess.getEditElementAccess().getKeyAssignment_1()); 
            // InternalMyDsl.g:1092:2: ( rule__EditElement__KeyAssignment_1 )
            // InternalMyDsl.g:1092:3: rule__EditElement__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EditElement__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEditElementAccess().getKeyAssignment_1()); 

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
    // $ANTLR end "rule__EditElement__Group__1__Impl"


    // $ANTLR start "rule__EditElement__Group__2"
    // InternalMyDsl.g:1100:1: rule__EditElement__Group__2 : rule__EditElement__Group__2__Impl rule__EditElement__Group__3 ;
    public final void rule__EditElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1104:1: ( rule__EditElement__Group__2__Impl rule__EditElement__Group__3 )
            // InternalMyDsl.g:1105:2: rule__EditElement__Group__2__Impl rule__EditElement__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__EditElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditElement__Group__3();

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
    // $ANTLR end "rule__EditElement__Group__2"


    // $ANTLR start "rule__EditElement__Group__2__Impl"
    // InternalMyDsl.g:1112:1: rule__EditElement__Group__2__Impl : ( ',' ) ;
    public final void rule__EditElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:1: ( ( ',' ) )
            // InternalMyDsl.g:1117:1: ( ',' )
            {
            // InternalMyDsl.g:1117:1: ( ',' )
            // InternalMyDsl.g:1118:2: ','
            {
             before(grammarAccess.getEditElementAccess().getCommaKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEditElementAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__EditElement__Group__2__Impl"


    // $ANTLR start "rule__EditElement__Group__3"
    // InternalMyDsl.g:1127:1: rule__EditElement__Group__3 : rule__EditElement__Group__3__Impl rule__EditElement__Group__4 ;
    public final void rule__EditElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1131:1: ( rule__EditElement__Group__3__Impl rule__EditElement__Group__4 )
            // InternalMyDsl.g:1132:2: rule__EditElement__Group__3__Impl rule__EditElement__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__EditElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditElement__Group__4();

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
    // $ANTLR end "rule__EditElement__Group__3"


    // $ANTLR start "rule__EditElement__Group__3__Impl"
    // InternalMyDsl.g:1139:1: rule__EditElement__Group__3__Impl : ( ( rule__EditElement__ValueAssignment_3 ) ) ;
    public final void rule__EditElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( ( ( rule__EditElement__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:1144:1: ( ( rule__EditElement__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:1144:1: ( ( rule__EditElement__ValueAssignment_3 ) )
            // InternalMyDsl.g:1145:2: ( rule__EditElement__ValueAssignment_3 )
            {
             before(grammarAccess.getEditElementAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:1146:2: ( rule__EditElement__ValueAssignment_3 )
            // InternalMyDsl.g:1146:3: rule__EditElement__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EditElement__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEditElementAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__EditElement__Group__3__Impl"


    // $ANTLR start "rule__EditElement__Group__4"
    // InternalMyDsl.g:1154:1: rule__EditElement__Group__4 : rule__EditElement__Group__4__Impl ;
    public final void rule__EditElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( rule__EditElement__Group__4__Impl )
            // InternalMyDsl.g:1159:2: rule__EditElement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EditElement__Group__4__Impl();

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
    // $ANTLR end "rule__EditElement__Group__4"


    // $ANTLR start "rule__EditElement__Group__4__Impl"
    // InternalMyDsl.g:1165:1: rule__EditElement__Group__4__Impl : ( ')' ) ;
    public final void rule__EditElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( ( ')' ) )
            // InternalMyDsl.g:1170:1: ( ')' )
            {
            // InternalMyDsl.g:1170:1: ( ')' )
            // InternalMyDsl.g:1171:2: ')'
            {
             before(grammarAccess.getEditElementAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEditElementAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__EditElement__Group__4__Impl"


    // $ANTLR start "rule__ToString__Group__0"
    // InternalMyDsl.g:1181:1: rule__ToString__Group__0 : rule__ToString__Group__0__Impl rule__ToString__Group__1 ;
    public final void rule__ToString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( rule__ToString__Group__0__Impl rule__ToString__Group__1 )
            // InternalMyDsl.g:1186:2: rule__ToString__Group__0__Impl rule__ToString__Group__1
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
    // InternalMyDsl.g:1193:1: rule__ToString__Group__0__Impl : ( 'ExportString(' ) ;
    public final void rule__ToString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( ( 'ExportString(' ) )
            // InternalMyDsl.g:1198:1: ( 'ExportString(' )
            {
            // InternalMyDsl.g:1198:1: ( 'ExportString(' )
            // InternalMyDsl.g:1199:2: 'ExportString('
            {
             before(grammarAccess.getToStringAccess().getExportStringKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1208:1: rule__ToString__Group__1 : rule__ToString__Group__1__Impl rule__ToString__Group__2 ;
    public final void rule__ToString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( rule__ToString__Group__1__Impl rule__ToString__Group__2 )
            // InternalMyDsl.g:1213:2: rule__ToString__Group__1__Impl rule__ToString__Group__2
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
    // InternalMyDsl.g:1220:1: rule__ToString__Group__1__Impl : ( ( rule__ToString__PathAssignment_1 ) ) ;
    public final void rule__ToString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( ( ( rule__ToString__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1225:1: ( ( rule__ToString__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1225:1: ( ( rule__ToString__PathAssignment_1 ) )
            // InternalMyDsl.g:1226:2: ( rule__ToString__PathAssignment_1 )
            {
             before(grammarAccess.getToStringAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1227:2: ( rule__ToString__PathAssignment_1 )
            // InternalMyDsl.g:1227:3: rule__ToString__PathAssignment_1
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
    // InternalMyDsl.g:1235:1: rule__ToString__Group__2 : rule__ToString__Group__2__Impl ;
    public final void rule__ToString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1239:1: ( rule__ToString__Group__2__Impl )
            // InternalMyDsl.g:1240:2: rule__ToString__Group__2__Impl
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
    // InternalMyDsl.g:1246:1: rule__ToString__Group__2__Impl : ( ')' ) ;
    public final void rule__ToString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1250:1: ( ( ')' ) )
            // InternalMyDsl.g:1251:1: ( ')' )
            {
            // InternalMyDsl.g:1251:1: ( ')' )
            // InternalMyDsl.g:1252:2: ')'
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


    // $ANTLR start "rule__ToCSV__Group__0"
    // InternalMyDsl.g:1262:1: rule__ToCSV__Group__0 : rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 ;
    public final void rule__ToCSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 )
            // InternalMyDsl.g:1267:2: rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1
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
    // InternalMyDsl.g:1274:1: rule__ToCSV__Group__0__Impl : ( 'ExportCSV(' ) ;
    public final void rule__ToCSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1278:1: ( ( 'ExportCSV(' ) )
            // InternalMyDsl.g:1279:1: ( 'ExportCSV(' )
            {
            // InternalMyDsl.g:1279:1: ( 'ExportCSV(' )
            // InternalMyDsl.g:1280:2: 'ExportCSV('
            {
             before(grammarAccess.getToCSVAccess().getExportCSVKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1289:1: rule__ToCSV__Group__1 : rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 ;
    public final void rule__ToCSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1293:1: ( rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 )
            // InternalMyDsl.g:1294:2: rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2
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
    // InternalMyDsl.g:1301:1: rule__ToCSV__Group__1__Impl : ( ( rule__ToCSV__PathAssignment_1 ) ) ;
    public final void rule__ToCSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( ( ( rule__ToCSV__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1306:1: ( ( rule__ToCSV__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1306:1: ( ( rule__ToCSV__PathAssignment_1 ) )
            // InternalMyDsl.g:1307:2: ( rule__ToCSV__PathAssignment_1 )
            {
             before(grammarAccess.getToCSVAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1308:2: ( rule__ToCSV__PathAssignment_1 )
            // InternalMyDsl.g:1308:3: rule__ToCSV__PathAssignment_1
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
    // InternalMyDsl.g:1316:1: rule__ToCSV__Group__2 : rule__ToCSV__Group__2__Impl ;
    public final void rule__ToCSV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1320:1: ( rule__ToCSV__Group__2__Impl )
            // InternalMyDsl.g:1321:2: rule__ToCSV__Group__2__Impl
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
    // InternalMyDsl.g:1327:1: rule__ToCSV__Group__2__Impl : ( ')' ) ;
    public final void rule__ToCSV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1331:1: ( ( ')' ) )
            // InternalMyDsl.g:1332:1: ( ')' )
            {
            // InternalMyDsl.g:1332:1: ( ')' )
            // InternalMyDsl.g:1333:2: ')'
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
    // InternalMyDsl.g:1343:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1347:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalMyDsl.g:1348:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1355:1: rule__Element__Group__0__Impl : ( ( rule__Element__KeyAssignment_0 ) ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1359:1: ( ( ( rule__Element__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1360:1: ( ( rule__Element__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1360:1: ( ( rule__Element__KeyAssignment_0 ) )
            // InternalMyDsl.g:1361:2: ( rule__Element__KeyAssignment_0 )
            {
             before(grammarAccess.getElementAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1362:2: ( rule__Element__KeyAssignment_0 )
            // InternalMyDsl.g:1362:3: rule__Element__KeyAssignment_0
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
    // InternalMyDsl.g:1370:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1374:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalMyDsl.g:1375:2: rule__Element__Group__1__Impl rule__Element__Group__2
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
    // InternalMyDsl.g:1382:1: rule__Element__Group__1__Impl : ( ':' ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( ( ':' ) )
            // InternalMyDsl.g:1387:1: ( ':' )
            {
            // InternalMyDsl.g:1387:1: ( ':' )
            // InternalMyDsl.g:1388:2: ':'
            {
             before(grammarAccess.getElementAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1397:1: rule__Element__Group__2 : rule__Element__Group__2__Impl ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1401:1: ( rule__Element__Group__2__Impl )
            // InternalMyDsl.g:1402:2: rule__Element__Group__2__Impl
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
    // InternalMyDsl.g:1408:1: rule__Element__Group__2__Impl : ( ( rule__Element__ValueAssignment_2 ) ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( ( ( rule__Element__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:1413:1: ( ( rule__Element__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:1413:1: ( ( rule__Element__ValueAssignment_2 ) )
            // InternalMyDsl.g:1414:2: ( rule__Element__ValueAssignment_2 )
            {
             before(grammarAccess.getElementAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:1415:2: ( rule__Element__ValueAssignment_2 )
            // InternalMyDsl.g:1415:3: rule__Element__ValueAssignment_2
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
    // InternalMyDsl.g:1424:1: rule__JObject__Group__0 : rule__JObject__Group__0__Impl rule__JObject__Group__1 ;
    public final void rule__JObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( rule__JObject__Group__0__Impl rule__JObject__Group__1 )
            // InternalMyDsl.g:1429:2: rule__JObject__Group__0__Impl rule__JObject__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1436:1: rule__JObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( ( '{' ) )
            // InternalMyDsl.g:1441:1: ( '{' )
            {
            // InternalMyDsl.g:1441:1: ( '{' )
            // InternalMyDsl.g:1442:2: '{'
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
    // InternalMyDsl.g:1451:1: rule__JObject__Group__1 : rule__JObject__Group__1__Impl rule__JObject__Group__2 ;
    public final void rule__JObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1455:1: ( rule__JObject__Group__1__Impl rule__JObject__Group__2 )
            // InternalMyDsl.g:1456:2: rule__JObject__Group__1__Impl rule__JObject__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1463:1: rule__JObject__Group__1__Impl : ( ( rule__JObject__Group_1__0 )? ) ;
    public final void rule__JObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( ( ( rule__JObject__Group_1__0 )? ) )
            // InternalMyDsl.g:1468:1: ( ( rule__JObject__Group_1__0 )? )
            {
            // InternalMyDsl.g:1468:1: ( ( rule__JObject__Group_1__0 )? )
            // InternalMyDsl.g:1469:2: ( rule__JObject__Group_1__0 )?
            {
             before(grammarAccess.getJObjectAccess().getGroup_1()); 
            // InternalMyDsl.g:1470:2: ( rule__JObject__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1470:3: rule__JObject__Group_1__0
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
    // InternalMyDsl.g:1478:1: rule__JObject__Group__2 : rule__JObject__Group__2__Impl ;
    public final void rule__JObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1482:1: ( rule__JObject__Group__2__Impl )
            // InternalMyDsl.g:1483:2: rule__JObject__Group__2__Impl
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
    // InternalMyDsl.g:1489:1: rule__JObject__Group__2__Impl : ( '}' ) ;
    public final void rule__JObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( ( '}' ) )
            // InternalMyDsl.g:1494:1: ( '}' )
            {
            // InternalMyDsl.g:1494:1: ( '}' )
            // InternalMyDsl.g:1495:2: '}'
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
    // InternalMyDsl.g:1505:1: rule__JObject__Group_1__0 : rule__JObject__Group_1__0__Impl rule__JObject__Group_1__1 ;
    public final void rule__JObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1509:1: ( rule__JObject__Group_1__0__Impl rule__JObject__Group_1__1 )
            // InternalMyDsl.g:1510:2: rule__JObject__Group_1__0__Impl rule__JObject__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1517:1: rule__JObject__Group_1__0__Impl : ( ( rule__JObject__ElementAssignment_1_0 ) ) ;
    public final void rule__JObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( ( ( rule__JObject__ElementAssignment_1_0 ) ) )
            // InternalMyDsl.g:1522:1: ( ( rule__JObject__ElementAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1522:1: ( ( rule__JObject__ElementAssignment_1_0 ) )
            // InternalMyDsl.g:1523:2: ( rule__JObject__ElementAssignment_1_0 )
            {
             before(grammarAccess.getJObjectAccess().getElementAssignment_1_0()); 
            // InternalMyDsl.g:1524:2: ( rule__JObject__ElementAssignment_1_0 )
            // InternalMyDsl.g:1524:3: rule__JObject__ElementAssignment_1_0
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
    // InternalMyDsl.g:1532:1: rule__JObject__Group_1__1 : rule__JObject__Group_1__1__Impl ;
    public final void rule__JObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1536:1: ( rule__JObject__Group_1__1__Impl )
            // InternalMyDsl.g:1537:2: rule__JObject__Group_1__1__Impl
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
    // InternalMyDsl.g:1543:1: rule__JObject__Group_1__1__Impl : ( ( rule__JObject__Group_1_1__0 )* ) ;
    public final void rule__JObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( ( ( rule__JObject__Group_1_1__0 )* ) )
            // InternalMyDsl.g:1548:1: ( ( rule__JObject__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:1548:1: ( ( rule__JObject__Group_1_1__0 )* )
            // InternalMyDsl.g:1549:2: ( rule__JObject__Group_1_1__0 )*
            {
             before(grammarAccess.getJObjectAccess().getGroup_1_1()); 
            // InternalMyDsl.g:1550:2: ( rule__JObject__Group_1_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1550:3: rule__JObject__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__JObject__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMyDsl.g:1559:1: rule__JObject__Group_1_1__0 : rule__JObject__Group_1_1__0__Impl rule__JObject__Group_1_1__1 ;
    public final void rule__JObject__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1563:1: ( rule__JObject__Group_1_1__0__Impl rule__JObject__Group_1_1__1 )
            // InternalMyDsl.g:1564:2: rule__JObject__Group_1_1__0__Impl rule__JObject__Group_1_1__1
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
    // InternalMyDsl.g:1571:1: rule__JObject__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__JObject__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1575:1: ( ( ',' ) )
            // InternalMyDsl.g:1576:1: ( ',' )
            {
            // InternalMyDsl.g:1576:1: ( ',' )
            // InternalMyDsl.g:1577:2: ','
            {
             before(grammarAccess.getJObjectAccess().getCommaKeyword_1_1_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1586:1: rule__JObject__Group_1_1__1 : rule__JObject__Group_1_1__1__Impl ;
    public final void rule__JObject__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1590:1: ( rule__JObject__Group_1_1__1__Impl )
            // InternalMyDsl.g:1591:2: rule__JObject__Group_1_1__1__Impl
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
    // InternalMyDsl.g:1597:1: rule__JObject__Group_1_1__1__Impl : ( ( rule__JObject__ElementAssignment_1_1_1 ) ) ;
    public final void rule__JObject__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1601:1: ( ( ( rule__JObject__ElementAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:1602:1: ( ( rule__JObject__ElementAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:1602:1: ( ( rule__JObject__ElementAssignment_1_1_1 ) )
            // InternalMyDsl.g:1603:2: ( rule__JObject__ElementAssignment_1_1_1 )
            {
             before(grammarAccess.getJObjectAccess().getElementAssignment_1_1_1()); 
            // InternalMyDsl.g:1604:2: ( rule__JObject__ElementAssignment_1_1_1 )
            // InternalMyDsl.g:1604:3: rule__JObject__ElementAssignment_1_1_1
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
    // InternalMyDsl.g:1613:1: rule__JArray__Group__0 : rule__JArray__Group__0__Impl rule__JArray__Group__1 ;
    public final void rule__JArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1617:1: ( rule__JArray__Group__0__Impl rule__JArray__Group__1 )
            // InternalMyDsl.g:1618:2: rule__JArray__Group__0__Impl rule__JArray__Group__1
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
    // InternalMyDsl.g:1625:1: rule__JArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( ( '[' ) )
            // InternalMyDsl.g:1630:1: ( '[' )
            {
            // InternalMyDsl.g:1630:1: ( '[' )
            // InternalMyDsl.g:1631:2: '['
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
    // InternalMyDsl.g:1640:1: rule__JArray__Group__1 : rule__JArray__Group__1__Impl rule__JArray__Group__2 ;
    public final void rule__JArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1644:1: ( rule__JArray__Group__1__Impl rule__JArray__Group__2 )
            // InternalMyDsl.g:1645:2: rule__JArray__Group__1__Impl rule__JArray__Group__2
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
    // InternalMyDsl.g:1652:1: rule__JArray__Group__1__Impl : ( ( rule__JArray__Group_1__0 )? ) ;
    public final void rule__JArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( ( ( rule__JArray__Group_1__0 )? ) )
            // InternalMyDsl.g:1657:1: ( ( rule__JArray__Group_1__0 )? )
            {
            // InternalMyDsl.g:1657:1: ( ( rule__JArray__Group_1__0 )? )
            // InternalMyDsl.g:1658:2: ( rule__JArray__Group_1__0 )?
            {
             before(grammarAccess.getJArrayAccess().getGroup_1()); 
            // InternalMyDsl.g:1659:2: ( rule__JArray__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_INT)||(LA10_0>=11 && LA10_0<=12)||LA10_0==15||LA10_0==25||LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1659:3: rule__JArray__Group_1__0
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
    // InternalMyDsl.g:1667:1: rule__JArray__Group__2 : rule__JArray__Group__2__Impl ;
    public final void rule__JArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1671:1: ( rule__JArray__Group__2__Impl )
            // InternalMyDsl.g:1672:2: rule__JArray__Group__2__Impl
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
    // InternalMyDsl.g:1678:1: rule__JArray__Group__2__Impl : ( ']' ) ;
    public final void rule__JArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1682:1: ( ( ']' ) )
            // InternalMyDsl.g:1683:1: ( ']' )
            {
            // InternalMyDsl.g:1683:1: ( ']' )
            // InternalMyDsl.g:1684:2: ']'
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
    // InternalMyDsl.g:1694:1: rule__JArray__Group_1__0 : rule__JArray__Group_1__0__Impl rule__JArray__Group_1__1 ;
    public final void rule__JArray__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1698:1: ( rule__JArray__Group_1__0__Impl rule__JArray__Group_1__1 )
            // InternalMyDsl.g:1699:2: rule__JArray__Group_1__0__Impl rule__JArray__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1706:1: rule__JArray__Group_1__0__Impl : ( ( rule__JArray__ExpressionAssignment_1_0 ) ) ;
    public final void rule__JArray__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( ( ( rule__JArray__ExpressionAssignment_1_0 ) ) )
            // InternalMyDsl.g:1711:1: ( ( rule__JArray__ExpressionAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1711:1: ( ( rule__JArray__ExpressionAssignment_1_0 ) )
            // InternalMyDsl.g:1712:2: ( rule__JArray__ExpressionAssignment_1_0 )
            {
             before(grammarAccess.getJArrayAccess().getExpressionAssignment_1_0()); 
            // InternalMyDsl.g:1713:2: ( rule__JArray__ExpressionAssignment_1_0 )
            // InternalMyDsl.g:1713:3: rule__JArray__ExpressionAssignment_1_0
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
    // InternalMyDsl.g:1721:1: rule__JArray__Group_1__1 : rule__JArray__Group_1__1__Impl ;
    public final void rule__JArray__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1725:1: ( rule__JArray__Group_1__1__Impl )
            // InternalMyDsl.g:1726:2: rule__JArray__Group_1__1__Impl
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
    // InternalMyDsl.g:1732:1: rule__JArray__Group_1__1__Impl : ( ( rule__JArray__Group_1_1__0 )* ) ;
    public final void rule__JArray__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( ( ( rule__JArray__Group_1_1__0 )* ) )
            // InternalMyDsl.g:1737:1: ( ( rule__JArray__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:1737:1: ( ( rule__JArray__Group_1_1__0 )* )
            // InternalMyDsl.g:1738:2: ( rule__JArray__Group_1_1__0 )*
            {
             before(grammarAccess.getJArrayAccess().getGroup_1_1()); 
            // InternalMyDsl.g:1739:2: ( rule__JArray__Group_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1739:3: rule__JArray__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__JArray__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:1748:1: rule__JArray__Group_1_1__0 : rule__JArray__Group_1_1__0__Impl rule__JArray__Group_1_1__1 ;
    public final void rule__JArray__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1752:1: ( rule__JArray__Group_1_1__0__Impl rule__JArray__Group_1_1__1 )
            // InternalMyDsl.g:1753:2: rule__JArray__Group_1_1__0__Impl rule__JArray__Group_1_1__1
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
    // InternalMyDsl.g:1760:1: rule__JArray__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__JArray__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( ( ',' ) )
            // InternalMyDsl.g:1765:1: ( ',' )
            {
            // InternalMyDsl.g:1765:1: ( ',' )
            // InternalMyDsl.g:1766:2: ','
            {
             before(grammarAccess.getJArrayAccess().getCommaKeyword_1_1_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1775:1: rule__JArray__Group_1_1__1 : rule__JArray__Group_1_1__1__Impl ;
    public final void rule__JArray__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1779:1: ( rule__JArray__Group_1_1__1__Impl )
            // InternalMyDsl.g:1780:2: rule__JArray__Group_1_1__1__Impl
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
    // InternalMyDsl.g:1786:1: rule__JArray__Group_1_1__1__Impl : ( ( rule__JArray__ExpressionAssignment_1_1_1 ) ) ;
    public final void rule__JArray__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1790:1: ( ( ( rule__JArray__ExpressionAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:1791:1: ( ( rule__JArray__ExpressionAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:1791:1: ( ( rule__JArray__ExpressionAssignment_1_1_1 ) )
            // InternalMyDsl.g:1792:2: ( rule__JArray__ExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getJArrayAccess().getExpressionAssignment_1_1_1()); 
            // InternalMyDsl.g:1793:2: ( rule__JArray__ExpressionAssignment_1_1_1 )
            // InternalMyDsl.g:1793:3: rule__JArray__ExpressionAssignment_1_1_1
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
    // InternalMyDsl.g:1802:1: rule__BinExp__Group__0 : rule__BinExp__Group__0__Impl rule__BinExp__Group__1 ;
    public final void rule__BinExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1806:1: ( rule__BinExp__Group__0__Impl rule__BinExp__Group__1 )
            // InternalMyDsl.g:1807:2: rule__BinExp__Group__0__Impl rule__BinExp__Group__1
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
    // InternalMyDsl.g:1814:1: rule__BinExp__Group__0__Impl : ( ( rule__BinExp__ValAssignment_0 ) ) ;
    public final void rule__BinExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( ( ( rule__BinExp__ValAssignment_0 ) ) )
            // InternalMyDsl.g:1819:1: ( ( rule__BinExp__ValAssignment_0 ) )
            {
            // InternalMyDsl.g:1819:1: ( ( rule__BinExp__ValAssignment_0 ) )
            // InternalMyDsl.g:1820:2: ( rule__BinExp__ValAssignment_0 )
            {
             before(grammarAccess.getBinExpAccess().getValAssignment_0()); 
            // InternalMyDsl.g:1821:2: ( rule__BinExp__ValAssignment_0 )
            // InternalMyDsl.g:1821:3: rule__BinExp__ValAssignment_0
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
    // InternalMyDsl.g:1829:1: rule__BinExp__Group__1 : rule__BinExp__Group__1__Impl rule__BinExp__Group__2 ;
    public final void rule__BinExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1833:1: ( rule__BinExp__Group__1__Impl rule__BinExp__Group__2 )
            // InternalMyDsl.g:1834:2: rule__BinExp__Group__1__Impl rule__BinExp__Group__2
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
    // InternalMyDsl.g:1841:1: rule__BinExp__Group__1__Impl : ( '+' ) ;
    public final void rule__BinExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1845:1: ( ( '+' ) )
            // InternalMyDsl.g:1846:1: ( '+' )
            {
            // InternalMyDsl.g:1846:1: ( '+' )
            // InternalMyDsl.g:1847:2: '+'
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
    // InternalMyDsl.g:1856:1: rule__BinExp__Group__2 : rule__BinExp__Group__2__Impl ;
    public final void rule__BinExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1860:1: ( rule__BinExp__Group__2__Impl )
            // InternalMyDsl.g:1861:2: rule__BinExp__Group__2__Impl
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
    // InternalMyDsl.g:1867:1: rule__BinExp__Group__2__Impl : ( ( rule__BinExp__RvalAssignment_2 ) ) ;
    public final void rule__BinExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1871:1: ( ( ( rule__BinExp__RvalAssignment_2 ) ) )
            // InternalMyDsl.g:1872:1: ( ( rule__BinExp__RvalAssignment_2 ) )
            {
            // InternalMyDsl.g:1872:1: ( ( rule__BinExp__RvalAssignment_2 ) )
            // InternalMyDsl.g:1873:2: ( rule__BinExp__RvalAssignment_2 )
            {
             before(grammarAccess.getBinExpAccess().getRvalAssignment_2()); 
            // InternalMyDsl.g:1874:2: ( rule__BinExp__RvalAssignment_2 )
            // InternalMyDsl.g:1874:3: rule__BinExp__RvalAssignment_2
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
    // InternalMyDsl.g:1883:1: rule__Programme__LoadfilesAssignment : ( ruleLoadfile ) ;
    public final void rule__Programme__LoadfilesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1887:1: ( ( ruleLoadfile ) )
            // InternalMyDsl.g:1888:2: ( ruleLoadfile )
            {
            // InternalMyDsl.g:1888:2: ( ruleLoadfile )
            // InternalMyDsl.g:1889:3: ruleLoadfile
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


    // $ANTLR start "rule__Loadfile__PathAssignment_1"
    // InternalMyDsl.g:1898:1: rule__Loadfile__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Loadfile__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1902:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1903:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1903:2: ( RULE_STRING )
            // InternalMyDsl.g:1904:3: RULE_STRING
            {
             before(grammarAccess.getLoadfileAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadfileAccess().getPathSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Loadfile__PathAssignment_1"


    // $ANTLR start "rule__Loadfile__CommandsAssignment_4"
    // InternalMyDsl.g:1913:1: rule__Loadfile__CommandsAssignment_4 : ( ruleCommand ) ;
    public final void rule__Loadfile__CommandsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1917:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:1918:2: ( ruleCommand )
            {
            // InternalMyDsl.g:1918:2: ( ruleCommand )
            // InternalMyDsl.g:1919:3: ruleCommand
            {
             before(grammarAccess.getLoadfileAccess().getCommandsCommandParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getLoadfileAccess().getCommandsCommandParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Loadfile__CommandsAssignment_4"


    // $ANTLR start "rule__AddElement__ElementAssignment_1"
    // InternalMyDsl.g:1928:1: rule__AddElement__ElementAssignment_1 : ( ruleElement ) ;
    public final void rule__AddElement__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( ( ruleElement ) )
            // InternalMyDsl.g:1933:2: ( ruleElement )
            {
            // InternalMyDsl.g:1933:2: ( ruleElement )
            // InternalMyDsl.g:1934:3: ruleElement
            {
             before(grammarAccess.getAddElementAccess().getElementElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getAddElementAccess().getElementElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AddElement__ElementAssignment_1"


    // $ANTLR start "rule__RemoveElement__KeyAssignment_1"
    // InternalMyDsl.g:1943:1: rule__RemoveElement__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RemoveElement__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1948:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1948:2: ( RULE_STRING )
            // InternalMyDsl.g:1949:3: RULE_STRING
            {
             before(grammarAccess.getRemoveElementAccess().getKeySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRemoveElementAccess().getKeySTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RemoveElement__KeyAssignment_1"


    // $ANTLR start "rule__EditElement__KeyAssignment_1"
    // InternalMyDsl.g:1958:1: rule__EditElement__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EditElement__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1963:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1963:2: ( RULE_STRING )
            // InternalMyDsl.g:1964:3: RULE_STRING
            {
             before(grammarAccess.getEditElementAccess().getKeySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEditElementAccess().getKeySTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EditElement__KeyAssignment_1"


    // $ANTLR start "rule__EditElement__ValueAssignment_3"
    // InternalMyDsl.g:1973:1: rule__EditElement__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__EditElement__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1977:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:1978:2: ( ruleExpression )
            {
            // InternalMyDsl.g:1978:2: ( ruleExpression )
            // InternalMyDsl.g:1979:3: ruleExpression
            {
             before(grammarAccess.getEditElementAccess().getValueExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEditElementAccess().getValueExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EditElement__ValueAssignment_3"


    // $ANTLR start "rule__ToString__PathAssignment_1"
    // InternalMyDsl.g:1988:1: rule__ToString__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ToString__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1992:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1993:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1993:2: ( RULE_STRING )
            // InternalMyDsl.g:1994:3: RULE_STRING
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


    // $ANTLR start "rule__ToCSV__PathAssignment_1"
    // InternalMyDsl.g:2003:1: rule__ToCSV__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ToCSV__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2007:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2008:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2008:2: ( RULE_STRING )
            // InternalMyDsl.g:2009:3: RULE_STRING
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
    // InternalMyDsl.g:2018:1: rule__Element__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Element__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2022:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2023:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2023:2: ( RULE_STRING )
            // InternalMyDsl.g:2024:3: RULE_STRING
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
    // InternalMyDsl.g:2033:1: rule__Element__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Element__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2037:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2038:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2038:2: ( ruleExpression )
            // InternalMyDsl.g:2039:3: ruleExpression
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
    // InternalMyDsl.g:2048:1: rule__JsonString__ValAssignment : ( RULE_STRING ) ;
    public final void rule__JsonString__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2052:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2053:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2053:2: ( RULE_STRING )
            // InternalMyDsl.g:2054:3: RULE_STRING
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
    // InternalMyDsl.g:2063:1: rule__JsonBoolean__ValAssignment : ( ( rule__JsonBoolean__ValAlternatives_0 ) ) ;
    public final void rule__JsonBoolean__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2067:1: ( ( ( rule__JsonBoolean__ValAlternatives_0 ) ) )
            // InternalMyDsl.g:2068:2: ( ( rule__JsonBoolean__ValAlternatives_0 ) )
            {
            // InternalMyDsl.g:2068:2: ( ( rule__JsonBoolean__ValAlternatives_0 ) )
            // InternalMyDsl.g:2069:3: ( rule__JsonBoolean__ValAlternatives_0 )
            {
             before(grammarAccess.getJsonBooleanAccess().getValAlternatives_0()); 
            // InternalMyDsl.g:2070:3: ( rule__JsonBoolean__ValAlternatives_0 )
            // InternalMyDsl.g:2070:4: rule__JsonBoolean__ValAlternatives_0
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
    // InternalMyDsl.g:2078:1: rule__JsonEmpty__ValAssignment : ( ( 'null' ) ) ;
    public final void rule__JsonEmpty__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2082:1: ( ( ( 'null' ) ) )
            // InternalMyDsl.g:2083:2: ( ( 'null' ) )
            {
            // InternalMyDsl.g:2083:2: ( ( 'null' ) )
            // InternalMyDsl.g:2084:3: ( 'null' )
            {
             before(grammarAccess.getJsonEmptyAccess().getValNullKeyword_0()); 
            // InternalMyDsl.g:2085:3: ( 'null' )
            // InternalMyDsl.g:2086:4: 'null'
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
    // InternalMyDsl.g:2097:1: rule__JsonInteger__ValAssignment : ( RULE_INT ) ;
    public final void rule__JsonInteger__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2102:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2102:2: ( RULE_INT )
            // InternalMyDsl.g:2103:3: RULE_INT
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
    // InternalMyDsl.g:2112:1: rule__JObject__ElementAssignment_1_0 : ( ruleElement ) ;
    public final void rule__JObject__ElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( ( ruleElement ) )
            // InternalMyDsl.g:2117:2: ( ruleElement )
            {
            // InternalMyDsl.g:2117:2: ( ruleElement )
            // InternalMyDsl.g:2118:3: ruleElement
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
    // InternalMyDsl.g:2127:1: rule__JObject__ElementAssignment_1_1_1 : ( ruleElement ) ;
    public final void rule__JObject__ElementAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( ( ruleElement ) )
            // InternalMyDsl.g:2132:2: ( ruleElement )
            {
            // InternalMyDsl.g:2132:2: ( ruleElement )
            // InternalMyDsl.g:2133:3: ruleElement
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
    // InternalMyDsl.g:2142:1: rule__JArray__ExpressionAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__JArray__ExpressionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2146:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2147:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2147:2: ( ruleExpression )
            // InternalMyDsl.g:2148:3: ruleExpression
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
    // InternalMyDsl.g:2157:1: rule__JArray__ExpressionAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__JArray__ExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2161:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2162:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2162:2: ( ruleExpression )
            // InternalMyDsl.g:2163:3: ruleExpression
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
    // InternalMyDsl.g:2172:1: rule__BinExp__ValAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BinExp__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2177:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2177:2: ( RULE_STRING )
            // InternalMyDsl.g:2178:3: RULE_STRING
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
    // InternalMyDsl.g:2187:1: rule__BinExp__RvalAssignment_2 : ( RULE_STRING ) ;
    public final void rule__BinExp__RvalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2192:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2192:2: ( RULE_STRING )
            // InternalMyDsl.g:2193:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000DD0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000DC0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000012009830L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000016009830L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});

}