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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:330:1: rule__VideoGenModel__Group__2__Impl : ( ( ( rule__VideoGenModel__Variante_videosAssignment_2 ) ) ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* ) ) ;
    public final void rule__VideoGenModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:334:1: ( ( ( ( rule__VideoGenModel__Variante_videosAssignment_2 ) ) ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:335:1: ( ( ( rule__VideoGenModel__Variante_videosAssignment_2 ) ) ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:335:1: ( ( ( rule__VideoGenModel__Variante_videosAssignment_2 ) ) ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:336:1: ( ( rule__VideoGenModel__Variante_videosAssignment_2 ) ) ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:336:1: ( ( rule__VideoGenModel__Variante_videosAssignment_2 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:337:1: ( rule__VideoGenModel__Variante_videosAssignment_2 )
            {
             before(grammarAccess.getVideoGenModelAccess().getVariante_videosAssignment_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:338:1: ( rule__VideoGenModel__Variante_videosAssignment_2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:338:2: rule__VideoGenModel__Variante_videosAssignment_2
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Variante_videosAssignment_2_in_rule__VideoGenModel__Group__2__Impl647);
            rule__VideoGenModel__Variante_videosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenModelAccess().getVariante_videosAssignment_2()); 

            }

            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:341:1: ( ( rule__VideoGenModel__Variante_videosAssignment_2 )* )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:342:1: ( rule__VideoGenModel__Variante_videosAssignment_2 )*
            {
             before(grammarAccess.getVideoGenModelAccess().getVariante_videosAssignment_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:343:1: ( rule__VideoGenModel__Variante_videosAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:343:2: rule__VideoGenModel__Variante_videosAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VideoGenModel__Variante_videosAssignment_2_in_rule__VideoGenModel__Group__2__Impl659);
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

        }
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:354:1: rule__VideoGenModel__Group__3 : rule__VideoGenModel__Group__3__Impl ;
    public final void rule__VideoGenModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:358:1: ( rule__VideoGenModel__Group__3__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:359:2: rule__VideoGenModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VideoGenModel__Group__3__Impl_in_rule__VideoGenModel__Group__3692);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:365:1: rule__VideoGenModel__Group__3__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoGenModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:369:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:370:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:370:1: ( RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:371:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoGenModelAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGenModel__Group__3__Impl719); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:390:1: rule__MandatoryVideoSeq__Group__0 : rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 ;
    public final void rule__MandatoryVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:394:1: ( rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:395:2: rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__0__Impl_in_rule__MandatoryVideoSeq__Group__0756);
            rule__MandatoryVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__1_in_rule__MandatoryVideoSeq__Group__0759);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:402:1: rule__MandatoryVideoSeq__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__MandatoryVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:406:1: ( ( 'mandatory' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:407:1: ( 'mandatory' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:407:1: ( 'mandatory' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:408:1: 'mandatory'
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__MandatoryVideoSeq__Group__0__Impl787); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:421:1: rule__MandatoryVideoSeq__Group__1 : rule__MandatoryVideoSeq__Group__1__Impl ;
    public final void rule__MandatoryVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:425:1: ( rule__MandatoryVideoSeq__Group__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:426:2: rule__MandatoryVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__1__Impl_in_rule__MandatoryVideoSeq__Group__1818);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:432:1: rule__MandatoryVideoSeq__Group__1__Impl : ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) ) ;
    public final void rule__MandatoryVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:436:1: ( ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:437:1: ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:437:1: ( ( rule__MandatoryVideoSeq__VideoAssignment_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:438:1: ( rule__MandatoryVideoSeq__VideoAssignment_1 )
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getVideoAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:439:1: ( rule__MandatoryVideoSeq__VideoAssignment_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:439:2: rule__MandatoryVideoSeq__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__VideoAssignment_1_in_rule__MandatoryVideoSeq__Group__1__Impl845);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:453:1: rule__OptionalVideoSeq__Group__0 : rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 ;
    public final void rule__OptionalVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:457:1: ( rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:458:2: rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__0__Impl_in_rule__OptionalVideoSeq__Group__0879);
            rule__OptionalVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__1_in_rule__OptionalVideoSeq__Group__0882);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:465:1: rule__OptionalVideoSeq__Group__0__Impl : ( 'optional' ) ;
    public final void rule__OptionalVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:469:1: ( ( 'optional' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:470:1: ( 'optional' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:470:1: ( 'optional' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:471:1: 'optional'
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__OptionalVideoSeq__Group__0__Impl910); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:484:1: rule__OptionalVideoSeq__Group__1 : rule__OptionalVideoSeq__Group__1__Impl ;
    public final void rule__OptionalVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:488:1: ( rule__OptionalVideoSeq__Group__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:489:2: rule__OptionalVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__1__Impl_in_rule__OptionalVideoSeq__Group__1941);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:495:1: rule__OptionalVideoSeq__Group__1__Impl : ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) ) ;
    public final void rule__OptionalVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:499:1: ( ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:500:1: ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:500:1: ( ( rule__OptionalVideoSeq__VideoAssignment_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:501:1: ( rule__OptionalVideoSeq__VideoAssignment_1 )
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getVideoAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:502:1: ( rule__OptionalVideoSeq__VideoAssignment_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:502:2: rule__OptionalVideoSeq__VideoAssignment_1
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__VideoAssignment_1_in_rule__OptionalVideoSeq__Group__1__Impl968);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:516:1: rule__AlternativeVideoSeq__Group__0 : rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1 ;
    public final void rule__AlternativeVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:520:1: ( rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:521:2: rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__0__Impl_in_rule__AlternativeVideoSeq__Group__01002);
            rule__AlternativeVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__1_in_rule__AlternativeVideoSeq__Group__01005);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:528:1: rule__AlternativeVideoSeq__Group__0__Impl : ( 'alternative' ) ;
    public final void rule__AlternativeVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:532:1: ( ( 'alternative' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:533:1: ( 'alternative' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:533:1: ( 'alternative' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:534:1: 'alternative'
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getAlternativeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__AlternativeVideoSeq__Group__0__Impl1033); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:547:1: rule__AlternativeVideoSeq__Group__1 : rule__AlternativeVideoSeq__Group__1__Impl rule__AlternativeVideoSeq__Group__2 ;
    public final void rule__AlternativeVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:551:1: ( rule__AlternativeVideoSeq__Group__1__Impl rule__AlternativeVideoSeq__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:552:2: rule__AlternativeVideoSeq__Group__1__Impl rule__AlternativeVideoSeq__Group__2
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__1__Impl_in_rule__AlternativeVideoSeq__Group__11064);
            rule__AlternativeVideoSeq__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__2_in_rule__AlternativeVideoSeq__Group__11067);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:559:1: rule__AlternativeVideoSeq__Group__1__Impl : ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? ) ;
    public final void rule__AlternativeVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:563:1: ( ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:564:1: ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:564:1: ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:565:1: ( rule__AlternativeVideoSeq__VideoidAssignment_1 )?
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoidAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:566:1: ( rule__AlternativeVideoSeq__VideoidAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:566:2: rule__AlternativeVideoSeq__VideoidAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AlternativeVideoSeq__VideoidAssignment_1_in_rule__AlternativeVideoSeq__Group__1__Impl1094);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:576:1: rule__AlternativeVideoSeq__Group__2 : rule__AlternativeVideoSeq__Group__2__Impl rule__AlternativeVideoSeq__Group__3 ;
    public final void rule__AlternativeVideoSeq__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:580:1: ( rule__AlternativeVideoSeq__Group__2__Impl rule__AlternativeVideoSeq__Group__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:581:2: rule__AlternativeVideoSeq__Group__2__Impl rule__AlternativeVideoSeq__Group__3
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__2__Impl_in_rule__AlternativeVideoSeq__Group__21125);
            rule__AlternativeVideoSeq__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__3_in_rule__AlternativeVideoSeq__Group__21128);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:588:1: rule__AlternativeVideoSeq__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__AlternativeVideoSeq__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:592:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:593:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:593:1: ( RULE_LEFT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:594:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__AlternativeVideoSeq__Group__2__Impl1155); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:605:1: rule__AlternativeVideoSeq__Group__3 : rule__AlternativeVideoSeq__Group__3__Impl rule__AlternativeVideoSeq__Group__4 ;
    public final void rule__AlternativeVideoSeq__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:609:1: ( rule__AlternativeVideoSeq__Group__3__Impl rule__AlternativeVideoSeq__Group__4 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:610:2: rule__AlternativeVideoSeq__Group__3__Impl rule__AlternativeVideoSeq__Group__4
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__3__Impl_in_rule__AlternativeVideoSeq__Group__31184);
            rule__AlternativeVideoSeq__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__4_in_rule__AlternativeVideoSeq__Group__31187);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:617:1: rule__AlternativeVideoSeq__Group__3__Impl : ( ( ( rule__AlternativeVideoSeq__VideoAssignment_3 ) ) ( ( rule__AlternativeVideoSeq__VideoAssignment_3 )* ) ) ;
    public final void rule__AlternativeVideoSeq__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:621:1: ( ( ( ( rule__AlternativeVideoSeq__VideoAssignment_3 ) ) ( ( rule__AlternativeVideoSeq__VideoAssignment_3 )* ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:622:1: ( ( ( rule__AlternativeVideoSeq__VideoAssignment_3 ) ) ( ( rule__AlternativeVideoSeq__VideoAssignment_3 )* ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:622:1: ( ( ( rule__AlternativeVideoSeq__VideoAssignment_3 ) ) ( ( rule__AlternativeVideoSeq__VideoAssignment_3 )* ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:623:1: ( ( rule__AlternativeVideoSeq__VideoAssignment_3 ) ) ( ( rule__AlternativeVideoSeq__VideoAssignment_3 )* )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:623:1: ( ( rule__AlternativeVideoSeq__VideoAssignment_3 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:624:1: ( rule__AlternativeVideoSeq__VideoAssignment_3 )
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoAssignment_3()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:625:1: ( rule__AlternativeVideoSeq__VideoAssignment_3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:625:2: rule__AlternativeVideoSeq__VideoAssignment_3
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__VideoAssignment_3_in_rule__AlternativeVideoSeq__Group__3__Impl1216);
            rule__AlternativeVideoSeq__VideoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideoAssignment_3()); 

            }

            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:628:1: ( ( rule__AlternativeVideoSeq__VideoAssignment_3 )* )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:629:1: ( rule__AlternativeVideoSeq__VideoAssignment_3 )*
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoAssignment_3()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:630:1: ( rule__AlternativeVideoSeq__VideoAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:630:2: rule__AlternativeVideoSeq__VideoAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__AlternativeVideoSeq__VideoAssignment_3_in_rule__AlternativeVideoSeq__Group__3__Impl1228);
            	    rule__AlternativeVideoSeq__VideoAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideoAssignment_3()); 

            }


            }


            }

        }
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:641:1: rule__AlternativeVideoSeq__Group__4 : rule__AlternativeVideoSeq__Group__4__Impl ;
    public final void rule__AlternativeVideoSeq__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:645:1: ( rule__AlternativeVideoSeq__Group__4__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:646:2: rule__AlternativeVideoSeq__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AlternativeVideoSeq__Group__4__Impl_in_rule__AlternativeVideoSeq__Group__41261);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:652:1: rule__AlternativeVideoSeq__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__AlternativeVideoSeq__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:656:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:657:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:657:1: ( RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:658:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__AlternativeVideoSeq__Group__4__Impl1288); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:679:1: rule__Videodesc__Group__0 : rule__Videodesc__Group__0__Impl rule__Videodesc__Group__1 ;
    public final void rule__Videodesc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:683:1: ( rule__Videodesc__Group__0__Impl rule__Videodesc__Group__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:684:2: rule__Videodesc__Group__0__Impl rule__Videodesc__Group__1
            {
            pushFollow(FOLLOW_rule__Videodesc__Group__0__Impl_in_rule__Videodesc__Group__01327);
            rule__Videodesc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group__1_in_rule__Videodesc__Group__01330);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:691:1: rule__Videodesc__Group__0__Impl : ( 'video' ) ;
    public final void rule__Videodesc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:695:1: ( ( 'video' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:696:1: ( 'video' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:696:1: ( 'video' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:697:1: 'video'
            {
             before(grammarAccess.getVideodescAccess().getVideoKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Videodesc__Group__0__Impl1358); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:710:1: rule__Videodesc__Group__1 : rule__Videodesc__Group__1__Impl rule__Videodesc__Group__2 ;
    public final void rule__Videodesc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:714:1: ( rule__Videodesc__Group__1__Impl rule__Videodesc__Group__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:715:2: rule__Videodesc__Group__1__Impl rule__Videodesc__Group__2
            {
            pushFollow(FOLLOW_rule__Videodesc__Group__1__Impl_in_rule__Videodesc__Group__11389);
            rule__Videodesc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group__2_in_rule__Videodesc__Group__11392);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:722:1: rule__Videodesc__Group__1__Impl : ( ( rule__Videodesc__VideoidAssignment_1 )? ) ;
    public final void rule__Videodesc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:726:1: ( ( ( rule__Videodesc__VideoidAssignment_1 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:727:1: ( ( rule__Videodesc__VideoidAssignment_1 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:727:1: ( ( rule__Videodesc__VideoidAssignment_1 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:728:1: ( rule__Videodesc__VideoidAssignment_1 )?
            {
             before(grammarAccess.getVideodescAccess().getVideoidAssignment_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:729:1: ( rule__Videodesc__VideoidAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:729:2: rule__Videodesc__VideoidAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Videodesc__VideoidAssignment_1_in_rule__Videodesc__Group__1__Impl1419);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:739:1: rule__Videodesc__Group__2 : rule__Videodesc__Group__2__Impl rule__Videodesc__Group__3 ;
    public final void rule__Videodesc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:743:1: ( rule__Videodesc__Group__2__Impl rule__Videodesc__Group__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:744:2: rule__Videodesc__Group__2__Impl rule__Videodesc__Group__3
            {
            pushFollow(FOLLOW_rule__Videodesc__Group__2__Impl_in_rule__Videodesc__Group__21450);
            rule__Videodesc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group__3_in_rule__Videodesc__Group__21453);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:751:1: rule__Videodesc__Group__2__Impl : ( ( rule__Videodesc__CheminAssignment_2 ) ) ;
    public final void rule__Videodesc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:755:1: ( ( ( rule__Videodesc__CheminAssignment_2 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:756:1: ( ( rule__Videodesc__CheminAssignment_2 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:756:1: ( ( rule__Videodesc__CheminAssignment_2 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:757:1: ( rule__Videodesc__CheminAssignment_2 )
            {
             before(grammarAccess.getVideodescAccess().getCheminAssignment_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:758:1: ( rule__Videodesc__CheminAssignment_2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:758:2: rule__Videodesc__CheminAssignment_2
            {
            pushFollow(FOLLOW_rule__Videodesc__CheminAssignment_2_in_rule__Videodesc__Group__2__Impl1480);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:768:1: rule__Videodesc__Group__3 : rule__Videodesc__Group__3__Impl ;
    public final void rule__Videodesc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:772:1: ( rule__Videodesc__Group__3__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:773:2: rule__Videodesc__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Videodesc__Group__3__Impl_in_rule__Videodesc__Group__31510);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:779:1: rule__Videodesc__Group__3__Impl : ( ( rule__Videodesc__Group_3__0 )? ) ;
    public final void rule__Videodesc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:783:1: ( ( ( rule__Videodesc__Group_3__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:784:1: ( ( rule__Videodesc__Group_3__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:784:1: ( ( rule__Videodesc__Group_3__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:785:1: ( rule__Videodesc__Group_3__0 )?
            {
             before(grammarAccess.getVideodescAccess().getGroup_3()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:786:1: ( rule__Videodesc__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LEFT_BRACKET) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:786:2: rule__Videodesc__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Videodesc__Group_3__0_in_rule__Videodesc__Group__3__Impl1537);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:804:1: rule__Videodesc__Group_3__0 : rule__Videodesc__Group_3__0__Impl rule__Videodesc__Group_3__1 ;
    public final void rule__Videodesc__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:808:1: ( rule__Videodesc__Group_3__0__Impl rule__Videodesc__Group_3__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:809:2: rule__Videodesc__Group_3__0__Impl rule__Videodesc__Group_3__1
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3__0__Impl_in_rule__Videodesc__Group_3__01576);
            rule__Videodesc__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3__1_in_rule__Videodesc__Group_3__01579);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:816:1: rule__Videodesc__Group_3__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Videodesc__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:820:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:821:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:821:1: ( RULE_LEFT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:822:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideodescAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__Videodesc__Group_3__0__Impl1606); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:833:1: rule__Videodesc__Group_3__1 : rule__Videodesc__Group_3__1__Impl rule__Videodesc__Group_3__2 ;
    public final void rule__Videodesc__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:837:1: ( rule__Videodesc__Group_3__1__Impl rule__Videodesc__Group_3__2 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:838:2: rule__Videodesc__Group_3__1__Impl rule__Videodesc__Group_3__2
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3__1__Impl_in_rule__Videodesc__Group_3__11635);
            rule__Videodesc__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3__2_in_rule__Videodesc__Group_3__11638);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:845:1: rule__Videodesc__Group_3__1__Impl : ( ( rule__Videodesc__Group_3_1__0 )? ) ;
    public final void rule__Videodesc__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:849:1: ( ( ( rule__Videodesc__Group_3_1__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:850:1: ( ( rule__Videodesc__Group_3_1__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:850:1: ( ( rule__Videodesc__Group_3_1__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:851:1: ( rule__Videodesc__Group_3_1__0 )?
            {
             before(grammarAccess.getVideodescAccess().getGroup_3_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:852:1: ( rule__Videodesc__Group_3_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:852:2: rule__Videodesc__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Videodesc__Group_3_1__0_in_rule__Videodesc__Group_3__1__Impl1665);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:862:1: rule__Videodesc__Group_3__2 : rule__Videodesc__Group_3__2__Impl rule__Videodesc__Group_3__3 ;
    public final void rule__Videodesc__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:866:1: ( rule__Videodesc__Group_3__2__Impl rule__Videodesc__Group_3__3 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:867:2: rule__Videodesc__Group_3__2__Impl rule__Videodesc__Group_3__3
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3__2__Impl_in_rule__Videodesc__Group_3__21696);
            rule__Videodesc__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3__3_in_rule__Videodesc__Group_3__21699);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:874:1: rule__Videodesc__Group_3__2__Impl : ( ( rule__Videodesc__Group_3_2__0 )? ) ;
    public final void rule__Videodesc__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:878:1: ( ( ( rule__Videodesc__Group_3_2__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:879:1: ( ( rule__Videodesc__Group_3_2__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:879:1: ( ( rule__Videodesc__Group_3_2__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:880:1: ( rule__Videodesc__Group_3_2__0 )?
            {
             before(grammarAccess.getVideodescAccess().getGroup_3_2()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:881:1: ( rule__Videodesc__Group_3_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:881:2: rule__Videodesc__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Videodesc__Group_3_2__0_in_rule__Videodesc__Group_3__2__Impl1726);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:891:1: rule__Videodesc__Group_3__3 : rule__Videodesc__Group_3__3__Impl rule__Videodesc__Group_3__4 ;
    public final void rule__Videodesc__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:895:1: ( rule__Videodesc__Group_3__3__Impl rule__Videodesc__Group_3__4 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:896:2: rule__Videodesc__Group_3__3__Impl rule__Videodesc__Group_3__4
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3__3__Impl_in_rule__Videodesc__Group_3__31757);
            rule__Videodesc__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3__4_in_rule__Videodesc__Group_3__31760);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:903:1: rule__Videodesc__Group_3__3__Impl : ( ( rule__Videodesc__Group_3_3__0 )? ) ;
    public final void rule__Videodesc__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:907:1: ( ( ( rule__Videodesc__Group_3_3__0 )? ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:908:1: ( ( rule__Videodesc__Group_3_3__0 )? )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:908:1: ( ( rule__Videodesc__Group_3_3__0 )? )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:909:1: ( rule__Videodesc__Group_3_3__0 )?
            {
             before(grammarAccess.getVideodescAccess().getGroup_3_3()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:910:1: ( rule__Videodesc__Group_3_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:910:2: rule__Videodesc__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__Videodesc__Group_3_3__0_in_rule__Videodesc__Group_3__3__Impl1787);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:920:1: rule__Videodesc__Group_3__4 : rule__Videodesc__Group_3__4__Impl ;
    public final void rule__Videodesc__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:924:1: ( rule__Videodesc__Group_3__4__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:925:2: rule__Videodesc__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3__4__Impl_in_rule__Videodesc__Group_3__41818);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:931:1: rule__Videodesc__Group_3__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Videodesc__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:935:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:936:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:936:1: ( RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:937:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideodescAccess().getRIGHT_BRACKETTerminalRuleCall_3_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__Videodesc__Group_3__4__Impl1845); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:958:1: rule__Videodesc__Group_3_1__0 : rule__Videodesc__Group_3_1__0__Impl rule__Videodesc__Group_3_1__1 ;
    public final void rule__Videodesc__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:962:1: ( rule__Videodesc__Group_3_1__0__Impl rule__Videodesc__Group_3_1__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:963:2: rule__Videodesc__Group_3_1__0__Impl rule__Videodesc__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_1__0__Impl_in_rule__Videodesc__Group_3_1__01884);
            rule__Videodesc__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3_1__1_in_rule__Videodesc__Group_3_1__01887);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:970:1: rule__Videodesc__Group_3_1__0__Impl : ( 'duree' ) ;
    public final void rule__Videodesc__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:974:1: ( ( 'duree' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:975:1: ( 'duree' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:975:1: ( 'duree' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:976:1: 'duree'
            {
             before(grammarAccess.getVideodescAccess().getDureeKeyword_3_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Videodesc__Group_3_1__0__Impl1915); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:989:1: rule__Videodesc__Group_3_1__1 : rule__Videodesc__Group_3_1__1__Impl ;
    public final void rule__Videodesc__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:993:1: ( rule__Videodesc__Group_3_1__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:994:2: rule__Videodesc__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_1__1__Impl_in_rule__Videodesc__Group_3_1__11946);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1000:1: rule__Videodesc__Group_3_1__1__Impl : ( ( rule__Videodesc__DureeAssignment_3_1_1 ) ) ;
    public final void rule__Videodesc__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1004:1: ( ( ( rule__Videodesc__DureeAssignment_3_1_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1005:1: ( ( rule__Videodesc__DureeAssignment_3_1_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1005:1: ( ( rule__Videodesc__DureeAssignment_3_1_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1006:1: ( rule__Videodesc__DureeAssignment_3_1_1 )
            {
             before(grammarAccess.getVideodescAccess().getDureeAssignment_3_1_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1007:1: ( rule__Videodesc__DureeAssignment_3_1_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1007:2: rule__Videodesc__DureeAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Videodesc__DureeAssignment_3_1_1_in_rule__Videodesc__Group_3_1__1__Impl1973);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1021:1: rule__Videodesc__Group_3_2__0 : rule__Videodesc__Group_3_2__0__Impl rule__Videodesc__Group_3_2__1 ;
    public final void rule__Videodesc__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1025:1: ( rule__Videodesc__Group_3_2__0__Impl rule__Videodesc__Group_3_2__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1026:2: rule__Videodesc__Group_3_2__0__Impl rule__Videodesc__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_2__0__Impl_in_rule__Videodesc__Group_3_2__02007);
            rule__Videodesc__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3_2__1_in_rule__Videodesc__Group_3_2__02010);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1033:1: rule__Videodesc__Group_3_2__0__Impl : ( 'description' ) ;
    public final void rule__Videodesc__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1037:1: ( ( 'description' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1038:1: ( 'description' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1038:1: ( 'description' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1039:1: 'description'
            {
             before(grammarAccess.getVideodescAccess().getDescriptionKeyword_3_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Videodesc__Group_3_2__0__Impl2038); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1052:1: rule__Videodesc__Group_3_2__1 : rule__Videodesc__Group_3_2__1__Impl ;
    public final void rule__Videodesc__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1056:1: ( rule__Videodesc__Group_3_2__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1057:2: rule__Videodesc__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_2__1__Impl_in_rule__Videodesc__Group_3_2__12069);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1063:1: rule__Videodesc__Group_3_2__1__Impl : ( ( rule__Videodesc__DescriptionAssignment_3_2_1 ) ) ;
    public final void rule__Videodesc__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1067:1: ( ( ( rule__Videodesc__DescriptionAssignment_3_2_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1068:1: ( ( rule__Videodesc__DescriptionAssignment_3_2_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1068:1: ( ( rule__Videodesc__DescriptionAssignment_3_2_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1069:1: ( rule__Videodesc__DescriptionAssignment_3_2_1 )
            {
             before(grammarAccess.getVideodescAccess().getDescriptionAssignment_3_2_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1070:1: ( rule__Videodesc__DescriptionAssignment_3_2_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1070:2: rule__Videodesc__DescriptionAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Videodesc__DescriptionAssignment_3_2_1_in_rule__Videodesc__Group_3_2__1__Impl2096);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1084:1: rule__Videodesc__Group_3_3__0 : rule__Videodesc__Group_3_3__0__Impl rule__Videodesc__Group_3_3__1 ;
    public final void rule__Videodesc__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1088:1: ( rule__Videodesc__Group_3_3__0__Impl rule__Videodesc__Group_3_3__1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1089:2: rule__Videodesc__Group_3_3__0__Impl rule__Videodesc__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_3__0__Impl_in_rule__Videodesc__Group_3_3__02130);
            rule__Videodesc__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videodesc__Group_3_3__1_in_rule__Videodesc__Group_3_3__02133);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1096:1: rule__Videodesc__Group_3_3__0__Impl : ( 'probabilite' ) ;
    public final void rule__Videodesc__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1100:1: ( ( 'probabilite' ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1101:1: ( 'probabilite' )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1101:1: ( 'probabilite' )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1102:1: 'probabilite'
            {
             before(grammarAccess.getVideodescAccess().getProbabiliteKeyword_3_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Videodesc__Group_3_3__0__Impl2161); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1115:1: rule__Videodesc__Group_3_3__1 : rule__Videodesc__Group_3_3__1__Impl ;
    public final void rule__Videodesc__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1119:1: ( rule__Videodesc__Group_3_3__1__Impl )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1120:2: rule__Videodesc__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Videodesc__Group_3_3__1__Impl_in_rule__Videodesc__Group_3_3__12192);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1126:1: rule__Videodesc__Group_3_3__1__Impl : ( ( rule__Videodesc__ProbabiliteAssignment_3_3_1 ) ) ;
    public final void rule__Videodesc__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1130:1: ( ( ( rule__Videodesc__ProbabiliteAssignment_3_3_1 ) ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1131:1: ( ( rule__Videodesc__ProbabiliteAssignment_3_3_1 ) )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1131:1: ( ( rule__Videodesc__ProbabiliteAssignment_3_3_1 ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1132:1: ( rule__Videodesc__ProbabiliteAssignment_3_3_1 )
            {
             before(grammarAccess.getVideodescAccess().getProbabiliteAssignment_3_3_1()); 
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1133:1: ( rule__Videodesc__ProbabiliteAssignment_3_3_1 )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1133:2: rule__Videodesc__ProbabiliteAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__Videodesc__ProbabiliteAssignment_3_3_1_in_rule__Videodesc__Group_3_3__1__Impl2219);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1148:1: rule__VideoGenModel__Variante_videosAssignment_2 : ( ruleVarianteVideo ) ;
    public final void rule__VideoGenModel__Variante_videosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1152:1: ( ( ruleVarianteVideo ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1153:1: ( ruleVarianteVideo )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1153:1: ( ruleVarianteVideo )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1154:1: ruleVarianteVideo
            {
             before(grammarAccess.getVideoGenModelAccess().getVariante_videosVarianteVideoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVarianteVideo_in_rule__VideoGenModel__Variante_videosAssignment_22258);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1163:1: rule__MandatoryVideoSeq__VideoAssignment_1 : ( ruleVideodesc ) ;
    public final void rule__MandatoryVideoSeq__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1167:1: ( ( ruleVideodesc ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1168:1: ( ruleVideodesc )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1168:1: ( ruleVideodesc )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1169:1: ruleVideodesc
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getVideoVideodescParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideodesc_in_rule__MandatoryVideoSeq__VideoAssignment_12289);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1178:1: rule__OptionalVideoSeq__VideoAssignment_1 : ( ruleVideodesc ) ;
    public final void rule__OptionalVideoSeq__VideoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1182:1: ( ( ruleVideodesc ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1183:1: ( ruleVideodesc )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1183:1: ( ruleVideodesc )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1184:1: ruleVideodesc
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getVideoVideodescParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideodesc_in_rule__OptionalVideoSeq__VideoAssignment_12320);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1193:1: rule__AlternativeVideoSeq__VideoidAssignment_1 : ( RULE_ID ) ;
    public final void rule__AlternativeVideoSeq__VideoidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1197:1: ( ( RULE_ID ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1198:1: ( RULE_ID )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1198:1: ( RULE_ID )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1199:1: RULE_ID
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeVideoSeq__VideoidAssignment_12351); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1208:1: rule__AlternativeVideoSeq__VideoAssignment_3 : ( ruleVideodesc ) ;
    public final void rule__AlternativeVideoSeq__VideoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1212:1: ( ( ruleVideodesc ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1213:1: ( ruleVideodesc )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1213:1: ( ruleVideodesc )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1214:1: ruleVideodesc
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoVideodescParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVideodesc_in_rule__AlternativeVideoSeq__VideoAssignment_32382);
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1223:1: rule__Videodesc__VideoidAssignment_1 : ( RULE_ID ) ;
    public final void rule__Videodesc__VideoidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1227:1: ( ( RULE_ID ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1228:1: ( RULE_ID )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1228:1: ( RULE_ID )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1229:1: RULE_ID
            {
             before(grammarAccess.getVideodescAccess().getVideoidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Videodesc__VideoidAssignment_12413); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1238:1: rule__Videodesc__CheminAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Videodesc__CheminAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1242:1: ( ( RULE_STRING ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1243:1: ( RULE_STRING )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1243:1: ( RULE_STRING )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1244:1: RULE_STRING
            {
             before(grammarAccess.getVideodescAccess().getCheminSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Videodesc__CheminAssignment_22444); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1253:1: rule__Videodesc__DureeAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__Videodesc__DureeAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1257:1: ( ( RULE_INT ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1258:1: ( RULE_INT )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1258:1: ( RULE_INT )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1259:1: RULE_INT
            {
             before(grammarAccess.getVideodescAccess().getDureeINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Videodesc__DureeAssignment_3_1_12475); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1268:1: rule__Videodesc__DescriptionAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__Videodesc__DescriptionAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1272:1: ( ( RULE_STRING ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1273:1: ( RULE_STRING )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1273:1: ( RULE_STRING )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1274:1: RULE_STRING
            {
             before(grammarAccess.getVideodescAccess().getDescriptionSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Videodesc__DescriptionAssignment_3_2_12506); 
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
    // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1283:1: rule__Videodesc__ProbabiliteAssignment_3_3_1 : ( RULE_INT ) ;
    public final void rule__Videodesc__ProbabiliteAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1287:1: ( ( RULE_INT ) )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1288:1: ( RULE_INT )
            {
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1288:1: ( RULE_INT )
            // ../org.xtext.videogen.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalVideogen.g:1289:1: RULE_INT
            {
             before(grammarAccess.getVideodescAccess().getProbabiliteINTTerminalRuleCall_3_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Videodesc__ProbabiliteAssignment_3_3_12537); 
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
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__1__Impl_in_rule__VideoGenModel__Group__1556 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__2_in_rule__VideoGenModel__Group__1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoGenModel__Group__1__Impl586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__2__Impl_in_rule__VideoGenModel__Group__2615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__3_in_rule__VideoGenModel__Group__2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Variante_videosAssignment_2_in_rule__VideoGenModel__Group__2__Impl647 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Variante_videosAssignment_2_in_rule__VideoGenModel__Group__2__Impl659 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__VideoGenModel__Group__3__Impl_in_rule__VideoGenModel__Group__3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGenModel__Group__3__Impl719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__0__Impl_in_rule__MandatoryVideoSeq__Group__0756 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__1_in_rule__MandatoryVideoSeq__Group__0759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MandatoryVideoSeq__Group__0__Impl787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__1__Impl_in_rule__MandatoryVideoSeq__Group__1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__VideoAssignment_1_in_rule__MandatoryVideoSeq__Group__1__Impl845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__0__Impl_in_rule__OptionalVideoSeq__Group__0879 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__1_in_rule__OptionalVideoSeq__Group__0882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__OptionalVideoSeq__Group__0__Impl910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__1__Impl_in_rule__OptionalVideoSeq__Group__1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__VideoAssignment_1_in_rule__OptionalVideoSeq__Group__1__Impl968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__0__Impl_in_rule__AlternativeVideoSeq__Group__01002 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__1_in_rule__AlternativeVideoSeq__Group__01005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AlternativeVideoSeq__Group__0__Impl1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__1__Impl_in_rule__AlternativeVideoSeq__Group__11064 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__2_in_rule__AlternativeVideoSeq__Group__11067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__VideoidAssignment_1_in_rule__AlternativeVideoSeq__Group__1__Impl1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__2__Impl_in_rule__AlternativeVideoSeq__Group__21125 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__3_in_rule__AlternativeVideoSeq__Group__21128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__AlternativeVideoSeq__Group__2__Impl1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__3__Impl_in_rule__AlternativeVideoSeq__Group__31184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__4_in_rule__AlternativeVideoSeq__Group__31187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__VideoAssignment_3_in_rule__AlternativeVideoSeq__Group__3__Impl1216 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__VideoAssignment_3_in_rule__AlternativeVideoSeq__Group__3__Impl1228 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AlternativeVideoSeq__Group__4__Impl_in_rule__AlternativeVideoSeq__Group__41261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__AlternativeVideoSeq__Group__4__Impl1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__0__Impl_in_rule__Videodesc__Group__01327 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__1_in_rule__Videodesc__Group__01330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Videodesc__Group__0__Impl1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__1__Impl_in_rule__Videodesc__Group__11389 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__2_in_rule__Videodesc__Group__11392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__VideoidAssignment_1_in_rule__Videodesc__Group__1__Impl1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__2__Impl_in_rule__Videodesc__Group__21450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__3_in_rule__Videodesc__Group__21453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__CheminAssignment_2_in_rule__Videodesc__Group__2__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group__3__Impl_in_rule__Videodesc__Group__31510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__0_in_rule__Videodesc__Group__3__Impl1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__0__Impl_in_rule__Videodesc__Group_3__01576 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__1_in_rule__Videodesc__Group_3__01579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__Videodesc__Group_3__0__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__1__Impl_in_rule__Videodesc__Group_3__11635 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__2_in_rule__Videodesc__Group_3__11638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_1__0_in_rule__Videodesc__Group_3__1__Impl1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__2__Impl_in_rule__Videodesc__Group_3__21696 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__3_in_rule__Videodesc__Group_3__21699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_2__0_in_rule__Videodesc__Group_3__2__Impl1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__3__Impl_in_rule__Videodesc__Group_3__31757 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__4_in_rule__Videodesc__Group_3__31760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_3__0_in_rule__Videodesc__Group_3__3__Impl1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3__4__Impl_in_rule__Videodesc__Group_3__41818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__Videodesc__Group_3__4__Impl1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_1__0__Impl_in_rule__Videodesc__Group_3_1__01884 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_1__1_in_rule__Videodesc__Group_3_1__01887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Videodesc__Group_3_1__0__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_1__1__Impl_in_rule__Videodesc__Group_3_1__11946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__DureeAssignment_3_1_1_in_rule__Videodesc__Group_3_1__1__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_2__0__Impl_in_rule__Videodesc__Group_3_2__02007 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_2__1_in_rule__Videodesc__Group_3_2__02010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Videodesc__Group_3_2__0__Impl2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_2__1__Impl_in_rule__Videodesc__Group_3_2__12069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__DescriptionAssignment_3_2_1_in_rule__Videodesc__Group_3_2__1__Impl2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_3__0__Impl_in_rule__Videodesc__Group_3_3__02130 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_3__1_in_rule__Videodesc__Group_3_3__02133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Videodesc__Group_3_3__0__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__Group_3_3__1__Impl_in_rule__Videodesc__Group_3_3__12192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videodesc__ProbabiliteAssignment_3_3_1_in_rule__Videodesc__Group_3_3__1__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarianteVideo_in_rule__VideoGenModel__Variante_videosAssignment_22258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideodesc_in_rule__MandatoryVideoSeq__VideoAssignment_12289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideodesc_in_rule__OptionalVideoSeq__VideoAssignment_12320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeVideoSeq__VideoidAssignment_12351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideodesc_in_rule__AlternativeVideoSeq__VideoAssignment_32382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Videodesc__VideoidAssignment_12413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Videodesc__CheminAssignment_22444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Videodesc__DureeAssignment_3_1_12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Videodesc__DescriptionAssignment_3_2_12506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Videodesc__ProbabiliteAssignment_3_3_12537 = new BitSet(new long[]{0x0000000000000002L});

}