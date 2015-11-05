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


    // $ANTLR start "entryRuleVideoPropriete"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:228:1: entryRuleVideoPropriete : ruleVideoPropriete EOF ;
    public final void entryRuleVideoPropriete() throws RecognitionException {
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:229:1: ( ruleVideoPropriete EOF )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:230:1: ruleVideoPropriete EOF
            {
             before(grammarAccess.getVideoProprieteRule()); 
            pushFollow(FOLLOW_ruleVideoPropriete_in_entryRuleVideoPropriete421);
            ruleVideoPropriete();

            state._fsp--;

             after(grammarAccess.getVideoProprieteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoPropriete428); 

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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:237:1: ruleVideoPropriete : ( ( rule__VideoPropriete__Group__0 ) ) ;
    public final void ruleVideoPropriete() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:241:2: ( ( ( rule__VideoPropriete__Group__0 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:242:1: ( ( rule__VideoPropriete__Group__0 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:242:1: ( ( rule__VideoPropriete__Group__0 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:243:1: ( rule__VideoPropriete__Group__0 )
            {
             before(grammarAccess.getVideoProprieteAccess().getGroup()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:244:1: ( rule__VideoPropriete__Group__0 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:244:2: rule__VideoPropriete__Group__0
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group__0_in_ruleVideoPropriete454);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:256:1: rule__VarianteVideo__Alternatives : ( ( ruleMandatoryVideoSeq ) | ( ruleOptionalVideoSeq ) | ( ruleAlternativeVideoSeq ) );
    public final void rule__VarianteVideo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:260:1: ( ( ruleMandatoryVideoSeq ) | ( ruleOptionalVideoSeq ) | ( ruleAlternativeVideoSeq ) )
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
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:261:1: ( ruleMandatoryVideoSeq )
                    {
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:261:1: ( ruleMandatoryVideoSeq )
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:262:1: ruleMandatoryVideoSeq
                    {
                     before(grammarAccess.getVarianteVideoAccess().getMandatoryVideoSeqParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatoryVideoSeq_in_rule__VarianteVideo__Alternatives490);
                    ruleMandatoryVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getVarianteVideoAccess().getMandatoryVideoSeqParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:267:6: ( ruleOptionalVideoSeq )
                    {
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:267:6: ( ruleOptionalVideoSeq )
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:268:1: ruleOptionalVideoSeq
                    {
                     before(grammarAccess.getVarianteVideoAccess().getOptionalVideoSeqParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptionalVideoSeq_in_rule__VarianteVideo__Alternatives507);
                    ruleOptionalVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getVarianteVideoAccess().getOptionalVideoSeqParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:273:6: ( ruleAlternativeVideoSeq )
                    {
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:273:6: ( ruleAlternativeVideoSeq )
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:274:1: ruleAlternativeVideoSeq
                    {
                     before(grammarAccess.getVarianteVideoAccess().getAlternativeVideoSeqParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAlternativeVideoSeq_in_rule__VarianteVideo__Alternatives524);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:286:1: rule__VideoGenModel__Group__0 : rule__VideoGenModel__Group__0__Impl rule__VideoGenModel__Group__1 ;
    public final void rule__VideoGenModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:290:1: ( rule__VideoGenModel__Group__0__Impl rule__VideoGenModel__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:291:2: rule__VideoGenModel__Group__0__Impl rule__VideoGenModel__Group__1
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__0__Impl_in_rule__VideoGenModel__Group__0554);
            rule__VideoGenModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGenModel__Group__1_in_rule__VideoGenModel__Group__0557);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:298:1: rule__VideoGenModel__Group__0__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGenModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:302:1: ( ( 'VideoGen' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:303:1: ( 'VideoGen' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:303:1: ( 'VideoGen' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:304:1: 'VideoGen'
            {
             before(grammarAccess.getVideoGenModelAccess().getVideoGenKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__VideoGenModel__Group__0__Impl585); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:317:1: rule__VideoGenModel__Group__1 : rule__VideoGenModel__Group__1__Impl rule__VideoGenModel__Group__2 ;
    public final void rule__VideoGenModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:321:1: ( rule__VideoGenModel__Group__1__Impl rule__VideoGenModel__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:322:2: rule__VideoGenModel__Group__1__Impl rule__VideoGenModel__Group__2
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__1__Impl_in_rule__VideoGenModel__Group__1616);
            rule__VideoGenModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGenModel__Group__2_in_rule__VideoGenModel__Group__1619);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:329:1: rule__VideoGenModel__Group__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoGenModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:333:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:334:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:334:1: ( RULE_LEFT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:335:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoGenModelAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoGenModel__Group__1__Impl646); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:346:1: rule__VideoGenModel__Group__2 : rule__VideoGenModel__Group__2__Impl rule__VideoGenModel__Group__3 ;
    public final void rule__VideoGenModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:350:1: ( rule__VideoGenModel__Group__2__Impl rule__VideoGenModel__Group__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:351:2: rule__VideoGenModel__Group__2__Impl rule__VideoGenModel__Group__3
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__2__Impl_in_rule__VideoGenModel__Group__2675);
            rule__VideoGenModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGenModel__Group__3_in_rule__VideoGenModel__Group__2678);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:358:1: rule__VideoGenModel__Group__2__Impl : ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* ) ;
    public final void rule__VideoGenModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:362:1: ( ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:363:1: ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:363:1: ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:364:1: ( rule__VideoGenModel__Variante_videosAssignment_2 )*
            {
             before(grammarAccess.getVideoGenModelAccess().getVariante_videosAssignment_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:365:1: ( rule__VideoGenModel__Variante_videosAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:365:2: rule__VideoGenModel__Variante_videosAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VideoGenModel__Variante_videosAssignment_2_in_rule__VideoGenModel__Group__2__Impl705);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:375:1: rule__VideoGenModel__Group__3 : rule__VideoGenModel__Group__3__Impl ;
    public final void rule__VideoGenModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:379:1: ( rule__VideoGenModel__Group__3__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:380:2: rule__VideoGenModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__3__Impl_in_rule__VideoGenModel__Group__3736);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:386:1: rule__VideoGenModel__Group__3__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoGenModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:390:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:391:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:391:1: ( RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:392:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoGenModelAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGenModel__Group__3__Impl763); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:411:1: rule__MandatoryVideoSeq__Group__0 : rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 ;
    public final void rule__MandatoryVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:415:1: ( rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:416:2: rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__0__Impl_in_rule__MandatoryVideoSeq__Group__0800);
            rule__MandatoryVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__1_in_rule__MandatoryVideoSeq__Group__0803);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:423:1: rule__MandatoryVideoSeq__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__MandatoryVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:427:1: ( ( 'mandatory' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:428:1: ( 'mandatory' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:428:1: ( 'mandatory' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:429:1: 'mandatory'
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__MandatoryVideoSeq__Group__0__Impl831); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:442:1: rule__MandatoryVideoSeq__Group__1 : rule__MandatoryVideoSeq__Group__1__Impl ;
    public final void rule__MandatoryVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:446:1: ( rule__MandatoryVideoSeq__Group__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:447:2: rule__MandatoryVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__1__Impl_in_rule__MandatoryVideoSeq__Group__1862);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:453:1: rule__MandatoryVideoSeq__Group__1__Impl : ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) ) ;
    public final void rule__MandatoryVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:457:1: ( ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:458:1: ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:458:1: ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:459:1: ( rule__MandatoryVideoSeq__VideoAssignment_1 )
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getVideoAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:460:1: ( rule__MandatoryVideoSeq__VideoAssignment_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:460:2: rule__MandatoryVideoSeq__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__VideoAssignment_1_in_rule__MandatoryVideoSeq__Group__1__Impl889);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:474:1: rule__OptionalVideoSeq__Group__0 : rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 ;
    public final void rule__OptionalVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:478:1: ( rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:479:2: rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__0__Impl_in_rule__OptionalVideoSeq__Group__0923);
            rule__OptionalVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__1_in_rule__OptionalVideoSeq__Group__0926);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:486:1: rule__OptionalVideoSeq__Group__0__Impl : ( 'optional' ) ;
    public final void rule__OptionalVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:490:1: ( ( 'optional' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:491:1: ( 'optional' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:491:1: ( 'optional' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:492:1: 'optional'
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__OptionalVideoSeq__Group__0__Impl954); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:505:1: rule__OptionalVideoSeq__Group__1 : rule__OptionalVideoSeq__Group__1__Impl ;
    public final void rule__OptionalVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:509:1: ( rule__OptionalVideoSeq__Group__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:510:2: rule__OptionalVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__1__Impl_in_rule__OptionalVideoSeq__Group__1985);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:516:1: rule__OptionalVideoSeq__Group__1__Impl : ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) ) ;
    public final void rule__OptionalVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:520:1: ( ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:521:1: ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:521:1: ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:522:1: ( rule__OptionalVideoSeq__VideoAssignment_1 )
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getVideoAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:523:1: ( rule__OptionalVideoSeq__VideoAssignment_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:523:2: rule__OptionalVideoSeq__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__VideoAssignment_1_in_rule__OptionalVideoSeq__Group__1__Impl1012);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:537:1: rule__AlternativeVideoSeq__Group__0 : rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1 ;
    public final void rule__AlternativeVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:541:1: ( rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:542:2: rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__0__Impl_in_rule__AlternativeVideoSeq__Group__01046);
            rule__AlternativeVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__1_in_rule__AlternativeVideoSeq__Group__01049);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:549:1: rule__AlternativeVideoSeq__Group__0__Impl : ( 'alternative' ) ;
    public final void rule__AlternativeVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:553:1: ( ( 'alternative' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:554:1: ( 'alternative' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:554:1: ( 'alternative' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:555:1: 'alternative'
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getAlternativeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__AlternativeVideoSeq__Group__0__Impl1077); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:568:1: rule__AlternativeVideoSeq__Group__1 : rule__AlternativeVideoSeq__Group__1__Impl ;
    public final void rule__AlternativeVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:572:1: ( rule__AlternativeVideoSeq__Group__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:573:2: rule__AlternativeVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__1__Impl_in_rule__AlternativeVideoSeq__Group__11108);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:579:1: rule__AlternativeVideoSeq__Group__1__Impl : ( ( rule__AlternativeVideoSeq__VideoAssignment_1 ) ) ;
    public final void rule__AlternativeVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:583:1: ( ( ( rule__AlternativeVideoSeq__VideoAssignment_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:584:1: ( ( rule__AlternativeVideoSeq__VideoAssignment_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:584:1: ( ( rule__AlternativeVideoSeq__VideoAssignment_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:585:1: ( rule__AlternativeVideoSeq__VideoAssignment_1 )
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:586:1: ( rule__AlternativeVideoSeq__VideoAssignment_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:586:2: rule__AlternativeVideoSeq__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__VideoAssignment_1_in_rule__AlternativeVideoSeq__Group__1__Impl1135);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:600:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:604:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:605:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_rule__Video__Group__0__Impl_in_rule__Video__Group__01169);
            rule__Video__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Video__Group__1_in_rule__Video__Group__01172);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:612:1: rule__Video__Group__0__Impl : ( 'video' ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:616:1: ( ( 'video' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:617:1: ( 'video' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:617:1: ( 'video' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:618:1: 'video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Video__Group__0__Impl1200); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:631:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:635:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:636:2: rule__Video__Group__1__Impl rule__Video__Group__2
            {
            pushFollow(FOLLOW_rule__Video__Group__1__Impl_in_rule__Video__Group__11231);
            rule__Video__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Video__Group__2_in_rule__Video__Group__11234);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:643:1: rule__Video__Group__1__Impl : ( ( rule__Video__VideoidAssignment_1 )? ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:647:1: ( ( ( rule__Video__VideoidAssignment_1 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:648:1: ( ( rule__Video__VideoidAssignment_1 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:648:1: ( ( rule__Video__VideoidAssignment_1 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:649:1: ( rule__Video__VideoidAssignment_1 )?
            {
             before(grammarAccess.getVideoAccess().getVideoidAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:650:1: ( rule__Video__VideoidAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:650:2: rule__Video__VideoidAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Video__VideoidAssignment_1_in_rule__Video__Group__1__Impl1261);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:660:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:664:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:665:2: rule__Video__Group__2__Impl rule__Video__Group__3
            {
            pushFollow(FOLLOW_rule__Video__Group__2__Impl_in_rule__Video__Group__21292);
            rule__Video__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Video__Group__3_in_rule__Video__Group__21295);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:672:1: rule__Video__Group__2__Impl : ( ( rule__Video__CheminAssignment_2 ) ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:676:1: ( ( ( rule__Video__CheminAssignment_2 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:677:1: ( ( rule__Video__CheminAssignment_2 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:677:1: ( ( rule__Video__CheminAssignment_2 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:678:1: ( rule__Video__CheminAssignment_2 )
            {
             before(grammarAccess.getVideoAccess().getCheminAssignment_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:679:1: ( rule__Video__CheminAssignment_2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:679:2: rule__Video__CheminAssignment_2
            {
            pushFollow(FOLLOW_rule__Video__CheminAssignment_2_in_rule__Video__Group__2__Impl1322);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:689:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:693:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:694:2: rule__Video__Group__3__Impl rule__Video__Group__4
            {
            pushFollow(FOLLOW_rule__Video__Group__3__Impl_in_rule__Video__Group__31352);
            rule__Video__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Video__Group__4_in_rule__Video__Group__31355);
            rule__Video__Group__4();

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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:701:1: rule__Video__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:705:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:706:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:706:1: ( RULE_LEFT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:707:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoAccess().getLEFT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__Video__Group__3__Impl1382); 
             after(grammarAccess.getVideoAccess().getLEFT_BRACKETTerminalRuleCall_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Video__Group__4"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:718:1: rule__Video__Group__4 : rule__Video__Group__4__Impl rule__Video__Group__5 ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:722:1: ( rule__Video__Group__4__Impl rule__Video__Group__5 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:723:2: rule__Video__Group__4__Impl rule__Video__Group__5
            {
            pushFollow(FOLLOW_rule__Video__Group__4__Impl_in_rule__Video__Group__41411);
            rule__Video__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Video__Group__5_in_rule__Video__Group__41414);
            rule__Video__Group__5();

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
    // $ANTLR end "rule__Video__Group__4"


    // $ANTLR start "rule__Video__Group__4__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:730:1: rule__Video__Group__4__Impl : ( ( rule__Video__ProprieteAssignment_4 ) ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:734:1: ( ( ( rule__Video__ProprieteAssignment_4 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:735:1: ( ( rule__Video__ProprieteAssignment_4 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:735:1: ( ( rule__Video__ProprieteAssignment_4 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:736:1: ( rule__Video__ProprieteAssignment_4 )
            {
             before(grammarAccess.getVideoAccess().getProprieteAssignment_4()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:737:1: ( rule__Video__ProprieteAssignment_4 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:737:2: rule__Video__ProprieteAssignment_4
            {
            pushFollow(FOLLOW_rule__Video__ProprieteAssignment_4_in_rule__Video__Group__4__Impl1441);
            rule__Video__ProprieteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getProprieteAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__4__Impl"


    // $ANTLR start "rule__Video__Group__5"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:747:1: rule__Video__Group__5 : rule__Video__Group__5__Impl ;
    public final void rule__Video__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:751:1: ( rule__Video__Group__5__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:752:2: rule__Video__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Video__Group__5__Impl_in_rule__Video__Group__51471);
            rule__Video__Group__5__Impl();

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
    // $ANTLR end "rule__Video__Group__5"


    // $ANTLR start "rule__Video__Group__5__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:758:1: rule__Video__Group__5__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Video__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:762:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:763:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:763:1: ( RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:764:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoAccess().getRIGHT_BRACKETTerminalRuleCall_5()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__Video__Group__5__Impl1498); 
             after(grammarAccess.getVideoAccess().getRIGHT_BRACKETTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__5__Impl"


    // $ANTLR start "rule__VideoPropriete__Group__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:787:1: rule__VideoPropriete__Group__0 : rule__VideoPropriete__Group__0__Impl rule__VideoPropriete__Group__1 ;
    public final void rule__VideoPropriete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:791:1: ( rule__VideoPropriete__Group__0__Impl rule__VideoPropriete__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:792:2: rule__VideoPropriete__Group__0__Impl rule__VideoPropriete__Group__1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group__0__Impl_in_rule__VideoPropriete__Group__01539);
            rule__VideoPropriete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoPropriete__Group__1_in_rule__VideoPropriete__Group__01542);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:799:1: rule__VideoPropriete__Group__0__Impl : ( ( rule__VideoPropriete__Group_0__0 )? ) ;
    public final void rule__VideoPropriete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:803:1: ( ( ( rule__VideoPropriete__Group_0__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:804:1: ( ( rule__VideoPropriete__Group_0__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:804:1: ( ( rule__VideoPropriete__Group_0__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:805:1: ( rule__VideoPropriete__Group_0__0 )?
            {
             before(grammarAccess.getVideoProprieteAccess().getGroup_0()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:806:1: ( rule__VideoPropriete__Group_0__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:806:2: rule__VideoPropriete__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__VideoPropriete__Group_0__0_in_rule__VideoPropriete__Group__0__Impl1569);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:816:1: rule__VideoPropriete__Group__1 : rule__VideoPropriete__Group__1__Impl rule__VideoPropriete__Group__2 ;
    public final void rule__VideoPropriete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:820:1: ( rule__VideoPropriete__Group__1__Impl rule__VideoPropriete__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:821:2: rule__VideoPropriete__Group__1__Impl rule__VideoPropriete__Group__2
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group__1__Impl_in_rule__VideoPropriete__Group__11600);
            rule__VideoPropriete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoPropriete__Group__2_in_rule__VideoPropriete__Group__11603);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:828:1: rule__VideoPropriete__Group__1__Impl : ( ( rule__VideoPropriete__Group_1__0 )? ) ;
    public final void rule__VideoPropriete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:832:1: ( ( ( rule__VideoPropriete__Group_1__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:833:1: ( ( rule__VideoPropriete__Group_1__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:833:1: ( ( rule__VideoPropriete__Group_1__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:834:1: ( rule__VideoPropriete__Group_1__0 )?
            {
             before(grammarAccess.getVideoProprieteAccess().getGroup_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:835:1: ( rule__VideoPropriete__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:835:2: rule__VideoPropriete__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VideoPropriete__Group_1__0_in_rule__VideoPropriete__Group__1__Impl1630);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:845:1: rule__VideoPropriete__Group__2 : rule__VideoPropriete__Group__2__Impl ;
    public final void rule__VideoPropriete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:849:1: ( rule__VideoPropriete__Group__2__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:850:2: rule__VideoPropriete__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group__2__Impl_in_rule__VideoPropriete__Group__21661);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:856:1: rule__VideoPropriete__Group__2__Impl : ( ( rule__VideoPropriete__Group_2__0 )? ) ;
    public final void rule__VideoPropriete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:860:1: ( ( ( rule__VideoPropriete__Group_2__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:861:1: ( ( rule__VideoPropriete__Group_2__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:861:1: ( ( rule__VideoPropriete__Group_2__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:862:1: ( rule__VideoPropriete__Group_2__0 )?
            {
             before(grammarAccess.getVideoProprieteAccess().getGroup_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:863:1: ( rule__VideoPropriete__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:863:2: rule__VideoPropriete__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__VideoPropriete__Group_2__0_in_rule__VideoPropriete__Group__2__Impl1688);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:879:1: rule__VideoPropriete__Group_0__0 : rule__VideoPropriete__Group_0__0__Impl rule__VideoPropriete__Group_0__1 ;
    public final void rule__VideoPropriete__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:883:1: ( rule__VideoPropriete__Group_0__0__Impl rule__VideoPropriete__Group_0__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:884:2: rule__VideoPropriete__Group_0__0__Impl rule__VideoPropriete__Group_0__1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_0__0__Impl_in_rule__VideoPropriete__Group_0__01725);
            rule__VideoPropriete__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoPropriete__Group_0__1_in_rule__VideoPropriete__Group_0__01728);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:891:1: rule__VideoPropriete__Group_0__0__Impl : ( 'probabilite' ) ;
    public final void rule__VideoPropriete__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:895:1: ( ( 'probabilite' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:896:1: ( 'probabilite' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:896:1: ( 'probabilite' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:897:1: 'probabilite'
            {
             before(grammarAccess.getVideoProprieteAccess().getProbabiliteKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__VideoPropriete__Group_0__0__Impl1756); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:910:1: rule__VideoPropriete__Group_0__1 : rule__VideoPropriete__Group_0__1__Impl ;
    public final void rule__VideoPropriete__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:914:1: ( rule__VideoPropriete__Group_0__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:915:2: rule__VideoPropriete__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_0__1__Impl_in_rule__VideoPropriete__Group_0__11787);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:921:1: rule__VideoPropriete__Group_0__1__Impl : ( ( rule__VideoPropriete__ProbabiliteAssignment_0_1 ) ) ;
    public final void rule__VideoPropriete__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:925:1: ( ( ( rule__VideoPropriete__ProbabiliteAssignment_0_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:926:1: ( ( rule__VideoPropriete__ProbabiliteAssignment_0_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:926:1: ( ( rule__VideoPropriete__ProbabiliteAssignment_0_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:927:1: ( rule__VideoPropriete__ProbabiliteAssignment_0_1 )
            {
             before(grammarAccess.getVideoProprieteAccess().getProbabiliteAssignment_0_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:928:1: ( rule__VideoPropriete__ProbabiliteAssignment_0_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:928:2: rule__VideoPropriete__ProbabiliteAssignment_0_1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__ProbabiliteAssignment_0_1_in_rule__VideoPropriete__Group_0__1__Impl1814);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:942:1: rule__VideoPropriete__Group_1__0 : rule__VideoPropriete__Group_1__0__Impl rule__VideoPropriete__Group_1__1 ;
    public final void rule__VideoPropriete__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:946:1: ( rule__VideoPropriete__Group_1__0__Impl rule__VideoPropriete__Group_1__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:947:2: rule__VideoPropriete__Group_1__0__Impl rule__VideoPropriete__Group_1__1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_1__0__Impl_in_rule__VideoPropriete__Group_1__01848);
            rule__VideoPropriete__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoPropriete__Group_1__1_in_rule__VideoPropriete__Group_1__01851);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:954:1: rule__VideoPropriete__Group_1__0__Impl : ( 'duree' ) ;
    public final void rule__VideoPropriete__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:958:1: ( ( 'duree' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:959:1: ( 'duree' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:959:1: ( 'duree' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:960:1: 'duree'
            {
             before(grammarAccess.getVideoProprieteAccess().getDureeKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__VideoPropriete__Group_1__0__Impl1879); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:973:1: rule__VideoPropriete__Group_1__1 : rule__VideoPropriete__Group_1__1__Impl ;
    public final void rule__VideoPropriete__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:977:1: ( rule__VideoPropriete__Group_1__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:978:2: rule__VideoPropriete__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_1__1__Impl_in_rule__VideoPropriete__Group_1__11910);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:984:1: rule__VideoPropriete__Group_1__1__Impl : ( ( rule__VideoPropriete__DureeAssignment_1_1 ) ) ;
    public final void rule__VideoPropriete__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:988:1: ( ( ( rule__VideoPropriete__DureeAssignment_1_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:989:1: ( ( rule__VideoPropriete__DureeAssignment_1_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:989:1: ( ( rule__VideoPropriete__DureeAssignment_1_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:990:1: ( rule__VideoPropriete__DureeAssignment_1_1 )
            {
             before(grammarAccess.getVideoProprieteAccess().getDureeAssignment_1_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:991:1: ( rule__VideoPropriete__DureeAssignment_1_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:991:2: rule__VideoPropriete__DureeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__DureeAssignment_1_1_in_rule__VideoPropriete__Group_1__1__Impl1937);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1005:1: rule__VideoPropriete__Group_2__0 : rule__VideoPropriete__Group_2__0__Impl rule__VideoPropriete__Group_2__1 ;
    public final void rule__VideoPropriete__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1009:1: ( rule__VideoPropriete__Group_2__0__Impl rule__VideoPropriete__Group_2__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1010:2: rule__VideoPropriete__Group_2__0__Impl rule__VideoPropriete__Group_2__1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_2__0__Impl_in_rule__VideoPropriete__Group_2__01971);
            rule__VideoPropriete__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoPropriete__Group_2__1_in_rule__VideoPropriete__Group_2__01974);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1017:1: rule__VideoPropriete__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__VideoPropriete__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1021:1: ( ( 'description' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1022:1: ( 'description' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1022:1: ( 'description' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1023:1: 'description'
            {
             before(grammarAccess.getVideoProprieteAccess().getDescriptionKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__VideoPropriete__Group_2__0__Impl2002); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1036:1: rule__VideoPropriete__Group_2__1 : rule__VideoPropriete__Group_2__1__Impl ;
    public final void rule__VideoPropriete__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1040:1: ( rule__VideoPropriete__Group_2__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1041:2: rule__VideoPropriete__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VideoPropriete__Group_2__1__Impl_in_rule__VideoPropriete__Group_2__12033);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1047:1: rule__VideoPropriete__Group_2__1__Impl : ( ( rule__VideoPropriete__DescriptionAssignment_2_1 ) ) ;
    public final void rule__VideoPropriete__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1051:1: ( ( ( rule__VideoPropriete__DescriptionAssignment_2_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1052:1: ( ( rule__VideoPropriete__DescriptionAssignment_2_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1052:1: ( ( rule__VideoPropriete__DescriptionAssignment_2_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1053:1: ( rule__VideoPropriete__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getVideoProprieteAccess().getDescriptionAssignment_2_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1054:1: ( rule__VideoPropriete__DescriptionAssignment_2_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1054:2: rule__VideoPropriete__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VideoPropriete__DescriptionAssignment_2_1_in_rule__VideoPropriete__Group_2__1__Impl2060);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1069:1: rule__VideoGenModel__Variante_videosAssignment_2 : ( ruleVarianteVideo ) ;
    public final void rule__VideoGenModel__Variante_videosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1073:1: ( ( ruleVarianteVideo ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1074:1: ( ruleVarianteVideo )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1074:1: ( ruleVarianteVideo )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1075:1: ruleVarianteVideo
            {
             before(grammarAccess.getVideoGenModelAccess().getVariante_videosVarianteVideoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVarianteVideo_in_rule__VideoGenModel__Variante_videosAssignment_22099);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1084:1: rule__MandatoryVideoSeq__VideoAssignment_1 : ( ruleVideo ) ;
    public final void rule__MandatoryVideoSeq__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1088:1: ( ( ruleVideo ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1089:1: ( ruleVideo )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1089:1: ( ruleVideo )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1090:1: ruleVideo
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getVideoVideoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideo_in_rule__MandatoryVideoSeq__VideoAssignment_12130);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1099:1: rule__OptionalVideoSeq__VideoAssignment_1 : ( ruleVideo ) ;
    public final void rule__OptionalVideoSeq__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1103:1: ( ( ruleVideo ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1104:1: ( ruleVideo )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1104:1: ( ruleVideo )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1105:1: ruleVideo
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getVideoVideoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideo_in_rule__OptionalVideoSeq__VideoAssignment_12161);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1114:1: rule__AlternativeVideoSeq__VideoAssignment_1 : ( ruleVideo ) ;
    public final void rule__AlternativeVideoSeq__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1118:1: ( ( ruleVideo ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1119:1: ( ruleVideo )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1119:1: ( ruleVideo )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1120:1: ruleVideo
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoVideoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideo_in_rule__AlternativeVideoSeq__VideoAssignment_12192);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideoVideoParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1129:1: rule__Video__VideoidAssignment_1 : ( RULE_ID ) ;
    public final void rule__Video__VideoidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1133:1: ( ( RULE_ID ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1134:1: ( RULE_ID )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1134:1: ( RULE_ID )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1135:1: RULE_ID
            {
             before(grammarAccess.getVideoAccess().getVideoidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Video__VideoidAssignment_12223); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1144:1: rule__Video__CheminAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Video__CheminAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1148:1: ( ( RULE_STRING ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1149:1: ( RULE_STRING )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1149:1: ( RULE_STRING )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1150:1: RULE_STRING
            {
             before(grammarAccess.getVideoAccess().getCheminSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Video__CheminAssignment_22254); 
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


    // $ANTLR start "rule__Video__ProprieteAssignment_4"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1159:1: rule__Video__ProprieteAssignment_4 : ( ruleVideoPropriete ) ;
    public final void rule__Video__ProprieteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1163:1: ( ( ruleVideoPropriete ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1164:1: ( ruleVideoPropriete )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1164:1: ( ruleVideoPropriete )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1165:1: ruleVideoPropriete
            {
             before(grammarAccess.getVideoAccess().getProprieteVideoProprieteParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleVideoPropriete_in_rule__Video__ProprieteAssignment_42285);
            ruleVideoPropriete();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getProprieteVideoProprieteParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__ProprieteAssignment_4"


    // $ANTLR start "rule__VideoPropriete__ProbabiliteAssignment_0_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1174:1: rule__VideoPropriete__ProbabiliteAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__VideoPropriete__ProbabiliteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1178:1: ( ( RULE_INT ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1179:1: ( RULE_INT )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1179:1: ( RULE_INT )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1180:1: RULE_INT
            {
             before(grammarAccess.getVideoProprieteAccess().getProbabiliteINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VideoPropriete__ProbabiliteAssignment_0_12316); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1189:1: rule__VideoPropriete__DureeAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__VideoPropriete__DureeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1193:1: ( ( RULE_INT ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1194:1: ( RULE_INT )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1194:1: ( RULE_INT )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1195:1: RULE_INT
            {
             before(grammarAccess.getVideoProprieteAccess().getDureeINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VideoPropriete__DureeAssignment_1_12347); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1204:1: rule__VideoPropriete__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__VideoPropriete__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1208:1: ( ( RULE_STRING ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1209:1: ( RULE_STRING )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1209:1: ( RULE_STRING )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1210:1: RULE_STRING
            {
             before(grammarAccess.getVideoProprieteAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VideoPropriete__DescriptionAssignment_2_12378); 
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
    public static final BitSet FOLLOW_ruleVideoPropriete_in_entryRuleVideoPropriete421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoPropriete428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__0_in_ruleVideoPropriete454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryVideoSeq_in_rule__VarianteVideo__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalVideoSeq_in_rule__VarianteVideo__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeVideoSeq_in_rule__VarianteVideo__Alternatives524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__0__Impl_in_rule__VideoGenModel__Group__0554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__1_in_rule__VideoGenModel__Group__0557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VideoGenModel__Group__0__Impl585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__1__Impl_in_rule__VideoGenModel__Group__1616 = new BitSet(new long[]{0x000000000001C020L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__2_in_rule__VideoGenModel__Group__1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoGenModel__Group__1__Impl646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__2__Impl_in_rule__VideoGenModel__Group__2675 = new BitSet(new long[]{0x000000000001C020L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__3_in_rule__VideoGenModel__Group__2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Variante_videosAssignment_2_in_rule__VideoGenModel__Group__2__Impl705 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__3__Impl_in_rule__VideoGenModel__Group__3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGenModel__Group__3__Impl763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__0__Impl_in_rule__MandatoryVideoSeq__Group__0800 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__1_in_rule__MandatoryVideoSeq__Group__0803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MandatoryVideoSeq__Group__0__Impl831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__1__Impl_in_rule__MandatoryVideoSeq__Group__1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__VideoAssignment_1_in_rule__MandatoryVideoSeq__Group__1__Impl889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__0__Impl_in_rule__OptionalVideoSeq__Group__0923 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__1_in_rule__OptionalVideoSeq__Group__0926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__OptionalVideoSeq__Group__0__Impl954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__1__Impl_in_rule__OptionalVideoSeq__Group__1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__VideoAssignment_1_in_rule__OptionalVideoSeq__Group__1__Impl1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__0__Impl_in_rule__AlternativeVideoSeq__Group__01046 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__1_in_rule__AlternativeVideoSeq__Group__01049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AlternativeVideoSeq__Group__0__Impl1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__1__Impl_in_rule__AlternativeVideoSeq__Group__11108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__VideoAssignment_1_in_rule__AlternativeVideoSeq__Group__1__Impl1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group__0__Impl_in_rule__Video__Group__01169 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Video__Group__1_in_rule__Video__Group__01172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Video__Group__0__Impl1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group__1__Impl_in_rule__Video__Group__11231 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Video__Group__2_in_rule__Video__Group__11234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__VideoidAssignment_1_in_rule__Video__Group__1__Impl1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group__2__Impl_in_rule__Video__Group__21292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Video__Group__3_in_rule__Video__Group__21295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__CheminAssignment_2_in_rule__Video__Group__2__Impl1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group__3__Impl_in_rule__Video__Group__31352 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Video__Group__4_in_rule__Video__Group__31355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__Video__Group__3__Impl1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group__4__Impl_in_rule__Video__Group__41411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Video__Group__5_in_rule__Video__Group__41414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__ProprieteAssignment_4_in_rule__Video__Group__4__Impl1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Video__Group__5__Impl_in_rule__Video__Group__51471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__Video__Group__5__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__0__Impl_in_rule__VideoPropriete__Group__01539 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__1_in_rule__VideoPropriete__Group__01542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_0__0_in_rule__VideoPropriete__Group__0__Impl1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__1__Impl_in_rule__VideoPropriete__Group__11600 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__2_in_rule__VideoPropriete__Group__11603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_1__0_in_rule__VideoPropriete__Group__1__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group__2__Impl_in_rule__VideoPropriete__Group__21661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_2__0_in_rule__VideoPropriete__Group__2__Impl1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_0__0__Impl_in_rule__VideoPropriete__Group_0__01725 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_0__1_in_rule__VideoPropriete__Group_0__01728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VideoPropriete__Group_0__0__Impl1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_0__1__Impl_in_rule__VideoPropriete__Group_0__11787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__ProbabiliteAssignment_0_1_in_rule__VideoPropriete__Group_0__1__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_1__0__Impl_in_rule__VideoPropriete__Group_1__01848 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_1__1_in_rule__VideoPropriete__Group_1__01851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VideoPropriete__Group_1__0__Impl1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_1__1__Impl_in_rule__VideoPropriete__Group_1__11910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__DureeAssignment_1_1_in_rule__VideoPropriete__Group_1__1__Impl1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_2__0__Impl_in_rule__VideoPropriete__Group_2__01971 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_2__1_in_rule__VideoPropriete__Group_2__01974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VideoPropriete__Group_2__0__Impl2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__Group_2__1__Impl_in_rule__VideoPropriete__Group_2__12033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoPropriete__DescriptionAssignment_2_1_in_rule__VideoPropriete__Group_2__1__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarianteVideo_in_rule__VideoGenModel__Variante_videosAssignment_22099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_rule__MandatoryVideoSeq__VideoAssignment_12130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_rule__OptionalVideoSeq__VideoAssignment_12161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_rule__AlternativeVideoSeq__VideoAssignment_12192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Video__VideoidAssignment_12223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Video__CheminAssignment_22254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoPropriete_in_rule__Video__ProprieteAssignment_42285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VideoPropriete__ProbabiliteAssignment_0_12316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VideoPropriete__DureeAssignment_1_12347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VideoPropriete__DescriptionAssignment_2_12378 = new BitSet(new long[]{0x0000000000000002L});

}