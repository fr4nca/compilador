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
		TK_class=1, LCURLY=2, RCURLY=3, IF=4, NUMBER=5, OPARIT=6, OPREL=7, OPLOGIC=8, 
		CHAR=9, STRING=10, ID=11, WS_=12, SL_COMMENT=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "IF", "NUMBER", "OPARIT", "OPREL", "OPLOGIC", "CHAR", 
		"STRING", "ID", "ESC", "ASCII", "WS_", "SL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", "'if'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "IF", "NUMBER", "OPARIT", "OPREL", 
		"OPLOGIC", "CHAR", "STRING", "ID", "WS_", "SL_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\6\5(\n\5\r\5\16\5)\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\79\n\7\3\b\3\b\3\b\3\b\5\b?\n\b\3\t\3\t\3\t\5\tD\n\t\3\t\3\t\3"+
		"\n\3\n\3\n\7\nK\n\n\f\n\16\nN\13\n\3\n\3\n\3\13\3\13\7\13T\n\13\f\13\16"+
		"\13W\13\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\7\17f\n\17\f\17\16\17i\13\17\3\17\3\17\3\17\3\17\2\2\20\3\4\5\5\7\6\t"+
		"\7\13\b\r\t\17\n\21\13\23\f\25\r\27\2\31\2\33\16\35\17\3\2\13\3\2\62;"+
		"\6\2\'\',-//\61\61\4\2>>@@\5\2C\\aac|\6\2\62;C\\aac|\7\2$$))^^ppvv\6\2"+
		"\"#%(*\\`\u0080\4\2\f\f\"\"\3\2\f\fw\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2"+
		"\2\7#\3\2\2\2\t\'\3\2\2\2\13+\3\2\2\2\r8\3\2\2\2\17>\3\2\2\2\21@\3\2\2"+
		"\2\23G\3\2\2\2\25Q\3\2\2\2\27X\3\2\2\2\31[\3\2\2\2\33]\3\2\2\2\35a\3\2"+
		"\2\2\37 \7}\2\2 \4\3\2\2\2!\"\7\177\2\2\"\6\3\2\2\2#$\7k\2\2$%\7h\2\2"+
		"%\b\3\2\2\2&(\t\2\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\n\3\2"+
		"\2\2+,\t\3\2\2,\f\3\2\2\2-9\t\4\2\2./\7-\2\2/9\7?\2\2\60\61\7>\2\2\61"+
		"9\7?\2\2\62\63\7@\2\2\639\7?\2\2\64\65\7?\2\2\659\7?\2\2\66\67\7#\2\2"+
		"\679\7?\2\28-\3\2\2\28.\3\2\2\28\60\3\2\2\28\62\3\2\2\28\64\3\2\2\28\66"+
		"\3\2\2\29\16\3\2\2\2:;\7(\2\2;?\7(\2\2<=\7~\2\2=?\7~\2\2>:\3\2\2\2><\3"+
		"\2\2\2?\20\3\2\2\2@C\7)\2\2AD\5\27\f\2BD\5\31\r\2CA\3\2\2\2CB\3\2\2\2"+
		"DE\3\2\2\2EF\7)\2\2F\22\3\2\2\2GL\7$\2\2HK\5\27\f\2IK\5\31\r\2JH\3\2\2"+
		"\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7$\2"+
		"\2P\24\3\2\2\2QU\t\5\2\2RT\t\6\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2V\26\3\2\2\2WU\3\2\2\2XY\7^\2\2YZ\t\7\2\2Z\30\3\2\2\2[\\\t\b\2\2\\"+
		"\32\3\2\2\2]^\t\t\2\2^_\3\2\2\2_`\b\16\2\2`\34\3\2\2\2ab\7\61\2\2bc\7"+
		"\61\2\2cg\3\2\2\2df\n\n\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj"+
		"\3\2\2\2ig\3\2\2\2jk\7\f\2\2kl\3\2\2\2lm\b\17\2\2m\36\3\2\2\2\13\2)8>"+
		"CJLUg\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}