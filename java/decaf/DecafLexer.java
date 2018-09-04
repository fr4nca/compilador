// Generated from /home/thaygneel/Documentos/compiladores/lab02/provided/skeleton/src/decaf/DecafLexer.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_class=1, LCURLY=2, RCURLY=3, LCOCHETE=4, RCOCHETE=5, LPARENTESE=6, 
		RPARENTESE=7, PONTUACAO=8, IF=9, ELSE=10, BOOLEANVALOR=11, BOOLEAN=12, 
		CAlLOUT=13, CLASS=14, INT=15, RETURN=16, VOID=17, FOR=18, BREAK=19, CONTINUE=20, 
		HEXINIT=21, HEX=22, NUMBER=23, OPARIT=24, OPREL=25, OPLOGIC=26, CHAR=27, 
		ID=28, STRING=29, WS_=30, SL_COMMENT=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "LCOCHETE", "RCOCHETE", "LPARENTESE", "RPARENTESE", 
		"PONTUACAO", "IF", "ELSE", "BOOLEANVALOR", "BOOLEAN", "CAlLOUT", "CLASS", 
		"INT", "RETURN", "VOID", "FOR", "BREAK", "CONTINUE", "HEXINIT", "HEX", 
		"NUMBER", "OPARIT", "OPREL", "OPLOGIC", "CHAR", "ID", "STRING", "WS_", 
		"SL_COMMENT", "ESC", "ASCII"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", null, "'if'", "'else'", 
		null, "'boolean'", "'callout'", "'class'", "'int'", "'return'", "'void'", 
		"'for'", "'break'", "'continue'", "'0x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "LCOCHETE", "RCOCHETE", "LPARENTESE", 
		"RPARENTESE", "PONTUACAO", "IF", "ELSE", "BOOLEANVALOR", "BOOLEAN", "CAlLOUT", 
		"CLASS", "INT", "RETURN", "VOID", "FOR", "BREAK", "CONTINUE", "HEXINIT", 
		"HEX", "NUMBER", "OPARIT", "OPREL", "OPLOGIC", "CHAR", "ID", "STRING", 
		"WS_", "SL_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecafLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00ef\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13c\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\6\26\u00a3\n\26\r\26\16\26\u00a4\3\27\6\27\u00a8"+
		"\n\27\r\27\16\27\u00a9\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u00ba\n\31\3\32\3\32\3\32\3\32\5\32\u00c0"+
		"\n\32\3\33\3\33\3\33\5\33\u00c5\n\33\3\33\3\33\3\34\3\34\7\34\u00cb\n"+
		"\34\f\34\16\34\u00ce\13\34\3\35\3\35\3\35\7\35\u00d3\n\35\f\35\16\35\u00d6"+
		"\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00e2\n"+
		"\37\f\37\16\37\u00e5\13\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\2\2\"\3"+
		"\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r\27\16\31\17\33\20\35\21\37"+
		"\22!\23#\24%\25\'\26)\27+\30-\31/\32\61\33\63\34\65\35\67\369\37; =!?"+
		"\2A\2\3\2\r\4\2..==\5\2\62;CHch\3\2\62;\6\2\'\',-//\61\61\4\2>>@@\5\2"+
		"C\\aac|\6\2\62;C\\aac|\4\2\13\f\"\"\3\2\f\f\7\2$$))^^ppvv\6\2\"#%(*\\"+
		"`\u0080\u00fb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2"+
		"\2\13K\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23T\3\2\2\2\25b\3\2"+
		"\2\2\27d\3\2\2\2\31l\3\2\2\2\33t\3\2\2\2\35z\3\2\2\2\37~\3\2\2\2!\u0085"+
		"\3\2\2\2#\u008a\3\2\2\2%\u008e\3\2\2\2\'\u0094\3\2\2\2)\u009d\3\2\2\2"+
		"+\u00a0\3\2\2\2-\u00a7\3\2\2\2/\u00ab\3\2\2\2\61\u00b9\3\2\2\2\63\u00bf"+
		"\3\2\2\2\65\u00c1\3\2\2\2\67\u00c8\3\2\2\29\u00cf\3\2\2\2;\u00d9\3\2\2"+
		"\2=\u00dd\3\2\2\2?\u00ea\3\2\2\2A\u00ed\3\2\2\2CD\7}\2\2D\4\3\2\2\2EF"+
		"\7\177\2\2F\6\3\2\2\2GH\7]\2\2H\b\3\2\2\2IJ\7_\2\2J\n\3\2\2\2KL\7*\2\2"+
		"L\f\3\2\2\2MN\7+\2\2N\16\3\2\2\2OP\t\2\2\2P\20\3\2\2\2QR\7k\2\2RS\7h\2"+
		"\2S\22\3\2\2\2TU\7g\2\2UV\7n\2\2VW\7u\2\2WX\7g\2\2X\24\3\2\2\2YZ\7h\2"+
		"\2Z[\7c\2\2[\\\7n\2\2\\]\7u\2\2]c\7g\2\2^_\7v\2\2_`\7t\2\2`a\7w\2\2ac"+
		"\7g\2\2bY\3\2\2\2b^\3\2\2\2c\26\3\2\2\2de\7d\2\2ef\7q\2\2fg\7q\2\2gh\7"+
		"n\2\2hi\7g\2\2ij\7c\2\2jk\7p\2\2k\30\3\2\2\2lm\7e\2\2mn\7c\2\2no\7n\2"+
		"\2op\7n\2\2pq\7q\2\2qr\7w\2\2rs\7v\2\2s\32\3\2\2\2tu\7e\2\2uv\7n\2\2v"+
		"w\7c\2\2wx\7u\2\2xy\7u\2\2y\34\3\2\2\2z{\7k\2\2{|\7p\2\2|}\7v\2\2}\36"+
		"\3\2\2\2~\177\7t\2\2\177\u0080\7g\2\2\u0080\u0081\7v\2\2\u0081\u0082\7"+
		"w\2\2\u0082\u0083\7t\2\2\u0083\u0084\7p\2\2\u0084 \3\2\2\2\u0085\u0086"+
		"\7x\2\2\u0086\u0087\7q\2\2\u0087\u0088\7k\2\2\u0088\u0089\7f\2\2\u0089"+
		"\"\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c\7q\2\2\u008c\u008d\7t\2\2\u008d"+
		"$\3\2\2\2\u008e\u008f\7d\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7m\2\2\u0093&\3\2\2\2\u0094\u0095\7e\2\2\u0095"+
		"\u0096\7q\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2\u0098\u0099\7k\2\2"+
		"\u0099\u009a\7p\2\2\u009a\u009b\7w\2\2\u009b\u009c\7g\2\2\u009c(\3\2\2"+
		"\2\u009d\u009e\7\62\2\2\u009e\u009f\7z\2\2\u009f*\3\2\2\2\u00a0\u00a2"+
		"\5)\25\2\u00a1\u00a3\t\3\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5,\3\2\2\2\u00a6\u00a8\t\4\2\2"+
		"\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa.\3\2\2\2\u00ab\u00ac\t\5\2\2\u00ac\60\3\2\2\2\u00ad\u00ba"+
		"\t\6\2\2\u00ae\u00af\7-\2\2\u00af\u00ba\7?\2\2\u00b0\u00b1\7>\2\2\u00b1"+
		"\u00ba\7?\2\2\u00b2\u00b3\7@\2\2\u00b3\u00ba\7?\2\2\u00b4\u00b5\7?\2\2"+
		"\u00b5\u00ba\7?\2\2\u00b6\u00b7\7#\2\2\u00b7\u00ba\7?\2\2\u00b8\u00ba"+
		"\7?\2\2\u00b9\u00ad\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9"+
		"\u00b2\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\62\3\2\2\2\u00bb\u00bc\7(\2\2\u00bc\u00c0\7(\2\2\u00bd\u00be"+
		"\7~\2\2\u00be\u00c0\7~\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\64\3\2\2\2\u00c1\u00c4\7)\2\2\u00c2\u00c5\5? \2\u00c3\u00c5\5A!\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7)"+
		"\2\2\u00c7\66\3\2\2\2\u00c8\u00cc\t\7\2\2\u00c9\u00cb\t\b\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"8\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d4\7$\2\2\u00d0\u00d3\5? \2\u00d1"+
		"\u00d3\5A!\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8:\3\2\2\2\u00d9\u00da\t\t\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\b\36\2\2\u00dc<\3\2\2\2\u00dd\u00de\7\61\2\2\u00de"+
		"\u00df\7\61\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\n\n\2\2\u00e1\u00e0\3"+
		"\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\f\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e9\b\37\2\2\u00e9>\3\2\2\2\u00ea\u00eb\7^\2\2\u00eb\u00ec"+
		"\t\13\2\2\u00ec@\3\2\2\2\u00ed\u00ee\t\f\2\2\u00eeB\3\2\2\2\r\2b\u00a4"+
		"\u00a9\u00b9\u00bf\u00c4\u00cc\u00d2\u00d4\u00e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}