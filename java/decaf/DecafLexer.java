// Generated from /d/Faculdade/6/Compiladores/lab02/provided/compilador/src/decaf/DecafLexer.g4 by ANTLR 4.5.3

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
		TK_class=1, LCURLY=2, RCURLY=3, LCOLCHETE=4, RCOLCHETE=5, LPARENTESE=6, 
		RPARENTESE=7, VIRGULA=8, PONTOVIRGULA=9, IF=10, ELSE=11, BOOLEANVALOR=12, 
		BOOLEAN=13, CALLOUT=14, CLASS=15, PROGRAM=16, INT=17, RETURN=18, VOID=19, 
		FOR=20, BREAK=21, CONTINUE=22, HEXINIT=23, HEX=24, NUMBER=25, MENOS=26, 
		OPARIT=27, OPREL=28, OPEQ=29, OPCOND=30, EXCLAMACAO=31, OPIGUAL=32, OPMAISIGUAL=33, 
		OPMENOSIGUAL=34, CHAR=35, ID=36, STRING=37, WS_=38, SL_COMMENT=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "LCOLCHETE", "RCOLCHETE", "LPARENTESE", "RPARENTESE", 
		"VIRGULA", "PONTOVIRGULA", "IF", "ELSE", "BOOLEANVALOR", "BOOLEAN", "CALLOUT", 
		"CLASS", "PROGRAM", "INT", "RETURN", "VOID", "FOR", "BREAK", "CONTINUE", 
		"HEXINIT", "HEX", "NUMBER", "MENOS", "OPARIT", "OPREL", "OPEQ", "OPCOND", 
		"EXCLAMACAO", "OPIGUAL", "OPMAISIGUAL", "OPMENOSIGUAL", "CHAR", "ID", 
		"STRING", "WS_", "SL_COMMENT", "ESC", "ASCII"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", null, "';'", "'if'", 
		"'else'", null, "'boolean'", "'callout'", "'class'", "'Program'", "'int'", 
		"'return'", "'void'", "'for'", "'break'", "'continue'", "'0x'", null, 
		null, "'-'", null, null, null, null, "'!'", "'='", "'+='", "'-='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "LCOLCHETE", "RCOLCHETE", "LPARENTESE", 
		"RPARENTESE", "VIRGULA", "PONTOVIRGULA", "IF", "ELSE", "BOOLEANVALOR", 
		"BOOLEAN", "CALLOUT", "CLASS", "PROGRAM", "INT", "RETURN", "VOID", "FOR", 
		"BREAK", "CONTINUE", "HEXINIT", "HEX", "NUMBER", "MENOS", "OPARIT", "OPREL", 
		"OPEQ", "OPCOND", "EXCLAMACAO", "OPIGUAL", "OPMAISIGUAL", "OPMENOSIGUAL", 
		"CHAR", "ID", "STRING", "WS_", "SL_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fu\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\6\30\u00bd\n\30"+
		"\r\30\16\30\u00be\3\31\6\31\u00c2\n\31\r\31\16\31\u00c3\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u00cf\n\34\3\35\3\35\3\35\3\35\5\35"+
		"\u00d5\n\35\3\36\3\36\3\36\3\36\5\36\u00db\n\36\3\37\3\37\3 \3 \3!\3!"+
		"\3!\3\"\3\"\3\"\3#\3#\3#\5#\u00ea\n#\3#\3#\3$\3$\7$\u00f0\n$\f$\16$\u00f3"+
		"\13$\3%\3%\3%\7%\u00f8\n%\f%\16%\u00fb\13%\3%\3%\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\7\'\u0107\n\'\f\'\16\'\u010a\13\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3"+
		")\2\2*\3\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r\27\16\31\17\33\20"+
		"\35\21\37\22!\23#\24%\25\'\26)\27+\30-\31/\32\61\33\63\34\65\35\67\36"+
		"9\37; =!?\"A#C$E%G&I\'K(M)O\2Q\2\3\2\f\5\2\62;CHch\3\2\62;\6\2\'\',-/"+
		"/\61\61\4\2>>@@\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\f\"\"\3\2\f\f\7\2$$)"+
		")^^ppvv\6\2\"#%(*\\`\u0080\u011d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3S"+
		"\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3"+
		"\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25f\3\2\2\2\27t\3\2\2\2\31v\3\2\2\2\33"+
		"~\3\2\2\2\35\u0086\3\2\2\2\37\u008c\3\2\2\2!\u0094\3\2\2\2#\u0098\3\2"+
		"\2\2%\u009f\3\2\2\2\'\u00a4\3\2\2\2)\u00a8\3\2\2\2+\u00ae\3\2\2\2-\u00b7"+
		"\3\2\2\2/\u00ba\3\2\2\2\61\u00c1\3\2\2\2\63\u00c5\3\2\2\2\65\u00c7\3\2"+
		"\2\2\67\u00ce\3\2\2\29\u00d4\3\2\2\2;\u00da\3\2\2\2=\u00dc\3\2\2\2?\u00de"+
		"\3\2\2\2A\u00e0\3\2\2\2C\u00e3\3\2\2\2E\u00e6\3\2\2\2G\u00ed\3\2\2\2I"+
		"\u00f4\3\2\2\2K\u00fe\3\2\2\2M\u0102\3\2\2\2O\u010f\3\2\2\2Q\u0112\3\2"+
		"\2\2ST\7}\2\2T\4\3\2\2\2UV\7\177\2\2V\6\3\2\2\2WX\7]\2\2X\b\3\2\2\2YZ"+
		"\7_\2\2Z\n\3\2\2\2[\\\7*\2\2\\\f\3\2\2\2]^\7+\2\2^\16\3\2\2\2_`\7.\2\2"+
		"`\20\3\2\2\2ab\7=\2\2b\22\3\2\2\2cd\7k\2\2de\7h\2\2e\24\3\2\2\2fg\7g\2"+
		"\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\26\3\2\2\2kl\7h\2\2lm\7c\2\2mn\7n\2\2n"+
		"o\7u\2\2ou\7g\2\2pq\7v\2\2qr\7t\2\2rs\7w\2\2su\7g\2\2tk\3\2\2\2tp\3\2"+
		"\2\2u\30\3\2\2\2vw\7d\2\2wx\7q\2\2xy\7q\2\2yz\7n\2\2z{\7g\2\2{|\7c\2\2"+
		"|}\7p\2\2}\32\3\2\2\2~\177\7e\2\2\177\u0080\7c\2\2\u0080\u0081\7n\2\2"+
		"\u0081\u0082\7n\2\2\u0082\u0083\7q\2\2\u0083\u0084\7w\2\2\u0084\u0085"+
		"\7v\2\2\u0085\34\3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088\7n\2\2\u0088\u0089"+
		"\7c\2\2\u0089\u008a\7u\2\2\u008a\u008b\7u\2\2\u008b\36\3\2\2\2\u008c\u008d"+
		"\7R\2\2\u008d\u008e\7t\2\2\u008e\u008f\7q\2\2\u008f\u0090\7i\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u0092\7c\2\2\u0092\u0093\7o\2\2\u0093 \3\2\2\2\u0094"+
		"\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097\"\3\2\2\2\u0098"+
		"\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7v\2\2\u009b\u009c\7w\2\2"+
		"\u009c\u009d\7t\2\2\u009d\u009e\7p\2\2\u009e$\3\2\2\2\u009f\u00a0\7x\2"+
		"\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7f\2\2\u00a3&\3\2"+
		"\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7(\3"+
		"\2\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7m\2\2\u00ad*\3\2\2\2\u00ae\u00af\7e\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7k\2\2"+
		"\u00b3\u00b4\7p\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7g\2\2\u00b6,\3\2\2"+
		"\2\u00b7\u00b8\7\62\2\2\u00b8\u00b9\7z\2\2\u00b9.\3\2\2\2\u00ba\u00bc"+
		"\5-\27\2\u00bb\u00bd\t\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\60\3\2\2\2\u00c0\u00c2\t\3\2"+
		"\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\62\3\2\2\2\u00c5\u00c6\7/\2\2\u00c6\64\3\2\2\2\u00c7\u00c8"+
		"\t\4\2\2\u00c8\66\3\2\2\2\u00c9\u00cf\t\5\2\2\u00ca\u00cb\7>\2\2\u00cb"+
		"\u00cf\7?\2\2\u00cc\u00cd\7@\2\2\u00cd\u00cf\7?\2\2\u00ce\u00c9\3\2\2"+
		"\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf8\3\2\2\2\u00d0\u00d1"+
		"\7?\2\2\u00d1\u00d5\7?\2\2\u00d2\u00d3\7#\2\2\u00d3\u00d5\7?\2\2\u00d4"+
		"\u00d0\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5:\3\2\2\2\u00d6\u00d7\7(\2\2\u00d7"+
		"\u00db\7(\2\2\u00d8\u00d9\7~\2\2\u00d9\u00db\7~\2\2\u00da\u00d6\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00db<\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd>\3\2\2"+
		"\2\u00de\u00df\7?\2\2\u00df@\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1\u00e2\7"+
		"?\2\2\u00e2B\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\7?\2\2\u00e5D\3\2"+
		"\2\2\u00e6\u00e9\7)\2\2\u00e7\u00ea\5O(\2\u00e8\u00ea\5Q)\2\u00e9\u00e7"+
		"\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7)\2\2\u00ec"+
		"F\3\2\2\2\u00ed\u00f1\t\6\2\2\u00ee\u00f0\t\7\2\2\u00ef\u00ee\3\2\2\2"+
		"\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2H\3"+
		"\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f9\7$\2\2\u00f5\u00f8\5O(\2\u00f6"+
		"\u00f8\5Q)\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2"+
		"\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fd\7$\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\t\b\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\b&\2\2\u0101L\3\2\2\2\u0102\u0103\7\61\2\2\u0103"+
		"\u0104\7\61\2\2\u0104\u0108\3\2\2\2\u0105\u0107\n\t\2\2\u0106\u0105\3"+
		"\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7\f\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010e\b\'\2\2\u010eN\3\2\2\2\u010f\u0110\7^\2\2\u0110\u0111"+
		"\t\n\2\2\u0111P\3\2\2\2\u0112\u0113\t\13\2\2\u0113R\3\2\2\2\16\2t\u00be"+
		"\u00c3\u00ce\u00d4\u00da\u00e9\u00f1\u00f7\u00f9\u0108\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}