package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.VideogenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideogenParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g"; }



     	private VideogenGrammarAccess grammarAccess;
     	
        public InternalVideogenParser(TokenStream input, VideogenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "VideoGenModel";	
       	}
       	
       	@Override
       	protected VideogenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVideoGenModel"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:67:1: entryRuleVideoGenModel returns [EObject current=null] : iv_ruleVideoGenModel= ruleVideoGenModel EOF ;
    public final EObject entryRuleVideoGenModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoGenModel = null;


        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:68:2: (iv_ruleVideoGenModel= ruleVideoGenModel EOF )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:69:2: iv_ruleVideoGenModel= ruleVideoGenModel EOF
            {
             newCompositeNode(grammarAccess.getVideoGenModelRule()); 
            pushFollow(FOLLOW_ruleVideoGenModel_in_entryRuleVideoGenModel75);
            iv_ruleVideoGenModel=ruleVideoGenModel();

            state._fsp--;

             current =iv_ruleVideoGenModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGenModel85); 

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
    // $ANTLR end "entryRuleVideoGenModel"


    // $ANTLR start "ruleVideoGenModel"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:76:1: ruleVideoGenModel returns [EObject current=null] : (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_variante_videos_2_0= ruleVarianteVideo ) )+ this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleVideoGenModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFT_BRACKET_1=null;
        Token this_RIGHT_BRACKET_3=null;
        EObject lv_variante_videos_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:79:28: ( (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_variante_videos_2_0= ruleVarianteVideo ) )+ this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:80:1: (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_variante_videos_2_0= ruleVarianteVideo ) )+ this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:80:1: (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_variante_videos_2_0= ruleVarianteVideo ) )+ this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:80:3: otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_variante_videos_2_0= ruleVarianteVideo ) )+ this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleVideoGenModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoGenModelAccess().getVideoGenKeyword_0());
                
            this_LEFT_BRACKET_1=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_ruleVideoGenModel133); 
             
                newLeafNode(this_LEFT_BRACKET_1, grammarAccess.getVideoGenModelAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:88:1: ( (lv_variante_videos_2_0= ruleVarianteVideo ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:89:1: (lv_variante_videos_2_0= ruleVarianteVideo )
            	    {
            	    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:89:1: (lv_variante_videos_2_0= ruleVarianteVideo )
            	    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:90:3: lv_variante_videos_2_0= ruleVarianteVideo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVideoGenModelAccess().getVariante_videosVarianteVideoParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVarianteVideo_in_ruleVideoGenModel153);
            	    lv_variante_videos_2_0=ruleVarianteVideo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVideoGenModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variante_videos",
            	            		lv_variante_videos_2_0, 
            	            		"VarianteVideo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            this_RIGHT_BRACKET_3=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_ruleVideoGenModel165); 
             
                newLeafNode(this_RIGHT_BRACKET_3, grammarAccess.getVideoGenModelAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 
                

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
    // $ANTLR end "ruleVideoGenModel"


    // $ANTLR start "entryRuleVarianteVideo"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:118:1: entryRuleVarianteVideo returns [EObject current=null] : iv_ruleVarianteVideo= ruleVarianteVideo EOF ;
    public final EObject entryRuleVarianteVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarianteVideo = null;


        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:119:2: (iv_ruleVarianteVideo= ruleVarianteVideo EOF )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:120:2: iv_ruleVarianteVideo= ruleVarianteVideo EOF
            {
             newCompositeNode(grammarAccess.getVarianteVideoRule()); 
            pushFollow(FOLLOW_ruleVarianteVideo_in_entryRuleVarianteVideo200);
            iv_ruleVarianteVideo=ruleVarianteVideo();

            state._fsp--;

             current =iv_ruleVarianteVideo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarianteVideo210); 

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
    // $ANTLR end "entryRuleVarianteVideo"


    // $ANTLR start "ruleVarianteVideo"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:127:1: ruleVarianteVideo returns [EObject current=null] : (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq ) ;
    public final EObject ruleVarianteVideo() throws RecognitionException {
        EObject current = null;

        EObject this_MandatoryVideoSeq_0 = null;

        EObject this_OptionalVideoSeq_1 = null;

        EObject this_AlternativeVideoSeq_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:130:28: ( (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:131:1: (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:131:1: (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:132:5: this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq
                    {
                     
                            newCompositeNode(grammarAccess.getVarianteVideoAccess().getMandatoryVideoSeqParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMandatoryVideoSeq_in_ruleVarianteVideo257);
                    this_MandatoryVideoSeq_0=ruleMandatoryVideoSeq();

                    state._fsp--;

                     
                            current = this_MandatoryVideoSeq_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:142:5: this_OptionalVideoSeq_1= ruleOptionalVideoSeq
                    {
                     
                            newCompositeNode(grammarAccess.getVarianteVideoAccess().getOptionalVideoSeqParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOptionalVideoSeq_in_ruleVarianteVideo284);
                    this_OptionalVideoSeq_1=ruleOptionalVideoSeq();

                    state._fsp--;

                     
                            current = this_OptionalVideoSeq_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:152:5: this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq
                    {
                     
                            newCompositeNode(grammarAccess.getVarianteVideoAccess().getAlternativeVideoSeqParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAlternativeVideoSeq_in_ruleVarianteVideo311);
                    this_AlternativeVideoSeq_2=ruleAlternativeVideoSeq();

                    state._fsp--;

                     
                            current = this_AlternativeVideoSeq_2; 
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
    // $ANTLR end "ruleVarianteVideo"


    // $ANTLR start "entryRuleMandatoryVideoSeq"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:168:1: entryRuleMandatoryVideoSeq returns [EObject current=null] : iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF ;
    public final EObject entryRuleMandatoryVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryVideoSeq = null;


        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:169:2: (iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:170:2: iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getMandatoryVideoSeqRule()); 
            pushFollow(FOLLOW_ruleMandatoryVideoSeq_in_entryRuleMandatoryVideoSeq346);
            iv_ruleMandatoryVideoSeq=ruleMandatoryVideoSeq();

            state._fsp--;

             current =iv_ruleMandatoryVideoSeq; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatoryVideoSeq356); 

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
    // $ANTLR end "entryRuleMandatoryVideoSeq"


    // $ANTLR start "ruleMandatoryVideoSeq"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:177:1: ruleMandatoryVideoSeq returns [EObject current=null] : (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideodesc ) ) ) ;
    public final EObject ruleMandatoryVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_video_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:180:28: ( (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideodesc ) ) ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:181:1: (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideodesc ) ) )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:181:1: (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideodesc ) ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:181:3: otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideodesc ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMandatoryVideoSeq393); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0());
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:185:1: ( (lv_video_1_0= ruleVideodesc ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:186:1: (lv_video_1_0= ruleVideodesc )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:186:1: (lv_video_1_0= ruleVideodesc )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:187:3: lv_video_1_0= ruleVideodesc
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryVideoSeqAccess().getVideoVideodescParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideodesc_in_ruleMandatoryVideoSeq414);
            lv_video_1_0=ruleVideodesc();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryVideoSeqRule());
            	        }
                   		set(
                   			current, 
                   			"video",
                    		lv_video_1_0, 
                    		"Videodesc");
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
    // $ANTLR end "ruleMandatoryVideoSeq"


    // $ANTLR start "entryRuleOptionalVideoSeq"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:211:1: entryRuleOptionalVideoSeq returns [EObject current=null] : iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF ;
    public final EObject entryRuleOptionalVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalVideoSeq = null;


        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:212:2: (iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:213:2: iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getOptionalVideoSeqRule()); 
            pushFollow(FOLLOW_ruleOptionalVideoSeq_in_entryRuleOptionalVideoSeq450);
            iv_ruleOptionalVideoSeq=ruleOptionalVideoSeq();

            state._fsp--;

             current =iv_ruleOptionalVideoSeq; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalVideoSeq460); 

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
    // $ANTLR end "entryRuleOptionalVideoSeq"


    // $ANTLR start "ruleOptionalVideoSeq"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:220:1: ruleOptionalVideoSeq returns [EObject current=null] : (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideodesc ) ) ) ;
    public final EObject ruleOptionalVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_video_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:223:28: ( (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideodesc ) ) ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:224:1: (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideodesc ) ) )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:224:1: (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideodesc ) ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:224:3: otherlv_0= 'optional' ( (lv_video_1_0= ruleVideodesc ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleOptionalVideoSeq497); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0());
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:228:1: ( (lv_video_1_0= ruleVideodesc ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:229:1: (lv_video_1_0= ruleVideodesc )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:229:1: (lv_video_1_0= ruleVideodesc )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:230:3: lv_video_1_0= ruleVideodesc
            {
             
            	        newCompositeNode(grammarAccess.getOptionalVideoSeqAccess().getVideoVideodescParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideodesc_in_ruleOptionalVideoSeq518);
            lv_video_1_0=ruleVideodesc();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalVideoSeqRule());
            	        }
                   		set(
                   			current, 
                   			"video",
                    		lv_video_1_0, 
                    		"Videodesc");
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
    // $ANTLR end "ruleOptionalVideoSeq"


    // $ANTLR start "entryRuleAlternativeVideoSeq"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:254:1: entryRuleAlternativeVideoSeq returns [EObject current=null] : iv_ruleAlternativeVideoSeq= ruleAlternativeVideoSeq EOF ;
    public final EObject entryRuleAlternativeVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeVideoSeq = null;


        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:255:2: (iv_ruleAlternativeVideoSeq= ruleAlternativeVideoSeq EOF )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:256:2: iv_ruleAlternativeVideoSeq= ruleAlternativeVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getAlternativeVideoSeqRule()); 
            pushFollow(FOLLOW_ruleAlternativeVideoSeq_in_entryRuleAlternativeVideoSeq554);
            iv_ruleAlternativeVideoSeq=ruleAlternativeVideoSeq();

            state._fsp--;

             current =iv_ruleAlternativeVideoSeq; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeVideoSeq564); 

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
    // $ANTLR end "entryRuleAlternativeVideoSeq"


    // $ANTLR start "ruleAlternativeVideoSeq"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:263:1: ruleAlternativeVideoSeq returns [EObject current=null] : (otherlv_0= 'alternative' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_video_3_0= ruleVideodesc ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleAlternativeVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_videoid_1_0=null;
        Token this_LEFT_BRACKET_2=null;
        Token this_RIGHT_BRACKET_4=null;
        EObject lv_video_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:266:28: ( (otherlv_0= 'alternative' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_video_3_0= ruleVideodesc ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:267:1: (otherlv_0= 'alternative' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_video_3_0= ruleVideodesc ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:267:1: (otherlv_0= 'alternative' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_video_3_0= ruleVideodesc ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:267:3: otherlv_0= 'alternative' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_video_3_0= ruleVideodesc ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAlternativeVideoSeq601); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativeVideoSeqAccess().getAlternativeKeyword_0());
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:271:1: ( (lv_videoid_1_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:272:1: (lv_videoid_1_0= RULE_ID )
                    {
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:272:1: (lv_videoid_1_0= RULE_ID )
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:273:3: lv_videoid_1_0= RULE_ID
                    {
                    lv_videoid_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternativeVideoSeq618); 

                    			newLeafNode(lv_videoid_1_0, grammarAccess.getAlternativeVideoSeqAccess().getVideoidIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlternativeVideoSeqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"videoid",
                            		lv_videoid_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_ruleAlternativeVideoSeq635); 
             
                newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getAlternativeVideoSeqAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:293:1: ( (lv_video_3_0= ruleVideodesc ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:294:1: (lv_video_3_0= ruleVideodesc )
            	    {
            	    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:294:1: (lv_video_3_0= ruleVideodesc )
            	    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:295:3: lv_video_3_0= ruleVideodesc
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativeVideoSeqAccess().getVideoVideodescParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVideodesc_in_ruleAlternativeVideoSeq655);
            	    lv_video_3_0=ruleVideodesc();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativeVideoSeqRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"video",
            	            		lv_video_3_0, 
            	            		"Videodesc");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            this_RIGHT_BRACKET_4=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_ruleAlternativeVideoSeq667); 
             
                newLeafNode(this_RIGHT_BRACKET_4, grammarAccess.getAlternativeVideoSeqAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
                

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
    // $ANTLR end "ruleAlternativeVideoSeq"


    // $ANTLR start "entryRuleVideodesc"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:323:1: entryRuleVideodesc returns [EObject current=null] : iv_ruleVideodesc= ruleVideodesc EOF ;
    public final EObject entryRuleVideodesc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideodesc = null;


        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:324:2: (iv_ruleVideodesc= ruleVideodesc EOF )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:325:2: iv_ruleVideodesc= ruleVideodesc EOF
            {
             newCompositeNode(grammarAccess.getVideodescRule()); 
            pushFollow(FOLLOW_ruleVideodesc_in_entryRuleVideodesc702);
            iv_ruleVideodesc=ruleVideodesc();

            state._fsp--;

             current =iv_ruleVideodesc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideodesc712); 

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
    // $ANTLR end "entryRuleVideodesc"


    // $ANTLR start "ruleVideodesc"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:332:1: ruleVideodesc returns [EObject current=null] : (otherlv_0= 'video' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_chemin_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duree' ( (lv_duree_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'probabilite' ( (lv_probabilite_9_0= RULE_INT ) ) )? this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET )? ) ;
    public final EObject ruleVideodesc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_videoid_1_0=null;
        Token lv_chemin_2_0=null;
        Token this_LEFT_BRACKET_3=null;
        Token otherlv_4=null;
        Token lv_duree_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token lv_probabilite_9_0=null;
        Token this_RIGHT_BRACKET_10=null;

         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:335:28: ( (otherlv_0= 'video' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_chemin_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duree' ( (lv_duree_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'probabilite' ( (lv_probabilite_9_0= RULE_INT ) ) )? this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET )? ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:336:1: (otherlv_0= 'video' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_chemin_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duree' ( (lv_duree_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'probabilite' ( (lv_probabilite_9_0= RULE_INT ) ) )? this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET )? )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:336:1: (otherlv_0= 'video' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_chemin_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duree' ( (lv_duree_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'probabilite' ( (lv_probabilite_9_0= RULE_INT ) ) )? this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET )? )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:336:3: otherlv_0= 'video' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_chemin_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duree' ( (lv_duree_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'probabilite' ( (lv_probabilite_9_0= RULE_INT ) ) )? this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleVideodesc749); 

                	newLeafNode(otherlv_0, grammarAccess.getVideodescAccess().getVideoKeyword_0());
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:340:1: ( (lv_videoid_1_0= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:341:1: (lv_videoid_1_0= RULE_ID )
                    {
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:341:1: (lv_videoid_1_0= RULE_ID )
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:342:3: lv_videoid_1_0= RULE_ID
                    {
                    lv_videoid_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVideodesc766); 

                    			newLeafNode(lv_videoid_1_0, grammarAccess.getVideodescAccess().getVideoidIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideodescRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"videoid",
                            		lv_videoid_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:358:3: ( (lv_chemin_2_0= RULE_STRING ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:359:1: (lv_chemin_2_0= RULE_STRING )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:359:1: (lv_chemin_2_0= RULE_STRING )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:360:3: lv_chemin_2_0= RULE_STRING
            {
            lv_chemin_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideodesc789); 

            			newLeafNode(lv_chemin_2_0, grammarAccess.getVideodescAccess().getCheminSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVideodescRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"chemin",
                    		lv_chemin_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:376:2: (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duree' ( (lv_duree_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'probabilite' ( (lv_probabilite_9_0= RULE_INT ) ) )? this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_LEFT_BRACKET) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:376:3: this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duree' ( (lv_duree_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'probabilite' ( (lv_probabilite_9_0= RULE_INT ) ) )? this_RIGHT_BRACKET_10= RULE_RIGHT_BRACKET
                    {
                    this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_ruleVideodesc806); 
                     
                        newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getVideodescAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 
                        
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:380:1: (otherlv_4= 'duree' ( (lv_duree_5_0= RULE_INT ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==18) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:380:3: otherlv_4= 'duree' ( (lv_duree_5_0= RULE_INT ) )
                            {
                            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleVideodesc818); 

                                	newLeafNode(otherlv_4, grammarAccess.getVideodescAccess().getDureeKeyword_3_1_0());
                                
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:384:1: ( (lv_duree_5_0= RULE_INT ) )
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:385:1: (lv_duree_5_0= RULE_INT )
                            {
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:385:1: (lv_duree_5_0= RULE_INT )
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:386:3: lv_duree_5_0= RULE_INT
                            {
                            lv_duree_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVideodesc835); 

                            			newLeafNode(lv_duree_5_0, grammarAccess.getVideodescAccess().getDureeINTTerminalRuleCall_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVideodescRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"duree",
                                    		lv_duree_5_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:402:4: (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:402:6: otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) )
                            {
                            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleVideodesc855); 

                                	newLeafNode(otherlv_6, grammarAccess.getVideodescAccess().getDescriptionKeyword_3_2_0());
                                
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:406:1: ( (lv_description_7_0= RULE_STRING ) )
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:407:1: (lv_description_7_0= RULE_STRING )
                            {
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:407:1: (lv_description_7_0= RULE_STRING )
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:408:3: lv_description_7_0= RULE_STRING
                            {
                            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideodesc872); 

                            			newLeafNode(lv_description_7_0, grammarAccess.getVideodescAccess().getDescriptionSTRINGTerminalRuleCall_3_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVideodescRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_7_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:424:4: (otherlv_8= 'probabilite' ( (lv_probabilite_9_0= RULE_INT ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:424:6: otherlv_8= 'probabilite' ( (lv_probabilite_9_0= RULE_INT ) )
                            {
                            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleVideodesc892); 

                                	newLeafNode(otherlv_8, grammarAccess.getVideodescAccess().getProbabiliteKeyword_3_3_0());
                                
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:428:1: ( (lv_probabilite_9_0= RULE_INT ) )
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:429:1: (lv_probabilite_9_0= RULE_INT )
                            {
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:429:1: (lv_probabilite_9_0= RULE_INT )
                            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:430:3: lv_probabilite_9_0= RULE_INT
                            {
                            lv_probabilite_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVideodesc909); 

                            			newLeafNode(lv_probabilite_9_0, grammarAccess.getVideodescAccess().getProbabiliteINTTerminalRuleCall_3_3_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVideodescRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"probabilite",
                                    		lv_probabilite_9_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    this_RIGHT_BRACKET_10=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_ruleVideodesc927); 
                     
                        newLeafNode(this_RIGHT_BRACKET_10, grammarAccess.getVideodescAccess().getRIGHT_BRACKETTerminalRuleCall_3_4()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleVideodesc"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGenModel_in_entryRuleVideoGenModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGenModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVideoGenModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_ruleVideoGenModel133 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ruleVarianteVideo_in_ruleVideoGenModel153 = new BitSet(new long[]{0x000000000001C020L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_ruleVideoGenModel165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarianteVideo_in_entryRuleVarianteVideo200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarianteVideo210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryVideoSeq_in_ruleVarianteVideo257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalVideoSeq_in_ruleVarianteVideo284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeVideoSeq_in_ruleVarianteVideo311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryVideoSeq_in_entryRuleMandatoryVideoSeq346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryVideoSeq356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMandatoryVideoSeq393 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVideodesc_in_ruleMandatoryVideoSeq414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalVideoSeq_in_entryRuleOptionalVideoSeq450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalVideoSeq460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOptionalVideoSeq497 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVideodesc_in_ruleOptionalVideoSeq518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeVideoSeq_in_entryRuleAlternativeVideoSeq554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeVideoSeq564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAlternativeVideoSeq601 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeVideoSeq618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_ruleAlternativeVideoSeq635 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVideodesc_in_ruleAlternativeVideoSeq655 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_ruleAlternativeVideoSeq667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideodesc_in_entryRuleVideodesc702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideodesc712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVideodesc749 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVideodesc766 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideodesc789 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_ruleVideodesc806 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_18_in_ruleVideodesc818 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVideodesc835 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_19_in_ruleVideodesc855 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideodesc872 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_20_in_ruleVideodesc892 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVideodesc909 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_ruleVideodesc927 = new BitSet(new long[]{0x0000000000000002L});

}