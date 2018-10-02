// Generated from /d/Faculdade/6/Compiladores/lab02/provided/compilador/src/decaf/DecafParser.g4 by ANTLR 4.5.3

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
		BOOLEAN=13, CALLOUT=14, CLASS=15, PROGRAM=16, INT=17, RETURN=18, VOID=19, 
		FOR=20, BREAK=21, CONTINUE=22, HEXINIT=23, HEX=24, NUMBER=25, MENOS=26, 
		OPARIT=27, OPREL=28, OPEQ=29, OPCOND=30, EXCLAMACAO=31, OPIGUAL=32, OPMAISIGUAL=33, 
		OPMENOSIGUAL=34, CHAR=35, ID=36, STRING=37, WS_=38, SL_COMMENT=39;
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_method_decl = 2, RULE_block = 3, 
		RULE_var_decl = 4, RULE_statement = 5, RULE_assign_op = 6, RULE_method_call = 7, 
		RULE_method_name = 8, RULE_location = 9, RULE_expr = 10, RULE_call_arg = 11, 
		RULE_bin_op = 12, RULE_literal = 13, RULE_type = 14, RULE_int_literal = 15, 
		RULE_char_literal = 16, RULE_bool_literal = 17;
	public static final String[] ruleNames = {
		"program", "field_decl", "method_decl", "block", "var_decl", "statement", 
		"assign_op", "method_call", "method_name", "location", "expr", "call_arg", 
		"bin_op", "literal", "type", "int_literal", "char_literal", "bool_literal"
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
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(CLASS);
			setState(37);
			match(PROGRAM);
			setState(38);
			match(LCURLY);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					field_decl();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << VOID))) != 0)) {
				{
				{
				setState(45);
				method_decl();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(DecafParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(DecafParser.PONTOVIRGULA, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public List<TerminalNode> LCOLCHETE() { return getTokens(DecafParser.LCOLCHETE); }
		public TerminalNode LCOLCHETE(int i) {
			return getToken(DecafParser.LCOLCHETE, i);
		}
		public List<TerminalNode> RCOLCHETE() { return getTokens(DecafParser.RCOLCHETE); }
		public TerminalNode RCOLCHETE(int i) {
			return getToken(DecafParser.RCOLCHETE, i);
		}
		public List<Int_literalContext> int_literal() {
			return getRuleContexts(Int_literalContext.class);
		}
		public Int_literalContext int_literal(int i) {
			return getRuleContext(Int_literalContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(53);
				type();
				setState(54);
				match(ID);
				}
				break;
			case 2:
				{
				setState(56);
				type();
				setState(57);
				match(ID);
				setState(58);
				match(LCOLCHETE);
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					int_literal();
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==HEX || _la==NUMBER );
				setState(64);
				match(RCOLCHETE);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(65);
					match(VIRGULA);
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(66);
						type();
						setState(67);
						match(ID);
						setState(68);
						match(LCOLCHETE);
						setState(69);
						int_literal();
						setState(70);
						match(RCOLCHETE);
						}
						break;
					case 2:
						{
						setState(72);
						type();
						setState(73);
						match(ID);
						setState(74);
						match(PONTOVIRGULA);
						}
						break;
					}
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(85);
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

	public static class Method_declContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode LPARENTESE() { return getToken(DecafParser.LPARENTESE, 0); }
		public TerminalNode RPARENTESE() { return getToken(DecafParser.RPARENTESE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(87);
				type();
				}
				break;
			case VOID:
				{
				setState(88);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(91);
			match(ID);
			setState(92);
			match(LPARENTESE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(93);
				type();
				setState(94);
				match(ID);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(95);
					match(VIRGULA);
					setState(96);
					type();
					setState(97);
					match(ID);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(RPARENTESE);
			setState(110);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LCURLY);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(113);
				var_decl();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << IF) | (1L << CALLOUT) | (1L << RETURN) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << ID))) != 0)) {
				{
				{
				setState(119);
				statement();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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

	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode PONTOVIRGULA() { return getToken(DecafParser.PONTOVIRGULA, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			type();
			setState(128);
			match(ID);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(129);
				match(VIRGULA);
				setState(130);
				match(ID);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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

	public static class StatementContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PONTOVIRGULA() { return getToken(DecafParser.PONTOVIRGULA, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode OPIGUAL() { return getToken(DecafParser.OPIGUAL, 0); }
		public TerminalNode VIRGULA() { return getToken(DecafParser.VIRGULA, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public List<TerminalNode> ELSE() { return getTokens(DecafParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(DecafParser.ELSE, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(138);
				location();
				setState(139);
				assign_op();
				setState(140);
				expr(0);
				setState(141);
				match(PONTOVIRGULA);
				}
				break;
			case 2:
				{
				setState(143);
				method_call();
				setState(144);
				match(PONTOVIRGULA);
				}
				break;
			case 3:
				{
				setState(146);
				match(IF);
				setState(147);
				expr(0);
				setState(148);
				block();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE) {
					{
					{
					setState(149);
					match(ELSE);
					setState(150);
					block();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				{
				setState(156);
				match(FOR);
				setState(157);
				match(ID);
				setState(158);
				match(OPIGUAL);
				setState(159);
				expr(0);
				setState(160);
				match(VIRGULA);
				setState(161);
				expr(0);
				setState(162);
				block();
				}
				break;
			case 5:
				{
				setState(164);
				match(RETURN);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPARENTESE) | (1L << BOOLEANVALOR) | (1L << CALLOUT) | (1L << HEX) | (1L << NUMBER) | (1L << MENOS) | (1L << EXCLAMACAO) | (1L << CHAR) | (1L << ID))) != 0)) {
					{
					{
					setState(165);
					expr(0);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(PONTOVIRGULA);
				}
				break;
			case 6:
				{
				setState(172);
				match(BREAK);
				setState(173);
				match(PONTOVIRGULA);
				}
				break;
			case 7:
				{
				setState(174);
				match(CONTINUE);
				setState(175);
				match(PONTOVIRGULA);
				}
				break;
			case 8:
				{
				setState(176);
				block();
				}
				break;
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

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode OPIGUAL() { return getToken(DecafParser.OPIGUAL, 0); }
		public TerminalNode OPMAISIGUAL() { return getToken(DecafParser.OPMAISIGUAL, 0); }
		public TerminalNode OPMENOSIGUAL() { return getToken(DecafParser.OPMENOSIGUAL, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPIGUAL) | (1L << OPMAISIGUAL) | (1L << OPMENOSIGUAL))) != 0)) ) {
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

	public static class Method_callContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode LPARENTESE() { return getToken(DecafParser.LPARENTESE, 0); }
		public TerminalNode RPARENTESE() { return getToken(DecafParser.RPARENTESE, 0); }
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode STRING() { return getToken(DecafParser.STRING, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public List<Call_argContext> call_arg() {
			return getRuleContexts(Call_argContext.class);
		}
		public Call_argContext call_arg(int i) {
			return getRuleContext(Call_argContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(181);
				method_name();
				setState(182);
				match(LPARENTESE);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPARENTESE) | (1L << BOOLEANVALOR) | (1L << CALLOUT) | (1L << HEX) | (1L << NUMBER) | (1L << MENOS) | (1L << EXCLAMACAO) | (1L << CHAR) | (1L << ID))) != 0)) {
					{
					{
					setState(183);
					expr(0);
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(184);
						match(VIRGULA);
						setState(185);
						expr(0);
						}
						}
						setState(190);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(RPARENTESE);
				}
				break;
			case CALLOUT:
				{
				setState(198);
				match(CALLOUT);
				setState(199);
				match(LPARENTESE);
				setState(200);
				match(STRING);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(201);
					match(VIRGULA);
					setState(202);
					call_arg();
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(203);
							match(VIRGULA);
							setState(204);
							call_arg();
							}
							} 
						}
						setState(209);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(RPARENTESE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ID);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LCOLCHETE() { return getToken(DecafParser.LCOLCHETE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RCOLCHETE() { return getToken(DecafParser.RCOLCHETE, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(220);
				match(ID);
				}
				break;
			case 2:
				{
				setState(221);
				match(ID);
				setState(222);
				match(LCOLCHETE);
				setState(223);
				expr(0);
				setState(224);
				match(RCOLCHETE);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(DecafParser.MENOS, 0); }
		public TerminalNode EXCLAMACAO() { return getToken(DecafParser.EXCLAMACAO, 0); }
		public TerminalNode LPARENTESE() { return getToken(DecafParser.LPARENTESE, 0); }
		public TerminalNode RPARENTESE() { return getToken(DecafParser.RPARENTESE, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(229);
				location();
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(230);
						expr(0);
						}
						} 
					}
					setState(235);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(236);
				method_call();
				}
				break;
			case 3:
				{
				setState(237);
				literal();
				}
				break;
			case 4:
				{
				setState(238);
				match(MENOS);
				setState(239);
				expr(3);
				}
				break;
			case 5:
				{
				setState(240);
				match(EXCLAMACAO);
				setState(241);
				expr(2);
				}
				break;
			case 6:
				{
				setState(242);
				match(LPARENTESE);
				setState(243);
				expr(0);
				setState(244);
				match(RPARENTESE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(248);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(249);
					bin_op();
					setState(250);
					expr(5);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Call_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DecafParser.STRING, 0); }
		public Call_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCall_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCall_arg(this);
		}
	}

	public final Call_argContext call_arg() throws RecognitionException {
		Call_argContext _localctx = new Call_argContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_call_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			switch (_input.LA(1)) {
			case LPARENTESE:
			case BOOLEANVALOR:
			case CALLOUT:
			case HEX:
			case NUMBER:
			case MENOS:
			case EXCLAMACAO:
			case CHAR:
			case ID:
				{
				setState(257);
				expr(0);
				}
				break;
			case STRING:
				{
				setState(258);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Bin_opContext extends ParserRuleContext {
		public TerminalNode OPARIT() { return getToken(DecafParser.OPARIT, 0); }
		public TerminalNode OPREL() { return getToken(DecafParser.OPREL, 0); }
		public TerminalNode OPEQ() { return getToken(DecafParser.OPEQ, 0); }
		public TerminalNode OPCOND() { return getToken(DecafParser.OPCOND, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPARIT) | (1L << OPREL) | (1L << OPEQ) | (1L << OPCOND))) != 0)) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			switch (_input.LA(1)) {
			case HEX:
			case NUMBER:
				{
				setState(263);
				int_literal();
				}
				break;
			case CHAR:
				{
				setState(264);
				char_literal();
				}
				break;
			case BOOLEANVALOR:
				{
				setState(265);
				bool_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
		enterRule(_localctx, 30, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(DecafParser.CHAR, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitChar_literal(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(CHAR);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode BOOLEANVALOR() { return getToken(DecafParser.BOOLEANVALOR, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(BOOLEANVALOR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0117\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\7\2\61\n\2\f\2"+
		"\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3?\n\3\r\3\16\3@\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\7\3Q\n\3\f\3\16"+
		"\3T\13\3\5\3V\n\3\3\3\3\3\3\4\3\4\5\4\\\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4f\n\4\f\4\16\4i\13\4\7\4k\n\4\f\4\16\4n\13\4\3\4\3\4\3\4\3\5"+
		"\3\5\7\5u\n\5\f\5\16\5x\13\5\3\5\7\5{\n\5\f\5\16\5~\13\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009a\n\7\f\7\16\7\u009d\13\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a9\n\7\f\7\16\7\u00ac\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b4\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00bd\n\t\f\t\16\t\u00c0\13\t\7\t\u00c2\n\t\f\t\16\t\u00c5\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d0\n\t\f\t\16\t\u00d3\13\t\7\t"+
		"\u00d5\n\t\f\t\16\t\u00d8\13\t\3\t\5\t\u00db\n\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00e5\n\13\3\f\3\f\3\f\7\f\u00ea\n\f\f\f\16\f\u00ed"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f9\n\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00ff\n\f\f\f\16\f\u0102\13\f\3\r\3\r\5\r\u0106\n\r\3\16\3"+
		"\16\3\17\3\17\3\17\5\17\u010d\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\2\3\26\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\6\3"+
		"\2\"$\3\2\35 \4\2\17\17\23\23\3\2\32\33\u0129\2&\3\2\2\2\4U\3\2\2\2\6"+
		"[\3\2\2\2\br\3\2\2\2\n\u0081\3\2\2\2\f\u00b3\3\2\2\2\16\u00b5\3\2\2\2"+
		"\20\u00da\3\2\2\2\22\u00dc\3\2\2\2\24\u00e4\3\2\2\2\26\u00f8\3\2\2\2\30"+
		"\u0105\3\2\2\2\32\u0107\3\2\2\2\34\u010c\3\2\2\2\36\u010e\3\2\2\2 \u0110"+
		"\3\2\2\2\"\u0112\3\2\2\2$\u0114\3\2\2\2&\'\7\21\2\2\'(\7\22\2\2(,\7\4"+
		"\2\2)+\5\4\3\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\62\3\2\2\2.,\3"+
		"\2\2\2/\61\5\6\4\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2"+
		"\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\5\2\2\66\3\3\2\2\2\678\5\36\20"+
		"\289\7&\2\29V\3\2\2\2:;\5\36\20\2;<\7&\2\2<>\7\6\2\2=?\5 \21\2>=\3\2\2"+
		"\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BR\7\7\2\2CN\7\n\2\2DE\5\36"+
		"\20\2EF\7&\2\2FG\7\6\2\2GH\5 \21\2HI\7\7\2\2IO\3\2\2\2JK\5\36\20\2KL\7"+
		"&\2\2LM\7\13\2\2MO\3\2\2\2ND\3\2\2\2NJ\3\2\2\2OQ\3\2\2\2PC\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2U\67\3\2\2\2U:\3\2\2\2V"+
		"W\3\2\2\2WX\7\13\2\2X\5\3\2\2\2Y\\\5\36\20\2Z\\\7\25\2\2[Y\3\2\2\2[Z\3"+
		"\2\2\2\\]\3\2\2\2]^\7&\2\2^l\7\b\2\2_`\5\36\20\2`g\7&\2\2ab\7\n\2\2bc"+
		"\5\36\20\2cd\7&\2\2df\3\2\2\2ea\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2j_\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2"+
		"nl\3\2\2\2op\7\t\2\2pq\5\b\5\2q\7\3\2\2\2rv\7\4\2\2su\5\n\6\2ts\3\2\2"+
		"\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w|\3\2\2\2xv\3\2\2\2y{\5\f\7\2zy\3\2\2"+
		"\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\5"+
		"\2\2\u0080\t\3\2\2\2\u0081\u0082\5\36\20\2\u0082\u0087\7&\2\2\u0083\u0084"+
		"\7\n\2\2\u0084\u0086\7&\2\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008b\7\13\2\2\u008b\13\3\2\2\2\u008c\u008d\5\24\13\2\u008d"+
		"\u008e\5\16\b\2\u008e\u008f\5\26\f\2\u008f\u0090\7\13\2\2\u0090\u00b4"+
		"\3\2\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\13\2\2\u0093\u00b4\3\2\2\2"+
		"\u0094\u0095\7\f\2\2\u0095\u0096\5\26\f\2\u0096\u009b\5\b\5\2\u0097\u0098"+
		"\7\r\2\2\u0098\u009a\5\b\5\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00b4\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u009f\7\26\2\2\u009f\u00a0\7&\2\2\u00a0\u00a1\7\"\2\2\u00a1"+
		"\u00a2\5\26\f\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\5"+
		"\b\5\2\u00a5\u00b4\3\2\2\2\u00a6\u00aa\7\24\2\2\u00a7\u00a9\5\26\f\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b4\7\13\2\2\u00ae"+
		"\u00af\7\27\2\2\u00af\u00b4\7\13\2\2\u00b0\u00b1\7\30\2\2\u00b1\u00b4"+
		"\7\13\2\2\u00b2\u00b4\5\b\5\2\u00b3\u008c\3\2\2\2\u00b3\u0091\3\2\2\2"+
		"\u00b3\u0094\3\2\2\2\u00b3\u009e\3\2\2\2\u00b3\u00a6\3\2\2\2\u00b3\u00ae"+
		"\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\r\3\2\2\2\u00b5"+
		"\u00b6\t\2\2\2\u00b6\17\3\2\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00c3\7\b\2"+
		"\2\u00b9\u00be\5\26\f\2\u00ba\u00bb\7\n\2\2\u00bb\u00bd\5\26\f\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\t\2\2\u00c7\u00db\3\2\2\2\u00c8"+
		"\u00c9\7\20\2\2\u00c9\u00ca\7\b\2\2\u00ca\u00d6\7\'\2\2\u00cb\u00cc\7"+
		"\n\2\2\u00cc\u00d1\5\30\r\2\u00cd\u00ce\7\n\2\2\u00ce\u00d0\5\30\r\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00cb\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\t\2\2\u00da\u00b7\3\2\2\2\u00da"+
		"\u00c8\3\2\2\2\u00db\21\3\2\2\2\u00dc\u00dd\7&\2\2\u00dd\23\3\2\2\2\u00de"+
		"\u00e5\7&\2\2\u00df\u00e0\7&\2\2\u00e0\u00e1\7\6\2\2\u00e1\u00e2\5\26"+
		"\f\2\u00e2\u00e3\7\7\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4"+
		"\u00df\3\2\2\2\u00e5\25\3\2\2\2\u00e6\u00e7\b\f\1\2\u00e7\u00eb\5\24\13"+
		"\2\u00e8\u00ea\5\26\f\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f9\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00f9\5\20\t\2\u00ef\u00f9\5\34\17\2\u00f0\u00f1\7\34\2\2\u00f1"+
		"\u00f9\5\26\f\5\u00f2\u00f3\7!\2\2\u00f3\u00f9\5\26\f\4\u00f4\u00f5\7"+
		"\b\2\2\u00f5\u00f6\5\26\f\2\u00f6\u00f7\7\t\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00e6\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0\3\2"+
		"\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\u0100\3\2\2\2\u00fa"+
		"\u00fb\f\6\2\2\u00fb\u00fc\5\32\16\2\u00fc\u00fd\5\26\f\7\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\27\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0106\5\26\f"+
		"\2\u0104\u0106\7\'\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\31"+
		"\3\2\2\2\u0107\u0108\t\3\2\2\u0108\33\3\2\2\2\u0109\u010d\5 \21\2\u010a"+
		"\u010d\5\"\22\2\u010b\u010d\5$\23\2\u010c\u0109\3\2\2\2\u010c\u010a\3"+
		"\2\2\2\u010c\u010b\3\2\2\2\u010d\35\3\2\2\2\u010e\u010f\t\4\2\2\u010f"+
		"\37\3\2\2\2\u0110\u0111\t\5\2\2\u0111!\3\2\2\2\u0112\u0113\7%\2\2\u0113"+
		"#\3\2\2\2\u0114\u0115\7\16\2\2\u0115%\3\2\2\2\34,\62@NRU[glv|\u0087\u009b"+
		"\u00aa\u00b3\u00be\u00c3\u00d1\u00d6\u00da\u00e4\u00eb\u00f8\u0100\u0105"+
		"\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}