// Generated from D:/Projects/ANTLR-compiler/src/main/antlr4\xml.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ARRAY_TYPE=2, TYPE=3, ACTION_OPERATOR=4, BOOL_OPERATOR=5, DOCUMENT=6, 
		NODE=7, ATTRIBUTE=8, STRING=9, INT=10, FLOAT=11, ELSE=12, IF=13, FOR=14, 
		WHILE=15, IN=16, AND=17, OR=18, NEW=19, NAME=20, NUMBER_LITERAL=21, STRING_LITERAL=22, 
		WHITESPACE=23, OPEN_BRACKET=24, CLOSE_BRACKET=25, OPEN_SQUAR_EBRACKET=26, 
		CLOSE_SQUARE_BRACKET=27, OPEN_FIGURE_BRACKET=28, CLOSE_FIGURE_BRACKET=29, 
		SEMICOLON=30, QOUTES_ONE=31, QOUTES_TWO=32, ASSIGMENT=33, SUM_ASSIGMENT=34, 
		DOT=35, MORE_THAN=36, LESS_THAN=37, EQUAL=38, NOT_EQUAL=39, MORE_EQUAL=40, 
		LESS_EQUAL=41, PlUS=42, MINUS=43, MULTIPLICATION=44, DIVISION=45, COMMENT=46;
	public static final int
		RULE_operation = 0, RULE_initialise_var = 1, RULE_assignment = 2, RULE_add_assignment = 3, 
		RULE_get_elem = 4, RULE_get_array_elem = 5, RULE_func_call = 6, RULE_params = 7, 
		RULE_initialise_func = 8, RULE_if_block = 9, RULE_else_if_block = 10, 
		RULE_else_block = 11, RULE_if_statement = 12, RULE_for_statement = 13, 
		RULE_range_statement = 14, RULE_while_statement = 15, RULE_condition = 16, 
		RULE_type_cast = 17, RULE_expression = 18, RULE_get_operation = 19, RULE_xml = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"operation", "initialise_var", "assignment", "add_assignment", "get_elem", 
			"get_array_elem", "func_call", "params", "initialise_func", "if_block", 
			"else_if_block", "else_block", "if_statement", "for_statement", "range_statement", 
			"while_statement", "condition", "type_cast", "expression", "get_operation", 
			"xml"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, null, "'document'", "'node'", "'attribute'", 
			"'string'", "'int'", "'float'", "'else'", "'if'", "'for'", "'while'", 
			"'in'", "'and'", "'or'", "'new'", null, null, null, null, "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "';'", "'''", "'\"'", "'='", "'+='", "'.'", 
			"'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ARRAY_TYPE", "TYPE", "ACTION_OPERATOR", "BOOL_OPERATOR", 
			"DOCUMENT", "NODE", "ATTRIBUTE", "STRING", "INT", "FLOAT", "ELSE", "IF", 
			"FOR", "WHILE", "IN", "AND", "OR", "NEW", "NAME", "NUMBER_LITERAL", "STRING_LITERAL", 
			"WHITESPACE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_SQUAR_EBRACKET", 
			"CLOSE_SQUARE_BRACKET", "OPEN_FIGURE_BRACKET", "CLOSE_FIGURE_BRACKET", 
			"SEMICOLON", "QOUTES_ONE", "QOUTES_TWO", "ASSIGMENT", "SUM_ASSIGMENT", 
			"DOT", "MORE_THAN", "LESS_THAN", "EQUAL", "NOT_EQUAL", "MORE_EQUAL", 
			"LESS_EQUAL", "PlUS", "MINUS", "MULTIPLICATION", "DIVISION", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "xml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OperationContext extends ParserRuleContext {
		public Get_operationContext get_operation() {
			return getRuleContext(Get_operationContext.class,0);
		}
		public Initialise_varContext initialise_var() {
			return getRuleContext(Initialise_varContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Add_assignmentContext add_assignment() {
			return getRuleContext(Add_assignmentContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Type_castContext type_cast() {
			return getRuleContext(Type_castContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operation);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				get_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				initialise_var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				add_assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				for_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(49);
				type_cast();
				}
				break;
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

	public static class Initialise_varContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(xmlParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(xmlParser.TYPE, i);
		}
		public TerminalNode NAME() { return getToken(xmlParser.NAME, 0); }
		public TerminalNode ASSIGMENT() { return getToken(xmlParser.ASSIGMENT, 0); }
		public TerminalNode NEW() { return getToken(xmlParser.NEW, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(xmlParser.SEMICOLON, 0); }
		public Initialise_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialise_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterInitialise_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitInitialise_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitInitialise_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialise_varContext initialise_var() throws RecognitionException {
		Initialise_varContext _localctx = new Initialise_varContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initialise_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(TYPE);
			setState(53);
			match(NAME);
			setState(54);
			match(ASSIGMENT);
			setState(55);
			match(NEW);
			setState(56);
			match(TYPE);
			setState(57);
			match(OPEN_BRACKET);
			setState(58);
			expression(0);
			setState(59);
			match(CLOSE_BRACKET);
			setState(60);
			match(SEMICOLON);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(xmlParser.NAME, 0); }
		public TerminalNode ASSIGMENT() { return getToken(xmlParser.ASSIGMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(xmlParser.SEMICOLON, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(xmlParser.NUMBER_LITERAL, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public TerminalNode TYPE() { return getToken(xmlParser.TYPE, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(xmlParser.ARRAY_TYPE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY_TYPE || _la==TYPE) {
				{
				setState(62);
				_la = _input.LA(1);
				if ( !(_la==ARRAY_TYPE || _la==TYPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(65);
			match(NAME);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(66);
				match(OPEN_BRACKET);
				setState(67);
				match(NUMBER_LITERAL);
				setState(68);
				match(CLOSE_BRACKET);
				}
			}

			setState(71);
			match(ASSIGMENT);
			setState(72);
			expression(0);
			setState(73);
			match(SEMICOLON);
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

	public static class Add_assignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(xmlParser.NAME, 0); }
		public TerminalNode SUM_ASSIGMENT() { return getToken(xmlParser.SUM_ASSIGMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(xmlParser.SEMICOLON, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(xmlParser.NUMBER_LITERAL, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public Add_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterAdd_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitAdd_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitAdd_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_assignmentContext add_assignment() throws RecognitionException {
		Add_assignmentContext _localctx = new Add_assignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_add_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(NAME);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(76);
				match(OPEN_BRACKET);
				setState(77);
				match(NUMBER_LITERAL);
				setState(78);
				match(CLOSE_BRACKET);
				}
			}

			setState(81);
			match(SUM_ASSIGMENT);
			setState(82);
			expression(0);
			setState(83);
			match(SEMICOLON);
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

	public static class Get_elemContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(xmlParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(xmlParser.NAME, i);
		}
		public TerminalNode DOT() { return getToken(xmlParser.DOT, 0); }
		public Get_elemContext get_elem() {
			return getRuleContext(Get_elemContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(xmlParser.SEMICOLON, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Get_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterGet_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitGet_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitGet_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_elemContext get_elem() throws RecognitionException {
		return get_elem(0);
	}

	private Get_elemContext get_elem(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Get_elemContext _localctx = new Get_elemContext(_ctx, _parentState);
		Get_elemContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_get_elem, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(86);
			match(NAME);
			setState(87);
			match(DOT);
			setState(88);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Get_elemContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_get_elem);
						setState(90);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(91);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new Get_elemContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_get_elem);
						setState(92);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(93);
						match(OPEN_BRACKET);
						setState(95);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << TYPE) | (1L << NAME) | (1L << NUMBER_LITERAL) | (1L << STRING_LITERAL) | (1L << OPEN_BRACKET))) != 0)) {
							{
							setState(94);
							params();
							}
						}

						setState(97);
						match(CLOSE_BRACKET);
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Get_array_elemContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(xmlParser.NAME, 0); }
		public TerminalNode OPEN_SQUAR_EBRACKET() { return getToken(xmlParser.OPEN_SQUAR_EBRACKET, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(xmlParser.NUMBER_LITERAL, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(xmlParser.CLOSE_SQUARE_BRACKET, 0); }
		public Get_array_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_array_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterGet_array_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitGet_array_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitGet_array_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_array_elemContext get_array_elem() throws RecognitionException {
		Get_array_elemContext _localctx = new Get_array_elemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_get_array_elem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(NAME);
			setState(104);
			match(OPEN_SQUAR_EBRACKET);
			setState(105);
			match(NUMBER_LITERAL);
			setState(106);
			match(CLOSE_SQUARE_BRACKET);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(xmlParser.NAME, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(xmlParser.SEMICOLON, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(xmlParser.TYPE, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(xmlParser.ARRAY_TYPE, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY_TYPE || _la==TYPE) {
				{
				setState(108);
				_la = _input.LA(1);
				if ( !(_la==ARRAY_TYPE || _la==TYPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(111);
			match(NAME);
			setState(112);
			match(OPEN_BRACKET);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << TYPE) | (1L << NAME) | (1L << NUMBER_LITERAL) | (1L << STRING_LITERAL) | (1L << OPEN_BRACKET))) != 0)) {
				{
				setState(113);
				params();
				}
			}

			setState(116);
			match(CLOSE_BRACKET);
			setState(117);
			match(SEMICOLON);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			expression(0);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(120);
				match(T__0);
				setState(121);
				expression(0);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Initialise_funcContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(xmlParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(xmlParser.NAME, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_FIGURE_BRACKET() { return getToken(xmlParser.OPEN_FIGURE_BRACKET, 0); }
		public TerminalNode CLOSE_FIGURE_BRACKET() { return getToken(xmlParser.CLOSE_FIGURE_BRACKET, 0); }
		public List<TerminalNode> TYPE() { return getTokens(xmlParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(xmlParser.TYPE, i);
		}
		public List<TerminalNode> ARRAY_TYPE() { return getTokens(xmlParser.ARRAY_TYPE); }
		public TerminalNode ARRAY_TYPE(int i) {
			return getToken(xmlParser.ARRAY_TYPE, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Initialise_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialise_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterInitialise_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitInitialise_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitInitialise_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialise_funcContext initialise_func() throws RecognitionException {
		Initialise_funcContext _localctx = new Initialise_funcContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initialise_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==ARRAY_TYPE || _la==TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128);
			match(NAME);
			setState(129);
			match(OPEN_BRACKET);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY_TYPE || _la==TYPE) {
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==ARRAY_TYPE || _la==TYPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				match(NAME);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(132);
					match(T__0);
					setState(133);
					_la = _input.LA(1);
					if ( !(_la==ARRAY_TYPE || _la==TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(134);
					match(NAME);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(142);
			match(CLOSE_BRACKET);
			setState(143);
			match(OPEN_FIGURE_BRACKET);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << TYPE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(144);
				operation();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(CLOSE_FIGURE_BRACKET);
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(xmlParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_FIGURE_BRACKET() { return getToken(xmlParser.OPEN_FIGURE_BRACKET, 0); }
		public TerminalNode CLOSE_FIGURE_BRACKET() { return getToken(xmlParser.CLOSE_FIGURE_BRACKET, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitIf_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(IF);
			setState(153);
			match(OPEN_BRACKET);
			setState(154);
			condition();
			setState(155);
			match(CLOSE_BRACKET);
			setState(156);
			match(OPEN_FIGURE_BRACKET);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << TYPE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(157);
				operation();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(CLOSE_FIGURE_BRACKET);
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

	public static class Else_if_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(xmlParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(xmlParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_FIGURE_BRACKET() { return getToken(xmlParser.OPEN_FIGURE_BRACKET, 0); }
		public TerminalNode CLOSE_FIGURE_BRACKET() { return getToken(xmlParser.CLOSE_FIGURE_BRACKET, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Else_if_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterElse_if_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitElse_if_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitElse_if_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_blockContext else_if_block() throws RecognitionException {
		Else_if_blockContext _localctx = new Else_if_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ELSE);
			setState(166);
			match(IF);
			setState(167);
			match(OPEN_BRACKET);
			setState(168);
			condition();
			setState(169);
			match(CLOSE_BRACKET);
			setState(170);
			match(OPEN_FIGURE_BRACKET);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << TYPE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(171);
				operation();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(CLOSE_FIGURE_BRACKET);
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(xmlParser.ELSE, 0); }
		public TerminalNode OPEN_FIGURE_BRACKET() { return getToken(xmlParser.OPEN_FIGURE_BRACKET, 0); }
		public TerminalNode CLOSE_FIGURE_BRACKET() { return getToken(xmlParser.CLOSE_FIGURE_BRACKET, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ELSE);
			setState(180);
			match(OPEN_FIGURE_BRACKET);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << TYPE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(181);
				operation();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(CLOSE_FIGURE_BRACKET);
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

	public static class If_statementContext extends ParserRuleContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public List<Else_if_blockContext> else_if_block() {
			return getRuleContexts(Else_if_blockContext.class);
		}
		public Else_if_blockContext else_if_block(int i) {
			return getRuleContext(Else_if_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			if_block();
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					else_if_block();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(196);
				else_block();
				}
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(xmlParser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public Range_statementContext range_statement() {
			return getRuleContext(Range_statementContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_FIGURE_BRACKET() { return getToken(xmlParser.OPEN_FIGURE_BRACKET, 0); }
		public TerminalNode CLOSE_FIGURE_BRACKET() { return getToken(xmlParser.CLOSE_FIGURE_BRACKET, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(FOR);
			setState(200);
			match(OPEN_BRACKET);
			setState(201);
			range_statement();
			setState(202);
			match(CLOSE_BRACKET);
			setState(203);
			match(OPEN_FIGURE_BRACKET);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << TYPE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(204);
				operation();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(CLOSE_FIGURE_BRACKET);
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

	public static class Range_statementContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(xmlParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(xmlParser.NAME, i);
		}
		public TerminalNode IN() { return getToken(xmlParser.IN, 0); }
		public TerminalNode TYPE() { return getToken(xmlParser.TYPE, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(xmlParser.ARRAY_TYPE, 0); }
		public Range_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterRange_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitRange_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitRange_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_statementContext range_statement() throws RecognitionException {
		Range_statementContext _localctx = new Range_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_range_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==ARRAY_TYPE || _la==TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
			match(NAME);
			setState(214);
			match(IN);
			setState(215);
			match(NAME);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(xmlParser.WHILE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_FIGURE_BRACKET() { return getToken(xmlParser.OPEN_FIGURE_BRACKET, 0); }
		public TerminalNode CLOSE_FIGURE_BRACKET() { return getToken(xmlParser.CLOSE_FIGURE_BRACKET, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(WHILE);
			setState(218);
			match(OPEN_BRACKET);
			setState(219);
			condition();
			setState(220);
			match(CLOSE_BRACKET);
			setState(221);
			match(OPEN_FIGURE_BRACKET);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << TYPE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0)) {
				{
				{
				setState(222);
				operation();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(CLOSE_FIGURE_BRACKET);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(xmlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(xmlParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(xmlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(xmlParser.OR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			expression(0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(235);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(231);
					match(AND);
					setState(232);
					expression(0);
					}
					break;
				case OR:
					{
					setState(233);
					match(OR);
					setState(234);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Type_castContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(xmlParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(xmlParser.NAME, i);
		}
		public TerminalNode ASSIGMENT() { return getToken(xmlParser.ASSIGMENT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public TerminalNode TYPE() { return getToken(xmlParser.TYPE, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(xmlParser.SEMICOLON, 0); }
		public Type_castContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterType_cast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitType_cast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitType_cast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_castContext type_cast() throws RecognitionException {
		Type_castContext _localctx = new Type_castContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(NAME);
			setState(241);
			match(ASSIGMENT);
			setState(242);
			match(OPEN_BRACKET);
			setState(243);
			match(TYPE);
			setState(244);
			match(CLOSE_BRACKET);
			setState(245);
			match(NAME);
			setState(246);
			match(SEMICOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(xmlParser.OPEN_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(xmlParser.CLOSE_BRACKET, 0); }
		public Get_operationContext get_operation() {
			return getRuleContext(Get_operationContext.class,0);
		}
		public TerminalNode NUMBER_LITERAL() { return getToken(xmlParser.NUMBER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(xmlParser.STRING_LITERAL, 0); }
		public TerminalNode NAME() { return getToken(xmlParser.NAME, 0); }
		public TerminalNode ACTION_OPERATOR() { return getToken(xmlParser.ACTION_OPERATOR, 0); }
		public TerminalNode BOOL_OPERATOR() { return getToken(xmlParser.BOOL_OPERATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(249);
				match(OPEN_BRACKET);
				setState(250);
				expression(0);
				setState(251);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				{
				setState(253);
				get_operation();
				}
				break;
			case 3:
				{
				setState(254);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << NUMBER_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(263);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(258);
						match(ACTION_OPERATOR);
						setState(259);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(261);
						match(BOOL_OPERATOR);
						setState(262);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Get_operationContext extends ParserRuleContext {
		public Get_elemContext get_elem() {
			return getRuleContext(Get_elemContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Get_array_elemContext get_array_elem() {
			return getRuleContext(Get_array_elemContext.class,0);
		}
		public Get_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterGet_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitGet_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitGet_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_operationContext get_operation() throws RecognitionException {
		Get_operationContext _localctx = new Get_operationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_get_operation);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				get_elem(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				func_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				get_array_elem();
				}
				break;
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

	public static class XmlContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<Initialise_funcContext> initialise_func() {
			return getRuleContexts(Initialise_funcContext.class);
		}
		public Initialise_funcContext initialise_func(int i) {
			return getRuleContext(Initialise_funcContext.class,i);
		}
		public XmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).enterXml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmlListener ) ((xmlListener)listener).exitXml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmlVisitor ) return ((xmlVisitor<? extends T>)visitor).visitXml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlContext xml() throws RecognitionException {
		XmlContext _localctx = new XmlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_xml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(273);
					operation();
					}
					break;
				case 2:
					{
					setState(274);
					initialise_func();
					}
					break;
				}
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << TYPE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NAME))) != 0) );
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
		case 4:
			return get_elem_sempred((Get_elemContext)_localctx, predIndex);
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean get_elem_sempred(Get_elemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u011a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2\65\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5\4B\n\4\3\4"+
		"\3\4\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5R\n\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\6\7\6e\n\6"+
		"\f\6\16\6h\13\6\3\7\3\7\3\7\3\7\3\7\3\b\5\bp\n\b\3\b\3\b\3\b\5\bu\n\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n\5\n\u008f\n\n\3\n\3"+
		"\n\3\n\7\n\u0094\n\n\f\n\16\n\u0097\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u00a1\n\13\f\13\16\13\u00a4\13\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00af\n\f\f\f\16\f\u00b2\13\f\3\f\3\f\3\r\3\r\3\r"+
		"\7\r\u00b9\n\r\f\r\16\r\u00bc\13\r\3\r\3\r\3\16\3\16\7\16\u00c2\n\16\f"+
		"\16\16\16\u00c5\13\16\3\16\5\16\u00c8\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u00d0\n\17\f\17\16\17\u00d3\13\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e2\n\21\f\21\16\21\u00e5"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00ee\n\22\f\22\16\22\u00f1"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0102\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u010a\n"+
		"\24\f\24\16\24\u010d\13\24\3\25\3\25\3\25\5\25\u0112\n\25\3\26\3\26\6"+
		"\26\u0116\n\26\r\26\16\26\u0117\3\26\2\4\n&\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\4\3\2\4\5\3\2\26\30\2\u0128\2\64\3\2\2\2\4\66"+
		"\3\2\2\2\6A\3\2\2\2\bM\3\2\2\2\nW\3\2\2\2\fi\3\2\2\2\16o\3\2\2\2\20y\3"+
		"\2\2\2\22\u0081\3\2\2\2\24\u009a\3\2\2\2\26\u00a7\3\2\2\2\30\u00b5\3\2"+
		"\2\2\32\u00bf\3\2\2\2\34\u00c9\3\2\2\2\36\u00d6\3\2\2\2 \u00db\3\2\2\2"+
		"\"\u00e8\3\2\2\2$\u00f2\3\2\2\2&\u0101\3\2\2\2(\u0111\3\2\2\2*\u0115\3"+
		"\2\2\2,\65\5(\25\2-\65\5\4\3\2.\65\5\6\4\2/\65\5\b\5\2\60\65\5\32\16\2"+
		"\61\65\5\34\17\2\62\65\5 \21\2\63\65\5$\23\2\64,\3\2\2\2\64-\3\2\2\2\64"+
		".\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63"+
		"\3\2\2\2\65\3\3\2\2\2\66\67\7\5\2\2\678\7\26\2\289\7#\2\29:\7\25\2\2:"+
		";\7\5\2\2;<\7\32\2\2<=\5&\24\2=>\7\33\2\2>?\7 \2\2?\5\3\2\2\2@B\t\2\2"+
		"\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CG\7\26\2\2DE\7\32\2\2EF\7\27\2\2FH\7"+
		"\33\2\2GD\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7#\2\2JK\5&\24\2KL\7 \2\2L\7\3"+
		"\2\2\2MQ\7\26\2\2NO\7\32\2\2OP\7\27\2\2PR\7\33\2\2QN\3\2\2\2QR\3\2\2\2"+
		"RS\3\2\2\2ST\7$\2\2TU\5&\24\2UV\7 \2\2V\t\3\2\2\2WX\b\6\1\2XY\7\26\2\2"+
		"YZ\7%\2\2Z[\7\26\2\2[f\3\2\2\2\\]\f\5\2\2]e\7 \2\2^_\f\4\2\2_a\7\32\2"+
		"\2`b\5\20\t\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2ce\7\33\2\2d\\\3\2\2\2d^\3"+
		"\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\13\3\2\2\2hf\3\2\2\2ij\7\26\2\2"+
		"jk\7\34\2\2kl\7\27\2\2lm\7\35\2\2m\r\3\2\2\2np\t\2\2\2on\3\2\2\2op\3\2"+
		"\2\2pq\3\2\2\2qr\7\26\2\2rt\7\32\2\2su\5\20\t\2ts\3\2\2\2tu\3\2\2\2uv"+
		"\3\2\2\2vw\7\33\2\2wx\7 \2\2x\17\3\2\2\2y~\5&\24\2z{\7\3\2\2{}\5&\24\2"+
		"|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\21\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0082\t\2\2\2\u0082\u0083\7\26\2\2\u0083\u008e\7\32\2"+
		"\2\u0084\u0085\t\2\2\2\u0085\u008b\7\26\2\2\u0086\u0087\7\3\2\2\u0087"+
		"\u0088\t\2\2\2\u0088\u008a\7\26\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\7\33\2\2\u0091\u0095\7\36\2\2\u0092\u0094\5\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\37\2\2\u0099"+
		"\23\3\2\2\2\u009a\u009b\7\17\2\2\u009b\u009c\7\32\2\2\u009c\u009d\5\""+
		"\22\2\u009d\u009e\7\33\2\2\u009e\u00a2\7\36\2\2\u009f\u00a1\5\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\37\2\2\u00a6"+
		"\25\3\2\2\2\u00a7\u00a8\7\16\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\7\32"+
		"\2\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\7\33\2\2\u00ac\u00b0\7\36\2\2\u00ad"+
		"\u00af\5\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\7\37\2\2\u00b4\27\3\2\2\2\u00b5\u00b6\7\16\2\2\u00b6\u00ba\7\36"+
		"\2\2\u00b7\u00b9\5\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\7\37\2\2\u00be\31\3\2\2\2\u00bf\u00c3\5\24\13\2\u00c0"+
		"\u00c2\5\26\f\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c8\5\30\r\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\33\3\2\2"+
		"\2\u00c9\u00ca\7\20\2\2\u00ca\u00cb\7\32\2\2\u00cb\u00cc\5\36\20\2\u00cc"+
		"\u00cd\7\33\2\2\u00cd\u00d1\7\36\2\2\u00ce\u00d0\5\2\2\2\u00cf\u00ce\3"+
		"\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\37\2\2\u00d5\35\3\2\2"+
		"\2\u00d6\u00d7\t\2\2\2\u00d7\u00d8\7\26\2\2\u00d8\u00d9\7\22\2\2\u00d9"+
		"\u00da\7\26\2\2\u00da\37\3\2\2\2\u00db\u00dc\7\21\2\2\u00dc\u00dd\7\32"+
		"\2\2\u00dd\u00de\5\"\22\2\u00de\u00df\7\33\2\2\u00df\u00e3\7\36\2\2\u00e0"+
		"\u00e2\5\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7\37\2\2\u00e7!\3\2\2\2\u00e8\u00ef\5&\24\2\u00e9\u00ea\7\23\2"+
		"\2\u00ea\u00ee\5&\24\2\u00eb\u00ec\7\24\2\2\u00ec\u00ee\5&\24\2\u00ed"+
		"\u00e9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0#\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3"+
		"\7\26\2\2\u00f3\u00f4\7#\2\2\u00f4\u00f5\7\32\2\2\u00f5\u00f6\7\5\2\2"+
		"\u00f6\u00f7\7\33\2\2\u00f7\u00f8\7\26\2\2\u00f8\u00f9\7 \2\2\u00f9%\3"+
		"\2\2\2\u00fa\u00fb\b\24\1\2\u00fb\u00fc\7\32\2\2\u00fc\u00fd\5&\24\2\u00fd"+
		"\u00fe\7\33\2\2\u00fe\u0102\3\2\2\2\u00ff\u0102\5(\25\2\u0100\u0102\t"+
		"\3\2\2\u0101\u00fa\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u010b\3\2\2\2\u0103\u0104\f\6\2\2\u0104\u0105\7\6\2\2\u0105\u010a\5&"+
		"\24\7\u0106\u0107\f\5\2\2\u0107\u0108\7\7\2\2\u0108\u010a\5&\24\6\u0109"+
		"\u0103\3\2\2\2\u0109\u0106\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\'\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0112"+
		"\5\n\6\2\u010f\u0112\5\16\b\2\u0110\u0112\5\f\7\2\u0111\u010e\3\2\2\2"+
		"\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112)\3\2\2\2\u0113\u0116\5"+
		"\2\2\2\u0114\u0116\5\22\n\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118+\3\2\2\2"+
		"\36\64AGQadfot~\u008b\u008e\u0095\u00a2\u00b0\u00ba\u00c3\u00c7\u00d1"+
		"\u00e3\u00ed\u00ef\u0101\u0109\u010b\u0111\u0115\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}