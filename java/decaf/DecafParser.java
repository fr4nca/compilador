// Generated from /d/Faculdade/6sem/Compiladores/lab02/provided/compilador/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_class=1, LCURLY=2, RCURLY=3, LCOLCHETE=4, RCOLCHETE=5, LPARENTESE=6, 
		RPARENTESE=7, VIRGULA=8, PONTOVIRGULA=9, IF=10, ELSE=11, BOOLEANVALOR=12, 
		BOOLEAN=13, CAlLOUT=14, CLASS=15, PROGRAM=16, INT=17, RETURN=18, VOID=19, 
		FOR=20, BREAK=21, CONTINUE=22, HEXINIT=23, HEX=24, NUMBER=25, OPARIT=26, 
		OPREL=27, OPLOGIC=28, CHAR=29, ID=30, STRING=31, WS_=32, SL_COMMENT=33;
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_type = 2, RULE_int_literal = 3;
	public static final String[] ruleNames = {
		"program", "field_decl", "type", "int_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", null, "';'", "'if'", 
		"'else'", null, "'boolean'", "'callout'", "'class'", "'Program'", "'int'", 
		"'return'", "'void'", "'for'", "'break'", "'continue'", "'0x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "LCOLCHETE", "RCOLCHETE", "LPARENTESE", 
		"RPARENTESE", "VIRGULA", "PONTOVIRGULA", "IF", "ELSE", "BOOLEANVALOR", 
		"BOOLEAN", "CAlLOUT", "CLASS", "PROGRAM", "INT", "RETURN", "VOID", "FOR", 
		"BREAK", "CONTINUE", "HEXINIT", "HEX", "NUMBER", "OPARIT", "OPREL", "OPLOGIC", 
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

	@Override
	public String getGrammarFileName() { return "DecafParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DecafParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(DecafParser.PROGRAM, 0); }
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public Field_declContext field_decl() {
			return getRuleContext(Field_declContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(CLASS);
			setState(9);
			match(PROGRAM);
			setState(10);
			match(LCURLY);
			setState(11);
			field_decl();
			setState(12);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declContext extends ParserRuleContext {
		public TerminalNode PONTOVIRGULA() { return getToken(DecafParser.PONTOVIRGULA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LCOLCHETE() { return getToken(DecafParser.LCOLCHETE, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode RCOLCHETE() { return getToken(DecafParser.RCOLCHETE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(14);
				type();
				setState(15);
				match(ID);
				}
				break;
			case 2:
				{
				setState(17);
				type();
				setState(18);
				match(ID);
				setState(19);
				match(LCOLCHETE);
				setState(20);
				int_literal();
				setState(21);
				match(RCOLCHETE);
				}
				break;
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(25);
				match(VIRGULA);
				setState(26);
				field_decl();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(PONTOVIRGULA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(DecafParser.BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DecafParser.NUMBER, 0); }
		public TerminalNode HEX() { return getToken(DecafParser.HEX, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==HEX || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#)\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\32\n\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\2\2\6\2\4\6\b\2\4\4\2\17\17\23\23\3\2\32\33&\2\n\3\2\2\2\4"+
		"\31\3\2\2\2\6$\3\2\2\2\b&\3\2\2\2\n\13\7\21\2\2\13\f\7\22\2\2\f\r\7\4"+
		"\2\2\r\16\5\4\3\2\16\17\7\5\2\2\17\3\3\2\2\2\20\21\5\6\4\2\21\22\7 \2"+
		"\2\22\32\3\2\2\2\23\24\5\6\4\2\24\25\7 \2\2\25\26\7\6\2\2\26\27\5\b\5"+
		"\2\27\30\7\7\2\2\30\32\3\2\2\2\31\20\3\2\2\2\31\23\3\2\2\2\32\37\3\2\2"+
		"\2\33\34\7\n\2\2\34\36\5\4\3\2\35\33\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2"+
		"\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\13\2\2#\5\3\2\2\2$%\t\2\2\2%"+
		"\7\3\2\2\2&\'\t\3\2\2\'\t\3\2\2\2\4\31\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}