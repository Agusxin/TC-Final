// Generated from c:/Users/Agux/Desktop/DefinitivoTC/finaltc/src/main/java/finaltc/reglas.g4 by ANTLR 4.13.1

package finaltc;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class reglasLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLAVEA=1, LLAVEC=2, PARENA=3, PARENC=4, INT=5, DOUBLE=6, VOID=7, FLOAT=8, 
		WHILE=9, IIF=10, IFOR=11, MAS=12, MENOS=13, MULT=14, DIV=15, MENOR=16, 
		MAYOR=17, MENORIGUAL=18, MAYORIGUAL=19, IGUALES=20, DISTINTO=21, ASIG=22, 
		PYC=23, COMA=24, OR=25, AND=26, RETURN=27, ENTERO=28, ID=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "DOUBLE", 
			"VOID", "FLOAT", "WHILE", "IIF", "IFOR", "MAS", "MENOS", "MULT", "DIV", 
			"MENOR", "MAYOR", "MENORIGUAL", "MAYORIGUAL", "IGUALES", "DISTINTO", 
			"ASIG", "PYC", "COMA", "OR", "AND", "RETURN", "ENTERO", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'int'", "'double'", "'void'", "'float'", 
			"'while'", "'if'", "'for'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'='", "';'", "','", "'||'", "'&&'", 
			"'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "DOUBLE", "VOID", 
			"FLOAT", "WHILE", "IIF", "IFOR", "MAS", "MENOS", "MULT", "DIV", "MENOR", 
			"MAYOR", "MENORIGUAL", "MAYORIGUAL", "IGUALES", "DISTINTO", "ASIG", "PYC", 
			"COMA", "OR", "AND", "RETURN", "ENTERO", "ID", "WS"
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


	public reglasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "reglas.g4"; }

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
		"\u0004\u0000\u001e\u00b3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u009d\b\u001d\u000b"+
		"\u001d\f\u001d\u009e\u0001\u001e\u0001\u001e\u0003\u001e\u00a3\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u00a8\b\u001e\n\u001e"+
		"\f\u001e\u00ab\t\u001e\u0001\u001f\u0004\u001f\u00ae\b\u001f\u000b\u001f"+
		"\f\u001f\u00af\u0001\u001f\u0001\u001f\u0000\u0000 \u0001\u0000\u0003"+
		"\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006"+
		"\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f"+
		"\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u00161\u0017"+
		"3\u00185\u00197\u001a9\u001b;\u001c=\u001d?\u001e\u0001\u0000\u0003\u0002"+
		"\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u00b6\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0001A\u0001\u0000\u0000\u0000\u0003C"+
		"\u0001\u0000\u0000\u0000\u0005E\u0001\u0000\u0000\u0000\u0007G\u0001\u0000"+
		"\u0000\u0000\tI\u0001\u0000\u0000\u0000\u000bK\u0001\u0000\u0000\u0000"+
		"\rM\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000\u0011X\u0001"+
		"\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015c\u0001\u0000\u0000"+
		"\u0000\u0017i\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000\u0000\u001b"+
		"p\u0001\u0000\u0000\u0000\u001dr\u0001\u0000\u0000\u0000\u001ft\u0001"+
		"\u0000\u0000\u0000!v\u0001\u0000\u0000\u0000#x\u0001\u0000\u0000\u0000"+
		"%z\u0001\u0000\u0000\u0000\'|\u0001\u0000\u0000\u0000)\u007f\u0001\u0000"+
		"\u0000\u0000+\u0082\u0001\u0000\u0000\u0000-\u0085\u0001\u0000\u0000\u0000"+
		"/\u0088\u0001\u0000\u0000\u00001\u008a\u0001\u0000\u0000\u00003\u008c"+
		"\u0001\u0000\u0000\u00005\u008e\u0001\u0000\u0000\u00007\u0091\u0001\u0000"+
		"\u0000\u00009\u0094\u0001\u0000\u0000\u0000;\u009c\u0001\u0000\u0000\u0000"+
		"=\u00a2\u0001\u0000\u0000\u0000?\u00ad\u0001\u0000\u0000\u0000AB\u0007"+
		"\u0000\u0000\u0000B\u0002\u0001\u0000\u0000\u0000CD\u0007\u0001\u0000"+
		"\u0000D\u0004\u0001\u0000\u0000\u0000EF\u0005{\u0000\u0000F\u0006\u0001"+
		"\u0000\u0000\u0000GH\u0005}\u0000\u0000H\b\u0001\u0000\u0000\u0000IJ\u0005"+
		"(\u0000\u0000J\n\u0001\u0000\u0000\u0000KL\u0005)\u0000\u0000L\f\u0001"+
		"\u0000\u0000\u0000MN\u0005i\u0000\u0000NO\u0005n\u0000\u0000OP\u0005t"+
		"\u0000\u0000P\u000e\u0001\u0000\u0000\u0000QR\u0005d\u0000\u0000RS\u0005"+
		"o\u0000\u0000ST\u0005u\u0000\u0000TU\u0005b\u0000\u0000UV\u0005l\u0000"+
		"\u0000VW\u0005e\u0000\u0000W\u0010\u0001\u0000\u0000\u0000XY\u0005v\u0000"+
		"\u0000YZ\u0005o\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005d\u0000\u0000"+
		"\\\u0012\u0001\u0000\u0000\u0000]^\u0005f\u0000\u0000^_\u0005l\u0000\u0000"+
		"_`\u0005o\u0000\u0000`a\u0005a\u0000\u0000ab\u0005t\u0000\u0000b\u0014"+
		"\u0001\u0000\u0000\u0000cd\u0005w\u0000\u0000de\u0005h\u0000\u0000ef\u0005"+
		"i\u0000\u0000fg\u0005l\u0000\u0000gh\u0005e\u0000\u0000h\u0016\u0001\u0000"+
		"\u0000\u0000ij\u0005i\u0000\u0000jk\u0005f\u0000\u0000k\u0018\u0001\u0000"+
		"\u0000\u0000lm\u0005f\u0000\u0000mn\u0005o\u0000\u0000no\u0005r\u0000"+
		"\u0000o\u001a\u0001\u0000\u0000\u0000pq\u0005+\u0000\u0000q\u001c\u0001"+
		"\u0000\u0000\u0000rs\u0005-\u0000\u0000s\u001e\u0001\u0000\u0000\u0000"+
		"tu\u0005*\u0000\u0000u \u0001\u0000\u0000\u0000vw\u0005/\u0000\u0000w"+
		"\"\u0001\u0000\u0000\u0000xy\u0005<\u0000\u0000y$\u0001\u0000\u0000\u0000"+
		"z{\u0005>\u0000\u0000{&\u0001\u0000\u0000\u0000|}\u0005<\u0000\u0000}"+
		"~\u0005=\u0000\u0000~(\u0001\u0000\u0000\u0000\u007f\u0080\u0005>\u0000"+
		"\u0000\u0080\u0081\u0005=\u0000\u0000\u0081*\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005=\u0000\u0000\u0083\u0084\u0005=\u0000\u0000\u0084,\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005!\u0000\u0000\u0086\u0087\u0005=\u0000"+
		"\u0000\u0087.\u0001\u0000\u0000\u0000\u0088\u0089\u0005=\u0000\u0000\u0089"+
		"0\u0001\u0000\u0000\u0000\u008a\u008b\u0005;\u0000\u0000\u008b2\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005,\u0000\u0000\u008d4\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005|\u0000\u0000\u008f\u0090\u0005|\u0000\u0000\u0090"+
		"6\u0001\u0000\u0000\u0000\u0091\u0092\u0005&\u0000\u0000\u0092\u0093\u0005"+
		"&\u0000\u0000\u00938\u0001\u0000\u0000\u0000\u0094\u0095\u0005r\u0000"+
		"\u0000\u0095\u0096\u0005e\u0000\u0000\u0096\u0097\u0005t\u0000\u0000\u0097"+
		"\u0098\u0005u\u0000\u0000\u0098\u0099\u0005r\u0000\u0000\u0099\u009a\u0005"+
		"n\u0000\u0000\u009a:\u0001\u0000\u0000\u0000\u009b\u009d\u0003\u0003\u0001"+
		"\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f<\u0001\u0000\u0000\u0000\u00a0\u00a3\u0003\u0001\u0000\u0000"+
		"\u00a1\u00a3\u0005_\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a9\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a8\u0003\u0001\u0000\u0000\u00a5\u00a8\u0003\u0003\u0001\u0000\u00a6"+
		"\u00a8\u0005_\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa>\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ae\u0007\u0002\u0000\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0006\u001f\u0000\u0000\u00b2@\u0001\u0000"+
		"\u0000\u0000\u0006\u0000\u009e\u00a2\u00a7\u00a9\u00af\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}