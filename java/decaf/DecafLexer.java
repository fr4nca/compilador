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
		TK_class=1, LCURLY=2, RCURLY=3, IF=4, CHAR=5, STRING=6, ID=7, WS_=8, SL_COMMENT=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "IF", "CHAR", "STRING", "ID", "ESC", "ASCII", "WS_", 
		"SL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", "'if'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "IF", "CHAR", "STRING", "ID", "WS_", 
		"SL_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13L\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\5\5\"\n\5\3\5\3\5\3\6\3\6"+
		"\3\6\7\6)\n\6\f\6\16\6,\13\6\3\6\3\6\3\7\3\7\7\7\62\n\7\f\7\16\7\65\13"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13D\n\13"+
		"\f\13\16\13G\13\13\3\13\3\13\3\13\3\13\2\2\f\3\4\5\5\7\6\t\7\13\b\r\t"+
		"\17\2\21\2\23\n\25\13\3\2\b\3\2C|\6\2\62;C\\aac|\7\2$$))^^ppvv\6\2\"#"+
		"%(*\\`\u0080\4\2\f\f\"\"\3\2\f\fN\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3"+
		"\2\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t\36\3\2\2\2\13%\3\2\2\2\r/\3\2\2\2\17"+
		"\66\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25?\3\2\2\2\27\30\7}\2\2\30\4\3\2"+
		"\2\2\31\32\7\177\2\2\32\6\3\2\2\2\33\34\7k\2\2\34\35\7h\2\2\35\b\3\2\2"+
		"\2\36!\7)\2\2\37\"\5\17\b\2 \"\5\21\t\2!\37\3\2\2\2! \3\2\2\2\"#\3\2\2"+
		"\2#$\7)\2\2$\n\3\2\2\2%*\7$\2\2&)\5\17\b\2\')\5\21\t\2(&\3\2\2\2(\'\3"+
		"\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7$\2\2.\f\3"+
		"\2\2\2/\63\t\2\2\2\60\62\t\3\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2"+
		"\2\2\63\64\3\2\2\2\64\16\3\2\2\2\65\63\3\2\2\2\66\67\7^\2\2\678\t\4\2"+
		"\28\20\3\2\2\29:\t\5\2\2:\22\3\2\2\2;<\t\6\2\2<=\3\2\2\2=>\b\n\2\2>\24"+
		"\3\2\2\2?@\7\61\2\2@A\7\61\2\2AE\3\2\2\2BD\n\7\2\2CB\3\2\2\2DG\3\2\2\2"+
		"EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\f\2\2IJ\3\2\2\2JK\b\13\2"+
		"\2K\26\3\2\2\2\b\2!(*\63E\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}