// Generated from grammar/MiniLangLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, INTEGER=2, BOOLEAN=3, BEGIN=4, END=5, WHILE=6, DO=7, READ=8, 
		VAR=9, FALSE=10, TRUE=11, WRITE=12, STRING=13, IF=14, THEN=15, ELSE=16, 
		COMENTARIO=17, OPAD=18, OPMULT=19, OPREL=20, OPLOG=21, OPNEG=22, PVIG=23, 
		PONTO=24, ATRIB=25, DPONTOS=26, VIG=27, ABPAR=28, FPAR=29, CADEIA=30, 
		ID=31, CTE=32, EB=33, ERRO=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", "END", "WHILE", "DO", "READ", 
			"VAR", "FALSE", "TRUE", "WRITE", "STRING", "IF", "THEN", "ELSE", "COMENTARIO", 
			"OPAD", "OPMULT", "OPREL", "OPLOG", "OPNEG", "PVIG", "PONTO", "ATRIB", 
			"DPONTOS", "VIG", "ABPAR", "FPAR", "CADEIA", "ID", "CTE", "EB", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'~'", "';'", 
			"'.'", "':='", "':'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", "END", "WHILE", "DO", 
			"READ", "VAR", "FALSE", "TRUE", "WRITE", "STRING", "IF", "THEN", "ELSE", 
			"COMENTARIO", "OPAD", "OPMULT", "OPREL", "OPLOG", "OPNEG", "PVIG", "PONTO", 
			"ATRIB", "DPONTOS", "VIG", "ABPAR", "FPAR", "CADEIA", "ID", "CTE", "EB", 
			"ERRO"
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



	    private void erroLexico() {
	        throw new RuntimeException(
	            "Erro Léxico! Linha "
	            + getLine()
	            + ": "
	            + getText()
	        );
	    }


	public MiniLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniLangLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 30:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			CTE_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			ERRO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			          if (getText().length() > 16) {
			            setText(getText().substring(0, 16));
			          }
			      
			break;
		}
	}
	private void CTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			        try {
			            int valor = Integer.parseInt(getText());

			            if (valor > 32767) {
			                throw new RuntimeException(
			                    "Erro! Linha " + getLine()
			                    + ": Valor inteiro acima do limite máximo de 2 bytes : "
			                    + getText()
			                );
			            }
			        }
			        catch (NumberFormatException e) {
			            throw new RuntimeException(
			                "Erro! Linha " + getLine()
			                + ": Valor inteiro acima do limite máximo de 2 bytes : "
			                + getText()
			            );
			        }
			    
			break;
		}
	}
	private void ERRO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 erroLexico(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\7\22\u00a5\n\22\f\22\16\22\u00a8\13\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b9\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00c0\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\7\37\u00d5\n\37"+
		"\f\37\16\37\u00d8\13\37\3\37\3\37\3 \3 \7 \u00de\n \f \16 \u00e1\13 \3"+
		" \3 \3!\5!\u00e6\n!\3!\6!\u00e9\n!\r!\16!\u00ea\3!\3!\3\"\6\"\u00f0\n"+
		"\"\r\"\16\"\u00f1\3\"\3\"\3#\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\36\4\2RRrr\4\2"+
		"TTtt\4\2QQqq\4\2IIii\4\2CCcc\4\2OOoo\4\2KKkk\4\2PPpp\4\2VVvv\4\2GGgg\4"+
		"\2DDdd\4\2NNnn\4\2FFff\4\2YYyy\4\2JJjj\4\2XXxx\4\2HHhh\4\2UUuu\4\2WWw"+
		"w\4\2\f\f\17\17\4\2--//\4\2,,\61\61\4\2>>@@\5\2\f\f\17\17$$\4\2C\\c|\5"+
		"\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0102\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5O\3\2\2\2\7W\3\2\2\2"+
		"\t_\3\2\2\2\13e\3\2\2\2\ri\3\2\2\2\17o\3\2\2\2\21r\3\2\2\2\23w\3\2\2\2"+
		"\25{\3\2\2\2\27\u0081\3\2\2\2\31\u0086\3\2\2\2\33\u008c\3\2\2\2\35\u0093"+
		"\3\2\2\2\37\u0096\3\2\2\2!\u009b\3\2\2\2#\u00a0\3\2\2\2%\u00ab\3\2\2\2"+
		"\'\u00ad\3\2\2\2)\u00b8\3\2\2\2+\u00bf\3\2\2\2-\u00c1\3\2\2\2/\u00c3\3"+
		"\2\2\2\61\u00c5\3\2\2\2\63\u00c7\3\2\2\2\65\u00ca\3\2\2\2\67\u00cc\3\2"+
		"\2\29\u00ce\3\2\2\2;\u00d0\3\2\2\2=\u00d2\3\2\2\2?\u00db\3\2\2\2A\u00e5"+
		"\3\2\2\2C\u00ef\3\2\2\2E\u00f5\3\2\2\2GH\t\2\2\2HI\t\3\2\2IJ\t\4\2\2J"+
		"K\t\5\2\2KL\t\3\2\2LM\t\6\2\2MN\t\7\2\2N\4\3\2\2\2OP\t\b\2\2PQ\t\t\2\2"+
		"QR\t\n\2\2RS\t\13\2\2ST\t\5\2\2TU\t\13\2\2UV\t\3\2\2V\6\3\2\2\2WX\t\f"+
		"\2\2XY\t\4\2\2YZ\t\4\2\2Z[\t\r\2\2[\\\t\13\2\2\\]\t\6\2\2]^\t\t\2\2^\b"+
		"\3\2\2\2_`\t\f\2\2`a\t\13\2\2ab\t\5\2\2bc\t\b\2\2cd\t\t\2\2d\n\3\2\2\2"+
		"ef\t\13\2\2fg\t\t\2\2gh\t\16\2\2h\f\3\2\2\2ij\t\17\2\2jk\t\20\2\2kl\t"+
		"\b\2\2lm\t\r\2\2mn\t\13\2\2n\16\3\2\2\2op\t\16\2\2pq\t\4\2\2q\20\3\2\2"+
		"\2rs\t\3\2\2st\t\13\2\2tu\t\6\2\2uv\t\16\2\2v\22\3\2\2\2wx\t\21\2\2xy"+
		"\t\6\2\2yz\t\3\2\2z\24\3\2\2\2{|\t\22\2\2|}\t\6\2\2}~\t\r\2\2~\177\t\23"+
		"\2\2\177\u0080\t\13\2\2\u0080\26\3\2\2\2\u0081\u0082\t\n\2\2\u0082\u0083"+
		"\t\3\2\2\u0083\u0084\t\24\2\2\u0084\u0085\t\13\2\2\u0085\30\3\2\2\2\u0086"+
		"\u0087\t\17\2\2\u0087\u0088\t\3\2\2\u0088\u0089\t\b\2\2\u0089\u008a\t"+
		"\n\2\2\u008a\u008b\t\13\2\2\u008b\32\3\2\2\2\u008c\u008d\t\23\2\2\u008d"+
		"\u008e\t\n\2\2\u008e\u008f\t\3\2\2\u008f\u0090\t\b\2\2\u0090\u0091\t\t"+
		"\2\2\u0091\u0092\t\5\2\2\u0092\34\3\2\2\2\u0093\u0094\t\b\2\2\u0094\u0095"+
		"\t\22\2\2\u0095\36\3\2\2\2\u0096\u0097\t\n\2\2\u0097\u0098\t\20\2\2\u0098"+
		"\u0099\t\13\2\2\u0099\u009a\t\t\2\2\u009a \3\2\2\2\u009b\u009c\t\13\2"+
		"\2\u009c\u009d\t\r\2\2\u009d\u009e\t\23\2\2\u009e\u009f\t\13\2\2\u009f"+
		"\"\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a6\3\2\2"+
		"\2\u00a3\u00a5\n\25\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00aa\b\22\2\2\u00aa$\3\2\2\2\u00ab\u00ac\t\26\2\2\u00ac&\3"+
		"\2\2\2\u00ad\u00ae\t\27\2\2\u00ae(\3\2\2\2\u00af\u00b0\7@\2\2\u00b0\u00b9"+
		"\7?\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b9\7?\2\2\u00b3\u00b4\7?\2\2\u00b4"+
		"\u00b9\7?\2\2\u00b5\u00b6\7>\2\2\u00b6\u00b9\7@\2\2\u00b7\u00b9\t\30\2"+
		"\2\u00b8\u00af\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b5"+
		"\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9*\3\2\2\2\u00ba\u00bb\t\4\2\2\u00bb"+
		"\u00c0\t\3\2\2\u00bc\u00bd\t\6\2\2\u00bd\u00be\t\t\2\2\u00be\u00c0\t\16"+
		"\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0,\3\2\2\2\u00c1\u00c2"+
		"\7\u0080\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7=\2\2\u00c4\60\3\2\2\2\u00c5"+
		"\u00c6\7\60\2\2\u00c6\62\3\2\2\2\u00c7\u00c8\7<\2\2\u00c8\u00c9\7?\2\2"+
		"\u00c9\64\3\2\2\2\u00ca\u00cb\7<\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\7.\2"+
		"\2\u00cd8\3\2\2\2\u00ce\u00cf\7*\2\2\u00cf:\3\2\2\2\u00d0\u00d1\7+\2\2"+
		"\u00d1<\3\2\2\2\u00d2\u00d6\7$\2\2\u00d3\u00d5\n\31\2\2\u00d4\u00d3\3"+
		"\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7$\2\2\u00da>\3\2\2\2\u00db"+
		"\u00df\t\32\2\2\u00dc\u00de\t\33\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\b \3\2\u00e3@\3\2\2\2\u00e4\u00e6\t\26\2\2"+
		"\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9"+
		"\t\34\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b!\4\2\u00edB\3\2"+
		"\2\2\u00ee\u00f0\t\35\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\""+
		"\2\2\u00f4D\3\2\2\2\u00f5\u00f6\13\2\2\2\u00f6\u00f7\b#\5\2\u00f7F\3\2"+
		"\2\2\13\2\u00a6\u00b8\u00bf\u00d6\u00df\u00e5\u00ea\u00f1\6\b\2\2\3 \2"+
		"\3!\3\3#\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}