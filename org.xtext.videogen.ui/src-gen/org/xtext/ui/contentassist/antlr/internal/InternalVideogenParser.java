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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'mandatory'", "'optional'", "'alternative'", "'video'", "'duree'", "'description'", "'probabilite'"
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


    // $ANTLR start "entryRuleVideodesc"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:200:1: entryRuleVideodesc : ruleVideodesc EOF ;
    public final void entryRuleVideodesc() throws RecognitionException {
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:201:1: ( ruleVideodesc EOF )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:202:1: ruleVideodesc EOF
            {
             before(grammarAccess.getVideodescRule()); 
            pushFollow(FOLLOW_ruleVideodesc_in_entryRuleVideodesc361);
            ruleVideodesc();

            state._fsp--;

             after(grammarAccess.getVideodescRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideodesc368); 

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
    // $ANTLR end "entryRuleVideodesc"


    // $ANTLR start "ruleVideodesc"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:209:1: ruleVideodesc : ( ( rule__Videodesc__Group__0 ) ) ;
    public final void ruleVideodesc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:213:2: ( ( ( rule__Videodesc__Group__0 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:214:1: ( ( rule__Videodesc__Group__0 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:214:1: ( ( rule__Videodesc__Group__0 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:215:1: ( rule__Videodesc__Group__0 )
            {
             before(grammarAccess.getVideodescAccess().getGroup()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:216:1: ( rule__Videodesc__Group__0 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:216:2: rule__Videodesc__Group__0
            {
            pushFollow(FOLLOW_rule__Videodesc__Group__0_in_ruleVideodesc394);
            rule__Videodesc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideodescAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideodesc"


    // $ANTLR start "rule__VarianteVideo__Alternatives"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:228:1: rule__VarianteVideo__Alternatives : ( ( ruleMandatoryVideoSeq ) | ( ruleOptionalVideoSeq ) | ( ruleAlternativeVideoSeq ) );
    public final void rule__VarianteVideo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:232:1: ( ( ruleMandatoryVideoSeq ) | ( ruleOptionalVideoSeq ) | ( ruleAlternativeVideoSeq ) )
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
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:233:1: ( ruleMandatoryVideoSeq )
                    {
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:233:1: ( ruleMandatoryVideoSeq )
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:234:1: ruleMandatoryVideoSeq
                    {
                     before(grammarAccess.getVarianteVideoAccess().getMandatoryVideoSeqParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatoryVideoSeq_in_rule__VarianteVideo__Alternatives430);
                    ruleMandatoryVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getVarianteVideoAccess().getMandatoryVideoSeqParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:239:6: ( ruleOptionalVideoSeq )
                    {
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:239:6: ( ruleOptionalVideoSeq )
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:240:1: ruleOptionalVideoSeq
                    {
                     before(grammarAccess.getVarianteVideoAccess().getOptionalVideoSeqParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptionalVideoSeq_in_rule__VarianteVideo__Alternatives447);
                    ruleOptionalVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getVarianteVideoAccess().getOptionalVideoSeqParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:245:6: ( ruleAlternativeVideoSeq )
                    {
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:245:6: ( ruleAlternativeVideoSeq )
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:246:1: ruleAlternativeVideoSeq
                    {
                     before(grammarAccess.getVarianteVideoAccess().getAlternativeVideoSeqParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAlternativeVideoSeq_in_rule__VarianteVideo__Alternatives464);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:258:1: rule__VideoGenModel__Group__0 : rule__VideoGenModel__Group__0__Impl rule__VideoGenModel__Group__1 ;
    public final void rule__VideoGenModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:262:1: ( rule__VideoGenModel__Group__0__Impl rule__VideoGenModel__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:263:2: rule__VideoGenModel__Group__0__Impl rule__VideoGenModel__Group__1
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__0__Impl_in_rule__VideoGenModel__Group__0494);
            rule__VideoGenModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGenModel__Group__1_in_rule__VideoGenModel__Group__0497);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:270:1: rule__VideoGenModel__Group__0__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGenModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:274:1: ( ( 'VideoGen' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:275:1: ( 'VideoGen' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:275:1: ( 'VideoGen' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:276:1: 'VideoGen'
            {
             before(grammarAccess.getVideoGenModelAccess().getVideoGenKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__VideoGenModel__Group__0__Impl525); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:289:1: rule__VideoGenModel__Group__1 : rule__VideoGenModel__Group__1__Impl rule__VideoGenModel__Group__2 ;
    public final void rule__VideoGenModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:293:1: ( rule__VideoGenModel__Group__1__Impl rule__VideoGenModel__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:294:2: rule__VideoGenModel__Group__1__Impl rule__VideoGenModel__Group__2
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__1__Impl_in_rule__VideoGenModel__Group__1556);
            rule__VideoGenModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGenModel__Group__2_in_rule__VideoGenModel__Group__1559);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:301:1: rule__VideoGenModel__Group__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoGenModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:305:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:306:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:306:1: ( RULE_LEFT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:307:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoGenModelAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoGenModel__Group__1__Impl586); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:318:1: rule__VideoGenModel__Group__2 : rule__VideoGenModel__Group__2__Impl rule__VideoGenModel__Group__3 ;
    public final void rule__VideoGenModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:322:1: ( rule__VideoGenModel__Group__2__Impl rule__VideoGenModel__Group__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:323:2: rule__VideoGenModel__Group__2__Impl rule__VideoGenModel__Group__3
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__2__Impl_in_rule__VideoGenModel__Group__2615);
            rule__VideoGenModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGenModel__Group__3_in_rule__VideoGenModel__Group__2618);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:330:1: rule__VideoGenModel__Group__2__Impl : ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* ) ;
    public final void rule__VideoGenModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:334:1: ( ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:335:1: ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:335:1: ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:336:1: ( rule__VideoGenModel__Variante_videosAssignment_2 )*
            {
             before(grammarAccess.getVideoGenModelAccess().getVariante_videosAssignment_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:337:1: ( rule__VideoGenModel__Variante_videosAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:337:2: rule__VideoGenModel__Variante_videosAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VideoGenModel__Variante_videosAssignment_2_in_rule__VideoGenModel__Group__2__Impl645);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:347:1: rule__VideoGenModel__Group__3 : rule__VideoGenModel__Group__3__Impl ;
    public final void rule__VideoGenModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:351:1: ( rule__VideoGenModel__Group__3__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:352:2: rule__VideoGenModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__3__Impl_in_rule__VideoGenModel__Group__3676);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:358:1: rule__VideoGenModel__Group__3__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoGenModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:362:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:363:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:363:1: ( RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:364:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoGenModelAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGenModel__Group__3__Impl703); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:383:1: rule__MandatoryVideoSeq__Group__0 : rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 ;
    public final void rule__MandatoryVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:387:1: ( rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:388:2: rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__0__Impl_in_rule__MandatoryVideoSeq__Group__0740);
            rule__MandatoryVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__1_in_rule__MandatoryVideoSeq__Group__0743);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:395:1: rule__MandatoryVideoSeq__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__MandatoryVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:399:1: ( ( 'mandatory' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:400:1: ( 'mandatory' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:400:1: ( 'mandatory' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:401:1: 'mandatory'
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__MandatoryVideoSeq__Group__0__Impl771); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:414:1: rule__MandatoryVideoSeq__Group__1 : rule__MandatoryVideoSeq__Group__1__Impl ;
    public final void rule__MandatoryVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:418:1: ( rule__MandatoryVideoSeq__Group__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:419:2: rule__MandatoryVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__1__Impl_in_rule__MandatoryVideoSeq__Group__1802);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:425:1: rule__MandatoryVideoSeq__Group__1__Impl : ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) ) ;
    public final void rule__MandatoryVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:429:1: ( ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:430:1: ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:430:1: ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:431:1: ( rule__MandatoryVideoSeq__VideoAssignment_1 )
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getVideoAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:432:1: ( rule__MandatoryVideoSeq__VideoAssignment_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:432:2: rule__MandatoryVideoSeq__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__VideoAssignment_1_in_rule__MandatoryVideoSeq__Group__1__Impl829);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:446:1: rule__OptionalVideoSeq__Group__0 : rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 ;
    public final void rule__OptionalVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:450:1: ( rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:451:2: rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__0__Impl_in_rule__OptionalVideoSeq__Group__0863);
            rule__OptionalVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__1_in_rule__OptionalVideoSeq__Group__0866);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:458:1: rule__OptionalVideoSeq__Group__0__Impl : ( 'optional' ) ;
    public final void rule__OptionalVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:462:1: ( ( 'optional' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:463:1: ( 'optional' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:463:1: ( 'optional' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:464:1: 'optional'
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__OptionalVideoSeq__Group__0__Impl894); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:477:1: rule__OptionalVideoSeq__Group__1 : rule__OptionalVideoSeq__Group__1__Impl ;
    public final void rule__OptionalVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:481:1: ( rule__OptionalVideoSeq__Group__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:482:2: rule__OptionalVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__1__Impl_in_rule__OptionalVideoSeq__Group__1925);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:488:1: rule__OptionalVideoSeq__Group__1__Impl : ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) ) ;
    public final void rule__OptionalVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:492:1: ( ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:493:1: ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:493:1: ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:494:1: ( rule__OptionalVideoSeq__VideoAssignment_1 )
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getVideoAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:495:1: ( rule__OptionalVideoSeq__VideoAssignment_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:495:2: rule__OptionalVideoSeq__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__VideoAssignment_1_in_rule__OptionalVideoSeq__Group__1__Impl952);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:509:1: rule__AlternativeVideoSeq__Group__0 : rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1 ;
    public final void rule__AlternativeVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:513:1: ( rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:514:2: rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__0__Impl_in_rule__AlternativeVideoSeq__Group__0986);
            rule__AlternativeVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__1_in_rule__AlternativeVideoSeq__Group__0989);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:521:1: rule__AlternativeVideoSeq__Group__0__Impl : ( 'alternative' ) ;
    public final void rule__AlternativeVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:525:1: ( ( 'alternative' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:526:1: ( 'alternative' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:526:1: ( 'alternative' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:527:1: 'alternative'
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getAlternativeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__AlternativeVideoSeq__Group__0__Impl1017); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:540:1: rule__AlternativeVideoSeq__Group__1 : rule__AlternativeVideoSeq__Group__1__Impl rule__AlternativeVideoSeq__Group__2 ;
    public final void rule__AlternativeVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:544:1: ( rule__AlternativeVideoSeq__Group__1__Impl rule__AlternativeVideoSeq__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:545:2: rule__AlternativeVideoSeq__Group__1__Impl rule__AlternativeVideoSeq__Group__2
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__1__Impl_in_rule__AlternativeVideoSeq__Group__11048);
            rule__AlternativeVideoSeq__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__2_in_rule__AlternativeVideoSeq__Group__11051);
            rule__AlternativeVideoSeq__Group__2();

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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:552:1: rule__AlternativeVideoSeq__Group__1__Impl : ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? ) ;
    public final void rule__AlternativeVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:556:1: ( ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:557:1: ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:557:1: ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:558:1: ( rule__AlternativeVideoSeq__VideoidAssignment_1 )?
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoidAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:559:1: ( rule__AlternativeVideoSeq__VideoidAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:559:2: rule__AlternativeVideoSeq__VideoidAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AlternativeVideoSeq__VideoidAssignment_1_in_rule__AlternativeVideoSeq__Group__1__Impl1078);
                    rule__AlternativeVideoSeq__VideoidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideoidAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AlternativeVideoSeq__Group__2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:569:1: rule__AlternativeVideoSeq__Group__2 : rule__AlternativeVideoSeq__Group__2__Impl rule__AlternativeVideoSeq__Group__3 ;
    public final void rule__AlternativeVideoSeq__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:573:1: ( rule__AlternativeVideoSeq__Group__2__Impl rule__AlternativeVideoSeq__Group__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:574:2: rule__AlternativeVideoSeq__Group__2__Impl rule__AlternativeVideoSeq__Group__3
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__2__Impl_in_rule__AlternativeVideoSeq__Group__21109);
            rule__AlternativeVideoSeq__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__3_in_rule__AlternativeVideoSeq__Group__21112);
            rule__AlternativeVideoSeq__Group__3();

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
    // $ANTLR end "rule__AlternativeVideoSeq__Group__2"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__2__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:581:1: rule__AlternativeVideoSeq__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__AlternativeVideoSeq__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:585:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:586:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:586:1: ( RULE_LEFT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:587:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__AlternativeVideoSeq__Group__2__Impl1139); 
             after(grammarAccess.getAlternativeVideoSeqAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__2__Impl"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__3"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:598:1: rule__AlternativeVideoSeq__Group__3 : rule__AlternativeVideoSeq__Group__3__Impl rule__AlternativeVideoSeq__Group__4 ;
    public final void rule__AlternativeVideoSeq__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:602:1: ( rule__AlternativeVideoSeq__Group__3__Impl rule__AlternativeVideoSeq__Group__4 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:603:2: rule__AlternativeVideoSeq__Group__3__Impl rule__AlternativeVideoSeq__Group__4
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__3__Impl_in_rule__AlternativeVideoSeq__Group__31168);
            rule__AlternativeVideoSeq__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__4_in_rule__AlternativeVideoSeq__Group__31171);
            rule__AlternativeVideoSeq__Group__4();

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
    // $ANTLR end "rule__AlternativeVideoSeq__Group__3"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__3__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:610:1: rule__AlternativeVideoSeq__Group__3__Impl : ( ( rule__AlternativeVideoSeq__VideoAssignment_3 ) ) ;
    public final void rule__AlternativeVideoSeq__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:614:1: ( ( ( rule__AlternativeVideoSeq__VideoAssignment_3 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:615:1: ( ( rule__AlternativeVideoSeq__VideoAssignment_3 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:615:1: ( ( rule__AlternativeVideoSeq__VideoAssignment_3 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:616:1: ( rule__AlternativeVideoSeq__VideoAssignment_3 )
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoAssignment_3()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:617:1: ( rule__AlternativeVideoSeq__VideoAssignment_3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:617:2: rule__AlternativeVideoSeq__VideoAssignment_3
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__VideoAssignment_3_in_rule__AlternativeVideoSeq__Group__3__Impl1198);
            rule__AlternativeVideoSeq__VideoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__3__Impl"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__4"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:627:1: rule__AlternativeVideoSeq__Group__4 : rule__AlternativeVideoSeq__Group__4__Impl ;
    public final void rule__AlternativeVideoSeq__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:631:1: ( rule__AlternativeVideoSeq__Group__4__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:632:2: rule__AlternativeVideoSeq__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__4__Impl_in_rule__AlternativeVideoSeq__Group__41228);
            rule__AlternativeVideoSeq__Group__4__Impl();

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
    // $ANTLR end "rule__AlternativeVideoSeq__Group__4"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__4__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:638:1: rule__AlternativeVideoSeq__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__AlternativeVideoSeq__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:642:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:643:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:643:1: ( RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:644:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__AlternativeVideoSeq__Group__4__Impl1255); 
             after(grammarAccess.getAlternativeVideoSeqAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__4__Impl"


    // $ANTLR start "rule__Videodesc__Group__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:665:1: rule__Videodesc__Group__0 : rule__Videodesc__Group__0__Impl rule__Videodesc__Group__1 ;
    public final void rule__Videodesc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:669:1: ( rule__Videodesc__Group__0__Impl rule__Videodesc__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:670:2: rule__Videodesc__Group__0__Impl rule__Videodesc__Group__1
            {
            pushFollow(FOLLOW_rule__Videodesc__Group__0__Impl_in_rule__Videodesc__Group__01294);
            rule__Videodesc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group__1_in_rule__Videodesc__Group__01297);
            rule__Videodesc__Group__1();

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
    // $ANTLR end "rule__Videodesc__Group__0"


    // $ANTLR start "rule__Videodesc__Group__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:677:1: rule__Videodesc__Group__0__Impl : ( 'video' ) ;
    public final void rule__Videodesc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:681:1: ( ( 'video' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:682:1: ( 'video' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:682:1: ( 'video' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:683:1: 'video'
            {
             before(grammarAccess.getVideodescAccess().getVideoKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Videodesc__Group__0__Impl1325); 
             after(grammarAccess.getVideodescAccess().getVideoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group__0__Impl"


    // $ANTLR start "rule__Videodesc__Group__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:696:1: rule__Videodesc__Group__1 : rule__Videodesc__Group__1__Impl rule__Videodesc__Group__2 ;
    public final void rule__Videodesc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:700:1: ( rule__Videodesc__Group__1__Impl rule__Videodesc__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:701:2: rule__Videodesc__Group__1__Impl rule__Videodesc__Group__2
            {
            pushFollow(FOLLOW_rule__Videodesc__Group__1__Impl_in_rule__Videodesc__Group__11356);
            rule__Videodesc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group__2_in_rule__Videodesc__Group__11359);
            rule__Videodesc__Group__2();

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
    // $ANTLR end "rule__Videodesc__Group__1"


    // $ANTLR start "rule__Videodesc__Group__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:708:1: rule__Videodesc__Group__1__Impl : ( ( rule__Videodesc__VideoidAssignment_1 )? ) ;
    public final void rule__Videodesc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:712:1: ( ( ( rule__Videodesc__VideoidAssignment_1 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:713:1: ( ( rule__Videodesc__VideoidAssignment_1 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:713:1: ( ( rule__Videodesc__VideoidAssignment_1 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:714:1: ( rule__Videodesc__VideoidAssignment_1 )?
            {
             before(grammarAccess.getVideodescAccess().getVideoidAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:715:1: ( rule__Videodesc__VideoidAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:715:2: rule__Videodesc__VideoidAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Videodesc__VideoidAssignment_1_in_rule__Videodesc__Group__1__Impl1386);
                    rule__Videodesc__VideoidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideodescAccess().getVideoidAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group__1__Impl"


    // $ANTLR start "rule__Videodesc__Group__2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:725:1: rule__Videodesc__Group__2 : rule__Videodesc__Group__2__Impl rule__Videodesc__Group__3 ;
    public final void rule__Videodesc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:729:1: ( rule__Videodesc__Group__2__Impl rule__Videodesc__Group__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:730:2: rule__Videodesc__Group__2__Impl rule__Videodesc__Group__3
            {
            pushFollow(FOLLOW_rule__Videodesc__Group__2__Impl_in_rule__Videodesc__Group__21417);
            rule__Videodesc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group__3_in_rule__Videodesc__Group__21420);
            rule__Videodesc__Group__3();

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
    // $ANTLR end "rule__Videodesc__Group__2"


    // $ANTLR start "rule__Videodesc__Group__2__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:737:1: rule__Videodesc__Group__2__Impl : ( ( rule__Videodesc__CheminAssignment_2 ) ) ;
    public final void rule__Videodesc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:741:1: ( ( ( rule__Videodesc__CheminAssignment_2 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:742:1: ( ( rule__Videodesc__CheminAssignment_2 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:742:1: ( ( rule__Videodesc__CheminAssignment_2 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:743:1: ( rule__Videodesc__CheminAssignment_2 )
            {
             before(grammarAccess.getVideodescAccess().getCheminAssignment_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:744:1: ( rule__Videodesc__CheminAssignment_2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:744:2: rule__Videodesc__CheminAssignment_2
            {
            pushFollow(FOLLOW_rule__Videodesc__CheminAssignment_2_in_rule__Videodesc__Group__2__Impl1447);
            rule__Videodesc__CheminAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideodescAccess().getCheminAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group__2__Impl"


    // $ANTLR start "rule__Videodesc__Group__3"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:754:1: rule__Videodesc__Group__3 : rule__Videodesc__Group__3__Impl ;
    public final void rule__Videodesc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:758:1: ( rule__Videodesc__Group__3__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:759:2: rule__Videodesc__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Videodesc__Group__3__Impl_in_rule__Videodesc__Group__31477);
            rule__Videodesc__Group__3__Impl();

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
    // $ANTLR end "rule__Videodesc__Group__3"


    // $ANTLR start "rule__Videodesc__Group__3__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:765:1: rule__Videodesc__Group__3__Impl : ( ( rule__Videodesc__Group_3__0 )? ) ;
    public final void rule__Videodesc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:769:1: ( ( ( rule__Videodesc__Group_3__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:770:1: ( ( rule__Videodesc__Group_3__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:770:1: ( ( rule__Videodesc__Group_3__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:771:1: ( rule__Videodesc__Group_3__0 )?
            {
             before(grammarAccess.getVideodescAccess().getGroup_3()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:772:1: ( rule__Videodesc__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LEFT_BRACKET) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:772:2: rule__Videodesc__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Videodesc__Group_3__0_in_rule__Videodesc__Group__3__Impl1504);
                    rule__Videodesc__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideodescAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group__3__Impl"


    // $ANTLR start "rule__Videodesc__Group_3__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:790:1: rule__Videodesc__Group_3__0 : rule__Videodesc__Group_3__0__Impl rule__Videodesc__Group_3__1 ;
    public final void rule__Videodesc__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:794:1: ( rule__Videodesc__Group_3__0__Impl rule__Videodesc__Group_3__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:795:2: rule__Videodesc__Group_3__0__Impl rule__Videodesc__Group_3__1
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3__0__Impl_in_rule__Videodesc__Group_3__01543);
            rule__Videodesc__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3__1_in_rule__Videodesc__Group_3__01546);
            rule__Videodesc__Group_3__1();

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
    // $ANTLR end "rule__Videodesc__Group_3__0"


    // $ANTLR start "rule__Videodesc__Group_3__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:802:1: rule__Videodesc__Group_3__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Videodesc__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:806:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:807:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:807:1: ( RULE_LEFT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:808:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideodescAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__Videodesc__Group_3__0__Impl1573); 
             after(grammarAccess.getVideodescAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group_3__0__Impl"


    // $ANTLR start "rule__Videodesc__Group_3__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:819:1: rule__Videodesc__Group_3__1 : rule__Videodesc__Group_3__1__Impl rule__Videodesc__Group_3__2 ;
    public final void rule__Videodesc__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:823:1: ( rule__Videodesc__Group_3__1__Impl rule__Videodesc__Group_3__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:824:2: rule__Videodesc__Group_3__1__Impl rule__Videodesc__Group_3__2
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3__1__Impl_in_rule__Videodesc__Group_3__11602);
            rule__Videodesc__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3__2_in_rule__Videodesc__Group_3__11605);
            rule__Videodesc__Group_3__2();

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
    // $ANTLR end "rule__Videodesc__Group_3__1"


    // $ANTLR start "rule__Videodesc__Group_3__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:831:1: rule__Videodesc__Group_3__1__Impl : ( ( rule__Videodesc__Group_3_1__0 )? ) ;
    public final void rule__Videodesc__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:835:1: ( ( ( rule__Videodesc__Group_3_1__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:836:1: ( ( rule__Videodesc__Group_3_1__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:836:1: ( ( rule__Videodesc__Group_3_1__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:837:1: ( rule__Videodesc__Group_3_1__0 )?
            {
             before(grammarAccess.getVideodescAccess().getGroup_3_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:838:1: ( rule__Videodesc__Group_3_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:838:2: rule__Videodesc__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Videodesc__Group_3_1__0_in_rule__Videodesc__Group_3__1__Impl1632);
                    rule__Videodesc__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideodescAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group_3__1__Impl"


    // $ANTLR start "rule__Videodesc__Group_3__2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:848:1: rule__Videodesc__Group_3__2 : rule__Videodesc__Group_3__2__Impl rule__Videodesc__Group_3__3 ;
    public final void rule__Videodesc__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:852:1: ( rule__Videodesc__Group_3__2__Impl rule__Videodesc__Group_3__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:853:2: rule__Videodesc__Group_3__2__Impl rule__Videodesc__Group_3__3
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3__2__Impl_in_rule__Videodesc__Group_3__21663);
            rule__Videodesc__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3__3_in_rule__Videodesc__Group_3__21666);
            rule__Videodesc__Group_3__3();

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
    // $ANTLR end "rule__Videodesc__Group_3__2"


    // $ANTLR start "rule__Videodesc__Group_3__2__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:860:1: rule__Videodesc__Group_3__2__Impl : ( ( rule__Videodesc__Group_3_2__0 )? ) ;
    public final void rule__Videodesc__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:864:1: ( ( ( rule__Videodesc__Group_3_2__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:865:1: ( ( rule__Videodesc__Group_3_2__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:865:1: ( ( rule__Videodesc__Group_3_2__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:866:1: ( rule__Videodesc__Group_3_2__0 )?
            {
             before(grammarAccess.getVideodescAccess().getGroup_3_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:867:1: ( rule__Videodesc__Group_3_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:867:2: rule__Videodesc__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Videodesc__Group_3_2__0_in_rule__Videodesc__Group_3__2__Impl1693);
                    rule__Videodesc__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideodescAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group_3__2__Impl"


    // $ANTLR start "rule__Videodesc__Group_3__3"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:877:1: rule__Videodesc__Group_3__3 : rule__Videodesc__Group_3__3__Impl rule__Videodesc__Group_3__4 ;
    public final void rule__Videodesc__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:881:1: ( rule__Videodesc__Group_3__3__Impl rule__Videodesc__Group_3__4 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:882:2: rule__Videodesc__Group_3__3__Impl rule__Videodesc__Group_3__4
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3__3__Impl_in_rule__Videodesc__Group_3__31724);
            rule__Videodesc__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3__4_in_rule__Videodesc__Group_3__31727);
            rule__Videodesc__Group_3__4();

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
    // $ANTLR end "rule__Videodesc__Group_3__3"


    // $ANTLR start "rule__Videodesc__Group_3__3__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:889:1: rule__Videodesc__Group_3__3__Impl : ( ( rule__Videodesc__Group_3_3__0 )? ) ;
    public final void rule__Videodesc__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:893:1: ( ( ( rule__Videodesc__Group_3_3__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:894:1: ( ( rule__Videodesc__Group_3_3__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:894:1: ( ( rule__Videodesc__Group_3_3__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:895:1: ( rule__Videodesc__Group_3_3__0 )?
            {
             before(grammarAccess.getVideodescAccess().getGroup_3_3()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:896:1: ( rule__Videodesc__Group_3_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:896:2: rule__Videodesc__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__Videodesc__Group_3_3__0_in_rule__Videodesc__Group_3__3__Impl1754);
                    rule__Videodesc__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideodescAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group_3__3__Impl"


    // $ANTLR start "rule__Videodesc__Group_3__4"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:906:1: rule__Videodesc__Group_3__4 : rule__Videodesc__Group_3__4__Impl ;
    public final void rule__Videodesc__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:910:1: ( rule__Videodesc__Group_3__4__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:911:2: rule__Videodesc__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3__4__Impl_in_rule__Videodesc__Group_3__41785);
            rule__Videodesc__Group_3__4__Impl();

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
    // $ANTLR end "rule__Videodesc__Group_3__4"


    // $ANTLR start "rule__Videodesc__Group_3__4__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:917:1: rule__Videodesc__Group_3__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Videodesc__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:921:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:922:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:922:1: ( RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:923:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideodescAccess().getRIGHT_BRACKETTerminalRuleCall_3_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__Videodesc__Group_3__4__Impl1812); 
             after(grammarAccess.getVideodescAccess().getRIGHT_BRACKETTerminalRuleCall_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group_3__4__Impl"


    // $ANTLR start "rule__Videodesc__Group_3_1__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:944:1: rule__Videodesc__Group_3_1__0 : rule__Videodesc__Group_3_1__0__Impl rule__Videodesc__Group_3_1__1 ;
    public final void rule__Videodesc__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:948:1: ( rule__Videodesc__Group_3_1__0__Impl rule__Videodesc__Group_3_1__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:949:2: rule__Videodesc__Group_3_1__0__Impl rule__Videodesc__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_1__0__Impl_in_rule__Videodesc__Group_3_1__01851);
            rule__Videodesc__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3_1__1_in_rule__Videodesc__Group_3_1__01854);
            rule__Videodesc__Group_3_1__1();

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
    // $ANTLR end "rule__Videodesc__Group_3_1__0"


    // $ANTLR start "rule__Videodesc__Group_3_1__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:956:1: rule__Videodesc__Group_3_1__0__Impl : ( 'duree' ) ;
    public final void rule__Videodesc__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:960:1: ( ( 'duree' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:961:1: ( 'duree' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:961:1: ( 'duree' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:962:1: 'duree'
            {
             before(grammarAccess.getVideodescAccess().getDureeKeyword_3_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Videodesc__Group_3_1__0__Impl1882); 
             after(grammarAccess.getVideodescAccess().getDureeKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group_3_1__0__Impl"


    // $ANTLR start "rule__Videodesc__Group_3_1__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:975:1: rule__Videodesc__Group_3_1__1 : rule__Videodesc__Group_3_1__1__Impl ;
    public final void rule__Videodesc__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:979:1: ( rule__Videodesc__Group_3_1__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:980:2: rule__Videodesc__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_1__1__Impl_in_rule__Videodesc__Group_3_1__11913);
            rule__Videodesc__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Videodesc__Group_3_1__1"


    // $ANTLR start "rule__Videodesc__Group_3_1__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:986:1: rule__Videodesc__Group_3_1__1__Impl : ( ( rule__Videodesc__DureeAssignment_3_1_1 ) ) ;
    public final void rule__Videodesc__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:990:1: ( ( ( rule__Videodesc__DureeAssignment_3_1_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:991:1: ( ( rule__Videodesc__DureeAssignment_3_1_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:991:1: ( ( rule__Videodesc__DureeAssignment_3_1_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:992:1: ( rule__Videodesc__DureeAssignment_3_1_1 )
            {
             before(grammarAccess.getVideodescAccess().getDureeAssignment_3_1_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:993:1: ( rule__Videodesc__DureeAssignment_3_1_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:993:2: rule__Videodesc__DureeAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Videodesc__DureeAssignment_3_1_1_in_rule__Videodesc__Group_3_1__1__Impl1940);
            rule__Videodesc__DureeAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVideodescAccess().getDureeAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group_3_1__1__Impl"


    // $ANTLR start "rule__Videodesc__Group_3_2__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1007:1: rule__Videodesc__Group_3_2__0 : rule__Videodesc__Group_3_2__0__Impl rule__Videodesc__Group_3_2__1 ;
    public final void rule__Videodesc__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1011:1: ( rule__Videodesc__Group_3_2__0__Impl rule__Videodesc__Group_3_2__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1012:2: rule__Videodesc__Group_3_2__0__Impl rule__Videodesc__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_2__0__Impl_in_rule__Videodesc__Group_3_2__01974);
            rule__Videodesc__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3_2__1_in_rule__Videodesc__Group_3_2__01977);
            rule__Videodesc__Group_3_2__1();

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
    // $ANTLR end "rule__Videodesc__Group_3_2__0"


    // $ANTLR start "rule__Videodesc__Group_3_2__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1019:1: rule__Videodesc__Group_3_2__0__Impl : ( 'description' ) ;
    public final void rule__Videodesc__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1023:1: ( ( 'description' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1024:1: ( 'description' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1024:1: ( 'description' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1025:1: 'description'
            {
             before(grammarAccess.getVideodescAccess().getDescriptionKeyword_3_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Videodesc__Group_3_2__0__Impl2005); 
             after(grammarAccess.getVideodescAccess().getDescriptionKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group_3_2__0__Impl"


    // $ANTLR start "rule__Videodesc__Group_3_2__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1038:1: rule__Videodesc__Group_3_2__1 : rule__Videodesc__Group_3_2__1__Impl ;
    public final void rule__Videodesc__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1042:1: ( rule__Videodesc__Group_3_2__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1043:2: rule__Videodesc__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_2__1__Impl_in_rule__Videodesc__Group_3_2__12036);
            rule__Videodesc__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Videodesc__Group_3_2__1"


    // $ANTLR start "rule__Videodesc__Group_3_2__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1049:1: rule__Videodesc__Group_3_2__1__Impl : ( ( rule__Videodesc__DescriptionAssignment_3_2_1 ) ) ;
    public final void rule__Videodesc__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1053:1: ( ( ( rule__Videodesc__DescriptionAssignment_3_2_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1054:1: ( ( rule__Videodesc__DescriptionAssignment_3_2_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1054:1: ( ( rule__Videodesc__DescriptionAssignment_3_2_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1055:1: ( rule__Videodesc__DescriptionAssignment_3_2_1 )
            {
             before(grammarAccess.getVideodescAccess().getDescriptionAssignment_3_2_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1056:1: ( rule__Videodesc__DescriptionAssignment_3_2_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1056:2: rule__Videodesc__DescriptionAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Videodesc__DescriptionAssignment_3_2_1_in_rule__Videodesc__Group_3_2__1__Impl2063);
            rule__Videodesc__DescriptionAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVideodescAccess().getDescriptionAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group_3_2__1__Impl"


    // $ANTLR start "rule__Videodesc__Group_3_3__0"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1070:1: rule__Videodesc__Group_3_3__0 : rule__Videodesc__Group_3_3__0__Impl rule__Videodesc__Group_3_3__1 ;
    public final void rule__Videodesc__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1074:1: ( rule__Videodesc__Group_3_3__0__Impl rule__Videodesc__Group_3_3__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1075:2: rule__Videodesc__Group_3_3__0__Impl rule__Videodesc__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_3__0__Impl_in_rule__Videodesc__Group_3_3__02097);
            rule__Videodesc__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3_3__1_in_rule__Videodesc__Group_3_3__02100);
            rule__Videodesc__Group_3_3__1();

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
    // $ANTLR end "rule__Videodesc__Group_3_3__0"


    // $ANTLR start "rule__Videodesc__Group_3_3__0__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1082:1: rule__Videodesc__Group_3_3__0__Impl : ( 'probabilite' ) ;
    public final void rule__Videodesc__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1086:1: ( ( 'probabilite' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1087:1: ( 'probabilite' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1087:1: ( 'probabilite' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1088:1: 'probabilite'
            {
             before(grammarAccess.getVideodescAccess().getProbabiliteKeyword_3_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Videodesc__Group_3_3__0__Impl2128); 
             after(grammarAccess.getVideodescAccess().getProbabiliteKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group_3_3__0__Impl"


    // $ANTLR start "rule__Videodesc__Group_3_3__1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1101:1: rule__Videodesc__Group_3_3__1 : rule__Videodesc__Group_3_3__1__Impl ;
    public final void rule__Videodesc__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1105:1: ( rule__Videodesc__Group_3_3__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1106:2: rule__Videodesc__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_3__1__Impl_in_rule__Videodesc__Group_3_3__12159);
            rule__Videodesc__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Videodesc__Group_3_3__1"


    // $ANTLR start "rule__Videodesc__Group_3_3__1__Impl"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1112:1: rule__Videodesc__Group_3_3__1__Impl : ( ( rule__Videodesc__ProbabiliteAssignment_3_3_1 ) ) ;
    public final void rule__Videodesc__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1116:1: ( ( ( rule__Videodesc__ProbabiliteAssignment_3_3_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1117:1: ( ( rule__Videodesc__ProbabiliteAssignment_3_3_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1117:1: ( ( rule__Videodesc__ProbabiliteAssignment_3_3_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1118:1: ( rule__Videodesc__ProbabiliteAssignment_3_3_1 )
            {
             before(grammarAccess.getVideodescAccess().getProbabiliteAssignment_3_3_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1119:1: ( rule__Videodesc__ProbabiliteAssignment_3_3_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1119:2: rule__Videodesc__ProbabiliteAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__Videodesc__ProbabiliteAssignment_3_3_1_in_rule__Videodesc__Group_3_3__1__Impl2186);
            rule__Videodesc__ProbabiliteAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVideodescAccess().getProbabiliteAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__Group_3_3__1__Impl"


    // $ANTLR start "rule__VideoGenModel__Variante_videosAssignment_2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1134:1: rule__VideoGenModel__Variante_videosAssignment_2 : ( ruleVarianteVideo ) ;
    public final void rule__VideoGenModel__Variante_videosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1138:1: ( ( ruleVarianteVideo ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1139:1: ( ruleVarianteVideo )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1139:1: ( ruleVarianteVideo )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1140:1: ruleVarianteVideo
            {
             before(grammarAccess.getVideoGenModelAccess().getVariante_videosVarianteVideoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVarianteVideo_in_rule__VideoGenModel__Variante_videosAssignment_22225);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1149:1: rule__MandatoryVideoSeq__VideoAssignment_1 : ( ruleVideodesc ) ;
    public final void rule__MandatoryVideoSeq__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1153:1: ( ( ruleVideodesc ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1154:1: ( ruleVideodesc )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1154:1: ( ruleVideodesc )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1155:1: ruleVideodesc
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getVideoVideodescParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideodesc_in_rule__MandatoryVideoSeq__VideoAssignment_12256);
            ruleVideodesc();

            state._fsp--;

             after(grammarAccess.getMandatoryVideoSeqAccess().getVideoVideodescParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1164:1: rule__OptionalVideoSeq__VideoAssignment_1 : ( ruleVideodesc ) ;
    public final void rule__OptionalVideoSeq__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1168:1: ( ( ruleVideodesc ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1169:1: ( ruleVideodesc )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1169:1: ( ruleVideodesc )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1170:1: ruleVideodesc
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getVideoVideodescParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideodesc_in_rule__OptionalVideoSeq__VideoAssignment_12287);
            ruleVideodesc();

            state._fsp--;

             after(grammarAccess.getOptionalVideoSeqAccess().getVideoVideodescParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AlternativeVideoSeq__VideoidAssignment_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1179:1: rule__AlternativeVideoSeq__VideoidAssignment_1 : ( RULE_ID ) ;
    public final void rule__AlternativeVideoSeq__VideoidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1183:1: ( ( RULE_ID ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1184:1: ( RULE_ID )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1184:1: ( RULE_ID )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1185:1: RULE_ID
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeVideoSeq__VideoidAssignment_12318); 
             after(grammarAccess.getAlternativeVideoSeqAccess().getVideoidIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__VideoidAssignment_1"


    // $ANTLR start "rule__AlternativeVideoSeq__VideoAssignment_3"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1194:1: rule__AlternativeVideoSeq__VideoAssignment_3 : ( ruleVideodesc ) ;
    public final void rule__AlternativeVideoSeq__VideoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1198:1: ( ( ruleVideodesc ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1199:1: ( ruleVideodesc )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1199:1: ( ruleVideodesc )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1200:1: ruleVideodesc
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoVideodescParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVideodesc_in_rule__AlternativeVideoSeq__VideoAssignment_32349);
            ruleVideodesc();

            state._fsp--;

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideoVideodescParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__VideoAssignment_3"


    // $ANTLR start "rule__Videodesc__VideoidAssignment_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1209:1: rule__Videodesc__VideoidAssignment_1 : ( RULE_ID ) ;
    public final void rule__Videodesc__VideoidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1213:1: ( ( RULE_ID ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1214:1: ( RULE_ID )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1214:1: ( RULE_ID )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1215:1: RULE_ID
            {
             before(grammarAccess.getVideodescAccess().getVideoidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Videodesc__VideoidAssignment_12380); 
             after(grammarAccess.getVideodescAccess().getVideoidIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__VideoidAssignment_1"


    // $ANTLR start "rule__Videodesc__CheminAssignment_2"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1224:1: rule__Videodesc__CheminAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Videodesc__CheminAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1228:1: ( ( RULE_STRING ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1229:1: ( RULE_STRING )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1229:1: ( RULE_STRING )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1230:1: RULE_STRING
            {
             before(grammarAccess.getVideodescAccess().getCheminSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Videodesc__CheminAssignment_22411); 
             after(grammarAccess.getVideodescAccess().getCheminSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__CheminAssignment_2"


    // $ANTLR start "rule__Videodesc__DureeAssignment_3_1_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1239:1: rule__Videodesc__DureeAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__Videodesc__DureeAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1243:1: ( ( RULE_INT ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1244:1: ( RULE_INT )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1244:1: ( RULE_INT )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1245:1: RULE_INT
            {
             before(grammarAccess.getVideodescAccess().getDureeINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Videodesc__DureeAssignment_3_1_12442); 
             after(grammarAccess.getVideodescAccess().getDureeINTTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__DureeAssignment_3_1_1"


    // $ANTLR start "rule__Videodesc__DescriptionAssignment_3_2_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1254:1: rule__Videodesc__DescriptionAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__Videodesc__DescriptionAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1258:1: ( ( RULE_STRING ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1259:1: ( RULE_STRING )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1259:1: ( RULE_STRING )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1260:1: RULE_STRING
            {
             before(grammarAccess.getVideodescAccess().getDescriptionSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Videodesc__DescriptionAssignment_3_2_12473); 
             after(grammarAccess.getVideodescAccess().getDescriptionSTRINGTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__DescriptionAssignment_3_2_1"


    // $ANTLR start "rule__Videodesc__ProbabiliteAssignment_3_3_1"
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1269:1: rule__Videodesc__ProbabiliteAssignment_3_3_1 : ( RULE_INT ) ;
    public final void rule__Videodesc__ProbabiliteAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1273:1: ( ( RULE_INT ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1274:1: ( RULE_INT )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1274:1: ( RULE_INT )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1275:1: RULE_INT
            {
             before(grammarAccess.getVideodescAccess().getProbabiliteINTTerminalRuleCall_3_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Videodesc__ProbabiliteAssignment_3_3_12504); 
             after(grammarAccess.getVideodescAccess().getProbabiliteINTTerminalRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videodesc__ProbabiliteAssignment_3_3_1"

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
    public static final BitSet FOLLOW_ruleVideodesc_in_entryRuleVideodesc361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideodesc368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__0_in_ruleVideodesc394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryVideoSeq_in_rule__VarianteVideo__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalVideoSeq_in_rule__VarianteVideo__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeVideoSeq_in_rule__VarianteVideo__Alternatives464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__0__Impl_in_rule__VideoGenModel__Group__0494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__1_in_rule__VideoGenModel__Group__0497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VideoGenModel__Group__0__Impl525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__1__Impl_in_rule__VideoGenModel__Group__1556 = new BitSet(new long[]{0x000000000001C020L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__2_in_rule__VideoGenModel__Group__1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoGenModel__Group__1__Impl586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__2__Impl_in_rule__VideoGenModel__Group__2615 = new BitSet(new long[]{0x000000000001C020L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__3_in_rule__VideoGenModel__Group__2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Variante_videosAssignment_2_in_rule__VideoGenModel__Group__2__Impl645 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__3__Impl_in_rule__VideoGenModel__Group__3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGenModel__Group__3__Impl703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__0__Impl_in_rule__MandatoryVideoSeq__Group__0740 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__1_in_rule__MandatoryVideoSeq__Group__0743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MandatoryVideoSeq__Group__0__Impl771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__1__Impl_in_rule__MandatoryVideoSeq__Group__1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__VideoAssignment_1_in_rule__MandatoryVideoSeq__Group__1__Impl829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__0__Impl_in_rule__OptionalVideoSeq__Group__0863 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__1_in_rule__OptionalVideoSeq__Group__0866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__OptionalVideoSeq__Group__0__Impl894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__1__Impl_in_rule__OptionalVideoSeq__Group__1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__VideoAssignment_1_in_rule__OptionalVideoSeq__Group__1__Impl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__0__Impl_in_rule__AlternativeVideoSeq__Group__0986 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__1_in_rule__AlternativeVideoSeq__Group__0989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AlternativeVideoSeq__Group__0__Impl1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__1__Impl_in_rule__AlternativeVideoSeq__Group__11048 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__2_in_rule__AlternativeVideoSeq__Group__11051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__VideoidAssignment_1_in_rule__AlternativeVideoSeq__Group__1__Impl1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__2__Impl_in_rule__AlternativeVideoSeq__Group__21109 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__3_in_rule__AlternativeVideoSeq__Group__21112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__AlternativeVideoSeq__Group__2__Impl1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__3__Impl_in_rule__AlternativeVideoSeq__Group__31168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__4_in_rule__AlternativeVideoSeq__Group__31171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__VideoAssignment_3_in_rule__AlternativeVideoSeq__Group__3__Impl1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__4__Impl_in_rule__AlternativeVideoSeq__Group__41228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__AlternativeVideoSeq__Group__4__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__0__Impl_in_rule__Videodesc__Group__01294 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__1_in_rule__Videodesc__Group__01297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Videodesc__Group__0__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__1__Impl_in_rule__Videodesc__Group__11356 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__2_in_rule__Videodesc__Group__11359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__VideoidAssignment_1_in_rule__Videodesc__Group__1__Impl1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__2__Impl_in_rule__Videodesc__Group__21417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__3_in_rule__Videodesc__Group__21420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__CheminAssignment_2_in_rule__Videodesc__Group__2__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__3__Impl_in_rule__Videodesc__Group__31477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__0_in_rule__Videodesc__Group__3__Impl1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__0__Impl_in_rule__Videodesc__Group_3__01543 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__1_in_rule__Videodesc__Group_3__01546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__Videodesc__Group_3__0__Impl1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__1__Impl_in_rule__Videodesc__Group_3__11602 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__2_in_rule__Videodesc__Group_3__11605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_1__0_in_rule__Videodesc__Group_3__1__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__2__Impl_in_rule__Videodesc__Group_3__21663 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__3_in_rule__Videodesc__Group_3__21666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_2__0_in_rule__Videodesc__Group_3__2__Impl1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__3__Impl_in_rule__Videodesc__Group_3__31724 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__4_in_rule__Videodesc__Group_3__31727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_3__0_in_rule__Videodesc__Group_3__3__Impl1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__4__Impl_in_rule__Videodesc__Group_3__41785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__Videodesc__Group_3__4__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_1__0__Impl_in_rule__Videodesc__Group_3_1__01851 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_1__1_in_rule__Videodesc__Group_3_1__01854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Videodesc__Group_3_1__0__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_1__1__Impl_in_rule__Videodesc__Group_3_1__11913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__DureeAssignment_3_1_1_in_rule__Videodesc__Group_3_1__1__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_2__0__Impl_in_rule__Videodesc__Group_3_2__01974 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_2__1_in_rule__Videodesc__Group_3_2__01977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Videodesc__Group_3_2__0__Impl2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_2__1__Impl_in_rule__Videodesc__Group_3_2__12036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__DescriptionAssignment_3_2_1_in_rule__Videodesc__Group_3_2__1__Impl2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_3__0__Impl_in_rule__Videodesc__Group_3_3__02097 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_3__1_in_rule__Videodesc__Group_3_3__02100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Videodesc__Group_3_3__0__Impl2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_3__1__Impl_in_rule__Videodesc__Group_3_3__12159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__ProbabiliteAssignment_3_3_1_in_rule__Videodesc__Group_3_3__1__Impl2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarianteVideo_in_rule__VideoGenModel__Variante_videosAssignment_22225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideodesc_in_rule__MandatoryVideoSeq__VideoAssignment_12256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideodesc_in_rule__OptionalVideoSeq__VideoAssignment_12287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeVideoSeq__VideoidAssignment_12318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideodesc_in_rule__AlternativeVideoSeq__VideoAssignment_32349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Videodesc__VideoidAssignment_12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Videodesc__CheminAssignment_22411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Videodesc__DureeAssignment_3_1_12442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Videodesc__DescriptionAssignment_3_2_12473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Videodesc__ProbabiliteAssignment_3_3_12504 = new BitSet(new long[]{0x0000000000000002L});

}