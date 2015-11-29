package org.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.VideogenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideogenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'mandatory'", "'optional'", "'alternative'", "'video'", "'probabilite'", "'duree'", "'description'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_RIGHT_BRACKET=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_LEFT_BRACKET=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalVideogenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideogenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideogenParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g"; }


     
     	private VideogenGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VideogenGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleVideoGenModel"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:60:1: entryRuleVideoGenModel : ruleVideoGenModel EOF ;
    public final void entryRuleVideoGenModel() throws RecognitionException {
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:61:1: ( ruleVideoGenModel EOF )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:62:1: ruleVideoGenModel EOF
            {
             before(grammarAccess.getVideoGenModelRule()); 
            pushFollow(FOLLOW_ruleVideoGenModel_in_entryRuleVideoGenModel61);
            ruleVideoGenModel();

            state._fsp--;

             after(grammarAccess.getVideoGenModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGenModel68); 

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
    // $ANTLR end "entryRuleVideoGenModel"


    // $ANTLR start "ruleVideoGenModel"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:69:1: ruleVideoGenModel : ( ( rule__VideoGenModel__Group__0 ) ) ;
    public final void ruleVideoGenModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:73:2: ( ( ( rule__VideoGenModel__Group__0 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:74:1: ( ( rule__VideoGenModel__Group__0 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:74:1: ( ( rule__VideoGenModel__Group__0 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:75:1: ( rule__VideoGenModel__Group__0 )
            {
             before(grammarAccess.getVideoGenModelAccess().getGroup()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:76:1: ( rule__VideoGenModel__Group__0 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:76:2: rule__VideoGenModel__Group__0
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__0_in_ruleVideoGenModel94);
            rule__VideoGenModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenModelAccess().getGroup()); 

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
    // $ANTLR end "ruleVideoGenModel"


    // $ANTLR start "entryRuleVarianteVideo"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:88:1: entryRuleVarianteVideo : ruleVarianteVideo EOF ;
    public final void entryRuleVarianteVideo() throws RecognitionException {
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:89:1: ( ruleVarianteVideo EOF )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:90:1: ruleVarianteVideo EOF
            {
             before(grammarAccess.getVarianteVideoRule()); 
            pushFollow(FOLLOW_ruleVarianteVideo_in_entryRuleVarianteVideo121);
            ruleVarianteVideo();

            state._fsp--;

             after(grammarAccess.getVarianteVideoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarianteVideo128); 

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
    // $ANTLR end "entryRuleVarianteVideo"


    // $ANTLR start "ruleVarianteVideo"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:97:1: ruleVarianteVideo : ( ( rule__VarianteVideo__Alternatives ) ) ;
    public final void ruleVarianteVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:101:2: ( ( ( rule__VarianteVideo__Alternatives ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:102:1: ( ( rule__VarianteVideo__Alternatives ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:102:1: ( ( rule__VarianteVideo__Alternatives ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:103:1: ( rule__VarianteVideo__Alternatives )
            {
             before(grammarAccess.getVarianteVideoAccess().getAlternatives()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:104:1: ( rule__VarianteVideo__Alternatives )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:104:2: rule__VarianteVideo__Alternatives
            {
            pushFollow(FOLLOW_rule__VarianteVideo__Alternatives_in_ruleVarianteVideo154);
            rule__VarianteVideo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVarianteVideoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVarianteVideo"


    // $ANTLR start "entryRuleMandatoryVideoSeq"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:116:1: entryRuleMandatoryVideoSeq : ruleMandatoryVideoSeq EOF ;
    public final void entryRuleMandatoryVideoSeq() throws RecognitionException {
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:117:1: ( ruleMandatoryVideoSeq EOF )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:118:1: ruleMandatoryVideoSeq EOF
            {
             before(grammarAccess.getMandatoryVideoSeqRule()); 
            pushFollow(FOLLOW_ruleMandatoryVideoSeq_in_entryRuleMandatoryVideoSeq181);
            ruleMandatoryVideoSeq();

            state._fsp--;

             after(grammarAccess.getMandatoryVideoSeqRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatoryVideoSeq188); 

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
    // $ANTLR end "entryRuleMandatoryVideoSeq"


    // $ANTLR start "ruleMandatoryVideoSeq"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:125:1: ruleMandatoryVideoSeq : ( ( rule__MandatoryVideoSeq__Group__0 ) ) ;
    public final void ruleMandatoryVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:129:2: ( ( ( rule__MandatoryVideoSeq__Group__0 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:130:1: ( ( rule__MandatoryVideoSeq__Group__0 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:130:1: ( ( rule__MandatoryVideoSeq__Group__0 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:131:1: ( rule__MandatoryVideoSeq__Group__0 )
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getGroup()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:132:1: ( rule__MandatoryVideoSeq__Group__0 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:132:2: rule__MandatoryVideoSeq__Group__0
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__0_in_ruleMandatoryVideoSeq214);
            rule__MandatoryVideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryVideoSeqAccess().getGroup()); 

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
    // $ANTLR end "ruleMandatoryVideoSeq"


    // $ANTLR start "entryRuleOptionalVideoSeq"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:144:1: entryRuleOptionalVideoSeq : ruleOptionalVideoSeq EOF ;
    public final void entryRuleOptionalVideoSeq() throws RecognitionException {
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:145:1: ( ruleOptionalVideoSeq EOF )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:146:1: ruleOptionalVideoSeq EOF
            {
             before(grammarAccess.getOptionalVideoSeqRule()); 
            pushFollow(FOLLOW_ruleOptionalVideoSeq_in_entryRuleOptionalVideoSeq241);
            ruleOptionalVideoSeq();

            state._fsp--;

             after(grammarAccess.getOptionalVideoSeqRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalVideoSeq248); 

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
    // $ANTLR end "entryRuleOptionalVideoSeq"


    // $ANTLR start "ruleOptionalVideoSeq"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:153:1: ruleOptionalVideoSeq : ( ( rule__OptionalVideoSeq__Group__0 ) ) ;
    public final void ruleOptionalVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:157:2: ( ( ( rule__OptionalVideoSeq__Group__0 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:158:1: ( ( rule__OptionalVideoSeq__Group__0 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:158:1: ( ( rule__OptionalVideoSeq__Group__0 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:159:1: ( rule__OptionalVideoSeq__Group__0 )
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getGroup()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:160:1: ( rule__OptionalVideoSeq__Group__0 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:160:2: rule__OptionalVideoSeq__Group__0
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__0_in_ruleOptionalVideoSeq274);
            rule__OptionalVideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalVideoSeqAccess().getGroup()); 

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
    // $ANTLR end "ruleOptionalVideoSeq"


    // $ANTLR start "entryRuleAlternativeVideoSeq"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:172:1: entryRuleAlternativeVideoSeq : ruleAlternativeVideoSeq EOF ;
    public final void entryRuleAlternativeVideoSeq() throws RecognitionException {
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:173:1: ( ruleAlternativeVideoSeq EOF )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:174:1: ruleAlternativeVideoSeq EOF
            {
             before(grammarAccess.getAlternativeVideoSeqRule()); 
            pushFollow(FOLLOW_ruleAlternativeVideoSeq_in_entryRuleAlternativeVideoSeq301);
            ruleAlternativeVideoSeq();

            state._fsp--;

             after(grammarAccess.getAlternativeVideoSeqRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeVideoSeq308); 

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
    // $ANTLR end "entryRuleAlternativeVideoSeq"


    // $ANTLR start "ruleAlternativeVideoSeq"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:181:1: ruleAlternativeVideoSeq : ( ( rule__AlternativeVideoSeq__Group__0 ) ) ;
    public final void ruleAlternativeVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:185:2: ( ( ( rule__AlternativeVideoSeq__Group__0 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:186:1: ( ( rule__AlternativeVideoSeq__Group__0 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:186:1: ( ( rule__AlternativeVideoSeq__Group__0 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:187:1: ( rule__AlternativeVideoSeq__Group__0 )
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getGroup()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:188:1: ( rule__AlternativeVideoSeq__Group__0 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:188:2: rule__AlternativeVideoSeq__Group__0
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__0_in_ruleAlternativeVideoSeq334);
            rule__AlternativeVideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeVideoSeqAccess().getGroup()); 

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
    // $ANTLR end "ruleAlternativeVideoSeq"


    // $ANTLR start "entryRuleVideo"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:200:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:201:1: ( ruleVideo EOF )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:202:1: ruleVideo EOF
            {
             before(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_ruleVideo_in_entryRuleVideo361);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getVideoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideo368); 

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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:209:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:213:2: ( ( ( rule__Video__Group__0 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:214:1: ( ( rule__Video__Group__0 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:214:1: ( ( rule__Video__Group__0 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:215:1: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:216:1: ( rule__Video__Group__0 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:216:2: rule__Video__Group__0
            {
            pushFollow(FOLLOW_rule__Video__Group__0_in_ruleVideo394);
            rule__Video__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getGroup()); 

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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleVideoA"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:228:1: entryRuleVideoA : ruleVideoA EOF ;
    public final void entryRuleVideoA() throws RecognitionException {
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:229:1: ( ruleVideoA EOF )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:230:1: ruleVideoA EOF
            {
             before(grammarAccess.getVideoARule()); 
            pushFollow(FOLLOW_ruleVideoA_in_entryRuleVideoA421);
            ruleVideoA();

            state._fsp--;

             after(grammarAccess.getVideoARule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoA428); 

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
    // $ANTLR end "entryRuleVideoA"


    // $ANTLR start "ruleVideoA"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:237:1: ruleVideoA : ( ( rule__VideoA__Group__0 ) ) ;
    public final void ruleVideoA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:241:2: ( ( ( rule__VideoA__Group__0 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:242:1: ( ( rule__VideoA__Group__0 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:242:1: ( ( rule__VideoA__Group__0 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:243:1: ( rule__VideoA__Group__0 )
            {
             before(grammarAccess.getVideoAAccess().getGroup()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:244:1: ( rule__VideoA__Group__0 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:244:2: rule__VideoA__Group__0
            {
            pushFollow(FOLLOW_rule__VideoA__Group__0_in_ruleVideoA454);
            rule__VideoA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoAAccess().getGroup()); 

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
    // $ANTLR end "ruleVideoA"


    // $ANTLR start "entryRuleVideoPropriete"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:256:1: entryRuleVideoPropriete : ruleVideoPropriete EOF ;
    public final void entryRuleVideoPropriete() throws RecognitionException {
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:257:1: ( ruleVideoPropriete EOF )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:258:1: ruleVideoPropriete EOF
            {
             before(grammarAccess.getVideoProprieteRule()); 
            pushFollow(FOLLOW_ruleVideoPropriete_in_entryRuleVideoPropriete481);
            ruleVideoPropriete();

            state._fsp--;

             after(grammarAccess.getVideoProprieteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoPropriete488); 

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
    // $ANTLR end "entryRuleVideoPropriete"


    // $ANTLR start "ruleVideoPropriete"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:265:1: ruleVideoPropriete : ( ( rule__VideoPropriete__Group__0 ) ) ;
    public final void ruleVideoPropriete() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:269:2: ( ( ( rule__VideoPropriete__Group__0 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:270:1: ( ( rule__VideoPropriete__Group__0 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:270:1: ( ( rule__VideoPropriete__Group__0 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:271:1: ( rule__VideoPropriete__Group__0 )
            {
             before(grammarAccess.getVideoProprieteAccess().getGroup()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:272:1: ( rule__VideoPropriete__Group__0 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:272:2: rule__VideoPropriete__Group__0
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group__0_in_ruleVideoPropriete514);
            rule__VideoPropriete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoProprieteAccess().getGroup()); 

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
    // $ANTLR end "ruleVideoPropriete"


    // $ANTLR start "rule__VarianteVideo__Alternatives"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:284:1: rule__VarianteVideo__Alternatives : ( ( ruleMandatoryVideoSeq ) | ( ruleOptionalVideoSeq ) | ( ruleAlternativeVideoSeq ) );
    public final void rule__VarianteVideo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:288:1: ( ( ruleMandatoryVideoSeq ) | ( ruleOptionalVideoSeq ) | ( ruleAlternativeVideoSeq ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
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
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:289:1: ( ruleMandatoryVideoSeq )
                    {
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:289:1: ( ruleMandatoryVideoSeq )
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:290:1: ruleMandatoryVideoSeq
                    {
                     before(grammarAccess.getVarianteVideoAccess().getMandatoryVideoSeqParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatoryVideoSeq_in_rule__VarianteVideo__Alternatives550);
                    ruleMandatoryVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getVarianteVideoAccess().getMandatoryVideoSeqParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:295:6: ( ruleOptionalVideoSeq )
                    {
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:295:6: ( ruleOptionalVideoSeq )
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:296:1: ruleOptionalVideoSeq
                    {
                     before(grammarAccess.getVarianteVideoAccess().getOptionalVideoSeqParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptionalVideoSeq_in_rule__VarianteVideo__Alternatives567);
                    ruleOptionalVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getVarianteVideoAccess().getOptionalVideoSeqParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:301:6: ( ruleAlternativeVideoSeq )
                    {
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:301:6: ( ruleAlternativeVideoSeq )
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:302:1: ruleAlternativeVideoSeq
                    {
                     before(grammarAccess.getVarianteVideoAccess().getAlternativeVideoSeqParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAlternativeVideoSeq_in_rule__VarianteVideo__Alternatives584);
                    ruleAlternativeVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getVarianteVideoAccess().getAlternativeVideoSeqParserRuleCall_2()); 

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
    // $ANTLR end "rule__VarianteVideo__Alternatives"


    // $ANTLR start "rule__VideoGenModel__Group__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:314:1: rule__VideoGenModel__Group__0 : rule__VideoGenModel__Group__0__Impl rule__VideoGenModel__Group__1 ;
    public final void rule__VideoGenModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:318:1: ( rule__VideoGenModel__Group__0__Impl rule__VideoGenModel__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:319:2: rule__VideoGenModel__Group__0__Impl rule__VideoGenModel__Group__1
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__0__Impl_in_rule__VideoGenModel__Group__0614);
            rule__VideoGenModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGenModel__Group__1_in_rule__VideoGenModel__Group__0617);
            rule__VideoGenModel__Group__1();

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
    // $ANTLR end "rule__VideoGenModel__Group__0"


    // $ANTLR start "rule__VideoGenModel__Group__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:326:1: rule__VideoGenModel__Group__0__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGenModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:330:1: ( ( 'VideoGen' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:331:1: ( 'VideoGen' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:331:1: ( 'VideoGen' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:332:1: 'VideoGen'
            {
             before(grammarAccess.getVideoGenModelAccess().getVideoGenKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__VideoGenModel__Group__0__Impl645); 
             after(grammarAccess.getVideoGenModelAccess().getVideoGenKeyword_0()); 

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
    // $ANTLR end "rule__VideoGenModel__Group__0__Impl"


    // $ANTLR start "rule__VideoGenModel__Group__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:345:1: rule__VideoGenModel__Group__1 : rule__VideoGenModel__Group__1__Impl rule__VideoGenModel__Group__2 ;
    public final void rule__VideoGenModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:349:1: ( rule__VideoGenModel__Group__1__Impl rule__VideoGenModel__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:350:2: rule__VideoGenModel__Group__1__Impl rule__VideoGenModel__Group__2
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__1__Impl_in_rule__VideoGenModel__Group__1676);
            rule__VideoGenModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGenModel__Group__2_in_rule__VideoGenModel__Group__1679);
            rule__VideoGenModel__Group__2();

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
    // $ANTLR end "rule__VideoGenModel__Group__1"


    // $ANTLR start "rule__VideoGenModel__Group__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:357:1: rule__VideoGenModel__Group__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoGenModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:361:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:362:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:362:1: ( RULE_LEFT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:363:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoGenModelAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoGenModel__Group__1__Impl706); 
             after(grammarAccess.getVideoGenModelAccess().getLEFT_BRACKETTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__VideoGenModel__Group__1__Impl"


    // $ANTLR start "rule__VideoGenModel__Group__2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:374:1: rule__VideoGenModel__Group__2 : rule__VideoGenModel__Group__2__Impl rule__VideoGenModel__Group__3 ;
    public final void rule__VideoGenModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:378:1: ( rule__VideoGenModel__Group__2__Impl rule__VideoGenModel__Group__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:379:2: rule__VideoGenModel__Group__2__Impl rule__VideoGenModel__Group__3
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__2__Impl_in_rule__VideoGenModel__Group__2735);
            rule__VideoGenModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGenModel__Group__3_in_rule__VideoGenModel__Group__2738);
            rule__VideoGenModel__Group__3();

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
    // $ANTLR end "rule__VideoGenModel__Group__2"


    // $ANTLR start "rule__VideoGenModel__Group__2__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:386:1: rule__VideoGenModel__Group__2__Impl : ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* ) ;
    public final void rule__VideoGenModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:390:1: ( ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:391:1: ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:391:1: ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:392:1: ( rule__VideoGenModel__Variante_videosAssignment_2 )*
            {
             before(grammarAccess.getVideoGenModelAccess().getVariante_videosAssignment_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:393:1: ( rule__VideoGenModel__Variante_videosAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:393:2: rule__VideoGenModel__Variante_videosAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VideoGenModel__Variante_videosAssignment_2_in_rule__VideoGenModel__Group__2__Impl765);
            	    rule__VideoGenModel__Variante_videosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getVideoGenModelAccess().getVariante_videosAssignment_2()); 

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
    // $ANTLR end "rule__VideoGenModel__Group__2__Impl"


    // $ANTLR start "rule__VideoGenModel__Group__3"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:403:1: rule__VideoGenModel__Group__3 : rule__VideoGenModel__Group__3__Impl ;
    public final void rule__VideoGenModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:407:1: ( rule__VideoGenModel__Group__3__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:408:2: rule__VideoGenModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__3__Impl_in_rule__VideoGenModel__Group__3796);
            rule__VideoGenModel__Group__3__Impl();

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
    // $ANTLR end "rule__VideoGenModel__Group__3"


    // $ANTLR start "rule__VideoGenModel__Group__3__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:414:1: rule__VideoGenModel__Group__3__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoGenModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:418:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:419:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:419:1: ( RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:420:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoGenModelAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGenModel__Group__3__Impl823); 
             after(grammarAccess.getVideoGenModelAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__VideoGenModel__Group__3__Impl"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:439:1: rule__MandatoryVideoSeq__Group__0 : rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 ;
    public final void rule__MandatoryVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:443:1: ( rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:444:2: rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__0__Impl_in_rule__MandatoryVideoSeq__Group__0860);
            rule__MandatoryVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__1_in_rule__MandatoryVideoSeq__Group__0863);
            rule__MandatoryVideoSeq__Group__1();

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
    // $ANTLR end "rule__MandatoryVideoSeq__Group__0"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:451:1: rule__MandatoryVideoSeq__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__MandatoryVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:455:1: ( ( 'mandatory' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:456:1: ( 'mandatory' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:456:1: ( 'mandatory' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:457:1: 'mandatory'
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__MandatoryVideoSeq__Group__0__Impl891); 
             after(grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0()); 

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
    // $ANTLR end "rule__MandatoryVideoSeq__Group__0__Impl"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:470:1: rule__MandatoryVideoSeq__Group__1 : rule__MandatoryVideoSeq__Group__1__Impl ;
    public final void rule__MandatoryVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:474:1: ( rule__MandatoryVideoSeq__Group__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:475:2: rule__MandatoryVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__1__Impl_in_rule__MandatoryVideoSeq__Group__1922);
            rule__MandatoryVideoSeq__Group__1__Impl();

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
    // $ANTLR end "rule__MandatoryVideoSeq__Group__1"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:481:1: rule__MandatoryVideoSeq__Group__1__Impl : ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) ) ;
    public final void rule__MandatoryVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:485:1: ( ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:486:1: ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:486:1: ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:487:1: ( rule__MandatoryVideoSeq__VideoAssignment_1 )
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getVideoAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:488:1: ( rule__MandatoryVideoSeq__VideoAssignment_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:488:2: rule__MandatoryVideoSeq__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__VideoAssignment_1_in_rule__MandatoryVideoSeq__Group__1__Impl949);
            rule__MandatoryVideoSeq__VideoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryVideoSeqAccess().getVideoAssignment_1()); 

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
    // $ANTLR end "rule__MandatoryVideoSeq__Group__1__Impl"


    // $ANTLR start "rule__OptionalVideoSeq__Group__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:502:1: rule__OptionalVideoSeq__Group__0 : rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 ;
    public final void rule__OptionalVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:506:1: ( rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:507:2: rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__0__Impl_in_rule__OptionalVideoSeq__Group__0983);
            rule__OptionalVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__1_in_rule__OptionalVideoSeq__Group__0986);
            rule__OptionalVideoSeq__Group__1();

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
    // $ANTLR end "rule__OptionalVideoSeq__Group__0"


    // $ANTLR start "rule__OptionalVideoSeq__Group__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:514:1: rule__OptionalVideoSeq__Group__0__Impl : ( 'optional' ) ;
    public final void rule__OptionalVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:518:1: ( ( 'optional' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:519:1: ( 'optional' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:519:1: ( 'optional' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:520:1: 'optional'
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__OptionalVideoSeq__Group__0__Impl1014); 
             after(grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0()); 

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
    // $ANTLR end "rule__OptionalVideoSeq__Group__0__Impl"


    // $ANTLR start "rule__OptionalVideoSeq__Group__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:533:1: rule__OptionalVideoSeq__Group__1 : rule__OptionalVideoSeq__Group__1__Impl ;
    public final void rule__OptionalVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:537:1: ( rule__OptionalVideoSeq__Group__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:538:2: rule__OptionalVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__1__Impl_in_rule__OptionalVideoSeq__Group__11045);
            rule__OptionalVideoSeq__Group__1__Impl();

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
    // $ANTLR end "rule__OptionalVideoSeq__Group__1"


    // $ANTLR start "rule__OptionalVideoSeq__Group__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:544:1: rule__OptionalVideoSeq__Group__1__Impl : ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) ) ;
    public final void rule__OptionalVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:548:1: ( ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:549:1: ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:549:1: ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:550:1: ( rule__OptionalVideoSeq__VideoAssignment_1 )
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getVideoAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:551:1: ( rule__OptionalVideoSeq__VideoAssignment_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:551:2: rule__OptionalVideoSeq__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__VideoAssignment_1_in_rule__OptionalVideoSeq__Group__1__Impl1072);
            rule__OptionalVideoSeq__VideoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalVideoSeqAccess().getVideoAssignment_1()); 

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
    // $ANTLR end "rule__OptionalVideoSeq__Group__1__Impl"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:565:1: rule__AlternativeVideoSeq__Group__0 : rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1 ;
    public final void rule__AlternativeVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:569:1: ( rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:570:2: rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__0__Impl_in_rule__AlternativeVideoSeq__Group__01106);
            rule__AlternativeVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__1_in_rule__AlternativeVideoSeq__Group__01109);
            rule__AlternativeVideoSeq__Group__1();

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
    // $ANTLR end "rule__AlternativeVideoSeq__Group__0"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:577:1: rule__AlternativeVideoSeq__Group__0__Impl : ( 'alternative' ) ;
    public final void rule__AlternativeVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:581:1: ( ( 'alternative' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:582:1: ( 'alternative' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:582:1: ( 'alternative' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:583:1: 'alternative'
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getAlternativeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__AlternativeVideoSeq__Group__0__Impl1137); 
             after(grammarAccess.getAlternativeVideoSeqAccess().getAlternativeKeyword_0()); 

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
    // $ANTLR end "rule__AlternativeVideoSeq__Group__0__Impl"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:596:1: rule__AlternativeVideoSeq__Group__1 : rule__AlternativeVideoSeq__Group__1__Impl ;
    public final void rule__AlternativeVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:600:1: ( rule__AlternativeVideoSeq__Group__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:601:2: rule__AlternativeVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__1__Impl_in_rule__AlternativeVideoSeq__Group__11168);
            rule__AlternativeVideoSeq__Group__1__Impl();

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
    // $ANTLR end "rule__AlternativeVideoSeq__Group__1"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:607:1: rule__AlternativeVideoSeq__Group__1__Impl : ( ( rule__AlternativeVideoSeq__VideoAssignment_1 ) ) ;
    public final void rule__AlternativeVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:611:1: ( ( ( rule__AlternativeVideoSeq__VideoAssignment_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:612:1: ( ( rule__AlternativeVideoSeq__VideoAssignment_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:612:1: ( ( rule__AlternativeVideoSeq__VideoAssignment_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:613:1: ( rule__AlternativeVideoSeq__VideoAssignment_1 )
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:614:1: ( rule__AlternativeVideoSeq__VideoAssignment_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:614:2: rule__AlternativeVideoSeq__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__VideoAssignment_1_in_rule__AlternativeVideoSeq__Group__1__Impl1195);
            rule__AlternativeVideoSeq__VideoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideoAssignment_1()); 

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
    // $ANTLR end "rule__AlternativeVideoSeq__Group__1__Impl"


    // $ANTLR start "rule__Video__Group__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:628:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:632:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:633:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_rule__Video__Group__0__Impl_in_rule__Video__Group__01229);
            rule__Video__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Video__Group__1_in_rule__Video__Group__01232);
            rule__Video__Group__1();

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
    // $ANTLR end "rule__Video__Group__0"


    // $ANTLR start "rule__Video__Group__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:640:1: rule__Video__Group__0__Impl : ( 'video' ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:644:1: ( ( 'video' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:645:1: ( 'video' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:645:1: ( 'video' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:646:1: 'video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Video__Group__0__Impl1260); 
             after(grammarAccess.getVideoAccess().getVideoKeyword_0()); 

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
    // $ANTLR end "rule__Video__Group__0__Impl"


    // $ANTLR start "rule__Video__Group__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:659:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:663:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:664:2: rule__Video__Group__1__Impl rule__Video__Group__2
            {
            pushFollow(FOLLOW_rule__Video__Group__1__Impl_in_rule__Video__Group__11291);
            rule__Video__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Video__Group__2_in_rule__Video__Group__11294);
            rule__Video__Group__2();

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
    // $ANTLR end "rule__Video__Group__1"


    // $ANTLR start "rule__Video__Group__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:671:1: rule__Video__Group__1__Impl : ( ( rule__Video__VideoidAssignment_1 )? ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:675:1: ( ( ( rule__Video__VideoidAssignment_1 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:676:1: ( ( rule__Video__VideoidAssignment_1 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:676:1: ( ( rule__Video__VideoidAssignment_1 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:677:1: ( rule__Video__VideoidAssignment_1 )?
            {
             before(grammarAccess.getVideoAccess().getVideoidAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:678:1: ( rule__Video__VideoidAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:678:2: rule__Video__VideoidAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Video__VideoidAssignment_1_in_rule__Video__Group__1__Impl1321);
                    rule__Video__VideoidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getVideoidAssignment_1()); 

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
    // $ANTLR end "rule__Video__Group__1__Impl"


    // $ANTLR start "rule__Video__Group__2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:688:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:692:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:693:2: rule__Video__Group__2__Impl rule__Video__Group__3
            {
            pushFollow(FOLLOW_rule__Video__Group__2__Impl_in_rule__Video__Group__21352);
            rule__Video__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Video__Group__3_in_rule__Video__Group__21355);
            rule__Video__Group__3();

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
    // $ANTLR end "rule__Video__Group__2"


    // $ANTLR start "rule__Video__Group__2__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:700:1: rule__Video__Group__2__Impl : ( ( rule__Video__CheminAssignment_2 ) ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:704:1: ( ( ( rule__Video__CheminAssignment_2 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:705:1: ( ( rule__Video__CheminAssignment_2 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:705:1: ( ( rule__Video__CheminAssignment_2 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:706:1: ( rule__Video__CheminAssignment_2 )
            {
             before(grammarAccess.getVideoAccess().getCheminAssignment_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:707:1: ( rule__Video__CheminAssignment_2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:707:2: rule__Video__CheminAssignment_2
            {
            pushFollow(FOLLOW_rule__Video__CheminAssignment_2_in_rule__Video__Group__2__Impl1382);
            rule__Video__CheminAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getCheminAssignment_2()); 

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
    // $ANTLR end "rule__Video__Group__2__Impl"


    // $ANTLR start "rule__Video__Group__3"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:717:1: rule__Video__Group__3 : rule__Video__Group__3__Impl ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:721:1: ( rule__Video__Group__3__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:722:2: rule__Video__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Video__Group__3__Impl_in_rule__Video__Group__31412);
            rule__Video__Group__3__Impl();

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
    // $ANTLR end "rule__Video__Group__3"


    // $ANTLR start "rule__Video__Group__3__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:728:1: rule__Video__Group__3__Impl : ( ( rule__Video__Group_3__0 )? ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:732:1: ( ( ( rule__Video__Group_3__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:733:1: ( ( rule__Video__Group_3__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:733:1: ( ( rule__Video__Group_3__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:734:1: ( rule__Video__Group_3__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_3()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:735:1: ( rule__Video__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LEFT_BRACKET) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:735:2: rule__Video__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Video__Group_3__0_in_rule__Video__Group__3__Impl1439);
                    rule__Video__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Video__Group__3__Impl"


    // $ANTLR start "rule__Video__Group_3__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:753:1: rule__Video__Group_3__0 : rule__Video__Group_3__0__Impl rule__Video__Group_3__1 ;
    public final void rule__Video__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:757:1: ( rule__Video__Group_3__0__Impl rule__Video__Group_3__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:758:2: rule__Video__Group_3__0__Impl rule__Video__Group_3__1
            {
            pushFollow(FOLLOW_rule__Video__Group_3__0__Impl_in_rule__Video__Group_3__01478);
            rule__Video__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Video__Group_3__1_in_rule__Video__Group_3__01481);
            rule__Video__Group_3__1();

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
    // $ANTLR end "rule__Video__Group_3__0"


    // $ANTLR start "rule__Video__Group_3__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:765:1: rule__Video__Group_3__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Video__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:769:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:770:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:770:1: ( RULE_LEFT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:771:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__Video__Group_3__0__Impl1508); 
             after(grammarAccess.getVideoAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Video__Group_3__0__Impl"


    // $ANTLR start "rule__Video__Group_3__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:782:1: rule__Video__Group_3__1 : rule__Video__Group_3__1__Impl rule__Video__Group_3__2 ;
    public final void rule__Video__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:786:1: ( rule__Video__Group_3__1__Impl rule__Video__Group_3__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:787:2: rule__Video__Group_3__1__Impl rule__Video__Group_3__2
            {
            pushFollow(FOLLOW_rule__Video__Group_3__1__Impl_in_rule__Video__Group_3__11537);
            rule__Video__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Video__Group_3__2_in_rule__Video__Group_3__11540);
            rule__Video__Group_3__2();

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
    // $ANTLR end "rule__Video__Group_3__1"


    // $ANTLR start "rule__Video__Group_3__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:794:1: rule__Video__Group_3__1__Impl : ( ( rule__Video__ProprieteAssignment_3_1 ) ) ;
    public final void rule__Video__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:798:1: ( ( ( rule__Video__ProprieteAssignment_3_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:799:1: ( ( rule__Video__ProprieteAssignment_3_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:799:1: ( ( rule__Video__ProprieteAssignment_3_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:800:1: ( rule__Video__ProprieteAssignment_3_1 )
            {
             before(grammarAccess.getVideoAccess().getProprieteAssignment_3_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:801:1: ( rule__Video__ProprieteAssignment_3_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:801:2: rule__Video__ProprieteAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Video__ProprieteAssignment_3_1_in_rule__Video__Group_3__1__Impl1567);
            rule__Video__ProprieteAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getProprieteAssignment_3_1()); 

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
    // $ANTLR end "rule__Video__Group_3__1__Impl"


    // $ANTLR start "rule__Video__Group_3__2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:811:1: rule__Video__Group_3__2 : rule__Video__Group_3__2__Impl ;
    public final void rule__Video__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:815:1: ( rule__Video__Group_3__2__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:816:2: rule__Video__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Video__Group_3__2__Impl_in_rule__Video__Group_3__21597);
            rule__Video__Group_3__2__Impl();

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
    // $ANTLR end "rule__Video__Group_3__2"


    // $ANTLR start "rule__Video__Group_3__2__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:822:1: rule__Video__Group_3__2__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Video__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:826:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:827:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:827:1: ( RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:828:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoAccess().getRIGHT_BRACKETTerminalRuleCall_3_2()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__Video__Group_3__2__Impl1624); 
             after(grammarAccess.getVideoAccess().getRIGHT_BRACKETTerminalRuleCall_3_2()); 

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
    // $ANTLR end "rule__Video__Group_3__2__Impl"


    // $ANTLR start "rule__VideoA__Group__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:845:1: rule__VideoA__Group__0 : rule__VideoA__Group__0__Impl rule__VideoA__Group__1 ;
    public final void rule__VideoA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:849:1: ( rule__VideoA__Group__0__Impl rule__VideoA__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:850:2: rule__VideoA__Group__0__Impl rule__VideoA__Group__1
            {
            pushFollow(FOLLOW_rule__VideoA__Group__0__Impl_in_rule__VideoA__Group__01659);
            rule__VideoA__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoA__Group__1_in_rule__VideoA__Group__01662);
            rule__VideoA__Group__1();

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
    // $ANTLR end "rule__VideoA__Group__0"


    // $ANTLR start "rule__VideoA__Group__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:857:1: rule__VideoA__Group__0__Impl : ( ( rule__VideoA__VideoidAssignment_0 )? ) ;
    public final void rule__VideoA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:861:1: ( ( ( rule__VideoA__VideoidAssignment_0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:862:1: ( ( rule__VideoA__VideoidAssignment_0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:862:1: ( ( rule__VideoA__VideoidAssignment_0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:863:1: ( rule__VideoA__VideoidAssignment_0 )?
            {
             before(grammarAccess.getVideoAAccess().getVideoidAssignment_0()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:864:1: ( rule__VideoA__VideoidAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:864:2: rule__VideoA__VideoidAssignment_0
                    {
                    pushFollow(FOLLOW_rule__VideoA__VideoidAssignment_0_in_rule__VideoA__Group__0__Impl1689);
                    rule__VideoA__VideoidAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAAccess().getVideoidAssignment_0()); 

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
    // $ANTLR end "rule__VideoA__Group__0__Impl"


    // $ANTLR start "rule__VideoA__Group__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:874:1: rule__VideoA__Group__1 : rule__VideoA__Group__1__Impl rule__VideoA__Group__2 ;
    public final void rule__VideoA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:878:1: ( rule__VideoA__Group__1__Impl rule__VideoA__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:879:2: rule__VideoA__Group__1__Impl rule__VideoA__Group__2
            {
            pushFollow(FOLLOW_rule__VideoA__Group__1__Impl_in_rule__VideoA__Group__11720);
            rule__VideoA__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoA__Group__2_in_rule__VideoA__Group__11723);
            rule__VideoA__Group__2();

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
    // $ANTLR end "rule__VideoA__Group__1"


    // $ANTLR start "rule__VideoA__Group__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:886:1: rule__VideoA__Group__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:890:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:891:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:891:1: ( RULE_LEFT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:892:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoAAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoA__Group__1__Impl1750); 
             after(grammarAccess.getVideoAAccess().getLEFT_BRACKETTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__VideoA__Group__1__Impl"


    // $ANTLR start "rule__VideoA__Group__2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:903:1: rule__VideoA__Group__2 : rule__VideoA__Group__2__Impl rule__VideoA__Group__3 ;
    public final void rule__VideoA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:907:1: ( rule__VideoA__Group__2__Impl rule__VideoA__Group__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:908:2: rule__VideoA__Group__2__Impl rule__VideoA__Group__3
            {
            pushFollow(FOLLOW_rule__VideoA__Group__2__Impl_in_rule__VideoA__Group__21779);
            rule__VideoA__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoA__Group__3_in_rule__VideoA__Group__21782);
            rule__VideoA__Group__3();

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
    // $ANTLR end "rule__VideoA__Group__2"


    // $ANTLR start "rule__VideoA__Group__2__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:915:1: rule__VideoA__Group__2__Impl : ( ( rule__VideoA__Group_2__0 )* ) ;
    public final void rule__VideoA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:919:1: ( ( ( rule__VideoA__Group_2__0 )* ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:920:1: ( ( rule__VideoA__Group_2__0 )* )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:920:1: ( ( rule__VideoA__Group_2__0 )* )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:921:1: ( rule__VideoA__Group_2__0 )*
            {
             before(grammarAccess.getVideoAAccess().getGroup_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:922:1: ( rule__VideoA__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:922:2: rule__VideoA__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VideoA__Group_2__0_in_rule__VideoA__Group__2__Impl1809);
            	    rule__VideoA__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getVideoAAccess().getGroup_2()); 

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
    // $ANTLR end "rule__VideoA__Group__2__Impl"


    // $ANTLR start "rule__VideoA__Group__3"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:932:1: rule__VideoA__Group__3 : rule__VideoA__Group__3__Impl ;
    public final void rule__VideoA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:936:1: ( rule__VideoA__Group__3__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:937:2: rule__VideoA__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VideoA__Group__3__Impl_in_rule__VideoA__Group__31840);
            rule__VideoA__Group__3__Impl();

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
    // $ANTLR end "rule__VideoA__Group__3"


    // $ANTLR start "rule__VideoA__Group__3__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:943:1: rule__VideoA__Group__3__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:947:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:948:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:948:1: ( RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:949:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoAAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoA__Group__3__Impl1867); 
             after(grammarAccess.getVideoAAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__VideoA__Group__3__Impl"


    // $ANTLR start "rule__VideoA__Group_2__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:968:1: rule__VideoA__Group_2__0 : rule__VideoA__Group_2__0__Impl rule__VideoA__Group_2__1 ;
    public final void rule__VideoA__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:972:1: ( rule__VideoA__Group_2__0__Impl rule__VideoA__Group_2__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:973:2: rule__VideoA__Group_2__0__Impl rule__VideoA__Group_2__1
            {
            pushFollow(FOLLOW_rule__VideoA__Group_2__0__Impl_in_rule__VideoA__Group_2__01904);
            rule__VideoA__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoA__Group_2__1_in_rule__VideoA__Group_2__01907);
            rule__VideoA__Group_2__1();

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
    // $ANTLR end "rule__VideoA__Group_2__0"


    // $ANTLR start "rule__VideoA__Group_2__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:980:1: rule__VideoA__Group_2__0__Impl : ( 'video' ) ;
    public final void rule__VideoA__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:984:1: ( ( 'video' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:985:1: ( 'video' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:985:1: ( 'video' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:986:1: 'video'
            {
             before(grammarAccess.getVideoAAccess().getVideoKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__VideoA__Group_2__0__Impl1935); 
             after(grammarAccess.getVideoAAccess().getVideoKeyword_2_0()); 

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
    // $ANTLR end "rule__VideoA__Group_2__0__Impl"


    // $ANTLR start "rule__VideoA__Group_2__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:999:1: rule__VideoA__Group_2__1 : rule__VideoA__Group_2__1__Impl rule__VideoA__Group_2__2 ;
    public final void rule__VideoA__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1003:1: ( rule__VideoA__Group_2__1__Impl rule__VideoA__Group_2__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1004:2: rule__VideoA__Group_2__1__Impl rule__VideoA__Group_2__2
            {
            pushFollow(FOLLOW_rule__VideoA__Group_2__1__Impl_in_rule__VideoA__Group_2__11966);
            rule__VideoA__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoA__Group_2__2_in_rule__VideoA__Group_2__11969);
            rule__VideoA__Group_2__2();

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
    // $ANTLR end "rule__VideoA__Group_2__1"


    // $ANTLR start "rule__VideoA__Group_2__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1011:1: rule__VideoA__Group_2__1__Impl : ( ( rule__VideoA__VideoidAssignment_2_1 )? ) ;
    public final void rule__VideoA__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1015:1: ( ( ( rule__VideoA__VideoidAssignment_2_1 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1016:1: ( ( rule__VideoA__VideoidAssignment_2_1 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1016:1: ( ( rule__VideoA__VideoidAssignment_2_1 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1017:1: ( rule__VideoA__VideoidAssignment_2_1 )?
            {
             before(grammarAccess.getVideoAAccess().getVideoidAssignment_2_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1018:1: ( rule__VideoA__VideoidAssignment_2_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1018:2: rule__VideoA__VideoidAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__VideoA__VideoidAssignment_2_1_in_rule__VideoA__Group_2__1__Impl1996);
                    rule__VideoA__VideoidAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAAccess().getVideoidAssignment_2_1()); 

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
    // $ANTLR end "rule__VideoA__Group_2__1__Impl"


    // $ANTLR start "rule__VideoA__Group_2__2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1028:1: rule__VideoA__Group_2__2 : rule__VideoA__Group_2__2__Impl ;
    public final void rule__VideoA__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1032:1: ( rule__VideoA__Group_2__2__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1033:2: rule__VideoA__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__VideoA__Group_2__2__Impl_in_rule__VideoA__Group_2__22027);
            rule__VideoA__Group_2__2__Impl();

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
    // $ANTLR end "rule__VideoA__Group_2__2"


    // $ANTLR start "rule__VideoA__Group_2__2__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1039:1: rule__VideoA__Group_2__2__Impl : ( ( rule__VideoA__CheminAssignment_2_2 ) ) ;
    public final void rule__VideoA__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1043:1: ( ( ( rule__VideoA__CheminAssignment_2_2 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1044:1: ( ( rule__VideoA__CheminAssignment_2_2 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1044:1: ( ( rule__VideoA__CheminAssignment_2_2 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1045:1: ( rule__VideoA__CheminAssignment_2_2 )
            {
             before(grammarAccess.getVideoAAccess().getCheminAssignment_2_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1046:1: ( rule__VideoA__CheminAssignment_2_2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1046:2: rule__VideoA__CheminAssignment_2_2
            {
            pushFollow(FOLLOW_rule__VideoA__CheminAssignment_2_2_in_rule__VideoA__Group_2__2__Impl2054);
            rule__VideoA__CheminAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoAAccess().getCheminAssignment_2_2()); 

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
    // $ANTLR end "rule__VideoA__Group_2__2__Impl"


    // $ANTLR start "rule__VideoPropriete__Group__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1062:1: rule__VideoPropriete__Group__0 : rule__VideoPropriete__Group__0__Impl rule__VideoPropriete__Group__1 ;
    public final void rule__VideoPropriete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1066:1: ( rule__VideoPropriete__Group__0__Impl rule__VideoPropriete__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1067:2: rule__VideoPropriete__Group__0__Impl rule__VideoPropriete__Group__1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group__0__Impl_in_rule__VideoPropriete__Group__02090);
            rule__VideoPropriete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoPropriete__Group__1_in_rule__VideoPropriete__Group__02093);
            rule__VideoPropriete__Group__1();

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
    // $ANTLR end "rule__VideoPropriete__Group__0"


    // $ANTLR start "rule__VideoPropriete__Group__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1074:1: rule__VideoPropriete__Group__0__Impl : ( ( rule__VideoPropriete__Group_0__0 )? ) ;
    public final void rule__VideoPropriete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1078:1: ( ( ( rule__VideoPropriete__Group_0__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1079:1: ( ( rule__VideoPropriete__Group_0__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1079:1: ( ( rule__VideoPropriete__Group_0__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1080:1: ( rule__VideoPropriete__Group_0__0 )?
            {
             before(grammarAccess.getVideoProprieteAccess().getGroup_0()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1081:1: ( rule__VideoPropriete__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1081:2: rule__VideoPropriete__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__VideoPropriete__Group_0__0_in_rule__VideoPropriete__Group__0__Impl2120);
                    rule__VideoPropriete__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoProprieteAccess().getGroup_0()); 

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
    // $ANTLR end "rule__VideoPropriete__Group__0__Impl"


    // $ANTLR start "rule__VideoPropriete__Group__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1091:1: rule__VideoPropriete__Group__1 : rule__VideoPropriete__Group__1__Impl rule__VideoPropriete__Group__2 ;
    public final void rule__VideoPropriete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1095:1: ( rule__VideoPropriete__Group__1__Impl rule__VideoPropriete__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1096:2: rule__VideoPropriete__Group__1__Impl rule__VideoPropriete__Group__2
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group__1__Impl_in_rule__VideoPropriete__Group__12151);
            rule__VideoPropriete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoPropriete__Group__2_in_rule__VideoPropriete__Group__12154);
            rule__VideoPropriete__Group__2();

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
    // $ANTLR end "rule__VideoPropriete__Group__1"


    // $ANTLR start "rule__VideoPropriete__Group__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1103:1: rule__VideoPropriete__Group__1__Impl : ( ( rule__VideoPropriete__Group_1__0 )? ) ;
    public final void rule__VideoPropriete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1107:1: ( ( ( rule__VideoPropriete__Group_1__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1108:1: ( ( rule__VideoPropriete__Group_1__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1108:1: ( ( rule__VideoPropriete__Group_1__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1109:1: ( rule__VideoPropriete__Group_1__0 )?
            {
             before(grammarAccess.getVideoProprieteAccess().getGroup_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1110:1: ( rule__VideoPropriete__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1110:2: rule__VideoPropriete__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VideoPropriete__Group_1__0_in_rule__VideoPropriete__Group__1__Impl2181);
                    rule__VideoPropriete__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoProprieteAccess().getGroup_1()); 

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
    // $ANTLR end "rule__VideoPropriete__Group__1__Impl"


    // $ANTLR start "rule__VideoPropriete__Group__2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1120:1: rule__VideoPropriete__Group__2 : rule__VideoPropriete__Group__2__Impl ;
    public final void rule__VideoPropriete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1124:1: ( rule__VideoPropriete__Group__2__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1125:2: rule__VideoPropriete__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group__2__Impl_in_rule__VideoPropriete__Group__22212);
            rule__VideoPropriete__Group__2__Impl();

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
    // $ANTLR end "rule__VideoPropriete__Group__2"


    // $ANTLR start "rule__VideoPropriete__Group__2__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1131:1: rule__VideoPropriete__Group__2__Impl : ( ( rule__VideoPropriete__Group_2__0 )? ) ;
    public final void rule__VideoPropriete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1135:1: ( ( ( rule__VideoPropriete__Group_2__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1136:1: ( ( rule__VideoPropriete__Group_2__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1136:1: ( ( rule__VideoPropriete__Group_2__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1137:1: ( rule__VideoPropriete__Group_2__0 )?
            {
             before(grammarAccess.getVideoProprieteAccess().getGroup_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1138:1: ( rule__VideoPropriete__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1138:2: rule__VideoPropriete__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__VideoPropriete__Group_2__0_in_rule__VideoPropriete__Group__2__Impl2239);
                    rule__VideoPropriete__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoProprieteAccess().getGroup_2()); 

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
    // $ANTLR end "rule__VideoPropriete__Group__2__Impl"


    // $ANTLR start "rule__VideoPropriete__Group_0__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1154:1: rule__VideoPropriete__Group_0__0 : rule__VideoPropriete__Group_0__0__Impl rule__VideoPropriete__Group_0__1 ;
    public final void rule__VideoPropriete__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1158:1: ( rule__VideoPropriete__Group_0__0__Impl rule__VideoPropriete__Group_0__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1159:2: rule__VideoPropriete__Group_0__0__Impl rule__VideoPropriete__Group_0__1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_0__0__Impl_in_rule__VideoPropriete__Group_0__02276);
            rule__VideoPropriete__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoPropriete__Group_0__1_in_rule__VideoPropriete__Group_0__02279);
            rule__VideoPropriete__Group_0__1();

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
    // $ANTLR end "rule__VideoPropriete__Group_0__0"


    // $ANTLR start "rule__VideoPropriete__Group_0__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1166:1: rule__VideoPropriete__Group_0__0__Impl : ( 'probabilite' ) ;
    public final void rule__VideoPropriete__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1170:1: ( ( 'probabilite' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1171:1: ( 'probabilite' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1171:1: ( 'probabilite' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1172:1: 'probabilite'
            {
             before(grammarAccess.getVideoProprieteAccess().getProbabiliteKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__VideoPropriete__Group_0__0__Impl2307); 
             after(grammarAccess.getVideoProprieteAccess().getProbabiliteKeyword_0_0()); 

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
    // $ANTLR end "rule__VideoPropriete__Group_0__0__Impl"


    // $ANTLR start "rule__VideoPropriete__Group_0__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1185:1: rule__VideoPropriete__Group_0__1 : rule__VideoPropriete__Group_0__1__Impl ;
    public final void rule__VideoPropriete__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1189:1: ( rule__VideoPropriete__Group_0__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1190:2: rule__VideoPropriete__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_0__1__Impl_in_rule__VideoPropriete__Group_0__12338);
            rule__VideoPropriete__Group_0__1__Impl();

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
    // $ANTLR end "rule__VideoPropriete__Group_0__1"


    // $ANTLR start "rule__VideoPropriete__Group_0__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1196:1: rule__VideoPropriete__Group_0__1__Impl : ( ( rule__VideoPropriete__ProbabiliteAssignment_0_1 ) ) ;
    public final void rule__VideoPropriete__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1200:1: ( ( ( rule__VideoPropriete__ProbabiliteAssignment_0_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1201:1: ( ( rule__VideoPropriete__ProbabiliteAssignment_0_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1201:1: ( ( rule__VideoPropriete__ProbabiliteAssignment_0_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1202:1: ( rule__VideoPropriete__ProbabiliteAssignment_0_1 )
            {
             before(grammarAccess.getVideoProprieteAccess().getProbabiliteAssignment_0_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1203:1: ( rule__VideoPropriete__ProbabiliteAssignment_0_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1203:2: rule__VideoPropriete__ProbabiliteAssignment_0_1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__ProbabiliteAssignment_0_1_in_rule__VideoPropriete__Group_0__1__Impl2365);
            rule__VideoPropriete__ProbabiliteAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoProprieteAccess().getProbabiliteAssignment_0_1()); 

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
    // $ANTLR end "rule__VideoPropriete__Group_0__1__Impl"


    // $ANTLR start "rule__VideoPropriete__Group_1__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1217:1: rule__VideoPropriete__Group_1__0 : rule__VideoPropriete__Group_1__0__Impl rule__VideoPropriete__Group_1__1 ;
    public final void rule__VideoPropriete__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1221:1: ( rule__VideoPropriete__Group_1__0__Impl rule__VideoPropriete__Group_1__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1222:2: rule__VideoPropriete__Group_1__0__Impl rule__VideoPropriete__Group_1__1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_1__0__Impl_in_rule__VideoPropriete__Group_1__02399);
            rule__VideoPropriete__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoPropriete__Group_1__1_in_rule__VideoPropriete__Group_1__02402);
            rule__VideoPropriete__Group_1__1();

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
    // $ANTLR end "rule__VideoPropriete__Group_1__0"


    // $ANTLR start "rule__VideoPropriete__Group_1__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1229:1: rule__VideoPropriete__Group_1__0__Impl : ( 'duree' ) ;
    public final void rule__VideoPropriete__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1233:1: ( ( 'duree' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1234:1: ( 'duree' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1234:1: ( 'duree' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1235:1: 'duree'
            {
             before(grammarAccess.getVideoProprieteAccess().getDureeKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__VideoPropriete__Group_1__0__Impl2430); 
             after(grammarAccess.getVideoProprieteAccess().getDureeKeyword_1_0()); 

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
    // $ANTLR end "rule__VideoPropriete__Group_1__0__Impl"


    // $ANTLR start "rule__VideoPropriete__Group_1__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1248:1: rule__VideoPropriete__Group_1__1 : rule__VideoPropriete__Group_1__1__Impl ;
    public final void rule__VideoPropriete__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1252:1: ( rule__VideoPropriete__Group_1__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1253:2: rule__VideoPropriete__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_1__1__Impl_in_rule__VideoPropriete__Group_1__12461);
            rule__VideoPropriete__Group_1__1__Impl();

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
    // $ANTLR end "rule__VideoPropriete__Group_1__1"


    // $ANTLR start "rule__VideoPropriete__Group_1__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1259:1: rule__VideoPropriete__Group_1__1__Impl : ( ( rule__VideoPropriete__DureeAssignment_1_1 ) ) ;
    public final void rule__VideoPropriete__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1263:1: ( ( ( rule__VideoPropriete__DureeAssignment_1_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1264:1: ( ( rule__VideoPropriete__DureeAssignment_1_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1264:1: ( ( rule__VideoPropriete__DureeAssignment_1_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1265:1: ( rule__VideoPropriete__DureeAssignment_1_1 )
            {
             before(grammarAccess.getVideoProprieteAccess().getDureeAssignment_1_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1266:1: ( rule__VideoPropriete__DureeAssignment_1_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1266:2: rule__VideoPropriete__DureeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__DureeAssignment_1_1_in_rule__VideoPropriete__Group_1__1__Impl2488);
            rule__VideoPropriete__DureeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoProprieteAccess().getDureeAssignment_1_1()); 

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
    // $ANTLR end "rule__VideoPropriete__Group_1__1__Impl"


    // $ANTLR start "rule__VideoPropriete__Group_2__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1280:1: rule__VideoPropriete__Group_2__0 : rule__VideoPropriete__Group_2__0__Impl rule__VideoPropriete__Group_2__1 ;
    public final void rule__VideoPropriete__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1284:1: ( rule__VideoPropriete__Group_2__0__Impl rule__VideoPropriete__Group_2__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1285:2: rule__VideoPropriete__Group_2__0__Impl rule__VideoPropriete__Group_2__1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_2__0__Impl_in_rule__VideoPropriete__Group_2__02522);
            rule__VideoPropriete__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoPropriete__Group_2__1_in_rule__VideoPropriete__Group_2__02525);
            rule__VideoPropriete__Group_2__1();

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
    // $ANTLR end "rule__VideoPropriete__Group_2__0"


    // $ANTLR start "rule__VideoPropriete__Group_2__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1292:1: rule__VideoPropriete__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__VideoPropriete__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1296:1: ( ( 'description' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1297:1: ( 'description' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1297:1: ( 'description' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1298:1: 'description'
            {
             before(grammarAccess.getVideoProprieteAccess().getDescriptionKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__VideoPropriete__Group_2__0__Impl2553); 
             after(grammarAccess.getVideoProprieteAccess().getDescriptionKeyword_2_0()); 

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
    // $ANTLR end "rule__VideoPropriete__Group_2__0__Impl"


    // $ANTLR start "rule__VideoPropriete__Group_2__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1311:1: rule__VideoPropriete__Group_2__1 : rule__VideoPropriete__Group_2__1__Impl ;
    public final void rule__VideoPropriete__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1315:1: ( rule__VideoPropriete__Group_2__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1316:2: rule__VideoPropriete__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_2__1__Impl_in_rule__VideoPropriete__Group_2__12584);
            rule__VideoPropriete__Group_2__1__Impl();

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
    // $ANTLR end "rule__VideoPropriete__Group_2__1"


    // $ANTLR start "rule__VideoPropriete__Group_2__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1322:1: rule__VideoPropriete__Group_2__1__Impl : ( ( rule__VideoPropriete__DescriptionAssignment_2_1 ) ) ;
    public final void rule__VideoPropriete__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1326:1: ( ( ( rule__VideoPropriete__DescriptionAssignment_2_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1327:1: ( ( rule__VideoPropriete__DescriptionAssignment_2_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1327:1: ( ( rule__VideoPropriete__DescriptionAssignment_2_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1328:1: ( rule__VideoPropriete__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getVideoProprieteAccess().getDescriptionAssignment_2_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1329:1: ( rule__VideoPropriete__DescriptionAssignment_2_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1329:2: rule__VideoPropriete__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__DescriptionAssignment_2_1_in_rule__VideoPropriete__Group_2__1__Impl2611);
            rule__VideoPropriete__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoProprieteAccess().getDescriptionAssignment_2_1()); 

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
    // $ANTLR end "rule__VideoPropriete__Group_2__1__Impl"


    // $ANTLR start "rule__VideoGenModel__Variante_videosAssignment_2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1344:1: rule__VideoGenModel__Variante_videosAssignment_2 : ( ruleVarianteVideo ) ;
    public final void rule__VideoGenModel__Variante_videosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1348:1: ( ( ruleVarianteVideo ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1349:1: ( ruleVarianteVideo )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1349:1: ( ruleVarianteVideo )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1350:1: ruleVarianteVideo
            {
             before(grammarAccess.getVideoGenModelAccess().getVariante_videosVarianteVideoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVarianteVideo_in_rule__VideoGenModel__Variante_videosAssignment_22650);
            ruleVarianteVideo();

            state._fsp--;

             after(grammarAccess.getVideoGenModelAccess().getVariante_videosVarianteVideoParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__VideoGenModel__Variante_videosAssignment_2"


    // $ANTLR start "rule__MandatoryVideoSeq__VideoAssignment_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1359:1: rule__MandatoryVideoSeq__VideoAssignment_1 : ( ruleVideo ) ;
    public final void rule__MandatoryVideoSeq__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1363:1: ( ( ruleVideo ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1364:1: ( ruleVideo )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1364:1: ( ruleVideo )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1365:1: ruleVideo
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getVideoVideoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideo_in_rule__MandatoryVideoSeq__VideoAssignment_12681);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getMandatoryVideoSeqAccess().getVideoVideoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MandatoryVideoSeq__VideoAssignment_1"


    // $ANTLR start "rule__OptionalVideoSeq__VideoAssignment_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1374:1: rule__OptionalVideoSeq__VideoAssignment_1 : ( ruleVideo ) ;
    public final void rule__OptionalVideoSeq__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1378:1: ( ( ruleVideo ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1379:1: ( ruleVideo )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1379:1: ( ruleVideo )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1380:1: ruleVideo
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getVideoVideoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideo_in_rule__OptionalVideoSeq__VideoAssignment_12712);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getOptionalVideoSeqAccess().getVideoVideoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OptionalVideoSeq__VideoAssignment_1"


    // $ANTLR start "rule__AlternativeVideoSeq__VideoAssignment_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1389:1: rule__AlternativeVideoSeq__VideoAssignment_1 : ( ruleVideoA ) ;
    public final void rule__AlternativeVideoSeq__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1393:1: ( ( ruleVideoA ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1394:1: ( ruleVideoA )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1394:1: ( ruleVideoA )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1395:1: ruleVideoA
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoVideoAParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideoA_in_rule__AlternativeVideoSeq__VideoAssignment_12743);
            ruleVideoA();

            state._fsp--;

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideoVideoAParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AlternativeVideoSeq__VideoAssignment_1"


    // $ANTLR start "rule__Video__VideoidAssignment_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1404:1: rule__Video__VideoidAssignment_1 : ( RULE_ID ) ;
    public final void rule__Video__VideoidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1408:1: ( ( RULE_ID ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1409:1: ( RULE_ID )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1409:1: ( RULE_ID )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1410:1: RULE_ID
            {
             before(grammarAccess.getVideoAccess().getVideoidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Video__VideoidAssignment_12774); 
             after(grammarAccess.getVideoAccess().getVideoidIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Video__VideoidAssignment_1"


    // $ANTLR start "rule__Video__CheminAssignment_2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1419:1: rule__Video__CheminAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Video__CheminAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1423:1: ( ( RULE_STRING ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1424:1: ( RULE_STRING )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1424:1: ( RULE_STRING )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1425:1: RULE_STRING
            {
             before(grammarAccess.getVideoAccess().getCheminSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Video__CheminAssignment_22805); 
             after(grammarAccess.getVideoAccess().getCheminSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Video__CheminAssignment_2"


    // $ANTLR start "rule__Video__ProprieteAssignment_3_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1434:1: rule__Video__ProprieteAssignment_3_1 : ( ruleVideoPropriete ) ;
    public final void rule__Video__ProprieteAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1438:1: ( ( ruleVideoPropriete ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1439:1: ( ruleVideoPropriete )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1439:1: ( ruleVideoPropriete )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1440:1: ruleVideoPropriete
            {
             before(grammarAccess.getVideoAccess().getProprieteVideoProprieteParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleVideoPropriete_in_rule__Video__ProprieteAssignment_3_12836);
            ruleVideoPropriete();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getProprieteVideoProprieteParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Video__ProprieteAssignment_3_1"


    // $ANTLR start "rule__VideoA__VideoidAssignment_0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1449:1: rule__VideoA__VideoidAssignment_0 : ( RULE_ID ) ;
    public final void rule__VideoA__VideoidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1453:1: ( ( RULE_ID ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1454:1: ( RULE_ID )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1454:1: ( RULE_ID )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1455:1: RULE_ID
            {
             before(grammarAccess.getVideoAAccess().getVideoidIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VideoA__VideoidAssignment_02867); 
             after(grammarAccess.getVideoAAccess().getVideoidIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__VideoA__VideoidAssignment_0"


    // $ANTLR start "rule__VideoA__VideoidAssignment_2_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1464:1: rule__VideoA__VideoidAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__VideoA__VideoidAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1468:1: ( ( RULE_ID ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1469:1: ( RULE_ID )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1469:1: ( RULE_ID )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1470:1: RULE_ID
            {
             before(grammarAccess.getVideoAAccess().getVideoidIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VideoA__VideoidAssignment_2_12898); 
             after(grammarAccess.getVideoAAccess().getVideoidIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__VideoA__VideoidAssignment_2_1"


    // $ANTLR start "rule__VideoA__CheminAssignment_2_2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1479:1: rule__VideoA__CheminAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__VideoA__CheminAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1483:1: ( ( RULE_STRING ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1484:1: ( RULE_STRING )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1484:1: ( RULE_STRING )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1485:1: RULE_STRING
            {
             before(grammarAccess.getVideoAAccess().getCheminSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VideoA__CheminAssignment_2_22929); 
             after(grammarAccess.getVideoAAccess().getCheminSTRINGTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__VideoA__CheminAssignment_2_2"


    // $ANTLR start "rule__VideoPropriete__ProbabiliteAssignment_0_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1494:1: rule__VideoPropriete__ProbabiliteAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__VideoPropriete__ProbabiliteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1498:1: ( ( RULE_INT ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1499:1: ( RULE_INT )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1499:1: ( RULE_INT )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1500:1: RULE_INT
            {
             before(grammarAccess.getVideoProprieteAccess().getProbabiliteINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VideoPropriete__ProbabiliteAssignment_0_12960); 
             after(grammarAccess.getVideoProprieteAccess().getProbabiliteINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__VideoPropriete__ProbabiliteAssignment_0_1"


    // $ANTLR start "rule__VideoPropriete__DureeAssignment_1_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1509:1: rule__VideoPropriete__DureeAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__VideoPropriete__DureeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1513:1: ( ( RULE_INT ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1514:1: ( RULE_INT )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1514:1: ( RULE_INT )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1515:1: RULE_INT
            {
             before(grammarAccess.getVideoProprieteAccess().getDureeINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VideoPropriete__DureeAssignment_1_12991); 
             after(grammarAccess.getVideoProprieteAccess().getDureeINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__VideoPropriete__DureeAssignment_1_1"


    // $ANTLR start "rule__VideoPropriete__DescriptionAssignment_2_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1524:1: rule__VideoPropriete__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__VideoPropriete__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1528:1: ( ( RULE_STRING ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1529:1: ( RULE_STRING )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1529:1: ( RULE_STRING )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1530:1: RULE_STRING
            {
             before(grammarAccess.getVideoProprieteAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VideoPropriete__DescriptionAssignment_2_13022); 
             after(grammarAccess.getVideoProprieteAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__VideoPropriete__DescriptionAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGenModel_in_entryRuleVideoGenModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGenModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__0_in_ruleVideoGenModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarianteVideo_in_entryRuleVarianteVideo121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarianteVideo128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarianteVideo__Alternatives_in_ruleVarianteVideo154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryVideoSeq_in_entryRuleMandatoryVideoSeq181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryVideoSeq188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__0_in_ruleMandatoryVideoSeq214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalVideoSeq_in_entryRuleOptionalVideoSeq241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalVideoSeq248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__0_in_ruleOptionalVideoSeq274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeVideoSeq_in_entryRuleAlternativeVideoSeq301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeVideoSeq308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__0_in_ruleAlternativeVideoSeq334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_entryRuleVideo361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideo368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group__0_in_ruleVideo394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoA_in_entryRuleVideoA421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoA428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoA__Group__0_in_ruleVideoA454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoPropriete_in_entryRuleVideoPropriete481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoPropriete488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__0_in_ruleVideoPropriete514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryVideoSeq_in_rule__VarianteVideo__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalVideoSeq_in_rule__VarianteVideo__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeVideoSeq_in_rule__VarianteVideo__Alternatives584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__0__Impl_in_rule__VideoGenModel__Group__0614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__1_in_rule__VideoGenModel__Group__0617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VideoGenModel__Group__0__Impl645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__1__Impl_in_rule__VideoGenModel__Group__1676 = new BitSet(new long[]{0x000000000001C020L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__2_in_rule__VideoGenModel__Group__1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoGenModel__Group__1__Impl706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__2__Impl_in_rule__VideoGenModel__Group__2735 = new BitSet(new long[]{0x000000000001C020L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__3_in_rule__VideoGenModel__Group__2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Variante_videosAssignment_2_in_rule__VideoGenModel__Group__2__Impl765 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__3__Impl_in_rule__VideoGenModel__Group__3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGenModel__Group__3__Impl823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__0__Impl_in_rule__MandatoryVideoSeq__Group__0860 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__1_in_rule__MandatoryVideoSeq__Group__0863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MandatoryVideoSeq__Group__0__Impl891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__1__Impl_in_rule__MandatoryVideoSeq__Group__1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__VideoAssignment_1_in_rule__MandatoryVideoSeq__Group__1__Impl949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__0__Impl_in_rule__OptionalVideoSeq__Group__0983 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__1_in_rule__OptionalVideoSeq__Group__0986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__OptionalVideoSeq__Group__0__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__1__Impl_in_rule__OptionalVideoSeq__Group__11045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__VideoAssignment_1_in_rule__OptionalVideoSeq__Group__1__Impl1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__0__Impl_in_rule__AlternativeVideoSeq__Group__01106 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__1_in_rule__AlternativeVideoSeq__Group__01109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AlternativeVideoSeq__Group__0__Impl1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__1__Impl_in_rule__AlternativeVideoSeq__Group__11168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__VideoAssignment_1_in_rule__AlternativeVideoSeq__Group__1__Impl1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group__0__Impl_in_rule__Video__Group__01229 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Video__Group__1_in_rule__Video__Group__01232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Video__Group__0__Impl1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group__1__Impl_in_rule__Video__Group__11291 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Video__Group__2_in_rule__Video__Group__11294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__VideoidAssignment_1_in_rule__Video__Group__1__Impl1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group__2__Impl_in_rule__Video__Group__21352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Video__Group__3_in_rule__Video__Group__21355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__CheminAssignment_2_in_rule__Video__Group__2__Impl1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group__3__Impl_in_rule__Video__Group__31412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group_3__0_in_rule__Video__Group__3__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group_3__0__Impl_in_rule__Video__Group_3__01478 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Video__Group_3__1_in_rule__Video__Group_3__01481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__Video__Group_3__0__Impl1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group_3__1__Impl_in_rule__Video__Group_3__11537 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Video__Group_3__2_in_rule__Video__Group_3__11540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__ProprieteAssignment_3_1_in_rule__Video__Group_3__1__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group_3__2__Impl_in_rule__Video__Group_3__21597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__Video__Group_3__2__Impl1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoA__Group__0__Impl_in_rule__VideoA__Group__01659 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__VideoA__Group__1_in_rule__VideoA__Group__01662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoA__VideoidAssignment_0_in_rule__VideoA__Group__0__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoA__Group__1__Impl_in_rule__VideoA__Group__11720 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__VideoA__Group__2_in_rule__VideoA__Group__11723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoA__Group__1__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoA__Group__2__Impl_in_rule__VideoA__Group__21779 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__VideoA__Group__3_in_rule__VideoA__Group__21782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoA__Group_2__0_in_rule__VideoA__Group__2__Impl1809 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__VideoA__Group__3__Impl_in_rule__VideoA__Group__31840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoA__Group__3__Impl1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoA__Group_2__0__Impl_in_rule__VideoA__Group_2__01904 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__VideoA__Group_2__1_in_rule__VideoA__Group_2__01907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VideoA__Group_2__0__Impl1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoA__Group_2__1__Impl_in_rule__VideoA__Group_2__11966 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__VideoA__Group_2__2_in_rule__VideoA__Group_2__11969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoA__VideoidAssignment_2_1_in_rule__VideoA__Group_2__1__Impl1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoA__Group_2__2__Impl_in_rule__VideoA__Group_2__22027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoA__CheminAssignment_2_2_in_rule__VideoA__Group_2__2__Impl2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__0__Impl_in_rule__VideoPropriete__Group__02090 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__1_in_rule__VideoPropriete__Group__02093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_0__0_in_rule__VideoPropriete__Group__0__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__1__Impl_in_rule__VideoPropriete__Group__12151 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__2_in_rule__VideoPropriete__Group__12154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_1__0_in_rule__VideoPropriete__Group__1__Impl2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__2__Impl_in_rule__VideoPropriete__Group__22212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_2__0_in_rule__VideoPropriete__Group__2__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_0__0__Impl_in_rule__VideoPropriete__Group_0__02276 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_0__1_in_rule__VideoPropriete__Group_0__02279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VideoPropriete__Group_0__0__Impl2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_0__1__Impl_in_rule__VideoPropriete__Group_0__12338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__ProbabiliteAssignment_0_1_in_rule__VideoPropriete__Group_0__1__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_1__0__Impl_in_rule__VideoPropriete__Group_1__02399 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_1__1_in_rule__VideoPropriete__Group_1__02402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VideoPropriete__Group_1__0__Impl2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_1__1__Impl_in_rule__VideoPropriete__Group_1__12461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__DureeAssignment_1_1_in_rule__VideoPropriete__Group_1__1__Impl2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_2__0__Impl_in_rule__VideoPropriete__Group_2__02522 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_2__1_in_rule__VideoPropriete__Group_2__02525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VideoPropriete__Group_2__0__Impl2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_2__1__Impl_in_rule__VideoPropriete__Group_2__12584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__DescriptionAssignment_2_1_in_rule__VideoPropriete__Group_2__1__Impl2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarianteVideo_in_rule__VideoGenModel__Variante_videosAssignment_22650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_rule__MandatoryVideoSeq__VideoAssignment_12681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_rule__OptionalVideoSeq__VideoAssignment_12712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoA_in_rule__AlternativeVideoSeq__VideoAssignment_12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Video__VideoidAssignment_12774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Video__CheminAssignment_22805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoPropriete_in_rule__Video__ProprieteAssignment_3_12836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VideoA__VideoidAssignment_02867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VideoA__VideoidAssignment_2_12898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VideoA__CheminAssignment_2_22929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VideoPropriete__ProbabiliteAssignment_0_12960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VideoPropriete__DureeAssignment_1_12991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VideoPropriete__DescriptionAssignment_2_13022 = new BitSet(new long[]{0x0000000000000002L});

}