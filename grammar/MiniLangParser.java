// Generated from grammar/MiniLangParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniLangParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_decls = 1, RULE_listDecl = 2, RULE_declTip = 3, RULE_listId = 4, 
		RULE_tip = 5, RULE_cmdComp = 6, RULE_listCmd = 7, RULE_cmd = 8, RULE_cmdOthers = 9, 
		RULE_cmdIf = 10, RULE_cmdIfMatched = 11, RULE_cmdIfUnmatched = 12, RULE_cmdWhile = 13, 
		RULE_cmdRead = 14, RULE_cmdWrite = 15, RULE_listW = 16, RULE_elemW = 17, 
		RULE_cmdAtrib = 18, RULE_expr = 19, RULE_exprRel = 20, RULE_exprAd = 21, 
		RULE_exprMult = 22, RULE_fator = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decls", "listDecl", "declTip", "listId", "tip", "cmdComp", "listCmd", 
			"cmd", "cmdOthers", "cmdIf", "cmdIfMatched", "cmdIfUnmatched", "cmdWhile", 
			"cmdRead", "cmdWrite", "listW", "elemW", "cmdAtrib", "expr", "exprRel", 
			"exprAd", "exprMult", "fator"
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

	@Override
	public String getGrammarFileName() { return "MiniLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(MiniLangParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode PVIG() { return getToken(MiniLangParser.PVIG, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public CmdCompContext cmdComp() {
			return getRuleContext(CmdCompContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(MiniLangParser.PONTO, 0); }
		public TerminalNode EOF() { return getToken(MiniLangParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(PROGRAM);
			setState(49);
			match(ID);
			setState(50);
			match(PVIG);
			setState(51);
			decls();
			setState(52);
			cmdComp();
			setState(53);
			match(PONTO);
			setState(54);
			match(EOF);
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

	public static class DeclsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniLangParser.VAR, 0); }
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(56);
				match(VAR);
				setState(57);
				listDecl();
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

	public static class ListDeclContext extends ParserRuleContext {
		public List<DeclTipContext> declTip() {
			return getRuleContexts(DeclTipContext.class);
		}
		public DeclTipContext declTip(int i) {
			return getRuleContext(DeclTipContext.class,i);
		}
		public ListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterListDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitListDecl(this);
		}
	}

	public final ListDeclContext listDecl() throws RecognitionException {
		ListDeclContext _localctx = new ListDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				declTip();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class DeclTipContext extends ParserRuleContext {
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode DPONTOS() { return getToken(MiniLangParser.DPONTOS, 0); }
		public TipContext tip() {
			return getRuleContext(TipContext.class,0);
		}
		public TerminalNode PVIG() { return getToken(MiniLangParser.PVIG, 0); }
		public DeclTipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterDeclTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitDeclTip(this);
		}
	}

	public final DeclTipContext declTip() throws RecognitionException {
		DeclTipContext _localctx = new DeclTipContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declTip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			listId();
			setState(66);
			match(DPONTOS);
			setState(67);
			tip();
			setState(68);
			match(PVIG);
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

	public static class ListIdContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniLangParser.ID, i);
		}
		public List<TerminalNode> VIG() { return getTokens(MiniLangParser.VIG); }
		public TerminalNode VIG(int i) {
			return getToken(MiniLangParser.VIG, i);
		}
		public ListIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterListId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitListId(this);
		}
	}

	public final ListIdContext listId() throws RecognitionException {
		ListIdContext _localctx = new ListIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(71);
				match(VIG);
				setState(72);
				match(ID);
				}
				}
				setState(77);
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

	public static class TipContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniLangParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniLangParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(MiniLangParser.STRING, 0); }
		public TipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitTip(this);
		}
	}

	public final TipContext tip() throws RecognitionException {
		TipContext _localctx = new TipContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
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

	public static class CmdCompContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MiniLangParser.BEGIN, 0); }
		public ListCmdContext listCmd() {
			return getRuleContext(ListCmdContext.class,0);
		}
		public TerminalNode END() { return getToken(MiniLangParser.END, 0); }
		public CmdCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterCmdComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitCmdComp(this);
		}
	}

	public final CmdCompContext cmdComp() throws RecognitionException {
		CmdCompContext _localctx = new CmdCompContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(BEGIN);
			setState(81);
			listCmd();
			setState(82);
			match(END);
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

	public static class ListCmdContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> PVIG() { return getTokens(MiniLangParser.PVIG); }
		public TerminalNode PVIG(int i) {
			return getToken(MiniLangParser.PVIG, i);
		}
		public ListCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterListCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitListCmd(this);
		}
	}

	public final ListCmdContext listCmd() throws RecognitionException {
		ListCmdContext _localctx = new ListCmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			cmd();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PVIG) {
				{
				{
				setState(85);
				match(PVIG);
				setState(86);
				cmd();
				}
				}
				setState(91);
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

	public static class CmdContext extends ParserRuleContext {
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdOthersContext cmdOthers() {
			return getRuleContext(CmdOthersContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				cmdIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				cmdOthers();
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

	public static class CmdOthersContext extends ParserRuleContext {
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public CmdCompContext cmdComp() {
			return getRuleContext(CmdCompContext.class,0);
		}
		public CmdOthersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdOthers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterCmdOthers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitCmdOthers(this);
		}
	}

	public final CmdOthersContext cmdOthers() throws RecognitionException {
		CmdOthersContext _localctx = new CmdOthersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdOthers);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				cmdWhile();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				cmdRead();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				cmdWrite();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				cmdAtrib();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				cmdComp();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CmdIfContext extends ParserRuleContext {
		public CmdIfMatchedContext cmdIfMatched() {
			return getRuleContext(CmdIfMatchedContext.class,0);
		}
		public CmdIfUnmatchedContext cmdIfUnmatched() {
			return getRuleContext(CmdIfUnmatchedContext.class,0);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdIf);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				cmdIfMatched();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				cmdIfUnmatched();
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

	public static class CmdIfMatchedContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniLangParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniLangParser.THEN, 0); }
		public List<CmdIfMatchedContext> cmdIfMatched() {
			return getRuleContexts(CmdIfMatchedContext.class);
		}
		public CmdIfMatchedContext cmdIfMatched(int i) {
			return getRuleContext(CmdIfMatchedContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniLangParser.ELSE, 0); }
		public CmdOthersContext cmdOthers() {
			return getRuleContext(CmdOthersContext.class,0);
		}
		public CmdIfMatchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIfMatched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterCmdIfMatched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitCmdIfMatched(this);
		}
	}

	public final CmdIfMatchedContext cmdIfMatched() throws RecognitionException {
		CmdIfMatchedContext _localctx = new CmdIfMatchedContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdIfMatched);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(IF);
				setState(108);
				expr(0);
				setState(109);
				match(THEN);
				setState(110);
				cmdIfMatched();
				setState(111);
				match(ELSE);
				setState(112);
				cmdIfMatched();
				}
				break;
			case BEGIN:
			case WHILE:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				cmdOthers();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CmdIfUnmatchedContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniLangParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniLangParser.THEN, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdIfMatchedContext cmdIfMatched() {
			return getRuleContext(CmdIfMatchedContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(MiniLangParser.ELSE, 0); }
		public CmdIfUnmatchedContext cmdIfUnmatched() {
			return getRuleContext(CmdIfUnmatchedContext.class,0);
		}
		public CmdIfUnmatchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIfUnmatched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterCmdIfUnmatched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitCmdIfUnmatched(this);
		}
	}

	public final CmdIfUnmatchedContext cmdIfUnmatched() throws RecognitionException {
		CmdIfUnmatchedContext _localctx = new CmdIfUnmatchedContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdIfUnmatched);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(IF);
				setState(118);
				expr(0);
				setState(119);
				match(THEN);
				setState(120);
				cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(IF);
				setState(123);
				expr(0);
				setState(124);
				match(THEN);
				setState(125);
				cmdIfMatched();
				setState(126);
				match(ELSE);
				setState(127);
				cmdIfUnmatched();
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

	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniLangParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiniLangParser.DO, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(WHILE);
			setState(132);
			expr(0);
			setState(133);
			match(DO);
			setState(134);
			cmd();
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

	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MiniLangParser.READ, 0); }
		public TerminalNode ABPAR() { return getToken(MiniLangParser.ABPAR, 0); }
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode FPAR() { return getToken(MiniLangParser.FPAR, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(READ);
			setState(137);
			match(ABPAR);
			setState(138);
			listId();
			setState(139);
			match(FPAR);
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

	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(MiniLangParser.WRITE, 0); }
		public TerminalNode ABPAR() { return getToken(MiniLangParser.ABPAR, 0); }
		public ListWContext listW() {
			return getRuleContext(ListWContext.class,0);
		}
		public TerminalNode FPAR() { return getToken(MiniLangParser.FPAR, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitCmdWrite(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(WRITE);
			setState(142);
			match(ABPAR);
			setState(143);
			listW();
			setState(144);
			match(FPAR);
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

	public static class ListWContext extends ParserRuleContext {
		public List<ElemWContext> elemW() {
			return getRuleContexts(ElemWContext.class);
		}
		public ElemWContext elemW(int i) {
			return getRuleContext(ElemWContext.class,i);
		}
		public List<TerminalNode> VIG() { return getTokens(MiniLangParser.VIG); }
		public TerminalNode VIG(int i) {
			return getToken(MiniLangParser.VIG, i);
		}
		public ListWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listW; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterListW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitListW(this);
		}
	}

	public final ListWContext listW() throws RecognitionException {
		ListWContext _localctx = new ListWContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listW);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			elemW();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(147);
				match(VIG);
				setState(148);
				elemW();
				}
				}
				setState(153);
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

	public static class ElemWContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(MiniLangParser.CADEIA, 0); }
		public ElemWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemW; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterElemW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitElemW(this);
		}
	}

	public final ElemWContext elemW() throws RecognitionException {
		ElemWContext _localctx = new ElemWContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elemW);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
			case OPNEG:
			case ABPAR:
			case ID:
			case CTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				expr(0);
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CmdAtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(MiniLangParser.ATRIB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterCmdAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitCmdAtrib(this);
		}
	}

	public final CmdAtribContext cmdAtrib() throws RecognitionException {
		CmdAtribContext _localctx = new CmdAtribContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(159);
			match(ATRIB);
			setState(160);
			expr(0);
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
		public ExprRelContext exprRel() {
			return getRuleContext(ExprRelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPLOG() { return getToken(MiniLangParser.OPLOG, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitExpr(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			exprRel();
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(165);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(166);
					match(OPLOG);
					setState(167);
					exprRel();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ExprRelContext extends ParserRuleContext {
		public List<ExprAdContext> exprAd() {
			return getRuleContexts(ExprAdContext.class);
		}
		public ExprAdContext exprAd(int i) {
			return getRuleContext(ExprAdContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(MiniLangParser.OPREL, 0); }
		public ExprRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterExprRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitExprRel(this);
		}
	}

	public final ExprRelContext exprRel() throws RecognitionException {
		ExprRelContext _localctx = new ExprRelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprRel);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				exprAd(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				exprAd(0);
				setState(175);
				match(OPREL);
				setState(176);
				exprAd(0);
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

	public static class ExprAdContext extends ParserRuleContext {
		public ExprMultContext exprMult() {
			return getRuleContext(ExprMultContext.class,0);
		}
		public ExprAdContext exprAd() {
			return getRuleContext(ExprAdContext.class,0);
		}
		public TerminalNode OPAD() { return getToken(MiniLangParser.OPAD, 0); }
		public ExprAdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterExprAd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitExprAd(this);
		}
	}

	public final ExprAdContext exprAd() throws RecognitionException {
		return exprAd(0);
	}

	private ExprAdContext exprAd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprAdContext _localctx = new ExprAdContext(_ctx, _parentState);
		ExprAdContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_exprAd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181);
			exprMult(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprAdContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprAd);
					setState(183);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(184);
					match(OPAD);
					setState(185);
					exprMult(0);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ExprMultContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public ExprMultContext exprMult() {
			return getRuleContext(ExprMultContext.class,0);
		}
		public TerminalNode OPMULT() { return getToken(MiniLangParser.OPMULT, 0); }
		public ExprMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterExprMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitExprMult(this);
		}
	}

	public final ExprMultContext exprMult() throws RecognitionException {
		return exprMult(0);
	}

	private ExprMultContext exprMult(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprMultContext _localctx = new ExprMultContext(_ctx, _parentState);
		ExprMultContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_exprMult, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(192);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprMultContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprMult);
					setState(194);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(195);
					match(OPMULT);
					setState(196);
					fator();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode CTE() { return getToken(MiniLangParser.CTE, 0); }
		public TerminalNode TRUE() { return getToken(MiniLangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniLangParser.FALSE, 0); }
		public TerminalNode ABPAR() { return getToken(MiniLangParser.ABPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FPAR() { return getToken(MiniLangParser.FPAR, 0); }
		public TerminalNode OPNEG() { return getToken(MiniLangParser.OPNEG, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangParserListener ) ((MiniLangParserListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fator);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(ID);
				}
				break;
			case CTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(CTE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(FALSE);
				}
				break;
			case ABPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(ABPAR);
				setState(207);
				expr(0);
				setState(208);
				match(FPAR);
				}
				break;
			case OPNEG:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				match(OPNEG);
				setState(211);
				fator();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 21:
			return exprAd_sempred((ExprAdContext)_localctx, predIndex);
		case 22:
			return exprMult_sempred((ExprMultContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exprAd_sempred(ExprAdContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exprMult_sempred(ExprMultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3=\n\3\3\4\6\4@\n\4\r\4\16"+
		"\4A\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\n\3\n\5\na\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\5\13h\n\13\3\f\3\f\5\fl\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\rv\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u0084\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u0098\n\22\f\22"+
		"\16\22\u009b\13\22\3\23\3\23\5\23\u009f\n\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u00ab\n\25\f\25\16\25\u00ae\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00b5\n\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u00bd\n\27\f\27\16\27\u00c0\13\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u00c8\n\30\f\30\16\30\u00cb\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u00d7\n\31\3\31\2\5(,.\32\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\2\3\4\2\4\5\17\17\2\u00d7\2\62\3\2\2\2\4<"+
		"\3\2\2\2\6?\3\2\2\2\bC\3\2\2\2\nH\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2\20V\3"+
		"\2\2\2\22`\3\2\2\2\24g\3\2\2\2\26k\3\2\2\2\30u\3\2\2\2\32\u0083\3\2\2"+
		"\2\34\u0085\3\2\2\2\36\u008a\3\2\2\2 \u008f\3\2\2\2\"\u0094\3\2\2\2$\u009e"+
		"\3\2\2\2&\u00a0\3\2\2\2(\u00a4\3\2\2\2*\u00b4\3\2\2\2,\u00b6\3\2\2\2."+
		"\u00c1\3\2\2\2\60\u00d6\3\2\2\2\62\63\7\3\2\2\63\64\7!\2\2\64\65\7\31"+
		"\2\2\65\66\5\4\3\2\66\67\5\16\b\2\678\7\32\2\289\7\2\2\39\3\3\2\2\2:;"+
		"\7\13\2\2;=\5\6\4\2<:\3\2\2\2<=\3\2\2\2=\5\3\2\2\2>@\5\b\5\2?>\3\2\2\2"+
		"@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2\2\2CD\5\n\6\2DE\7\34\2\2EF\5\f\7"+
		"\2FG\7\31\2\2G\t\3\2\2\2HM\7!\2\2IJ\7\35\2\2JL\7!\2\2KI\3\2\2\2LO\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OM\3\2\2\2PQ\t\2\2\2Q\r\3\2\2\2RS"+
		"\7\6\2\2ST\5\20\t\2TU\7\7\2\2U\17\3\2\2\2V[\5\22\n\2WX\7\31\2\2XZ\5\22"+
		"\n\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\21\3\2\2\2][\3\2\2\2^"+
		"a\5\26\f\2_a\5\24\13\2`^\3\2\2\2`_\3\2\2\2a\23\3\2\2\2bh\5\34\17\2ch\5"+
		"\36\20\2dh\5 \21\2eh\5&\24\2fh\5\16\b\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2"+
		"ge\3\2\2\2gf\3\2\2\2h\25\3\2\2\2il\5\30\r\2jl\5\32\16\2ki\3\2\2\2kj\3"+
		"\2\2\2l\27\3\2\2\2mn\7\20\2\2no\5(\25\2op\7\21\2\2pq\5\30\r\2qr\7\22\2"+
		"\2rs\5\30\r\2sv\3\2\2\2tv\5\24\13\2um\3\2\2\2ut\3\2\2\2v\31\3\2\2\2wx"+
		"\7\20\2\2xy\5(\25\2yz\7\21\2\2z{\5\22\n\2{\u0084\3\2\2\2|}\7\20\2\2}~"+
		"\5(\25\2~\177\7\21\2\2\177\u0080\5\30\r\2\u0080\u0081\7\22\2\2\u0081\u0082"+
		"\5\32\16\2\u0082\u0084\3\2\2\2\u0083w\3\2\2\2\u0083|\3\2\2\2\u0084\33"+
		"\3\2\2\2\u0085\u0086\7\b\2\2\u0086\u0087\5(\25\2\u0087\u0088\7\t\2\2\u0088"+
		"\u0089\5\22\n\2\u0089\35\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008c\7\36"+
		"\2\2\u008c\u008d\5\n\6\2\u008d\u008e\7\37\2\2\u008e\37\3\2\2\2\u008f\u0090"+
		"\7\16\2\2\u0090\u0091\7\36\2\2\u0091\u0092\5\"\22\2\u0092\u0093\7\37\2"+
		"\2\u0093!\3\2\2\2\u0094\u0099\5$\23\2\u0095\u0096\7\35\2\2\u0096\u0098"+
		"\5$\23\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a#\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009f\5(\25\2"+
		"\u009d\u009f\7 \2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f%\3\2"+
		"\2\2\u00a0\u00a1\7!\2\2\u00a1\u00a2\7\33\2\2\u00a2\u00a3\5(\25\2\u00a3"+
		"\'\3\2\2\2\u00a4\u00a5\b\25\1\2\u00a5\u00a6\5*\26\2\u00a6\u00ac\3\2\2"+
		"\2\u00a7\u00a8\f\3\2\2\u00a8\u00a9\7\27\2\2\u00a9\u00ab\5*\26\2\u00aa"+
		"\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad)\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b5\5,\27\2\u00b0\u00b1"+
		"\5,\27\2\u00b1\u00b2\7\26\2\2\u00b2\u00b3\5,\27\2\u00b3\u00b5\3\2\2\2"+
		"\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5+\3\2\2\2\u00b6\u00b7\b"+
		"\27\1\2\u00b7\u00b8\5.\30\2\u00b8\u00be\3\2\2\2\u00b9\u00ba\f\3\2\2\u00ba"+
		"\u00bb\7\24\2\2\u00bb\u00bd\5.\30\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf-\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c2\b\30\1\2\u00c2\u00c3\5\60\31\2\u00c3\u00c9\3\2\2"+
		"\2\u00c4\u00c5\f\3\2\2\u00c5\u00c6\7\25\2\2\u00c6\u00c8\5\60\31\2\u00c7"+
		"\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca/\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d7\7!\2\2\u00cd\u00d7"+
		"\7\"\2\2\u00ce\u00d7\7\r\2\2\u00cf\u00d7\7\f\2\2\u00d0\u00d1\7\36\2\2"+
		"\u00d1\u00d2\5(\25\2\u00d2\u00d3\7\37\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d5"+
		"\7\30\2\2\u00d5\u00d7\5\60\31\2\u00d6\u00cc\3\2\2\2\u00d6\u00cd\3\2\2"+
		"\2\u00d6\u00ce\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7\61\3\2\2\2\22<AM[`gku\u0083\u0099\u009e\u00ac\u00b4\u00be"+
		"\u00c9\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}