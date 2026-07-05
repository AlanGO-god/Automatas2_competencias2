// Generated from /workspace/Ejercicios_11_a_15/Ejercicio_11/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, CLASS=2, STATIC=3, VOID=4, MAIN=5, STRING=6, INT=7, IMPRIMIR=8, 
		LLA_IZQ=9, LLA_DER=10, PAR_IZQ=11, PAR_DER=12, COR_IZQ=13, COR_DER=14, 
		ASIGN=15, MAS=16, SEMICOL=17, CADENA=18, NUM=19, IDF=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUBLIC", "CLASS", "STATIC", "VOID", "MAIN", "STRING", "INT", "IMPRIMIR", 
			"LLA_IZQ", "LLA_DER", "PAR_IZQ", "PAR_DER", "COR_IZQ", "COR_DER", "ASIGN", 
			"MAS", "SEMICOL", "CADENA", "NUM", "IDF", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'static'", "'void'", "'main'", "'String'", 
			"'int'", "'System.out.println'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"'='", "'+'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "STATIC", "VOID", "MAIN", "STRING", "INT", "IMPRIMIR", 
			"LLA_IZQ", "LLA_DER", "PAR_IZQ", "PAR_DER", "COR_IZQ", "COR_DER", "ASIGN", 
			"MAS", "SEMICOL", "CADENA", "NUM", "IDF", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\u0015\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0004\u0011|\b"+
		"\u0011\u000b\u0011\f\u0011}\u0001\u0011\u0001\u0011\u0001\u0012\u0004"+
		"\u0012\u0083\b\u0012\u000b\u0012\f\u0012\u0084\u0001\u0013\u0004\u0013"+
		"\u0088\b\u0013\u000b\u0013\f\u0013\u0089\u0001\u0014\u0004\u0014\u008d"+
		"\b\u0014\u000b\u0014\f\u0014\u008e\u0001\u0014\u0001\u0014\u0000\u0000"+
		"\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000"+
		"\u0004\u0003\u0000\n\n\r\r\"\"\u0001\u000009\u0002\u0000AZaz\u0003\u0000"+
		"\t\n\r\r  \u0095\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u00032\u0001\u0000\u0000"+
		"\u0000\u00058\u0001\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\t"+
		"D\u0001\u0000\u0000\u0000\u000bI\u0001\u0000\u0000\u0000\rP\u0001\u0000"+
		"\u0000\u0000\u000fT\u0001\u0000\u0000\u0000\u0011g\u0001\u0000\u0000\u0000"+
		"\u0013i\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000\u0000\u0017m"+
		"\u0001\u0000\u0000\u0000\u0019o\u0001\u0000\u0000\u0000\u001bq\u0001\u0000"+
		"\u0000\u0000\u001ds\u0001\u0000\u0000\u0000\u001fu\u0001\u0000\u0000\u0000"+
		"!w\u0001\u0000\u0000\u0000#y\u0001\u0000\u0000\u0000%\u0082\u0001\u0000"+
		"\u0000\u0000\'\u0087\u0001\u0000\u0000\u0000)\u008c\u0001\u0000\u0000"+
		"\u0000+,\u0005p\u0000\u0000,-\u0005u\u0000\u0000-.\u0005b\u0000\u0000"+
		"./\u0005l\u0000\u0000/0\u0005i\u0000\u000001\u0005c\u0000\u00001\u0002"+
		"\u0001\u0000\u0000\u000023\u0005c\u0000\u000034\u0005l\u0000\u000045\u0005"+
		"a\u0000\u000056\u0005s\u0000\u000067\u0005s\u0000\u00007\u0004\u0001\u0000"+
		"\u0000\u000089\u0005s\u0000\u00009:\u0005t\u0000\u0000:;\u0005a\u0000"+
		"\u0000;<\u0005t\u0000\u0000<=\u0005i\u0000\u0000=>\u0005c\u0000\u0000"+
		">\u0006\u0001\u0000\u0000\u0000?@\u0005v\u0000\u0000@A\u0005o\u0000\u0000"+
		"AB\u0005i\u0000\u0000BC\u0005d\u0000\u0000C\b\u0001\u0000\u0000\u0000"+
		"DE\u0005m\u0000\u0000EF\u0005a\u0000\u0000FG\u0005i\u0000\u0000GH\u0005"+
		"n\u0000\u0000H\n\u0001\u0000\u0000\u0000IJ\u0005S\u0000\u0000JK\u0005"+
		"t\u0000\u0000KL\u0005r\u0000\u0000LM\u0005i\u0000\u0000MN\u0005n\u0000"+
		"\u0000NO\u0005g\u0000\u0000O\f\u0001\u0000\u0000\u0000PQ\u0005i\u0000"+
		"\u0000QR\u0005n\u0000\u0000RS\u0005t\u0000\u0000S\u000e\u0001\u0000\u0000"+
		"\u0000TU\u0005S\u0000\u0000UV\u0005y\u0000\u0000VW\u0005s\u0000\u0000"+
		"WX\u0005t\u0000\u0000XY\u0005e\u0000\u0000YZ\u0005m\u0000\u0000Z[\u0005"+
		".\u0000\u0000[\\\u0005o\u0000\u0000\\]\u0005u\u0000\u0000]^\u0005t\u0000"+
		"\u0000^_\u0005.\u0000\u0000_`\u0005p\u0000\u0000`a\u0005r\u0000\u0000"+
		"ab\u0005i\u0000\u0000bc\u0005n\u0000\u0000cd\u0005t\u0000\u0000de\u0005"+
		"l\u0000\u0000ef\u0005n\u0000\u0000f\u0010\u0001\u0000\u0000\u0000gh\u0005"+
		"{\u0000\u0000h\u0012\u0001\u0000\u0000\u0000ij\u0005}\u0000\u0000j\u0014"+
		"\u0001\u0000\u0000\u0000kl\u0005(\u0000\u0000l\u0016\u0001\u0000\u0000"+
		"\u0000mn\u0005)\u0000\u0000n\u0018\u0001\u0000\u0000\u0000op\u0005[\u0000"+
		"\u0000p\u001a\u0001\u0000\u0000\u0000qr\u0005]\u0000\u0000r\u001c\u0001"+
		"\u0000\u0000\u0000st\u0005=\u0000\u0000t\u001e\u0001\u0000\u0000\u0000"+
		"uv\u0005+\u0000\u0000v \u0001\u0000\u0000\u0000wx\u0005;\u0000\u0000x"+
		"\"\u0001\u0000\u0000\u0000y{\u0005\"\u0000\u0000z|\b\u0000\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\"\u0000\u0000\u0080$\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0007\u0001\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085&\u0001\u0000\u0000\u0000\u0086\u0088\u0007"+
		"\u0002\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a(\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0003"+
		"\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0006\u0014"+
		"\u0000\u0000\u0091*\u0001\u0000\u0000\u0000\u0005\u0000}\u0084\u0089\u008e"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}