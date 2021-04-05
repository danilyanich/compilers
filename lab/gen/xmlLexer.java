// Generated from D:/Projects/ANTLR-compiler/src/main/antlr4\xml.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xmlLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ARRAY_TYPE", "TYPE", "ACTION_OPERATOR", "BOOL_OPERATOR", "DOCUMENT", 
			"NODE", "ATTRIBUTE", "STRING", "INT", "FLOAT", "ELSE", "IF", "FOR", "WHILE", 
			"IN", "AND", "OR", "NEW", "NAME", "NUMBER_LITERAL", "STRING_LITERAL", 
			"WHITESPACE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_SQUAR_EBRACKET", 
			"CLOSE_SQUARE_BRACKET", "OPEN_FIGURE_BRACKET", "CLOSE_FIGURE_BRACKET", 
			"SEMICOLON", "QOUTES_ONE", "QOUTES_TWO", "ASSIGMENT", "SUM_ASSIGMENT", 
			"DOT", "MORE_THAN", "LESS_THAN", "EQUAL", "NOT_EQUAL", "MORE_EQUAL", 
			"LESS_EQUAL", "PlUS", "MINUS", "MULTIPLICATION", "DIVISION", "COMMENT"
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


	public xmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xml.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u012f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\5\5r\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6z\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\6\25\u00c6\n\25\r\25"+
		"\16\25\u00c7\3\26\6\26\u00cb\n\26\r\26\16\26\u00cc\3\26\3\26\6\26\u00d1"+
		"\n\26\r\26\16\26\u00d2\5\26\u00d5\n\26\3\27\3\27\7\27\u00d9\n\27\f\27"+
		"\16\27\u00dc\13\27\3\27\3\27\3\27\3\27\7\27\u00e2\n\27\f\27\16\27\u00e5"+
		"\13\27\3\27\3\27\5\27\u00e9\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\7/\u0124\n/\f/\16/\u0127\13/\3/"+
		"\5/\u012a\n/\3/\3/\3/\3/\4\u00da\u00e3\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60\3\2\6\4\2C\\c|\3\2\62;\4\2\13\f\"\"\4\2\f\f\17\17\2\u0144"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3"+
		"\2\2\2\7k\3\2\2\2\tq\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17\u0084\3\2\2\2\21"+
		"\u0089\3\2\2\2\23\u0093\3\2\2\2\25\u009a\3\2\2\2\27\u009e\3\2\2\2\31\u00a4"+
		"\3\2\2\2\33\u00a9\3\2\2\2\35\u00ac\3\2\2\2\37\u00b0\3\2\2\2!\u00b6\3\2"+
		"\2\2#\u00b9\3\2\2\2%\u00bd\3\2\2\2\'\u00c0\3\2\2\2)\u00c5\3\2\2\2+\u00ca"+
		"\3\2\2\2-\u00e8\3\2\2\2/\u00ea\3\2\2\2\61\u00ee\3\2\2\2\63\u00f0\3\2\2"+
		"\2\65\u00f2\3\2\2\2\67\u00f4\3\2\2\29\u00f6\3\2\2\2;\u00f8\3\2\2\2=\u00fa"+
		"\3\2\2\2?\u00fc\3\2\2\2A\u00fe\3\2\2\2C\u0100\3\2\2\2E\u0102\3\2\2\2G"+
		"\u0105\3\2\2\2I\u0107\3\2\2\2K\u0109\3\2\2\2M\u010b\3\2\2\2O\u010e\3\2"+
		"\2\2Q\u0111\3\2\2\2S\u0114\3\2\2\2U\u0117\3\2\2\2W\u0119\3\2\2\2Y\u011b"+
		"\3\2\2\2[\u011d\3\2\2\2]\u011f\3\2\2\2_`\7.\2\2`\4\3\2\2\2ab\5\7\4\2b"+
		"c\5\65\33\2cd\5\67\34\2d\6\3\2\2\2el\5\r\7\2fl\5\17\b\2gl\5\21\t\2hl\5"+
		"\23\n\2il\5\25\13\2jl\5\27\f\2ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2"+
		"ki\3\2\2\2kj\3\2\2\2l\b\3\2\2\2mr\5U+\2nr\5W,\2or\5Y-\2pr\5[.\2qm\3\2"+
		"\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\n\3\2\2\2sz\5I%\2tz\5Q)\2uz\5K&\2"+
		"vz\5S*\2wz\5M\'\2xz\5O(\2ys\3\2\2\2yt\3\2\2\2yu\3\2\2\2yv\3\2\2\2yw\3"+
		"\2\2\2yx\3\2\2\2z\f\3\2\2\2{|\7f\2\2|}\7q\2\2}~\7e\2\2~\177\7w\2\2\177"+
		"\u0080\7o\2\2\u0080\u0081\7g\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2"+
		"\u0083\16\3\2\2\2\u0084\u0085\7p\2\2\u0085\u0086\7q\2\2\u0086\u0087\7"+
		"f\2\2\u0087\u0088\7g\2\2\u0088\20\3\2\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7v\2\2\u008b\u008c\7v\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e"+
		"\u008f\7d\2\2\u008f\u0090\7w\2\2\u0090\u0091\7v\2\2\u0091\u0092\7g\2\2"+
		"\u0092\22\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7v\2\2\u0095\u0096\7"+
		"t\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7i\2\2\u0099\24"+
		"\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d"+
		"\26\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7q\2\2\u00a1"+
		"\u00a2\7c\2\2\u00a2\u00a3\7v\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8\32\3\2\2\2\u00a9"+
		"\u00aa\7k\2\2\u00aa\u00ab\7h\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7t\2\2\u00af\36\3\2\2\2\u00b0\u00b1\7y\2\2\u00b1"+
		"\u00b2\7j\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5 \3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\"\3\2\2\2"+
		"\u00b9\u00ba\7c\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7f\2\2\u00bc$\3\2\2"+
		"\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf&\3\2\2\2\u00c0\u00c1\7"+
		"p\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7y\2\2\u00c3(\3\2\2\2\u00c4\u00c6"+
		"\t\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8*\3\2\2\2\u00c9\u00cb\t\3\2\2\u00ca\u00c9\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d4"+
		"\3\2\2\2\u00ce\u00d0\7\60\2\2\u00cf\u00d1\t\3\2\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5"+
		"\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5,\3\2\2\2\u00d6"+
		"\u00da\5? \2\u00d7\u00d9\13\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\5? \2\u00de\u00e9\3\2\2\2\u00df\u00e3\5A!\2"+
		"\u00e0\u00e2\13\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\5A!\2\u00e7\u00e9\3\2\2\2\u00e8\u00d6\3\2\2\2\u00e8\u00df\3\2\2"+
		"\2\u00e9.\3\2\2\2\u00ea\u00eb\t\4\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\b\30\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\7*\2\2\u00ef\62\3\2\2\2\u00f0\u00f1"+
		"\7+\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7]\2\2\u00f3\66\3\2\2\2\u00f4\u00f5"+
		"\7_\2\2\u00f58\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7:\3\2\2\2\u00f8\u00f9\7"+
		"\177\2\2\u00f9<\3\2\2\2\u00fa\u00fb\7=\2\2\u00fb>\3\2\2\2\u00fc\u00fd"+
		"\7)\2\2\u00fd@\3\2\2\2\u00fe\u00ff\7$\2\2\u00ffB\3\2\2\2\u0100\u0101\7"+
		"?\2\2\u0101D\3\2\2\2\u0102\u0103\7-\2\2\u0103\u0104\7?\2\2\u0104F\3\2"+
		"\2\2\u0105\u0106\7\60\2\2\u0106H\3\2\2\2\u0107\u0108\7@\2\2\u0108J\3\2"+
		"\2\2\u0109\u010a\7>\2\2\u010aL\3\2\2\2\u010b\u010c\7?\2\2\u010c\u010d"+
		"\7?\2\2\u010dN\3\2\2\2\u010e\u010f\7#\2\2\u010f\u0110\7?\2\2\u0110P\3"+
		"\2\2\2\u0111\u0112\7@\2\2\u0112\u0113\7?\2\2\u0113R\3\2\2\2\u0114\u0115"+
		"\7>\2\2\u0115\u0116\7?\2\2\u0116T\3\2\2\2\u0117\u0118\7-\2\2\u0118V\3"+
		"\2\2\2\u0119\u011a\7/\2\2\u011aX\3\2\2\2\u011b\u011c\7,\2\2\u011cZ\3\2"+
		"\2\2\u011d\u011e\7\61\2\2\u011e\\\3\2\2\2\u011f\u0120\7\61\2\2\u0120\u0121"+
		"\7\61\2\2\u0121\u0125\3\2\2\2\u0122\u0124\n\5\2\2\u0123\u0122\3\2\2\2"+
		"\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\7\17\2\2\u0129\u0128\3\2\2\2"+
		"\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\f\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\b/\2\2\u012e^\3\2\2\2\17\2kqy\u00c7\u00cc\u00d2\u00d4"+
		"\u00da\u00e3\u00e8\u0125\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}