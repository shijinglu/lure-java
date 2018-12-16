// Generated from /Users/DaisyZhu/workspace/openab/lure.java/antlr4/Lure.g4 by ANTLR 4.7.1
package org.shijinglu.lure.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LureParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, TK_INT_LITERAL=4, TK_DOUBLE_LITERAL=5, TK_STRING_LITERAL=6, 
		TK_AND=7, TK_OR=8, TK_EQ=9, TK_NE=10, TK_GT=11, TK_LT=12, TK_GE=13, TK_LE=14, 
		TK_NOT=15, TK_BETWEEN=16, TK_IN=17, TK_LIKE=18, TK_BOOLEAN_LITERAL=19, 
		TK_IDENTIFIER=20, SPACES=21;
	public static final int
		RULE_expr_list = 0, RULE_expr = 1, RULE_cmp_op = 2, RULE_literal_value = 3;
	public static final String[] ruleNames = {
		"expr_list", "expr", "cmp_op", "literal_value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'('", "')'", null, null, null, null, null, "'=='", "'!='", 
		"'>'", "'<'", "'>='", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "TK_INT_LITERAL", "TK_DOUBLE_LITERAL", "TK_STRING_LITERAL", 
		"TK_AND", "TK_OR", "TK_EQ", "TK_NE", "TK_GT", "TK_LT", "TK_GE", "TK_LE", 
		"TK_NOT", "TK_BETWEEN", "TK_IN", "TK_LIKE", "TK_BOOLEAN_LITERAL", "TK_IDENTIFIER", 
		"SPACES"
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
	public String getGrammarFileName() { return "Lure.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LureParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Expr_listContext extends ParserRuleContext {
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	 
		public Expr_listContext() { }
		public void copyFrom(Expr_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprListAppendContext extends Expr_listContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprListAppendContext(Expr_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprListAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprListAppend(this);
		}
	}
	public static class ExprListUnaryContext extends Expr_listContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprListUnaryContext(Expr_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprListUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprListUnary(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		return expr_list(0);
	}

	private Expr_listContext expr_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_listContext _localctx = new Expr_listContext(_ctx, _parentState);
		Expr_listContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprListUnaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(9);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(16);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprListAppendContext(new Expr_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_list);
					setState(11);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(12);
					match(T__0);
					setState(13);
					expr(0);
					}
					} 
				}
				setState(18);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprDoubleOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Cmp_opContext cmp_op() {
			return getRuleContext(Cmp_opContext.class,0);
		}
		public ExprDoubleOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprDoubleOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprDoubleOp(this);
		}
	}
	public static class ExprInOpContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_IN() { return getToken(LureParser.TK_IN, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public ExprInOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprInOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprInOp(this);
		}
	}
	public static class ExprFunctionContext extends ExprContext {
		public TerminalNode TK_IDENTIFIER() { return getToken(LureParser.TK_IDENTIFIER, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public ExprFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprFunction(this);
		}
	}
	public static class ExprBetweenOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_BETWEEN() { return getToken(LureParser.TK_BETWEEN, 0); }
		public TerminalNode TK_AND() { return getToken(LureParser.TK_AND, 0); }
		public ExprBetweenOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprBetweenOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprBetweenOp(this);
		}
	}
	public static class ExprOrOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_OR() { return getToken(LureParser.TK_OR, 0); }
		public ExprOrOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprOrOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprOrOp(this);
		}
	}
	public static class ExprAndOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_AND() { return getToken(LureParser.TK_AND, 0); }
		public ExprAndOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprAndOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprAndOp(this);
		}
	}
	public static class ExprLiteralValueContext extends ExprContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public ExprLiteralValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprLiteralValue(this);
		}
	}
	public static class ExprGroupContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprGroupContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprGroup(this);
		}
	}
	public static class ExprNotInOpContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_NOT() { return getToken(LureParser.TK_NOT, 0); }
		public TerminalNode TK_IN() { return getToken(LureParser.TK_IN, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public ExprNotInOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprNotInOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprNotInOp(this);
		}
	}
	public static class ExprUnaryOpContext extends ExprContext {
		public TerminalNode TK_NOT() { return getToken(LureParser.TK_NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprUnaryOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprUnaryOp(this);
		}
	}
	public static class ExprLikeOpContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_LIKE() { return getToken(LureParser.TK_LIKE, 0); }
		public TerminalNode TK_STRING_LITERAL() { return getToken(LureParser.TK_STRING_LITERAL, 0); }
		public ExprLikeOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterExprLikeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitExprLikeOp(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ExprLiteralValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(20);
				literal_value();
				}
				break;
			case 2:
				{
				_localctx = new ExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(TK_IDENTIFIER);
				setState(22);
				match(T__1);
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << TK_INT_LITERAL) | (1L << TK_DOUBLE_LITERAL) | (1L << TK_STRING_LITERAL) | (1L << TK_NOT) | (1L << TK_BOOLEAN_LITERAL) | (1L << TK_IDENTIFIER))) != 0)) {
					{
					setState(23);
					expr_list(0);
					}
				}

				setState(26);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new ExprUnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(TK_NOT);
				setState(28);
				expr(2);
				}
				break;
			case 4:
				{
				_localctx = new ExprGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(T__1);
				setState(30);
				expr(0);
				setState(31);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprDoubleOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(35);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(36);
						cmp_op();
						setState(37);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprBetweenOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(39);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(40);
						match(TK_BETWEEN);
						setState(41);
						expr(0);
						setState(42);
						match(TK_AND);
						setState(43);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprAndOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(45);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(46);
						match(TK_AND);
						setState(47);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprOrOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(49);
						match(TK_OR);
						setState(50);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprInOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(52);
						match(TK_IN);
						setState(53);
						match(T__1);
						setState(54);
						expr_list(0);
						setState(55);
						match(T__2);
						}
						break;
					case 6:
						{
						_localctx = new ExprNotInOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(58);
						match(TK_NOT);
						setState(59);
						match(TK_IN);
						setState(60);
						match(T__1);
						setState(61);
						expr_list(0);
						setState(62);
						match(T__2);
						}
						break;
					case 7:
						{
						_localctx = new ExprLikeOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(65);
						match(TK_LIKE);
						setState(66);
						match(TK_STRING_LITERAL);
						}
						break;
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Cmp_opContext extends ParserRuleContext {
		public TerminalNode TK_EQ() { return getToken(LureParser.TK_EQ, 0); }
		public TerminalNode TK_NE() { return getToken(LureParser.TK_NE, 0); }
		public TerminalNode TK_GT() { return getToken(LureParser.TK_GT, 0); }
		public TerminalNode TK_LT() { return getToken(LureParser.TK_LT, 0); }
		public TerminalNode TK_GE() { return getToken(LureParser.TK_GE, 0); }
		public TerminalNode TK_LE() { return getToken(LureParser.TK_LE, 0); }
		public Cmp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterCmp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitCmp_op(this);
		}
	}

	public final Cmp_opContext cmp_op() throws RecognitionException {
		Cmp_opContext _localctx = new Cmp_opContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_EQ) | (1L << TK_NE) | (1L << TK_GT) | (1L << TK_LT) | (1L << TK_GE) | (1L << TK_LE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode TK_INT_LITERAL() { return getToken(LureParser.TK_INT_LITERAL, 0); }
		public TerminalNode TK_DOUBLE_LITERAL() { return getToken(LureParser.TK_DOUBLE_LITERAL, 0); }
		public TerminalNode TK_STRING_LITERAL() { return getToken(LureParser.TK_STRING_LITERAL, 0); }
		public TerminalNode TK_BOOLEAN_LITERAL() { return getToken(LureParser.TK_BOOLEAN_LITERAL, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(LureParser.TK_IDENTIFIER, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LureListener ) ((LureListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_INT_LITERAL) | (1L << TK_DOUBLE_LITERAL) | (1L << TK_STRING_LITERAL) | (1L << TK_BOOLEAN_LITERAL) | (1L << TK_IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expr_list_sempred((Expr_listContext)_localctx, predIndex);
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_list_sempred(Expr_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3F\n\3\f\3"+
		"\16\3I\13\3\3\4\3\4\3\5\3\5\3\5\2\4\2\4\6\2\4\6\b\2\4\3\2\13\20\4\2\6"+
		"\b\25\26\2V\2\n\3\2\2\2\4#\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\n\13\b\2\1\2"+
		"\13\f\5\4\3\2\f\22\3\2\2\2\r\16\f\3\2\2\16\17\7\3\2\2\17\21\5\4\3\2\20"+
		"\r\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\3\3\2\2\2\24\22"+
		"\3\2\2\2\25\26\b\3\1\2\26$\5\b\5\2\27\30\7\26\2\2\30\32\7\4\2\2\31\33"+
		"\5\2\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34$\7\5\2\2\35\36\7"+
		"\21\2\2\36$\5\4\3\4\37 \7\4\2\2 !\5\4\3\2!\"\7\5\2\2\"$\3\2\2\2#\25\3"+
		"\2\2\2#\27\3\2\2\2#\35\3\2\2\2#\37\3\2\2\2$G\3\2\2\2%&\f\f\2\2&\'\5\6"+
		"\4\2\'(\5\4\3\r(F\3\2\2\2)*\f\b\2\2*+\7\22\2\2+,\5\4\3\2,-\7\t\2\2-.\5"+
		"\4\3\t.F\3\2\2\2/\60\f\6\2\2\60\61\7\t\2\2\61F\5\4\3\7\62\63\f\5\2\2\63"+
		"\64\7\n\2\2\64F\5\4\3\6\65\66\f\13\2\2\66\67\7\23\2\2\678\7\4\2\289\5"+
		"\2\2\29:\7\5\2\2:F\3\2\2\2;<\f\n\2\2<=\7\21\2\2=>\7\23\2\2>?\7\4\2\2?"+
		"@\5\2\2\2@A\7\5\2\2AF\3\2\2\2BC\f\7\2\2CD\7\24\2\2DF\7\b\2\2E%\3\2\2\2"+
		"E)\3\2\2\2E/\3\2\2\2E\62\3\2\2\2E\65\3\2\2\2E;\3\2\2\2EB\3\2\2\2FI\3\2"+
		"\2\2GE\3\2\2\2GH\3\2\2\2H\5\3\2\2\2IG\3\2\2\2JK\t\2\2\2K\7\3\2\2\2LM\t"+
		"\3\2\2M\t\3\2\2\2\7\22\32#EG";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}