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
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:76:1: ruleVideoGenModel returns [EObject current=null] : (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_variante_videos_2_0= ruleVarianteVideo ) )* this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleVideoGenModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFT_BRACKET_1=null;
        Token this_RIGHT_BRACKET_3=null;
        EObject lv_variante_videos_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:79:28: ( (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_variante_videos_2_0= ruleVarianteVideo ) )* this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:80:1: (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_variante_videos_2_0= ruleVarianteVideo ) )* this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:80:1: (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_variante_videos_2_0= ruleVarianteVideo ) )* this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:80:3: otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_variante_videos_2_0= ruleVarianteVideo ) )* this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleVideoGenModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoGenModelAccess().getVideoGenKeyword_0());
                
            this_LEFT_BRACKET_1=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_ruleVideoGenModel133); 
             
                newLeafNode(this_LEFT_BRACKET_1, grammarAccess.getVideoGenModelAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:88:1: ( (lv_variante_videos_2_0= ruleVarianteVideo ) )*
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
            	    break loop1;
                }
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
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:177:1: ruleMandatoryVideoSeq returns [EObject current=null] : (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideo ) ) ) ;
    public final EObject ruleMandatoryVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_video_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:180:28: ( (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideo ) ) ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:181:1: (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideo ) ) )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:181:1: (otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideo ) ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:181:3: otherlv_0= 'mandatory' ( (lv_video_1_0= ruleVideo ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMandatoryVideoSeq393); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0());
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:185:1: ( (lv_video_1_0= ruleVideo ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:186:1: (lv_video_1_0= ruleVideo )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:186:1: (lv_video_1_0= ruleVideo )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:187:3: lv_video_1_0= ruleVideo
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryVideoSeqAccess().getVideoVideoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideo_in_ruleMandatoryVideoSeq414);
            lv_video_1_0=ruleVideo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryVideoSeqRule());
            	        }
                   		set(
                   			current, 
                   			"video",
                    		lv_video_1_0, 
                    		"Video");
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
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:220:1: ruleOptionalVideoSeq returns [EObject current=null] : (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideo ) ) ) ;
    public final EObject ruleOptionalVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_video_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:223:28: ( (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideo ) ) ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:224:1: (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideo ) ) )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:224:1: (otherlv_0= 'optional' ( (lv_video_1_0= ruleVideo ) ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:224:3: otherlv_0= 'optional' ( (lv_video_1_0= ruleVideo ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleOptionalVideoSeq497); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0());
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:228:1: ( (lv_video_1_0= ruleVideo ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:229:1: (lv_video_1_0= ruleVideo )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:229:1: (lv_video_1_0= ruleVideo )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:230:3: lv_video_1_0= ruleVideo
            {
             
            	        newCompositeNode(grammarAccess.getOptionalVideoSeqAccess().getVideoVideoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideo_in_ruleOptionalVideoSeq518);
            lv_video_1_0=ruleVideo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalVideoSeqRule());
            	        }
                   		set(
                   			current, 
                   			"video",
                    		lv_video_1_0, 
                    		"Video");
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
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:263:1: ruleAlternativeVideoSeq returns [EObject current=null] : (otherlv_0= 'alternative' ( (lv_video_1_0= ruleVideo ) ) ) ;
    public final EObject ruleAlternativeVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_video_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:266:28: ( (otherlv_0= 'alternative' ( (lv_video_1_0= ruleVideo ) ) ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:267:1: (otherlv_0= 'alternative' ( (lv_video_1_0= ruleVideo ) ) )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:267:1: (otherlv_0= 'alternative' ( (lv_video_1_0= ruleVideo ) ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:267:3: otherlv_0= 'alternative' ( (lv_video_1_0= ruleVideo ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAlternativeVideoSeq601); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativeVideoSeqAccess().getAlternativeKeyword_0());
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:271:1: ( (lv_video_1_0= ruleVideo ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:272:1: (lv_video_1_0= ruleVideo )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:272:1: (lv_video_1_0= ruleVideo )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:273:3: lv_video_1_0= ruleVideo
            {
             
            	        newCompositeNode(grammarAccess.getAlternativeVideoSeqAccess().getVideoVideoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideo_in_ruleAlternativeVideoSeq622);
            lv_video_1_0=ruleVideo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlternativeVideoSeqRule());
            	        }
                   		set(
                   			current, 
                   			"video",
                    		lv_video_1_0, 
                    		"Video");
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
    // $ANTLR end "ruleAlternativeVideoSeq"


    // $ANTLR start "entryRuleVideo"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:297:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:298:2: (iv_ruleVideo= ruleVideo EOF )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:299:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_ruleVideo_in_entryRuleVideo658);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideo668); 

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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:306:1: ruleVideo returns [EObject current=null] : (otherlv_0= 'video' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_chemin_2_0= RULE_STRING ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_propriete_4_0= ruleVideoPropriete ) ) this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_videoid_1_0=null;
        Token lv_chemin_2_0=null;
        Token this_LEFT_BRACKET_3=null;
        Token this_RIGHT_BRACKET_5=null;
        EObject lv_propriete_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:309:28: ( (otherlv_0= 'video' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_chemin_2_0= RULE_STRING ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_propriete_4_0= ruleVideoPropriete ) ) this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:310:1: (otherlv_0= 'video' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_chemin_2_0= RULE_STRING ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_propriete_4_0= ruleVideoPropriete ) ) this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:310:1: (otherlv_0= 'video' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_chemin_2_0= RULE_STRING ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_propriete_4_0= ruleVideoPropriete ) ) this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:310:3: otherlv_0= 'video' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_chemin_2_0= RULE_STRING ) ) this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_propriete_4_0= ruleVideoPropriete ) ) this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleVideo705); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoAccess().getVideoKeyword_0());
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:314:1: ( (lv_videoid_1_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:315:1: (lv_videoid_1_0= RULE_ID )
                    {
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:315:1: (lv_videoid_1_0= RULE_ID )
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:316:3: lv_videoid_1_0= RULE_ID
                    {
                    lv_videoid_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVideo722); 

                    			newLeafNode(lv_videoid_1_0, grammarAccess.getVideoAccess().getVideoidIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoRule());
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

            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:332:3: ( (lv_chemin_2_0= RULE_STRING ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:333:1: (lv_chemin_2_0= RULE_STRING )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:333:1: (lv_chemin_2_0= RULE_STRING )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:334:3: lv_chemin_2_0= RULE_STRING
            {
            lv_chemin_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideo745); 

            			newLeafNode(lv_chemin_2_0, grammarAccess.getVideoAccess().getCheminSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVideoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"chemin",
                    		lv_chemin_2_0, 
                    		"STRING");
            	    

            }


            }

            this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_ruleVideo761); 
             
                newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getVideoAccess().getLEFT_BRACKETTerminalRuleCall_3()); 
                
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:354:1: ( (lv_propriete_4_0= ruleVideoPropriete ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:355:1: (lv_propriete_4_0= ruleVideoPropriete )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:355:1: (lv_propriete_4_0= ruleVideoPropriete )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:356:3: lv_propriete_4_0= ruleVideoPropriete
            {
             
            	        newCompositeNode(grammarAccess.getVideoAccess().getProprieteVideoProprieteParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVideoPropriete_in_ruleVideo781);
            lv_propriete_4_0=ruleVideoPropriete();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVideoRule());
            	        }
                   		set(
                   			current, 
                   			"propriete",
                    		lv_propriete_4_0, 
                    		"VideoPropriete");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RIGHT_BRACKET_5=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_ruleVideo792); 
             
                newLeafNode(this_RIGHT_BRACKET_5, grammarAccess.getVideoAccess().getRIGHT_BRACKETTerminalRuleCall_5()); 
                

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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleVideoPropriete"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:384:1: entryRuleVideoPropriete returns [EObject current=null] : iv_ruleVideoPropriete= ruleVideoPropriete EOF ;
    public final EObject entryRuleVideoPropriete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoPropriete = null;


        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:385:2: (iv_ruleVideoPropriete= ruleVideoPropriete EOF )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:386:2: iv_ruleVideoPropriete= ruleVideoPropriete EOF
            {
             newCompositeNode(grammarAccess.getVideoProprieteRule()); 
            pushFollow(FOLLOW_ruleVideoPropriete_in_entryRuleVideoPropriete827);
            iv_ruleVideoPropriete=ruleVideoPropriete();

            state._fsp--;

             current =iv_ruleVideoPropriete; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoPropriete837); 

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
    // $ANTLR end "entryRuleVideoPropriete"


    // $ANTLR start "ruleVideoPropriete"
    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:393:1: ruleVideoPropriete returns [EObject current=null] : ( (otherlv_0= 'probabilite' ( (lv_probabilite_1_0= RULE_INT ) ) )? (otherlv_2= 'duree' ( (lv_duree_3_0= RULE_INT ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleVideoPropriete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_probabilite_1_0=null;
        Token otherlv_2=null;
        Token lv_duree_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:396:28: ( ( (otherlv_0= 'probabilite' ( (lv_probabilite_1_0= RULE_INT ) ) )? (otherlv_2= 'duree' ( (lv_duree_3_0= RULE_INT ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ) )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:397:1: ( (otherlv_0= 'probabilite' ( (lv_probabilite_1_0= RULE_INT ) ) )? (otherlv_2= 'duree' ( (lv_duree_3_0= RULE_INT ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? )
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:397:1: ( (otherlv_0= 'probabilite' ( (lv_probabilite_1_0= RULE_INT ) ) )? (otherlv_2= 'duree' ( (lv_duree_3_0= RULE_INT ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? )
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:397:2: (otherlv_0= 'probabilite' ( (lv_probabilite_1_0= RULE_INT ) ) )? (otherlv_2= 'duree' ( (lv_duree_3_0= RULE_INT ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            {
            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:397:2: (otherlv_0= 'probabilite' ( (lv_probabilite_1_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:397:4: otherlv_0= 'probabilite' ( (lv_probabilite_1_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleVideoPropriete875); 

                        	newLeafNode(otherlv_0, grammarAccess.getVideoProprieteAccess().getProbabiliteKeyword_0_0());
                        
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:401:1: ( (lv_probabilite_1_0= RULE_INT ) )
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:402:1: (lv_probabilite_1_0= RULE_INT )
                    {
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:402:1: (lv_probabilite_1_0= RULE_INT )
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:403:3: lv_probabilite_1_0= RULE_INT
                    {
                    lv_probabilite_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVideoPropriete892); 

                    			newLeafNode(lv_probabilite_1_0, grammarAccess.getVideoProprieteAccess().getProbabiliteINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoProprieteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"probabilite",
                            		lv_probabilite_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:419:4: (otherlv_2= 'duree' ( (lv_duree_3_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:419:6: otherlv_2= 'duree' ( (lv_duree_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleVideoPropriete912); 

                        	newLeafNode(otherlv_2, grammarAccess.getVideoProprieteAccess().getDureeKeyword_1_0());
                        
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:423:1: ( (lv_duree_3_0= RULE_INT ) )
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:424:1: (lv_duree_3_0= RULE_INT )
                    {
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:424:1: (lv_duree_3_0= RULE_INT )
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:425:3: lv_duree_3_0= RULE_INT
                    {
                    lv_duree_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVideoPropriete929); 

                    			newLeafNode(lv_duree_3_0, grammarAccess.getVideoProprieteAccess().getDureeINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoProprieteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duree",
                            		lv_duree_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:441:4: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:441:6: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleVideoPropriete949); 

                        	newLeafNode(otherlv_4, grammarAccess.getVideoProprieteAccess().getDescriptionKeyword_2_0());
                        
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:445:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:446:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:446:1: (lv_description_5_0= RULE_STRING )
                    // ../org.xtext.videogen/src-gen/org/xtext/parser/antlr/internal/InternalVideogen.g:447:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideoPropriete966); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getVideoProprieteAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoProprieteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleVideoPropriete"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGenModel_in_entryRuleVideoGenModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGenModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVideoGenModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_ruleVideoGenModel133 = new BitSet(new long[]{0x000000000001C020L});
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
    public static final BitSet FOLLOW_ruleVideo_in_ruleMandatoryVideoSeq414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalVideoSeq_in_entryRuleOptionalVideoSeq450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalVideoSeq460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOptionalVideoSeq497 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVideo_in_ruleOptionalVideoSeq518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternativeVideoSeq_in_entryRuleAlternativeVideoSeq554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeVideoSeq564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAlternativeVideoSeq601 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVideo_in_ruleAlternativeVideoSeq622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideo_in_entryRuleVideo658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideo668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVideo705 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVideo722 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideo745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_ruleVideo761 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_ruleVideoPropriete_in_ruleVideo781 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_ruleVideo792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoPropriete_in_entryRuleVideoPropriete827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoPropriete837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleVideoPropriete875 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVideoPropriete892 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleVideoPropriete912 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVideoPropriete929 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleVideoPropriete949 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideoPropriete966 = new BitSet(new long[]{0x0000000000000002L});

}