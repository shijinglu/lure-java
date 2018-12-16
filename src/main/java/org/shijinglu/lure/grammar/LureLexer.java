// Generated from /Users/DaisyZhu/workspace/openab/lure.java/antlr4/Lure.g4 by ANTLR 4.7.1
package org.shijinglu.lure.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LureLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, TK_INT_LITERAL=4, TK_DOUBLE_LITERAL=5, TK_STRING_LITERAL=6, 
		TK_AND=7, TK_OR=8, TK_EQ=9, TK_NE=10, TK_GT=11, TK_LT=12, TK_GE=13, TK_LE=14, 
		TK_NOT=15, TK_BETWEEN=16, TK_IN=17, TK_LIKE=18, TK_BOOLEAN_LITERAL=19, 
		TK_IDENTIFIER=20, SPACES=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "TK_INT_LITERAL", "TK_DOUBLE_LITERAL", "TK_STRING_LITERAL", 
		"TK_AND", "TK_OR", "TK_EQ", "TK_NE", "TK_GT", "TK_LT", "TK_GE", "TK_LE", 
		"TK_NOT", "TK_BETWEEN", "TK_IN", "TK_LIKE", "TK_BOOLEAN_LITERAL", "TK_IDENTIFIER", 
		"SPACES", "DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z"
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


	public LureLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lure.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u013b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\5\5k\n\5\3\5\6\5n\n\5\r\5\16\5o\3\6\6\6s\n\6\r\6\16\6t\3\6\3\6\7"+
		"\6y\n\6\f\6\16\6|\13\6\5\6~\n\6\3\6\3\6\5\6\u0082\n\6\3\6\6\6\u0085\n"+
		"\6\r\6\16\6\u0086\5\6\u0089\n\6\3\6\3\6\6\6\u008d\n\6\r\6\16\6\u008e\3"+
		"\6\3\6\5\6\u0093\n\6\3\6\6\6\u0096\n\6\r\6\16\6\u0097\5\6\u009a\n\6\5"+
		"\6\u009c\n\6\3\7\3\7\7\7\u00a0\n\7\f\7\16\7\u00a3\13\7\3\7\3\7\3\7\7\7"+
		"\u00a8\n\7\f\7\16\7\u00ab\13\7\3\7\3\7\3\7\7\7\u00b0\n\7\f\7\16\7\u00b3"+
		"\13\7\3\7\5\7\u00b6\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00be\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00c5\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00dc\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00f9\n\24\3\25\3\25\7\25\u00fd\n\25\f\25\16\25\u0100\13\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\2\63\2\65\2\67"+
		"\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2\3\2"+
		"$\4\2--//\5\2\f\f\17\17$$\5\2\f\f\17\17))\5\2\f\f\17\17bb\5\2C\\aac|\7"+
		"\2\60\60\62;C\\aac|\5\2\13\r\17\17\"\"\3\2\62;\4\2CCcc\4\2DDdd\4\2EEe"+
		"e\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2"+
		"NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0136\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2\2\2\t"+
		"j\3\2\2\2\13\u009b\3\2\2\2\r\u00b5\3\2\2\2\17\u00bd\3\2\2\2\21\u00c4\3"+
		"\2\2\2\23\u00c6\3\2\2\2\25\u00c9\3\2\2\2\27\u00cc\3\2\2\2\31\u00ce\3\2"+
		"\2\2\33\u00d0\3\2\2\2\35\u00d3\3\2\2\2\37\u00db\3\2\2\2!\u00dd\3\2\2\2"+
		"#\u00e5\3\2\2\2%\u00e8\3\2\2\2\'\u00f8\3\2\2\2)\u00fa\3\2\2\2+\u0101\3"+
		"\2\2\2-\u0105\3\2\2\2/\u0107\3\2\2\2\61\u0109\3\2\2\2\63\u010b\3\2\2\2"+
		"\65\u010d\3\2\2\2\67\u010f\3\2\2\29\u0111\3\2\2\2;\u0113\3\2\2\2=\u0115"+
		"\3\2\2\2?\u0117\3\2\2\2A\u0119\3\2\2\2C\u011b\3\2\2\2E\u011d\3\2\2\2G"+
		"\u011f\3\2\2\2I\u0121\3\2\2\2K\u0123\3\2\2\2M\u0125\3\2\2\2O\u0127\3\2"+
		"\2\2Q\u0129\3\2\2\2S\u012b\3\2\2\2U\u012d\3\2\2\2W\u012f\3\2\2\2Y\u0131"+
		"\3\2\2\2[\u0133\3\2\2\2]\u0135\3\2\2\2_\u0137\3\2\2\2a\u0139\3\2\2\2c"+
		"d\7.\2\2d\4\3\2\2\2ef\7*\2\2f\6\3\2\2\2gh\7+\2\2h\b\3\2\2\2ik\7/\2\2j"+
		"i\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\4\62;\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2p\n\3\2\2\2qs\5-\27\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2"+
		"\2u}\3\2\2\2vz\7\60\2\2wy\5-\27\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2"+
		"\2\2{~\3\2\2\2|z\3\2\2\2}v\3\2\2\2}~\3\2\2\2~\u0088\3\2\2\2\177\u0081"+
		"\5\67\34\2\u0080\u0082\t\2\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2"+
		"\u0082\u0084\3\2\2\2\u0083\u0085\5-\27\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\177\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u009c\3\2\2\2\u008a\u008c\7\60"+
		"\2\2\u008b\u008d\5-\27\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0099\3\2\2\2\u0090\u0092\5\67"+
		"\34\2\u0091\u0093\t\2\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0096\5-\27\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0090\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009br\3\2\2\2"+
		"\u009b\u008a\3\2\2\2\u009c\f\3\2\2\2\u009d\u00a1\7$\2\2\u009e\u00a0\n"+
		"\3\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00b6\7$"+
		"\2\2\u00a5\u00a9\7)\2\2\u00a6\u00a8\n\4\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b6\7)\2\2\u00ad\u00b1\7b\2\2\u00ae\u00b0"+
		"\n\5\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\7b"+
		"\2\2\u00b5\u009d\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b6"+
		"\16\3\2\2\2\u00b7\u00b8\5/\30\2\u00b8\u00b9\5I%\2\u00b9\u00ba\5\65\33"+
		"\2\u00ba\u00be\3\2\2\2\u00bb\u00bc\7(\2\2\u00bc\u00be\7(\2\2\u00bd\u00b7"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\20\3\2\2\2\u00bf\u00c0\5K&\2\u00c0"+
		"\u00c1\5Q)\2\u00c1\u00c5\3\2\2\2\u00c2\u00c3\7~\2\2\u00c3\u00c5\7~\2\2"+
		"\u00c4\u00bf\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\22\3\2\2\2\u00c6\u00c7"+
		"\7?\2\2\u00c7\u00c8\7?\2\2\u00c8\24\3\2\2\2\u00c9\u00ca\7#\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb\26\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\30\3\2\2\2\u00ce\u00cf"+
		"\7>\2\2\u00cf\32\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1\u00d2\7?\2\2\u00d2\34"+
		"\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4\u00d5\7?\2\2\u00d5\36\3\2\2\2\u00d6"+
		"\u00d7\5I%\2\u00d7\u00d8\5K&\2\u00d8\u00d9\5U+\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00dc\7#\2\2\u00db\u00d6\3\2\2\2\u00db\u00da\3\2\2\2\u00dc \3\2\2\2\u00dd"+
		"\u00de\5\61\31\2\u00de\u00df\5\67\34\2\u00df\u00e0\5U+\2\u00e0\u00e1\5"+
		"[.\2\u00e1\u00e2\5\67\34\2\u00e2\u00e3\5\67\34\2\u00e3\u00e4\5I%\2\u00e4"+
		"\"\3\2\2\2\u00e5\u00e6\5? \2\u00e6\u00e7\5I%\2\u00e7$\3\2\2\2\u00e8\u00e9"+
		"\5E#\2\u00e9\u00ea\5? \2\u00ea\u00eb\5C\"\2\u00eb\u00ec\5\67\34\2\u00ec"+
		"&\3\2\2\2\u00ed\u00ee\5U+\2\u00ee\u00ef\5Q)\2\u00ef\u00f0\5W,\2\u00f0"+
		"\u00f1\5\67\34\2\u00f1\u00f9\3\2\2\2\u00f2\u00f3\59\35\2\u00f3\u00f4\5"+
		"/\30\2\u00f4\u00f5\5E#\2\u00f5\u00f6\5S*\2\u00f6\u00f7\5\67\34\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f9(\3\2\2\2"+
		"\u00fa\u00fe\t\6\2\2\u00fb\u00fd\t\7\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff*\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\t\b\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b\26"+
		"\2\2\u0104,\3\2\2\2\u0105\u0106\t\t\2\2\u0106.\3\2\2\2\u0107\u0108\t\n"+
		"\2\2\u0108\60\3\2\2\2\u0109\u010a\t\13\2\2\u010a\62\3\2\2\2\u010b\u010c"+
		"\t\f\2\2\u010c\64\3\2\2\2\u010d\u010e\t\r\2\2\u010e\66\3\2\2\2\u010f\u0110"+
		"\t\16\2\2\u01108\3\2\2\2\u0111\u0112\t\17\2\2\u0112:\3\2\2\2\u0113\u0114"+
		"\t\20\2\2\u0114<\3\2\2\2\u0115\u0116\t\21\2\2\u0116>\3\2\2\2\u0117\u0118"+
		"\t\22\2\2\u0118@\3\2\2\2\u0119\u011a\t\23\2\2\u011aB\3\2\2\2\u011b\u011c"+
		"\t\24\2\2\u011cD\3\2\2\2\u011d\u011e\t\25\2\2\u011eF\3\2\2\2\u011f\u0120"+
		"\t\26\2\2\u0120H\3\2\2\2\u0121\u0122\t\27\2\2\u0122J\3\2\2\2\u0123\u0124"+
		"\t\30\2\2\u0124L\3\2\2\2\u0125\u0126\t\31\2\2\u0126N\3\2\2\2\u0127\u0128"+
		"\t\32\2\2\u0128P\3\2\2\2\u0129\u012a\t\33\2\2\u012aR\3\2\2\2\u012b\u012c"+
		"\t\34\2\2\u012cT\3\2\2\2\u012d\u012e\t\35\2\2\u012eV\3\2\2\2\u012f\u0130"+
		"\t\36\2\2\u0130X\3\2\2\2\u0131\u0132\t\37\2\2\u0132Z\3\2\2\2\u0133\u0134"+
		"\t \2\2\u0134\\\3\2\2\2\u0135\u0136\t!\2\2\u0136^\3\2\2\2\u0137\u0138"+
		"\t\"\2\2\u0138`\3\2\2\2\u0139\u013a\t#\2\2\u013ab\3\2\2\2\31\2jotz}\u0081"+
		"\u0086\u0088\u008e\u0092\u0097\u0099\u009b\u00a1\u00a9\u00b1\u00b5\u00bd"+
		"\u00c4\u00db\u00f8\u00fe\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}