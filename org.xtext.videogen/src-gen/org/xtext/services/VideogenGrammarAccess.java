/*
 * generated by Xtext
 */
package org.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class VideogenGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class VideoGenModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VideoGenModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVideoGenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cVariante_videosAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVariante_videosVarianteVideoParserRuleCall_2_0 = (RuleCall)cVariante_videosAssignment_2.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		/// *
		// * VideoGenModel contiendra toute la syntaxe
		// * / VideoGenModel:
		//	"VideoGen" LEFT_BRACKET variante_videos+=VarianteVideo* RIGHT_BRACKET;
		@Override public ParserRule getRule() { return rule; }

		//"VideoGen" LEFT_BRACKET variante_videos+=VarianteVideo* RIGHT_BRACKET
		public Group getGroup() { return cGroup; }

		//"VideoGen"
		public Keyword getVideoGenKeyword_0() { return cVideoGenKeyword_0; }

		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_1() { return cLEFT_BRACKETTerminalRuleCall_1; }

		//variante_videos+=VarianteVideo*
		public Assignment getVariante_videosAssignment_2() { return cVariante_videosAssignment_2; }

		//VarianteVideo
		public RuleCall getVariante_videosVarianteVideoParserRuleCall_2_0() { return cVariante_videosVarianteVideoParserRuleCall_2_0; }

		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_3() { return cRIGHT_BRACKETTerminalRuleCall_3; }
	}

	public class VarianteVideoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VarianteVideo");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMandatoryVideoSeqParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOptionalVideoSeqParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAlternativeVideoSeqParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		/// ** 
		// * une variante de vidéo est composée d'une video obligatoire (mandatory) 
		// * puis de vidéos optionnal et d'alternatives
		// * / VarianteVideo:
		//	MandatoryVideoSeq | OptionalVideoSeq | AlternativeVideoSeq;
		@Override public ParserRule getRule() { return rule; }

		//MandatoryVideoSeq | OptionalVideoSeq | AlternativeVideoSeq
		public Alternatives getAlternatives() { return cAlternatives; }

		//MandatoryVideoSeq
		public RuleCall getMandatoryVideoSeqParserRuleCall_0() { return cMandatoryVideoSeqParserRuleCall_0; }

		//OptionalVideoSeq
		public RuleCall getOptionalVideoSeqParserRuleCall_1() { return cOptionalVideoSeqParserRuleCall_1; }

		//AlternativeVideoSeq
		public RuleCall getAlternativeVideoSeqParserRuleCall_2() { return cAlternativeVideoSeqParserRuleCall_2; }
	}

	public class MandatoryVideoSeqElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MandatoryVideoSeq");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMandatoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVideoAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVideoVideoParserRuleCall_1_0 = (RuleCall)cVideoAssignment_1.eContents().get(0);
		
		//MandatoryVideoSeq:
		//	"mandatory" video=Video;
		@Override public ParserRule getRule() { return rule; }

		//"mandatory" video=Video
		public Group getGroup() { return cGroup; }

		//"mandatory"
		public Keyword getMandatoryKeyword_0() { return cMandatoryKeyword_0; }

		//video=Video
		public Assignment getVideoAssignment_1() { return cVideoAssignment_1; }

		//Video
		public RuleCall getVideoVideoParserRuleCall_1_0() { return cVideoVideoParserRuleCall_1_0; }
	}

	public class OptionalVideoSeqElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OptionalVideoSeq");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOptionalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVideoAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVideoVideoParserRuleCall_1_0 = (RuleCall)cVideoAssignment_1.eContents().get(0);
		
		//OptionalVideoSeq:
		//	"optional" video=Video;
		@Override public ParserRule getRule() { return rule; }

		//"optional" video=Video
		public Group getGroup() { return cGroup; }

		//"optional"
		public Keyword getOptionalKeyword_0() { return cOptionalKeyword_0; }

		//video=Video
		public Assignment getVideoAssignment_1() { return cVideoAssignment_1; }

		//Video
		public RuleCall getVideoVideoParserRuleCall_1_0() { return cVideoVideoParserRuleCall_1_0; }
	}

	public class AlternativeVideoSeqElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AlternativeVideoSeq");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAlternativeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVideoAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVideoVideoAParserRuleCall_1_0 = (RuleCall)cVideoAssignment_1.eContents().get(0);
		
		//AlternativeVideoSeq:
		//	"alternative" video=VideoA;
		@Override public ParserRule getRule() { return rule; }

		//"alternative" video=VideoA
		public Group getGroup() { return cGroup; }

		//"alternative"
		public Keyword getAlternativeKeyword_0() { return cAlternativeKeyword_0; }

		//video=VideoA
		public Assignment getVideoAssignment_1() { return cVideoAssignment_1; }

		//VideoA
		public RuleCall getVideoVideoAParserRuleCall_1_0() { return cVideoVideoAParserRuleCall_1_0; }
	}

	public class VideoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Video");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVideoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVideoidAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVideoidIDTerminalRuleCall_1_0 = (RuleCall)cVideoidAssignment_1.eContents().get(0);
		private final Assignment cCheminAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCheminSTRINGTerminalRuleCall_2_0 = (RuleCall)cCheminAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Assignment cProprieteAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cProprieteVideoProprieteParserRuleCall_3_1_0 = (RuleCall)cProprieteAssignment_3_1.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_3_2 = (RuleCall)cGroup_3.eContents().get(2);
		
		/// **
		// * La vidéo à un ID et son chemin, propriété : Une description, 
		// * sa durée, sa probabilité d'apparition
		// * / Video:
		//	"video" videoid=ID? chemin=STRING (LEFT_BRACKET propriete=VideoPropriete RIGHT_BRACKET)?;
		@Override public ParserRule getRule() { return rule; }

		//"video" videoid=ID? chemin=STRING (LEFT_BRACKET propriete=VideoPropriete RIGHT_BRACKET)?
		public Group getGroup() { return cGroup; }

		//"video"
		public Keyword getVideoKeyword_0() { return cVideoKeyword_0; }

		//videoid=ID?
		public Assignment getVideoidAssignment_1() { return cVideoidAssignment_1; }

		//ID
		public RuleCall getVideoidIDTerminalRuleCall_1_0() { return cVideoidIDTerminalRuleCall_1_0; }

		//chemin=STRING
		public Assignment getCheminAssignment_2() { return cCheminAssignment_2; }

		//STRING
		public RuleCall getCheminSTRINGTerminalRuleCall_2_0() { return cCheminSTRINGTerminalRuleCall_2_0; }

		//(LEFT_BRACKET propriete=VideoPropriete RIGHT_BRACKET)?
		public Group getGroup_3() { return cGroup_3; }

		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_3_0() { return cLEFT_BRACKETTerminalRuleCall_3_0; }

		//propriete=VideoPropriete
		public Assignment getProprieteAssignment_3_1() { return cProprieteAssignment_3_1; }

		//VideoPropriete
		public RuleCall getProprieteVideoProprieteParserRuleCall_3_1_0() { return cProprieteVideoProprieteParserRuleCall_3_1_0; }

		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_3_2() { return cRIGHT_BRACKETTerminalRuleCall_3_2; }
	}

	public class VideoAElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VideoA");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVideoidAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVideoidIDTerminalRuleCall_0_0 = (RuleCall)cVideoidAssignment_0.eContents().get(0);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cVideoKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVideoidAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVideoidIDTerminalRuleCall_2_1_0 = (RuleCall)cVideoidAssignment_2_1.eContents().get(0);
		private final Assignment cCheminAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cCheminSTRINGTerminalRuleCall_2_2_0 = (RuleCall)cCheminAssignment_2_2.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		/// **
		// * Alternatives fonctionne différement des autres, pas de chaine de caractères
		// * / VideoA:
		//	videoid=ID? LEFT_BRACKET ("video" videoid=ID? chemin=STRING)* RIGHT_BRACKET;
		@Override public ParserRule getRule() { return rule; }

		//videoid=ID? LEFT_BRACKET ("video" videoid=ID? chemin=STRING)* RIGHT_BRACKET
		public Group getGroup() { return cGroup; }

		//videoid=ID?
		public Assignment getVideoidAssignment_0() { return cVideoidAssignment_0; }

		//ID
		public RuleCall getVideoidIDTerminalRuleCall_0_0() { return cVideoidIDTerminalRuleCall_0_0; }

		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_1() { return cLEFT_BRACKETTerminalRuleCall_1; }

		//("video" videoid=ID? chemin=STRING)*
		public Group getGroup_2() { return cGroup_2; }

		//"video"
		public Keyword getVideoKeyword_2_0() { return cVideoKeyword_2_0; }

		//videoid=ID?
		public Assignment getVideoidAssignment_2_1() { return cVideoidAssignment_2_1; }

		//ID
		public RuleCall getVideoidIDTerminalRuleCall_2_1_0() { return cVideoidIDTerminalRuleCall_2_1_0; }

		//chemin=STRING
		public Assignment getCheminAssignment_2_2() { return cCheminAssignment_2_2; }

		//STRING
		public RuleCall getCheminSTRINGTerminalRuleCall_2_2_0() { return cCheminSTRINGTerminalRuleCall_2_2_0; }

		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_3() { return cRIGHT_BRACKETTerminalRuleCall_3; }
	}

	public class VideoProprieteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VideoPropriete");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cProbabiliteKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cProbabiliteAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cProbabiliteINTTerminalRuleCall_0_1_0 = (RuleCall)cProbabiliteAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cDureeKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cDureeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cDureeINTTerminalRuleCall_1_1_0 = (RuleCall)cDureeAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		
		/// **
		// * la description d'une séquence vidéo est composé d'une probabilite, une duree
		// * et d'une chaine de caractères
		// * / VideoPropriete:
		//	("probabilite" probabilite=INT)? ("duree" duree=INT)? ("description" description=STRING)?;
		@Override public ParserRule getRule() { return rule; }

		//("probabilite" probabilite=INT)? ("duree" duree=INT)? ("description" description=STRING)?
		public Group getGroup() { return cGroup; }

		//("probabilite" probabilite=INT)?
		public Group getGroup_0() { return cGroup_0; }

		//"probabilite"
		public Keyword getProbabiliteKeyword_0_0() { return cProbabiliteKeyword_0_0; }

		//probabilite=INT
		public Assignment getProbabiliteAssignment_0_1() { return cProbabiliteAssignment_0_1; }

		//INT
		public RuleCall getProbabiliteINTTerminalRuleCall_0_1_0() { return cProbabiliteINTTerminalRuleCall_0_1_0; }

		//("duree" duree=INT)?
		public Group getGroup_1() { return cGroup_1; }

		//"duree"
		public Keyword getDureeKeyword_1_0() { return cDureeKeyword_1_0; }

		//duree=INT
		public Assignment getDureeAssignment_1_1() { return cDureeAssignment_1_1; }

		//INT
		public RuleCall getDureeINTTerminalRuleCall_1_1_0() { return cDureeINTTerminalRuleCall_1_1_0; }

		//("description" description=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//"description"
		public Keyword getDescriptionKeyword_2_0() { return cDescriptionKeyword_2_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_2_1_0() { return cDescriptionSTRINGTerminalRuleCall_2_1_0; }
	}
	
	
	private final VideoGenModelElements pVideoGenModel;
	private final VarianteVideoElements pVarianteVideo;
	private final MandatoryVideoSeqElements pMandatoryVideoSeq;
	private final OptionalVideoSeqElements pOptionalVideoSeq;
	private final AlternativeVideoSeqElements pAlternativeVideoSeq;
	private final VideoElements pVideo;
	private final VideoAElements pVideoA;
	private final VideoProprieteElements pVideoPropriete;
	private final TerminalRule tLEFT_BRACKET;
	private final TerminalRule tRIGHT_BRACKET;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public VideogenGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVideoGenModel = new VideoGenModelElements();
		this.pVarianteVideo = new VarianteVideoElements();
		this.pMandatoryVideoSeq = new MandatoryVideoSeqElements();
		this.pOptionalVideoSeq = new OptionalVideoSeqElements();
		this.pAlternativeVideoSeq = new AlternativeVideoSeqElements();
		this.pVideo = new VideoElements();
		this.pVideoA = new VideoAElements();
		this.pVideoPropriete = new VideoProprieteElements();
		this.tLEFT_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LEFT_BRACKET");
		this.tRIGHT_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "RIGHT_BRACKET");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.Videogen".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	/// *
	// * VideoGenModel contiendra toute la syntaxe
	// * / VideoGenModel:
	//	"VideoGen" LEFT_BRACKET variante_videos+=VarianteVideo* RIGHT_BRACKET;
	public VideoGenModelElements getVideoGenModelAccess() {
		return pVideoGenModel;
	}
	
	public ParserRule getVideoGenModelRule() {
		return getVideoGenModelAccess().getRule();
	}

	/// ** 
	// * une variante de vidéo est composée d'une video obligatoire (mandatory) 
	// * puis de vidéos optionnal et d'alternatives
	// * / VarianteVideo:
	//	MandatoryVideoSeq | OptionalVideoSeq | AlternativeVideoSeq;
	public VarianteVideoElements getVarianteVideoAccess() {
		return pVarianteVideo;
	}
	
	public ParserRule getVarianteVideoRule() {
		return getVarianteVideoAccess().getRule();
	}

	//MandatoryVideoSeq:
	//	"mandatory" video=Video;
	public MandatoryVideoSeqElements getMandatoryVideoSeqAccess() {
		return pMandatoryVideoSeq;
	}
	
	public ParserRule getMandatoryVideoSeqRule() {
		return getMandatoryVideoSeqAccess().getRule();
	}

	//OptionalVideoSeq:
	//	"optional" video=Video;
	public OptionalVideoSeqElements getOptionalVideoSeqAccess() {
		return pOptionalVideoSeq;
	}
	
	public ParserRule getOptionalVideoSeqRule() {
		return getOptionalVideoSeqAccess().getRule();
	}

	//AlternativeVideoSeq:
	//	"alternative" video=VideoA;
	public AlternativeVideoSeqElements getAlternativeVideoSeqAccess() {
		return pAlternativeVideoSeq;
	}
	
	public ParserRule getAlternativeVideoSeqRule() {
		return getAlternativeVideoSeqAccess().getRule();
	}

	/// **
	// * La vidéo à un ID et son chemin, propriété : Une description, 
	// * sa durée, sa probabilité d'apparition
	// * / Video:
	//	"video" videoid=ID? chemin=STRING (LEFT_BRACKET propriete=VideoPropriete RIGHT_BRACKET)?;
	public VideoElements getVideoAccess() {
		return pVideo;
	}
	
	public ParserRule getVideoRule() {
		return getVideoAccess().getRule();
	}

	/// **
	// * Alternatives fonctionne différement des autres, pas de chaine de caractères
	// * / VideoA:
	//	videoid=ID? LEFT_BRACKET ("video" videoid=ID? chemin=STRING)* RIGHT_BRACKET;
	public VideoAElements getVideoAAccess() {
		return pVideoA;
	}
	
	public ParserRule getVideoARule() {
		return getVideoAAccess().getRule();
	}

	/// **
	// * la description d'une séquence vidéo est composé d'une probabilite, une duree
	// * et d'une chaine de caractères
	// * / VideoPropriete:
	//	("probabilite" probabilite=INT)? ("duree" duree=INT)? ("description" description=STRING)?;
	public VideoProprieteElements getVideoProprieteAccess() {
		return pVideoPropriete;
	}
	
	public ParserRule getVideoProprieteRule() {
		return getVideoProprieteAccess().getRule();
	}

	//terminal LEFT_BRACKET:
	//	"{";
	public TerminalRule getLEFT_BRACKETRule() {
		return tLEFT_BRACKET;
	} 

	//terminal RIGHT_BRACKET:
	//	"}";
	public TerminalRule getRIGHT_BRACKETRule() {
		return tRIGHT_BRACKET;
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
